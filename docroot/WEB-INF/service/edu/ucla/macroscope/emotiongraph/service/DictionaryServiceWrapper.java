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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DictionaryService}.
 *
 * @author dave
 * @see DictionaryService
 * @generated
 */
public class DictionaryServiceWrapper implements DictionaryService,
	ServiceWrapper<DictionaryService> {
	public DictionaryServiceWrapper(DictionaryService dictionaryService) {
		_dictionaryService = dictionaryService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dictionaryService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dictionaryService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dictionaryService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public edu.ucla.macroscope.emotiongraph.model.Dictionary upload(
		java.io.File file, java.lang.String name, java.lang.String description)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictionaryService.upload(file, name, description);
	}

	@Override
	public java.util.List<edu.ucla.macroscope.emotiongraph.model.Dictionary> get()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictionaryService.get();
	}

	@Override
	public java.util.List<edu.ucla.macroscope.emotiongraph.model.Dictionary> get(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictionaryService.get(start, end);
	}

	@Override
	public java.lang.String download(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictionaryService.download(id);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DictionaryService getWrappedDictionaryService() {
		return _dictionaryService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDictionaryService(DictionaryService dictionaryService) {
		_dictionaryService = dictionaryService;
	}

	@Override
	public DictionaryService getWrappedService() {
		return _dictionaryService;
	}

	@Override
	public void setWrappedService(DictionaryService dictionaryService) {
		_dictionaryService = dictionaryService;
	}

	private DictionaryService _dictionaryService;
}