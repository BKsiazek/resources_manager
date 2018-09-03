package com.barts.resourcesmanager.commandlinerunner;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.barts.resourcesmanager.entity.Appointment;
import com.barts.resourcesmanager.entity.Client;
import com.barts.resourcesmanager.entity.Product;
import com.barts.resourcesmanager.entity.ProductForAppointment;
import com.barts.resourcesmanager.entity.User;
import com.barts.resourcesmanager.repository.AppointmentRepository;
import com.barts.resourcesmanager.repository.ClientRepository;
import com.barts.resourcesmanager.repository.UserRepository;

@Component
public class AppointmentCommandLineRunner implements CommandLineRunner{

	@Autowired
	private AppointmentRepository appointmentRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		//appointment
		Appointment appointment = new Appointment("First app", new Date());
		
		//products
		Product product1 = new Product("Product1", "Product1 DESC", 100, true);
		Product product2 = new Product("Product2", "Product2 DESC", 100, true);
		Product product3 = new Product("Product3", "Product3 DESC", 100, true);
		
		//products for appointment
		ProductForAppointment productForAppointment1 = new ProductForAppointment(5);
		productForAppointment1.setProduct(product1);
		
		ProductForAppointment productForAppointment2 = new ProductForAppointment(5);
		productForAppointment2.setProduct(product2);
		
		ProductForAppointment productForAppointment3 = new ProductForAppointment(5);
		productForAppointment3.setProduct(product3);
		
		//client
		Client client = new Client("ClientFName", "ClientLName");
		
		//user
		User user = new User("ROLE_USER", "barti", "BartiFN", "BartiLN", "bartibarti");
		
		appointment.addProductForAppointment(productForAppointment1);
		appointment.addProductForAppointment(productForAppointment2);
		appointment.addProductForAppointment(productForAppointment3);
		
		appointment.setClient(client);
		appointment.setUser(user);
		
		clientRepository.save(client);
		userRepository.save(user);
		appointmentRepository.save(appointment);
		
		System.out.println("Appointment created: " + appointment);
		
	}
}
