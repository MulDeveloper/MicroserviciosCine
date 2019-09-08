
package dev.muldev.ms.controller;

import dev.muldev.ms.dto.CartelPelicula;
import dev.muldev.ms.services.ServiceCartel;
import dev.muldev.ms.services.ServicePelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class CtrlImagenes {
    
    @Autowired
    private ServicePelicula service;
    
    @Autowired
    private ServiceCartel serviceCartel;
    
    @RequestMapping(value = "/insertarCartel/{id}")
    public String paginaCartel(@PathVariable Integer id, Model m){
        m.addAttribute("Pelicula", service.getPelicula(id));
        return "cartel";
    }
    

    @RequestMapping(value = "/altaCartelBd/{id}", method = RequestMethod.POST)
    public String altaCartelEnBd(@RequestParam(value="image") MultipartFile file, @PathVariable Integer id){
        try{
            System.out.println(file.getOriginalFilename());
            System.out.println(file.getSize());
            serviceCartel.altaCartel(file, id);
            return "success";
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return "error";
        }
    }
}
