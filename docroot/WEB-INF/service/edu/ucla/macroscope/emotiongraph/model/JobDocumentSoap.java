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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link edu.ucla.macroscope.emotiongraph.service.http.JobDocumentServiceSoap}.
 *
 * @author dave
 * @see edu.ucla.macroscope.emotiongraph.service.http.JobDocumentServiceSoap
 * @generated
 */
public class JobDocumentSoap implements Serializable {
	public static JobDocumentSoap toSoapModel(JobDocument model) {
		JobDocumentSoap soapModel = new JobDocumentSoap();

		soapModel.setJobDocumentId(model.getJobDocumentId());
		soapModel.setJobId(model.getJobId());
		soapModel.setDocumentId(model.getDocumentId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static JobDocumentSoap[] toSoapModels(JobDocument[] models) {
		JobDocumentSoap[] soapModels = new JobDocumentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static JobDocumentSoap[][] toSoapModels(JobDocument[][] models) {
		JobDocumentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new JobDocumentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new JobDocumentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static JobDocumentSoap[] toSoapModels(List<JobDocument> models) {
		List<JobDocumentSoap> soapModels = new ArrayList<JobDocumentSoap>(models.size());

		for (JobDocument model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new JobDocumentSoap[soapModels.size()]);
	}

	public JobDocumentSoap() {
	}

	public long getPrimaryKey() {
		return _jobDocumentId;
	}

	public void setPrimaryKey(long pk) {
		setJobDocumentId(pk);
	}

	public long getJobDocumentId() {
		return _jobDocumentId;
	}

	public void setJobDocumentId(long jobDocumentId) {
		_jobDocumentId = jobDocumentId;
	}

	public long getJobId() {
		return _jobId;
	}

	public void setJobId(long jobId) {
		_jobId = jobId;
	}

	public long getDocumentId() {
		return _documentId;
	}

	public void setDocumentId(long documentId) {
		_documentId = documentId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	private long _jobDocumentId;
	private long _jobId;
	private long _documentId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
}