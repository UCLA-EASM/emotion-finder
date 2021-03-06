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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import edu.ucla.macroscope.emotiongraph.model.Job;

import java.util.List;

/**
 * The persistence utility for the job service. This utility wraps {@link JobPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author dave
 * @see JobPersistence
 * @see JobPersistenceImpl
 * @generated
 */
public class JobUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Job job) {
		getPersistence().clearCache(job);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Job> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Job> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Job> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Job update(Job job) throws SystemException {
		return getPersistence().update(job);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Job update(Job job, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(job, serviceContext);
	}

	/**
	* Caches the job in the entity cache if it is enabled.
	*
	* @param job the job
	*/
	public static void cacheResult(
		edu.ucla.macroscope.emotiongraph.model.Job job) {
		getPersistence().cacheResult(job);
	}

	/**
	* Caches the jobs in the entity cache if it is enabled.
	*
	* @param jobs the jobs
	*/
	public static void cacheResult(
		java.util.List<edu.ucla.macroscope.emotiongraph.model.Job> jobs) {
		getPersistence().cacheResult(jobs);
	}

	/**
	* Creates a new job with the primary key. Does not add the job to the database.
	*
	* @param jobId the primary key for the new job
	* @return the new job
	*/
	public static edu.ucla.macroscope.emotiongraph.model.Job create(long jobId) {
		return getPersistence().create(jobId);
	}

	/**
	* Removes the job with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jobId the primary key of the job
	* @return the job that was removed
	* @throws edu.ucla.macroscope.emotiongraph.NoSuchJobException if a job with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.emotiongraph.model.Job remove(long jobId)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.emotiongraph.NoSuchJobException {
		return getPersistence().remove(jobId);
	}

	public static edu.ucla.macroscope.emotiongraph.model.Job updateImpl(
		edu.ucla.macroscope.emotiongraph.model.Job job)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(job);
	}

	/**
	* Returns the job with the primary key or throws a {@link edu.ucla.macroscope.emotiongraph.NoSuchJobException} if it could not be found.
	*
	* @param jobId the primary key of the job
	* @return the job
	* @throws edu.ucla.macroscope.emotiongraph.NoSuchJobException if a job with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.emotiongraph.model.Job findByPrimaryKey(
		long jobId)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.emotiongraph.NoSuchJobException {
		return getPersistence().findByPrimaryKey(jobId);
	}

	/**
	* Returns the job with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param jobId the primary key of the job
	* @return the job, or <code>null</code> if a job with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.emotiongraph.model.Job fetchByPrimaryKey(
		long jobId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(jobId);
	}

	/**
	* Returns all the jobs.
	*
	* @return the jobs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.ucla.macroscope.emotiongraph.model.Job> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<edu.ucla.macroscope.emotiongraph.model.Job> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the jobs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.emotiongraph.model.impl.JobModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jobs
	* @param end the upper bound of the range of jobs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of jobs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.ucla.macroscope.emotiongraph.model.Job> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the jobs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of jobs.
	*
	* @return the number of jobs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static JobPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (JobPersistence)PortletBeanLocatorUtil.locate(edu.ucla.macroscope.emotiongraph.service.ClpSerializer.getServletContextName(),
					JobPersistence.class.getName());

			ReferenceRegistry.registerReference(JobUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(JobPersistence persistence) {
	}

	private static JobPersistence _persistence;
}