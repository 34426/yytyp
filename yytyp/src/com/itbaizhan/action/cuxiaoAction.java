package com.itbaizhan.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.itbaizhan.dao.TCuxiaoDAO;
import com.itbaizhan.dao.TGoodsDAO;
import com.itbaizhan.model.TCuxiao;
import com.opensymphony.xwork2.ActionSupport;

public class cuxiaoAction extends ActionSupport
{
	private Integer id;
	private String biaoti;
	private String neirong;
	private String fabushi;
	
	private TCuxiaoDAO cuxiaoDAO;
	
	public String cuxiaoAdd()
	{
		TCuxiao cuxiao=new TCuxiao();
		
		cuxiao.setBiaoti(biaoti);
		cuxiao.setNeirong(neirong);
		cuxiao.setFabushi(fabushi);
		
		cuxiaoDAO.save(cuxiao);
		
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("msg", "信息添加完毕");
		return "msg";
	}
	
	public String cuxiaoMana()
	{
		String sql="from TCuxiao";
		List cuxiaoList=cuxiaoDAO.getHibernateTemplate().find(sql);
		
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("cuxiaoList", cuxiaoList);
		return ActionSupport.SUCCESS;
	}
	
	public String cuxiaoDel()
	{
		TCuxiao cuxiao=cuxiaoDAO.findById(id);
		cuxiaoDAO.delete(cuxiao);
		
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("msg", "信息删除完毕");
		return "msg";
	}
	
	
	
	public String cuxiaoAll()
	{
		String sql="from TCuxiao";
		List cuxiaoList=cuxiaoDAO.getHibernateTemplate().find(sql);
		
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("cuxiaoList", cuxiaoList);
		return ActionSupport.SUCCESS;
	}
	
	public String cuxiaoDetailQian()
	{
		TCuxiao cuxiao=cuxiaoDAO.findById(id);
		
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("cuxiao", cuxiao);
		return ActionSupport.SUCCESS;
	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getBiaoti()
	{
		return biaoti;
	}

	public void setBiaoti(String biaoti)
	{
		this.biaoti = biaoti;
	}

	public String getNeirong()
	{
		return neirong;
	}

	public void setNeirong(String neirong)
	{
		this.neirong = neirong;
	}

	public String getFabushi()
	{
		return fabushi;
	}

	public void setFabushi(String fabushi)
	{
		this.fabushi = fabushi;
	}

	public TCuxiaoDAO getCuxiaoDAO()
	{
		return cuxiaoDAO;
	}

	public void setCuxiaoDAO(TCuxiaoDAO cuxiaoDAO)
	{
		this.cuxiaoDAO = cuxiaoDAO;
	}
	
}
