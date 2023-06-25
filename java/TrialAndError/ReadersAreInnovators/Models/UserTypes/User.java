package TrialAndError.ReadersAreInnovators.Models.UserTypes;

public class User {
    
    
    //TODO
    private Integer userID;
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private String password;
    private Integer userTypeID;
    private String userType;
    private Boolean isBanned;
    private Boolean emailVerified;
    private Double data;
    
    
    public User() {
        
    }
    
    
    public User(String name, String surname, String email, String phoneNumber, String password, Integer userTypeID) {
        
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.userTypeID = userTypeID;
        
    }
    
    public User(Integer userID, String name, String surname, String email, String phoneNumber, String password, Integer userTypeID, String userType, Boolean isBanned, Boolean emailVerified) {
        
        this.userID = userID;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.userTypeID = userTypeID;
        this.userType = userType;
        this.isBanned = isBanned;
        this.emailVerified = emailVerified;
        
    }
    
    public User(Integer userID, String name, String surname, String email, String phoneNumber, String password, Integer userTypeID, String userType, Boolean isBanned, Boolean emailVerified, Double data) {
        
        this.userID = userID;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.userTypeID = userTypeID;
        this.userType = userType;
        this.isBanned = isBanned;
        this.emailVerified = emailVerified;
        this.data = data;
        
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
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public Integer getUserTypeID() {
        return 0;
    }
    
    public void setUserTypeID() {
        this.userTypeID = 0;
    }
    
    public String getUserType() {
        return "User";
    }
    
    public void setUserType() {
        this.userType = "User";
    }
    
    public Boolean getBanned() {
        return isBanned;
    }
    
    public void setBanned(Boolean banned) {
        isBanned = banned;
    }
    
    public Boolean getEmailVerified() {
        return emailVerified;
    }
    
    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
    }
    
    public Double getData() {
        return data;
    }
    
    public void setData(Double data) {
        this.data = data;
    }
    
    
    @Override
    public String toString() {
        
        return "User{" +
                "userID=" + userID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", userTypeID=" + userTypeID +
                ", userType='" + userType + '\'' +
                ", isBanned=" + isBanned +
                ", emailVerified=" + emailVerified +
                ", data=" + data +
                '}';
        
    }
    
    
}
