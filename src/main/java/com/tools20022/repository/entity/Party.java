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
import com.tools20022.repository.codeset.MoneyLaunderingCheckCode;
import com.tools20022.repository.entity.RolePlayer;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Entity involved in an activity.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Party" src="doc-files/Party.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.RolePlayer
 * RolePlayer}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmContactPoint
 * Party.mmContactPoint}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmIdentification
 * Party.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Party#mmMoneyLaunderingCheck
 * Party.mmMoneyLaunderingCheck}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmTaxationConditions
 * Party.mmTaxationConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmDomicile
 * Party.mmDomicile}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmResidence
 * Party.mmResidence}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmPowerOfAttorney
 * Party.mmPowerOfAttorney}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmLocation
 * Party.mmLocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmCloseLinkSecurity
 * Party.mmCloseLinkSecurity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmCloseLink
 * Security.mmCloseLink}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedParty
 * ContactPoint.mmRelatedParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmIdentifiedParty
 * PartyIdentificationInformation.mmIdentifiedParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmDomiciledParty
 * Location.mmDomiciledParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmParty
 * Location.mmParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmTaxableParty
 * Location.mmTaxableParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxableParty
 * Tax.mmTaxableParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#mmAuthorisedParty
 * PowerOfAttorney.mmAuthorisedParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Report5#mmNonClearingMember
 * Report5.mmNonClearingMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmParty
 * InvestmentAccountOwnershipInformation15.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmParty
 * InvestmentAccountOwnershipInformation14.mmParty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person Person}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.TradingPartyCapacity1Choice
 * TradingPartyCapacity1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TradingPartyCapacity2Choice
 * TradingPartyCapacity2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Counterparty9Choice
 * Counterparty9Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount108
 * PartyIdentificationAndAccount108}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount109
 * PartyIdentificationAndAccount109}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CountryAndResidentialStatusType2
 * CountryAndResidentialStatusType2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount125
 * PartyIdentificationAndAccount125}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party33Choice Party33Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.choice.Party32Choice Party32Choice}
 * </li>
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
 * "Party"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Entity involved in an activity."</li>
 * </ul>
 */
