
package dev.muldev.ms.services;

import dev.muldev.ms.dto.CartelPelicula;
import org.springframework.web.multipart.MultipartFile;


public interface ServiceCartel {
    public void altaCartel(MultipartFile f, int id) throws Exception;
    public CartelPelicula obtenerCartel(int id);
}
