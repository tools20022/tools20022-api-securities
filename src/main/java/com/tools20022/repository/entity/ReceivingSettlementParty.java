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
import com.tools20022.repository.entity.ReceivingSettlementParty;
import com.tools20022.repository.entity.SecuritiesSettlementPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Party that receives securities as part of a chain of settlement parties or as
 * ultimate party.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ReceivingSettlementParty"
 * src="doc-files/ReceivingSettlementParty.svg">
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
 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty#mmReceivingSettlementParty
 * ReceivingSettlementParty.mmReceivingSettlementParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty#mmNextParty
 * ReceivingSettlementParty.mmNextParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty#mmReceivingSettlementParty
 * ReceivingSettlementParty.mmReceivingSettlementParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty#mmNextParty
 * ReceivingSettlementParty.mmNextParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction9#mmOtherReceivingSettlementParties
 * StandingSettlementInstruction9.mmOtherReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementParties2Choice#mmReceivingSettlementParties
 * SettlementParties2Choice.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade3#mmReceivingParties
 * NonGuaranteedTrade3.mmReceivingParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementParties4Choice#mmReceivingSettlementParties
 * SettlementParties4Choice.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementParties5Choice#mmReceivingSettlementParties
 * SettlementParties5Choice.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmReceivingSettlementParties
 * SecuritiesFinancingTransactionDetails35.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementParties7Choice#mmReceivingSettlementParties
 * SettlementParties7Choice.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction14#mmOtherReceivingSettlementParties
 * StandingSettlementInstruction14.mmOtherReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails34#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails34.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails33#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails33.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails32.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption65#mmReceivingSettlementParties
 * SecuritiesOption65.mmReceivingSettlementParties}</li>
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
 * "ReceivingSettlementParty"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party that receives securities as part of a chain of settlement parties or as ultimate party."
 * </li>
 * </ul>
 */
public class ReceivingSettlementParty extends SecuritiesSettlementPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ReceivingSettlementParty receivingSettlementParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty#mmNextParty
	 * ReceivingSettlementParty.mmNextParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty
	 * ReceivingSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty
	 * ReceivingSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingSettlementParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the settlement party which is followed by another party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ReceivingSettlementParty, com.tools20022.repository.entity.ReceivingSettlementParty> mmReceivingSettlementParty = new MMBusinessAssociationEnd<ReceivingSettlementParty, com.tools20022.repository.entity.ReceivingSettlementParty>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ReceivingSettlementParty.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReceivingSettlementParty";
			definition = "Specifies the settlement party which is followed by another party.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ReceivingSettlementParty.mmNextParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ReceivingSettlementParty.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.ReceivingSettlementParty getValue(ReceivingSettlementParty obj) {
			return obj.getReceivingSettlementParty();
		}

		@Override
		public void setValue(ReceivingSettlementParty obj, com.tools20022.repository.entity.ReceivingSettlementParty value) {
			obj.setReceivingSettlementParty(value);
		}
	};
	protected List<com.tools20022.repository.entity.ReceivingSettlementParty> nextParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty#mmReceivingSettlementParty
	 * ReceivingSettlementParty.mmReceivingSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty
	 * ReceivingSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty
	 * ReceivingSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Next party in the receiving side of the settlement transaction chain."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ReceivingSettlementParty, List<ReceivingSettlementParty>> mmNextParty = new MMBusinessAssociationEnd<ReceivingSettlementParty, List<ReceivingSettlementParty>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ReceivingSettlementParty.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NextParty";
			definition = "Next party in the receiving side of the settlement transaction chain.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ReceivingSettlementParty.mmReceivingSettlementParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ReceivingSettlementParty.mmObject();
		}

		@Override
		public List<ReceivingSettlementParty> getValue(ReceivingSettlementParty obj) {
			return obj.getNextParty();
		}

		@Override
		public void setValue(ReceivingSettlementParty obj, List<ReceivingSettlementParty> value) {
			obj.setNextParty(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReceivingSettlementParty";
				definition = "Party that receives securities as part of a chain of settlement parties or as ultimate party.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ReceivingSettlementParty.mmReceivingSettlementParty, com.tools20022.repository.entity.ReceivingSettlementParty.mmNextParty);
				derivationElement_lazy = () -> Arrays.asList(StandingSettlementInstruction9.mmOtherReceivingSettlementParties, SettlementParties2Choice.mmReceivingSettlementParties, NonGuaranteedTrade3.mmReceivingParties,
						SettlementParties4Choice.mmReceivingSettlementParties, SettlementParties5Choice.mmReceivingSettlementParties, SecuritiesFinancingTransactionDetails35.mmReceivingSettlementParties,
						SettlementParties7Choice.mmReceivingSettlementParties, StandingSettlementInstruction14.mmOtherReceivingSettlementParties, SecuritiesSettlementTransactionDetails34.mmReceivingSettlementParties,
						SecuritiesSettlementTransactionDetails33.mmReceivingSettlementParties, SecuritiesSettlementTransactionDetails32.mmReceivingSettlementParties, SecuritiesOption65.mmReceivingSettlementParties);
				superType_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ReceivingSettlementParty.mmReceivingSettlementParty, com.tools20022.repository.entity.ReceivingSettlementParty.mmNextParty);
			}

			@Override
			public Class<?> getInstanceClass() {
				return ReceivingSettlementParty.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ReceivingSettlementParty getReceivingSettlementParty() {
		return receivingSettlementParty;
	}

	public ReceivingSettlementParty setReceivingSettlementParty(com.tools20022.repository.entity.ReceivingSettlementParty receivingSettlementParty) {
		this.receivingSettlementParty = Objects.requireNonNull(receivingSettlementParty);
		return this;
	}

	public List<ReceivingSettlementParty> getNextParty() {
		return nextParty == null ? nextParty = new ArrayList<>() : nextParty;
	}

	public ReceivingSettlementParty setNextParty(List<com.tools20022.repository.entity.ReceivingSettlementParty> nextParty) {
		this.nextParty = Objects.requireNonNull(nextParty);
		return this;
	}
}