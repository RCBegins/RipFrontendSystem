package TrialAndError.ReadersAreInnovators.DAOs;


import TrialAndError.ReadersAreInnovators.Models.AnalyticalData.Rating;
import TrialAndError.ReadersAreInnovators.Models.StoryElements.Story;


public interface RatingDAOInterface {
    
    
    Double getStoryRating(Story story);
    String rateStory(Rating rating);
    String changeRating(Rating rating);
    String removeRating(Rating rating);
    String clearRating(Story story);
    
    
}
