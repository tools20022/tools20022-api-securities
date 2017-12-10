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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * An investor's instruction to either subscribe or redeem an amount of money or
 * its equivalent, for example other assets, into or out of an investment fund.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentFundOrder" src="doc-files/InvestmentFundOrder.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
 * SecuritiesOrder}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmGrossAmountIndicator
 * InvestmentFundOrder.mmGrossAmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmRelatedTransaction
 * InvestmentFundOrder.mmRelatedTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderType
 * InvestmentFundOrder.mmOrderType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmGrossAmount
 * InvestmentFundOrder.mmGrossAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmUnitsNumber
 * InvestmentFundOrder.mmUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmInvestmentFundOrderExecution
 * InvestmentFundOrder.mmInvestmentFundOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmNetAmount
 * InvestmentFundOrder.mmNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderDateTime
 * InvestmentFundOrder.mmOrderDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmExpiryDateTime
 * InvestmentFundOrder.mmExpiryDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmCancellationRight
 * InvestmentFundOrder.mmCancellationRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmRequestedSettlementCurrency
 * InvestmentFundOrder.mmRequestedSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmRequestedExecutionDateTime
 * InvestmentFundOrder.mmRequestedExecutionDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmFinancialAdvice
 * InvestmentFundOrder.mmFinancialAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmNegotiatedTrade
 * InvestmentFundOrder.mmNegotiatedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmHoldingsRate
 * InvestmentFundOrder.mmHoldingsRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderWaiverReason
 * InvestmentFundOrder.mmOrderWaiverReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmInitialOrderIndicator
 * InvestmentFundOrder.mmInitialOrderIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderBookingDate
 * InvestmentFundOrder.mmOrderBookingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmInvestmentPlan
 * InvestmentFundOrder.mmInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderStatus
 * InvestmentFundOrder.mmOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmTotalAmount
 * InvestmentFundOrder.mmTotalAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#mmStandingOrder
 * InvestmentPlan.mmStandingOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmOrder
 * SecuritiesQuantity.mmOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundOrder
 * InvestmentFundTransaction.mmInvestmentFundOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmOrder
 * InvestmentFundOrderExecution.mmOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmInvestmentFundOrder
 * SecuritiesOrderStatus.mmInvestmentFundOrder}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BlockedStatusReason2#mmTransactionType
 * BlockedStatusReason2.mmTransactionType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.RedemptionOrder
 * RedemptionOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SwitchOrder SwitchOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SubscriptionOrder
 * SubscriptionOrder}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFundOrder4
 * InvestmentFundOrder4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferReference8
 * TransferReference8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferReference7
 * TransferReference7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferReference9
 * TransferReference9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferReference10
 * TransferReference10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2
 * IndividualOrderConfirmationStatusAndReason2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFundOrder11
 * InvestmentFundOrder11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFundOrder9
 * InvestmentFundOrder9}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TransactionType5Choice
 * TransactionType5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity26Choice
 * FinancialInstrumentQuantity26Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.FundOrderType4Choice
 * FundOrderType4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrderWaiver1 OrderWaiver1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown2
 * InvestmentFundsOrderBreakdown2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OrderWaiverReason3Choice
 * OrderWaiverReason3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundOrderData5 FundOrderData5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity29Choice
 * FinancialInstrumentQuantity29Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFundOrder8
 * InvestmentFundOrder8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchLegReferences2
 * SwitchLegReferences2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BlockedStatusReason2
 * BlockedStatusReason2}</li>
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
 * "InvestmentFundOrder"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "An investor's instruction to either subscribe or redeem an amount of money or its equivalent, for example other assets, into or out of an investment fund."
 * </li>
 * </ul>
 */