public class Party extends RolePlayer {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.ContactPoint> contactPoint;
	/**
	 * Number, physical or virtual address, used for communication.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedParty
	 * ContactPoint.mmRelatedParty}</li>
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
	 * {@linkplain com.tools20022.repository.msg.LocalMarketAnnex2#mmLocalOrderDesk
	 * LocalMarketAnnex2.mmLocalOrderDesk}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1#mmFundManagementCompany
	 * FundProcessingPassport1.mmFundManagementCompany}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation1#mmPartyContactDetails
	 * PartyTextInformation1.mmPartyContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation2#mmPartyContactDetails
	 * PartyTextInformation2.mmPartyContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation5#mmPartyContactDetails
	 * PartyTextInformation5.mmPartyContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification42#mmContactDetails
	 * PartyIdentification42.mmContactDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactPoint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number, physical or virtual address, used for communication."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmContactPoint = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(LocalMarketAnnex2.mmLocalOrderDesk, FundProcessingPassport1.mmFundManagementCompany, PartyTextInformation1.mmPartyContactDetails, PartyTextInformation2.mmPartyContactDetails,
					PartyTextInformation5.mmPartyContactDetails, PartyIdentification42.mmContactDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ContactPoint";
			definition = "Number, physical or virtual address, used for communication.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmRelatedParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PartyIdentificationInformation> identification;
	/**
	 * Specific identification assigned to a party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmIdentifiedParty
	 * PartyIdentificationInformation.mmIdentifiedParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference2#mmReferenceIssuer
	 * AdditionalReference2.mmReferenceIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3#mmReferenceIssuer
	 * AdditionalReference3.mmReferenceIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundParameters4#mmFundManagementCompany
	 * FundParameters4.mmFundManagementCompany}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cheque4#mmPayeeIdentification
	 * Cheque4.mmPayeeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation4#mmFundManagementCompany
	 * PriceValuation4.mmFundManagementCompany}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account7#mmAccountServicer
	 * Account7.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary11#mmIdentification
	 * Intermediary11.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveryParameters4#mmNameAndAddress
	 * DeliveryParameters4.mmNameAndAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceAsCodeAndPartyIdentification#mmParty
	 * SafekeepingPlaceAsCodeAndPartyIdentification.mmParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount2#mmAccountOwner
	 * SafekeepingAccount2.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount2#mmAccountServicer
	 * SafekeepingAccount2.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms6#mmQuotingInstitution
	 * ForeignExchangeTerms6.mmQuotingInstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BasicCollateralValuation1Details#mmHaircutSource
	 * BasicCollateralValuation1Details.mmHaircutSource}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherParties18#mmInvestor
	 * OtherParties18.mmInvestor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherParties18#mmStockExchange
	 * OtherParties18.mmStockExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherParties18#mmTradeRegulator
	 * OtherParties18.mmTradeRegulator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherParties18#mmTripartyAgent
	 * OtherParties18.mmTripartyAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherParties18#mmQualifiedForeignIntermediary
	 * OtherParties18.mmQualifiedForeignIntermediary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Clearing3#mmClearingMember
	 * Clearing3.mmClearingMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Clearing3#mmClearingSegment
	 * Clearing3.mmClearingSegment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails4#mmIdentification
	 * ConfirmationPartyDetails4.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails4#mmAlternateIdentification
	 * ConfirmationPartyDetails4.mmAlternateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails4#mmAdditionalInformation
	 * ConfirmationPartyDetails4.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails2#mmIdentification
	 * ConfirmationPartyDetails2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails2#mmAlternateIdentification
	 * ConfirmationPartyDetails2.mmAlternateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails2#mmAdditionalInformation
	 * ConfirmationPartyDetails2.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails3#mmIdentification
	 * ConfirmationPartyDetails3.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails3#mmAlternateIdentification
	 * ConfirmationPartyDetails3.mmAlternateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails3#mmAdditionalInformation
	 * ConfirmationPartyDetails3.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission16#mmRecipientIdentification
	 * Commission16.mmRecipientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails1#mmIdentification
	 * ConfirmationPartyDetails1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails1#mmAlternateIdentification
	 * ConfirmationPartyDetails1.mmAlternateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails1#mmAdditionalInformation
	 * ConfirmationPartyDetails1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails6#mmIdentification
	 * ConfirmationPartyDetails6.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails6#mmAlternateIdentification
	 * ConfirmationPartyDetails6.mmAlternateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails6#mmAdditionalInformation
	 * ConfirmationPartyDetails6.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4#mmInvestor
	 * ConfirmationParties4.mmInvestor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementParties23#mmDepository
	 * SettlementParties23.mmDepository}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementParties23#mmParty1
	 * SettlementParties23.mmParty1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementParties23#mmParty2
	 * SettlementParties23.mmParty2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementParties23#mmParty3
	 * SettlementParties23.mmParty3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementParties23#mmParty4
	 * SettlementParties23.mmParty4}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementParties23#mmParty5
	 * SettlementParties23.mmParty5}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails5#mmIdentification
	 * ConfirmationPartyDetails5.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails5#mmAlternateIdentification
	 * ConfirmationPartyDetails5.mmAlternateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails5#mmAdditionalInformation
	 * ConfirmationPartyDetails5.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction9#mmVendor
	 * StandingSettlementInstruction9.mmVendor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashParties18#mmDebtor
	 * CashParties18.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashParties18#mmDebtorAgent
	 * CashParties18.mmDebtorAgent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashParties18#mmCreditor
	 * CashParties18.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashParties18#mmCreditorAgent
	 * CashParties18.mmCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashParties18#mmIntermediary
	 * CashParties18.mmIntermediary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AttendanceCard2#mmOtherAddress
	 * AttendanceCard2.mmOtherAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation2#mmAgentIdentification
	 * CorporateActionInformation2.mmAgentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative1#mmOfferor
	 * CorporateActionNarrative1.mmOfferor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAgent1#mmAgentIdentification
	 * CorporateActionAgent1.mmAgentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAgent1#mmContactPerson
	 * CorporateActionAgent1.mmContactPerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactPerson1#mmInstitutionIdentification
	 * ContactPerson1.mmInstitutionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1#mmAgentIdentification
	 * CorporateActionInformation1.mmAgentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount7#mmAccountOwnerIdentification
	 * SecuritiesAccount7.mmAccountOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount19#mmAccountOwnerIdentification
	 * CashAccount19.mmAccountOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount9#mmAccountOwnerIdentification
	 * SecuritiesAccount9.mmAccountOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmBeneficialOwnerIdentification
	 * BeneficialOwner1.mmBeneficialOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProceedsDelivery1#mmAccountOwnerIdentification
	 * ProceedsDelivery1.mmAccountOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProceedsDelivery1#mmAccountServicerIdentification
	 * ProceedsDelivery1.mmAccountServicerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1#mmReceiverIdentification
	 * CorporateActionAdditionalInformation1.mmReceiverIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Entitlement1#mmAccountOwnerIdentification
	 * Entitlement1.mmAccountOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount12#mmAccountOwnerIdentification
	 * SecuritiesAccount12.mmAccountOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount18#mmAccountOwnerIdentification
	 * CashAccount18.mmAccountOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovement1#mmAccountOwnerIdentification
	 * CorporateActionMovement1.mmAccountOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount8#mmAccountOwnerIdentification
	 * SecuritiesAccount8.mmAccountOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount10#mmAccountOwnerIdentification
	 * SecuritiesAccount10.mmAccountOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementFailedStatus1#mmAccountOwnerIdentification
	 * CorporateActionMovementFailedStatus1.mmAccountOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount17#mmAccountOwnerIdentification
	 * CashAccount17.mmAccountOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount6#mmAccountOwnerIdentification
	 * SecuritiesAccount6.mmAccountOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount6#mmSafekeepingPlace
	 * SecuritiesAccount6.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCompensation1#mmDepository
	 * SecuritiesCompensation1.mmDepository}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount7#mmDepository
	 * DeliveringPartiesAndAccount7.mmDepository}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount7#mmParty1
	 * DeliveringPartiesAndAccount7.mmParty1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount7#mmParty2
	 * DeliveringPartiesAndAccount7.mmParty2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount7#mmDepository
	 * ReceivingPartiesAndAccount7.mmDepository}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Settlement1#mmDepository
	 * Settlement1.mmDepository}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarginReport2#mmNonClearingMember
	 * MarginReport2.mmNonClearingMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Contribution1#mmNonClearingMember
	 * Contribution1.mmNonClearingMember}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashParties24#mmCreditor
	 * CashParties24.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashParties24#mmCreditorAgent
	 * CashParties24.mmCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashParties24#mmIntermediary
	 * CashParties24.mmIntermediary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashParties24#mmIntermediary2
	 * CashParties24.mmIntermediary2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount43#mmAccountServicer
	 * InvestmentAccount43.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary27#mmIdentification
	 * Intermediary27.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount42#mmOwnerIdentification
	 * InvestmentAccount42.mmOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount42#mmAccountServicer
	 * InvestmentAccount42.mmAccountServicer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradingParty
	 * TradeLeg8.mmTradingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary29#mmIdentification
	 * Intermediary29.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#mmBeneficialOwnerIdentification
	 * BeneficialOwner2.mmBeneficialOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLegStatement3#mmClearingSegment
	 * TradeLegStatement3.mmClearingSegment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLegStatement3#mmNonClearingMember
	 * TradeLegStatement3.mmNonClearingMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation7#mmClearingSegment
	 * SettlementObligation7.mmClearingSegment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation7#mmNonClearingMember
	 * SettlementObligation7.mmNonClearingMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation7#mmDepository
	 * SettlementObligation7.mmDepository}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition3#mmNonClearingMember
	 * NetPosition3.mmNonClearingMember}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NetPosition3#mmDepository
	 * NetPosition3.mmDepository}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg10#mmTradingParty
	 * TradeLeg10.mmTradingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmNonClearingMember
	 * TradeLeg9.mmNonClearingMember}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmTradingParty
	 * TradeLeg9.mmTradingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus10#mmAccountOwner
	 * DetailedInstructionStatus10.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus10#mmRightsHolder
	 * DetailedInstructionStatus10.mmRightsHolder}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount6#mmAccountOwner
	 * SafekeepingAccount6.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount6#mmRightsHolder
	 * SafekeepingAccount6.mmRightsHolder}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IssuerAgent2#mmIdentification
	 * IssuerAgent2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.VoteInstructionForMeetingResolution2Choice#mmShareholder
	 * VoteInstructionForMeetingResolution2Choice.mmShareholder}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingContactPerson2#mmEmployingParty
	 * MeetingContactPerson2.mmEmployingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition5#mmAccountOwner
	 * EligiblePosition5.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition5#mmRightsHolder
	 * EligiblePosition5.mmRightsHolder}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition6#mmAccountOwner
	 * EligiblePosition6.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition6#mmRightsHolder
	 * EligiblePosition6.mmRightsHolder}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Clearing4#mmClearingSegment
	 * Clearing4.mmClearingSegment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount11#mmDepository
	 * ReceivingPartiesAndAccount11.mmDepository}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade3#mmTradeCounterpartyMemberIdentification
	 * NonGuaranteedTrade3.mmTradeCounterpartyMemberIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade3#mmTradeCounterpartyClearingMemberIdentification
	 * NonGuaranteedTrade3.mmTradeCounterpartyClearingMemberIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount11#mmDepository
	 * DeliveringPartiesAndAccount11.mmDepository}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount11#mmParty1
	 * DeliveringPartiesAndAccount11.mmParty1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount11#mmParty2
	 * DeliveringPartiesAndAccount11.mmParty2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference6#mmReferenceIssuer
	 * AdditionalReference6.mmReferenceIssuer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherParties27#mmInvestor
	 * OtherParties27.mmInvestor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherParties27#mmQualifiedForeignIntermediary
	 * OtherParties27.mmQualifiedForeignIntermediary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherParties27#mmStockExchange
	 * OtherParties27.mmStockExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherParties27#mmTradeRegulator
	 * OtherParties27.mmTradeRegulator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherParties27#mmTripartyAgent
	 * OtherParties27.mmTripartyAgent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherParties27#mmBroker
	 * OtherParties27.mmBroker}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementParties36#mmDepository
	 * SettlementParties36.mmDepository}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementParties36#mmParty1
	 * SettlementParties36.mmParty1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementParties36#mmParty2
	 * SettlementParties36.mmParty2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementParties36#mmParty3
	 * SettlementParties36.mmParty3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementParties36#mmParty4
	 * SettlementParties36.mmParty4}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementParties36#mmParty5
	 * SettlementParties36.mmParty5}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction11#mmVendor
	 * StandingSettlementInstruction11.mmVendor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount39#mmAccountOwner
	 * QuantityAndAccount39.mmAccountOwner}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashParties26#mmDebtor
	 * CashParties26.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashParties26#mmDebtorAgent
	 * CashParties26.mmDebtorAgent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashParties26#mmCreditor
	 * CashParties26.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashParties26#mmCreditorAgent
	 * CashParties26.mmCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashParties26#mmIntermediary
	 * CashParties26.mmIntermediary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification42#mmAccountOwner
	 * SubAccountIdentification42.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary32#mmIdentification
	 * Intermediary32.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#mmAccountOwner
	 * QuantityAndAccount41.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount40#mmAccountOwner
	 * QuantityAndAccount40.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails81#mmInvestor
	 * TransactionDetails81.mmInvestor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashParties25#mmDebtor
	 * CashParties25.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashParties25#mmDebtorAgent
	 * CashParties25.mmDebtorAgent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashParties25#mmCreditor
	 * CashParties25.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashParties25#mmCreditorAgent
	 * CashParties25.mmCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount42#mmAccountOwner
	 * QuantityAndAccount42.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails74#mmInvestor
	 * TransactionDetails74.mmInvestor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails82#mmInvestor
	 * TransactionDetails82.mmInvestor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails76#mmAccountOwner
	 * TransactionDetails76.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount38#mmAccountOwner
	 * QuantityAndAccount38.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification43#mmAccountOwner
	 * SubAccountIdentification43.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails80#mmAccountOwner
	 * TransactionDetails80.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails80#mmInvestor
	 * TransactionDetails80.mmInvestor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Counterparty9Choice#mmSeller
	 * Counterparty9Choice.mmSeller}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Counterparty9Choice#mmBuyer
	 * Counterparty9Choice.mmBuyer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms22#mmQuotingInstitution
	 * ForeignExchangeTerms22.mmQuotingInstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementParties39#mmParty2
	 * SettlementParties39.mmParty2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementParties39#mmParty3
	 * SettlementParties39.mmParty3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementParties39#mmParty4
	 * SettlementParties39.mmParty4}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementParties39#mmParty5
	 * SettlementParties39.mmParty5}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementParties40#mmDepository
	 * SettlementParties40.mmDepository}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementParties40#mmParty1
	 * SettlementParties40.mmParty1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementParties40#mmParty2
	 * SettlementParties40.mmParty2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementParties40#mmParty3
	 * SettlementParties40.mmParty3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementParties40#mmParty4
	 * SettlementParties40.mmParty4}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementParties40#mmParty5
	 * SettlementParties40.mmParty5}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount43#mmAccountOwner
	 * QuantityAndAccount43.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount108#mmIdentification
	 * PartyIdentificationAndAccount108.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount108#mmAlternateIdentification
	 * PartyIdentificationAndAccount108.mmAlternateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount109#mmIdentification
	 * PartyIdentificationAndAccount109.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount109#mmAlternateIdentification
	 * PartyIdentificationAndAccount109.mmAlternateIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherParties26#mmInvestor
	 * OtherParties26.mmInvestor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherParties26#mmStockExchange
	 * OtherParties26.mmStockExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherParties26#mmTradeRegulator
	 * OtherParties26.mmTradeRegulator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Account18#mmAccountServicer
	 * Account18.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Linkages36#mmReferenceOwner
	 * Linkages36.mmReferenceOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Linkages37#mmReferenceOwner
	 * Linkages37.mmReferenceOwner}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherParties28#mmInvestor
	 * OtherParties28.mmInvestor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherParties28#mmQualifiedForeignIntermediary
	 * OtherParties28.mmQualifiedForeignIntermediary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherParties28#mmStockExchange
	 * OtherParties28.mmStockExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherParties28#mmTradeRegulator
	 * OtherParties28.mmTradeRegulator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherParties28#mmTripartyAgent
	 * OtherParties28.mmTripartyAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount44#mmAccountOwner
	 * QuantityAndAccount44.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance34#mmAccountOwner
	 * AccountAndBalance34.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance35#mmAccountOwner
	 * AccountAndBalance35.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption116#mmAccountOwner
	 * CorporateActionOption116.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification31#mmAccountOwner
	 * AccountIdentification31.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementParties42#mmDepository
	 * SettlementParties42.mmDepository}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementParties42#mmParty1
	 * SettlementParties42.mmParty1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementParties42#mmParty2
	 * SettlementParties42.mmParty2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementParties42#mmParty3
	 * SettlementParties42.mmParty3}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashParties28#mmCreditor
	 * CashParties28.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashParties28#mmCreditorAgent
	 * CashParties28.mmCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashParties28#mmMarketClaimCounterparty
	 * CashParties28.mmMarketClaimCounterparty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance33#mmAccountOwner
	 * AccountAndBalance33.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification32#mmAccountOwner
	 * AccountIdentification32.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative26#mmOfferor
	 * CorporateActionNarrative26.mmOfferor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation21#mmIdentification
	 * Organisation21.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary36#mmIdentification
	 * Intermediary36.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary34#mmIdentification
	 * Intermediary34.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount54#mmOwnerIdentification
	 * InvestmentAccount54.mmOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount54#mmAccountServicer
	 * InvestmentAccount54.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#mmReceivingAgentDetails
	 * Transfer31.mmReceivingAgentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#mmDeliveringAgentDetails
	 * Transfer31.mmDeliveringAgentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmReceivingAgentDetails
	 * Transfer30.mmReceivingAgentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmDeliveringAgentDetails
	 * Transfer30.mmDeliveringAgentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount56#mmOwnerIdentification
	 * InvestmentAccount56.mmOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount56#mmAccountServicer
	 * InvestmentAccount56.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer32#mmReceivingAgentDetails
	 * Transfer32.mmReceivingAgentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer32#mmDeliveringAgentDetails
	 * Transfer32.mmDeliveringAgentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference7#mmReferenceIssuer
	 * AdditionalReference7.mmReferenceIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason3#mmStatusInitiator
	 * CancellationStatusAndReason3.mmStatusInitiator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#mmReceivingAgentDetails
	 * Transfer33.mmReceivingAgentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#mmDeliveringAgentDetails
	 * Transfer33.mmDeliveringAgentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason4#mmStatusInitiator
	 * TransferStatusAndReason4.mmStatusInitiator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount14#mmDeliverersCustodianDetails
	 * DeliveringPartiesAndAccount14.mmDeliverersCustodianDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount14#mmDeliverersIntermediary1Details
	 * DeliveringPartiesAndAccount14.mmDeliverersIntermediary1Details}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount14#mmDeliverersIntermediary2Details
	 * DeliveringPartiesAndAccount14.mmDeliverersIntermediary2Details}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount14#mmDeliveringAgentDetails
	 * DeliveringPartiesAndAccount14.mmDeliveringAgentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount14#mmPlaceOfSettlementDetails
	 * DeliveringPartiesAndAccount14.mmPlaceOfSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount13#mmDeliverersCustodianDetails
	 * DeliveringPartiesAndAccount13.mmDeliverersCustodianDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount13#mmDeliverersIntermediary1Details
	 * DeliveringPartiesAndAccount13.mmDeliverersIntermediary1Details}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount13#mmDeliverersIntermediary2Details
	 * DeliveringPartiesAndAccount13.mmDeliverersIntermediary2Details}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount13#mmDeliveringAgentDetails
	 * DeliveringPartiesAndAccount13.mmDeliveringAgentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount13#mmPlaceOfSettlementDetails
	 * DeliveringPartiesAndAccount13.mmPlaceOfSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount14#mmReceiversCustodianDetails
	 * ReceivingPartiesAndAccount14.mmReceiversCustodianDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount14#mmReceiversIntermediary1Details
	 * ReceivingPartiesAndAccount14.mmReceiversIntermediary1Details}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount14#mmReceiversIntermediary2Details
	 * ReceivingPartiesAndAccount14.mmReceiversIntermediary2Details}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount14#mmReceivingAgentDetails
	 * ReceivingPartiesAndAccount14.mmReceivingAgentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount14#mmPlaceOfSettlementDetails
	 * ReceivingPartiesAndAccount14.mmPlaceOfSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55#mmOwnerIdentification
	 * InvestmentAccount55.mmOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55#mmAccountServicer
	 * InvestmentAccount55.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms26#mmQuotingInstitution
	 * ForeignExchangeTerms26.mmQuotingInstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Tax28#mmRecipientIdentification
	 * Tax28.mmRecipientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission23#mmRecipientIdentification
	 * Commission23.mmRecipientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Charge29#mmRecipientIdentification
	 * Charge29.mmRecipientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13#mmReceiversCustodianDetails
	 * ReceivingPartiesAndAccount13.mmReceiversCustodianDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13#mmReceiversIntermediary1Details
	 * ReceivingPartiesAndAccount13.mmReceiversIntermediary1Details}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13#mmReceiversIntermediary2Details
	 * ReceivingPartiesAndAccount13.mmReceiversIntermediary2Details}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13#mmReceivingAgentDetails
	 * ReceivingPartiesAndAccount13.mmReceivingAgentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13#mmPlaceOfSettlementDetails
	 * ReceivingPartiesAndAccount13.mmPlaceOfSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmDebtor
	 * DirectDebitMandate5.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmCreditor
	 * DirectDebitMandate5.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount53#mmAccountServicer
	 * InvestmentAccount53.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary33#mmIdentification
	 * Intermediary33.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount125#mmPartyIdentification
	 * PartyIdentificationAndAccount125.mmPartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount125#mmPlaceOfSettlement
	 * PartyIdentificationAndAccount125.mmPlaceOfSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Account20#mmAccountServicer
	 * Account20.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary35#mmIdentification
	 * Intermediary35.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard18#mmCardIssuerIdentification
	 * PaymentCard18.mmCardIssuerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount33#mmAccountOwner
	 * CashAccount33.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount33#mmAccountServicer
	 * CashAccount33.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument48#mmDeliveringAgentDetails
	 * FinancialInstrument48.mmDeliveringAgentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#mmOwnerIdentification
	 * InvestmentAccount57.mmOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#mmAccountServicer
	 * InvestmentAccount57.mmAccountServicer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer24#mmTransferee
	 * ISATransfer24.mmTransferee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47#mmDeliveringAgentDetails
	 * FinancialInstrument47.mmDeliveringAgentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#mmDeliveringAgentDetails
	 * FinancialInstrument46.mmDeliveringAgentDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Obligation4#mmPartyA
	 * Obligation4.mmPartyA}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Obligation4#mmServicingPartyA
	 * Obligation4.mmServicingPartyA}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Obligation4#mmPartyB
	 * Obligation4.mmPartyB}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Obligation4#mmServicingPartyB
	 * Obligation4.mmServicingPartyB}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral7#mmIssuer
	 * OtherCollateral7.mmIssuer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral6#mmIssuer
	 * OtherCollateral6.mmIssuer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral5#mmIssuer
	 * OtherCollateral5.mmIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount15#mmDepository
	 * ReceivingPartiesAndAccount15.mmDepository}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount15#mmDepository
	 * DeliveringPartiesAndAccount15.mmDepository}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount15#mmParty1
	 * DeliveringPartiesAndAccount15.mmParty1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount15#mmParty2
	 * DeliveringPartiesAndAccount15.mmParty2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmAccountServicer
	 * InvestmentAccount61.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#mmStatusInitiator
	 * IndividualOrderConfirmationStatusAndReason2.mmStatusInitiator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference8#mmReferenceIssuer
	 * AdditionalReference8.mmReferenceIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount7#mmAccountOwner
	 * SafekeepingAccount7.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmAccountServicer
	 * InvestmentAccount63.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmAccountServicer
	 * InvestmentAccount62.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15#mmAccountOwner
	 * AccountSubLevel15.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15#mmAccountServicer
	 * AccountSubLevel15.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel16#mmAccountOwner
	 * AccountSubLevel16.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel16#mmAccountServicer
	 * AccountSubLevel16.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount58#mmOwnerIdentification
	 * InvestmentAccount58.mmOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount58#mmAccountServicer
	 * InvestmentAccount58.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18#mmAccountOwner
	 * AccountSubLevel18.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18#mmAccountServicer
	 * AccountSubLevel18.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel19#mmAccountOwner
	 * AccountSubLevel19.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel19#mmAccountServicer
	 * AccountSubLevel19.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#mmStatusInitiator
	 * IndividualOrderStatusAndReason7.mmStatusInitiator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmStatusInitiator
	 * SwitchOrderStatusAndReason2.mmStatusInitiator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason10#mmStatusInitiator
	 * OrderStatusAndReason10.mmStatusInitiator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cheque9#mmPayeeIdentification
	 * Cheque9.mmPayeeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cheque9#mmDrawerIdentification
	 * Cheque9.mmDrawerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11#mmSettlementDate
	 * FundSettlementParameters11.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11#mmSettlementPlace
	 * FundSettlementParameters11.mmSettlementPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11#mmSafekeepingPlace
	 * FundSettlementParameters11.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason9#mmStatusInitiator
	 * OrderStatusAndReason9.mmStatusInitiator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation30#mmIdentification
	 * Organisation30.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason8#mmStatusInitiator
	 * IndividualOrderStatusAndReason8.mmStatusInitiator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard25#mmCardIssuerIdentification
	 * PaymentCard25.mmCardIssuerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters12#mmSettlementDate
	 * FundSettlementParameters12.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters12#mmSettlementPlace
	 * FundSettlementParameters12.mmSettlementPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters12#mmSafekeepingPlace
	 * FundSettlementParameters12.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary39#mmIdentification
	 * Intermediary39.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms33#mmQuotingInstitution
	 * ForeignExchangeTerms33.mmQuotingInstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms32#mmQuotingInstitution
	 * ForeignExchangeTerms32.mmQuotingInstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel11#mmAccountOwner
	 * AccountSubLevel11.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel11#mmAccountServicer
	 * AccountSubLevel11.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel12#mmAccountOwner
	 * AccountSubLevel12.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel12#mmAccountServicer
	 * AccountSubLevel12.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount16#mmReceiversCustodianDetails
	 * ReceivingPartiesAndAccount16.mmReceiversCustodianDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount16#mmReceiversIntermediary1Details
	 * ReceivingPartiesAndAccount16.mmReceiversIntermediary1Details}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount16#mmReceiversIntermediary2Details
	 * ReceivingPartiesAndAccount16.mmReceiversIntermediary2Details}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount16#mmReceivingAgentDetails
	 * ReceivingPartiesAndAccount16.mmReceivingAgentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary40#mmIdentification
	 * Intermediary40.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fee2#mmRecipientIdentification
	 * Fee2.mmRecipientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fee1#mmRecipientIdentification
	 * Fee1.mmRecipientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount64#mmAccountServicer
	 * InvestmentAccount64.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation29#mmIdentification
	 * Organisation29.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel17#mmAccountOwner
	 * AccountSubLevel17.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel17#mmAccountServicer
	 * AccountSubLevel17.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount16#mmDeliverersCustodianDetails
	 * DeliveringPartiesAndAccount16.mmDeliverersCustodianDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount16#mmDeliverersIntermediary1Details
	 * DeliveringPartiesAndAccount16.mmDeliverersIntermediary1Details}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount16#mmDeliverersIntermediary2Details
	 * DeliveringPartiesAndAccount16.mmDeliverersIntermediary2Details}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount16#mmDeliveringAgentDetails
	 * DeliveringPartiesAndAccount16.mmDeliveringAgentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13#mmAccountOwner
	 * AccountSubLevel13.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13#mmAccountServicer
	 * AccountSubLevel13.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel14#mmAccountOwner
	 * AccountSubLevel14.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel14#mmAccountServicer
	 * AccountSubLevel14.mmAccountServicer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CreditTransfer8#mmDebtor
	 * CreditTransfer8.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer8#mmDebtorAgent
	 * CreditTransfer8.mmDebtorAgent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CreditTransfer8#mmCreditor
	 * CreditTransfer8.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Account22#mmAccountServicer
	 * Account22.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate6#mmDebtor
	 * DirectDebitMandate6.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate6#mmCreditor
	 * DirectDebitMandate6.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference9#mmReferenceIssuer
	 * AdditionalReference9.mmReferenceIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification40#mmAccountOwner
	 * AccountIdentification40.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification49#mmAccountOwner
	 * SubAccountIdentification49.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmAccountOwner
	 * TransactionDetails97.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmInvestor
	 * TransactionDetails97.mmInvestor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmQualifiedForeignIntermediary
	 * TransactionDetails97.mmQualifiedForeignIntermediary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails39#mmAccountOwner
	 * IntraPositionDetails39.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation13#mmInvestor
	 * AdditionalInformation13.mmInvestor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation13#mmDeliveringParty1
	 * AdditionalInformation13.mmDeliveringParty1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation13#mmReceivingParty1
	 * AdditionalInformation13.mmReceivingParty1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmAccountOwner
	 * SecuritiesFinancingTransactionDetails35.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmInvestor
	 * SecuritiesFinancingTransactionDetails35.mmInvestor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Obligation5#mmPartyA
	 * Obligation5.mmPartyA}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Obligation5#mmServicingPartyA
	 * Obligation5.mmServicingPartyA}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Obligation5#mmPartyB
	 * Obligation5.mmPartyB}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Obligation5#mmServicingPartyB
	 * Obligation5.mmServicingPartyB}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specific identification assigned to a party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AdditionalReference2.mmReferenceIssuer, AdditionalReference3.mmReferenceIssuer, FundParameters4.mmFundManagementCompany, Cheque4.mmPayeeIdentification,
					PriceValuation4.mmFundManagementCompany, Account7.mmAccountServicer, Intermediary11.mmIdentification, DeliveryParameters4.mmNameAndAddress, SafekeepingPlaceAsCodeAndPartyIdentification.mmParty,
					SafekeepingAccount2.mmAccountOwner, SafekeepingAccount2.mmAccountServicer, ForeignExchangeTerms6.mmQuotingInstitution, BasicCollateralValuation1Details.mmHaircutSource, OtherParties18.mmInvestor,
					OtherParties18.mmStockExchange, OtherParties18.mmTradeRegulator, OtherParties18.mmTripartyAgent, OtherParties18.mmQualifiedForeignIntermediary, Clearing3.mmClearingMember, Clearing3.mmClearingSegment,
					ConfirmationPartyDetails4.mmIdentification, ConfirmationPartyDetails4.mmAlternateIdentification, ConfirmationPartyDetails4.mmAdditionalInformation, ConfirmationPartyDetails2.mmIdentification,
					ConfirmationPartyDetails2.mmAlternateIdentification, ConfirmationPartyDetails2.mmAdditionalInformation, ConfirmationPartyDetails3.mmIdentification, ConfirmationPartyDetails3.mmAlternateIdentification,
					ConfirmationPartyDetails3.mmAdditionalInformation, Commission16.mmRecipientIdentification, ConfirmationPartyDetails1.mmIdentification, ConfirmationPartyDetails1.mmAlternateIdentification,
					ConfirmationPartyDetails1.mmAdditionalInformation, ConfirmationPartyDetails6.mmIdentification, ConfirmationPartyDetails6.mmAlternateIdentification, ConfirmationPartyDetails6.mmAdditionalInformation,
					ConfirmationParties4.mmInvestor, SettlementParties23.mmDepository, SettlementParties23.mmParty1, SettlementParties23.mmParty2, SettlementParties23.mmParty3, SettlementParties23.mmParty4, SettlementParties23.mmParty5,
					ConfirmationPartyDetails5.mmIdentification, ConfirmationPartyDetails5.mmAlternateIdentification, ConfirmationPartyDetails5.mmAdditionalInformation, StandingSettlementInstruction9.mmVendor, CashParties18.mmDebtor,
					CashParties18.mmDebtorAgent, CashParties18.mmCreditor, CashParties18.mmCreditorAgent, CashParties18.mmIntermediary, AttendanceCard2.mmOtherAddress, CorporateActionInformation2.mmAgentIdentification,
					CorporateActionNarrative1.mmOfferor, CorporateActionAgent1.mmAgentIdentification, CorporateActionAgent1.mmContactPerson, ContactPerson1.mmInstitutionIdentification, CorporateActionInformation1.mmAgentIdentification,
					SecuritiesAccount7.mmAccountOwnerIdentification, CashAccount19.mmAccountOwnerIdentification, SecuritiesAccount9.mmAccountOwnerIdentification, BeneficialOwner1.mmBeneficialOwnerIdentification,
					ProceedsDelivery1.mmAccountOwnerIdentification, ProceedsDelivery1.mmAccountServicerIdentification, CorporateActionAdditionalInformation1.mmReceiverIdentification, Entitlement1.mmAccountOwnerIdentification,
					SecuritiesAccount12.mmAccountOwnerIdentification, CashAccount18.mmAccountOwnerIdentification, CorporateActionMovement1.mmAccountOwnerIdentification, SecuritiesAccount8.mmAccountOwnerIdentification,
					SecuritiesAccount10.mmAccountOwnerIdentification, CorporateActionMovementFailedStatus1.mmAccountOwnerIdentification, CashAccount17.mmAccountOwnerIdentification, SecuritiesAccount6.mmAccountOwnerIdentification,
					SecuritiesAccount6.mmSafekeepingPlace, SecuritiesCompensation1.mmDepository, DeliveringPartiesAndAccount7.mmDepository, DeliveringPartiesAndAccount7.mmParty1, DeliveringPartiesAndAccount7.mmParty2,
					ReceivingPartiesAndAccount7.mmDepository, Settlement1.mmDepository, MarginReport2.mmNonClearingMember, Contribution1.mmNonClearingMember, CashParties24.mmCreditor, CashParties24.mmCreditorAgent,
					CashParties24.mmIntermediary, CashParties24.mmIntermediary2, InvestmentAccount43.mmAccountServicer, Intermediary27.mmIdentification, InvestmentAccount42.mmOwnerIdentification, InvestmentAccount42.mmAccountServicer,
					TradeLeg8.mmTradingParty, Intermediary29.mmIdentification, BeneficialOwner2.mmBeneficialOwnerIdentification, TradeLegStatement3.mmClearingSegment, TradeLegStatement3.mmNonClearingMember,
					SettlementObligation7.mmClearingSegment, SettlementObligation7.mmNonClearingMember, SettlementObligation7.mmDepository, NetPosition3.mmNonClearingMember, NetPosition3.mmDepository, TradeLeg10.mmTradingParty,
					TradeLeg9.mmNonClearingMember, TradeLeg9.mmTradingParty, DetailedInstructionStatus10.mmAccountOwner, DetailedInstructionStatus10.mmRightsHolder, SafekeepingAccount6.mmAccountOwner, SafekeepingAccount6.mmRightsHolder,
					IssuerAgent2.mmIdentification, VoteInstructionForMeetingResolution2Choice.mmShareholder, MeetingContactPerson2.mmEmployingParty, EligiblePosition5.mmAccountOwner, EligiblePosition5.mmRightsHolder,
					EligiblePosition6.mmAccountOwner, EligiblePosition6.mmRightsHolder, Clearing4.mmClearingSegment, ReceivingPartiesAndAccount11.mmDepository, NonGuaranteedTrade3.mmTradeCounterpartyMemberIdentification,
					NonGuaranteedTrade3.mmTradeCounterpartyClearingMemberIdentification, DeliveringPartiesAndAccount11.mmDepository, DeliveringPartiesAndAccount11.mmParty1, DeliveringPartiesAndAccount11.mmParty2,
					AdditionalReference6.mmReferenceIssuer, OtherParties27.mmInvestor, OtherParties27.mmQualifiedForeignIntermediary, OtherParties27.mmStockExchange, OtherParties27.mmTradeRegulator, OtherParties27.mmTripartyAgent,
					OtherParties27.mmBroker, SettlementParties36.mmDepository, SettlementParties36.mmParty1, SettlementParties36.mmParty2, SettlementParties36.mmParty3, SettlementParties36.mmParty4, SettlementParties36.mmParty5,
					StandingSettlementInstruction11.mmVendor, QuantityAndAccount39.mmAccountOwner, CashParties26.mmDebtor, CashParties26.mmDebtorAgent, CashParties26.mmCreditor, CashParties26.mmCreditorAgent, CashParties26.mmIntermediary,
					SubAccountIdentification42.mmAccountOwner, Intermediary32.mmIdentification, QuantityAndAccount41.mmAccountOwner, QuantityAndAccount40.mmAccountOwner, TransactionDetails81.mmInvestor, CashParties25.mmDebtor,
					CashParties25.mmDebtorAgent, CashParties25.mmCreditor, CashParties25.mmCreditorAgent, QuantityAndAccount42.mmAccountOwner, TransactionDetails74.mmInvestor, TransactionDetails82.mmInvestor,
					TransactionDetails76.mmAccountOwner, QuantityAndAccount38.mmAccountOwner, SubAccountIdentification43.mmAccountOwner, TransactionDetails80.mmAccountOwner, TransactionDetails80.mmInvestor, Counterparty9Choice.mmSeller,
					Counterparty9Choice.mmBuyer, ForeignExchangeTerms22.mmQuotingInstitution, SettlementParties39.mmParty2, SettlementParties39.mmParty3, SettlementParties39.mmParty4, SettlementParties39.mmParty5,
					SettlementParties40.mmDepository, SettlementParties40.mmParty1, SettlementParties40.mmParty2, SettlementParties40.mmParty3, SettlementParties40.mmParty4, SettlementParties40.mmParty5,
					QuantityAndAccount43.mmAccountOwner, PartyIdentificationAndAccount108.mmIdentification, PartyIdentificationAndAccount108.mmAlternateIdentification, PartyIdentificationAndAccount109.mmIdentification,
					PartyIdentificationAndAccount109.mmAlternateIdentification, OtherParties26.mmInvestor, OtherParties26.mmStockExchange, OtherParties26.mmTradeRegulator, Account18.mmAccountServicer, Linkages36.mmReferenceOwner,
					Linkages37.mmReferenceOwner, OtherParties28.mmInvestor, OtherParties28.mmQualifiedForeignIntermediary, OtherParties28.mmStockExchange, OtherParties28.mmTradeRegulator, OtherParties28.mmTripartyAgent,
					QuantityAndAccount44.mmAccountOwner, AccountAndBalance34.mmAccountOwner, AccountAndBalance35.mmAccountOwner, CorporateActionOption116.mmAccountOwner, AccountIdentification31.mmAccountOwner,
					SettlementParties42.mmDepository, SettlementParties42.mmParty1, SettlementParties42.mmParty2, SettlementParties42.mmParty3, CashParties28.mmCreditor, CashParties28.mmCreditorAgent,
					CashParties28.mmMarketClaimCounterparty, AccountAndBalance33.mmAccountOwner, AccountIdentification32.mmAccountOwner, CorporateActionNarrative26.mmOfferor, Organisation21.mmIdentification,
					Intermediary36.mmIdentification, Intermediary34.mmIdentification, InvestmentAccount54.mmOwnerIdentification, InvestmentAccount54.mmAccountServicer, Transfer31.mmReceivingAgentDetails,
					Transfer31.mmDeliveringAgentDetails, Transfer30.mmReceivingAgentDetails, Transfer30.mmDeliveringAgentDetails, InvestmentAccount56.mmOwnerIdentification, InvestmentAccount56.mmAccountServicer,
					Transfer32.mmReceivingAgentDetails, Transfer32.mmDeliveringAgentDetails, AdditionalReference7.mmReferenceIssuer, CancellationStatusAndReason3.mmStatusInitiator, Transfer33.mmReceivingAgentDetails,
					Transfer33.mmDeliveringAgentDetails, TransferStatusAndReason4.mmStatusInitiator, DeliveringPartiesAndAccount14.mmDeliverersCustodianDetails, DeliveringPartiesAndAccount14.mmDeliverersIntermediary1Details,
					DeliveringPartiesAndAccount14.mmDeliverersIntermediary2Details, DeliveringPartiesAndAccount14.mmDeliveringAgentDetails, DeliveringPartiesAndAccount14.mmPlaceOfSettlementDetails,
					DeliveringPartiesAndAccount13.mmDeliverersCustodianDetails, DeliveringPartiesAndAccount13.mmDeliverersIntermediary1Details, DeliveringPartiesAndAccount13.mmDeliverersIntermediary2Details,
					DeliveringPartiesAndAccount13.mmDeliveringAgentDetails, DeliveringPartiesAndAccount13.mmPlaceOfSettlementDetails, ReceivingPartiesAndAccount14.mmReceiversCustodianDetails,
					ReceivingPartiesAndAccount14.mmReceiversIntermediary1Details, ReceivingPartiesAndAccount14.mmReceiversIntermediary2Details, ReceivingPartiesAndAccount14.mmReceivingAgentDetails,
					ReceivingPartiesAndAccount14.mmPlaceOfSettlementDetails, InvestmentAccount55.mmOwnerIdentification, InvestmentAccount55.mmAccountServicer, ForeignExchangeTerms26.mmQuotingInstitution, Tax28.mmRecipientIdentification,
					Commission23.mmRecipientIdentification, Charge29.mmRecipientIdentification, ReceivingPartiesAndAccount13.mmReceiversCustodianDetails, ReceivingPartiesAndAccount13.mmReceiversIntermediary1Details,
					ReceivingPartiesAndAccount13.mmReceiversIntermediary2Details, ReceivingPartiesAndAccount13.mmReceivingAgentDetails, ReceivingPartiesAndAccount13.mmPlaceOfSettlementDetails, DirectDebitMandate5.mmDebtor,
					DirectDebitMandate5.mmCreditor, InvestmentAccount53.mmAccountServicer, Intermediary33.mmIdentification, PartyIdentificationAndAccount125.mmPartyIdentification, PartyIdentificationAndAccount125.mmPlaceOfSettlement,
					Account20.mmAccountServicer, Intermediary35.mmIdentification, PaymentCard18.mmCardIssuerIdentification, CashAccount33.mmAccountOwner, CashAccount33.mmAccountServicer, FinancialInstrument48.mmDeliveringAgentDetails,
					InvestmentAccount57.mmOwnerIdentification, InvestmentAccount57.mmAccountServicer, ISATransfer24.mmTransferee, FinancialInstrument47.mmDeliveringAgentDetails, FinancialInstrument46.mmDeliveringAgentDetails,
					Obligation4.mmPartyA, Obligation4.mmServicingPartyA, Obligation4.mmPartyB, Obligation4.mmServicingPartyB, OtherCollateral7.mmIssuer, OtherCollateral6.mmIssuer, OtherCollateral5.mmIssuer,
					ReceivingPartiesAndAccount15.mmDepository, DeliveringPartiesAndAccount15.mmDepository, DeliveringPartiesAndAccount15.mmParty1, DeliveringPartiesAndAccount15.mmParty2, InvestmentAccount61.mmAccountServicer,
					IndividualOrderConfirmationStatusAndReason2.mmStatusInitiator, AdditionalReference8.mmReferenceIssuer, SafekeepingAccount7.mmAccountOwner, InvestmentAccount63.mmAccountServicer, InvestmentAccount62.mmAccountServicer,
					AccountSubLevel15.mmAccountOwner, AccountSubLevel15.mmAccountServicer, AccountSubLevel16.mmAccountOwner, AccountSubLevel16.mmAccountServicer, InvestmentAccount58.mmOwnerIdentification,
					InvestmentAccount58.mmAccountServicer, AccountSubLevel18.mmAccountOwner, AccountSubLevel18.mmAccountServicer, AccountSubLevel19.mmAccountOwner, AccountSubLevel19.mmAccountServicer,
					IndividualOrderStatusAndReason7.mmStatusInitiator, SwitchOrderStatusAndReason2.mmStatusInitiator, OrderStatusAndReason10.mmStatusInitiator, Cheque9.mmPayeeIdentification, Cheque9.mmDrawerIdentification,
					FundSettlementParameters11.mmSettlementDate, FundSettlementParameters11.mmSettlementPlace, FundSettlementParameters11.mmSafekeepingPlace, OrderStatusAndReason9.mmStatusInitiator, Organisation30.mmIdentification,
					IndividualOrderStatusAndReason8.mmStatusInitiator, PaymentCard25.mmCardIssuerIdentification, FundSettlementParameters12.mmSettlementDate, FundSettlementParameters12.mmSettlementPlace,
					FundSettlementParameters12.mmSafekeepingPlace, Intermediary39.mmIdentification, ForeignExchangeTerms33.mmQuotingInstitution, ForeignExchangeTerms32.mmQuotingInstitution, AccountSubLevel11.mmAccountOwner,
					AccountSubLevel11.mmAccountServicer, AccountSubLevel12.mmAccountOwner, AccountSubLevel12.mmAccountServicer, ReceivingPartiesAndAccount16.mmReceiversCustodianDetails,
					ReceivingPartiesAndAccount16.mmReceiversIntermediary1Details, ReceivingPartiesAndAccount16.mmReceiversIntermediary2Details, ReceivingPartiesAndAccount16.mmReceivingAgentDetails, Intermediary40.mmIdentification,
					Fee2.mmRecipientIdentification, Fee1.mmRecipientIdentification, InvestmentAccount64.mmAccountServicer, Organisation29.mmIdentification, AccountSubLevel17.mmAccountOwner, AccountSubLevel17.mmAccountServicer,
					DeliveringPartiesAndAccount16.mmDeliverersCustodianDetails, DeliveringPartiesAndAccount16.mmDeliverersIntermediary1Details, DeliveringPartiesAndAccount16.mmDeliverersIntermediary2Details,
					DeliveringPartiesAndAccount16.mmDeliveringAgentDetails, AccountSubLevel13.mmAccountOwner, AccountSubLevel13.mmAccountServicer, AccountSubLevel14.mmAccountOwner, AccountSubLevel14.mmAccountServicer,
					CreditTransfer8.mmDebtor, CreditTransfer8.mmDebtorAgent, CreditTransfer8.mmCreditor, Account22.mmAccountServicer, DirectDebitMandate6.mmDebtor, DirectDebitMandate6.mmCreditor, AdditionalReference9.mmReferenceIssuer,
					AccountIdentification40.mmAccountOwner, SubAccountIdentification49.mmAccountOwner, TransactionDetails97.mmAccountOwner, TransactionDetails97.mmInvestor, TransactionDetails97.mmQualifiedForeignIntermediary,
					IntraPositionDetails39.mmAccountOwner, AdditionalInformation13.mmInvestor, AdditionalInformation13.mmDeliveringParty1, AdditionalInformation13.mmReceivingParty1, SecuritiesFinancingTransactionDetails35.mmAccountOwner,
					SecuritiesFinancingTransactionDetails35.mmInvestor, Obligation5.mmPartyA, Obligation5.mmServicingPartyA, Obligation5.mmPartyB, Obligation5.mmServicingPartyB);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Specific identification assigned to a party.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmIdentifiedParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
		}
	};
	protected MoneyLaunderingCheckCode moneyLaunderingCheck;
	/**
	 * Status of an identity check to prevent money laundering. This includes
	 * the counter-terrorism check.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheckCode
	 * MoneyLaunderingCheckCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MoneyLaunderingCheck1Choice#mmCode
	 * MoneyLaunderingCheck1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MoneyLaunderingCheck1Choice#mmProprietary
	 * MoneyLaunderingCheck1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation15.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation14.mmMoneyLaunderingCheck}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyLaunderingCheck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of an identity check to prevent money laundering. This includes the counter-terrorism check."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMoneyLaunderingCheck = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(MoneyLaunderingCheck1Choice.mmCode, MoneyLaunderingCheck1Choice.mmProprietary, InvestmentAccountOwnershipInformation15.mmMoneyLaunderingCheck,
					InvestmentAccountOwnershipInformation14.mmMoneyLaunderingCheck);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MoneyLaunderingCheck";
			definition = "Status of an identity check to prevent money laundering. This includes the counter-terrorism check.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MoneyLaunderingCheckCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Party.class.getMethod("getMoneyLaunderingCheck", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Tax taxationConditions;
	/**
	 * Taxation parameters which apply to an individual person or to an
	 * organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxableParty
	 * Tax.mmTaxableParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax17#mmCountry
	 * Tax17.mmCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax32#mmCountry
	 * Tax32.mmCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax30#mmCountry
	 * Tax30.mmCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax31#mmCountry
	 * Tax31.mmCountry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxationConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Taxation parameters which apply to an individual person or to an organisation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTaxationConditions = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Tax17.mmCountry, Tax32.mmCountry, Tax30.mmCountry, Tax31.mmCountry);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxationConditions";
			definition = "Taxation parameters which apply to an individual person or to an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.mmTaxableParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};
	protected Location domicile;
	/**
	 * Location in which a person is permanently domiciled (the place of a
	 * person's permanent home).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmDomiciledParty
	 * Location.mmDomiciledParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmDomicileCountry
	 * BeneficialOwner1.mmDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#mmDomicileCountry
	 * BeneficialOwner2.mmDomicileCountry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Domicile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location in which a person is permanently domiciled (the place of a person's permanent home)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDomicile = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(BeneficialOwner1.mmDomicileCountry, BeneficialOwner2.mmDomicileCountry);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Domicile";
			definition = "Location in which a person is permanently domiciled (the place of a person's permanent home).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmDomiciledParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Location> residence;
	/**
	 * Location from which the affairs of a company are directed or location in
	 * which a person resides (the place of a person's home).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmParty
	 * Location.mmParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Residence"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location from which the affairs of a company are directed or location in which a person resides (the place of a person's home)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmResidence = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Residence";
			definition = "Location from which the affairs of a company are directed or location in which a person resides (the place of a person's home).";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	protected PowerOfAttorney powerOfAttorney;
	/**
	 * Power of attorney which is held by the party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#mmAuthorisedParty
	 * PowerOfAttorney.mmAuthorisedParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PowerOfAttorney
	 * PowerOfAttorney}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PowerOfAttorney"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Power of attorney which is held by the party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPowerOfAttorney = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PowerOfAttorney";
			definition = "Power of attorney which is held by the party.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PowerOfAttorney.mmAuthorisedParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PowerOfAttorney.mmObject();
		}
	};
	protected Location location;
	/**
	 * Location of the taxable party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmTaxableParty
	 * Location.mmTaxableParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Location"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Location of the taxable party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmLocation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Location";
			definition = "Location of the taxable party.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmTaxableParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	protected Security closeLinkSecurity;
	/**
	 * Security for which a close link with a party is identified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmCloseLink
	 * Security.mmCloseLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CloseLinkSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security for which a close link with a party is identified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCloseLinkSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CloseLinkSecurity";
			definition = "Security for which a close link with a party is identified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmCloseLink;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Party";
				definition = "Entity involved in an activity.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmCloseLink, com.tools20022.repository.entity.ContactPoint.mmRelatedParty,
						com.tools20022.repository.entity.PartyIdentificationInformation.mmIdentifiedParty, com.tools20022.repository.entity.Location.mmDomiciledParty, com.tools20022.repository.entity.Location.mmParty,
						com.tools20022.repository.entity.Location.mmTaxableParty, com.tools20022.repository.entity.Tax.mmTaxableParty, com.tools20022.repository.entity.PowerOfAttorney.mmAuthorisedParty);
				derivationElement_lazy = () -> Arrays.asList(Report5.mmNonClearingMember, InvestmentAccountOwnershipInformation15.mmParty, InvestmentAccountOwnershipInformation14.mmParty);
				subType_lazy = () -> Arrays.asList(Organisation.mmObject(), Person.mmObject());
				superType_lazy = () -> RolePlayer.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Party.mmContactPoint, com.tools20022.repository.entity.Party.mmIdentification, com.tools20022.repository.entity.Party.mmMoneyLaunderingCheck,
						com.tools20022.repository.entity.Party.mmTaxationConditions, com.tools20022.repository.entity.Party.mmDomicile, com.tools20022.repository.entity.Party.mmResidence,
						com.tools20022.repository.entity.Party.mmPowerOfAttorney, com.tools20022.repository.entity.Party.mmLocation, com.tools20022.repository.entity.Party.mmCloseLinkSecurity);
				derivationComponent_lazy = () -> Arrays.asList(TradingPartyCapacity1Choice.mmObject(), TradingPartyCapacity2Choice.mmObject(), Counterparty9Choice.mmObject(), PartyIdentificationAndAccount108.mmObject(),
						PartyIdentificationAndAccount109.mmObject(), CountryAndResidentialStatusType2.mmObject(), PartyIdentificationAndAccount125.mmObject(), Party33Choice.mmObject(), Party32Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Party.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<ContactPoint> getContactPoint() {
		return contactPoint;
	}

	public void setContactPoint(List<com.tools20022.repository.entity.ContactPoint> contactPoint) {
		this.contactPoint = contactPoint;
	}

	public List<PartyIdentificationInformation> getIdentification() {
		return identification;
	}

	public void setIdentification(List<com.tools20022.repository.entity.PartyIdentificationInformation> identification) {
		this.identification = identification;
	}

	public MoneyLaunderingCheckCode getMoneyLaunderingCheck() {
		return moneyLaunderingCheck;
	}

	public void setMoneyLaunderingCheck(MoneyLaunderingCheckCode moneyLaunderingCheck) {
		this.moneyLaunderingCheck = moneyLaunderingCheck;
	}

	public Tax getTaxationConditions() {
		return taxationConditions;
	}

	public void setTaxationConditions(com.tools20022.repository.entity.Tax taxationConditions) {
		this.taxationConditions = taxationConditions;
	}

	public Location getDomicile() {
		return domicile;
	}

	public void setDomicile(com.tools20022.repository.entity.Location domicile) {
		this.domicile = domicile;
	}

	public List<Location> getResidence() {
		return residence;
	}

	public void setResidence(List<com.tools20022.repository.entity.Location> residence) {
		this.residence = residence;
	}

	public PowerOfAttorney getPowerOfAttorney() {
		return powerOfAttorney;
	}

	public void setPowerOfAttorney(com.tools20022.repository.entity.PowerOfAttorney powerOfAttorney) {
		this.powerOfAttorney = powerOfAttorney;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(com.tools20022.repository.entity.Location location) {
		this.location = location;
	}

	public Security getCloseLinkSecurity() {
		return closeLinkSecurity;
	}

	public void setCloseLinkSecurity(com.tools20022.repository.entity.Security closeLinkSecurity) {
		this.closeLinkSecurity = closeLinkSecurity;
	}
}