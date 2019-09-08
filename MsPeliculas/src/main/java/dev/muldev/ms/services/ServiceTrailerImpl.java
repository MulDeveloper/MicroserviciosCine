
package dev.muldev.ms.services;

import dev.muldev.ms.dao.DAOTrailer;
import dev.muldev.ms.dto.TrailerPelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceTrailerImpl implements ServiceTrailer{
    
    @Autowired
    private DAOTrailer dao;

    @Override
    public void altaTrailer(TrailerPelicula t) {
        dao.save(t);
    }
    
}
