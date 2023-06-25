package TrialAndError.ReadersAreInnovators.DAOs;

import TrialAndError.ReadersAreInnovators.Models.Administration.WriterApplication;
import TrialAndError.ReadersAreInnovators.Models.StoryElements.Story;
import TrialAndError.ReadersAreInnovators.Models.UserTypes.Writer;
import TrialAndError.ReadersAreInnovators.ServiceLayers.DatabaseConnectionManager;
import TrialAndError.ReadersAreInnovators.ServiceLayers.FunctionsClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class EditorImplementation implements EditorDAOInterface{
    
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private String query;
    private String message;
    FunctionsClass functionsClass = new FunctionsClass();
    
    
    public EditorImplementation(){
    }
   
   
    @Override   //Complete
    public ArrayList<WriterApplication> viewWriterApplications() {
        
        conn = DatabaseConnectionManager.getConnection();
        ArrayList<WriterApplication> pendingWriters = new ArrayList<>();
       
        query = "select * from readers_are_innovators.pendingwriters";
       
        try {
            
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                pendingWriters.add(new WriterApplication(rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getDate(8)));
                
            }
            
        } catch (SQLException e) {
            
            System.out.println("Error retrieving pending writers.");
            e.printStackTrace();
            
        } finally {
            
            if (rs!=null){
                
                try {
                    
                    rs.close();
                    
                } catch (SQLException e) {
                    
                    throw new RuntimeException(e);
                    
                }
                
            }
            
            if (ps!=null){
                
                try {
                    
                    ps.close();
                    
                } catch (SQLException e) {
                    
                    throw new RuntimeException(e);
                    
                }
                
            }
            
            if (conn!=null){
                
                try {
                    
                    conn.close();
                    
                } catch (SQLException e) {
                    
                    throw new RuntimeException(e);
                    
                }
                
            }
            
        }
        
        return pendingWriters;
        
    }
    
    @Override   //Complete
    public String approveWriter(Writer writer) {
        
        conn = DatabaseConnectionManager.getConnection();
        query = "select * from readers_are_innovators.pendingwriters where PendingWriterID = ?";
        WriterApplication app = new WriterApplication();
       
        try {
            
            ps = conn.prepareStatement(query);
            ps.setInt(1, writer.getUserID());
            rs = ps.executeQuery();
            rs.next();
            app.setName(rs.getString(2));
            app.setSurname(rs.getString(3));
            app.setEmail(rs.getString(4));
            app.setPhoneNumber(rs.getString(5));
            app.setPassword(rs.getString(6));
            app.setMotivation(rs.getString(7));
            app.setApplicationDate(rs.getDate(8));
            
            Writer newWriter = new Writer(app.getName(), app.getSurname(), app.getEmail(), app.getPhoneNumber(), app.getPassword());
            
            query = "insert into users(Name, Surname, UserTypeID, Isbanned, Email, PhoneNumber, Password) values(?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(query);
            
            ps.setString(1, newWriter.getName());
            ps.setString(2, newWriter.getSurname());
            ps.setInt(3, newWriter.getUserTypeID());
            ps.setInt(4, 0);
            ps.setString(5, newWriter.getEmail());
            ps.setString(6, newWriter.getPhoneNumber());
            ps.setString(7, newWriter.getPassword());
            
            ps.executeUpdate();
            
            query = "delete FROM pendingWriters WHERE (PendingWriterID = ?)";
            
            ps = conn.prepareStatement(query);
            ps.setInt(1, writer.getUserID());
            ps.executeUpdate();
            
            message = "Writer successfully added.";
            
        } catch (SQLException e) {
            
            message = "Error retrieving pending writer ID";
            System.out.println(message);
            e.printStackTrace();
            
        } finally {
            
            if (rs!=null){
                
                try {
                    
                    rs.close();
                    
                } catch (SQLException e) {
                    
                    throw new RuntimeException(e);
                    
                }
                
            }
            
            if (ps!=null){
                
                try {
                    
                    ps.close();
                    
                } catch (SQLException e) {
                    
                    throw new RuntimeException(e);
                    
                }
                
            }
            
            if (conn!=null){
                
                try {
                    
                    conn.close();
                    
                } catch (SQLException e) {
                    
                    throw new RuntimeException(e);
                    
                }
                
            }
            
        }
        
        return message;
        
    }
    
    @Override   //Complete
    public String denyWriter(Writer writer) {
        
        conn = DatabaseConnectionManager.getConnection();
        query = "delete FROM pendingWriters WHERE (PendingWriterID = ?)";
        
        try{
            
            ps = conn.prepareStatement(query);
            ps.setInt(1, writer.getUserID());
            ps.executeUpdate();
            message = "Writer application Denied";
            
        }catch(SQLException e){
            
            message = "Error denying writer application.";
            System.out.println(message);
            e.printStackTrace();
            
        } finally {
            
            if (rs!=null){
                
                try {
                    
                    rs.close();
                    
                } catch (SQLException e) {
                    
                    throw new RuntimeException(e);
                    
                }
                
            }
            
            if (ps!=null){
                
                try {
                    
                    ps.close();
                    
                } catch (SQLException e) {
                    
                    throw new RuntimeException(e);
                    
                }
                
            }
            
            if (conn!=null){
                
                try {
                    
                    conn.close();
                    
                } catch (SQLException e) {
                    
                    throw new RuntimeException(e);
                    
                }
                
            }
            
        }
        
        return message;
        
    }
    
    @Override   //Complete
    public ArrayList<Writer> viewWriters() {
        
        conn = DatabaseConnectionManager.getConnection();
        ArrayList<Writer> writers = new ArrayList<>();
        query = "select * from users where UserTypeID = ?";
       
        try {
            
            ps = conn.prepareStatement(query);
            ps.setInt(1,2);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                writers.add(new Writer(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getInt(4), functionsClass.integerToBoolean(rs.getInt(5)), rs.getString(6),
                        rs.getString(7), rs.getString(8)));
                
            }
            
        } catch (SQLException e) {
            
            System.out.println("Error viewing writers");
            e.printStackTrace();
            
        } finally {
            
            if (rs!=null){
                
                try {
                    
                    rs.close();
                    
                } catch (SQLException e) {
                    
                    throw new RuntimeException(e);
                    
                }
                
            }
            
            if (ps!=null){
                
                try {
                    
                    ps.close();
                    
                } catch (SQLException e) {
                    
                    throw new RuntimeException(e);
                    
                }
                
            }
            
            if (conn!=null){
                
                try {
                    
                    conn.close();
                    
                } catch (SQLException e) {
                    
                    throw new RuntimeException(e);
                    
                }
                
            }
            
        }
        
        return writers;
        
    }
    
    @Override  //Complete
    public String approvePendingStory(Story story) {
        conn = DatabaseConnectionManager.getConnection();
        query = "delete from readers_are_innovators.pendingstories where pendingstoryid = ?";
        
        
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(story.getCoverImage());
        } catch (FileNotFoundException e) {
            System.out.println("Error creating file input stream");;
            e.printStackTrace();
        }
        try {
            ps = conn.prepareStatement(query);
            ps.setInt(1, story.getStoryID());
            ps.executeUpdate();
            
            query = "insert into readers_are_innovators.stories(Title, AuthorID, StoryBody, Synopsis, CoverImage, EditedByID) values (?,?,?,?,?,?)";
            
            ps = conn.prepareStatement(query);
            ps.setString(1, story.getTitle());
            ps.setInt(2, story.getAuthorID());
            ps.setString(3, story.getStoryBody());
            ps.setString(4, story.getSynopsis());
            ps.setBlob(5, inputStream);
            ps.setInt(6, story.getEditorID());
            
            int added = ps.executeUpdate();
            message = added + " story added to Stories";
            
            
        } catch (SQLException e) {
            System.out.println("Error retrieving pending story information");
            e.printStackTrace();
        } finally {
            
            if (rs!=null){
                
                try {
                    
                    rs.close();
                    
                } catch (SQLException e) {
                    
                    throw new RuntimeException(e);
                    
                }
                
            }
            
            if (ps!=null){
                
                try {
                    
                    ps.close();
                    
                } catch (SQLException e) {
                    
                    throw new RuntimeException(e);
                    
                }
                
            }
            
            if (conn!=null){
                
                try {
                    
                    conn.close();
                    
                } catch (SQLException e) {
                    
                    throw new RuntimeException(e);
                    
                }
                
            }
            
        }
        
        return message;
    }
    
    @Override  //Complete
    public String denyPendingStory(Story story) {
        conn = DatabaseConnectionManager.getConnection();
        query = "delete from readers_are_innovators.pendingstories where pendingstoryid = ?";
        try {
            ps = conn.prepareStatement(query);
            ps.setInt(1, story.getStoryID());
            int deleted = ps.executeUpdate();
            message = deleted + " story denied and deleted";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            
            if (rs!=null){
                
                try {
                    
                    rs.close();
                    
                } catch (SQLException e) {
                    
                    throw new RuntimeException(e);
                    
                }
                
            }
            
            if (ps!=null){
                
                try {
                    
                    ps.close();
                    
                } catch (SQLException e) {
                    
                    throw new RuntimeException(e);
                    
                }
                
            }
            
            if (conn!=null){
                
                try {
                    
                    conn.close();
                    
                } catch (SQLException e) {
                    
                    throw new RuntimeException(e);
                    
                }
                
            }
            
        }
        
        return message;
    }
    
    
}
