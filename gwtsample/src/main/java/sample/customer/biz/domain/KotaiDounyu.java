package sample.customer.biz.domain;

import javax.validation.constraints.AssertFalse;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.*;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

@XmlRootElement
public class KotaiDounyu implements java.io.Serializable {

	private int card_num;
	private int cage_num;
	private Date birth_date;



    public KotaiDounyu() {
    }



	public int getCard_num() {
		return card_num;
	}



	public void setCard_num(int card_num) {
		this.card_num = card_num;
	}



	public int getCage_num() {
		return cage_num;
	}



	public void setCage_num(int cage_num) {
		this.cage_num = cage_num;
	}



	public Date getBirth_date() {
		return birth_date;
	}



	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}

 
}
