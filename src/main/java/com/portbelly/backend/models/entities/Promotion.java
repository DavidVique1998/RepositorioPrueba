package com.portbelly.backend.models.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="promotion")
@Entity
public class Promotion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_promotion")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idPromotion;
	
	@Column(name = "name", length=50)
	private String name;
	
	@Column(name = "type")
	private boolean type;
	
	@Column(name = "quantity", length=15)
	private int quantity;
	
	@Column(name = "percent", precision=12, scale=2)
	private float percent;
	
	//**Cardinalidad uno a varios 	//mappedBy apunta al nombre del atributo en la clase shoppingCart
	@OneToMany(mappedBy="promotion", fetch=FetchType.LAZY)
	private List<Product> products;

	public Promotion() {
		super();
	}

	public Promotion(Long idPromotion) {
		super();
		this.idPromotion = idPromotion;
	}

	public Long getIdPromotion() {
		return idPromotion;
	}

	public void setIdPromotion(Long idPromotion) {
		this.idPromotion = idPromotion;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPercent() {
		return percent;
	}

	public void setPercent(float percent) {
		this.percent = percent;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Promotion [idPromotion=" + idPromotion + ", name=" + name + ", type=" + type + ", quantity=" + quantity
				+ ", percent=" + percent + ", products=" + products + "]";
	}


	
	

}
