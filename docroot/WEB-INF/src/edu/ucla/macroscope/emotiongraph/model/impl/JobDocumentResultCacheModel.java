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

import edu.ucla.macroscope.emotiongraph.model.JobDocumentResult;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JobDocumentResult in entity cache.
 *
 * @author dave
 * @see JobDocumentResult
 * @generated
 */
public class JobDocumentResultCacheModel implements CacheModel<JobDocumentResult>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{jobDocumentResultId=");
		sb.append(jobDocumentResultId);
		sb.append(", jobId=");
		sb.append(jobId);
		sb.append(", documentId=");
		sb.append(documentId);
		sb.append(", lineNo=");
		sb.append(lineNo);
		sb.append(", word=");
		sb.append(word);
		sb.append(", count=");
		sb.append(count);
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
	public JobDocumentResult toEntityModel() {
		JobDocumentResultImpl jobDocumentResultImpl = new JobDocumentResultImpl();

		jobDocumentResultImpl.setJobDocumentResultId(jobDocumentResultId);
		jobDocumentResultImpl.setJobId(jobId);
		jobDocumentResultImpl.setDocumentId(documentId);
		jobDocumentResultImpl.setLineNo(lineNo);

		if (word == null) {
			jobDocumentResultImpl.setWord(StringPool.BLANK);
		}
		else {
			jobDocumentResultImpl.setWord(word);
		}

		jobDocumentResultImpl.setCount(count);
		jobDocumentResultImpl.setGroupId(groupId);
		jobDocumentResultImpl.setCompanyId(companyId);
		jobDocumentResultImpl.setUserId(userId);

		if (userName == null) {
			jobDocumentResultImpl.setUserName(StringPool.BLANK);
		}
		else {
			jobDocumentResultImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jobDocumentResultImpl.setCreateDate(null);
		}
		else {
			jobDocumentResultImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jobDocumentResultImpl.setModifiedDate(null);
		}
		else {
			jobDocumentResultImpl.setModifiedDate(new Date(modifiedDate));
		}

		jobDocumentResultImpl.resetOriginalValues();

		return jobDocumentResultImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		jobDocumentResultId = objectInput.readLong();
		jobId = objectInput.readLong();
		documentId = objectInput.readLong();
		lineNo = objectInput.readLong();
		word = objectInput.readUTF();
		count = objectInput.readLong();
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
		objectOutput.writeLong(jobDocumentResultId);
		objectOutput.writeLong(jobId);
		objectOutput.writeLong(documentId);
		objectOutput.writeLong(lineNo);

		if (word == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(word);
		}

		objectOutput.writeLong(count);
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

	public long jobDocumentResultId;
	public long jobId;
	public long documentId;
	public long lineNo;
	public String word;
	public long count;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
}