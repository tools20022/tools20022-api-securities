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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * An event determined by a corporation's board of directors, that changes the
 * existing corporate capital structure or financial condition.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionEvent" src="doc-files/CorporateActionEvent.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmType
 * CorporateActionEvent.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmMandatoryVoluntaryEventType
 * CorporateActionEvent.mmMandatoryVoluntaryEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmUnderlyingSecurity
 * CorporateActionEvent.mmUnderlyingSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionPrice
 * CorporateActionEvent.mmCorporateActionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmExchangeRate
 * CorporateActionEvent.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmRegistrationDetails
 * CorporateActionEvent.mmRegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmBasketOrIndexInformation
 * CorporateActionEvent.mmBasketOrIndexInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmDeadline
 * CorporateActionEvent.mmDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmAdditionalBusinessProcess
 * CorporateActionEvent.mmAdditionalBusinessProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmTradingDate
 * CorporateActionEvent.mmTradingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionCharge
 * CorporateActionEvent.mmCorporateActionCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmPariPassuDate
 * CorporateActionEvent.mmPariPassuDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmInformationConditions
 * CorporateActionEvent.mmInformationConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmFractionalQuantity
 * CorporateActionEvent.mmFractionalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmEventProcessingType
 * CorporateActionEvent.mmEventProcessingType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionStatus
 * CorporateActionEvent.mmCorporateActionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmAnnouncementDate
 * CorporateActionEvent.mmAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmEffectiveDate
 * CorporateActionEvent.mmEffectiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmFurtherDetailsAnnouncementDate
 * CorporateActionEvent.mmFurtherDetailsAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmMarginFixingDate
 * CorporateActionEvent.mmMarginFixingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmResultPublicationDate
 * CorporateActionEvent.mmResultPublicationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmUnconditionalDate
 * CorporateActionEvent.mmUnconditionalDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmWhollyUnconditionalDate
 * CorporateActionEvent.mmWhollyUnconditionalDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmLapsedDate
 * CorporateActionEvent.mmLapsedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmBookClosurePeriod
 * CorporateActionEvent.mmBookClosurePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmSecuritiesQuantity
 * CorporateActionEvent.mmSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmRestrictionIndicator
 * CorporateActionEvent.mmRestrictionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmEventStage
 * CorporateActionEvent.mmEventStage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmDocumentationLocation
 * CorporateActionEvent.mmDocumentationLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmSecuritiesQuantitySought
 * CorporateActionEvent.mmSecuritiesQuantitySought}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmPartialElectionIndicator
 * CorporateActionEvent.mmPartialElectionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionPartyRole
 * CorporateActionEvent.mmCorporateActionPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmMarketClaim
 * CorporateActionEvent.mmMarketClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmBiddingConditions
 * CorporateActionEvent.mmBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmRelatedClassAction
 * CorporateActionEvent.mmRelatedClassAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionEventRegistration
 * CorporateActionEvent.mmCorporateActionEventRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmSuspensionPeriod
 * CorporateActionEvent.mmSuspensionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmLottery
 * CorporateActionEvent.mmLottery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmMarginType
 * CorporateActionEvent.mmMarginType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmRelatedMeeting
 * CorporateActionEvent.mmRelatedMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmServices
 * CorporateActionEvent.mmServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmIssuance
 * CorporateActionEvent.mmIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmSecuritiesModification
 * CorporateActionEvent.mmSecuritiesModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmTradingPeriod
 * CorporateActionEvent.mmTradingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmTransactionTax
 * CorporateActionEvent.mmTransactionTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmConsentType
 * CorporateActionEvent.mmConsentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmProceedsDefinition
 * CorporateActionEvent.mmProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmTaxOnNonDistributedProceedsIndicator
 * CorporateActionEvent.mmTaxOnNonDistributedProceedsIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmCorporateEvent
 * Security.mmCorporateEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedCorporateActionEvent
 * ContactPoint.mmRelatedCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmBookClosureCorporateAction
 * DateTimePeriod.mmBookClosureCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedCorporateAction
 * DateTimePeriod.mmRelatedCorporateAction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmCorporateActionEvent
 * Tax.mmCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedEventForFractionalQuantity
 * SecuritiesQuantity.mmRelatedEventForFractionalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmCorporateActionEvent
 * SecuritiesQuantity.mmCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedCorporateActionEvent
 * SecuritiesQuantity.mmRelatedCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmCorporateActionEvent
 * CorporateActionStatus.mmCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmRelatedCorporateActionEvent
 * CurrencyExchange.mmRelatedCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmCorporateActionEvent
 * CorporateActionEventRegistration.mmCorporateActionEvent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#mmEventInformation
 * Issuance.mmEventInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmCorporateAction
 * ProceedsDefinition.mmCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClassAction#mmCorporateEvent
 * ClassAction.mmCorporateEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmRelatedCorporateEvent
 * SecuritiesModification.mmRelatedCorporateEvent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BiddingConditions#mmEvent
 * BiddingConditions.mmEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCorporateActionEvent
 * CorporateActionPrice.mmCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmEvent
 * CorporateActionServicing.mmEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Deadline#mmRelatedCorporateActionEvent
 * Deadline.mmRelatedCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmCorporateAction
 * CorporateActionFeesAndCharges.mmCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarketClaim#mmRelatedCorporateEvent
 * MarketClaim.mmRelatedCorporateEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmCorporateActionEvent
 * SuspensionPeriod.mmCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Lottery#mmRelatedCorporateEvent
 * Lottery.mmRelatedCorporateEvent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmCorporateEvent
 * Meeting.mmCorporateEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPartyRole#mmCorporateActionEvent
 * CorporateActionPartyRole.mmCorporateActionEvent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction2#mmDateDetails
 * CorporateAction2.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmPeriodDetails
 * CorporateAction2.mmPeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmRateAndAmountDetails
 * CorporateAction2.mmRateAndAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmDateDetails
 * CorporateAction41.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmPeriodDetails
 * CorporateAction41.mmPeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmRateAndAmountDetails
 * CorporateAction41.mmRateAndAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction43#mmDateDetails
 * CorporateAction43.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction42#mmDateDetails
 * CorporateAction42.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance13#mmGeneralInformation
 * CorporateActionEventAndBalance13.mmGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmRateDetails
 * SecuritiesOption64.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption65#mmRateDetails
 * SecuritiesOption65.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction44#mmDateDetails
 * CorporateAction44.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction45#mmDateDetails
 * CorporateAction45.mmDateDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionNarrative10
 * CorporateActionNarrative10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingType1FormatChoice
 * CorporateActionEventProcessingType1FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionMandatoryVoluntary1FormatChoice
 * CorporateActionMandatoryVoluntary1FormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionInformation2
 * CorporateActionInformation2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStage1FormatChoice
 * CorporateActionEventStage1FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionFrequencyType1FormatChoice
 * CorporateActionFrequencyType1FormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionDate2
 * CorporateActionDate2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPeriod1
 * CorporateActionPeriod1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionRate1
 * CorporateActionRate1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionNarrative1
 * CorporateActionNarrative1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction2
 * CorporateAction2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionDate4
 * CorporateActionDate4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionRate2
 * CorporateActionRate2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPeriod2
 * CorporateActionPeriod2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionDate3
 * CorporateActionDate3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionDate5
 * CorporateActionDate5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionAmounts1
 * CorporateActionAmounts1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionNarrative2
 * CorporateActionNarrative2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionInformation1
 * CorporateActionInformation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1
 * CorporateActionAdditionalInformation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstruction1
 * CorporateActionDeactivationInstruction1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStage3Choice
 * CorporateActionEventStage3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation92
 * CorporateActionGeneralInformation92}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionNarrative27
 * CorporateActionNarrative27}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingType2Choice
 * CorporateActionEventProcessingType2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionMandatoryVoluntary3Choice
 * CorporateActionMandatoryVoluntary3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat14Choice
 * CorporateActionEventStageFormat14Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat10Choice
 * AdditionalBusinessProcessFormat10Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat11Choice
 * AdditionalBusinessProcessFormat11Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat9Choice
 * AdditionalBusinessProcessFormat9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionRate71
 * CorporateActionRate71}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionQuantity7
 * CorporateActionQuantity7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CertificationTypeFormat3Choice
 * CertificationTypeFormat3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat13Choice
 * CorporateActionEventStageFormat13Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionNarrative26
 * CorporateActionNarrative26}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ConsentTypeFormat4Choice
 * ConsentTypeFormat4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionNarrative30
 * CorporateActionNarrative30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionNarrative31
 * CorporateActionNarrative31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionNarrative28
 * CorporateActionNarrative28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionNarrative29
 * CorporateActionNarrative29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionNarrative32
 * CorporateActionNarrative32}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation109
 * CorporateActionGeneralInformation109}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation110
 * CorporateActionGeneralInformation110}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation107
 * CorporateActionGeneralInformation107}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType52Choice
 * CorporateActionEventType52Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType73Choice
 * CorporateActionEventType73Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation127
 * CorporateActionGeneralInformation127}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation126
 * CorporateActionGeneralInformation126}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction41
 * CorporateAction41}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation125
 * CorporateActionGeneralInformation125}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation124
 * CorporateActionGeneralInformation124}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction43
 * CorporateAction43}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction42
 * CorporateAction42}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation128
 * CorporateActionGeneralInformation128}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance13
 * CorporateActionEventAndBalance13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionAmounts42
 * CorporateActionAmounts42}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails31 RateDetails31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionAmounts43
 * CorporateActionAmounts43}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionRate86
 * CorporateActionRate86}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType74Choice
 * CorporateActionEventType74Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails32 RateDetails32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionRate87
 * CorporateActionRate87}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionRate90
 * CorporateActionRate90}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionEventDeadlines1
 * CorporateActionEventDeadlines1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionRate91
 * CorporateActionRate91}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType75Choice
 * CorporateActionEventType75Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionRate88
 * CorporateActionRate88}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionQuantity9
 * CorporateActionQuantity9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionAmounts44
 * CorporateActionAmounts44}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionRate89
 * CorporateActionRate89}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstructedBalanceDetails7
 * InstructedBalanceDetails7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat15Choice
 * AdditionalBusinessProcessFormat15Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType76Choice
 * CorporateActionEventType76Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction44
 * CorporateAction44}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionDate59
 * CorporateActionDate59}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction45
 * CorporateAction45}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionDate60
 * CorporateActionDate60}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate15 SecurityDate15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionDate61
 * CorporateActionDate61}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionDate62
 * CorporateActionDate62}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionDate63
 * CorporateActionDate63}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionDate64
 * CorporateActionDate64}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EventInformation11
 * EventInformation11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPeriod12
 * CorporateActionPeriod12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPeriod13
 * CorporateActionPeriod13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPeriod14
 * CorporateActionPeriod14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionDate65
 * CorporateActionDate65}</li>
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
 * "CorporateActionEvent"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "An event determined by a corporation's board of directors, that changes the existing corporate capital structure or financial condition."
 * </li>
 * </ul>
 */
