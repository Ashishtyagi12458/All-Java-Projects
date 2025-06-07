package com.mavanhar;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class children {
 @Id
 private int roll_no;
 private String name;
 private String city;
public children(int roll_no, String name, String city) {
	super();
	this.roll_no = roll_no;
	this.name = name;
	this.city = city;
}
public children() {
	super();
	// TODO Auto-generated constructor stub
}
public int getRoll_no() {
	return roll_no;
}
public void setRoll_no(int roll_no) {
	this.roll_no = roll_no;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.roll_no+" :"+this.name+" :"+this.city;
}
 
 
 
 
 
 
 
}
