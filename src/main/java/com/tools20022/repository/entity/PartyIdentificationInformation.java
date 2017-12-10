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
import com.tools20022.repository.codeset.PartyTypeCode;
import com.tools20022.repository.codeset.TypeOfIdentificationCode;
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Unique and unambiguous way to identify a party
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PartyIdentificationInformation"
 * src="doc-files/PartyIdentificationInformation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
 * PartyIdentificationInformation.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmIdentifiedParty
 * PartyIdentificationInformation.mmIdentifiedParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmTaxIdentificationNumber
 * PartyIdentificationInformation.mmTaxIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmNationalRegistrationNumber
 * PartyIdentificationInformation.mmNationalRegistrationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmTypeOfIdentification
 * PartyIdentificationInformation.mmTypeOfIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmDeclaration
 * PartyIdentificationInformation.mmDeclaration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmPartyType
 * PartyIdentificationInformation.mmPartyType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmPartyName
 * PartyIdentificationInformation.mmPartyName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmValidityPeriod
 * PartyIdentificationInformation.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmIdentifiedMarket
 * PartyIdentificationInformation.mmIdentifiedMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmLEI
 * PartyIdentificationInformation.mmLEI}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedPartyIdentification
 * GenericIdentification.mmRelatedPartyIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmIdentification
 * Party.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyName#mmPartyIdentification
 * PartyName.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedIdentification
 * DateTimePeriod.mmRelatedIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Market#mmIdentification
 * Market.mmIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification1Choice#mmNameAndAddress
 * PartyIdentification1Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice#mmNameAndAddress
 * PartyIdentification2Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification44Choice#mmNameAndAddress
 * PartyIdentification44Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification40Choice#mmNameAndAddress
 * PartyIdentification40Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification15#mmIdentification
 * PartyIdentification15.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification32Choice#mmNameAndAddress
 * PartyIdentification32Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification5#mmIdentificationType
 * AlternatePartyIdentification5.mmIdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount79#mmIdentification
 * PartyIdentificationAndAccount79.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount79#mmAdditionalInformation
 * PartyIdentificationAndAccount79.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount79#mmAlternateIdentification
 * PartyIdentificationAndAccount79.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification70Choice#mmNameAndAddress
 * PartyIdentification70Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification6#mmTypeOfIdentification
 * AlternatePartyIdentification6.mmTypeOfIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount87#mmIdentification
 * PartyIdentificationAndAccount87.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount87#mmAdditionalInformation
 * PartyIdentificationAndAccount87.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount87#mmAlternateIdentification
 * PartyIdentificationAndAccount87.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount83#mmIdentification
 * PartyIdentificationAndAccount83.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount83#mmAdditionalInformation
 * PartyIdentificationAndAccount83.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount83#mmAlternateIdentification
 * PartyIdentificationAndAccount83.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount77#mmIdentification
 * PartyIdentificationAndAccount77.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount77#mmAlternateIdentification
 * PartyIdentificationAndAccount77.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount77#mmAdditionalInformation
 * PartyIdentificationAndAccount77.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount78#mmIdentification
 * PartyIdentificationAndAccount78.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount78#mmAlternateIdentification
 * PartyIdentificationAndAccount78.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount78#mmAdditionalInformation
 * PartyIdentificationAndAccount78.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification54#mmNameAndAddress
 * PartyIdentification54.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification68Choice#mmNameAndAddress
 * PartyIdentification68Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification55#mmIdentification
 * PartyIdentification55.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification55#mmAlternateIdentification
 * PartyIdentification55.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification55#mmAdditionalInformation
 * PartyIdentification55.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount34#mmIdentification
 * PartyIdentificationAndAccount34.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount34#mmAdditionalInformation
 * PartyIdentificationAndAccount34.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount34#mmAlternateIdentification
 * PartyIdentificationAndAccount34.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount80#mmIdentification
 * PartyIdentificationAndAccount80.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount80#mmAlternateIdentification
 * PartyIdentificationAndAccount80.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount80#mmAdditionalInformation
 * PartyIdentificationAndAccount80.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification42#mmIdentification
 * PartyIdentification42.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification33Choice#mmNameAndAddress
 * PartyIdentification33Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification4#mmIdentificationType
 * AlternatePartyIdentification4.mmIdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount31#mmIdentification
 * PartyIdentificationAndAccount31.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount31#mmAlternateIdentification
 * PartyIdentificationAndAccount31.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification34Choice#mmNameAndAddress
 * PartyIdentification34Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount32#mmPartyIdentification
 * PartyIdentificationAndAccount32.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice#mmNameAndAddress
 * PartyIdentification71Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount95#mmPartyIdentification
 * PartyIdentificationAndAccount95.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount97#mmPartyIdentification
 * PartyIdentificationAndAccount97.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification62#mmNameAndAddress
 * PartyIdentification62.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount96#mmPartyIdentification
 * PartyIdentificationAndAccount96.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification63#mmPartyIdentification
 * PartyIdentification63.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification64#mmNameAndAddress
 * PartyIdentification64.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification75Choice#mmNameAndAddress
 * PartyIdentification75Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification83Choice#mmNameAndAddress
 * PartyIdentification83Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount100#mmIdentification
 * PartyIdentificationAndAccount100.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount100#mmAlternateIdentification
 * PartyIdentificationAndAccount100.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount100#mmAdditionalInformation
 * PartyIdentificationAndAccount100.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IssuerInformation2#mmIdentification
 * IssuerInformation2.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification71#mmIdentification
 * PartyIdentification71.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount102#mmPartyIdentification
 * PartyIdentificationAndAccount102.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification90Choice#mmNameAndAddress
 * PartyIdentification90Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount106#mmIdentification
 * PartyIdentificationAndAccount106.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount106#mmAlternateIdentification
 * PartyIdentificationAndAccount106.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification75#mmIdentification
 * PartyIdentification75.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification75#mmAlternateIdentification
 * PartyIdentification75.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112#mmIdentification
 * PartyIdentificationAndAccount112.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112#mmAlternateIdentification
 * PartyIdentificationAndAccount112.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification7#mmIdentificationType
 * AlternatePartyIdentification7.mmIdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount111#mmIdentification
 * PartyIdentificationAndAccount111.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount111#mmAlternateIdentification
 * PartyIdentificationAndAccount111.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount117#mmIdentification
 * PartyIdentificationAndAccount117.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount107#mmIdentification
 * PartyIdentificationAndAccount107.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount107#mmAlternateIdentification
 * PartyIdentificationAndAccount107.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification76#mmIdentification
 * PartyIdentification76.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification93Choice#mmNameAndAddress
 * PartyIdentification93Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification91#mmIdentification
 * PartyIdentification91.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification93#mmAlternateIdentification
 * PartyIdentification93.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount122#mmIdentification
 * PartyIdentificationAndAccount122.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount122#mmAlternateIdentification
 * PartyIdentificationAndAccount122.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification92#mmIdentification
 * PartyIdentification92.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification92#mmAlternateIdentification
 * PartyIdentification92.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification94Choice#mmNameAndAddress
 * PartyIdentification94Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount120#mmIdentification
 * PartyIdentificationAndAccount120.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount120#mmAlternateIdentification
 * PartyIdentificationAndAccount120.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount121#mmIdentification
 * PartyIdentificationAndAccount121.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount121#mmAlternateIdentification
 * PartyIdentificationAndAccount121.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification97Choice#mmNameAndAddress
 * PartyIdentification97Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification97#mmPartyIdentification
 * PartyIdentification97.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount124#mmPartyIdentification
 * PartyIdentificationAndAccount124.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification95#mmIdentification
 * PartyIdentification95.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount123#mmPartyIdentification
 * PartyIdentificationAndAccount123.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification96Choice#mmNameAndAddress
 * PartyIdentification96Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification96#mmIdentification
 * PartyIdentification96.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification99Choice#mmNameAndAddress
 * PartyIdentification99Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification98#mmIdentification
 * PartyIdentification98.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification100#mmIdentification
 * PartyIdentification100.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlaceOfClearingIdentification1#mmIdentification
 * PlaceOfClearingIdentification1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlaceOfTradeIdentification1#mmMarketTypeAndIdentification
 * PlaceOfTradeIdentification1.mmMarketTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafeKeepingPlace1#mmSafekeepingPlaceFormat
 * SafeKeepingPlace1.mmSafekeepingPlaceFormat}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification99#mmIdentification
 * PartyIdentification99.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Pledgee1#mmPledgeeTypeAndIdentification
 * Pledgee1.mmPledgeeTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification100Choice#mmNameAndAddress
 * PartyIdentification100Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount127#mmIdentification
 * PartyIdentificationAndAccount127.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount127#mmAlternateIdentification
 * PartyIdentificationAndAccount127.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount127#mmAdditionalInformation
 * PartyIdentificationAndAccount127.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification102Choice#mmNameAndAddress
 * PartyIdentification102Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount126#mmPartyIdentification
 * PartyIdentificationAndAccount126.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification101Choice#mmNameAndAddress
 * PartyIdentification101Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification8#mmIdentificationType
 * AlternatePartyIdentification8.mmIdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount7#mmAccountServicer
 * SafekeepingAccount7.mmAccountServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification113#mmParty
 * PartyIdentification113.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount147#mmPartyIdentification
 * PartyIdentificationAndAccount147.mmPartyIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.OrganisationIdentification
 * OrganisationIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PersonIdentification
 * PersonIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress2
 * NameAndAddress2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification1Choice
 * PartyIdentification1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress5
 * NameAndAddress5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
 * PartyIdentification2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress4
 * NameAndAddress4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification44Choice
 * PartyIdentification44Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyTextInformation1
 * PartyTextInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyTextInformation2
 * PartyTextInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification40Choice
 * PartyIdentification40Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification3
 * PartyIdentification3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification15
 * PartyIdentification15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress13
 * NameAndAddress13}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification32Choice
 * PartyIdentification32Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationType40Choice
 * IdentificationType40Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlternatePartyIdentification5
 * AlternatePartyIdentification5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount79
 * PartyIdentificationAndAccount79}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification70Choice
 * PartyIdentification70Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationType41Choice
 * IdentificationType41Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlternatePartyIdentification6
 * AlternatePartyIdentification6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount87
 * PartyIdentificationAndAccount87}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount83
 * PartyIdentificationAndAccount83}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount77
 * PartyIdentificationAndAccount77}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount78
 * PartyIdentificationAndAccount78}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification35Choice
 * PartyIdentification35Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyTextInformation5
 * PartyTextInformation5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification54
 * PartyIdentification54}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification68Choice
 * PartyIdentification68Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification55
 * PartyIdentification55}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount34
 * PartyIdentificationAndAccount34}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount80
 * PartyIdentificationAndAccount80}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party10Choice Party10Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification42
 * PartyIdentification42}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party9Choice Party9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress8
 * NameAndAddress8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification44
 * PartyIdentification44}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress9
 * NameAndAddress9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress6
 * NameAndAddress6}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification33Choice
 * PartyIdentification33Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationType6Choice
 * IdentificationType6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlternatePartyIdentification4
 * AlternatePartyIdentification4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount31
 * PartyIdentificationAndAccount31}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification34Choice
 * PartyIdentification34Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount32
 * PartyIdentificationAndAccount32}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification72Choice
 * PartyIdentification72Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
 * PartyIdentification71Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyRole2Choice
 * PartyRole2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount95
 * PartyIdentificationAndAccount95}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount97
 * PartyIdentificationAndAccount97}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification62
 * PartyIdentification62}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount96
 * PartyIdentificationAndAccount96}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification63
 * PartyIdentification63}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification64
 * PartyIdentification64}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification75Choice
 * PartyIdentification75Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification83Choice
 * PartyIdentification83Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount100
 * PartyIdentificationAndAccount100}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyRole4Choice
 * PartyRole4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IssuerInformation2
 * IssuerInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification71
 * PartyIdentification71}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount102
 * PartyIdentificationAndAccount102}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification90Choice
 * PartyIdentification90Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification92Choice
 * PartyIdentification92Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount106
 * PartyIdentificationAndAccount106}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification75
 * PartyIdentification75}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112
 * PartyIdentificationAndAccount112}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlternatePartyIdentification7
 * AlternatePartyIdentification7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount111
 * PartyIdentificationAndAccount111}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount117
 * PartyIdentificationAndAccount117}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount107
 * PartyIdentificationAndAccount107}</li>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationType42Choice
 * IdentificationType42Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification76
 * PartyIdentification76}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PersonOrOrganisation1Choice
 * PersonOrOrganisation1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PersonOrOrganisation2Choice
 * PersonOrOrganisation2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification93Choice
 * PartyIdentification93Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification91
 * PartyIdentification91}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification93
 * PartyIdentification93}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount122
 * PartyIdentificationAndAccount122}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification92
 * PartyIdentification92}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification94Choice
 * PartyIdentification94Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount120
 * PartyIdentificationAndAccount120}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount121
 * PartyIdentificationAndAccount121}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification97Choice
 * PartyIdentification97Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification97
 * PartyIdentification97}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount124
 * PartyIdentificationAndAccount124}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyRole5Choice
 * PartyRole5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification95
 * PartyIdentification95}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount123
 * PartyIdentificationAndAccount123}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification96Choice
 * PartyIdentification96Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification96
 * PartyIdentification96}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification99Choice
 * PartyIdentification99Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress15
 * NameAndAddress15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification98
 * PartyIdentification98}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification100
 * PartyIdentification100}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlaceOfClearingIdentification1
 * PlaceOfClearingIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlaceOfTradeIdentification1
 * PlaceOfTradeIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafeKeepingPlace1
 * SafeKeepingPlace1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification99
 * PartyIdentification99}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Pledgee1 Pledgee1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification100Choice
 * PartyIdentification100Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount127
 * PartyIdentificationAndAccount127}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification102Choice
 * PartyIdentification102Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount126
 * PartyIdentificationAndAccount126}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification101Choice
 * PartyIdentification101Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlternatePartyIdentification8
 * AlternatePartyIdentification8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationType43Choice
 * IdentificationType43Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification113
 * PartyIdentification113}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount147
 * PartyIdentificationAndAccount147}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification3Choice
 * CounterpartyIdentification3Choice}</li>
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
 * "PartyIdentificationInformation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Unique and unambiguous way to identify a party"</li>
 * </ul>
 */
