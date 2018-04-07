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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09;
import com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV09;
import com.tools20022.repository.choice.CorporateActionReversalReason3Choice;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.entity.CorporateActionStatusReason;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the reason why the corporate action reversal occurs.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionReversalReason3#mmReason
 * CorporateActionReversalReason3.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionReversalReason3#mmAdditionalReasonInformation
 * CorporateActionReversalReason3.mmAdditionalReasonInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
 * CorporateActionStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV09#mmReversalReason
 * CorporateActionMovementReversalAdviceV09.mmReversalReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmReversalReason
 * CorporateActionMovementPreliminaryAdviceV09.mmReversalReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forCorporateActionReversalReason3
 * ConstraintAdditionalReasonInforrmationRule.forCorporateActionReversalReason3}
 * </li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionReversalReason3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason why the corporate action reversal occurs."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionReversalReason3", propOrder = {"reason", "additionalReasonInformation"})
public class CorporateActionReversalReason3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Rsn", required = true)
	protected CorporateActionReversalReason3Choice reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionReversalReason3Choice
	 * CorporateActionReversalReason3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
	 * CorporateActionStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionReversalReason3
	 * CorporateActionReversalReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason for the reversal."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionReversalReason3, CorporateActionReversalReason3Choice> mmReason = new MMMessageAssociationEnd<CorporateActionReversalReason3, CorporateActionReversalReason3Choice>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionStatusReason.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionReversalReason3.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Specifies the reason for the reversal.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionReversalReason3Choice.mmObject();
		}

		@Override
		public CorporateActionReversalReason3Choice getValue(CorporateActionReversalReason3 obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(CorporateActionReversalReason3 obj, CorporateActionReversalReason3Choice value) {
			obj.setReason(value);
		}
	};
	@XmlElement(name = "AddtlRsnInf")
	protected Max256Text additionalReasonInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmReason
	 * StatusReason.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionReversalReason3
	 * CorporateActionReversalReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRsnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information about the processed instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionReversalReason3, Optional<Max256Text>> mmAdditionalReasonInformation = new MMMessageAttribute<CorporateActionReversalReason3, Optional<Max256Text>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionReversalReason3.mmObject();
			isDerived = false;
			xmlTag = "AddtlRsnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInformation";
			definition = "Provides additional information about the processed instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Optional<Max256Text> getValue(CorporateActionReversalReason3 obj) {
			return obj.getAdditionalReasonInformation();
		}

		@Override
		public void setValue(CorporateActionReversalReason3 obj, Optional<Max256Text> value) {
			obj.setAdditionalReasonInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionReversalReason3.mmReason, com.tools20022.repository.msg.CorporateActionReversalReason3.mmAdditionalReasonInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionMovementReversalAdviceV09.mmReversalReason, CorporateActionMovementPreliminaryAdviceV09.mmReversalReason);
				trace_lazy = () -> CorporateActionStatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forCorporateActionReversalReason3);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionReversalReason3";
				definition = "Specifies the reason why the corporate action reversal occurs.";
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionReversalReason3Choice getReason() {
		return reason;
	}

	public CorporateActionReversalReason3 setReason(CorporateActionReversalReason3Choice reason) {
		this.reason = Objects.requireNonNull(reason);
		return this;
	}

	public Optional<Max256Text> getAdditionalReasonInformation() {
		return additionalReasonInformation == null ? Optional.empty() : Optional.of(additionalReasonInformation);
	}

	public CorporateActionReversalReason3 setAdditionalReasonInformation(Max256Text additionalReasonInformation) {
		this.additionalReasonInformation = additionalReasonInformation;
		return this;
	}
}