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

package edu.ucla.macroscope.emotiongraph.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Dictionary. This utility wraps
 * {@link edu.ucla.macroscope.emotiongraph.service.impl.DictionaryServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author dave
 * @see DictionaryService
 * @see edu.ucla.macroscope.emotiongraph.service.base.DictionaryServiceBaseImpl
 * @see edu.ucla.macroscope.emotiongraph.service.impl.DictionaryServiceImpl
 * @generated
 */
public class DictionaryServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link edu.ucla.macroscope.emotiongraph.service.impl.DictionaryServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static edu.ucla.macroscope.emotiongraph.model.Dictionary upload(
		java.io.File file, java.lang.String name, java.lang.String description)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().upload(file, name, description);
	}

	public static java.util.List<edu.ucla.macroscope.emotiongraph.model.Dictionary> get()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().get();
	}

	public static java.util.List<edu.ucla.macroscope.emotiongraph.model.Dictionary> get(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().get(start, end);
	}

	public static java.lang.String download(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().download(id);
	}

	public static void clearService() {
		_service = null;
	}

	public static DictionaryService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DictionaryService.class.getName());

			if (invokableService instanceof DictionaryService) {
				_service = (DictionaryService)invokableService;
			}
			else {
				_service = new DictionaryServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(DictionaryServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DictionaryService service) {
	}

	private static DictionaryService _service;
}