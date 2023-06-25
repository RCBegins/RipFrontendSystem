package TrialAndError.ReadersAreInnovators.DAOs;

import TrialAndError.ReadersAreInnovators.Models.StoryElements.Genre;
import TrialAndError.ReadersAreInnovators.Models.StoryElements.Story;
import TrialAndError.ReadersAreInnovators.Models.UserTypes.User;
import java.util.ArrayList;


public interface GenresDAOInterface {
    
    
    String addGenre(Genre genre);
    String removeGenre(Genre genre);
    String selectGenre(User user, Genre genre);
    public String deselectGenre(User user, Genre genre);
    ArrayList<Genre> getGenres();
    ArrayList<Genre> getUserGenres(User user);
    String clearGenres(Story story);
    
    
}
