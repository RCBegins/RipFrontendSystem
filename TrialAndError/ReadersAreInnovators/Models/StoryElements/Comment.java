package TrialAndError.ReadersAreInnovators.Models.StoryElements;

import java.sql.Date;

public class Comment {
    
    
    private Integer commentID;
    private Integer storyID;
    private Integer userID;
    private String name;
    private String comment;
    private Boolean flagged;
    private Date dateAdded;
    private Double data;
    
    
    public Comment(){
        
    }
    
    public Comment(Integer commentID, Double data) {
        
        this.commentID = commentID;
        this.data = data;
        
    }
    
    public Comment(Integer commentID, Integer storyID, Integer userID, String name, String comment) {
        
        this.commentID = commentID;
        this.storyID = storyID;
        this.userID = userID;
        this.name = name;
        this.comment = comment;
        
    }
    
    public Comment(Integer commentID, Integer storyID, Integer userID, String name, String comment, Date dateAdded) {
        
        this.commentID = commentID;
        this.storyID = storyID;
        this.userID = userID;
        this.name = name;
        this.comment = comment;
        this.dateAdded = dateAdded;
        
    }
    
    public Comment(Integer commentID, Integer storyID, Integer userID, String name, String comment, Boolean flagged, Date dateAdded, Double data) {
        
        this.commentID = commentID;
        this.storyID = storyID;
        this.userID = userID;
        this.name = name;
        this.comment = comment;
        this.flagged = flagged;
        this.dateAdded = dateAdded;
        this.data = data;
        
    }
    
    
    public Integer getCommentID() {
        return commentID;
    }
    
    public void setCommentID(Integer commentID) {
        this.commentID = commentID;
    }
    
    public Integer getStoryID() {
        return storyID;
    }
    
    public void setStoryID(Integer storyID) {
        this.storyID = storyID;
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
    
    public String getComment() {
        return comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }
    
    public Boolean getFlagged() {
        return flagged;
    }
    
    public void setFlagged(Boolean flagged) {
        this.flagged = flagged;
    }
    
    public Date getDateAdded() {
        return dateAdded;
    }
    
    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }
    
    public Double getData() {
        return data;
    }
    
    public void setData(Double data) {
        this.data = data;
    }
    
    
    @Override
    public String toString() {
        
        return "Comment{" +
                "commentID=" + commentID +
                ", storyID=" + storyID +
                ", userID=" + userID +
                ", name='" + name + '\'' +
                ", comment='" + comment + '\'' +
                ", flagged=" + flagged +
                ", dateAdded=" + dateAdded +
                ", data=" + data +
                '}';
        
    }
    
}
