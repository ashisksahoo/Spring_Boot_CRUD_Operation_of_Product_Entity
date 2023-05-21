package com.techpalle;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String pname;
	private String batchno;
	private double price;
	private int noofproduct;
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getPname() 
	{
		return pname;
	}
	public void setPname(String pname) 
	{
		this.pname = pname;
	}
	public String getBatchno() 
	{
		return batchno;
	}
	public void setBatchno(String batchno) 
	{
		this.batchno = batchno;
	}
	public double getPrice() 
	{
		return price;
	}
	public void setPrice(double price) 
	{
		this.price = price;
	}
	public int getNoofproduct() 
	{
		return noofproduct;
	}
	public void setNoofproduct(int noofproduct) 
	{
		this.noofproduct = noofproduct;
	}
	
	public Product() 
	{
		super();
	}
	
	public Product(String pname, String batchno, double price, int noofproduct) 
	{
		super();
		this.pname = pname;
		this.batchno = batchno;
		this.price = price;
		this.noofproduct = noofproduct;
	}
	
	public Product(int id, String pname, String batchno, double price, int noofproduct) 
	{
		super();
		this.id = id;
		this.pname = pname;
		this.batchno = batchno;
		this.price = price;
		this.noofproduct = noofproduct;
	}
	
	@Override
	public String toString() 
	{
		return "Product [id=" + id + ", pname=" + pname + ", batchno=" + batchno + ", price=" + price + ", noofproduct="
				+ noofproduct + "]";
	}
	
	@Override
	public int hashCode() 
	{
		return Objects.hash(batchno, id, noofproduct, pname, price);
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(batchno, other.batchno) && id == other.id && noofproduct == other.noofproduct
				&& Objects.equals(pname, other.pname)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
}
