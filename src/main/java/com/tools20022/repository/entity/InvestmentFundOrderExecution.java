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
import com.tools20022.repository.choice.ProfitAndLoss2Choice;
import com.tools20022.repository.codeset.BestExecutionCode;
import com.tools20022.repository.codeset.LateReportCode;
import com.tools20022.repository.codeset.SourceOfCashCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.SecuritiesTradeExecution;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Creation/cancellation of investment units on the books of the fund or its
 * designated agent, as a result of executing an investment fund order.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentFundOrderExecution"
 * src="doc-files/InvestmentFundOrderExecution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
 * SecuritiesTradeExecution}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmUnitsNumber
 * InvestmentFundOrderExecution.mmUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmNonStandardSettlementInformation
 * InvestmentFundOrderExecution.mmNonStandardSettlementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmOrder
 * InvestmentFundOrderExecution.mmOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmDealIdentification
 * InvestmentFundOrderExecution.mmDealIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmExecutedTradePrice
 * InvestmentFundOrderExecution.mmExecutedTradePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmPartiallyExecutedIndicator
 * InvestmentFundOrderExecution.mmPartiallyExecutedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmInterimProfitAmount
 * InvestmentFundOrderExecution.mmInterimProfitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmInformativePrice
 * InvestmentFundOrderExecution.mmInformativePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmBestExecution
 * InvestmentFundOrderExecution.mmBestExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmPartialSettlementOfUnits
 * InvestmentFundOrderExecution.mmPartialSettlementOfUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmPartialSettlementOfCash
 * InvestmentFundOrderExecution.mmPartialSettlementOfCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmLateReport
 * InvestmentFundOrderExecution.mmLateReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmSettledIndicator
 * InvestmentFundOrderExecution.mmSettledIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmRegisteredIndicator
 * InvestmentFundOrderExecution.mmRegisteredIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmExecutedAmount
 * InvestmentFundOrderExecution.mmExecutedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmInvestmentFundTransaction
 * InvestmentFundOrderExecution.mmInvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmCashFlow
 * InvestmentFundOrderExecution.mmCashFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmSourceOfCash
 * InvestmentFundOrderExecution.mmSourceOfCash}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmFundOrderRelatedToExecutedPrice
 * SecuritiesPricing.mmFundOrderRelatedToExecutedPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmFundOrderRelatedToInformativePrice
 * SecuritiesPricing.mmFundOrderRelatedToInformativePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmInvestmentFundOrderExecution
 * InvestmentFundOrder.mmInvestmentFundOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedOrderExecution
 * SecuritiesQuantity.mmRelatedOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundOrderExecution
 * InvestmentFundTransaction.mmInvestmentFundOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmRelatedOrder
 * FundsCashFlow.mmRelatedOrder}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund3#mmTransactionDetails
 * InvestmentFundTransactionsByFund3.mmTransactionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SubscriptionExecution
 * SubscriptionExecution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RedemptionExecution
 * RedemptionExecution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SwitchExecution
 * SwitchExecution}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails2
 * ExpectedExecutionDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails4
 * ExpectedExecutionDetails4}</li>
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
 * "InvestmentFundOrderExecution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Creation/cancellation of investment units on the books of the fund or its designated agent, as a result of executing an investment fund order."
 * </li>
 * </ul>
 */
