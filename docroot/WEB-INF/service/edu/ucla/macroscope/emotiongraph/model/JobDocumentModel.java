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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the JobDocument service. Represents a row in the &quot;EmotionGraph_JobDocument&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link edu.ucla.macroscope.emotiongraph.model.impl.JobDocumentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link edu.ucla.macroscope.emotiongraph.model.impl.JobDocumentImpl}.
 * </p>
 *
 * @author dave
 * @see JobDocument
 * @see edu.ucla.macroscope.emotiongraph.model.impl.JobDocumentImpl
 * @see edu.ucla.macroscope.emotiongraph.model.impl.JobDocumentModelImpl
 * @generated
 */
public interface JobDocumentModel extends BaseModel<JobDocument>, GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a job document model instance should use the {@link JobDocument} interface instead.
	 */

	/**
	 * Returns the primary key of this job document.
	 *
	 * @return the primary key of this job document
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this job document.
	 *
	 * @param primaryKey the primary key of this job document
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the job document ID of this job document.
	 *
	 * @return the job document ID of this job document
	 */
	public long getJobDocumentId();

	/**
	 * Sets the job document ID of this job document.
	 *
	 * @param jobDocumentId the job document ID of this job document
	 */
	public void setJobDocumentId(long jobDocumentId);

	/**
	 * Returns the job ID of this job document.
	 *
	 * @return the job ID of this job document
	 */
	public long getJobId();

	/**
	 * Sets the job ID of this job document.
	 *
	 * @param jobId the job ID of this job document
	 */
	public void setJobId(long jobId);

	/**
	 * Returns the document ID of this job document.
	 *
	 * @return the document ID of this job document
	 */
	public long getDocumentId();

	/**
	 * Sets the document ID of this job document.
	 *
	 * @param documentId the document ID of this job document
	 */
	public void setDocumentId(long documentId);

	/**
	 * Returns the group ID of this job document.
	 *
	 * @return the group ID of this job document
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this job document.
	 *
	 * @param groupId the group ID of this job document
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this job document.
	 *
	 * @return the company ID of this job document
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this job document.
	 *
	 * @param companyId the company ID of this job document
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this job document.
	 *
	 * @return the user ID of this job document
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this job document.
	 *
	 * @param userId the user ID of this job document
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this job document.
	 *
	 * @return the user uuid of this job document
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this job document.
	 *
	 * @param userUuid the user uuid of this job document
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this job document.
	 *
	 * @return the user name of this job document
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this job document.
	 *
	 * @param userName the user name of this job document
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this job document.
	 *
	 * @return the create date of this job document
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this job document.
	 *
	 * @param createDate the create date of this job document
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this job document.
	 *
	 * @return the modified date of this job document
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this job document.
	 *
	 * @param modifiedDate the modified date of this job document
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(JobDocument jobDocument);

	@Override
	public int hashCode();

	@Override
	public CacheModel<JobDocument> toCacheModel();

	@Override
	public JobDocument toEscapedModel();

	@Override
	public JobDocument toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}