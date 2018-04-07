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
import com.tools20022.repository.area.camt.*;
import com.tools20022.repository.area.reda.InvestmentFundReportRequestV02;
import com.tools20022.repository.area.reda.PriceReportCancellationV04;
import com.tools20022.repository.area.reda.PriceReportV04;
import com.tools20022.repository.area.semt.SecuritiesMessageRejectionV03;
import com.tools20022.repository.choice.PartyIdentification2Choice;
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
 * {@linkplain com.tools20022.repository.msg.AdditionalReference3#mmReference
 * AdditionalReference3.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalReference3#mmReferenceIssuer
 * AdditionalReference3.mmReferenceIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalReference3#mmMessageName
 * AdditionalReference3.mmMessageName}</li>
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
 * {@linkplain com.tools20022.repository.area.reda.InvestmentFundReportRequestV02#mmPreviousReference
 * InvestmentFundReportRequestV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.InvestmentFundReportRequestV02#mmRelatedReference
 * InvestmentFundReportRequestV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV04#mmPoolReference
 * PriceReportCancellationV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV04#mmPreviousReference
 * PriceReportCancellationV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV04#mmPoolReference
 * PriceReportV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV04#mmPreviousReference
 * PriceReportV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV04#mmRelatedReference
 * PriceReportV04.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04#mmPoolReference
 * FundDetailedEstimatedCashForecastReportV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04#mmPreviousReference
 * FundDetailedEstimatedCashForecastReportV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04#mmRelatedReference
 * FundDetailedEstimatedCashForecastReportV04.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04#mmPoolReference
 * FundConfirmedCashForecastReportV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04#mmPreviousReference
 * FundConfirmedCashForecastReportV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04#mmRelatedReference
 * FundConfirmedCashForecastReportV04.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV03#mmPoolReference
 * FundDetailedConfirmedCashForecastReportCancellationV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV03#mmPreviousReference
 * FundDetailedConfirmedCashForecastReportCancellationV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV03#mmRelatedReference
 * FundDetailedConfirmedCashForecastReportCancellationV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmPoolReference
 * FundEstimatedCashForecastReportV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmPreviousReference
 * FundEstimatedCashForecastReportV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmRelatedReference
 * FundEstimatedCashForecastReportV04.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageRejectionV03#mmRelatedReference
 * SecuritiesMessageRejectionV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03#mmPoolReference
 * FundConfirmedCashForecastReportCancellationV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03#mmPreviousReference
 * FundConfirmedCashForecastReportCancellationV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03#mmRelatedReference
 * FundConfirmedCashForecastReportCancellationV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04#mmPoolReference
 * FundDetailedConfirmedCashForecastReportV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04#mmPreviousReference
 * FundDetailedConfirmedCashForecastReportV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04#mmRelatedReference
 * FundDetailedConfirmedCashForecastReportV04.mmRelatedReference}</li>
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
 * "AdditionalReference3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "References a related message or provides another reference, such as a pool reference, linking a set of messages. The party which issued the related reference may be the Sender of the referenced message or a party other than the Sender."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalReference8
 * AdditionalReference8}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AdditionalReference3", propOrder = {"reference", "referenceIssuer", "messageName"})
