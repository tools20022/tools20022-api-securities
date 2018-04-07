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
import com.tools20022.repository.codeset.FlowDirectionTypeCode;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.BookEntry;
import com.tools20022.repository.entity.InvestmentFundOrderExecution;
import com.tools20022.repository.entity.NetAssetValueCalculation;
import com.tools20022.repository.entity.SecuritiesQuantity;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Cash movements from or to a fund as a result of investment funds
 * transactions, for example, subscriptions or redemptions.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="FundsCashFlow" src="doc-files/FundsCashFlow.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmExceptionalCashFlowIndicator
 * FundsCashFlow.mmExceptionalCashFlowIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmFlowDirection
 * FundsCashFlow.mmFlowDirection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmFundSubscriptionAccountEntry
 * FundsCashFlow.mmFundSubscriptionAccountEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmFundRedemptionAccountEntry
 * FundsCashFlow.mmFundRedemptionAccountEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmRelatedOrder
 * FundsCashFlow.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmNetIndicator
 * FundsCashFlow.mmNetIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmNetAssetValueCalculation
 * FundsCashFlow.mmNetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmCashFlowQuantity
 * FundsCashFlow.mmCashFlowQuantity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmFundsCashFlow
 * NetAssetValueCalculation.mmFundsCashFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedCashFlow
 * SecuritiesQuantity.mmRelatedCashFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmCashFlow
 * InvestmentFundOrderExecution.mmCashFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BookEntry#mmFundSubscriptionCashInFlow
 * BookEntry.mmFundSubscriptionCashInFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BookEntry#mmFundRedemptionCashOutFlow
 * BookEntry.mmFundRedemptionCashOutFlow}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmCashInForecastDetails
 * FundCashForecast7.mmCashInForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmCashOutForecastDetails
 * FundCashForecast7.mmCashOutForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmNetCashForecastDetails
 * FundCashForecast7.mmNetCashForecastDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fund2#mmCashInForecastDetails
 * Fund2.mmCashInForecastDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fund2#mmCashOutForecastDetails
 * Fund2.mmCashOutForecastDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fund2#mmNetCashForecastDetails
 * Fund2.mmNetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmEstimatedCashInForecastDetails
 * EstimatedFundCashForecast6.mmEstimatedCashInForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmEstimatedCashOutForecastDetails
 * EstimatedFundCashForecast6.mmEstimatedCashOutForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmEstimatedNetCashForecastDetails
 * EstimatedFundCashForecast6.mmEstimatedNetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Fund1#mmEstimatedCashInForecastDetails
 * Fund1.mmEstimatedCashInForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Fund1#mmEstimatedCashOutForecastDetails
 * Fund1.mmEstimatedCashOutForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Fund1#mmEstimatedNetCashForecastDetails
 * Fund1.mmEstimatedNetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundConfirmedCashForecastReport3#mmFundCashForecastDetails
 * FundConfirmedCashForecastReport3.mmFundCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundConfirmedCashForecastReport3#mmConsolidatedNetCashForecast
 * FundConfirmedCashForecastReport3.mmConsolidatedNetCashForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmNetCashForecastDetails
 * FundCashForecast6.mmNetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport3#mmFundCashForecastDetails
 * FundDetailedConfirmedCashForecastReport3.mmFundCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport3#mmConsolidatedNetCashForecast
 * FundDetailedConfirmedCashForecastReport3.mmConsolidatedNetCashForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmEstimatedNetCashForecastDetails
 * EstimatedFundCashForecast5.mmEstimatedNetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOutForecast5#mmCashOutBreakdownDetails
 * CashOutForecast5.mmCashOutBreakdownDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.NetCashForecast3
 * NetCashForecast3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundCashForecast7
 * FundCashForecast7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fund2 Fund2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
 * EstimatedFundCashForecast6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fund1 Fund1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundConfirmedCashForecastReport3
 * FundConfirmedCashForecastReport3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundCashForecast6
 * FundCashForecast6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport3
 * FundDetailedConfirmedCashForecastReport3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5
 * EstimatedFundCashForecast5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOutForecast5
 * CashOutForecast5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundBalance1 FundBalance1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3
 * FundCashOutBreakdown3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetCashForecast4
 * NetCashForecast4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashInForecast5
 * CashInForecast5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundCashInBreakdown3
 * FundCashInBreakdown3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOutForecast6
 * CashOutForecast6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashInForecast6
 * CashInForecast6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fund3 Fund3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fund4 Fund4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetCashForecast5
 * NetCashForecast5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashInOutForecast7
 * CashInOutForecast7}</li>
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
 * "FundsCashFlow"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cash movements from or to a fund as a result of investment funds transactions, for example, subscriptions or redemptions."
 * </li>
 * </ul>
 */
