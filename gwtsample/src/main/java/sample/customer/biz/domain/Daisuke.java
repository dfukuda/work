package sample.customer.biz.domain;



import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class Daisuke  implements java.io.Serializable{

	
	private int id;
	
	@NotNull
	private String name;
	
	
	private String test;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTest() {
		return test;
	}


	public void setTest(String test) {
		this.test = test;
	}
	
	private static final long serialVersionUID = 3428490997353904744L;
}
