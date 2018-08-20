package com.barts.resourcesmanager.entity;

import java.util.Date;
import java.util.List;

public class Appointment {
	
	private long id;
	private User user;
	private Client client;
	private Date appointmentDate;
	private List<Product> reservedProducts;
}
