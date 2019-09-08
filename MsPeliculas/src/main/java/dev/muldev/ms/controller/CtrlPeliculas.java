
package dev.muldev.ms.controller;

import dev.muldev.ms.dto.CartelPelicula;
import dev.muldev.ms.dto.Pelicula;
import dev.muldev.ms.dto.TrailerPelicula;
import dev.muldev.ms.services.ServiceCartel;
import dev.muldev.ms.services.ServicePelicula;
import dev.muldev.ms.services.ServiceTrailer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class CtrlPeliculas {
    
    @Autowired
    private ServicePelicula service;
    @Autowired
    private ServiceTrailer serviceTrailer;
    
    @GetMapping("/")
    public String retornaIndice(){
        return "administracionCine";
    }
    @GetMapping("/insertarPelicula")
    public String retornaAddPelicula(Model m){
        m.addAttribute("Pelicula", new Pelicula());
        return "addFilm";
    }
    
    
    @RequestMapping(value = "/altaPeliculaBd", method = RequestMethod.POST)
    public String altaPeliculaEnBd(Pelicula p){
        
        try{
            service.altaPelicula(p);

            return "success";
        }
        catch(Exception e){
            return "error";
        }
    }
    
    
    @RequestMapping(value = "/eliminarPelicula/{id}")
    public String bajaPeliculaEnBd(@PathVariable Integer id){
        try{
            service.bajaPelicula(id);
            return "success";
        }
        catch(Exception e){
            return "error";
        }
    }
    
    @RequestMapping(value="/listarPeliculas")
    public String listaPeliculas(Model m){
        m.addAttribute("listaPeliculas", service.listarPeliculas());
        return "Peliculas";
    }
    
    @RequestMapping(value = "/insertarTrailer/{id}")
    public String modificarAfiliado(@PathVariable Integer id, Model m){
        m.addAttribute("TrailerPelicula", new TrailerPelicula());
        m.addAttribute("Pelicula",service.getPelicula(id));
        return "trailer";

    }
    
    @RequestMapping(value = "/altaTrailer", method = RequestMethod.POST)
    public String altaTrailerEnBd(TrailerPelicula t){
        try{
            String [] partes = t.getLink().split("=");
            String urlCortada = partes[1];
            t.setLink(urlCortada);
            serviceTrailer.altaTrailer(t);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return "success";
    }

}
