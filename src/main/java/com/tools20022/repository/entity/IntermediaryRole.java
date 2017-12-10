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

import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.AccountPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party that provides services relating to financial products to investors, for
 * example, advice on products and placement of orders.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="IntermediaryRole" src="doc-files/IntermediaryRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.AccountPartyRole
 * AccountPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary11#mmRole
 * Intermediary11.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary11#mmExtendedRole
 * Intermediary11.mmExtendedRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount2#mmIntermediaryInformation
 * SafekeepingAccount2.mmIntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount43#mmIntermediaryInformation
 * InvestmentAccount43.mmIntermediaryInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary32#mmRole
 * Intermediary32.mmRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount54#mmIntermediaryInformation
 * InvestmentAccount54.mmIntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#mmIntermediaryInformation
 * ReceiveInformation17.mmIntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#mmIntermediaryInformation
 * ReceiveInformation16.mmIntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount56#mmIntermediaryInformation
 * InvestmentAccount56.mmIntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmIntermediaryInformation
 * DeliverInformation16.mmIntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#mmIntermediaryInformation
 * DeliverInformation17.mmIntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#mmIntermediaryInformation
 * InvestmentAccount57.mmIntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance3#mmAgent
 * AggregateHoldingBalance3.mmAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount64#mmIntermediary
 * InvestmentAccount64.mmIntermediary}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary11 Intermediary11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary27 Intermediary27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary32 Intermediary32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary36 Intermediary36}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary34 Intermediary34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary33 Intermediary33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary35 Intermediary35}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IntermediaryRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party that provides services relating to financial products to investors, for example, advice on products and placement of orders."
 * </li>
 * </ul>
 */
public class IntermediaryRole extends AccountPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IntermediaryRole";
				definition = "Party that provides services relating to financial products to investors, for example, advice on products and placement of orders.";
				derivationElement_lazy = () -> Arrays.asList(Intermediary11.mmRole, Intermediary11.mmExtendedRole, SafekeepingAccount2.mmIntermediaryInformation, InvestmentAccount43.mmIntermediaryInformation, Intermediary32.mmRole,
						InvestmentAccount54.mmIntermediaryInformation, ReceiveInformation17.mmIntermediaryInformation, ReceiveInformation16.mmIntermediaryInformation, InvestmentAccount56.mmIntermediaryInformation,
						DeliverInformation16.mmIntermediaryInformation, DeliverInformation17.mmIntermediaryInformation, InvestmentAccount57.mmIntermediaryInformation, AggregateHoldingBalance3.mmAgent, InvestmentAccount64.mmIntermediary);
				superType_lazy = () -> AccountPartyRole.mmObject();
				derivationComponent_lazy = () -> Arrays.asList(Intermediary11.mmObject(), Intermediary27.mmObject(), Intermediary32.mmObject(), Intermediary36.mmObject(), Intermediary34.mmObject(), Intermediary33.mmObject(),
						Intermediary35.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return IntermediaryRole.class;
			}
		});
		return mmObject_lazy.get();
	}
}