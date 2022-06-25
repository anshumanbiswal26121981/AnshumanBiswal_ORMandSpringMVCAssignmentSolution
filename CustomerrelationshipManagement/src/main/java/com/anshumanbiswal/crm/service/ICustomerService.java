package com.anshumanbiswal.crm.service;

import java.util.List;

import com.anshumanbiswal.crm.entity.Customer;

public interface ICustomerService {

	 List<Customer> getCustomers();

	 void saveCustomer(Customer theCustomer);

	 Customer getCustomer(int theId);

	 void deleteCustomer(int theId);
	
}
