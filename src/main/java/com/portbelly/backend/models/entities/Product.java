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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Table(name="product")
@Entity
public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_product")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idProduct;
	
	@Column(name = "name", length=75)
	private String name;
	
	@Column(name = "image", length=200)
	private String image;
	
	@Column(name = "sizes", length=250)
	private String sizes;
	
	@Column(name = "characteristics", length=250)
	private String characteristics;
	
	@Column(name = "quantity", length=15)
	private int quantity;
	
	@Column(name = "price", precision=12, scale=2)
	private float price;
	
	@Column(name = "colors", length=250)
	private String colors;
	
	@Column(name="date_of_created")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Calendar dateOfCreated;
	
	//**Cardinalidad uno a varios 	//mappedBy apunta al nombre del atributo en la clase Subscription
	@OneToMany(mappedBy="product", fetch=FetchType.LAZY)
	private List<ProductInCart> productsInCart;

	@JoinColumn(name="fk_promotion", referencedColumnName="id_promotion")
	@ManyToOne
	private Promotion promotion;
	
	@JoinColumn(name="fk_category", referencedColumnName="id_category")
	@ManyToOne
	private Category category;
	
	public Product() {
		super();
	}

	public Product(Long idProduct) {
		super();
		this.idProduct = idProduct;
	}

	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getSizes() {
		return sizes;
	}

	public void setSizes(String sizes) {
		this.sizes = sizes;
	}

	public String getCharacteristics() {
		return characteristics;
	}

	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}

	public Calendar getDateOfCreated() {
		return dateOfCreated;
	}

	public void setDateOfCreated(Calendar dateOfCreated) {
		this.dateOfCreated = dateOfCreated;
	}

	public List<ProductInCart> getProductsInCart() {
		return productsInCart;
	}

	public void setProductsInCart(List<ProductInCart> productsInCart) {
		this.productsInCart = productsInCart;
	}

	public Promotion getPromotion() {
		return promotion;
	}

	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [idProduct=" + idProduct + ", name=" + name + ", image=" + image + ", sizes=" + sizes
				+ ", characteristics=" + characteristics + ", quantity=" + quantity + ", price=" + price + ", colors="
				+ colors + ", dateOfCreated=" + dateOfCreated + ", productsInCart=" + productsInCart + ", promotion="
				+ promotion + ", category=" + category + "]";
	}

	

	
}
