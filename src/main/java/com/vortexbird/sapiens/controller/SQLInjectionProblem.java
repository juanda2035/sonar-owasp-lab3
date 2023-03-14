package com.vortexbird.sapiens.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SQLInjectionProblem {

	@Autowired
	DataSource dataSource;
	
	public String unsafeFindAccountsByCustomerId(String customerId)
	  throws MiExcepcion {
		
	    try {
	    	// UNSAFE !!! DON'T DO THIS !!!
		    String sql = "select "
		      + "customer_id,acc_number,branch_id,balance "
		      + "from Accounts where customer_id = '"
		      + customerId 
		      + "'";
		    
		    try(Connection c = dataSource.getConnection()){
		    	try(Statement stm = c.createStatement()){
		    		try(ResultSet rs = stm.executeQuery(sql)){
		    			//....
		    			return "Ok";
		    		}
		    		
		    	}
		    }
		    
		    
		} catch (Exception e) {
			String mensaje = "Error consultando...";
			throw new MiExcepcion(mensaje, e);
		}
	}
	
}
