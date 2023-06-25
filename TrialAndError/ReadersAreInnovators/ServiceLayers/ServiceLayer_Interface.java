package TrialAndError.ReadersAreInnovators.ServiceLayers;

import TrialAndError.ReadersAreInnovators.DAOs.*;
import TrialAndError.ReadersAreInnovators.Models.Administration.WriterApplication;
import TrialAndError.ReadersAreInnovators.Models.AnalyticalData.Rating;
import TrialAndError.ReadersAreInnovators.Models.StoryElements.Comment;
import TrialAndError.ReadersAreInnovators.Models.StoryElements.Genre;
import TrialAndError.ReadersAreInnovators.Models.StoryElements.Story;
import TrialAndError.ReadersAreInnovators.Models.UserTypes.Editor;
import TrialAndError.ReadersAreInnovators.Models.UserTypes.Reader;
import TrialAndError.ReadersAreInnovators.Models.UserTypes.User;
import TrialAndError.ReadersAreInnovators.Models.UserTypes.Writer;

import java.sql.Date;
import java.util.ArrayList;

public interface ServiceLayer_Interface extends AdminEditorDAOInterface, AnalyticsDAOInterface,
        CommentDAOInterface, EditorDAOInterface, GenresDAOInterface, RatingDAOInterface, ReaderDAOInterface, 
        StoryDAOInterface, UserDAOInterface, WriterDAOInterface{
    
    @Override
    String removeEditor(Editor editor);
    
    @Override
    String addEditor(Editor editor);
    
    @Override
    Integer getLikes(Story story);
    
    @Override
    Integer getViews(Story story);
    
    @Override
    Integer getAuthorFollowCount(Writer writer);
    
    @Override
    String addView(Story story);
    
    @Override
    ArrayList<Story> getMostViewedStories(Integer noOfStories, Date startPeriod, Date endPeriod);
    
    @Override
    ArrayList<Story> getHighestRatedStories(Integer noOfStories, Date startPeriod, Date endPeriod);
    
    @Override
    ArrayList<Story> getMostLikedStories(Integer noOfStories, Date startPeriod, Date endPeriod);
    
    @Override
    ArrayList<Genre> getTopGenres(Integer noOfGenres, Date startPeriod, Date endPeriod);
    
    @Override
    ArrayList<Writer> getTopWriters(Integer noOfWriters);
    
    @Override
    ArrayList<Editor> getTopEditors(Integer noOfEditors);
    
    @Override
    String addComment(Comment comment);
    
    @Override
    ArrayList<Comment> getComments(Story story);
    
    @Override
    String reportComment(Comment comment);
    
    @Override
    String deleteComment(Comment comment);
    
    @Override
    String unFlagComment(Comment comment);
    
    @Override
    ArrayList<Comment> viewFlaggedComments();
    
    @Override
    Integer getNumberOfComments(Story story);
    
    @Override
    String clearComments(Story story);
    
    @Override
    ArrayList<WriterApplication> viewWriterApplications();
    
    @Override
    String approveWriter(Writer writer);
    
    @Override
    String denyWriter(Writer writer);
    
    @Override
    ArrayList<Writer> viewWriters();
    
    @Override
    String approvePendingStory(Story story);
    
    @Override
    String denyPendingStory(Story story);
    
    @Override
    String addGenre(Genre genre);
    
    @Override
    String removeGenre(Genre genre);
    
    @Override
    String selectGenre(User user, Genre genre);
    
    @Override
    String deselectGenre(User user, Genre genre);
    
    @Override
    ArrayList<Genre> getGenres();
    
    @Override
    ArrayList<Genre> getUserGenres(User user);
    
    @Override
    String clearGenres(Story story);
    
    @Override
    Double getStoryRating(Story story);
    
    @Override
    String rateStory(Rating rating);
    
    @Override
    String changeRating(Rating rating);
    
    @Override
    String removeRating(Rating rating);
    
    @Override
    String clearRating(Story story);
    
    @Override
    String registerReader(Reader reader);
    
    @Override
    Reader login(User user);
    
    @Override
    String editPersonalInfo(User user);
    
    @Override
    String writerApplication(WriterApplication writerApplication);
    
    @Override
    String followAuthor(Writer writer, User user);
    
    @Override
    ArrayList<Story> getAllFavorites(User user);
    
    @Override
    ArrayList<Story> getReadFavorites(User user);
    
    @Override
    ArrayList<Story> getUnreadFavorites(User user);
    
    @Override
    String removeStory(Story story);
    
    @Override
    String privatizeStory(Story story);
    
    @Override
    String publiciseStory(Story story);
    
    @Override
    String submitStory(Story story);
    
    @Override
    String readStory(Story story, User user);
    
    @Override
    ArrayList<Story> getPublishedStories(Writer writer);
    
    @Override
    Story displayStoryDetails(Story story);
    
    @Override
    String createStory(Story story);
    
    @Override
    Story getPendingStory(Story story);
    
    @Override
    String likeStory(Story story, User user);
    
    @Override
    String unlikeStory(Story story, User user);
    
    @Override
    ArrayList<String> search(String topic);
    
    @Override
    String writerRegistration(Writer writer);
    
    @Override
    Story getDraft(Story story);
    
    @Override
    Story editDraft(Story story);
    
    @Override
    Boolean toggleComments();
    
    @Override
    Writer getAuthor(Writer writer);
}
