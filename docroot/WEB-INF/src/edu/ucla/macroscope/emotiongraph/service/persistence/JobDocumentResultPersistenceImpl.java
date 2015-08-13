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

import edu.ucla.macroscope.emotiongraph.NoSuchJobDocumentResultException;
import edu.ucla.macroscope.emotiongraph.model.JobDocumentResult;
import edu.ucla.macroscope.emotiongraph.model.impl.JobDocumentResultImpl;
import edu.ucla.macroscope.emotiongraph.model.impl.JobDocumentResultModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the job document result service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author dave
 * @see JobDocumentResultPersistence
 * @see JobDocumentResultUtil
 * @generated
 */
public class JobDocumentResultPersistenceImpl extends BasePersistenceImpl<JobDocumentResult>
	implements JobDocumentResultPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link JobDocumentResultUtil} to access the job document result persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = JobDocumentResultImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(JobDocumentResultModelImpl.ENTITY_CACHE_ENABLED,
			JobDocumentResultModelImpl.FINDER_CACHE_ENABLED,
			JobDocumentResultImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(JobDocumentResultModelImpl.ENTITY_CACHE_ENABLED,
			JobDocumentResultModelImpl.FINDER_CACHE_ENABLED,
			JobDocumentResultImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(JobDocumentResultModelImpl.ENTITY_CACHE_ENABLED,
			JobDocumentResultModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public JobDocumentResultPersistenceImpl() {
		setModelClass(JobDocumentResult.class);
	}

	/**
	 * Caches the job document result in the entity cache if it is enabled.
	 *
	 * @param jobDocumentResult the job document result
	 */
	@Override
	public void cacheResult(JobDocumentResult jobDocumentResult) {
		EntityCacheUtil.putResult(JobDocumentResultModelImpl.ENTITY_CACHE_ENABLED,
			JobDocumentResultImpl.class, jobDocumentResult.getPrimaryKey(),
			jobDocumentResult);

		jobDocumentResult.resetOriginalValues();
	}

	/**
	 * Caches the job document results in the entity cache if it is enabled.
	 *
	 * @param jobDocumentResults the job document results
	 */
	@Override
	public void cacheResult(List<JobDocumentResult> jobDocumentResults) {
		for (JobDocumentResult jobDocumentResult : jobDocumentResults) {
			if (EntityCacheUtil.getResult(
						JobDocumentResultModelImpl.ENTITY_CACHE_ENABLED,
						JobDocumentResultImpl.class,
						jobDocumentResult.getPrimaryKey()) == null) {
				cacheResult(jobDocumentResult);
			}
			else {
				jobDocumentResult.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all job document results.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(JobDocumentResultImpl.class.getName());
		}

		EntityCacheUtil.clearCache(JobDocumentResultImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the job document result.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JobDocumentResult jobDocumentResult) {
		EntityCacheUtil.removeResult(JobDocumentResultModelImpl.ENTITY_CACHE_ENABLED,
			JobDocumentResultImpl.class, jobDocumentResult.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<JobDocumentResult> jobDocumentResults) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (JobDocumentResult jobDocumentResult : jobDocumentResults) {
			EntityCacheUtil.removeResult(JobDocumentResultModelImpl.ENTITY_CACHE_ENABLED,
				JobDocumentResultImpl.class, jobDocumentResult.getPrimaryKey());
		}
	}

	/**
	 * Creates a new job document result with the primary key. Does not add the job document result to the database.
	 *
	 * @param jobDocumentResultId the primary key for the new job document result
	 * @return the new job document result
	 */
	@Override
	public JobDocumentResult create(long jobDocumentResultId) {
		JobDocumentResult jobDocumentResult = new JobDocumentResultImpl();

		jobDocumentResult.setNew(true);
		jobDocumentResult.setPrimaryKey(jobDocumentResultId);

		return jobDocumentResult;
	}

	/**
	 * Removes the job document result with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jobDocumentResultId the primary key of the job document result
	 * @return the job document result that was removed
	 * @throws edu.ucla.macroscope.emotiongraph.NoSuchJobDocumentResultException if a job document result with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobDocumentResult remove(long jobDocumentResultId)
		throws NoSuchJobDocumentResultException, SystemException {
		return remove((Serializable)jobDocumentResultId);
	}

	/**
	 * Removes the job document result with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the job document result
	 * @return the job document result that was removed
	 * @throws edu.ucla.macroscope.emotiongraph.NoSuchJobDocumentResultException if a job document result with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobDocumentResult remove(Serializable primaryKey)
		throws NoSuchJobDocumentResultException, SystemException {
		Session session = null;

		try {
			session = openSession();

			JobDocumentResult jobDocumentResult = (JobDocumentResult)session.get(JobDocumentResultImpl.class,
					primaryKey);

			if (jobDocumentResult == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJobDocumentResultException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(jobDocumentResult);
		}
		catch (NoSuchJobDocumentResultException nsee) {
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
	protected JobDocumentResult removeImpl(JobDocumentResult jobDocumentResult)
		throws SystemException {
		jobDocumentResult = toUnwrappedModel(jobDocumentResult);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jobDocumentResult)) {
				jobDocumentResult = (JobDocumentResult)session.get(JobDocumentResultImpl.class,
						jobDocumentResult.getPrimaryKeyObj());
			}

			if (jobDocumentResult != null) {
				session.delete(jobDocumentResult);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (jobDocumentResult != null) {
			clearCache(jobDocumentResult);
		}

		return jobDocumentResult;
	}

	@Override
	public JobDocumentResult updateImpl(
		edu.ucla.macroscope.emotiongraph.model.JobDocumentResult jobDocumentResult)
		throws SystemException {
		jobDocumentResult = toUnwrappedModel(jobDocumentResult);

		boolean isNew = jobDocumentResult.isNew();

		Session session = null;

		try {
			session = openSession();

			if (jobDocumentResult.isNew()) {
				session.save(jobDocumentResult);

				jobDocumentResult.setNew(false);
			}
			else {
				session.merge(jobDocumentResult);
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

		EntityCacheUtil.putResult(JobDocumentResultModelImpl.ENTITY_CACHE_ENABLED,
			JobDocumentResultImpl.class, jobDocumentResult.getPrimaryKey(),
			jobDocumentResult);

		return jobDocumentResult;
	}

	protected JobDocumentResult toUnwrappedModel(
		JobDocumentResult jobDocumentResult) {
		if (jobDocumentResult instanceof JobDocumentResultImpl) {
			return jobDocumentResult;
		}

		JobDocumentResultImpl jobDocumentResultImpl = new JobDocumentResultImpl();

		jobDocumentResultImpl.setNew(jobDocumentResult.isNew());
		jobDocumentResultImpl.setPrimaryKey(jobDocumentResult.getPrimaryKey());

		jobDocumentResultImpl.setJobDocumentResultId(jobDocumentResult.getJobDocumentResultId());
		jobDocumentResultImpl.setJobId(jobDocumentResult.getJobId());
		jobDocumentResultImpl.setDocumentId(jobDocumentResult.getDocumentId());
		jobDocumentResultImpl.setLineNo(jobDocumentResult.getLineNo());
		jobDocumentResultImpl.setWord(jobDocumentResult.getWord());
		jobDocumentResultImpl.setCount(jobDocumentResult.getCount());
		jobDocumentResultImpl.setGroupId(jobDocumentResult.getGroupId());
		jobDocumentResultImpl.setCompanyId(jobDocumentResult.getCompanyId());
		jobDocumentResultImpl.setUserId(jobDocumentResult.getUserId());
		jobDocumentResultImpl.setUserName(jobDocumentResult.getUserName());
		jobDocumentResultImpl.setCreateDate(jobDocumentResult.getCreateDate());
		jobDocumentResultImpl.setModifiedDate(jobDocumentResult.getModifiedDate());

		return jobDocumentResultImpl;
	}

	/**
	 * Returns the job document result with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the job document result
	 * @return the job document result
	 * @throws edu.ucla.macroscope.emotiongraph.NoSuchJobDocumentResultException if a job document result with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobDocumentResult findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJobDocumentResultException, SystemException {
		JobDocumentResult jobDocumentResult = fetchByPrimaryKey(primaryKey);

		if (jobDocumentResult == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJobDocumentResultException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return jobDocumentResult;
	}

	/**
	 * Returns the job document result with the primary key or throws a {@link edu.ucla.macroscope.emotiongraph.NoSuchJobDocumentResultException} if it could not be found.
	 *
	 * @param jobDocumentResultId the primary key of the job document result
	 * @return the job document result
	 * @throws edu.ucla.macroscope.emotiongraph.NoSuchJobDocumentResultException if a job document result with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobDocumentResult findByPrimaryKey(long jobDocumentResultId)
		throws NoSuchJobDocumentResultException, SystemException {
		return findByPrimaryKey((Serializable)jobDocumentResultId);
	}

	/**
	 * Returns the job document result with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the job document result
	 * @return the job document result, or <code>null</code> if a job document result with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobDocumentResult fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		JobDocumentResult jobDocumentResult = (JobDocumentResult)EntityCacheUtil.getResult(JobDocumentResultModelImpl.ENTITY_CACHE_ENABLED,
				JobDocumentResultImpl.class, primaryKey);

		if (jobDocumentResult == _nullJobDocumentResult) {
			return null;
		}

		if (jobDocumentResult == null) {
			Session session = null;

			try {
				session = openSession();

				jobDocumentResult = (JobDocumentResult)session.get(JobDocumentResultImpl.class,
						primaryKey);

				if (jobDocumentResult != null) {
					cacheResult(jobDocumentResult);
				}
				else {
					EntityCacheUtil.putResult(JobDocumentResultModelImpl.ENTITY_CACHE_ENABLED,
						JobDocumentResultImpl.class, primaryKey,
						_nullJobDocumentResult);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(JobDocumentResultModelImpl.ENTITY_CACHE_ENABLED,
					JobDocumentResultImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return jobDocumentResult;
	}

	/**
	 * Returns the job document result with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jobDocumentResultId the primary key of the job document result
	 * @return the job document result, or <code>null</code> if a job document result with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public JobDocumentResult fetchByPrimaryKey(long jobDocumentResultId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)jobDocumentResultId);
	}

	/**
	 * Returns all the job document results.
	 *
	 * @return the job document results
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobDocumentResult> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the job document results.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.emotiongraph.model.impl.JobDocumentResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of job document results
	 * @param end the upper bound of the range of job document results (not inclusive)
	 * @return the range of job document results
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobDocumentResult> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the job document results.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.emotiongraph.model.impl.JobDocumentResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of job document results
	 * @param end the upper bound of the range of job document results (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of job document results
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobDocumentResult> findAll(int start, int end,
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

		List<JobDocumentResult> list = (List<JobDocumentResult>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_JOBDOCUMENTRESULT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_JOBDOCUMENTRESULT;

				if (pagination) {
					sql = sql.concat(JobDocumentResultModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<JobDocumentResult>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<JobDocumentResult>(list);
				}
				else {
					list = (List<JobDocumentResult>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the job document results from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (JobDocumentResult jobDocumentResult : findAll()) {
			remove(jobDocumentResult);
		}
	}

	/**
	 * Returns the number of job document results.
	 *
	 * @return the number of job document results
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

				Query q = session.createQuery(_SQL_COUNT_JOBDOCUMENTRESULT);

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
	 * Initializes the job document result persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.edu.ucla.macroscope.emotiongraph.model.JobDocumentResult")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<JobDocumentResult>> listenersList = new ArrayList<ModelListener<JobDocumentResult>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<JobDocumentResult>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(JobDocumentResultImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_JOBDOCUMENTRESULT = "SELECT jobDocumentResult FROM JobDocumentResult jobDocumentResult";
	private static final String _SQL_COUNT_JOBDOCUMENTRESULT = "SELECT COUNT(jobDocumentResult) FROM JobDocumentResult jobDocumentResult";
	private static final String _ORDER_BY_ENTITY_ALIAS = "jobDocumentResult.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No JobDocumentResult exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(JobDocumentResultPersistenceImpl.class);
	private static JobDocumentResult _nullJobDocumentResult = new JobDocumentResultImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<JobDocumentResult> toCacheModel() {
				return _nullJobDocumentResultCacheModel;
			}
		};

	private static CacheModel<JobDocumentResult> _nullJobDocumentResultCacheModel =
		new CacheModel<JobDocumentResult>() {
			@Override
			public JobDocumentResult toEntityModel() {
				return _nullJobDocumentResult;
			}
		};
}