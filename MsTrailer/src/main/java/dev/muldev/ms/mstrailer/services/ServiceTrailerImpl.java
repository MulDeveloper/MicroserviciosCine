
package dev.muldev.ms.mstrailer.services;

import dev.muldev.ms.mstrailer.dao.DAOTrailerPelicula;
import dev.muldev.ms.mstrailer.dto.TrailerPelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceTrailerImpl implements ServiceTrailer{
    
    @Autowired
    private DAOTrailerPelicula dao;

    @Override
    public TrailerPelicula obtenerTrailer(int id) {
        return dao.getOne(id);
    }
    
    
    
}
