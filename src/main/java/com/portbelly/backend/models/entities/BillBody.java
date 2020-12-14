package com.portbelly.backend.models.entities;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Table(name="bill_body")
@Entity
public class BillBody implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_bill_body")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idBillBody;
	
	@Column(name="date_of_created")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Calendar dateOfCreated;

	public BillBody() {
		super();
	}

	public BillBody(Long idBillBody) {
		super();
		this.idBillBody = idBillBody;
	}

	public Long getIdBillBody() {
		return idBillBody;
	}

	public void setIdBillBody(Long idBillBody) {
		this.idBillBody = idBillBody;
	}

	public Calendar getDateOfCreated() {
		return dateOfCreated;
	}

	public void setDateOfCreated(Calendar dateOfCreated) {
		this.dateOfCreated = dateOfCreated;
	}

	@Override
	public String toString() {
		return "BillBody [idBillBody=" + idBillBody + ", dateOfCreated=" + dateOfCreated + "]";
	}


	
}
