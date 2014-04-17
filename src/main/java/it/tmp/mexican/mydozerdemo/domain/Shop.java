/*
 * @(#)Shop.java        1.00	04/apr/2014
 *
 * Copyright (c) 2007-2013 Paybay Networks srl,
 * XX Settembre Road, Rome, Italy.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Paybay 
 * Networks srl, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Paybay Networks.
 */

package it.tmp.mexican.mydozerdemo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * La classe <code>Shop.java</code> &egrave;
 * 
 * @author Fabio Massimo Ercoli f.ercoli@k-tech.it
 * @version 1.00 04/apr/2014
 * 
 */

public class Shop implements GenericObject, Serializable {
	private static final long serialVersionUID = 7967085980540968665L;
	
	private String name;
	private String address;
	private String city;
	private String cap;
	private List<Contract> contracts = new ArrayList<Contract>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Contract> getContracts() {
		return contracts;
	}

	public void setContracts(List<Contract> contracts) {
		this.contracts = contracts;
	}

	public void add(Contract contract) {
		this.contracts.add(contract);
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}	
}