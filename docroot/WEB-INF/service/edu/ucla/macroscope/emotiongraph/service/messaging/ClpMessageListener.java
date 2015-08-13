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

package edu.ucla.macroscope.emotiongraph.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import edu.ucla.macroscope.emotiongraph.service.ClpSerializer;
import edu.ucla.macroscope.emotiongraph.service.DictionaryLocalServiceUtil;
import edu.ucla.macroscope.emotiongraph.service.DictionaryServiceUtil;
import edu.ucla.macroscope.emotiongraph.service.JobDocumentLocalServiceUtil;
import edu.ucla.macroscope.emotiongraph.service.JobDocumentResultLocalServiceUtil;
import edu.ucla.macroscope.emotiongraph.service.JobDocumentResultServiceUtil;
import edu.ucla.macroscope.emotiongraph.service.JobDocumentServiceUtil;
import edu.ucla.macroscope.emotiongraph.service.JobLocalServiceUtil;
import edu.ucla.macroscope.emotiongraph.service.JobServiceUtil;

/**
 * @author dave
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			DictionaryLocalServiceUtil.clearService();

			DictionaryServiceUtil.clearService();
			JobLocalServiceUtil.clearService();

			JobServiceUtil.clearService();
			JobDocumentLocalServiceUtil.clearService();

			JobDocumentServiceUtil.clearService();
			JobDocumentResultLocalServiceUtil.clearService();

			JobDocumentResultServiceUtil.clearService();
		}
	}
}