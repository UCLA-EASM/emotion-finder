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

package edu.ucla.macroscope.emotiongraph.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import edu.ucla.macroscope.emotiongraph.model.Job;
import edu.ucla.macroscope.emotiongraph.service.JobLocalService;
import edu.ucla.macroscope.emotiongraph.service.persistence.DictionaryPersistence;
import edu.ucla.macroscope.emotiongraph.service.persistence.JobDocumentPersistence;
import edu.ucla.macroscope.emotiongraph.service.persistence.JobDocumentResultPersistence;
import edu.ucla.macroscope.emotiongraph.service.persistence.JobPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the job local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link edu.ucla.macroscope.emotiongraph.service.impl.JobLocalServiceImpl}.
 * </p>
 *
 * @author dave
 * @see edu.ucla.macroscope.emotiongraph.service.impl.JobLocalServiceImpl
 * @see edu.ucla.macroscope.emotiongraph.service.JobLocalServiceUtil
 * @generated
 */
public abstract class JobLocalServiceBaseImpl extends BaseLocalServiceImpl
	implements JobLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link edu.ucla.macroscope.emotiongraph.service.JobLocalServiceUtil} to access the job local service.
	 */

	/**
	 * Adds the job to the database. Also notifies the appropriate model listeners.
	 *
	 * @param job the job
	 * @return the job that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Job addJob(Job job) throws SystemException {
		job.setNew(true);

		return jobPersistence.update(job);
	}

	/**
	 * Creates a new job with the primary key. Does not add the job to the database.
	 *
	 * @param jobId the primary key for the new job
	 * @return the new job
	 */
	@Override
	public Job createJob(long jobId) {
		return jobPersistence.create(jobId);
	}

	/**
	 * Deletes the job with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jobId the primary key of the job
	 * @return the job that was removed
	 * @throws PortalException if a job with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Job deleteJob(long jobId) throws PortalException, SystemException {
		return jobPersistence.remove(jobId);
	}

	/**
	 * Deletes the job from the database. Also notifies the appropriate model listeners.
	 *
	 * @param job the job
	 * @return the job that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Job deleteJob(Job job) throws SystemException {
		return jobPersistence.remove(job);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(Job.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return jobPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.emotiongraph.model.impl.JobModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return jobPersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.emotiongraph.model.impl.JobModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return jobPersistence.findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return jobPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return jobPersistence.countWithDynamicQuery(dynamicQuery, projection);
	}

	@Override
	public Job fetchJob(long jobId) throws SystemException {
		return jobPersistence.fetchByPrimaryKey(jobId);
	}

	/**
	 * Returns the job with the primary key.
	 *
	 * @param jobId the primary key of the job
	 * @return the job
	 * @throws PortalException if a job with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Job getJob(long jobId) throws PortalException, SystemException {
		return jobPersistence.findByPrimaryKey(jobId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return jobPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the jobs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.emotiongraph.model.impl.JobModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of jobs
	 * @param end the upper bound of the range of jobs (not inclusive)
	 * @return the range of jobs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Job> getJobs(int start, int end) throws SystemException {
		return jobPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of jobs.
	 *
	 * @return the number of jobs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getJobsCount() throws SystemException {
		return jobPersistence.countAll();
	}

	/**
	 * Updates the job in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param job the job
	 * @return the job that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Job updateJob(Job job) throws SystemException {
		return jobPersistence.update(job);
	}

	/**
	 * Returns the dictionary local service.
	 *
	 * @return the dictionary local service
	 */
	public edu.ucla.macroscope.emotiongraph.service.DictionaryLocalService getDictionaryLocalService() {
		return dictionaryLocalService;
	}

	/**
	 * Sets the dictionary local service.
	 *
	 * @param dictionaryLocalService the dictionary local service
	 */
	public void setDictionaryLocalService(
		edu.ucla.macroscope.emotiongraph.service.DictionaryLocalService dictionaryLocalService) {
		this.dictionaryLocalService = dictionaryLocalService;
	}

	/**
	 * Returns the dictionary remote service.
	 *
	 * @return the dictionary remote service
	 */
	public edu.ucla.macroscope.emotiongraph.service.DictionaryService getDictionaryService() {
		return dictionaryService;
	}

	/**
	 * Sets the dictionary remote service.
	 *
	 * @param dictionaryService the dictionary remote service
	 */
	public void setDictionaryService(
		edu.ucla.macroscope.emotiongraph.service.DictionaryService dictionaryService) {
		this.dictionaryService = dictionaryService;
	}

	/**
	 * Returns the dictionary persistence.
	 *
	 * @return the dictionary persistence
	 */
	public DictionaryPersistence getDictionaryPersistence() {
		return dictionaryPersistence;
	}

	/**
	 * Sets the dictionary persistence.
	 *
	 * @param dictionaryPersistence the dictionary persistence
	 */
	public void setDictionaryPersistence(
		DictionaryPersistence dictionaryPersistence) {
		this.dictionaryPersistence = dictionaryPersistence;
	}

	/**
	 * Returns the job local service.
	 *
	 * @return the job local service
	 */
	public edu.ucla.macroscope.emotiongraph.service.JobLocalService getJobLocalService() {
		return jobLocalService;
	}

	/**
	 * Sets the job local service.
	 *
	 * @param jobLocalService the job local service
	 */
	public void setJobLocalService(
		edu.ucla.macroscope.emotiongraph.service.JobLocalService jobLocalService) {
		this.jobLocalService = jobLocalService;
	}

	/**
	 * Returns the job remote service.
	 *
	 * @return the job remote service
	 */
	public edu.ucla.macroscope.emotiongraph.service.JobService getJobService() {
		return jobService;
	}

	/**
	 * Sets the job remote service.
	 *
	 * @param jobService the job remote service
	 */
	public void setJobService(
		edu.ucla.macroscope.emotiongraph.service.JobService jobService) {
		this.jobService = jobService;
	}

	/**
	 * Returns the job persistence.
	 *
	 * @return the job persistence
	 */
	public JobPersistence getJobPersistence() {
		return jobPersistence;
	}

	/**
	 * Sets the job persistence.
	 *
	 * @param jobPersistence the job persistence
	 */
	public void setJobPersistence(JobPersistence jobPersistence) {
		this.jobPersistence = jobPersistence;
	}

	/**
	 * Returns the job document local service.
	 *
	 * @return the job document local service
	 */
	public edu.ucla.macroscope.emotiongraph.service.JobDocumentLocalService getJobDocumentLocalService() {
		return jobDocumentLocalService;
	}

	/**
	 * Sets the job document local service.
	 *
	 * @param jobDocumentLocalService the job document local service
	 */
	public void setJobDocumentLocalService(
		edu.ucla.macroscope.emotiongraph.service.JobDocumentLocalService jobDocumentLocalService) {
		this.jobDocumentLocalService = jobDocumentLocalService;
	}

	/**
	 * Returns the job document remote service.
	 *
	 * @return the job document remote service
	 */
	public edu.ucla.macroscope.emotiongraph.service.JobDocumentService getJobDocumentService() {
		return jobDocumentService;
	}

	/**
	 * Sets the job document remote service.
	 *
	 * @param jobDocumentService the job document remote service
	 */
	public void setJobDocumentService(
		edu.ucla.macroscope.emotiongraph.service.JobDocumentService jobDocumentService) {
		this.jobDocumentService = jobDocumentService;
	}

	/**
	 * Returns the job document persistence.
	 *
	 * @return the job document persistence
	 */
	public JobDocumentPersistence getJobDocumentPersistence() {
		return jobDocumentPersistence;
	}

	/**
	 * Sets the job document persistence.
	 *
	 * @param jobDocumentPersistence the job document persistence
	 */
	public void setJobDocumentPersistence(
		JobDocumentPersistence jobDocumentPersistence) {
		this.jobDocumentPersistence = jobDocumentPersistence;
	}

	/**
	 * Returns the job document result local service.
	 *
	 * @return the job document result local service
	 */
	public edu.ucla.macroscope.emotiongraph.service.JobDocumentResultLocalService getJobDocumentResultLocalService() {
		return jobDocumentResultLocalService;
	}

	/**
	 * Sets the job document result local service.
	 *
	 * @param jobDocumentResultLocalService the job document result local service
	 */
	public void setJobDocumentResultLocalService(
		edu.ucla.macroscope.emotiongraph.service.JobDocumentResultLocalService jobDocumentResultLocalService) {
		this.jobDocumentResultLocalService = jobDocumentResultLocalService;
	}

	/**
	 * Returns the job document result remote service.
	 *
	 * @return the job document result remote service
	 */
	public edu.ucla.macroscope.emotiongraph.service.JobDocumentResultService getJobDocumentResultService() {
		return jobDocumentResultService;
	}

	/**
	 * Sets the job document result remote service.
	 *
	 * @param jobDocumentResultService the job document result remote service
	 */
	public void setJobDocumentResultService(
		edu.ucla.macroscope.emotiongraph.service.JobDocumentResultService jobDocumentResultService) {
		this.jobDocumentResultService = jobDocumentResultService;
	}

	/**
	 * Returns the job document result persistence.
	 *
	 * @return the job document result persistence
	 */
	public JobDocumentResultPersistence getJobDocumentResultPersistence() {
		return jobDocumentResultPersistence;
	}

	/**
	 * Sets the job document result persistence.
	 *
	 * @param jobDocumentResultPersistence the job document result persistence
	 */
	public void setJobDocumentResultPersistence(
		JobDocumentResultPersistence jobDocumentResultPersistence) {
		this.jobDocumentResultPersistence = jobDocumentResultPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("edu.ucla.macroscope.emotiongraph.model.Job",
			jobLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"edu.ucla.macroscope.emotiongraph.model.Job");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return Job.class;
	}

	protected String getModelClassName() {
		return Job.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = jobPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = edu.ucla.macroscope.emotiongraph.service.DictionaryLocalService.class)
	protected edu.ucla.macroscope.emotiongraph.service.DictionaryLocalService dictionaryLocalService;
	@BeanReference(type = edu.ucla.macroscope.emotiongraph.service.DictionaryService.class)
	protected edu.ucla.macroscope.emotiongraph.service.DictionaryService dictionaryService;
	@BeanReference(type = DictionaryPersistence.class)
	protected DictionaryPersistence dictionaryPersistence;
	@BeanReference(type = edu.ucla.macroscope.emotiongraph.service.JobLocalService.class)
	protected edu.ucla.macroscope.emotiongraph.service.JobLocalService jobLocalService;
	@BeanReference(type = edu.ucla.macroscope.emotiongraph.service.JobService.class)
	protected edu.ucla.macroscope.emotiongraph.service.JobService jobService;
	@BeanReference(type = JobPersistence.class)
	protected JobPersistence jobPersistence;
	@BeanReference(type = edu.ucla.macroscope.emotiongraph.service.JobDocumentLocalService.class)
	protected edu.ucla.macroscope.emotiongraph.service.JobDocumentLocalService jobDocumentLocalService;
	@BeanReference(type = edu.ucla.macroscope.emotiongraph.service.JobDocumentService.class)
	protected edu.ucla.macroscope.emotiongraph.service.JobDocumentService jobDocumentService;
	@BeanReference(type = JobDocumentPersistence.class)
	protected JobDocumentPersistence jobDocumentPersistence;
	@BeanReference(type = edu.ucla.macroscope.emotiongraph.service.JobDocumentResultLocalService.class)
	protected edu.ucla.macroscope.emotiongraph.service.JobDocumentResultLocalService jobDocumentResultLocalService;
	@BeanReference(type = edu.ucla.macroscope.emotiongraph.service.JobDocumentResultService.class)
	protected edu.ucla.macroscope.emotiongraph.service.JobDocumentResultService jobDocumentResultService;
	@BeanReference(type = JobDocumentResultPersistence.class)
	protected JobDocumentResultPersistence jobDocumentResultPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private JobLocalServiceClpInvoker _clpInvoker = new JobLocalServiceClpInvoker();
}