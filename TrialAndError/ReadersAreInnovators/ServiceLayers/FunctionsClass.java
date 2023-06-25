package TrialAndError.ReadersAreInnovators.ServiceLayers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class FunctionsClass implements Functions_Interface{
    
    
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private String query;
    private String message;
    
    
    public FunctionsClass() {
        
    }
    
    
    @Override
    public Boolean verifyLoginDetails(String password, String pw) {
        
        if (password.equals(pw)){
            
            return true;
            
        }else{
            
            return false;
                    
        }
        
    }
    
    @Override
    public Boolean isNumber(String value) {
        
        try{
            
            Integer.parseInt(value);
            
        }catch (NumberFormatException n){
            
            return true;
            
        }
        
        return false;
        
    }
    
    @Override
    public Boolean phoneNumberVerification(String phoneNum) {
        
        Boolean b = true;
        
        if (!isNumber(phoneNum)){
            
            b = false;
            
        }
        
        if (phoneNum.charAt(0) != 0){
            
            b = false;
            
        }
        
        if (phoneNum.length() != 10){
            
            b = false;
            
        }
        
        return b;
        
    }
    
    @Override
    public Boolean emailVerification(String email) {
        
        boolean b = true;
        
        
        
        return b;
        
    }
    
    @Override
    public Boolean passwordVerification(String password) {
        return null;
    }
    
    @Override
    public Boolean wordCountVerification(String storyBody) {
        return null;
    }
    
    @Override
    public Boolean integerToBoolean(Integer value) {
        
        Boolean b;
        
        if (value == 0){
            
            b = false;
            
        }else{
            
            b = true;
            
        }
        
        return b;
        
    }
    
    @Override
    public Integer booleanToInteger(Boolean bool) {
        if(bool == false){
            return 0;
        } else {
            return 1;
        }
    }
    
    @Override
    public Double getAverage(ArrayList<Integer> values) {
        
        Integer total = 0;
        Double ratingAverage;
        Integer noRatings = 0;
        
        for (Integer rating :values) {
            
            noRatings++;
            total = total + rating;
            
        }
        
        ratingAverage = Double.valueOf(total/noRatings);
        return ratingAverage;
        
    }
    
    
}
