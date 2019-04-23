package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

//import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dao.ItemListDAO;
//import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.dto.ItemListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware {
	private ArrayList<ItemListDTO> itemList = new ArrayList<ItemListDTO>();
	public Map<String, Object> session;
	private ItemListDAO itemListDAO = new ItemListDAO();

	public String execute() throws SQLException {

		String result = "login";
		
		itemList = itemListDAO.getItemInfo();
		
		if (session.containsKey("id")) {

			result = SUCCESS;

		}
		return result;
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
