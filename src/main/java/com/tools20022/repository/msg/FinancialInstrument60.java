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
import com.tools20022.repository.choice.Quantity12Choice;
import com.tools20022.repository.choice.SecurityIdentification25Choice;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.codeset.TransferType1Code;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Account24;
import com.tools20022.repository.msg.PartyIdentificationAndAccount156;
import com.tools20022.repository.msg.ReceivingPartiesAndAccount18;
import com.tools20022.repository.msg.SubAccount5;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Security that is a sub-set of an investment fund, and is governed by the same
 * investment fund policy, for example, dividend option or valuation currency.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument60#mmIdentification
 * FinancialInstrument60.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument60#mmName
 * FinancialInstrument60.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument60#mmShortName
 * FinancialInstrument60.mmShortName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument60#mmTransferType
 * FinancialInstrument60.mmTransferType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument60#mmQuantity
 * FinancialInstrument60.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument60#mmAverageAcquisitionPrice
 * FinancialInstrument60.mmAverageAcquisitionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument60#mmTransferCurrency
 * FinancialInstrument60.mmTransferCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument60#mmTotalBookValue
 * FinancialInstrument60.mmTotalBookValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument60#mmTransfereeAccount
 * FinancialInstrument60.mmTransfereeAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument60#mmSubAccountDetails
 * FinancialInstrument60.mmSubAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument60#mmSettlementPartiesReceivingSideDetails
 * FinancialInstrument60.mmSettlementPartiesReceivingSideDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument60#mmDeliveringAgentDetails
 * FinancialInstrument60.mmDeliveringAgentDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundClass
 * InvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIdentificationGuideline#forFinancialInstrument60
 * ConstraintIdentificationGuideline.forFinancialInstrument60}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrument60"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, for example, dividend option or valuation currency."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrument60", propOrder = {"identification", "name", "shortName", "transferType", "quantity", "averageAcquisitionPrice", "transferCurrency", "totalBookValue", "transfereeAccount", "subAccountDetails",
		"settlementPartiesReceivingSideDetails", "deliveringAgentDetails"})
