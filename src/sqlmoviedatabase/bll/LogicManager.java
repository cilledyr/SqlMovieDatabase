/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlmoviedatabase.bll;

import java.util.List;
import sqlmoviedatabase.be.Movie;
import sqlmoviedatabase.dal.DalController;

/**
 *
 * @author Abdi
 */
public class LogicManager {
    DalController dc = new DalController();
    
    public List<Movie> getAllMovies()
    {
        return dc.getAllMovies();
    }
}
