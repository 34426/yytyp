package com.itbaizhan.model;

/**
 * TLiuyan entity. @author MyEclipse Persistence Tools
 */

public class TLiuyan implements java.io.Serializable
{

	// Fields

	private Integer id;
	private String xingming;
	private String zuzhi;
	private String dianhua;
	
	private String youxiang;
	private String neirong;
	private String shijian;

	// Constructors

	/** default constructor */
	public TLiuyan()
	{
	}

	/** full constructor */
	public TLiuyan(String xingming, String zuzhi, String dianhua,
			String youxiang, String neirong, String shijian)
	{
		this.xingming = xingming;
		this.zuzhi = zuzhi;
		this.dianhua = dianhua;
		this.youxiang = youxiang;
		this.neirong = neirong;
		this.shijian = shijian;
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

	public String getXingming()
	{
		return this.xingming;
	}

	public void setXingming(String xingming)
	{
		this.xingming = xingming;
	}

	public String getZuzhi()
	{
		return this.zuzhi;
	}

	public void setZuzhi(String zuzhi)
	{
		this.zuzhi = zuzhi;
	}

	public String getDianhua()
	{
		return this.dianhua;
	}

	public void setDianhua(String dianhua)
	{
		this.dianhua = dianhua;
	}

	public String getYouxiang()
	{
		return this.youxiang;
	}

	public void setYouxiang(String youxiang)
	{
		this.youxiang = youxiang;
	}

	public String getNeirong()
	{
		return this.neirong;
	}

	public void setNeirong(String neirong)
	{
		this.neirong = neirong;
	}

	public String getShijian()
	{
		return this.shijian;
	}

	public void setShijian(String shijian)
	{
		this.shijian = shijian;
	}

}