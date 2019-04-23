package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware {
	private ArrayList<ItemListDTO> itemList = new ArrayList<ItemListDTO>();
	private ItemListDAO itemListDAO = new ItemListDAO();
	public String userName;
	private Map<String, Object> session;
	private int count;
	private String pay;

	public String execute() throws SQLException{
		
		itemList = itemListDAO.getItemInfo();
		
		String result = SUCCESS;
		
		session.put("count", count);
		int intCount = Integer.parseInt(session.get("count").toString());
		int intPrice = Integer.parseInt(session.get("buyItem_price").toString());
		session.put("total_price", intCount * intPrice);
		String payment;
		if (pay.equals("1")) {
			payment = "現金払い";
			session.put("pay", payment);
		} else {
			payment = "クレジットカード";
			session.put("pay", payment);
		}
		return result;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	public ArrayList<ItemListDTO> getItemList() {
		return this.itemList;
	}

	public void setItemList(ArrayList<ItemListDTO> itemList) {
		this.itemList = itemList;
	}
}
