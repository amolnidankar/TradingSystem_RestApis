package com.trading_system.service;

import java.lang.module.ResolutionException;
//import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.trading_system.dao.CustomerDao;
import com.trading_system.dto.CustomerDto;
import com.trading_system.entities.Customer;
import com.trading_system.service.exception.ResourseNotFoundException;

@Service
public class TradingCompanyServiceImpl implements TradingCompanyService {

	@Autowired
	private CustomerDao customerDao;

	@Autowired
	public ModelMapper modleMapper;

	public TradingCompanyServiceImpl() {
	}

//	Get List of all the Customers
	@Override
	public List<CustomerDto> getCustomers() {
		
		List<Customer> customers = customerDao.findAll();
		boolean b =customers.isEmpty();
		if(b==true) {
			System.out.println("The Given List is Empty :::::::::"+b);
			throw new ResourseNotFoundException("Currently No Customer is there in the database  : Please add a customer in database");  
		}else{
			List<CustomerDto> customerDto = customers.stream().map(customer -> this.CustomerTodto(customer)).collect(Collectors.toList());
			return customerDto;
		}
		

	}

//	Get list of Customer With Specific ID
	@Override
	public CustomerDto getCustomers(long id) {
		Customer customer = customerDao.findById(id).orElseThrow(() -> new ResourseNotFoundException("Customer", "ID", id));
		CustomerDto customerDto = this.CustomerTodto(customer);
		return customerDto;
	}

//	Adding a Customer into database
	@Override
	public CustomerDto addCustomer(CustomerDto customerDto) {

		Customer customer = this.dtoToCustomer(customerDto);
		customerDao.save(customer);
		return this.CustomerTodto(customer);
	}

//	Update the Customer
	@Override
	public CustomerDto updateCustomer(long id,CustomerDto customerDto) {
		
		
			Customer c1=customerDao.findById(id).orElseThrow(()-> new ResourseNotFoundException("Not Customer is there with this ID"));
			System.out.println("The Id Found in the DataBase : "+ c1.getId());
			Customer customer = dtoToCustomer(customerDto);
			Customer c = customerDao.save(customer);
			return this.CustomerTodto(c);
	}

//	Delete the Customer From DataBase
	@Override
	public void deleteCustomer(long id) {
		Customer customer = this.customerDao.findById(id)
				.orElseThrow(() -> new ResourseNotFoundException("Customer", "ID", id));
		this.customerDao.delete(customer);

	}

//	Moddle Mapper Class

	public Customer dtoToCustomer(CustomerDto customerDto) {
		Customer customer = this.modleMapper.map(customerDto, Customer.class);
		return customer;
	}

	public CustomerDto CustomerTodto(Customer customer) {
		CustomerDto customerDto = this.modleMapper.map(customer, CustomerDto.class);
		return customerDto;
	}

}
