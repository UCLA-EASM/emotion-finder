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

import java.sql.Blob;

/**
 * The Blob model class for lazy loading the contents column in Dictionary.
 *
 * @author dave
 * @see Dictionary
 * @generated
 */
public class DictionaryContentsBlobModel {
	public DictionaryContentsBlobModel() {
	}

	public DictionaryContentsBlobModel(long dictionaryId) {
		_dictionaryId = dictionaryId;
	}

	public DictionaryContentsBlobModel(long dictionaryId, Blob contentsBlob) {
		_dictionaryId = dictionaryId;
		_contentsBlob = contentsBlob;
	}

	public long getDictionaryId() {
		return _dictionaryId;
	}

	public void setDictionaryId(long dictionaryId) {
		_dictionaryId = dictionaryId;
	}

	public Blob getContentsBlob() {
		return _contentsBlob;
	}

	public void setContentsBlob(Blob contentsBlob) {
		_contentsBlob = contentsBlob;
	}

	private long _dictionaryId;
	private Blob _contentsBlob;
}