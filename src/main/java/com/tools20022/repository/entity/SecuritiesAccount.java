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
import com.tools20022.repository.choice.AccountIdentification32Choice;
import com.tools20022.repository.choice.PurposeCode5Choice;
import com.tools20022.repository.choice.PurposeCode7Choice;
import com.tools20022.repository.codeset.ClearingAccountTypeCode;
import com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Account to or from which a securities entry is made.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesAccount" src="doc-files/SecuritiesAccount.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecuritiesAccountType
 * SecuritiesAccount.mmSecuritiesAccountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedInvestmentAccount
 * SecuritiesAccount.mmRelatedInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedTransfer
 * SecuritiesAccount.mmRelatedTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecuritiesPartyRole
 * SecuritiesAccount.mmSecuritiesPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecurity
 * SecuritiesAccount.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedRegistrar
 * SecuritiesAccount.mmRelatedRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSafekeepingPlace
 * SecuritiesAccount.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecuritiesBalance
 * SecuritiesAccount.mmSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmCorporateActionServicing
 * SecuritiesAccount.mmCorporateActionServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedAllocation
 * SecuritiesAccount.mmRelatedAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecuritiesEntry
 * SecuritiesAccount.mmSecuritiesEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmClearingAccountOwner
 * SecuritiesAccount.mmClearingAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmMarginAccountOwner
 * SecuritiesAccount.mmMarginAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmDeliveryAccountOwner
 * SecuritiesAccount.mmDeliveryAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedPowerOfAttorney
 * SecuritiesAccount.mmRelatedPowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedMeetingInstruction
 * SecuritiesAccount.mmRelatedMeetingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmClearingAccountType
 * SecuritiesAccount.mmClearingAccountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedOrder
 * SecuritiesAccount.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmDisclosedListTrading
 * SecuritiesAccount.mmDisclosedListTrading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmAccountLink
 * SecuritiesAccount.mmAccountLink}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesAccount
 * Security.mmSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmSecuritiesAccount
 * InvestmentAccount.mmSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmAccount
 * SecuritiesTransfer.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmClearingAccount
 * ClearingMemberRole.mmClearingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmMarginAccount
 * ClearingMemberRole.mmMarginAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmDeliveryAccount
 * ClearingMemberRole.mmDeliveryAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole#mmSecuritiesAccount
 * SecuritiesPartyRole.mmSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#mmSecuritiesAccount
 * SecuritiesEntry.mmSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmRelatedSecuritiesAccount
 * SafekeepingPlace.mmRelatedSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesAccount
 * SecuritiesBalance.mmSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegistrarRole#mmRegistrarAccount
 * RegistrarRole.mmRegistrarAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmSecuritiesAccount
 * CorporateActionServicing.mmSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderingAccount
 * SecuritiesOrder.mmOrderingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#mmAllocationAccount
 * Allocation.mmAllocationAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmSafekeepingAccount
 * InstructionForMeeting.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#mmAuthorisedAccount
 * PowerOfAttorney.mmAuthorisedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountLink#mmSecuritiesAccount
 * AccountLink.mmSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DisclosedListTrading#mmDisclosedListTradingAccount
 * DisclosedListTrading.mmDisclosedListTradingAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount79#mmSafekeepingAccount
 * PartyIdentificationAndAccount79.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount83#mmSafekeepingAccount
 * PartyIdentificationAndAccount83.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount77#mmSafekeepingAccount
 * PartyIdentificationAndAccount77.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails4#mmSafekeepingAccount
 * ConfirmationPartyDetails4.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails3#mmSafekeepingAccount
 * ConfirmationPartyDetails3.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails6#mmSafekeepingAccount
 * ConfirmationPartyDetails6.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount34#mmSafekeepingAccount
 * PartyIdentificationAndAccount34.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityMovement1#mmAccountDetails
 * SecurityMovement1.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesProceeds1#mmAccountDetails
 * SecuritiesProceeds1.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1#mmAccountDetails
 * CorporateActionStandingInstructionGeneralInformation1.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstruction1#mmSecuritiesDistributionDetails
 * CorporateActionStandingInstruction1.mmSecuritiesDistributionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount21#mmSubAccount
 * SecuritiesAccount21.mmSubAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarginReport2#mmMarginAccount
 * MarginReport2.mmMarginAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount95#mmAccountIdentification
 * PartyIdentificationAndAccount95.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount100#mmSafekeepingAccount
 * PartyIdentificationAndAccount100.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportItem1#mmAccountIdentification
 * ReportItem1.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification42#mmSafekeepingAccount
 * SubAccountIdentification42.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount40#mmSafekeepingAccount
 * QuantityAndAccount40.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount38#mmSafekeepingAccount
 * QuantityAndAccount38.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification43#mmSafekeepingAccount
 * SubAccountIdentification43.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount106#mmSafekeepingAccount
 * PartyIdentificationAndAccount106.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount117#mmSafekeepingAccount
 * PartyIdentificationAndAccount117.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount108#mmSafekeepingAccount
 * PartyIdentificationAndAccount108.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount107#mmSafekeepingAccount
 * PartyIdentificationAndAccount107.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance34#mmSafekeepingAccount
 * AccountAndBalance34.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance35#mmSafekeepingAccount
 * AccountAndBalance35.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance36#mmSafekeepingAccount
 * AccountAndBalance36.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification32Choice#mmAccountsListAndBalanceDetails
 * AccountIdentification32Choice.mmAccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification31#mmSafekeepingAccount
 * AccountIdentification31.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount122#mmSafekeepingAccount
 * PartyIdentificationAndAccount122.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance33#mmSafekeepingAccount
 * AccountAndBalance33.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification32#mmSafekeepingAccount
 * AccountIdentification32.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount127#mmSafekeepingAccount
 * PartyIdentificationAndAccount127.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount7#mmAccountIdentification
 * SafekeepingAccount7.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount7#mmAccountSubLevel1
 * SafekeepingAccount7.mmAccountSubLevel1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15#mmAccountSubLevel6
 * AccountSubLevel15.mmAccountSubLevel6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel16#mmAccountSubLevel7
 * AccountSubLevel16.mmAccountSubLevel7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18#mmAccountSubLevel9
 * AccountSubLevel18.mmAccountSubLevel9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel11#mmAccountSubLevel2
 * AccountSubLevel11.mmAccountSubLevel2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel12#mmAccountSubLevel3
 * AccountSubLevel12.mmAccountSubLevel3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel17#mmAccountSubLevel8
 * AccountSubLevel17.mmAccountSubLevel8}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13#mmAccountSubLevel4
 * AccountSubLevel13.mmAccountSubLevel4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel14#mmAccountSubLevel5
 * AccountSubLevel14.mmAccountSubLevel5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmSafekeepingAccount
 * SecuritiesFinancingTransactionDetails35.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification51#mmSafekeepingAccount
 * SubAccountIdentification51.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount64#mmSafekeepingAccount
 * QuantityAndAccount64.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount63#mmSafekeepingAccount
 * QuantityAndAccount63.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount159#mmSafekeepingAccount
 * PartyIdentificationAndAccount159.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount65#mmSafekeepingAccount
 * QuantityAndAccount65.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount68#mmSafekeepingAccount
 * QuantityAndAccount68.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification43#mmSafekeepingAccount
 * AccountIdentification43.mmSafekeepingAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingAccount2
 * SafekeepingAccount2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount20
 * SecuritiesAccount20}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PurposeCode5Choice
 * PurposeCode5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount3
 * SecuritiesAccount3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount7
 * SecuritiesAccount7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount9
 * SecuritiesAccount9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount12
 * SecuritiesAccount12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount8
 * SecuritiesAccount8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount10
 * SecuritiesAccount10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IncludedAccount1
 * IncludedAccount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount6
 * SecuritiesAccount6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount21
 * SecuritiesAccount21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount19
 * SecuritiesAccount19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount18
 * SecuritiesAccount18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount22
 * SecuritiesAccount22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingAccount6
 * SafekeepingAccount6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount24
 * SecuritiesAccount24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification42
 * SubAccountIdentification42}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification43
 * SubAccountIdentification43}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount26
 * SecuritiesAccount26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount25
 * SecuritiesAccount25}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PurposeCode7Choice
 * PurposeCode7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance34
 * AccountAndBalance34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance35
 * AccountAndBalance35}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance36
 * AccountAndBalance36}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance33
 * AccountAndBalance33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingAccount7
 * SafekeepingAccount7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel15
 * AccountSubLevel15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel16
 * AccountSubLevel16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel18
 * AccountSubLevel18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel19
 * AccountSubLevel19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel11
 * AccountSubLevel11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel12
 * AccountSubLevel12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel17
 * AccountSubLevel17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel13
 * AccountSubLevel13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel14
 * AccountSubLevel14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification51
 * SubAccountIdentification51}</li>
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
 * "SecuritiesAccount"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Account to or from which a securities entry is made."</li>
 * </ul>
 */
