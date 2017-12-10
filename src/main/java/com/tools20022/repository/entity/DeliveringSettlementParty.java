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
import com.tools20022.repository.choice.SettlementParties2Choice;
import com.tools20022.repository.choice.SettlementParties4Choice;
import com.tools20022.repository.choice.SettlementParties5Choice;
import com.tools20022.repository.choice.SettlementParties7Choice;
import com.tools20022.repository.entity.SecuritiesSettlementPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Party that is responsible for delivering securities as part of a chain of
 * settlement parties or as party that sells them.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="DeliveringSettlementParty"
 * src="doc-files/DeliveringSettlementParty.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
 * SecuritiesSettlementPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty#mmDeliveringSettlementParty
 * DeliveringSettlementParty.mmDeliveringSettlementParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty#mmNextParty
 * DeliveringSettlementParty.mmNextParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty#mmDeliveringSettlementParty
 * DeliveringSettlementParty.mmDeliveringSettlementParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty#mmNextParty
 * DeliveringSettlementParty.mmNextParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction9#mmOtherDeliveringSettlementParties
 * StandingSettlementInstruction9.mmOtherDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementParties2Choice#mmDeliveringSettlementParties
 * SettlementParties2Choice.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade3#mmDeliveringParties
 * NonGuaranteedTrade3.mmDeliveringParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementParties4Choice#mmDeliveringSettlementParties
 * SettlementParties4Choice.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction11#mmOtherDeliveringSettlementParties
 * StandingSettlementInstruction11.mmOtherDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementParties5Choice#mmDeliveringSettlementParties
 * SettlementParties5Choice.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#mmDeliveringSettlementParties
 * SecuritiesOption60.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmDeliveringSettlementParties
 * SecuritiesFinancingTransactionDetails35.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails27.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails28.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails26.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementParties7Choice#mmDeliveringSettlementParties
 * SettlementParties7Choice.mmDeliveringSettlementParties}</li>
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
 * "DeliveringSettlementParty"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party that is responsible for delivering securities as part of a chain of settlement parties or as party that sells them."
 * </li>
 * </ul>
 */
public class DeliveringSettlementParty extends SecuritiesSettlementPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected DeliveringSettlementParty deliveringSettlementParty;
	/**
	 * Specifies the settlement party which is followed by another party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty#mmNextParty
	 * DeliveringSettlementParty.mmNextParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty
	 * DeliveringSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty
	 * DeliveringSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringSettlementParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the settlement party which is followed by another party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDeliveringSettlementParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DeliveringSettlementParty.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveringSettlementParty";
			definition = "Specifies the settlement party which is followed by another party.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DeliveringSettlementParty.mmNextParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DeliveringSettlementParty.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.DeliveringSettlementParty> nextParty;
	/**
	 * Next party in the delivering side of the settlement the transaction
	 * chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty#mmDeliveringSettlementParty
	 * DeliveringSettlementParty.mmDeliveringSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty
	 * DeliveringSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty
	 * DeliveringSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Next party in the delivering side of the settlement the transaction chain."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNextParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DeliveringSettlementParty.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NextParty";
			definition = "Next party in the delivering side of the settlement the transaction chain.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DeliveringSettlementParty.mmDeliveringSettlementParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DeliveringSettlementParty.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeliveringSettlementParty";
				definition = "Party that is responsible for delivering securities as part of a chain of settlement parties or as party that sells them.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DeliveringSettlementParty.mmDeliveringSettlementParty, com.tools20022.repository.entity.DeliveringSettlementParty.mmNextParty);
				derivationElement_lazy = () -> Arrays.asList(StandingSettlementInstruction9.mmOtherDeliveringSettlementParties, SettlementParties2Choice.mmDeliveringSettlementParties, NonGuaranteedTrade3.mmDeliveringParties,
						SettlementParties4Choice.mmDeliveringSettlementParties, StandingSettlementInstruction11.mmOtherDeliveringSettlementParties, SettlementParties5Choice.mmDeliveringSettlementParties,
						SecuritiesOption60.mmDeliveringSettlementParties, SecuritiesFinancingTransactionDetails35.mmDeliveringSettlementParties, SecuritiesSettlementTransactionDetails27.mmDeliveringSettlementParties,
						SecuritiesSettlementTransactionDetails28.mmDeliveringSettlementParties, SecuritiesSettlementTransactionDetails26.mmDeliveringSettlementParties, SettlementParties7Choice.mmDeliveringSettlementParties);
				superType_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DeliveringSettlementParty.mmDeliveringSettlementParty, com.tools20022.repository.entity.DeliveringSettlementParty.mmNextParty);
			}

			@Override
			public Class<?> getInstanceClass() {
				return DeliveringSettlementParty.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DeliveringSettlementParty getDeliveringSettlementParty() {
		return deliveringSettlementParty;
	}

	public void setDeliveringSettlementParty(com.tools20022.repository.entity.DeliveringSettlementParty deliveringSettlementParty) {
		this.deliveringSettlementParty = deliveringSettlementParty;
	}

	public List<DeliveringSettlementParty> getNextParty() {
		return nextParty;
	}

	public void setNextParty(List<com.tools20022.repository.entity.DeliveringSettlementParty> nextParty) {
		this.nextParty = nextParty;
	}
}