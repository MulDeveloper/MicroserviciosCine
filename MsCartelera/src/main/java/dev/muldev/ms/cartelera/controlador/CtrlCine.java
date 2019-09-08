
package dev.muldev.ms.cartelera.controlador;



import dev.muldev.ms.cartelera.dto.CartelPelicula;
import dev.muldev.ms.cartelera.services.ServiceCartel;
import dev.muldev.ms.cartelera.services.ServicePelicula;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * Controlador de la cartelera del cine 
 */
@Controller
public class CtrlCine {
    
    @Autowired
    private ServicePelicula service;
    @Autowired
    private ServiceCartel serviceCartel;
    
    @GetMapping("/")
    public String retornaIndice(Model m) throws IOException{
        m.addAttribute("listaPeliculas", service.listarPeliculas());

        byte [] data = serviceCartel.obtenerCarteles().get(2).getImage();     
        ByteArrayInputStream bis = new ByteArrayInputStream(data); 
        BufferedImage bImage2 = ImageIO.read(bis); 
        int cont = 0;
        ImageIO.write(bImage2, "jpg", new File("./src/main/resources/static/img/cartel"+cont+".jpg") );
        
        m.addAttribute("listaCarteles", serviceCartel.obtenerCarteles());
        
        return "cartelera";
    }
}
