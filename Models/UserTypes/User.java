package  Models.UserTypes;

public class User {
    
    Integer userID;
    String name; 
    String surname;
    String usertype;
    Integer userTypeID;
    
    public User() {
    }
    
    public User(Integer userID, String name, String surname, String usertype, Integer userTypeID) {
        this.userID = userID;
        this.name = name;
        this.surname = surname;
        this.usertype = usertype;
        this.userTypeID = userTypeID;
    }
    
    public Integer getUserID() {
        return userID;
    }
    
    public void setUserID(Integer userID) {
        this.userID = userID;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSurname() {
        return surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public String getUsertype() {
        return usertype;
    }
    
    public void setUsertype() {
        usertype = "User";
    }
    
    public Integer getUserTypeID() {
        return userTypeID;
    }
    
    public void setUserTypeID(Integer userTypeID) {
        this.userTypeID = userTypeID;
    }
    
    @Override
    public String toString() {
        
        return "User{" +
                "userID=" + userID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", usertype='" + usertype + '\'' +
                ", userTypeID=" + userTypeID +
                '}';
        
    }
    
    
}
