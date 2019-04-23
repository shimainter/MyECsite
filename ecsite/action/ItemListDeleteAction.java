package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemListDeleteDAO;
import com.internousdev.ecsite.dto.ItemListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListDeleteAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;
	private ItemListDeleteDAO itemListDeleteDAO = new ItemListDeleteDAO();
	private ArrayList<ItemListDTO> itemList = new ArrayList<ItemListDTO>();
	private String deleteFlg;
	private String message;

	public String execute() throws SQLException {
		 
		if(deleteFlg.equals("1")) {
			delete();
		}
		String result = SUCCESS;
		return result;
	}

	public void delete() throws SQLException {
		
		int res = itemListDeleteDAO.getItemDeleteInfo();

		if (res > 0) {

			setMessage("商品情報を正しく削除しました。");
		} else if (res == 0) {
			setMessage("商品情報の削除に失敗しました。");
		}
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	public ArrayList<ItemListDTO> getItemList() {
		return this.itemList;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
