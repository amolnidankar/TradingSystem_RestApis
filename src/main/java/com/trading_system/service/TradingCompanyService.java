package com.trading_system.service;

import java.util.List;
import java.util.Optional;

import com.trading_system.dto.CustomerDto;
import com.trading_system.entities.Customer;

public interface TradingCompanyService {
	public List<CustomerDto> getCustomers();

	public CustomerDto getCustomers(long id);

	public CustomerDto addCustomer(CustomerDto customerDto);

	public CustomerDto updateCustomer(CustomerDto customerDto);
	
	public void deleteCustomer(long id);
}
