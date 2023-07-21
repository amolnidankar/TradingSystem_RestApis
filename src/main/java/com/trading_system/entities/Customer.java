package com.trading_system.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id",nullable=false)
	private long id;
	
	@Column(name="customer_name",nullable=false)
	private String customer_name;
	
	@Column(name="stock_name",nullable=false)
	private String stock_name;
	
	@Column(name="stock_quantity",nullable=false)
	private long stock_quantity;
	
	@Column(name="stock_price",nullable=false)
	private long stock_price;
	
	@Column(name="loss_price",nullable=false)
	private long loss_price;
	
	@Column(name="acc_number",nullable=false)
	private String acc_number;
	
	@Column(name="trading_acc_number",nullable=false)
	private String trading_acc_number;
	
	@Column(name="customer_add",nullable=false)
	private String customer_add;
	
	@Column(name="pan_card",nullable=false)
	private String pan_card;
	
	@Column(name="aadhar_no",nullable=false)
	private String aadhar_no;
	
	@Column(name="notes",nullable=false)
	private String notes;
	
	@Column(name="phone_number",nullable=false)
	private String phone_number;
	
//	Default Constructor 
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	Parameterize Constructor
	public Customer(long id,String customer_name, String stock_name, long stock_quantity, long stock_price, long loss_price,
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
	
	
//	Getters and Setter 
	
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
	
//	To_string Method To Print the Value : 
	@Override
	public String toString() {
		return "Customer [customer_name=" + customer_name + ", stock_name=" + stock_name + ", stock_quantity="
				+ stock_quantity + ", stock_price=" + stock_price + ", loss_price=" + loss_price + ", acc_number="
				+ acc_number + ", trading_acc_number=" + trading_acc_number + ", customer_add=" + customer_add
				+ ", pan_card=" + pan_card + ", aadhar_no=" + aadhar_no + ", notes=" + notes + ", phone_number="
				+ phone_number + "]";
	}

	
	
	
}