public class FinancialInstrument60 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected SecurityIdentification25Choice identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice
	 * SecurityIdentification25Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument60
	 * FinancialInstrument60}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of a security, assigned under a formal or proprietary identification scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument60, SecurityIdentification25Choice> mmIdentification = new MMMessageAttribute<FinancialInstrument60, SecurityIdentification25Choice>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument60.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier of a security, assigned under a formal or proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification25Choice.mmObject();
		}

		@Override
		public SecurityIdentification25Choice getValue(FinancialInstrument60 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(FinancialInstrument60 obj, SecurityIdentification25Choice value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "Nm")
	protected Max350Text name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LocalName#mmFullName
	 * LocalName.mmFullName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument60
	 * FinancialInstrument60}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the financial instrument in free format text."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument60, Optional<Max350Text>> mmName = new MMMessageAttribute<FinancialInstrument60, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> LocalName.mmFullName;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument60.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of the financial instrument in free format text.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(FinancialInstrument60 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(FinancialInstrument60 obj, Optional<Max350Text> value) {
			obj.setName(value.orElse(null));
		}
	};
	@XmlElement(name = "ShrtNm")
	protected Max35Text shortName;
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
	 * {@linkplain com.tools20022.repository.entity.LocalName#mmShortName
	 * LocalName.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument60
	 * FinancialInstrument60}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrtNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial Instrument Short Name (FISN) expressed in conformance with the ISO 18774 standard."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument60, Optional<Max35Text>> mmShortName = new MMMessageAttribute<FinancialInstrument60, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> LocalName.mmShortName;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument60.mmObject();
			isDerived = false;
			xmlTag = "ShrtNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortName";
			definition = "Financial Instrument Short Name (FISN) expressed in conformance with the ISO 18774 standard.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(FinancialInstrument60 obj) {
			return obj.getShortName();
		}

		@Override
		public void setValue(FinancialInstrument60 obj, Optional<Max35Text> value) {
			obj.setShortName(value.orElse(null));
		}
	};
	@XmlElement(name = "TrfTp", required = true)
	protected TransferType1Code transferType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransferType1Code
	 * TransferType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferType
	 * SecuritiesTransfer.mmTransferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument60
	 * FinancialInstrument60}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the financial instrument is transferred as an asset or as cash."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument60, TransferType1Code> mmTransferType = new MMMessageAttribute<FinancialInstrument60, TransferType1Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferType;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument60.mmObject();
			isDerived = false;
			xmlTag = "TrfTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferType";
			definition = "Specifies whether the financial instrument is transferred as an asset or as cash.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransferType1Code.mmObject();
		}

		@Override
		public TransferType1Code getValue(FinancialInstrument60 obj) {
			return obj.getTransferType();
		}

		@Override
		public void setValue(FinancialInstrument60 obj, TransferType1Code value) {
			obj.setTransferType(value);
		}
	};
	@XmlElement(name = "Qty")
	protected Quantity12Choice quantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Quantity12Choice
	 * Quantity12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesQuantity
	 * Security.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument60
	 * FinancialInstrument60}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the quantity of assets to be transferred in units or in a percentage rate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument60, Optional<Quantity12Choice>> mmQuantity = new MMMessageAttribute<FinancialInstrument60, Optional<Quantity12Choice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument60.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Specifies the quantity of assets to be transferred in units or in a percentage rate.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Quantity12Choice.mmObject();
		}

		@Override
		public Optional<Quantity12Choice> getValue(FinancialInstrument60 obj) {
			return obj.getQuantity();
		}

		@Override
		public void setValue(FinancialInstrument60 obj, Optional<Quantity12Choice> value) {
			obj.setQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "AvrgAcqstnPric")
	protected ActiveOrHistoricCurrencyAndAmount averageAcquisitionPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmBookValue
	 * AssetHolding.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument60
	 * FinancialInstrument60}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvrgAcqstnPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AverageAcquisitionPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Average cost per share of the security, including all fees."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument60, Optional<ActiveOrHistoricCurrencyAndAmount>> mmAverageAcquisitionPrice = new MMMessageAttribute<FinancialInstrument60, Optional<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmBookValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument60.mmObject();
			isDerived = false;
			xmlTag = "AvrgAcqstnPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AverageAcquisitionPrice";
			definition = "Average cost per share of the security, including all fees.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAndAmount> getValue(FinancialInstrument60 obj) {
			return obj.getAverageAcquisitionPrice();
		}

		@Override
		public void setValue(FinancialInstrument60 obj, Optional<ActiveOrHistoricCurrencyAndAmount> value) {
			obj.setAverageAcquisitionPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "TrfCcy")
	protected ActiveOrHistoricCurrencyCode transferCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmTransferCurrency
	 * SecuritiesDeliveryObligation.mmTransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument60
	 * FinancialInstrument60}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency to be used to transfer the holdings. Some transfer agents register holdings grouped by currency in addition to using the ISIN for multi-currency fund shares."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument60, Optional<ActiveOrHistoricCurrencyCode>> mmTransferCurrency = new MMMessageAttribute<FinancialInstrument60, Optional<ActiveOrHistoricCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesDeliveryObligation.mmTransferCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument60.mmObject();
			isDerived = false;
			xmlTag = "TrfCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferCurrency";
			definition = "Currency to be used to transfer the holdings. Some transfer agents register holdings grouped by currency in addition to using the ISIN for multi-currency fund shares.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyCode> getValue(FinancialInstrument60 obj) {
			return obj.getTransferCurrency();
		}

		@Override
		public void setValue(FinancialInstrument60 obj, Optional<ActiveOrHistoricCurrencyCode> value) {
			obj.setTransferCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlBookVal")
	protected ActiveOrHistoricCurrencyAndAmount totalBookValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmBookValue
	 * AssetHolding.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument60
	 * FinancialInstrument60}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlBookVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalBookValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net asset on the balance sheet, the total portfolio value minus or plus the unrealised gain or loss."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument60, Optional<ActiveOrHistoricCurrencyAndAmount>> mmTotalBookValue = new MMMessageAttribute<FinancialInstrument60, Optional<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmBookValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument60.mmObject();
			isDerived = false;
			xmlTag = "TtlBookVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalBookValue";
			definition = "Net asset on the balance sheet, the total portfolio value minus or plus the unrealised gain or loss.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAndAmount> getValue(FinancialInstrument60 obj) {
			return obj.getTotalBookValue();
		}

		@Override
		public void setValue(FinancialInstrument60 obj, Optional<ActiveOrHistoricCurrencyAndAmount> value) {
			obj.setTotalBookValue(value.orElse(null));
		}
	};
	@XmlElement(name = "TrfeeAcct")
	protected Account24 transfereeAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Account24
	 * Account24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmInvestmentAccount
	 * InvestmentFundClass.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument60
	 * FinancialInstrument60}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfeeAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransfereeAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account held in the name of the party that is not the name of the beneficial owner of the shares."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument60, Optional<Account24>> mmTransfereeAccount = new MMMessageAttribute<FinancialInstrument60, Optional<Account24>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmInvestmentAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument60.mmObject();
			isDerived = false;
			xmlTag = "TrfeeAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransfereeAccount";
			definition = "Account held in the name of the party that is not the name of the beneficial owner of the shares.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Account24.mmObject();
		}

		@Override
		public Optional<Account24> getValue(FinancialInstrument60 obj) {
			return obj.getTransfereeAccount();
		}

		@Override
		public void setValue(FinancialInstrument60 obj, Optional<Account24> value) {
			obj.setTransfereeAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "SubAcctDtls")
	protected SubAccount5 subAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SubAccount5
	 * SubAccount5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmInvestmentAccount
	 * InvestmentFundClass.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument60
	 * FinancialInstrument60}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubAcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sub-account of the master or omnibus account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrument60, Optional<SubAccount5>> mmSubAccountDetails = new MMMessageAssociationEnd<FinancialInstrument60, Optional<SubAccount5>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmInvestmentAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument60.mmObject();
			isDerived = false;
			xmlTag = "SubAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountDetails";
			definition = "Sub-account of the master or omnibus account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SubAccount5.mmObject();
		}

		@Override
		public Optional<SubAccount5> getValue(FinancialInstrument60 obj) {
			return obj.getSubAccountDetails();
		}

		@Override
		public void setValue(FinancialInstrument60 obj, Optional<SubAccount5> value) {
			obj.setSubAccountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmPtiesRcvgSdDtls")
	protected ReceivingPartiesAndAccount18 settlementPartiesReceivingSideDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount18
	 * ReceivingPartiesAndAccount18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPartyRole
	 * SecuritiesSettlement.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument60
	 * FinancialInstrument60}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmPtiesRcvgSdDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPartiesReceivingSideDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Chain of parties involved in the settlement of a transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrument60, Optional<ReceivingPartiesAndAccount18>> mmSettlementPartiesReceivingSideDetails = new MMMessageAssociationEnd<FinancialInstrument60, Optional<ReceivingPartiesAndAccount18>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument60.mmObject();
			isDerived = false;
			xmlTag = "SttlmPtiesRcvgSdDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementPartiesReceivingSideDetails";
			definition = "Chain of parties involved in the settlement of a transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ReceivingPartiesAndAccount18.mmObject();
		}

		@Override
		public Optional<ReceivingPartiesAndAccount18> getValue(FinancialInstrument60 obj) {
			return obj.getSettlementPartiesReceivingSideDetails();
		}

		@Override
		public void setValue(FinancialInstrument60 obj, Optional<ReceivingPartiesAndAccount18> value) {
			obj.setSettlementPartiesReceivingSideDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvrgAgtDtls")
	protected PartyIdentificationAndAccount156 deliveringAgentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount156
	 * PartyIdentificationAndAccount156}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument60
	 * FinancialInstrument60}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgAgtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringAgentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that delivers securities to the receiving agent at the place of settlement, for example, a central securities depository."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument60, Optional<PartyIdentificationAndAccount156>> mmDeliveringAgentDetails = new MMMessageAttribute<FinancialInstrument60, Optional<PartyIdentificationAndAccount156>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument60.mmObject();
			isDerived = false;
			xmlTag = "DlvrgAgtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringAgentDetails";
			definition = "Party that delivers securities to the receiving agent at the place of settlement, for example, a central securities depository.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentificationAndAccount156.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount156> getValue(FinancialInstrument60 obj) {
			return obj.getDeliveringAgentDetails();
		}

		@Override
		public void setValue(FinancialInstrument60 obj, Optional<PartyIdentificationAndAccount156> value) {
			obj.setDeliveringAgentDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument60.mmIdentification, com.tools20022.repository.msg.FinancialInstrument60.mmName,
						com.tools20022.repository.msg.FinancialInstrument60.mmShortName, com.tools20022.repository.msg.FinancialInstrument60.mmTransferType, com.tools20022.repository.msg.FinancialInstrument60.mmQuantity,
						com.tools20022.repository.msg.FinancialInstrument60.mmAverageAcquisitionPrice, com.tools20022.repository.msg.FinancialInstrument60.mmTransferCurrency,
						com.tools20022.repository.msg.FinancialInstrument60.mmTotalBookValue, com.tools20022.repository.msg.FinancialInstrument60.mmTransfereeAccount, com.tools20022.repository.msg.FinancialInstrument60.mmSubAccountDetails,
						com.tools20022.repository.msg.FinancialInstrument60.mmSettlementPartiesReceivingSideDetails, com.tools20022.repository.msg.FinancialInstrument60.mmDeliveringAgentDetails);
				trace_lazy = () -> InvestmentFundClass.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIdentificationGuideline.forFinancialInstrument60);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrument60";
				definition = "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, for example, dividend option or valuation currency.";
			}
		});
		return mmObject_lazy.get();
	}

	public SecurityIdentification25Choice getIdentification() {
		return identification;
	}

	public FinancialInstrument60 setIdentification(SecurityIdentification25Choice identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Max350Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public FinancialInstrument60 setName(Max350Text name) {
		this.name = name;
		return this;
	}

	public Optional<Max35Text> getShortName() {
		return shortName == null ? Optional.empty() : Optional.of(shortName);
	}

	public FinancialInstrument60 setShortName(Max35Text shortName) {
		this.shortName = shortName;
		return this;
	}

	public TransferType1Code getTransferType() {
		return transferType;
	}

	public FinancialInstrument60 setTransferType(TransferType1Code transferType) {
		this.transferType = Objects.requireNonNull(transferType);
		return this;
	}

	public Optional<Quantity12Choice> getQuantity() {
		return quantity == null ? Optional.empty() : Optional.of(quantity);
	}

	public FinancialInstrument60 setQuantity(Quantity12Choice quantity) {
		this.quantity = quantity;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getAverageAcquisitionPrice() {
		return averageAcquisitionPrice == null ? Optional.empty() : Optional.of(averageAcquisitionPrice);
	}

	public FinancialInstrument60 setAverageAcquisitionPrice(ActiveOrHistoricCurrencyAndAmount averageAcquisitionPrice) {
		this.averageAcquisitionPrice = averageAcquisitionPrice;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyCode> getTransferCurrency() {
		return transferCurrency == null ? Optional.empty() : Optional.of(transferCurrency);
	}

	public FinancialInstrument60 setTransferCurrency(ActiveOrHistoricCurrencyCode transferCurrency) {
		this.transferCurrency = transferCurrency;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getTotalBookValue() {
		return totalBookValue == null ? Optional.empty() : Optional.of(totalBookValue);
	}

	public FinancialInstrument60 setTotalBookValue(ActiveOrHistoricCurrencyAndAmount totalBookValue) {
		this.totalBookValue = totalBookValue;
		return this;
	}

	public Optional<Account24> getTransfereeAccount() {
		return transfereeAccount == null ? Optional.empty() : Optional.of(transfereeAccount);
	}

	public FinancialInstrument60 setTransfereeAccount(Account24 transfereeAccount) {
		this.transfereeAccount = transfereeAccount;
		return this;
	}

	public Optional<SubAccount5> getSubAccountDetails() {
		return subAccountDetails == null ? Optional.empty() : Optional.of(subAccountDetails);
	}

	public FinancialInstrument60 setSubAccountDetails(SubAccount5 subAccountDetails) {
		this.subAccountDetails = subAccountDetails;
		return this;
	}

	public Optional<ReceivingPartiesAndAccount18> getSettlementPartiesReceivingSideDetails() {
		return settlementPartiesReceivingSideDetails == null ? Optional.empty() : Optional.of(settlementPartiesReceivingSideDetails);
	}

	public FinancialInstrument60 setSettlementPartiesReceivingSideDetails(ReceivingPartiesAndAccount18 settlementPartiesReceivingSideDetails) {
		this.settlementPartiesReceivingSideDetails = settlementPartiesReceivingSideDetails;
		return this;
	}

	public Optional<PartyIdentificationAndAccount156> getDeliveringAgentDetails() {
		return deliveringAgentDetails == null ? Optional.empty() : Optional.of(deliveringAgentDetails);
	}

	public FinancialInstrument60 setDeliveringAgentDetails(PartyIdentificationAndAccount156 deliveringAgentDetails) {
		this.deliveringAgentDetails = deliveringAgentDetails;
		return this;
	}
}