public class CorporateActionEvent {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionEventTypeV3Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType2FormatChoice#mmCode
	 * CorporateActionEventType2FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType2FormatChoice#mmProprietary
	 * CorporateActionEventType2FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation2#mmEventType
	 * CorporateActionInformation2.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionFrequencyType1FormatChoice#mmCode
	 * CorporateActionFrequencyType1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionFrequencyType1FormatChoice#mmProprietary
	 * CorporateActionFrequencyType1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1#mmEventType
	 * CorporateActionInformation1.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1#mmEventType
	 * CorporateActionStandingInstructionGeneralInformation1.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionType1Choice#mmCorporateActionType
	 * TransactionType1Choice.mmCorporateActionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateAction1Choice#mmType
	 * CorporateAction1Choice.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateAction1Choice#mmProprietary
	 * CorporateAction1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation109#mmEventType
	 * CorporateActionGeneralInformation109.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation110#mmEventType
	 * CorporateActionGeneralInformation110.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation107#mmEventType
	 * CorporateActionGeneralInformation107.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType52Choice#mmCode
	 * CorporateActionEventType52Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType52Choice#mmProprietary
	 * CorporateActionEventType52Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent22Choice#mmCorporateActionEventType
	 * SettlementOrCorporateActionEvent22Choice.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType73Choice#mmCode
	 * CorporateActionEventType73Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType73Choice#mmProprietary
	 * CorporateActionEventType73Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent23Choice#mmCorporateActionEventType
	 * SettlementOrCorporateActionEvent23Choice.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails15#mmCorporateActionEventType
	 * IntraPositionMovementDetails15.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation127#mmEventType
	 * CorporateActionGeneralInformation127.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation126#mmEventType
	 * CorporateActionGeneralInformation126.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation125#mmEventType
	 * CorporateActionGeneralInformation125.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation124#mmEventType
	 * CorporateActionGeneralInformation124.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation128#mmEventType
	 * CorporateActionGeneralInformation128.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType74Choice#mmCode
	 * CorporateActionEventType74Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType74Choice#mmProprietary
	 * CorporateActionEventType74Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType75Choice#mmCode
	 * CorporateActionEventType75Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType75Choice#mmProprietary
	 * CorporateActionEventType75Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType76Choice#mmCode
	 * CorporateActionEventType76Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType76Choice#mmProprietary
	 * CorporateActionEventType76Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation11#mmEventType
	 * EventInformation11.mmEventType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of corporate action event."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, CorporateActionEventTypeV3Code> mmType = new MMBusinessAttribute<CorporateActionEvent, CorporateActionEventTypeV3Code>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionEventType2FormatChoice.mmCode, CorporateActionEventType2FormatChoice.mmProprietary, CorporateActionInformation2.mmEventType, CorporateActionFrequencyType1FormatChoice.mmCode,
					CorporateActionFrequencyType1FormatChoice.mmProprietary, CorporateActionInformation1.mmEventType, CorporateActionStandingInstructionGeneralInformation1.mmEventType, TransactionType1Choice.mmCorporateActionType,
					CorporateAction1Choice.mmType, CorporateAction1Choice.mmProprietary, CorporateActionGeneralInformation109.mmEventType, CorporateActionGeneralInformation110.mmEventType, CorporateActionGeneralInformation107.mmEventType,
					CorporateActionEventType52Choice.mmCode, CorporateActionEventType52Choice.mmProprietary, SettlementOrCorporateActionEvent22Choice.mmCorporateActionEventType, CorporateActionEventType73Choice.mmCode,
					CorporateActionEventType73Choice.mmProprietary, SettlementOrCorporateActionEvent23Choice.mmCorporateActionEventType, IntraPositionMovementDetails15.mmCorporateActionEventType,
					CorporateActionGeneralInformation127.mmEventType, CorporateActionGeneralInformation126.mmEventType, CorporateActionGeneralInformation125.mmEventType, CorporateActionGeneralInformation124.mmEventType,
					CorporateActionGeneralInformation128.mmEventType, CorporateActionEventType74Choice.mmCode, CorporateActionEventType74Choice.mmProprietary, CorporateActionEventType75Choice.mmCode,
					CorporateActionEventType75Choice.mmProprietary, CorporateActionEventType76Choice.mmCode, CorporateActionEventType76Choice.mmProprietary, EventInformation11.mmEventType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionEventTypeV3Code.mmObject();
		}

		@Override
		public CorporateActionEventTypeV3Code getValue(CorporateActionEvent obj) {
			return obj.getType();
		}

		@Override
		public void setValue(CorporateActionEvent obj, CorporateActionEventTypeV3Code value) {
			obj.setType(value);
		}
	};
	protected CorporateActionMandatoryVoluntaryCode mandatoryVoluntaryEventType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionMandatoryVoluntaryCode
	 * CorporateActionMandatoryVoluntaryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionMandatoryVoluntary1FormatChoice#mmCode
	 * CorporateActionMandatoryVoluntary1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionMandatoryVoluntary1FormatChoice#mmProprietary
	 * CorporateActionMandatoryVoluntary1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation2#mmMandatoryVoluntaryEventType
	 * CorporateActionInformation2.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1#mmMandatoryVoluntaryEventType
	 * CorporateActionInformation1.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionMandatoryVoluntary3Choice#mmCode
	 * CorporateActionMandatoryVoluntary3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionMandatoryVoluntary3Choice#mmProprietary
	 * CorporateActionMandatoryVoluntary3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation127#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation127.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation125#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation125.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation124#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation124.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation128#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation128.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation11#mmMandatoryVoluntaryEventType
	 * EventInformation11.mmMandatoryVoluntaryEventType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatoryVoluntaryEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the event is mandatory, mandatory with options or voluntary."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, CorporateActionMandatoryVoluntaryCode> mmMandatoryVoluntaryEventType = new MMBusinessAttribute<CorporateActionEvent, CorporateActionMandatoryVoluntaryCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionMandatoryVoluntary1FormatChoice.mmCode, CorporateActionMandatoryVoluntary1FormatChoice.mmProprietary, CorporateActionInformation2.mmMandatoryVoluntaryEventType,
					CorporateActionInformation1.mmMandatoryVoluntaryEventType, CorporateActionMandatoryVoluntary3Choice.mmCode, CorporateActionMandatoryVoluntary3Choice.mmProprietary,
					CorporateActionGeneralInformation127.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation125.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation124.mmMandatoryVoluntaryEventType,
					CorporateActionGeneralInformation128.mmMandatoryVoluntaryEventType, EventInformation11.mmMandatoryVoluntaryEventType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MandatoryVoluntaryEventType";
			definition = "Specifies whether the event is mandatory, mandatory with options or voluntary.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionMandatoryVoluntaryCode.mmObject();
		}

		@Override
		public CorporateActionMandatoryVoluntaryCode getValue(CorporateActionEvent obj) {
			return obj.getMandatoryVoluntaryEventType();
		}

		@Override
		public void setValue(CorporateActionEvent obj, CorporateActionMandatoryVoluntaryCode value) {
			obj.setMandatoryVoluntaryEventType(value);
		}
	};
	protected Security underlyingSecurity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmCorporateEvent
	 * Security.mmCorporateEvent}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation2#mmUnderlyingSecurity
	 * CorporateActionInformation2.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation2#mmOtherUnderlyingSecurity
	 * CorporateActionInformation2.mmOtherUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1#mmUnderlyingSecurity
	 * CorporateActionInformation1.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1#mmUnderlyingSecurity
	 * CorporateActionStandingInstructionGeneralInformation1.
	 * mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation107#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation107.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation125#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation125.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation128#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation128.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance13#mmUnderlyingSecurity
	 * CorporateActionEventAndBalance13.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmSecurityDetails
	 * SecuritiesOption64.mmSecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmDateDetails
	 * SecuritiesOption64.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption65#mmDateDetails
	 * SecuritiesOption65.mmDateDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security to which this instruction or event applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, Security> mmUnderlyingSecurity = new MMBusinessAssociationEnd<CorporateActionEvent, Security>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionInformation2.mmUnderlyingSecurity, CorporateActionInformation2.mmOtherUnderlyingSecurity, CorporateActionInformation1.mmUnderlyingSecurity,
					CorporateActionStandingInstructionGeneralInformation1.mmUnderlyingSecurity, CorporateActionGeneralInformation107.mmUnderlyingSecurity, CorporateActionGeneralInformation125.mmUnderlyingSecurity,
					CorporateActionGeneralInformation128.mmUnderlyingSecurity, CorporateActionEventAndBalance13.mmUnderlyingSecurity, SecuritiesOption64.mmSecurityDetails, SecuritiesOption64.mmDateDetails, SecuritiesOption65.mmDateDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnderlyingSecurity";
			definition = "Security to which this instruction or event applies.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Security.mmCorporateEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}

		@Override
		public Security getValue(CorporateActionEvent obj) {
			return obj.getUnderlyingSecurity();
		}

		@Override
		public void setValue(CorporateActionEvent obj, Security value) {
			obj.setUnderlyingSecurity(value);
		}
	};
	protected List<CorporateActionPrice> corporateActionPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCorporateActionEvent
	 * CorporateActionPrice.mmCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmPriceDetails
	 * CorporateAction2.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1#mmPriceDetails
	 * SecurityOption1.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmPriceDetails
	 * CorporateActionOption1.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption140#mmPriceDetails
	 * CorporateActionOption140.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmPriceDetails
	 * CorporateAction41.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138#mmPriceDetails
	 * CorporateActionOption138.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption142#mmPriceDetails
	 * CorporateActionOption142.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139#mmPriceDetails
	 * CorporateActionOption139.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption56#mmPriceDetails
	 * CashOption56.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption57#mmPriceDetails
	 * CashOption57.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmPriceDetails
	 * SecuritiesOption64.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption65#mmPriceDetails
	 * SecuritiesOption65.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption58#mmPriceDetails
	 * CashOption58.mmPriceDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies prices related to a corporate action."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, List<CorporateActionPrice>> mmCorporateActionPrice = new MMBusinessAssociationEnd<CorporateActionEvent, List<CorporateActionPrice>>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateAction2.mmPriceDetails, SecurityOption1.mmPriceDetails, CorporateActionOption1.mmPriceDetails, CorporateActionOption140.mmPriceDetails, CorporateAction41.mmPriceDetails,
					CorporateActionOption138.mmPriceDetails, CorporateActionOption142.mmPriceDetails, CorporateActionOption139.mmPriceDetails, CashOption56.mmPriceDetails, CashOption57.mmPriceDetails, SecuritiesOption64.mmPriceDetails,
					SecuritiesOption65.mmPriceDetails, CashOption58.mmPriceDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionPrice";
			definition = "Specifies prices related to a corporate action.";
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionPrice.mmCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionPrice.mmObject();
		}

		@Override
		public List<CorporateActionPrice> getValue(CorporateActionEvent obj) {
			return obj.getCorporateActionPrice();
		}

		@Override
		public void setValue(CorporateActionEvent obj, List<CorporateActionPrice> value) {
			obj.setCorporateActionPrice(value);
		}
	};
	protected List<CurrencyExchange> exchangeRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmRelatedCorporateActionEvent
	 * CurrencyExchange.mmRelatedCorporateActionEvent}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmExchangeRate
	 * CorporateActionRate2.mmExchangeRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption1#mmExchangeRate
	 * CashOption1.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative32#mmForeignExchangeInstructionsAdditionalInformation
	 * CorporateActionNarrative32.
	 * mmForeignExchangeInstructionsAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption56#mmForeignExchangeDetails
	 * CashOption56.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption57#mmForeignExchangeDetails
	 * CashOption57.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87#mmIssuerDeclaredExchangeRate
	 * CorporateActionRate87.mmIssuerDeclaredExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption58#mmForeignExchangeDetails
	 * CashOption58.mmForeignExchangeDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate, specified by the issuer, when the paid amount is not in the same currency as the specified amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, List<CurrencyExchange>> mmExchangeRate = new MMBusinessAssociationEnd<CorporateActionEvent, List<CurrencyExchange>>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate2.mmExchangeRate, CashOption1.mmExchangeRate, CorporateActionNarrative32.mmForeignExchangeInstructionsAdditionalInformation, CashOption56.mmForeignExchangeDetails,
					CashOption57.mmForeignExchangeDetails, CorporateActionRate87.mmIssuerDeclaredExchangeRate, CashOption58.mmForeignExchangeDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExchangeRate";
			definition = "Rate, specified by the issuer, when the paid amount is not in the same currency as the specified amount.";
			minOccurs = 0;
			opposite_lazy = () -> CurrencyExchange.mmRelatedCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CurrencyExchange.mmObject();
		}

		@Override
		public List<CurrencyExchange> getValue(CorporateActionEvent obj) {
			return obj.getExchangeRate();
		}

		@Override
		public void setValue(CorporateActionEvent obj, List<CurrencyExchange> value) {
			obj.setExchangeRate(value);
		}
	};
	protected Max350Text registrationDetails;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative2#mmRegistrationDetails
	 * CorporateActionNarrative2.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1#mmRegistrationDetails
	 * CorporateActionAdditionalInformation1.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27#mmRegistrationDetails
	 * CorporateActionNarrative27.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative30#mmRegistrationDetails
	 * CorporateActionNarrative30.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative28#mmRegistrationDetails
	 * CorporateActionNarrative28.mmRegistrationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information required for the registration."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, Max350Text> mmRegistrationDetails = new MMBusinessAttribute<CorporateActionEvent, Max350Text>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionNarrative2.mmRegistrationDetails, CorporateActionAdditionalInformation1.mmRegistrationDetails, CorporateActionNarrative27.mmRegistrationDetails,
					CorporateActionNarrative30.mmRegistrationDetails, CorporateActionNarrative28.mmRegistrationDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationDetails";
			definition = "Provides information required for the registration.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(CorporateActionEvent obj) {
			return obj.getRegistrationDetails();
		}

		@Override
		public void setValue(CorporateActionEvent obj, Max350Text value) {
			obj.setRegistrationDetails(value);
		}
	};
	protected Max350Text basketOrIndexInformation;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27#mmBasketOrIndexInformation
	 * CorporateActionNarrative27.mmBasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative28#mmBasketOrIndexInformation
	 * CorporateActionNarrative28.mmBasketOrIndexInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasketOrIndexInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information on the basket or index underlying a security, for example a warrant."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, Max350Text> mmBasketOrIndexInformation = new MMBusinessAttribute<CorporateActionEvent, Max350Text>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionNarrative27.mmBasketOrIndexInformation, CorporateActionNarrative28.mmBasketOrIndexInformation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BasketOrIndexInformation";
			definition = "Provides additional information on the basket or index underlying a security, for example a warrant.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(CorporateActionEvent obj) {
			return obj.getBasketOrIndexInformation();
		}

		@Override
		public void setValue(CorporateActionEvent obj, Max350Text value) {
			obj.setBasketOrIndexInformation(value);
		}
	};
	protected Deadline deadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmRelatedCorporateActionEvent
	 * Deadline.mmRelatedCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Deadline Deadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the different deadlines related to a corporate event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, Optional<Deadline>> mmDeadline = new MMBusinessAssociationEnd<CorporateActionEvent, Optional<Deadline>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Deadline";
			definition = "Specifies the different deadlines related to a corporate event.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Deadline.mmRelatedCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Deadline.mmObject();
		}

		@Override
		public Optional<Deadline> getValue(CorporateActionEvent obj) {
			return obj.getDeadline();
		}

		@Override
		public void setValue(CorporateActionEvent obj, Optional<Deadline> value) {
			obj.setDeadline(value.orElse(null));
		}
	};
	protected AdditionalBusinessProcessCode additionalBusinessProcess;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode
	 * AdditionalBusinessProcessCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat10Choice#mmCode
	 * AdditionalBusinessProcessFormat10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat10Choice#mmProprietary
	 * AdditionalBusinessProcessFormat10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat11Choice#mmCode
	 * AdditionalBusinessProcessFormat11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat11Choice#mmProprietary
	 * AdditionalBusinessProcessFormat11Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat9Choice#mmCode
	 * AdditionalBusinessProcessFormat9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat9Choice#mmProprietary
	 * AdditionalBusinessProcessFormat9Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmAdditionalBusinessProcessIndicator
	 * CorporateAction41.mmAdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction43#mmAdditionalBusinessProcessIndicator
	 * CorporateAction43.mmAdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction42#mmAdditionalBusinessProcessIndicator
	 * CorporateAction42.mmAdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat15Choice#mmCode
	 * AdditionalBusinessProcessFormat15Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat15Choice#mmProprietary
	 * AdditionalBusinessProcessFormat15Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction44#mmAdditionalBusinessProcessIndicator
	 * CorporateAction44.mmAdditionalBusinessProcessIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalBusinessProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of the additional business process linked to a corporate action event such as a claim compensation or tax refund."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, AdditionalBusinessProcessCode> mmAdditionalBusinessProcess = new MMBusinessAttribute<CorporateActionEvent, AdditionalBusinessProcessCode>() {
		{
			derivation_lazy = () -> Arrays.asList(AdditionalBusinessProcessFormat10Choice.mmCode, AdditionalBusinessProcessFormat10Choice.mmProprietary, AdditionalBusinessProcessFormat11Choice.mmCode,
					AdditionalBusinessProcessFormat11Choice.mmProprietary, AdditionalBusinessProcessFormat9Choice.mmCode, AdditionalBusinessProcessFormat9Choice.mmProprietary, CorporateAction41.mmAdditionalBusinessProcessIndicator,
					CorporateAction43.mmAdditionalBusinessProcessIndicator, CorporateAction42.mmAdditionalBusinessProcessIndicator, AdditionalBusinessProcessFormat15Choice.mmCode, AdditionalBusinessProcessFormat15Choice.mmProprietary,
					CorporateAction44.mmAdditionalBusinessProcessIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdditionalBusinessProcess";
			definition = "Specifies the type of the additional business process linked to a corporate action event such as a claim compensation or tax refund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AdditionalBusinessProcessCode.mmObject();
		}

		@Override
		public AdditionalBusinessProcessCode getValue(CorporateActionEvent obj) {
			return obj.getAdditionalBusinessProcess();
		}

		@Override
		public void setValue(CorporateActionEvent obj, AdditionalBusinessProcessCode value) {
			obj.setAdditionalBusinessProcess(value);
		}
	};
	protected ISODateTime tradingDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate60#mmTradingDate
	 * CorporateActionDate60.mmTradingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the deal (rights) was agreed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, ISODateTime> mmTradingDate = new MMBusinessAttribute<CorporateActionEvent, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate60.mmTradingDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingDate";
			definition = "Date/time at which the deal (rights) was agreed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionEvent obj) {
			return obj.getTradingDate();
		}

		@Override
		public void setValue(CorporateActionEvent obj, ISODateTime value) {
			obj.setTradingDate(value);
		}
	};
	protected CorporateActionFeesAndCharges corporateActionCharge;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmCorporateAction
	 * CorporateActionFeesAndCharges.mmCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges
	 * CorporateActionFeesAndCharges}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate1#mmCharges
	 * CorporateActionRate1.mmCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmCharges
	 * CorporateActionRate2.mmCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails31#mmChargesFees
	 * RateDetails31.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails32#mmChargesFees
	 * RateDetails32.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate90#mmChargesFees
	 * CorporateActionRate90.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate89#mmChargesFees
	 * CorporateActionRate89.mmChargesFees}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the charges relative to a corporate action event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, Optional<CorporateActionFeesAndCharges>> mmCorporateActionCharge = new MMBusinessAssociationEnd<CorporateActionEvent, Optional<CorporateActionFeesAndCharges>>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate1.mmCharges, CorporateActionRate2.mmCharges, RateDetails31.mmChargesFees, RateDetails32.mmChargesFees, CorporateActionRate90.mmChargesFees,
					CorporateActionRate89.mmChargesFees);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionCharge";
			definition = "Specifies the charges relative to a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionFeesAndCharges.mmCorporateAction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionFeesAndCharges.mmObject();
		}

		@Override
		public Optional<CorporateActionFeesAndCharges> getValue(CorporateActionEvent obj) {
			return obj.getCorporateActionCharge();
		}

		@Override
		public void setValue(CorporateActionEvent obj, Optional<CorporateActionFeesAndCharges> value) {
			obj.setCorporateActionCharge(value.orElse(null));
		}
	};
	protected ISODateTime pariPassuDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate3#mmPariPassuDate
	 * CorporateActionDate3.mmPariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate15#mmPariPassuDate
	 * SecurityDate15.mmPariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate16#mmPariPassuDate
	 * SecurityDate16.mmPariPassuDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PariPassuDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which security will assimilate, become fungible, or have the same rights to dividends as the parent issue."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, ISODateTime> mmPariPassuDate = new MMBusinessAttribute<CorporateActionEvent, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate3.mmPariPassuDate, SecurityDate15.mmPariPassuDate, SecurityDate16.mmPariPassuDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PariPassuDate";
			definition = "Date on which security will assimilate, become fungible, or have the same rights to dividends as the parent issue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionEvent obj) {
			return obj.getPariPassuDate();
		}

		@Override
		public void setValue(CorporateActionEvent obj, ISODateTime value) {
			obj.setPariPassuDate(value);
		}
	};
	protected Max350Text informationConditions;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative1#mmInformationConditions
	 * CorporateActionNarrative1.mmInformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative2#mmInformationConditions
	 * CorporateActionNarrative2.mmInformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27#mmInformationConditions
	 * CorporateActionNarrative27.mmInformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative28#mmInformationConditions
	 * CorporateActionNarrative28.mmInformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative29#mmInformationConditions
	 * CorporateActionNarrative29.mmInformationConditions}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides conditional information related to the event, eg, an offer is subject to 50% acceptance, the offeror allows the securities holder to set some conditions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, Max350Text> mmInformationConditions = new MMBusinessAttribute<CorporateActionEvent, Max350Text>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionNarrative1.mmInformationConditions, CorporateActionNarrative2.mmInformationConditions, CorporateActionNarrative27.mmInformationConditions,
					CorporateActionNarrative28.mmInformationConditions, CorporateActionNarrative29.mmInformationConditions);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InformationConditions";
			definition = "Provides conditional information related to the event, eg, an offer is subject to 50% acceptance, the offeror allows the securities holder to set some conditions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(CorporateActionEvent obj) {
			return obj.getInformationConditions();
		}

		@Override
		public void setValue(CorporateActionEvent obj, Max350Text value) {
			obj.setInformationConditions(value);
		}
	};
	protected List<SecuritiesQuantity> fractionalQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedEventForFractionalQuantity
	 * SecuritiesQuantity.mmRelatedEventForFractionalQuantity}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation126#mmFractionalQuantity
	 * CorporateActionGeneralInformation126.mmFractionalQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fractional quantity resulting from an event which will be paid with cash in lieu. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, List<SecuritiesQuantity>> mmFractionalQuantity = new MMBusinessAssociationEnd<CorporateActionEvent, List<SecuritiesQuantity>>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionGeneralInformation126.mmFractionalQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FractionalQuantity";
			definition = "Fractional quantity resulting from an event which will be paid with cash in lieu. ";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesQuantity.mmRelatedEventForFractionalQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public List<SecuritiesQuantity> getValue(CorporateActionEvent obj) {
			return obj.getFractionalQuantity();
		}

		@Override
		public void setValue(CorporateActionEvent obj, List<SecuritiesQuantity> value) {
			obj.setFractionalQuantity(value);
		}
	};
	protected CorporateActionEventProcessingTypeCode eventProcessingType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventProcessingTypeCode
	 * CorporateActionEventProcessingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingType1FormatChoice#mmCode
	 * CorporateActionEventProcessingType1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingType1FormatChoice#mmProprietary
	 * CorporateActionEventProcessingType1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation2#mmEventProcessingType
	 * CorporateActionInformation2.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1#mmEventProcessingType
	 * CorporateActionInformation1.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingType2Choice#mmCode
	 * CorporateActionEventProcessingType2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingType2Choice#mmProprietary
	 * CorporateActionEventProcessingType2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation125#mmEventProcessingType
	 * CorporateActionGeneralInformation125.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation128#mmEventProcessingType
	 * CorporateActionGeneralInformation128.mmEventProcessingType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventProcessingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of processing involved by a Corporate Action."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, CorporateActionEventProcessingTypeCode> mmEventProcessingType = new MMBusinessAttribute<CorporateActionEvent, CorporateActionEventProcessingTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionEventProcessingType1FormatChoice.mmCode, CorporateActionEventProcessingType1FormatChoice.mmProprietary, CorporateActionInformation2.mmEventProcessingType,
					CorporateActionInformation1.mmEventProcessingType, CorporateActionEventProcessingType2Choice.mmCode, CorporateActionEventProcessingType2Choice.mmProprietary, CorporateActionGeneralInformation125.mmEventProcessingType,
					CorporateActionGeneralInformation128.mmEventProcessingType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EventProcessingType";
			definition = "Type of processing involved by a Corporate Action.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionEventProcessingTypeCode.mmObject();
		}

		@Override
		public CorporateActionEventProcessingTypeCode getValue(CorporateActionEvent obj) {
			return obj.getEventProcessingType();
		}

		@Override
		public void setValue(CorporateActionEvent obj, CorporateActionEventProcessingTypeCode value) {
			obj.setEventProcessingType(value);
		}
	};
	protected List<CorporateActionStatus> corporateActionStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmCorporateActionEvent
	 * CorporateActionStatus.mmCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification1#mmProcessingStatus
	 * CorporateActionNotification1.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification5#mmProcessingStatus
	 * CorporateActionNotification5.mmProcessingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the corporate action process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, List<CorporateActionStatus>> mmCorporateActionStatus = new MMBusinessAssociationEnd<CorporateActionEvent, List<CorporateActionStatus>>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionNotification1.mmProcessingStatus, CorporateActionNotification5.mmProcessingStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionStatus";
			definition = "Status of the corporate action process.";
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionStatus.mmCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionStatus.mmObject();
		}

		@Override
		public List<CorporateActionStatus> getValue(CorporateActionEvent obj) {
			return obj.getCorporateActionStatus();
		}

		@Override
		public void setValue(CorporateActionEvent obj, List<CorporateActionStatus> value) {
			obj.setCorporateActionStatus(value);
		}
	};
	protected ISODateTime announcementDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification1#mmAnnouncementDate
	 * CorporateActionNotification1.mmAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmAnnouncementDate
	 * MeetingNotice4.mmAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmAnnouncementDate
	 * CorporateActionDate61.mmAnnouncementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the issuer announced that a corporate action event will occur such as the issue of securities or an official meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, ISODateTime> mmAnnouncementDate = new MMBusinessAttribute<CorporateActionEvent, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionNotification1.mmAnnouncementDate, MeetingNotice4.mmAnnouncementDate, CorporateActionDate61.mmAnnouncementDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AnnouncementDate";
			definition = "Date/time at which the issuer announced that a corporate action event will occur such as the issue of securities or an official meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionEvent obj) {
			return obj.getAnnouncementDate();
		}

		@Override
		public void setValue(CorporateActionEvent obj, ISODateTime value) {
			obj.setAnnouncementDate(value);
		}
	};
	protected ISODateTime effectiveDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmEffectiveDate
	 * CorporateActionDate2.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmEffectiveDate
	 * CorporateActionDate61.mmEffectiveDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which an event is officially effective from the issuer's perspective."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, ISODateTime> mmEffectiveDate = new MMBusinessAttribute<CorporateActionEvent, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate2.mmEffectiveDate, CorporateActionDate61.mmEffectiveDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EffectiveDate";
			definition = "Date/time at which an event is officially effective from the issuer's perspective.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionEvent obj) {
			return obj.getEffectiveDate();
		}

		@Override
		public void setValue(CorporateActionEvent obj, ISODateTime value) {
			obj.setEffectiveDate(value);
		}
	};
	protected ISODateTime furtherDetailsAnnouncementDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification1#mmFurtherDetailedAnnouncementDate
	 * CorporateActionNotification1.mmFurtherDetailedAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmFurtherDetailedAnnouncementDate
	 * CorporateActionDate61.mmFurtherDetailedAnnouncementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FurtherDetailsAnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which additional information on the event will be announced, for instance exchange ratio announcement date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, ISODateTime> mmFurtherDetailsAnnouncementDate = new MMBusinessAttribute<CorporateActionEvent, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionNotification1.mmFurtherDetailedAnnouncementDate, CorporateActionDate61.mmFurtherDetailedAnnouncementDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FurtherDetailsAnnouncementDate";
			definition = "Date/time at which additional information on the event will be announced, for instance exchange ratio announcement date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionEvent obj) {
			return obj.getFurtherDetailsAnnouncementDate();
		}

		@Override
		public void setValue(CorporateActionEvent obj, ISODateTime value) {
			obj.setFurtherDetailsAnnouncementDate(value);
		}
	};
	protected ISODateTime marginFixingDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmMarginFixingDate
	 * CorporateActionDate2.mmMarginFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmMarginFixingDate
	 * CorporateActionDate61.mmMarginFixingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginFixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the margin rate will be determined ."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, ISODateTime> mmMarginFixingDate = new MMBusinessAttribute<CorporateActionEvent, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate2.mmMarginFixingDate, CorporateActionDate61.mmMarginFixingDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarginFixingDate";
			definition = "Date/time at which the margin rate will be determined .";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionEvent obj) {
			return obj.getMarginFixingDate();
		}

		@Override
		public void setValue(CorporateActionEvent obj, ISODateTime value) {
			obj.setMarginFixingDate(value);
		}
	};
	protected ISODate resultPublicationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmResultsPublicationDate
	 * CorporateActionDate2.mmResultsPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmResultPublicationDate
	 * MeetingNotice4.mmResultPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmResultsPublicationDate
	 * CorporateActionDate61.mmResultsPublicationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultPublicationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which results are published, eg, results of an offer, of a meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, ISODate> mmResultPublicationDate = new MMBusinessAttribute<CorporateActionEvent, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate2.mmResultsPublicationDate, MeetingNotice4.mmResultPublicationDate, CorporateActionDate61.mmResultsPublicationDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResultPublicationDate";
			definition = "Date on which results are published, eg, results of an offer, of a meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(CorporateActionEvent obj) {
			return obj.getResultPublicationDate();
		}

		@Override
		public void setValue(CorporateActionEvent obj, ISODate value) {
			obj.setResultPublicationDate(value);
		}
	};
	protected ISODateTime unconditionalDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmUnconditionalDate
	 * CorporateActionDate2.mmUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmUnconditionalDate
	 * CorporateActionDate61.mmUnconditionalDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnconditionalDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date upon which the terms of the take-over become unconditional as to acceptances."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, ISODateTime> mmUnconditionalDate = new MMBusinessAttribute<CorporateActionEvent, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate2.mmUnconditionalDate, CorporateActionDate61.mmUnconditionalDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnconditionalDate";
			definition = "Date upon which the terms of the take-over become unconditional as to acceptances.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionEvent obj) {
			return obj.getUnconditionalDate();
		}

		@Override
		public void setValue(CorporateActionEvent obj, ISODateTime value) {
			obj.setUnconditionalDate(value);
		}
	};
	protected ISODateTime whollyUnconditionalDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmWhollyUnconditionalDate
	 * CorporateActionDate2.mmWhollyUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmWhollyUnconditionalDate
	 * CorporateActionDate61.mmWhollyUnconditionalDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WhollyUnconditionalDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which all conditions, including regulatory, legal etc. pertaining to the take-over, have been met."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, ISODateTime> mmWhollyUnconditionalDate = new MMBusinessAttribute<CorporateActionEvent, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate2.mmWhollyUnconditionalDate, CorporateActionDate61.mmWhollyUnconditionalDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WhollyUnconditionalDate";
			definition = "Date on which all conditions, including regulatory, legal etc. pertaining to the take-over, have been met.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionEvent obj) {
			return obj.getWhollyUnconditionalDate();
		}

		@Override
		public void setValue(CorporateActionEvent obj, ISODateTime value) {
			obj.setWhollyUnconditionalDate(value);
		}
	};
	protected ISODateTime lapsedDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmLapsedDate
	 * CorporateActionDate2.mmLapsedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmLapsedDate
	 * CorporateActionDate61.mmLapsedDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LapsedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which an event/offer is terminated or lapsed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, ISODateTime> mmLapsedDate = new MMBusinessAttribute<CorporateActionEvent, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate2.mmLapsedDate, CorporateActionDate61.mmLapsedDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LapsedDate";
			definition = "Date/time at which an event/offer is terminated or lapsed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionEvent obj) {
			return obj.getLapsedDate();
		}

		@Override
		public void setValue(CorporateActionEvent obj, ISODateTime value) {
			obj.setLapsedDate(value);
		}
	};
	protected DateTimePeriod bookClosurePeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmBookClosureCorporateAction
	 * DateTimePeriod.mmBookClosureCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmBookClosurePeriod
	 * CorporateActionPeriod14.mmBookClosurePeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookClosurePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date on which shareholder registration will be accepted by the issuer and the date on which shareholder registration will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, DateTimePeriod> mmBookClosurePeriod = new MMBusinessAssociationEnd<CorporateActionEvent, DateTimePeriod>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPeriod14.mmBookClosurePeriod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BookClosurePeriod";
			definition = "Period defining the last date on which shareholder registration will be accepted by the issuer and the date on which shareholder registration will resume.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmBookClosureCorporateAction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(CorporateActionEvent obj) {
			return obj.getBookClosurePeriod();
		}

		@Override
		public void setValue(CorporateActionEvent obj, DateTimePeriod value) {
			obj.setBookClosurePeriod(value);
		}
	};
	protected List<SecuritiesQuantity> securitiesQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmCorporateActionEvent
	 * SecuritiesQuantity.mmCorporateActionEvent}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmSecuritiesQuantity
	 * CorporateAction41.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction42#mmSecuritiesQuantity
	 * CorporateAction42.mmSecuritiesQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about securities quantity linked to a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, List<SecuritiesQuantity>> mmSecuritiesQuantity = new MMBusinessAssociationEnd<CorporateActionEvent, List<SecuritiesQuantity>>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateAction41.mmSecuritiesQuantity, CorporateAction42.mmSecuritiesQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantity";
			definition = "Provides information about securities quantity linked to a corporate action.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesQuantity.mmCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public List<SecuritiesQuantity> getValue(CorporateActionEvent obj) {
			return obj.getSecuritiesQuantity();
		}

		@Override
		public void setValue(CorporateActionEvent obj, List<SecuritiesQuantity> value) {
			obj.setSecuritiesQuantity(value);
		}
	};
	protected YesNoIndicator restrictionIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmRestrictionIndicator
	 * CorporateAction2.mmRestrictionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmRestrictionIndicator
	 * CorporateAction41.mmRestrictionIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether there are legal or other restrictions associated with a rights offer or other corporate event, for example, domicile, citizenship, residency, type of investor.\r\nYes = There are restrictions.\r\nNo = There are no restrictions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, YesNoIndicator> mmRestrictionIndicator = new MMBusinessAttribute<CorporateActionEvent, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateAction2.mmRestrictionIndicator, CorporateAction41.mmRestrictionIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RestrictionIndicator";
			definition = "Indicates whether there are legal or other restrictions associated with a rights offer or other corporate event, for example, domicile, citizenship, residency, type of investor.\r\nYes = There are restrictions.\r\nNo = There are no restrictions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CorporateActionEvent obj) {
			return obj.getRestrictionIndicator();
		}

		@Override
		public void setValue(CorporateActionEvent obj, YesNoIndicator value) {
			obj.setRestrictionIndicator(value);
		}
	};
	protected CorporateActionEventStageCode eventStage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode
	 * CorporateActionEventStageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStage1FormatChoice#mmCode
	 * CorporateActionEventStage1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStage1FormatChoice#mmProprietary
	 * CorporateActionEventStage1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmEventStage
	 * CorporateAction2.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmCorporateActionEventStage
	 * Status19Choice.mmCorporateActionEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStage3Choice#mmCode
	 * CorporateActionEventStage3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStage3Choice#mmProprietary
	 * CorporateActionEventStage3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat14Choice#mmCode
	 * CorporateActionEventStageFormat14Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat14Choice#mmProprietary
	 * CorporateActionEventStageFormat14Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat13Choice#mmCode
	 * CorporateActionEventStageFormat13Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat13Choice#mmProprietary
	 * CorporateActionEventStageFormat13Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmEventStage
	 * CorporateAction41.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction43#mmEventStage
	 * CorporateAction43.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction42#mmEventStage
	 * CorporateAction42.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction44#mmEventStage
	 * CorporateAction44.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction45#mmEventStage
	 * CorporateAction45.mmEventStage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventStage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stage in the corporate action event life cycle."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, CorporateActionEventStageCode> mmEventStage = new MMBusinessAttribute<CorporateActionEvent, CorporateActionEventStageCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionEventStage1FormatChoice.mmCode, CorporateActionEventStage1FormatChoice.mmProprietary, CorporateAction2.mmEventStage, Status19Choice.mmCorporateActionEventStage,
					CorporateActionEventStage3Choice.mmCode, CorporateActionEventStage3Choice.mmProprietary, CorporateActionEventStageFormat14Choice.mmCode, CorporateActionEventStageFormat14Choice.mmProprietary,
					CorporateActionEventStageFormat13Choice.mmCode, CorporateActionEventStageFormat13Choice.mmProprietary, CorporateAction41.mmEventStage, CorporateAction43.mmEventStage, CorporateAction42.mmEventStage,
					CorporateAction44.mmEventStage, CorporateAction45.mmEventStage);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EventStage";
			definition = "Stage in the corporate action event life cycle.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionEventStageCode.mmObject();
		}

		@Override
		public CorporateActionEventStageCode getValue(CorporateActionEvent obj) {
			return obj.getEventStage();
		}

		@Override
		public void setValue(CorporateActionEvent obj, CorporateActionEventStageCode value) {
			obj.setEventStage(value);
		}
	};
	protected List<ContactPoint> documentationLocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedCorporateActionEvent
	 * ContactPoint.mmRelatedCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative26#mmURLAddress
	 * CorporateActionNarrative26.mmURLAddress}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentationLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on where additional information published for the event, can be received. for instance the address for the Universal Resource Locator (URL), eg, used over the www (HTTP) service."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, List<ContactPoint>> mmDocumentationLocation = new MMBusinessAssociationEnd<CorporateActionEvent, List<ContactPoint>>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionNarrative26.mmURLAddress);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DocumentationLocation";
			definition = "Information on where additional information published for the event, can be received. for instance the address for the Universal Resource Locator (URL), eg, used over the www (HTTP) service.";
			minOccurs = 0;
			opposite_lazy = () -> ContactPoint.mmRelatedCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ContactPoint.mmObject();
		}

		@Override
		public List<ContactPoint> getValue(CorporateActionEvent obj) {
			return obj.getDocumentationLocation();
		}

		@Override
		public void setValue(CorporateActionEvent obj, List<ContactPoint> value) {
			obj.setDocumentationLocation(value);
		}
	};
	protected SecuritiesQuantity securitiesQuantitySought;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedCorporateActionEvent
	 * SecuritiesQuantity.mmRelatedCorporateActionEvent}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmSecuritiesQuantitySought
	 * CorporateAction2.mmSecuritiesQuantitySought}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantitySought"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of securities the offeror/issuer will purchase or redeem under the terms of the event. This can be a number or the term \"any and all\"."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, SecuritiesQuantity> mmSecuritiesQuantitySought = new MMBusinessAssociationEnd<CorporateActionEvent, SecuritiesQuantity>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateAction2.mmSecuritiesQuantitySought);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantitySought";
			definition = "Quantity of securities the offeror/issuer will purchase or redeem under the terms of the event. This can be a number or the term \"any and all\".";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuantity.mmRelatedCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public SecuritiesQuantity getValue(CorporateActionEvent obj) {
			return obj.getSecuritiesQuantitySought();
		}

		@Override
		public void setValue(CorporateActionEvent obj, SecuritiesQuantity value) {
			obj.setSecuritiesQuantitySought(value);
		}
	};
	protected YesNoIndicator partialElectionIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmPartialElectionIndicator
	 * CorporateAction2.mmPartialElectionIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialElectionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the issuer will allow the agent to accept partial elections. It is to allow split voting over options. It allows the client to elect more than one option to be selected per designated holding."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, YesNoIndicator> mmPartialElectionIndicator = new MMBusinessAttribute<CorporateActionEvent, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateAction2.mmPartialElectionIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartialElectionIndicator";
			definition = "Specifies if the issuer will allow the agent to accept partial elections. It is to allow split voting over options. It allows the client to elect more than one option to be selected per designated holding.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CorporateActionEvent obj) {
			return obj.getPartialElectionIndicator();
		}

		@Override
		public void setValue(CorporateActionEvent obj, YesNoIndicator value) {
			obj.setPartialElectionIndicator(value);
		}
	};
	protected CorporateActionPartyRole corporateActionPartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPartyRole#mmCorporateActionEvent
	 * CorporateActionPartyRole.mmCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPartyRole
	 * CorporateActionPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the role played by a party in the context of a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, CorporateActionPartyRole> mmCorporateActionPartyRole = new MMBusinessAssociationEnd<CorporateActionEvent, CorporateActionPartyRole>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionPartyRole";
			definition = "Specifies the role played by a party in the context of a corporate action.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CorporateActionPartyRole.mmCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionPartyRole.mmObject();
		}

		@Override
		public CorporateActionPartyRole getValue(CorporateActionEvent obj) {
			return obj.getCorporateActionPartyRole();
		}

		@Override
		public void setValue(CorporateActionEvent obj, CorporateActionPartyRole value) {
			obj.setCorporateActionPartyRole(value);
		}
	};
	protected List<MarketClaim> marketClaim;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MarketClaim#mmRelatedCorporateEvent
	 * MarketClaim.mmRelatedCorporateEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MarketClaim
	 * MarketClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market claim information."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, List<MarketClaim>> mmMarketClaim = new MMBusinessAssociationEnd<CorporateActionEvent, List<MarketClaim>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketClaim";
			definition = "Market claim information.";
			minOccurs = 0;
			opposite_lazy = () -> MarketClaim.mmRelatedCorporateEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> MarketClaim.mmObject();
		}

		@Override
		public List<MarketClaim> getValue(CorporateActionEvent obj) {
			return obj.getMarketClaim();
		}

		@Override
		public void setValue(CorporateActionEvent obj, List<MarketClaim> value) {
			obj.setMarketClaim(value);
		}
	};
	protected BiddingConditions biddingConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmEvent
	 * BiddingConditions.mmEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BiddingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the conditions under which securities can be acquired as part of a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, Optional<BiddingConditions>> mmBiddingConditions = new MMBusinessAssociationEnd<CorporateActionEvent, Optional<BiddingConditions>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BiddingConditions";
			definition = "Specifies the conditions under which securities can be acquired as part of a corporate action.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> BiddingConditions.mmEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BiddingConditions.mmObject();
		}

		@Override
		public Optional<BiddingConditions> getValue(CorporateActionEvent obj) {
			return obj.getBiddingConditions();
		}

		@Override
		public void setValue(CorporateActionEvent obj, Optional<BiddingConditions> value) {
			obj.setBiddingConditions(value.orElse(null));
		}
	};
	protected List<ClassAction> relatedClassAction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction#mmCorporateEvent
	 * ClassAction.mmCorporateEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ClassAction
	 * ClassAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedClassAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the underlying class action related to the event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, List<ClassAction>> mmRelatedClassAction = new MMBusinessAssociationEnd<CorporateActionEvent, List<ClassAction>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedClassAction";
			definition = "Specifies the underlying class action related to the event.";
			minOccurs = 0;
			opposite_lazy = () -> ClassAction.mmCorporateEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ClassAction.mmObject();
		}

		@Override
		public List<ClassAction> getValue(CorporateActionEvent obj) {
			return obj.getRelatedClassAction();
		}

		@Override
		public void setValue(CorporateActionEvent obj, List<ClassAction> value) {
			obj.setRelatedClassAction(value);
		}
	};
	protected List<CorporateActionEventRegistration> corporateActionEventRegistration;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmCorporateActionEvent
	 * CorporateActionEventRegistration.mmCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration
	 * CorporateActionEventRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventRegistration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Official registration of the event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, List<CorporateActionEventRegistration>> mmCorporateActionEventRegistration = new MMBusinessAssociationEnd<CorporateActionEvent, List<CorporateActionEventRegistration>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEventRegistration";
			definition = "Official registration of the event.";
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionEventRegistration.mmCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionEventRegistration.mmObject();
		}

		@Override
		public List<CorporateActionEventRegistration> getValue(CorporateActionEvent obj) {
			return obj.getCorporateActionEventRegistration();
		}

		@Override
		public void setValue(CorporateActionEvent obj, List<CorporateActionEventRegistration> value) {
			obj.setCorporateActionEventRegistration(value);
		}
	};
	protected SuspensionPeriod suspensionPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmCorporateActionEvent
	 * SuspensionPeriod.mmCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspensionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which an action will be accepted and the date on which the suspension will be released and normal processing will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, Optional<SuspensionPeriod>> mmSuspensionPeriod = new MMBusinessAssociationEnd<CorporateActionEvent, Optional<SuspensionPeriod>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SuspensionPeriod";
			definition = "Period defining the last date for which an action will be accepted and the date on which the suspension will be released and normal processing will resume.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SuspensionPeriod.mmCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SuspensionPeriod.mmObject();
		}

		@Override
		public Optional<SuspensionPeriod> getValue(CorporateActionEvent obj) {
			return obj.getSuspensionPeriod();
		}

		@Override
		public void setValue(CorporateActionEvent obj, Optional<SuspensionPeriod> value) {
			obj.setSuspensionPeriod(value.orElse(null));
		}
	};
	protected Lottery lottery;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Lottery#mmRelatedCorporateEvent
	 * Lottery.mmRelatedCorporateEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Lottery Lottery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lottery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Organisation of draws for cash prizes on bonds (instead of coupon payments). Every issued bond (similar to a lottery ticket) has an equal opportunity at winning payments in the draws."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, Optional<Lottery>> mmLottery = new MMBusinessAssociationEnd<CorporateActionEvent, Optional<Lottery>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Lottery";
			definition = "Organisation of draws for cash prizes on bonds (instead of coupon payments). Every issued bond (similar to a lottery ticket) has an equal opportunity at winning payments in the draws.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Lottery.mmRelatedCorporateEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Lottery.mmObject();
		}

		@Override
		public Optional<Lottery> getValue(CorporateActionEvent obj) {
			return obj.getLottery();
		}

		@Override
		public void setValue(CorporateActionEvent obj, Optional<Lottery> value) {
			obj.setLottery(value.orElse(null));
		}
	};
	protected RemarketingMarginTypeCode marginType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RemarketingMarginTypeCode
	 * RemarketingMarginTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the margin type for a remarketing procedure."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, RemarketingMarginTypeCode> mmMarginType = new MMBusinessAttribute<CorporateActionEvent, RemarketingMarginTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarginType";
			definition = "Specifies the margin type for a remarketing procedure.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RemarketingMarginTypeCode.mmObject();
		}

		@Override
		public RemarketingMarginTypeCode getValue(CorporateActionEvent obj) {
			return obj.getMarginType();
		}

		@Override
		public void setValue(CorporateActionEvent obj, RemarketingMarginTypeCode value) {
			obj.setMarginType(value);
		}
	};
	protected List<Meeting> relatedMeeting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmCorporateEvent
	 * Meeting.mmCorporateEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMeeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the meeting  related to the corporate event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, List<Meeting>> mmRelatedMeeting = new MMBusinessAssociationEnd<CorporateActionEvent, List<Meeting>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedMeeting";
			definition = "Provides information on the meeting  related to the corporate event.";
			minOccurs = 0;
			opposite_lazy = () -> Meeting.mmCorporateEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Meeting.mmObject();
		}

		@Override
		public List<Meeting> getValue(CorporateActionEvent obj) {
			return obj.getRelatedMeeting();
		}

		@Override
		public void setValue(CorporateActionEvent obj, List<Meeting> value) {
			obj.setRelatedMeeting(value);
		}
	};
	protected List<CorporateActionServicing> services;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmEvent
	 * CorporateActionServicing.mmEvent}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Services"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the different services linked to a corporate action event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, List<CorporateActionServicing>> mmServices = new MMBusinessAssociationEnd<CorporateActionEvent, List<CorporateActionServicing>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Services";
			definition = "Specifies the different services linked to a corporate action event.";
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionServicing.mmEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionServicing.mmObject();
		}

		@Override
		public List<CorporateActionServicing> getValue(CorporateActionEvent obj) {
			return obj.getServices();
		}

		@Override
		public void setValue(CorporateActionEvent obj, List<CorporateActionServicing> value) {
			obj.setServices(value);
		}
	};
	protected List<Issuance> issuance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmEventInformation
	 * Issuance.mmEventInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Issuance Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information specified when the corporate event relates to the issuance of securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, List<Issuance>> mmIssuance = new MMBusinessAssociationEnd<CorporateActionEvent, List<Issuance>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Issuance";
			definition = "Information specified when the corporate event relates to the issuance of securities.";
			minOccurs = 0;
			opposite_lazy = () -> Issuance.mmEventInformation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Issuance.mmObject();
		}

		@Override
		public List<Issuance> getValue(CorporateActionEvent obj) {
			return obj.getIssuance();
		}

		@Override
		public void setValue(CorporateActionEvent obj, List<Issuance> value) {
			obj.setIssuance(value);
		}
	};
	protected List<SecuritiesModification> securitiesModification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmRelatedCorporateEvent
	 * SecuritiesModification.mmRelatedCorporateEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification
	 * SecuritiesModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesModification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification of the reference data of a security or of the organisation that issued it."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, List<SecuritiesModification>> mmSecuritiesModification = new MMBusinessAssociationEnd<CorporateActionEvent, List<SecuritiesModification>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesModification";
			definition = "Modification of the reference data of a security or of the organisation that issued it.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesModification.mmRelatedCorporateEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesModification.mmObject();
		}

		@Override
		public List<SecuritiesModification> getValue(CorporateActionEvent obj) {
			return obj.getSecuritiesModification();
		}

		@Override
		public void setValue(CorporateActionEvent obj, List<SecuritiesModification> value) {
			obj.setSecuritiesModification(value);
		}
	};
	protected DateTimePeriod tradingPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedCorporateAction
	 * DateTimePeriod.mmRelatedCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1#mmTradingPeriod
	 * SecurityOption1.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmTradingPeriod
	 * SecuritiesOption64.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93#mmTradingPeriod
	 * FinancialInstrumentAttributes93.mmTradingPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which a financial instrument is available for trading."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, DateTimePeriod> mmTradingPeriod = new MMBusinessAssociationEnd<CorporateActionEvent, DateTimePeriod>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityOption1.mmTradingPeriod, SecuritiesOption64.mmTradingPeriod, FinancialInstrumentAttributes93.mmTradingPeriod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingPeriod";
			definition = "Period during which a financial instrument is available for trading.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmRelatedCorporateAction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(CorporateActionEvent obj) {
			return obj.getTradingPeriod();
		}

		@Override
		public void setValue(CorporateActionEvent obj, DateTimePeriod value) {
			obj.setTradingPeriod(value);
		}
	};
	protected Tax transactionTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmCorporateActionEvent
	 * Tax.mmCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate90#mmFinancialTransactionTaxRate
	 * CorporateActionRate90.mmFinancialTransactionTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate89#mmFinancialTransactionTaxRate
	 * CorporateActionRate89.mmFinancialTransactionTaxRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax rate of financial transactions related to an event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, Tax> mmTransactionTax = new MMBusinessAssociationEnd<CorporateActionEvent, Tax>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate90.mmFinancialTransactionTaxRate, CorporateActionRate89.mmFinancialTransactionTaxRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionTax";
			definition = "Tax rate of financial transactions related to an event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Tax.mmCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Tax.mmObject();
		}

		@Override
		public Tax getValue(CorporateActionEvent obj) {
			return obj.getTransactionTax();
		}

		@Override
		public void setValue(CorporateActionEvent obj, Tax value) {
			obj.setTransactionTax(value);
		}
	};
	protected ConsentTypeCode consentType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ConsentTypeCode
	 * ConsentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentTypeFormat4Choice#mmCode
	 * ConsentTypeFormat4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentTypeFormat4Choice#mmProprietary
	 * ConsentTypeFormat4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmConsentType
	 * CorporateAction41.mmConsentType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate actions may be approved by shareholders without a meeting or a vote by means of execution of a consent by a majority of shareholders entitled to vote."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, ConsentTypeCode> mmConsentType = new MMBusinessAttribute<CorporateActionEvent, ConsentTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(ConsentTypeFormat4Choice.mmCode, ConsentTypeFormat4Choice.mmProprietary, CorporateAction41.mmConsentType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConsentType";
			definition = "Corporate actions may be approved by shareholders without a meeting or a vote by means of execution of a consent by a majority of shareholders entitled to vote.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ConsentTypeCode.mmObject();
		}

		@Override
		public ConsentTypeCode getValue(CorporateActionEvent obj) {
			return obj.getConsentType();
		}

		@Override
		public void setValue(CorporateActionEvent obj, ConsentTypeCode value) {
			obj.setConsentType(value);
		}
	};
	protected ProceedsDefinition proceedsDefinition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmCorporateAction
	 * ProceedsDefinition.mmCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the proceeds of a corporate action."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, ProceedsDefinition> mmProceedsDefinition = new MMBusinessAssociationEnd<CorporateActionEvent, ProceedsDefinition>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProceedsDefinition";
			definition = "Specifies the proceeds of a corporate action.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> ProceedsDefinition.mmCorporateAction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ProceedsDefinition.mmObject();
		}

		@Override
		public ProceedsDefinition getValue(CorporateActionEvent obj) {
			return obj.getProceedsDefinition();
		}

		@Override
		public void setValue(CorporateActionEvent obj, ProceedsDefinition value) {
			obj.setProceedsDefinition(value);
		}
	};
	protected GenericIdentification taxOnNonDistributedProceedsIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmTaxOnNonDistributedProceedsIndicator
	 * CorporateAction41.mmTaxOnNonDistributedProceedsIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxOnNonDistributedProceedsIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the tax regulation being attributed to the  non- distributed proceeds event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, GenericIdentification> mmTaxOnNonDistributedProceedsIndicator = new MMBusinessAttribute<CorporateActionEvent, GenericIdentification>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateAction41.mmTaxOnNonDistributedProceedsIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxOnNonDistributedProceedsIndicator";
			definition = "Specifies the tax regulation being attributed to the  non- distributed proceeds event.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GenericIdentification.mmObject();
		}

		@Override
		public GenericIdentification getValue(CorporateActionEvent obj) {
			return obj.getTaxOnNonDistributedProceedsIndicator();
		}

		@Override
		public void setValue(CorporateActionEvent obj, GenericIdentification value) {
			obj.setTaxOnNonDistributedProceedsIndicator(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEvent";
				definition = "An event determined by a corporation's board of directors, that changes the existing corporate capital structure or financial condition.";
				associationDomain_lazy = () -> Arrays.asList(Security.mmCorporateEvent, ContactPoint.mmRelatedCorporateActionEvent, DateTimePeriod.mmBookClosureCorporateAction, DateTimePeriod.mmRelatedCorporateAction,
						Tax.mmCorporateActionEvent, SecuritiesQuantity.mmRelatedEventForFractionalQuantity, SecuritiesQuantity.mmCorporateActionEvent, SecuritiesQuantity.mmRelatedCorporateActionEvent,
						CorporateActionStatus.mmCorporateActionEvent, CurrencyExchange.mmRelatedCorporateActionEvent, CorporateActionEventRegistration.mmCorporateActionEvent, Issuance.mmEventInformation,
						ProceedsDefinition.mmCorporateAction, ClassAction.mmCorporateEvent, SecuritiesModification.mmRelatedCorporateEvent, BiddingConditions.mmEvent, CorporateActionPrice.mmCorporateActionEvent,
						CorporateActionServicing.mmEvent, Deadline.mmRelatedCorporateActionEvent, CorporateActionFeesAndCharges.mmCorporateAction, MarketClaim.mmRelatedCorporateEvent, SuspensionPeriod.mmCorporateActionEvent,
						Lottery.mmRelatedCorporateEvent, Meeting.mmCorporateEvent, CorporateActionPartyRole.mmCorporateActionEvent);
				derivationElement_lazy = () -> Arrays.asList(CorporateAction2.mmDateDetails, CorporateAction2.mmPeriodDetails, CorporateAction2.mmRateAndAmountDetails, CorporateAction41.mmDateDetails, CorporateAction41.mmPeriodDetails,
						CorporateAction41.mmRateAndAmountDetails, CorporateAction43.mmDateDetails, CorporateAction42.mmDateDetails, CorporateActionEventAndBalance13.mmGeneralInformation, SecuritiesOption64.mmRateDetails,
						SecuritiesOption65.mmRateDetails, CorporateAction44.mmDateDetails, CorporateAction45.mmDateDetails);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionEvent.mmType, com.tools20022.repository.entity.CorporateActionEvent.mmMandatoryVoluntaryEventType,
						com.tools20022.repository.entity.CorporateActionEvent.mmUnderlyingSecurity, com.tools20022.repository.entity.CorporateActionEvent.mmCorporateActionPrice,
						com.tools20022.repository.entity.CorporateActionEvent.mmExchangeRate, com.tools20022.repository.entity.CorporateActionEvent.mmRegistrationDetails,
						com.tools20022.repository.entity.CorporateActionEvent.mmBasketOrIndexInformation, com.tools20022.repository.entity.CorporateActionEvent.mmDeadline,
						com.tools20022.repository.entity.CorporateActionEvent.mmAdditionalBusinessProcess, com.tools20022.repository.entity.CorporateActionEvent.mmTradingDate,
						com.tools20022.repository.entity.CorporateActionEvent.mmCorporateActionCharge, com.tools20022.repository.entity.CorporateActionEvent.mmPariPassuDate,
						com.tools20022.repository.entity.CorporateActionEvent.mmInformationConditions, com.tools20022.repository.entity.CorporateActionEvent.mmFractionalQuantity,
						com.tools20022.repository.entity.CorporateActionEvent.mmEventProcessingType, com.tools20022.repository.entity.CorporateActionEvent.mmCorporateActionStatus,
						com.tools20022.repository.entity.CorporateActionEvent.mmAnnouncementDate, com.tools20022.repository.entity.CorporateActionEvent.mmEffectiveDate,
						com.tools20022.repository.entity.CorporateActionEvent.mmFurtherDetailsAnnouncementDate, com.tools20022.repository.entity.CorporateActionEvent.mmMarginFixingDate,
						com.tools20022.repository.entity.CorporateActionEvent.mmResultPublicationDate, com.tools20022.repository.entity.CorporateActionEvent.mmUnconditionalDate,
						com.tools20022.repository.entity.CorporateActionEvent.mmWhollyUnconditionalDate, com.tools20022.repository.entity.CorporateActionEvent.mmLapsedDate,
						com.tools20022.repository.entity.CorporateActionEvent.mmBookClosurePeriod, com.tools20022.repository.entity.CorporateActionEvent.mmSecuritiesQuantity,
						com.tools20022.repository.entity.CorporateActionEvent.mmRestrictionIndicator, com.tools20022.repository.entity.CorporateActionEvent.mmEventStage,
						com.tools20022.repository.entity.CorporateActionEvent.mmDocumentationLocation, com.tools20022.repository.entity.CorporateActionEvent.mmSecuritiesQuantitySought,
						com.tools20022.repository.entity.CorporateActionEvent.mmPartialElectionIndicator, com.tools20022.repository.entity.CorporateActionEvent.mmCorporateActionPartyRole,
						com.tools20022.repository.entity.CorporateActionEvent.mmMarketClaim, com.tools20022.repository.entity.CorporateActionEvent.mmBiddingConditions,
						com.tools20022.repository.entity.CorporateActionEvent.mmRelatedClassAction, com.tools20022.repository.entity.CorporateActionEvent.mmCorporateActionEventRegistration,
						com.tools20022.repository.entity.CorporateActionEvent.mmSuspensionPeriod, com.tools20022.repository.entity.CorporateActionEvent.mmLottery, com.tools20022.repository.entity.CorporateActionEvent.mmMarginType,
						com.tools20022.repository.entity.CorporateActionEvent.mmRelatedMeeting, com.tools20022.repository.entity.CorporateActionEvent.mmServices, com.tools20022.repository.entity.CorporateActionEvent.mmIssuance,
						com.tools20022.repository.entity.CorporateActionEvent.mmSecuritiesModification, com.tools20022.repository.entity.CorporateActionEvent.mmTradingPeriod,
						com.tools20022.repository.entity.CorporateActionEvent.mmTransactionTax, com.tools20022.repository.entity.CorporateActionEvent.mmConsentType,
						com.tools20022.repository.entity.CorporateActionEvent.mmProceedsDefinition, com.tools20022.repository.entity.CorporateActionEvent.mmTaxOnNonDistributedProceedsIndicator);
				derivationComponent_lazy = () -> Arrays.asList(CorporateActionNarrative10.mmObject(), CorporateActionEventProcessingType1FormatChoice.mmObject(), CorporateActionMandatoryVoluntary1FormatChoice.mmObject(),
						CorporateActionInformation2.mmObject(), CorporateActionEventStage1FormatChoice.mmObject(), CorporateActionFrequencyType1FormatChoice.mmObject(), CorporateActionDate2.mmObject(), CorporateActionPeriod1.mmObject(),
						CorporateActionRate1.mmObject(), CorporateActionNarrative1.mmObject(), CorporateAction2.mmObject(), CorporateActionDate4.mmObject(), CorporateActionRate2.mmObject(), CorporateActionPeriod2.mmObject(),
						CorporateActionDate3.mmObject(), CorporateActionDate5.mmObject(), CorporateActionAmounts1.mmObject(), CorporateActionNarrative2.mmObject(), CorporateActionInformation1.mmObject(),
						CorporateActionAdditionalInformation1.mmObject(), CorporateActionDeactivationInstruction1.mmObject(), CorporateActionEventStage3Choice.mmObject(), CorporateActionGeneralInformation92.mmObject(),
						CorporateActionNarrative27.mmObject(), CorporateActionEventProcessingType2Choice.mmObject(), CorporateActionMandatoryVoluntary3Choice.mmObject(), CorporateActionEventStageFormat14Choice.mmObject(),
						AdditionalBusinessProcessFormat10Choice.mmObject(), AdditionalBusinessProcessFormat11Choice.mmObject(), AdditionalBusinessProcessFormat9Choice.mmObject(), CorporateActionRate71.mmObject(),
						CorporateActionQuantity7.mmObject(), CertificationTypeFormat3Choice.mmObject(), CorporateActionEventStageFormat13Choice.mmObject(), CorporateActionNarrative26.mmObject(), ConsentTypeFormat4Choice.mmObject(),
						CorporateActionNarrative30.mmObject(), CorporateActionNarrative31.mmObject(), CorporateActionNarrative28.mmObject(), CorporateActionNarrative29.mmObject(), CorporateActionNarrative32.mmObject(),
						CorporateActionGeneralInformation109.mmObject(), CorporateActionGeneralInformation110.mmObject(), CorporateActionGeneralInformation107.mmObject(), CorporateActionEventType52Choice.mmObject(),
						CorporateActionEventType73Choice.mmObject(), CorporateActionGeneralInformation127.mmObject(), CorporateActionGeneralInformation126.mmObject(), CorporateAction41.mmObject(),
						CorporateActionGeneralInformation125.mmObject(), CorporateActionGeneralInformation124.mmObject(), CorporateAction43.mmObject(), CorporateAction42.mmObject(), CorporateActionGeneralInformation128.mmObject(),
						CorporateActionEventAndBalance13.mmObject(), CorporateActionAmounts42.mmObject(), RateDetails31.mmObject(), CorporateActionAmounts43.mmObject(), CorporateActionRate86.mmObject(),
						CorporateActionEventType74Choice.mmObject(), RateDetails32.mmObject(), CorporateActionRate87.mmObject(), CorporateActionRate90.mmObject(), CorporateActionEventDeadlines1.mmObject(), CorporateActionRate91.mmObject(),
						CorporateActionEventType75Choice.mmObject(), CorporateActionRate88.mmObject(), CorporateActionQuantity9.mmObject(), CorporateActionAmounts44.mmObject(), CorporateActionRate89.mmObject(),
						InstructedBalanceDetails7.mmObject(), AdditionalBusinessProcessFormat15Choice.mmObject(), CorporateActionEventType76Choice.mmObject(), CorporateAction44.mmObject(), CorporateActionDate59.mmObject(),
						CorporateAction45.mmObject(), CorporateActionDate60.mmObject(), SecurityDate15.mmObject(), CorporateActionDate61.mmObject(), CorporateActionDate62.mmObject(), CorporateActionDate63.mmObject(),
						CorporateActionDate64.mmObject(), EventInformation11.mmObject(), CorporateActionPeriod12.mmObject(), CorporateActionPeriod13.mmObject(), CorporateActionPeriod14.mmObject(), CorporateActionDate65.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionEvent.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionEventTypeV3Code getType() {
		return type;
	}

	public CorporateActionEvent setType(CorporateActionEventTypeV3Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public CorporateActionMandatoryVoluntaryCode getMandatoryVoluntaryEventType() {
		return mandatoryVoluntaryEventType;
	}

	public CorporateActionEvent setMandatoryVoluntaryEventType(CorporateActionMandatoryVoluntaryCode mandatoryVoluntaryEventType) {
		this.mandatoryVoluntaryEventType = Objects.requireNonNull(mandatoryVoluntaryEventType);
		return this;
	}

	public Security getUnderlyingSecurity() {
		return underlyingSecurity;
	}

	public CorporateActionEvent setUnderlyingSecurity(Security underlyingSecurity) {
		this.underlyingSecurity = Objects.requireNonNull(underlyingSecurity);
		return this;
	}

	public List<CorporateActionPrice> getCorporateActionPrice() {
		return corporateActionPrice == null ? corporateActionPrice = new ArrayList<>() : corporateActionPrice;
	}

	public CorporateActionEvent setCorporateActionPrice(List<CorporateActionPrice> corporateActionPrice) {
		this.corporateActionPrice = Objects.requireNonNull(corporateActionPrice);
		return this;
	}

	public List<CurrencyExchange> getExchangeRate() {
		return exchangeRate == null ? exchangeRate = new ArrayList<>() : exchangeRate;
	}

	public CorporateActionEvent setExchangeRate(List<CurrencyExchange> exchangeRate) {
		this.exchangeRate = Objects.requireNonNull(exchangeRate);
		return this;
	}

	public Max350Text getRegistrationDetails() {
		return registrationDetails;
	}

	public CorporateActionEvent setRegistrationDetails(Max350Text registrationDetails) {
		this.registrationDetails = Objects.requireNonNull(registrationDetails);
		return this;
	}

	public Max350Text getBasketOrIndexInformation() {
		return basketOrIndexInformation;
	}

	public CorporateActionEvent setBasketOrIndexInformation(Max350Text basketOrIndexInformation) {
		this.basketOrIndexInformation = Objects.requireNonNull(basketOrIndexInformation);
		return this;
	}

	public Optional<Deadline> getDeadline() {
		return deadline == null ? Optional.empty() : Optional.of(deadline);
	}

	public CorporateActionEvent setDeadline(Deadline deadline) {
		this.deadline = deadline;
		return this;
	}

	public AdditionalBusinessProcessCode getAdditionalBusinessProcess() {
		return additionalBusinessProcess;
	}

	public CorporateActionEvent setAdditionalBusinessProcess(AdditionalBusinessProcessCode additionalBusinessProcess) {
		this.additionalBusinessProcess = Objects.requireNonNull(additionalBusinessProcess);
		return this;
	}

	public ISODateTime getTradingDate() {
		return tradingDate;
	}

	public CorporateActionEvent setTradingDate(ISODateTime tradingDate) {
		this.tradingDate = Objects.requireNonNull(tradingDate);
		return this;
	}

	public Optional<CorporateActionFeesAndCharges> getCorporateActionCharge() {
		return corporateActionCharge == null ? Optional.empty() : Optional.of(corporateActionCharge);
	}

	public CorporateActionEvent setCorporateActionCharge(CorporateActionFeesAndCharges corporateActionCharge) {
		this.corporateActionCharge = corporateActionCharge;
		return this;
	}

	public ISODateTime getPariPassuDate() {
		return pariPassuDate;
	}

	public CorporateActionEvent setPariPassuDate(ISODateTime pariPassuDate) {
		this.pariPassuDate = Objects.requireNonNull(pariPassuDate);
		return this;
	}

	public Max350Text getInformationConditions() {
		return informationConditions;
	}

	public CorporateActionEvent setInformationConditions(Max350Text informationConditions) {
		this.informationConditions = Objects.requireNonNull(informationConditions);
		return this;
	}

	public List<SecuritiesQuantity> getFractionalQuantity() {
		return fractionalQuantity == null ? fractionalQuantity = new ArrayList<>() : fractionalQuantity;
	}

	public CorporateActionEvent setFractionalQuantity(List<SecuritiesQuantity> fractionalQuantity) {
		this.fractionalQuantity = Objects.requireNonNull(fractionalQuantity);
		return this;
	}

	public CorporateActionEventProcessingTypeCode getEventProcessingType() {
		return eventProcessingType;
	}

	public CorporateActionEvent setEventProcessingType(CorporateActionEventProcessingTypeCode eventProcessingType) {
		this.eventProcessingType = Objects.requireNonNull(eventProcessingType);
		return this;
	}

	public List<CorporateActionStatus> getCorporateActionStatus() {
		return corporateActionStatus == null ? corporateActionStatus = new ArrayList<>() : corporateActionStatus;
	}

	public CorporateActionEvent setCorporateActionStatus(List<CorporateActionStatus> corporateActionStatus) {
		this.corporateActionStatus = Objects.requireNonNull(corporateActionStatus);
		return this;
	}

	public ISODateTime getAnnouncementDate() {
		return announcementDate;
	}

	public CorporateActionEvent setAnnouncementDate(ISODateTime announcementDate) {
		this.announcementDate = Objects.requireNonNull(announcementDate);
		return this;
	}

	public ISODateTime getEffectiveDate() {
		return effectiveDate;
	}

	public CorporateActionEvent setEffectiveDate(ISODateTime effectiveDate) {
		this.effectiveDate = Objects.requireNonNull(effectiveDate);
		return this;
	}

	public ISODateTime getFurtherDetailsAnnouncementDate() {
		return furtherDetailsAnnouncementDate;
	}

	public CorporateActionEvent setFurtherDetailsAnnouncementDate(ISODateTime furtherDetailsAnnouncementDate) {
		this.furtherDetailsAnnouncementDate = Objects.requireNonNull(furtherDetailsAnnouncementDate);
		return this;
	}

	public ISODateTime getMarginFixingDate() {
		return marginFixingDate;
	}

	public CorporateActionEvent setMarginFixingDate(ISODateTime marginFixingDate) {
		this.marginFixingDate = Objects.requireNonNull(marginFixingDate);
		return this;
	}

	public ISODate getResultPublicationDate() {
		return resultPublicationDate;
	}

	public CorporateActionEvent setResultPublicationDate(ISODate resultPublicationDate) {
		this.resultPublicationDate = Objects.requireNonNull(resultPublicationDate);
		return this;
	}

	public ISODateTime getUnconditionalDate() {
		return unconditionalDate;
	}

	public CorporateActionEvent setUnconditionalDate(ISODateTime unconditionalDate) {
		this.unconditionalDate = Objects.requireNonNull(unconditionalDate);
		return this;
	}

	public ISODateTime getWhollyUnconditionalDate() {
		return whollyUnconditionalDate;
	}

	public CorporateActionEvent setWhollyUnconditionalDate(ISODateTime whollyUnconditionalDate) {
		this.whollyUnconditionalDate = Objects.requireNonNull(whollyUnconditionalDate);
		return this;
	}

	public ISODateTime getLapsedDate() {
		return lapsedDate;
	}

	public CorporateActionEvent setLapsedDate(ISODateTime lapsedDate) {
		this.lapsedDate = Objects.requireNonNull(lapsedDate);
		return this;
	}

	public DateTimePeriod getBookClosurePeriod() {
		return bookClosurePeriod;
	}

	public CorporateActionEvent setBookClosurePeriod(DateTimePeriod bookClosurePeriod) {
		this.bookClosurePeriod = Objects.requireNonNull(bookClosurePeriod);
		return this;
	}

	public List<SecuritiesQuantity> getSecuritiesQuantity() {
		return securitiesQuantity == null ? securitiesQuantity = new ArrayList<>() : securitiesQuantity;
	}

	public CorporateActionEvent setSecuritiesQuantity(List<SecuritiesQuantity> securitiesQuantity) {
		this.securitiesQuantity = Objects.requireNonNull(securitiesQuantity);
		return this;
	}

	public YesNoIndicator getRestrictionIndicator() {
		return restrictionIndicator;
	}

	public CorporateActionEvent setRestrictionIndicator(YesNoIndicator restrictionIndicator) {
		this.restrictionIndicator = Objects.requireNonNull(restrictionIndicator);
		return this;
	}

	public CorporateActionEventStageCode getEventStage() {
		return eventStage;
	}

	public CorporateActionEvent setEventStage(CorporateActionEventStageCode eventStage) {
		this.eventStage = Objects.requireNonNull(eventStage);
		return this;
	}

	public List<ContactPoint> getDocumentationLocation() {
		return documentationLocation == null ? documentationLocation = new ArrayList<>() : documentationLocation;
	}

	public CorporateActionEvent setDocumentationLocation(List<ContactPoint> documentationLocation) {
		this.documentationLocation = Objects.requireNonNull(documentationLocation);
		return this;
	}

	public SecuritiesQuantity getSecuritiesQuantitySought() {
		return securitiesQuantitySought;
	}

	public CorporateActionEvent setSecuritiesQuantitySought(SecuritiesQuantity securitiesQuantitySought) {
		this.securitiesQuantitySought = Objects.requireNonNull(securitiesQuantitySought);
		return this;
	}

	public YesNoIndicator getPartialElectionIndicator() {
		return partialElectionIndicator;
	}

	public CorporateActionEvent setPartialElectionIndicator(YesNoIndicator partialElectionIndicator) {
		this.partialElectionIndicator = Objects.requireNonNull(partialElectionIndicator);
		return this;
	}

	public CorporateActionPartyRole getCorporateActionPartyRole() {
		return corporateActionPartyRole;
	}

	public CorporateActionEvent setCorporateActionPartyRole(CorporateActionPartyRole corporateActionPartyRole) {
		this.corporateActionPartyRole = Objects.requireNonNull(corporateActionPartyRole);
		return this;
	}

	public List<MarketClaim> getMarketClaim() {
		return marketClaim == null ? marketClaim = new ArrayList<>() : marketClaim;
	}

	public CorporateActionEvent setMarketClaim(List<MarketClaim> marketClaim) {
		this.marketClaim = Objects.requireNonNull(marketClaim);
		return this;
	}

	public Optional<BiddingConditions> getBiddingConditions() {
		return biddingConditions == null ? Optional.empty() : Optional.of(biddingConditions);
	}

	public CorporateActionEvent setBiddingConditions(BiddingConditions biddingConditions) {
		this.biddingConditions = biddingConditions;
		return this;
	}

	public List<ClassAction> getRelatedClassAction() {
		return relatedClassAction == null ? relatedClassAction = new ArrayList<>() : relatedClassAction;
	}

	public CorporateActionEvent setRelatedClassAction(List<ClassAction> relatedClassAction) {
		this.relatedClassAction = Objects.requireNonNull(relatedClassAction);
		return this;
	}

	public List<CorporateActionEventRegistration> getCorporateActionEventRegistration() {
		return corporateActionEventRegistration == null ? corporateActionEventRegistration = new ArrayList<>() : corporateActionEventRegistration;
	}

	public CorporateActionEvent setCorporateActionEventRegistration(List<CorporateActionEventRegistration> corporateActionEventRegistration) {
		this.corporateActionEventRegistration = Objects.requireNonNull(corporateActionEventRegistration);
		return this;
	}

	public Optional<SuspensionPeriod> getSuspensionPeriod() {
		return suspensionPeriod == null ? Optional.empty() : Optional.of(suspensionPeriod);
	}

	public CorporateActionEvent setSuspensionPeriod(SuspensionPeriod suspensionPeriod) {
		this.suspensionPeriod = suspensionPeriod;
		return this;
	}

	public Optional<Lottery> getLottery() {
		return lottery == null ? Optional.empty() : Optional.of(lottery);
	}

	public CorporateActionEvent setLottery(Lottery lottery) {
		this.lottery = lottery;
		return this;
	}

	public RemarketingMarginTypeCode getMarginType() {
		return marginType;
	}

	public CorporateActionEvent setMarginType(RemarketingMarginTypeCode marginType) {
		this.marginType = Objects.requireNonNull(marginType);
		return this;
	}

	public List<Meeting> getRelatedMeeting() {
		return relatedMeeting == null ? relatedMeeting = new ArrayList<>() : relatedMeeting;
	}

	public CorporateActionEvent setRelatedMeeting(List<Meeting> relatedMeeting) {
		this.relatedMeeting = Objects.requireNonNull(relatedMeeting);
		return this;
	}

	public List<CorporateActionServicing> getServices() {
		return services == null ? services = new ArrayList<>() : services;
	}

	public CorporateActionEvent setServices(List<CorporateActionServicing> services) {
		this.services = Objects.requireNonNull(services);
		return this;
	}

	public List<Issuance> getIssuance() {
		return issuance == null ? issuance = new ArrayList<>() : issuance;
	}

	public CorporateActionEvent setIssuance(List<Issuance> issuance) {
		this.issuance = Objects.requireNonNull(issuance);
		return this;
	}

	public List<SecuritiesModification> getSecuritiesModification() {
		return securitiesModification == null ? securitiesModification = new ArrayList<>() : securitiesModification;
	}

	public CorporateActionEvent setSecuritiesModification(List<SecuritiesModification> securitiesModification) {
		this.securitiesModification = Objects.requireNonNull(securitiesModification);
		return this;
	}

	public DateTimePeriod getTradingPeriod() {
		return tradingPeriod;
	}

	public CorporateActionEvent setTradingPeriod(DateTimePeriod tradingPeriod) {
		this.tradingPeriod = Objects.requireNonNull(tradingPeriod);
		return this;
	}

	public Tax getTransactionTax() {
		return transactionTax;
	}

	public CorporateActionEvent setTransactionTax(Tax transactionTax) {
		this.transactionTax = Objects.requireNonNull(transactionTax);
		return this;
	}

	public ConsentTypeCode getConsentType() {
		return consentType;
	}

	public CorporateActionEvent setConsentType(ConsentTypeCode consentType) {
		this.consentType = Objects.requireNonNull(consentType);
		return this;
	}

	public ProceedsDefinition getProceedsDefinition() {
		return proceedsDefinition;
	}

	public CorporateActionEvent setProceedsDefinition(ProceedsDefinition proceedsDefinition) {
		this.proceedsDefinition = Objects.requireNonNull(proceedsDefinition);
		return this;
	}

	public GenericIdentification getTaxOnNonDistributedProceedsIndicator() {
		return taxOnNonDistributedProceedsIndicator;
	}

	public CorporateActionEvent setTaxOnNonDistributedProceedsIndicator(GenericIdentification taxOnNonDistributedProceedsIndicator) {
		this.taxOnNonDistributedProceedsIndicator = Objects.requireNonNull(taxOnNonDistributedProceedsIndicator);
		return this;
	}
}