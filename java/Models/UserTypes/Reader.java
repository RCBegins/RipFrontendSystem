package Models.UserTypes;

 

public class Reader extends User{
    
    
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
    
    
    public Reader(){
        
    }
    
    public Reader(Integer userID, String name, String surname, Double data) {
        
        this.userID = userID;
        this.name = name;
        this.surname = surname;
        this.data = data;
        
    }
    
    public Reader(String name, String surname, String email, String phoneNumber, String password, Boolean emailVerified, Boolean isBanned) {
        
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.emailVerified = emailVerified;
        this.isBanned = isBanned;
        
    }
    
    public Reader(String name, String surname, String email, String phoneNumber, String password, Boolean emailVerified) {
        
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.emailVerified = emailVerified;
        
    }
    
    public Reader(Integer userID, String name, String surname, String email, String phoneNumber, String password, 
                  Integer userTypeID, String userType, Boolean isBanned, Boolean emailVerified) {
        
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
    
    
    @Override
    public Integer getUserID() {
        return userID;
    }
    
    @Override
    public void setUserID(Integer userID) {
        this.userID = userID;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String getSurname() {
        return surname;
    }
    
    @Override
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
        return userTypeID;
    }
    
    public void setUserTypeID(Integer userTypeID) {
        this.userTypeID = userTypeID;
    }
    
    public String getUserType() {
        return userType;
    }
    
    public void setUserType() {
        userType = "Reader";
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
        
        return "Reader{" +
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
