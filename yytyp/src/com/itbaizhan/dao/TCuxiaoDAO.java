package com.itbaizhan.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.itbaizhan.model.TCuxiao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TCuxiao entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.itbaizhan.model.TCuxiao
 * @author MyEclipse Persistence Tools
 */

public class TCuxiaoDAO extends HibernateDaoSupport
{
	private static final Log log = LogFactory.getLog(TCuxiaoDAO.class);
	// property constants
	public static final String BIAOTI = "biaoti";
	public static final String NEIRONG = "neirong";
	public static final String FABUSHI = "fabushi";

	protected void initDao()
	{
		// do nothing
	}

	public void save(TCuxiao transientInstance)
	{
		log.debug("saving TCuxiao instance");
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

	public void delete(TCuxiao persistentInstance)
	{
		log.debug("deleting TCuxiao instance");
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

	public TCuxiao findById(java.lang.Integer id)
	{
		log.debug("getting TCuxiao instance with id: " + id);
		try
		{
			TCuxiao instance = (TCuxiao) getHibernateTemplate().get(
					"com.itbaizhan.model.TCuxiao", id);
			return instance;
		} catch (RuntimeException re)
		{
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TCuxiao instance)
	{
		log.debug("finding TCuxiao instance by example");
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
		log.debug("finding TCuxiao instance with property: " + propertyName
				+ ", value: " + value);
		try
		{
			String queryString = "from TCuxiao as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re)
		{
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByBiaoti(Object biaoti)
	{
		return findByProperty(BIAOTI, biaoti);
	}

	public List findByNeirong(Object neirong)
	{
		return findByProperty(NEIRONG, neirong);
	}

	public List findByFabushi(Object fabushi)
	{
		return findByProperty(FABUSHI, fabushi);
	}

	public List findAll()
	{
		log.debug("finding all TCuxiao instances");
		try
		{
			String queryString = "from TCuxiao";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re)
		{
			log.error("find all failed", re);
			throw re;
		}
	}

	public TCuxiao merge(TCuxiao detachedInstance)
	{
		log.debug("merging TCuxiao instance");
		try
		{
			TCuxiao result = (TCuxiao) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TCuxiao instance)
	{
		log.debug("attaching dirty TCuxiao instance");
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

	public void attachClean(TCuxiao instance)
	{
		log.debug("attaching clean TCuxiao instance");
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

	public static TCuxiaoDAO getFromApplicationContext(ApplicationContext ctx)
	{
		return (TCuxiaoDAO) ctx.getBean("TCuxiaoDAO");
	}
}