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

package edu.ucla.macroscope.emotiongraph.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link JobDocument}.
 * </p>
 *
 * @author dave
 * @see JobDocument
 * @generated
 */
public class JobDocumentWrapper implements JobDocument,
	ModelWrapper<JobDocument> {
	public JobDocumentWrapper(JobDocument jobDocument) {
		_jobDocument = jobDocument;
	}

	@Override
	public Class<?> getModelClass() {
		return JobDocument.class;
	}

	@Override
	public String getModelClassName() {
		return JobDocument.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("jobDocumentId", getJobDocumentId());
		attributes.put("jobId", getJobId());
		attributes.put("documentId", getDocumentId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long jobDocumentId = (Long)attributes.get("jobDocumentId");

		if (jobDocumentId != null) {
			setJobDocumentId(jobDocumentId);
		}

		Long jobId = (Long)attributes.get("jobId");

		if (jobId != null) {
			setJobId(jobId);
		}

		Long documentId = (Long)attributes.get("documentId");

		if (documentId != null) {
			setDocumentId(documentId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	/**
	* Returns the primary key of this job document.
	*
	* @return the primary key of this job document
	*/
	@Override
	public long getPrimaryKey() {
		return _jobDocument.getPrimaryKey();
	}

	/**
	* Sets the primary key of this job document.
	*
	* @param primaryKey the primary key of this job document
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_jobDocument.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the job document ID of this job document.
	*
	* @return the job document ID of this job document
	*/
	@Override
	public long getJobDocumentId() {
		return _jobDocument.getJobDocumentId();
	}

	/**
	* Sets the job document ID of this job document.
	*
	* @param jobDocumentId the job document ID of this job document
	*/
	@Override
	public void setJobDocumentId(long jobDocumentId) {
		_jobDocument.setJobDocumentId(jobDocumentId);
	}

	/**
	* Returns the job ID of this job document.
	*
	* @return the job ID of this job document
	*/
	@Override
	public long getJobId() {
		return _jobDocument.getJobId();
	}

	/**
	* Sets the job ID of this job document.
	*
	* @param jobId the job ID of this job document
	*/
	@Override
	public void setJobId(long jobId) {
		_jobDocument.setJobId(jobId);
	}

	/**
	* Returns the document ID of this job document.
	*
	* @return the document ID of this job document
	*/
	@Override
	public long getDocumentId() {
		return _jobDocument.getDocumentId();
	}

	/**
	* Sets the document ID of this job document.
	*
	* @param documentId the document ID of this job document
	*/
	@Override
	public void setDocumentId(long documentId) {
		_jobDocument.setDocumentId(documentId);
	}

	/**
	* Returns the group ID of this job document.
	*
	* @return the group ID of this job document
	*/
	@Override
	public long getGroupId() {
		return _jobDocument.getGroupId();
	}

	/**
	* Sets the group ID of this job document.
	*
	* @param groupId the group ID of this job document
	*/
	@Override
	public void setGroupId(long groupId) {
		_jobDocument.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this job document.
	*
	* @return the company ID of this job document
	*/
	@Override
	public long getCompanyId() {
		return _jobDocument.getCompanyId();
	}

	/**
	* Sets the company ID of this job document.
	*
	* @param companyId the company ID of this job document
	*/
	@Override
	public void setCompanyId(long companyId) {
		_jobDocument.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this job document.
	*
	* @return the user ID of this job document
	*/
	@Override
	public long getUserId() {
		return _jobDocument.getUserId();
	}

	/**
	* Sets the user ID of this job document.
	*
	* @param userId the user ID of this job document
	*/
	@Override
	public void setUserId(long userId) {
		_jobDocument.setUserId(userId);
	}

	/**
	* Returns the user uuid of this job document.
	*
	* @return the user uuid of this job document
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobDocument.getUserUuid();
	}

	/**
	* Sets the user uuid of this job document.
	*
	* @param userUuid the user uuid of this job document
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_jobDocument.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this job document.
	*
	* @return the user name of this job document
	*/
	@Override
	public java.lang.String getUserName() {
		return _jobDocument.getUserName();
	}

	/**
	* Sets the user name of this job document.
	*
	* @param userName the user name of this job document
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_jobDocument.setUserName(userName);
	}

	/**
	* Returns the create date of this job document.
	*
	* @return the create date of this job document
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _jobDocument.getCreateDate();
	}

	/**
	* Sets the create date of this job document.
	*
	* @param createDate the create date of this job document
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_jobDocument.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this job document.
	*
	* @return the modified date of this job document
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _jobDocument.getModifiedDate();
	}

	/**
	* Sets the modified date of this job document.
	*
	* @param modifiedDate the modified date of this job document
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_jobDocument.setModifiedDate(modifiedDate);
	}

	@Override
	public boolean isNew() {
		return _jobDocument.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_jobDocument.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _jobDocument.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_jobDocument.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _jobDocument.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _jobDocument.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_jobDocument.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _jobDocument.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_jobDocument.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_jobDocument.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_jobDocument.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new JobDocumentWrapper((JobDocument)_jobDocument.clone());
	}

	@Override
	public int compareTo(
		edu.ucla.macroscope.emotiongraph.model.JobDocument jobDocument) {
		return _jobDocument.compareTo(jobDocument);
	}

	@Override
	public int hashCode() {
		return _jobDocument.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<edu.ucla.macroscope.emotiongraph.model.JobDocument> toCacheModel() {
		return _jobDocument.toCacheModel();
	}

	@Override
	public edu.ucla.macroscope.emotiongraph.model.JobDocument toEscapedModel() {
		return new JobDocumentWrapper(_jobDocument.toEscapedModel());
	}

	@Override
	public edu.ucla.macroscope.emotiongraph.model.JobDocument toUnescapedModel() {
		return new JobDocumentWrapper(_jobDocument.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _jobDocument.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _jobDocument.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_jobDocument.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof JobDocumentWrapper)) {
			return false;
		}

		JobDocumentWrapper jobDocumentWrapper = (JobDocumentWrapper)obj;

		if (Validator.equals(_jobDocument, jobDocumentWrapper._jobDocument)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public JobDocument getWrappedJobDocument() {
		return _jobDocument;
	}

	@Override
	public JobDocument getWrappedModel() {
		return _jobDocument;
	}

	@Override
	public void resetOriginalValues() {
		_jobDocument.resetOriginalValues();
	}

	private JobDocument _jobDocument;
}