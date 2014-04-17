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
import java.util.ArrayList;
import java.util.List;

/**
 * La classe <code>Merchant.java</code> &egrave;
 *
 * @author Fabio Massimo Ercoli	f.ercoli@k-tech.it
 * @version 1.00	04/apr/2014
 *
 */

public class Merchant implements GenericObject, Serializable {
	private static final long serialVersionUID = -4557359916768988437L;
	
	private String vat;
	private List<Shop> shops = new ArrayList<Shop>();

	public String getVat() {
		return vat;
	}

	public void setVat(String vat) {
		this.vat = vat;
	}

	public List<Shop> getShops() {
		return shops;
	}

	public void setShops(List<Shop> shops) {
		this.shops = shops;
	}

	public void add(Shop shop) {
		this.shops.add(shop);
	}	
}