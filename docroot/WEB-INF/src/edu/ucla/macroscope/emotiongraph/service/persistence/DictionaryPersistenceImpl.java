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

package edu.ucla.macroscope.emotiongraph.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import edu.ucla.macroscope.emotiongraph.NoSuchDictionaryException;
import edu.ucla.macroscope.emotiongraph.model.Dictionary;
import edu.ucla.macroscope.emotiongraph.model.impl.DictionaryImpl;
import edu.ucla.macroscope.emotiongraph.model.impl.DictionaryModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dictionary service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author dave
 * @see DictionaryPersistence
 * @see DictionaryUtil
 * @generated
 */
public class DictionaryPersistenceImpl extends BasePersistenceImpl<Dictionary>
	implements DictionaryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DictionaryUtil} to access the dictionary persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DictionaryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DictionaryModelImpl.ENTITY_CACHE_ENABLED,
			DictionaryModelImpl.FINDER_CACHE_ENABLED, DictionaryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DictionaryModelImpl.ENTITY_CACHE_ENABLED,
			DictionaryModelImpl.FINDER_CACHE_ENABLED, DictionaryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DictionaryModelImpl.ENTITY_CACHE_ENABLED,
			DictionaryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DictionaryPersistenceImpl() {
		setModelClass(Dictionary.class);
	}

	/**
	 * Caches the dictionary in the entity cache if it is enabled.
	 *
	 * @param dictionary the dictionary
	 */
	@Override
	public void cacheResult(Dictionary dictionary) {
		EntityCacheUtil.putResult(DictionaryModelImpl.ENTITY_CACHE_ENABLED,
			DictionaryImpl.class, dictionary.getPrimaryKey(), dictionary);

		dictionary.resetOriginalValues();
	}

	/**
	 * Caches the dictionaries in the entity cache if it is enabled.
	 *
	 * @param dictionaries the dictionaries
	 */
	@Override
	public void cacheResult(List<Dictionary> dictionaries) {
		for (Dictionary dictionary : dictionaries) {
			if (EntityCacheUtil.getResult(
						DictionaryModelImpl.ENTITY_CACHE_ENABLED,
						DictionaryImpl.class, dictionary.getPrimaryKey()) == null) {
				cacheResult(dictionary);
			}
			else {
				dictionary.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dictionaries.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DictionaryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DictionaryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dictionary.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Dictionary dictionary) {
		EntityCacheUtil.removeResult(DictionaryModelImpl.ENTITY_CACHE_ENABLED,
			DictionaryImpl.class, dictionary.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Dictionary> dictionaries) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Dictionary dictionary : dictionaries) {
			EntityCacheUtil.removeResult(DictionaryModelImpl.ENTITY_CACHE_ENABLED,
				DictionaryImpl.class, dictionary.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dictionary with the primary key. Does not add the dictionary to the database.
	 *
	 * @param dictionaryId the primary key for the new dictionary
	 * @return the new dictionary
	 */
	@Override
	public Dictionary create(long dictionaryId) {
		Dictionary dictionary = new DictionaryImpl();

		dictionary.setNew(true);
		dictionary.setPrimaryKey(dictionaryId);

		return dictionary;
	}

	/**
	 * Removes the dictionary with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dictionaryId the primary key of the dictionary
	 * @return the dictionary that was removed
	 * @throws edu.ucla.macroscope.emotiongraph.NoSuchDictionaryException if a dictionary with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Dictionary remove(long dictionaryId)
		throws NoSuchDictionaryException, SystemException {
		return remove((Serializable)dictionaryId);
	}

	/**
	 * Removes the dictionary with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dictionary
	 * @return the dictionary that was removed
	 * @throws edu.ucla.macroscope.emotiongraph.NoSuchDictionaryException if a dictionary with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Dictionary remove(Serializable primaryKey)
		throws NoSuchDictionaryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Dictionary dictionary = (Dictionary)session.get(DictionaryImpl.class,
					primaryKey);

			if (dictionary == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDictionaryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dictionary);
		}
		catch (NoSuchDictionaryException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Dictionary removeImpl(Dictionary dictionary)
		throws SystemException {
		dictionary = toUnwrappedModel(dictionary);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dictionary)) {
				dictionary = (Dictionary)session.get(DictionaryImpl.class,
						dictionary.getPrimaryKeyObj());
			}

			if (dictionary != null) {
				session.delete(dictionary);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dictionary != null) {
			clearCache(dictionary);
		}

		return dictionary;
	}

	@Override
	public Dictionary updateImpl(
		edu.ucla.macroscope.emotiongraph.model.Dictionary dictionary)
		throws SystemException {
		dictionary = toUnwrappedModel(dictionary);

		boolean isNew = dictionary.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dictionary.isNew()) {
				session.save(dictionary);

				dictionary.setNew(false);
			}
			else {
				session.evict(dictionary);
				session.saveOrUpdate(dictionary);
			}

			session.flush();
			session.clear();
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(DictionaryModelImpl.ENTITY_CACHE_ENABLED,
			DictionaryImpl.class, dictionary.getPrimaryKey(), dictionary);

		dictionary.resetOriginalValues();

		return dictionary;
	}

	protected Dictionary toUnwrappedModel(Dictionary dictionary) {
		if (dictionary instanceof DictionaryImpl) {
			return dictionary;
		}

		DictionaryImpl dictionaryImpl = new DictionaryImpl();

		dictionaryImpl.setNew(dictionary.isNew());
		dictionaryImpl.setPrimaryKey(dictionary.getPrimaryKey());

		dictionaryImpl.setDictionaryId(dictionary.getDictionaryId());
		dictionaryImpl.setName(dictionary.getName());
		dictionaryImpl.setLanguage(dictionary.getLanguage());
		dictionaryImpl.setDescription(dictionary.getDescription());
		dictionaryImpl.setContents(dictionary.getContents());
		dictionaryImpl.setGroupId(dictionary.getGroupId());
		dictionaryImpl.setCompanyId(dictionary.getCompanyId());
		dictionaryImpl.setUserId(dictionary.getUserId());
		dictionaryImpl.setUserName(dictionary.getUserName());
		dictionaryImpl.setCreateDate(dictionary.getCreateDate());
		dictionaryImpl.setModifiedDate(dictionary.getModifiedDate());

		return dictionaryImpl;
	}

	/**
	 * Returns the dictionary with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dictionary
	 * @return the dictionary
	 * @throws edu.ucla.macroscope.emotiongraph.NoSuchDictionaryException if a dictionary with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Dictionary findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDictionaryException, SystemException {
		Dictionary dictionary = fetchByPrimaryKey(primaryKey);

		if (dictionary == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDictionaryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dictionary;
	}

	/**
	 * Returns the dictionary with the primary key or throws a {@link edu.ucla.macroscope.emotiongraph.NoSuchDictionaryException} if it could not be found.
	 *
	 * @param dictionaryId the primary key of the dictionary
	 * @return the dictionary
	 * @throws edu.ucla.macroscope.emotiongraph.NoSuchDictionaryException if a dictionary with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Dictionary findByPrimaryKey(long dictionaryId)
		throws NoSuchDictionaryException, SystemException {
		return findByPrimaryKey((Serializable)dictionaryId);
	}

	/**
	 * Returns the dictionary with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dictionary
	 * @return the dictionary, or <code>null</code> if a dictionary with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Dictionary fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Dictionary dictionary = (Dictionary)EntityCacheUtil.getResult(DictionaryModelImpl.ENTITY_CACHE_ENABLED,
				DictionaryImpl.class, primaryKey);

		if (dictionary == _nullDictionary) {
			return null;
		}

		if (dictionary == null) {
			Session session = null;

			try {
				session = openSession();

				dictionary = (Dictionary)session.get(DictionaryImpl.class,
						primaryKey);

				if (dictionary != null) {
					cacheResult(dictionary);
				}
				else {
					EntityCacheUtil.putResult(DictionaryModelImpl.ENTITY_CACHE_ENABLED,
						DictionaryImpl.class, primaryKey, _nullDictionary);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DictionaryModelImpl.ENTITY_CACHE_ENABLED,
					DictionaryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dictionary;
	}

	/**
	 * Returns the dictionary with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dictionaryId the primary key of the dictionary
	 * @return the dictionary, or <code>null</code> if a dictionary with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Dictionary fetchByPrimaryKey(long dictionaryId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)dictionaryId);
	}

	/**
	 * Returns all the dictionaries.
	 *
	 * @return the dictionaries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Dictionary> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dictionaries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.emotiongraph.model.impl.DictionaryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dictionaries
	 * @param end the upper bound of the range of dictionaries (not inclusive)
	 * @return the range of dictionaries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Dictionary> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dictionaries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.emotiongraph.model.impl.DictionaryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dictionaries
	 * @param end the upper bound of the range of dictionaries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dictionaries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Dictionary> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Dictionary> list = (List<Dictionary>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DICTIONARY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DICTIONARY;

				if (pagination) {
					sql = sql.concat(DictionaryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Dictionary>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Dictionary>(list);
				}
				else {
					list = (List<Dictionary>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the dictionaries from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Dictionary dictionary : findAll()) {
			remove(dictionary);
		}
	}

	/**
	 * Returns the number of dictionaries.
	 *
	 * @return the number of dictionaries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DICTIONARY);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the dictionary persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.edu.ucla.macroscope.emotiongraph.model.Dictionary")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Dictionary>> listenersList = new ArrayList<ModelListener<Dictionary>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Dictionary>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(DictionaryImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DICTIONARY = "SELECT dictionary FROM Dictionary dictionary";
	private static final String _SQL_COUNT_DICTIONARY = "SELECT COUNT(dictionary) FROM Dictionary dictionary";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dictionary.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Dictionary exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DictionaryPersistenceImpl.class);
	private static Dictionary _nullDictionary = new DictionaryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Dictionary> toCacheModel() {
				return _nullDictionaryCacheModel;
			}
		};

	private static CacheModel<Dictionary> _nullDictionaryCacheModel = new CacheModel<Dictionary>() {
			@Override
			public Dictionary toEntityModel() {
				return _nullDictionary;
			}
		};
}