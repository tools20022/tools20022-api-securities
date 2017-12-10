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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.OffMarketCode;
import com.tools20022.repository.codeset.ProcessingPositionCode;
import com.tools20022.repository.codeset.ReportingCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Transaction between two counterparties in which they agree to buy and sell a
 * financial instrument. A trade transaction occurs with the matching of the two
 * counterparties orders. There could be several trade transactions necessary to
 * execute the trade.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesTradeExecution"
 * src="doc-files/SecuritiesTradeExecution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmStampDutyIndicator
 * SecuritiesTradeExecution.mmStampDutyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmProcessingPosition
 * SecuritiesTradeExecution.mmProcessingPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmDealPrice
 * SecuritiesTradeExecution.mmDealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmMarginAmount
 * SecuritiesTradeExecution.mmMarginAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmExecutedTradeQuantity
 * SecuritiesTradeExecution.mmExecutedTradeQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmOffMarketReason
 * SecuritiesTradeExecution.mmOffMarketReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmRelatedTrade
 * SecuritiesTradeExecution.mmRelatedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmDealExecutionAmount
 * SecuritiesTradeExecution.mmDealExecutionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmPaymentObligation
 * SecuritiesTradeExecution.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesDeliveryObligation
 * SecuritiesTradeExecution.mmSecuritiesDeliveryObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmReportingType
 * SecuritiesTradeExecution.mmReportingType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSecuritiesTradeExecution
 * SecuritiesPricing.mmSecuritiesTradeExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmExecutedSecuritiesTrade
 * PaymentObligation.mmExecutedSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesTradeExecution
 * SecuritiesQuantity.mmSecuritiesTradeExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradingExecution
 * SecuritiesTrade.mmTradingExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecuritiesTradeExecution
 * SecuritiesSettlement.mmSecuritiesTradeExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmSecuritiesTradeExecution
 * SecuritiesDeliveryObligation.mmSecuritiesTradeExecution}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
 * InvestmentFundOrderExecution}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.Reporting5Choice
 * Reporting5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Reporting6Choice
 * Reporting6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Reporting7Choice
 * Reporting7Choice}</li>
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
 * "SecuritiesTradeExecution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Transaction between two counterparties in which they agree to buy and sell a financial instrument. A trade transaction occurs with the matching of the two counterparties orders. There could be several trade transactions necessary to execute the trade."
 * </li>
 * </ul>
 */
