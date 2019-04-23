package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserListDeleteDAO;
import com.internousdev.ecsite.dto.UserListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListDeleteAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;
	private UserListDeleteDAO userListDeleteDAO = new UserListDeleteDAO();
	private ArrayList<UserListDTO> userList = new ArrayList<UserListDTO>();
	private String deleteFlg;
	private String message;

	public String execute() throws SQLException {

		if (deleteFlg.equals("1")) {
			delete();
		}
		String result = SUCCESS;
		return result;
	}

	public void delete() throws SQLException {

		int res = userListDeleteDAO.getUserDeleteInfo();

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

	public ArrayList<UserListDTO> getUserList() {
		return this.userList;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
