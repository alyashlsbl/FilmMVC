
package MVC;


public class FilmMVC {
    
    FilmView filmview = new FilmView();
    FilmModel filmmodel = new FilmModel();
    FilmDAO filmDAO = new FilmDAO();
    FilmController filmcontroller = new FilmController(filmmodel, filmview, filmDAO);
    
}
