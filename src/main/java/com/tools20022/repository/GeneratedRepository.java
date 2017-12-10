/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository;

import com.tools20022.core.repo.ReflectionBasedRepository;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import com.tools20022.metamodel.MMDataDictionary;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.repository.area.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 
 <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepository#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmcatalogue
 * GeneratedRepository.mmcatalogue}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepository#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * </ul>
 */
public class GeneratedRepository extends ReflectionBasedRepository {

	final static private AtomicReference<MMRepository> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of BusinessProcessCatalogue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessProcessCatalogue#getTopLevelCatalogueEntry
	 * topLevelCatalogueEntry} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.AccountManagementLatestVersion
	 * AccountManagementLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
	 * CashManagementLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.CollateralManagementLatestVersion
	 * CollateralManagementLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.BusinessApplicationHeaderLatestVersion
	 * BusinessApplicationHeaderLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.ReferenceDataLatestVersion
	 * ReferenceDataLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.SecuritiesClearingLatestVersion
	 * SecuritiesClearingLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestVersion
	 * SecuritiesEventsLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.SecuritiesManagementLatestVersion
	 * SecuritiesManagementLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementLatestVersion
	 * SecuritiesSettlementLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.SecuritiesTradeLatestVersion
	 * SecuritiesTradeLatestVersion}</li>
	 * <li>{@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
	 * AuthoritiesLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.SecuritiesManagementArchive
	 * SecuritiesManagementArchive}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessProcessCatalogue#getRepository
	 * repository} = {@linkplain com.tools20022.repository.GeneratedRepository
	 * GeneratedRepository}</li>
	 * </ul>
	 */
	public static final MMBusinessProcessCatalogue mmcatalogue = new MMBusinessProcessCatalogue() {
		{
			repository_lazy = () -> GeneratedRepository.mmObject();
			topLevelCatalogueEntry_lazy = () -> Arrays.asList(AccountManagementLatestVersion.mmObject(), CashManagementLatestVersion.mmObject(), CollateralManagementLatestVersion.mmObject(),
					BusinessApplicationHeaderLatestVersion.mmObject(), ReferenceDataLatestVersion.mmObject(), SecuritiesClearingLatestVersion.mmObject(), SecuritiesEventsLatestVersion.mmObject(),
					SecuritiesManagementLatestVersion.mmObject(), SecuritiesSettlementLatestVersion.mmObject(), SecuritiesTradeLatestVersion.mmObject(), AuthoritiesLatestVersion.mmObject(), SecuritiesManagementArchive.mmObject());
		}
	};
	/**
	 * An instance of DataDictionary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMDataDictionary#getRepository
	 * repository} = {@linkplain com.tools20022.repository.GeneratedRepository
	 * GeneratedRepository}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMDataDictionary#getTopLevelDictionaryEntry
	 * topLevelDictionaryEntry} = List of 4491 elements</li>
	 * </ul>
	 */
	public static final MMDataDictionary mmdataDict = new MMDataDictionary() {
		{
			repository_lazy = () -> GeneratedRepository.mmObject();
			topLevelDictionaryEntry_lazy = () -> ListBuilderForGeneratedRepository_00.addElems(new ArrayList<>());
		}
	};

	private GeneratedRepository() {
		super(StandardMetamodel2013.metamodel());
	}

	final static public MMRepository mmObject() {
		mmObject_lazy.compareAndSet(null, new MMRepository() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.mmcatalogue;
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
			}
		});
		return mmObject_lazy.get();
	}
}