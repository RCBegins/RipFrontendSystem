package TrialAndError.ReadersAreInnovators.DAOs;


import TrialAndError.ReadersAreInnovators.Models.UserTypes.Editor;
import TrialAndError.ReadersAreInnovators.ServiceLayers.DatabaseConnectionManager;
import TrialAndError.ReadersAreInnovators.ServiceLayers.FunctionsClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;


public class AdminEditorImplementation implements AdminEditorDAOInterface{
    
    
    //Trial and Error Certified.
    //TODO: Logger;
    
    
    private static Logger logger;
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private String query;
    private String message;
    FunctionsClass functionsClass = new FunctionsClass();
    
    
    public AdminEditorImplementation() {
        
    }
    
    
    @Override   //Completed: Removes an editor from the database.
    public String removeEditor(Editor editor) {
        
        conn = DatabaseConnectionManager.getConnection();
        
        try {
            
            query = "DELETE FROM users u WHERE (u.email = ?)";
            
            ps = conn.prepareStatement(query);
            ps.setString(1, editor.getEmail());
            ps.executeUpdate();
            
            message = "Editor removed.";
            
        } catch (SQLException e) {
            
            message = "Error removing editor.";
            e.printStackTrace();
            //logger....
            
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
    
    @Override   //Completed: Adds an editor to the database.
    public String addEditor(Editor editor) {
        
        conn = DatabaseConnectionManager.getConnection();
        
        try {
            
            query = "insert into users (Name, Surname, UserTypeID, Email, PhoneNumber, Password) values (?, ?, ?, ?, ?, ?)";
            
            ps = conn.prepareStatement(query);
            ps.setString(1,editor.getName());
            ps.setString(2, editor.getSurname());
            ps.setInt(3, editor.getUserTypeID());
            ps.setString(4,editor.getEmail());
            ps.setString(5, editor.getPhoneNumber());
            ps.setString(6, editor.getPassword());
            ps.executeUpdate();
            
            message = "Editor successfully added.";
            
        } catch (SQLException e) {
            
            message = "Error adding editor, the email or phone number is already in use.";
            e.printStackTrace();
            //logger
            
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
