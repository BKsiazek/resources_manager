package com.barts.resourcesmanager.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Appointment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String description;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="client_id")
	private Client client;

	private Date appointmentDate;
	
	@OneToMany(mappedBy="appointment", cascade=CascadeType.ALL)
	private List<ProductForAppointment> usedProducts;
	
	protected Appointment() {
		
	}

	public Appointment(String description, Date appointmentDate) {
		super();
		this.description = description;
		this.appointmentDate = appointmentDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public List<ProductForAppointment> getUsedProducts() {
		return usedProducts;
	}

	public void setUsedProducts(List<ProductForAppointment> usedProducts) {
		this.usedProducts = usedProducts;
	}

	@Override
	public String toString() {
		return "Appointment [id=" + id + ", description=" + description + ", user=" + user + ", client=" + client
				+ ", appointmentDate=" + appointmentDate + "]";
	}
	
	public void addProductForAppointment(ProductForAppointment productForAppointment) {
		
		if(usedProducts == null)
			usedProducts = new ArrayList<ProductForAppointment>();
		
		usedProducts.add(productForAppointment);
		
		productForAppointment.setAppointment(this);
	}
}