public class FundsCashFlow {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator exceptionalCashFlowIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmExceptionalNetCashFlowIndicator
	 * FundCashForecast7.mmExceptionalNetCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmExceptionalNetCashFlowIndicator
	 * EstimatedFundCashForecast6.mmExceptionalNetCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmExceptionalNetCashFlowIndicator
	 * FundCashForecast6.mmExceptionalNetCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmExceptionalNetCashFlowIndicator
	 * EstimatedFundCashForecast5.mmExceptionalNetCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast5#mmExceptionalCashFlowIndicator
	 * CashOutForecast5.mmExceptionalCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast5#mmExceptionalCashFlowIndicator
	 * CashInForecast5.mmExceptionalCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast6#mmExceptionalCashFlowIndicator
	 * CashOutForecast6.mmExceptionalCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast6#mmExceptionalCashFlowIndicator
	 * CashInForecast6.mmExceptionalCashFlowIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceptionalCashFlowIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the cash flow is exceptional , eg, extraordinary cash amounts in or out."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<FundsCashFlow, YesNoIndicator> mmExceptionalCashFlowIndicator = new MMBusinessAttribute<FundsCashFlow, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(FundCashForecast7.mmExceptionalNetCashFlowIndicator, EstimatedFundCashForecast6.mmExceptionalNetCashFlowIndicator, FundCashForecast6.mmExceptionalNetCashFlowIndicator,
					EstimatedFundCashForecast5.mmExceptionalNetCashFlowIndicator, CashOutForecast5.mmExceptionalCashFlowIndicator, CashInForecast5.mmExceptionalCashFlowIndicator, CashOutForecast6.mmExceptionalCashFlowIndicator,
					CashInForecast6.mmExceptionalCashFlowIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExceptionalCashFlowIndicator";
			definition = "Indicates whether the cash flow is exceptional , eg, extraordinary cash amounts in or out.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(FundsCashFlow obj) {
			return obj.getExceptionalCashFlowIndicator();
		}

		@Override
		public void setValue(FundsCashFlow obj, YesNoIndicator value) {
			obj.setExceptionalCashFlowIndicator(value);
		}
	};
	protected FlowDirectionTypeCode flowDirection;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FlowDirectionTypeCode
	 * FlowDirectionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast3#mmFlowDirection
	 * NetCashForecast3.mmFlowDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast4#mmFlowDirection
	 * NetCashForecast4.mmFlowDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast5#mmFlowDirection
	 * NetCashForecast5.mmFlowDirection}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FlowDirection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the direction of the cash flow from the perspective of the fund."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<FundsCashFlow, FlowDirectionTypeCode> mmFlowDirection = new MMBusinessAttribute<FundsCashFlow, FlowDirectionTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(NetCashForecast3.mmFlowDirection, NetCashForecast4.mmFlowDirection, NetCashForecast5.mmFlowDirection);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FlowDirection";
			definition = "Specifies the direction of the cash flow from the perspective of the fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FlowDirectionTypeCode.mmObject();
		}

		@Override
		public FlowDirectionTypeCode getValue(FundsCashFlow obj) {
			return obj.getFlowDirection();
		}

		@Override
		public void setValue(FundsCashFlow obj, FlowDirectionTypeCode value) {
			obj.setFlowDirection(value);
		}
	};
	protected BookEntry fundSubscriptionAccountEntry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry#mmFundSubscriptionCashInFlow
	 * BookEntry.mmFundSubscriptionCashInFlow}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BookEntry BookEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundSubscriptionAccountEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account entry which is linked to a fund subscription process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<FundsCashFlow, Optional<BookEntry>> mmFundSubscriptionAccountEntry = new MMBusinessAssociationEnd<FundsCashFlow, Optional<BookEntry>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundSubscriptionAccountEntry";
			definition = "Account entry which is linked to a fund subscription process.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> BookEntry.mmFundSubscriptionCashInFlow;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BookEntry.mmObject();
		}

		@Override
		public Optional<BookEntry> getValue(FundsCashFlow obj) {
			return obj.getFundSubscriptionAccountEntry();
		}

		@Override
		public void setValue(FundsCashFlow obj, Optional<BookEntry> value) {
			obj.setFundSubscriptionAccountEntry(value.orElse(null));
		}
	};
	protected BookEntry fundRedemptionAccountEntry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry#mmFundRedemptionCashOutFlow
	 * BookEntry.mmFundRedemptionCashOutFlow}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BookEntry BookEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundRedemptionAccountEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account entry which is linked to a fund redemption process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<FundsCashFlow, Optional<BookEntry>> mmFundRedemptionAccountEntry = new MMBusinessAssociationEnd<FundsCashFlow, Optional<BookEntry>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundRedemptionAccountEntry";
			definition = "Account entry which is linked to a fund redemption process.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> BookEntry.mmFundRedemptionCashOutFlow;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BookEntry.mmObject();
		}

		@Override
		public Optional<BookEntry> getValue(FundsCashFlow obj) {
			return obj.getFundRedemptionAccountEntry();
		}

		@Override
		public void setValue(FundsCashFlow obj, Optional<BookEntry> value) {
			obj.setFundRedemptionAccountEntry(value.orElse(null));
		}
	};
	protected InvestmentFundOrderExecution relatedOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmCashFlow
	 * InvestmentFundOrderExecution.mmCashFlow}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade which is the source for the calculation of the cash flow movements."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<FundsCashFlow, InvestmentFundOrderExecution> mmRelatedOrder = new MMBusinessAssociationEnd<FundsCashFlow, InvestmentFundOrderExecution>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Trade which is the source for the calculation of the cash flow movements.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> InvestmentFundOrderExecution.mmCashFlow;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestmentFundOrderExecution.mmObject();
		}

		@Override
		public InvestmentFundOrderExecution getValue(FundsCashFlow obj) {
			return obj.getRelatedOrder();
		}

		@Override
		public void setValue(FundsCashFlow obj, InvestmentFundOrderExecution value) {
			obj.setRelatedOrder(value);
		}
	};
	protected YesNoIndicator netIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the cash flow is the result of netting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<FundsCashFlow, YesNoIndicator> mmNetIndicator = new MMBusinessAttribute<FundsCashFlow, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetIndicator";
			definition = "Indicates whether the cash flow is the result of netting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(FundsCashFlow obj) {
			return obj.getNetIndicator();
		}

		@Override
		public void setValue(FundsCashFlow obj, YesNoIndicator value) {
			obj.setNetIndicator(value);
		}
	};
	protected NetAssetValueCalculation netAssetValueCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmFundsCashFlow
	 * NetAssetValueCalculation.mmFundsCashFlow}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAssetValueCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net asset value incorporating the net cash flow for a valuation date."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<FundsCashFlow, NetAssetValueCalculation> mmNetAssetValueCalculation = new MMBusinessAssociationEnd<FundsCashFlow, NetAssetValueCalculation>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetAssetValueCalculation";
			definition = "Net asset value incorporating the net cash flow for a valuation date.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> NetAssetValueCalculation.mmFundsCashFlow;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> NetAssetValueCalculation.mmObject();
		}

		@Override
		public NetAssetValueCalculation getValue(FundsCashFlow obj) {
			return obj.getNetAssetValueCalculation();
		}

		@Override
		public void setValue(FundsCashFlow obj, NetAssetValueCalculation value) {
			obj.setNetAssetValueCalculation(value);
		}
	};
	protected SecuritiesQuantity cashFlowQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedCashFlow
	 * SecuritiesQuantity.mmRelatedCashFlow}</li>
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
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashFlowQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value and quantity of the cash flow."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<FundsCashFlow, SecuritiesQuantity> mmCashFlowQuantity = new MMBusinessAssociationEnd<FundsCashFlow, SecuritiesQuantity>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashFlowQuantity";
			definition = "Value and quantity of the cash flow.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuantity.mmRelatedCashFlow;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public SecuritiesQuantity getValue(FundsCashFlow obj) {
			return obj.getCashFlowQuantity();
		}

		@Override
		public void setValue(FundsCashFlow obj, SecuritiesQuantity value) {
			obj.setCashFlowQuantity(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundsCashFlow";
				definition = "Cash movements from or to a fund as a result of investment funds transactions, for example, subscriptions or redemptions.";
				associationDomain_lazy = () -> Arrays.asList(NetAssetValueCalculation.mmFundsCashFlow, SecuritiesQuantity.mmRelatedCashFlow, InvestmentFundOrderExecution.mmCashFlow, BookEntry.mmFundSubscriptionCashInFlow,
						BookEntry.mmFundRedemptionCashOutFlow);
				derivationElement_lazy = () -> Arrays.asList(FundCashForecast7.mmCashInForecastDetails, FundCashForecast7.mmCashOutForecastDetails, FundCashForecast7.mmNetCashForecastDetails, Fund2.mmCashInForecastDetails,
						Fund2.mmCashOutForecastDetails, Fund2.mmNetCashForecastDetails, EstimatedFundCashForecast6.mmEstimatedCashInForecastDetails, EstimatedFundCashForecast6.mmEstimatedCashOutForecastDetails,
						EstimatedFundCashForecast6.mmEstimatedNetCashForecastDetails, Fund1.mmEstimatedCashInForecastDetails, Fund1.mmEstimatedCashOutForecastDetails, Fund1.mmEstimatedNetCashForecastDetails,
						FundConfirmedCashForecastReport3.mmFundCashForecastDetails, FundConfirmedCashForecastReport3.mmConsolidatedNetCashForecast, FundCashForecast6.mmNetCashForecastDetails,
						FundDetailedConfirmedCashForecastReport3.mmFundCashForecastDetails, FundDetailedConfirmedCashForecastReport3.mmConsolidatedNetCashForecast, EstimatedFundCashForecast5.mmEstimatedNetCashForecastDetails,
						CashOutForecast5.mmCashOutBreakdownDetails);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.FundsCashFlow.mmExceptionalCashFlowIndicator, com.tools20022.repository.entity.FundsCashFlow.mmFlowDirection,
						com.tools20022.repository.entity.FundsCashFlow.mmFundSubscriptionAccountEntry, com.tools20022.repository.entity.FundsCashFlow.mmFundRedemptionAccountEntry,
						com.tools20022.repository.entity.FundsCashFlow.mmRelatedOrder, com.tools20022.repository.entity.FundsCashFlow.mmNetIndicator, com.tools20022.repository.entity.FundsCashFlow.mmNetAssetValueCalculation,
						com.tools20022.repository.entity.FundsCashFlow.mmCashFlowQuantity);
				derivationComponent_lazy = () -> Arrays.asList(NetCashForecast3.mmObject(), FundCashForecast7.mmObject(), Fund2.mmObject(), EstimatedFundCashForecast6.mmObject(), Fund1.mmObject(),
						FundConfirmedCashForecastReport3.mmObject(), FundCashForecast6.mmObject(), FundDetailedConfirmedCashForecastReport3.mmObject(), EstimatedFundCashForecast5.mmObject(), CashOutForecast5.mmObject(),
						FundBalance1.mmObject(), FundCashOutBreakdown3.mmObject(), NetCashForecast4.mmObject(), CashInForecast5.mmObject(), FundCashInBreakdown3.mmObject(), CashOutForecast6.mmObject(), CashInForecast6.mmObject(),
						Fund3.mmObject(), Fund4.mmObject(), NetCashForecast5.mmObject(), CashInOutForecast7.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return FundsCashFlow.class;
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getExceptionalCashFlowIndicator() {
		return exceptionalCashFlowIndicator;
	}

	public FundsCashFlow setExceptionalCashFlowIndicator(YesNoIndicator exceptionalCashFlowIndicator) {
		this.exceptionalCashFlowIndicator = Objects.requireNonNull(exceptionalCashFlowIndicator);
		return this;
	}

	public FlowDirectionTypeCode getFlowDirection() {
		return flowDirection;
	}

	public FundsCashFlow setFlowDirection(FlowDirectionTypeCode flowDirection) {
		this.flowDirection = Objects.requireNonNull(flowDirection);
		return this;
	}

	public Optional<BookEntry> getFundSubscriptionAccountEntry() {
		return fundSubscriptionAccountEntry == null ? Optional.empty() : Optional.of(fundSubscriptionAccountEntry);
	}

	public FundsCashFlow setFundSubscriptionAccountEntry(BookEntry fundSubscriptionAccountEntry) {
		this.fundSubscriptionAccountEntry = fundSubscriptionAccountEntry;
		return this;
	}

	public Optional<BookEntry> getFundRedemptionAccountEntry() {
		return fundRedemptionAccountEntry == null ? Optional.empty() : Optional.of(fundRedemptionAccountEntry);
	}

	public FundsCashFlow setFundRedemptionAccountEntry(BookEntry fundRedemptionAccountEntry) {
		this.fundRedemptionAccountEntry = fundRedemptionAccountEntry;
		return this;
	}

	public InvestmentFundOrderExecution getRelatedOrder() {
		return relatedOrder;
	}

	public FundsCashFlow setRelatedOrder(InvestmentFundOrderExecution relatedOrder) {
		this.relatedOrder = Objects.requireNonNull(relatedOrder);
		return this;
	}

	public YesNoIndicator getNetIndicator() {
		return netIndicator;
	}

	public FundsCashFlow setNetIndicator(YesNoIndicator netIndicator) {
		this.netIndicator = Objects.requireNonNull(netIndicator);
		return this;
	}

	public NetAssetValueCalculation getNetAssetValueCalculation() {
		return netAssetValueCalculation;
	}

	public FundsCashFlow setNetAssetValueCalculation(NetAssetValueCalculation netAssetValueCalculation) {
		this.netAssetValueCalculation = Objects.requireNonNull(netAssetValueCalculation);
		return this;
	}

	public SecuritiesQuantity getCashFlowQuantity() {
		return cashFlowQuantity;
	}

	public FundsCashFlow setCashFlowQuantity(SecuritiesQuantity cashFlowQuantity) {
		this.cashFlowQuantity = Objects.requireNonNull(cashFlowQuantity);
		return this;
	}
}