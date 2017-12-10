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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Settlement;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Settlement of the securities in a securities transaction, that is, the
 * instruction to deliver or receive securities, involving the payment of an
 * amount of money or not.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesSettlement" src="doc-files/SecuritiesSettlement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Settlement
 * Settlement}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmTransferOperation
 * SecuritiesSettlement.mmTransferOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementDate
 * SecuritiesSettlement.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPartyRole
 * SecuritiesSettlement.mmPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementAmount
 * SecuritiesSettlement.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmHoldingsPlanType
 * SecuritiesSettlement.mmHoldingsPlanType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecuritiesMovementType
 * SecuritiesSettlement.mmSecuritiesMovementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementQuantity
 * SecuritiesSettlement.mmSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecuritiesTradeExecution
 * SecuritiesSettlement.mmSecuritiesTradeExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmCurrencyToBuy
 * SecuritiesSettlement.mmCurrencyToBuy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmCurrencyToSell
 * SecuritiesSettlement.mmCurrencyToSell}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmDenominationChoice
 * SecuritiesSettlement.mmDenominationChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementTransactionCondition
 * SecuritiesSettlement.mmSettlementTransactionCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmBeneficialOwnershipIndicator
 * SecuritiesSettlement.mmBeneficialOwnershipIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmMarketClientSide
 * SecuritiesSettlement.mmMarketClientSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmTracking
 * SecuritiesSettlement.mmTracking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmLetterOfGuarantee
 * SecuritiesSettlement.mmLetterOfGuarantee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmEligibleForCollateral
 * SecuritiesSettlement.mmEligibleForCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmAccruedInterestIndicator
 * SecuritiesSettlement.mmAccruedInterestIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPreConfirmation
 * SecuritiesSettlement.mmPreConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecuritiesRealTimeGrossSettlement
 * SecuritiesSettlement.mmSecuritiesRealTimeGrossSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmBlockTrade
 * SecuritiesSettlement.mmBlockTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementSystemMethod
 * SecuritiesSettlement.mmSettlementSystemMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmAutomaticBorrowing
 * SecuritiesSettlement.mmAutomaticBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPartialSettlementIndicator
 * SecuritiesSettlement.mmPartialSettlementIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmHoldIndicator
 * SecuritiesSettlement.mmHoldIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmRequestedSafekeepingPlace
 * SecuritiesSettlement.mmRequestedSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPairOff
 * SecuritiesSettlement.mmPairOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmAccruedInterest
 * SecuritiesSettlement.mmAccruedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecuritiesClearing
 * SecuritiesSettlement.mmSecuritiesClearing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPayment
 * SecuritiesSettlement.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettledAllocation
 * SecuritiesSettlement.mmSettledAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmRelatedForeignExchangeOperation
 * SecuritiesSettlement.mmRelatedForeignExchangeOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecurity
 * SecuritiesSettlement.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPosition
 * SecuritiesSettlement.mmPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmRollover
 * SecuritiesSettlement.mmRollover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmTurnedQuantity
 * SecuritiesSettlement.mmTurnedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementReason
 * SecuritiesSettlement.mmSettlementReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementType
 * SecuritiesSettlement.mmSettlementType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesSettlement
 * Security.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmRelatedSecuritiesSettlement
 * Payment.mmRelatedSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesSettlement
 * SecuritiesQuantity.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedTurnaroundSettlement
 * SecuritiesQuantity.mmRelatedTurnaroundSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmRelatedSettlement
 * SecuritiesTransfer.mmRelatedSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmSecuritiesSettlement
 * SecuritiesSettlementPartyRole.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmSecuritiesSettlement
 * Interest.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmSecuritiesSettlement
 * SafekeepingPlace.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmCurrencyExchangeForSecuritiesSettlement
 * ForeignExchangeTrade.mmCurrencyExchangeForSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#mmSettlementExecutionParameters
 * Allocation.mmSettlementExecutionParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PairOff#mmRelatedSecuritiesSettlement
 * PairOff.mmRelatedSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Rollover#mmSecuritiesSettlement
 * Rollover.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesClearing#mmSecuritiesSettlement
 * SecuritiesClearing.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Position#mmSecuritiesSettlement
 * Position.mmSecuritiesSettlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails15#mmUnilateralSplit
 * RequestDetails15.mmUnilateralSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Cancellation12Choice#mmTransferOutDetails
 * Cancellation12Choice.mmTransferOutDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Cancellation10Choice#mmTransferInDetails
 * Cancellation10Choice.mmTransferInDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmSettlementParameters
 * SecuritiesFinancingTransactionDetails35.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails27.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails27.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails27.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails28.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails28.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails28.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails26.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails26.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails26.mmSettlementParameters}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.CurrencyToBuyOrSell1Choice
 * CurrencyToBuyOrSell1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection6
 * AmountAndDirection6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection5
 * AmountAndDirection5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection3
 * AmountAndDirection3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection29
 * AmountAndDirection29}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition11Choice
 * SettlementTransactionCondition11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BeneficialOwnership3Choice
 * BeneficialOwnership3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BlockTrade3Choice
 * BlockTrade3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AutomaticBorrowing5Choice
 * AutomaticBorrowing5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails43
 * SettlementDetails43}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection28
 * AmountAndDirection28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection20
 * AmountAndDirection20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection31
 * AmountAndDirection31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection27
 * AmountAndDirection27}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ObligationType1Choice
 * ObligationType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementObligation5
 * SettlementObligation5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection21
 * AmountAndDirection21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Settlement1 Settlement1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementObligation7
 * SettlementObligation7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementObligation8
 * SettlementObligation8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityAndAccount39
 * QuantityAndAccount39}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityAndAccount41
 * QuantityAndAccount41}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityAndAccount40
 * QuantityAndAccount40}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityAndAccount42
 * QuantityAndAccount42}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityAndAccount38
 * QuantityAndAccount38}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityAndAccount43
 * QuantityAndAccount43}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification18
 * SettlementTypeAndIdentification18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection46
 * AmountAndDirection46}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification19
 * SettlementTypeAndIdentification19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails15
 * RequestDetails15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails96
 * SettlementDetails96}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails97
 * SettlementDetails97}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection49
 * AmountAndDirection49}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters12
 * SettlementTypeAndAdditionalParameters12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection48
 * AmountAndDirection48}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection44
 * AmountAndDirection44}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition16Choice
 * SettlementTransactionCondition16Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters14
 * SettlementTypeAndAdditionalParameters14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection45
 * AmountAndDirection45}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection51
 * AmountAndDirection51}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails100
 * SettlementDetails100}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition19Choice
 * SettlementTransactionCondition19Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection52
 * AmountAndDirection52}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BlockTrade4Choice
 * BlockTrade4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BeneficialOwnership4Choice
 * BeneficialOwnership4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition18Choice
 * SettlementTransactionCondition18Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AutomaticBorrowing6Choice
 * AutomaticBorrowing6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityAndAccount45
 * QuantityAndAccount45}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType18Choice
 * SecuritiesTransactionType18Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection47
 * AmountAndDirection47}</li>
 * <li>{@linkplain com.tools20022.repository.msg.HoldIndicator6 HoldIndicator6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters13
 * SettlementTypeAndAdditionalParameters13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PairedOrTurnedQuantity3Choice
 * PairedOrTurnedQuantity3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AutomaticBorrowing7Choice
 * AutomaticBorrowing7Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition17Choice
 * SettlementTransactionCondition17Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails98
 * SettlementDetails98}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityAndAccount44
 * QuantityAndAccount44}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification20
 * SettlementTypeAndIdentification20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceiveInformation17
 * ReceiveInformation17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceiveInformation16
 * ReceiveInformation16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliverInformation16
 * DeliverInformation16}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Cancellation11Choice
 * Cancellation11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Cancellation12Choice
 * Cancellation12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Cancellation10Choice
 * Cancellation10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliverInformation17
 * DeliverInformation17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition20Choice
 * SettlementTransactionCondition20Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails102
 * SettlementDetails102}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundSettlementParameters11
 * FundSettlementParameters11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundSettlementParameters12
 * FundSettlementParameters12}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition30Choice
 * SettlementTransactionCondition30Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition8Choice
 * TradeTransactionCondition8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails128
 * SettlementDetails128}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails120
 * SettlementDetails120}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails119
 * SettlementDetails119}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters19
 * SettlementTypeAndAdditionalParameters19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails125
 * SettlementDetails125}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters15
 * TransactionTypeAndAdditionalParameters15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters17
 * TransactionTypeAndAdditionalParameters17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16
 * TransactionTypeAndAdditionalParameters16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalInformation13
 * AdditionalInformation13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType33Choice
 * SecuritiesTransactionType33Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails126
 * SettlementDetails126}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27
 * SecuritiesSettlementTransactionDetails27}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28
 * SecuritiesSettlementTransactionDetails28}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26
 * SecuritiesSettlementTransactionDetails26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails122
 * SettlementDetails122}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails127
 * SettlementDetails127}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType32Choice
 * SecuritiesTransactionType32Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails121
 * SettlementDetails121}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails118
 * SettlementDetails118}</li>
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
 * "SecuritiesSettlement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Settlement of the securities in a securities transaction, that is, the instruction to deliver or receive securities, involving the payment of an amount of money or not."
 * </li>
 * </ul>
 */
