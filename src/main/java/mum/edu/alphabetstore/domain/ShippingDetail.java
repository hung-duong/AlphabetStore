package mum.edu.alphabetstore.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.Date;
@Entity
public class ShippingDetail implements Serializable{

	private static final long serialVersionUID = 6350930334140807514L;
	@Id
 	private String name;

	@Valid
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn
 	private Address shippingAddress;

	@Valid
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date shippingDate;
	
	
		public ShippingDetail() {
		this.shippingAddress = new Address();
	}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public Date getShippingDate() {
			return shippingDate;
		}


		public void setShippingDate(Date shippingDate) {
			this.shippingDate = shippingDate;
		}


		public Address getShippingAddress() {
			return shippingAddress;
		}


		public void setShippingAddress(Address shippingAddress) {
			this.shippingAddress = shippingAddress;
		}


		public static long getSerialversionuid() {
			return serialVersionUID;
		}
}
