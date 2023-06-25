package TrialAndError.ReadersAreInnovators.DAOs;


import TrialAndError.ReadersAreInnovators.Models.Administration.WriterApplication;
import TrialAndError.ReadersAreInnovators.Models.StoryElements.Story;
import TrialAndError.ReadersAreInnovators.Models.UserTypes.Writer;
import java.util.ArrayList;


public interface EditorDAOInterface {
    
    
    ArrayList<WriterApplication> viewWriterApplications();
    String approveWriter(Writer writer);
    String denyWriter(Writer writer);
    ArrayList<Writer> viewWriters();
    String approvePendingStory(Story story);
    String denyPendingStory(Story story);
    
    
}
