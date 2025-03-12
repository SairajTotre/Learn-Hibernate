package com.tak1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {
    
	@Id
	private int mobId;
	private String brandName;
	private double mobCost;
	public Mobile(int mobId, String brandName, double mobCost) {
		super();
		this.mobId = mobId;
		this.brandName = brandName;
		this.mobCost = mobCost;
	}
	public Mobile() {
		super();
	}
	
	public Mobile(int mobId) {
		super();
		this.mobId = mobId;
	}
	public int getMobId() {
		return mobId;
	}
	public void setMobId(int mobId) {
		this.mobId = mobId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public double getMobCost() {
		return mobCost;
	}
	public void setMobCost(double mobCost) {
		this.mobCost = mobCost;
	}
	@Override
	public String toString() {
		return "Mobile [mobId=" + mobId + ", brandName=" + brandName + ", mobCost=" + mobCost + "]";
	}
	
}
