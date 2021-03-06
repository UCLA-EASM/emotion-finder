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

import com.liferay.portal.kernel.exception.SystemException;

import edu.ucla.macroscope.emotiongraph.model.JobDocumentResult;
import edu.ucla.macroscope.emotiongraph.service.JobDocumentResultLocalServiceUtil;

/**
 * The extended model base implementation for the JobDocumentResult service. Represents a row in the &quot;EmotionGraph_JobDocumentResult&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link JobDocumentResultImpl}.
 * </p>
 *
 * @author dave
 * @see JobDocumentResultImpl
 * @see edu.ucla.macroscope.emotiongraph.model.JobDocumentResult
 * @generated
 */
public abstract class JobDocumentResultBaseImpl
	extends JobDocumentResultModelImpl implements JobDocumentResult {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a job document result model instance should use the {@link JobDocumentResult} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			JobDocumentResultLocalServiceUtil.addJobDocumentResult(this);
		}
		else {
			JobDocumentResultLocalServiceUtil.updateJobDocumentResult(this);
		}
	}
}