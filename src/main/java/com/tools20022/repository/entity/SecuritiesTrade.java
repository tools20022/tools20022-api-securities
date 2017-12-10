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
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Specifies trades linked to securities operations such as the exchange of
 * securities, the lending of securities and the transactions related to
 * investment funds.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesTrade" src="doc-files/SecuritiesTrade.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeRelatedIdentifications
 * SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeAmount
 * SecuritiesTrade.mmTradeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmOpeningClosingIndicator
 * SecuritiesTrade.mmOpeningClosingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeTransactionCondition
 * SecuritiesTrade.mmTradeTransactionCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeStatus
 * SecuritiesTrade.mmSecuritiesTradeStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmActivity
 * SecuritiesTrade.mmActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeQuantity
 * SecuritiesTrade.mmTradeQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeOriginationDate
 * SecuritiesTrade.mmTradeOriginationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmClearingFeeType
 * SecuritiesTrade.mmClearingFeeType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecurity
 * SecuritiesTrade.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradePrice
 * SecuritiesTrade.mmTradePrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmPartyRole
 * SecuritiesTrade.mmPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesFinancingClosingData
 * SecuritiesTrade.mmSecuritiesFinancingClosingData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradingExecution
 * SecuritiesTrade.mmTradingExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeAllocation
 * SecuritiesTrade.mmTradeAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmRelatedOrder
 * SecuritiesTrade.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesFinancingOpeningData
 * SecuritiesTrade.mmSecuritiesFinancingOpeningData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTransactionType
 * SecuritiesTrade.mmTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmLegalFramework
 * SecuritiesTrade.mmLegalFramework}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTransactionType
 * SecuritiesTrade.mmSecuritiesTransactionType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmSecuritiesTrade
 * Security.mmSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSecuritiesTrade
 * SecuritiesPricing.mmSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmIdentifiedTrade
 * SecuritiesTradeIdentification.mmIdentifiedTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmTrade
 * SecuritiesQuantity.mmTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmRelatedTrade
 * SecuritiesTradeExecution.mmRelatedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmSecuritiesTrade
 * SecuritiesTradeStatus.mmSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmClosingLegExecution
 * SecuritiesFinancing.mmClosingLegExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmOpeningLegExecution
 * SecuritiesFinancing.mmOpeningLegExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderExecution
 * SecuritiesOrder.mmOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradePartyRole#mmSecuritiesTrade
 * SecuritiesTradePartyRole.mmSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#mmSecuritiesTrade
 * Allocation.mmSecuritiesTrade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradeRegistrationOrigin
 * TradeLeg8.mmTradeRegistrationOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLegStatement3#mmTradeLegsDetails
 * TradeLegStatement3.mmTradeLegsDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetPosition3#mmTradeLegDetails
 * NetPosition3.mmTradeLegDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg10#mmTradeRegistrationOrigin
 * TradeLeg10.mmTradeRegistrationOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmTradeRegistrationOrigin
 * TradeLeg9.mmTradeRegistrationOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails76#mmTransactionDetails
 * TransactionDetails76.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmOtherAmounts
 * SecuritiesTradeDetails48.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction53#mmTransactionDetails
 * Transaction53.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmOtherAmounts
 * SecuritiesTradeDetails68.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction54#mmTransactionDetails
 * Transaction54.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction52#mmTransactionDetails
 * Transaction52.mmTransactionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
 * InvestmentFundTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesFinancing
 * SecuritiesFinancing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTransaction
 * SecuritiesTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOptionTrade
 * SecuritiesOptionTrade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.TradeType3Choice
 * TradeType3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition4Choice
 * TradeTransactionCondition4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TwoLegTransactionType1Choice
 * TwoLegTransactionType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8 TradeLeg8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLegStatement3
 * TradeLegStatement3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg10 TradeLeg10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9 TradeLeg9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails81
 * TransactionDetails81}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails74
 * TransactionDetails74}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails82
 * TransactionDetails82}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails76
 * TransactionDetails76}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48
 * SecuritiesTradeDetails48}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails80
 * TransactionDetails80}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts28 OtherAmounts28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51
 * SecuritiesTradeDetails51}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts30 OtherAmounts30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53
 * SecuritiesTradeDetails53}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters24
 * AdditionalParameters24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts31 OtherAmounts31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters21
 * AdditionalParameters21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts32 OtherAmounts32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54
 * SecuritiesTradeDetails54}</li>
 * <li>{@linkplain com.tools20022.repository.choice.LegalFramework3Choice
 * LegalFramework3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TransactionActivity3Choice
 * TransactionActivity3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition5Choice
 * TradeTransactionCondition5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52
 * SecuritiesTradeDetails52}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts29 OtherAmounts29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50
 * SecuritiesTradeDetails50}</li>
 * <li>{@linkplain com.tools20022.repository.choice.UnilateralSplit3Choice
 * UnilateralSplit3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DerivativeCommodity2
 * DerivativeCommodity2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters29
 * AdditionalParameters29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters30
 * AdditionalParameters30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67
 * SecuritiesTradeDetails67}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction53 Transaction53}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68
 * SecuritiesTradeDetails68}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails97
 * TransactionDetails97}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails96
 * TransactionDetails96}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction54 Transaction54}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction52 Transaction52}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails95
 * TransactionDetails95}</li>
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
 * "SecuritiesTrade"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies trades linked to securities operations such as the exchange of securities, the lending of securities and the transactions related to investment funds."
 * </li>
 * </ul>
 */
