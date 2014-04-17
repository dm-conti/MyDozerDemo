/*
 * @(#)Merchant.java        1.00	04/apr/2014
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

/**
 * La classe <code>Merchant.java</code> &egrave;
 *
 * @author Domenico Conti domenico.conti@quigroup.it
 * @version 1.00	14/apr/2014
 *
 */

public class Customer implements GenericObject, Serializable{
	private static final long serialVersionUID = -4973271278767910529L;
	
	private String name;
	
	private String lastName;
	
	private Address address;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}