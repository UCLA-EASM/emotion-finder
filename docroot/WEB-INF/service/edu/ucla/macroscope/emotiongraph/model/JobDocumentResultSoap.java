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
 * This class is used by SOAP remote services, specifically {@link edu.ucla.macroscope.emotiongraph.service.http.JobDocumentResultServiceSoap}.
 *
 * @author dave
 * @see edu.ucla.macroscope.emotiongraph.service.http.JobDocumentResultServiceSoap
 * @generated
 */
public class JobDocumentResultSoap implements Serializable {
	public static JobDocumentResultSoap toSoapModel(JobDocumentResult model) {
		JobDocumentResultSoap soapModel = new JobDocumentResultSoap();

		soapModel.setJobDocumentResultId(model.getJobDocumentResultId());
		soapModel.setJobId(model.getJobId());
		soapModel.setDocumentId(model.getDocumentId());
		soapModel.setLineNo(model.getLineNo());
		soapModel.setWord(model.getWord());
		soapModel.setCount(model.getCount());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static JobDocumentResultSoap[] toSoapModels(
		JobDocumentResult[] models) {
		JobDocumentResultSoap[] soapModels = new JobDocumentResultSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static JobDocumentResultSoap[][] toSoapModels(
		JobDocumentResult[][] models) {
		JobDocumentResultSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new JobDocumentResultSoap[models.length][models[0].length];
		}
		else {
			soapModels = new JobDocumentResultSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static JobDocumentResultSoap[] toSoapModels(
		List<JobDocumentResult> models) {
		List<JobDocumentResultSoap> soapModels = new ArrayList<JobDocumentResultSoap>(models.size());

		for (JobDocumentResult model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new JobDocumentResultSoap[soapModels.size()]);
	}

	public JobDocumentResultSoap() {
	}

	public long getPrimaryKey() {
		return _jobDocumentResultId;
	}

	public void setPrimaryKey(long pk) {
		setJobDocumentResultId(pk);
	}

	public long getJobDocumentResultId() {
		return _jobDocumentResultId;
	}

	public void setJobDocumentResultId(long jobDocumentResultId) {
		_jobDocumentResultId = jobDocumentResultId;
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

	public long getLineNo() {
		return _lineNo;
	}

	public void setLineNo(long lineNo) {
		_lineNo = lineNo;
	}

	public String getWord() {
		return _word;
	}

	public void setWord(String word) {
		_word = word;
	}

	public long getCount() {
		return _count;
	}

	public void setCount(long count) {
		_count = count;
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

	private long _jobDocumentResultId;
	private long _jobId;
	private long _documentId;
	private long _lineNo;
	private String _word;
	private long _count;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
}