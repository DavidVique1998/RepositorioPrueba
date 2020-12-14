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

@Entity
@Table(name="bill_head")

public class BillHead implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	@Column(name="id_bill_head")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idBillHead;
	
	@Column(name="date_of_created")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Calendar dateOfCreated;
	
	@JoinColumn(name="fk_client", referencedColumnName="id_client")
	@OneToOne
	private Client client;

	public BillHead() {
		super();
	}

	public BillHead(Long idBillHead) {
		super();
		this.idBillHead = idBillHead;
	}

	public Long getIdBillHead() {
		return idBillHead;
	}

	public void setIdBillHead(Long idBillHead) {
		this.idBillHead = idBillHead;
	}

	public Calendar getDateOfCreated() {
		return dateOfCreated;
	}

	public void setDateOfCreated(Calendar dateOfCreated) {
		this.dateOfCreated = dateOfCreated;
	}

	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "BillHead [idBillHead=" + idBillHead + ", dateOfCreated=" + dateOfCreated + ", client=" + client + "]";
	}


	
	//@Column(name="date_of_exp")
	//@DateTimeFormat(pattern = "yyyy-MM-dd")
	//@Temporal(TemporalType.DATE)
	//private Calendar dateOfExp;
	
}
