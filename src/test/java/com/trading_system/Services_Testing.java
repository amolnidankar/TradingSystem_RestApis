package com.trading_system;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.glassfish.jaxb.runtime.v2.schemagen.xmlschema.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.trading_system.dao.CustomerDao;
import com.trading_system.dto.CustomerDto;
import com.trading_system.entities.Customer;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class Services_Testing {
	
	
	@Autowired
	@Mock
	private CustomerDao customerDao;
	private ModelMapper modelMapper = new ModelMapper();

	Customer c = new Customer(1, "Swami", "Tata", 100, 500, 50, 1234567891, 1234567891,
			"Amrut-Ganga Building,Near MG Road,Flat no 16,8th Floor,Pune-411041", 1234567891, 1234567891,
			"Average Share", 1234567891);	

	//Creating the Customer 
	@Test
	public void test_save_Customer() {

		customerDao.save(c);
		assertNotNull(c);
//		Assertions.assertThat(c.getId()).isEqualTo(0);
	}

//	Reading The Customer By Id
	@Test
	public void test_find_by_id() {
		long id = 1;
		Customer customer = customerDao.findById(id).get();
		assertThat(customer.getId()).isEqualTo(id);
	}

//Updating the Customer  
	@Test
	public void test_update_customer() {
		Customer c2 = new Customer(1, "Test", "Cognizant", 100, 500, 50, 1234567891, 1234567891,
				"Amrut-Ganga Building,Near MG Road,Flat no 16,8th Floor,Pune-411041", 1234567891, 1234567891,
				"Average Share", 1134567891);
		String s = "Cognizant";
		Customer updated_customer = customerDao.save(c2);
		String name = updated_customer.getStock_name();
		assertEquals(name, s);

	}
	
//	Deleting A Customer From DataBase
	@Test
	public void test_Delete_Customer() {
		
		long id = 1;
		
		boolean b1 = customerDao.findById(id).isPresent();
		customerDao.deleteById(id);
		boolean b2 = customerDao.findById(id).isPresent();
		assertEquals(false, b2);
		
		
	}
	
//	Converting Customer to DTO object
	@Test
	public void test_CustomerTodto() {

		Customer c = new Customer();
		c.setId(1234);
		c.setCustomer_name("AMOL");
		c.setStock_name("Tata");
		c.setStock_quantity(1);
		c.setStock_price(20);
		c.setLoss_price(100);
		c.setAcc_number(1234567891);
		c.setTrading_acc_number(1234567891);
		c.setCustomer_add("Amrut-Ganga Building,Near MG Road,Flat no 16,8th Floor,Pune-411041");
		c.setPan_card(1234567891);
		c.setAadhar_no(1234567891);
		c.setNotes("Average Share");
		c.setPhone_number(1234567891);

		CustomerDto cDto = modelMapper.map(c, CustomerDto.class);
		assertEquals(c.getId(), cDto.getId());
	}
	
	
//	Converting DTO to Customer Object
	@Test
	public void test_dtoToCustomer() {

		CustomerDto c = new CustomerDto();
		c.setId(1234);
		c.setCustomer_name("AMOL");
		c.setStock_name("Tata");
		c.setStock_quantity(1);
		c.setStock_price(20);
		c.setLoss_price(100);
		c.setAcc_number(1234567891);
		c.setTrading_acc_number(1234567891);
		c.setCustomer_add("Amrut-Ganga Building,Near MG Road,Flat no 16,8th Floor,Pune-411041");
		c.setPan_card(1234567891);
		c.setAadhar_no(1234567891);
		c.setNotes("Average Share");
		c.setPhone_number(1234567891);

		Customer customer = modelMapper.map(c, Customer.class);
		assertEquals(customer.getId(),c.getId() );
	}
}
