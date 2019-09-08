
package dev.muldev.ms.mstrailer.controlador;

import dev.muldev.ms.mstrailer.services.ServiceTrailer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CtrlTrailer {
    
    
    @Autowired
    private ServiceTrailer service;
    
    
    @RequestMapping(value="/showTrailer/{id}")
    public String mostrarTrailer(Model m , @PathVariable Integer id){
        m.addAttribute("Trailer", service.obtenerTrailer(id));
        return "trailer";
    }
}
