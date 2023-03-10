package com.trading_system.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CustomerDto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotBlank(message = "customer_name may not be blank")
	@Size(min = 4, message = "Customer Name Must have min 4 letters ")
	private String customer_name;
	@NotBlank(message = "Stock_name may not be blank")
	@Size(min = 3, message = "Stock Name Must have min 4 letters ")
	private String stock_name;
	@Min(value = 1, message = "At Least One Stock Is required  ")
	private long stock_quantity;
	@Min(value = 20, message = "Stock Price Should be more than 20rs ")
	private long stock_price;
	@Min(value = 1, message = "Please Enter the Valid Loss Price")
	private long loss_price;
	@Min(value = 1000000000, message = "Please Enter the Valid Account Number")
	private long acc_number;
	@Min(value = 1000000000, message = "Please Enter the Valid Trading Account Number")
	private long trading_acc_number;

	@Size(min = 15, message = "Address Should be of Minimum 15 Characters")
	@NotBlank(message = "Please Enter the Valid Address")
	private String customer_add;
	@Min(value = 1000000000, message = "Please Enter the Correct Pan Number")
	private long pan_card;
	@Min(value = 1000000000, message = "Please Enter the Correct Aadhar Number")
	private long aadhar_no;
	@NotBlank
	@NotBlank(message = "Note is Required")
	@Size(min = 5, message = "Note Should be of Minimum 5 Characters")
	private String notes;
	@Min(value = 1000000000, message = "Please Enter the Valid Phone Number")
	private long phone_number;

	public CustomerDto() {
		// TODO Auto-generated constructor stub
		super();
	}

	public CustomerDto(long id,String customer_name, String stock_name, long stock_quantity, long stock_price, long loss_price,
			long acc_number, long trading_acc_number, String customer_add, long pan_card, long aadhar_no, String notes,
			long phone_number) {
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

	public long getAcc_number() {
		return acc_number;
	}

	public void setAcc_number(long acc_number) {
		this.acc_number = acc_number;
	}

	public long getTrading_acc_number() {
		return trading_acc_number;
	}

	public void setTrading_acc_number(long trading_acc_number) {
		this.trading_acc_number = trading_acc_number;
	}

	public String getCustomer_add() {
		return customer_add;
	}

	public void setCustomer_add(String customer_add) {
		this.customer_add = customer_add;
	}

	public long getPan_card() {
		return pan_card;
	}

	public void setPan_card(long pan_card) {
		this.pan_card = pan_card;
	}

	public long getAadhar_no() {
		return aadhar_no;
	}

	public void setAadhar_no(long aadhar_no) {
		this.aadhar_no = aadhar_no;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
}
