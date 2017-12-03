package com.sonata.microprofile.sample.microprofilerestservice.rest;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SanghMember
 *
 */
@Entity
public class SanghMember implements Serializable {

	@Id @GeneratedValue
	private int id;
	private static final long serialVersionUID = 1L;

	public SanghMember() {
		super();
	}
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
