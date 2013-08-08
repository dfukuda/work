package sample.customer.web.controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.SessionAttributes;

import sample.customer.biz.domain.Customer;
import sample.customer.biz.domain.Daisuke;
import sample.customer.biz.domain.Fukuda;
import sample.customer.biz.domain.User;
import sample.customer.biz.service.*;
import sample.customer.biz.service.tran.FukudaTranService;

@Controller
@SessionAttributes("editDaisuke")
public class KotaiDounyuController {

    @Autowired
    private KotaiDounyuDao KotaiDounyuDao;
	
    @Autowired
    private UsersDao usersDao;
	
    
    @Autowired
    private FukudaTranService fukudaTS;
	
	@RequestMapping("/kotai_dounyu")
    public String register(@Valid Fukuda fukuda, Model model, Errors errors) {
		
		Daisuke daisuke = new Daisuke();
		model.addAttribute("editDaisuke", daisuke);
		
		if(errors.hasErrors()){
			System.out.println(errors.toString());
			return "top";
		}
		
		String active = "class=\"active\"";
		model.addAttribute("kotai_dounyu_active",  active);
		
		model.addAttribute("test", "テスト<br>テスト");
		
		// DBを使うときは以下のように使う
		//KotaiDounyuDao.test();
		
		try{
//			User user = usersDao.getFukuda();
//			System.out.println(user.getPassword());
		}
		catch(Exception ex){
			ex.printStackTrace();
			System.out.println("database設定してね");
		}
		
		{
			ShaPasswordEncoder pe = new ShaPasswordEncoder(256);
			
	        String encoded = pe.encodePassword("admin", null);
	        System.out.println(encoded);
	        
			
		}
		
		{
			Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			String username = ((UserDetails)principal).getUsername();

			System.out.println(username);
		}
		
		
//		//以下もDB使用のためコメントアウト
//		{
//			try{
//				fukudaTS.update2(null);
//			}
//			catch(Exception ex){
//				ex.printStackTrace();
//			}
//		}
		
        return "kotai_dounyu";
    }
	
	@RequestMapping(value = "/kotai_dounyu" , params = "_event_proceed" , method = POST)
    public String edit(@Valid Daisuke daisuke, Errors errors, Model model) {
		
		System.out.println("通った");
		
		if(errors.hasErrors()){
			System.out.println(errors.toString());
			System.out.println("えらーだよ");
			
			return "top";
		}
		
		String active = "class=\"active\"";
		model.addAttribute("kotai_dounyu_active",  active);
		
        return "kotai_dounyu";
    }

    @ExceptionHandler(BindException.class)
    public String handleException(BindException ex) {
    	
    	for(ObjectError err : ex.getAllErrors()){
    	     //String msg = this.messageSource.getMessage(err, Locale.getDefault());
    	      System.out.println(err.toString());
    	}
        return "top";
    }
}
