package com.example.war.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Invoice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int invoice_no;
	private String ship_add;
	private String prod_name;
	private double price;

	@Override
	public String toString() {
		return "Invoice{" +
				"invoice_no=" + invoice_no +
				", ship_add='" + ship_add + '\'' +
				", prod_name='" + prod_name + '\'' +
				", price=" + price +
				'}';
	}

	public int getInvoice_no() {
		return invoice_no;
	}

	public void setInvoice_no(int invoice_no) {
		this.invoice_no = invoice_no;
	}

	public String getShip_add() {
		return ship_add;
	}

	public void setShip_add(String ship_add) {
		this.ship_add = ship_add;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}