public class SecuritiesSettlement extends Settlement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesTransfer transferOperation;
	/**
	 * Set of processes resulting in a securities transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmRelatedSettlement
	 * SecuritiesTransfer.mmRelatedSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation11Choice#mmCancellationByTransferInstructionDetails
	 * Cancellation11Choice.mmCancellationByTransferInstructionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Set of processes resulting in a securities transfer."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTransferOperation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Cancellation11Choice.mmCancellationByTransferInstructionDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferOperation";
			definition = "Set of processes resulting in a securities transfer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmRelatedSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
		}
	};
	protected ISODateTime settlementDate;
	/**
	 * Date and time at which a transaction is completed and cleared. <br>
	 * It can be an effective settlement date, that is, payment is effected and
	 * securities are delivered or an intended settlement date that is, the date
	 * and time at which the amount of money is intended to be moved.
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
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation5#mmSettlementDate
	 * SettlementObligation5.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmSettlementDate
	 * InvestmentFundTransaction4.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation7#mmIntendedSettlementDate
	 * SettlementObligation7.mmIntendedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition3#mmSettlementDate
	 * NetPosition3.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmIntendedSettlementDate
	 * SettlementObligation8.mmIntendedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails33#mmSettlementDate
	 * IntraPositionDetails33.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#mmEffectiveSettlementDate
	 * SecuritiesTradeDetails53.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#mmEffectiveSettlementDate
	 * SecuritiesTradeDetails55.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification20#mmSettlementDate
	 * SettlementTypeAndIdentification20.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#mmEffectiveSettlementDate
	 * ReceiveInformation17.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#mmEffectiveSettlementDate
	 * Transfer31.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#mmEffectiveSettlementDate
	 * DeliverInformation17.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#mmEffectiveSettlementDate
	 * Transfer33.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmSettlementDate
	 * IntraPositionDetails41.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails39#mmSettlementDate
	 * IntraPositionDetails39.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation13#mmEffectiveDate
	 * AdditionalInformation13.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmEffectiveSettlementDate
	 * TransactionDetails95.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmSettlementDate
	 * SecuredMarketTransaction4.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmSettlementDate
	 * UnsecuredMarketTransaction4.mmSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which a transaction is completed and cleared. \r\nIt can be an effective settlement date, that is, payment is effected and securities are delivered or an intended settlement date that is, the date and time at which the amount of money is intended to be moved."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSettlementDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementObligation5.mmSettlementDate, InvestmentFundTransaction4.mmSettlementDate, SettlementObligation7.mmIntendedSettlementDate, NetPosition3.mmSettlementDate,
					SettlementObligation8.mmIntendedSettlementDate, IntraPositionDetails33.mmSettlementDate, SecuritiesTradeDetails53.mmEffectiveSettlementDate, SecuritiesTradeDetails55.mmEffectiveSettlementDate,
					SettlementTypeAndIdentification20.mmSettlementDate, ReceiveInformation17.mmEffectiveSettlementDate, Transfer31.mmEffectiveSettlementDate, DeliverInformation17.mmEffectiveSettlementDate,
					Transfer33.mmEffectiveSettlementDate, IntraPositionDetails41.mmSettlementDate, IntraPositionDetails39.mmSettlementDate, AdditionalInformation13.mmEffectiveDate, TransactionDetails95.mmEffectiveSettlementDate,
					SecuredMarketTransaction4.mmSettlementDate, UnsecuredMarketTransaction4.mmSettlementDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementDate";
			definition = "Date and time at which a transaction is completed and cleared. \r\nIt can be an effective settlement date, that is, payment is effected and securities are delivered or an intended settlement date that is, the date and time at which the amount of money is intended to be moved.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getSettlementDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesSettlementPartyRole> partyRole;
	/**
	 * Specifies each role linked to the settlement of securities and played by
	 * a party at that step in a securities transaction flow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmSecuritiesSettlement
	 * SecuritiesSettlementPartyRole.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
	 * SecuritiesSettlementPartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmSettlementParties
	 * SettlementObligation8.mmSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails81#mmDeliveringSettlementParties
	 * TransactionDetails81.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails81#mmReceivingSettlementParties
	 * TransactionDetails81.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails74#mmDeliveringSettlementParties
	 * TransactionDetails74.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails74#mmReceivingSettlementParties
	 * TransactionDetails74.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails82#mmDeliveringSettlementParties
	 * TransactionDetails82.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails82#mmReceivingSettlementParties
	 * TransactionDetails82.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmDeliveringSettlementParties
	 * SecuritiesTradeDetails48.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmReceivingSettlementParties
	 * SecuritiesTradeDetails48.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails80#mmDeliveringSettlementParties
	 * TransactionDetails80.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails80#mmReceivingSettlementParties
	 * TransactionDetails80.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#mmSettlementPartiesDetails
	 * ReceiveInformation17.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#mmSettlementPartiesDetails
	 * ReceiveInformation16.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount56#mmSettlementPartiesDetails
	 * InvestmentAccount56.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmSettlementPartiesDetails
	 * DeliverInformation16.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#mmSettlementPartiesDetails
	 * DeliverInformation17.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument48#mmSettlementPartiesReceivingSideDetails
	 * FinancialInstrument48.mmSettlementPartiesReceivingSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#mmSettlementPartiesReceivingSideDetails
	 * FinancialInstrument46.mmSettlementPartiesReceivingSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails102#mmSettlementParties
	 * SettlementDetails102.mmSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11#mmReceivingSideDetails
	 * FundSettlementParameters11.mmReceivingSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11#mmDeliveringSideDetails
	 * FundSettlementParameters11.mmDeliveringSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters12#mmReceivingSideDetails
	 * FundSettlementParameters12.mmReceivingSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters12#mmDeliveringSideDetails
	 * FundSettlementParameters12.mmDeliveringSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmDeliveringSettlementParties
	 * SecuritiesTradeDetails68.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmReceivingSettlementParties
	 * SecuritiesTradeDetails68.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmReceivingSettlementParties
	 * TransactionDetails97.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmDeliveringSettlementParties
	 * TransactionDetails97.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#mmDeliveringSettlementParties
	 * TransactionDetails96.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#mmReceivingSettlementParties
	 * TransactionDetails96.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmDeliveringSettlementParties
	 * TransactionDetails95.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmReceivingSettlementParties
	 * TransactionDetails95.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails118#mmSettlementParties
	 * SettlementDetails118.mmSettlementParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to the settlement of securities and played by a party at that step in a securities transaction flow."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementObligation8.mmSettlementParties, TransactionDetails81.mmDeliveringSettlementParties, TransactionDetails81.mmReceivingSettlementParties,
					TransactionDetails74.mmDeliveringSettlementParties, TransactionDetails74.mmReceivingSettlementParties, TransactionDetails82.mmDeliveringSettlementParties, TransactionDetails82.mmReceivingSettlementParties,
					SecuritiesTradeDetails48.mmDeliveringSettlementParties, SecuritiesTradeDetails48.mmReceivingSettlementParties, TransactionDetails80.mmDeliveringSettlementParties, TransactionDetails80.mmReceivingSettlementParties,
					ReceiveInformation17.mmSettlementPartiesDetails, ReceiveInformation16.mmSettlementPartiesDetails, InvestmentAccount56.mmSettlementPartiesDetails, DeliverInformation16.mmSettlementPartiesDetails,
					DeliverInformation17.mmSettlementPartiesDetails, FinancialInstrument48.mmSettlementPartiesReceivingSideDetails, FinancialInstrument46.mmSettlementPartiesReceivingSideDetails, SettlementDetails102.mmSettlementParties,
					FundSettlementParameters11.mmReceivingSideDetails, FundSettlementParameters11.mmDeliveringSideDetails, FundSettlementParameters12.mmReceivingSideDetails, FundSettlementParameters12.mmDeliveringSideDetails,
					SecuritiesTradeDetails68.mmDeliveringSettlementParties, SecuritiesTradeDetails68.mmReceivingSettlementParties, TransactionDetails97.mmReceivingSettlementParties, TransactionDetails97.mmDeliveringSettlementParties,
					TransactionDetails96.mmDeliveringSettlementParties, TransactionDetails96.mmReceivingSettlementParties, TransactionDetails95.mmDeliveringSettlementParties, TransactionDetails95.mmReceivingSettlementParties,
					SettlementDetails118.mmSettlementParties);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to the settlement of securities and played by a party at that step in a securities transaction flow.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount settlementAmount;
	/**
	 * Amount of money settled or to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection6#mmAmount
	 * AmountAndDirection6.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection5#mmAmount
	 * AmountAndDirection5.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection3#mmAmount
	 * AmountAndDirection3.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29#mmAmount
	 * AmountAndDirection29.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection28#mmAmount
	 * AmountAndDirection28.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection20#mmAmount
	 * AmountAndDirection20.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection31#mmAmount
	 * AmountAndDirection31.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection27#mmAmount
	 * AmountAndDirection27.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation5#mmSettlementAmount
	 * SettlementObligation5.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection21#mmAmount
	 * AmountAndDirection21.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmSettlementAmount
	 * InvestmentFundTransaction4.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation7#mmSettlementAmount
	 * SettlementObligation7.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation7#mmRemainingAmountToBeSettled
	 * SettlementObligation7.mmRemainingAmountToBeSettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmSettlementAmount
	 * SettlementObligation8.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#mmPreviouslySettledAmount
	 * QuantityAndAccount41.mmPreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#mmRemainingToBeSettledAmount
	 * QuantityAndAccount41.mmRemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount40#mmPreviouslySettledAmount
	 * QuantityAndAccount40.mmPreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount40#mmRemainingToBeSettledAmount
	 * QuantityAndAccount40.mmRemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails81#mmSettlementAmount
	 * TransactionDetails81.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails74#mmSettlementAmount
	 * TransactionDetails74.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails82#mmSettlementAmount
	 * TransactionDetails82.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails80#mmSettlementAmount
	 * TransactionDetails80.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection46#mmAmount
	 * AmountAndDirection46.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection49#mmAmount
	 * AmountAndDirection49.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection48#mmAmount
	 * AmountAndDirection48.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection44#mmAmount
	 * AmountAndDirection44.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection45#mmAmount
	 * AmountAndDirection45.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection51#mmAmount
	 * AmountAndDirection51.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection52#mmAmount
	 * AmountAndDirection52.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection47#mmAmount
	 * AmountAndDirection47.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#mmSettlementAmount
	 * ReceiveInformation17.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#mmSettlementAmount
	 * ReceiveInformation16.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmSettlementAmount
	 * DeliverInformation16.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#mmSettlementAmount
	 * DeliverInformation17.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmSettlementAmount
	 * SwitchExecution7.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmSettlementAmount
	 * SwitchOrder7.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmSettlementAmount
	 * RedemptionOrder14.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmSettlementAmount
	 * SubscriptionExecution13.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmSettlementAmount
	 * SubscriptionExecution12.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmSettlementAmount
	 * SubscriptionOrder15.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmSettlementAmount
	 * RedemptionOrder15.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmSettlementAmount
	 * SubscriptionOrder14.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmRemainingToBeSettledQuantity
	 * IntraPositionDetails41.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmSettlementAmount
	 * TransactionDetails97.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails27.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails28.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails26.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#mmPostingAmount
	 * TransactionDetails96.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmPostingAmount
	 * TransactionDetails95.mmPostingAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money settled or to be settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSettlementAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AmountAndDirection6.mmAmount, AmountAndDirection5.mmAmount, AmountAndDirection3.mmAmount, AmountAndDirection29.mmAmount, AmountAndDirection28.mmAmount, AmountAndDirection20.mmAmount,
					AmountAndDirection31.mmAmount, AmountAndDirection27.mmAmount, SettlementObligation5.mmSettlementAmount, AmountAndDirection21.mmAmount, InvestmentFundTransaction4.mmSettlementAmount,
					SettlementObligation7.mmSettlementAmount, SettlementObligation7.mmRemainingAmountToBeSettled, SettlementObligation8.mmSettlementAmount, QuantityAndAccount41.mmPreviouslySettledAmount,
					QuantityAndAccount41.mmRemainingToBeSettledAmount, QuantityAndAccount40.mmPreviouslySettledAmount, QuantityAndAccount40.mmRemainingToBeSettledAmount, TransactionDetails81.mmSettlementAmount,
					TransactionDetails74.mmSettlementAmount, TransactionDetails82.mmSettlementAmount, TransactionDetails80.mmSettlementAmount, AmountAndDirection46.mmAmount, AmountAndDirection49.mmAmount, AmountAndDirection48.mmAmount,
					AmountAndDirection44.mmAmount, AmountAndDirection45.mmAmount, AmountAndDirection51.mmAmount, AmountAndDirection52.mmAmount, AmountAndDirection47.mmAmount, ReceiveInformation17.mmSettlementAmount,
					ReceiveInformation16.mmSettlementAmount, DeliverInformation16.mmSettlementAmount, DeliverInformation17.mmSettlementAmount, SwitchExecution7.mmSettlementAmount, SwitchOrder7.mmSettlementAmount,
					RedemptionOrder14.mmSettlementAmount, SubscriptionExecution13.mmSettlementAmount, SubscriptionExecution12.mmSettlementAmount, SubscriptionOrder15.mmSettlementAmount, RedemptionOrder15.mmSettlementAmount,
					SubscriptionOrder14.mmSettlementAmount, IntraPositionDetails41.mmRemainingToBeSettledQuantity, TransactionDetails97.mmSettlementAmount, SecuritiesSettlementTransactionDetails27.mmSettlementAmount,
					SecuritiesSettlementTransactionDetails28.mmSettlementAmount, SecuritiesSettlementTransactionDetails26.mmSettlementAmount, TransactionDetails96.mmPostingAmount, TransactionDetails95.mmPostingAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementAmount";
			definition = "Amount of money settled or to be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getSettlementAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text holdingsPlanType;
	/**
	 * Identifies whether or not saving plan or withdrawal or switch plan are
	 * included in the holdings.
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
	 * {@linkplain com.tools20022.repository.msg.Transfer31#mmHoldingsPlanType
	 * Transfer31.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmHoldingsPlanType
	 * Transfer30.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer32#mmHoldingsPlanType
	 * Transfer32.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#mmHoldingsPlanType
	 * Transfer33.mmHoldingsPlanType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingsPlanType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether or not saving plan or withdrawal or switch plan are included in the holdings."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmHoldingsPlanType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Transfer31.mmHoldingsPlanType, Transfer30.mmHoldingsPlanType, Transfer32.mmHoldingsPlanType, Transfer33.mmHoldingsPlanType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HoldingsPlanType";
			definition = "Identifies whether or not saving plan or withdrawal or switch plan are included in the holdings.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getHoldingsPlanType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ReceiveDeliveryCode securitiesMovementType;
	/**
	 * Specifies if the movement on a securities account results from a deliver
	 * or a receive instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReceiveDeliveryCode
	 * ReceiveDeliveryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation5#mmSecuritiesMovementType
	 * SettlementObligation5.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition3#mmSecuritiesMovementType
	 * NetPosition3.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmSecuritiesMovementType
	 * SettlementObligation8.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails81#mmSecuritiesMovementType
	 * TransactionDetails81.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails82#mmSecuritiesMovementType
	 * TransactionDetails82.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmSecuritiesMovementType
	 * SecuritiesTradeDetails48.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification18#mmSecuritiesMovementType
	 * SettlementTypeAndIdentification18.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification19#mmSecuritiesMovementType
	 * SettlementTypeAndIdentification19.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters12#mmSecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters12.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters14#mmSecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters14.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters19#mmSecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters19.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmSecuritiesMovementType
	 * SecuritiesTradeDetails68.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmSecuritiesMovementType
	 * TransactionDetails97.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16#mmSecuritiesMovementType
	 * TransactionTypeAndAdditionalParameters16.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmSecuritiesMovementType
	 * SecuritiesFinancingTransactionDetails35.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#mmSecuritiesMovementType
	 * TransactionDetails96.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmSecuritiesMovementType
	 * TransactionDetails95.mmSecuritiesMovementType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMovementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the movement on a securities account results from a deliver or a receive instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSecuritiesMovementType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementObligation5.mmSecuritiesMovementType, NetPosition3.mmSecuritiesMovementType, SettlementObligation8.mmSecuritiesMovementType, TransactionDetails81.mmSecuritiesMovementType,
					TransactionDetails82.mmSecuritiesMovementType, SecuritiesTradeDetails48.mmSecuritiesMovementType, SettlementTypeAndIdentification18.mmSecuritiesMovementType, SettlementTypeAndIdentification19.mmSecuritiesMovementType,
					SettlementTypeAndAdditionalParameters12.mmSecuritiesMovementType, SettlementTypeAndAdditionalParameters14.mmSecuritiesMovementType, SettlementTypeAndAdditionalParameters19.mmSecuritiesMovementType,
					SecuritiesTradeDetails68.mmSecuritiesMovementType, TransactionDetails97.mmSecuritiesMovementType, TransactionTypeAndAdditionalParameters16.mmSecuritiesMovementType,
					SecuritiesFinancingTransactionDetails35.mmSecuritiesMovementType, TransactionDetails96.mmSecuritiesMovementType, TransactionDetails95.mmSecuritiesMovementType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesMovementType";
			definition = "Specifies if the movement on a securities account results from a deliver or a receive instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReceiveDeliveryCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getSecuritiesMovementType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesQuantity settlementQuantity;
	/**
	 * Total quantity of securities to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesSettlement
	 * SecuritiesQuantity.mmSecuritiesSettlement}</li>
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
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount39#mmSettlementQuantity
	 * QuantityAndAccount39.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#mmSettledQuantity
	 * QuantityAndAccount41.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#mmPreviouslySettledQuantity
	 * QuantityAndAccount41.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#mmRemainingToBeSettledQuantity
	 * QuantityAndAccount41.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount40#mmSettledQuantity
	 * QuantityAndAccount40.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount40#mmPreviouslySettledQuantity
	 * QuantityAndAccount40.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount40#mmRemainingToBeSettledQuantity
	 * QuantityAndAccount40.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails81#mmSettlementQuantity
	 * TransactionDetails81.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount42#mmSettlementQuantity
	 * QuantityAndAccount42.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails74#mmSettlementQuantity
	 * TransactionDetails74.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails82#mmSettlementQuantity
	 * TransactionDetails82.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount38#mmSettlementQuantity
	 * QuantityAndAccount38.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails80#mmSettlementQuantity
	 * TransactionDetails80.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount43#mmSettlementQuantity
	 * QuantityAndAccount43.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity11#mmSettlementQuantity
	 * Quantity11.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount45#mmSettlementQuantity
	 * QuantityAndAccount45.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmSettlementQuantity
	 * TransactionDetails97.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmSettlementQuantity
	 * SecuritiesFinancingTransactionDetails35.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#mmPostingQuantity
	 * TransactionDetails96.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails13#mmRemainingToBeSettledQuantity
	 * IntraPositionMovementDetails13.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmPostingQuantity
	 * TransactionDetails95.mmPostingQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity of securities to be settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSettlementQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(QuantityAndAccount39.mmSettlementQuantity, QuantityAndAccount41.mmSettledQuantity, QuantityAndAccount41.mmPreviouslySettledQuantity, QuantityAndAccount41.mmRemainingToBeSettledQuantity,
					QuantityAndAccount40.mmSettledQuantity, QuantityAndAccount40.mmPreviouslySettledQuantity, QuantityAndAccount40.mmRemainingToBeSettledQuantity, TransactionDetails81.mmSettlementQuantity,
					QuantityAndAccount42.mmSettlementQuantity, TransactionDetails74.mmSettlementQuantity, TransactionDetails82.mmSettlementQuantity, QuantityAndAccount38.mmSettlementQuantity, TransactionDetails80.mmSettlementQuantity,
					QuantityAndAccount43.mmSettlementQuantity, Quantity11.mmSettlementQuantity, QuantityAndAccount45.mmSettlementQuantity, TransactionDetails97.mmSettlementQuantity,
					SecuritiesFinancingTransactionDetails35.mmSettlementQuantity, TransactionDetails96.mmPostingQuantity, IntraPositionMovementDetails13.mmRemainingToBeSettledQuantity, TransactionDetails95.mmPostingQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementQuantity";
			definition = "Total quantity of securities to be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesTradeExecution securitiesTradeExecution;
	/**
	 * Specifies the trade which originates the settlement process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTradeExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the trade which originates the settlement process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesTradeExecution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeExecution";
			definition = "Specifies the trade which originates the settlement process.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
		}
	};
	protected CurrencyCode currencyToBuy;
	/**
	 * Account servicer is instructed to buy the indicated currency after the
	 * receipt of cash proceeds.
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
	 * {@linkplain com.tools20022.repository.choice.CurrencyToBuyOrSell1Choice#mmCurrencyToBuy
	 * CurrencyToBuyOrSell1Choice.mmCurrencyToBuy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#mmCurrencyToBuy
	 * CorporateActionOption131.mmCurrencyToBuy}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account servicer is instructed to buy the indicated currency after the receipt of cash proceeds."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCurrencyToBuy = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CurrencyToBuyOrSell1Choice.mmCurrencyToBuy, CorporateActionOption131.mmCurrencyToBuy);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyToBuy";
			definition = "Account servicer is instructed to buy the indicated currency after the receipt of cash proceeds.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getCurrencyToBuy", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode currencyToSell;
	/**
	 * Account servicer is instructed to sell a currency in order to obtain the
	 * currency needed to fund the transaction.
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
	 * {@linkplain com.tools20022.repository.choice.CurrencyToBuyOrSell1Choice#mmCurrencyToSell
	 * CurrencyToBuyOrSell1Choice.mmCurrencyToSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#mmCurrencyToSell
	 * CorporateActionOption131.mmCurrencyToSell}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToSell"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account servicer is instructed to sell a currency in order to obtain the currency needed to fund the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCurrencyToSell = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CurrencyToBuyOrSell1Choice.mmCurrencyToSell, CorporateActionOption131.mmCurrencyToSell);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyToSell";
			definition = "Account servicer is instructed to sell a currency in order to obtain the currency needed to fund the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getCurrencyToSell", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text denominationChoice;
	/**
	 * Denomination (stated value found on financial instruments) of the
	 * security to be received or delivered.
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
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount39#mmDenominationChoice
	 * QuantityAndAccount39.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#mmDenominationChoice
	 * QuantityAndAccount41.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount42#mmDenominationChoice
	 * QuantityAndAccount42.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount43#mmDenominationChoice
	 * QuantityAndAccount43.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity11#mmDenominationChoice
	 * Quantity11.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount45#mmDenominationChoice
	 * QuantityAndAccount45.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount44#mmDenominationChoice
	 * QuantityAndAccount44.mmDenominationChoice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationChoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Denomination (stated value found on financial instruments) of the security to be received or delivered."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDenominationChoice = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(QuantityAndAccount39.mmDenominationChoice, QuantityAndAccount41.mmDenominationChoice, QuantityAndAccount42.mmDenominationChoice, QuantityAndAccount43.mmDenominationChoice,
					Quantity11.mmDenominationChoice, QuantityAndAccount45.mmDenominationChoice, QuantityAndAccount44.mmDenominationChoice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DenominationChoice";
			definition = "Denomination (stated value found on financial instruments) of the security to be received or delivered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getDenominationChoice", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SettlementTransactionConditionCode settlementTransactionCondition;
	/**
	 * Conditions under which the order/trade is to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
	 * SettlementTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition11Choice#mmCode
	 * SettlementTransactionCondition11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition11Choice#mmProprietary
	 * SettlementTransactionCondition11Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmSettlementTransactionCondition
	 * SettlementDetails43.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails15#mmPartialSettlementIndicator
	 * RequestDetails15.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#mmSettlementTransactionCondition
	 * SettlementDetails96.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#mmPartialSettlementIndicator
	 * SettlementDetails96.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmSettlementTransactionCondition
	 * SettlementDetails97.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmPartialSettlementIndicator
	 * SettlementDetails97.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition16Choice#mmCode
	 * SettlementTransactionCondition16Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition16Choice#mmProprietary
	 * SettlementTransactionCondition16Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails100#mmSettlementTransactionCondition
	 * SettlementDetails100.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition19Choice#mmCode
	 * SettlementTransactionCondition19Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition19Choice#mmProprietary
	 * SettlementTransactionCondition19Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition18Choice#mmCode
	 * SettlementTransactionCondition18Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition18Choice#mmProprietary
	 * SettlementTransactionCondition18Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition17Choice#mmCode
	 * SettlementTransactionCondition17Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition17Choice#mmProprietary
	 * SettlementTransactionCondition17Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#mmSettlementTransactionCondition
	 * SettlementDetails98.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#mmPartialSettlementIndicator
	 * SettlementDetails98.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition20Choice#mmCode
	 * SettlementTransactionCondition20Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition20Choice#mmProprietary
	 * SettlementTransactionCondition20Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11#mmSettlementTransactionCondition
	 * FundSettlementParameters11.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters12#mmSettlementTransactionCondition
	 * FundSettlementParameters12.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition30Choice#mmCode
	 * SettlementTransactionCondition30Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition30Choice#mmProprietary
	 * SettlementTransactionCondition30Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition8Choice#mmCode
	 * TradeTransactionCondition8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition8Choice#mmProprietary
	 * TradeTransactionCondition8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmSettlementTransactionCondition
	 * SettlementDetails128.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmPartialSettlementIndicator
	 * SettlementDetails128.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmSettlementTransactionCondition
	 * SettlementDetails120.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmPartialSettlementIndicator
	 * SettlementDetails120.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmSettlementTransactionCondition
	 * SettlementDetails119.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmPartialSettlementIndicator
	 * SettlementDetails119.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125#mmSettlementTransactionCondition
	 * SettlementDetails125.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125#mmPartialSettlementIndicator
	 * SettlementDetails125.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmSettlementTransactionCondition
	 * SettlementDetails126.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmPartialSettlementIndicator
	 * SettlementDetails126.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmSettlementTransactionCondition
	 * SettlementDetails122.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#mmSettlementTransactionCondition
	 * SettlementDetails127.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#mmPartialSettlementIndicator
	 * SettlementDetails127.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmSettlementTransactionCondition
	 * SettlementDetails121.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmPartialSettlementIndicator
	 * SettlementDetails121.mmPartialSettlementIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransactionCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Conditions under which the order/trade is to be settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSettlementTransactionCondition = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementTransactionCondition11Choice.mmCode, SettlementTransactionCondition11Choice.mmProprietary, SettlementDetails43.mmSettlementTransactionCondition,
					RequestDetails15.mmPartialSettlementIndicator, SettlementDetails96.mmSettlementTransactionCondition, SettlementDetails96.mmPartialSettlementIndicator, SettlementDetails97.mmSettlementTransactionCondition,
					SettlementDetails97.mmPartialSettlementIndicator, SettlementTransactionCondition16Choice.mmCode, SettlementTransactionCondition16Choice.mmProprietary, SettlementDetails100.mmSettlementTransactionCondition,
					SettlementTransactionCondition19Choice.mmCode, SettlementTransactionCondition19Choice.mmProprietary, SettlementTransactionCondition18Choice.mmCode, SettlementTransactionCondition18Choice.mmProprietary,
					SettlementTransactionCondition17Choice.mmCode, SettlementTransactionCondition17Choice.mmProprietary, SettlementDetails98.mmSettlementTransactionCondition, SettlementDetails98.mmPartialSettlementIndicator,
					SettlementTransactionCondition20Choice.mmCode, SettlementTransactionCondition20Choice.mmProprietary, FundSettlementParameters11.mmSettlementTransactionCondition,
					FundSettlementParameters12.mmSettlementTransactionCondition, SettlementTransactionCondition30Choice.mmCode, SettlementTransactionCondition30Choice.mmProprietary, TradeTransactionCondition8Choice.mmCode,
					TradeTransactionCondition8Choice.mmProprietary, SettlementDetails128.mmSettlementTransactionCondition, SettlementDetails128.mmPartialSettlementIndicator, SettlementDetails120.mmSettlementTransactionCondition,
					SettlementDetails120.mmPartialSettlementIndicator, SettlementDetails119.mmSettlementTransactionCondition, SettlementDetails119.mmPartialSettlementIndicator, SettlementDetails125.mmSettlementTransactionCondition,
					SettlementDetails125.mmPartialSettlementIndicator, SettlementDetails126.mmSettlementTransactionCondition, SettlementDetails126.mmPartialSettlementIndicator, SettlementDetails122.mmSettlementTransactionCondition,
					SettlementDetails127.mmSettlementTransactionCondition, SettlementDetails127.mmPartialSettlementIndicator, SettlementDetails121.mmSettlementTransactionCondition, SettlementDetails121.mmPartialSettlementIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementTransactionCondition";
			definition = "Conditions under which the order/trade is to be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementTransactionConditionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getSettlementTransactionCondition", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator beneficialOwnershipIndicator;
	/**
	 * Specifies whether there is change of beneficial ownership.
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
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnership3Choice#mmIndicator
	 * BeneficialOwnership3Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnership3Choice#mmProprietary
	 * BeneficialOwnership3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmBeneficialOwnership
	 * SettlementDetails43.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#mmBeneficialOwnership
	 * SettlementDetails96.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmBeneficialOwnership
	 * SettlementDetails97.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnership4Choice#mmIndicator
	 * BeneficialOwnership4Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnership4Choice#mmProprietary
	 * BeneficialOwnership4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#mmBeneficialOwnership
	 * SettlementDetails98.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmBeneficialOwnership
	 * SettlementDetails128.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmBeneficialOwnership
	 * SettlementDetails120.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmBeneficialOwnership
	 * SettlementDetails119.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125#mmBeneficialOwnership
	 * SettlementDetails125.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmBeneficialOwnership
	 * SettlementDetails126.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmBeneficialOwnership
	 * SettlementDetails122.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#mmBeneficialOwnership
	 * SettlementDetails127.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmBeneficialOwnership
	 * SettlementDetails121.mmBeneficialOwnership}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnershipIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether there is change of beneficial ownership."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBeneficialOwnershipIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(BeneficialOwnership3Choice.mmIndicator, BeneficialOwnership3Choice.mmProprietary, SettlementDetails43.mmBeneficialOwnership, SettlementDetails96.mmBeneficialOwnership,
					SettlementDetails97.mmBeneficialOwnership, BeneficialOwnership4Choice.mmIndicator, BeneficialOwnership4Choice.mmProprietary, SettlementDetails98.mmBeneficialOwnership, SettlementDetails128.mmBeneficialOwnership,
					SettlementDetails120.mmBeneficialOwnership, SettlementDetails119.mmBeneficialOwnership, SettlementDetails125.mmBeneficialOwnership, SettlementDetails126.mmBeneficialOwnership, SettlementDetails122.mmBeneficialOwnership,
					SettlementDetails127.mmBeneficialOwnership, SettlementDetails121.mmBeneficialOwnership);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BeneficialOwnershipIndicator";
			definition = "Specifies whether there is change of beneficial ownership.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getBeneficialOwnershipIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MarketClientSideCode marketClientSide;
	/**
	 * Specifies if an instruction is for a market side or a client side
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MarketClientSideCode
	 * MarketClientSideCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide3Choice#mmCode
	 * MarketClientSide3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide3Choice#mmProprietary
	 * MarketClientSide3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmMarketClientSide
	 * SettlementDetails43.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#mmMarketClientSide
	 * SettlementDetails96.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmMarketClientSide
	 * SettlementDetails97.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide4Choice#mmCode
	 * MarketClientSide4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide4Choice#mmProprietary
	 * MarketClientSide4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#mmMarketClientSide
	 * SettlementDetails98.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmMarketClientSide
	 * SettlementDetails128.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmMarketClientSide
	 * SettlementDetails120.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmMarketClientSide
	 * SettlementDetails119.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125#mmMarketClientSide
	 * SettlementDetails125.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmMarketClientSide
	 * SettlementDetails126.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmMarketClientSide
	 * SettlementDetails122.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#mmMarketClientSide
	 * SettlementDetails127.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmMarketClientSide
	 * SettlementDetails121.mmMarketClientSide}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClientSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if an instruction is for a market side or a client side transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMarketClientSide = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(MarketClientSide3Choice.mmCode, MarketClientSide3Choice.mmProprietary, SettlementDetails43.mmMarketClientSide, SettlementDetails96.mmMarketClientSide,
					SettlementDetails97.mmMarketClientSide, MarketClientSide4Choice.mmCode, MarketClientSide4Choice.mmProprietary, SettlementDetails98.mmMarketClientSide, SettlementDetails128.mmMarketClientSide,
					SettlementDetails120.mmMarketClientSide, SettlementDetails119.mmMarketClientSide, SettlementDetails125.mmMarketClientSide, SettlementDetails126.mmMarketClientSide, SettlementDetails122.mmMarketClientSide,
					SettlementDetails127.mmMarketClientSide, SettlementDetails121.mmMarketClientSide);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketClientSide";
			definition = "Specifies if an instruction is for a market side or a client side transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MarketClientSideCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getMarketClientSide", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator tracking;
	/**
	 * Specifies whether the loan and/or collateral is tracked.
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmTracking
	 * SettlementDetails43.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmTracking
	 * SettlementDetails97.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmTracking
	 * SettlementDetails120.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmTracking
	 * SettlementDetails119.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmTracking
	 * SettlementDetails122.mmTracking}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tracking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the loan and/or collateral is tracked."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTracking = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementDetails43.mmTracking, SettlementDetails97.mmTracking, SettlementDetails120.mmTracking, SettlementDetails119.mmTracking, SettlementDetails122.mmTracking);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Tracking";
			definition = "Specifies whether the loan and/or collateral is tracked.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getTracking", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator letterOfGuarantee;
	/**
	 * Specifies whether physical settlement may be executed using a letter of
	 * guarantee or if the physical certificates should be used.
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
	 * {@linkplain com.tools20022.repository.choice.LetterOfGuarantee3Choice#mmIndicator
	 * LetterOfGuarantee3Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LetterOfGuarantee3Choice#mmProprietary
	 * LetterOfGuarantee3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmLetterOfGuarantee
	 * SettlementDetails43.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LetterOfGuarantee4Choice#mmIndicator
	 * LetterOfGuarantee4Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LetterOfGuarantee4Choice#mmProprietary
	 * LetterOfGuarantee4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmLetterOfGuarantee
	 * SettlementDetails128.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmLetterOfGuarantee
	 * SettlementDetails120.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmLetterOfGuarantee
	 * SettlementDetails119.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmLetterOfGuarantee
	 * SettlementDetails126.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmLetterOfGuarantee
	 * SettlementDetails122.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#mmLetterOfGuarantee
	 * SettlementDetails127.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmLetterOfGuarantee
	 * SettlementDetails121.mmLetterOfGuarantee}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfGuarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether physical settlement may be executed using a letter of guarantee or if the physical certificates should be used."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLetterOfGuarantee = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(LetterOfGuarantee3Choice.mmIndicator, LetterOfGuarantee3Choice.mmProprietary, SettlementDetails43.mmLetterOfGuarantee, LetterOfGuarantee4Choice.mmIndicator,
					LetterOfGuarantee4Choice.mmProprietary, SettlementDetails128.mmLetterOfGuarantee, SettlementDetails120.mmLetterOfGuarantee, SettlementDetails119.mmLetterOfGuarantee, SettlementDetails126.mmLetterOfGuarantee,
					SettlementDetails122.mmLetterOfGuarantee, SettlementDetails127.mmLetterOfGuarantee, SettlementDetails121.mmLetterOfGuarantee);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LetterOfGuarantee";
			definition = "Specifies whether physical settlement may be executed using a letter of guarantee or if the physical certificates should be used.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getLetterOfGuarantee", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator eligibleForCollateral;
	/**
	 * Specifies whether securities should be included in the pool of securities
	 * eligible for collateral purposes.
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmEligibleForCollateral
	 * SettlementDetails43.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#mmEligibleForCollateral
	 * SettlementDetails96.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmEligibleForCollateral
	 * SettlementDetails97.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#mmEligibleForCollateral
	 * SettlementDetails98.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#mmEligibleForCollateralIndicator
	 * CorporateActionOption131.mmEligibleForCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmEligibleForCollateral
	 * SettlementDetails128.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmEligibleForCollateral
	 * SettlementDetails120.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmEligibleForCollateral
	 * SettlementDetails119.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmEligibleForCollateral
	 * SettlementDetails122.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmEligibleForCollateral
	 * SettlementDetails121.mmEligibleForCollateral}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleForCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether securities should be included in the pool of securities eligible for collateral purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEligibleForCollateral = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementDetails43.mmEligibleForCollateral, SettlementDetails96.mmEligibleForCollateral, SettlementDetails97.mmEligibleForCollateral, SettlementDetails98.mmEligibleForCollateral,
					CorporateActionOption131.mmEligibleForCollateralIndicator, SettlementDetails128.mmEligibleForCollateral, SettlementDetails120.mmEligibleForCollateral, SettlementDetails119.mmEligibleForCollateral,
					SettlementDetails122.mmEligibleForCollateral, SettlementDetails121.mmEligibleForCollateral);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EligibleForCollateral";
			definition = "Specifies whether securities should be included in the pool of securities eligible for collateral purposes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getEligibleForCollateral", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator accruedInterestIndicator;
	/**
	 * Indicates whether the net proceeds include interest accrued on the
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
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection28#mmAccruedInterestIndicator
	 * AmountAndDirection28.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection46#mmAccruedInterestIndicator
	 * AmountAndDirection46.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection45#mmAccruedInterestIndicator
	 * AmountAndDirection45.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmAccruedInterestIndicator
	 * CorporateAction31.mmAccruedInterestIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the net proceeds include interest accrued on the financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAccruedInterestIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AmountAndDirection28.mmAccruedInterestIndicator, AmountAndDirection46.mmAccruedInterestIndicator, AmountAndDirection45.mmAccruedInterestIndicator,
					CorporateAction31.mmAccruedInterestIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccruedInterestIndicator";
			definition = "Indicates whether the net proceeds include interest accrued on the financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getAccruedInterestIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PreConfirmationCode preConfirmation;
	/**
	 * Pre-confirmation of the cash transfer pending the securities transfer, or
	 * vice versa.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PreConfirmationCode
	 * PreConfirmationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters24#mmPreConfirmation
	 * AdditionalParameters24.mmPreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29#mmPreConfirmation
	 * AdditionalParameters29.mmPreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters30#mmPreConfirmation
	 * AdditionalParameters30.mmPreConfirmation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pre-confirmation of the cash transfer pending the securities transfer, or vice versa."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPreConfirmation = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AdditionalParameters24.mmPreConfirmation, AdditionalParameters29.mmPreConfirmation, AdditionalParameters30.mmPreConfirmation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreConfirmation";
			definition = "Pre-confirmation of the cash transfer pending the securities transfer, or vice versa.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PreConfirmationCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getPreConfirmation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator securitiesRealTimeGrossSettlement;
	/**
	 * Specifies whether the settlement transaction is to be settled through an
	 * RTGS or a non RTGS system.
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
	 * {@linkplain com.tools20022.repository.choice.SecuritiesRTGS3Choice#mmIndicator
	 * SecuritiesRTGS3Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesRTGS3Choice#mmProprietary
	 * SecuritiesRTGS3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmSecuritiesRTGS
	 * SettlementDetails43.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails15#mmSecuritiesRTGS
	 * RequestDetails15.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#mmSecuritiesRTGS
	 * SettlementDetails96.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmSecuritiesRTGS
	 * SettlementDetails97.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails100#mmSecuritiesRTGS
	 * SettlementDetails100.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesRTGS4Choice#mmIndicator
	 * SecuritiesRTGS4Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesRTGS4Choice#mmProprietary
	 * SecuritiesRTGS4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#mmSecuritiesRTGS
	 * SettlementDetails98.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmSecuritiesRTGS
	 * SettlementDetails128.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmSecuritiesRTGS
	 * SettlementDetails120.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmSecuritiesRTGS
	 * SettlementDetails119.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125#mmSecuritiesRTGS
	 * SettlementDetails125.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmSecuritiesRTGS
	 * SettlementDetails126.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#mmSecuritiesRTGS
	 * SettlementDetails127.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmSecuritiesRTGS
	 * SettlementDetails121.mmSecuritiesRTGS}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesRealTimeGrossSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement transaction is to be settled through an RTGS or a non RTGS system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSecuritiesRealTimeGrossSettlement = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesRTGS3Choice.mmIndicator, SecuritiesRTGS3Choice.mmProprietary, SettlementDetails43.mmSecuritiesRTGS, RequestDetails15.mmSecuritiesRTGS, SettlementDetails96.mmSecuritiesRTGS,
					SettlementDetails97.mmSecuritiesRTGS, SettlementDetails100.mmSecuritiesRTGS, SecuritiesRTGS4Choice.mmIndicator, SecuritiesRTGS4Choice.mmProprietary, SettlementDetails98.mmSecuritiesRTGS,
					SettlementDetails128.mmSecuritiesRTGS, SettlementDetails120.mmSecuritiesRTGS, SettlementDetails119.mmSecuritiesRTGS, SettlementDetails125.mmSecuritiesRTGS, SettlementDetails126.mmSecuritiesRTGS,
					SettlementDetails127.mmSecuritiesRTGS, SettlementDetails121.mmSecuritiesRTGS);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesRealTimeGrossSettlement";
			definition = "Specifies whether the settlement transaction is to be settled through an RTGS or a non RTGS system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getSecuritiesRealTimeGrossSettlement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BlockTradeCode blockTrade;
	/**
	 * Specifies whether the settlement instruction is a block parent or child.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BlockTradeCode
	 * BlockTradeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BlockTrade3Choice#mmCode
	 * BlockTrade3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BlockTrade3Choice#mmProprietary
	 * BlockTrade3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmBlockTrade
	 * SettlementDetails43.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#mmBlockTrade
	 * SettlementDetails96.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmBlockTrade
	 * SettlementDetails97.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BlockTrade4Choice#mmCode
	 * BlockTrade4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BlockTrade4Choice#mmProprietary
	 * BlockTrade4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#mmBlockTrade
	 * SettlementDetails98.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmBlockTrade
	 * SettlementDetails128.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmBlockTrade
	 * SettlementDetails120.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmBlockTrade
	 * SettlementDetails119.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmBlockTrade
	 * SettlementDetails126.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#mmBlockTrade
	 * SettlementDetails127.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmBlockTrade
	 * SettlementDetails121.mmBlockTrade}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement instruction is a block parent or child."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBlockTrade = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(BlockTrade3Choice.mmCode, BlockTrade3Choice.mmProprietary, SettlementDetails43.mmBlockTrade, SettlementDetails96.mmBlockTrade, SettlementDetails97.mmBlockTrade, BlockTrade4Choice.mmCode,
					BlockTrade4Choice.mmProprietary, SettlementDetails98.mmBlockTrade, SettlementDetails128.mmBlockTrade, SettlementDetails120.mmBlockTrade, SettlementDetails119.mmBlockTrade, SettlementDetails126.mmBlockTrade,
					SettlementDetails127.mmBlockTrade, SettlementDetails121.mmBlockTrade);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BlockTrade";
			definition = "Specifies whether the settlement instruction is a block parent or child.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BlockTradeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getBlockTrade", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SettlementSystemMethodCode settlementSystemMethod;
	/**
	 * Specifies whether the settlement instruction is to be settled through the
	 * default or the alternate settlement system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementSystemMethodCode
	 * SettlementSystemMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementSystemMethod3Choice#mmCode
	 * SettlementSystemMethod3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementSystemMethod3Choice#mmProprietary
	 * SettlementSystemMethod3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmSettlementSystemMethod
	 * SettlementDetails43.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#mmSettlementSystemMethod
	 * SettlementDetails96.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmSettlementSystemMethod
	 * SettlementDetails97.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails100#mmSettlementSystemMethod
	 * SettlementDetails100.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementSystemMethod4Choice#mmCode
	 * SettlementSystemMethod4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementSystemMethod4Choice#mmProprietary
	 * SettlementSystemMethod4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#mmSettlementSystemMethod
	 * SettlementDetails98.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmSettlementSystemMethod
	 * SettlementDetails128.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmSettlementSystemMethod
	 * SettlementDetails120.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmSettlementSystemMethod
	 * SettlementDetails119.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmSettlementSystemMethod
	 * SettlementDetails126.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#mmSettlementSystemMethod
	 * SettlementDetails127.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmSettlementSystemMethod
	 * SettlementDetails121.mmSettlementSystemMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSystemMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement instruction is to be settled through the default or the alternate settlement system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSettlementSystemMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementSystemMethod3Choice.mmCode, SettlementSystemMethod3Choice.mmProprietary, SettlementDetails43.mmSettlementSystemMethod, SettlementDetails96.mmSettlementSystemMethod,
					SettlementDetails97.mmSettlementSystemMethod, SettlementDetails100.mmSettlementSystemMethod, SettlementSystemMethod4Choice.mmCode, SettlementSystemMethod4Choice.mmProprietary,
					SettlementDetails98.mmSettlementSystemMethod, SettlementDetails128.mmSettlementSystemMethod, SettlementDetails120.mmSettlementSystemMethod, SettlementDetails119.mmSettlementSystemMethod,
					SettlementDetails126.mmSettlementSystemMethod, SettlementDetails127.mmSettlementSystemMethod, SettlementDetails121.mmSettlementSystemMethod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementSystemMethod";
			definition = "Specifies whether the settlement instruction is to be settled through the default or the alternate settlement system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementSystemMethodCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getSettlementSystemMethod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AutoBorrowingCode automaticBorrowing;
	/**
	 * Condition for automatic borrowing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AutoBorrowingCode
	 * AutoBorrowingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing5Choice#mmCode
	 * AutomaticBorrowing5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing5Choice#mmProprietary
	 * AutomaticBorrowing5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmAutomaticBorrowing
	 * SettlementDetails43.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CommissionType5Choice#mmProprietary
	 * CommissionType5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails15#mmAutomaticBorrowing
	 * RequestDetails15.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#mmAutomaticBorrowing
	 * SettlementDetails96.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmAutomaticBorrowing
	 * SettlementDetails97.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing6Choice#mmCode
	 * AutomaticBorrowing6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing6Choice#mmProprietary
	 * AutomaticBorrowing6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing7Choice#mmCode
	 * AutomaticBorrowing7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing7Choice#mmProprietary
	 * AutomaticBorrowing7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmAutomaticBorrowing
	 * SettlementDetails128.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmAutomaticBorrowing
	 * SettlementDetails120.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmAutomaticBorrowing
	 * SettlementDetails119.mmAutomaticBorrowing}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutomaticBorrowing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Condition for automatic borrowing."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAutomaticBorrowing = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AutomaticBorrowing5Choice.mmCode, AutomaticBorrowing5Choice.mmProprietary, SettlementDetails43.mmAutomaticBorrowing, CommissionType5Choice.mmProprietary,
					RequestDetails15.mmAutomaticBorrowing, SettlementDetails96.mmAutomaticBorrowing, SettlementDetails97.mmAutomaticBorrowing, AutomaticBorrowing6Choice.mmCode, AutomaticBorrowing6Choice.mmProprietary,
					AutomaticBorrowing7Choice.mmCode, AutomaticBorrowing7Choice.mmProprietary, SettlementDetails128.mmAutomaticBorrowing, SettlementDetails120.mmAutomaticBorrowing, SettlementDetails119.mmAutomaticBorrowing);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AutomaticBorrowing";
			definition = "Condition for automatic borrowing.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AutoBorrowingCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getAutomaticBorrowing", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator partialSettlementIndicator;
	/**
	 * Specifies whether partial settlement is allowed.
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmPartialSettlementIndicator
	 * SettlementDetails43.mmPartialSettlementIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether partial settlement is allowed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPartialSettlementIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementDetails43.mmPartialSettlementIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartialSettlementIndicator";
			definition = "Specifies whether partial settlement is allowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getPartialSettlementIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator holdIndicator;
	/**
	 * Specifies whether the transaction is on hold/blocked/frozen.
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmHoldIndicator
	 * SettlementDetails43.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails15#mmHoldIndicator
	 * RequestDetails15.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmHoldIndicator
	 * SettlementDetails97.mmHoldIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldIndicator6#mmIndicator
	 * HoldIndicator6.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#mmHoldIndicator
	 * SettlementDetails98.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmHoldIndicator
	 * SettlementDetails120.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmHoldIndicator
	 * SettlementDetails119.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125#mmHoldIndicator
	 * SettlementDetails125.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#mmHoldIndicator
	 * SettlementDetails127.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmHoldIndicator
	 * SettlementDetails121.mmHoldIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transaction is on hold/blocked/frozen."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmHoldIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementDetails43.mmHoldIndicator, RequestDetails15.mmHoldIndicator, SettlementDetails97.mmHoldIndicator, HoldIndicator6.mmIndicator, SettlementDetails98.mmHoldIndicator,
					SettlementDetails120.mmHoldIndicator, SettlementDetails119.mmHoldIndicator, SettlementDetails125.mmHoldIndicator, SettlementDetails127.mmHoldIndicator, SettlementDetails121.mmHoldIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HoldIndicator";
			definition = "Specifies whether the transaction is on hold/blocked/frozen.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getHoldIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SafekeepingPlace requestedSafekeepingPlace;
	/**
	 * Place requested as the place of safekeeping.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmSecuritiesSettlement
	 * SafekeepingPlace.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place requested as the place of safekeeping."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRequestedSafekeepingPlace = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedSafekeepingPlace";
			definition = "Place requested as the place of safekeeping.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PairOff> pairOff;
	/**
	 * Buy and sell trades are settled in cash, based on the difference in the
	 * prices between the off-setting trades.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PairOff#mmRelatedSecuritiesSettlement
	 * PairOff.mmRelatedSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PairOff PairOff}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PairOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Buy and sell trades are settled in cash, based on the difference in the prices between the off-setting trades."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPairOff = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PairOff";
			definition = "Buy and sell trades are settled in cash, based on the difference in the prices between the off-setting trades.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PairOff.mmRelatedSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PairOff.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Interest> accruedInterest;
	/**
	 * Interest included in the settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmSecuritiesSettlement
	 * Interest.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest included in the settlement."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAccruedInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccruedInterest";
			definition = "Interest included in the settlement.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.mmSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	protected SecuritiesClearing securitiesClearing;
	/**
	 * Clearing process which triggers the settlement process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesClearing#mmSecuritiesSettlement
	 * SecuritiesClearing.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesClearing
	 * SecuritiesClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesClearing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Clearing process which triggers the settlement process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesClearing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesClearing";
			definition = "Clearing process which triggers the settlement process.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesClearing.mmSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesClearing.mmObject();
		}
	};
	protected Payment payment;
	/**
	 * Specifies the cash payment information of a securities settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmRelatedSecuritiesSettlement
	 * Payment.mmRelatedSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the cash payment information of a securities settlement."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Specifies the cash payment information of a securities settlement.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmRelatedSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	protected Allocation settledAllocation;
	/**
	 * Allocation which is settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#mmSettlementExecutionParameters
	 * Allocation.mmSettlementExecutionParameters}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettledAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allocation which is settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSettledAllocation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettledAllocation";
			definition = "Allocation which is settled.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Allocation.mmSettlementExecutionParameters;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Allocation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ForeignExchangeTrade> relatedForeignExchangeOperation;
	/**
	 * Entry details related to currency exchange information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmCurrencyExchangeForSecuritiesSettlement
	 * ForeignExchangeTrade.mmCurrencyExchangeForSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedForeignExchangeOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entry details related to currency exchange information."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedForeignExchangeOperation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedForeignExchangeOperation";
			definition = "Entry details related to currency exchange information.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmCurrencyExchangeForSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Security> security;
	/**
	 * Security which is settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesSettlement
	 * Security.mmSecuritiesSettlement}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails27.mmFinancialInstrumentAttributes}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails28.mmFinancialInstrumentAttributes}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails26.mmFinancialInstrumentAttributes}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security which is settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecurity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionDetails27.mmFinancialInstrumentAttributes, SecuritiesSettlementTransactionDetails28.mmFinancialInstrumentAttributes,
					SecuritiesSettlementTransactionDetails26.mmFinancialInstrumentAttributes);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security which is settled.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected Position position;
	/**
	 * Information on the quantities and amounts to be settled in a position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Position#mmSecuritiesSettlement
	 * Position.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Position Position}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Position"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the quantities and amounts to be settled in a position."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPosition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Position";
			definition = "Information on the quantities and amounts to be settled in a position.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Position.mmSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Position.mmObject();
		}
	};
	protected Rollover rollover;
	/**
	 * Process whereby a financial instrument is reinvested at maturity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Rollover#mmSecuritiesSettlement
	 * Rollover.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Rollover Rollover}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rollover"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process whereby a financial instrument is reinvested at maturity."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRollover = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rollover";
			definition = "Process whereby a financial instrument is reinvested at maturity.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Rollover.mmSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Rollover.mmObject();
		}
	};
	protected SecuritiesQuantity turnedQuantity;
	/**
	 * Relates to a turnaround: the same security is bought and sold to settle
	 * the same day, to or from different brokers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedTurnaroundSettlement
	 * SecuritiesQuantity.mmRelatedTurnaroundSettlement}</li>
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
	 * {@linkplain com.tools20022.repository.choice.PairedOrTurnedQuantity3Choice#mmTurnedQuantity
	 * PairedOrTurnedQuantity3Choice.mmTurnedQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TurnedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a turnaround: the same security is bought and sold to settle the same day, to or from different brokers."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTurnedQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(PairedOrTurnedQuantity3Choice.mmTurnedQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TurnedQuantity";
			definition = "Relates to a turnaround: the same security is bought and sold to settle the same day, to or from different brokers.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedTurnaroundSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected ObligationTypeCode settlementReason;
	/**
	 * Specifies the reason for the settlement related to the type of underlying
	 * trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ObligationTypeCode
	 * ObligationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ObligationType1Choice#mmCode
	 * ObligationType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ObligationType1Choice#mmProprietary
	 * ObligationType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation5#mmObligationType
	 * SettlementObligation5.mmObligationType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason for the settlement related to the type of underlying trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSettlementReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ObligationType1Choice.mmCode, ObligationType1Choice.mmProprietary, SettlementObligation5.mmObligationType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementReason";
			definition = "Specifies the reason for the settlement related to the type of underlying trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ObligationTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getSettlementReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DeliveryReceiptTypeCode settlementType;
	/**
	 * Specifies how the transaction is to be settled, eg, against payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptTypeCode
	 * DeliveryReceiptTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation5#mmPayment
	 * SettlementObligation5.mmPayment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmPayment
	 * Order17.mmPayment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmPayment
	 * Order18.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmPayment
	 * SettlementObligation8.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails81#mmPayment
	 * TransactionDetails81.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails82#mmPayment
	 * TransactionDetails82.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmPayment
	 * SecuritiesTradeDetails48.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification18#mmPayment
	 * SettlementTypeAndIdentification18.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification19#mmPayment
	 * SettlementTypeAndIdentification19.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters12#mmPayment
	 * SettlementTypeAndAdditionalParameters12.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters14#mmPayment
	 * SettlementTypeAndAdditionalParameters14.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification20#mmPayment
	 * SettlementTypeAndIdentification20.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmSettlementMethod
	 * SwitchExecution7.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmSettlementMethod
	 * SwitchOrder7.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmSettlementMethod
	 * RedemptionOrder14.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmSettlementMethod
	 * SubscriptionExecution13.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmSettlementMethod
	 * SubscriptionExecution12.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmSettlementMethod
	 * SubscriptionOrder15.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmSettlementMethod
	 * RedemptionOrder15.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmSettlementMethod
	 * RedemptionExecution16.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmSettlementMethod
	 * SubscriptionOrder14.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData6#mmSettlementMethod
	 * FundOrderData6.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmSettlementMethod
	 * RedemptionExecution15.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters19#mmPayment
	 * SettlementTypeAndAdditionalParameters19.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmPayment
	 * SecuritiesTradeDetails68.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmPayment
	 * TransactionDetails97.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters15#mmPayment
	 * TransactionTypeAndAdditionalParameters15.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters17#mmPayment
	 * TransactionTypeAndAdditionalParameters17.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16#mmPayment
	 * TransactionTypeAndAdditionalParameters16.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmPayment
	 * SecuritiesFinancingTransactionDetails35.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#mmPayment
	 * TransactionDetails96.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmPayment
	 * TransactionDetails95.mmPayment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how the transaction is to be settled, eg, against payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSettlementType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementObligation5.mmPayment, Order17.mmPayment, Order18.mmPayment, SettlementObligation8.mmPayment, TransactionDetails81.mmPayment, TransactionDetails82.mmPayment,
					SecuritiesTradeDetails48.mmPayment, SettlementTypeAndIdentification18.mmPayment, SettlementTypeAndIdentification19.mmPayment, SettlementTypeAndAdditionalParameters12.mmPayment,
					SettlementTypeAndAdditionalParameters14.mmPayment, SettlementTypeAndIdentification20.mmPayment, SwitchExecution7.mmSettlementMethod, SwitchOrder7.mmSettlementMethod, RedemptionOrder14.mmSettlementMethod,
					SubscriptionExecution13.mmSettlementMethod, SubscriptionExecution12.mmSettlementMethod, SubscriptionOrder15.mmSettlementMethod, RedemptionOrder15.mmSettlementMethod, RedemptionExecution16.mmSettlementMethod,
					SubscriptionOrder14.mmSettlementMethod, FundOrderData6.mmSettlementMethod, RedemptionExecution15.mmSettlementMethod, SettlementTypeAndAdditionalParameters19.mmPayment, SecuritiesTradeDetails68.mmPayment,
					TransactionDetails97.mmPayment, TransactionTypeAndAdditionalParameters15.mmPayment, TransactionTypeAndAdditionalParameters17.mmPayment, TransactionTypeAndAdditionalParameters16.mmPayment,
					SecuritiesFinancingTransactionDetails35.mmPayment, TransactionDetails96.mmPayment, TransactionDetails95.mmPayment);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementType";
			definition = "Specifies how the transaction is to be settled, eg, against payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DeliveryReceiptTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getSettlementType", new Class[]{});
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
				name = "SecuritiesSettlement";
				definition = "Settlement of the securities in a securities transaction, that is, the instruction to deliver or receive securities, involving the payment of an amount of money or not.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmSecuritiesSettlement, com.tools20022.repository.entity.Payment.mmRelatedSecuritiesSettlement,
						com.tools20022.repository.entity.SecuritiesQuantity.mmSecuritiesSettlement, com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedTurnaroundSettlement,
						com.tools20022.repository.entity.SecuritiesTransfer.mmRelatedSettlement, com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmSecuritiesSettlement,
						com.tools20022.repository.entity.Interest.mmSecuritiesSettlement, com.tools20022.repository.entity.SafekeepingPlace.mmSecuritiesSettlement,
						com.tools20022.repository.entity.SecuritiesTradeExecution.mmSecuritiesSettlement, com.tools20022.repository.entity.ForeignExchangeTrade.mmCurrencyExchangeForSecuritiesSettlement,
						com.tools20022.repository.entity.Allocation.mmSettlementExecutionParameters, com.tools20022.repository.entity.PairOff.mmRelatedSecuritiesSettlement, com.tools20022.repository.entity.Rollover.mmSecuritiesSettlement,
						com.tools20022.repository.entity.SecuritiesClearing.mmSecuritiesSettlement, com.tools20022.repository.entity.Position.mmSecuritiesSettlement);
				derivationElement_lazy = () -> Arrays
						.asList(RequestDetails15.mmUnilateralSplit, Cancellation12Choice.mmTransferOutDetails, Cancellation10Choice.mmTransferInDetails, SecuritiesFinancingTransactionDetails35.mmSettlementParameters,
								SecuritiesSettlementTransactionDetails27.mmSettlementTypeAndAdditionalParameters, SecuritiesSettlementTransactionDetails27.mmQuantityAndAccountDetails,
								SecuritiesSettlementTransactionDetails27.mmSettlementParameters, SecuritiesSettlementTransactionDetails28.mmSettlementTypeAndAdditionalParameters,
								SecuritiesSettlementTransactionDetails28.mmQuantityAndAccountDetails, SecuritiesSettlementTransactionDetails28.mmSettlementParameters,
								SecuritiesSettlementTransactionDetails26.mmSettlementTypeAndAdditionalParameters, SecuritiesSettlementTransactionDetails26.mmQuantityAndAccountDetails,
								SecuritiesSettlementTransactionDetails26.mmSettlementParameters);
				superType_lazy = () -> Settlement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesSettlement.mmTransferOperation, com.tools20022.repository.entity.SecuritiesSettlement.mmSettlementDate,
						com.tools20022.repository.entity.SecuritiesSettlement.mmPartyRole, com.tools20022.repository.entity.SecuritiesSettlement.mmSettlementAmount, com.tools20022.repository.entity.SecuritiesSettlement.mmHoldingsPlanType,
						com.tools20022.repository.entity.SecuritiesSettlement.mmSecuritiesMovementType, com.tools20022.repository.entity.SecuritiesSettlement.mmSettlementQuantity,
						com.tools20022.repository.entity.SecuritiesSettlement.mmSecuritiesTradeExecution, com.tools20022.repository.entity.SecuritiesSettlement.mmCurrencyToBuy,
						com.tools20022.repository.entity.SecuritiesSettlement.mmCurrencyToSell, com.tools20022.repository.entity.SecuritiesSettlement.mmDenominationChoice,
						com.tools20022.repository.entity.SecuritiesSettlement.mmSettlementTransactionCondition, com.tools20022.repository.entity.SecuritiesSettlement.mmBeneficialOwnershipIndicator,
						com.tools20022.repository.entity.SecuritiesSettlement.mmMarketClientSide, com.tools20022.repository.entity.SecuritiesSettlement.mmTracking, com.tools20022.repository.entity.SecuritiesSettlement.mmLetterOfGuarantee,
						com.tools20022.repository.entity.SecuritiesSettlement.mmEligibleForCollateral, com.tools20022.repository.entity.SecuritiesSettlement.mmAccruedInterestIndicator,
						com.tools20022.repository.entity.SecuritiesSettlement.mmPreConfirmation, com.tools20022.repository.entity.SecuritiesSettlement.mmSecuritiesRealTimeGrossSettlement,
						com.tools20022.repository.entity.SecuritiesSettlement.mmBlockTrade, com.tools20022.repository.entity.SecuritiesSettlement.mmSettlementSystemMethod,
						com.tools20022.repository.entity.SecuritiesSettlement.mmAutomaticBorrowing, com.tools20022.repository.entity.SecuritiesSettlement.mmPartialSettlementIndicator,
						com.tools20022.repository.entity.SecuritiesSettlement.mmHoldIndicator, com.tools20022.repository.entity.SecuritiesSettlement.mmRequestedSafekeepingPlace,
						com.tools20022.repository.entity.SecuritiesSettlement.mmPairOff, com.tools20022.repository.entity.SecuritiesSettlement.mmAccruedInterest, com.tools20022.repository.entity.SecuritiesSettlement.mmSecuritiesClearing,
						com.tools20022.repository.entity.SecuritiesSettlement.mmPayment, com.tools20022.repository.entity.SecuritiesSettlement.mmSettledAllocation,
						com.tools20022.repository.entity.SecuritiesSettlement.mmRelatedForeignExchangeOperation, com.tools20022.repository.entity.SecuritiesSettlement.mmSecurity,
						com.tools20022.repository.entity.SecuritiesSettlement.mmPosition, com.tools20022.repository.entity.SecuritiesSettlement.mmRollover, com.tools20022.repository.entity.SecuritiesSettlement.mmTurnedQuantity,
						com.tools20022.repository.entity.SecuritiesSettlement.mmSettlementReason, com.tools20022.repository.entity.SecuritiesSettlement.mmSettlementType);
				derivationComponent_lazy = () -> Arrays.asList(CurrencyToBuyOrSell1Choice.mmObject(), AmountAndDirection6.mmObject(), AmountAndDirection5.mmObject(), AmountAndDirection3.mmObject(), AmountAndDirection29.mmObject(),
						SettlementTransactionCondition11Choice.mmObject(), BeneficialOwnership3Choice.mmObject(), BlockTrade3Choice.mmObject(), AutomaticBorrowing5Choice.mmObject(), SettlementDetails43.mmObject(),
						AmountAndDirection28.mmObject(), AmountAndDirection20.mmObject(), AmountAndDirection31.mmObject(), AmountAndDirection27.mmObject(), ObligationType1Choice.mmObject(), SettlementObligation5.mmObject(),
						AmountAndDirection21.mmObject(), Settlement1.mmObject(), SettlementObligation7.mmObject(), SettlementObligation8.mmObject(), QuantityAndAccount39.mmObject(), QuantityAndAccount41.mmObject(),
						QuantityAndAccount40.mmObject(), QuantityAndAccount42.mmObject(), QuantityAndAccount38.mmObject(), QuantityAndAccount43.mmObject(), SettlementTypeAndIdentification18.mmObject(), AmountAndDirection46.mmObject(),
						SettlementTypeAndIdentification19.mmObject(), RequestDetails15.mmObject(), SettlementDetails96.mmObject(), SettlementDetails97.mmObject(), AmountAndDirection49.mmObject(),
						SettlementTypeAndAdditionalParameters12.mmObject(), AmountAndDirection48.mmObject(), AmountAndDirection44.mmObject(), SettlementTransactionCondition16Choice.mmObject(),
						SettlementTypeAndAdditionalParameters14.mmObject(), AmountAndDirection45.mmObject(), AmountAndDirection51.mmObject(), SettlementDetails100.mmObject(), SettlementTransactionCondition19Choice.mmObject(),
						AmountAndDirection52.mmObject(), BlockTrade4Choice.mmObject(), BeneficialOwnership4Choice.mmObject(), SettlementTransactionCondition18Choice.mmObject(), AutomaticBorrowing6Choice.mmObject(),
						QuantityAndAccount45.mmObject(), SecuritiesTransactionType18Choice.mmObject(), AmountAndDirection47.mmObject(), HoldIndicator6.mmObject(), SettlementTypeAndAdditionalParameters13.mmObject(),
						PairedOrTurnedQuantity3Choice.mmObject(), AutomaticBorrowing7Choice.mmObject(), SettlementTransactionCondition17Choice.mmObject(), SettlementDetails98.mmObject(), QuantityAndAccount44.mmObject(),
						SettlementTypeAndIdentification20.mmObject(), ReceiveInformation17.mmObject(), ReceiveInformation16.mmObject(), DeliverInformation16.mmObject(), Cancellation11Choice.mmObject(), Cancellation12Choice.mmObject(),
						Cancellation10Choice.mmObject(), DeliverInformation17.mmObject(), SettlementTransactionCondition20Choice.mmObject(), SettlementDetails102.mmObject(), FundSettlementParameters11.mmObject(),
						FundSettlementParameters12.mmObject(), SettlementTransactionCondition30Choice.mmObject(), TradeTransactionCondition8Choice.mmObject(), SettlementDetails128.mmObject(), SettlementDetails120.mmObject(),
						SettlementDetails119.mmObject(), SettlementTypeAndAdditionalParameters19.mmObject(), SettlementDetails125.mmObject(), TransactionTypeAndAdditionalParameters15.mmObject(),
						TransactionTypeAndAdditionalParameters17.mmObject(), TransactionTypeAndAdditionalParameters16.mmObject(), AdditionalInformation13.mmObject(), SecuritiesTransactionType33Choice.mmObject(),
						SettlementDetails126.mmObject(), SecuritiesSettlementTransactionDetails27.mmObject(), SecuritiesSettlementTransactionDetails28.mmObject(), SecuritiesSettlementTransactionDetails26.mmObject(),
						SettlementDetails122.mmObject(), SettlementDetails127.mmObject(), SecuritiesTransactionType32Choice.mmObject(), SettlementDetails121.mmObject(), SettlementDetails118.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesSettlement.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesTransfer getTransferOperation() {
		return transferOperation;
	}

	public void setTransferOperation(com.tools20022.repository.entity.SecuritiesTransfer transferOperation) {
		this.transferOperation = transferOperation;
	}

	public ISODateTime getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(ISODateTime settlementDate) {
		this.settlementDate = settlementDate;
	}

	public List<SecuritiesSettlementPartyRole> getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(List<com.tools20022.repository.entity.SecuritiesSettlementPartyRole> partyRole) {
		this.partyRole = partyRole;
	}

	public ActiveCurrencyAndAmount getSettlementAmount() {
		return settlementAmount;
	}

	public void setSettlementAmount(ActiveCurrencyAndAmount settlementAmount) {
		this.settlementAmount = settlementAmount;
	}

	public Max35Text getHoldingsPlanType() {
		return holdingsPlanType;
	}

	public void setHoldingsPlanType(Max35Text holdingsPlanType) {
		this.holdingsPlanType = holdingsPlanType;
	}

	public ReceiveDeliveryCode getSecuritiesMovementType() {
		return securitiesMovementType;
	}

	public void setSecuritiesMovementType(ReceiveDeliveryCode securitiesMovementType) {
		this.securitiesMovementType = securitiesMovementType;
	}

	public SecuritiesQuantity getSettlementQuantity() {
		return settlementQuantity;
	}

	public void setSettlementQuantity(com.tools20022.repository.entity.SecuritiesQuantity settlementQuantity) {
		this.settlementQuantity = settlementQuantity;
	}

	public SecuritiesTradeExecution getSecuritiesTradeExecution() {
		return securitiesTradeExecution;
	}

	public void setSecuritiesTradeExecution(com.tools20022.repository.entity.SecuritiesTradeExecution securitiesTradeExecution) {
		this.securitiesTradeExecution = securitiesTradeExecution;
	}

	public CurrencyCode getCurrencyToBuy() {
		return currencyToBuy;
	}

	public void setCurrencyToBuy(CurrencyCode currencyToBuy) {
		this.currencyToBuy = currencyToBuy;
	}

	public CurrencyCode getCurrencyToSell() {
		return currencyToSell;
	}

	public void setCurrencyToSell(CurrencyCode currencyToSell) {
		this.currencyToSell = currencyToSell;
	}

	public Max35Text getDenominationChoice() {
		return denominationChoice;
	}

	public void setDenominationChoice(Max35Text denominationChoice) {
		this.denominationChoice = denominationChoice;
	}

	public SettlementTransactionConditionCode getSettlementTransactionCondition() {
		return settlementTransactionCondition;
	}

	public void setSettlementTransactionCondition(SettlementTransactionConditionCode settlementTransactionCondition) {
		this.settlementTransactionCondition = settlementTransactionCondition;
	}

	public YesNoIndicator getBeneficialOwnershipIndicator() {
		return beneficialOwnershipIndicator;
	}

	public void setBeneficialOwnershipIndicator(YesNoIndicator beneficialOwnershipIndicator) {
		this.beneficialOwnershipIndicator = beneficialOwnershipIndicator;
	}

	public MarketClientSideCode getMarketClientSide() {
		return marketClientSide;
	}

	public void setMarketClientSide(MarketClientSideCode marketClientSide) {
		this.marketClientSide = marketClientSide;
	}

	public YesNoIndicator getTracking() {
		return tracking;
	}

	public void setTracking(YesNoIndicator tracking) {
		this.tracking = tracking;
	}

	public YesNoIndicator getLetterOfGuarantee() {
		return letterOfGuarantee;
	}

	public void setLetterOfGuarantee(YesNoIndicator letterOfGuarantee) {
		this.letterOfGuarantee = letterOfGuarantee;
	}

	public YesNoIndicator getEligibleForCollateral() {
		return eligibleForCollateral;
	}

	public void setEligibleForCollateral(YesNoIndicator eligibleForCollateral) {
		this.eligibleForCollateral = eligibleForCollateral;
	}

	public YesNoIndicator getAccruedInterestIndicator() {
		return accruedInterestIndicator;
	}

	public void setAccruedInterestIndicator(YesNoIndicator accruedInterestIndicator) {
		this.accruedInterestIndicator = accruedInterestIndicator;
	}

	public PreConfirmationCode getPreConfirmation() {
		return preConfirmation;
	}

	public void setPreConfirmation(PreConfirmationCode preConfirmation) {
		this.preConfirmation = preConfirmation;
	}

	public YesNoIndicator getSecuritiesRealTimeGrossSettlement() {
		return securitiesRealTimeGrossSettlement;
	}

	public void setSecuritiesRealTimeGrossSettlement(YesNoIndicator securitiesRealTimeGrossSettlement) {
		this.securitiesRealTimeGrossSettlement = securitiesRealTimeGrossSettlement;
	}

	public BlockTradeCode getBlockTrade() {
		return blockTrade;
	}

	public void setBlockTrade(BlockTradeCode blockTrade) {
		this.blockTrade = blockTrade;
	}

	public SettlementSystemMethodCode getSettlementSystemMethod() {
		return settlementSystemMethod;
	}

	public void setSettlementSystemMethod(SettlementSystemMethodCode settlementSystemMethod) {
		this.settlementSystemMethod = settlementSystemMethod;
	}

	public AutoBorrowingCode getAutomaticBorrowing() {
		return automaticBorrowing;
	}

	public void setAutomaticBorrowing(AutoBorrowingCode automaticBorrowing) {
		this.automaticBorrowing = automaticBorrowing;
	}

	public YesNoIndicator getPartialSettlementIndicator() {
		return partialSettlementIndicator;
	}

	public void setPartialSettlementIndicator(YesNoIndicator partialSettlementIndicator) {
		this.partialSettlementIndicator = partialSettlementIndicator;
	}

	public YesNoIndicator getHoldIndicator() {
		return holdIndicator;
	}

	public void setHoldIndicator(YesNoIndicator holdIndicator) {
		this.holdIndicator = holdIndicator;
	}

	public SafekeepingPlace getRequestedSafekeepingPlace() {
		return requestedSafekeepingPlace;
	}

	public void setRequestedSafekeepingPlace(com.tools20022.repository.entity.SafekeepingPlace requestedSafekeepingPlace) {
		this.requestedSafekeepingPlace = requestedSafekeepingPlace;
	}

	public List<PairOff> getPairOff() {
		return pairOff;
	}

	public void setPairOff(List<com.tools20022.repository.entity.PairOff> pairOff) {
		this.pairOff = pairOff;
	}

	public List<Interest> getAccruedInterest() {
		return accruedInterest;
	}

	public void setAccruedInterest(List<com.tools20022.repository.entity.Interest> accruedInterest) {
		this.accruedInterest = accruedInterest;
	}

	public SecuritiesClearing getSecuritiesClearing() {
		return securitiesClearing;
	}

	public void setSecuritiesClearing(com.tools20022.repository.entity.SecuritiesClearing securitiesClearing) {
		this.securitiesClearing = securitiesClearing;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(com.tools20022.repository.entity.Payment payment) {
		this.payment = payment;
	}

	public Allocation getSettledAllocation() {
		return settledAllocation;
	}

	public void setSettledAllocation(com.tools20022.repository.entity.Allocation settledAllocation) {
		this.settledAllocation = settledAllocation;
	}

	public List<ForeignExchangeTrade> getRelatedForeignExchangeOperation() {
		return relatedForeignExchangeOperation;
	}

	public void setRelatedForeignExchangeOperation(List<com.tools20022.repository.entity.ForeignExchangeTrade> relatedForeignExchangeOperation) {
		this.relatedForeignExchangeOperation = relatedForeignExchangeOperation;
	}

	public List<Security> getSecurity() {
		return security;
	}

	public void setSecurity(List<com.tools20022.repository.entity.Security> security) {
		this.security = security;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(com.tools20022.repository.entity.Position position) {
		this.position = position;
	}

	public Rollover getRollover() {
		return rollover;
	}

	public void setRollover(com.tools20022.repository.entity.Rollover rollover) {
		this.rollover = rollover;
	}

	public SecuritiesQuantity getTurnedQuantity() {
		return turnedQuantity;
	}

	public void setTurnedQuantity(com.tools20022.repository.entity.SecuritiesQuantity turnedQuantity) {
		this.turnedQuantity = turnedQuantity;
	}

	public ObligationTypeCode getSettlementReason() {
		return settlementReason;
	}

	public void setSettlementReason(ObligationTypeCode settlementReason) {
		this.settlementReason = settlementReason;
	}

	public DeliveryReceiptTypeCode getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(DeliveryReceiptTypeCode settlementType) {
		this.settlementType = settlementType;
	}
}