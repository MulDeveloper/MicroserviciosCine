
package dev.muldev.ms.services;

import dev.muldev.ms.dao.DAOPelicula;
import dev.muldev.ms.dto.Pelicula;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicePeliculaImpl implements ServicePelicula{
    
    @Autowired
    private DAOPelicula dao;

    @Override
    public int altaPelicula(Pelicula p) {
        try{
            dao.save(p);
            return 1;
        }
        catch(Exception e){
            return -1;
        }
    }

    @Override
    public int bajaPelicula(int id) {
        try{
            dao.deleteById(id);
            return 1;
        }
        catch(Exception e){
            return -1;
        }
    }

    @Override
    public List<Pelicula> listarPeliculas() {
        return dao.findAll();
    }

    @Override
    public Pelicula getPelicula(int id) {
        return dao.getOne(id);
    }
    
}
