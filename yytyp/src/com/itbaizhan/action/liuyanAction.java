package com.itbaizhan.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.itbaizhan.dao.TGoodsDAO;
import com.itbaizhan.dao.TLiuyanDAO;
import com.itbaizhan.model.TLiuyan;
import com.opensymphony.xwork2.ActionSupport;

public class liuyanAction extends ActionSupport
{
	private Integer id;
	private String xingming;
	private String zuzhi;
	private String dianhua;
	
	private String youxiang;
	private String neirong;
	private String shijian;

	
	private String message;
	private String path;
	
	private TLiuyanDAO liuyanDAO;
	
	public String liuyanAdd()
	{
		TLiuyan liuyan=new TLiuyan();
		
		//liuyan.setId(id);
		liuyan.setXingming(xingming);
		liuyan.setZuzhi(zuzhi);
		liuyan.setDianhua(dianhua);
		
		liuyan.setYouxiang(youxiang);
		liuyan.setNeirong(neirong);
		liuyan.setShijian(shijian);
		
		liuyanDAO.save(liuyan);
		this.setMessage("非常感激你提出的宝贵意见");
		this.setPath("site/liuyan/liuyanAdd.jsp");
		return "succeed";
	}
	
	public String liuyanMana()
	{
		String sql="from TLiuyan order by id desc";
		List liuyanList=liuyanDAO.getHibernateTemplate().find(sql);
		
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("liuyanList", liuyanList);
		return ActionSupport.SUCCESS;
	}
	
	public String liuyanDel()
	{
		TLiuyan liuyan=liuyanDAO.findById(id);
		liuyanDAO.delete(liuyan);
		
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("msg", "信息删除完毕");
		return "msg";
	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getXingming()
	{
		return xingming;
	}

	public void setXingming(String xingming)
	{
		this.xingming = xingming;
	}

	public String getZuzhi()
	{
		return zuzhi;
	}

	public void setZuzhi(String zuzhi)
	{
		this.zuzhi = zuzhi;
	}

	public String getDianhua()
	{
		return dianhua;
	}

	public void setDianhua(String dianhua)
	{
		this.dianhua = dianhua;
	}

	public String getYouxiang()
	{
		return youxiang;
	}

	public void setYouxiang(String youxiang)
	{
		this.youxiang = youxiang;
	}

	public String getNeirong()
	{
		return neirong;
	}

	public void setNeirong(String neirong)
	{
		this.neirong = neirong;
	}

	public String getShijian()
	{
		return shijian;
	}

	public void setShijian(String shijian)
	{
		this.shijian = shijian;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public String getPath()
	{
		return path;
	}

	public void setPath(String path)
	{
		this.path = path;
	}

	public TLiuyanDAO getLiuyanDAO()
	{
		return liuyanDAO;
	}

	public void setLiuyanDAO(TLiuyanDAO liuyanDAO)
	{
		this.liuyanDAO = liuyanDAO;
	}
	
}
