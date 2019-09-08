/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.muldev.ms.dao;

import dev.muldev.ms.dto.TrailerPelicula;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Acer
 */
public interface DAOTrailer extends JpaRepository<TrailerPelicula, Integer>{
    
}
