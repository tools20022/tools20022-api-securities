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
import com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code;
import com.tools20022.repository.codeset.ShortLongCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Balance;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Net position of a segregated holding, in a single security, within the
 * overall position held in a securities account. A securities balance is
 * calculated from the sum of securities' receipts minus the sum of securities'
 * deliveries.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesBalance" src="doc-files/SecuritiesBalance.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Balance Balance}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmNetGainLoss
 * SecuritiesBalance.mmNetGainLoss}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesAccount
 * SecuritiesBalance.mmSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmEligibleBalanceRelatedEntitlement
 * SecuritiesBalance.mmEligibleBalanceRelatedEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmShortLong
 * SecuritiesBalance.mmShortLong}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmAggregateQuantity
 * SecuritiesBalance.mmAggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmCorporateActionEntitlement
 * SecuritiesBalance.mmCorporateActionEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmInstructedBalanceRelatedEntitlement
 * SecuritiesBalance.mmInstructedBalanceRelatedEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmUninstructedBalanceRelatedEntitlement
 * SecuritiesBalance.mmUninstructedBalanceRelatedEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmMainSecuritiesBalance
 * SecuritiesBalance.mmMainSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesSubBalance
 * SecuritiesBalance.mmSecuritiesSubBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesBalanceType
 * SecuritiesBalance.mmSecuritiesBalanceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSubBalanceQuantity
 * SecuritiesBalance.mmSubBalanceQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecurity
 * SecuritiesBalance.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmExchangeRate
 * SecuritiesBalance.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmAvailabilityIndicator
 * SecuritiesBalance.mmAvailabilityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmAvailableQuantity
 * SecuritiesBalance.mmAvailableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmRelatedMeetingEntitlement
 * SecuritiesBalance.mmRelatedMeetingEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmUnavailableQuantity
 * SecuritiesBalance.mmUnavailableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSafekeepingPlace
 * SecuritiesBalance.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesEntry
 * SecuritiesBalance.mmSecuritiesEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmNotEligibleBalanceRelatedEntitlement
 * SecuritiesBalance.mmNotEligibleBalanceRelatedEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmRelatedIntraPositionTransfer
 * SecuritiesBalance.mmRelatedIntraPositionTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmCostAdjustment
 * SecuritiesBalance.mmCostAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmPledgee
 * SecuritiesBalance.mmPledgee}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmBalance
 * Security.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecuritiesBalance
 * SecuritiesAccount.mmSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmAggregateQuantityBalance
 * SecuritiesQuantity.mmAggregateQuantityBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedSubBalance
 * SecuritiesQuantity.mmRelatedSubBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmAvailableQuantityBalance
 * SecuritiesQuantity.mmAvailableQuantityBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmUnavailableQuantityBalance
 * SecuritiesQuantity.mmUnavailableQuantityBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#mmSecuritiesBalance
 * SecuritiesEntry.mmSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmSecuritiesBalance
 * SafekeepingPlace.mmSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForSecuritiesBalance
 * CurrencyExchange.mmCurrencyExchangeForSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmMainSecuritiesBalance
 * SecuritiesBalance.mmMainSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesSubBalance
 * SecuritiesBalance.mmSecuritiesSubBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmEligibleBalance
 * CorporateActionEntitlement.mmEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmInstructedBalance
 * CorporateActionEntitlement.mmInstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmUninstructedBalance
 * CorporateActionEntitlement.mmUninstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmNotEligibleBalance
 * CorporateActionEntitlement.mmNotEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer#mmSecuritiesBalance
 * IntraPositionTransfer.mmSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement#mmEligiblePosition
 * MeetingEntitlement.mmEligiblePosition}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Pledgee#mmSecuritiesBalance
 * Pledgee.mmSecuritiesBalance}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace4.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#mmAggregateQuantity
 * AggregateBalanceInformation3.mmAggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#mmAggregateQuantity
 * AggregateBalancePerSafekeepingPlace3.mmAggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#mmNotAvailableQuantity
 * AggregateBalancePerSafekeepingPlace3.mmNotAvailableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#mmAggregateQuantity
 * AggregateBalanceInformation4.mmAggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#mmNotAvailableQuantity
 * AggregateBalanceInformation4.mmNotAvailableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountingStatementOfHoldings2#mmBalanceForAccount
 * AccountingStatementOfHoldings2.mmBalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings2#mmBalanceForAccount
 * CustodyStatementOfHoldings2.mmBalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance2#mmBalanceForFinancialInstrument
 * AggregateHoldingBalance2.mmBalanceForFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAggregateBalance2#mmBalanceBreakdown
 * FinancialInstrumentAggregateBalance2.mmBalanceBreakdown}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition8#mmPosition
 * SecurityPosition8.mmPosition}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition9#mmPosition
 * SecurityPosition9.mmPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#mmAggregateBalance
 * AggregateBalanceInformation30.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#mmNotAvailableBalance
 * AggregateBalanceInformation30.mmNotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#mmAggregateBalance
 * AggregateBalanceInformation31.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace28.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmNotAvailableBalance
 * AggregateBalancePerSafekeepingPlace28.mmNotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace29.mmAggregateBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance6#mmQuantity
 * Balance6.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClosingBalance3#mmClosingBalance
 * ClosingBalance3.mmClosingBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance7#mmQuantity
 * Balance7.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat5Choice#mmBalance
 * BalanceFormat5Choice.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat5Choice#mmEligibleBalance
 * BalanceFormat5Choice.mmEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat5Choice#mmNotEligibleBalance
 * BalanceFormat5Choice.mmNotEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat8#mmFullPeriodUnits
 * TotalEligibleBalanceFormat8.mmFullPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat8#mmPartWayPeriodUnits
 * TotalEligibleBalanceFormat8.mmPartWayPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice#mmBalance
 * BalanceFormat6Choice.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice#mmEligibleBalance
 * BalanceFormat6Choice.mmEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice#mmNotEligibleBalance
 * BalanceFormat6Choice.mmNotEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice#mmFullPeriodUnits
 * BalanceFormat6Choice.mmFullPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice#mmPartWayPeriodUnits
 * BalanceFormat6Choice.mmPartWayPeriodUnits}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance9#mmQuantity
 * Balance9.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance8#mmQuantity
 * Balance8.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount7#mmBalanceDetails
 * SafekeepingAccount7.mmBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount7#mmAccountSubLevel1Difference
 * SafekeepingAccount7.mmAccountSubLevel1Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15#mmBalanceDetails
 * AccountSubLevel15.mmBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15#mmAccountSubLevel6Difference
 * AccountSubLevel15.mmAccountSubLevel6Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel16#mmBalanceDetails
 * AccountSubLevel16.mmBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel16#mmAccountSubLevel7Difference
 * AccountSubLevel16.mmAccountSubLevel7Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance3#mmBalanceForAccount
 * AggregateHoldingBalance3.mmBalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18#mmBalanceDetails
 * AccountSubLevel18.mmBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18#mmAccountSubLevel9Difference
 * AccountSubLevel18.mmAccountSubLevel9Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel19#mmBalanceDetails
 * AccountSubLevel19.mmBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel11#mmBalanceDetails
 * AccountSubLevel11.mmBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel11#mmAccountSubLevel2Difference
 * AccountSubLevel11.mmAccountSubLevel2Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel12#mmBalanceDetails
 * AccountSubLevel12.mmBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel12#mmAccountSubLevel3Difference
 * AccountSubLevel12.mmAccountSubLevel3Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel17#mmBalanceDetails
 * AccountSubLevel17.mmBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel17#mmAccountSubLevel8Difference
 * AccountSubLevel17.mmAccountSubLevel8Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13#mmBalanceDetails
 * AccountSubLevel13.mmBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13#mmAccountSubLevel4Difference
 * AccountSubLevel13.mmAccountSubLevel4Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel14#mmBalanceDetails
 * AccountSubLevel14.mmBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel14#mmAccountSubLevel5Difference
 * AccountSubLevel14.mmAccountSubLevel5Difference}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceQuantity1Choice
 * BalanceQuantity1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityAndAvailability
 * QuantityAndAvailability}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SubBalanceQuantity1Choice
 * SubBalanceQuantity1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation2
 * AdditionalBalanceInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubBalanceInformation2
 * SubBalanceInformation2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4
 * AggregateBalancePerSafekeepingPlace4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3
 * AggregateBalanceInformation3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3
 * AggregateBalancePerSafekeepingPlace3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4
 * AggregateBalanceInformation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountingStatementOfHoldings2
 * AccountingStatementOfHoldings2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings2
 * CustodyStatementOfHoldings2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType10FormatChoice
 * SecuritiesBalanceType10FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType6FormatChoice
 * SecuritiesBalanceType6FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType9FormatChoice
 * SecuritiesBalanceType9FormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateHoldingBalance2
 * AggregateHoldingBalance2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SubBalanceType9Choice
 * SubBalanceType9Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAggregateBalance2
 * FinancialInstrumentAggregateBalance2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubBalanceBreakdown1
 * SubBalanceBreakdown1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SubBalanceQuantity5Choice
 * SubBalanceQuantity5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition8
 * SecurityPosition8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition9
 * SecurityPosition9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance8
 * HoldingBalance8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EligiblePosition5
 * EligiblePosition5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance7
 * HoldingBalance7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EligiblePosition6
 * EligiblePosition6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateHoldingBalance1
 * AggregateHoldingBalance1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30
 * AggregateBalanceInformation30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31
 * AggregateBalanceInformation31}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28
 * AggregateBalancePerSafekeepingPlace28}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29
 * AggregateBalancePerSafekeepingPlace29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubBalanceInformation15
 * SubBalanceInformation15}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SubBalanceType11Choice
 * SubBalanceType11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SubBalanceQuantity6Choice
 * SubBalanceQuantity6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation15
 * AdditionalBalanceInformation15}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OpeningClosing3Choice
 * OpeningClosing3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation14
 * AdditionalBalanceInformation14}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SubBalanceType12Choice
 * SubBalanceType12Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown3
 * SecuritiesSubBalanceTypeAndQuantityBreakdown3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance6 Balance6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubBalanceInformation14
 * SubBalanceInformation14}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType7Choice
 * SecuritiesBalanceType7Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType6Choice
 * SecuritiesBalanceType6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OpeningBalance3
 * OpeningBalance3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ClosingBalance3
 * ClosingBalance3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance7 Balance7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ClosingBalance4Choice
 * ClosingBalance4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceQuantity8Choice
 * BalanceQuantity8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OpeningBalance4Choice
 * OpeningBalance4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceQuantity9Choice
 * BalanceQuantity9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceFormat5Choice
 * BalanceFormat5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SignedQuantityFormat7
 * SignedQuantityFormat7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SignedQuantityFormat6
 * SignedQuantityFormat6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat8
 * TotalEligibleBalanceFormat8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceFormat6Choice
 * BalanceFormat6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance9 Balance9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance8 Balance8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateHoldingBalance3
 * AggregateHoldingBalance3}</li>
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
 * "SecuritiesBalance"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Net position of a segregated holding, in a single security, within the overall position held in a securities account. A securities balance is calculated from the sum of securities' receipts minus the sum of securities' deliveries."
 * </li>
 * </ul>
 */