public class SecuritiesAccount extends Account {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesAccountPurposeTypeCode securitiesAccountType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode
	 * SecuritiesAccountPurposeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndPurpose#mmPurpose
	 * AccountIdentificationAndPurpose.mmPurpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount20#mmType
	 * SecuritiesAccount20.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PurposeCode5Choice#mmCode
	 * PurposeCode5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PurposeCode5Choice#mmProprietary
	 * PurposeCode5Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount3#mmType
	 * SecuritiesAccount3.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount19#mmType
	 * SecuritiesAccount19.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount18#mmType
	 * SecuritiesAccount18.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount22#mmType
	 * SecuritiesAccount22.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount24#mmType
	 * SecuritiesAccount24.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount26#mmType
	 * SecuritiesAccount26.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount25#mmType
	 * SecuritiesAccount25.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PurposeCode7Choice#mmCode
	 * PurposeCode7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PurposeCode7Choice#mmProprietary
	 * PurposeCode7Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of securities account."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesAccount, SecuritiesAccountPurposeTypeCode> mmSecuritiesAccountType = new MMBusinessAttribute<SecuritiesAccount, SecuritiesAccountPurposeTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(AccountIdentificationAndPurpose.mmPurpose, SecuritiesAccount20.mmType, PurposeCode5Choice.mmCode, PurposeCode5Choice.mmProprietary, SecuritiesAccount3.mmType, SecuritiesAccount19.mmType,
					SecuritiesAccount18.mmType, SecuritiesAccount22.mmType, SecuritiesAccount24.mmType, SecuritiesAccount26.mmType, SecuritiesAccount25.mmType, PurposeCode7Choice.mmCode, PurposeCode7Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccountType";
			definition = "Specifies the type of securities account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecuritiesAccountPurposeTypeCode.mmObject();
		}

		@Override
		public SecuritiesAccountPurposeTypeCode getValue(SecuritiesAccount obj) {
			return obj.getSecuritiesAccountType();
		}

		@Override
		public void setValue(SecuritiesAccount obj, SecuritiesAccountPurposeTypeCode value) {
			obj.setSecuritiesAccountType(value);
		}
	};
	protected InvestmentAccount relatedInvestmentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmSecuritiesAccount
	 * InvestmentAccount.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment account which contains a securities account to make securities movements."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, InvestmentAccount> mmRelatedInvestmentAccount = new MMBusinessAssociationEnd<SecuritiesAccount, InvestmentAccount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestmentAccount";
			definition = "Investment account which contains a securities account to make securities movements.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> InvestmentAccount.mmSecuritiesAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestmentAccount.mmObject();
		}

		@Override
		public InvestmentAccount getValue(SecuritiesAccount obj) {
			return obj.getRelatedInvestmentAccount();
		}

		@Override
		public void setValue(SecuritiesAccount obj, InvestmentAccount value) {
			obj.setRelatedInvestmentAccount(value);
		}
	};
	protected List<SecuritiesTransfer> relatedTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmAccount
	 * SecuritiesTransfer.mmAccount}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the process which moves securities out of an account to another one."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, List<SecuritiesTransfer>> mmRelatedTransfer = new MMBusinessAssociationEnd<SecuritiesAccount, List<SecuritiesTransfer>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedTransfer";
			definition = "Specifies the process which moves securities out of an account to another one.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesTransfer.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesTransfer.mmObject();
		}

		@Override
		public List<SecuritiesTransfer> getValue(SecuritiesAccount obj) {
			return obj.getRelatedTransfer();
		}

		@Override
		public void setValue(SecuritiesAccount obj, List<SecuritiesTransfer> value) {
			obj.setRelatedTransfer(value);
		}
	};
	protected SecuritiesPartyRole securitiesPartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole#mmSecuritiesAccount
	 * SecuritiesPartyRole.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole
	 * SecuritiesPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the role which uses a securities account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, com.tools20022.repository.entity.SecuritiesPartyRole> mmSecuritiesPartyRole = new MMBusinessAssociationEnd<SecuritiesAccount, com.tools20022.repository.entity.SecuritiesPartyRole>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesPartyRole";
			definition = "Specifies the role which uses a securities account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPartyRole.mmSecuritiesAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPartyRole.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.SecuritiesPartyRole getValue(SecuritiesAccount obj) {
			return obj.getSecuritiesPartyRole();
		}

		@Override
		public void setValue(SecuritiesAccount obj, com.tools20022.repository.entity.SecuritiesPartyRole value) {
			obj.setSecuritiesPartyRole(value);
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
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesAccount
	 * Security.mmSecuritiesAccount}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification51#mmFinancialInstrumentDetails
	 * SubAccountIdentification51.mmFinancialInstrumentDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security which is held on the securities account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, List<Security>> mmSecurity = new MMBusinessAssociationEnd<SecuritiesAccount, List<Security>>() {
		{
			derivation_lazy = () -> Arrays.asList(SubAccountIdentification51.mmFinancialInstrumentDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security which is held on the securities account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmSecuritiesAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}

		@Override
		public List<Security> getValue(SecuritiesAccount obj) {
			return obj.getSecurity();
		}

		@Override
		public void setValue(SecuritiesAccount obj, List<Security> value) {
			obj.setSecurity(value);
		}
	};
	protected RegistrarRole relatedRegistrar;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegistrarRole#mmRegistrarAccount
	 * RegistrarRole.mmRegistrarAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RegistrarRole
	 * RegistrarRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedRegistrar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies where the financial instruments are registered."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, Optional<RegistrarRole>> mmRelatedRegistrar = new MMBusinessAssociationEnd<SecuritiesAccount, Optional<RegistrarRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedRegistrar";
			definition = "Specifies where the financial instruments are registered.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> RegistrarRole.mmRegistrarAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> RegistrarRole.mmObject();
		}

		@Override
		public Optional<RegistrarRole> getValue(SecuritiesAccount obj) {
			return obj.getRelatedRegistrar();
		}

		@Override
		public void setValue(SecuritiesAccount obj, Optional<RegistrarRole> value) {
			obj.setRelatedRegistrar(value.orElse(null));
		}
	};
	protected List<com.tools20022.repository.entity.SafekeepingPlace> safekeepingPlace;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmRelatedSecuritiesAccount
	 * SafekeepingPlace.mmRelatedSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmSafekeepingPlace
	 * TradeLeg8.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation7#mmSafekeepingPlace
	 * SettlementObligation7.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg10#mmSafekeepingPlace
	 * TradeLeg10.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmSafekeepingPlace
	 * TradeLeg9.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmSafekeepingPlace
	 * SettlementObligation8.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification31#mmSafekeepingPlace
	 * AccountIdentification31.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification32#mmSafekeepingPlace
	 * AccountIdentification32.mmSafekeepingPlace}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Location where the financial instruments are safekept."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, List<SafekeepingPlace>> mmSafekeepingPlace = new MMBusinessAssociationEnd<SecuritiesAccount, List<SafekeepingPlace>>() {
		{
			derivation_lazy = () -> Arrays.asList(TradeLeg8.mmSafekeepingPlace, SettlementObligation7.mmSafekeepingPlace, TradeLeg10.mmSafekeepingPlace, TradeLeg9.mmSafekeepingPlace, SettlementObligation8.mmSafekeepingPlace,
					AccountIdentification31.mmSafekeepingPlace, AccountIdentification32.mmSafekeepingPlace);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SafekeepingPlace";
			definition = "Location where the financial instruments are safekept.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmRelatedSecuritiesAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
		}

		@Override
		public List<SafekeepingPlace> getValue(SecuritiesAccount obj) {
			return obj.getSafekeepingPlace();
		}

		@Override
		public void setValue(SecuritiesAccount obj, List<SafekeepingPlace> value) {
			obj.setSafekeepingPlace(value);
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesBalance> securitiesBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesAccount
	 * SecuritiesBalance.mmSecuritiesAccount}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount6#mmInstructedBalance
	 * SafekeepingAccount6.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification42#mmBalanceForSubAccount
	 * SubAccountIdentification42.mmBalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification43#mmBalanceForSubAccount
	 * SubAccountIdentification43.mmBalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance34#mmBalance
	 * AccountAndBalance34.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance35#mmBalance
	 * AccountAndBalance35.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance36#mmConfirmedBalance
	 * AccountAndBalance36.mmConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance33#mmBalance
	 * AccountAndBalance33.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification32#mmConfirmedBalance
	 * AccountIdentification32.mmConfirmedBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of financial assets held by a person or an organisation. It is derived from the association between Account and Balance."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, List<SecuritiesBalance>> mmSecuritiesBalance = new MMBusinessAssociationEnd<SecuritiesAccount, List<SecuritiesBalance>>() {
		{
			derivation_lazy = () -> Arrays.asList(SafekeepingAccount6.mmInstructedBalance, SubAccountIdentification42.mmBalanceForSubAccount, SubAccountIdentification43.mmBalanceForSubAccount, AccountAndBalance34.mmBalance,
					AccountAndBalance35.mmBalance, AccountAndBalance36.mmConfirmedBalance, AccountAndBalance33.mmBalance, AccountIdentification32.mmConfirmedBalance);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBalance";
			definition = "Value of financial assets held by a person or an organisation. It is derived from the association between Account and Balance.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmSecuritiesAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}

		@Override
		public List<SecuritiesBalance> getValue(SecuritiesAccount obj) {
			return obj.getSecuritiesBalance();
		}

		@Override
		public void setValue(SecuritiesAccount obj, List<SecuritiesBalance> value) {
			obj.setSecuritiesBalance(value);
		}
	};
	protected List<com.tools20022.repository.entity.CorporateActionServicing> corporateActionServicing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmSecuritiesAccount
	 * CorporateActionServicing.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
	 * CorporateActionServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionServicing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Actions taken in relation with the securities account in the context of the corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, List<CorporateActionServicing>> mmCorporateActionServicing = new MMBusinessAssociationEnd<SecuritiesAccount, List<CorporateActionServicing>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionServicing";
			definition = "Actions taken in relation with the securities account in the context of the corporate action.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmSecuritiesAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmObject();
		}

		@Override
		public List<CorporateActionServicing> getValue(SecuritiesAccount obj) {
			return obj.getCorporateActionServicing();
		}

		@Override
		public void setValue(SecuritiesAccount obj, List<CorporateActionServicing> value) {
			obj.setCorporateActionServicing(value);
		}
	};
	protected Allocation relatedAllocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#mmAllocationAccount
	 * Allocation.mmAllocationAccount}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allocation process for which an account is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, Optional<Allocation>> mmRelatedAllocation = new MMBusinessAssociationEnd<SecuritiesAccount, Optional<Allocation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedAllocation";
			definition = "Allocation process for which an account is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Allocation.mmAllocationAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Allocation.mmObject();
		}

		@Override
		public Optional<Allocation> getValue(SecuritiesAccount obj) {
			return obj.getRelatedAllocation();
		}

		@Override
		public void setValue(SecuritiesAccount obj, Optional<Allocation> value) {
			obj.setRelatedAllocation(value.orElse(null));
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesEntry> securitiesEntry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#mmSecuritiesAccount
	 * SecuritiesEntry.mmSecuritiesAccount}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Record of the movements into or out of an account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, List<SecuritiesEntry>> mmSecuritiesEntry = new MMBusinessAssociationEnd<SecuritiesAccount, List<SecuritiesEntry>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesEntry";
			definition = "Record of the movements into or out of an account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.mmSecuritiesAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.mmObject();
		}

		@Override
		public List<SecuritiesEntry> getValue(SecuritiesAccount obj) {
			return obj.getSecuritiesEntry();
		}

		@Override
		public void setValue(SecuritiesAccount obj, List<SecuritiesEntry> value) {
			obj.setSecuritiesEntry(value);
		}
	};
	protected ClearingMemberRole clearingAccountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmClearingAccount
	 * ClearingMemberRole.mmClearingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingAccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Clearing member which holds a clearing account at a CCP."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, Optional<ClearingMemberRole>> mmClearingAccountOwner = new MMBusinessAssociationEnd<SecuritiesAccount, Optional<ClearingMemberRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingAccountOwner";
			definition = "Clearing member which holds a clearing account at a CCP.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ClearingMemberRole.mmClearingAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ClearingMemberRole.mmObject();
		}

		@Override
		public Optional<ClearingMemberRole> getValue(SecuritiesAccount obj) {
			return obj.getClearingAccountOwner();
		}

		@Override
		public void setValue(SecuritiesAccount obj, Optional<ClearingMemberRole> value) {
			obj.setClearingAccountOwner(value.orElse(null));
		}
	};
	protected ClearingMemberRole marginAccountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmMarginAccount
	 * ClearingMemberRole.mmMarginAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginAccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Clearing member which holds a margin account at a CCP."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, Optional<ClearingMemberRole>> mmMarginAccountOwner = new MMBusinessAssociationEnd<SecuritiesAccount, Optional<ClearingMemberRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarginAccountOwner";
			definition = "Clearing member which holds a margin account at a CCP.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ClearingMemberRole.mmMarginAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ClearingMemberRole.mmObject();
		}

		@Override
		public Optional<ClearingMemberRole> getValue(SecuritiesAccount obj) {
			return obj.getMarginAccountOwner();
		}

		@Override
		public void setValue(SecuritiesAccount obj, Optional<ClearingMemberRole> value) {
			obj.setMarginAccountOwner(value.orElse(null));
		}
	};
	protected ClearingMemberRole deliveryAccountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmDeliveryAccount
	 * ClearingMemberRole.mmDeliveryAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryAccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Clearing member which holds a delivery account at a CCP."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, Optional<ClearingMemberRole>> mmDeliveryAccountOwner = new MMBusinessAssociationEnd<SecuritiesAccount, Optional<ClearingMemberRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveryAccountOwner";
			definition = "Clearing member which holds a delivery account at a CCP.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ClearingMemberRole.mmDeliveryAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ClearingMemberRole.mmObject();
		}

		@Override
		public Optional<ClearingMemberRole> getValue(SecuritiesAccount obj) {
			return obj.getDeliveryAccountOwner();
		}

		@Override
		public void setValue(SecuritiesAccount obj, Optional<ClearingMemberRole> value) {
			obj.setDeliveryAccountOwner(value.orElse(null));
		}
	};
	protected PowerOfAttorney relatedPowerOfAttorney;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#mmAuthorisedAccount
	 * PowerOfAttorney.mmAuthorisedAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PowerOfAttorney
	 * PowerOfAttorney}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPowerOfAttorney"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Power of attorney related to the securities account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, Optional<PowerOfAttorney>> mmRelatedPowerOfAttorney = new MMBusinessAssociationEnd<SecuritiesAccount, Optional<PowerOfAttorney>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPowerOfAttorney";
			definition = "Power of attorney related to the securities account.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> PowerOfAttorney.mmAuthorisedAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PowerOfAttorney.mmObject();
		}

		@Override
		public Optional<PowerOfAttorney> getValue(SecuritiesAccount obj) {
			return obj.getRelatedPowerOfAttorney();
		}

		@Override
		public void setValue(SecuritiesAccount obj, Optional<PowerOfAttorney> value) {
			obj.setRelatedPowerOfAttorney(value.orElse(null));
		}
	};
	protected InstructionForMeeting relatedMeetingInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmSafekeepingAccount
	 * InstructionForMeeting.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting
	 * InstructionForMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMeetingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting instruction which specifies an account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, Optional<InstructionForMeeting>> mmRelatedMeetingInstruction = new MMBusinessAssociationEnd<SecuritiesAccount, Optional<InstructionForMeeting>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedMeetingInstruction";
			definition = "Meeting instruction which specifies an account.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> InstructionForMeeting.mmSafekeepingAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InstructionForMeeting.mmObject();
		}

		@Override
		public Optional<InstructionForMeeting> getValue(SecuritiesAccount obj) {
			return obj.getRelatedMeetingInstruction();
		}

		@Override
		public void setValue(SecuritiesAccount obj, Optional<InstructionForMeeting> value) {
			obj.setRelatedMeetingInstruction(value.orElse(null));
		}
	};
	protected ClearingAccountTypeCode clearingAccountType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingAccountTypeCode
	 * ClearingAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmClearingAccountType
	 * SettlementObligation8.mmClearingAccountType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingAccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the clearing account type."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesAccount, ClearingAccountTypeCode> mmClearingAccountType = new MMBusinessAttribute<SecuritiesAccount, ClearingAccountTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementObligation8.mmClearingAccountType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingAccountType";
			definition = "Specifies the clearing account type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ClearingAccountTypeCode.mmObject();
		}

		@Override
		public ClearingAccountTypeCode getValue(SecuritiesAccount obj) {
			return obj.getClearingAccountType();
		}

		@Override
		public void setValue(SecuritiesAccount obj, ClearingAccountTypeCode value) {
			obj.setClearingAccountType(value);
		}
	};
	protected SecuritiesOrder relatedOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderingAccount
	 * SecuritiesOrder.mmOrderingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order process for which an ordering account is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, Optional<SecuritiesOrder>> mmRelatedOrder = new MMBusinessAssociationEnd<SecuritiesAccount, Optional<SecuritiesOrder>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order process for which an ordering account is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesOrder.mmOrderingAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}

		@Override
		public Optional<SecuritiesOrder> getValue(SecuritiesAccount obj) {
			return obj.getRelatedOrder();
		}

		@Override
		public void setValue(SecuritiesAccount obj, Optional<SecuritiesOrder> value) {
			obj.setRelatedOrder(value.orElse(null));
		}
	};
	protected DisclosedListTrading disclosedListTrading;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DisclosedListTrading#mmDisclosedListTradingAccount
	 * DisclosedListTrading.mmDisclosedListTradingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.DisclosedListTrading
	 * DisclosedListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisclosedListTrading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Disclosed list trading process for which a trading account is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, Optional<DisclosedListTrading>> mmDisclosedListTrading = new MMBusinessAssociationEnd<SecuritiesAccount, Optional<DisclosedListTrading>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisclosedListTrading";
			definition = "Disclosed list trading process for which a trading account is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DisclosedListTrading.mmDisclosedListTradingAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DisclosedListTrading.mmObject();
		}

		@Override
		public Optional<DisclosedListTrading> getValue(SecuritiesAccount obj) {
			return obj.getDisclosedListTrading();
		}

		@Override
		public void setValue(SecuritiesAccount obj, Optional<DisclosedListTrading> value) {
			obj.setDisclosedListTrading(value.orElse(null));
		}
	};
	protected AccountLink accountLink;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountLink#mmSecuritiesAccount
	 * AccountLink.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountLink
	 * AccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountLink"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the link between a cash account and a securities account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, com.tools20022.repository.entity.AccountLink> mmAccountLink = new MMBusinessAssociationEnd<SecuritiesAccount, com.tools20022.repository.entity.AccountLink>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountLink";
			definition = "Defines the link between a cash account and a securities account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountLink.mmSecuritiesAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountLink.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.AccountLink getValue(SecuritiesAccount obj) {
			return obj.getAccountLink();
		}

		@Override
		public void setValue(SecuritiesAccount obj, com.tools20022.repository.entity.AccountLink value) {
			obj.setAccountLink(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesAccount";
				definition = "Account to or from which a securities entry is made.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmSecuritiesAccount, InvestmentAccount.mmSecuritiesAccount, SecuritiesTransfer.mmAccount, ClearingMemberRole.mmClearingAccount,
						ClearingMemberRole.mmMarginAccount, ClearingMemberRole.mmDeliveryAccount, com.tools20022.repository.entity.SecuritiesPartyRole.mmSecuritiesAccount,
						com.tools20022.repository.entity.SecuritiesEntry.mmSecuritiesAccount, com.tools20022.repository.entity.SafekeepingPlace.mmRelatedSecuritiesAccount,
						com.tools20022.repository.entity.SecuritiesBalance.mmSecuritiesAccount, RegistrarRole.mmRegistrarAccount, com.tools20022.repository.entity.CorporateActionServicing.mmSecuritiesAccount,
						SecuritiesOrder.mmOrderingAccount, Allocation.mmAllocationAccount, InstructionForMeeting.mmSafekeepingAccount, PowerOfAttorney.mmAuthorisedAccount, com.tools20022.repository.entity.AccountLink.mmSecuritiesAccount,
						com.tools20022.repository.entity.DisclosedListTrading.mmDisclosedListTradingAccount);
				derivationElement_lazy = () -> Arrays.asList(PartyIdentificationAndAccount79.mmSafekeepingAccount, PartyIdentificationAndAccount83.mmSafekeepingAccount, PartyIdentificationAndAccount77.mmSafekeepingAccount,
						ConfirmationPartyDetails4.mmSafekeepingAccount, ConfirmationPartyDetails3.mmSafekeepingAccount, ConfirmationPartyDetails6.mmSafekeepingAccount, PartyIdentificationAndAccount34.mmSafekeepingAccount,
						SecurityMovement1.mmAccountDetails, SecuritiesProceeds1.mmAccountDetails, CorporateActionStandingInstructionGeneralInformation1.mmAccountDetails, CorporateActionStandingInstruction1.mmSecuritiesDistributionDetails,
						SecuritiesAccount21.mmSubAccount, MarginReport2.mmMarginAccount, PartyIdentificationAndAccount95.mmAccountIdentification, PartyIdentificationAndAccount100.mmSafekeepingAccount, ReportItem1.mmAccountIdentification,
						SubAccountIdentification42.mmSafekeepingAccount, QuantityAndAccount40.mmSafekeepingAccount, QuantityAndAccount38.mmSafekeepingAccount, SubAccountIdentification43.mmSafekeepingAccount,
						PartyIdentificationAndAccount106.mmSafekeepingAccount, PartyIdentificationAndAccount117.mmSafekeepingAccount, PartyIdentificationAndAccount108.mmSafekeepingAccount,
						PartyIdentificationAndAccount107.mmSafekeepingAccount, AccountAndBalance34.mmSafekeepingAccount, AccountAndBalance35.mmSafekeepingAccount, AccountAndBalance36.mmSafekeepingAccount,
						AccountIdentification32Choice.mmAccountsListAndBalanceDetails, AccountIdentification31.mmSafekeepingAccount, PartyIdentificationAndAccount122.mmSafekeepingAccount, AccountAndBalance33.mmSafekeepingAccount,
						AccountIdentification32.mmSafekeepingAccount, PartyIdentificationAndAccount127.mmSafekeepingAccount, SafekeepingAccount7.mmAccountIdentification, SafekeepingAccount7.mmAccountSubLevel1,
						AccountSubLevel15.mmAccountSubLevel6, AccountSubLevel16.mmAccountSubLevel7, AccountSubLevel18.mmAccountSubLevel9, AccountSubLevel11.mmAccountSubLevel2, AccountSubLevel12.mmAccountSubLevel3,
						AccountSubLevel17.mmAccountSubLevel8, AccountSubLevel13.mmAccountSubLevel4, AccountSubLevel14.mmAccountSubLevel5, SecuritiesFinancingTransactionDetails35.mmSafekeepingAccount,
						SubAccountIdentification51.mmSafekeepingAccount, QuantityAndAccount64.mmSafekeepingAccount, QuantityAndAccount63.mmSafekeepingAccount, PartyIdentificationAndAccount159.mmSafekeepingAccount,
						QuantityAndAccount65.mmSafekeepingAccount, QuantityAndAccount68.mmSafekeepingAccount, AccountIdentification43.mmSafekeepingAccount);
				superType_lazy = () -> Account.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesAccount.mmSecuritiesAccountType, com.tools20022.repository.entity.SecuritiesAccount.mmRelatedInvestmentAccount,
						com.tools20022.repository.entity.SecuritiesAccount.mmRelatedTransfer, com.tools20022.repository.entity.SecuritiesAccount.mmSecuritiesPartyRole, com.tools20022.repository.entity.SecuritiesAccount.mmSecurity,
						com.tools20022.repository.entity.SecuritiesAccount.mmRelatedRegistrar, com.tools20022.repository.entity.SecuritiesAccount.mmSafekeepingPlace, com.tools20022.repository.entity.SecuritiesAccount.mmSecuritiesBalance,
						com.tools20022.repository.entity.SecuritiesAccount.mmCorporateActionServicing, com.tools20022.repository.entity.SecuritiesAccount.mmRelatedAllocation,
						com.tools20022.repository.entity.SecuritiesAccount.mmSecuritiesEntry, com.tools20022.repository.entity.SecuritiesAccount.mmClearingAccountOwner,
						com.tools20022.repository.entity.SecuritiesAccount.mmMarginAccountOwner, com.tools20022.repository.entity.SecuritiesAccount.mmDeliveryAccountOwner,
						com.tools20022.repository.entity.SecuritiesAccount.mmRelatedPowerOfAttorney, com.tools20022.repository.entity.SecuritiesAccount.mmRelatedMeetingInstruction,
						com.tools20022.repository.entity.SecuritiesAccount.mmClearingAccountType, com.tools20022.repository.entity.SecuritiesAccount.mmRelatedOrder, com.tools20022.repository.entity.SecuritiesAccount.mmDisclosedListTrading,
						com.tools20022.repository.entity.SecuritiesAccount.mmAccountLink);
				derivationComponent_lazy = () -> Arrays.asList(SafekeepingAccount2.mmObject(), SecuritiesAccount20.mmObject(), PurposeCode5Choice.mmObject(), SecuritiesAccount3.mmObject(), SecuritiesAccount7.mmObject(),
						SecuritiesAccount9.mmObject(), SecuritiesAccount12.mmObject(), SecuritiesAccount8.mmObject(), SecuritiesAccount10.mmObject(), IncludedAccount1.mmObject(), SecuritiesAccount6.mmObject(),
						SecuritiesAccount21.mmObject(), SecuritiesAccount19.mmObject(), SecuritiesAccount18.mmObject(), SecuritiesAccount22.mmObject(), SafekeepingAccount6.mmObject(), SecuritiesAccount24.mmObject(),
						SubAccountIdentification42.mmObject(), SubAccountIdentification43.mmObject(), SecuritiesAccount26.mmObject(), SecuritiesAccount25.mmObject(), PurposeCode7Choice.mmObject(), AccountAndBalance34.mmObject(),
						AccountAndBalance35.mmObject(), AccountAndBalance36.mmObject(), AccountAndBalance33.mmObject(), SafekeepingAccount7.mmObject(), AccountSubLevel15.mmObject(), AccountSubLevel16.mmObject(),
						AccountSubLevel18.mmObject(), AccountSubLevel19.mmObject(), AccountSubLevel11.mmObject(), AccountSubLevel12.mmObject(), AccountSubLevel17.mmObject(), AccountSubLevel13.mmObject(), AccountSubLevel14.mmObject(),
						SubAccountIdentification51.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesAccount.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesAccountPurposeTypeCode getSecuritiesAccountType() {
		return securitiesAccountType;
	}

	public SecuritiesAccount setSecuritiesAccountType(SecuritiesAccountPurposeTypeCode securitiesAccountType) {
		this.securitiesAccountType = Objects.requireNonNull(securitiesAccountType);
		return this;
	}

	public InvestmentAccount getRelatedInvestmentAccount() {
		return relatedInvestmentAccount;
	}

	public SecuritiesAccount setRelatedInvestmentAccount(InvestmentAccount relatedInvestmentAccount) {
		this.relatedInvestmentAccount = Objects.requireNonNull(relatedInvestmentAccount);
		return this;
	}

	public List<SecuritiesTransfer> getRelatedTransfer() {
		return relatedTransfer == null ? relatedTransfer = new ArrayList<>() : relatedTransfer;
	}

	public SecuritiesAccount setRelatedTransfer(List<SecuritiesTransfer> relatedTransfer) {
		this.relatedTransfer = Objects.requireNonNull(relatedTransfer);
		return this;
	}

	public SecuritiesPartyRole getSecuritiesPartyRole() {
		return securitiesPartyRole;
	}

	public SecuritiesAccount setSecuritiesPartyRole(com.tools20022.repository.entity.SecuritiesPartyRole securitiesPartyRole) {
		this.securitiesPartyRole = Objects.requireNonNull(securitiesPartyRole);
		return this;
	}

	public List<Security> getSecurity() {
		return security == null ? security = new ArrayList<>() : security;
	}

	public SecuritiesAccount setSecurity(List<com.tools20022.repository.entity.Security> security) {
		this.security = Objects.requireNonNull(security);
		return this;
	}

	public Optional<RegistrarRole> getRelatedRegistrar() {
		return relatedRegistrar == null ? Optional.empty() : Optional.of(relatedRegistrar);
	}

	public SecuritiesAccount setRelatedRegistrar(RegistrarRole relatedRegistrar) {
		this.relatedRegistrar = relatedRegistrar;
		return this;
	}

	public List<SafekeepingPlace> getSafekeepingPlace() {
		return safekeepingPlace == null ? safekeepingPlace = new ArrayList<>() : safekeepingPlace;
	}

	public SecuritiesAccount setSafekeepingPlace(List<com.tools20022.repository.entity.SafekeepingPlace> safekeepingPlace) {
		this.safekeepingPlace = Objects.requireNonNull(safekeepingPlace);
		return this;
	}

	public List<SecuritiesBalance> getSecuritiesBalance() {
		return securitiesBalance == null ? securitiesBalance = new ArrayList<>() : securitiesBalance;
	}

	public SecuritiesAccount setSecuritiesBalance(List<com.tools20022.repository.entity.SecuritiesBalance> securitiesBalance) {
		this.securitiesBalance = Objects.requireNonNull(securitiesBalance);
		return this;
	}

	public List<CorporateActionServicing> getCorporateActionServicing() {
		return corporateActionServicing == null ? corporateActionServicing = new ArrayList<>() : corporateActionServicing;
	}

	public SecuritiesAccount setCorporateActionServicing(List<com.tools20022.repository.entity.CorporateActionServicing> corporateActionServicing) {
		this.corporateActionServicing = Objects.requireNonNull(corporateActionServicing);
		return this;
	}

	public Optional<Allocation> getRelatedAllocation() {
		return relatedAllocation == null ? Optional.empty() : Optional.of(relatedAllocation);
	}

	public SecuritiesAccount setRelatedAllocation(Allocation relatedAllocation) {
		this.relatedAllocation = relatedAllocation;
		return this;
	}

	public List<SecuritiesEntry> getSecuritiesEntry() {
		return securitiesEntry == null ? securitiesEntry = new ArrayList<>() : securitiesEntry;
	}

	public SecuritiesAccount setSecuritiesEntry(List<com.tools20022.repository.entity.SecuritiesEntry> securitiesEntry) {
		this.securitiesEntry = Objects.requireNonNull(securitiesEntry);
		return this;
	}

	public Optional<ClearingMemberRole> getClearingAccountOwner() {
		return clearingAccountOwner == null ? Optional.empty() : Optional.of(clearingAccountOwner);
	}

	public SecuritiesAccount setClearingAccountOwner(ClearingMemberRole clearingAccountOwner) {
		this.clearingAccountOwner = clearingAccountOwner;
		return this;
	}

	public Optional<ClearingMemberRole> getMarginAccountOwner() {
		return marginAccountOwner == null ? Optional.empty() : Optional.of(marginAccountOwner);
	}

	public SecuritiesAccount setMarginAccountOwner(ClearingMemberRole marginAccountOwner) {
		this.marginAccountOwner = marginAccountOwner;
		return this;
	}

	public Optional<ClearingMemberRole> getDeliveryAccountOwner() {
		return deliveryAccountOwner == null ? Optional.empty() : Optional.of(deliveryAccountOwner);
	}

	public SecuritiesAccount setDeliveryAccountOwner(ClearingMemberRole deliveryAccountOwner) {
		this.deliveryAccountOwner = deliveryAccountOwner;
		return this;
	}

	public Optional<PowerOfAttorney> getRelatedPowerOfAttorney() {
		return relatedPowerOfAttorney == null ? Optional.empty() : Optional.of(relatedPowerOfAttorney);
	}

	public SecuritiesAccount setRelatedPowerOfAttorney(PowerOfAttorney relatedPowerOfAttorney) {
		this.relatedPowerOfAttorney = relatedPowerOfAttorney;
		return this;
	}

	public Optional<InstructionForMeeting> getRelatedMeetingInstruction() {
		return relatedMeetingInstruction == null ? Optional.empty() : Optional.of(relatedMeetingInstruction);
	}

	public SecuritiesAccount setRelatedMeetingInstruction(InstructionForMeeting relatedMeetingInstruction) {
		this.relatedMeetingInstruction = relatedMeetingInstruction;
		return this;
	}

	public ClearingAccountTypeCode getClearingAccountType() {
		return clearingAccountType;
	}

	public SecuritiesAccount setClearingAccountType(ClearingAccountTypeCode clearingAccountType) {
		this.clearingAccountType = Objects.requireNonNull(clearingAccountType);
		return this;
	}

	public Optional<SecuritiesOrder> getRelatedOrder() {
		return relatedOrder == null ? Optional.empty() : Optional.of(relatedOrder);
	}

	public SecuritiesAccount setRelatedOrder(SecuritiesOrder relatedOrder) {
		this.relatedOrder = relatedOrder;
		return this;
	}

	public Optional<DisclosedListTrading> getDisclosedListTrading() {
		return disclosedListTrading == null ? Optional.empty() : Optional.of(disclosedListTrading);
	}

	public SecuritiesAccount setDisclosedListTrading(com.tools20022.repository.entity.DisclosedListTrading disclosedListTrading) {
		this.disclosedListTrading = disclosedListTrading;
		return this;
	}

	public AccountLink getAccountLink() {
		return accountLink;
	}

	public SecuritiesAccount setAccountLink(com.tools20022.repository.entity.AccountLink accountLink) {
		this.accountLink = Objects.requireNonNull(accountLink);
		return this;
	}
}