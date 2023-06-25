package Models.AnalyticalData;

public class Analytics {
    
    
    private Integer likes;
    private Integer views;
    private Integer analyticsID;
    private Double ratingAverage;
    

    public Analytics(){
        
    }

    
    public Analytics(Integer likes, Integer views, Integer analyticsID, Double ratingAverage) {
        
        this.likes = likes;
        this.views = views;
        this.analyticsID = analyticsID;
        this.ratingAverage = ratingAverage;
        
    }

    
    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getAnalyticsID() {
        return analyticsID;
    }

    public void setAnalyticsID(Integer analyticsID) {
        this.analyticsID = analyticsID;
    }

    public Double getRatingAverage() {
        return ratingAverage;
    }

    public void setRatingAverage(Double ratingAverage) {
        this.ratingAverage = ratingAverage;
    }

    
    @Override
    public String toString() {
        return "Analytics{" +
                "likes=" + likes +
                ", views=" + views +
                ", analyticsID=" + analyticsID +
                ", ratingAverage=" + ratingAverage +
                '}';
    }
    
    
}
