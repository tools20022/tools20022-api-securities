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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.TradeOriginator3Choice;
import com.tools20022.repository.codeset.OriginatorRoleCode;
import com.tools20022.repository.entity.TradePartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Specifies the trading party at the source of the transaction.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TradeOriginatorRole" src="doc-files/TradeOriginatorRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.TradePartyRole
 * TradePartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeOriginatorRole#mmOriginatorRole
 * TradeOriginatorRole.mmOriginatorRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails73#mmTradeOriginatorRole
 * SecuritiesTradeDetails73.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails74#mmTradeOriginatorRole
 * SecuritiesTradeDetails74.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails75#mmTradeOriginatorRole
 * SecuritiesTradeDetails75.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails76#mmTradeOriginatorRole
 * SecuritiesTradeDetails76.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails77#mmTradeOriginatorRole
 * SecuritiesTradeDetails77.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails78#mmTradeOriginatorRole
 * SecuritiesTradeDetails78.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails79#mmTradeOriginatorRole
 * SecuritiesTradeDetails79.mmTradeOriginatorRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.TradeOriginator3Choice
 * TradeOriginator3Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeOriginatorRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the trading party at the source of the transaction."
 * </li>
 * </ul>
 */
public class TradeOriginatorRole extends TradePartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected OriginatorRoleCode originatorRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OriginatorRoleCode
	 * OriginatorRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeOriginator3Choice#mmCode
	 * TradeOriginator3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeOriginator3Choice#mmProprietary
	 * TradeOriginator3Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeOriginatorRole
	 * TradeOriginatorRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginatorRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the role of the trading party in the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TradeOriginatorRole, OriginatorRoleCode> mmOriginatorRole = new MMBusinessAttribute<TradeOriginatorRole, OriginatorRoleCode>() {
		{
			derivation_lazy = () -> Arrays.asList(TradeOriginator3Choice.mmCode, TradeOriginator3Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeOriginatorRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OriginatorRole";
			definition = "Specifies the role of the trading party in the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OriginatorRoleCode.mmObject();
		}

		@Override
		public OriginatorRoleCode getValue(TradeOriginatorRole obj) {
			return obj.getOriginatorRole();
		}

		@Override
		public void setValue(TradeOriginatorRole obj, OriginatorRoleCode value) {
			obj.setOriginatorRole(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeOriginatorRole";
				definition = "Specifies the trading party at the source of the transaction.";
				derivationElement_lazy = () -> Arrays.asList(SecuritiesTradeDetails73.mmTradeOriginatorRole, SecuritiesTradeDetails74.mmTradeOriginatorRole, SecuritiesTradeDetails75.mmTradeOriginatorRole,
						SecuritiesTradeDetails76.mmTradeOriginatorRole, SecuritiesTradeDetails77.mmTradeOriginatorRole, SecuritiesTradeDetails78.mmTradeOriginatorRole, SecuritiesTradeDetails79.mmTradeOriginatorRole);
				superType_lazy = () -> TradePartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TradeOriginatorRole.mmOriginatorRole);
				derivationComponent_lazy = () -> Arrays.asList(TradeOriginator3Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return TradeOriginatorRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public OriginatorRoleCode getOriginatorRole() {
		return originatorRole;
	}

	public TradeOriginatorRole setOriginatorRole(OriginatorRoleCode originatorRole) {
		this.originatorRole = Objects.requireNonNull(originatorRole);
		return this;
	}
}