package com.trading_system.dto;

import org.junit.runners.Parameterized.Parameter;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class CustomerDto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotBlank(message = "customer_name may not be blank")
	private String customer_name;
	
	@NotBlank(message = "Stock_name may not be blank")
	private String stock_name;
	
	@Min(value = 1, message = "At Least One Stock Is required  ")
	private long stock_quantity;
	
	@Min(value = 1, message = "Stock Price Should be more than 20rs ")
	private long stock_price;
	
	@Min(value = 1, message = "Please Enter the Valid Loss Price")
	private long loss_price;
	
	@Pattern(regexp = "^[0-9]{9,18}$" ,message="This is not valid Account Number")
	private String acc_number;
	
	@Pattern(regexp = "^[0-9]{9,18}$", message = "Please Enter the Valid Trading Account Number")
	private String trading_acc_number;

	@NotBlank(message = "Address Cannot Be Blank")
	private String customer_add;

	@Pattern(regexp = "[A-Z]{5}[0-9]{4}[A-Z]{1}")
	private String pan_card;

	@Pattern(regexp="[0-9]{12}",message = "Please Enter the Aadhar Number in Valid Format")
	private String aadhar_no;

	@NotBlank(message = "Note is Required")
	private String notes;
	
	@Pattern(regexp = "^[0-9]{10}$", message = "Please Enter the Valid Phone Number")
	private String phone_number;

	public CustomerDto() {
		// TODO Auto-generated constructor stub
		super();
	}

	public CustomerDto(long id,String customer_name, String stock_name, long stock_quantity, long stock_price, long loss_price,
			String acc_number, String trading_acc_number, String customer_add, String pan_card, String aadhar_no, String notes,
			String phone_number) {
		super();
		this.id=id;
		this.customer_name = customer_name;
		this.stock_name = stock_name;
		this.stock_quantity = stock_quantity;
		this.stock_price = stock_price;
		this.loss_price = loss_price;
		this.acc_number = acc_number;
		this.trading_acc_number = trading_acc_number;
		this.customer_add = customer_add;
		this.pan_card = pan_card;
		this.aadhar_no = aadhar_no;
		this.notes = notes;
		this.phone_number = phone_number;
	}

//	Getter and Setters for DTO.

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getStock_name() {
		return stock_name;
	}

	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}

	public long getStock_quantity() {
		return stock_quantity;
	}

	public void setStock_quantity(long stock_quantity) {
		this.stock_quantity = stock_quantity;
	}

	public long getStock_price() {
		return stock_price;
	}

	public void setStock_price(long stock_price) {
		this.stock_price = stock_price;
	}

	public long getLoss_price() {
		return loss_price;
	}

	public void setLoss_price(long loss_price) {
		this.loss_price = loss_price;
	}

	public String getAcc_number() {
		return acc_number;
	}

	public void setAcc_number(String acc_number) {
		this.acc_number = acc_number;
	}

	public String getTrading_acc_number() {
		return trading_acc_number;
	}

	public void setTrading_acc_number(String trading_acc_number) {
		this.trading_acc_number = trading_acc_number;
	}

	public String getCustomer_add() {
		return customer_add;
	}

	public void setCustomer_add(String customer_add) {
		this.customer_add = customer_add;
	}

	public String getPan_card() {
		return pan_card;
	}

	public void setPan_card(String pan_card) {
		this.pan_card = pan_card;
	}

	public String getAadhar_no() {
		return aadhar_no;
	}

	public void setAadhar_no(String aadhar_no) {
		this.aadhar_no = aadhar_no;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
}
