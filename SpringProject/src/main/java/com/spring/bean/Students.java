package com.spring.bean;

public class Students {
	
    int id;
	String name;
	String coures;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCoures() {
		return coures;
	}
	public void setCoures(String coures) {
		this.coures = coures;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", coures=" + coures + "]";
	}
	

}
