package com.itbaizhan.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.itbaizhan.model.TLiuyan;

/**
 * A data access object (DAO) providing persistence and search support for
 * TLiuyan entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.itbaizhan.model.TLiuyan
 * @author MyEclipse Persistence Tools
 */

public class TLiuyanDAO extends HibernateDaoSupport
{
	private static final Log log = LogFactory.getLog(TLiuyanDAO.class);
	// property constants
	public static final String XINGMING = "xingming";
	public static final String ZUZHI = "zuzhi";
	public static final String DIANHUA = "dianhua";
	public static final String YOUXIANG = "youxiang";
	public static final String NEIRONG = "neirong";
	public static final String SHIJIAN = "shijian";

	protected void initDao()
	{
		// do nothing
	}

	public void save(TLiuyan transientInstance)
	{
		log.debug("saving TLiuyan instance");
		try
		{
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re)
		{
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TLiuyan persistentInstance)
	{
		log.debug("deleting TLiuyan instance");
		try
		{
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re)
		{
			log.error("delete failed", re);
			throw re;
		}
	}

	public TLiuyan findById(java.lang.Integer id)
	{
		log.debug("getting TLiuyan instance with id: " + id);
		try
		{
			TLiuyan instance = (TLiuyan) getHibernateTemplate().get(
					"com.itbaizhan.model.TLiuyan", id);
			return instance;
		} catch (RuntimeException re)
		{
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TLiuyan instance)
	{
		log.debug("finding TLiuyan instance by example");
		try
		{
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value)
	{
		log.debug("finding TLiuyan instance with property: " + propertyName
				+ ", value: " + value);
		try
		{
			String queryString = "from TLiuyan as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re)
		{
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByXingming(Object xingming)
	{
		return findByProperty(XINGMING, xingming);
	}

	public List findByZuzhi(Object zuzhi)
	{
		return findByProperty(ZUZHI, zuzhi);
	}

	public List findByDianhua(Object dianhua)
	{
		return findByProperty(DIANHUA, dianhua);
	}

	public List findByYouxiang(Object youxiang)
	{
		return findByProperty(YOUXIANG, youxiang);
	}

	public List findByNeirong(Object neirong)
	{
		return findByProperty(NEIRONG, neirong);
	}

	public List findByShijian(Object shijian)
	{
		return findByProperty(SHIJIAN, shijian);
	}

	public List findAll()
	{
		log.debug("finding all TLiuyan instances");
		try
		{
			String queryString = "from TLiuyan";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re)
		{
			log.error("find all failed", re);
			throw re;
		}
	}

	public TLiuyan merge(TLiuyan detachedInstance)
	{
		log.debug("merging TLiuyan instance");
		try
		{
			TLiuyan result = (TLiuyan) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TLiuyan instance)
	{
		log.debug("attaching dirty TLiuyan instance");
		try
		{
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re)
		{
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TLiuyan instance)
	{
		log.debug("attaching clean TLiuyan instance");
		try
		{
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re)
		{
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TLiuyanDAO getFromApplicationContext(ApplicationContext ctx)
	{
		return (TLiuyanDAO) ctx.getBean("TLiuyanDAO");
	}
}