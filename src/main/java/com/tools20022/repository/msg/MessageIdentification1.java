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
import com.tools20022.repository.area.acmt.*;
import com.tools20022.repository.area.camt.*;
import com.tools20022.repository.area.reda.FundProcessingPassportReportV02;
import com.tools20022.repository.area.reda.InvestmentFundReportRequestV02;
import com.tools20022.repository.area.reda.PriceReportCancellationV04;
import com.tools20022.repository.area.reda.PriceReportV04;
import com.tools20022.repository.area.semt.*;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.area.setr.*;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies a message by a unique identifier and the date and time when the
 * message was created by the sender.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MessageIdentification1#mmIdentification
 * MessageIdentification1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MessageIdentification1#mmCreationDateTime
 * MessageIdentification1.mmCreationDateTime}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.FundProcessingPassportReportV02#mmMessageIdentification
 * FundProcessingPassportReportV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.InvestmentFundReportRequestV02#mmMessageIdentification
 * InvestmentFundReportRequestV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV04#mmMessageIdentification
 * PriceReportCancellationV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV04#mmMessageIdentification
 * PriceReportV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsV02#mmMessageIdentification
 * AccountingStatementOfHoldingsV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02#mmMessageIdentification
 * CustodyStatementOfHoldingsV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsCancellationV02#mmMessageIdentification
 * AccountingStatementOfHoldingsCancellationV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellationV02#mmMessageIdentification
 * CustodyStatementOfHoldingsCancellationV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04#mmMessageIdentification
 * FundDetailedEstimatedCashForecastReportV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04#mmMessageIdentification
 * FundConfirmedCashForecastReportV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV03#mmMessageIdentification
 * FundDetailedConfirmedCashForecastReportCancellationV03.
 * mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmMessageIdentification
 * FundEstimatedCashForecastReportV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV03#mmMessageIdentification
 * StatementOfInvestmentFundTransactionsV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageRejectionV03#mmMessageIdentification
 * SecuritiesMessageRejectionV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03#mmMessageIdentification
 * FundConfirmedCashForecastReportCancellationV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV03#mmMessageIdentification
 * StatementOfInvestmentFundTransactionsCancellationV03.mmMessageIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04#mmMessageIdentification
 * FundDetailedConfirmedCashForecastReportV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01#mmMessageIdentification
 * SecuritiesBalanceTransparencyReportStatusAdviceV01.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportV02#mmMessageIdentification
 * SecuritiesBalanceTransparencyReportV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV04#mmMessageIdentification
 * SubscriptionBulkOrderConfirmationV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV04#mmMessageIdentification
 * RedemptionBulkOrderV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationRequestV04#mmMessageIdentification
 * SubscriptionBulkOrderCancellationRequestV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV04#mmMessageIdentification
 * RedemptionOrderV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV04#mmMessageIdentification
 * SubscriptionOrderCancellationRequestV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV02#mmMessageIdentification
 * RedemptionBulkOrderConfirmationCancellationInstructionV02.
 * mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV04#mmMessageIdentification
 * RedemptionBulkOrderConfirmationV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationRequestV04#mmMessageIdentification
 * RedemptionBulkOrderCancellationRequestV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV04#mmMessageIdentification
 * SwitchOrderConfirmationV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV04#mmMessageIdentification
 * RequestForOrderStatusReportV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04#mmMessageIdentification
 * SubscriptionOrderConfirmationV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV02#mmMessageIdentification
 * SubscriptionOrderConfirmationCancellationInstructionV02.
 * mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV04#mmMessageIdentification
 * SwitchOrderCancellationRequestV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV04#mmMessageIdentification
 * OrderCancellationStatusReportV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV04#mmMessageIdentification
 * SwitchOrderV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV02#mmMessageIdentification
 * RedemptionOrderConfirmationCancellationInstructionV02.mmMessageIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV04#mmMessageIdentification
 * RedemptionOrderConfirmationV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV04#mmMessageIdentification
 * OrderInstructionStatusReportV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02#mmMessageIdentification
 * SubscriptionBulkOrderConfirmationCancellationInstructionV02.
 * mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderCancellationRequestV04#mmMessageIdentification
 * RedemptionOrderCancellationRequestV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV02#mmMessageIdentification
 * RequestForOrderConfirmationStatusReportV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV04#mmMessageIdentification
 * SubscriptionBulkOrderV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02#mmMessageIdentification
 * SwitchOrderConfirmationCancellationInstructionV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02#mmMessageIdentification
 * OrderConfirmationStatusReportV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderV04#mmMessageIdentification
 * SubscriptionOrderV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmMessageIdentification
 * AccountDetailsConfirmationV07.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmMessageIdentification
 * AccountModificationInstructionV07.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#mmMessageIdentification
 * AccountOpeningInstructionV07.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV06#mmMessageIdentification
 * AccountManagementStatusReportV06.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.RequestForAccountManagementStatusReportV05#mmMessageIdentification
 * RequestForAccountManagementStatusReportV05.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV08#mmMessageIdentification
 * ReversalOfTransferOutConfirmationV08.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV08#mmMessageIdentification
 * TransferInConfirmationV08.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV08#mmMessageReference
 * PortfolioTransferInstructionV08.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV08#mmMessageReference
 * PortfolioTransferCancellationRequestV08.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV08#mmMessageIdentification
 * TransferOutCancellationRequestV08.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV08#mmMessageIdentification
 * TransferInInstructionV08.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV08#mmMessageReference
 * PortfolioTransferConfirmationV08.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV06#mmMessageReference
 * AccountHoldingInformationV06.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV08#mmMessageIdentification
 * TransferOutConfirmationV08.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV08#mmMessageIdentification
 * TransferInCancellationRequestV08.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV08#mmMessageIdentification
 * TransferOutInstructionV08.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV06#mmMessageIdentification
 * TransferCancellationStatusReportV06.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05#mmMessageReference
 * AccountHoldingInformationRequestV05.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV08#mmMessageIdentification
 * ReversalOfTransferInConfirmationV08.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReportV06#mmMessageIdentification
 * RequestForTransferStatusReportV06.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV06#mmMessageIdentification
 * TransferInstructionStatusReportV06.mmMessageIdentification}</li>
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
 * "MessageIdentification1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies a message by a unique identifier and the date and time when the message was created by the sender."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MessageIdentification1", propOrder = {"identification", "creationDateTime"})
