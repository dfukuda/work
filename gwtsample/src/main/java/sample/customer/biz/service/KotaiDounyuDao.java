package sample.customer.biz.service;

import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import sample.customer.biz.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.*;
import javax.sql.*;
import java.util.*;

@Repository
public class KotaiDounyuDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
    

    
    public String test(){
    	
//    	List<KotaiDounyu> list = jdbcTemplate.queryForList("select * from kotai_dounyu", KotaiDounyu.class);
//    	for(KotaiDounyu k : list){
//    		System.out.println(k.getCage_num());
//    	}
    	
    	KotaiDounyu k = jdbcTemplate.queryForObject("select * from kotai_dounyu where card_num = ?", new BeanPropertyRowMapper<KotaiDounyu>(KotaiDounyu.class), 3);
    	System.out.println(k.getCage_num() + " " +  k.getBirth_date());
    	return "TEST";
    }
    
    public Fukuda getFukuda(){
    
    	return null;
    }
   
}
