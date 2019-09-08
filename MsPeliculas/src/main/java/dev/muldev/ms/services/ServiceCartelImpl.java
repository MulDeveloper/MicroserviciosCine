
package dev.muldev.ms.services;

import dev.muldev.ms.dao.DAOCartel;
import dev.muldev.ms.dto.CartelPelicula;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ServiceCartelImpl implements ServiceCartel{

    @Autowired
    private DAOCartel dao;
    
    @Override
    public void altaCartel(MultipartFile f, int id) throws Exception{
         
        try{
           
            //Blob blob = new javax.sql.rowset.serial.SerialBlob(f.getBytes());
            
            CartelPelicula c = new CartelPelicula(id, f.getBytes());
            
            dao.save(c);
            
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }

    @Override
    public CartelPelicula obtenerCartel(int id) {
        return dao.getOne(id);
    }
    
    
    
}