public class InvestmentFundOrder extends SecuritiesOrder {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator grossAmountIndicator;
	/**
	 * Indicates whether an ordered amount is a gross amount (including all
	 * charges, commissions, tax). If it is not a gross amount, the ordered
	 * amount is a net amount (amount to be invested or redeemed from the fund
	 * to which other elements will be added).
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmGrossAmountIndicator
	 * InvestmentPlan14.mmGrossAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmGrossAmountIndicator
	 * InvestmentPlan15.mmGrossAmountIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossAmountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an ordered amount is a gross amount (including all charges, commissions, tax). If it is not a gross amount, the ordered amount is a net amount (amount to be invested or redeemed from the fund to which other elements will be added)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmGrossAmountIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentPlan14.mmGrossAmountIndicator, InvestmentPlan15.mmGrossAmountIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossAmountIndicator";
			definition = "Indicates whether an ordered amount is a gross amount (including all charges, commissions, tax). If it is not a gross amount, the ordered amount is a net amount (amount to be invested or redeemed from the fund to which other elements will be added).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getGrossAmountIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestmentFundTransaction relatedTransaction;
	/**
	 * Transaction which is the source of the order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundOrder
	 * InvestmentFundTransaction.mmInvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction which is the source of the order."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedTransaction";
			definition = "Transaction which is the source of the order.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentFundOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
		}
	};
	protected FundOrderTypeCode orderType;
	/**
	 * Specifies the category of the investment fund order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
	 * FundOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderBreakdownType1Choice#mmCode
	 * OrderBreakdownType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderBreakdownType1Choice#mmProprietary
	 * OrderBreakdownType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmOrderType
	 * RedemptionOrder14.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionType5Choice#mmCode
	 * TransactionType5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionType5Choice#mmProprietary
	 * TransactionType5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FundOrderType4Choice#mmCode
	 * FundOrderType4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FundOrderType4Choice#mmProprietary
	 * FundOrderType4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmOrderType
	 * SubscriptionExecution13.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown2#mmOrderBreakdownType
	 * InvestmentFundsOrderBreakdown2.mmOrderBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmOrderType
	 * SubscriptionExecution12.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmOrderType
	 * SubscriptionOrder15.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmOrderType
	 * RedemptionOrder15.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmOrderType
	 * RedemptionExecution16.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmOrderType
	 * SubscriptionOrder14.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmOrderType
	 * RedemptionExecution15.mmOrderType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the category of the investment fund order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOrderType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OrderBreakdownType1Choice.mmCode, OrderBreakdownType1Choice.mmProprietary, RedemptionOrder14.mmOrderType, TransactionType5Choice.mmCode, TransactionType5Choice.mmProprietary,
					FundOrderType4Choice.mmCode, FundOrderType4Choice.mmProprietary, SubscriptionExecution13.mmOrderType, InvestmentFundsOrderBreakdown2.mmOrderBreakdownType, SubscriptionExecution12.mmOrderType,
					SubscriptionOrder15.mmOrderType, RedemptionOrder15.mmOrderType, RedemptionExecution16.mmOrderType, SubscriptionOrder14.mmOrderType, RedemptionExecution15.mmOrderType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderType";
			definition = "Specifies the category of the investment fund order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FundOrderTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getOrderType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount grossAmount;
	/**
	 * Amount of money used to derive the quantity of investment fund units sold
	 * or subscribed, before deduction of charges, commissions, and taxes,
	 * expressed in the currency requested by the investor.<br>
	 * [Quantity * Price] + (Charges + Commissions +Taxes)]
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity26Choice#mmGrossAmount
	 * FinancialInstrumentQuantity26Choice.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmGrossAmount
	 * SubscriptionExecution13.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmGrossAmount
	 * SubscriptionExecution12.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5#mmGrossAmount
	 * FundOrderData5.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity29Choice#mmGrossAmount
	 * FinancialInstrumentQuantity29Choice.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity28Choice#mmGrossAmount
	 * FinancialInstrumentQuantity28Choice.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmGrossAmount
	 * RedemptionExecution16.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmGrossAmount
	 * SwitchSubscriptionLegExecution4.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity27Choice#mmGrossAmount
	 * FinancialInstrumentQuantity27Choice.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmGrossAmount
	 * RedemptionExecution15.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmGrossAmount
	 * SwitchRedemptionLegExecution4.mmGrossAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money used to derive the quantity of investment fund units sold or subscribed, before deduction of charges, commissions, and taxes, expressed in the currency requested by the investor.\r\n[Quantity * Price] + (Charges + Commissions +Taxes)]"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmGrossAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentQuantity26Choice.mmGrossAmount, SubscriptionExecution13.mmGrossAmount, SubscriptionExecution12.mmGrossAmount, FundOrderData5.mmGrossAmount,
					FinancialInstrumentQuantity29Choice.mmGrossAmount, FinancialInstrumentQuantity28Choice.mmGrossAmount, RedemptionExecution16.mmGrossAmount, SwitchSubscriptionLegExecution4.mmGrossAmount,
					FinancialInstrumentQuantity27Choice.mmGrossAmount, RedemptionExecution15.mmGrossAmount, SwitchRedemptionLegExecution4.mmGrossAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossAmount";
			definition = "Amount of money used to derive the quantity of investment fund units sold or subscribed, before deduction of charges, commissions, and taxes, expressed in the currency requested by the investor.\r\n[Quantity * Price] + (Charges + Commissions +Taxes)]";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getGrossAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesQuantity unitsNumber;
	/**
	 * Quantity of investment fund units to be subscribed or redeemed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmOrder
	 * SecuritiesQuantity.mmOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmFinancialInstrumentQuantityChoice
	 * SwitchSubscriptionLegOrder6.mmFinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity26Choice#mmUnitsNumber
	 * FinancialInstrumentQuantity26Choice.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5#mmUnitsNumber
	 * FundOrderData5.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmFinancialInstrumentQuantityChoice
	 * SwitchRedemptionLegOrder6.mmFinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity29Choice#mmUnitsNumber
	 * FinancialInstrumentQuantity29Choice.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity28Choice#mmUnitsNumber
	 * FinancialInstrumentQuantity28Choice.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity27Choice#mmUnitsNumber
	 * FinancialInstrumentQuantity27Choice.mmUnitsNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of investment fund units to be subscribed or redeemed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmUnitsNumber = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SwitchSubscriptionLegOrder6.mmFinancialInstrumentQuantityChoice, FinancialInstrumentQuantity26Choice.mmUnitsNumber, FundOrderData5.mmUnitsNumber,
					SwitchRedemptionLegOrder6.mmFinancialInstrumentQuantityChoice, FinancialInstrumentQuantity29Choice.mmUnitsNumber, FinancialInstrumentQuantity28Choice.mmUnitsNumber, FinancialInstrumentQuantity27Choice.mmUnitsNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnitsNumber";
			definition = "Quantity of investment fund units to be subscribed or redeemed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected InvestmentFundOrderExecution investmentFundOrderExecution;
	/**
	 * Execution of an investment fund order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmOrder
	 * InvestmentFundOrderExecution.mmOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#mmNewDetails
	 * IndividualOrderStatusAndReason7.mmNewDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmNewDetails
	 * SwitchOrderStatusAndReason2.mmNewDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundOrderExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Execution of an investment fund order."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvestmentFundOrderExecution = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(IndividualOrderStatusAndReason7.mmNewDetails, SwitchOrderStatusAndReason2.mmNewDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundOrderExecution";
			definition = "Execution of an investment fund order.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
		}
	};
	protected CurrencyAndAmount netAmount;
	/**
	 * Amount of money used to determine the quantity of investment fund units
	 * to be subscribed or to be sold.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity26Choice#mmNetAmount
	 * FinancialInstrumentQuantity26Choice.mmNetAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FundOrderData5#mmNetAmount
	 * FundOrderData5.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity29Choice#mmNetAmount
	 * FinancialInstrumentQuantity29Choice.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity28Choice#mmNetAmount
	 * FinancialInstrumentQuantity28Choice.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity27Choice#mmNetAmount
	 * FinancialInstrumentQuantity27Choice.mmNetAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money used to determine the quantity of investment fund units to be subscribed or to be sold."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNetAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentQuantity26Choice.mmNetAmount, FundOrderData5.mmNetAmount, FinancialInstrumentQuantity29Choice.mmNetAmount, FinancialInstrumentQuantity28Choice.mmNetAmount,
					FinancialInstrumentQuantity27Choice.mmNetAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetAmount";
			definition = "Amount of money used to determine the quantity of investment fund units to be subscribed or to be sold.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getNetAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime orderDateTime;
	/**
	 * Date and time at which the order was placed by the investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmOrderDateTime
	 * InvestmentFundTransaction4.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmOrderDateTime
	 * SwitchExecution7.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#mmOrderDateTime
	 * SubscriptionBulkOrder5.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#mmOrderDateTime
	 * RedemptionBulkExecution5.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmOrderDateTime
	 * RedemptionMultipleExecution5.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#mmOrderDateTime
	 * RedemptionMultipleOrder6.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#mmOrderDateTime
	 * SubscriptionMultipleOrder6.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4#mmOrderDateTime
	 * SubscriptionBulkExecution4.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmOrderDateTime
	 * SwitchOrder7.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#mmOrderDateTime
	 * RedemptionBulkOrder6.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5#mmOrderDateTime
	 * SubscriptionMultipleExecution5.mmOrderDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the order was placed by the investor."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOrderDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentFundTransaction4.mmOrderDateTime, SwitchExecution7.mmOrderDateTime, SubscriptionBulkOrder5.mmOrderDateTime, RedemptionBulkExecution5.mmOrderDateTime,
					RedemptionMultipleExecution5.mmOrderDateTime, RedemptionMultipleOrder6.mmOrderDateTime, SubscriptionMultipleOrder6.mmOrderDateTime, SubscriptionBulkExecution4.mmOrderDateTime, SwitchOrder7.mmOrderDateTime,
					RedemptionBulkOrder6.mmOrderDateTime, SubscriptionMultipleExecution5.mmOrderDateTime);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderDateTime";
			definition = "Date and time at which the order was placed by the investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getOrderDateTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime expiryDateTime;
	/**
	 * Date on which the order expires.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#mmExpiryDateTime
	 * SubscriptionBulkOrder5.mmExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#mmExpiryDateTime
	 * RedemptionMultipleOrder6.mmExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#mmExpiryDateTime
	 * SubscriptionMultipleOrder6.mmExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmExpiryDateTime
	 * SwitchOrder7.mmExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#mmExpiryDateTime
	 * RedemptionBulkOrder6.mmExpiryDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the order expires."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExpiryDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SubscriptionBulkOrder5.mmExpiryDateTime, RedemptionMultipleOrder6.mmExpiryDateTime, SubscriptionMultipleOrder6.mmExpiryDateTime, SwitchOrder7.mmExpiryDateTime,
					RedemptionBulkOrder6.mmExpiryDateTime);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpiryDateTime";
			definition = "Date on which the order expires.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getExpiryDateTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CancellationRightCode cancellationRight;
	/**
	 * Cancellation right of an investor with respect to an investment fund
	 * order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationRightCode
	 * CancellationRightCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmCancellationRight
	 * SwitchExecution7.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#mmCancellationRight
	 * SubscriptionBulkOrder5.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#mmCancellationRight
	 * RedemptionBulkExecution5.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmCancellationRight
	 * RedemptionMultipleExecution5.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#mmCancellationRight
	 * RedemptionMultipleOrder6.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#mmCancellationRight
	 * SubscriptionMultipleOrder6.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4#mmCancellationRight
	 * SubscriptionBulkExecution4.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmCancellationRight
	 * SwitchOrder7.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#mmCancellationRight
	 * RedemptionBulkOrder6.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5#mmCancellationRight
	 * SubscriptionMultipleExecution5.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationRight1Choice#mmCode
	 * CancellationRight1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationRight1Choice#mmProprietary
	 * CancellationRight1Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation right of an investor with respect to an investment fund order."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCancellationRight = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SwitchExecution7.mmCancellationRight, SubscriptionBulkOrder5.mmCancellationRight, RedemptionBulkExecution5.mmCancellationRight, RedemptionMultipleExecution5.mmCancellationRight,
					RedemptionMultipleOrder6.mmCancellationRight, SubscriptionMultipleOrder6.mmCancellationRight, SubscriptionBulkExecution4.mmCancellationRight, SwitchOrder7.mmCancellationRight, RedemptionBulkOrder6.mmCancellationRight,
					SubscriptionMultipleExecution5.mmCancellationRight, CancellationRight1Choice.mmCode, CancellationRight1Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationRight";
			definition = "Cancellation right of an investor with respect to an investment fund order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancellationRightCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getCancellationRight", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode requestedSettlementCurrency;
	/**
	 * Currency requested for settlement of cash proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#mmRequestedSettlementCurrency
	 * SubscriptionBulkOrder5.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#mmRequestedSettlementCurrency
	 * RedemptionBulkExecution5.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4#mmRequestedSettlementCurrency
	 * SubscriptionBulkExecution4.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#mmRequestedSettlementCurrency
	 * RedemptionBulkOrder6.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmRequestedSettlementCurrency
	 * RedemptionOrder14.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmRequestedSettlementCurrency
	 * SwitchSubscriptionLegOrder6.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmRequestedSettlementCurrency
	 * SubscriptionExecution13.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmRequestedSettlementCurrency
	 * SwitchRedemptionLegOrder6.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmRequestedSettlementCurrency
	 * SubscriptionOrder14.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmRequestedSettlementCurrency
	 * SwitchSubscriptionLegExecution4.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmRequestedSettlementCurrency
	 * RedemptionExecution15.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmRequestedSettlementCurrency
	 * SwitchRedemptionLegExecution4.mmRequestedSettlementCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency requested for settlement of cash proceeds."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRequestedSettlementCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SubscriptionBulkOrder5.mmRequestedSettlementCurrency, RedemptionBulkExecution5.mmRequestedSettlementCurrency, SubscriptionBulkExecution4.mmRequestedSettlementCurrency,
					RedemptionBulkOrder6.mmRequestedSettlementCurrency, RedemptionOrder14.mmRequestedSettlementCurrency, SwitchSubscriptionLegOrder6.mmRequestedSettlementCurrency, SubscriptionExecution13.mmRequestedSettlementCurrency,
					SwitchRedemptionLegOrder6.mmRequestedSettlementCurrency, SubscriptionOrder14.mmRequestedSettlementCurrency, SwitchSubscriptionLegExecution4.mmRequestedSettlementCurrency,
					RedemptionExecution15.mmRequestedSettlementCurrency, SwitchRedemptionLegExecution4.mmRequestedSettlementCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedSettlementCurrency";
			definition = "Currency requested for settlement of cash proceeds.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getRequestedSettlementCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime requestedExecutionDateTime;
	/**
	 * Date and time at which the investor requests the order to be executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmRequestedFutureTradeDate
	 * SwitchExecution7.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#mmRequestedFutureTradeDate
	 * SubscriptionBulkOrder5.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#mmRequestedFutureTradeDate
	 * RedemptionBulkExecution5.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmRequestedFutureTradeDate
	 * RedemptionMultipleExecution5.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#mmRequestedFutureTradeDate
	 * RedemptionMultipleOrder6.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#mmRequestedFutureTradeDate
	 * SubscriptionMultipleOrder6.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4#mmRequestedFutureTradeDate
	 * SubscriptionBulkExecution4.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmRequestedFutureTradeDate
	 * SwitchOrder7.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#mmRequestedFutureTradeDate
	 * RedemptionBulkOrder6.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5#mmRequestedFutureTradeDate
	 * SubscriptionMultipleExecution5.mmRequestedFutureTradeDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedExecutionDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the investor requests the order to be executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRequestedExecutionDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SwitchExecution7.mmRequestedFutureTradeDate, SubscriptionBulkOrder5.mmRequestedFutureTradeDate, RedemptionBulkExecution5.mmRequestedFutureTradeDate,
					RedemptionMultipleExecution5.mmRequestedFutureTradeDate, RedemptionMultipleOrder6.mmRequestedFutureTradeDate, SubscriptionMultipleOrder6.mmRequestedFutureTradeDate, SubscriptionBulkExecution4.mmRequestedFutureTradeDate,
					SwitchOrder7.mmRequestedFutureTradeDate, RedemptionBulkOrder6.mmRequestedFutureTradeDate, SubscriptionMultipleExecution5.mmRequestedFutureTradeDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedExecutionDateTime";
			definition = "Date and time at which the investor requests the order to be executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getRequestedExecutionDateTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FinancialAdviceCode financialAdvice;
	/**
	 * Specifies if advice has been received from an independent financial
	 * advisor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAdviceCode
	 * FinancialAdviceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmFinancialAdvice
	 * SwitchExecution7.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmFinancialAdvice
	 * SwitchOrder7.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmFinancialAdvice
	 * RedemptionOrder14.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmFinancialAdvice
	 * SubscriptionExecution13.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmFinancialAdvice
	 * SubscriptionExecution12.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmFinancialAdvice
	 * SubscriptionOrder15.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmFinancialAdvice
	 * RedemptionOrder15.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmFinancialAdvice
	 * RedemptionExecution16.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmFinancialAdvice
	 * SubscriptionOrder14.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmFinancialAdvice
	 * RedemptionExecution15.mmFinancialAdvice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if advice has been received from an independent financial advisor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFinancialAdvice = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SwitchExecution7.mmFinancialAdvice, SwitchOrder7.mmFinancialAdvice, RedemptionOrder14.mmFinancialAdvice, SubscriptionExecution13.mmFinancialAdvice,
					SubscriptionExecution12.mmFinancialAdvice, SubscriptionOrder15.mmFinancialAdvice, RedemptionOrder15.mmFinancialAdvice, RedemptionExecution16.mmFinancialAdvice, SubscriptionOrder14.mmFinancialAdvice,
					RedemptionExecution15.mmFinancialAdvice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialAdvice";
			definition = "Specifies if advice has been received from an independent financial advisor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancialAdviceCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getFinancialAdvice", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected NegotiatedTradeCode negotiatedTrade;
	/**
	 * Specifies whether the trade is negotiated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NegotiatedTradeCode
	 * NegotiatedTradeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmNegotiatedTrade
	 * SwitchExecution7.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmNegotiatedTrade
	 * SwitchOrder7.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmNegotiatedTrade
	 * RedemptionOrder14.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmNegotiatedTrade
	 * SubscriptionExecution13.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmNegotiatedTrade
	 * SubscriptionExecution12.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmNegotiatedTrade
	 * SubscriptionOrder15.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmNegotiatedTrade
	 * RedemptionOrder15.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmNegotiatedTrade
	 * RedemptionExecution16.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmNegotiatedTrade
	 * SubscriptionOrder14.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmNegotiatedTrade
	 * RedemptionExecution15.mmNegotiatedTrade}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NegotiatedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the trade is negotiated."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNegotiatedTrade = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SwitchExecution7.mmNegotiatedTrade, SwitchOrder7.mmNegotiatedTrade, RedemptionOrder14.mmNegotiatedTrade, SubscriptionExecution13.mmNegotiatedTrade,
					SubscriptionExecution12.mmNegotiatedTrade, SubscriptionOrder15.mmNegotiatedTrade, RedemptionOrder15.mmNegotiatedTrade, RedemptionExecution16.mmNegotiatedTrade, SubscriptionOrder14.mmNegotiatedTrade,
					RedemptionExecution15.mmNegotiatedTrade);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NegotiatedTrade";
			definition = "Specifies whether the trade is negotiated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NegotiatedTradeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getNegotiatedTrade", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate holdingsRate;
	/**
	 * Percentage of the financial quantity to be invested or redeemed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingsRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the financial quantity to be invested or redeemed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmHoldingsRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HoldingsRate";
			definition = "Percentage of the financial quantity to be invested or redeemed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getHoldingsRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OrderWaiverReasonCode orderWaiverReason;
	/**
	 * Reason why an order has to be handled differently, probably in a manual
	 * fashion, because for example, the investment manager has agreed a waiver
	 * to the extended terms.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderWaiverReasonCode
	 * OrderWaiverReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmOrderWaiverDetails
	 * SwitchExecution7.mmOrderWaiverDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmOrderWaiverDetails
	 * SwitchOrder7.mmOrderWaiverDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmOrderWaiverDetails
	 * RedemptionOrder14.mmOrderWaiverDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmOrderWaiverDetails
	 * SubscriptionExecution13.mmOrderWaiverDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderWaiver1#mmOrderWaiverReason
	 * OrderWaiver1.mmOrderWaiverReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmOrderWaiverDetails
	 * SubscriptionExecution12.mmOrderWaiverDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmOrderWaiverDetails
	 * SubscriptionOrder15.mmOrderWaiverDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderWaiverReason3Choice#mmCode
	 * OrderWaiverReason3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderWaiverReason3Choice#mmProprietary
	 * OrderWaiverReason3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmOrderWaiverDetails
	 * RedemptionOrder15.mmOrderWaiverDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmOrderWaiverDetails
	 * RedemptionExecution16.mmOrderWaiverDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmOrderWaiverDetails
	 * SubscriptionOrder14.mmOrderWaiverDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmOrderWaiverDetails
	 * RedemptionExecution15.mmOrderWaiverDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderWaiverReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason why an order has to be handled differently, probably in a manual fashion, because for example, the investment manager has agreed a waiver to the extended terms."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOrderWaiverReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SwitchExecution7.mmOrderWaiverDetails, SwitchOrder7.mmOrderWaiverDetails, RedemptionOrder14.mmOrderWaiverDetails, SubscriptionExecution13.mmOrderWaiverDetails,
					OrderWaiver1.mmOrderWaiverReason, SubscriptionExecution12.mmOrderWaiverDetails, SubscriptionOrder15.mmOrderWaiverDetails, OrderWaiverReason3Choice.mmCode, OrderWaiverReason3Choice.mmProprietary,
					RedemptionOrder15.mmOrderWaiverDetails, RedemptionExecution16.mmOrderWaiverDetails, SubscriptionOrder14.mmOrderWaiverDetails, RedemptionExecution15.mmOrderWaiverDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderWaiverReason";
			definition = "Reason why an order has to be handled differently, probably in a manual fashion, because for example, the investment manager has agreed a waiver to the extended terms.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderWaiverReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getOrderWaiverReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator initialOrderIndicator;
	/**
	 * Indicates whether the subscription order is an initial order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialOrderIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the subscription order is an initial order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInitialOrderIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InitialOrderIndicator";
			definition = "Indicates whether the subscription order is an initial order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getInitialOrderIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime orderBookingDate;
	/**
	 * Date and time an investment fund order is registered on the books of
	 * either the fund or its designated agent, eg, transfer agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderBookingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time an investment fund order is registered on the books of either the fund or its designated agent, eg, transfer agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOrderBookingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderBookingDate";
			definition = "Date and time an investment fund order is registered on the books of either the fund or its designated agent, eg, transfer agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getOrderBookingDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestmentPlan investmentPlan;
	/**
	 * Investment plan which triggers the standing orders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#mmStandingOrder
	 * InvestmentPlan.mmStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment plan which triggers the standing orders."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvestmentPlan = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentPlan";
			definition = "Investment plan which triggers the standing orders.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmStandingOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesOrderStatus> orderStatus;
	/**
	 * Status of an investment fund order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmInvestmentFundOrder
	 * SecuritiesOrderStatus.mmInvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of an investment fund order."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOrderStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderStatus";
			definition = "Status of an investment fund order.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmInvestmentFundOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
		}
	};
	protected CurrencyAndAmount totalAmount;
	/**
	 * Total amount subscribed in the current tax year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation1#mmTotalAmountYearToDate
	 * SubscriptionInformation1.mmTotalAmountYearToDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total amount subscribed in the current tax year."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTotalAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SubscriptionInformation1.mmTotalAmountYearToDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalAmount";
			definition = "Total amount subscribed in the current tax year.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getTotalAmount", new Class[]{});
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
				name = "InvestmentFundOrder";
				definition = "An investor's instruction to either subscribe or redeem an amount of money or its equivalent, for example other assets, into or out of an investment fund.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentPlan.mmStandingOrder, com.tools20022.repository.entity.SecuritiesQuantity.mmOrder,
						com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentFundOrder, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmOrder,
						com.tools20022.repository.entity.SecuritiesOrderStatus.mmInvestmentFundOrder);
				derivationElement_lazy = () -> Arrays.asList(BlockedStatusReason2.mmTransactionType);
				subType_lazy = () -> Arrays.asList(RedemptionOrder.mmObject(), SwitchOrder.mmObject(), SubscriptionOrder.mmObject());
				superType_lazy = () -> SecuritiesOrder.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundOrder.mmGrossAmountIndicator, com.tools20022.repository.entity.InvestmentFundOrder.mmRelatedTransaction,
						com.tools20022.repository.entity.InvestmentFundOrder.mmOrderType, com.tools20022.repository.entity.InvestmentFundOrder.mmGrossAmount, com.tools20022.repository.entity.InvestmentFundOrder.mmUnitsNumber,
						com.tools20022.repository.entity.InvestmentFundOrder.mmInvestmentFundOrderExecution, com.tools20022.repository.entity.InvestmentFundOrder.mmNetAmount,
						com.tools20022.repository.entity.InvestmentFundOrder.mmOrderDateTime, com.tools20022.repository.entity.InvestmentFundOrder.mmExpiryDateTime, com.tools20022.repository.entity.InvestmentFundOrder.mmCancellationRight,
						com.tools20022.repository.entity.InvestmentFundOrder.mmRequestedSettlementCurrency, com.tools20022.repository.entity.InvestmentFundOrder.mmRequestedExecutionDateTime,
						com.tools20022.repository.entity.InvestmentFundOrder.mmFinancialAdvice, com.tools20022.repository.entity.InvestmentFundOrder.mmNegotiatedTrade, com.tools20022.repository.entity.InvestmentFundOrder.mmHoldingsRate,
						com.tools20022.repository.entity.InvestmentFundOrder.mmOrderWaiverReason, com.tools20022.repository.entity.InvestmentFundOrder.mmInitialOrderIndicator,
						com.tools20022.repository.entity.InvestmentFundOrder.mmOrderBookingDate, com.tools20022.repository.entity.InvestmentFundOrder.mmInvestmentPlan, com.tools20022.repository.entity.InvestmentFundOrder.mmOrderStatus,
						com.tools20022.repository.entity.InvestmentFundOrder.mmTotalAmount);
				derivationComponent_lazy = () -> Arrays.asList(InvestmentFundOrder4.mmObject(), TransferReference8.mmObject(), TransferReference7.mmObject(), TransferReference9.mmObject(), TransferReference10.mmObject(),
						IndividualOrderConfirmationStatusAndReason2.mmObject(), InvestmentFundOrder11.mmObject(), InvestmentFundOrder9.mmObject(), TransactionType5Choice.mmObject(), FinancialInstrumentQuantity26Choice.mmObject(),
						FundOrderType4Choice.mmObject(), OrderWaiver1.mmObject(), InvestmentFundsOrderBreakdown2.mmObject(), OrderWaiverReason3Choice.mmObject(), FundOrderData5.mmObject(), FinancialInstrumentQuantity29Choice.mmObject(),
						InvestmentFundOrder8.mmObject(), SwitchLegReferences2.mmObject(), BlockedStatusReason2.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvestmentFundOrder.class;
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getGrossAmountIndicator() {
		return grossAmountIndicator;
	}

	public void setGrossAmountIndicator(YesNoIndicator grossAmountIndicator) {
		this.grossAmountIndicator = grossAmountIndicator;
	}

	public InvestmentFundTransaction getRelatedTransaction() {
		return relatedTransaction;
	}

	public void setRelatedTransaction(com.tools20022.repository.entity.InvestmentFundTransaction relatedTransaction) {
		this.relatedTransaction = relatedTransaction;
	}

	public FundOrderTypeCode getOrderType() {
		return orderType;
	}

	public void setOrderType(FundOrderTypeCode orderType) {
		this.orderType = orderType;
	}

	public CurrencyAndAmount getGrossAmount() {
		return grossAmount;
	}

	public void setGrossAmount(CurrencyAndAmount grossAmount) {
		this.grossAmount = grossAmount;
	}

	public SecuritiesQuantity getUnitsNumber() {
		return unitsNumber;
	}

	public void setUnitsNumber(com.tools20022.repository.entity.SecuritiesQuantity unitsNumber) {
		this.unitsNumber = unitsNumber;
	}

	public InvestmentFundOrderExecution getInvestmentFundOrderExecution() {
		return investmentFundOrderExecution;
	}

	public void setInvestmentFundOrderExecution(com.tools20022.repository.entity.InvestmentFundOrderExecution investmentFundOrderExecution) {
		this.investmentFundOrderExecution = investmentFundOrderExecution;
	}

	public CurrencyAndAmount getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(CurrencyAndAmount netAmount) {
		this.netAmount = netAmount;
	}

	public ISODateTime getOrderDateTime() {
		return orderDateTime;
	}

	public void setOrderDateTime(ISODateTime orderDateTime) {
		this.orderDateTime = orderDateTime;
	}

	public ISODateTime getExpiryDateTime() {
		return expiryDateTime;
	}

	public void setExpiryDateTime(ISODateTime expiryDateTime) {
		this.expiryDateTime = expiryDateTime;
	}

	public CancellationRightCode getCancellationRight() {
		return cancellationRight;
	}

	public void setCancellationRight(CancellationRightCode cancellationRight) {
		this.cancellationRight = cancellationRight;
	}

	public CurrencyCode getRequestedSettlementCurrency() {
		return requestedSettlementCurrency;
	}

	public void setRequestedSettlementCurrency(CurrencyCode requestedSettlementCurrency) {
		this.requestedSettlementCurrency = requestedSettlementCurrency;
	}

	public ISODateTime getRequestedExecutionDateTime() {
		return requestedExecutionDateTime;
	}

	public void setRequestedExecutionDateTime(ISODateTime requestedExecutionDateTime) {
		this.requestedExecutionDateTime = requestedExecutionDateTime;
	}

	public FinancialAdviceCode getFinancialAdvice() {
		return financialAdvice;
	}

	public void setFinancialAdvice(FinancialAdviceCode financialAdvice) {
		this.financialAdvice = financialAdvice;
	}

	public NegotiatedTradeCode getNegotiatedTrade() {
		return negotiatedTrade;
	}

	public void setNegotiatedTrade(NegotiatedTradeCode negotiatedTrade) {
		this.negotiatedTrade = negotiatedTrade;
	}

	public PercentageRate getHoldingsRate() {
		return holdingsRate;
	}

	public void setHoldingsRate(PercentageRate holdingsRate) {
		this.holdingsRate = holdingsRate;
	}

	public OrderWaiverReasonCode getOrderWaiverReason() {
		return orderWaiverReason;
	}

	public void setOrderWaiverReason(OrderWaiverReasonCode orderWaiverReason) {
		this.orderWaiverReason = orderWaiverReason;
	}

	public YesNoIndicator getInitialOrderIndicator() {
		return initialOrderIndicator;
	}

	public void setInitialOrderIndicator(YesNoIndicator initialOrderIndicator) {
		this.initialOrderIndicator = initialOrderIndicator;
	}

	public ISODateTime getOrderBookingDate() {
		return orderBookingDate;
	}

	public void setOrderBookingDate(ISODateTime orderBookingDate) {
		this.orderBookingDate = orderBookingDate;
	}

	public InvestmentPlan getInvestmentPlan() {
		return investmentPlan;
	}

	public void setInvestmentPlan(com.tools20022.repository.entity.InvestmentPlan investmentPlan) {
		this.investmentPlan = investmentPlan;
	}

	public List<SecuritiesOrderStatus> getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(List<com.tools20022.repository.entity.SecuritiesOrderStatus> orderStatus) {
		this.orderStatus = orderStatus;
	}

	public CurrencyAndAmount getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(CurrencyAndAmount totalAmount) {
		this.totalAmount = totalAmount;
	}
}