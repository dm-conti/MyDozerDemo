/*
 * @(#)Contract.java        1.00	04/apr/2014
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
 * La classe <code>Contract.java</code> &egrave;
 * 
 * @author Fabio Massimo Ercoli f.ercoli@k-tech.it
 * @version 1.00 04/apr/2014
 * 
 */

public class Contract implements GenericObject, Serializable {
	private static final long serialVersionUID = -5268644507093242867L;
	
	private String code;
	private Integer number;
	
	public Contract(String _code, Integer _number){
		code = _code;
		number = _number;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
}