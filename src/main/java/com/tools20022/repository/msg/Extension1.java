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
import com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07;
import com.tools20022.repository.area.acmt.AccountManagementStatusReportV06;
import com.tools20022.repository.area.acmt.AccountModificationInstructionV07;
import com.tools20022.repository.area.acmt.AccountOpeningInstructionV07;
import com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04;
import com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04;
import com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04;
import com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04;
import com.tools20022.repository.area.reda.PriceReportCancellationV04;
import com.tools20022.repository.area.reda.PriceReportV04;
import com.tools20022.repository.area.semt.AccountingStatementOfHoldingsV02;
import com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02;
import com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV03;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.area.setr.*;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Additional information that can not be captured in the structured fields
 * and/or any other specific block.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Extension1#mmPlaceAndName
 * Extension1.mmPlaceAndName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Extension1#mmText
 * Extension1.mmText}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV04#mmExtension
 * PriceReportCancellationV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV04#mmExtension
 * PriceReportV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsV02#mmExtension
 * AccountingStatementOfHoldingsV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02#mmExtension
 * CustodyStatementOfHoldingsV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04#mmExtension
 * FundDetailedEstimatedCashForecastReportV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04#mmExtension
 * FundConfirmedCashForecastReportV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmExtension
 * FundEstimatedCashForecastReportV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV03#mmExtension
 * StatementOfInvestmentFundTransactionsV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04#mmExtension
 * FundDetailedConfirmedCashForecastReportV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV04#mmExtension
 * SubscriptionBulkOrderConfirmationV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV04#mmExtension
 * RedemptionBulkOrderV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV04#mmExtension
 * RedemptionOrderV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV04#mmExtension
 * RedemptionBulkOrderConfirmationV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV04#mmExtension
 * SwitchOrderConfirmationV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV04#mmExtension
 * RequestForOrderStatusReportV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04#mmExtension
 * SubscriptionOrderConfirmationV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV04#mmExtension
 * OrderCancellationStatusReportV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV04#mmExtension
 * SwitchOrderV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV04#mmExtension
 * RedemptionOrderConfirmationV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV04#mmExtension
 * OrderInstructionStatusReportV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV02#mmExtension
 * RequestForOrderConfirmationStatusReportV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV04#mmExtension
 * SubscriptionBulkOrderV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02#mmExtension
 * OrderConfirmationStatusReportV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderV04#mmExtension
 * SubscriptionOrderV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmExtension
 * AccountDetailsConfirmationV07.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmExtension
 * AccountModificationInstructionV07.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#mmExtension
 * AccountOpeningInstructionV07.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV06#mmExtension
 * AccountManagementStatusReportV06.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV08#mmExtension
 * TransferInConfirmationV08.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV08#mmExtension
 * PortfolioTransferInstructionV08.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV08#mmExtension
 * TransferInInstructionV08.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV08#mmExtension
 * PortfolioTransferConfirmationV08.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV06#mmExtension
 * AccountHoldingInformationV06.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV08#mmExtension
 * TransferOutConfirmationV08.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV08#mmExtension
 * TransferOutInstructionV08.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV06#mmExtension
 * TransferCancellationStatusReportV06.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05#mmExtension
 * AccountHoldingInformationRequestV05.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReportV06#mmExtension
 * RequestForTransferStatusReportV06.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV06#mmExtension
 * TransferInstructionStatusReportV06.mmExtension}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintExtensionRule#forExtension1
 * ConstraintExtensionRule.forExtension1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Extension1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Additional information that can not be captured in the structured fields and/or any other specific block."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Extension1", propOrder = {"placeAndName", "text"})
public class Extension1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm", required = true)
	protected Max350Text placeAndName;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Extension1
	 * Extension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name qualifying the information provided in the Text field, and place where this information should be inserted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Extension1, Max350Text> mmPlaceAndName = new MMMessageAttribute<Extension1, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Extension1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Name qualifying the information provided in the Text field, and place where this information should be inserted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(Extension1 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(Extension1 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "Txt", required = true)
	protected Max350Text text;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Extension1
	 * Extension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Txt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Text"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Text of the extension."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Extension1, Max350Text> mmText = new MMMessageAttribute<Extension1, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Extension1.mmObject();
			isDerived = false;
			xmlTag = "Txt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Text";
			definition = "Text of the extension.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(Extension1 obj) {
			return obj.getText();
		}

		@Override
		public void setValue(Extension1 obj, Max350Text value) {
			obj.setText(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Extension1.mmPlaceAndName, com.tools20022.repository.msg.Extension1.mmText);
				messageBuildingBlock_lazy = () -> Arrays.asList(PriceReportCancellationV04.mmExtension, PriceReportV04.mmExtension, AccountingStatementOfHoldingsV02.mmExtension, CustodyStatementOfHoldingsV02.mmExtension,
						FundDetailedEstimatedCashForecastReportV04.mmExtension, FundConfirmedCashForecastReportV04.mmExtension, FundEstimatedCashForecastReportV04.mmExtension, StatementOfInvestmentFundTransactionsV03.mmExtension,
						FundDetailedConfirmedCashForecastReportV04.mmExtension, SubscriptionBulkOrderConfirmationV04.mmExtension, RedemptionBulkOrderV04.mmExtension, RedemptionOrderV04.mmExtension,
						RedemptionBulkOrderConfirmationV04.mmExtension, SwitchOrderConfirmationV04.mmExtension, RequestForOrderStatusReportV04.mmExtension, SubscriptionOrderConfirmationV04.mmExtension,
						OrderCancellationStatusReportV04.mmExtension, SwitchOrderV04.mmExtension, RedemptionOrderConfirmationV04.mmExtension, OrderInstructionStatusReportV04.mmExtension,
						RequestForOrderConfirmationStatusReportV02.mmExtension, SubscriptionBulkOrderV04.mmExtension, OrderConfirmationStatusReportV02.mmExtension, SubscriptionOrderV04.mmExtension,
						AccountDetailsConfirmationV07.mmExtension, AccountModificationInstructionV07.mmExtension, AccountOpeningInstructionV07.mmExtension, AccountManagementStatusReportV06.mmExtension,
						TransferInConfirmationV08.mmExtension, PortfolioTransferInstructionV08.mmExtension, TransferInInstructionV08.mmExtension, PortfolioTransferConfirmationV08.mmExtension, AccountHoldingInformationV06.mmExtension,
						TransferOutConfirmationV08.mmExtension, TransferOutInstructionV08.mmExtension, TransferCancellationStatusReportV06.mmExtension, AccountHoldingInformationRequestV05.mmExtension,
						RequestForTransferStatusReportV06.mmExtension, TransferInstructionStatusReportV06.mmExtension);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintExtensionRule.forExtension1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Extension1";
				definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public Extension1 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Max350Text getText() {
		return text;
	}

	public Extension1 setText(Max350Text text) {
		this.text = Objects.requireNonNull(text);
		return this;
	}
}