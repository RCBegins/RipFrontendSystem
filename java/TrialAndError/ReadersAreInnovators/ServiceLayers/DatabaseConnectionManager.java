package TrialAndError.ReadersAreInnovators.ServiceLayers;

import java.util.Properties;
import java.sql.Connection;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.dbcp2.BasicDataSource;

public class DatabaseConnectionManager {
    

    private static BasicDataSource dataSource1;


    private DatabaseConnectionManager(){

    }
    
    static{
        
        Properties prop = new Properties();
        InputStream input = null;
        
        try {
            input = new FileInputStream("C:\\Users\\TKS\\IdeaProjects\\Readers Are Innovators By Trial and Error\\" +
                    "src\\TrialAndError\\ReadersAreInnovators\\ServiceLayers\\config.properties");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DatabaseConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            prop.load(input);
        } catch (IOException ex) {
            Logger.getLogger(DatabaseConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        dataSource1=new BasicDataSource();
        dataSource1.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource1.setUrl(prop.getProperty("url1"));
        dataSource1.setUsername(prop.getProperty("user"));
        dataSource1.setPassword(prop.getProperty("password"));
        dataSource1.setMinIdle(100);
        dataSource1.setMaxIdle(100);
        dataSource1.setMaxOpenPreparedStatements(100);
        
    }
    
    public static Connection getConnection(){
        
        try {
            return dataSource1.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
    
}
