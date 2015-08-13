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

import edu.ucla.macroscope.emotiongraph.model.JobDocument;

import java.util.List;

/**
 * The persistence utility for the job document service. This utility wraps {@link JobDocumentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author dave
 * @see JobDocumentPersistence
 * @see JobDocumentPersistenceImpl
 * @generated
 */
public class JobDocumentUtil {
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
	public static void clearCache(JobDocument jobDocument) {
		getPersistence().clearCache(jobDocument);
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
	public static List<JobDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JobDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JobDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static JobDocument update(JobDocument jobDocument)
		throws SystemException {
		return getPersistence().update(jobDocument);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static JobDocument update(JobDocument jobDocument,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(jobDocument, serviceContext);
	}

	/**
	* Caches the job document in the entity cache if it is enabled.
	*
	* @param jobDocument the job document
	*/
	public static void cacheResult(
		edu.ucla.macroscope.emotiongraph.model.JobDocument jobDocument) {
		getPersistence().cacheResult(jobDocument);
	}

	/**
	* Caches the job documents in the entity cache if it is enabled.
	*
	* @param jobDocuments the job documents
	*/
	public static void cacheResult(
		java.util.List<edu.ucla.macroscope.emotiongraph.model.JobDocument> jobDocuments) {
		getPersistence().cacheResult(jobDocuments);
	}

	/**
	* Creates a new job document with the primary key. Does not add the job document to the database.
	*
	* @param jobDocumentId the primary key for the new job document
	* @return the new job document
	*/
	public static edu.ucla.macroscope.emotiongraph.model.JobDocument create(
		long jobDocumentId) {
		return getPersistence().create(jobDocumentId);
	}

	/**
	* Removes the job document with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jobDocumentId the primary key of the job document
	* @return the job document that was removed
	* @throws edu.ucla.macroscope.emotiongraph.NoSuchJobDocumentException if a job document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.emotiongraph.model.JobDocument remove(
		long jobDocumentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.emotiongraph.NoSuchJobDocumentException {
		return getPersistence().remove(jobDocumentId);
	}

	public static edu.ucla.macroscope.emotiongraph.model.JobDocument updateImpl(
		edu.ucla.macroscope.emotiongraph.model.JobDocument jobDocument)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(jobDocument);
	}

	/**
	* Returns the job document with the primary key or throws a {@link edu.ucla.macroscope.emotiongraph.NoSuchJobDocumentException} if it could not be found.
	*
	* @param jobDocumentId the primary key of the job document
	* @return the job document
	* @throws edu.ucla.macroscope.emotiongraph.NoSuchJobDocumentException if a job document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.emotiongraph.model.JobDocument findByPrimaryKey(
		long jobDocumentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.emotiongraph.NoSuchJobDocumentException {
		return getPersistence().findByPrimaryKey(jobDocumentId);
	}

	/**
	* Returns the job document with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param jobDocumentId the primary key of the job document
	* @return the job document, or <code>null</code> if a job document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.emotiongraph.model.JobDocument fetchByPrimaryKey(
		long jobDocumentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(jobDocumentId);
	}

	/**
	* Returns all the job documents.
	*
	* @return the job documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.ucla.macroscope.emotiongraph.model.JobDocument> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<edu.ucla.macroscope.emotiongraph.model.JobDocument> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<edu.ucla.macroscope.emotiongraph.model.JobDocument> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the job documents from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of job documents.
	*
	* @return the number of job documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static JobDocumentPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (JobDocumentPersistence)PortletBeanLocatorUtil.locate(edu.ucla.macroscope.emotiongraph.service.ClpSerializer.getServletContextName(),
					JobDocumentPersistence.class.getName());

			ReferenceRegistry.registerReference(JobDocumentUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(JobDocumentPersistence persistence) {
	}

	private static JobDocumentPersistence _persistence;
}