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
 * This class is a wrapper for {@link JobDocumentResult}.
 * </p>
 *
 * @author dave
 * @see JobDocumentResult
 * @generated
 */
public class JobDocumentResultWrapper implements JobDocumentResult,
	ModelWrapper<JobDocumentResult> {
	public JobDocumentResultWrapper(JobDocumentResult jobDocumentResult) {
		_jobDocumentResult = jobDocumentResult;
	}

	@Override
	public Class<?> getModelClass() {
		return JobDocumentResult.class;
	}

	@Override
	public String getModelClassName() {
		return JobDocumentResult.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("jobDocumentResultId", getJobDocumentResultId());
		attributes.put("jobId", getJobId());
		attributes.put("documentId", getDocumentId());
		attributes.put("lineNo", getLineNo());
		attributes.put("word", getWord());
		attributes.put("count", getCount());
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
		Long jobDocumentResultId = (Long)attributes.get("jobDocumentResultId");

		if (jobDocumentResultId != null) {
			setJobDocumentResultId(jobDocumentResultId);
		}

		Long jobId = (Long)attributes.get("jobId");

		if (jobId != null) {
			setJobId(jobId);
		}

		Long documentId = (Long)attributes.get("documentId");

		if (documentId != null) {
			setDocumentId(documentId);
		}

		Long lineNo = (Long)attributes.get("lineNo");

		if (lineNo != null) {
			setLineNo(lineNo);
		}

		String word = (String)attributes.get("word");

		if (word != null) {
			setWord(word);
		}

		Long count = (Long)attributes.get("count");

		if (count != null) {
			setCount(count);
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
	* Returns the primary key of this job document result.
	*
	* @return the primary key of this job document result
	*/
	@Override
	public long getPrimaryKey() {
		return _jobDocumentResult.getPrimaryKey();
	}

	/**
	* Sets the primary key of this job document result.
	*
	* @param primaryKey the primary key of this job document result
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_jobDocumentResult.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the job document result ID of this job document result.
	*
	* @return the job document result ID of this job document result
	*/
	@Override
	public long getJobDocumentResultId() {
		return _jobDocumentResult.getJobDocumentResultId();
	}

	/**
	* Sets the job document result ID of this job document result.
	*
	* @param jobDocumentResultId the job document result ID of this job document result
	*/
	@Override
	public void setJobDocumentResultId(long jobDocumentResultId) {
		_jobDocumentResult.setJobDocumentResultId(jobDocumentResultId);
	}

	/**
	* Returns the job ID of this job document result.
	*
	* @return the job ID of this job document result
	*/
	@Override
	public long getJobId() {
		return _jobDocumentResult.getJobId();
	}

	/**
	* Sets the job ID of this job document result.
	*
	* @param jobId the job ID of this job document result
	*/
	@Override
	public void setJobId(long jobId) {
		_jobDocumentResult.setJobId(jobId);
	}

	/**
	* Returns the document ID of this job document result.
	*
	* @return the document ID of this job document result
	*/
	@Override
	public long getDocumentId() {
		return _jobDocumentResult.getDocumentId();
	}

	/**
	* Sets the document ID of this job document result.
	*
	* @param documentId the document ID of this job document result
	*/
	@Override
	public void setDocumentId(long documentId) {
		_jobDocumentResult.setDocumentId(documentId);
	}

	/**
	* Returns the line no of this job document result.
	*
	* @return the line no of this job document result
	*/
	@Override
	public long getLineNo() {
		return _jobDocumentResult.getLineNo();
	}

	/**
	* Sets the line no of this job document result.
	*
	* @param lineNo the line no of this job document result
	*/
	@Override
	public void setLineNo(long lineNo) {
		_jobDocumentResult.setLineNo(lineNo);
	}

	/**
	* Returns the word of this job document result.
	*
	* @return the word of this job document result
	*/
	@Override
	public java.lang.String getWord() {
		return _jobDocumentResult.getWord();
	}

	/**
	* Sets the word of this job document result.
	*
	* @param word the word of this job document result
	*/
	@Override
	public void setWord(java.lang.String word) {
		_jobDocumentResult.setWord(word);
	}

	/**
	* Returns the count of this job document result.
	*
	* @return the count of this job document result
	*/
	@Override
	public long getCount() {
		return _jobDocumentResult.getCount();
	}

	/**
	* Sets the count of this job document result.
	*
	* @param count the count of this job document result
	*/
	@Override
	public void setCount(long count) {
		_jobDocumentResult.setCount(count);
	}

	/**
	* Returns the group ID of this job document result.
	*
	* @return the group ID of this job document result
	*/
	@Override
	public long getGroupId() {
		return _jobDocumentResult.getGroupId();
	}

	/**
	* Sets the group ID of this job document result.
	*
	* @param groupId the group ID of this job document result
	*/
	@Override
	public void setGroupId(long groupId) {
		_jobDocumentResult.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this job document result.
	*
	* @return the company ID of this job document result
	*/
	@Override
	public long getCompanyId() {
		return _jobDocumentResult.getCompanyId();
	}

	/**
	* Sets the company ID of this job document result.
	*
	* @param companyId the company ID of this job document result
	*/
	@Override
	public void setCompanyId(long companyId) {
		_jobDocumentResult.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this job document result.
	*
	* @return the user ID of this job document result
	*/
	@Override
	public long getUserId() {
		return _jobDocumentResult.getUserId();
	}

	/**
	* Sets the user ID of this job document result.
	*
	* @param userId the user ID of this job document result
	*/
	@Override
	public void setUserId(long userId) {
		_jobDocumentResult.setUserId(userId);
	}

	/**
	* Returns the user uuid of this job document result.
	*
	* @return the user uuid of this job document result
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobDocumentResult.getUserUuid();
	}

	/**
	* Sets the user uuid of this job document result.
	*
	* @param userUuid the user uuid of this job document result
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_jobDocumentResult.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this job document result.
	*
	* @return the user name of this job document result
	*/
	@Override
	public java.lang.String getUserName() {
		return _jobDocumentResult.getUserName();
	}

	/**
	* Sets the user name of this job document result.
	*
	* @param userName the user name of this job document result
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_jobDocumentResult.setUserName(userName);
	}

	/**
	* Returns the create date of this job document result.
	*
	* @return the create date of this job document result
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _jobDocumentResult.getCreateDate();
	}

	/**
	* Sets the create date of this job document result.
	*
	* @param createDate the create date of this job document result
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_jobDocumentResult.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this job document result.
	*
	* @return the modified date of this job document result
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _jobDocumentResult.getModifiedDate();
	}

	/**
	* Sets the modified date of this job document result.
	*
	* @param modifiedDate the modified date of this job document result
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_jobDocumentResult.setModifiedDate(modifiedDate);
	}

	@Override
	public boolean isNew() {
		return _jobDocumentResult.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_jobDocumentResult.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _jobDocumentResult.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_jobDocumentResult.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _jobDocumentResult.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _jobDocumentResult.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_jobDocumentResult.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _jobDocumentResult.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_jobDocumentResult.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_jobDocumentResult.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_jobDocumentResult.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new JobDocumentResultWrapper((JobDocumentResult)_jobDocumentResult.clone());
	}

	@Override
	public int compareTo(
		edu.ucla.macroscope.emotiongraph.model.JobDocumentResult jobDocumentResult) {
		return _jobDocumentResult.compareTo(jobDocumentResult);
	}

	@Override
	public int hashCode() {
		return _jobDocumentResult.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<edu.ucla.macroscope.emotiongraph.model.JobDocumentResult> toCacheModel() {
		return _jobDocumentResult.toCacheModel();
	}

	@Override
	public edu.ucla.macroscope.emotiongraph.model.JobDocumentResult toEscapedModel() {
		return new JobDocumentResultWrapper(_jobDocumentResult.toEscapedModel());
	}

	@Override
	public edu.ucla.macroscope.emotiongraph.model.JobDocumentResult toUnescapedModel() {
		return new JobDocumentResultWrapper(_jobDocumentResult.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _jobDocumentResult.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _jobDocumentResult.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_jobDocumentResult.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof JobDocumentResultWrapper)) {
			return false;
		}

		JobDocumentResultWrapper jobDocumentResultWrapper = (JobDocumentResultWrapper)obj;

		if (Validator.equals(_jobDocumentResult,
					jobDocumentResultWrapper._jobDocumentResult)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public JobDocumentResult getWrappedJobDocumentResult() {
		return _jobDocumentResult;
	}

	@Override
	public JobDocumentResult getWrappedModel() {
		return _jobDocumentResult;
	}

	@Override
	public void resetOriginalValues() {
		_jobDocumentResult.resetOriginalValues();
	}

	private JobDocumentResult _jobDocumentResult;
}