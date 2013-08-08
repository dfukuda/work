package sample.customer.biz.service.tran;

import sample.customer.biz.domain.Customer;
import sample.customer.biz.domain.KotaiDounyu;
import sample.customer.biz.service.DataNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service("fukudaTranService")
public class FukudaTranServiceImpl implements FukudaTranService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    

	
	public void update2(KotaiDounyu kotaiDounyu) throws DataNotFoundException {
		jdbcTemplate.update("update kotai_dounyu set test = 'akspodiufpoaisdf' where card_num = 1");
		jdbcTemplate.update("update kotai_dounyu set test = 'dfukuda' where card_num = 4");
		//jdbcTemplate.update("update kotai_dounyu set test = 'dfukuda' where card_num = 4");
	}

	//@Transactional
	public void update(KotaiDounyu kotaiDounyu) throws DataNotFoundException {
		jdbcTemplate.update("update kotai_dounyu set test = 'aaaaaaaa' where card_num = 1");
		jdbcTemplate.update("update kotai_douny set test = 'dfukuda' where card_num = 4");
		//jdbcTemplate.update("update kotai_dounyu set test = 'dfukuda' where card_num = 4");
	}
 
}
