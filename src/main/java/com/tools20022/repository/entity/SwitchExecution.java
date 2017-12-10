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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.InvestmentFundOrderExecution;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SwitchExecution7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Execution of a switch order.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SwitchExecution" src="doc-files/SwitchExecution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
 * InvestmentFundOrderExecution}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchExecution#mmRedemptionLeg
 * SwitchExecution.mmRedemptionLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchExecution#mmSubscriptionLeg
 * SwitchExecution.mmSubscriptionLeg}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchExecutionRedemptionLeg#mmRelatedSwitchExecution
 * SwitchExecutionRedemptionLeg.mmRelatedSwitchExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchExecutionSubscriptionLeg#mmRelatedSwitchExecution
 * SwitchExecutionSubscriptionLeg.mmRelatedSwitchExecution}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchExecution7
 * SwitchExecution7}</li>
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
 * "SwitchExecution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Execution of a switch order."</li>
 * </ul>
 */
public class SwitchExecution extends InvestmentFundOrderExecution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.SwitchExecutionRedemptionLeg> redemptionLeg;
	/**
	 * Redemption leg of a switch order execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SwitchExecutionRedemptionLeg#mmRelatedSwitchExecution
	 * SwitchExecutionRedemptionLeg.mmRelatedSwitchExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SwitchExecutionRedemptionLeg
	 * SwitchExecutionRedemptionLeg}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmRedemptionLegDetails
	 * SwitchExecution7.mmRedemptionLegDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SwitchExecution
	 * SwitchExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Redemption leg of a switch order execution."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRedemptionLeg = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SwitchExecution7.mmRedemptionLegDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SwitchExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RedemptionLeg";
			definition = "Redemption leg of a switch order execution.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SwitchExecutionRedemptionLeg.mmRelatedSwitchExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SwitchExecutionRedemptionLeg.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SwitchExecutionSubscriptionLeg> subscriptionLeg;
	/**
	 * Subscription leg of a switch order execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SwitchExecutionSubscriptionLeg#mmRelatedSwitchExecution
	 * SwitchExecutionSubscriptionLeg.mmRelatedSwitchExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SwitchExecutionSubscriptionLeg
	 * SwitchExecutionSubscriptionLeg}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmSubscriptionLegDetails
	 * SwitchExecution7.mmSubscriptionLegDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SwitchExecution
	 * SwitchExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Subscription leg of a switch order execution."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSubscriptionLeg = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SwitchExecution7.mmSubscriptionLegDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SwitchExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubscriptionLeg";
			definition = "Subscription leg of a switch order execution.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SwitchExecutionSubscriptionLeg.mmRelatedSwitchExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SwitchExecutionSubscriptionLeg.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SwitchExecution";
				definition = "Execution of a switch order.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SwitchExecutionRedemptionLeg.mmRelatedSwitchExecution, com.tools20022.repository.entity.SwitchExecutionSubscriptionLeg.mmRelatedSwitchExecution);
				superType_lazy = () -> InvestmentFundOrderExecution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SwitchExecution.mmRedemptionLeg, com.tools20022.repository.entity.SwitchExecution.mmSubscriptionLeg);
				derivationComponent_lazy = () -> Arrays.asList(SwitchExecution7.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SwitchExecution.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<SwitchExecutionRedemptionLeg> getRedemptionLeg() {
		return redemptionLeg;
	}

	public void setRedemptionLeg(List<com.tools20022.repository.entity.SwitchExecutionRedemptionLeg> redemptionLeg) {
		this.redemptionLeg = redemptionLeg;
	}

	public List<SwitchExecutionSubscriptionLeg> getSubscriptionLeg() {
		return subscriptionLeg;
	}

	public void setSubscriptionLeg(List<com.tools20022.repository.entity.SwitchExecutionSubscriptionLeg> subscriptionLeg) {
		this.subscriptionLeg = subscriptionLeg;
	}
}