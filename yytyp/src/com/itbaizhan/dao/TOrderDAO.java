package com.itbaizhan.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.itbaizhan.model.TOrder;

/**
 * A data access object (DAO) providing persistence and search support for
 * TOrder entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.itbaizhan.model.TOrder
 * @author MyEclipse Persistence Tools
 */

public class TOrderDAO extends HibernateDaoSupport
{
	private static final Log log = LogFactory.getLog(TOrderDAO.class);
	// property constants
	public static final String BIANHAO = "bianhao";
	public static final String XIADANSHI = "xiadanshi";
	public static final String ZT = "zt";
	public static final String SONGHUODIZHI = "songhuodizhi";
	public static final String FUKUANFANGSHI = "fukuanfangshi";
	public static final String ZONGJIA = "zongjia";
	public static final String HUIYUAN_ID = "huiyuanId";

	protected void initDao()
	{
		// do nothing
	}

	public void save(TOrder transientInstance)
	{
		log.debug("saving TOrder instance");
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

	public void delete(TOrder persistentInstance)
	{
		log.debug("deleting TOrder instance");
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

	public TOrder findById(java.lang.Integer id)
	{
		log.debug("getting TOrder instance with id: " + id);
		try
		{
			TOrder instance = (TOrder) getHibernateTemplate().get(
					"com.itbaizhan.model.TOrder", id);
			return instance;
		} catch (RuntimeException re)
		{
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TOrder instance)
	{
		log.debug("finding TOrder instance by example");
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
		log.debug("finding TOrder instance with property: " + propertyName
				+ ", value: " + value);
		try
		{
			String queryString = "from TOrder as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re)
		{
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByBianhao(Object bianhao)
	{
		return findByProperty(BIANHAO, bianhao);
	}

	public List findByXiadanshi(Object xiadanshi)
	{
		return findByProperty(XIADANSHI, xiadanshi);
	}

	public List findByZt(Object zt)
	{
		return findByProperty(ZT, zt);
	}

	public List findBySonghuodizhi(Object songhuodizhi)
	{
		return findByProperty(SONGHUODIZHI, songhuodizhi);
	}

	public List findByFukuanfangshi(Object fukuanfangshi)
	{
		return findByProperty(FUKUANFANGSHI, fukuanfangshi);
	}

	public List findByZongjia(Object zongjia)
	{
		return findByProperty(ZONGJIA, zongjia);
	}

	public List findByHuiyuanId(Object huiyuanId)
	{
		return findByProperty(HUIYUAN_ID, huiyuanId);
	}

	public List findAll()
	{
		log.debug("finding all TOrder instances");
		try
		{
			String queryString = "from TOrder";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re)
		{
			log.error("find all failed", re);
			throw re;
		}
	}

	public TOrder merge(TOrder detachedInstance)
	{
		log.debug("merging TOrder instance");
		try
		{
			TOrder result = (TOrder) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TOrder instance)
	{
		log.debug("attaching dirty TOrder instance");
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

	public void attachClean(TOrder instance)
	{
		log.debug("attaching clean TOrder instance");
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

	public static TOrderDAO getFromApplicationContext(ApplicationContext ctx)
	{
		return (TOrderDAO) ctx.getBean("TOrderDAO");
	}
}