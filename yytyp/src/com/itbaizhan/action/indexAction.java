package com.itbaizhan.action;


import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.itbaizhan.dao.TLeibieDAO;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class indexAction extends ActionSupport
{
	private TLeibieDAO leibieDAO;
	

	public TLeibieDAO getLeibieDAO()
	{
		return leibieDAO;
	}


	public void setLeibieDAO(TLeibieDAO leibieDAO)
	{
		this.leibieDAO = leibieDAO;
	}


	public String index()
	{
		String sql="from TLeibie where Del='no'";
		List leibieList=leibieDAO.getHibernateTemplate().find(sql);
		
		Map session=ActionContext.getContext().getSession();
		session.put("leibieList", leibieList);
		return ActionSupport.SUCCESS;
	}

}
