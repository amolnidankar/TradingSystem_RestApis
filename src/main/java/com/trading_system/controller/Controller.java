package com.trading_system.controller;

import java.time.temporal.IsoFields;
import java.util.List;
import java.util.Optional;

import org.aspectj.weaver.ast.Instanceof;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trading_system.dto.CustomerDto;
import com.trading_system.entities.Customer;
import com.trading_system.service.TradingCompanyService;
import com.trading_system.service.exception.ResourseNotFoundException;

import jakarta.validation.Valid;

@RestController

public class Controller {

	@Autowired
	private TradingCompanyService tradingCompanyService;


//	Creating A new User
	@PostMapping("/TradingCompany/create")
	public ResponseEntity<CustomerDto> addCustomer(@Valid @RequestBody CustomerDto customerDto) {

		CustomerDto c = this.tradingCompanyService.addCustomer(customerDto);
		return new ResponseEntity<>(c, HttpStatus.CREATED);

	}

//	Reading Specific Customer
	@GetMapping("/TradingCompany/{id}")
	public ResponseEntity<CustomerDto> getCustomer(@PathVariable String id) {

		CustomerDto c = this.tradingCompanyService.getCustomers(Long.parseLong(id));

		return new ResponseEntity<>(c, HttpStatus.OK);

	}

//	Reading the All Customers.
	@GetMapping("/TradingCompany")
	public ResponseEntity<List<CustomerDto>> getCustomers() {
		List<CustomerDto> c = tradingCompanyService.getCustomers();
			return new ResponseEntity<>(c, HttpStatus.OK);
			
		}
		
		

	

//	Updating the Customer  Details.

	@PutMapping("/TradingCompany/{id}")
	public ResponseEntity<CustomerDto> updateCustomer(@PathVariable long id ,@RequestBody CustomerDto obj) {

		CustomerDto c = tradingCompanyService.updateCustomer(id,obj);
		return new ResponseEntity<>(c, HttpStatus.CREATED);
	}

//	Deleting the Customers Details.
	@DeleteMapping("/TradingCompany/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable long id) {

		this.tradingCompanyService.deleteCustomer(id);
		String s = "You successfully Deleted Customer with id : "+ id;
		return new ResponseEntity<>(s, HttpStatus.ACCEPTED);
	}

}
