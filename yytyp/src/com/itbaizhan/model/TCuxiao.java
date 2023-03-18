package com.itbaizhan.model;

/**
 * TCuxiao entity. @author MyEclipse Persistence Tools
 */

public class TCuxiao implements java.io.Serializable
{

	// Fields

	private Integer id;
	private String biaoti;
	private String neirong;
	private String fabushi;

	// Constructors

	/** default constructor */
	public TCuxiao()
	{
	}

	/** full constructor */
	public TCuxiao(String biaoti, String neirong, String fabushi)
	{
		this.biaoti = biaoti;
		this.neirong = neirong;
		this.fabushi = fabushi;
	}

	// Property accessors

	public Integer getId()
	{
		return this.id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getBiaoti()
	{
		return this.biaoti;
	}

	public void setBiaoti(String biaoti)
	{
		this.biaoti = biaoti;
	}

	public String getNeirong()
	{
		return this.neirong;
	}

	public void setNeirong(String neirong)
	{
		this.neirong = neirong;
	}

	public String getFabushi()
	{
		return this.fabushi;
	}

	public void setFabushi(String fabushi)
	{
		this.fabushi = fabushi;
	}

}