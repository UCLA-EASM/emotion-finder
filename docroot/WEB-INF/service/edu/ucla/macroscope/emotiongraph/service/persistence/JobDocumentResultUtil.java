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

import edu.ucla.macroscope.emotiongraph.model.JobDocumentResult;

import java.util.List;

/**
 * The persistence utility for the job document result service. This utility wraps {@link JobDocumentResultPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author dave
 * @see JobDocumentResultPersistence
 * @see JobDocumentResultPersistenceImpl
 * @generated
 */
public class JobDocumentResultUtil {
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
	public static void clearCache(JobDocumentResult jobDocumentResult) {
		getPersistence().clearCache(jobDocumentResult);
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
	public static List<JobDocumentResult> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JobDocumentResult> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JobDocumentResult> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static JobDocumentResult update(JobDocumentResult jobDocumentResult)
		throws SystemException {
		return getPersistence().update(jobDocumentResult);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static JobDocumentResult update(
		JobDocumentResult jobDocumentResult, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(jobDocumentResult, serviceContext);
	}

	/**
	* Caches the job document result in the entity cache if it is enabled.
	*
	* @param jobDocumentResult the job document result
	*/
	public static void cacheResult(
		edu.ucla.macroscope.emotiongraph.model.JobDocumentResult jobDocumentResult) {
		getPersistence().cacheResult(jobDocumentResult);
	}

	/**
	* Caches the job document results in the entity cache if it is enabled.
	*
	* @param jobDocumentResults the job document results
	*/
	public static void cacheResult(
		java.util.List<edu.ucla.macroscope.emotiongraph.model.JobDocumentResult> jobDocumentResults) {
		getPersistence().cacheResult(jobDocumentResults);
	}

	/**
	* Creates a new job document result with the primary key. Does not add the job document result to the database.
	*
	* @param jobDocumentResultId the primary key for the new job document result
	* @return the new job document result
	*/
	public static edu.ucla.macroscope.emotiongraph.model.JobDocumentResult create(
		long jobDocumentResultId) {
		return getPersistence().create(jobDocumentResultId);
	}

	/**
	* Removes the job document result with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jobDocumentResultId the primary key of the job document result
	* @return the job document result that was removed
	* @throws edu.ucla.macroscope.emotiongraph.NoSuchJobDocumentResultException if a job document result with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.emotiongraph.model.JobDocumentResult remove(
		long jobDocumentResultId)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.emotiongraph.NoSuchJobDocumentResultException {
		return getPersistence().remove(jobDocumentResultId);
	}

	public static edu.ucla.macroscope.emotiongraph.model.JobDocumentResult updateImpl(
		edu.ucla.macroscope.emotiongraph.model.JobDocumentResult jobDocumentResult)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(jobDocumentResult);
	}

	/**
	* Returns the job document result with the primary key or throws a {@link edu.ucla.macroscope.emotiongraph.NoSuchJobDocumentResultException} if it could not be found.
	*
	* @param jobDocumentResultId the primary key of the job document result
	* @return the job document result
	* @throws edu.ucla.macroscope.emotiongraph.NoSuchJobDocumentResultException if a job document result with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.emotiongraph.model.JobDocumentResult findByPrimaryKey(
		long jobDocumentResultId)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.emotiongraph.NoSuchJobDocumentResultException {
		return getPersistence().findByPrimaryKey(jobDocumentResultId);
	}

	/**
	* Returns the job document result with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param jobDocumentResultId the primary key of the job document result
	* @return the job document result, or <code>null</code> if a job document result with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.emotiongraph.model.JobDocumentResult fetchByPrimaryKey(
		long jobDocumentResultId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(jobDocumentResultId);
	}

	/**
	* Returns all the job document results.
	*
	* @return the job document results
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.ucla.macroscope.emotiongraph.model.JobDocumentResult> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<edu.ucla.macroscope.emotiongraph.model.JobDocumentResult> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<edu.ucla.macroscope.emotiongraph.model.JobDocumentResult> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the job document results from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of job document results.
	*
	* @return the number of job document results
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static JobDocumentResultPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (JobDocumentResultPersistence)PortletBeanLocatorUtil.locate(edu.ucla.macroscope.emotiongraph.service.ClpSerializer.getServletContextName(),
					JobDocumentResultPersistence.class.getName());

			ReferenceRegistry.registerReference(JobDocumentResultUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(JobDocumentResultPersistence persistence) {
	}

	private static JobDocumentResultPersistence _persistence;
}