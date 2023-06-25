package Models.StoryElements;

import javax.imageio.stream.FileImageInputStream;
import java.awt.*;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;

public class Story {
    
    
    private Integer storyID;
    private String title;
    private Integer authorID;
    private Integer views;
    private Integer likes;
    private Double ratingAverage;
    private String storyBody;
    private String synopsis;
    private File coverImage;
    private Boolean isPrivate;
    private String coverImageAs64;
    
    public Story(){
    }
    
    public Story(Integer storyID, String title){
        
        this.storyID = storyID;
        this.title = title;
        
    }
    
    
    public Story(Integer storyID, String title, Integer authorID, File coverImage) {
        
        this.storyID = storyID;
        this.title = title;
        this.authorID = authorID;
        this.coverImage = coverImage;
        
    }
    
    
    public Story(String title, Integer authorID, String storyBody, String synopsis, File coverImage) {
        
        this.title = title;
        this.authorID = authorID;
        this.storyBody = storyBody;
        this.synopsis = synopsis;
        this.coverImage = coverImage;
        
    }
        public Story(Integer storyID,String title, Integer authorID, String storyBody, String synopsis, String coverImageAs64,
                Integer views,Integer likes,Double ratingAverage) {
            this.storyID=storyID;
        this.views=views;
        this.likes=likes;
        this.ratingAverage=ratingAverage;
        this.title = title;
        this.authorID = authorID;
        this.storyBody = storyBody;
        this.synopsis = synopsis;
        this.coverImageAs64 = coverImageAs64;
        
    }
    
    
    
    public Story(Integer storyID, String title, Integer authorID, Integer views, Integer likes, Double ratingAverage, String synopsis, File coverImage) {
        
        this.storyID = storyID;
        this.title = title;
        this.authorID = authorID;
        this.views = views;
        this.likes = likes;
        this.ratingAverage = ratingAverage;
        this.synopsis = synopsis;
        this.coverImage = coverImage;
        
    }
    
    public Story(Integer storyID, String title, Integer authorID, Integer views, Integer likes, Double ratingAverage, String synopsis, File coverImage, Boolean isPrivate) {
        
        this.storyID = storyID;
        this.title = title;
        this.authorID = authorID;
        this.views = views;
        this.likes = likes;
        this.ratingAverage = ratingAverage;
        this.synopsis = synopsis;
        this.coverImage = coverImage;
        this.isPrivate = isPrivate;
        
    }
    
    public Story(Integer storyID, String title, Integer authorID, Integer views, Integer likes, Double ratingAverage, String storyBody, String synopsis, File coverImage, Boolean isPrivate) {
        
        this.storyID = storyID;
        this.title = title;
        this.authorID = authorID;
        this.views = views;
        this.likes = likes;
        this.ratingAverage = ratingAverage;
        this.storyBody = storyBody;
        this.synopsis = synopsis;
        this.coverImage = coverImage;
        this.isPrivate = isPrivate;
        
    }
    
    
    public Integer getStoryID() {
        return storyID;
    }
    
    public void setStoryID(Integer storyID) {
        this.storyID = storyID;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public Integer getAuthorID() {
        return authorID;
    }
    
    public void setAuthorID(Integer authorID) {
        this.authorID = authorID;
    }
    
    public Integer getViews() {
        return views;
    }
    
    public void setViews(Integer views) {
        this.views = views;
    }
    
    public Integer getLikes() {
        return likes;
    }
    
    public void setLikes(Integer likes) {
        this.likes = likes;
    }
    
    public Double getRatingAverage() {
        return ratingAverage;
    }
    
    public void setRatingAverage(Double ratingAverage) {
        this.ratingAverage = ratingAverage;
    }
    
    public String getStoryBody() {
        return storyBody;
    }
    
    public void setStoryBody(String storyBody) {
        this.storyBody = storyBody;
    }
    
    public String getSynopsis() {
        return synopsis;
    }
    
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
    
    public File getCoverImage() {
        return coverImage;
    }
    
    public void setCoverImage(File coverImage) {
        this.coverImage = coverImage;
    }
    public String getCoverImageAs64(){
        return coverImageAs64;
    }
    public void setCoverImageAs64(String coverImageAs64){
        this.coverImageAs64=coverImageAs64;
    }
    public Boolean getPrivate() {
        return isPrivate;
    }
    
    public void setPrivate(Boolean aPrivate) {
        isPrivate = aPrivate;
    }
    
    @Override
    public String toString() {
        
        return "Story{" +
                "storyID=" + storyID +
                ", title='" + title + '\'' +
                ", authorID=" + authorID +
                ", views=" + views +
                ", likes=" + likes +
                ", ratingAverage=" + ratingAverage +
                ", storyBody='" + storyBody + '\'' +
                ", synopsis='" + synopsis + '\'' +
                ", coverImage=" + coverImage +
                ", isPrivate=" + isPrivate +
                '}';
        
    }
    
    
}
