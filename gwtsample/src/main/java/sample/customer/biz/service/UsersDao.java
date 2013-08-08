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
public class UsersDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
    

    
    public User getFukuda(){
    	
    	User user = jdbcTemplate.queryForObject("select * from users where username = ?", new BeanPropertyRowMapper<User>(User.class), "dfukuda");
    	return user;
    }
    

   
}
