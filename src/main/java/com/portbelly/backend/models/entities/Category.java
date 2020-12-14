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

@Table(name="category")
@Entity
public class Category implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_category")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idCategory;
	
	@Column(name = "area", length=30)
	private String area;
	
	@Column(name = "name", length=30)
	private String name;
	
	//**Cardinalidad uno a varios 	//mappedBy apunta al nombre del atributo en la clase shoppingCart
	@OneToMany(mappedBy="category", fetch=FetchType.LAZY)
	private List<Product> products;

	public Category() {
		super();
	}

	public Category(Long idCategory) {
		super();
		this.idCategory = idCategory;
	}

	public Long getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Category [idCategory=" + idCategory + ", area=" + area + ", name=" + name + ", products=" + products
				+ "]";
	}
	
	

}
