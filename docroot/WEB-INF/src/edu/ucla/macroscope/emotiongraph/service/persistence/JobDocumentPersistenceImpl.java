/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package edu.ucla.macroscope.emotiongraph.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import edu.ucla.macroscope.emotiongraph.NoSuchJobDocumentException;
import edu.ucla.macroscope.emotiongraph.model.JobDocument;
import edu.ucla.macroscope.emotiongraph.model.impl.JobDocumentImpl;
import edu.ucla.macroscope.emotiongraph.model.impl.JobDocumentModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the job document service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author dave
 * @see JobDocumentPersistence
 * @see JobDocumentUtil
 * @generated
 */
public class JobDocumentPersistenceImpl extends BasePersistenceImpl<JobDocument>
	implements JobDocumentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link JobDocumentUtil} to access the job document persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = JobDocumentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(JobDocumentModelImpl.ENTITY_CACHE_ENABLED,
			JobDocumentModelImpl.FINDER_CACHE_ENABLED, JobDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(JobDocumentModelImpl.ENTITY_CACHE_ENABLED,
			JobDocumentModelImpl.FINDER_CACHE_ENABLED, JobDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(JobDocumentModelImpl.ENTITY_CACHE_ENABLED,
			JobDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public JobDocumentPersistenceImpl() {
		setModelClass(JobDocument.class);
	}

	/**
	 * Caches the job document in the entity cache if it is enabled.
	 *
	 * @param jobDocument the job document
	 */
	@Override
	public void cacheResult(JobDocument jobDocument) {
		EntityCacheUtil.putResult(JobDocumentModelImpl.ENTITY_CACHE_ENABLED,
			JobDocumentImpl.class, jobDocument.getPrimaryKey(), jobDocument);

		jobDocument.resetOriginalValues();
	}

	/**
	 * Caches the job documents in the entity cache if it is enabled.
	 *
	 * @param jobDocuments the job documents
	 */
	@Override
	public void cacheResult(List<JobDocument> jobDocuments) {
		for (JobDocument jobDocument : jobDocuments) {
			if (EntityCacheUtil.getResult(
						JobDocumentModelImpl.ENTITY_CACHE_ENABLED,
						JobDocumentImpl.class, jobDocument.getPrimaryKey()) == null) {
				cacheResult(jobDocument);
			}
			else {
				jobDocument.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all job documents.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(JobDocumentImpl.class.getName());
		}

		EntityCacheUtil.clearCache(JobDocumentImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the job document.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JobDocument jobDocument) {
		EntityCacheUtil.removeResult(JobDocumentModelImpl.ENTITY_CACHE_ENABLED,
			JobDocumentImpl.class, jobDocument.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<JobDocument> jobDocuments) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (JobDocument jobDocument : jobDocuments) {
			EntityCacheUtil.removeResult(JobDocumentModelImpl.ENTITY_CACHE_ENABLED,
				JobDocumentImpl.class, jobDocument.getPrimaryKey());
		}
	}

	/**
	 * Creates a new job document with the primary key. Does not add the job document to the database.
	 *
	 * @param jobDocumentId the primary key for the new job document
	 * @return the new job document
	 */
	@Override
	public JobDocument create(long jobDocumentId) {
		JobDocument jobDocument = new JobDocumentImpl();

		jobDocument.setNew(true);
		jobDocument.setPrimaryKey(jobDocumentId);

		return jobDocument;
	}

	/**
	 * Removes the job document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jobDocumentId the primary key of the job document
	 * @return the job document that was removed
	 * @throws edu.ucla.macroscope.emotiongraph.NoSuchJobDocumentException if a job document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobDocument remove(long jobDocumentId)
		throws NoSuchJobDocumentException, SystemException {
		return remove((Serializable)jobDocumentId);
	}

	/**
	 * Removes the job document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the job document
	 * @return the job document that was removed
	 * @throws edu.ucla.macroscope.emotiongraph.NoSuchJobDocumentException if a job document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobDocument remove(Serializable primaryKey)
		throws NoSuchJobDocumentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			JobDocument jobDocument = (JobDocument)session.get(JobDocumentImpl.class,
					primaryKey);

			if (jobDocument == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJobDocumentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(jobDocument);
		}
		catch (NoSuchJobDocumentException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected JobDocument removeImpl(JobDocument jobDocument)
		throws SystemException {
		jobDocument = toUnwrappedModel(jobDocument);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jobDocument)) {
				jobDocument = (JobDocument)session.get(JobDocumentImpl.class,
						jobDocument.getPrimaryKeyObj());
			}

			if (jobDocument != null) {
				session.delete(jobDocument);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (jobDocument != null) {
			clearCache(jobDocument);
		}

		return jobDocument;
	}

	@Override
	public JobDocument updateImpl(
		edu.ucla.macroscope.emotiongraph.model.JobDocument jobDocument)
		throws SystemException {
		jobDocument = toUnwrappedModel(jobDocument);

		boolean isNew = jobDocument.isNew();

		Session session = null;

		try {
			session = openSession();

			if (jobDocument.isNew()) {
				session.save(jobDocument);

				jobDocument.setNew(false);
			}
			else {
				session.merge(jobDocument);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(JobDocumentModelImpl.ENTITY_CACHE_ENABLED,
			JobDocumentImpl.class, jobDocument.getPrimaryKey(), jobDocument);

		return jobDocument;
	}

	protected JobDocument toUnwrappedModel(JobDocument jobDocument) {
		if (jobDocument instanceof JobDocumentImpl) {
			return jobDocument;
		}

		JobDocumentImpl jobDocumentImpl = new JobDocumentImpl();

		jobDocumentImpl.setNew(jobDocument.isNew());
		jobDocumentImpl.setPrimaryKey(jobDocument.getPrimaryKey());

		jobDocumentImpl.setJobDocumentId(jobDocument.getJobDocumentId());
		jobDocumentImpl.setJobId(jobDocument.getJobId());
		jobDocumentImpl.setDocumentId(jobDocument.getDocumentId());
		jobDocumentImpl.setGroupId(jobDocument.getGroupId());
		jobDocumentImpl.setCompanyId(jobDocument.getCompanyId());
		jobDocumentImpl.setUserId(jobDocument.getUserId());
		jobDocumentImpl.setUserName(jobDocument.getUserName());
		jobDocumentImpl.setCreateDate(jobDocument.getCreateDate());
		jobDocumentImpl.setModifiedDate(jobDocument.getModifiedDate());

		return jobDocumentImpl;
	}

	/**
	 * Returns the job document with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the job document
	 * @return the job document
	 * @throws edu.ucla.macroscope.emotiongraph.NoSuchJobDocumentException if a job document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobDocument findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJobDocumentException, SystemException {
		JobDocument jobDocument = fetchByPrimaryKey(primaryKey);

		if (jobDocument == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJobDocumentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return jobDocument;
	}

	/**
	 * Returns the job document with the primary key or throws a {@link edu.ucla.macroscope.emotiongraph.NoSuchJobDocumentException} if it could not be found.
	 *
	 * @param jobDocumentId the primary key of the job document
	 * @return the job document
	 * @throws edu.ucla.macroscope.emotiongraph.NoSuchJobDocumentException if a job document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobDocument findByPrimaryKey(long jobDocumentId)
		throws NoSuchJobDocumentException, SystemException {
		return findByPrimaryKey((Serializable)jobDocumentId);
	}

	/**
	 * Returns the job document with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the job document
	 * @return the job document, or <code>null</code> if a job document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobDocument fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		JobDocument jobDocument = (JobDocument)EntityCacheUtil.getResult(JobDocumentModelImpl.ENTITY_CACHE_ENABLED,
				JobDocumentImpl.class, primaryKey);

		if (jobDocument == _nullJobDocument) {
			return null;
		}

		if (jobDocument == null) {
			Session session = null;

			try {
				session = openSession();

				jobDocument = (JobDocument)session.get(JobDocumentImpl.class,
						primaryKey);

				if (jobDocument != null) {
					cacheResult(jobDocument);
				}
				else {
					EntityCacheUtil.putResult(JobDocumentModelImpl.ENTITY_CACHE_ENABLED,
						JobDocumentImpl.class, primaryKey, _nullJobDocument);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(JobDocumentModelImpl.ENTITY_CACHE_ENABLED,
					JobDocumentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return jobDocument;
	}

	/**
	 * Returns the job document with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jobDocumentId the primary key of the job document
	 * @return the job document, or <code>null</code> if a job document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobDocument fetchByPrimaryKey(long jobDocumentId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)jobDocumentId);
	}

	/**
	 * Returns all the job documents.
	 *
	 * @return the job documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobDocument> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the job documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.emotiongraph.model.impl.JobDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of job documents
	 * @param end the upper bound of the range of job documents (not inclusive)
	 * @return the range of job documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobDocument> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the job documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.emotiongraph.model.impl.JobDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of job documents
	 * @param end the upper bound of the range of job documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of job documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobDocument> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<JobDocument> list = (List<JobDocument>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_JOBDOCUMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_JOBDOCUMENT;

				if (pagination) {
					sql = sql.concat(JobDocumentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<JobDocument>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<JobDocument>(list);
				}
				else {
					list = (List<JobDocument>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the job documents from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (JobDocument jobDocument : findAll()) {
			remove(jobDocument);
		}
	}

	/**
	 * Returns the number of job documents.
	 *
	 * @return the number of job documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_JOBDOCUMENT);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the job document persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.edu.ucla.macroscope.emotiongraph.model.JobDocument")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<JobDocument>> listenersList = new ArrayList<ModelListener<JobDocument>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<JobDocument>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(JobDocumentImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_JOBDOCUMENT = "SELECT jobDocument FROM JobDocument jobDocument";
	private static final String _SQL_COUNT_JOBDOCUMENT = "SELECT COUNT(jobDocument) FROM JobDocument jobDocument";
	private static final String _ORDER_BY_ENTITY_ALIAS = "jobDocument.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No JobDocument exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(JobDocumentPersistenceImpl.class);
	private static JobDocument _nullJobDocument = new JobDocumentImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<JobDocument> toCacheModel() {
				return _nullJobDocumentCacheModel;
			}
		};

	private static CacheModel<JobDocument> _nullJobDocumentCacheModel = new CacheModel<JobDocument>() {
			@Override
			public JobDocument toEntityModel() {
				return _nullJobDocument;
			}
		};
}