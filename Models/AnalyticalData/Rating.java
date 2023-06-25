package Models.AnalyticalData;

public class Rating {
    
    
    private Integer userID;
    private Integer storyID;
    private Integer rating;
    private Integer ratingID;
    

    public Rating(){
        
    }
    

    public Rating(Integer userID, Integer storyID, Integer rating, Integer ratingID) {
        
        this.userID = userID;
        this.storyID = storyID;
        this.rating = rating;
        this.ratingID = ratingID;
        
    }

    
    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getStoryID() {
        return storyID;
    }

    public void setStoryID(Integer storyID) {
        this.storyID = storyID;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getRatingID() {
        return ratingID;
    }

    public void setRatingID(Integer ratingID) {
        this.ratingID = ratingID;
    }

    
    @Override
    public String toString() {
        return "Rating{" +
                "userID=" + userID +
                ", storyID=" + storyID +
                ", rating=" + rating +
                ", ratingID=" + ratingID +
                '}';
    }
    
    
}
