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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.semt.*;
import com.tools20022.repository.choice.PartyIdentification1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.Party;
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
 * References a related message or provides another reference, such as a pool
 * reference, linking a set of messages. The party which issued the related
 * reference may be the Sender of the referenced message or a party other than
 * the Sender.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalReference2#mmReference
 * AdditionalReference2.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalReference2#mmReferenceIssuer
 * AdditionalReference2.mmReferenceIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalReference2#mmMessageName
 * AdditionalReference2.mmMessageName}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.GenericIdentification
 * GenericIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsV02#mmPreviousReference
 * AccountingStatementOfHoldingsV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsV02#mmRelatedReference
 * AccountingStatementOfHoldingsV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02#mmPreviousReference
 * CustodyStatementOfHoldingsV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02#mmRelatedReference
 * CustodyStatementOfHoldingsV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsCancellationV02#mmPreviousReference
 * AccountingStatementOfHoldingsCancellationV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsCancellationV02#mmRelatedReference
 * AccountingStatementOfHoldingsCancellationV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellationV02#mmPreviousReference
 * CustodyStatementOfHoldingsCancellationV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellationV02#mmRelatedReference
 * CustodyStatementOfHoldingsCancellationV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV03#mmPreviousReference
 * StatementOfInvestmentFundTransactionsV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV03#mmRelatedReference
 * StatementOfInvestmentFundTransactionsV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV03#mmPreviousReference
 * StatementOfInvestmentFundTransactionsCancellationV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV03#mmRelatedReference
 * StatementOfInvestmentFundTransactionsCancellationV03.mmRelatedReference}</li>
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
 * "AdditionalReference2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "References a related message or provides another reference, such as a pool reference, linking a set of messages. The party which issued the related reference may be the Sender of the referenced message or a party other than the Sender."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AdditionalReference2", propOrder = {"reference", "referenceIssuer", "messageName"})
public class AdditionalReference2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Ref", required = true)
	protected Max35Text reference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference2
	 * AdditionalReference2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ref"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Business reference of a message assigned by the party issuing the message. This reference must be unique amongst all messages of the same name sent by the same party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalReference2, Max35Text> mmReference = new MMMessageAttribute<AdditionalReference2, Max35Text>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalReference2.mmObject();
			isDerived = false;
			xmlTag = "Ref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Business reference of a message assigned by the party issuing the message. This reference must be unique amongst all messages of the same name sent by the same party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(AdditionalReference2 obj) {
			return obj.getReference();
		}

		@Override
		public void setValue(AdditionalReference2 obj, Max35Text value) {
			obj.setReference(value);
		}
	};
	@XmlElement(name = "RefIssr")
	protected PartyIdentification1Choice referenceIssuer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification1Choice
	 * PartyIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference2
	 * AdditionalReference2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefIssr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceIssuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuer of the reference."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalReference2, Optional<PartyIdentification1Choice>> mmReferenceIssuer = new MMMessageAttribute<AdditionalReference2, Optional<PartyIdentification1Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalReference2.mmObject();
			isDerived = false;
			xmlTag = "RefIssr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceIssuer";
			definition = "Issuer of the reference.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification1Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification1Choice> getValue(AdditionalReference2 obj) {
			return obj.getReferenceIssuer();
		}

		@Override
		public void setValue(AdditionalReference2 obj, Optional<PartyIdentification1Choice> value) {
			obj.setReferenceIssuer(value.orElse(null));
		}
	};
	@XmlElement(name = "MsgNm")
	protected Max35Text messageName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference2
	 * AdditionalReference2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of a message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalReference2, Optional<Max35Text>> mmMessageName = new MMMessageAttribute<AdditionalReference2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalReference2.mmObject();
			isDerived = false;
			xmlTag = "MsgNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageName";
			definition = "Name of a message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(AdditionalReference2 obj) {
			return obj.getMessageName();
		}

		@Override
		public void setValue(AdditionalReference2 obj, Optional<Max35Text> value) {
			obj.setMessageName(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalReference2.mmReference, com.tools20022.repository.msg.AdditionalReference2.mmReferenceIssuer,
						com.tools20022.repository.msg.AdditionalReference2.mmMessageName);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountingStatementOfHoldingsV02.mmPreviousReference, AccountingStatementOfHoldingsV02.mmRelatedReference, CustodyStatementOfHoldingsV02.mmPreviousReference,
						CustodyStatementOfHoldingsV02.mmRelatedReference, AccountingStatementOfHoldingsCancellationV02.mmPreviousReference, AccountingStatementOfHoldingsCancellationV02.mmRelatedReference,
						CustodyStatementOfHoldingsCancellationV02.mmPreviousReference, CustodyStatementOfHoldingsCancellationV02.mmRelatedReference, StatementOfInvestmentFundTransactionsV03.mmPreviousReference,
						StatementOfInvestmentFundTransactionsV03.mmRelatedReference, StatementOfInvestmentFundTransactionsCancellationV03.mmPreviousReference, StatementOfInvestmentFundTransactionsCancellationV03.mmRelatedReference);
				trace_lazy = () -> GenericIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalReference2";
				definition = "References a related message or provides another reference, such as a pool reference, linking a set of messages. The party which issued the related reference may be the Sender of the referenced message or a party other than the Sender.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getReference() {
		return reference;
	}

	public AdditionalReference2 setReference(Max35Text reference) {
		this.reference = Objects.requireNonNull(reference);
		return this;
	}

	public Optional<PartyIdentification1Choice> getReferenceIssuer() {
		return referenceIssuer == null ? Optional.empty() : Optional.of(referenceIssuer);
	}

	public AdditionalReference2 setReferenceIssuer(PartyIdentification1Choice referenceIssuer) {
		this.referenceIssuer = referenceIssuer;
		return this;
	}

	public Optional<Max35Text> getMessageName() {
		return messageName == null ? Optional.empty() : Optional.of(messageName);
	}

	public AdditionalReference2 setMessageName(Max35Text messageName) {
		this.messageName = messageName;
		return this;
	}
}