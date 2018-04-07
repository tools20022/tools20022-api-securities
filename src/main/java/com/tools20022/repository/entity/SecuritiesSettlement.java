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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmSettlementParameters
 * SecuritiesFinancingTransactionDetails35.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails34#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails34.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails34#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails34.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails34#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails34.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails33#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails33.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails33#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails33.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails33#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails33.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails32.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails32.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails32.mmSettlementParameters}</li>
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
 * <li>{@linkplain com.tools20022.repository.msg.QuantityAndAccount40
 * QuantityAndAccount40}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityAndAccount38
 * QuantityAndAccount38}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification18
 * SettlementTypeAndIdentification18}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification19
 * SettlementTypeAndIdentification19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails15
 * RequestDetails15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails97
 * SettlementDetails97}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection49
 * AmountAndDirection49}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters12
 * SettlementTypeAndAdditionalParameters12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection44
 * AmountAndDirection44}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition16Choice
 * SettlementTransactionCondition16Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters14
 * SettlementTypeAndAdditionalParameters14}</li>
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
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters19
 * SettlementTypeAndAdditionalParameters19}</li>
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
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails118
 * SettlementDetails118}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceiveInformation18
 * ReceiveInformation18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliverInformation19
 * DeliverInformation19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceiveInformation19
 * ReceiveInformation19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliverInformation18
 * DeliverInformation18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails147
 * SettlementDetails147}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails142
 * SettlementDetails142}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityAndAccount64
 * QuantityAndAccount64}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails144
 * SettlementDetails144}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails148
 * SettlementDetails148}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityAndAccount63
 * QuantityAndAccount63}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails141
 * SettlementDetails141}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails145
 * SettlementDetails145}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType36Choice
 * SecuritiesTransactionType36Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails34
 * SecuritiesSettlementTransactionDetails34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails146
 * SettlementDetails146}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType37Choice
 * SecuritiesTransactionType37Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails33
 * SecuritiesSettlementTransactionDetails33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails143
 * SettlementDetails143}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32
 * SecuritiesSettlementTransactionDetails32}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType38Choice
 * SecuritiesTransactionType38Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails149
 * SettlementDetails149}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails150
 * SettlementDetails150}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityAndAccount65
 * QuantityAndAccount65}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityAndAccount66
 * QuantityAndAccount66}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityAndAccount67
 * QuantityAndAccount67}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityAndAccount68
 * QuantityAndAccount68}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection87
 * AmountAndDirection87}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection88
 * AmountAndDirection88}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection89
 * AmountAndDirection89}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification25
 * SettlementTypeAndIdentification25}</li>
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
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesSettlement, SecuritiesTransfer> mmTransferOperation = new MMBusinessAssociationEnd<SecuritiesSettlement, SecuritiesTransfer>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferOperation";
			definition = "Set of processes resulting in a securities transfer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesTransfer.mmRelatedSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesTransfer.mmObject();
		}

		@Override
		public SecuritiesTransfer getValue(SecuritiesSettlement obj) {
			return obj.getTransferOperation();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, SecuritiesTransfer value) {
			obj.setTransferOperation(value);
		}
	};
	protected ISODateTime settlementDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails39#mmSettlementDate
	 * IntraPositionDetails39.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation13#mmEffectiveDate
	 * AdditionalInformation13.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmSettlementDate
	 * SecuredMarketTransaction4.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmSettlementDate
	 * UnsecuredMarketTransaction4.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation18#mmEffectiveSettlementDate
	 * ReceiveInformation18.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmEffectiveSettlementDate
	 * Transfer35.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation18#mmEffectiveSettlementDate
	 * DeliverInformation18.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46#mmSettlementDate
	 * IntraPositionDetails46.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails103#mmEffectiveSettlementDate
	 * TransactionDetails103.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails74#mmEffectiveSettlementDate
	 * SecuritiesTradeDetails74.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails76#mmEffectiveSettlementDate
	 * SecuritiesTradeDetails76.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification25#mmSettlementDate
	 * SettlementTypeAndIdentification25.mmSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::ESET</li>
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
	public static final MMBusinessAttribute<SecuritiesSettlement, ISODateTime> mmSettlementDate = new MMBusinessAttribute<SecuritiesSettlement, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementObligation5.mmSettlementDate, InvestmentFundTransaction4.mmSettlementDate, SettlementObligation7.mmIntendedSettlementDate, NetPosition3.mmSettlementDate,
					SettlementObligation8.mmIntendedSettlementDate, IntraPositionDetails33.mmSettlementDate, IntraPositionDetails39.mmSettlementDate, AdditionalInformation13.mmEffectiveDate, SecuredMarketTransaction4.mmSettlementDate,
					UnsecuredMarketTransaction4.mmSettlementDate, ReceiveInformation18.mmEffectiveSettlementDate, Transfer35.mmEffectiveSettlementDate, DeliverInformation18.mmEffectiveSettlementDate,
					IntraPositionDetails46.mmSettlementDate, TransactionDetails103.mmEffectiveSettlementDate, SecuritiesTradeDetails74.mmEffectiveSettlementDate, SecuritiesTradeDetails76.mmEffectiveSettlementDate,
					SettlementTypeAndIdentification25.mmSettlementDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::ESET"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementDate";
			definition = "Date and time at which a transaction is completed and cleared. \r\nIt can be an effective settlement date, that is, payment is effected and securities are delivered or an intended settlement date that is, the date and time at which the amount of money is intended to be moved.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(SecuritiesSettlement obj) {
			return obj.getSettlementDate();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, ISODateTime value) {
			obj.setSettlementDate(value);
		}
	};
	protected List<SecuritiesSettlementPartyRole> partyRole;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails80#mmDeliveringSettlementParties
	 * TransactionDetails80.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails80#mmReceivingSettlementParties
	 * TransactionDetails80.mmReceivingSettlementParties}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails118#mmSettlementParties
	 * SettlementDetails118.mmSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation18#mmSettlementPartiesDetails
	 * ReceiveInformation18.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67#mmSettlementPartiesDetails
	 * InvestmentAccount67.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation19#mmSettlementPartiesDetails
	 * DeliverInformation19.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation19#mmSettlementPartiesDetails
	 * ReceiveInformation19.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation18#mmSettlementPartiesDetails
	 * DeliverInformation18.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument60#mmSettlementPartiesReceivingSideDetails
	 * FinancialInstrument60.mmSettlementPartiesReceivingSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument65#mmSettlementPartiesReceivingSideDetails
	 * FinancialInstrument65.mmSettlementPartiesReceivingSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71#mmDeliveringSettlementParties
	 * SecuritiesTradeDetails71.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71#mmReceivingSettlementParties
	 * SecuritiesTradeDetails71.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails105#mmReceivingSettlementParties
	 * TransactionDetails105.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails105#mmDeliveringSettlementParties
	 * TransactionDetails105.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmDeliveringSettlementParties
	 * SecuritiesTradeDetails72.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmReceivingSettlementParties
	 * SecuritiesTradeDetails72.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails104#mmDeliveringSettlementParties
	 * TransactionDetails104.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails104#mmReceivingSettlementParties
	 * TransactionDetails104.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails103#mmDeliveringSettlementParties
	 * TransactionDetails103.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails103#mmReceivingSettlementParties
	 * TransactionDetails103.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails107#mmDeliveringSettlementParties
	 * TransactionDetails107.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails107#mmReceivingSettlementParties
	 * TransactionDetails107.mmReceivingSettlementParties}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesSettlement, List<SecuritiesSettlementPartyRole>> mmPartyRole = new MMBusinessAssociationEnd<SecuritiesSettlement, List<SecuritiesSettlementPartyRole>>() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementObligation8.mmSettlementParties, TransactionDetails81.mmDeliveringSettlementParties, TransactionDetails81.mmReceivingSettlementParties,
					TransactionDetails74.mmDeliveringSettlementParties, TransactionDetails74.mmReceivingSettlementParties, TransactionDetails82.mmDeliveringSettlementParties, TransactionDetails82.mmReceivingSettlementParties,
					TransactionDetails80.mmDeliveringSettlementParties, TransactionDetails80.mmReceivingSettlementParties, SettlementDetails102.mmSettlementParties, FundSettlementParameters11.mmReceivingSideDetails,
					FundSettlementParameters11.mmDeliveringSideDetails, FundSettlementParameters12.mmReceivingSideDetails, FundSettlementParameters12.mmDeliveringSideDetails, SettlementDetails118.mmSettlementParties,
					ReceiveInformation18.mmSettlementPartiesDetails, InvestmentAccount67.mmSettlementPartiesDetails, DeliverInformation19.mmSettlementPartiesDetails, ReceiveInformation19.mmSettlementPartiesDetails,
					DeliverInformation18.mmSettlementPartiesDetails, FinancialInstrument60.mmSettlementPartiesReceivingSideDetails, FinancialInstrument65.mmSettlementPartiesReceivingSideDetails,
					SecuritiesTradeDetails71.mmDeliveringSettlementParties, SecuritiesTradeDetails71.mmReceivingSettlementParties, TransactionDetails105.mmReceivingSettlementParties, TransactionDetails105.mmDeliveringSettlementParties,
					SecuritiesTradeDetails72.mmDeliveringSettlementParties, SecuritiesTradeDetails72.mmReceivingSettlementParties, TransactionDetails104.mmDeliveringSettlementParties, TransactionDetails104.mmReceivingSettlementParties,
					TransactionDetails103.mmDeliveringSettlementParties, TransactionDetails103.mmReceivingSettlementParties, TransactionDetails107.mmDeliveringSettlementParties, TransactionDetails107.mmReceivingSettlementParties);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to the settlement of securities and played by a party at that step in a securities transaction flow.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesSettlementPartyRole.mmSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
		}

		@Override
		public List<SecuritiesSettlementPartyRole> getValue(SecuritiesSettlement obj) {
			return obj.getPartyRole();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, List<SecuritiesSettlementPartyRole> value) {
			obj.setPartyRole(value);
		}
	};
	protected ActiveCurrencyAndAmount settlementAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection49#mmAmount
	 * AmountAndDirection49.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection44#mmAmount
	 * AmountAndDirection44.mmAmount}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation18#mmSettlementAmount
	 * ReceiveInformation18.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation19#mmSettlementAmount
	 * DeliverInformation19.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation19#mmSettlementAmount
	 * ReceiveInformation19.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation18#mmSettlementAmount
	 * DeliverInformation18.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46#mmRemainingToBeSettledQuantity
	 * IntraPositionDetails46.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount64#mmPreviouslySettledAmount
	 * QuantityAndAccount64.mmPreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount64#mmRemainingToBeSettledAmount
	 * QuantityAndAccount64.mmRemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails105#mmSettlementAmount
	 * TransactionDetails105.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails34#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails34.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails104#mmPostingAmount
	 * TransactionDetails104.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails33#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails33.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails32.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails103#mmPostingAmount
	 * TransactionDetails103.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails107#mmSettlementAmount
	 * TransactionDetails107.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection87#mmAmount
	 * AmountAndDirection87.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection88#mmAmount
	 * AmountAndDirection88.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection89#mmAmount
	 * AmountAndDirection89.mmAmount}</li>
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
	public static final MMBusinessAttribute<SecuritiesSettlement, ActiveCurrencyAndAmount> mmSettlementAmount = new MMBusinessAttribute<SecuritiesSettlement, ActiveCurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(AmountAndDirection6.mmAmount, AmountAndDirection5.mmAmount, AmountAndDirection3.mmAmount, AmountAndDirection29.mmAmount, AmountAndDirection28.mmAmount, AmountAndDirection20.mmAmount,
					AmountAndDirection31.mmAmount, AmountAndDirection27.mmAmount, SettlementObligation5.mmSettlementAmount, AmountAndDirection21.mmAmount, InvestmentFundTransaction4.mmSettlementAmount,
					SettlementObligation7.mmSettlementAmount, SettlementObligation7.mmRemainingAmountToBeSettled, SettlementObligation8.mmSettlementAmount, QuantityAndAccount40.mmPreviouslySettledAmount,
					QuantityAndAccount40.mmRemainingToBeSettledAmount, TransactionDetails81.mmSettlementAmount, TransactionDetails74.mmSettlementAmount, TransactionDetails82.mmSettlementAmount, TransactionDetails80.mmSettlementAmount,
					AmountAndDirection49.mmAmount, AmountAndDirection44.mmAmount, AmountAndDirection51.mmAmount, AmountAndDirection52.mmAmount, AmountAndDirection47.mmAmount, SwitchExecution7.mmSettlementAmount,
					SwitchOrder7.mmSettlementAmount, RedemptionOrder14.mmSettlementAmount, SubscriptionExecution13.mmSettlementAmount, SubscriptionExecution12.mmSettlementAmount, SubscriptionOrder15.mmSettlementAmount,
					RedemptionOrder15.mmSettlementAmount, SubscriptionOrder14.mmSettlementAmount, ReceiveInformation18.mmSettlementAmount, DeliverInformation19.mmSettlementAmount, ReceiveInformation19.mmSettlementAmount,
					DeliverInformation18.mmSettlementAmount, IntraPositionDetails46.mmRemainingToBeSettledQuantity, QuantityAndAccount64.mmPreviouslySettledAmount, QuantityAndAccount64.mmRemainingToBeSettledAmount,
					TransactionDetails105.mmSettlementAmount, SecuritiesSettlementTransactionDetails34.mmSettlementAmount, TransactionDetails104.mmPostingAmount, SecuritiesSettlementTransactionDetails33.mmSettlementAmount,
					SecuritiesSettlementTransactionDetails32.mmSettlementAmount, TransactionDetails103.mmPostingAmount, TransactionDetails107.mmSettlementAmount, AmountAndDirection87.mmAmount, AmountAndDirection88.mmAmount,
					AmountAndDirection89.mmAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementAmount";
			definition = "Amount of money settled or to be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(SecuritiesSettlement obj) {
			return obj.getSettlementAmount();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, ActiveCurrencyAndAmount value) {
			obj.setSettlementAmount(value);
		}
	};
	protected Max35Text holdingsPlanType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmHoldingsPlanType
	 * Transfer35.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer34#mmHoldingsPlanType
	 * Transfer34.mmHoldingsPlanType}</li>
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
	public static final MMBusinessAttribute<SecuritiesSettlement, Max35Text> mmHoldingsPlanType = new MMBusinessAttribute<SecuritiesSettlement, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(Transfer35.mmHoldingsPlanType, Transfer34.mmHoldingsPlanType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HoldingsPlanType";
			definition = "Identifies whether or not saving plan or withdrawal or switch plan are included in the holdings.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SecuritiesSettlement obj) {
			return obj.getHoldingsPlanType();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, Max35Text value) {
			obj.setHoldingsPlanType(value);
		}
	};
	protected ReceiveDeliveryCode securitiesMovementType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16#mmSecuritiesMovementType
	 * TransactionTypeAndAdditionalParameters16.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmSecuritiesMovementType
	 * SecuritiesFinancingTransactionDetails35.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71#mmSecuritiesMovementType
	 * SecuritiesTradeDetails71.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails105#mmSecuritiesMovementType
	 * TransactionDetails105.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmSecuritiesMovementType
	 * SecuritiesTradeDetails72.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails104#mmSecuritiesMovementType
	 * TransactionDetails104.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails103#mmSecuritiesMovementType
	 * TransactionDetails103.mmSecuritiesMovementType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22H::REDE, ISO15022Synonym:
	 * :22F::PAYM</li>
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
	public static final MMBusinessAttribute<SecuritiesSettlement, ReceiveDeliveryCode> mmSecuritiesMovementType = new MMBusinessAttribute<SecuritiesSettlement, ReceiveDeliveryCode>() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementObligation5.mmSecuritiesMovementType, NetPosition3.mmSecuritiesMovementType, SettlementObligation8.mmSecuritiesMovementType, TransactionDetails81.mmSecuritiesMovementType,
					TransactionDetails82.mmSecuritiesMovementType, SettlementTypeAndIdentification18.mmSecuritiesMovementType, SettlementTypeAndIdentification19.mmSecuritiesMovementType,
					SettlementTypeAndAdditionalParameters12.mmSecuritiesMovementType, SettlementTypeAndAdditionalParameters14.mmSecuritiesMovementType, SettlementTypeAndAdditionalParameters19.mmSecuritiesMovementType,
					TransactionTypeAndAdditionalParameters16.mmSecuritiesMovementType, SecuritiesFinancingTransactionDetails35.mmSecuritiesMovementType, SecuritiesTradeDetails71.mmSecuritiesMovementType,
					TransactionDetails105.mmSecuritiesMovementType, SecuritiesTradeDetails72.mmSecuritiesMovementType, TransactionDetails104.mmSecuritiesMovementType, TransactionDetails103.mmSecuritiesMovementType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22H::REDE"), new ISO15022Synonym(this, ":22F::PAYM"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesMovementType";
			definition = "Specifies if the movement on a securities account results from a deliver or a receive instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReceiveDeliveryCode.mmObject();
		}

		@Override
		public ReceiveDeliveryCode getValue(SecuritiesSettlement obj) {
			return obj.getSecuritiesMovementType();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, ReceiveDeliveryCode value) {
			obj.setSecuritiesMovementType(value);
		}
	};
	protected SecuritiesQuantity settlementQuantity;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmSettlementQuantity
	 * SecuritiesFinancingTransactionDetails35.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount64#mmSettledQuantity
	 * QuantityAndAccount64.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount64#mmPreviouslySettledQuantity
	 * QuantityAndAccount64.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount64#mmRemainingToBeSettledQuantity
	 * QuantityAndAccount64.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails105#mmSettlementQuantity
	 * TransactionDetails105.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount63#mmSettlementQuantity
	 * QuantityAndAccount63.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails104#mmPostingQuantity
	 * TransactionDetails104.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails103#mmPostingQuantity
	 * TransactionDetails103.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails15#mmRemainingToBeSettledQuantity
	 * IntraPositionMovementDetails15.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails107#mmSettlementQuantity
	 * TransactionDetails107.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount65#mmSettlementQuantity
	 * QuantityAndAccount65.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity14#mmSettlementQuantity
	 * Quantity14.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount67#mmSettlementQuantity
	 * QuantityAndAccount67.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount68#mmSettlementQuantity
	 * QuantityAndAccount68.mmSettlementQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::SETT</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesSettlement, SecuritiesQuantity> mmSettlementQuantity = new MMBusinessAssociationEnd<SecuritiesSettlement, SecuritiesQuantity>() {
		{
			derivation_lazy = () -> Arrays.asList(QuantityAndAccount40.mmSettledQuantity, QuantityAndAccount40.mmPreviouslySettledQuantity, QuantityAndAccount40.mmRemainingToBeSettledQuantity, TransactionDetails81.mmSettlementQuantity,
					TransactionDetails74.mmSettlementQuantity, TransactionDetails82.mmSettlementQuantity, QuantityAndAccount38.mmSettlementQuantity, TransactionDetails80.mmSettlementQuantity,
					SecuritiesFinancingTransactionDetails35.mmSettlementQuantity, QuantityAndAccount64.mmSettledQuantity, QuantityAndAccount64.mmPreviouslySettledQuantity, QuantityAndAccount64.mmRemainingToBeSettledQuantity,
					TransactionDetails105.mmSettlementQuantity, QuantityAndAccount63.mmSettlementQuantity, TransactionDetails104.mmPostingQuantity, TransactionDetails103.mmPostingQuantity,
					IntraPositionMovementDetails15.mmRemainingToBeSettledQuantity, TransactionDetails107.mmSettlementQuantity, QuantityAndAccount65.mmSettlementQuantity, Quantity14.mmSettlementQuantity,
					QuantityAndAccount67.mmSettlementQuantity, QuantityAndAccount68.mmSettlementQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::SETT"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementQuantity";
			definition = "Total quantity of securities to be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuantity.mmSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public SecuritiesQuantity getValue(SecuritiesSettlement obj) {
			return obj.getSettlementQuantity();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, SecuritiesQuantity value) {
			obj.setSettlementQuantity(value);
		}
	};
	protected SecuritiesTradeExecution securitiesTradeExecution;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesSettlement, com.tools20022.repository.entity.SecuritiesTradeExecution> mmSecuritiesTradeExecution = new MMBusinessAssociationEnd<SecuritiesSettlement, com.tools20022.repository.entity.SecuritiesTradeExecution>() {
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

		@Override
		public com.tools20022.repository.entity.SecuritiesTradeExecution getValue(SecuritiesSettlement obj) {
			return obj.getSecuritiesTradeExecution();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, com.tools20022.repository.entity.SecuritiesTradeExecution value) {
			obj.setSecuritiesTradeExecution(value);
		}
	};
	protected CurrencyCode currencyToBuy;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption142#mmCurrencyToBuy
	 * CorporateActionOption142.mmCurrencyToBuy}</li>
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
	public static final MMBusinessAttribute<SecuritiesSettlement, CurrencyCode> mmCurrencyToBuy = new MMBusinessAttribute<SecuritiesSettlement, CurrencyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CurrencyToBuyOrSell1Choice.mmCurrencyToBuy, CorporateActionOption142.mmCurrencyToBuy);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyToBuy";
			definition = "Account servicer is instructed to buy the indicated currency after the receipt of cash proceeds.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(SecuritiesSettlement obj) {
			return obj.getCurrencyToBuy();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, CurrencyCode value) {
			obj.setCurrencyToBuy(value);
		}
	};
	protected CurrencyCode currencyToSell;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption142#mmCurrencyToSell
	 * CorporateActionOption142.mmCurrencyToSell}</li>
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
	public static final MMBusinessAttribute<SecuritiesSettlement, CurrencyCode> mmCurrencyToSell = new MMBusinessAttribute<SecuritiesSettlement, CurrencyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CurrencyToBuyOrSell1Choice.mmCurrencyToSell, CorporateActionOption142.mmCurrencyToSell);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyToSell";
			definition = "Account servicer is instructed to sell a currency in order to obtain the currency needed to fund the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(SecuritiesSettlement obj) {
			return obj.getCurrencyToSell();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, CurrencyCode value) {
			obj.setCurrencyToSell(value);
		}
	};
	protected Max35Text denominationChoice;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount64#mmDenominationChoice
	 * QuantityAndAccount64.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount63#mmDenominationChoice
	 * QuantityAndAccount63.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount65#mmDenominationChoice
	 * QuantityAndAccount65.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount66#mmDenominationChoice
	 * QuantityAndAccount66.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity14#mmDenominationChoice
	 * Quantity14.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount67#mmDenominationChoice
	 * QuantityAndAccount67.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount68#mmDenominationChoice
	 * QuantityAndAccount68.mmDenominationChoice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70a::DENC</li>
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
	public static final MMBusinessAttribute<SecuritiesSettlement, Max35Text> mmDenominationChoice = new MMBusinessAttribute<SecuritiesSettlement, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(QuantityAndAccount64.mmDenominationChoice, QuantityAndAccount63.mmDenominationChoice, QuantityAndAccount65.mmDenominationChoice, QuantityAndAccount66.mmDenominationChoice,
					Quantity14.mmDenominationChoice, QuantityAndAccount67.mmDenominationChoice, QuantityAndAccount68.mmDenominationChoice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70a::DENC"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DenominationChoice";
			definition = "Denomination (stated value found on financial instruments) of the security to be received or delivered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SecuritiesSettlement obj) {
			return obj.getDenominationChoice();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, Max35Text value) {
			obj.setDenominationChoice(value);
		}
	};
	protected SettlementTransactionConditionCode settlementTransactionCondition;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails147#mmSettlementTransactionCondition
	 * SettlementDetails147.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails147#mmPartialSettlementIndicator
	 * SettlementDetails147.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmSettlementTransactionCondition
	 * SettlementDetails142.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmPartialSettlementIndicator
	 * SettlementDetails142.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmSettlementTransactionCondition
	 * SettlementDetails144.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmPartialSettlementIndicator
	 * SettlementDetails144.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148#mmSettlementTransactionCondition
	 * SettlementDetails148.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148#mmPartialSettlementIndicator
	 * SettlementDetails148.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails141#mmSettlementTransactionCondition
	 * SettlementDetails141.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails141#mmPartialSettlementIndicator
	 * SettlementDetails141.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmSettlementTransactionCondition
	 * SettlementDetails145.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmPartialSettlementIndicator
	 * SettlementDetails145.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmSettlementTransactionCondition
	 * SettlementDetails146.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143#mmSettlementTransactionCondition
	 * SettlementDetails143.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143#mmPartialSettlementIndicator
	 * SettlementDetails143.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails149#mmSettlementTransactionCondition
	 * SettlementDetails149.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails149#mmPartialSettlementIndicator
	 * SettlementDetails149.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmSettlementTransactionCondition
	 * SettlementDetails150.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmPartialSettlementIndicator
	 * SettlementDetails150.mmPartialSettlementIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::STCO</li>
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
	public static final MMBusinessAttribute<SecuritiesSettlement, SettlementTransactionConditionCode> mmSettlementTransactionCondition = new MMBusinessAttribute<SecuritiesSettlement, SettlementTransactionConditionCode>() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementTransactionCondition11Choice.mmCode, SettlementTransactionCondition11Choice.mmProprietary, SettlementDetails43.mmSettlementTransactionCondition,
					RequestDetails15.mmPartialSettlementIndicator, SettlementDetails97.mmSettlementTransactionCondition, SettlementDetails97.mmPartialSettlementIndicator, SettlementTransactionCondition16Choice.mmCode,
					SettlementTransactionCondition16Choice.mmProprietary, SettlementDetails100.mmSettlementTransactionCondition, SettlementTransactionCondition19Choice.mmCode, SettlementTransactionCondition19Choice.mmProprietary,
					SettlementTransactionCondition18Choice.mmCode, SettlementTransactionCondition18Choice.mmProprietary, SettlementTransactionCondition17Choice.mmCode, SettlementTransactionCondition17Choice.mmProprietary,
					SettlementDetails98.mmSettlementTransactionCondition, SettlementDetails98.mmPartialSettlementIndicator, SettlementTransactionCondition20Choice.mmCode, SettlementTransactionCondition20Choice.mmProprietary,
					FundSettlementParameters11.mmSettlementTransactionCondition, FundSettlementParameters12.mmSettlementTransactionCondition, SettlementTransactionCondition30Choice.mmCode,
					SettlementTransactionCondition30Choice.mmProprietary, TradeTransactionCondition8Choice.mmCode, TradeTransactionCondition8Choice.mmProprietary, SettlementDetails147.mmSettlementTransactionCondition,
					SettlementDetails147.mmPartialSettlementIndicator, SettlementDetails142.mmSettlementTransactionCondition, SettlementDetails142.mmPartialSettlementIndicator, SettlementDetails144.mmSettlementTransactionCondition,
					SettlementDetails144.mmPartialSettlementIndicator, SettlementDetails148.mmSettlementTransactionCondition, SettlementDetails148.mmPartialSettlementIndicator, SettlementDetails141.mmSettlementTransactionCondition,
					SettlementDetails141.mmPartialSettlementIndicator, SettlementDetails145.mmSettlementTransactionCondition, SettlementDetails145.mmPartialSettlementIndicator, SettlementDetails146.mmSettlementTransactionCondition,
					SettlementDetails143.mmSettlementTransactionCondition, SettlementDetails143.mmPartialSettlementIndicator, SettlementDetails149.mmSettlementTransactionCondition, SettlementDetails149.mmPartialSettlementIndicator,
					SettlementDetails150.mmSettlementTransactionCondition, SettlementDetails150.mmPartialSettlementIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::STCO"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementTransactionCondition";
			definition = "Conditions under which the order/trade is to be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementTransactionConditionCode.mmObject();
		}

		@Override
		public SettlementTransactionConditionCode getValue(SecuritiesSettlement obj) {
			return obj.getSettlementTransactionCondition();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, SettlementTransactionConditionCode value) {
			obj.setSettlementTransactionCondition(value);
		}
	};
	protected YesNoIndicator beneficialOwnershipIndicator;
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
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnership3Choice#mmIndicator
	 * BeneficialOwnership3Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnership3Choice#mmProprietary
	 * BeneficialOwnership3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmBeneficialOwnership
	 * SettlementDetails43.mmBeneficialOwnership}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails147#mmBeneficialOwnership
	 * SettlementDetails147.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmBeneficialOwnership
	 * SettlementDetails142.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmBeneficialOwnership
	 * SettlementDetails144.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148#mmBeneficialOwnership
	 * SettlementDetails148.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails141#mmBeneficialOwnership
	 * SettlementDetails141.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmBeneficialOwnership
	 * SettlementDetails145.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmBeneficialOwnership
	 * SettlementDetails146.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143#mmBeneficialOwnership
	 * SettlementDetails143.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails149#mmBeneficialOwnership
	 * SettlementDetails149.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmBeneficialOwnership
	 * SettlementDetails150.mmBeneficialOwnership}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::BENE</li>
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
	public static final MMBusinessAttribute<SecuritiesSettlement, YesNoIndicator> mmBeneficialOwnershipIndicator = new MMBusinessAttribute<SecuritiesSettlement, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(BeneficialOwnership3Choice.mmIndicator, BeneficialOwnership3Choice.mmProprietary, SettlementDetails43.mmBeneficialOwnership, SettlementDetails97.mmBeneficialOwnership,
					BeneficialOwnership4Choice.mmIndicator, BeneficialOwnership4Choice.mmProprietary, SettlementDetails98.mmBeneficialOwnership, SettlementDetails147.mmBeneficialOwnership, SettlementDetails142.mmBeneficialOwnership,
					SettlementDetails144.mmBeneficialOwnership, SettlementDetails148.mmBeneficialOwnership, SettlementDetails141.mmBeneficialOwnership, SettlementDetails145.mmBeneficialOwnership, SettlementDetails146.mmBeneficialOwnership,
					SettlementDetails143.mmBeneficialOwnership, SettlementDetails149.mmBeneficialOwnership, SettlementDetails150.mmBeneficialOwnership);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::BENE"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BeneficialOwnershipIndicator";
			definition = "Specifies whether there is change of beneficial ownership.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesSettlement obj) {
			return obj.getBeneficialOwnershipIndicator();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, YesNoIndicator value) {
			obj.setBeneficialOwnershipIndicator(value);
		}
	};
	protected MarketClientSideCode marketClientSide;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails147#mmMarketClientSide
	 * SettlementDetails147.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmMarketClientSide
	 * SettlementDetails142.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmMarketClientSide
	 * SettlementDetails144.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148#mmMarketClientSide
	 * SettlementDetails148.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails141#mmMarketClientSide
	 * SettlementDetails141.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmMarketClientSide
	 * SettlementDetails145.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmMarketClientSide
	 * SettlementDetails146.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide6Choice#mmCode
	 * MarketClientSide6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide6Choice#mmProprietary
	 * MarketClientSide6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143#mmMarketClientSide
	 * SettlementDetails143.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails149#mmMarketClientSide
	 * SettlementDetails149.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmMarketClientSide
	 * SettlementDetails150.mmMarketClientSide}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::MACL</li>
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
	public static final MMBusinessAttribute<SecuritiesSettlement, MarketClientSideCode> mmMarketClientSide = new MMBusinessAttribute<SecuritiesSettlement, MarketClientSideCode>() {
		{
			derivation_lazy = () -> Arrays.asList(MarketClientSide3Choice.mmCode, MarketClientSide3Choice.mmProprietary, SettlementDetails43.mmMarketClientSide, SettlementDetails97.mmMarketClientSide, MarketClientSide4Choice.mmCode,
					MarketClientSide4Choice.mmProprietary, SettlementDetails98.mmMarketClientSide, SettlementDetails147.mmMarketClientSide, SettlementDetails142.mmMarketClientSide, SettlementDetails144.mmMarketClientSide,
					SettlementDetails148.mmMarketClientSide, SettlementDetails141.mmMarketClientSide, SettlementDetails145.mmMarketClientSide, SettlementDetails146.mmMarketClientSide, MarketClientSide6Choice.mmCode,
					MarketClientSide6Choice.mmProprietary, SettlementDetails143.mmMarketClientSide, SettlementDetails149.mmMarketClientSide, SettlementDetails150.mmMarketClientSide);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::MACL"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketClientSide";
			definition = "Specifies if an instruction is for a market side or a client side transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MarketClientSideCode.mmObject();
		}

		@Override
		public MarketClientSideCode getValue(SecuritiesSettlement obj) {
			return obj.getMarketClientSide();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, MarketClientSideCode value) {
			obj.setMarketClientSide(value);
		}
	};
	protected YesNoIndicator tracking;
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmTracking
	 * SettlementDetails43.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmTracking
	 * SettlementDetails97.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmTracking
	 * SettlementDetails142.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148#mmTracking
	 * SettlementDetails148.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmTracking
	 * SettlementDetails145.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmTracking
	 * SettlementDetails146.mmTracking}</li>
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
	public static final MMBusinessAttribute<SecuritiesSettlement, YesNoIndicator> mmTracking = new MMBusinessAttribute<SecuritiesSettlement, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementDetails43.mmTracking, SettlementDetails97.mmTracking, SettlementDetails142.mmTracking, SettlementDetails148.mmTracking, SettlementDetails145.mmTracking,
					SettlementDetails146.mmTracking);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Tracking";
			definition = "Specifies whether the loan and/or collateral is tracked.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesSettlement obj) {
			return obj.getTracking();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, YesNoIndicator value) {
			obj.setTracking(value);
		}
	};
	protected YesNoIndicator letterOfGuarantee;
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmLetterOfGuarantee
	 * SettlementDetails142.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmLetterOfGuarantee
	 * SettlementDetails144.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmLetterOfGuarantee
	 * SettlementDetails145.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmLetterOfGuarantee
	 * SettlementDetails146.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143#mmLetterOfGuarantee
	 * SettlementDetails143.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails149#mmLetterOfGuarantee
	 * SettlementDetails149.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmLetterOfGuarantee
	 * SettlementDetails150.mmLetterOfGuarantee}</li>
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
	public static final MMBusinessAttribute<SecuritiesSettlement, YesNoIndicator> mmLetterOfGuarantee = new MMBusinessAttribute<SecuritiesSettlement, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(LetterOfGuarantee3Choice.mmIndicator, LetterOfGuarantee3Choice.mmProprietary, SettlementDetails43.mmLetterOfGuarantee, LetterOfGuarantee4Choice.mmIndicator,
					LetterOfGuarantee4Choice.mmProprietary, SettlementDetails142.mmLetterOfGuarantee, SettlementDetails144.mmLetterOfGuarantee, SettlementDetails145.mmLetterOfGuarantee, SettlementDetails146.mmLetterOfGuarantee,
					SettlementDetails143.mmLetterOfGuarantee, SettlementDetails149.mmLetterOfGuarantee, SettlementDetails150.mmLetterOfGuarantee);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LetterOfGuarantee";
			definition = "Specifies whether physical settlement may be executed using a letter of guarantee or if the physical certificates should be used.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesSettlement obj) {
			return obj.getLetterOfGuarantee();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, YesNoIndicator value) {
			obj.setLetterOfGuarantee(value);
		}
	};
	protected YesNoIndicator eligibleForCollateral;
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmEligibleForCollateral
	 * SettlementDetails43.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmEligibleForCollateral
	 * SettlementDetails97.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#mmEligibleForCollateral
	 * SettlementDetails98.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails147#mmEligibleForCollateral
	 * SettlementDetails147.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmEligibleForCollateral
	 * SettlementDetails142.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmEligibleForCollateral
	 * SettlementDetails144.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148#mmEligibleForCollateral
	 * SettlementDetails148.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmEligibleForCollateral
	 * SettlementDetails145.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmEligibleForCollateral
	 * SettlementDetails146.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143#mmEligibleForCollateral
	 * SettlementDetails143.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption142#mmEligibleForCollateralIndicator
	 * CorporateActionOption142.mmEligibleForCollateralIndicator}</li>
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
	public static final MMBusinessAttribute<SecuritiesSettlement, YesNoIndicator> mmEligibleForCollateral = new MMBusinessAttribute<SecuritiesSettlement, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementDetails43.mmEligibleForCollateral, SettlementDetails97.mmEligibleForCollateral, SettlementDetails98.mmEligibleForCollateral, SettlementDetails147.mmEligibleForCollateral,
					SettlementDetails142.mmEligibleForCollateral, SettlementDetails144.mmEligibleForCollateral, SettlementDetails148.mmEligibleForCollateral, SettlementDetails145.mmEligibleForCollateral,
					SettlementDetails146.mmEligibleForCollateral, SettlementDetails143.mmEligibleForCollateral, CorporateActionOption142.mmEligibleForCollateralIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EligibleForCollateral";
			definition = "Specifies whether securities should be included in the pool of securities eligible for collateral purposes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesSettlement obj) {
			return obj.getEligibleForCollateral();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, YesNoIndicator value) {
			obj.setEligibleForCollateral(value);
		}
	};
	protected YesNoIndicator accruedInterestIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection28#mmAccruedInterestIndicator
	 * AmountAndDirection28.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection87#mmAccruedInterestIndicator
	 * AmountAndDirection87.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection89#mmAccruedInterestIndicator
	 * AmountAndDirection89.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmAccruedInterestIndicator
	 * CorporateAction41.mmAccruedInterestIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :17B::ACRU</li>
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
	public static final MMBusinessAttribute<SecuritiesSettlement, YesNoIndicator> mmAccruedInterestIndicator = new MMBusinessAttribute<SecuritiesSettlement, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(AmountAndDirection28.mmAccruedInterestIndicator, AmountAndDirection87.mmAccruedInterestIndicator, AmountAndDirection89.mmAccruedInterestIndicator,
					CorporateAction41.mmAccruedInterestIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::ACRU"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccruedInterestIndicator";
			definition = "Indicates whether the net proceeds include interest accrued on the financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesSettlement obj) {
			return obj.getAccruedInterestIndicator();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, YesNoIndicator value) {
			obj.setAccruedInterestIndicator(value);
		}
	};
	protected PreConfirmationCode preConfirmation;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PREC</li>
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
	public static final MMBusinessAttribute<SecuritiesSettlement, PreConfirmationCode> mmPreConfirmation = new MMBusinessAttribute<SecuritiesSettlement, PreConfirmationCode>() {
		{
			derivation_lazy = () -> Arrays.asList(AdditionalParameters24.mmPreConfirmation, AdditionalParameters29.mmPreConfirmation, AdditionalParameters30.mmPreConfirmation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PREC"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreConfirmation";
			definition = "Pre-confirmation of the cash transfer pending the securities transfer, or vice versa.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PreConfirmationCode.mmObject();
		}

		@Override
		public PreConfirmationCode getValue(SecuritiesSettlement obj) {
			return obj.getPreConfirmation();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, PreConfirmationCode value) {
			obj.setPreConfirmation(value);
		}
	};
	protected YesNoIndicator securitiesRealTimeGrossSettlement;
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails147#mmSecuritiesRTGS
	 * SettlementDetails147.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmSecuritiesRTGS
	 * SettlementDetails142.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmSecuritiesRTGS
	 * SettlementDetails144.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148#mmSecuritiesRTGS
	 * SettlementDetails148.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails141#mmSecuritiesRTGS
	 * SettlementDetails141.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmSecuritiesRTGS
	 * SettlementDetails145.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143#mmSecuritiesRTGS
	 * SettlementDetails143.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails149#mmSecuritiesRTGS
	 * SettlementDetails149.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmSecuritiesRTGS
	 * SettlementDetails150.mmSecuritiesRTGS}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::RTGS</li>
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
	public static final MMBusinessAttribute<SecuritiesSettlement, YesNoIndicator> mmSecuritiesRealTimeGrossSettlement = new MMBusinessAttribute<SecuritiesSettlement, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesRTGS3Choice.mmIndicator, SecuritiesRTGS3Choice.mmProprietary, SettlementDetails43.mmSecuritiesRTGS, RequestDetails15.mmSecuritiesRTGS, SettlementDetails97.mmSecuritiesRTGS,
					SettlementDetails100.mmSecuritiesRTGS, SecuritiesRTGS4Choice.mmIndicator, SecuritiesRTGS4Choice.mmProprietary, SettlementDetails98.mmSecuritiesRTGS, SettlementDetails147.mmSecuritiesRTGS,
					SettlementDetails142.mmSecuritiesRTGS, SettlementDetails144.mmSecuritiesRTGS, SettlementDetails148.mmSecuritiesRTGS, SettlementDetails141.mmSecuritiesRTGS, SettlementDetails145.mmSecuritiesRTGS,
					SettlementDetails143.mmSecuritiesRTGS, SettlementDetails149.mmSecuritiesRTGS, SettlementDetails150.mmSecuritiesRTGS);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::RTGS"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesRealTimeGrossSettlement";
			definition = "Specifies whether the settlement transaction is to be settled through an RTGS or a non RTGS system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesSettlement obj) {
			return obj.getSecuritiesRealTimeGrossSettlement();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, YesNoIndicator value) {
			obj.setSecuritiesRealTimeGrossSettlement(value);
		}
	};
	protected BlockTradeCode blockTrade;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails147#mmBlockTrade
	 * SettlementDetails147.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmBlockTrade
	 * SettlementDetails142.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmBlockTrade
	 * SettlementDetails144.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148#mmBlockTrade
	 * SettlementDetails148.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmBlockTrade
	 * SettlementDetails145.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143#mmBlockTrade
	 * SettlementDetails143.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails149#mmBlockTrade
	 * SettlementDetails149.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmBlockTrade
	 * SettlementDetails150.mmBlockTrade}</li>
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
	public static final MMBusinessAttribute<SecuritiesSettlement, BlockTradeCode> mmBlockTrade = new MMBusinessAttribute<SecuritiesSettlement, BlockTradeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(BlockTrade3Choice.mmCode, BlockTrade3Choice.mmProprietary, SettlementDetails43.mmBlockTrade, SettlementDetails97.mmBlockTrade, BlockTrade4Choice.mmCode, BlockTrade4Choice.mmProprietary,
					SettlementDetails98.mmBlockTrade, SettlementDetails147.mmBlockTrade, SettlementDetails142.mmBlockTrade, SettlementDetails144.mmBlockTrade, SettlementDetails148.mmBlockTrade, SettlementDetails145.mmBlockTrade,
					SettlementDetails143.mmBlockTrade, SettlementDetails149.mmBlockTrade, SettlementDetails150.mmBlockTrade);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BlockTrade";
			definition = "Specifies whether the settlement instruction is a block parent or child.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BlockTradeCode.mmObject();
		}

		@Override
		public BlockTradeCode getValue(SecuritiesSettlement obj) {
			return obj.getBlockTrade();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, BlockTradeCode value) {
			obj.setBlockTrade(value);
		}
	};
	protected SettlementSystemMethodCode settlementSystemMethod;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails147#mmSettlementSystemMethod
	 * SettlementDetails147.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmSettlementSystemMethod
	 * SettlementDetails142.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmSettlementSystemMethod
	 * SettlementDetails144.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148#mmSettlementSystemMethod
	 * SettlementDetails148.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmSettlementSystemMethod
	 * SettlementDetails145.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143#mmSettlementSystemMethod
	 * SettlementDetails143.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails149#mmSettlementSystemMethod
	 * SettlementDetails149.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmSettlementSystemMethod
	 * SettlementDetails150.mmSettlementSystemMethod}</li>
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
	public static final MMBusinessAttribute<SecuritiesSettlement, SettlementSystemMethodCode> mmSettlementSystemMethod = new MMBusinessAttribute<SecuritiesSettlement, SettlementSystemMethodCode>() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementSystemMethod3Choice.mmCode, SettlementSystemMethod3Choice.mmProprietary, SettlementDetails43.mmSettlementSystemMethod, SettlementDetails97.mmSettlementSystemMethod,
					SettlementDetails100.mmSettlementSystemMethod, SettlementSystemMethod4Choice.mmCode, SettlementSystemMethod4Choice.mmProprietary, SettlementDetails98.mmSettlementSystemMethod,
					SettlementDetails147.mmSettlementSystemMethod, SettlementDetails142.mmSettlementSystemMethod, SettlementDetails144.mmSettlementSystemMethod, SettlementDetails148.mmSettlementSystemMethod,
					SettlementDetails145.mmSettlementSystemMethod, SettlementDetails143.mmSettlementSystemMethod, SettlementDetails149.mmSettlementSystemMethod, SettlementDetails150.mmSettlementSystemMethod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementSystemMethod";
			definition = "Specifies whether the settlement instruction is to be settled through the default or the alternate settlement system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementSystemMethodCode.mmObject();
		}

		@Override
		public SettlementSystemMethodCode getValue(SecuritiesSettlement obj) {
			return obj.getSettlementSystemMethod();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, SettlementSystemMethodCode value) {
			obj.setSettlementSystemMethod(value);
		}
	};
	protected AutoBorrowingCode automaticBorrowing;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails147#mmAutomaticBorrowing
	 * SettlementDetails147.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmAutomaticBorrowing
	 * SettlementDetails142.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmAutomaticBorrowing
	 * SettlementDetails144.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148#mmAutomaticBorrowing
	 * SettlementDetails148.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmAutomaticBorrowing
	 * SettlementDetails145.mmAutomaticBorrowing}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::BORR</li>
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
	public static final MMBusinessAttribute<SecuritiesSettlement, AutoBorrowingCode> mmAutomaticBorrowing = new MMBusinessAttribute<SecuritiesSettlement, AutoBorrowingCode>() {
		{
			derivation_lazy = () -> Arrays.asList(AutomaticBorrowing5Choice.mmCode, AutomaticBorrowing5Choice.mmProprietary, SettlementDetails43.mmAutomaticBorrowing, CommissionType5Choice.mmProprietary,
					RequestDetails15.mmAutomaticBorrowing, SettlementDetails97.mmAutomaticBorrowing, AutomaticBorrowing6Choice.mmCode, AutomaticBorrowing6Choice.mmProprietary, AutomaticBorrowing7Choice.mmCode,
					AutomaticBorrowing7Choice.mmProprietary, SettlementDetails147.mmAutomaticBorrowing, SettlementDetails142.mmAutomaticBorrowing, SettlementDetails144.mmAutomaticBorrowing, SettlementDetails148.mmAutomaticBorrowing,
					SettlementDetails145.mmAutomaticBorrowing);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::BORR"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AutomaticBorrowing";
			definition = "Condition for automatic borrowing.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AutoBorrowingCode.mmObject();
		}

		@Override
		public AutoBorrowingCode getValue(SecuritiesSettlement obj) {
			return obj.getAutomaticBorrowing();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, AutoBorrowingCode value) {
			obj.setAutomaticBorrowing(value);
		}
	};
	protected YesNoIndicator partialSettlementIndicator;
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
	public static final MMBusinessAttribute<SecuritiesSettlement, YesNoIndicator> mmPartialSettlementIndicator = new MMBusinessAttribute<SecuritiesSettlement, YesNoIndicator>() {
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

		@Override
		public YesNoIndicator getValue(SecuritiesSettlement obj) {
			return obj.getPartialSettlementIndicator();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, YesNoIndicator value) {
			obj.setPartialSettlementIndicator(value);
		}
	};
	protected YesNoIndicator holdIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmHoldIndicator
	 * SettlementDetails142.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148#mmHoldIndicator
	 * SettlementDetails148.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails141#mmHoldIndicator
	 * SettlementDetails141.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmHoldIndicator
	 * SettlementDetails145.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143#mmHoldIndicator
	 * SettlementDetails143.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails149#mmHoldIndicator
	 * SettlementDetails149.mmHoldIndicator}</li>
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
	public static final MMBusinessAttribute<SecuritiesSettlement, YesNoIndicator> mmHoldIndicator = new MMBusinessAttribute<SecuritiesSettlement, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementDetails43.mmHoldIndicator, RequestDetails15.mmHoldIndicator, SettlementDetails97.mmHoldIndicator, HoldIndicator6.mmIndicator, SettlementDetails98.mmHoldIndicator,
					SettlementDetails142.mmHoldIndicator, SettlementDetails148.mmHoldIndicator, SettlementDetails141.mmHoldIndicator, SettlementDetails145.mmHoldIndicator, SettlementDetails143.mmHoldIndicator,
					SettlementDetails149.mmHoldIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HoldIndicator";
			definition = "Specifies whether the transaction is on hold/blocked/frozen.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesSettlement obj) {
			return obj.getHoldIndicator();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, YesNoIndicator value) {
			obj.setHoldIndicator(value);
		}
	};
	protected SafekeepingPlace requestedSafekeepingPlace;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :94a::SAFE</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesSettlement, SafekeepingPlace> mmRequestedSafekeepingPlace = new MMBusinessAssociationEnd<SecuritiesSettlement, SafekeepingPlace>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94a::SAFE"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedSafekeepingPlace";
			definition = "Place requested as the place of safekeeping.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SafekeepingPlace.mmSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SafekeepingPlace.mmObject();
		}

		@Override
		public SafekeepingPlace getValue(SecuritiesSettlement obj) {
			return obj.getRequestedSafekeepingPlace();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, SafekeepingPlace value) {
			obj.setRequestedSafekeepingPlace(value);
		}
	};
	protected List<com.tools20022.repository.entity.PairOff> pairOff;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesSettlement, List<PairOff>> mmPairOff = new MMBusinessAssociationEnd<SecuritiesSettlement, List<PairOff>>() {
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

		@Override
		public List<PairOff> getValue(SecuritiesSettlement obj) {
			return obj.getPairOff();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, List<PairOff> value) {
			obj.setPairOff(value);
		}
	};
	protected List<Interest> accruedInterest;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesSettlement, List<Interest>> mmAccruedInterest = new MMBusinessAssociationEnd<SecuritiesSettlement, List<Interest>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccruedInterest";
			definition = "Interest included in the settlement.";
			minOccurs = 0;
			opposite_lazy = () -> Interest.mmSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Interest.mmObject();
		}

		@Override
		public List<Interest> getValue(SecuritiesSettlement obj) {
			return obj.getAccruedInterest();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, List<Interest> value) {
			obj.setAccruedInterest(value);
		}
	};
	protected SecuritiesClearing securitiesClearing;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesSettlement, com.tools20022.repository.entity.SecuritiesClearing> mmSecuritiesClearing = new MMBusinessAssociationEnd<SecuritiesSettlement, com.tools20022.repository.entity.SecuritiesClearing>() {
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

		@Override
		public com.tools20022.repository.entity.SecuritiesClearing getValue(SecuritiesSettlement obj) {
			return obj.getSecuritiesClearing();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, com.tools20022.repository.entity.SecuritiesClearing value) {
			obj.setSecuritiesClearing(value);
		}
	};
	protected Payment payment;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesSettlement, Optional<Payment>> mmPayment = new MMBusinessAssociationEnd<SecuritiesSettlement, Optional<Payment>>() {
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

		@Override
		public Optional<Payment> getValue(SecuritiesSettlement obj) {
			return obj.getPayment();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, Optional<Payment> value) {
			obj.setPayment(value.orElse(null));
		}
	};
	protected Allocation settledAllocation;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesSettlement, Optional<Allocation>> mmSettledAllocation = new MMBusinessAssociationEnd<SecuritiesSettlement, Optional<Allocation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettledAllocation";
			definition = "Allocation which is settled.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Allocation.mmSettlementExecutionParameters;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Allocation.mmObject();
		}

		@Override
		public Optional<Allocation> getValue(SecuritiesSettlement obj) {
			return obj.getSettledAllocation();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, Optional<Allocation> value) {
			obj.setSettledAllocation(value.orElse(null));
		}
	};
	protected List<ForeignExchangeTrade> relatedForeignExchangeOperation;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesSettlement, List<ForeignExchangeTrade>> mmRelatedForeignExchangeOperation = new MMBusinessAssociationEnd<SecuritiesSettlement, List<ForeignExchangeTrade>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedForeignExchangeOperation";
			definition = "Entry details related to currency exchange information.";
			minOccurs = 0;
			opposite_lazy = () -> ForeignExchangeTrade.mmCurrencyExchangeForSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ForeignExchangeTrade.mmObject();
		}

		@Override
		public List<ForeignExchangeTrade> getValue(SecuritiesSettlement obj) {
			return obj.getRelatedForeignExchangeOperation();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, List<ForeignExchangeTrade> value) {
			obj.setRelatedForeignExchangeOperation(value);
		}
	};
	protected List<com.tools20022.repository.entity.Security> security;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails34#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails34.mmFinancialInstrumentAttributes}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails33#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails33.mmFinancialInstrumentAttributes}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails32.mmFinancialInstrumentAttributes}
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
	public static final MMBusinessAssociationEnd<SecuritiesSettlement, List<Security>> mmSecurity = new MMBusinessAssociationEnd<SecuritiesSettlement, List<Security>>() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionDetails34.mmFinancialInstrumentAttributes, SecuritiesSettlementTransactionDetails33.mmFinancialInstrumentAttributes,
					SecuritiesSettlementTransactionDetails32.mmFinancialInstrumentAttributes);
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

		@Override
		public List<Security> getValue(SecuritiesSettlement obj) {
			return obj.getSecurity();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, List<Security> value) {
			obj.setSecurity(value);
		}
	};
	protected Position position;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesSettlement, com.tools20022.repository.entity.Position> mmPosition = new MMBusinessAssociationEnd<SecuritiesSettlement, com.tools20022.repository.entity.Position>() {
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

		@Override
		public com.tools20022.repository.entity.Position getValue(SecuritiesSettlement obj) {
			return obj.getPosition();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, com.tools20022.repository.entity.Position value) {
			obj.setPosition(value);
		}
	};
	protected Rollover rollover;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesSettlement, Optional<Rollover>> mmRollover = new MMBusinessAssociationEnd<SecuritiesSettlement, Optional<Rollover>>() {
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

		@Override
		public Optional<Rollover> getValue(SecuritiesSettlement obj) {
			return obj.getRollover();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, Optional<Rollover> value) {
			obj.setRollover(value.orElse(null));
		}
	};
	protected SecuritiesQuantity turnedQuantity;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesSettlement, SecuritiesQuantity> mmTurnedQuantity = new MMBusinessAssociationEnd<SecuritiesSettlement, SecuritiesQuantity>() {
		{
			derivation_lazy = () -> Arrays.asList(PairedOrTurnedQuantity3Choice.mmTurnedQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TurnedQuantity";
			definition = "Relates to a turnaround: the same security is bought and sold to settle the same day, to or from different brokers.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuantity.mmRelatedTurnaroundSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public SecuritiesQuantity getValue(SecuritiesSettlement obj) {
			return obj.getTurnedQuantity();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, SecuritiesQuantity value) {
			obj.setTurnedQuantity(value);
		}
	};
	protected ObligationTypeCode settlementReason;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesSettlement, ObligationTypeCode> mmSettlementReason = new MMBusinessAttribute<SecuritiesSettlement, ObligationTypeCode>() {
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

		@Override
		public ObligationTypeCode getValue(SecuritiesSettlement obj) {
			return obj.getSettlementReason();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, ObligationTypeCode value) {
			obj.setSettlementReason(value);
		}
	};
	protected DeliveryReceiptTypeCode settlementType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71#mmPayment
	 * SecuritiesTradeDetails71.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails105#mmPayment
	 * TransactionDetails105.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmPayment
	 * SecuritiesTradeDetails72.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails104#mmPayment
	 * TransactionDetails104.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails103#mmPayment
	 * TransactionDetails103.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification25#mmPayment
	 * SettlementTypeAndIdentification25.mmPayment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22a::PAYM</li>
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
	public static final MMBusinessAttribute<SecuritiesSettlement, DeliveryReceiptTypeCode> mmSettlementType = new MMBusinessAttribute<SecuritiesSettlement, DeliveryReceiptTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementObligation5.mmPayment, Order17.mmPayment, Order18.mmPayment, SettlementObligation8.mmPayment, TransactionDetails81.mmPayment, TransactionDetails82.mmPayment,
					SettlementTypeAndIdentification18.mmPayment, SettlementTypeAndIdentification19.mmPayment, SettlementTypeAndAdditionalParameters12.mmPayment, SettlementTypeAndAdditionalParameters14.mmPayment,
					SwitchExecution7.mmSettlementMethod, SwitchOrder7.mmSettlementMethod, RedemptionOrder14.mmSettlementMethod, SubscriptionExecution13.mmSettlementMethod, SubscriptionExecution12.mmSettlementMethod,
					SubscriptionOrder15.mmSettlementMethod, RedemptionOrder15.mmSettlementMethod, RedemptionExecution16.mmSettlementMethod, SubscriptionOrder14.mmSettlementMethod, FundOrderData6.mmSettlementMethod,
					RedemptionExecution15.mmSettlementMethod, SettlementTypeAndAdditionalParameters19.mmPayment, TransactionTypeAndAdditionalParameters15.mmPayment, TransactionTypeAndAdditionalParameters17.mmPayment,
					TransactionTypeAndAdditionalParameters16.mmPayment, SecuritiesFinancingTransactionDetails35.mmPayment, SecuritiesTradeDetails71.mmPayment, TransactionDetails105.mmPayment, SecuritiesTradeDetails72.mmPayment,
					TransactionDetails104.mmPayment, TransactionDetails103.mmPayment, SettlementTypeAndIdentification25.mmPayment);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22a::PAYM"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementType";
			definition = "Specifies how the transaction is to be settled, eg, against payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DeliveryReceiptTypeCode.mmObject();
		}

		@Override
		public DeliveryReceiptTypeCode getValue(SecuritiesSettlement obj) {
			return obj.getSettlementType();
		}

		@Override
		public void setValue(SecuritiesSettlement obj, DeliveryReceiptTypeCode value) {
			obj.setSettlementType(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlement";
				definition = "Settlement of the securities in a securities transaction, that is, the instruction to deliver or receive securities, involving the payment of an amount of money or not.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmSecuritiesSettlement, com.tools20022.repository.entity.Payment.mmRelatedSecuritiesSettlement,
						SecuritiesQuantity.mmSecuritiesSettlement, SecuritiesQuantity.mmRelatedTurnaroundSettlement, SecuritiesTransfer.mmRelatedSettlement, SecuritiesSettlementPartyRole.mmSecuritiesSettlement,
						Interest.mmSecuritiesSettlement, SafekeepingPlace.mmSecuritiesSettlement, com.tools20022.repository.entity.SecuritiesTradeExecution.mmSecuritiesSettlement,
						ForeignExchangeTrade.mmCurrencyExchangeForSecuritiesSettlement, Allocation.mmSettlementExecutionParameters, com.tools20022.repository.entity.PairOff.mmRelatedSecuritiesSettlement,
						com.tools20022.repository.entity.Rollover.mmSecuritiesSettlement, com.tools20022.repository.entity.SecuritiesClearing.mmSecuritiesSettlement, com.tools20022.repository.entity.Position.mmSecuritiesSettlement);
				derivationElement_lazy = () -> Arrays
						.asList(RequestDetails15.mmUnilateralSplit, SecuritiesFinancingTransactionDetails35.mmSettlementParameters, SecuritiesSettlementTransactionDetails34.mmSettlementTypeAndAdditionalParameters,
								SecuritiesSettlementTransactionDetails34.mmQuantityAndAccountDetails, SecuritiesSettlementTransactionDetails34.mmSettlementParameters,
								SecuritiesSettlementTransactionDetails33.mmSettlementTypeAndAdditionalParameters, SecuritiesSettlementTransactionDetails33.mmQuantityAndAccountDetails,
								SecuritiesSettlementTransactionDetails33.mmSettlementParameters, SecuritiesSettlementTransactionDetails32.mmSettlementTypeAndAdditionalParameters,
								SecuritiesSettlementTransactionDetails32.mmQuantityAndAccountDetails, SecuritiesSettlementTransactionDetails32.mmSettlementParameters);
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
						AmountAndDirection21.mmObject(), Settlement1.mmObject(), SettlementObligation7.mmObject(), SettlementObligation8.mmObject(), QuantityAndAccount40.mmObject(), QuantityAndAccount38.mmObject(),
						SettlementTypeAndIdentification18.mmObject(), SettlementTypeAndIdentification19.mmObject(), RequestDetails15.mmObject(), SettlementDetails97.mmObject(), AmountAndDirection49.mmObject(),
						SettlementTypeAndAdditionalParameters12.mmObject(), AmountAndDirection44.mmObject(), SettlementTransactionCondition16Choice.mmObject(), SettlementTypeAndAdditionalParameters14.mmObject(),
						AmountAndDirection51.mmObject(), SettlementDetails100.mmObject(), SettlementTransactionCondition19Choice.mmObject(), AmountAndDirection52.mmObject(), BlockTrade4Choice.mmObject(),
						BeneficialOwnership4Choice.mmObject(), SettlementTransactionCondition18Choice.mmObject(), AutomaticBorrowing6Choice.mmObject(), AmountAndDirection47.mmObject(), HoldIndicator6.mmObject(),
						SettlementTypeAndAdditionalParameters13.mmObject(), PairedOrTurnedQuantity3Choice.mmObject(), AutomaticBorrowing7Choice.mmObject(), SettlementTransactionCondition17Choice.mmObject(), SettlementDetails98.mmObject(),
						SettlementTransactionCondition20Choice.mmObject(), SettlementDetails102.mmObject(), FundSettlementParameters11.mmObject(), FundSettlementParameters12.mmObject(), SettlementTransactionCondition30Choice.mmObject(),
						TradeTransactionCondition8Choice.mmObject(), SettlementTypeAndAdditionalParameters19.mmObject(), TransactionTypeAndAdditionalParameters15.mmObject(), TransactionTypeAndAdditionalParameters17.mmObject(),
						TransactionTypeAndAdditionalParameters16.mmObject(), AdditionalInformation13.mmObject(), SettlementDetails118.mmObject(), ReceiveInformation18.mmObject(), DeliverInformation19.mmObject(),
						ReceiveInformation19.mmObject(), DeliverInformation18.mmObject(), SettlementDetails147.mmObject(), SettlementDetails142.mmObject(), QuantityAndAccount64.mmObject(), SettlementDetails144.mmObject(),
						SettlementDetails148.mmObject(), QuantityAndAccount63.mmObject(), SettlementDetails141.mmObject(), SettlementDetails145.mmObject(), SecuritiesTransactionType36Choice.mmObject(),
						SecuritiesSettlementTransactionDetails34.mmObject(), SettlementDetails146.mmObject(), SecuritiesTransactionType37Choice.mmObject(), SecuritiesSettlementTransactionDetails33.mmObject(),
						SettlementDetails143.mmObject(), SecuritiesSettlementTransactionDetails32.mmObject(), SecuritiesTransactionType38Choice.mmObject(), SettlementDetails149.mmObject(), SettlementDetails150.mmObject(),
						QuantityAndAccount65.mmObject(), QuantityAndAccount66.mmObject(), QuantityAndAccount67.mmObject(), QuantityAndAccount68.mmObject(), AmountAndDirection87.mmObject(), AmountAndDirection88.mmObject(),
						AmountAndDirection89.mmObject(), SettlementTypeAndIdentification25.mmObject());
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

	public SecuritiesSettlement setTransferOperation(SecuritiesTransfer transferOperation) {
		this.transferOperation = Objects.requireNonNull(transferOperation);
		return this;
	}

	public ISODateTime getSettlementDate() {
		return settlementDate;
	}

	public SecuritiesSettlement setSettlementDate(ISODateTime settlementDate) {
		this.settlementDate = Objects.requireNonNull(settlementDate);
		return this;
	}

	public List<SecuritiesSettlementPartyRole> getPartyRole() {
		return partyRole == null ? partyRole = new ArrayList<>() : partyRole;
	}

	public SecuritiesSettlement setPartyRole(List<SecuritiesSettlementPartyRole> partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}

	public ActiveCurrencyAndAmount getSettlementAmount() {
		return settlementAmount;
	}

	public SecuritiesSettlement setSettlementAmount(ActiveCurrencyAndAmount settlementAmount) {
		this.settlementAmount = Objects.requireNonNull(settlementAmount);
		return this;
	}

	public Max35Text getHoldingsPlanType() {
		return holdingsPlanType;
	}

	public SecuritiesSettlement setHoldingsPlanType(Max35Text holdingsPlanType) {
		this.holdingsPlanType = Objects.requireNonNull(holdingsPlanType);
		return this;
	}

	public ReceiveDeliveryCode getSecuritiesMovementType() {
		return securitiesMovementType;
	}

	public SecuritiesSettlement setSecuritiesMovementType(ReceiveDeliveryCode securitiesMovementType) {
		this.securitiesMovementType = Objects.requireNonNull(securitiesMovementType);
		return this;
	}

	public SecuritiesQuantity getSettlementQuantity() {
		return settlementQuantity;
	}

	public SecuritiesSettlement setSettlementQuantity(SecuritiesQuantity settlementQuantity) {
		this.settlementQuantity = Objects.requireNonNull(settlementQuantity);
		return this;
	}

	public SecuritiesTradeExecution getSecuritiesTradeExecution() {
		return securitiesTradeExecution;
	}

	public SecuritiesSettlement setSecuritiesTradeExecution(com.tools20022.repository.entity.SecuritiesTradeExecution securitiesTradeExecution) {
		this.securitiesTradeExecution = Objects.requireNonNull(securitiesTradeExecution);
		return this;
	}

	public CurrencyCode getCurrencyToBuy() {
		return currencyToBuy;
	}

	public SecuritiesSettlement setCurrencyToBuy(CurrencyCode currencyToBuy) {
		this.currencyToBuy = Objects.requireNonNull(currencyToBuy);
		return this;
	}

	public CurrencyCode getCurrencyToSell() {
		return currencyToSell;
	}

	public SecuritiesSettlement setCurrencyToSell(CurrencyCode currencyToSell) {
		this.currencyToSell = Objects.requireNonNull(currencyToSell);
		return this;
	}

	public Max35Text getDenominationChoice() {
		return denominationChoice;
	}

	public SecuritiesSettlement setDenominationChoice(Max35Text denominationChoice) {
		this.denominationChoice = Objects.requireNonNull(denominationChoice);
		return this;
	}

	public SettlementTransactionConditionCode getSettlementTransactionCondition() {
		return settlementTransactionCondition;
	}

	public SecuritiesSettlement setSettlementTransactionCondition(SettlementTransactionConditionCode settlementTransactionCondition) {
		this.settlementTransactionCondition = Objects.requireNonNull(settlementTransactionCondition);
		return this;
	}

	public YesNoIndicator getBeneficialOwnershipIndicator() {
		return beneficialOwnershipIndicator;
	}

	public SecuritiesSettlement setBeneficialOwnershipIndicator(YesNoIndicator beneficialOwnershipIndicator) {
		this.beneficialOwnershipIndicator = Objects.requireNonNull(beneficialOwnershipIndicator);
		return this;
	}

	public MarketClientSideCode getMarketClientSide() {
		return marketClientSide;
	}

	public SecuritiesSettlement setMarketClientSide(MarketClientSideCode marketClientSide) {
		this.marketClientSide = Objects.requireNonNull(marketClientSide);
		return this;
	}

	public YesNoIndicator getTracking() {
		return tracking;
	}

	public SecuritiesSettlement setTracking(YesNoIndicator tracking) {
		this.tracking = Objects.requireNonNull(tracking);
		return this;
	}

	public YesNoIndicator getLetterOfGuarantee() {
		return letterOfGuarantee;
	}

	public SecuritiesSettlement setLetterOfGuarantee(YesNoIndicator letterOfGuarantee) {
		this.letterOfGuarantee = Objects.requireNonNull(letterOfGuarantee);
		return this;
	}

	public YesNoIndicator getEligibleForCollateral() {
		return eligibleForCollateral;
	}

	public SecuritiesSettlement setEligibleForCollateral(YesNoIndicator eligibleForCollateral) {
		this.eligibleForCollateral = Objects.requireNonNull(eligibleForCollateral);
		return this;
	}

	public YesNoIndicator getAccruedInterestIndicator() {
		return accruedInterestIndicator;
	}

	public SecuritiesSettlement setAccruedInterestIndicator(YesNoIndicator accruedInterestIndicator) {
		this.accruedInterestIndicator = Objects.requireNonNull(accruedInterestIndicator);
		return this;
	}

	public PreConfirmationCode getPreConfirmation() {
		return preConfirmation;
	}

	public SecuritiesSettlement setPreConfirmation(PreConfirmationCode preConfirmation) {
		this.preConfirmation = Objects.requireNonNull(preConfirmation);
		return this;
	}

	public YesNoIndicator getSecuritiesRealTimeGrossSettlement() {
		return securitiesRealTimeGrossSettlement;
	}

	public SecuritiesSettlement setSecuritiesRealTimeGrossSettlement(YesNoIndicator securitiesRealTimeGrossSettlement) {
		this.securitiesRealTimeGrossSettlement = Objects.requireNonNull(securitiesRealTimeGrossSettlement);
		return this;
	}

	public BlockTradeCode getBlockTrade() {
		return blockTrade;
	}

	public SecuritiesSettlement setBlockTrade(BlockTradeCode blockTrade) {
		this.blockTrade = Objects.requireNonNull(blockTrade);
		return this;
	}

	public SettlementSystemMethodCode getSettlementSystemMethod() {
		return settlementSystemMethod;
	}

	public SecuritiesSettlement setSettlementSystemMethod(SettlementSystemMethodCode settlementSystemMethod) {
		this.settlementSystemMethod = Objects.requireNonNull(settlementSystemMethod);
		return this;
	}

	public AutoBorrowingCode getAutomaticBorrowing() {
		return automaticBorrowing;
	}

	public SecuritiesSettlement setAutomaticBorrowing(AutoBorrowingCode automaticBorrowing) {
		this.automaticBorrowing = Objects.requireNonNull(automaticBorrowing);
		return this;
	}

	public YesNoIndicator getPartialSettlementIndicator() {
		return partialSettlementIndicator;
	}

	public SecuritiesSettlement setPartialSettlementIndicator(YesNoIndicator partialSettlementIndicator) {
		this.partialSettlementIndicator = Objects.requireNonNull(partialSettlementIndicator);
		return this;
	}

	public YesNoIndicator getHoldIndicator() {
		return holdIndicator;
	}

	public SecuritiesSettlement setHoldIndicator(YesNoIndicator holdIndicator) {
		this.holdIndicator = Objects.requireNonNull(holdIndicator);
		return this;
	}

	public SafekeepingPlace getRequestedSafekeepingPlace() {
		return requestedSafekeepingPlace;
	}

	public SecuritiesSettlement setRequestedSafekeepingPlace(SafekeepingPlace requestedSafekeepingPlace) {
		this.requestedSafekeepingPlace = Objects.requireNonNull(requestedSafekeepingPlace);
		return this;
	}

	public List<PairOff> getPairOff() {
		return pairOff == null ? pairOff = new ArrayList<>() : pairOff;
	}

	public SecuritiesSettlement setPairOff(List<com.tools20022.repository.entity.PairOff> pairOff) {
		this.pairOff = Objects.requireNonNull(pairOff);
		return this;
	}

	public List<Interest> getAccruedInterest() {
		return accruedInterest == null ? accruedInterest = new ArrayList<>() : accruedInterest;
	}

	public SecuritiesSettlement setAccruedInterest(List<Interest> accruedInterest) {
		this.accruedInterest = Objects.requireNonNull(accruedInterest);
		return this;
	}

	public SecuritiesClearing getSecuritiesClearing() {
		return securitiesClearing;
	}

	public SecuritiesSettlement setSecuritiesClearing(com.tools20022.repository.entity.SecuritiesClearing securitiesClearing) {
		this.securitiesClearing = Objects.requireNonNull(securitiesClearing);
		return this;
	}

	public Optional<Payment> getPayment() {
		return payment == null ? Optional.empty() : Optional.of(payment);
	}

	public SecuritiesSettlement setPayment(com.tools20022.repository.entity.Payment payment) {
		this.payment = payment;
		return this;
	}

	public Optional<Allocation> getSettledAllocation() {
		return settledAllocation == null ? Optional.empty() : Optional.of(settledAllocation);
	}

	public SecuritiesSettlement setSettledAllocation(Allocation settledAllocation) {
		this.settledAllocation = settledAllocation;
		return this;
	}

	public List<ForeignExchangeTrade> getRelatedForeignExchangeOperation() {
		return relatedForeignExchangeOperation == null ? relatedForeignExchangeOperation = new ArrayList<>() : relatedForeignExchangeOperation;
	}

	public SecuritiesSettlement setRelatedForeignExchangeOperation(List<ForeignExchangeTrade> relatedForeignExchangeOperation) {
		this.relatedForeignExchangeOperation = Objects.requireNonNull(relatedForeignExchangeOperation);
		return this;
	}

	public List<Security> getSecurity() {
		return security == null ? security = new ArrayList<>() : security;
	}

	public SecuritiesSettlement setSecurity(List<com.tools20022.repository.entity.Security> security) {
		this.security = Objects.requireNonNull(security);
		return this;
	}

	public Position getPosition() {
		return position;
	}

	public SecuritiesSettlement setPosition(com.tools20022.repository.entity.Position position) {
		this.position = Objects.requireNonNull(position);
		return this;
	}

	public Optional<Rollover> getRollover() {
		return rollover == null ? Optional.empty() : Optional.of(rollover);
	}

	public SecuritiesSettlement setRollover(com.tools20022.repository.entity.Rollover rollover) {
		this.rollover = rollover;
		return this;
	}

	public SecuritiesQuantity getTurnedQuantity() {
		return turnedQuantity;
	}

	public SecuritiesSettlement setTurnedQuantity(SecuritiesQuantity turnedQuantity) {
		this.turnedQuantity = Objects.requireNonNull(turnedQuantity);
		return this;
	}

	public ObligationTypeCode getSettlementReason() {
		return settlementReason;
	}

	public SecuritiesSettlement setSettlementReason(ObligationTypeCode settlementReason) {
		this.settlementReason = Objects.requireNonNull(settlementReason);
		return this;
	}

	public DeliveryReceiptTypeCode getSettlementType() {
		return settlementType;
	}

	public SecuritiesSettlement setSettlementType(DeliveryReceiptTypeCode settlementType) {
		this.settlementType = Objects.requireNonNull(settlementType);
		return this;
	}
}