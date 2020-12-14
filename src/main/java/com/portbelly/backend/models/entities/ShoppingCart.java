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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="shopping_cart")
@Entity

public class ShoppingCart implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_shopping_cart")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idShoppingCart;
	
	@Column(name = "tipo", length=15)
	private String tipo;
	
	//**Cardinalidad uno a varios 	//mappedBy apunta al nombre del atributo en la clase Subscription
	@OneToMany(mappedBy="shoppingCart", fetch=FetchType.LAZY)
	private List<ProductInCart> productsInCart;
	
	@JoinColumn(name="fk_client", referencedColumnName="id_client")
	@ManyToOne
	private Client client;

	public ShoppingCart() {
		super();
	}

	public ShoppingCart(Long idShoppingCart) {
		super();
		this.idShoppingCart = idShoppingCart;
	}

	public Long getIdShoppingCart() {
		return idShoppingCart;
	}

	public void setIdShoppingCart(Long idShoppingCart) {
		this.idShoppingCart = idShoppingCart;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public List<ProductInCart> getProductsInCart() {
		return productsInCart;
	}

	public void setProductsInCart(List<ProductInCart> productsInCart) {
		this.productsInCart = productsInCart;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "ShoppingCart [idShoppingCart=" + idShoppingCart + ", tipo=" + tipo + ", productsInCart="
				+ productsInCart + ", client=" + client + "]";
	}



}
