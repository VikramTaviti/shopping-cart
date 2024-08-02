package com.shashi.beans;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CartBean implements Serializable {

	public CartBean() {
	}

	public String userId;

	public String prodId;

	public Stgring prodName;

	public int quantity;

	public String getUserId() {
		return userId;
	}

	public String getProdName() {
		return this.prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public CartBean(String userId, String prodId, Stgring prodName, int quantity) {
		this.userId = userId;
		this.prodId = prodId;
		this.prodName = prodName;
		this.quantity = quantity;
	}

}
