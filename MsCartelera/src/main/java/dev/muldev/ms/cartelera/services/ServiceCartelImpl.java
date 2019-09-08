
package dev.muldev.ms.cartelera.services;

import dev.muldev.ms.cartelera.dao.DAOCartel;
import dev.muldev.ms.cartelera.dto.CartelPelicula;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceCartelImpl implements ServiceCartel{
    
    @Autowired
    private DAOCartel dao;

    @Override
    public List<CartelPelicula> obtenerCarteles() {
        return dao.findAll();
    }
    
    
    
}
