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

import edu.ucla.macroscope.emotiongraph.model.JobDocument;

/**
 * The persistence interface for the job document service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author dave
 * @see JobDocumentPersistenceImpl
 * @see JobDocumentUtil
 * @generated
 */
public interface JobDocumentPersistence extends BasePersistence<JobDocument> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JobDocumentUtil} to access the job document persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the job document in the entity cache if it is enabled.
	*
	* @param jobDocument the job document
	*/
	public void cacheResult(
		edu.ucla.macroscope.emotiongraph.model.JobDocument jobDocument);

	/**
	* Caches the job documents in the entity cache if it is enabled.
	*
	* @param jobDocuments the job documents
	*/
	public void cacheResult(
		java.util.List<edu.ucla.macroscope.emotiongraph.model.JobDocument> jobDocuments);

	/**
	* Creates a new job document with the primary key. Does not add the job document to the database.
	*
	* @param jobDocumentId the primary key for the new job document
	* @return the new job document
	*/
	public edu.ucla.macroscope.emotiongraph.model.JobDocument create(
		long jobDocumentId);

	/**
	* Removes the job document with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jobDocumentId the primary key of the job document
	* @return the job document that was removed
	* @throws edu.ucla.macroscope.emotiongraph.NoSuchJobDocumentException if a job document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.emotiongraph.model.JobDocument remove(
		long jobDocumentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.emotiongraph.NoSuchJobDocumentException;

	public edu.ucla.macroscope.emotiongraph.model.JobDocument updateImpl(
		edu.ucla.macroscope.emotiongraph.model.JobDocument jobDocument)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the job document with the primary key or throws a {@link edu.ucla.macroscope.emotiongraph.NoSuchJobDocumentException} if it could not be found.
	*
	* @param jobDocumentId the primary key of the job document
	* @return the job document
	* @throws edu.ucla.macroscope.emotiongraph.NoSuchJobDocumentException if a job document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.emotiongraph.model.JobDocument findByPrimaryKey(
		long jobDocumentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.emotiongraph.NoSuchJobDocumentException;

	/**
	* Returns the job document with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param jobDocumentId the primary key of the job document
	* @return the job document, or <code>null</code> if a job document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.emotiongraph.model.JobDocument fetchByPrimaryKey(
		long jobDocumentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the job documents.
	*
	* @return the job documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.ucla.macroscope.emotiongraph.model.JobDocument> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<edu.ucla.macroscope.emotiongraph.model.JobDocument> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<edu.ucla.macroscope.emotiongraph.model.JobDocument> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the job documents from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of job documents.
	*
	* @return the number of job documents
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}