public class SecuritiesTrade extends Trade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.SecuritiesTradeIdentification> securitiesTradeRelatedIdentifications;
	/**
	 * Specifies the different identifications associated with a securities
	 * trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmIdentifiedTrade
	 * SecuritiesTradeIdentification.mmIdentifiedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails15#mmReference
	 * RequestDetails15.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation11Choice#mmCancellationByReference
	 * Cancellation11Choice.mmCancellationByReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails13#mmIdentification
	 * IntraPositionMovementDetails13.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTradeRelatedIdentifications"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the different identifications associated with a securities trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesTradeRelatedIdentifications = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(RequestDetails15.mmReference, Cancellation11Choice.mmCancellationByReference, IntraPositionMovementDetails13.mmIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeRelatedIdentifications";
			definition = "Specifies the different identifications associated with a securities trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmIdentifiedTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
		}
	};
	protected CurrencyAndAmount tradeAmount;
	/**
	 * Total amount of the trade. Is equal to the executed trade quantity
	 * multiplied by the executed trade price.
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
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#mmGrossTradeAmount
	 * TwoLegTransactionDetails1.mmGrossTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmNetAmount
	 * SecuritiesTransaction1.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#mmTradeAmount
	 * OtherAmounts28.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#mmTradeAmount
	 * OtherAmounts30.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmTradeAmount
	 * OtherAmounts31.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts32#mmTradeAmount
	 * OtherAmounts32.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#mmNetAmount
	 * ReceiveInformation17.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#mmNetAmount
	 * ReceiveInformation16.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmNetAmount
	 * DeliverInformation16.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#mmNetAmount
	 * DeliverInformation17.mmNetAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of the trade. Is equal to the executed trade quantity multiplied by the executed trade price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTradeAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TwoLegTransactionDetails1.mmGrossTradeAmount, SecuritiesTransaction1.mmNetAmount, OtherAmounts28.mmTradeAmount, OtherAmounts30.mmTradeAmount, OtherAmounts31.mmTradeAmount,
					OtherAmounts32.mmTradeAmount, ReceiveInformation17.mmNetAmount, ReceiveInformation16.mmNetAmount, DeliverInformation16.mmNetAmount, DeliverInformation17.mmNetAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeAmount";
			definition = "Total amount of the trade. Is equal to the executed trade quantity multiplied by the executed trade price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTrade.class.getMethod("getTradeAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OpeningClosingCode openingClosingIndicator;
	/**
	 * Specifies additional information relative to the processing of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OpeningClosingCode
	 * OpeningClosingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmOpeningClosing
	 * SecuritiesTradeDetails51.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#mmOpeningClosing
	 * SecuritiesTradeDetails53.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#mmOpeningClosing
	 * SecuritiesTradeDetails52.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#mmOpeningClosing
	 * SecuritiesTradeDetails50.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#mmOpeningClosing
	 * SecuritiesTradeDetails67.mmOpeningClosing}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningClosingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies additional information relative to the processing of the trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOpeningClosingIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesTradeDetails51.mmOpeningClosing, SecuritiesTradeDetails53.mmOpeningClosing, SecuritiesTradeDetails52.mmOpeningClosing, SecuritiesTradeDetails50.mmOpeningClosing,
					SecuritiesTradeDetails67.mmOpeningClosing);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OpeningClosingIndicator";
			definition = "Specifies additional information relative to the processing of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OpeningClosingCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTrade.class.getMethod("getOpeningClosingIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TradeTransactionConditionCode tradeTransactionCondition;
	/**
	 * Indicates the conditions under which the order/trade is to be/was
	 * executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition4Choice#mmCode
	 * TradeTransactionCondition4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition4Choice#mmProprietary
	 * TradeTransactionCondition4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmTransactionConditions
	 * FinancialInstrumentStipulations2.mmTransactionConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmTradeTransactionCondition
	 * Order17.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmTradeTransactionCondition
	 * Order18.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmTradeTransactionCondition
	 * SecuritiesTradeDetails51.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#mmTradeTransactionCondition
	 * SecuritiesTradeDetails53.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#mmTradeTransactionCondition
	 * SecuritiesTradeDetails55.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmTradeTransactionCondition
	 * SecuritiesTradeDetails56.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54#mmTradeTransactionCondition
	 * SecuritiesTradeDetails54.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition5Choice#mmCode
	 * TradeTransactionCondition5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition5Choice#mmProprietary
	 * TradeTransactionCondition5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#mmTradeTransactionCondition
	 * SecuritiesTradeDetails52.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#mmTradeTransactionCondition
	 * SecuritiesTradeDetails50.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11#mmTradeTransactionCondition
	 * FundSettlementParameters11.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters12#mmTradeTransactionCondition
	 * FundSettlementParameters12.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#mmTradeTransactionCondition
	 * SecuritiesTradeDetails67.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmTradeTransactionCondition
	 * SecuritiesTradeDetails68.mmTradeTransactionCondition}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeTransactionCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the conditions under which the order/trade is to be/was executed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTradeTransactionCondition = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TradeTransactionCondition4Choice.mmCode, TradeTransactionCondition4Choice.mmProprietary, FinancialInstrumentStipulations2.mmTransactionConditions, Order17.mmTradeTransactionCondition,
					Order18.mmTradeTransactionCondition, SecuritiesTradeDetails51.mmTradeTransactionCondition, SecuritiesTradeDetails53.mmTradeTransactionCondition, SecuritiesTradeDetails55.mmTradeTransactionCondition,
					SecuritiesTradeDetails56.mmTradeTransactionCondition, SecuritiesTradeDetails54.mmTradeTransactionCondition, TradeTransactionCondition5Choice.mmCode, TradeTransactionCondition5Choice.mmProprietary,
					SecuritiesTradeDetails52.mmTradeTransactionCondition, SecuritiesTradeDetails50.mmTradeTransactionCondition, FundSettlementParameters11.mmTradeTransactionCondition, FundSettlementParameters12.mmTradeTransactionCondition,
					SecuritiesTradeDetails67.mmTradeTransactionCondition, SecuritiesTradeDetails68.mmTradeTransactionCondition);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeTransactionCondition";
			definition = "Indicates the conditions under which the order/trade is to be/was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeTransactionConditionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTrade.class.getMethod("getTradeTransactionCondition", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesTradeStatus> securitiesTradeStatus;
	/**
	 * Specifies the status of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmSecuritiesTrade
	 * SecuritiesTradeStatus.mmSecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails15#mmMatchingDenial
	 * RequestDetails15.mmMatchingDenial}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#mmStatusAndReason
	 * Transaction53.mmStatusAndReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTradeStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesTradeStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(RequestDetails15.mmMatchingDenial, Transaction53.mmStatusAndReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeStatus";
			definition = "Specifies the status of a trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmSecuritiesTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
		}
	};
	protected TransactionActivityCode activity;
	/**
	 * Specifies the type of activity to which the trade relates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionActivityCode
	 * TransactionActivityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionActivity3Choice#mmCode
	 * TransactionActivity3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionActivity3Choice#mmProprietary
	 * TransactionActivity3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#mmTransactionActivity
	 * TransactionDetails96.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmTransactionActivity
	 * TransactionDetails95.mmTransactionActivity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Activity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of activity to which the trade relates."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmActivity = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionActivity3Choice.mmCode, TransactionActivity3Choice.mmProprietary, TransactionDetails96.mmTransactionActivity, TransactionDetails95.mmTransactionActivity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Activity";
			definition = "Specifies the type of activity to which the trade relates.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionActivityCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTrade.class.getMethod("getActivity", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesQuantity> tradeQuantity;
	/**
	 * Specifies the total quantity of a financial instrument involved in a
	 * trade. It is derived from the ordered quantity or from the quantity
	 * specified in a leg of a financing agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmTrade
	 * SecuritiesQuantity.mmTrade}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradeQuantity
	 * TradeLeg8.mmTradeQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg10#mmTradeQuantity
	 * TradeLeg10.mmTradeQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmTradeQuantity
	 * TradeLeg9.mmTradeQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the total quantity of a financial instrument involved in a trade. It is derived from the ordered quantity or from the quantity specified in a leg of a financing agreement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTradeQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(TradeLeg8.mmTradeQuantity, TradeLeg10.mmTradeQuantity, TradeLeg9.mmTradeQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeQuantity";
			definition = "Specifies the total quantity of a financial instrument involved in a trade. It is derived from the ordered quantity or from the quantity specified in a leg of a financing agreement.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected ISODateTime tradeOriginationDate;
	/**
	 * Indicates the date and time of the agreement in principal between
	 * counter-parties prior to actual trade date. Used with fixed income for
	 * municipal new issue markets.
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
	 * {@linkplain com.tools20022.repository.msg.Order17#mmTradeOriginationDate
	 * Order17.mmTradeOriginationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmTradeOriginationDate
	 * Order18.mmTradeOriginationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeOriginationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the date and time of the agreement in principal between counter-parties prior to actual trade date.\nUsed with fixed income for municipal new issue markets."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTradeOriginationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Order17.mmTradeOriginationDate, Order18.mmTradeOriginationDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeOriginationDate";
			definition = "Indicates the date and time of the agreement in principal between counter-parties prior to actual trade date.\nUsed with fixed income for municipal new issue markets.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTrade.class.getMethod("getTradeOriginationDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ClearingFeeTypeCode clearingFeeType;
	/**
	 * Indicates the type of fee for trade executions at an exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode
	 * ClearingFeeTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingFeeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of fee for trade executions at an exchange."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmClearingFeeType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingFeeType";
			definition = "Indicates the type of fee for trade executions at an exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ClearingFeeTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTrade.class.getMethod("getClearingFeeType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Security> security;
	/**
	 * Security involved in a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesTrade
	 * Security.mmSecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmFinancialInstrumentAttributes
	 * SecuritiesTradeDetails48.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmFinancialInstrumentAttributes
	 * SecuritiesTradeDetails68.mmFinancialInstrumentAttributes}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security involved in a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecurity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesTradeDetails48.mmFinancialInstrumentAttributes, SecuritiesTradeDetails68.mmFinancialInstrumentAttributes);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security involved in a trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmSecuritiesTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesPricing> tradePrice;
	/**
	 * Specifies the executed trade price which is derived from the different
	 * deal prices.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSecuritiesTrade
	 * SecuritiesPricing.mmSecuritiesTrade}</li>
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
	 * {@linkplain com.tools20022.repository.msg.NetPosition3#mmAverageDealPrice
	 * NetPosition3.mmAverageDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmPrice
	 * SecuritiesTransaction1.mmPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the executed trade price which is derived from the different deal prices."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTradePrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(NetPosition3.mmAverageDealPrice, SecuritiesTransaction1.mmPrice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradePrice";
			definition = "Specifies the executed trade price which is derived from the different deal prices.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmSecuritiesTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesTradePartyRole> partyRole;
	/**
	 * Specifies each role linked to a securities trade and played by a party at
	 * that step in a securities transaction flow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradePartyRole#mmSecuritiesTrade
	 * SecuritiesTradePartyRole.mmSecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradePartyRole
	 * SecuritiesTradePartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmOtherBusinessParties
	 * SecuritiesTradeDetails48.mmOtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmOtherBusinessParties
	 * SecuritiesTradeDetails68.mmOtherBusinessParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to a securities trade and played by a party at that step in a securities transaction flow."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesTradeDetails48.mmOtherBusinessParties, SecuritiesTradeDetails68.mmOtherBusinessParties);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to a securities trade and played by a party at that step in a securities transaction flow.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradePartyRole.mmSecuritiesTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradePartyRole.mmObject();
		}
	};
	protected SecuritiesFinancing securitiesFinancingClosingData;
	/**
	 * Financing process for which a closing leg is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmClosingLegExecution
	 * SecuritiesFinancing.mmClosingLegExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmSecuritiesFinancingDetails
	 * SecuritiesTradeDetails68.mmSecuritiesFinancingDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingClosingData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financing process for which a closing leg is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesFinancingClosingData = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesTradeDetails68.mmSecuritiesFinancingDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesFinancingClosingData";
			definition = "Financing process for which a closing leg is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmClosingLegExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesTradeExecution> tradingExecution;
	/**
	 * The realisation of the trade over one or more transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmRelatedTrade
	 * SecuritiesTradeExecution.mmRelatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The realisation of the trade over one or more transactions."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTradingExecution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingExecution";
			definition = "The realisation of the trade over one or more transactions.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmRelatedTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Allocation> tradeAllocation;
	/**
	 * Information about the allocation of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#mmSecuritiesTrade
	 * Allocation.mmSecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Allocation
	 * Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the allocation of the trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTradeAllocation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeAllocation";
			definition = "Information about the allocation of the trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Allocation.mmSecuritiesTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Allocation.mmObject();
		}
	};
	protected SecuritiesOrder relatedOrder;
	/**
	 * Order which is executed by a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderExecution
	 * SecuritiesOrder.mmOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4#mmOrderTransmission
	 * SecuritiesTransactionReport4.mmOrderTransmission}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order which is executed by a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedOrder = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesTransactionReport4.mmOrderTransmission);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order which is executed by a trade.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmOrderExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};
	protected SecuritiesFinancing securitiesFinancingOpeningData;
	/**
	 * Financing process for which an opening leg is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmOpeningLegExecution
	 * SecuritiesFinancing.mmOpeningLegExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingOpeningData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financing process for which an opening leg is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesFinancingOpeningData = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesFinancingOpeningData";
			definition = "Financing process for which an opening leg is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmOpeningLegExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
		}
	};
	protected TradeTypeCode transactionType;
	/**
	 * Indicates the type of transaction of which the order is a component.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.TradeType3Choice#mmCode
	 * TradeType3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeType3Choice#mmProprietary
	 * TradeType3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmTradeTransactionType
	 * Order17.mmTradeTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmTradeTransactionType
	 * Order18.mmTradeTransactionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradeType
	 * TradeLeg8.mmTradeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg10#mmTradeType
	 * TradeLeg10.mmTradeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmTradeType
	 * TradeLeg9.mmTradeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmDerivativeNotionalChange
	 * SecuritiesTransaction1.mmDerivativeNotionalChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeCommodity2#mmTransactionType
	 * DerivativeCommodity2.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmTransactionType
	 * SecuredMarketTransaction4.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmTransactionType
	 * OvernightIndexSwapTransaction4.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmTransactionType
	 * UnsecuredMarketTransaction4.mmTransactionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of transaction of which the order is a component."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTransactionType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TradeType3Choice.mmCode, TradeType3Choice.mmProprietary, Order17.mmTradeTransactionType, Order18.mmTradeTransactionType, TradeLeg8.mmTradeType, TradeLeg10.mmTradeType,
					TradeLeg9.mmTradeType, SecuritiesTransaction1.mmDerivativeNotionalChange, DerivativeCommodity2.mmTransactionType, SecuredMarketTransaction4.mmTransactionType, OvernightIndexSwapTransaction4.mmTransactionType,
					UnsecuredMarketTransaction4.mmTransactionType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionType";
			definition = "Indicates the type of transaction of which the order is a component.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTrade.class.getMethod("getTransactionType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected LegalFrameworkCode legalFramework;
	/**
	 * Legal framework of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LegalFrameworkCode
	 * LegalFrameworkCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmLegalFramework
	 * SecuritiesFinancing10.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#mmLegalFramework
	 * SecuritiesFinancingTransactionDetails28.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmLegalFramework
	 * SecuritiesFinancingTransactionDetails27.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmLegalFramework
	 * SecuritiesFinancingTransactionDetails29.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LegalFramework3Choice#mmCode
	 * LegalFramework3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LegalFramework3Choice#mmProprietary
	 * LegalFramework3Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalFramework"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal framework of the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLegalFramework = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesFinancing10.mmLegalFramework, SecuritiesFinancingTransactionDetails28.mmLegalFramework, SecuritiesFinancingTransactionDetails27.mmLegalFramework,
					SecuritiesFinancingTransactionDetails29.mmLegalFramework, LegalFramework3Choice.mmCode, LegalFramework3Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LegalFramework";
			definition = "Legal framework of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LegalFrameworkCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTrade.class.getMethod("getLegalFramework", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesTransactionTypeV2Code securitiesTransactionType;
	/**
	 * Underlying information about the settlement transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmSettlementTransactionType
	 * SettlementDetails43.mmSettlementTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType18Choice#mmCode
	 * SecuritiesTransactionType18Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType18Choice#mmProprietary
	 * SecuritiesTransactionType18Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnilateralSplit3Choice#mmCode
	 * UnilateralSplit3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnilateralSplit3Choice#mmProprietary
	 * UnilateralSplit3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmSecuritiesTransactionType
	 * SettlementDetails128.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmSecuritiesTransactionType
	 * SettlementDetails120.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmSecuritiesTransactionType
	 * SettlementDetails119.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125#mmSecuritiesTransactionType
	 * SettlementDetails125.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters15#mmSecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters15.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters17#mmSecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters17.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16#mmSecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters16.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmSecuritiesFinancingTransactionType
	 * SecuritiesFinancingTransactionDetails35.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType33Choice#mmCode
	 * SecuritiesTransactionType33Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType33Choice#mmProprietary
	 * SecuritiesTransactionType33Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent19Choice#mmSecuritiesTransactionType
	 * SettlementOrCorporateActionEvent19Choice.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmSecuritiesTransactionType
	 * SettlementDetails122.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent17Choice#mmSecuritiesTransactionType
	 * SettlementOrCorporateActionEvent17Choice.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType32Choice#mmCode
	 * SecuritiesTransactionType32Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType32Choice#mmProprietary
	 * SecuritiesTransactionType32Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmSecuritiesTransactionType
	 * SettlementDetails121.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#mmTransactionType
	 * ForeignExchangeSwapTransaction3.mmTransactionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying information about the settlement transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSecuritiesTransactionType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementDetails43.mmSettlementTransactionType, SecuritiesTransactionType18Choice.mmCode, SecuritiesTransactionType18Choice.mmProprietary, UnilateralSplit3Choice.mmCode,
					UnilateralSplit3Choice.mmProprietary, SettlementDetails128.mmSecuritiesTransactionType, SettlementDetails120.mmSecuritiesTransactionType, SettlementDetails119.mmSecuritiesTransactionType,
					SettlementDetails125.mmSecuritiesTransactionType, TransactionTypeAndAdditionalParameters15.mmSecuritiesFinancingTransactionType, TransactionTypeAndAdditionalParameters17.mmSecuritiesFinancingTransactionType,
					TransactionTypeAndAdditionalParameters16.mmSecuritiesFinancingTransactionType, SecuritiesFinancingTransactionDetails35.mmSecuritiesFinancingTransactionType, SecuritiesTransactionType33Choice.mmCode,
					SecuritiesTransactionType33Choice.mmProprietary, SettlementOrCorporateActionEvent19Choice.mmSecuritiesTransactionType, SettlementDetails122.mmSecuritiesTransactionType,
					SettlementOrCorporateActionEvent17Choice.mmSecuritiesTransactionType, SecuritiesTransactionType32Choice.mmCode, SecuritiesTransactionType32Choice.mmProprietary, SettlementDetails121.mmSecuritiesTransactionType,
					ForeignExchangeSwapTransaction3.mmTransactionType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTransactionType";
			definition = "Underlying information about the settlement transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTrade.class.getMethod("getSecuritiesTransactionType", new Class[]{});
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
				name = "SecuritiesTrade";
				definition = "Specifies trades linked to securities operations such as the exchange of securities, the lending of securities and the transactions related to investment funds.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmSecuritiesTrade, com.tools20022.repository.entity.SecuritiesPricing.mmSecuritiesTrade,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.mmIdentifiedTrade, com.tools20022.repository.entity.SecuritiesQuantity.mmTrade,
						com.tools20022.repository.entity.SecuritiesTradeExecution.mmRelatedTrade, com.tools20022.repository.entity.SecuritiesTradeStatus.mmSecuritiesTrade,
						com.tools20022.repository.entity.SecuritiesFinancing.mmClosingLegExecution, com.tools20022.repository.entity.SecuritiesFinancing.mmOpeningLegExecution,
						com.tools20022.repository.entity.SecuritiesOrder.mmOrderExecution, com.tools20022.repository.entity.SecuritiesTradePartyRole.mmSecuritiesTrade, com.tools20022.repository.entity.Allocation.mmSecuritiesTrade);
				derivationElement_lazy = () -> Arrays.asList(TradeLeg8.mmTradeRegistrationOrigin, TradeLegStatement3.mmTradeLegsDetails, NetPosition3.mmTradeLegDetails, TradeLeg10.mmTradeRegistrationOrigin,
						TradeLeg9.mmTradeRegistrationOrigin, TransactionDetails76.mmTransactionDetails, SecuritiesTradeDetails48.mmOtherAmounts, Transaction53.mmTransactionDetails, SecuritiesTradeDetails68.mmOtherAmounts,
						Transaction54.mmTransactionDetails, Transaction52.mmTransactionDetails);
				subType_lazy = () -> Arrays.asList(InvestmentFundTransaction.mmObject(), com.tools20022.repository.entity.SecuritiesFinancing.mmObject(), SecuritiesTransaction.mmObject(), SecuritiesOptionTrade.mmObject());
				superType_lazy = () -> Trade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications, com.tools20022.repository.entity.SecuritiesTrade.mmTradeAmount,
						com.tools20022.repository.entity.SecuritiesTrade.mmOpeningClosingIndicator, com.tools20022.repository.entity.SecuritiesTrade.mmTradeTransactionCondition,
						com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesTradeStatus, com.tools20022.repository.entity.SecuritiesTrade.mmActivity, com.tools20022.repository.entity.SecuritiesTrade.mmTradeQuantity,
						com.tools20022.repository.entity.SecuritiesTrade.mmTradeOriginationDate, com.tools20022.repository.entity.SecuritiesTrade.mmClearingFeeType, com.tools20022.repository.entity.SecuritiesTrade.mmSecurity,
						com.tools20022.repository.entity.SecuritiesTrade.mmTradePrice, com.tools20022.repository.entity.SecuritiesTrade.mmPartyRole, com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesFinancingClosingData,
						com.tools20022.repository.entity.SecuritiesTrade.mmTradingExecution, com.tools20022.repository.entity.SecuritiesTrade.mmTradeAllocation, com.tools20022.repository.entity.SecuritiesTrade.mmRelatedOrder,
						com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesFinancingOpeningData, com.tools20022.repository.entity.SecuritiesTrade.mmTransactionType,
						com.tools20022.repository.entity.SecuritiesTrade.mmLegalFramework, com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesTransactionType);
				derivationComponent_lazy = () -> Arrays.asList(TradeType3Choice.mmObject(), TradeTransactionCondition4Choice.mmObject(), OtherAmounts16.mmObject(), TwoLegTransactionType1Choice.mmObject(), TradeLeg8.mmObject(),
						TradeLegStatement3.mmObject(), TradeLeg10.mmObject(), TradeLeg9.mmObject(), TransactionDetails81.mmObject(), TransactionDetails74.mmObject(), TransactionDetails82.mmObject(), TransactionDetails76.mmObject(),
						SecuritiesTradeDetails48.mmObject(), TransactionDetails80.mmObject(), OtherAmounts28.mmObject(), SecuritiesTradeDetails51.mmObject(), OtherAmounts30.mmObject(), SecuritiesTradeDetails53.mmObject(),
						AdditionalParameters24.mmObject(), OtherAmounts31.mmObject(), AdditionalParameters21.mmObject(), OtherAmounts32.mmObject(), SecuritiesTradeDetails54.mmObject(), LegalFramework3Choice.mmObject(),
						TransactionActivity3Choice.mmObject(), TradeTransactionCondition5Choice.mmObject(), SecuritiesTradeDetails52.mmObject(), OtherAmounts29.mmObject(), SecuritiesTradeDetails50.mmObject(),
						UnilateralSplit3Choice.mmObject(), DerivativeCommodity2.mmObject(), AdditionalParameters29.mmObject(), AdditionalParameters30.mmObject(), SecuritiesTradeDetails67.mmObject(), Transaction53.mmObject(),
						SecuritiesTradeDetails68.mmObject(), TransactionDetails97.mmObject(), TransactionDetails96.mmObject(), Transaction54.mmObject(), Transaction52.mmObject(), TransactionDetails95.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesTrade.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecuritiesTradeIdentification> getSecuritiesTradeRelatedIdentifications() {
		return securitiesTradeRelatedIdentifications;
	}

	public void setSecuritiesTradeRelatedIdentifications(List<com.tools20022.repository.entity.SecuritiesTradeIdentification> securitiesTradeRelatedIdentifications) {
		this.securitiesTradeRelatedIdentifications = securitiesTradeRelatedIdentifications;
	}

	public CurrencyAndAmount getTradeAmount() {
		return tradeAmount;
	}

	public void setTradeAmount(CurrencyAndAmount tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public OpeningClosingCode getOpeningClosingIndicator() {
		return openingClosingIndicator;
	}

	public void setOpeningClosingIndicator(OpeningClosingCode openingClosingIndicator) {
		this.openingClosingIndicator = openingClosingIndicator;
	}

	public TradeTransactionConditionCode getTradeTransactionCondition() {
		return tradeTransactionCondition;
	}

	public void setTradeTransactionCondition(TradeTransactionConditionCode tradeTransactionCondition) {
		this.tradeTransactionCondition = tradeTransactionCondition;
	}

	public List<SecuritiesTradeStatus> getSecuritiesTradeStatus() {
		return securitiesTradeStatus;
	}

	public void setSecuritiesTradeStatus(List<com.tools20022.repository.entity.SecuritiesTradeStatus> securitiesTradeStatus) {
		this.securitiesTradeStatus = securitiesTradeStatus;
	}

	public TransactionActivityCode getActivity() {
		return activity;
	}

	public void setActivity(TransactionActivityCode activity) {
		this.activity = activity;
	}

	public List<SecuritiesQuantity> getTradeQuantity() {
		return tradeQuantity;
	}

	public void setTradeQuantity(List<com.tools20022.repository.entity.SecuritiesQuantity> tradeQuantity) {
		this.tradeQuantity = tradeQuantity;
	}

	public ISODateTime getTradeOriginationDate() {
		return tradeOriginationDate;
	}

	public void setTradeOriginationDate(ISODateTime tradeOriginationDate) {
		this.tradeOriginationDate = tradeOriginationDate;
	}

	public ClearingFeeTypeCode getClearingFeeType() {
		return clearingFeeType;
	}

	public void setClearingFeeType(ClearingFeeTypeCode clearingFeeType) {
		this.clearingFeeType = clearingFeeType;
	}

	public List<Security> getSecurity() {
		return security;
	}

	public void setSecurity(List<com.tools20022.repository.entity.Security> security) {
		this.security = security;
	}

	public List<SecuritiesPricing> getTradePrice() {
		return tradePrice;
	}

	public void setTradePrice(List<com.tools20022.repository.entity.SecuritiesPricing> tradePrice) {
		this.tradePrice = tradePrice;
	}

	public List<SecuritiesTradePartyRole> getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(List<com.tools20022.repository.entity.SecuritiesTradePartyRole> partyRole) {
		this.partyRole = partyRole;
	}

	public SecuritiesFinancing getSecuritiesFinancingClosingData() {
		return securitiesFinancingClosingData;
	}

	public void setSecuritiesFinancingClosingData(com.tools20022.repository.entity.SecuritiesFinancing securitiesFinancingClosingData) {
		this.securitiesFinancingClosingData = securitiesFinancingClosingData;
	}

	public List<SecuritiesTradeExecution> getTradingExecution() {
		return tradingExecution;
	}

	public void setTradingExecution(List<com.tools20022.repository.entity.SecuritiesTradeExecution> tradingExecution) {
		this.tradingExecution = tradingExecution;
	}

	public List<Allocation> getTradeAllocation() {
		return tradeAllocation;
	}

	public void setTradeAllocation(List<com.tools20022.repository.entity.Allocation> tradeAllocation) {
		this.tradeAllocation = tradeAllocation;
	}

	public SecuritiesOrder getRelatedOrder() {
		return relatedOrder;
	}

	public void setRelatedOrder(com.tools20022.repository.entity.SecuritiesOrder relatedOrder) {
		this.relatedOrder = relatedOrder;
	}

	public SecuritiesFinancing getSecuritiesFinancingOpeningData() {
		return securitiesFinancingOpeningData;
	}

	public void setSecuritiesFinancingOpeningData(com.tools20022.repository.entity.SecuritiesFinancing securitiesFinancingOpeningData) {
		this.securitiesFinancingOpeningData = securitiesFinancingOpeningData;
	}

	public TradeTypeCode getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(TradeTypeCode transactionType) {
		this.transactionType = transactionType;
	}

	public LegalFrameworkCode getLegalFramework() {
		return legalFramework;
	}

	public void setLegalFramework(LegalFrameworkCode legalFramework) {
		this.legalFramework = legalFramework;
	}

	public SecuritiesTransactionTypeV2Code getSecuritiesTransactionType() {
		return securitiesTransactionType;
	}

	public void setSecuritiesTransactionType(SecuritiesTransactionTypeV2Code securitiesTransactionType) {
		this.securitiesTransactionType = securitiesTransactionType;
	}
}