public class MessageIdentification1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected Max35Text identification;
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
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
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
	 * definition} = "Identification of the message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MessageIdentification1, Max35Text> mmIdentification = new MMMessageAttribute<MessageIdentification1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageIdentification1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(MessageIdentification1 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(MessageIdentification1 obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "CreDtTm", required = true)
	protected ISODateTime creationDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of creation of the message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MessageIdentification1, ISODateTime> mmCreationDateTime = new MMMessageAttribute<MessageIdentification1, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageIdentification1.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date of creation of the message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(MessageIdentification1 obj) {
			return obj.getCreationDateTime();
		}

		@Override
		public void setValue(MessageIdentification1 obj, ISODateTime value) {
			obj.setCreationDateTime(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MessageIdentification1.mmIdentification, com.tools20022.repository.msg.MessageIdentification1.mmCreationDateTime);
				messageBuildingBlock_lazy = () -> Arrays.asList(FundProcessingPassportReportV02.mmMessageIdentification, InvestmentFundReportRequestV02.mmMessageIdentification, PriceReportCancellationV04.mmMessageIdentification,
						PriceReportV04.mmMessageIdentification, AccountingStatementOfHoldingsV02.mmMessageIdentification, CustodyStatementOfHoldingsV02.mmMessageIdentification,
						AccountingStatementOfHoldingsCancellationV02.mmMessageIdentification, CustodyStatementOfHoldingsCancellationV02.mmMessageIdentification, FundDetailedEstimatedCashForecastReportV04.mmMessageIdentification,
						FundConfirmedCashForecastReportV04.mmMessageIdentification, FundDetailedConfirmedCashForecastReportCancellationV03.mmMessageIdentification, FundEstimatedCashForecastReportV04.mmMessageIdentification,
						StatementOfInvestmentFundTransactionsV03.mmMessageIdentification, SecuritiesMessageRejectionV03.mmMessageIdentification, FundConfirmedCashForecastReportCancellationV03.mmMessageIdentification,
						StatementOfInvestmentFundTransactionsCancellationV03.mmMessageIdentification, FundDetailedConfirmedCashForecastReportV04.mmMessageIdentification,
						SecuritiesBalanceTransparencyReportStatusAdviceV01.mmMessageIdentification, SecuritiesBalanceTransparencyReportV02.mmMessageIdentification, SubscriptionBulkOrderConfirmationV04.mmMessageIdentification,
						RedemptionBulkOrderV04.mmMessageIdentification, SubscriptionBulkOrderCancellationRequestV04.mmMessageIdentification, RedemptionOrderV04.mmMessageIdentification,
						SubscriptionOrderCancellationRequestV04.mmMessageIdentification, RedemptionBulkOrderConfirmationCancellationInstructionV02.mmMessageIdentification, RedemptionBulkOrderConfirmationV04.mmMessageIdentification,
						RedemptionBulkOrderCancellationRequestV04.mmMessageIdentification, SwitchOrderConfirmationV04.mmMessageIdentification, RequestForOrderStatusReportV04.mmMessageIdentification,
						SubscriptionOrderConfirmationV04.mmMessageIdentification, SubscriptionOrderConfirmationCancellationInstructionV02.mmMessageIdentification, SwitchOrderCancellationRequestV04.mmMessageIdentification,
						OrderCancellationStatusReportV04.mmMessageIdentification, SwitchOrderV04.mmMessageIdentification, RedemptionOrderConfirmationCancellationInstructionV02.mmMessageIdentification,
						RedemptionOrderConfirmationV04.mmMessageIdentification, OrderInstructionStatusReportV04.mmMessageIdentification, SubscriptionBulkOrderConfirmationCancellationInstructionV02.mmMessageIdentification,
						RedemptionOrderCancellationRequestV04.mmMessageIdentification, RequestForOrderConfirmationStatusReportV02.mmMessageIdentification, SubscriptionBulkOrderV04.mmMessageIdentification,
						SwitchOrderConfirmationCancellationInstructionV02.mmMessageIdentification, OrderConfirmationStatusReportV02.mmMessageIdentification, SubscriptionOrderV04.mmMessageIdentification,
						AccountDetailsConfirmationV07.mmMessageIdentification, AccountModificationInstructionV07.mmMessageIdentification, AccountOpeningInstructionV07.mmMessageIdentification,
						AccountManagementStatusReportV06.mmMessageIdentification, RequestForAccountManagementStatusReportV05.mmMessageIdentification, ReversalOfTransferOutConfirmationV08.mmMessageIdentification,
						TransferInConfirmationV08.mmMessageIdentification, PortfolioTransferInstructionV08.mmMessageReference, PortfolioTransferCancellationRequestV08.mmMessageReference,
						TransferOutCancellationRequestV08.mmMessageIdentification, TransferInInstructionV08.mmMessageIdentification, PortfolioTransferConfirmationV08.mmMessageReference, AccountHoldingInformationV06.mmMessageReference,
						TransferOutConfirmationV08.mmMessageIdentification, TransferInCancellationRequestV08.mmMessageIdentification, TransferOutInstructionV08.mmMessageIdentification,
						TransferCancellationStatusReportV06.mmMessageIdentification, AccountHoldingInformationRequestV05.mmMessageReference, ReversalOfTransferInConfirmationV08.mmMessageIdentification,
						RequestForTransferStatusReportV06.mmMessageIdentification, TransferInstructionStatusReportV06.mmMessageIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageIdentification1";
				definition = "Identifies a message by a unique identifier and the date and time when the message was created by the sender.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public MessageIdentification1 setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public MessageIdentification1 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = Objects.requireNonNull(creationDateTime);
		return this;
	}
}