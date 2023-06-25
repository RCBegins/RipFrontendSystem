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

public class ServiceLayerClass implements ServiceLayer_Interface{
    
    
    AdminEditorImplementation adminImp;
    AnalyticsImplementation analyticsImp;
    CommentImplementation commentImp;
    EditorImplementation editorImp;
    GenresImplementation genresImp;
    RatingImplementation ratingImp;
    ReaderImplementation readerImp;
    StoryImplementation storyImp;
    WriterImplementation writerImp;
    UserImplementation userImp;
    
    
    public ServiceLayerClass() {
        
        
        this.adminImp = new AdminEditorImplementation();
        this.analyticsImp = new AnalyticsImplementation();
        this.commentImp = new CommentImplementation();
        this.editorImp = new EditorImplementation();
        this.genresImp = new GenresImplementation();
        this.storyImp = new StoryImplementation();
        this.ratingImp = new RatingImplementation();
        this.readerImp = new ReaderImplementation();
        this.writerImp = new WriterImplementation();
        this.userImp = new UserImplementation();
        
    }
    
    @Override
    public String removeEditor(Editor editor) {
        return null;
    }
    
    @Override
    public String addEditor(Editor editor) {
        return null;
    }
    
    @Override
    public Integer getLikes(Story story) {
        return null;
    }
    
    @Override
    public Integer getViews(Story story) {
        return null;
    }
    
    @Override
    public Integer getAuthorFollowCount(Writer writer) {
        return null;
    }
    
    @Override
    public String addView(Story story) {
        return null;
    }
    
    @Override
    public ArrayList<Story> getMostViewedStories(Integer noOfStories, Date startPeriod, Date endPeriod) {
        return null;
    }
    
    @Override
    public ArrayList<Story> getHighestRatedStories(Integer noOfStories, Date startPeriod, Date endPeriod) {
        return null;
    }
    
    @Override
    public ArrayList<Story> getMostLikedStories(Integer noOfStories, Date startPeriod, Date endPeriod) {
        return null;
    }
    
    @Override
    public ArrayList<Genre> getTopGenres(Integer noOfGenres, Date startPeriod, Date endPeriod) {
        return null;
    }
    
    @Override
    public ArrayList<Writer> getTopWriters(Integer noOfWriters) {
        return null;
    }
    
    @Override
    public ArrayList<Editor> getTopEditors(Integer noOfEditors) {
        return null;
    }
    
    @Override
    public String addComment(Comment comment) {
        return null;
    }
    
    @Override
    public ArrayList<Comment> getComments(Story story) {
        return null;
    }
    
    @Override
    public String reportComment(Comment comment) {
        return null;
    }
    
    @Override
    public String deleteComment(Comment comment) {
        return null;
    }
    
    @Override
    public String unFlagComment(Comment comment) {
        return null;
    }
    
    @Override
    public ArrayList<Comment> viewFlaggedComments() {
        return null;
    }
    
    @Override
    public Integer getNumberOfComments(Story story) {
        return null;
    }
    
    @Override
    public String clearComments(Story story) {
        return null;
    }
    
    @Override
    public ArrayList<WriterApplication> viewWriterApplications() {
        return null;
    }
    
    @Override
    public String approveWriter(Writer writer) {
        return null;
    }
    
    @Override
    public String denyWriter(Writer writer) {
        return null;
    }
    
    @Override
    public ArrayList<Writer> viewWriters() {
        return null;
    }
    
    @Override
    public String approvePendingStory(Story story) {
        return null;
    }
    
    @Override
    public String denyPendingStory(Story story) {
        return null;
    }
    
    @Override
    public String addGenre(Genre genre) {
        return null;
    }
    
    @Override
    public String removeGenre(Genre genre) {
        return null;
    }
    
    @Override
    public String selectGenre(User user, Genre genre) {
        return null;
    }
    
    @Override
    public String deselectGenre(User user, Genre genre) {
        return null;
    }
    
    @Override
    public ArrayList<Genre> getGenres() {
        return null;
    }
    
    @Override
    public ArrayList<Genre> getUserGenres(User user) {
        return null;
    }
    
    @Override
    public String clearGenres(Story story) {
        return null;
    }
    
    @Override
    public Double getStoryRating(Story story) {
        return null;
    }
    
    @Override
    public String rateStory(Rating rating) {
        return null;
    }
    
    @Override
    public String changeRating(Rating rating) {
        return null;
    }
    
    @Override
    public String removeRating(Rating rating) {
        return null;
    }
    
    @Override
    public String clearRating(Story story) {
        return null;
    }
    
    @Override
    public String registerReader(Reader reader) {
        return null;
    }
    
    @Override
    public Reader login(User user) {
        return null;
    }
    
    @Override
    public String editPersonalInfo(User user) {
        return null;
    }
    
    @Override
    public String writerApplication(WriterApplication writerApplication) {
        return null;
    }
    
    @Override
    public String followAuthor(Writer writer, User user) {
        return null;
    }
    
    @Override
    public ArrayList<Story> getAllFavorites(User user) {
        return null;
    }
    
    @Override
    public ArrayList<Story> getReadFavorites(User user) {
        return null;
    }
    
    @Override
    public ArrayList<Story> getUnreadFavorites(User user) {
        return null;
    }
    
    @Override
    public String removeStory(Story story) {
        return null;
    }
    
    @Override
    public String privatizeStory(Story story) {
        return null;
    }
    
    @Override
    public String publiciseStory(Story story) {
        return null;
    }
    
    @Override
    public String submitStory(Story story) {
        return null;
    }
    
    @Override
    public String readStory(Story story, User user) {
        return null;
    }
    
    @Override
    public ArrayList<Story> getPublishedStories(Writer writer) {
        return null;
    }
    
    @Override
    public Story displayStoryDetails(Story story) {
        return null;
    }
    
    @Override
    public String createStory(Story story) {
        return null;
    }
    
    @Override
    public Story getPendingStory(Story story) {
        return null;
    }
    
    @Override
    public String likeStory(Story story, User user) {
        return null;
    }
    
    @Override
    public String unlikeStory(Story story, User user) {
        return null;
    }
    
    @Override
    public ArrayList<String> search(String topic) {
        return null;
    }
    
    @Override
    public String writerRegistration(Writer writer) {
        return null;
    }
    
    @Override
    public Story getDraft(Story story) {
        return null;
    }
    
    @Override
    public Story editDraft(Story story) {
        return null;
    }
    
    @Override
    public Boolean toggleComments() {
        return null;
    }
    
    @Override
    public Writer getAuthor(Writer writer) {
        return null;
    }
}
