
package dev.muldev.ms.cartelera.services;

import dev.muldev.ms.cartelera.dao.DAOPeliculas;
import dev.muldev.ms.cartelera.dto.Pelicula;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicePeliculaImpl implements ServicePelicula{
    
    @Autowired
    private DAOPeliculas dao;

    @Override
    public List<Pelicula> listarPeliculas() {
        return dao.findAll();
    }
    
    
}
