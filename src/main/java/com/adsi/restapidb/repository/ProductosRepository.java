/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adsi.restapidb.repository;

import com.adsi.restapidb.modelo.Productos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Yisus
 */
public interface ProductosRepository extends JpaRepository<Productos, Integer>{
    
    
    
}
