package TrialAndError.ReadersAreInnovators.DAOs;


import TrialAndError.ReadersAreInnovators.Models.StoryElements.Story;
import TrialAndError.ReadersAreInnovators.Models.UserTypes.Writer;


public interface WriterDAOInterface {
    
    
    public String writerRegistration(Writer writer);
    Story getDraft(Story story);
    Story editDraft(Story story);
    Boolean toggleComments();
    String privatizeStory(Story story);
    Writer getAuthor(Writer writer);
    
    
}
