package com.portbelly.backend.models.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="id_user")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idUser;
	
	@Column(name="user", length=30)
	private String user;
	
	@Column(name="password", length=30)
	private String password;

	@Column(name="rol",length=20)
	private String rol;
	
	@Column(name="email", length=100)
	private String email;
	
	//**Cardinalidad uno a varios 	//mappedBy apunta al nombre del atributo en la clase Subscription
	@OneToOne(mappedBy="user", fetch=FetchType.LAZY)
	private Client client;


	public User() {
		super();
	}

	public User(Long idUser) {
		super();
		this.idUser = idUser;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", user=" + user + ", password=" + password + ", rol=" + rol + ", email="
				+ email + ", client=" + client + "]";
	}

	

}
