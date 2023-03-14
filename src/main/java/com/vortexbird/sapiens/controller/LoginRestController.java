package com.vortexbird.sapiens.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/login")
public class LoginRestController {
    private static final Logger log = LoggerFactory.getLogger(LoginRestController.class);

    @GetMapping(value = "/login/{usuario}/{password}")
    public ResponseEntity<List<String>> login(
    		@PathVariable("usuario") String usuario,
    		@PathVariable("password") String password
    		) {
        try {
        	List<String> respuestas = new ArrayList<>();
        	respuestas.add("Cadena 1");
        	respuestas.add("Cadena 2");
        	
        	if (usuario.equals("Admin") && password.equals("Administrador")) {
        		return ResponseEntity.ok().body(respuestas);
        	}else {
        		return ResponseEntity.badRequest().body(null);
        	}
            
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return ResponseEntity.badRequest().body(null);
        }
    }
    
}
