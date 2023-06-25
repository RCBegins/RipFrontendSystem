package TrialAndError.ReadersAreInnovators.DAOs;

import TrialAndError.ReadersAreInnovators.Models.StoryElements.Genre;
import TrialAndError.ReadersAreInnovators.Models.StoryElements.Story;
import TrialAndError.ReadersAreInnovators.Models.UserTypes.User;
import TrialAndError.ReadersAreInnovators.ServiceLayers.DatabaseConnectionManager;
import TrialAndError.ReadersAreInnovators.ServiceLayers.FunctionsClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Logger;

public class GenresImplementation implements GenresDAOInterface{
    
    
    //Trial and Error Certified.
    //TODO: Logger, Deprecated Method;
    
    
    private static Logger logger;
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private String query;
    private String message;
    FunctionsClass functionsClass = new FunctionsClass();
    
    
    public GenresImplementation() {
        
    }
    
    
    @Override       //Completed: Allows the Admin-Editor to add a new Genre.
    public String addGenre(Genre genre) {
        
        conn = DatabaseConnectionManager.getConnection();
        
        try {
            
            query = "insert into genres (genre) values (?)";
            
            ps = conn.prepareStatement(query);
            ps.setString(1, genre.getGenre());
            ps.executeUpdate();
            
            message = "Genre added successfully.";
            
        } catch (SQLException e) {
            
            message = "Error adding new genre, the genre already exists.";
            System.out.println(message);
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
    
    @Override       //Completed: Allows the Admin-Editor to remove a Genre.
    public String removeGenre(Genre genre) {
        
        conn = DatabaseConnectionManager.getConnection();
        
        try {
            
            query = "delete from genres g where (g.Genre = ?)";
            
            ps = conn.prepareStatement(query);
            ps.setString(1, genre.getGenre());
            ps.executeUpdate();
            
            message = "Genre successfully deleted.";
            
        } catch (SQLException e) {
            
            message = "Error removing genre, the genre does not exist.";
            System.out.println(message);
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
    
    @Override       //Completed: Allows a user to select their preferred genres.
    public String selectGenre(User user, Genre genre) {
        
        conn = DatabaseConnectionManager.getConnection();
        
        try {
            
            query = "insert into usergenreintersect (userID, genreID) values (?, ?)";
            
            ps = conn.prepareStatement(query);
            ps.setInt(1, user.getUserID());
            ps.setInt(2, genre.getGenreID());
            ps.executeUpdate();
            
            message = "Genre added to your list of Genres.";
            
        } catch (SQLException e) {
            
            message = "Error adding Genre to list of your Genres.";
            System.out.println("Error selecting genre.");
            e.printStackTrace();
            //logger...
            
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
    
    @Override       //Completed: Allows a user to deselect a genre.
    public String deselectGenre(User user, Genre genre) {
        
        conn = DatabaseConnectionManager.getConnection();
        
        
        try {
            
            query = "delete from usergenreintersect i where UserID = ? and GenreID = ?";
            
            ps = conn.prepareStatement(query);
            ps.setInt(1, user.getUserID());
            ps.setInt(2, genre.getGenreID());
            ps.executeUpdate();
            
            message = "Genre removed from your list of Genres.";
            
        } catch (SQLException e) {
            
            message = "Error removing Genre from your list of Genres.";
            System.out.println("Error removing Genre from your list of Genres.");
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
    
    @Override       //Completed: Allows a user to see all available Genres.
    public ArrayList<Genre> getGenres() {
        
        conn = DatabaseConnectionManager.getConnection();
        ArrayList<Genre> allGenres = new ArrayList<>();
        
        try {
            
            query = "select * from Genres g";
            
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                allGenres.add(new Genre(rs.getInt(1), rs.getString(2)));
                
            }
            
        } catch (SQLException e) {
            
            System.out.println("Error retrieving genres.");
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
        
        return allGenres;
            
    }
    
    @Override       //Completed: Allows a user to see all their selected Genres.
    public ArrayList<Genre> getUserGenres(User user) {
        
        conn = DatabaseConnectionManager.getConnection();
        ArrayList<Genre> userGenres = new ArrayList<>();
        
        try {
            
            query = "SELECT g.GenreID, g.Genre FROM genres g, usergenreintersect i where g.GenreID = i.GenreID and i.UserID = ?";
            
            ps = conn.prepareStatement(query);
            ps.setInt(1, user.getUserID());
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                userGenres.add(new Genre(rs.getInt(1), rs.getString(2)));
                
            }
            
        } catch (SQLException e) {
            
            System.out.println("Error getting the User's Genres.");
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
        
        return userGenres;
        
    }
    
    @Override       @Deprecated     //Neaten Up.
    public String clearGenres(Story story) {
        
        conn = DatabaseConnectionManager.getConnection();
        
        try {
            
            query = "delete from readers_are_innovators.storygenreintersect where StoryID = ?";
            
            ps = conn.prepareStatement(query);
            ps.setInt(1, story.getStoryID());
            int cleared = ps.executeUpdate();
            
            if(cleared == 0){
                
                message = "This story had no genres to clear.";
                
            } else {
                
                message = cleared + " genres cleared.";
                
            }
            
        } catch (SQLException e) {
            
            message = "Error clearing genres.";
            System.out.println("Error clearing genres.");
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
    
    
}
