package com.cg.SpringOne.service;

public class Mobile {

	int mobId;
	String mobName;
	public int getMobId() {
		return mobId;
	}
	public void setMobId(int mobId) {
		this.mobId = mobId;
	}
	public String getMobName() {
		return mobName;
	}
	public void setMobName(String mobName) {
		this.mobName = mobName;
	}
	
	public void getAllDetail(){
		System.out.println(mobId+"  "+mobName);
	}
	
	
}
