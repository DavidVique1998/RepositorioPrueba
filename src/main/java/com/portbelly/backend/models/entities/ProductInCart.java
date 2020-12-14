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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


@Table(name="product_in_cart")
@Entity

public class ProductInCart implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id_product_in_cart")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idProductInCart;
	
	@Column(name = "state", length=1)
	private String state;
	
	@Column(name = "quantity", length=15)
	private int quantity;
	
	@Column(name = "size", length=10)
	private String size;
	
	@Column(name = "color", length=15)
	private String color;
	
	@Column(name="date_of_created")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Calendar dateOfCreated;
	
	@JoinColumn(name="fk_shopping_cart", referencedColumnName="id_shopping_cart")
	@ManyToOne
	private ShoppingCart shoppingCart;

	@JoinColumn(name="fk_product", referencedColumnName="id_product")
	@ManyToOne
	private Product product;
	
	public ProductInCart() {
		super();
	}

	public ProductInCart(Long idProductInCart) {
		super();
		this.idProductInCart = idProductInCart;
	}

	public Long getIdProductInCart() {
		return idProductInCart;
	}

	public void setIdProductInCart(Long idProductInCart) {
		this.idProductInCart = idProductInCart;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Calendar getDateOfCreated() {
		return dateOfCreated;
	}

	public void setDateOfCreated(Calendar dateOfCreated) {
		this.dateOfCreated = dateOfCreated;
	}

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "ProductInCart [idProductInCart=" + idProductInCart + ", state=" + state + ", quantity=" + quantity
				+ ", size=" + size + ", color=" + color + ", dateOfCreated=" + dateOfCreated + ", shoppingCart="
				+ shoppingCart + ", product=" + product + "]";
	}


	

}
