package com.portbelly.backend.models.entities;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Table(name="payment")
@Entity

public class Payment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_payment")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idPayment;

	@Column(name = "name", length=20)
	private String name;
	
	@Column(name = "card_number", length=16)
	private String cardNumber;
	
	@Column(name="date_due")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Calendar dateDue;
	
	@Column(name = "security_code", length=3)
	private String securityCode;
	
	@JoinColumn(name="fk_client", referencedColumnName="id_client")
	@OneToOne
	private Client client;

	public Payment() {
		super();
	}

	public Payment(Long idPayment) {
		super();
		this.idPayment = idPayment;
	}

	public Long getIdPayment() {
		return idPayment;
	}

	public void setIdPayment(Long idPayment) {
		this.idPayment = idPayment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Calendar getDateDue() {
		return dateDue;
	}

	public void setDateDue(Calendar dateDue) {
		this.dateDue = dateDue;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Payment [idPayment=" + idPayment + ", name=" + name + ", cardNumber=" + cardNumber + ", dateDue="
				+ dateDue + ", securityCode=" + securityCode + ", client=" + client + "]";
	}


	
}
