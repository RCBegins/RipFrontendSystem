package TrialAndError.ReadersAreInnovators.Models.AnalyticalData;

public class Analytics {
    
    
    private Integer analyticsID;
    private Integer views;
    private Integer likes;
    private Double ratingAverage;
    private Double data;
    

    public Analytics(){
        
    }
    
    public Analytics(Integer analyticsID, Double data) {
        
        this.analyticsID = analyticsID;
        this.data = data;
        
    }
    
    public Analytics(Integer analyticsID, Integer views, Integer likes, Double ratingAverage, Double data) {
        
        this.analyticsID = analyticsID;
        this.views = views;
        this.likes = likes;
        this.ratingAverage = ratingAverage;
        this.data = data;
        
    }
    
    public Integer getAnalyticsID() {
        return analyticsID;
    }
    
    public void setAnalyticsID(Integer analyticsID) {
        this.analyticsID = analyticsID;
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
    
    public Double getData() {
        return data;
    }
    
    public void setData(Double data) {
        this.data = data;
    }
    
    
    @Override
    public String toString() {
        
        return "Analytics{" +
                "analyticsID=" + analyticsID +
                ", views=" + views +
                ", likes=" + likes +
                ", ratingAverage=" + ratingAverage +
                ", data=" + data +
                '}';
        
    }
    
    
}
