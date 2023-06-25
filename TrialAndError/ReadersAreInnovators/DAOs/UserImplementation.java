package TrialAndError.ReadersAreInnovators.DAOs;

import TrialAndError.ReadersAreInnovators.ServiceLayers.DatabaseConnectionManager;
import TrialAndError.ReadersAreInnovators.ServiceLayers.FunctionsClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserImplementation implements UserDAOInterface {
    
    
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private String query;
    private String message;
    FunctionsClass functionsClass = new FunctionsClass();
    
    
    //Trial and Error Certified.        //Except for Logger....
    
    
    public UserImplementation() {
        
    }
    
    
    @Override       //Completed: Allows users to search for stories or authors.
    public ArrayList<String> search(String topic) {
        
        conn = DatabaseConnectionManager.getConnection();
        ArrayList<String> search = new ArrayList<>();
        
        try {

            query = "SELECT Title FROM readers_are_innovators.stories where title regexp ?";

            ps = conn.prepareStatement(query);
            ps.setString(1, topic);
            rs = ps.executeQuery();

            while(rs.next()){
                
                String title = rs.getString(1);
                search.add(title);

            }
        
            query = "SELECT distinct Title FROM stories s, users u where u.UserID = s.AuthorID and u.Name regexp ? or u.surname regexp ?";
            
            ps = conn.prepareStatement(query);
            ps.setString(1, topic);
            ps.setString(2, topic);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                String title = rs.getString(1);
                search.add(title);
                
            }
            
            query = "SELECT Name, Surname from readers_are_innovators.users where name regexp ? or surname regexp ?";
            
            ps = conn.prepareStatement(query);
            ps.setString(1, topic);
            ps.setString(2, topic);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                String name = rs.getString(1);
                String surname = rs.getString(2);
                String fullName = name + " " + surname;
                
                search.add(fullName);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println("Error getting searched stories.");
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
        
        return search;
        
    }
    
    
}
