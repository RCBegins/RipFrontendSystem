package TrialAndError.ReadersAreInnovators.DAOs;


import TrialAndError.ReadersAreInnovators.Models.StoryElements.Story;
import TrialAndError.ReadersAreInnovators.Models.UserTypes.User;
import TrialAndError.ReadersAreInnovators.Models.UserTypes.Writer;
import java.util.ArrayList;


public interface StoryDAOInterface {
    
    
    String removeStory(Story story);
    String privatizeStory(Story story);
    String publiciseStory(Story story);
    String submitStory(Story story);
    String readStory(Story story, User user);
    ArrayList<Story> getPublishedStories(Writer writer);
    Story displayStoryDetails(Story story);
    String createStory(Story story);
    Story getPendingStory(Story story);
    String likeStory(Story story, User user);
    String unlikeStory(Story story, User user);
    
    
}
