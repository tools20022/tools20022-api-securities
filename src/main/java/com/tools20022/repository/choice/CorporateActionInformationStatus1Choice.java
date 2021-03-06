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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.AgentCAInformationStatusAdviceV01;
import com.tools20022.repository.entity.CorporateActionStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CorporateActionInformationProcessingStatus1;
import com.tools20022.repository.msg.CorporateActionInformationRejectedStatus1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between the different statuses of a corporate action information
 * advice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionInformationStatus1Choice#mmProcessedStatus
 * CorporateActionInformationStatus1Choice.mmProcessedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionInformationStatus1Choice#mmRejectedStatus
 * CorporateActionInformationStatus1Choice.mmRejectedStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionStatus
 * CorporateActionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAInformationStatusAdviceV01#mmInformationStatusDetails
 * AgentCAInformationStatusAdviceV01.mmInformationStatusDetails}</li>
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
 * "CorporateActionInformationStatus1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between the different statuses of a corporate action information advice."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionInformationStatus1Choice", propOrder = {"processedStatus", "rejectedStatus"})
public class CorporateActionInformationStatus1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrcdSts", required = true)
	protected CorporateActionInformationProcessingStatus1 processedStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformationProcessingStatus1
	 * CorporateActionInformationProcessingStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionInformationStatus1Choice
	 * CorporateActionInformationStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcdSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessedStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the processing status of the advice."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionInformationStatus1Choice, CorporateActionInformationProcessingStatus1> mmProcessedStatus = new MMMessageAssociationEnd<CorporateActionInformationStatus1Choice, CorporateActionInformationProcessingStatus1>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.CorporateActionInformationStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "PrcdSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessedStatus";
			definition = "Provides information about the processing status of the advice.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionInformationProcessingStatus1.mmObject();
		}

		@Override
		public CorporateActionInformationProcessingStatus1 getValue(CorporateActionInformationStatus1Choice obj) {
			return obj.getProcessedStatus();
		}

		@Override
		public void setValue(CorporateActionInformationStatus1Choice obj, CorporateActionInformationProcessingStatus1 value) {
			obj.setProcessedStatus(value);
		}
	};
	@XmlElement(name = "RjctdSts", required = true)
	protected CorporateActionInformationRejectedStatus1 rejectedStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformationRejectedStatus1
	 * CorporateActionInformationRejectedStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionInformationStatus1Choice
	 * CorporateActionInformationStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctdSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information about the rejection status."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionInformationStatus1Choice, CorporateActionInformationRejectedStatus1> mmRejectedStatus = new MMMessageAssociationEnd<CorporateActionInformationStatus1Choice, CorporateActionInformationRejectedStatus1>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.CorporateActionInformationStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "RjctdSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedStatus";
			definition = "Provides information about the rejection status.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionInformationRejectedStatus1.mmObject();
		}

		@Override
		public CorporateActionInformationRejectedStatus1 getValue(CorporateActionInformationStatus1Choice obj) {
			return obj.getRejectedStatus();
		}

		@Override
		public void setValue(CorporateActionInformationStatus1Choice obj, CorporateActionInformationRejectedStatus1 value) {
			obj.setRejectedStatus(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays
						.asList(com.tools20022.repository.choice.CorporateActionInformationStatus1Choice.mmProcessedStatus, com.tools20022.repository.choice.CorporateActionInformationStatus1Choice.mmRejectedStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCAInformationStatusAdviceV01.mmInformationStatusDetails);
				trace_lazy = () -> CorporateActionStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionInformationStatus1Choice";
				definition = "Choice between the different statuses of a corporate action information advice.";
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionInformationProcessingStatus1 getProcessedStatus() {
		return processedStatus;
	}

	public CorporateActionInformationStatus1Choice setProcessedStatus(CorporateActionInformationProcessingStatus1 processedStatus) {
		this.processedStatus = Objects.requireNonNull(processedStatus);
		return this;
	}

	public CorporateActionInformationRejectedStatus1 getRejectedStatus() {
		return rejectedStatus;
	}

	public CorporateActionInformationStatus1Choice setRejectedStatus(CorporateActionInformationRejectedStatus1 rejectedStatus) {
		this.rejectedStatus = Objects.requireNonNull(rejectedStatus);
		return this;
	}
}