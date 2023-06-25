package TrialAndError.ReadersAreInnovators.Models.Administration;


import java.util.Date;


public class WriterApplication {
    
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private String password;
    private String motivation;
    private Date applicationDate;
    
    public WriterApplication() {
        
    }
    
    public WriterApplication(String name, String surname, String email, String phoneNumber, String password, String motivation, Date applicationDate) {
        
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.motivation = motivation;
        this.applicationDate = applicationDate;
        
    }
    
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
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
    
    public String getMotivation() {
        return motivation;
    }
    
    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }
    
    public Date getApplicationDate() {
        return applicationDate;
    }
    
    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }
    
    
    @Override
    public String toString() {
        
        return "WriterApplication{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", motivation='" + motivation + '\'' +
                ", applicationDate=" + applicationDate +
                '}';
        
    }
    
    
}
