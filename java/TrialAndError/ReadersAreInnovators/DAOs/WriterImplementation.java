package TrialAndError.ReadersAreInnovators.DAOs;

import TrialAndError.ReadersAreInnovators.Models.StoryElements.Story;
import TrialAndError.ReadersAreInnovators.Models.UserTypes.Writer;
import TrialAndError.ReadersAreInnovators.ServiceLayers.DatabaseConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WriterImplementation implements WriterDAOInterface{
    
    
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private String query;
    private String message;
    
    public WriterImplementation() {
        conn = DatabaseConnectionManager.getConnection();
    }
    
    
    @Override //TODO 
    public Story getDraft(Story story) {
        
        query = "select * from readers_are_innovators.drafts where draftID = ?";
        
        try {
            
            ps = conn.prepareStatement(query);
            
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
        
        return null;
        
    }
    
    @Override
    public String writerRegistration(Writer writer) {
        return null;
    }
    
    @Override
    public Story editDraft(Story story) {
        return null;
    }
    
    @Override
    public Boolean toggleComments() {
        return null;
    }
    
    @Override
    public String privatizeStory(Story story) {
        return null;
    }
    
    @Override
    public Writer getAuthor(Writer writer) {
        return null;
    }
}
