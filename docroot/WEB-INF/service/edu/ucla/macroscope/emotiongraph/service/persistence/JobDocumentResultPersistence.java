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

import com.liferay.portal.service.persistence.BasePersistence;

import edu.ucla.macroscope.emotiongraph.model.JobDocumentResult;

/**
 * The persistence interface for the job document result service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author dave
 * @see JobDocumentResultPersistenceImpl
 * @see JobDocumentResultUtil
 * @generated
 */
public interface JobDocumentResultPersistence extends BasePersistence<JobDocumentResult> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JobDocumentResultUtil} to access the job document result persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the job document result in the entity cache if it is enabled.
	*
	* @param jobDocumentResult the job document result
	*/
	public void cacheResult(
		edu.ucla.macroscope.emotiongraph.model.JobDocumentResult jobDocumentResult);

	/**
	* Caches the job document results in the entity cache if it is enabled.
	*
	* @param jobDocumentResults the job document results
	*/
	public void cacheResult(
		java.util.List<edu.ucla.macroscope.emotiongraph.model.JobDocumentResult> jobDocumentResults);

	/**
	* Creates a new job document result with the primary key. Does not add the job document result to the database.
	*
	* @param jobDocumentResultId the primary key for the new job document result
	* @return the new job document result
	*/
	public edu.ucla.macroscope.emotiongraph.model.JobDocumentResult create(
		long jobDocumentResultId);

	/**
	* Removes the job document result with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jobDocumentResultId the primary key of the job document result
	* @return the job document result that was removed
	* @throws edu.ucla.macroscope.emotiongraph.NoSuchJobDocumentResultException if a job document result with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.emotiongraph.model.JobDocumentResult remove(
		long jobDocumentResultId)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.emotiongraph.NoSuchJobDocumentResultException;

	public edu.ucla.macroscope.emotiongraph.model.JobDocumentResult updateImpl(
		edu.ucla.macroscope.emotiongraph.model.JobDocumentResult jobDocumentResult)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the job document result with the primary key or throws a {@link edu.ucla.macroscope.emotiongraph.NoSuchJobDocumentResultException} if it could not be found.
	*
	* @param jobDocumentResultId the primary key of the job document result
	* @return the job document result
	* @throws edu.ucla.macroscope.emotiongraph.NoSuchJobDocumentResultException if a job document result with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.emotiongraph.model.JobDocumentResult findByPrimaryKey(
		long jobDocumentResultId)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.emotiongraph.NoSuchJobDocumentResultException;

	/**
	* Returns the job document result with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param jobDocumentResultId the primary key of the job document result
	* @return the job document result, or <code>null</code> if a job document result with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.emotiongraph.model.JobDocumentResult fetchByPrimaryKey(
		long jobDocumentResultId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the job document results.
	*
	* @return the job document results
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.ucla.macroscope.emotiongraph.model.JobDocumentResult> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<edu.ucla.macroscope.emotiongraph.model.JobDocumentResult> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<edu.ucla.macroscope.emotiongraph.model.JobDocumentResult> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the job document results from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of job document results.
	*
	* @return the number of job document results
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}