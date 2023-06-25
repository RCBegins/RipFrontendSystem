package TrialAndError.ReadersAreInnovators.DAOs;

import TrialAndError.ReadersAreInnovators.Models.AnalyticalData.Rating;
import TrialAndError.ReadersAreInnovators.Models.StoryElements.Story;
import TrialAndError.ReadersAreInnovators.ServiceLayers.DatabaseConnectionManager;
import TrialAndError.ReadersAreInnovators.ServiceLayers.FunctionsClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RatingImplementation implements RatingDAOInterface{
    
    
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private String query;
    private String message;
    FunctionsClass functionsClass = new FunctionsClass();
    
    
    public RatingImplementation() {
        
    }
    
    
    @Override
    public Double getStoryRating(Story story) {
        
        conn = DatabaseConnectionManager.getConnection();
        
        query = "select * from readers_are_innovators.stories where storyID = ?";
        Double storyRatingAverage = null;
        
        try {
            
            ps = conn.prepareStatement(query);
            ps.setInt(1, story.getStoryID());
            rs = ps.executeQuery();
            rs.next();
            storyRatingAverage = rs.getDouble(6);
            
        } catch (SQLException e) {
            
            System.out.println("Error getting story rating.");
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
        
        return storyRatingAverage;
        
    }
    
    @Override
    public String rateStory(Rating rating) {
        
        conn = DatabaseConnectionManager.getConnection();
        query = "select * from readers_are_innovators.rating where userID = ?";
        
        try {
            
            ps = conn.prepareStatement(query);
            ps.setInt(1, rating.getUserID());
            rs = ps.executeQuery();
            
            if (rs!=null) {
                
                while (rs.next()) {
                    
                    if (rs.getInt(3) == rating.getStoryID()) {
                        
                        message = "You have already rated this story. Please remove your previous rating before you can add another.";
                        return message;
                        
                    }
                    
                }
                
            }
            
            query = "insert into readers_are_innovators.rating(UserID, StoryID, RatingScore) values (?,?,?)";
            ps = conn.prepareStatement(query);
            ps.setInt(1, rating.getUserID());
            ps.setInt(2, rating.getStoryID());
            ps.setInt(3, rating.getRating());
            ps.executeUpdate();
            message = "Rating successfully added.";
            
        } catch (SQLException e) {
            
            message = "Error rating this story.";
            System.out.println("Error rating this story.");
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
    
    @Override
    public String changeRating(Rating rating) {
        return null;
    }
    
    @Override
    public String removeRating(Rating rating) {
        
        conn = DatabaseConnectionManager.getConnection();
        query = "delete from readers_are_innovators.rating where RatingID = ?";
        
        try {
            
            ps = conn.prepareStatement(query);
            ps.setInt(1, rating.getRatingID());
            ps.executeUpdate();
            message = "Rating successfully removed.";
            
        } catch (SQLException e) {
            
            message = "Error removing rating.";
            System.out.println("Error removing rating.");
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
    
    @Override @Deprecated
    public String clearRating(Story story) {
        
        conn = DatabaseConnectionManager.getConnection();
        
        query = "select * from readers_are_innovators.stories where StoryID = ?";
        
        Integer deleted = 0;
        try {
            ps = conn.prepareStatement(query);
            ps.setInt(1, story.getStoryID());
            rs = ps.executeQuery();
            
            if(rs.next() != false) {
                
                
                
            }
        } catch (SQLException e) {
            System.out.println("Error finding story");
            e.printStackTrace();
        }
        
        query = "delete from readers_are_innovators.rating where StoryID = ?";
        try {
            ps = conn.prepareStatement(query);
            ps.setInt(1, story.getStoryID());
            deleted = ps.executeUpdate();
            message = deleted + " ratings removed";
        } catch (SQLException e) {
            System.out.println("Error removing ratings from " + story);
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