public class AdditionalReference3 {

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
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference8#mmReference
	 * AdditionalReference8.mmReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalReference3, Max35Text> mmReference = new MMMessageAttribute<AdditionalReference3, Max35Text>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalReference3.mmObject();
			isDerived = false;
			xmlTag = "Ref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Business reference of a message assigned by the party issuing the message. This reference must be unique amongst all messages of the same name sent by the same party.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalReference8.mmReference);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(AdditionalReference3 obj) {
			return obj.getReference();
		}

		@Override
		public void setValue(AdditionalReference3 obj, Max35Text value) {
			obj.setReference(value);
		}
	};
	@XmlElement(name = "RefIssr")
	protected PartyIdentification2Choice referenceIssuer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference8#mmReferenceIssuer
	 * AdditionalReference8.mmReferenceIssuer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalReference3, Optional<PartyIdentification2Choice>> mmReferenceIssuer = new MMMessageAttribute<AdditionalReference3, Optional<PartyIdentification2Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalReference3.mmObject();
			isDerived = false;
			xmlTag = "RefIssr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceIssuer";
			definition = "Issuer of the reference.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalReference8.mmReferenceIssuer);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification2Choice> getValue(AdditionalReference3 obj) {
			return obj.getReferenceIssuer();
		}

		@Override
		public void setValue(AdditionalReference3 obj, Optional<PartyIdentification2Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference8#mmMessageName
	 * AdditionalReference8.mmMessageName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalReference3, Optional<Max35Text>> mmMessageName = new MMMessageAttribute<AdditionalReference3, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalReference3.mmObject();
			isDerived = false;
			xmlTag = "MsgNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageName";
			definition = "Name of a message.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalReference8.mmMessageName);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(AdditionalReference3 obj) {
			return obj.getMessageName();
		}

		@Override
		public void setValue(AdditionalReference3 obj, Optional<Max35Text> value) {
			obj.setMessageName(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalReference3.mmReference, com.tools20022.repository.msg.AdditionalReference3.mmReferenceIssuer,
						com.tools20022.repository.msg.AdditionalReference3.mmMessageName);
				messageBuildingBlock_lazy = () -> Arrays.asList(InvestmentFundReportRequestV02.mmPreviousReference, InvestmentFundReportRequestV02.mmRelatedReference, PriceReportCancellationV04.mmPoolReference,
						PriceReportCancellationV04.mmPreviousReference, PriceReportV04.mmPoolReference, PriceReportV04.mmPreviousReference, PriceReportV04.mmRelatedReference, FundDetailedEstimatedCashForecastReportV04.mmPoolReference,
						FundDetailedEstimatedCashForecastReportV04.mmPreviousReference, FundDetailedEstimatedCashForecastReportV04.mmRelatedReference, FundConfirmedCashForecastReportV04.mmPoolReference,
						FundConfirmedCashForecastReportV04.mmPreviousReference, FundConfirmedCashForecastReportV04.mmRelatedReference, FundDetailedConfirmedCashForecastReportCancellationV03.mmPoolReference,
						FundDetailedConfirmedCashForecastReportCancellationV03.mmPreviousReference, FundDetailedConfirmedCashForecastReportCancellationV03.mmRelatedReference, FundEstimatedCashForecastReportV04.mmPoolReference,
						FundEstimatedCashForecastReportV04.mmPreviousReference, FundEstimatedCashForecastReportV04.mmRelatedReference, SecuritiesMessageRejectionV03.mmRelatedReference,
						FundConfirmedCashForecastReportCancellationV03.mmPoolReference, FundConfirmedCashForecastReportCancellationV03.mmPreviousReference, FundConfirmedCashForecastReportCancellationV03.mmRelatedReference,
						FundDetailedConfirmedCashForecastReportV04.mmPoolReference, FundDetailedConfirmedCashForecastReportV04.mmPreviousReference, FundDetailedConfirmedCashForecastReportV04.mmRelatedReference);
				trace_lazy = () -> GenericIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalReference3";
				definition = "References a related message or provides another reference, such as a pool reference, linking a set of messages. The party which issued the related reference may be the Sender of the referenced message or a party other than the Sender.";
				nextVersions_lazy = () -> Arrays.asList(AdditionalReference8.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getReference() {
		return reference;
	}

	public AdditionalReference3 setReference(Max35Text reference) {
		this.reference = Objects.requireNonNull(reference);
		return this;
	}

	public Optional<PartyIdentification2Choice> getReferenceIssuer() {
		return referenceIssuer == null ? Optional.empty() : Optional.of(referenceIssuer);
	}

	public AdditionalReference3 setReferenceIssuer(PartyIdentification2Choice referenceIssuer) {
		this.referenceIssuer = referenceIssuer;
		return this;
	}

	public Optional<Max35Text> getMessageName() {
		return messageName == null ? Optional.empty() : Optional.of(messageName);
	}

	public AdditionalReference3 setMessageName(Max35Text messageName) {
		this.messageName = messageName;
		return this;
	}
}