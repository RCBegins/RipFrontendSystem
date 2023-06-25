package Models.StoryElements;

public class Genre {
    
    
    private Integer genreID;
    private String genre;
    
    
    public Genre(){
          
    }
    
    
    public Genre(String genre) {
        
        this.genre = genre;
        
    }
    
    public Genre(String genre, Integer genreID){
        
        this.genre = genre;
        this.genreID = genreID;
        
    }
    
    
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setGenreId(Integer genreId) {
        this.genreID = genreId;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getGenreId() {
        return genreID;
    }
    
    
    @Override
    public String toString() {
        return "Genre{" +
                "genreId=" + genreID +
                ", genre='" + genre + '\'' +
                '}';
    }
    
    
}
