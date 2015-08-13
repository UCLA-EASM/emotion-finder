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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.sql.Blob;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Dictionary}.
 * </p>
 *
 * @author dave
 * @see Dictionary
 * @generated
 */
public class DictionaryWrapper implements Dictionary, ModelWrapper<Dictionary> {
	public DictionaryWrapper(Dictionary dictionary) {
		_dictionary = dictionary;
	}

	@Override
	public Class<?> getModelClass() {
		return Dictionary.class;
	}

	@Override
	public String getModelClassName() {
		return Dictionary.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dictionaryId", getDictionaryId());
		attributes.put("name", getName());
		attributes.put("language", getLanguage());
		attributes.put("description", getDescription());
		attributes.put("contents", getContents());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dictionaryId = (Long)attributes.get("dictionaryId");

		if (dictionaryId != null) {
			setDictionaryId(dictionaryId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String language = (String)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Blob contents = (Blob)attributes.get("contents");

		if (contents != null) {
			setContents(contents);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	/**
	* Returns the primary key of this dictionary.
	*
	* @return the primary key of this dictionary
	*/
	@Override
	public long getPrimaryKey() {
		return _dictionary.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dictionary.
	*
	* @param primaryKey the primary key of this dictionary
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dictionary.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the dictionary ID of this dictionary.
	*
	* @return the dictionary ID of this dictionary
	*/
	@Override
	public long getDictionaryId() {
		return _dictionary.getDictionaryId();
	}

	/**
	* Sets the dictionary ID of this dictionary.
	*
	* @param dictionaryId the dictionary ID of this dictionary
	*/
	@Override
	public void setDictionaryId(long dictionaryId) {
		_dictionary.setDictionaryId(dictionaryId);
	}

	/**
	* Returns the name of this dictionary.
	*
	* @return the name of this dictionary
	*/
	@Override
	public java.lang.String getName() {
		return _dictionary.getName();
	}

	/**
	* Sets the name of this dictionary.
	*
	* @param name the name of this dictionary
	*/
	@Override
	public void setName(java.lang.String name) {
		_dictionary.setName(name);
	}

	/**
	* Returns the language of this dictionary.
	*
	* @return the language of this dictionary
	*/
	@Override
	public java.lang.String getLanguage() {
		return _dictionary.getLanguage();
	}

	/**
	* Sets the language of this dictionary.
	*
	* @param language the language of this dictionary
	*/
	@Override
	public void setLanguage(java.lang.String language) {
		_dictionary.setLanguage(language);
	}

	/**
	* Returns the description of this dictionary.
	*
	* @return the description of this dictionary
	*/
	@Override
	public java.lang.String getDescription() {
		return _dictionary.getDescription();
	}

	/**
	* Sets the description of this dictionary.
	*
	* @param description the description of this dictionary
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_dictionary.setDescription(description);
	}

	/**
	* Returns the contents of this dictionary.
	*
	* @return the contents of this dictionary
	*/
	@Override
	public java.sql.Blob getContents() {
		return _dictionary.getContents();
	}

	/**
	* Sets the contents of this dictionary.
	*
	* @param contents the contents of this dictionary
	*/
	@Override
	public void setContents(java.sql.Blob contents) {
		_dictionary.setContents(contents);
	}

	/**
	* Returns the group ID of this dictionary.
	*
	* @return the group ID of this dictionary
	*/
	@Override
	public long getGroupId() {
		return _dictionary.getGroupId();
	}

	/**
	* Sets the group ID of this dictionary.
	*
	* @param groupId the group ID of this dictionary
	*/
	@Override
	public void setGroupId(long groupId) {
		_dictionary.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this dictionary.
	*
	* @return the company ID of this dictionary
	*/
	@Override
	public long getCompanyId() {
		return _dictionary.getCompanyId();
	}

	/**
	* Sets the company ID of this dictionary.
	*
	* @param companyId the company ID of this dictionary
	*/
	@Override
	public void setCompanyId(long companyId) {
		_dictionary.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this dictionary.
	*
	* @return the user ID of this dictionary
	*/
	@Override
	public long getUserId() {
		return _dictionary.getUserId();
	}

	/**
	* Sets the user ID of this dictionary.
	*
	* @param userId the user ID of this dictionary
	*/
	@Override
	public void setUserId(long userId) {
		_dictionary.setUserId(userId);
	}

	/**
	* Returns the user uuid of this dictionary.
	*
	* @return the user uuid of this dictionary
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictionary.getUserUuid();
	}

	/**
	* Sets the user uuid of this dictionary.
	*
	* @param userUuid the user uuid of this dictionary
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_dictionary.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this dictionary.
	*
	* @return the user name of this dictionary
	*/
	@Override
	public java.lang.String getUserName() {
		return _dictionary.getUserName();
	}

	/**
	* Sets the user name of this dictionary.
	*
	* @param userName the user name of this dictionary
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_dictionary.setUserName(userName);
	}

	/**
	* Returns the create date of this dictionary.
	*
	* @return the create date of this dictionary
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _dictionary.getCreateDate();
	}

	/**
	* Sets the create date of this dictionary.
	*
	* @param createDate the create date of this dictionary
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_dictionary.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this dictionary.
	*
	* @return the modified date of this dictionary
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dictionary.getModifiedDate();
	}

	/**
	* Sets the modified date of this dictionary.
	*
	* @param modifiedDate the modified date of this dictionary
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dictionary.setModifiedDate(modifiedDate);
	}

	@Override
	public boolean isNew() {
		return _dictionary.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dictionary.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dictionary.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dictionary.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dictionary.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dictionary.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dictionary.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dictionary.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dictionary.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dictionary.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dictionary.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DictionaryWrapper((Dictionary)_dictionary.clone());
	}

	@Override
	public int compareTo(
		edu.ucla.macroscope.emotiongraph.model.Dictionary dictionary) {
		return _dictionary.compareTo(dictionary);
	}

	@Override
	public int hashCode() {
		return _dictionary.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<edu.ucla.macroscope.emotiongraph.model.Dictionary> toCacheModel() {
		return _dictionary.toCacheModel();
	}

	@Override
	public edu.ucla.macroscope.emotiongraph.model.Dictionary toEscapedModel() {
		return new DictionaryWrapper(_dictionary.toEscapedModel());
	}

	@Override
	public edu.ucla.macroscope.emotiongraph.model.Dictionary toUnescapedModel() {
		return new DictionaryWrapper(_dictionary.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dictionary.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dictionary.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dictionary.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DictionaryWrapper)) {
			return false;
		}

		DictionaryWrapper dictionaryWrapper = (DictionaryWrapper)obj;

		if (Validator.equals(_dictionary, dictionaryWrapper._dictionary)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Dictionary getWrappedDictionary() {
		return _dictionary;
	}

	@Override
	public Dictionary getWrappedModel() {
		return _dictionary;
	}

	@Override
	public void resetOriginalValues() {
		_dictionary.resetOriginalValues();
	}

	private Dictionary _dictionary;
}