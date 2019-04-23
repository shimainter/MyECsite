package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemSelectAction extends ActionSupport implements SessionAware {

	private ArrayList<ItemListDTO> itemList = new ArrayList<ItemListDTO>();
	public Map<String, Object> session;
	private ItemListDAO itemListDAO = new ItemListDAO();
	private int count;
	private String pay;
	private String errorMessage;
	private String checkbox;
	
	

	public String execute() throws SQLException {

		itemList = itemListDAO.getItemInfo();
			
		// 個数*料金=合計

//		session.put("total_price", intCount * intPrice);
		// 選択しない場合
		if (checkbox == null) {
			errorMessage = "商品が選択されていません。";
			
			itemList = itemListDAO.getItemInfo();
			return ERROR;
		}

		// 支払い方法
		String payment;
		if (pay.equals("1")) {
			payment = "現金払い";
			session.put("pay", payment);
		} else {
			payment = "クレジットカード";
			session.put("pay", payment);
		}
		String result = SUCCESS;

		return result;
	
	}
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public ArrayList<ItemListDTO> getItemList() {
		return this.itemList;
	}

	public void setItemList(ArrayList<ItemListDTO> itemList) {
		this.itemList = itemList;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}