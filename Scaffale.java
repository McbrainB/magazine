package com.example.magazine.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Scaffale {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String scarpe;
	private String borse ;
	private String giacchetti;
	private String cinture;
	private String accessori;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getScarpe() {
		return scarpe;
	}
	public void setScarpe(String scarpe) {
		this.scarpe = scarpe;
	}
	public String getBorse() {
		return borse;
	}
	public void setBorse(String borse) {
		this.borse = borse;
	}
	public String getGiacchetti() {
		return giacchetti;
	}
	public void setGiacchetti(String giacchetti) {
		this.giacchetti = giacchetti;
	}
	public String getCinture() {
		return cinture;
	}
	public void setCinture(String cinture) {
		this.cinture = cinture;
	}
	public String getAccessori() {
		return accessori;
	}
	public void setAccessori(String accessori) {
		this.accessori = accessori;
	}
	
	
	

}