public class SecuritiesBalance extends Balance {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount netGainLoss;
	/**
	 * Amount representing the difference between the cost and the current price
	 * of a security. In the context of securities settlement, it is the amount
	 * paid or received when the instructions are netted or paired off.
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
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmNetGainLoss
	 * OtherAmounts16.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#mmNetGainLoss
	 * OtherAmounts28.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#mmNetGainLoss
	 * OtherAmounts30.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmNetGainLoss
	 * OtherAmounts31.mmNetGainLoss}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetGainLoss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount representing the difference between the cost and the current price of a security. In the context of securities settlement, it is the amount paid or received when the instructions are netted or paired off."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNetGainLoss = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OtherAmounts16.mmNetGainLoss, OtherAmounts28.mmNetGainLoss, OtherAmounts30.mmNetGainLoss, OtherAmounts31.mmNetGainLoss);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetGainLoss";
			definition = "Amount representing the difference between the cost and the current price of a security. In the context of securities settlement, it is the amount paid or received when the instructions are netted or paired off.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalance.class.getMethod("getNetGainLoss", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesAccount securitiesAccount;
	/**
	 * Account or sub-account for which a balance is calculated. It is derived
	 * from the association between Balance and Account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecuritiesBalance
	 * SecuritiesAccount.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountingStatementOfHoldings2#mmAccountDetails
	 * AccountingStatementOfHoldings2.mmAccountDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account or sub-account for which a balance is calculated. It is derived from the association between Balance and Account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AccountingStatementOfHoldings2.mmAccountDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccount";
			definition = "Account or sub-account for which a balance is calculated. It is derived from the association between Balance and Account.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmSecuritiesBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}
	};
	protected CorporateActionEntitlement eligibleBalanceRelatedEntitlement;
	/**
	 * Corporate action entitlement for which an eligible balance is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmEligibleBalance
	 * CorporateActionEntitlement.mmEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleBalanceRelatedEntitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action entitlement for which an eligible balance is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmEligibleBalanceRelatedEntitlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EligibleBalanceRelatedEntitlement";
			definition = "Corporate action entitlement for which an eligible balance is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmEligibleBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
		}
	};
	protected ShortLongCode shortLong;
	/**
	 * Indication that the position is short or long.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ShortLongCode
	 * ShortLongCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Balance6#mmShortLongIndicator
	 * Balance6.mmShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OpeningBalance3#mmShortLongIndicator
	 * OpeningBalance3.mmShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClosingBalance3#mmShortLongIndicator
	 * ClosingBalance3.mmShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Balance7#mmShortLongIndicator
	 * Balance7.mmShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat7#mmShortLongPosition
	 * SignedQuantityFormat7.mmShortLongPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat6#mmShortLongPosition
	 * SignedQuantityFormat6.mmShortLongPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Balance9#mmShortLongIndicator
	 * Balance9.mmShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Balance8#mmShortLongIndicator
	 * Balance8.mmShortLongIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLong"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indication that the position is short or long."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmShortLong = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Balance6.mmShortLongIndicator, OpeningBalance3.mmShortLongIndicator, ClosingBalance3.mmShortLongIndicator, Balance7.mmShortLongIndicator, SignedQuantityFormat7.mmShortLongPosition,
					SignedQuantityFormat6.mmShortLongPosition, Balance9.mmShortLongIndicator, Balance8.mmShortLongIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ShortLong";
			definition = "Indication that the position is short or long.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ShortLongCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalance.class.getMethod("getShortLong", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesQuantity aggregateQuantity;
	/**
	 * Total quantity of financial instruments of the balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmAggregateQuantityBalance
	 * SecuritiesQuantity.mmAggregateQuantityBalance}</li>
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
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity1Choice#mmQuantity
	 * BalanceQuantity1Choice.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity1Choice#mmQuantityAsDSS
	 * BalanceQuantity1Choice.mmQuantityAsDSS}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance8#mmBalance
	 * HoldingBalance8.mmBalance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance7#mmBalance
	 * HoldingBalance7.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OpeningBalance3#mmOpeningBalance
	 * OpeningBalance3.mmOpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClosingBalance4Choice#mmFinal
	 * ClosingBalance4Choice.mmFinal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClosingBalance4Choice#mmIntermediary
	 * ClosingBalance4Choice.mmIntermediary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity8Choice#mmQuantity
	 * BalanceQuantity8Choice.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity8Choice#mmProprietary
	 * BalanceQuantity8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningBalance4Choice#mmFirst
	 * OpeningBalance4Choice.mmFirst}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningBalance4Choice#mmIntermediary
	 * OpeningBalance4Choice.mmIntermediary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity9Choice#mmQuantity
	 * BalanceQuantity9Choice.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity9Choice#mmProprietary
	 * BalanceQuantity9Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat7#mmQuantityChoice
	 * SignedQuantityFormat7.mmQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat6#mmQuantity
	 * SignedQuantityFormat6.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat8#mmBalance
	 * TotalEligibleBalanceFormat8.mmBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AggregateQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity of financial instruments of the balance."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAggregateQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(BalanceQuantity1Choice.mmQuantity, BalanceQuantity1Choice.mmQuantityAsDSS, HoldingBalance8.mmBalance, HoldingBalance7.mmBalance, OpeningBalance3.mmOpeningBalance,
					ClosingBalance4Choice.mmFinal, ClosingBalance4Choice.mmIntermediary, BalanceQuantity8Choice.mmQuantity, BalanceQuantity8Choice.mmProprietary, OpeningBalance4Choice.mmFirst, OpeningBalance4Choice.mmIntermediary,
					BalanceQuantity9Choice.mmQuantity, BalanceQuantity9Choice.mmProprietary, SignedQuantityFormat7.mmQuantityChoice, SignedQuantityFormat6.mmQuantity, TotalEligibleBalanceFormat8.mmBalance);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AggregateQuantity";
			definition = "Total quantity of financial instruments of the balance.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmAggregateQuantityBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected CorporateActionEntitlement corporateActionEntitlement;
	/**
	 * Corporate action entitlement for which a balance is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEntitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action entitlement for which a balance is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCorporateActionEntitlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEntitlement";
			definition = "Corporate action entitlement for which a balance is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmSecuritiesBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
		}
	};
	protected CorporateActionEntitlement instructedBalanceRelatedEntitlement;
	/**
	 * Corporate action entitlement for which an instructed balance is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmInstructedBalance
	 * CorporateActionEntitlement.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedBalanceRelatedEntitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action entitlement for which an instructed balance is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInstructedBalanceRelatedEntitlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructedBalanceRelatedEntitlement";
			definition = "Corporate action entitlement for which an instructed balance is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmInstructedBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
		}
	};
	protected CorporateActionEntitlement uninstructedBalanceRelatedEntitlement;
	/**
	 * Corporate action entitlement for which an uninstructed balance is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmUninstructedBalance
	 * CorporateActionEntitlement.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UninstructedBalanceRelatedEntitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action entitlement for which an uninstructed balance is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmUninstructedBalanceRelatedEntitlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UninstructedBalanceRelatedEntitlement";
			definition = "Corporate action entitlement for which an uninstructed balance is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmUninstructedBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
		}
	};
	protected SecuritiesBalance mainSecuritiesBalance;
	/**
	 * Balance which is divided in sub-balances.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesSubBalance
	 * SecuritiesBalance.mmSecuritiesSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MainSecuritiesBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance which is divided in sub-balances."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMainSecuritiesBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MainSecuritiesBalance";
			definition = "Balance which is divided in sub-balances.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmSecuritiesSubBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesBalance> securitiesSubBalance;
	/**
	 * Net position of a segregated holding of a single security within the
	 * overall position held in an account, eg, sub-balance per status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmMainSecuritiesBalance
	 * SecuritiesBalance.mmMainSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity1Choice#mmQuantityAndAvailability
	 * SubBalanceQuantity1Choice.mmQuantityAndAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation2#mmAdditionalBalanceBreakdownDetails
	 * SubBalanceInformation2.mmAdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4#mmBalanceBreakdownDetails
	 * AggregateBalancePerSafekeepingPlace4.mmBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4#mmAdditionalBalanceBreakdownDetails
	 * AggregateBalancePerSafekeepingPlace4.mmAdditionalBalanceBreakdownDetails}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#mmBalanceBreakdownDetails
	 * AggregateBalanceInformation3.mmBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#mmAdditionalBalanceBreakdownDetails
	 * AggregateBalanceInformation3.mmAdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation3.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#mmBalanceBreakdownDetails
	 * AggregateBalancePerSafekeepingPlace3.mmBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#mmAdditionalBalanceBreakdownDetails
	 * AggregateBalancePerSafekeepingPlace3.mmAdditionalBalanceBreakdownDetails}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#mmBalanceBreakdownDetails
	 * AggregateBalanceInformation4.mmBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#mmAdditionalBalanceBreakdownDetails
	 * AggregateBalanceInformation4.mmAdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation4.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition5#mmHoldingBalance
	 * EligiblePosition5.mmHoldingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition6#mmHoldingBalance
	 * EligiblePosition6.mmHoldingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#mmBalanceBreakdown
	 * AggregateBalanceInformation30.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#mmAdditionalBalanceBreakdown
	 * AggregateBalanceInformation30.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation30.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#mmBalanceBreakdown
	 * AggregateBalanceInformation31.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#mmAdditionalBalanceBreakdown
	 * AggregateBalanceInformation31.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation31.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace28.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmAdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace28.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#mmBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace29.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#mmAdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace29.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation15#mmAdditionalBalanceBreakdownDetails
	 * SubBalanceInformation15.mmAdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity6Choice#mmQuantityAndAvailability
	 * SubBalanceQuantity6Choice.mmQuantityAndAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation14#mmAdditionalBalanceBreakdownDetails
	 * SubBalanceInformation14.mmAdditionalBalanceBreakdownDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingBalance3#mmBalance
	 * PendingBalance3.mmBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSubBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net position of a segregated holding of a single security within the overall position held in an account, eg, sub-balance per status."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesSubBalance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SubBalanceQuantity1Choice.mmQuantityAndAvailability, SubBalanceInformation2.mmAdditionalBalanceBreakdownDetails, AggregateBalancePerSafekeepingPlace4.mmBalanceBreakdownDetails,
					AggregateBalancePerSafekeepingPlace4.mmAdditionalBalanceBreakdownDetails, AggregateBalanceInformation3.mmBalanceBreakdownDetails, AggregateBalanceInformation3.mmAdditionalBalanceBreakdownDetails,
					AggregateBalanceInformation3.mmBalanceAtSafekeepingPlace, AggregateBalancePerSafekeepingPlace3.mmBalanceBreakdownDetails, AggregateBalancePerSafekeepingPlace3.mmAdditionalBalanceBreakdownDetails,
					AggregateBalanceInformation4.mmBalanceBreakdownDetails, AggregateBalanceInformation4.mmAdditionalBalanceBreakdownDetails, AggregateBalanceInformation4.mmBalanceAtSafekeepingPlace, EligiblePosition5.mmHoldingBalance,
					EligiblePosition6.mmHoldingBalance, AggregateBalanceInformation30.mmBalanceBreakdown, AggregateBalanceInformation30.mmAdditionalBalanceBreakdown, AggregateBalanceInformation30.mmBalanceAtSafekeepingPlace,
					AggregateBalanceInformation31.mmBalanceBreakdown, AggregateBalanceInformation31.mmAdditionalBalanceBreakdown, AggregateBalanceInformation31.mmBalanceAtSafekeepingPlace,
					AggregateBalancePerSafekeepingPlace28.mmBalanceBreakdown, AggregateBalancePerSafekeepingPlace28.mmAdditionalBalanceBreakdown, AggregateBalancePerSafekeepingPlace29.mmBalanceBreakdown,
					AggregateBalancePerSafekeepingPlace29.mmAdditionalBalanceBreakdown, SubBalanceInformation15.mmAdditionalBalanceBreakdownDetails, SubBalanceQuantity6Choice.mmQuantityAndAvailability,
					SubBalanceInformation14.mmAdditionalBalanceBreakdownDetails, PendingBalance3.mmBalance);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSubBalance";
			definition = "Net position of a segregated holding of a single security within the overall position held in an account, eg, sub-balance per status.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmMainSecuritiesBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};
	protected SecuritiesBalanceTypeV2Code securitiesBalanceType;
	/**
	 * Reason a security is not available or additional information about the
	 * financial instrument for which the balance is given, for example,
	 * unregistered, registered in nominee name.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation2#mmSubBalanceType
	 * AdditionalBalanceInformation2.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation2#mmExtendedSubBalanceType
	 * AdditionalBalanceInformation2.mmExtendedSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation2#mmSubBalanceType
	 * SubBalanceInformation2.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation2#mmExtendedSubBalanceType
	 * SubBalanceInformation2.mmExtendedSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType10FormatChoice#mmCode
	 * SecuritiesBalanceType10FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType10FormatChoice#mmProprietary
	 * SecuritiesBalanceType10FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount9#mmBalanceType
	 * SecuritiesAccount9.mmBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType6FormatChoice#mmCode
	 * SecuritiesBalanceType6FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType6FormatChoice#mmProprietary
	 * SecuritiesBalanceType6FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount12#mmBalanceType
	 * SecuritiesAccount12.mmBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount8#mmBalanceType
	 * SecuritiesAccount8.mmBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType9FormatChoice#mmCode
	 * SecuritiesBalanceType9FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType9FormatChoice#mmProprietary
	 * SecuritiesBalanceType9FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount10#mmBalanceType
	 * SecuritiesAccount10.mmBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType9Choice#mmCode
	 * SubBalanceType9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType9Choice#mmProprietary
	 * SubBalanceType9Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceBreakdown1#mmSubBalanceType
	 * SubBalanceBreakdown1.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldingBalance8#mmBalanceType
	 * HoldingBalance8.mmBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldingBalance7#mmBalanceType
	 * HoldingBalance7.mmBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails33#mmBalanceFrom
	 * IntraPositionDetails33.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails33#mmBalanceTo
	 * IntraPositionDetails33.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation15#mmSubBalanceType
	 * SubBalanceInformation15.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType11Choice#mmCode
	 * SubBalanceType11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType11Choice#mmProprietary
	 * SubBalanceType11Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation15#mmSubBalanceType
	 * AdditionalBalanceInformation15.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation14#mmSubBalanceType
	 * AdditionalBalanceInformation14.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType12Choice#mmCode
	 * SubBalanceType12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType12Choice#mmProprietary
	 * SubBalanceType12Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown3#mmType
	 * SecuritiesSubBalanceTypeAndQuantityBreakdown3.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation14#mmSubBalanceType
	 * SubBalanceInformation14.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType7Choice#mmCode
	 * SecuritiesBalanceType7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType7Choice#mmProprietary
	 * SecuritiesBalanceType7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType6Choice#mmCode
	 * SecuritiesBalanceType6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType6Choice#mmProprietary
	 * SecuritiesBalanceType6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmBalanceFrom
	 * IntraPositionDetails41.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmBalanceTo
	 * IntraPositionDetails41.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails39#mmBalanceFrom
	 * IntraPositionDetails39.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails39#mmBalanceTo
	 * IntraPositionDetails39.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails40#mmBalanceFrom
	 * IntraPositionDetails40.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails13#mmBalanceTo
	 * IntraPositionMovementDetails13.mmBalanceTo}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBalanceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason a security is not available or additional information about the financial instrument for which the balance is given, for example, unregistered, registered in nominee name."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSecuritiesBalanceType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AdditionalBalanceInformation2.mmSubBalanceType, AdditionalBalanceInformation2.mmExtendedSubBalanceType, SubBalanceInformation2.mmSubBalanceType,
					SubBalanceInformation2.mmExtendedSubBalanceType, SecuritiesBalanceType10FormatChoice.mmCode, SecuritiesBalanceType10FormatChoice.mmProprietary, SecuritiesAccount9.mmBalanceType,
					SecuritiesBalanceType6FormatChoice.mmCode, SecuritiesBalanceType6FormatChoice.mmProprietary, SecuritiesAccount12.mmBalanceType, SecuritiesAccount8.mmBalanceType, SecuritiesBalanceType9FormatChoice.mmCode,
					SecuritiesBalanceType9FormatChoice.mmProprietary, SecuritiesAccount10.mmBalanceType, SubBalanceType9Choice.mmCode, SubBalanceType9Choice.mmProprietary, SubBalanceBreakdown1.mmSubBalanceType,
					HoldingBalance8.mmBalanceType, HoldingBalance7.mmBalanceType, IntraPositionDetails33.mmBalanceFrom, IntraPositionDetails33.mmBalanceTo, SubBalanceInformation15.mmSubBalanceType, SubBalanceType11Choice.mmCode,
					SubBalanceType11Choice.mmProprietary, AdditionalBalanceInformation15.mmSubBalanceType, AdditionalBalanceInformation14.mmSubBalanceType, SubBalanceType12Choice.mmCode, SubBalanceType12Choice.mmProprietary,
					SecuritiesSubBalanceTypeAndQuantityBreakdown3.mmType, SubBalanceInformation14.mmSubBalanceType, SecuritiesBalanceType7Choice.mmCode, SecuritiesBalanceType7Choice.mmProprietary, SecuritiesBalanceType6Choice.mmCode,
					SecuritiesBalanceType6Choice.mmProprietary, IntraPositionDetails41.mmBalanceFrom, IntraPositionDetails41.mmBalanceTo, IntraPositionDetails39.mmBalanceFrom, IntraPositionDetails39.mmBalanceTo,
					IntraPositionDetails40.mmBalanceFrom, IntraPositionMovementDetails13.mmBalanceTo);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBalanceType";
			definition = "Reason a security is not available or additional information about the financial instrument for which the balance is given, for example, unregistered, registered in nominee name.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalance.class.getMethod("getSecuritiesBalanceType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesQuantity subBalanceQuantity;
	/**
	 * Net position of a segregated holding of a single security within the
	 * overall position held in a securities account, for instance. sub-balance
	 * per type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedSubBalance
	 * SecuritiesQuantity.mmRelatedSubBalance}</li>
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
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity1Choice#mmQuantity
	 * SubBalanceQuantity1Choice.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity1Choice#mmQuantityAsDSS
	 * SubBalanceQuantity1Choice.mmQuantityAsDSS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation2#mmQuantity
	 * AdditionalBalanceInformation2.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation2#mmQuantity
	 * SubBalanceInformation2.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceBreakdown1#mmQuantity
	 * SubBalanceBreakdown1.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity5Choice#mmQuantity
	 * SubBalanceQuantity5Choice.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity5Choice#mmProprietary
	 * SubBalanceQuantity5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation15#mmQuantity
	 * SubBalanceInformation15.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity6Choice#mmQuantity
	 * SubBalanceQuantity6Choice.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity6Choice#mmProprietary
	 * SubBalanceQuantity6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation15#mmQuantity
	 * AdditionalBalanceInformation15.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation14#mmQuantity
	 * AdditionalBalanceInformation14.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation14#mmQuantity
	 * SubBalanceInformation14.mmQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net position of a segregated holding of a single security within the overall position held in a securities account, for instance. sub-balance per type."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSubBalanceQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SubBalanceQuantity1Choice.mmQuantity, SubBalanceQuantity1Choice.mmQuantityAsDSS, AdditionalBalanceInformation2.mmQuantity, SubBalanceInformation2.mmQuantity,
					SubBalanceBreakdown1.mmQuantity, SubBalanceQuantity5Choice.mmQuantity, SubBalanceQuantity5Choice.mmProprietary, SubBalanceInformation15.mmQuantity, SubBalanceQuantity6Choice.mmQuantity,
					SubBalanceQuantity6Choice.mmProprietary, AdditionalBalanceInformation15.mmQuantity, AdditionalBalanceInformation14.mmQuantity, SubBalanceInformation14.mmQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubBalanceQuantity";
			definition = "Net position of a segregated holding of a single security within the overall position held in a securities account, for instance. sub-balance per type.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedSubBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Security> security;
	/**
	 * Security for which a balance is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmBalance
	 * Security.mmBalance}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#mmFinancialInstrumentAttributes
	 * AggregateBalanceInformation30.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#mmFinancialInstrumentAttributes
	 * AggregateBalanceInformation31.mmFinancialInstrumentAttributes}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security for which a balance is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecurity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AggregateBalanceInformation30.mmFinancialInstrumentAttributes, AggregateBalanceInformation31.mmFinancialInstrumentAttributes);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which a balance is calculated.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CurrencyExchange> exchangeRate;
	/**
	 * Specifies the exchange rate used to convert the balance value in another
	 * currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForSecuritiesBalance
	 * CurrencyExchange.mmCurrencyExchangeForSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace4.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#mmForeignExchangeDetails
	 * AggregateBalanceInformation3.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace3.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#mmForeignExchangeDetails
	 * AggregateBalanceInformation4.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#mmForeignExchangeDetails
	 * AggregateBalanceInformation30.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#mmForeignExchangeDetails
	 * AggregateBalanceInformation31.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace28.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace29.mmForeignExchangeDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the exchange rate used to convert the balance value in another currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmExchangeRate = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AggregateBalancePerSafekeepingPlace4.mmForeignExchangeDetails, AggregateBalanceInformation3.mmForeignExchangeDetails, AggregateBalancePerSafekeepingPlace3.mmForeignExchangeDetails,
					AggregateBalanceInformation4.mmForeignExchangeDetails, AggregateBalanceInformation30.mmForeignExchangeDetails, AggregateBalanceInformation31.mmForeignExchangeDetails,
					AggregateBalancePerSafekeepingPlace28.mmForeignExchangeDetails, AggregateBalancePerSafekeepingPlace29.mmForeignExchangeDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExchangeRate";
			definition = "Specifies the exchange rate used to convert the balance value in another currency.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForSecuritiesBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};
	protected YesNoIndicator availabilityIndicator;
	/**
	 * Indicates whether the quantity of securities on the balance is available.
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
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAvailability#mmAvailabilityIndicator
	 * QuantityAndAvailability.mmAvailabilityIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailabilityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the quantity of securities on the balance is available."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAvailabilityIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(QuantityAndAvailability.mmAvailabilityIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AvailabilityIndicator";
			definition = "Indicates whether the quantity of securities on the balance is available.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalance.class.getMethod("getAvailabilityIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesQuantity availableQuantity;
	/**
	 * Total quantity of financial instruments of the balance that is available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmAvailableQuantityBalance
	 * SecuritiesQuantity.mmAvailableQuantityBalance}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#mmAvailableQuantity
	 * AggregateBalancePerSafekeepingPlace3.mmAvailableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#mmAvailableQuantity
	 * AggregateBalanceInformation4.mmAvailableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#mmAvailableBalance
	 * AggregateBalanceInformation30.mmAvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmAvailableBalance
	 * AggregateBalancePerSafekeepingPlace28.mmAvailableBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total quantity of financial instruments of the balance that is available."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAvailableQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AggregateBalancePerSafekeepingPlace3.mmAvailableQuantity, AggregateBalanceInformation4.mmAvailableQuantity, AggregateBalanceInformation30.mmAvailableBalance,
					AggregateBalancePerSafekeepingPlace28.mmAvailableBalance);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AvailableQuantity";
			definition = "Total quantity of financial instruments of the balance that is available.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmAvailableQuantityBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected MeetingEntitlement relatedMeetingEntitlement;
	/**
	 * Entitlement for which an eligible posistion is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement#mmEligiblePosition
	 * MeetingEntitlement.mmEligiblePosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MeetingEntitlement
	 * MeetingEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMeetingEntitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entitlement for which an eligible posistion is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedMeetingEntitlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedMeetingEntitlement";
			definition = "Entitlement for which an eligible posistion is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingEntitlement.mmEligiblePosition;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MeetingEntitlement.mmObject();
		}
	};
	protected SecuritiesQuantity unavailableQuantity;
	/**
	 * Total quantity of financial instruments of the balance that is not
	 * available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmUnavailableQuantityBalance
	 * SecuritiesQuantity.mmUnavailableQuantityBalance}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnavailableQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total quantity of financial instruments of the balance that is not available."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmUnavailableQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnavailableQuantity";
			definition = "Total quantity of financial instruments of the balance that is not available.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmUnavailableQuantityBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SafekeepingPlace> safekeepingPlace;
	/**
	 * Safekeeping place at which the securities are held.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmSecuritiesBalance
	 * SafekeepingPlace.mmSecuritiesBalance}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Safekeeping place at which the securities are held."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSafekeepingPlace = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SafekeepingPlace";
			definition = "Safekeeping place at which the securities are held.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmSecuritiesBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesEntry> securitiesEntry;
	/**
	 * Postings used to calculate a balance. It is derived from the association
	 * between Balance and Entry
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#mmSecuritiesBalance
	 * SecuritiesEntry.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesEntry
	 * SecuritiesEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Postings used to calculate a balance. It is derived from the association between Balance and Entry"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesEntry";
			definition = "Postings used to calculate a balance. It is derived from the association between Balance and Entry";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.mmSecuritiesBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.mmObject();
		}
	};
	protected CorporateActionEntitlement notEligibleBalanceRelatedEntitlement;
	/**
	 * Corporate action entitlement for which a non eligible balance is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmNotEligibleBalance
	 * CorporateActionEntitlement.mmNotEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEligibleBalanceRelatedEntitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action entitlement for which a non eligible balance is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNotEligibleBalanceRelatedEntitlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotEligibleBalanceRelatedEntitlement";
			definition = "Corporate action entitlement for which a non eligible balance is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmNotEligibleBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
		}
	};
	protected IntraPositionTransfer relatedIntraPositionTransfer;
	/**
	 * Transfer between two balances or sub balances.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer#mmSecuritiesBalance
	 * IntraPositionTransfer.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer
	 * IntraPositionTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedIntraPositionTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer between two balances or sub balances."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedIntraPositionTransfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedIntraPositionTransfer";
			definition = "Transfer between two balances or sub balances.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.IntraPositionTransfer.mmSecuritiesBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.IntraPositionTransfer.mmObject();
		}
	};
	protected CurrencyAndAmount costAdjustment;
	/**
	 * Specifies the amount added or substracted to the original cost of a
	 * transaction.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CostAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the amount added or substracted to the original cost of a transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCostAdjustment = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CostAdjustment";
			definition = "Specifies the amount added or substracted to the original cost of a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalance.class.getMethod("getCostAdjustment", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Pledgee> pledgee;
	/**
	 * Pledgee at which the securities are held.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Pledgee#mmSecuritiesBalance
	 * Pledgee.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Pledgee Pledgee}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmPledgee
	 * AggregateBalancePerSafekeepingPlace28.mmPledgee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#mmPledgee
	 * AggregateBalancePerSafekeepingPlace29.mmPledgee}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pledgee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pledgee at which the securities are held."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPledgee = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AggregateBalancePerSafekeepingPlace28.mmPledgee, AggregateBalancePerSafekeepingPlace29.mmPledgee);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Pledgee";
			definition = "Pledgee at which the securities are held.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Pledgee.mmSecuritiesBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Pledgee.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesBalance";
				definition = "Net position of a segregated holding, in a single security, within the overall position held in a securities account. A securities balance is calculated from the sum of securities' receipts minus the sum of securities' deliveries.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmBalance, com.tools20022.repository.entity.SecuritiesAccount.mmSecuritiesBalance,
						com.tools20022.repository.entity.SecuritiesQuantity.mmAggregateQuantityBalance, com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedSubBalance,
						com.tools20022.repository.entity.SecuritiesQuantity.mmAvailableQuantityBalance, com.tools20022.repository.entity.SecuritiesQuantity.mmUnavailableQuantityBalance,
						com.tools20022.repository.entity.SecuritiesEntry.mmSecuritiesBalance, com.tools20022.repository.entity.SafekeepingPlace.mmSecuritiesBalance,
						com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForSecuritiesBalance, com.tools20022.repository.entity.SecuritiesBalance.mmMainSecuritiesBalance,
						com.tools20022.repository.entity.SecuritiesBalance.mmSecuritiesSubBalance, com.tools20022.repository.entity.CorporateActionEntitlement.mmEligibleBalance,
						com.tools20022.repository.entity.CorporateActionEntitlement.mmSecuritiesBalance, com.tools20022.repository.entity.CorporateActionEntitlement.mmInstructedBalance,
						com.tools20022.repository.entity.CorporateActionEntitlement.mmUninstructedBalance, com.tools20022.repository.entity.CorporateActionEntitlement.mmNotEligibleBalance,
						com.tools20022.repository.entity.IntraPositionTransfer.mmSecuritiesBalance, com.tools20022.repository.entity.MeetingEntitlement.mmEligiblePosition, com.tools20022.repository.entity.Pledgee.mmSecuritiesBalance);
				derivationElement_lazy = () -> Arrays.asList(AggregateBalancePerSafekeepingPlace4.mmAggregateBalance, AggregateBalanceInformation3.mmAggregateQuantity, AggregateBalancePerSafekeepingPlace3.mmAggregateQuantity,
						AggregateBalancePerSafekeepingPlace3.mmNotAvailableQuantity, AggregateBalanceInformation4.mmAggregateQuantity, AggregateBalanceInformation4.mmNotAvailableQuantity, AccountingStatementOfHoldings2.mmBalanceForAccount,
						CustodyStatementOfHoldings2.mmBalanceForAccount, AggregateHoldingBalance2.mmBalanceForFinancialInstrument, FinancialInstrumentAggregateBalance2.mmBalanceBreakdown, SecurityPosition8.mmPosition,
						SecurityPosition9.mmPosition, AggregateBalanceInformation30.mmAggregateBalance, AggregateBalanceInformation30.mmNotAvailableBalance, AggregateBalanceInformation31.mmAggregateBalance,
						AggregateBalancePerSafekeepingPlace28.mmAggregateBalance, AggregateBalancePerSafekeepingPlace28.mmNotAvailableBalance, AggregateBalancePerSafekeepingPlace29.mmAggregateBalance, Balance6.mmQuantity,
						ClosingBalance3.mmClosingBalance, Balance7.mmQuantity, BalanceFormat5Choice.mmBalance, BalanceFormat5Choice.mmEligibleBalance, BalanceFormat5Choice.mmNotEligibleBalance,
						TotalEligibleBalanceFormat8.mmFullPeriodUnits, TotalEligibleBalanceFormat8.mmPartWayPeriodUnits, BalanceFormat6Choice.mmBalance, BalanceFormat6Choice.mmEligibleBalance, BalanceFormat6Choice.mmNotEligibleBalance,
						BalanceFormat6Choice.mmFullPeriodUnits, BalanceFormat6Choice.mmPartWayPeriodUnits, Balance9.mmQuantity, Balance8.mmQuantity, SafekeepingAccount7.mmBalanceDetails, SafekeepingAccount7.mmAccountSubLevel1Difference,
						AccountSubLevel15.mmBalanceDetails, AccountSubLevel15.mmAccountSubLevel6Difference, AccountSubLevel16.mmBalanceDetails, AccountSubLevel16.mmAccountSubLevel7Difference, AggregateHoldingBalance3.mmBalanceForAccount,
						AccountSubLevel18.mmBalanceDetails, AccountSubLevel18.mmAccountSubLevel9Difference, AccountSubLevel19.mmBalanceDetails, AccountSubLevel11.mmBalanceDetails, AccountSubLevel11.mmAccountSubLevel2Difference,
						AccountSubLevel12.mmBalanceDetails, AccountSubLevel12.mmAccountSubLevel3Difference, AccountSubLevel17.mmBalanceDetails, AccountSubLevel17.mmAccountSubLevel8Difference, AccountSubLevel13.mmBalanceDetails,
						AccountSubLevel13.mmAccountSubLevel4Difference, AccountSubLevel14.mmBalanceDetails, AccountSubLevel14.mmAccountSubLevel5Difference);
				superType_lazy = () -> Balance.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesBalance.mmNetGainLoss, com.tools20022.repository.entity.SecuritiesBalance.mmSecuritiesAccount,
						com.tools20022.repository.entity.SecuritiesBalance.mmEligibleBalanceRelatedEntitlement, com.tools20022.repository.entity.SecuritiesBalance.mmShortLong,
						com.tools20022.repository.entity.SecuritiesBalance.mmAggregateQuantity, com.tools20022.repository.entity.SecuritiesBalance.mmCorporateActionEntitlement,
						com.tools20022.repository.entity.SecuritiesBalance.mmInstructedBalanceRelatedEntitlement, com.tools20022.repository.entity.SecuritiesBalance.mmUninstructedBalanceRelatedEntitlement,
						com.tools20022.repository.entity.SecuritiesBalance.mmMainSecuritiesBalance, com.tools20022.repository.entity.SecuritiesBalance.mmSecuritiesSubBalance,
						com.tools20022.repository.entity.SecuritiesBalance.mmSecuritiesBalanceType, com.tools20022.repository.entity.SecuritiesBalance.mmSubBalanceQuantity, com.tools20022.repository.entity.SecuritiesBalance.mmSecurity,
						com.tools20022.repository.entity.SecuritiesBalance.mmExchangeRate, com.tools20022.repository.entity.SecuritiesBalance.mmAvailabilityIndicator, com.tools20022.repository.entity.SecuritiesBalance.mmAvailableQuantity,
						com.tools20022.repository.entity.SecuritiesBalance.mmRelatedMeetingEntitlement, com.tools20022.repository.entity.SecuritiesBalance.mmUnavailableQuantity,
						com.tools20022.repository.entity.SecuritiesBalance.mmSafekeepingPlace, com.tools20022.repository.entity.SecuritiesBalance.mmSecuritiesEntry,
						com.tools20022.repository.entity.SecuritiesBalance.mmNotEligibleBalanceRelatedEntitlement, com.tools20022.repository.entity.SecuritiesBalance.mmRelatedIntraPositionTransfer,
						com.tools20022.repository.entity.SecuritiesBalance.mmCostAdjustment, com.tools20022.repository.entity.SecuritiesBalance.mmPledgee);
				derivationComponent_lazy = () -> Arrays.asList(BalanceQuantity1Choice.mmObject(), QuantityAndAvailability.mmObject(), SubBalanceQuantity1Choice.mmObject(), AdditionalBalanceInformation2.mmObject(),
						SubBalanceInformation2.mmObject(), AggregateBalancePerSafekeepingPlace4.mmObject(), AggregateBalanceInformation3.mmObject(), AggregateBalancePerSafekeepingPlace3.mmObject(), AggregateBalanceInformation4.mmObject(),
						AccountingStatementOfHoldings2.mmObject(), CustodyStatementOfHoldings2.mmObject(), SecuritiesBalanceType10FormatChoice.mmObject(), SecuritiesBalanceType6FormatChoice.mmObject(),
						SecuritiesBalanceType9FormatChoice.mmObject(), AggregateHoldingBalance2.mmObject(), SubBalanceType9Choice.mmObject(), FinancialInstrumentAggregateBalance2.mmObject(), SubBalanceBreakdown1.mmObject(),
						SubBalanceQuantity5Choice.mmObject(), SecurityPosition8.mmObject(), SecurityPosition9.mmObject(), HoldingBalance8.mmObject(), EligiblePosition5.mmObject(), HoldingBalance7.mmObject(), EligiblePosition6.mmObject(),
						AggregateHoldingBalance1.mmObject(), AggregateBalanceInformation30.mmObject(), AggregateBalanceInformation31.mmObject(), AggregateBalancePerSafekeepingPlace28.mmObject(),
						AggregateBalancePerSafekeepingPlace29.mmObject(), SubBalanceInformation15.mmObject(), SubBalanceType11Choice.mmObject(), SubBalanceQuantity6Choice.mmObject(), AdditionalBalanceInformation15.mmObject(),
						OpeningClosing3Choice.mmObject(), AdditionalBalanceInformation14.mmObject(), SubBalanceType12Choice.mmObject(), SecuritiesSubBalanceTypeAndQuantityBreakdown3.mmObject(), Balance6.mmObject(),
						SubBalanceInformation14.mmObject(), SecuritiesBalanceType7Choice.mmObject(), SecuritiesBalanceType6Choice.mmObject(), OpeningBalance3.mmObject(), ClosingBalance3.mmObject(), Balance7.mmObject(),
						ClosingBalance4Choice.mmObject(), BalanceQuantity8Choice.mmObject(), OpeningBalance4Choice.mmObject(), BalanceQuantity9Choice.mmObject(), BalanceFormat5Choice.mmObject(), SignedQuantityFormat7.mmObject(),
						SignedQuantityFormat6.mmObject(), TotalEligibleBalanceFormat8.mmObject(), BalanceFormat6Choice.mmObject(), Balance9.mmObject(), Balance8.mmObject(), AggregateHoldingBalance3.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesBalance.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getNetGainLoss() {
		return netGainLoss;
	}

	public void setNetGainLoss(CurrencyAndAmount netGainLoss) {
		this.netGainLoss = netGainLoss;
	}

	public SecuritiesAccount getSecuritiesAccount() {
		return securitiesAccount;
	}

	public void setSecuritiesAccount(com.tools20022.repository.entity.SecuritiesAccount securitiesAccount) {
		this.securitiesAccount = securitiesAccount;
	}

	public CorporateActionEntitlement getEligibleBalanceRelatedEntitlement() {
		return eligibleBalanceRelatedEntitlement;
	}

	public void setEligibleBalanceRelatedEntitlement(com.tools20022.repository.entity.CorporateActionEntitlement eligibleBalanceRelatedEntitlement) {
		this.eligibleBalanceRelatedEntitlement = eligibleBalanceRelatedEntitlement;
	}

	public ShortLongCode getShortLong() {
		return shortLong;
	}

	public void setShortLong(ShortLongCode shortLong) {
		this.shortLong = shortLong;
	}

	public SecuritiesQuantity getAggregateQuantity() {
		return aggregateQuantity;
	}

	public void setAggregateQuantity(com.tools20022.repository.entity.SecuritiesQuantity aggregateQuantity) {
		this.aggregateQuantity = aggregateQuantity;
	}

	public CorporateActionEntitlement getCorporateActionEntitlement() {
		return corporateActionEntitlement;
	}

	public void setCorporateActionEntitlement(com.tools20022.repository.entity.CorporateActionEntitlement corporateActionEntitlement) {
		this.corporateActionEntitlement = corporateActionEntitlement;
	}

	public CorporateActionEntitlement getInstructedBalanceRelatedEntitlement() {
		return instructedBalanceRelatedEntitlement;
	}

	public void setInstructedBalanceRelatedEntitlement(com.tools20022.repository.entity.CorporateActionEntitlement instructedBalanceRelatedEntitlement) {
		this.instructedBalanceRelatedEntitlement = instructedBalanceRelatedEntitlement;
	}

	public CorporateActionEntitlement getUninstructedBalanceRelatedEntitlement() {
		return uninstructedBalanceRelatedEntitlement;
	}

	public void setUninstructedBalanceRelatedEntitlement(com.tools20022.repository.entity.CorporateActionEntitlement uninstructedBalanceRelatedEntitlement) {
		this.uninstructedBalanceRelatedEntitlement = uninstructedBalanceRelatedEntitlement;
	}

	public SecuritiesBalance getMainSecuritiesBalance() {
		return mainSecuritiesBalance;
	}

	public void setMainSecuritiesBalance(com.tools20022.repository.entity.SecuritiesBalance mainSecuritiesBalance) {
		this.mainSecuritiesBalance = mainSecuritiesBalance;
	}

	public List<SecuritiesBalance> getSecuritiesSubBalance() {
		return securitiesSubBalance;
	}

	public void setSecuritiesSubBalance(List<com.tools20022.repository.entity.SecuritiesBalance> securitiesSubBalance) {
		this.securitiesSubBalance = securitiesSubBalance;
	}

	public SecuritiesBalanceTypeV2Code getSecuritiesBalanceType() {
		return securitiesBalanceType;
	}

	public void setSecuritiesBalanceType(SecuritiesBalanceTypeV2Code securitiesBalanceType) {
		this.securitiesBalanceType = securitiesBalanceType;
	}

	public SecuritiesQuantity getSubBalanceQuantity() {
		return subBalanceQuantity;
	}

	public void setSubBalanceQuantity(com.tools20022.repository.entity.SecuritiesQuantity subBalanceQuantity) {
		this.subBalanceQuantity = subBalanceQuantity;
	}

	public List<Security> getSecurity() {
		return security;
	}

	public void setSecurity(List<com.tools20022.repository.entity.Security> security) {
		this.security = security;
	}

	public List<CurrencyExchange> getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(List<com.tools20022.repository.entity.CurrencyExchange> exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public YesNoIndicator getAvailabilityIndicator() {
		return availabilityIndicator;
	}

	public void setAvailabilityIndicator(YesNoIndicator availabilityIndicator) {
		this.availabilityIndicator = availabilityIndicator;
	}

	public SecuritiesQuantity getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(com.tools20022.repository.entity.SecuritiesQuantity availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public MeetingEntitlement getRelatedMeetingEntitlement() {
		return relatedMeetingEntitlement;
	}

	public void setRelatedMeetingEntitlement(com.tools20022.repository.entity.MeetingEntitlement relatedMeetingEntitlement) {
		this.relatedMeetingEntitlement = relatedMeetingEntitlement;
	}

	public SecuritiesQuantity getUnavailableQuantity() {
		return unavailableQuantity;
	}

	public void setUnavailableQuantity(com.tools20022.repository.entity.SecuritiesQuantity unavailableQuantity) {
		this.unavailableQuantity = unavailableQuantity;
	}

	public List<SafekeepingPlace> getSafekeepingPlace() {
		return safekeepingPlace;
	}

	public void setSafekeepingPlace(List<com.tools20022.repository.entity.SafekeepingPlace> safekeepingPlace) {
		this.safekeepingPlace = safekeepingPlace;
	}

	public List<SecuritiesEntry> getSecuritiesEntry() {
		return securitiesEntry;
	}

	public void setSecuritiesEntry(List<com.tools20022.repository.entity.SecuritiesEntry> securitiesEntry) {
		this.securitiesEntry = securitiesEntry;
	}

	public CorporateActionEntitlement getNotEligibleBalanceRelatedEntitlement() {
		return notEligibleBalanceRelatedEntitlement;
	}

	public void setNotEligibleBalanceRelatedEntitlement(com.tools20022.repository.entity.CorporateActionEntitlement notEligibleBalanceRelatedEntitlement) {
		this.notEligibleBalanceRelatedEntitlement = notEligibleBalanceRelatedEntitlement;
	}

	public IntraPositionTransfer getRelatedIntraPositionTransfer() {
		return relatedIntraPositionTransfer;
	}

	public void setRelatedIntraPositionTransfer(com.tools20022.repository.entity.IntraPositionTransfer relatedIntraPositionTransfer) {
		this.relatedIntraPositionTransfer = relatedIntraPositionTransfer;
	}

	public CurrencyAndAmount getCostAdjustment() {
		return costAdjustment;
	}

	public void setCostAdjustment(CurrencyAndAmount costAdjustment) {
		this.costAdjustment = costAdjustment;
	}

	public List<Pledgee> getPledgee() {
		return pledgee;
	}

	public void setPledgee(List<com.tools20022.repository.entity.Pledgee> pledgee) {
		this.pledgee = pledgee;
	}
}