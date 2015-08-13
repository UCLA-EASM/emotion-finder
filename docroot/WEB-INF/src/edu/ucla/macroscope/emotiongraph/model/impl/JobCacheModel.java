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

import edu.ucla.macroscope.emotiongraph.model.Job;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Job in entity cache.
 *
 * @author dave
 * @see Job
 * @generated
 */
public class JobCacheModel implements CacheModel<Job>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{jobId=");
		sb.append(jobId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", dictionaryId=");
		sb.append(dictionaryId);
		sb.append(", status=");
		sb.append(status);
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
	public Job toEntityModel() {
		JobImpl jobImpl = new JobImpl();

		jobImpl.setJobId(jobId);

		if (name == null) {
			jobImpl.setName(StringPool.BLANK);
		}
		else {
			jobImpl.setName(name);
		}

		jobImpl.setDictionaryId(dictionaryId);
		jobImpl.setStatus(status);
		jobImpl.setGroupId(groupId);
		jobImpl.setCompanyId(companyId);
		jobImpl.setUserId(userId);

		if (userName == null) {
			jobImpl.setUserName(StringPool.BLANK);
		}
		else {
			jobImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jobImpl.setCreateDate(null);
		}
		else {
			jobImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jobImpl.setModifiedDate(null);
		}
		else {
			jobImpl.setModifiedDate(new Date(modifiedDate));
		}

		jobImpl.resetOriginalValues();

		return jobImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		jobId = objectInput.readLong();
		name = objectInput.readUTF();
		dictionaryId = objectInput.readLong();
		status = objectInput.readLong();
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
		objectOutput.writeLong(jobId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeLong(dictionaryId);
		objectOutput.writeLong(status);
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

	public long jobId;
	public String name;
	public long dictionaryId;
	public long status;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
}