/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adsi.restapidb.rest;
import com.adsi.restapidb.modelo.Productos;
import com.adsi.restapidb.repository.ProductosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Yisus
 */
@RestController
public class ProductosRest {
     
    //Se injecta el repositorio
    @Autowired
    ProductosRepository productosRepository;
    
    
    //se establece la ruta/path
    @GetMapping("/api/Productos")
    public List<Productos> listarProductos(){
        
        //se usa el repositorio para llamar al metodo (en este caso findAll)
        return productosRepository.findAll();
        
    } 
    
}
