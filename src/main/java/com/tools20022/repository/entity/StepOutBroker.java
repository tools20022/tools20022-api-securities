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
import com.tools20022.repository.entity.Broker;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ConfirmationParties2;
import com.tools20022.repository.msg.ConfirmationParties4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Brokerage firm that executes an order, but gives other firms credit and some
 * of the commission for the trade.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="StepOutBroker" src="doc-files/StepOutBroker.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Broker Broker}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4#mmStepOutFirm
 * ConfirmationParties4.mmStepOutFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2#mmStepOutFirm
 * ConfirmationParties2.mmStepOutFirm}</li>
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
 * "StepOutBroker"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Brokerage firm that executes an order, but gives other firms credit and some of the commission for the trade."
 * </li>
 * </ul>
 */
public class StepOutBroker extends Broker {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StepOutBroker";
				definition = "Brokerage firm that executes an order, but gives other firms credit and some of the commission for the trade.";
				derivationElement_lazy = () -> Arrays.asList(ConfirmationParties4.mmStepOutFirm, ConfirmationParties2.mmStepOutFirm);
				superType_lazy = () -> Broker.mmObject();
			}

			@Override
			public Class<?> getInstanceClass() {
				return StepOutBroker.class;
			}
		});
		return mmObject_lazy.get();
	}
}