public class InvestmentFundOrderExecution extends SecuritiesTradeExecution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesQuantity unitsNumber;
	/**
	 * Number of investment fund units subscribed or redeemed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedOrderExecution
	 * SecuritiesQuantity.mmRelatedOrderExecution}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Fund2#mmTotalUnitsNumber
	 * Fund2.mmTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund2#mmPreviousTotalUnitsNumber
	 * Fund2.mmPreviousTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmEstimatedTotalUnitsNumber
	 * EstimatedFundCashForecast6.mmEstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmPreviousTotalUnitsNumber
	 * EstimatedFundCashForecast6.mmPreviousTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund1#mmEstimatedTotalUnitsNumber
	 * Fund1.mmEstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund1#mmPreviousTotalUnitsNumber
	 * Fund1.mmPreviousTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmEstimatedTotalUnitsNumber
	 * EstimatedFundCashForecast5.mmEstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmPreviousTotalUnitsNumber
	 * EstimatedFundCashForecast5.mmPreviousTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundBalance1#mmTotalUnitsFromUnitOrders
	 * FundBalance1.mmTotalUnitsFromUnitOrders}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundBalance1#mmTotalUnitsFromCashOrders
	 * FundBalance1.mmTotalUnitsFromCashOrders}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmUnitsQuantity
	 * InvestmentFundTransaction4.mmUnitsQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund3#mmEstimatedTotalUnitsNumber
	 * Fund3.mmEstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund3#mmPreviousTotalUnitsNumber
	 * Fund3.mmPreviousTotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund4#mmTotalUnitsNumber
	 * Fund4.mmTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund4#mmPreviousTotalUnitsNumber
	 * Fund4.mmPreviousTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmUnitsNumber
	 * SubscriptionExecution13.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmUnitsNumber
	 * SubscriptionExecution12.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmUnitsNumber
	 * RedemptionExecution16.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmUnitsNumber
	 * SwitchSubscriptionLegExecution4.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmUnitsNumber
	 * RedemptionExecution15.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmUnitsNumber
	 * SwitchRedemptionLegExecution4.mmUnitsNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of investment fund units subscribed or redeemed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmUnitsNumber = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Fund2.mmTotalUnitsNumber, Fund2.mmPreviousTotalUnitsNumber, EstimatedFundCashForecast6.mmEstimatedTotalUnitsNumber, EstimatedFundCashForecast6.mmPreviousTotalUnitsNumber,
					Fund1.mmEstimatedTotalUnitsNumber, Fund1.mmPreviousTotalUnitsNumber, EstimatedFundCashForecast5.mmEstimatedTotalUnitsNumber, EstimatedFundCashForecast5.mmPreviousTotalUnitsNumber,
					FundBalance1.mmTotalUnitsFromUnitOrders, FundBalance1.mmTotalUnitsFromCashOrders, InvestmentFundTransaction4.mmUnitsQuantity, Fund3.mmEstimatedTotalUnitsNumber, Fund3.mmPreviousTotalUnitsNumber,
					Fund4.mmTotalUnitsNumber, Fund4.mmPreviousTotalUnitsNumber, SubscriptionExecution13.mmUnitsNumber, SubscriptionExecution12.mmUnitsNumber, RedemptionExecution16.mmUnitsNumber,
					SwitchSubscriptionLegExecution4.mmUnitsNumber, RedemptionExecution15.mmUnitsNumber, SwitchRedemptionLegExecution4.mmUnitsNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnitsNumber";
			definition = "Number of investment fund units subscribed or redeemed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedOrderExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected Max350Text nonStandardSettlementInformation;
	/**
	 * Additional specific settlement information for non-regulated traded
	 * funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#mmNonStandardSettlementInformation
	 * Transfer31.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmNonStandardSettlementInformation
	 * Transfer30.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer32#mmNonStandardSettlementInformation
	 * Transfer32.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#mmNonStandardSettlementInformation
	 * Transfer33.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmNonStandardSettlementInformation
	 * RedemptionOrder14.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmNonStandardSettlementInformation
	 * SwitchSubscriptionLegOrder6.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmNonStandardSettlementInformation
	 * SubscriptionExecution13.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmNonStandardSettlementInformation
	 * SubscriptionExecution12.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmNonStandardSettlementInformation
	 * SubscriptionOrder15.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmNonStandardSettlementInformation
	 * SwitchRedemptionLegOrder6.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmNonStandardSettlementInformation
	 * RedemptionOrder15.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmNonStandardSettlementInformation
	 * RedemptionExecution16.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmNonStandardSettlementInformation
	 * SubscriptionOrder14.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmNonStandardSettlementInformation
	 * SwitchSubscriptionLegExecution4.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmNonStandardSettlementInformation
	 * RedemptionExecution15.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmNonStandardSettlementInformation
	 * SwitchRedemptionLegExecution4.mmNonStandardSettlementInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonStandardSettlementInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional specific settlement information for non-regulated traded funds."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNonStandardSettlementInformation = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Transfer31.mmNonStandardSettlementInformation, Transfer30.mmNonStandardSettlementInformation, Transfer32.mmNonStandardSettlementInformation, Transfer33.mmNonStandardSettlementInformation,
					RedemptionOrder14.mmNonStandardSettlementInformation, SwitchSubscriptionLegOrder6.mmNonStandardSettlementInformation, SubscriptionExecution13.mmNonStandardSettlementInformation,
					SubscriptionExecution12.mmNonStandardSettlementInformation, SubscriptionOrder15.mmNonStandardSettlementInformation, SwitchRedemptionLegOrder6.mmNonStandardSettlementInformation,
					RedemptionOrder15.mmNonStandardSettlementInformation, RedemptionExecution16.mmNonStandardSettlementInformation, SubscriptionOrder14.mmNonStandardSettlementInformation,
					SwitchSubscriptionLegExecution4.mmNonStandardSettlementInformation, RedemptionExecution15.mmNonStandardSettlementInformation, SwitchRedemptionLegExecution4.mmNonStandardSettlementInformation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonStandardSettlementInformation";
			definition = "Additional specific settlement information for non-regulated traded funds.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrderExecution.class.getMethod("getNonStandardSettlementInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestmentFundOrder order;
	/**
	 * Order which is executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmInvestmentFundOrderExecution
	 * InvestmentFundOrder.mmInvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmTotalUnitsNumber
	 * FundCashForecast7.mmTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmTotalUnitsNumber
	 * FundCashForecast6.mmTotalUnitsNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Order"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order which is executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOrder = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FundCashForecast7.mmTotalUnitsNumber, FundCashForecast6.mmTotalUnitsNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Order";
			definition = "Order which is executed.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmInvestmentFundOrderExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
		}
	};
	protected Max35Text dealIdentification;
	/**
	 * Unique and unambiguous identifier for an order execution, as assigned by
	 * a confirming party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmDealReference
	 * InvestmentFundTransaction4.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder11#mmDealReference
	 * InvestmentFundOrder11.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmDealReference
	 * SwitchExecution7.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmDealReference
	 * SwitchOrderStatusAndReason2.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmDealReference
	 * SubscriptionExecution13.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmDealReference
	 * SubscriptionExecution12.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmDealReference
	 * RedemptionExecution16.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder8#mmDealReference
	 * InvestmentFundOrder8.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmDealReference
	 * RedemptionExecution15.mmDealReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for an order execution, as assigned by a confirming party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDealIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentFundTransaction4.mmDealReference, InvestmentFundOrder11.mmDealReference, SwitchExecution7.mmDealReference, SwitchOrderStatusAndReason2.mmDealReference,
					SubscriptionExecution13.mmDealReference, SubscriptionExecution12.mmDealReference, RedemptionExecution16.mmDealReference, InvestmentFundOrder8.mmDealReference, RedemptionExecution15.mmDealReference);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DealIdentification";
			definition = "Unique and unambiguous identifier for an order execution, as assigned by a confirming party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrderExecution.class.getMethod("getDealIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesPricing executedTradePrice;
	/**
	 * Price at which the order was executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmFundOrderRelatedToExecutedPrice
	 * SecuritiesPricing.mmFundOrderRelatedToExecutedPrice}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.FundCashForecast7#mmPrice
	 * FundCashForecast7.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmPrice
	 * EstimatedFundCashForecast6.mmPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FundCashForecast6#mmPrice
	 * FundCashForecast6.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmPrice
	 * EstimatedFundCashForecast5.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmPriceDetails
	 * InvestmentFundTransaction4.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmDealingPriceDetails
	 * SubscriptionExecution13.mmDealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmDealingPriceDetails
	 * SubscriptionExecution12.mmDealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmDealingPriceDetails
	 * RedemptionExecution16.mmDealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmPriceDetails
	 * SwitchSubscriptionLegExecution4.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmDealingPriceDetails
	 * RedemptionExecution15.mmDealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmPriceDetails
	 * SwitchRedemptionLegExecution4.mmPriceDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutedTradePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price at which the order was executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmExecutedTradePrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FundCashForecast7.mmPrice, EstimatedFundCashForecast6.mmPrice, FundCashForecast6.mmPrice, EstimatedFundCashForecast5.mmPrice, InvestmentFundTransaction4.mmPriceDetails,
					SubscriptionExecution13.mmDealingPriceDetails, SubscriptionExecution12.mmDealingPriceDetails, RedemptionExecution16.mmDealingPriceDetails, SwitchSubscriptionLegExecution4.mmPriceDetails,
					RedemptionExecution15.mmDealingPriceDetails, SwitchRedemptionLegExecution4.mmPriceDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExecutedTradePrice";
			definition = "Price at which the order was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmFundOrderRelatedToExecutedPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected YesNoIndicator partiallyExecutedIndicator;
	/**
	 * Indicates whether the order has been partially executed, ie, the
	 * confirmed quantity does not match the ordered quantity for a given
	 * financial instrument.
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmPartiallyExecutedIndicator
	 * InvestmentFundTransaction4.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmPartiallyExecutedIndicator
	 * SubscriptionExecution13.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmPartiallyExecutedIndicator
	 * SubscriptionExecution12.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmPartiallyExecutedIndicator
	 * RedemptionExecution16.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmPartiallyExecutedIndicator
	 * RedemptionExecution15.mmPartiallyExecutedIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyExecutedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the order has been partially executed, ie, the confirmed quantity does not match the ordered quantity for a given financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPartiallyExecutedIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentFundTransaction4.mmPartiallyExecutedIndicator, SubscriptionExecution13.mmPartiallyExecutedIndicator, SubscriptionExecution12.mmPartiallyExecutedIndicator,
					RedemptionExecution16.mmPartiallyExecutedIndicator, RedemptionExecution15.mmPartiallyExecutedIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartiallyExecutedIndicator";
			definition = "Indicates whether the order has been partially executed, ie, the confirmed quantity does not match the ordered quantity for a given financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrderExecution.class.getMethod("getPartiallyExecutedIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount interimProfitAmount;
	/**
	 * Part of the price deemed as accrued income or profit rather than capital.
	 * The interim profit amount is used for tax purposes.
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmInterimProfitAmount
	 * SubscriptionExecution13.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProfitAndLoss2Choice#mmProfit
	 * ProfitAndLoss2Choice.mmProfit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProfitAndLoss2Choice#mmLoss
	 * ProfitAndLoss2Choice.mmLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmInterimProfitAmount
	 * SubscriptionExecution12.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmInterimProfitAmount
	 * RedemptionExecution16.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmInterimProfitAmount
	 * SwitchSubscriptionLegExecution4.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmInterimProfitAmount
	 * RedemptionExecution15.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmInterimProfitAmount
	 * SwitchRedemptionLegExecution4.mmInterimProfitAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterimProfitAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Part of the price deemed as accrued income or profit rather than capital. The interim profit amount is used for tax purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInterimProfitAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SubscriptionExecution13.mmInterimProfitAmount, ProfitAndLoss2Choice.mmProfit, ProfitAndLoss2Choice.mmLoss, SubscriptionExecution12.mmInterimProfitAmount,
					RedemptionExecution16.mmInterimProfitAmount, SwitchSubscriptionLegExecution4.mmInterimProfitAmount, RedemptionExecution15.mmInterimProfitAmount, SwitchRedemptionLegExecution4.mmInterimProfitAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterimProfitAmount";
			definition = "Part of the price deemed as accrued income or profit rather than capital. The interim profit amount is used for tax purposes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrderExecution.class.getMethod("getInterimProfitAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesPricing informativePrice;
	/**
	 * Other quoted price than the one at which the order was executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmFundOrderRelatedToInformativePrice
	 * SecuritiesPricing.mmFundOrderRelatedToInformativePrice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmInformativePriceDetails
	 * SubscriptionExecution13.mmInformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmInformativePriceDetails
	 * SubscriptionExecution12.mmInformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmInformativePriceDetails
	 * RedemptionExecution16.mmInformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmInformativePriceDetails
	 * SwitchSubscriptionLegExecution4.mmInformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmInformativePriceDetails
	 * RedemptionExecution15.mmInformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmInformativePriceDetails
	 * SwitchRedemptionLegExecution4.mmInformativePriceDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformativePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Other quoted price than the one at which the order was executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInformativePrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SubscriptionExecution13.mmInformativePriceDetails, SubscriptionExecution12.mmInformativePriceDetails, RedemptionExecution16.mmInformativePriceDetails,
					SwitchSubscriptionLegExecution4.mmInformativePriceDetails, RedemptionExecution15.mmInformativePriceDetails, SwitchRedemptionLegExecution4.mmInformativePriceDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InformativePrice";
			definition = "Other quoted price than the one at which the order was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmFundOrderRelatedToInformativePrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected BestExecutionCode bestExecution;
	/**
	 * Specifies that the execution was subject to best execution rules as
	 * defined by MiFID.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BestExecutionCode
	 * BestExecutionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmBestExecution
	 * SwitchExecution7.mmBestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmBestExecution
	 * SubscriptionExecution13.mmBestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmBestExecution
	 * SubscriptionExecution12.mmBestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmBestExecution
	 * RedemptionExecution16.mmBestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmBestExecution
	 * RedemptionExecution15.mmBestExecution}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BestExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the execution was subject to best execution rules as defined by MiFID."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBestExecution = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SwitchExecution7.mmBestExecution, SubscriptionExecution13.mmBestExecution, SubscriptionExecution12.mmBestExecution, RedemptionExecution16.mmBestExecution,
					RedemptionExecution15.mmBestExecution);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BestExecution";
			definition = "Specifies that the execution was subject to best execution rules as defined by MiFID.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BestExecutionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrderExecution.class.getMethod("getBestExecution", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate partialSettlementOfUnits;
	/**
	 * Percentage of units partially settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmPartialSettlementOfUnits
	 * SubscriptionExecution13.mmPartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmPartialSettlementOfUnits
	 * SubscriptionExecution12.mmPartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmPartialSettlementOfUnits
	 * RedemptionExecution16.mmPartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmPartialSettlementOfUnits
	 * RedemptionExecution15.mmPartialSettlementOfUnits}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementOfUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of units partially settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPartialSettlementOfUnits = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SubscriptionExecution13.mmPartialSettlementOfUnits, SubscriptionExecution12.mmPartialSettlementOfUnits, RedemptionExecution16.mmPartialSettlementOfUnits,
					RedemptionExecution15.mmPartialSettlementOfUnits);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartialSettlementOfUnits";
			definition = "Percentage of units partially settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrderExecution.class.getMethod("getPartialSettlementOfUnits", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate partialSettlementOfCash;
	/**
	 * Percentage of cash partially settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmPartialSettlementOfCash
	 * SubscriptionExecution13.mmPartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmPartialSettlementOfCash
	 * SubscriptionExecution12.mmPartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmPartialSettlementOfCash
	 * RedemptionExecution16.mmPartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmPartialSettlementOfCash
	 * RedemptionExecution15.mmPartialSettlementOfCash}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementOfCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of cash partially settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPartialSettlementOfCash = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SubscriptionExecution13.mmPartialSettlementOfCash, SubscriptionExecution12.mmPartialSettlementOfCash, RedemptionExecution16.mmPartialSettlementOfCash,
					RedemptionExecution15.mmPartialSettlementOfCash);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartialSettlementOfCash";
			definition = "Percentage of cash partially settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrderExecution.class.getMethod("getPartialSettlementOfCash", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected LateReportCode lateReport;
	/**
	 * Specifies whether the order execution confirmation is late.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LateReportCode
	 * LateReportCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmLateReport
	 * SwitchExecution7.mmLateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmLateReport
	 * SubscriptionExecution13.mmLateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmLateReport
	 * SubscriptionExecution12.mmLateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmLateReport
	 * RedemptionExecution16.mmLateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmLateReport
	 * RedemptionExecution15.mmLateReport}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the order execution confirmation is late."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLateReport = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SwitchExecution7.mmLateReport, SubscriptionExecution13.mmLateReport, SubscriptionExecution12.mmLateReport, RedemptionExecution16.mmLateReport, RedemptionExecution15.mmLateReport);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LateReport";
			definition = "Specifies whether the order execution confirmation is late.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LateReportCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrderExecution.class.getMethod("getLateReport", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator settledIndicator;
	/**
	 * Indicates whether the cash payment with respect to the executed order is
	 * settled.
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmSettledTransactionIndicator
	 * InvestmentFundTransaction4.mmSettledTransactionIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettledIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the cash payment with respect to the executed order is settled."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSettledIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentFundTransaction4.mmSettledTransactionIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettledIndicator";
			definition = "Indicates whether the cash payment with respect to the executed order is settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrderExecution.class.getMethod("getSettledIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator registeredIndicator;
	/**
	 * Indicates whether the executed order has a registered status on the books
	 * of the transfer agent.
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmRegisteredTransactionIndicator
	 * InvestmentFundTransaction4.mmRegisteredTransactionIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the executed order has a registered status on the books of the transfer agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRegisteredIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentFundTransaction4.mmRegisteredTransactionIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegisteredIndicator";
			definition = "Indicates whether the executed order has a registered status on the books of the transfer agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrderExecution.class.getMethod("getRegisteredIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount executedAmount;
	/**
	 * Amount of money invested or redeemed as a result of an investment fund
	 * order.
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
	 * {@linkplain com.tools20022.repository.msg.FundBalance1#mmTotalCashFromUnitOrders
	 * FundBalance1.mmTotalCashFromUnitOrders}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundBalance1#mmTotalCashFromCashOrders
	 * FundBalance1.mmTotalCashFromCashOrders}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money invested or redeemed as a result of an investment fund order."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExecutedAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FundBalance1.mmTotalCashFromUnitOrders, FundBalance1.mmTotalCashFromCashOrders);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExecutedAmount";
			definition = "Amount of money invested or redeemed as a result of an investment fund order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrderExecution.class.getMethod("getExecutedAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestmentFundTransaction investmentFundTransaction;
	/**
	 * Transaction which is executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundOrderExecution
	 * InvestmentFundTransaction.mmInvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmFinancialInstrumentDetails
	 * SwitchRedemptionLegExecution4.mmFinancialInstrumentDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction which is executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvestmentFundTransaction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SwitchRedemptionLegExecution4.mmFinancialInstrumentDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundTransaction";
			definition = "Transaction which is executed.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentFundOrderExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.FundsCashFlow> cashFlow;
	/**
	 * Specifies the cash flow resulting from the execution of an order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmRelatedOrder
	 * FundsCashFlow.mmRelatedOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.FundsCashFlow
	 * FundsCashFlow}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashFlow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the cash flow resulting from the execution of an order."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashFlow = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashFlow";
			definition = "Specifies the cash flow resulting from the execution of an order.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmRelatedOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmObject();
		}
	};
	protected SourceOfCashCode sourceOfCash;
	/**
	 * Source of cash used for the settlement of the execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCashCode
	 * SourceOfCashCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmSourceOfCash
	 * SubscriptionExecution13.mmSourceOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmSourceOfCash
	 * SubscriptionExecution12.mmSourceOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmSourceOfCash
	 * SubscriptionOrder15.mmSourceOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmSourceOfCash
	 * SubscriptionOrder14.mmSourceOfCash}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SourceOfCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Source of cash used for the settlement of the execution."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSourceOfCash = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SubscriptionExecution13.mmSourceOfCash, SubscriptionExecution12.mmSourceOfCash, SubscriptionOrder15.mmSourceOfCash, SubscriptionOrder14.mmSourceOfCash);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SourceOfCash";
			definition = "Source of cash used for the settlement of the execution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SourceOfCashCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrderExecution.class.getMethod("getSourceOfCash", new Class[]{});
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
				name = "InvestmentFundOrderExecution";
				definition = "Creation/cancellation of investment units on the books of the fund or its designated agent, as a result of executing an investment fund order.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.mmFundOrderRelatedToExecutedPrice, com.tools20022.repository.entity.SecuritiesPricing.mmFundOrderRelatedToInformativePrice,
						com.tools20022.repository.entity.InvestmentFundOrder.mmInvestmentFundOrderExecution, com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedOrderExecution,
						com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentFundOrderExecution, com.tools20022.repository.entity.FundsCashFlow.mmRelatedOrder);
				derivationElement_lazy = () -> Arrays.asList(InvestmentFundTransactionsByFund3.mmTransactionDetails);
				subType_lazy = () -> Arrays.asList(SubscriptionExecution.mmObject(), RedemptionExecution.mmObject(), SwitchExecution.mmObject());
				superType_lazy = () -> SecuritiesTradeExecution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundOrderExecution.mmUnitsNumber, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmNonStandardSettlementInformation,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.mmOrder, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmDealIdentification,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.mmExecutedTradePrice, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmPartiallyExecutedIndicator,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.mmInterimProfitAmount, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmInformativePrice,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.mmBestExecution, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmPartialSettlementOfUnits,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.mmPartialSettlementOfCash, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmLateReport,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.mmSettledIndicator, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmRegisteredIndicator,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.mmExecutedAmount, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmInvestmentFundTransaction,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.mmCashFlow, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmSourceOfCash);
				derivationComponent_lazy = () -> Arrays.asList(ExpectedExecutionDetails2.mmObject(), ExpectedExecutionDetails4.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvestmentFundOrderExecution.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesQuantity getUnitsNumber() {
		return unitsNumber;
	}

	public void setUnitsNumber(com.tools20022.repository.entity.SecuritiesQuantity unitsNumber) {
		this.unitsNumber = unitsNumber;
	}

	public Max350Text getNonStandardSettlementInformation() {
		return nonStandardSettlementInformation;
	}

	public void setNonStandardSettlementInformation(Max350Text nonStandardSettlementInformation) {
		this.nonStandardSettlementInformation = nonStandardSettlementInformation;
	}

	public InvestmentFundOrder getOrder() {
		return order;
	}

	public void setOrder(com.tools20022.repository.entity.InvestmentFundOrder order) {
		this.order = order;
	}

	public Max35Text getDealIdentification() {
		return dealIdentification;
	}

	public void setDealIdentification(Max35Text dealIdentification) {
		this.dealIdentification = dealIdentification;
	}

	public SecuritiesPricing getExecutedTradePrice() {
		return executedTradePrice;
	}

	public void setExecutedTradePrice(com.tools20022.repository.entity.SecuritiesPricing executedTradePrice) {
		this.executedTradePrice = executedTradePrice;
	}

	public YesNoIndicator getPartiallyExecutedIndicator() {
		return partiallyExecutedIndicator;
	}

	public void setPartiallyExecutedIndicator(YesNoIndicator partiallyExecutedIndicator) {
		this.partiallyExecutedIndicator = partiallyExecutedIndicator;
	}

	public CurrencyAndAmount getInterimProfitAmount() {
		return interimProfitAmount;
	}

	public void setInterimProfitAmount(CurrencyAndAmount interimProfitAmount) {
		this.interimProfitAmount = interimProfitAmount;
	}

	public SecuritiesPricing getInformativePrice() {
		return informativePrice;
	}

	public void setInformativePrice(com.tools20022.repository.entity.SecuritiesPricing informativePrice) {
		this.informativePrice = informativePrice;
	}

	public BestExecutionCode getBestExecution() {
		return bestExecution;
	}

	public void setBestExecution(BestExecutionCode bestExecution) {
		this.bestExecution = bestExecution;
	}

	public PercentageRate getPartialSettlementOfUnits() {
		return partialSettlementOfUnits;
	}

	public void setPartialSettlementOfUnits(PercentageRate partialSettlementOfUnits) {
		this.partialSettlementOfUnits = partialSettlementOfUnits;
	}

	public PercentageRate getPartialSettlementOfCash() {
		return partialSettlementOfCash;
	}

	public void setPartialSettlementOfCash(PercentageRate partialSettlementOfCash) {
		this.partialSettlementOfCash = partialSettlementOfCash;
	}

	public LateReportCode getLateReport() {
		return lateReport;
	}

	public void setLateReport(LateReportCode lateReport) {
		this.lateReport = lateReport;
	}

	public YesNoIndicator getSettledIndicator() {
		return settledIndicator;
	}

	public void setSettledIndicator(YesNoIndicator settledIndicator) {
		this.settledIndicator = settledIndicator;
	}

	public YesNoIndicator getRegisteredIndicator() {
		return registeredIndicator;
	}

	public void setRegisteredIndicator(YesNoIndicator registeredIndicator) {
		this.registeredIndicator = registeredIndicator;
	}

	public CurrencyAndAmount getExecutedAmount() {
		return executedAmount;
	}

	public void setExecutedAmount(CurrencyAndAmount executedAmount) {
		this.executedAmount = executedAmount;
	}

	public InvestmentFundTransaction getInvestmentFundTransaction() {
		return investmentFundTransaction;
	}

	public void setInvestmentFundTransaction(com.tools20022.repository.entity.InvestmentFundTransaction investmentFundTransaction) {
		this.investmentFundTransaction = investmentFundTransaction;
	}

	public List<FundsCashFlow> getCashFlow() {
		return cashFlow;
	}

	public void setCashFlow(List<com.tools20022.repository.entity.FundsCashFlow> cashFlow) {
		this.cashFlow = cashFlow;
	}

	public SourceOfCashCode getSourceOfCash() {
		return sourceOfCash;
	}

	public void setSourceOfCash(SourceOfCashCode sourceOfCash) {
		this.sourceOfCash = sourceOfCash;
	}
}