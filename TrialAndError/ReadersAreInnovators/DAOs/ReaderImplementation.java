package TrialAndError.ReadersAreInnovators.DAOs;


import TrialAndError.ReadersAreInnovators.Models.Administration.WriterApplication;
import TrialAndError.ReadersAreInnovators.Models.StoryElements.Story;
import TrialAndError.ReadersAreInnovators.Models.UserTypes.*;
import TrialAndError.ReadersAreInnovators.ServiceLayers.DatabaseConnectionManager;
import TrialAndError.ReadersAreInnovators.ServiceLayers.FunctionsClass;
import java.sql.*;
import java.util.ArrayList;


public class ReaderImplementation implements ReaderDAOInterface {
    
    
    //Fully Complete:
    
    
    private Connection conn;
    FunctionsClass functionsClass = new FunctionsClass();
    private PreparedStatement ps;
    private ResultSet rs;
    private String query;
    private String message;
    
    
    public ReaderImplementation(){
    }
    
    
    @Override
    public String registerReader(Reader reader) {
        
        conn = DatabaseConnectionManager.getConnection();
        query = "insert into readers_are_innovators.users(Name, Surname, UserTypeID, IsBanned, Email, PhoneNumber, Password) values (?,?,?,?,?,?,?)";
        
        try {
            
            ps = conn.prepareStatement(query);
            ps.setString(1,reader.getName());
            ps.setString(2, reader.getSurname());
            ps.setInt(3, reader.getUserTypeID());
            ps.setInt(4, functionsClass.booleanToInteger(reader.getBanned()));
            ps.setString(5,reader.getEmail());
            ps.setString(6, reader.getPhoneNumber());
            ps.setString(7, reader.getPassword());
            ps.executeUpdate();
            message = "Reader successfully added.";
            
        } catch(SQLIntegrityConstraintViolationException e){
            message = "Email is already taken";
        } catch (SQLException e) {
            
            message = "Error adding reader.";
            System.out.println("Error adding reader.");
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
        
    }   //Complete
    
    @Override
    public Reader login(User user) {
        
        conn = DatabaseConnectionManager.getConnection();
        Reader myReader = null;
        Integer banned = null;
        Boolean validLogin = null;
        
        query = "select password from readers_are_innovators.users where (email = ?)";
        
        try {
            
            ps = conn.prepareStatement(query);
            ps.setString(1, user.getEmail());
            rs = ps.executeQuery();
            
            rs.next();
            String pw = rs.getString(1);
            
            validLogin = functionsClass.verifyLoginDetails(user.getPassword(), pw);
            
            if (validLogin) {
                
                query = "select isBanned from readers_are_innovators.users where email = ?";
                
                ps = conn.prepareStatement(query);
                ps.setString(1, user.getEmail());
                rs = ps.executeQuery();
                
                rs.next();
                banned = rs.getInt(1);
                
            }else{
                
                System.out.println("Login details are incorrect.");
                
            }
            
            Boolean isBanned = functionsClass.integerToBoolean(banned);
            
            if (!isBanned) {
                
                query = "select * from readers_are_innovators.users where email = ?";
                
                ps = conn.prepareStatement(query);
                ps.setString(1, user.getEmail());
                rs = ps.executeQuery();
                
                rs.next();
                
                Integer userID = rs.getInt(1);
                String name = rs.getString(2);
                String surname = rs.getString(3);
                String myEmail = rs.getString(4);
                String myPhoneNumber = rs.getString(5);
                String myPassword = rs.getString(6);
                Integer userTypeID = rs.getInt(7);
                
                myReader = new Reader(userID, name, surname, myEmail, myPhoneNumber, myPassword, userTypeID, "Reader", false, true);
                
            }else{
                
                System.out.println("User is banned.");
                
            }
            
            
        } catch (SQLException e) {
            
            System.out.println("Error logging in.");
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
        
        return myReader;
        
    }   //Complete
    
    @Override
    public String editPersonalInfo(User user) {       //Change to update all at once...   Param is just a user....
        
        conn = DatabaseConnectionManager.getConnection();
        
        try {
            
            ps = conn.prepareStatement(query);
            ps.setString(1, "");
            ps.setInt(2, 1);
            ps.executeUpdate();
            message = "Information updated.";
            
        }catch (SQLIntegrityConstraintViolationException e){
            
            
            
        } catch (SQLException e) {
            
            message = "Error editing information.";
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
        
    }   //Complete
    
    @Override
    public String writerApplication(WriterApplication writerApplication) {
        
        conn = DatabaseConnectionManager.getConnection();
        query = "insert into readers_are_innovators.pendingwriters(Name, Surname, Email, PhoneNumber, Password, WritersMotivation, ApplicationDate) values(?,?,?,?,?,?,?)";
        
        try {
            
            ps = conn.prepareStatement(query);
            ps.setString(1, writerApplication.getName());
            ps.setString(2, writerApplication.getSurname());
            ps.setString(3, writerApplication.getEmail());
            ps.setString(4, writerApplication.getPhoneNumber());
            ps.setString(5, writerApplication.getPassword());
            ps.setString(6, writerApplication.getMotivation());
            ps.setTimestamp(7, new Timestamp(new java.util.Date().getTime()));
            ps.executeUpdate();
            
            message = "Application sent.";
            
        } catch (SQLException e) {
            
            message = "Error applying to become a writer.";
            System.out.println("Error applying to become a writer.");
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
        
    }   //Complete
    
    @Override
    public String followAuthor(Writer writer, User user) {
       
        
        conn = DatabaseConnectionManager.getConnection();
        query = "select * from users where UserID = ?";
        
        int userTypeID = 0;
        try {
            ps = conn.prepareStatement(query);
            ps.setInt(1, writer.getUserID());
            rs = ps.executeQuery();
            rs.next();
            userTypeID = rs.getInt(4);
            } catch (SQLException ex) {
            System.out.println("Error getting writer info");
            ex.printStackTrace();
        }
        query = "select * from followedauthors where UserID = ?";
        try {
            ps = conn.prepareStatement(query);
            ps.setInt(1, user.getUserID());
            rs = ps.executeQuery();
            while(rs.next()){
            if(rs.getInt(2) == user.getUserID() && rs.getInt(3) == writer.getUserID()){
                message = "Author already followed";
                return message;}}
        } catch (SQLException e) {
            System.out.println("Error in followedauthors query");
            e.printStackTrace();
        }
        
        
        query = "insert into followedauthors(UserID, AuthorID) values(?,?)";
        if(userTypeID == 2) {
            try {
                ps = conn.prepareStatement(query);
                ps.setInt(1, user.getUserID());
                ps.setInt(2, writer.getUserID());
                ps.executeUpdate();
                
                message = "Author followed";
                
            } catch (SQLException e) {
                System.out.println("Error following author");
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
            
        } else{
            message = "User you are trying to follow is not a writer.";
        }
        return message;
    }
    
    @Override
    public ArrayList<Story> getAllFavorites(User user) {
        return null;
    }
    
    @Override
    public ArrayList<Story> getReadFavorites(User user) {
        return null;
    }
    
    @Override
    public ArrayList<Story> getUnreadFavorites(User user) {
        return null;
    }
    
    
}
    
