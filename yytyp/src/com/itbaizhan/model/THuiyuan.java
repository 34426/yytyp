package com.itbaizhan.model;

/**
 * THuiyuan entity. @author MyEclipse Persistence Tools
 */

public class THuiyuan implements java.io.Serializable
{
	private Integer id;
	private String loginname;
	private String loginpw;
	private String xingming;
	
	private String xingbie;
	private String nianling;
	private String address;
	private String dianhua;
	
	private String leixing;//普通会员--高级会员
	private String del;


	public Integer getId()
	{
		return this.id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getLoginname()
	{
		return this.loginname;
	}

	public void setLoginname(String loginname)
	{
		this.loginname = loginname;
	}

	public String getLoginpw()
	{
		return this.loginpw;
	}

	public void setLoginpw(String loginpw)
	{
		this.loginpw = loginpw;
	}

	public String getXingming()
	{
		return this.xingming;
	}

	public void setXingming(String xingming)
	{
		this.xingming = xingming;
	}

	public String getXingbie()
	{
		return this.xingbie;
	}

	public void setXingbie(String xingbie)
	{
		this.xingbie = xingbie;
	}

	public String getNianling()
	{
		return this.nianling;
	}

	public void setNianling(String nianling)
	{
		this.nianling = nianling;
	}

	public String getAddress()
	{
		return this.address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getDianhua()
	{
		return this.dianhua;
	}

	public void setDianhua(String dianhua)
	{
		this.dianhua = dianhua;
	}

	

	public String getLeixing()
	{
		return leixing;
	}

	public void setLeixing(String leixing)
	{
		this.leixing = leixing;
	}

	public String getDel()
	{
		return this.del;
	}

	public void setDel(String del)
	{
		this.del = del;
	}

}