public class PartyIdentificationInformation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected GenericIdentification otherIdentification;
	/**
	 * Identifier issued to a party for which no specific identifier has been
	 * defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedPartyIdentification
	 * GenericIdentification.mmRelatedPartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification1Choice#mmProprietaryIdentification
	 * PartyIdentification1Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice#mmProprietaryIdentification
	 * PartyIdentification2Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification5#mmOther
	 * PersonIdentification5.mmOther}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails2#mmOther
	 * ContactDetails2.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification7#mmOther
	 * OrganisationIdentification7.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat2Choice#mmProprietary
	 * SafekeepingPlaceFormat2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification40Choice#mmProprietaryIdentification
	 * PartyIdentification40Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormatChoice#mmIdentificationAsDSS
	 * SafekeepingPlaceFormatChoice.mmIdentificationAsDSS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification32Choice#mmProprietaryIdentification
	 * PartyIdentification32Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification70Choice#mmProprietaryIdentification
	 * PartyIdentification70Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification35Choice#mmProprietaryIdentification
	 * PartyIdentification35Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification54#mmProprietaryIdentification
	 * PartyIdentification54.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification44#mmAlternativeIdentifier
	 * PartyIdentification44.mmAlternativeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonIdentificationType1Choice#mmOtherIdentification
	 * PersonIdentificationType1Choice.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmAdditionalIdentification
	 * BeneficialOwner1.mmAdditionalIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification33Choice#mmProprietaryIdentification
	 * PartyIdentification33Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification72Choice#mmProprietaryIdentification
	 * PartyIdentification72Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice#mmProprietaryIdentification
	 * PartyIdentification71Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification62#mmProprietaryIdentification
	 * PartyIdentification62.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification64#mmProprietaryIdentification
	 * PartyIdentification64.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#mmAdditionalIdentification
	 * BeneficialOwner2.mmAdditionalIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification83Choice#mmProprietaryIdentification
	 * PartyIdentification83Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat7Choice#mmProprietary
	 * SafekeepingPlaceFormat7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification90Choice#mmProprietaryIdentification
	 * PartyIdentification90Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification92Choice#mmProprietaryIdentification
	 * PartyIdentification92Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat8Choice#mmProprietary
	 * SafekeepingPlaceFormat8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification10#mmOther
	 * PersonIdentification10.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation1Choice#mmInternal
	 * PersonOrOrganisation1Choice.mmInternal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat10Choice#mmProprietary
	 * SafekeepingPlaceFormat10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification93Choice#mmProprietaryIdentification
	 * PartyIdentification93Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PledgeeFormat3Choice#mmProprietary
	 * PledgeeFormat3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification94Choice#mmProprietaryIdentification
	 * PartyIdentification94Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification97Choice#mmProprietaryIdentification
	 * PartyIdentification97Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice#mmProprietaryIdentification
	 * FinancialInstitutionIdentification7Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount33#mmAccountOwnerOtherIdentification
	 * CashAccount33.mmAccountOwnerOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification2Choice#mmIdentificationNumber
	 * IndividualPersonIdentification2Choice.mmIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification96Choice#mmProprietaryIdentification
	 * PartyIdentification96Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification100Choice#mmProprietaryIdentification
	 * PartyIdentification100Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification101Choice#mmProprietaryIdentification
	 * PartyIdentification101Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification12#mmOther
	 * PersonIdentification12.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson32#mmOtherIdentification
	 * IndividualPerson32.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification8Choice#mmProprietaryIdentification
	 * FinancialInstitutionIdentification8Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson31#mmOtherIdentification
	 * IndividualPerson31.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmOtherIdentification
	 * InvestmentAccountOwnershipInformation15.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmOtherIdentification
	 * InvestmentAccountOwnershipInformation14.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification3Choice#mmIdentificationNumber
	 * IndividualPersonIdentification3Choice.mmIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification3Choice#mmSectorAndLocation
	 * CounterpartyIdentification3Choice.mmSectorAndLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification3Choice#mmNameAndLocation
	 * CounterpartyIdentification3Choice.mmNameAndLocation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier issued to a party for which no specific identifier has been defined."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOtherIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(PartyIdentification1Choice.mmProprietaryIdentification, PartyIdentification2Choice.mmProprietaryIdentification, PersonIdentification5.mmOther, ContactDetails2.mmOther,
					OrganisationIdentification7.mmOther, SafekeepingPlaceFormat2Choice.mmProprietary, PartyIdentification40Choice.mmProprietaryIdentification, SafekeepingPlaceFormatChoice.mmIdentificationAsDSS,
					PartyIdentification32Choice.mmProprietaryIdentification, PartyIdentification70Choice.mmProprietaryIdentification, PartyIdentification35Choice.mmProprietaryIdentification,
					PartyIdentification54.mmProprietaryIdentification, PartyIdentification44.mmAlternativeIdentifier, PersonIdentificationType1Choice.mmOtherIdentification, BeneficialOwner1.mmAdditionalIdentification,
					PartyIdentification33Choice.mmProprietaryIdentification, PartyIdentification72Choice.mmProprietaryIdentification, PartyIdentification71Choice.mmProprietaryIdentification,
					PartyIdentification62.mmProprietaryIdentification, PartyIdentification64.mmProprietaryIdentification, BeneficialOwner2.mmAdditionalIdentification, PartyIdentification83Choice.mmProprietaryIdentification,
					SafekeepingPlaceFormat7Choice.mmProprietary, PartyIdentification90Choice.mmProprietaryIdentification, PartyIdentification92Choice.mmProprietaryIdentification, SafekeepingPlaceFormat8Choice.mmProprietary,
					PersonIdentification10.mmOther, PersonOrOrganisation1Choice.mmInternal, SafekeepingPlaceFormat10Choice.mmProprietary, PartyIdentification93Choice.mmProprietaryIdentification, PledgeeFormat3Choice.mmProprietary,
					PartyIdentification94Choice.mmProprietaryIdentification, PartyIdentification97Choice.mmProprietaryIdentification, FinancialInstitutionIdentification7Choice.mmProprietaryIdentification,
					CashAccount33.mmAccountOwnerOtherIdentification, IndividualPersonIdentification2Choice.mmIdentificationNumber, PartyIdentification96Choice.mmProprietaryIdentification,
					PartyIdentification100Choice.mmProprietaryIdentification, PartyIdentification101Choice.mmProprietaryIdentification, PersonIdentification12.mmOther, IndividualPerson32.mmOtherIdentification,
					FinancialInstitutionIdentification8Choice.mmProprietaryIdentification, IndividualPerson31.mmOtherIdentification, InvestmentAccountOwnershipInformation15.mmOtherIdentification,
					InvestmentAccountOwnershipInformation14.mmOtherIdentification, IndividualPersonIdentification3Choice.mmIdentificationNumber, CounterpartyIdentification3Choice.mmSectorAndLocation,
					CounterpartyIdentification3Choice.mmNameAndLocation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OtherIdentification";
			definition = "Identifier issued to a party for which no specific identifier has been defined.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmRelatedPartyIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
		}
	};
	protected Party identifiedParty;
	/**
	 * Party for which an identification is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentifiedParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party for which an identification is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIdentifiedParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentifiedParty";
			definition = "Party for which an identification is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
		}
	};
	protected Max35Text taxIdentificationNumber;
	/**
	 * Number assigned by a tax authority to an entity.
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
	 * {@linkplain com.tools20022.repository.choice.PersonIdentificationType1Choice#mmTaxIdentificationNumber
	 * PersonIdentificationType1Choice.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation21#mmTaxIdentificationNumber
	 * Organisation21.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmDebtorTaxIdentificationNumber
	 * DirectDebitMandate5.mmDebtorTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification96Choice#mmTaxIdentificationNumber
	 * PartyIdentification96Choice.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate6#mmDebtorTaxIdentificationNumber
	 * DirectDebitMandate6.mmDebtorTaxIdentificationNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxIdentificationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned by a tax authority to an entity."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxIdentificationNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PersonIdentificationType1Choice.mmTaxIdentificationNumber, Organisation21.mmTaxIdentificationNumber, DirectDebitMandate5.mmDebtorTaxIdentificationNumber,
					PartyIdentification96Choice.mmTaxIdentificationNumber, DirectDebitMandate6.mmDebtorTaxIdentificationNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxIdentificationNumber";
			definition = "Number assigned by a tax authority to an entity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PartyIdentificationInformation.class.getMethod("getTaxIdentificationNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text nationalRegistrationNumber;
	/**
	 * Number assigned by a national registration authority to an entity. In
	 * Singapore this is known as the NRIC.
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
	 * {@linkplain com.tools20022.repository.msg.Organisation21#mmNationalRegistrationNumber
	 * Organisation21.mmNationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmDebtorNationalRegistrationNumber
	 * DirectDebitMandate5.mmDebtorNationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification96Choice#mmNationalRegistrationNumber
	 * PartyIdentification96Choice.mmNationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate6#mmDebtorNationalRegistrationNumber
	 * DirectDebitMandate6.mmDebtorNationalRegistrationNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalRegistrationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned by a national registration authority to an entity. In Singapore this is known as the NRIC."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNationalRegistrationNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Organisation21.mmNationalRegistrationNumber, DirectDebitMandate5.mmDebtorNationalRegistrationNumber, PartyIdentification96Choice.mmNationalRegistrationNumber,
					DirectDebitMandate6.mmDebtorNationalRegistrationNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NationalRegistrationNumber";
			definition = "Number assigned by a national registration authority to an entity. In Singapore this is known as the NRIC.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PartyIdentificationInformation.class.getMethod("getNationalRegistrationNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TypeOfIdentificationCode typeOfIdentification;
	/**
	 * Specifies the type of alternate identification which can be used to
	 * identify a party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentificationCode
	 * TypeOfIdentificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType40Choice#mmCode
	 * IdentificationType40Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType40Choice#mmProprietary
	 * IdentificationType40Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType41Choice#mmCode
	 * IdentificationType41Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType41Choice#mmProprietary
	 * IdentificationType41Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType6Choice#mmCode
	 * IdentificationType6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType6Choice#mmProprietary
	 * IdentificationType6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType42Choice#mmCode
	 * IdentificationType42Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType42Choice#mmProprietary
	 * IdentificationType42Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType43Choice#mmCode
	 * IdentificationType43Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType43Choice#mmProprietary
	 * IdentificationType43Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of alternate identification which can be used to identify a party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTypeOfIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(IdentificationType40Choice.mmCode, IdentificationType40Choice.mmProprietary, IdentificationType41Choice.mmCode, IdentificationType41Choice.mmProprietary, IdentificationType6Choice.mmCode,
					IdentificationType6Choice.mmProprietary, IdentificationType42Choice.mmCode, IdentificationType42Choice.mmProprietary, IdentificationType43Choice.mmCode, IdentificationType43Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TypeOfIdentification";
			definition = "Specifies the type of alternate identification which can be used to identify a party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TypeOfIdentificationCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PartyIdentificationInformation.class.getMethod("getTypeOfIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max350Text declaration;
	/**
	 * Provides declaration details relative to the party.
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
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation1#mmDeclarationDetails
	 * PartyTextInformation1.mmDeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation2#mmDeclarationDetails
	 * PartyTextInformation2.mmDeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation5#mmDeclarationDetails
	 * PartyTextInformation5.mmDeclarationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Declaration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides declaration details relative to the party."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDeclaration = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PartyTextInformation1.mmDeclarationDetails, PartyTextInformation2.mmDeclarationDetails, PartyTextInformation5.mmDeclarationDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Declaration";
			definition = "Provides declaration details relative to the party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PartyIdentificationInformation.class.getMethod("getDeclaration", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyTypeCode partyType;
	/**
	 * Specifies the type of party in different business contexts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.PartyRole2Choice#mmCode
	 * PartyRole2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyRole2Choice#mmProprietary
	 * PartyRole2Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.PartyRole4Choice#mmCode
	 * PartyRole4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyRole4Choice#mmProprietary
	 * PartyRole4Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.PartyRole5Choice#mmCode
	 * PartyRole5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyRole5Choice#mmProprietary
	 * PartyRole5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification92#mmType
	 * MarketIdentification92.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of party in different business contexts."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPartyType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PartyRole2Choice.mmCode, PartyRole2Choice.mmProprietary, PartyRole4Choice.mmCode, PartyRole4Choice.mmProprietary, PartyRole5Choice.mmCode, PartyRole5Choice.mmProprietary,
					MarketIdentification92.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyType";
			definition = "Specifies the type of party in different business contexts.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PartyTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PartyIdentificationInformation.class.getMethod("getPartyType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.PartyName> partyName;
	/**
	 * Name by which a party is known and which is usually used to identify that
	 * party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PartyName#mmPartyIdentification
	 * PartyName.mmPartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PartyName PartyName}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name by which a party is known and which is usually used to identify that party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPartyName = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyName";
			definition = "Name by which a party is known and which is usually used to identify that party.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PartyName.mmPartyIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PartyName.mmObject();
		}
	};
	protected DateTimePeriod validityPeriod;
	/**
	 * Specifies the period during which an identification is valid
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedIdentification
	 * DateTimePeriod.mmRelatedIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the period during which an identification is valid"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmValidityPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Specifies the period during which an identification is valid";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmRelatedIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected Market identifiedMarket;
	/**
	 * Market for which an identification is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Market#mmIdentification
	 * Market.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Market Market}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentifiedMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market for which an identification is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIdentifiedMarket = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentifiedMarket";
			definition = "Market for which an identification is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Market.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Market.mmObject();
		}
	};
	protected LEIIdentifier lEI;
	/**
	 * Legal Entity Identifier is a code allocated to a party as described in
	 * ISO 17442 "Financial Services - Legal Entity Identifier (LEI)".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund2#mmLegalEntityIdentifier
	 * Fund2.mmLegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund1#mmLegalEntityIdentifier
	 * Fund1.mmLegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund3#mmLegalEntityIdentifier
	 * Fund3.mmLegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund4#mmLegalEntityIdentifier
	 * Fund4.mmLegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount106#mmLEI
	 * PartyIdentificationAndAccount106.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification75#mmLEI
	 * PartyIdentification75.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112#mmLEI
	 * PartyIdentificationAndAccount112.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount111#mmLEI
	 * PartyIdentificationAndAccount111.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount117#mmLEI
	 * PartyIdentificationAndAccount117.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount108#mmLEI
	 * PartyIdentificationAndAccount108.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount107#mmLEI
	 * PartyIdentificationAndAccount107.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount109#mmLEI
	 * PartyIdentificationAndAccount109.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation1Choice#mmLEI
	 * PersonOrOrganisation1Choice.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation2Choice#mmLEI
	 * PersonOrOrganisation2Choice.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionTransmission2#mmTransmittingBuyer
	 * SecuritiesTransactionTransmission2.mmTransmittingBuyer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionTransmission2#mmTransmittingSeller
	 * SecuritiesTransactionTransmission2.mmTransmittingSeller}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification91#mmLEI
	 * PartyIdentification91.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DerivativePartyIdentification1Choice#mmLEI
	 * DerivativePartyIdentification1Choice.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary36#mmLegalEntityIdentifier
	 * Intermediary36.mmLegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification97Choice#mmLegalEntityIdentifier
	 * PartyIdentification97Choice.mmLegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ThirdPartyRights1#mmLegalEntityIdentifier
	 * ThirdPartyRights1.mmLegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary33#mmLegalEntityIdentifier
	 * Intermediary33.mmLegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification95#mmLegalEntityIdentifier
	 * PartyIdentification95.mmLegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification96#mmLegalEntityIdentifier
	 * PartyIdentification96.mmLegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MoneyMarketTransactionStatus2#mmBranchIdentification
	 * MoneyMarketTransactionStatus2.mmBranchIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument53#mmLEI
	 * FinancialInstrument53.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification10#mmLEI
	 * FinancialInstitutionIdentification10.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation30#mmLegalEntityIdentifier
	 * Organisation30.mmLegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation29#mmLegalEntityIdentifier
	 * Organisation29.mmLegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5#mmIssuer
	 * SecuritiesReferenceDataReport5.mmIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrument48Choice#mmLEI
	 * FinancialInstrument48Choice.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmBranchIdentification
	 * SecuredMarketTransaction4.mmBranchIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification3Choice#mmLEI
	 * CounterpartyIdentification3Choice.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#mmBranchIdentification
	 * ForeignExchangeSwapTransaction3.mmBranchIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmBranchIdentification
	 * OvernightIndexSwapTransaction4.mmBranchIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmBranchIdentification
	 * UnsecuredMarketTransaction4.mmBranchIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LEI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\"."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLEI = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Fund2.mmLegalEntityIdentifier, Fund1.mmLegalEntityIdentifier, Fund3.mmLegalEntityIdentifier, Fund4.mmLegalEntityIdentifier, PartyIdentificationAndAccount106.mmLEI,
					PartyIdentification75.mmLEI, PartyIdentificationAndAccount112.mmLEI, PartyIdentificationAndAccount111.mmLEI, PartyIdentificationAndAccount117.mmLEI, PartyIdentificationAndAccount108.mmLEI,
					PartyIdentificationAndAccount107.mmLEI, PartyIdentificationAndAccount109.mmLEI, PersonOrOrganisation1Choice.mmLEI, PersonOrOrganisation2Choice.mmLEI, SecuritiesTransactionTransmission2.mmTransmittingBuyer,
					SecuritiesTransactionTransmission2.mmTransmittingSeller, PartyIdentification91.mmLEI, DerivativePartyIdentification1Choice.mmLEI, Intermediary36.mmLegalEntityIdentifier,
					PartyIdentification97Choice.mmLegalEntityIdentifier, ThirdPartyRights1.mmLegalEntityIdentifier, Intermediary33.mmLegalEntityIdentifier, PartyIdentification95.mmLegalEntityIdentifier,
					PartyIdentification96.mmLegalEntityIdentifier, MoneyMarketTransactionStatus2.mmBranchIdentification, FinancialInstrument53.mmLEI, FinancialInstitutionIdentification10.mmLEI, Organisation30.mmLegalEntityIdentifier,
					Organisation29.mmLegalEntityIdentifier, SecuritiesReferenceDataReport5.mmIssuer, FinancialInstrument48Choice.mmLEI, SecuredMarketTransaction4.mmBranchIdentification, CounterpartyIdentification3Choice.mmLEI,
					ForeignExchangeSwapTransaction3.mmBranchIdentification, OvernightIndexSwapTransaction4.mmBranchIdentification, UnsecuredMarketTransaction4.mmBranchIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LEI";
			definition = "Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PartyIdentificationInformation.class.getMethod("getLEI", new Class[]{});
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
				name = "PartyIdentificationInformation";
				definition = "Unique and unambiguous way to identify a party";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.mmRelatedPartyIdentification, com.tools20022.repository.entity.Party.mmIdentification,
						com.tools20022.repository.entity.PartyName.mmPartyIdentification, com.tools20022.repository.entity.DateTimePeriod.mmRelatedIdentification, com.tools20022.repository.entity.Market.mmIdentification);
				derivationElement_lazy = () -> Arrays.asList(PartyIdentification1Choice.mmNameAndAddress, PartyIdentification2Choice.mmNameAndAddress, PartyIdentification44Choice.mmNameAndAddress,
						PartyIdentification40Choice.mmNameAndAddress, PartyIdentification15.mmIdentification, PartyIdentification32Choice.mmNameAndAddress, AlternatePartyIdentification5.mmIdentificationType,
						PartyIdentificationAndAccount79.mmIdentification, PartyIdentificationAndAccount79.mmAdditionalInformation, PartyIdentificationAndAccount79.mmAlternateIdentification, PartyIdentification70Choice.mmNameAndAddress,
						AlternatePartyIdentification6.mmTypeOfIdentification, PartyIdentificationAndAccount87.mmIdentification, PartyIdentificationAndAccount87.mmAdditionalInformation,
						PartyIdentificationAndAccount87.mmAlternateIdentification, PartyIdentificationAndAccount83.mmIdentification, PartyIdentificationAndAccount83.mmAdditionalInformation,
						PartyIdentificationAndAccount83.mmAlternateIdentification, PartyIdentificationAndAccount77.mmIdentification, PartyIdentificationAndAccount77.mmAlternateIdentification,
						PartyIdentificationAndAccount77.mmAdditionalInformation, PartyIdentificationAndAccount78.mmIdentification, PartyIdentificationAndAccount78.mmAlternateIdentification,
						PartyIdentificationAndAccount78.mmAdditionalInformation, PartyIdentification54.mmNameAndAddress, PartyIdentification68Choice.mmNameAndAddress, PartyIdentification55.mmIdentification,
						PartyIdentification55.mmAlternateIdentification, PartyIdentification55.mmAdditionalInformation, PartyIdentificationAndAccount34.mmIdentification, PartyIdentificationAndAccount34.mmAdditionalInformation,
						PartyIdentificationAndAccount34.mmAlternateIdentification, PartyIdentificationAndAccount80.mmIdentification, PartyIdentificationAndAccount80.mmAlternateIdentification,
						PartyIdentificationAndAccount80.mmAdditionalInformation, PartyIdentification42.mmIdentification, PartyIdentification33Choice.mmNameAndAddress, AlternatePartyIdentification4.mmIdentificationType,
						PartyIdentificationAndAccount31.mmIdentification, PartyIdentificationAndAccount31.mmAlternateIdentification, PartyIdentification34Choice.mmNameAndAddress, PartyIdentificationAndAccount32.mmPartyIdentification,
						PartyIdentification71Choice.mmNameAndAddress, PartyIdentificationAndAccount95.mmPartyIdentification, PartyIdentificationAndAccount97.mmPartyIdentification, PartyIdentification62.mmNameAndAddress,
						PartyIdentificationAndAccount96.mmPartyIdentification, PartyIdentification63.mmPartyIdentification, PartyIdentification64.mmNameAndAddress, PartyIdentification75Choice.mmNameAndAddress,
						PartyIdentification83Choice.mmNameAndAddress, PartyIdentificationAndAccount100.mmIdentification, PartyIdentificationAndAccount100.mmAlternateIdentification, PartyIdentificationAndAccount100.mmAdditionalInformation,
						IssuerInformation2.mmIdentification, PartyIdentification71.mmIdentification, PartyIdentificationAndAccount102.mmPartyIdentification, PartyIdentification90Choice.mmNameAndAddress,
						PartyIdentificationAndAccount106.mmIdentification, PartyIdentificationAndAccount106.mmAlternateIdentification, PartyIdentification75.mmIdentification, PartyIdentification75.mmAlternateIdentification,
						PartyIdentificationAndAccount112.mmIdentification, PartyIdentificationAndAccount112.mmAlternateIdentification, AlternatePartyIdentification7.mmIdentificationType, PartyIdentificationAndAccount111.mmIdentification,
						PartyIdentificationAndAccount111.mmAlternateIdentification, PartyIdentificationAndAccount117.mmIdentification, PartyIdentificationAndAccount107.mmIdentification,
						PartyIdentificationAndAccount107.mmAlternateIdentification, PartyIdentification76.mmIdentification, PartyIdentification93Choice.mmNameAndAddress, PartyIdentification91.mmIdentification,
						PartyIdentification93.mmAlternateIdentification, PartyIdentificationAndAccount122.mmIdentification, PartyIdentificationAndAccount122.mmAlternateIdentification, PartyIdentification92.mmIdentification,
						PartyIdentification92.mmAlternateIdentification, PartyIdentification94Choice.mmNameAndAddress, PartyIdentificationAndAccount120.mmIdentification, PartyIdentificationAndAccount120.mmAlternateIdentification,
						PartyIdentificationAndAccount121.mmIdentification, PartyIdentificationAndAccount121.mmAlternateIdentification, PartyIdentification97Choice.mmNameAndAddress, PartyIdentification97.mmPartyIdentification,
						PartyIdentificationAndAccount124.mmPartyIdentification, PartyIdentification95.mmIdentification, PartyIdentificationAndAccount123.mmPartyIdentification, PartyIdentification96Choice.mmNameAndAddress,
						PartyIdentification96.mmIdentification, PartyIdentification99Choice.mmNameAndAddress, PartyIdentification98.mmIdentification, PartyIdentification100.mmIdentification, PlaceOfClearingIdentification1.mmIdentification,
						PlaceOfTradeIdentification1.mmMarketTypeAndIdentification, SafeKeepingPlace1.mmSafekeepingPlaceFormat, PartyIdentification99.mmIdentification, Pledgee1.mmPledgeeTypeAndIdentification,
						PartyIdentification100Choice.mmNameAndAddress, PartyIdentificationAndAccount127.mmIdentification, PartyIdentificationAndAccount127.mmAlternateIdentification, PartyIdentificationAndAccount127.mmAdditionalInformation,
						PartyIdentification102Choice.mmNameAndAddress, PartyIdentificationAndAccount126.mmPartyIdentification, PartyIdentification101Choice.mmNameAndAddress, AlternatePartyIdentification8.mmIdentificationType,
						SafekeepingAccount7.mmAccountServicer, PartyIdentification113.mmParty, PartyIdentificationAndAccount147.mmPartyIdentification);
				subType_lazy = () -> Arrays.asList(OrganisationIdentification.mmObject(), PersonIdentification.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PartyIdentificationInformation.mmOtherIdentification, com.tools20022.repository.entity.PartyIdentificationInformation.mmIdentifiedParty,
						com.tools20022.repository.entity.PartyIdentificationInformation.mmTaxIdentificationNumber, com.tools20022.repository.entity.PartyIdentificationInformation.mmNationalRegistrationNumber,
						com.tools20022.repository.entity.PartyIdentificationInformation.mmTypeOfIdentification, com.tools20022.repository.entity.PartyIdentificationInformation.mmDeclaration,
						com.tools20022.repository.entity.PartyIdentificationInformation.mmPartyType, com.tools20022.repository.entity.PartyIdentificationInformation.mmPartyName,
						com.tools20022.repository.entity.PartyIdentificationInformation.mmValidityPeriod, com.tools20022.repository.entity.PartyIdentificationInformation.mmIdentifiedMarket,
						com.tools20022.repository.entity.PartyIdentificationInformation.mmLEI);
				derivationComponent_lazy = () -> Arrays.asList(NameAndAddress2.mmObject(), PartyIdentification1Choice.mmObject(), NameAndAddress5.mmObject(), PartyIdentification2Choice.mmObject(), NameAndAddress4.mmObject(),
						PartyIdentification44Choice.mmObject(), PartyTextInformation1.mmObject(), PartyTextInformation2.mmObject(), PartyIdentification40Choice.mmObject(), PartyIdentification3.mmObject(), PartyIdentification15.mmObject(),
						NameAndAddress13.mmObject(), PartyIdentification32Choice.mmObject(), IdentificationType40Choice.mmObject(), AlternatePartyIdentification5.mmObject(), PartyIdentificationAndAccount79.mmObject(),
						PartyIdentification70Choice.mmObject(), IdentificationType41Choice.mmObject(), AlternatePartyIdentification6.mmObject(), PartyIdentificationAndAccount87.mmObject(), PartyIdentificationAndAccount83.mmObject(),
						PartyIdentificationAndAccount77.mmObject(), PartyIdentificationAndAccount78.mmObject(), PartyIdentification35Choice.mmObject(), PartyTextInformation5.mmObject(), PartyIdentification54.mmObject(),
						PartyIdentification68Choice.mmObject(), PartyIdentification55.mmObject(), PartyIdentificationAndAccount34.mmObject(), PartyIdentificationAndAccount80.mmObject(), Party10Choice.mmObject(),
						PartyIdentification42.mmObject(), Party9Choice.mmObject(), NameAndAddress8.mmObject(), PartyIdentification44.mmObject(), NameAndAddress9.mmObject(), NameAndAddress6.mmObject(),
						PartyIdentification33Choice.mmObject(), IdentificationType6Choice.mmObject(), AlternatePartyIdentification4.mmObject(), PartyIdentificationAndAccount31.mmObject(), PartyIdentification34Choice.mmObject(),
						PartyIdentificationAndAccount32.mmObject(), PartyIdentification72Choice.mmObject(), PartyIdentification71Choice.mmObject(), PartyRole2Choice.mmObject(), PartyIdentificationAndAccount95.mmObject(),
						PartyIdentificationAndAccount97.mmObject(), PartyIdentification62.mmObject(), PartyIdentificationAndAccount96.mmObject(), PartyIdentification63.mmObject(), PartyIdentification64.mmObject(),
						PartyIdentification75Choice.mmObject(), PartyIdentification83Choice.mmObject(), PartyIdentificationAndAccount100.mmObject(), PartyRole4Choice.mmObject(), IssuerInformation2.mmObject(),
						PartyIdentification71.mmObject(), PartyIdentificationAndAccount102.mmObject(), PartyIdentification90Choice.mmObject(), PartyIdentification92Choice.mmObject(), PartyIdentificationAndAccount106.mmObject(),
						PartyIdentification75.mmObject(), PartyIdentificationAndAccount112.mmObject(), AlternatePartyIdentification7.mmObject(), PartyIdentificationAndAccount111.mmObject(), PartyIdentificationAndAccount117.mmObject(),
						PartyIdentificationAndAccount107.mmObject(), IdentificationType42Choice.mmObject(), PartyIdentification76.mmObject(), PersonOrOrganisation1Choice.mmObject(), PersonOrOrganisation2Choice.mmObject(),
						PartyIdentification93Choice.mmObject(), PartyIdentification91.mmObject(), PartyIdentification93.mmObject(), PartyIdentificationAndAccount122.mmObject(), PartyIdentification92.mmObject(),
						PartyIdentification94Choice.mmObject(), PartyIdentificationAndAccount120.mmObject(), PartyIdentificationAndAccount121.mmObject(), PartyIdentification97Choice.mmObject(), PartyIdentification97.mmObject(),
						PartyIdentificationAndAccount124.mmObject(), PartyRole5Choice.mmObject(), PartyIdentification95.mmObject(), PartyIdentificationAndAccount123.mmObject(), PartyIdentification96Choice.mmObject(),
						PartyIdentification96.mmObject(), PartyIdentification99Choice.mmObject(), NameAndAddress15.mmObject(), PartyIdentification98.mmObject(), PartyIdentification100.mmObject(), PlaceOfClearingIdentification1.mmObject(),
						PlaceOfTradeIdentification1.mmObject(), SafeKeepingPlace1.mmObject(), PartyIdentification99.mmObject(), Pledgee1.mmObject(), PartyIdentification100Choice.mmObject(), PartyIdentificationAndAccount127.mmObject(),
						PartyIdentification102Choice.mmObject(), PartyIdentificationAndAccount126.mmObject(), PartyIdentification101Choice.mmObject(), AlternatePartyIdentification8.mmObject(), IdentificationType43Choice.mmObject(),
						PartyIdentification113.mmObject(), PartyIdentificationAndAccount147.mmObject(), CounterpartyIdentification3Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PartyIdentificationInformation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification getOtherIdentification() {
		return otherIdentification;
	}

	public void setOtherIdentification(com.tools20022.repository.entity.GenericIdentification otherIdentification) {
		this.otherIdentification = otherIdentification;
	}

	public Party getIdentifiedParty() {
		return identifiedParty;
	}

	public void setIdentifiedParty(com.tools20022.repository.entity.Party identifiedParty) {
		this.identifiedParty = identifiedParty;
	}

	public Max35Text getTaxIdentificationNumber() {
		return taxIdentificationNumber;
	}

	public void setTaxIdentificationNumber(Max35Text taxIdentificationNumber) {
		this.taxIdentificationNumber = taxIdentificationNumber;
	}

	public Max35Text getNationalRegistrationNumber() {
		return nationalRegistrationNumber;
	}

	public void setNationalRegistrationNumber(Max35Text nationalRegistrationNumber) {
		this.nationalRegistrationNumber = nationalRegistrationNumber;
	}

	public TypeOfIdentificationCode getTypeOfIdentification() {
		return typeOfIdentification;
	}

	public void setTypeOfIdentification(TypeOfIdentificationCode typeOfIdentification) {
		this.typeOfIdentification = typeOfIdentification;
	}

	public Max350Text getDeclaration() {
		return declaration;
	}

	public void setDeclaration(Max350Text declaration) {
		this.declaration = declaration;
	}

	public PartyTypeCode getPartyType() {
		return partyType;
	}

	public void setPartyType(PartyTypeCode partyType) {
		this.partyType = partyType;
	}

	public List<PartyName> getPartyName() {
		return partyName;
	}

	public void setPartyName(List<com.tools20022.repository.entity.PartyName> partyName) {
		this.partyName = partyName;
	}

	public DateTimePeriod getValidityPeriod() {
		return validityPeriod;
	}

	public void setValidityPeriod(com.tools20022.repository.entity.DateTimePeriod validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	public Market getIdentifiedMarket() {
		return identifiedMarket;
	}

	public void setIdentifiedMarket(com.tools20022.repository.entity.Market identifiedMarket) {
		this.identifiedMarket = identifiedMarket;
	}

	public LEIIdentifier getLEI() {
		return lEI;
	}

	public void setLEI(LEIIdentifier lEI) {
		this.lEI = lEI;
	}
}