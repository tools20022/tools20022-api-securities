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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Specifies the different identifications associated with a trade.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TradeIdentification" src="doc-files/TradeIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmCounterpartyReference
 * TradeIdentification.mmCounterpartyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
 * TradeIdentification.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmCommonIdentification
 * TradeIdentification.mmCommonIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmMatchingReference
 * TradeIdentification.mmMatchingReference}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradeIdentification#mmTrade
 * TradeIdentification.mmTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmUniqueTradeIdentifier
 * TradeIdentification.mmUniqueTradeIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmClearingBrokerIdentification
 * TradeIdentification.mmClearingBrokerIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeRelatedIdentifications
 * Trade.mmTradeRelatedIdentifications}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingBrokerIdentification#mmRelatedTradeIdentification
 * ClearingBrokerIdentification.mmRelatedTradeIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
 * SecuritiesTradeIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentIdentification
 * PaymentIdentification}</li>
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
 * "TradeIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the different identifications associated with a trade."</li>
 * </ul>
 */
public class TradeIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text counterpartyReference;
	/**
	 * Unambiguous identification of the trade allocated by the counterparty.
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer26#mmCounterpartyReference
	 * ISATransfer26.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#mmCounterpartyReference
	 * Transfer31.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmCounterpartyReference
	 * Transfer30.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer32#mmCounterpartyReference
	 * Transfer32.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#mmCounterpartyReference
	 * Transfer33.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer22#mmCounterpartyReference
	 * ISATransfer22.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOpening3#mmCounterpartyReference
	 * InvestmentAccountOpening3.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModification3#mmCounterpartyReference
	 * InvestmentAccountModification3.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation4#mmCounterpartyReference
	 * AccountManagementConfirmation4.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmCounterpartyProprietaryTransactionIdentification
	 * SecuredMarketTransaction4.
	 * mmCounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#mmCounterpartyProprietaryTransactionIdentification
	 * ForeignExchangeSwapTransaction3.
	 * mmCounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmCounterpartyProprietaryTransactionIdentification
	 * OvernightIndexSwapTransaction4.
	 * mmCounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmCounterpartyProprietaryTransactionIdentification
	 * UnsecuredMarketTransaction4.
	 * mmCounterpartyProprietaryTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the trade allocated by the counterparty."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCounterpartyReference = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ISATransfer26.mmCounterpartyReference, Transfer31.mmCounterpartyReference, Transfer30.mmCounterpartyReference, Transfer32.mmCounterpartyReference, Transfer33.mmCounterpartyReference,
					ISATransfer22.mmCounterpartyReference, InvestmentAccountOpening3.mmCounterpartyReference, InvestmentAccountModification3.mmCounterpartyReference, AccountManagementConfirmation4.mmCounterpartyReference,
					SecuredMarketTransaction4.mmCounterpartyProprietaryTransactionIdentification, ForeignExchangeSwapTransaction3.mmCounterpartyProprietaryTransactionIdentification,
					OvernightIndexSwapTransaction4.mmCounterpartyProprietaryTransactionIdentification, UnsecuredMarketTransaction4.mmCounterpartyProprietaryTransactionIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CounterpartyReference";
			definition = "Unambiguous identification of the trade allocated by the counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradeIdentification.class.getMethod("getCounterpartyReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text identification;
	/**
	 * Reference assigned to the trade by the investor or the trading party.
	 * This reference will be used throughout the trade life cycle to
	 * access/update the trade details.
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
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#mmInstructingPartyTransactionIdentification
	 * IdentificationReference8Choice.
	 * mmInstructingPartyTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#mmExecutingPartyTransactionIdentification
	 * IdentificationReference8Choice.mmExecutingPartyTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmInstructingPartyTransactionIdentification
	 * IdentificationReference11Choice.
	 * mmInstructingPartyTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmExecutingPartyTransactionIdentification
	 * IdentificationReference11Choice.mmExecutingPartyTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#mmOpeningLegIdentification
	 * TwoLegTransactionDetails1.mmOpeningLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#mmClosingLegIdentification
	 * TwoLegTransactionDetails1.mmClosingLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradeLegIdentification
	 * TradeLeg8.mmTradeLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg10#mmTradeLegIdentification
	 * TradeLeg10.mmTradeLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmTradeLegIdentification
	 * TradeLeg9.mmTradeLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails76#mmOtherTransactionIdentification
	 * TransactionDetails76.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References45Choice#mmOtherTransactionIdentification
	 * References45Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification18#mmTransactionIdentification
	 * SettlementTypeAndIdentification18.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmTradeIdentification
	 * SecuritiesTradeDetails51.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#mmTradeIdentification
	 * SecuritiesTradeDetails53.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters24#mmPreviousPartialConfirmationIdentification
	 * AdditionalParameters24.mmPreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters21#mmPreviousPartialConfirmationIdentification
	 * AdditionalParameters21.mmPreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54#mmTradeIdentification
	 * SecuritiesTradeDetails54.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#mmTradeIdentification
	 * SecuritiesTradeDetails52.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References46Choice#mmTradeIdentification
	 * References46Choice.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References46Choice#mmOtherTransactionIdentification
	 * References46Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#mmTradeIdentification
	 * Identification15.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#mmTradeIdentification
	 * SecuritiesTradeDetails50.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References41Choice#mmOtherTransactionIdentification
	 * References41Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References44Choice#mmOtherTransactionIdentification
	 * References44Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References47Choice#mmOtherTransactionIdentification
	 * References47Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References18#mmTradeIdentification
	 * References18.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification20#mmTransactionIdentification
	 * SettlementTypeAndIdentification20.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference8#mmCancellationReference
	 * MessageAndBusinessReference8.mmCancellationReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References48Choice#mmPreviousReference
	 * References48Choice.mmPreviousReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References48Choice#mmOtherReference
	 * References48Choice.mmOtherReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#mmDealReference
	 * IndividualOrderConfirmationStatusAndReason2.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference10#mmReference
	 * MessageAndBusinessReference10.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference10#mmRelatedReference
	 * MessageAndBusinessReference10.mmRelatedReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#mmDealReference
	 * IndividualOrderStatusAndReason7.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4#mmTransactionIdentification
	 * SecuritiesTransactionReport4.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29#mmPreviousPartialConfirmationIdentification
	 * AdditionalParameters29.mmPreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#mmTradeIdentification
	 * SecuritiesTradeDetails67.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#mmTradeIdentification
	 * Transaction53.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmTradeIdentification
	 * SecuritiesTradeDetails68.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmTradeIdentification
	 * TransactionDetails97.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#mmTradeIdentification
	 * Transaction54.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#mmTradeIdentification
	 * Transaction52.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmProprietaryTransactionIdentification
	 * SecuredMarketTransaction4.mmProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmRelatedProprietaryTransactionIdentification
	 * SecuredMarketTransaction4.mmRelatedProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#mmProprietaryTransactionIdentification
	 * ForeignExchangeSwapTransaction3.mmProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#mmRelatedProprietaryTransactionIdentification
	 * ForeignExchangeSwapTransaction3.
	 * mmRelatedProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmProprietaryTransactionIdentification
	 * OvernightIndexSwapTransaction4.mmProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmRelatedProprietaryTransactionIdentification
	 * OvernightIndexSwapTransaction4.
	 * mmRelatedProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmProprietaryTransactionIdentification
	 * UnsecuredMarketTransaction4.mmProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmRelatedProprietaryTransactionIdentification
	 * UnsecuredMarketTransaction4.mmRelatedProprietaryTransactionIdentification
	 * }</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned to the trade by the investor or the trading party. This reference will be used throughout the trade life cycle to access/update the trade details."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(IdentificationReference8Choice.mmInstructingPartyTransactionIdentification, IdentificationReference8Choice.mmExecutingPartyTransactionIdentification,
					IdentificationReference11Choice.mmInstructingPartyTransactionIdentification, IdentificationReference11Choice.mmExecutingPartyTransactionIdentification, TwoLegTransactionDetails1.mmOpeningLegIdentification,
					TwoLegTransactionDetails1.mmClosingLegIdentification, TradeLeg8.mmTradeLegIdentification, TradeLeg10.mmTradeLegIdentification, TradeLeg9.mmTradeLegIdentification, TransactionDetails76.mmOtherTransactionIdentification,
					References45Choice.mmOtherTransactionIdentification, SettlementTypeAndIdentification18.mmTransactionIdentification, SecuritiesTradeDetails51.mmTradeIdentification, SecuritiesTradeDetails53.mmTradeIdentification,
					AdditionalParameters24.mmPreviousPartialConfirmationIdentification, AdditionalParameters21.mmPreviousPartialConfirmationIdentification, SecuritiesTradeDetails54.mmTradeIdentification,
					SecuritiesTradeDetails52.mmTradeIdentification, References46Choice.mmTradeIdentification, References46Choice.mmOtherTransactionIdentification, Identification15.mmTradeIdentification,
					SecuritiesTradeDetails50.mmTradeIdentification, References41Choice.mmOtherTransactionIdentification, References44Choice.mmOtherTransactionIdentification, References47Choice.mmOtherTransactionIdentification,
					References18.mmTradeIdentification, SettlementTypeAndIdentification20.mmTransactionIdentification, MessageAndBusinessReference8.mmCancellationReference, References48Choice.mmPreviousReference,
					References48Choice.mmOtherReference, IndividualOrderConfirmationStatusAndReason2.mmDealReference, MessageAndBusinessReference10.mmReference, MessageAndBusinessReference10.mmRelatedReference,
					IndividualOrderStatusAndReason7.mmDealReference, SecuritiesTransactionReport4.mmTransactionIdentification, AdditionalParameters29.mmPreviousPartialConfirmationIdentification,
					SecuritiesTradeDetails67.mmTradeIdentification, Transaction53.mmTradeIdentification, SecuritiesTradeDetails68.mmTradeIdentification, TransactionDetails97.mmTradeIdentification, Transaction54.mmTradeIdentification,
					Transaction52.mmTradeIdentification, SecuredMarketTransaction4.mmProprietaryTransactionIdentification, SecuredMarketTransaction4.mmRelatedProprietaryTransactionIdentification,
					ForeignExchangeSwapTransaction3.mmProprietaryTransactionIdentification, ForeignExchangeSwapTransaction3.mmRelatedProprietaryTransactionIdentification,
					OvernightIndexSwapTransaction4.mmProprietaryTransactionIdentification, OvernightIndexSwapTransaction4.mmRelatedProprietaryTransactionIdentification, UnsecuredMarketTransaction4.mmProprietaryTransactionIdentification,
					UnsecuredMarketTransaction4.mmRelatedProprietaryTransactionIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Reference assigned to the trade by the investor or the trading party. This reference will be used throughout the trade life cycle to access/update the trade details.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradeIdentification.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text commonIdentification;
	/**
	 * Unique reference agreed upon by the two trade counterparties to identify
	 * the trade.
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
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#mmCommonIdentification
	 * IdentificationReference8Choice.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmCommonIdentification
	 * IdentificationReference11Choice.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmTradePlaceMatchingIdentification
	 * SecuritiesTransaction1.mmTradePlaceMatchingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmComplexTradeComponentIdentification
	 * SecuritiesTransaction1.mmComplexTradeComponentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmCommonIdentification
	 * SecuritiesTradeDetails48.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification19#mmCommonIdentification
	 * SettlementTypeAndIdentification19.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications31#mmCommonIdentification
	 * TransactionIdentifications31.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters12#mmCommonIdentification
	 * SettlementTypeAndAdditionalParameters12.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications32#mmCommonIdentification
	 * TransactionIdentifications32.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters14#mmCommonIdentification
	 * SettlementTypeAndAdditionalParameters14.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References46Choice#mmCommonIdentification
	 * References46Choice.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#mmCommonIdentification
	 * Identification15.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters13#mmCommonIdentification
	 * SettlementTypeAndAdditionalParameters13.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References18#mmCommonIdentification
	 * References18.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters19#mmCommonIdentification
	 * SettlementTypeAndAdditionalParameters19.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#mmCommonIdentification
	 * Transaction53.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmCommonIdentification
	 * SecuritiesTradeDetails68.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters15#mmCommonIdentification
	 * TransactionTypeAndAdditionalParameters15.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters17#mmCommonIdentification
	 * TransactionTypeAndAdditionalParameters17.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16#mmCommonIdentification
	 * TransactionTypeAndAdditionalParameters16.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#mmCommonIdentification
	 * Transaction54.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#mmCommonIdentification
	 * Transaction52.mmCommonIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference agreed upon by the two trade counterparties to identify the trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCommonIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(IdentificationReference8Choice.mmCommonIdentification, IdentificationReference11Choice.mmCommonIdentification, SecuritiesTransaction1.mmTradePlaceMatchingIdentification,
					SecuritiesTransaction1.mmComplexTradeComponentIdentification, SecuritiesTradeDetails48.mmCommonIdentification, SettlementTypeAndIdentification19.mmCommonIdentification,
					TransactionIdentifications31.mmCommonIdentification, SettlementTypeAndAdditionalParameters12.mmCommonIdentification, TransactionIdentifications32.mmCommonIdentification,
					SettlementTypeAndAdditionalParameters14.mmCommonIdentification, References46Choice.mmCommonIdentification, Identification15.mmCommonIdentification, SettlementTypeAndAdditionalParameters13.mmCommonIdentification,
					References18.mmCommonIdentification, SettlementTypeAndAdditionalParameters19.mmCommonIdentification, Transaction53.mmCommonIdentification, SecuritiesTradeDetails68.mmCommonIdentification,
					TransactionTypeAndAdditionalParameters15.mmCommonIdentification, TransactionTypeAndAdditionalParameters17.mmCommonIdentification, TransactionTypeAndAdditionalParameters16.mmCommonIdentification,
					Transaction54.mmCommonIdentification, Transaction52.mmCommonIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommonIdentification";
			definition = "Unique reference agreed upon by the two trade counterparties to identify the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradeIdentification.class.getMethod("getCommonIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text matchingReference;
	/**
	 * Reference assigned by a matching system when the trade is matched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned by a matching system when the trade is matched."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMatchingReference = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MatchingReference";
			definition = "Reference assigned by a matching system when the trade is matched.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradeIdentification.class.getMethod("getMatchingReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Trade trade;
	/**
	 * Specifies the trade for which identifications are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeRelatedIdentifications
	 * Trade.mmTradeRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the trade for which identifications are provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			definition = "Specifies the trade for which identifications are provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.mmTradeRelatedIdentifications;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
		}
	};
	protected Max35Text uniqueTradeIdentifier;
	/**
	 * This field specifies the unique transaction identifier (UTI) to be
	 * created at the time a transaction is first executed, shared with all
	 * registered entities and counterparties involved in the transaction, and
	 * used to track that particular transaction over its life. This identifier
	 * can also be known as the Unique Swap Identifier (USI).
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport2#mmTransactionIdentification
	 * SecuritiesTransactionReport2.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmUniqueTransactionIdentifier
	 * SecuredMarketTransaction4.mmUniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#mmUniqueTransactionIdentifier
	 * ForeignExchangeSwapTransaction3.mmUniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmUniqueTransactionIdentifier
	 * OvernightIndexSwapTransaction4.mmUniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmUniqueTransactionIdentifier
	 * UnsecuredMarketTransaction4.mmUniqueTransactionIdentifier}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UniqueTradeIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This field specifies the unique transaction identifier (UTI) to be created at the time a transaction is first executed, shared with all registered entities and counterparties involved in the transaction, and used to track that particular transaction over its life. This identifier can also be known as the Unique Swap Identifier (USI)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmUniqueTradeIdentifier = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesTransactionReport2.mmTransactionIdentification, SecuredMarketTransaction4.mmUniqueTransactionIdentifier, ForeignExchangeSwapTransaction3.mmUniqueTransactionIdentifier,
					OvernightIndexSwapTransaction4.mmUniqueTransactionIdentifier, UnsecuredMarketTransaction4.mmUniqueTransactionIdentifier);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UniqueTradeIdentifier";
			definition = "This field specifies the unique transaction identifier (UTI) to be created at the time a transaction is first executed, shared with all registered entities and counterparties involved in the transaction, and used to track that particular transaction over its life. This identifier can also be known as the Unique Swap Identifier (USI).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradeIdentification.class.getMethod("getUniqueTradeIdentifier", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.ClearingBrokerIdentification> clearingBrokerIdentification;
	/**
	 * Reference number assigned by the clearing broker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingBrokerIdentification#mmRelatedTradeIdentification
	 * ClearingBrokerIdentification.mmRelatedTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ClearingBrokerIdentification
	 * ClearingBrokerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingBrokerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference number assigned by the clearing broker."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmClearingBrokerIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingBrokerIdentification";
			definition = "Reference number assigned by the clearing broker.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingBrokerIdentification.mmRelatedTradeIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ClearingBrokerIdentification.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeIdentification";
				definition = "Specifies the different identifications associated with a trade.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.mmTradeRelatedIdentifications, com.tools20022.repository.entity.ClearingBrokerIdentification.mmRelatedTradeIdentification);
				subType_lazy = () -> Arrays.asList(SecuritiesTradeIdentification.mmObject(), PaymentIdentification.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TradeIdentification.mmCounterpartyReference, com.tools20022.repository.entity.TradeIdentification.mmIdentification,
						com.tools20022.repository.entity.TradeIdentification.mmCommonIdentification, com.tools20022.repository.entity.TradeIdentification.mmMatchingReference, com.tools20022.repository.entity.TradeIdentification.mmTrade,
						com.tools20022.repository.entity.TradeIdentification.mmUniqueTradeIdentifier, com.tools20022.repository.entity.TradeIdentification.mmClearingBrokerIdentification);
			}

			@Override
			public Class<?> getInstanceClass() {
				return TradeIdentification.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getCounterpartyReference() {
		return counterpartyReference;
	}

	public void setCounterpartyReference(Max35Text counterpartyReference) {
		this.counterpartyReference = counterpartyReference;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public Max35Text getCommonIdentification() {
		return commonIdentification;
	}

	public void setCommonIdentification(Max35Text commonIdentification) {
		this.commonIdentification = commonIdentification;
	}

	public Max35Text getMatchingReference() {
		return matchingReference;
	}

	public void setMatchingReference(Max35Text matchingReference) {
		this.matchingReference = matchingReference;
	}

	public Trade getTrade() {
		return trade;
	}

	public void setTrade(com.tools20022.repository.entity.Trade trade) {
		this.trade = trade;
	}

	public Max35Text getUniqueTradeIdentifier() {
		return uniqueTradeIdentifier;
	}

	public void setUniqueTradeIdentifier(Max35Text uniqueTradeIdentifier) {
		this.uniqueTradeIdentifier = uniqueTradeIdentifier;
	}

	public List<ClearingBrokerIdentification> getClearingBrokerIdentification() {
		return clearingBrokerIdentification;
	}

	public void setClearingBrokerIdentification(List<com.tools20022.repository.entity.ClearingBrokerIdentification> clearingBrokerIdentification) {
		this.clearingBrokerIdentification = clearingBrokerIdentification;
	}
}