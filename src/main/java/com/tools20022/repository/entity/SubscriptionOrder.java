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
import com.tools20022.repository.entity.InvestmentFundOrder;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Order to invest the investor's principal in an investment fund.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SubscriptionOrder" src="doc-files/SubscriptionOrder.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
 * InvestmentFundOrder}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#mmIndividualOrderDetails
 * SubscriptionBulkOrder5.mmIndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#mmIndividualOrderDetails
 * SubscriptionMultipleOrder6.mmIndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmStaffClientBreakdown
 * SubscriptionExecution13.mmStaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmStaffClientBreakdown
 * SubscriptionExecution12.mmStaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmStaffClientBreakdown
 * SubscriptionOrder15.mmStaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmStaffClientBreakdown
 * SubscriptionOrder14.mmStaffClientBreakdown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SwitchSubscriptionLeg
 * SwitchSubscriptionLeg}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5
 * SubscriptionBulkOrder5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6
 * SubscriptionMultipleOrder6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionOrder15
 * SubscriptionOrder15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionOrder14
 * SubscriptionOrder14}</li>
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
 * "SubscriptionOrder"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Order to invest the investor's principal in an investment fund."</li>
 * </ul>
 */
public class SubscriptionOrder extends InvestmentFundOrder {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SubscriptionOrder";
				definition = "Order to invest the investor's principal in an investment fund.";
				derivationElement_lazy = () -> Arrays.asList(SubscriptionBulkOrder5.mmIndividualOrderDetails, SubscriptionMultipleOrder6.mmIndividualOrderDetails, SubscriptionExecution13.mmStaffClientBreakdown,
						SubscriptionExecution12.mmStaffClientBreakdown, SubscriptionOrder15.mmStaffClientBreakdown, SubscriptionOrder14.mmStaffClientBreakdown);
				subType_lazy = () -> Arrays.asList(SwitchSubscriptionLeg.mmObject());
				superType_lazy = () -> InvestmentFundOrder.mmObject();
				derivationComponent_lazy = () -> Arrays.asList(SubscriptionBulkOrder5.mmObject(), SubscriptionMultipleOrder6.mmObject(), SubscriptionOrder15.mmObject(), SubscriptionOrder14.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SubscriptionOrder.class;
			}
		});
		return mmObject_lazy.get();
	}
}