public class SecuritiesTradeExecution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator stampDutyIndicator;
	/**
	 * Whether the net proceeds include stamp duty amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmStampDutyIndicator
	 * SettlementDetails43.mmStampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection28#mmStampDutyIndicator
	 * AmountAndDirection28.mmStampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection46#mmStampDutyIndicator
	 * AmountAndDirection46.mmStampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection45#mmStampDutyIndicator
	 * AmountAndDirection45.mmStampDutyIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDutyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Whether the net proceeds include stamp duty amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStampDutyIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementDetails43.mmStampDutyIndicator, AmountAndDirection28.mmStampDutyIndicator, AmountAndDirection46.mmStampDutyIndicator, AmountAndDirection45.mmStampDutyIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StampDutyIndicator";
			definition = "Whether the net proceeds include stamp duty amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeExecution.class.getMethod("getStampDutyIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ProcessingPositionCode processingPosition;
	/**
	 * When the transaction is to be executed relative to a linked transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingPositionCode
	 * ProcessingPositionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When the transaction is to be executed relative to a linked transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmProcessingPosition = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProcessingPosition";
			definition = "When the transaction is to be executed relative to a linked transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProcessingPositionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeExecution.class.getMethod("getProcessingPosition", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesSettlement> securitiesSettlement;
	/**
	 * Process of settling securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecuritiesTradeExecution
	 * SecuritiesSettlement.mmSecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmClosingAmountPerPiecesOfCollateral
	 * SecuritiesFinancing10.mmClosingAmountPerPiecesOfCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmCurrencyToBuyOrSell
	 * Order17.mmCurrencyToBuyOrSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmCurrencyToBuyOrSell
	 * Order18.mmCurrencyToBuyOrSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmSettlementDetails
	 * TradeLeg9.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmSettlementParameters
	 * SecuritiesTradeDetails48.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References45Choice#mmSecuritiesSettlementTransactionIdentification
	 * References45Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References45Choice#mmSecuritiesFinancingTransactionIdentification
	 * References45Choice.mmSecuritiesFinancingTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Linkages37#mmLinkedQuantity
	 * Linkages37.mmLinkedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References43Choice#mmSecuritiesSettlementTransactionConfirmationIdentification
	 * References43Choice.
	 * mmSecuritiesSettlementTransactionConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References43Choice#mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * References43Choice.
	 * mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References43Choice#mmSecuritiesSettlementTransactionGenerationNotificationIdentification
	 * References43Choice.
	 * mmSecuritiesSettlementTransactionGenerationNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Linkages38#mmLinkedQuantity
	 * Linkages38.mmLinkedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References46Choice#mmSecuritiesSettlementTransactionIdentification
	 * References46Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References41Choice#mmSecuritiesSettlementTransactionIdentification
	 * References41Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References44Choice#mmSecuritiesFinancingTransactionIdentification
	 * References44Choice.mmSecuritiesFinancingTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References44Choice#mmSecuritiesSettlementTransactionIdentification
	 * References44Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References47Choice#mmSecuritiesSettlementTransactionIdentification
	 * References47Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmSettlementAndCustodyDetails
	 * RedemptionOrder14.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmSettlementAndCustodyDetails
	 * SubscriptionExecution13.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmSettlementAndCustodyDetails
	 * SubscriptionExecution12.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmSettlementAndCustodyDetails
	 * SubscriptionOrder15.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmSettlementAndCustodyDetails
	 * RedemptionOrder15.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmSettlementAndCustodyDetails
	 * RedemptionExecution16.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmSettlementAndCustodyDetails
	 * SubscriptionOrder14.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmSettlementAndCustodyDetails
	 * RedemptionExecution15.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmSettlementAndCustodyDetails
	 * SwitchRedemptionLegExecution4.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmQuantityAndAccountDetails
	 * SecuritiesTradeDetails68.mmQuantityAndAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmSettlementParameters
	 * SecuritiesTradeDetails68.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmSettlementParameters
	 * TransactionDetails97.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#mmSettlementParameters
	 * TransactionDetails96.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmSettlementParameters
	 * TransactionDetails95.mmSettlementParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Process of settling securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesFinancing10.mmClosingAmountPerPiecesOfCollateral, Order17.mmCurrencyToBuyOrSell, Order18.mmCurrencyToBuyOrSell, TradeLeg9.mmSettlementDetails,
					SecuritiesTradeDetails48.mmSettlementParameters, References45Choice.mmSecuritiesSettlementTransactionIdentification, References45Choice.mmSecuritiesFinancingTransactionIdentification, Linkages37.mmLinkedQuantity,
					References43Choice.mmSecuritiesSettlementTransactionConfirmationIdentification, References43Choice.mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification,
					References43Choice.mmSecuritiesSettlementTransactionGenerationNotificationIdentification, Linkages38.mmLinkedQuantity, References46Choice.mmSecuritiesSettlementTransactionIdentification,
					References41Choice.mmSecuritiesSettlementTransactionIdentification, References44Choice.mmSecuritiesFinancingTransactionIdentification, References44Choice.mmSecuritiesSettlementTransactionIdentification,
					References47Choice.mmSecuritiesSettlementTransactionIdentification, RedemptionOrder14.mmSettlementAndCustodyDetails, SubscriptionExecution13.mmSettlementAndCustodyDetails,
					SubscriptionExecution12.mmSettlementAndCustodyDetails, SubscriptionOrder15.mmSettlementAndCustodyDetails, RedemptionOrder15.mmSettlementAndCustodyDetails, RedemptionExecution16.mmSettlementAndCustodyDetails,
					SubscriptionOrder14.mmSettlementAndCustodyDetails, RedemptionExecution15.mmSettlementAndCustodyDetails, SwitchRedemptionLegExecution4.mmSettlementAndCustodyDetails, SecuritiesTradeDetails68.mmQuantityAndAccountDetails,
					SecuritiesTradeDetails68.mmSettlementParameters, TransactionDetails97.mmSettlementParameters, TransactionDetails96.mmSettlementParameters, TransactionDetails95.mmSettlementParameters);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Process of settling securities.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmSecuritiesTradeExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
		}
	};
	protected SecuritiesPricing dealPrice;
	/**
	 * Specifies the price of the traded financial instrument. This is the deal
	 * price of the individual trade transaction. If there is only one trade
	 * transaction for the execution of the trade, then the deal price could
	 * equal the executed trade price (unless, for example, the price includes
	 * commissions or rounding, or some other factor has been applied to the
	 * deal price or the executed trade price, or both).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSecuritiesTradeExecution
	 * SecuritiesPricing.mmSecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmDealPrice
	 * TradeLeg8.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation7#mmDealPrice
	 * SettlementObligation7.mmDealPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg10#mmDealPrice
	 * TradeLeg10.mmDealPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmDealPrice
	 * TradeLeg9.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmDealPrice
	 * SecuritiesTradeDetails51.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#mmDealPrice
	 * SecuritiesTradeDetails53.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#mmDealPrice
	 * SecuritiesTradeDetails55.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmDealPrice
	 * SecuritiesTradeDetails56.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54#mmDealPrice
	 * SecuritiesTradeDetails54.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#mmDealPrice
	 * SecuritiesTradeDetails52.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#mmDealPrice
	 * SecuritiesTradeDetails50.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#mmDealPrice
	 * SecuritiesTradeDetails67.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmDealPrice
	 * SecuritiesTradeDetails68.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmDealPrice
	 * UnsecuredMarketTransaction4.mmDealPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the price of the traded financial instrument.\nThis is the deal price of the individual trade transaction. \nIf there is only one trade transaction for the execution of the trade, then the deal price could equal the executed trade price (unless, for example, the price includes commissions or rounding, or some other factor has been applied to the deal price or the executed trade price, or both)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDealPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(TradeLeg8.mmDealPrice, SettlementObligation7.mmDealPrice, TradeLeg10.mmDealPrice, TradeLeg9.mmDealPrice, SecuritiesTradeDetails51.mmDealPrice, SecuritiesTradeDetails53.mmDealPrice,
					SecuritiesTradeDetails55.mmDealPrice, SecuritiesTradeDetails56.mmDealPrice, SecuritiesTradeDetails54.mmDealPrice, SecuritiesTradeDetails52.mmDealPrice, SecuritiesTradeDetails50.mmDealPrice,
					SecuritiesTradeDetails67.mmDealPrice, SecuritiesTradeDetails68.mmDealPrice, UnsecuredMarketTransaction4.mmDealPrice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DealPrice";
			definition = "Specifies the price of the traded financial instrument.\nThis is the deal price of the individual trade transaction. \nIf there is only one trade transaction for the execution of the trade, then the deal price could equal the executed trade price (unless, for example, the price includes commissions or rounding, or some other factor has been applied to the deal price or the executed trade price, or both).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmSecuritiesTradeExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected CurrencyAndAmount marginAmount;
	/**
	 * Difference in prices at which a dealer will buy and sell.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Difference in prices at which a dealer will buy and sell."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMarginAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarginAmount";
			definition = "Difference in prices at which a dealer will buy and sell.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeExecution.class.getMethod("getMarginAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesQuantity> executedTradeQuantity;
	/**
	 * Quantity of financial instrument executed by the trading party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesTradeExecution
	 * SecuritiesQuantity.mmSecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutedTradeQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of financial instrument executed by the trading party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmExecutedTradeQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExecutedTradeQuantity";
			definition = "Quantity of financial instrument executed by the trading party.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmSecuritiesTradeExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected OffMarketCode offMarketReason;
	/**
	 * Reason for which the trade was executed off-market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OffMarketCode
	 * OffMarketCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffMarketReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for which the trade was executed off-market."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOffMarketReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OffMarketReason";
			definition = "Reason for which the trade was executed off-market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OffMarketCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeExecution.class.getMethod("getOffMarketReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesTrade relatedTrade;
	/**
	 * Trade which is executed through one or more execution trades.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradingExecution
	 * SecuritiesTrade.mmTradingExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Clearing4#mmNonGuaranteedTrade
	 * Clearing4.mmNonGuaranteedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails27.mmTradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails28.mmTradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails26.mmTradeDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade which is executed through one or more execution trades."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedTrade = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Clearing4.mmNonGuaranteedTrade, SecuritiesSettlementTransactionDetails27.mmTradeDetails, SecuritiesSettlementTransactionDetails28.mmTradeDetails,
					SecuritiesSettlementTransactionDetails26.mmTradeDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedTrade";
			definition = "Trade which is executed through one or more execution trades.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmTradingExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
		}
	};
	protected CurrencyAndAmount dealExecutionAmount;
	/**
	 * Deal price multiplied by the quantity of a financial instrument traded
	 * for the specific trade transaction i.e. the partially filled quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealExecutionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deal price multiplied by the quantity of a financial instrument traded for the specific trade transaction i.e. the partially filled quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDealExecutionAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DealExecutionAmount";
			definition = "Deal price multiplied by the quantity of a financial instrument traded for the specific trade transaction i.e. the partially filled quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeExecution.class.getMethod("getDealExecutionAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.PaymentObligation> paymentObligation;
	/**
	 * Specifies the cash delivery obligations resulting from the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmExecutedSecuritiesTrade
	 * PaymentObligation.mmExecutedSecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the cash delivery obligations resulting from the trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPaymentObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Specifies the cash delivery obligations resulting from the trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmExecutedSecuritiesTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesDeliveryObligation> securitiesDeliveryObligation;
	/**
	 * Specifies the securities delivery obligations resulting from the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmSecuritiesTradeExecution
	 * SecuritiesDeliveryObligation.mmSecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmAdditionalSettlementObligationDetails
	 * SettlementObligation8.mmAdditionalSettlementObligationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesDeliveryObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the securities delivery obligations resulting from the trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesDeliveryObligation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementObligation8.mmAdditionalSettlementObligationDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesDeliveryObligation";
			definition = "Specifies the securities delivery obligations resulting from the trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmSecuritiesTradeExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmObject();
		}
	};
	protected ReportingCode reportingType;
	/**
	 * Specifies that a trade is to be reported to a third party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingCode
	 * ReportingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.Reporting5Choice#mmCode
	 * Reporting5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reporting5Choice#mmProprietary
	 * Reporting5Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmReporting
	 * Order17.mmReporting}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmReporting
	 * Order18.mmReporting}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Reporting6Choice#mmCode
	 * Reporting6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reporting6Choice#mmProprietary
	 * Reporting6Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Reporting7Choice#mmCode
	 * Reporting7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reporting7Choice#mmProprietary
	 * Reporting7Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that a trade is to be reported to a third party."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmReportingType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Reporting5Choice.mmCode, Reporting5Choice.mmProprietary, Order17.mmReporting, Order18.mmReporting, Reporting6Choice.mmCode, Reporting6Choice.mmProprietary, Reporting7Choice.mmCode,
					Reporting7Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReportingType";
			definition = "Specifies that a trade is to be reported to a third party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReportingCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeExecution.class.getMethod("getReportingType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTradeExecution";
				definition = "Transaction between two counterparties in which they agree to buy and sell a financial instrument. A trade transaction occurs with the matching of the two counterparties orders. There could be several trade transactions necessary to execute the trade.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.mmSecuritiesTradeExecution, com.tools20022.repository.entity.PaymentObligation.mmExecutedSecuritiesTrade,
						com.tools20022.repository.entity.SecuritiesQuantity.mmSecuritiesTradeExecution, com.tools20022.repository.entity.SecuritiesTrade.mmTradingExecution,
						com.tools20022.repository.entity.SecuritiesSettlement.mmSecuritiesTradeExecution, com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmSecuritiesTradeExecution);
				subType_lazy = () -> Arrays.asList(InvestmentFundOrderExecution.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTradeExecution.mmStampDutyIndicator, com.tools20022.repository.entity.SecuritiesTradeExecution.mmProcessingPosition,
						com.tools20022.repository.entity.SecuritiesTradeExecution.mmSecuritiesSettlement, com.tools20022.repository.entity.SecuritiesTradeExecution.mmDealPrice,
						com.tools20022.repository.entity.SecuritiesTradeExecution.mmMarginAmount, com.tools20022.repository.entity.SecuritiesTradeExecution.mmExecutedTradeQuantity,
						com.tools20022.repository.entity.SecuritiesTradeExecution.mmOffMarketReason, com.tools20022.repository.entity.SecuritiesTradeExecution.mmRelatedTrade,
						com.tools20022.repository.entity.SecuritiesTradeExecution.mmDealExecutionAmount, com.tools20022.repository.entity.SecuritiesTradeExecution.mmPaymentObligation,
						com.tools20022.repository.entity.SecuritiesTradeExecution.mmSecuritiesDeliveryObligation, com.tools20022.repository.entity.SecuritiesTradeExecution.mmReportingType);
				derivationComponent_lazy = () -> Arrays.asList(Reporting5Choice.mmObject(), Reporting6Choice.mmObject(), Reporting7Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesTradeExecution.class;
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getStampDutyIndicator() {
		return stampDutyIndicator;
	}

	public void setStampDutyIndicator(YesNoIndicator stampDutyIndicator) {
		this.stampDutyIndicator = stampDutyIndicator;
	}

	public ProcessingPositionCode getProcessingPosition() {
		return processingPosition;
	}

	public void setProcessingPosition(ProcessingPositionCode processingPosition) {
		this.processingPosition = processingPosition;
	}

	public List<SecuritiesSettlement> getSecuritiesSettlement() {
		return securitiesSettlement;
	}

	public void setSecuritiesSettlement(List<com.tools20022.repository.entity.SecuritiesSettlement> securitiesSettlement) {
		this.securitiesSettlement = securitiesSettlement;
	}

	public SecuritiesPricing getDealPrice() {
		return dealPrice;
	}

	public void setDealPrice(com.tools20022.repository.entity.SecuritiesPricing dealPrice) {
		this.dealPrice = dealPrice;
	}

	public CurrencyAndAmount getMarginAmount() {
		return marginAmount;
	}

	public void setMarginAmount(CurrencyAndAmount marginAmount) {
		this.marginAmount = marginAmount;
	}

	public List<SecuritiesQuantity> getExecutedTradeQuantity() {
		return executedTradeQuantity;
	}

	public void setExecutedTradeQuantity(List<com.tools20022.repository.entity.SecuritiesQuantity> executedTradeQuantity) {
		this.executedTradeQuantity = executedTradeQuantity;
	}

	public OffMarketCode getOffMarketReason() {
		return offMarketReason;
	}

	public void setOffMarketReason(OffMarketCode offMarketReason) {
		this.offMarketReason = offMarketReason;
	}

	public SecuritiesTrade getRelatedTrade() {
		return relatedTrade;
	}

	public void setRelatedTrade(com.tools20022.repository.entity.SecuritiesTrade relatedTrade) {
		this.relatedTrade = relatedTrade;
	}

	public CurrencyAndAmount getDealExecutionAmount() {
		return dealExecutionAmount;
	}

	public void setDealExecutionAmount(CurrencyAndAmount dealExecutionAmount) {
		this.dealExecutionAmount = dealExecutionAmount;
	}

	public List<PaymentObligation> getPaymentObligation() {
		return paymentObligation;
	}

	public void setPaymentObligation(List<com.tools20022.repository.entity.PaymentObligation> paymentObligation) {
		this.paymentObligation = paymentObligation;
	}

	public List<SecuritiesDeliveryObligation> getSecuritiesDeliveryObligation() {
		return securitiesDeliveryObligation;
	}

	public void setSecuritiesDeliveryObligation(List<com.tools20022.repository.entity.SecuritiesDeliveryObligation> securitiesDeliveryObligation) {
		this.securitiesDeliveryObligation = securitiesDeliveryObligation;
	}

	public ReportingCode getReportingType() {
		return reportingType;
	}

	public void setReportingType(ReportingCode reportingType) {
		this.reportingType = reportingType;
	}
}