package com.portbelly.backend.models.entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="client")

public class Client implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="id_client")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idClient;
	
	@Column(name="type" , length=30)
	private String type;
	
	@Column(name="name" , length=100)
	private String name;
	
	@Column(name="cel" , length=15)
	private String cel;
	
	@Column(name="direction" , length=100)
	private String direction;
	
	@Column(name="city" , length=50)
	private String city;
	
	@Column(name="postal_code", length=10)
	private String postalCode;
	
	@Column(name="date_of_created")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Calendar dateOfCreated;
	
	@JoinColumn(name="fk_user", referencedColumnName="id_user")
	@OneToOne
	private User user;
	
	//**Cardinalidad uno a uno 	//mappedBy apunta al nombre del atributo en la clase payment
	@OneToOne(mappedBy="client", fetch=FetchType.LAZY)
	private Payment payment;
	
	//**Cardinalidad uno a uno 	//mappedBy apunta al nombre del atributo en la clase billHead
	@OneToOne(mappedBy="client", fetch=FetchType.LAZY)
	private BillHead billHead;
	
	//**Cardinalidad uno a varios 	//mappedBy apunta al nombre del atributo en la clase shoppingCart
	@OneToMany(mappedBy="client", fetch=FetchType.LAZY)
	private List<ShoppingCart> shoppingCarts;


	public Client() {
		super();
	}

	public Client(Long idClient) {
		super();
		this.idClient = idClient;
	}
	

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCel() {
		return cel;
	}

	public void setCel(String cel) {
		this.cel = cel;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


	public Calendar getDateOfCreated() {
		return dateOfCreated;
	}

	public void setDateOfCreated(Calendar dateOfCreated) {
		this.dateOfCreated = dateOfCreated;
	}

	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public BillHead getBillHead() {
		return billHead;
	}

	public void setBillHead(BillHead billHead) {
		this.billHead = billHead;
	}

	public List<ShoppingCart> getShoppingCarts() {
		return shoppingCarts;
	}

	public void setShoppingCarts(List<ShoppingCart> shoppingCarts) {
		this.shoppingCarts = shoppingCarts;
	}

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", type=" + type + ", name=" + name + ", cel=" + cel + ", direction="
				+ direction + ", city=" + city + ", postalCode=" + postalCode + ", dateOfCreated=" + dateOfCreated
				+ ", user=" + user + ", payment=" + payment + ", billHead=" + billHead + ", shoppingCarts="
				+ shoppingCarts + "]";
	}

	

}
