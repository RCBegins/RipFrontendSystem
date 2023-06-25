package TrialAndError.ReadersAreInnovators.DAOs;


import TrialAndError.ReadersAreInnovators.Models.StoryElements.Genre;
import TrialAndError.ReadersAreInnovators.Models.StoryElements.Story;
import TrialAndError.ReadersAreInnovators.Models.UserTypes.Editor;
import TrialAndError.ReadersAreInnovators.Models.UserTypes.Writer;
import java.sql.Date;
import java.util.ArrayList;


public interface AnalyticsDAOInterface{
    
    
    Integer getLikes(Story story);
    Integer getViews(Story story);
    Integer getAuthorFollowCount(Writer writer);
    String addView(Story story);
    ArrayList<Story> getMostViewedStories(Integer noOfStories, Date startPeriod, Date endPeriod);                       //Gets the stories with the most views over a period of time.
    ArrayList<Story> getHighestRatedStories(Integer noOfStories, Date startPeriod, Date endPeriod);                     //Gets the stories with the highest rating over a period of time.
    ArrayList<Story> getMostLikedStories(Integer noOfStories, Date startPeriod, Date endPeriod);                        //Gets the stories with the most likes over a period of time.
    ArrayList<Genre> getTopGenres(Integer noOfGenres, Date startPeriod, Date endPeriod);                                //Get the most viewed categories over a period of time.
    ArrayList<Writer> getTopWriters(Integer noOfWriters);                                                               //Get the writers whose stories have the most views in a period of time.
    ArrayList<Editor> getTopEditors(Integer noOfEditors);                                                               //Get the editors who have edited the most stories over a period of time.
    
    
}
