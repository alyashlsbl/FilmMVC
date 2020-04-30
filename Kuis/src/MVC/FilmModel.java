package MVC;

public class FilmModel {
    
    private String judul, tipe, episode, genre, status, rating, search, idf;
    
    public void setFilmModel(String jjudul, String ttipe, String eepisode, String ggenre, String sstatus, String rrating) {
        this.judul = jjudul;
        this.tipe = ttipe;
        this.episode = eepisode;
        this.genre = ggenre;
        this.status = sstatus;
        this.rating = rrating;
        
    }
    
    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul){
        this.judul = judul;
    }    
    public String getTipe() {
        return tipe;
    }
    public void setTipe(String tipe){
        this.tipe = tipe;
    }
    public String getEpisode() {
        return episode;
    }
    public void setEpisode(String episode){
        this.episode = episode;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    
    public String getStatus() {
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
    
    public String getRating() {
        return rating;
    }
    public void setRating(String rating){
        this.rating = rating;
    }
    
    public String getSearch() {
        return search;
    }
    public void setSearch(String search){
        this.search = search;
    }
    
    public String getID() {
        return idf;
    }
    public void setID(String idf){
        this.idf = idf;
    }
    
}
