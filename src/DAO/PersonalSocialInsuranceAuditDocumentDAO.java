package DAO;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import bean.PersonalSocialInsuranceAuditDocument;

/**
 * A data access object (DAO) providing persistence and search support for
 * PersonalSocialInsuranceAuditDocument entities. Transaction control of the
 * save(), update() and delete() operations can directly support Spring
 * container-managed transactions or they can be augmented to handle
 * user-managed Spring transactions. Each of these methods provides additional
 * information for how to configure it for the desired type of transaction
 * control.
 * 
 * @see bean.PersonalSocialInsuranceAuditDocument
 * @author MyEclipse Persistence Tools
 */

public class PersonalSocialInsuranceAuditDocumentDAO extends
		HibernateDaoSupport {
	private static final Log log = LogFactory
			.getLog(PersonalSocialInsuranceAuditDocumentDAO.class);
	// property constants
	public static final String SOCIAL_INSURANCE_NUMBER = "socialInsuranceNumber";
	public static final String NAME = "name";
	public static final String IDENTIFY_CARD_ID = "identifyCardId";
	public static final String DOCUMENT_NAME = "documentName";
	public static final String PHYSICS_ADRESS = "physicsAdress";
	public static final String RETENTION_PERIOD = "retentionPeriod";
	public static final String TIME = "time";
	public static final String ZONE = "zone";
	public static final String SEQUENCE_NUMBER = "sequenceNumber";
	public static final String FILE_NUMBER = "fileNumber";
	public static final String AUTHOR = "author";
	public static final String TITLE = "title";
	public static final String PAGE_NUMBER = "pageNumber";
	public static final String COMMENTS = "comments";

	protected void initDao() {
		// do nothing
	}

	public void save(PersonalSocialInsuranceAuditDocument transientInstance) {
		log.debug("saving PersonalSocialInsuranceAuditDocument instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PersonalSocialInsuranceAuditDocument persistentInstance) {
		log.debug("deleting PersonalSocialInsuranceAuditDocument instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PersonalSocialInsuranceAuditDocument findById(java.lang.Integer id) {
		log.debug("getting PersonalSocialInsuranceAuditDocument instance with id: "
				+ id);
		try {
			PersonalSocialInsuranceAuditDocument instance = (PersonalSocialInsuranceAuditDocument) getHibernateTemplate()
					.get("bean.PersonalSocialInsuranceAuditDocument", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PersonalSocialInsuranceAuditDocument instance) {
		log.debug("finding PersonalSocialInsuranceAuditDocument instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding PersonalSocialInsuranceAuditDocument instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from PersonalSocialInsuranceAuditDocument as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySocialInsuranceNumber(Object socialInsuranceNumber) {
		return findByProperty(SOCIAL_INSURANCE_NUMBER, socialInsuranceNumber);
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByIdentifyCardId(Object identifyCardId) {
		return findByProperty(IDENTIFY_CARD_ID, identifyCardId);
	}

	public List findByDocumentName(Object documentName) {
		return findByProperty(DOCUMENT_NAME, documentName);
	}

	public List findByPhysicsAdress(Object physicsAdress) {
		return findByProperty(PHYSICS_ADRESS, physicsAdress);
	}

	public List findByRetentionPeriod(Object retentionPeriod) {
		return findByProperty(RETENTION_PERIOD, retentionPeriod);
	}

	public List findByTime(Object time) {
		return findByProperty(TIME, time);
	}

	public List findByZone(Object zone) {
		return findByProperty(ZONE, zone);
	}

	public List findBySequenceNumber(Object sequenceNumber) {
		return findByProperty(SEQUENCE_NUMBER, sequenceNumber);
	}

	public List findByFileNumber(Object fileNumber) {
		return findByProperty(FILE_NUMBER, fileNumber);
	}

	public List findByAuthor(Object author) {
		return findByProperty(AUTHOR, author);
	}

	public List findByTitle(Object title) {
		return findByProperty(TITLE, title);
	}

	public List findByPageNumber(Object pageNumber) {
		return findByProperty(PAGE_NUMBER, pageNumber);
	}

	public List findByComments(Object comments) {
		return findByProperty(COMMENTS, comments);
	}

	public List findAll() {
		log.debug("finding all PersonalSocialInsuranceAuditDocument instances");
		try {
			String queryString = "from PersonalSocialInsuranceAuditDocument";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PersonalSocialInsuranceAuditDocument merge(
			PersonalSocialInsuranceAuditDocument detachedInstance) {
		log.debug("merging PersonalSocialInsuranceAuditDocument instance");
		try {
			PersonalSocialInsuranceAuditDocument result = (PersonalSocialInsuranceAuditDocument) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PersonalSocialInsuranceAuditDocument instance) {
		log.debug("attaching dirty PersonalSocialInsuranceAuditDocument instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PersonalSocialInsuranceAuditDocument instance) {
		log.debug("attaching clean PersonalSocialInsuranceAuditDocument instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PersonalSocialInsuranceAuditDocumentDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (PersonalSocialInsuranceAuditDocumentDAO) ctx
				.getBean("PersonalSocialInsuranceAuditDocumentDAO");
	}
}