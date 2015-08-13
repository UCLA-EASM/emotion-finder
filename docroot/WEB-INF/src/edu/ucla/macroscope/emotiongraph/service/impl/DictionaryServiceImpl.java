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

package edu.ucla.macroscope.emotiongraph.service.impl;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.jdbc.OutputBlob;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;

import edu.ucla.macroscope.emotiongraph.service.base.DictionaryServiceBaseImpl;
import edu.ucla.macroscope.emotiongraph.model.Dictionary;
import edu.ucla.macroscope.emotiongraph.service.DictionaryLocalServiceUtil;

/**
 * The implementation of the dictionary remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link edu.ucla.macroscope.emotiongraph.service.DictionaryService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author dave
 * @see edu.ucla.macroscope.emotiongraph.service.base.DictionaryServiceBaseImpl
 * @see edu.ucla.macroscope.emotiongraph.service.DictionaryServiceUtil
 */
public class DictionaryServiceImpl extends DictionaryServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link edu.ucla.macroscope.emotiongraph.service.DictionaryServiceUtil} to access the dictionary remote service.
	 */
    
    @JSONWebService(method="POST")
    public Dictionary upload(File file, String name, String description) throws SystemException {
        Dictionary dictionary = DictionaryLocalServiceUtil.createDictionary(CounterLocalServiceUtil.increment());
        OutputBlob contentBlob;
        dictionary.setName(name);
        dictionary.setDescription(description);
        Date createdDate = new Date();
        dictionary.setCreateDate(createdDate);
        dictionary.setModifiedDate(createdDate);
        
        try {
            contentBlob = new OutputBlob(new FileInputStream(file), file.length());
            dictionary.setContents(contentBlob);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        DictionaryLocalServiceUtil.addDictionary(dictionary);
        
        return dictionary;
    }
    
    @JSONWebService(method="GET")
    public List<Dictionary> get() throws SystemException {
        List<Dictionary> dictionaries = DictionaryLocalServiceUtil.getDictionaries(1, 20);
        
        return dictionaries;
    }
    
    @JSONWebService(method="GET")
    public List<Dictionary> get(int start, int end) throws SystemException {
        List<Dictionary> dictionaries = DictionaryLocalServiceUtil.getDictionaries(start, end);
        return dictionaries;
    }
    
    @JSONWebService(method="GET")
    public String download(long id) throws PortalException, SystemException {
        Dictionary dictionary = DictionaryLocalServiceUtil.getDictionary(id);
        String output = "";
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        
        InputStream in;
        try {
            in = dictionary.getContents().getBinaryStream();
            
            int n = 0;
            while ((n = in.read(buf)) >= 0) {
                baos.write(buf, 0, n);
            }
            in.close();
            byte[] bytes = baos.toByteArray();
            output = new String(bytes);
        }
        catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return output;
        
    }
    
}