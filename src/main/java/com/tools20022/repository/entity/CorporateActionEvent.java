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
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.CorporateAction33#mmDateDetails
 * CorporateAction33.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction32#mmDateDetails
 * CorporateAction32.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmDateDetails
 * CorporateAction31.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmPeriodDetails
 * CorporateAction31.mmPeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmRateAndAmountDetails
 * CorporateAction31.mmRateAndAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction34#mmDateDetails
 * CorporateAction34.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#mmRateDetails
 * SecuritiesOption60.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmRateDetails
 * SecuritiesOption59.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance11#mmGeneralInformation
 * CorporateActionEventAndBalance11.mmGeneralInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionNarrative10
 * CorporateActionNarrative10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionDate24
 * CorporateActionDate24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPeriod7
 * CorporateActionPeriod7}</li>
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
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPeriod10
 * CorporateActionPeriod10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPeriod11
 * CorporateActionPeriod11}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStage3Choice
 * CorporateActionEventStage3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation92
 * CorporateActionGeneralInformation92}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction33
 * CorporateAction33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction32
 * CorporateAction32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction31
 * CorporateAction31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionNarrative27
 * CorporateActionNarrative27}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingType2Choice
 * CorporateActionEventProcessingType2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionMandatoryVoluntary3Choice
 * CorporateActionMandatoryVoluntary3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionDate49
 * CorporateActionDate49}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat14Choice
 * CorporateActionEventStageFormat14Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat10Choice
 * AdditionalBusinessProcessFormat10Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat11Choice
 * AdditionalBusinessProcessFormat11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionAmounts37
 * CorporateActionAmounts37}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat9Choice
 * AdditionalBusinessProcessFormat9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionDate46
 * CorporateActionDate46}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionDate45
 * CorporateActionDate45}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionRate69
 * CorporateActionRate69}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionRate71
 * CorporateActionRate71}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionDate48
 * CorporateActionDate48}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionDate47
 * CorporateActionDate47}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionAmounts36
 * CorporateActionAmounts36}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate11 SecurityDate11}</li>
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
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionRate66
 * CorporateActionRate66}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionDate44
 * CorporateActionDate44}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionRate72
 * CorporateActionRate72}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstructedBalanceDetails5
 * InstructedBalanceDetails5}</li>
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
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionAmounts38
 * CorporateActionAmounts38}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction34
 * CorporateAction34}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation109
 * CorporateActionGeneralInformation109}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation111
 * CorporateActionGeneralInformation111}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation112
 * CorporateActionGeneralInformation112}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation110
 * CorporateActionGeneralInformation110}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation105
 * CorporateActionGeneralInformation105}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation107
 * CorporateActionGeneralInformation107}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation106
 * CorporateActionGeneralInformation106}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation108
 * CorporateActionGeneralInformation108}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType51Choice
 * CorporateActionEventType51Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType52Choice
 * CorporateActionEventType52Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails26 RateDetails26}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType54Choice
 * CorporateActionEventType54Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionRate82
 * CorporateActionRate82}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionRate80
 * CorporateActionRate80}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails27 RateDetails27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionRate81
 * CorporateActionRate81}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EventInformation9
 * EventInformation9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance11
 * CorporateActionEventAndBalance11}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType53Choice
 * CorporateActionEventType53Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType56Choice
 * CorporateActionEventType56Choice}</li>
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
	 * Type of corporate action event.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation111#mmEventType
	 * CorporateActionGeneralInformation111.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation112#mmEventType
	 * CorporateActionGeneralInformation112.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation110#mmEventType
	 * CorporateActionGeneralInformation110.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation105#mmEventType
	 * CorporateActionGeneralInformation105.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation107#mmEventType
	 * CorporateActionGeneralInformation107.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation106#mmEventType
	 * CorporateActionGeneralInformation106.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation108#mmEventType
	 * CorporateActionGeneralInformation108.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType51Choice#mmCode
	 * CorporateActionEventType51Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType51Choice#mmProprietary
	 * CorporateActionEventType51Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType52Choice#mmCode
	 * CorporateActionEventType52Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType52Choice#mmProprietary
	 * CorporateActionEventType52Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType54Choice#mmCode
	 * CorporateActionEventType54Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType54Choice#mmProprietary
	 * CorporateActionEventType54Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation9#mmEventType
	 * EventInformation9.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType53Choice#mmCode
	 * CorporateActionEventType53Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType53Choice#mmProprietary
	 * CorporateActionEventType53Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent19Choice#mmCorporateActionEventType
	 * SettlementOrCorporateActionEvent19Choice.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent17Choice#mmCorporateActionEventType
	 * SettlementOrCorporateActionEvent17Choice.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails13#mmCorporateActionEventType
	 * IntraPositionMovementDetails13.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType56Choice#mmCode
	 * CorporateActionEventType56Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType56Choice#mmProprietary
	 * CorporateActionEventType56Choice.mmProprietary}</li>
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
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionEventType2FormatChoice.mmCode, CorporateActionEventType2FormatChoice.mmProprietary, CorporateActionInformation2.mmEventType, CorporateActionFrequencyType1FormatChoice.mmCode,
					CorporateActionFrequencyType1FormatChoice.mmProprietary, CorporateActionInformation1.mmEventType, CorporateActionStandingInstructionGeneralInformation1.mmEventType, TransactionType1Choice.mmCorporateActionType,
					CorporateAction1Choice.mmType, CorporateAction1Choice.mmProprietary, CorporateActionGeneralInformation109.mmEventType, CorporateActionGeneralInformation111.mmEventType, CorporateActionGeneralInformation112.mmEventType,
					CorporateActionGeneralInformation110.mmEventType, CorporateActionGeneralInformation105.mmEventType, CorporateActionGeneralInformation107.mmEventType, CorporateActionGeneralInformation106.mmEventType,
					CorporateActionGeneralInformation108.mmEventType, CorporateActionEventType51Choice.mmCode, CorporateActionEventType51Choice.mmProprietary, CorporateActionEventType52Choice.mmCode,
					CorporateActionEventType52Choice.mmProprietary, CorporateActionEventType54Choice.mmCode, CorporateActionEventType54Choice.mmProprietary, EventInformation9.mmEventType, CorporateActionEventType53Choice.mmCode,
					CorporateActionEventType53Choice.mmProprietary, SettlementOrCorporateActionEvent19Choice.mmCorporateActionEventType, SettlementOrCorporateActionEvent17Choice.mmCorporateActionEventType,
					IntraPositionMovementDetails13.mmCorporateActionEventType, CorporateActionEventType56Choice.mmCode, CorporateActionEventType56Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionEventTypeV3Code.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionEvent.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionMandatoryVoluntaryCode mandatoryVoluntaryEventType;
	/**
	 * Specifies whether the event is mandatory, mandatory with options or
	 * voluntary.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation112#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation112.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation105#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation105.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation106#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation106.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation108#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation108.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation9#mmMandatoryVoluntaryEventType
	 * EventInformation9.mmMandatoryVoluntaryEventType}</li>
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
	public static final MMBusinessAttribute mmMandatoryVoluntaryEventType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionMandatoryVoluntary1FormatChoice.mmCode, CorporateActionMandatoryVoluntary1FormatChoice.mmProprietary, CorporateActionInformation2.mmMandatoryVoluntaryEventType,
					CorporateActionInformation1.mmMandatoryVoluntaryEventType, CorporateActionMandatoryVoluntary3Choice.mmCode, CorporateActionMandatoryVoluntary3Choice.mmProprietary,
					CorporateActionGeneralInformation112.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation105.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation106.mmMandatoryVoluntaryEventType,
					CorporateActionGeneralInformation108.mmMandatoryVoluntaryEventType, EventInformation9.mmMandatoryVoluntaryEventType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MandatoryVoluntaryEventType";
			definition = "Specifies whether the event is mandatory, mandatory with options or voluntary.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionMandatoryVoluntaryCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionEvent.class.getMethod("getMandatoryVoluntaryEventType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Security underlyingSecurity;
	/**
	 * Security to which this instruction or event applies.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation105#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation105.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation107#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation107.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation106#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation106.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#mmDateDetails
	 * SecuritiesOption60.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmSecurityDetails
	 * SecuritiesOption59.mmSecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmDateDetails
	 * SecuritiesOption59.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance11#mmUnderlyingSecurity
	 * CorporateActionEventAndBalance11.mmUnderlyingSecurity}</li>
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
	public static final MMBusinessAssociationEnd mmUnderlyingSecurity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionInformation2.mmUnderlyingSecurity, CorporateActionInformation2.mmOtherUnderlyingSecurity, CorporateActionInformation1.mmUnderlyingSecurity,
					CorporateActionStandingInstructionGeneralInformation1.mmUnderlyingSecurity, CorporateActionGeneralInformation105.mmUnderlyingSecurity, CorporateActionGeneralInformation107.mmUnderlyingSecurity,
					CorporateActionGeneralInformation106.mmUnderlyingSecurity, SecuritiesOption60.mmDateDetails, SecuritiesOption59.mmSecurityDetails, SecuritiesOption59.mmDateDetails, CorporateActionEventAndBalance11.mmUnderlyingSecurity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnderlyingSecurity";
			definition = "Security to which this instruction or event applies.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmCorporateEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CorporateActionPrice> corporateActionPrice;
	/**
	 * Specifies prices related to a corporate action.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmPriceDetails
	 * CorporateAction31.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmPriceDetails
	 * CorporateActionOption132.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmPriceDetails
	 * CorporateActionOption130.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#mmPriceDetails
	 * CorporateActionOption131.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmPriceDetails
	 * CorporateActionOption129.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption52#mmPriceDetails
	 * CashOption52.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#mmPriceDetails
	 * SecuritiesOption60.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption51#mmPriceDetails
	 * CashOption51.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmPriceDetails
	 * SecuritiesOption59.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption50#mmPriceDetails
	 * CashOption50.mmPriceDetails}</li>
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
	public static final MMBusinessAssociationEnd mmCorporateActionPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateAction2.mmPriceDetails, SecurityOption1.mmPriceDetails, CorporateActionOption1.mmPriceDetails, CorporateAction31.mmPriceDetails, CorporateActionOption132.mmPriceDetails,
					CorporateActionOption130.mmPriceDetails, CorporateActionOption131.mmPriceDetails, CorporateActionOption129.mmPriceDetails, CashOption52.mmPriceDetails, SecuritiesOption60.mmPriceDetails, CashOption51.mmPriceDetails,
					SecuritiesOption59.mmPriceDetails, CashOption50.mmPriceDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionPrice";
			definition = "Specifies prices related to a corporate action.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CurrencyExchange> exchangeRate;
	/**
	 * Rate, specified by the issuer, when the paid amount is not in the same
	 * currency as the specified amount.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CashOption52#mmForeignExchangeDetails
	 * CashOption52.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption51#mmForeignExchangeDetails
	 * CashOption51.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#mmIssuerDeclaredExchangeRate
	 * CorporateActionRate80.mmIssuerDeclaredExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption50#mmForeignExchangeDetails
	 * CashOption50.mmForeignExchangeDetails}</li>
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
	public static final MMBusinessAssociationEnd mmExchangeRate = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate2.mmExchangeRate, CashOption1.mmExchangeRate, CorporateActionNarrative32.mmForeignExchangeInstructionsAdditionalInformation, CashOption52.mmForeignExchangeDetails,
					CashOption51.mmForeignExchangeDetails, CorporateActionRate80.mmIssuerDeclaredExchangeRate, CashOption50.mmForeignExchangeDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExchangeRate";
			definition = "Rate, specified by the issuer, when the paid amount is not in the same currency as the specified amount.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmRelatedCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};
	protected Max350Text registrationDetails;
	/**
	 * Provides information required for the registration.
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
	public static final MMBusinessAttribute mmRegistrationDetails = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return CorporateActionEvent.class.getMethod("getRegistrationDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max350Text basketOrIndexInformation;
	/**
	 * Provides additional information on the basket or index underlying a
	 * security, for example a warrant.
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
	public static final MMBusinessAttribute mmBasketOrIndexInformation = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return CorporateActionEvent.class.getMethod("getBasketOrIndexInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Deadline deadline;
	/**
	 * Specifies the different deadlines related to a corporate event.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption6#mmDeadlineDateTime
	 * InstructedCorporateActionOption6.mmDeadlineDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption6#mmDeadlineType
	 * InstructedCorporateActionOption6.mmDeadlineType}</li>
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
	 * name} = "Deadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the different deadlines related to a corporate event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDeadline = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(InstructedCorporateActionOption6.mmDeadlineDateTime, InstructedCorporateActionOption6.mmDeadlineType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Deadline";
			definition = "Specifies the different deadlines related to a corporate event.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Deadline.mmRelatedCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Deadline.mmObject();
		}
	};
	protected AdditionalBusinessProcessCode additionalBusinessProcess;
	/**
	 * Specifies the type of the additional business process linked to a
	 * corporate action event such as a claim compensation or tax refund.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction33#mmAdditionalBusinessProcessIndicator
	 * CorporateAction33.mmAdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction32#mmAdditionalBusinessProcessIndicator
	 * CorporateAction32.mmAdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmAdditionalBusinessProcessIndicator
	 * CorporateAction31.mmAdditionalBusinessProcessIndicator}</li>
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
	public static final MMBusinessAttribute mmAdditionalBusinessProcess = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateAction33.mmAdditionalBusinessProcessIndicator, CorporateAction32.mmAdditionalBusinessProcessIndicator, CorporateAction31.mmAdditionalBusinessProcessIndicator,
					AdditionalBusinessProcessFormat10Choice.mmCode, AdditionalBusinessProcessFormat10Choice.mmProprietary, AdditionalBusinessProcessFormat11Choice.mmCode, AdditionalBusinessProcessFormat11Choice.mmProprietary,
					AdditionalBusinessProcessFormat9Choice.mmCode, AdditionalBusinessProcessFormat9Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdditionalBusinessProcess";
			definition = "Specifies the type of the additional business process linked to a corporate action event such as a claim compensation or tax refund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AdditionalBusinessProcessCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionEvent.class.getMethod("getAdditionalBusinessProcess", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime tradingDate;
	/**
	 * Date/time at which the deal (rights) was agreed.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate46#mmTradingDate
	 * CorporateActionDate46.mmTradingDate}</li>
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
	public static final MMBusinessAttribute mmTradingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate46.mmTradingDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingDate";
			definition = "Date/time at which the deal (rights) was agreed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionEvent.class.getMethod("getTradingDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionFeesAndCharges corporateActionCharge;
	/**
	 * Specifies the charges relative to a corporate action event.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate69#mmChargesFees
	 * CorporateActionRate69.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate72#mmChargesFees
	 * CorporateActionRate72.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#mmChargesFees
	 * RateDetails26.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#mmChargesFees
	 * RateDetails27.mmChargesFees}</li>
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
	public static final MMBusinessAssociationEnd mmCorporateActionCharge = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate1.mmCharges, CorporateActionRate2.mmCharges, CorporateActionRate69.mmChargesFees, CorporateActionRate72.mmChargesFees, RateDetails26.mmChargesFees,
					RateDetails27.mmChargesFees);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionCharge";
			definition = "Specifies the charges relative to a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionFeesAndCharges.mmCorporateAction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionFeesAndCharges.mmObject();
		}
	};
	protected ISODateTime pariPassuDate;
	/**
	 * Date on which security will assimilate, become fungible, or have the same
	 * rights to dividends as the parent issue.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate3#mmPariPassuDate
	 * CorporateActionDate3.mmPariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate12#mmPariPassuDate
	 * SecurityDate12.mmPariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate11#mmPariPassuDate
	 * SecurityDate11.mmPariPassuDate}</li>
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
	public static final MMBusinessAttribute mmPariPassuDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate3.mmPariPassuDate, SecurityDate12.mmPariPassuDate, SecurityDate11.mmPariPassuDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PariPassuDate";
			definition = "Date on which security will assimilate, become fungible, or have the same rights to dividends as the parent issue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionEvent.class.getMethod("getPariPassuDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max350Text informationConditions;
	/**
	 * Provides conditional information related to the event, eg, an offer is
	 * subject to 50% acceptance, the offeror allows the securities holder to
	 * set some conditions.
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
	public static final MMBusinessAttribute mmInformationConditions = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return CorporateActionEvent.class.getMethod("getInformationConditions", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesQuantity> fractionalQuantity;
	/**
	 * Fractional quantity resulting from an event which will be paid with cash
	 * in lieu.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation111#mmFractionalQuantity
	 * CorporateActionGeneralInformation111.mmFractionalQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmFractionalQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionGeneralInformation111.mmFractionalQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FractionalQuantity";
			definition = "Fractional quantity resulting from an event which will be paid with cash in lieu. ";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedEventForFractionalQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected CorporateActionEventProcessingTypeCode eventProcessingType;
	/**
	 * Type of processing involved by a Corporate Action.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation105#mmEventProcessingType
	 * CorporateActionGeneralInformation105.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation106#mmEventProcessingType
	 * CorporateActionGeneralInformation106.mmEventProcessingType}</li>
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
	public static final MMBusinessAttribute mmEventProcessingType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionEventProcessingType1FormatChoice.mmCode, CorporateActionEventProcessingType1FormatChoice.mmProprietary, CorporateActionInformation2.mmEventProcessingType,
					CorporateActionInformation1.mmEventProcessingType, CorporateActionEventProcessingType2Choice.mmCode, CorporateActionEventProcessingType2Choice.mmProprietary, CorporateActionGeneralInformation105.mmEventProcessingType,
					CorporateActionGeneralInformation106.mmEventProcessingType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EventProcessingType";
			definition = "Type of processing involved by a Corporate Action.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionEventProcessingTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionEvent.class.getMethod("getEventProcessingType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CorporateActionStatus> corporateActionStatus;
	/**
	 * Status of the corporate action process.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmCorporateActionStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionNotification1.mmProcessingStatus, CorporateActionNotification5.mmProcessingStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionStatus";
			definition = "Status of the corporate action process.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.mmCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.mmObject();
		}
	};
	protected ISODateTime announcementDate;
	/**
	 * Date/time at which the issuer announced that a corporate action event
	 * will occur such as the issue of securities or an official meeting.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification1#mmAnnouncementDate
	 * CorporateActionNotification1.mmAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmAnnouncementDate
	 * MeetingNotice4.mmAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmAnnouncementDate
	 * CorporateActionDate44.mmAnnouncementDate}</li>
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
	public static final MMBusinessAttribute mmAnnouncementDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionNotification1.mmAnnouncementDate, MeetingNotice4.mmAnnouncementDate, CorporateActionDate44.mmAnnouncementDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AnnouncementDate";
			definition = "Date/time at which the issuer announced that a corporate action event will occur such as the issue of securities or an official meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionEvent.class.getMethod("getAnnouncementDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime effectiveDate;
	/**
	 * Date/time at which an event is officially effective from the issuer's
	 * perspective.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmEffectiveDate
	 * CorporateActionDate2.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmEffectiveDate
	 * CorporateActionDate44.mmEffectiveDate}</li>
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
	public static final MMBusinessAttribute mmEffectiveDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate2.mmEffectiveDate, CorporateActionDate44.mmEffectiveDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EffectiveDate";
			definition = "Date/time at which an event is officially effective from the issuer's perspective.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionEvent.class.getMethod("getEffectiveDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime furtherDetailsAnnouncementDate;
	/**
	 * Date/time at which additional information on the event will be announced,
	 * for instance exchange ratio announcement date.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification1#mmFurtherDetailedAnnouncementDate
	 * CorporateActionNotification1.mmFurtherDetailedAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmFurtherDetailedAnnouncementDate
	 * CorporateActionDate44.mmFurtherDetailedAnnouncementDate}</li>
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
	public static final MMBusinessAttribute mmFurtherDetailsAnnouncementDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionNotification1.mmFurtherDetailedAnnouncementDate, CorporateActionDate44.mmFurtherDetailedAnnouncementDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FurtherDetailsAnnouncementDate";
			definition = "Date/time at which additional information on the event will be announced, for instance exchange ratio announcement date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionEvent.class.getMethod("getFurtherDetailsAnnouncementDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime marginFixingDate;
	/**
	 * Date/time at which the margin rate will be determined .
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmMarginFixingDate
	 * CorporateActionDate2.mmMarginFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmMarginFixingDate
	 * CorporateActionDate44.mmMarginFixingDate}</li>
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
	public static final MMBusinessAttribute mmMarginFixingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate2.mmMarginFixingDate, CorporateActionDate44.mmMarginFixingDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarginFixingDate";
			definition = "Date/time at which the margin rate will be determined .";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionEvent.class.getMethod("getMarginFixingDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate resultPublicationDate;
	/**
	 * Date on which results are published, eg, results of an offer, of a
	 * meeting.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmResultsPublicationDate
	 * CorporateActionDate44.mmResultsPublicationDate}</li>
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
	public static final MMBusinessAttribute mmResultPublicationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate2.mmResultsPublicationDate, MeetingNotice4.mmResultPublicationDate, CorporateActionDate44.mmResultsPublicationDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResultPublicationDate";
			definition = "Date on which results are published, eg, results of an offer, of a meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionEvent.class.getMethod("getResultPublicationDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime unconditionalDate;
	/**
	 * Date upon which the terms of the take-over become unconditional as to
	 * acceptances.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmUnconditionalDate
	 * CorporateActionDate2.mmUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmUnconditionalDate
	 * CorporateActionDate44.mmUnconditionalDate}</li>
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
	public static final MMBusinessAttribute mmUnconditionalDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate2.mmUnconditionalDate, CorporateActionDate44.mmUnconditionalDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnconditionalDate";
			definition = "Date upon which the terms of the take-over become unconditional as to acceptances.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionEvent.class.getMethod("getUnconditionalDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime whollyUnconditionalDate;
	/**
	 * Date on which all conditions, including regulatory, legal etc. pertaining
	 * to the take-over, have been met.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmWhollyUnconditionalDate
	 * CorporateActionDate2.mmWhollyUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmWhollyUnconditionalDate
	 * CorporateActionDate44.mmWhollyUnconditionalDate}</li>
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
	public static final MMBusinessAttribute mmWhollyUnconditionalDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate2.mmWhollyUnconditionalDate, CorporateActionDate44.mmWhollyUnconditionalDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WhollyUnconditionalDate";
			definition = "Date on which all conditions, including regulatory, legal etc. pertaining to the take-over, have been met.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionEvent.class.getMethod("getWhollyUnconditionalDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime lapsedDate;
	/**
	 * Date/time at which an event/offer is terminated or lapsed.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmLapsedDate
	 * CorporateActionDate2.mmLapsedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmLapsedDate
	 * CorporateActionDate44.mmLapsedDate}</li>
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
	public static final MMBusinessAttribute mmLapsedDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate2.mmLapsedDate, CorporateActionDate44.mmLapsedDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LapsedDate";
			definition = "Date/time at which an event/offer is terminated or lapsed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionEvent.class.getMethod("getLapsedDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DateTimePeriod bookClosurePeriod;
	/**
	 * Period defining the last date on which shareholder registration will be
	 * accepted by the issuer and the date on which shareholder registration
	 * will resume.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmBookClosurePeriod
	 * CorporateActionPeriod10.mmBookClosurePeriod}</li>
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
	public static final MMBusinessAssociationEnd mmBookClosurePeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPeriod10.mmBookClosurePeriod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BookClosurePeriod";
			definition = "Period defining the last date on which shareholder registration will be accepted by the issuer and the date on which shareholder registration will resume.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmBookClosureCorporateAction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesQuantity> securitiesQuantity;
	/**
	 * Provides information about securities quantity linked to a corporate
	 * action.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmSecuritiesQuantity
	 * CorporateAction31.mmSecuritiesQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateAction31.mmSecuritiesQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantity";
			definition = "Provides information about securities quantity linked to a corporate action.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected YesNoIndicator restrictionIndicator;
	/**
	 * Indicates whether there are legal or other restrictions associated with a
	 * rights offer or other corporate event, for example, domicile,
	 * citizenship, residency, type of investor.<br>
	 * Yes = There are restrictions.<br>
	 * No = There are no restrictions.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmRestrictionIndicator
	 * CorporateAction2.mmRestrictionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmRestrictionIndicator
	 * CorporateAction31.mmRestrictionIndicator}</li>
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
	public static final MMBusinessAttribute mmRestrictionIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateAction2.mmRestrictionIndicator, CorporateAction31.mmRestrictionIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RestrictionIndicator";
			definition = "Indicates whether there are legal or other restrictions associated with a rights offer or other corporate event, for example, domicile, citizenship, residency, type of investor.\r\nYes = There are restrictions.\r\nNo = There are no restrictions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionEvent.class.getMethod("getRestrictionIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionEventStageCode eventStage;
	/**
	 * Stage in the corporate action event life cycle.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction33#mmEventStage
	 * CorporateAction33.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction32#mmEventStage
	 * CorporateAction32.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmEventStage
	 * CorporateAction31.mmEventStage}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction34#mmEventStage
	 * CorporateAction34.mmEventStage}</li>
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
	public static final MMBusinessAttribute mmEventStage = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionEventStage1FormatChoice.mmCode, CorporateActionEventStage1FormatChoice.mmProprietary, CorporateAction2.mmEventStage, Status19Choice.mmCorporateActionEventStage,
					CorporateActionEventStage3Choice.mmCode, CorporateActionEventStage3Choice.mmProprietary, CorporateAction33.mmEventStage, CorporateAction32.mmEventStage, CorporateAction31.mmEventStage,
					CorporateActionEventStageFormat14Choice.mmCode, CorporateActionEventStageFormat14Choice.mmProprietary, CorporateActionEventStageFormat13Choice.mmCode, CorporateActionEventStageFormat13Choice.mmProprietary,
					CorporateAction34.mmEventStage);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EventStage";
			definition = "Stage in the corporate action event life cycle.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionEventStageCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionEvent.class.getMethod("getEventStage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.ContactPoint> documentationLocation;
	/**
	 * Information on where additional information published for the event, can
	 * be received. for instance the address for the Universal Resource Locator
	 * (URL), eg, used over the www (HTTP) service.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmDocumentationLocation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionNarrative26.mmURLAddress);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DocumentationLocation";
			definition = "Information on where additional information published for the event, can be received. for instance the address for the Universal Resource Locator (URL), eg, used over the www (HTTP) service.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmRelatedCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
		}
	};
	protected SecuritiesQuantity securitiesQuantitySought;
	/**
	 * Quantity of securities the offeror/issuer will purchase or redeem under
	 * the terms of the event. This can be a number or the term "any and all".
	 * <p>
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
	public static final MMBusinessAssociationEnd mmSecuritiesQuantitySought = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateAction2.mmSecuritiesQuantitySought);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantitySought";
			definition = "Quantity of securities the offeror/issuer will purchase or redeem under the terms of the event. This can be a number or the term \"any and all\".";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected YesNoIndicator partialElectionIndicator;
	/**
	 * Specifies if the issuer will allow the agent to accept partial elections.
	 * It is to allow split voting over options. It allows the client to elect
	 * more than one option to be selected per designated holding.
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
	public static final MMBusinessAttribute mmPartialElectionIndicator = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return CorporateActionEvent.class.getMethod("getPartialElectionIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionPartyRole corporateActionPartyRole;
	/**
	 * Specifies the role played by a party in the context of a corporate
	 * action.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmCorporateActionPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionPartyRole";
			definition = "Specifies the role played by a party in the context of a corporate action.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPartyRole.mmCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionPartyRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.MarketClaim> marketClaim;
	/**
	 * Market claim information.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmMarketClaim = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketClaim";
			definition = "Market claim information.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MarketClaim.mmRelatedCorporateEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MarketClaim.mmObject();
		}
	};
	protected BiddingConditions biddingConditions;
	/**
	 * Specifies the conditions under which securities can be acquired as part
	 * of a corporate action.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmBiddingConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BiddingConditions";
			definition = "Specifies the conditions under which securities can be acquired as part of a corporate action.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ClassAction> relatedClassAction;
	/**
	 * Specifies the underlying class action related to the event.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmRelatedClassAction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedClassAction";
			definition = "Specifies the underlying class action related to the event.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ClassAction.mmCorporateEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ClassAction.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CorporateActionEventRegistration> corporateActionEventRegistration;
	/**
	 * Official registration of the event.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmCorporateActionEventRegistration = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEventRegistration";
			definition = "Official registration of the event.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEventRegistration.mmCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEventRegistration.mmObject();
		}
	};
	protected SuspensionPeriod suspensionPeriod;
	/**
	 * Period defining the last date for which an action will be accepted and
	 * the date on which the suspension will be released and normal processing
	 * will resume.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmSuspensionPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SuspensionPeriod";
			definition = "Period defining the last date for which an action will be accepted and the date on which the suspension will be released and normal processing will resume.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
		}
	};
	protected Lottery lottery;
	/**
	 * Organisation of draws for cash prizes on bonds (instead of coupon
	 * payments). Every issued bond (similar to a lottery ticket) has an equal
	 * opportunity at winning payments in the draws.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmLottery = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Lottery";
			definition = "Organisation of draws for cash prizes on bonds (instead of coupon payments). Every issued bond (similar to a lottery ticket) has an equal opportunity at winning payments in the draws.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Lottery.mmRelatedCorporateEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Lottery.mmObject();
		}
	};
	protected RemarketingMarginTypeCode marginType;
	/**
	 * Specifies the margin type for a remarketing procedure.
	 * <p>
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
	public static final MMBusinessAttribute mmMarginType = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return CorporateActionEvent.class.getMethod("getMarginType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Meeting> relatedMeeting;
	/**
	 * Provides information on the meeting related to the corporate event.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmRelatedMeeting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedMeeting";
			definition = "Provides information on the meeting  related to the corporate event.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.mmCorporateEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CorporateActionServicing> services;
	/**
	 * Specifies the different services linked to a corporate action event.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmServices = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Services";
			definition = "Specifies the different services linked to a corporate action event.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Issuance> issuance;
	/**
	 * Information specified when the corporate event relates to the issuance of
	 * securities.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmIssuance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Issuance";
			definition = "Information specified when the corporate event relates to the issuance of securities.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.mmEventInformation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesModification> securitiesModification;
	/**
	 * Modification of the reference data of a security or of the organisation
	 * that issued it.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmSecuritiesModification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesModification";
			definition = "Modification of the reference data of a security or of the organisation that issued it.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmRelatedCorporateEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmObject();
		}
	};
	protected DateTimePeriod tradingPeriod;
	/**
	 * Period during which a financial instrument is available for trading.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes68#mmTradingPeriod
	 * FinancialInstrumentAttributes68.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmTradingPeriod
	 * SecuritiesOption59.mmTradingPeriod}</li>
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
	public static final MMBusinessAssociationEnd mmTradingPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityOption1.mmTradingPeriod, FinancialInstrumentAttributes68.mmTradingPeriod, SecuritiesOption59.mmTradingPeriod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingPeriod";
			definition = "Period during which a financial instrument is available for trading.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmRelatedCorporateAction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected Tax transactionTax;
	/**
	 * Tax rate of financial transactions related to an event.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate69#mmFinancialTransactionTaxRate
	 * CorporateActionRate69.mmFinancialTransactionTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate72#mmFinancialTransactionTaxRate
	 * CorporateActionRate72.mmFinancialTransactionTaxRate}</li>
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
	public static final MMBusinessAssociationEnd mmTransactionTax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate69.mmFinancialTransactionTaxRate, CorporateActionRate72.mmFinancialTransactionTaxRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionTax";
			definition = "Tax rate of financial transactions related to an event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.mmCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};
	protected ConsentTypeCode consentType;
	/**
	 * Corporate actions may be approved by shareholders without a meeting or a
	 * vote by means of execution of a consent by a majority of shareholders
	 * entitled to vote.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmConsentType
	 * CorporateAction31.mmConsentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentTypeFormat4Choice#mmCode
	 * ConsentTypeFormat4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentTypeFormat4Choice#mmProprietary
	 * ConsentTypeFormat4Choice.mmProprietary}</li>
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
	public static final MMBusinessAttribute mmConsentType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateAction31.mmConsentType, ConsentTypeFormat4Choice.mmCode, ConsentTypeFormat4Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConsentType";
			definition = "Corporate actions may be approved by shareholders without a meeting or a vote by means of execution of a consent by a majority of shareholders entitled to vote.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ConsentTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionEvent.class.getMethod("getConsentType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ProceedsDefinition proceedsDefinition;
	/**
	 * Specifies the proceeds of a corporate action.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProceedsDefinition";
			definition = "Specifies the proceeds of a corporate action.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ProceedsDefinition.mmCorporateAction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProceedsDefinition.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEvent";
				definition = "An event determined by a corporation's board of directors, that changes the existing corporate capital structure or financial condition.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmCorporateEvent, com.tools20022.repository.entity.ContactPoint.mmRelatedCorporateActionEvent,
						com.tools20022.repository.entity.DateTimePeriod.mmBookClosureCorporateAction, com.tools20022.repository.entity.DateTimePeriod.mmRelatedCorporateAction, com.tools20022.repository.entity.Tax.mmCorporateActionEvent,
						com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedEventForFractionalQuantity, com.tools20022.repository.entity.SecuritiesQuantity.mmCorporateActionEvent,
						com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedCorporateActionEvent, com.tools20022.repository.entity.CorporateActionStatus.mmCorporateActionEvent,
						com.tools20022.repository.entity.CurrencyExchange.mmRelatedCorporateActionEvent, com.tools20022.repository.entity.CorporateActionEventRegistration.mmCorporateActionEvent,
						com.tools20022.repository.entity.Issuance.mmEventInformation, com.tools20022.repository.entity.ProceedsDefinition.mmCorporateAction, com.tools20022.repository.entity.ClassAction.mmCorporateEvent,
						com.tools20022.repository.entity.SecuritiesModification.mmRelatedCorporateEvent, com.tools20022.repository.entity.BiddingConditions.mmEvent,
						com.tools20022.repository.entity.CorporateActionPrice.mmCorporateActionEvent, com.tools20022.repository.entity.CorporateActionServicing.mmEvent,
						com.tools20022.repository.entity.Deadline.mmRelatedCorporateActionEvent, com.tools20022.repository.entity.CorporateActionFeesAndCharges.mmCorporateAction,
						com.tools20022.repository.entity.MarketClaim.mmRelatedCorporateEvent, com.tools20022.repository.entity.SuspensionPeriod.mmCorporateActionEvent, com.tools20022.repository.entity.Lottery.mmRelatedCorporateEvent,
						com.tools20022.repository.entity.Meeting.mmCorporateEvent, com.tools20022.repository.entity.CorporateActionPartyRole.mmCorporateActionEvent);
				derivationElement_lazy = () -> Arrays.asList(CorporateAction2.mmDateDetails, CorporateAction2.mmPeriodDetails, CorporateAction2.mmRateAndAmountDetails, CorporateAction33.mmDateDetails, CorporateAction32.mmDateDetails,
						CorporateAction31.mmDateDetails, CorporateAction31.mmPeriodDetails, CorporateAction31.mmRateAndAmountDetails, CorporateAction34.mmDateDetails, SecuritiesOption60.mmRateDetails, SecuritiesOption59.mmRateDetails,
						CorporateActionEventAndBalance11.mmGeneralInformation);
				element_lazy = () -> Arrays
						.asList(com.tools20022.repository.entity.CorporateActionEvent.mmType, com.tools20022.repository.entity.CorporateActionEvent.mmMandatoryVoluntaryEventType,
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
								com.tools20022.repository.entity.CorporateActionEvent.mmProceedsDefinition);
				derivationComponent_lazy = () -> Arrays.asList(CorporateActionNarrative10.mmObject(), CorporateActionDate24.mmObject(), CorporateActionPeriod7.mmObject(), CorporateActionEventProcessingType1FormatChoice.mmObject(),
						CorporateActionMandatoryVoluntary1FormatChoice.mmObject(), CorporateActionInformation2.mmObject(), CorporateActionEventStage1FormatChoice.mmObject(), CorporateActionFrequencyType1FormatChoice.mmObject(),
						CorporateActionDate2.mmObject(), CorporateActionPeriod1.mmObject(), CorporateActionRate1.mmObject(), CorporateActionNarrative1.mmObject(), CorporateAction2.mmObject(), CorporateActionDate4.mmObject(),
						CorporateActionRate2.mmObject(), CorporateActionPeriod2.mmObject(), CorporateActionDate3.mmObject(), CorporateActionDate5.mmObject(), CorporateActionAmounts1.mmObject(), CorporateActionNarrative2.mmObject(),
						CorporateActionInformation1.mmObject(), CorporateActionAdditionalInformation1.mmObject(), CorporateActionDeactivationInstruction1.mmObject(), CorporateActionPeriod10.mmObject(), CorporateActionPeriod11.mmObject(),
						CorporateActionEventStage3Choice.mmObject(), CorporateActionGeneralInformation92.mmObject(), CorporateAction33.mmObject(), CorporateAction32.mmObject(), CorporateAction31.mmObject(),
						CorporateActionNarrative27.mmObject(), CorporateActionEventProcessingType2Choice.mmObject(), CorporateActionMandatoryVoluntary3Choice.mmObject(), CorporateActionDate49.mmObject(),
						CorporateActionEventStageFormat14Choice.mmObject(), AdditionalBusinessProcessFormat10Choice.mmObject(), AdditionalBusinessProcessFormat11Choice.mmObject(), CorporateActionAmounts37.mmObject(),
						AdditionalBusinessProcessFormat9Choice.mmObject(), CorporateActionDate46.mmObject(), CorporateActionDate45.mmObject(), CorporateActionRate69.mmObject(), CorporateActionRate71.mmObject(),
						CorporateActionDate48.mmObject(), CorporateActionDate47.mmObject(), CorporateActionAmounts36.mmObject(), SecurityDate11.mmObject(), CorporateActionQuantity7.mmObject(), CertificationTypeFormat3Choice.mmObject(),
						CorporateActionEventStageFormat13Choice.mmObject(), CorporateActionNarrative26.mmObject(), ConsentTypeFormat4Choice.mmObject(), CorporateActionRate66.mmObject(), CorporateActionDate44.mmObject(),
						CorporateActionRate72.mmObject(), InstructedBalanceDetails5.mmObject(), CorporateActionNarrative30.mmObject(), CorporateActionNarrative31.mmObject(), CorporateActionNarrative28.mmObject(),
						CorporateActionNarrative29.mmObject(), CorporateActionNarrative32.mmObject(), CorporateActionAmounts38.mmObject(), CorporateAction34.mmObject(), CorporateActionGeneralInformation109.mmObject(),
						CorporateActionGeneralInformation111.mmObject(), CorporateActionGeneralInformation112.mmObject(), CorporateActionGeneralInformation110.mmObject(), CorporateActionGeneralInformation105.mmObject(),
						CorporateActionGeneralInformation107.mmObject(), CorporateActionGeneralInformation106.mmObject(), CorporateActionGeneralInformation108.mmObject(), CorporateActionEventType51Choice.mmObject(),
						CorporateActionEventType52Choice.mmObject(), RateDetails26.mmObject(), CorporateActionEventType54Choice.mmObject(), CorporateActionRate82.mmObject(), CorporateActionRate80.mmObject(), RateDetails27.mmObject(),
						CorporateActionRate81.mmObject(), EventInformation9.mmObject(), CorporateActionEventAndBalance11.mmObject(), CorporateActionEventType53Choice.mmObject(), CorporateActionEventType56Choice.mmObject());
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

	public void setType(CorporateActionEventTypeV3Code type) {
		this.type = type;
	}

	public CorporateActionMandatoryVoluntaryCode getMandatoryVoluntaryEventType() {
		return mandatoryVoluntaryEventType;
	}

	public void setMandatoryVoluntaryEventType(CorporateActionMandatoryVoluntaryCode mandatoryVoluntaryEventType) {
		this.mandatoryVoluntaryEventType = mandatoryVoluntaryEventType;
	}

	public Security getUnderlyingSecurity() {
		return underlyingSecurity;
	}

	public void setUnderlyingSecurity(com.tools20022.repository.entity.Security underlyingSecurity) {
		this.underlyingSecurity = underlyingSecurity;
	}

	public List<CorporateActionPrice> getCorporateActionPrice() {
		return corporateActionPrice;
	}

	public void setCorporateActionPrice(List<com.tools20022.repository.entity.CorporateActionPrice> corporateActionPrice) {
		this.corporateActionPrice = corporateActionPrice;
	}

	public List<CurrencyExchange> getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(List<com.tools20022.repository.entity.CurrencyExchange> exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public Max350Text getRegistrationDetails() {
		return registrationDetails;
	}

	public void setRegistrationDetails(Max350Text registrationDetails) {
		this.registrationDetails = registrationDetails;
	}

	public Max350Text getBasketOrIndexInformation() {
		return basketOrIndexInformation;
	}

	public void setBasketOrIndexInformation(Max350Text basketOrIndexInformation) {
		this.basketOrIndexInformation = basketOrIndexInformation;
	}

	public Deadline getDeadline() {
		return deadline;
	}

	public void setDeadline(com.tools20022.repository.entity.Deadline deadline) {
		this.deadline = deadline;
	}

	public AdditionalBusinessProcessCode getAdditionalBusinessProcess() {
		return additionalBusinessProcess;
	}

	public void setAdditionalBusinessProcess(AdditionalBusinessProcessCode additionalBusinessProcess) {
		this.additionalBusinessProcess = additionalBusinessProcess;
	}

	public ISODateTime getTradingDate() {
		return tradingDate;
	}

	public void setTradingDate(ISODateTime tradingDate) {
		this.tradingDate = tradingDate;
	}

	public CorporateActionFeesAndCharges getCorporateActionCharge() {
		return corporateActionCharge;
	}

	public void setCorporateActionCharge(com.tools20022.repository.entity.CorporateActionFeesAndCharges corporateActionCharge) {
		this.corporateActionCharge = corporateActionCharge;
	}

	public ISODateTime getPariPassuDate() {
		return pariPassuDate;
	}

	public void setPariPassuDate(ISODateTime pariPassuDate) {
		this.pariPassuDate = pariPassuDate;
	}

	public Max350Text getInformationConditions() {
		return informationConditions;
	}

	public void setInformationConditions(Max350Text informationConditions) {
		this.informationConditions = informationConditions;
	}

	public List<SecuritiesQuantity> getFractionalQuantity() {
		return fractionalQuantity;
	}

	public void setFractionalQuantity(List<com.tools20022.repository.entity.SecuritiesQuantity> fractionalQuantity) {
		this.fractionalQuantity = fractionalQuantity;
	}

	public CorporateActionEventProcessingTypeCode getEventProcessingType() {
		return eventProcessingType;
	}

	public void setEventProcessingType(CorporateActionEventProcessingTypeCode eventProcessingType) {
		this.eventProcessingType = eventProcessingType;
	}

	public List<CorporateActionStatus> getCorporateActionStatus() {
		return corporateActionStatus;
	}

	public void setCorporateActionStatus(List<com.tools20022.repository.entity.CorporateActionStatus> corporateActionStatus) {
		this.corporateActionStatus = corporateActionStatus;
	}

	public ISODateTime getAnnouncementDate() {
		return announcementDate;
	}

	public void setAnnouncementDate(ISODateTime announcementDate) {
		this.announcementDate = announcementDate;
	}

	public ISODateTime getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(ISODateTime effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public ISODateTime getFurtherDetailsAnnouncementDate() {
		return furtherDetailsAnnouncementDate;
	}

	public void setFurtherDetailsAnnouncementDate(ISODateTime furtherDetailsAnnouncementDate) {
		this.furtherDetailsAnnouncementDate = furtherDetailsAnnouncementDate;
	}

	public ISODateTime getMarginFixingDate() {
		return marginFixingDate;
	}

	public void setMarginFixingDate(ISODateTime marginFixingDate) {
		this.marginFixingDate = marginFixingDate;
	}

	public ISODate getResultPublicationDate() {
		return resultPublicationDate;
	}

	public void setResultPublicationDate(ISODate resultPublicationDate) {
		this.resultPublicationDate = resultPublicationDate;
	}

	public ISODateTime getUnconditionalDate() {
		return unconditionalDate;
	}

	public void setUnconditionalDate(ISODateTime unconditionalDate) {
		this.unconditionalDate = unconditionalDate;
	}

	public ISODateTime getWhollyUnconditionalDate() {
		return whollyUnconditionalDate;
	}

	public void setWhollyUnconditionalDate(ISODateTime whollyUnconditionalDate) {
		this.whollyUnconditionalDate = whollyUnconditionalDate;
	}

	public ISODateTime getLapsedDate() {
		return lapsedDate;
	}

	public void setLapsedDate(ISODateTime lapsedDate) {
		this.lapsedDate = lapsedDate;
	}

	public DateTimePeriod getBookClosurePeriod() {
		return bookClosurePeriod;
	}

	public void setBookClosurePeriod(com.tools20022.repository.entity.DateTimePeriod bookClosurePeriod) {
		this.bookClosurePeriod = bookClosurePeriod;
	}

	public List<SecuritiesQuantity> getSecuritiesQuantity() {
		return securitiesQuantity;
	}

	public void setSecuritiesQuantity(List<com.tools20022.repository.entity.SecuritiesQuantity> securitiesQuantity) {
		this.securitiesQuantity = securitiesQuantity;
	}

	public YesNoIndicator getRestrictionIndicator() {
		return restrictionIndicator;
	}

	public void setRestrictionIndicator(YesNoIndicator restrictionIndicator) {
		this.restrictionIndicator = restrictionIndicator;
	}

	public CorporateActionEventStageCode getEventStage() {
		return eventStage;
	}

	public void setEventStage(CorporateActionEventStageCode eventStage) {
		this.eventStage = eventStage;
	}

	public List<ContactPoint> getDocumentationLocation() {
		return documentationLocation;
	}

	public void setDocumentationLocation(List<com.tools20022.repository.entity.ContactPoint> documentationLocation) {
		this.documentationLocation = documentationLocation;
	}

	public SecuritiesQuantity getSecuritiesQuantitySought() {
		return securitiesQuantitySought;
	}

	public void setSecuritiesQuantitySought(com.tools20022.repository.entity.SecuritiesQuantity securitiesQuantitySought) {
		this.securitiesQuantitySought = securitiesQuantitySought;
	}

	public YesNoIndicator getPartialElectionIndicator() {
		return partialElectionIndicator;
	}

	public void setPartialElectionIndicator(YesNoIndicator partialElectionIndicator) {
		this.partialElectionIndicator = partialElectionIndicator;
	}

	public CorporateActionPartyRole getCorporateActionPartyRole() {
		return corporateActionPartyRole;
	}

	public void setCorporateActionPartyRole(com.tools20022.repository.entity.CorporateActionPartyRole corporateActionPartyRole) {
		this.corporateActionPartyRole = corporateActionPartyRole;
	}

	public List<MarketClaim> getMarketClaim() {
		return marketClaim;
	}

	public void setMarketClaim(List<com.tools20022.repository.entity.MarketClaim> marketClaim) {
		this.marketClaim = marketClaim;
	}

	public BiddingConditions getBiddingConditions() {
		return biddingConditions;
	}

	public void setBiddingConditions(com.tools20022.repository.entity.BiddingConditions biddingConditions) {
		this.biddingConditions = biddingConditions;
	}

	public List<ClassAction> getRelatedClassAction() {
		return relatedClassAction;
	}

	public void setRelatedClassAction(List<com.tools20022.repository.entity.ClassAction> relatedClassAction) {
		this.relatedClassAction = relatedClassAction;
	}

	public List<CorporateActionEventRegistration> getCorporateActionEventRegistration() {
		return corporateActionEventRegistration;
	}

	public void setCorporateActionEventRegistration(List<com.tools20022.repository.entity.CorporateActionEventRegistration> corporateActionEventRegistration) {
		this.corporateActionEventRegistration = corporateActionEventRegistration;
	}

	public SuspensionPeriod getSuspensionPeriod() {
		return suspensionPeriod;
	}

	public void setSuspensionPeriod(com.tools20022.repository.entity.SuspensionPeriod suspensionPeriod) {
		this.suspensionPeriod = suspensionPeriod;
	}

	public Lottery getLottery() {
		return lottery;
	}

	public void setLottery(com.tools20022.repository.entity.Lottery lottery) {
		this.lottery = lottery;
	}

	public RemarketingMarginTypeCode getMarginType() {
		return marginType;
	}

	public void setMarginType(RemarketingMarginTypeCode marginType) {
		this.marginType = marginType;
	}

	public List<Meeting> getRelatedMeeting() {
		return relatedMeeting;
	}

	public void setRelatedMeeting(List<com.tools20022.repository.entity.Meeting> relatedMeeting) {
		this.relatedMeeting = relatedMeeting;
	}

	public List<CorporateActionServicing> getServices() {
		return services;
	}

	public void setServices(List<com.tools20022.repository.entity.CorporateActionServicing> services) {
		this.services = services;
	}

	public List<Issuance> getIssuance() {
		return issuance;
	}

	public void setIssuance(List<com.tools20022.repository.entity.Issuance> issuance) {
		this.issuance = issuance;
	}

	public List<SecuritiesModification> getSecuritiesModification() {
		return securitiesModification;
	}

	public void setSecuritiesModification(List<com.tools20022.repository.entity.SecuritiesModification> securitiesModification) {
		this.securitiesModification = securitiesModification;
	}

	public DateTimePeriod getTradingPeriod() {
		return tradingPeriod;
	}

	public void setTradingPeriod(com.tools20022.repository.entity.DateTimePeriod tradingPeriod) {
		this.tradingPeriod = tradingPeriod;
	}

	public Tax getTransactionTax() {
		return transactionTax;
	}

	public void setTransactionTax(com.tools20022.repository.entity.Tax transactionTax) {
		this.transactionTax = transactionTax;
	}

	public ConsentTypeCode getConsentType() {
		return consentType;
	}

	public void setConsentType(ConsentTypeCode consentType) {
		this.consentType = consentType;
	}

	public ProceedsDefinition getProceedsDefinition() {
		return proceedsDefinition;
	}

	public void setProceedsDefinition(com.tools20022.repository.entity.ProceedsDefinition proceedsDefinition) {
		this.proceedsDefinition = proceedsDefinition;
	}
}