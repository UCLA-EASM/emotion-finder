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

package edu.ucla.macroscope.emotiongraph.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import edu.ucla.macroscope.emotiongraph.model.JobDocument;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JobDocument in entity cache.
 *
 * @author dave
 * @see JobDocument
 * @generated
 */
public class JobDocumentCacheModel implements CacheModel<JobDocument>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{jobDocumentId=");
		sb.append(jobDocumentId);
		sb.append(", jobId=");
		sb.append(jobId);
		sb.append(", documentId=");
		sb.append(documentId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JobDocument toEntityModel() {
		JobDocumentImpl jobDocumentImpl = new JobDocumentImpl();

		jobDocumentImpl.setJobDocumentId(jobDocumentId);
		jobDocumentImpl.setJobId(jobId);
		jobDocumentImpl.setDocumentId(documentId);
		jobDocumentImpl.setGroupId(groupId);
		jobDocumentImpl.setCompanyId(companyId);
		jobDocumentImpl.setUserId(userId);

		if (userName == null) {
			jobDocumentImpl.setUserName(StringPool.BLANK);
		}
		else {
			jobDocumentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jobDocumentImpl.setCreateDate(null);
		}
		else {
			jobDocumentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jobDocumentImpl.setModifiedDate(null);
		}
		else {
			jobDocumentImpl.setModifiedDate(new Date(modifiedDate));
		}

		jobDocumentImpl.resetOriginalValues();

		return jobDocumentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		jobDocumentId = objectInput.readLong();
		jobId = objectInput.readLong();
		documentId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(jobDocumentId);
		objectOutput.writeLong(jobId);
		objectOutput.writeLong(documentId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public long jobDocumentId;
	public long jobId;
	public long documentId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
}