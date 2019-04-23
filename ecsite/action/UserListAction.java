package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserListDAO;
import com.internousdev.ecsite.dto.UserListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListAction extends ActionSupport implements SessionAware {
	private ArrayList<UserListDTO> userList = new ArrayList<UserListDTO>();
	public Map<String, Object> session;
	private UserListDAO userListDAO = new UserListDAO();

	public String execute() throws SQLException {

		userList = userListDAO.getUserInfo();

		String result = SUCCESS;

		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
	}

	public ArrayList<UserListDTO> getUserList() {
		return this.userList;
	}

	public void setItemList(ArrayList<UserListDTO> userList) {
		this.userList = userList;
	}
}