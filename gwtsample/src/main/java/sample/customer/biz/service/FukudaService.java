package sample.customer.biz.service;

import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import sample.customer.biz.domain.Fukuda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.*;

@Repository
public class FukudaService {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
    
    
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
    	this.jdbcTemplate = jdbcTemplate;
    }
    
    public String test(){
    	return "TEST";
    }
    
    public Fukuda getFukuda(){
    
    	return null;
    }
   
}
