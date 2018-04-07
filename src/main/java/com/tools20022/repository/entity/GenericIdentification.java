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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information related to a non-standardised identification, such as a
 * proprietary party identification or account identification.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="GenericIdentification"
 * src="doc-files/GenericIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
 * GenericIdentification.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForContactPoint
 * GenericIdentification.mmIdentificationForContactPoint}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForAccount
 * GenericIdentification.mmIdentificationForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedPartyIdentification
 * GenericIdentification.mmRelatedPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIssueDate
 * GenericIdentification.mmIssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmExpiryDate
 * GenericIdentification.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmScheme
 * GenericIdentification.mmScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForSecuritiesCertificate
 * GenericIdentification.mmIdentificationForSecuritiesCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForLot
 * GenericIdentification.mmIdentificationForLot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmPartyRole
 * GenericIdentification.mmPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForCashProceedsIncome
 * GenericIdentification.mmIdentificationForCashProceedsIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedStatusReason
 * GenericIdentification.mmRelatedStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForBankTransaction
 * GenericIdentification.mmIdentificationForBankTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForAccountCostReferencePattern
 * GenericIdentification.mmIdentificationForAccountCostReferencePattern}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmAccount
 * GenericIdentification.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedSystemIdentification
 * GenericIdentification.mmRelatedSystemIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForInterestName
 * GenericIdentification.mmIdentificationForInterestName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedCashAccountService
 * GenericIdentification.mmRelatedCashAccountService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForInvestmentFundClass
 * GenericIdentification.mmIdentificationForInvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentifiedLocation
 * GenericIdentification.mmIdentifiedLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedSecuritiesIdentification
 * GenericIdentification.mmRelatedSecuritiesIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentifiedDocument
 * GenericIdentification.mmIdentifiedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedPurchaseOrder
 * GenericIdentification.mmRelatedPurchaseOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedCertificate
 * GenericIdentification.mmRelatedCertificate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmFundClassification
 * InvestmentFundClass.mmFundClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmGenericIdentification
 * SecuritiesIdentification.mmGenericIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#mmGenericIdentification
 * InformationPartyRole.mmGenericIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmIdentification
 * ContactPoint.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
 * PartyIdentificationInformation.mmOtherIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmType
 * Account.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmProprietaryIdentification
 * AccountIdentification.mmProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmCostReferencePattern
 * AccountIdentification.mmCostReferencePattern}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmIdentification
 * Location.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#mmIdentification
 * Scheme.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Document#mmDocumentIdentification
 * Document.mmDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#mmDataSourceScheme
 * StatusReason.mmDataSourceScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmIdentification
 * SystemIdentification.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotNumber
 * LotBreakdown.mmLotNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmIdentification
 * CashAccountService.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#mmNumber
 * SecuritiesCertificate.mmNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmInterestName
 * Interest.mmInterestName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmIncomeType
 * CashProceedsDefinition.mmIncomeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankTransaction#mmProprietaryIdentification
 * BankTransaction.mmProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#mmIdentification
 * PurchaseOrder.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmCertificate
 * RegisteredContract.mmCertificate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification21#mmType
 * GenericIdentification21.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification58#mmType
 * GenericIdentification58.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification78#mmType
 * GenericIdentification78.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification80#mmType
 * GenericIdentification80.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateIdentification4#mmIssuerCountry
 * AlternateIdentification4.mmIssuerCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OtherIdentification4Choice#mmProprietary
 * OtherIdentification4Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification81#mmIdentificationType
 * GenericIdentification81.mmIdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReversedStatus2Choice#mmDataSourceScheme
 * ReversedStatus2Choice.mmDataSourceScheme}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21#mmCareOf
 * PostalAddress21.mmCareOf}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification82#mmIssuerCountry
 * GenericIdentification82.mmIssuerCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OtherIdentification3Choice#mmProprietary
 * OtherIdentification3Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation
 * SimpleIdentificationInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification1
 * GenericIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification7
 * GenericIdentification7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalReference2
 * AdditionalReference2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalReference3
 * AdditionalReference3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification13
 * GenericIdentification13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification20
 * GenericIdentification20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification47
 * GenericIdentification47}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation2
 * SimpleIdentificationInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification4
 * GenericIdentification4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification19
 * GenericIdentification19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification37
 * GenericIdentification37}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification21
 * GenericIdentification21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification27
 * GenericIdentification27}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation4
 * SimpleIdentificationInformation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification6
 * GenericIdentification6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification5
 * GenericIdentification5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification38
 * GenericIdentification38}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification29
 * GenericIdentification29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification36
 * GenericIdentification36}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification16
 * GenericIdentification16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification30
 * GenericIdentification30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification40
 * GenericIdentification40}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification49
 * GenericIdentification49}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification56
 * GenericIdentification56}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification58
 * GenericIdentification58}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalReference6
 * AdditionalReference6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification78
 * GenericIdentification78}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification80
 * GenericIdentification80}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlternateIdentification4
 * AlternateIdentification4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OtherIdentification4Choice
 * OtherIdentification4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalReference7
 * AdditionalReference7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification81
 * GenericIdentification81}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification82
 * GenericIdentification82}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OtherIdentification3Choice
 * OtherIdentification3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalReference8
 * AdditionalReference8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification164
 * GenericIdentification164}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalReference9
 * AdditionalReference9}</li>
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
 * "GenericIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to a non-standardised identification, such as a proprietary party identification or account identification."
 * </li>
 * </ul>
 */
public class GenericIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text identification;
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
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification3#mmIdentification
	 * AlternateSecurityIdentification3.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation#mmIdentification
	 * SimpleIdentificationInformation.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification1#mmIdentification
	 * GenericIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification3#mmIssuer
	 * AccountIdentification3.mmIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference2#mmReference
	 * AdditionalReference2.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3#mmReference
	 * AdditionalReference3.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification1#mmIdentification
	 * AlternateSecurityIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BranchData#mmIdentification
	 * BranchData.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification13#mmIdentification
	 * GenericIdentification13.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification20#mmIdentification
	 * GenericIdentification20.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification47#mmIdentification
	 * GenericIdentification47.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClearingSystemMemberIdentification2#mmMemberIdentification
	 * ClearingSystemMemberIdentification2.mmMemberIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericFinancialIdentification1#mmIdentification
	 * GenericFinancialIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BranchData2#mmIdentification
	 * BranchData2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation2#mmIdentification
	 * SimpleIdentificationInformation2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericAccountIdentification1#mmIdentification
	 * GenericAccountIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification4#mmIdentification
	 * GenericIdentification4.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericOrganisationIdentification1#mmIdentification
	 * GenericOrganisationIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericPersonIdentification1#mmIdentification
	 * GenericPersonIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification19#mmIdentification
	 * GenericIdentification19.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherIdentification1#mmIdentification
	 * OtherIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification37#mmIdentification
	 * GenericIdentification37.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification21#mmIdentification
	 * GenericIdentification21.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification27#mmIdentification
	 * GenericIdentification27.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText2#mmIdentification
	 * SafekeepingPlaceTypeAndText2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification9#mmIdentification
	 * DocumentIdentification9.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation4#mmIdentification
	 * SimpleIdentificationInformation4.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification38#mmIdentification
	 * GenericIdentification38.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification29#mmIdentification
	 * GenericIdentification29.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification5#mmAlternateIdentification
	 * AlternatePartyIdentification5.mmAlternateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification6#mmAlternateIdentification
	 * AlternatePartyIdentification6.mmAlternateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount3#mmIdentification
	 * SecuritiesAccount3.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification36#mmIdentification
	 * GenericIdentification36.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmPriceSource
	 * FinancialInstrumentStipulations2.mmPriceSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NameAndAddress8#mmAlternativeIdentifier
	 * NameAndAddress8.mmAlternativeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8#mmIdentification
	 * DocumentIdentification8.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification2Choice#mmCashAccountIdentification
	 * AccountIdentification2Choice.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification2Choice#mmSecuritiesAccountIdentification
	 * AccountIdentification2Choice.mmSecuritiesAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount7#mmAccountIdentification
	 * SecuritiesAccount7.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount9#mmAccountIdentification
	 * SecuritiesAccount9.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification16#mmIdentification
	 * GenericIdentification16.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProceedsDelivery1#mmSecuritiesAccountIdentification
	 * ProceedsDelivery1.mmSecuritiesAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount12#mmAccountIdentification
	 * SecuritiesAccount12.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovement1#mmAccountIdentification
	 * CorporateActionMovement1.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount8#mmAccountIdentification
	 * SecuritiesAccount8.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount10#mmAccountIdentification
	 * SecuritiesAccount10.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount6#mmSecuritiesAccountIdentification
	 * SecuritiesAccount6.mmSecuritiesAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification30#mmIdentification
	 * GenericIdentification30.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification5#mmIdentification
	 * AccountIdentification5.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification4#mmAlternateIdentification
	 * AlternatePartyIdentification4.mmAlternateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification40#mmIdentification
	 * GenericIdentification40.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText1#mmIdentification
	 * SafekeepingPlaceTypeAndText1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount22#mmIdentification
	 * SecuritiesAccount22.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification49#mmIdentification
	 * GenericIdentification49.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification56#mmIdentification
	 * GenericIdentification56.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification58#mmIdentification
	 * GenericIdentification58.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherIdentification4#mmIdentification
	 * OtherIdentification4.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount6#mmAccountIdentification
	 * SafekeepingAccount6.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference6#mmReference
	 * AdditionalReference6.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount24#mmIdentification
	 * SecuritiesAccount24.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification7#mmAlternateIdentification
	 * AlternatePartyIdentification7.mmAlternateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification78#mmIdentification
	 * GenericIdentification78.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText6#mmIdentification
	 * SafekeepingPlaceTypeAndText6.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount26#mmIdentification
	 * SecuritiesAccount26.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate4#mmNumber
	 * SecuritiesCertificate4.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText8#mmIdentification
	 * SafekeepingPlaceTypeAndText8.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount25#mmIdentification
	 * SecuritiesAccount25.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification80#mmIdentification
	 * GenericIdentification80.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateIdentification4#mmIdentification
	 * AlternateIdentification4.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification31#mmIdentification
	 * DocumentIdentification31.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification32#mmIdentification
	 * DocumentIdentification32.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification33#mmIdentification
	 * DocumentIdentification33.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DocumentIdentification3Choice#mmAccountServicerDocumentIdentification
	 * DocumentIdentification3Choice.mmAccountServicerDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DocumentIdentification3Choice#mmAccountOwnerDocumentIdentification
	 * DocumentIdentification3Choice.mmAccountOwnerDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference7#mmReference
	 * AdditionalReference7.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification81#mmIdentification
	 * GenericIdentification81.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmMandateIdentification
	 * DirectDebitMandate5.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification7#mmIdentification
	 * AlternateSecurityIdentification7.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification82#mmIdentification
	 * GenericIdentification82.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmValidatingParty
	 * PartyProfileInformation5.mmValidatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmCheckingParty
	 * PartyProfileInformation5.mmCheckingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmResponsibleParty
	 * PartyProfileInformation5.mmResponsibleParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BlockedHoldingDetails2#mmHoldingCertificateNumber
	 * BlockedHoldingDetails2.mmHoldingCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Agreement4#mmAgreementIdentification
	 * Agreement4.mmAgreementIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification8#mmAlternateIdentification
	 * AlternatePartyIdentification8.mmAlternateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingVenueIdentification2#mmIdentification
	 * TradingVenueIdentification2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference8#mmReference
	 * AdditionalReference8.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11#mmSecuritiesSettlementSystemIdentification
	 * FundSettlementParameters11.mmSecuritiesSettlementSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification164#mmIdentification
	 * GenericIdentification164.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters12#mmSecuritiesSettlementSystemIdentification
	 * FundSettlementParameters12.mmSecuritiesSettlementSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmClientIdentification
	 * InvestmentAccountOwnershipInformation15.mmClientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmClientIdentification
	 * InvestmentAccountOwnershipInformation14.mmClientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate6#mmMandateIdentification
	 * DirectDebitMandate6.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference9#mmReference
	 * AdditionalReference9.mmReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name or number assigned by an entity to enable recognition of that entity, for example account identifier, identification assigned by a provider to identify its customers."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<GenericIdentification, Max35Text> mmIdentification = new MMBusinessAttribute<GenericIdentification, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(AlternateSecurityIdentification3.mmIdentification, SimpleIdentificationInformation.mmIdentification, GenericIdentification1.mmIdentification, AccountIdentification3.mmIssuer,
					AdditionalReference2.mmReference, AdditionalReference3.mmReference, AlternateSecurityIdentification1.mmIdentification, BranchData.mmIdentification, GenericIdentification13.mmIdentification,
					GenericIdentification20.mmIdentification, GenericIdentification47.mmIdentification, ClearingSystemMemberIdentification2.mmMemberIdentification, GenericFinancialIdentification1.mmIdentification,
					BranchData2.mmIdentification, SimpleIdentificationInformation2.mmIdentification, GenericAccountIdentification1.mmIdentification, GenericIdentification4.mmIdentification,
					GenericOrganisationIdentification1.mmIdentification, GenericPersonIdentification1.mmIdentification, GenericIdentification19.mmIdentification, OtherIdentification1.mmIdentification,
					GenericIdentification37.mmIdentification, GenericIdentification21.mmIdentification, GenericIdentification27.mmIdentification, SafekeepingPlaceTypeAndText2.mmIdentification, DocumentIdentification9.mmIdentification,
					SimpleIdentificationInformation4.mmIdentification, GenericIdentification38.mmIdentification, GenericIdentification29.mmIdentification, AlternatePartyIdentification5.mmAlternateIdentification,
					AlternatePartyIdentification6.mmAlternateIdentification, SecuritiesAccount3.mmIdentification, GenericIdentification36.mmIdentification, FinancialInstrumentStipulations2.mmPriceSource,
					NameAndAddress8.mmAlternativeIdentifier, DocumentIdentification8.mmIdentification, AccountIdentification2Choice.mmCashAccountIdentification, AccountIdentification2Choice.mmSecuritiesAccountIdentification,
					SecuritiesAccount7.mmAccountIdentification, SecuritiesAccount9.mmAccountIdentification, GenericIdentification16.mmIdentification, ProceedsDelivery1.mmSecuritiesAccountIdentification,
					SecuritiesAccount12.mmAccountIdentification, CorporateActionMovement1.mmAccountIdentification, SecuritiesAccount8.mmAccountIdentification, SecuritiesAccount10.mmAccountIdentification,
					SecuritiesAccount6.mmSecuritiesAccountIdentification, GenericIdentification30.mmIdentification, AccountIdentification5.mmIdentification, AlternatePartyIdentification4.mmAlternateIdentification,
					GenericIdentification40.mmIdentification, SafekeepingPlaceTypeAndText1.mmIdentification, SecuritiesAccount22.mmIdentification, GenericIdentification49.mmIdentification, GenericIdentification56.mmIdentification,
					GenericIdentification58.mmIdentification, OtherIdentification4.mmIdentification, SafekeepingAccount6.mmAccountIdentification, AdditionalReference6.mmReference, SecuritiesAccount24.mmIdentification,
					AlternatePartyIdentification7.mmAlternateIdentification, GenericIdentification78.mmIdentification, SafekeepingPlaceTypeAndText6.mmIdentification, SecuritiesAccount26.mmIdentification, SecuritiesCertificate4.mmNumber,
					SafekeepingPlaceTypeAndText8.mmIdentification, SecuritiesAccount25.mmIdentification, GenericIdentification80.mmIdentification, AlternateIdentification4.mmIdentification, DocumentIdentification31.mmIdentification,
					DocumentIdentification32.mmIdentification, DocumentIdentification33.mmIdentification, DocumentIdentification3Choice.mmAccountServicerDocumentIdentification,
					DocumentIdentification3Choice.mmAccountOwnerDocumentIdentification, AdditionalReference7.mmReference, GenericIdentification81.mmIdentification, DirectDebitMandate5.mmMandateIdentification,
					AlternateSecurityIdentification7.mmIdentification, GenericIdentification82.mmIdentification, PartyProfileInformation5.mmValidatingParty, PartyProfileInformation5.mmCheckingParty,
					PartyProfileInformation5.mmResponsibleParty, BlockedHoldingDetails2.mmHoldingCertificateNumber, Agreement4.mmAgreementIdentification, AlternatePartyIdentification8.mmAlternateIdentification,
					TradingVenueIdentification2.mmIdentification, AdditionalReference8.mmReference, FundSettlementParameters11.mmSecuritiesSettlementSystemIdentification, GenericIdentification164.mmIdentification,
					FundSettlementParameters12.mmSecuritiesSettlementSystemIdentification, InvestmentAccountOwnershipInformation15.mmClientIdentification, InvestmentAccountOwnershipInformation14.mmClientIdentification,
					DirectDebitMandate6.mmMandateIdentification, AdditionalReference9.mmReference);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Name or number assigned by an entity to enable recognition of that entity, for example account identifier, identification assigned by a provider to identify its customers.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(GenericIdentification obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(GenericIdentification obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	protected List<ContactPoint> identificationForContactPoint;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmIdentification
	 * ContactPoint.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForContactPoint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contact point which uses a generic identification as identification."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<GenericIdentification, List<ContactPoint>> mmIdentificationForContactPoint = new MMBusinessAssociationEnd<GenericIdentification, List<ContactPoint>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForContactPoint";
			definition = "Contact point which uses a generic identification as identification.";
			minOccurs = 0;
			opposite_lazy = () -> ContactPoint.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ContactPoint.mmObject();
		}

		@Override
		public List<ContactPoint> getValue(GenericIdentification obj) {
			return obj.getIdentificationForContactPoint();
		}

		@Override
		public void setValue(GenericIdentification obj, List<ContactPoint> value) {
			obj.setIdentificationForContactPoint(value);
		}
	};
	protected AccountIdentification identificationForAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmProprietaryIdentification
	 * AccountIdentification.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account Identification which uses a generic identification as proprietary identification."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<GenericIdentification, AccountIdentification> mmIdentificationForAccount = new MMBusinessAssociationEnd<GenericIdentification, AccountIdentification>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForAccount";
			definition = "Account Identification which uses a generic identification as proprietary identification.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> AccountIdentification.mmProprietaryIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AccountIdentification.mmObject();
		}

		@Override
		public AccountIdentification getValue(GenericIdentification obj) {
			return obj.getIdentificationForAccount();
		}

		@Override
		public void setValue(GenericIdentification obj, AccountIdentification value) {
			obj.setIdentificationForAccount(value);
		}
	};
	protected PartyIdentificationInformation relatedPartyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party identified with a scheme."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<GenericIdentification, Optional<PartyIdentificationInformation>> mmRelatedPartyIdentification = new MMBusinessAssociationEnd<GenericIdentification, Optional<PartyIdentificationInformation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPartyIdentification";
			definition = "Party identified with a scheme.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PartyIdentificationInformation.mmObject();
		}

		@Override
		public Optional<PartyIdentificationInformation> getValue(GenericIdentification obj) {
			return obj.getRelatedPartyIdentification();
		}

		@Override
		public void setValue(GenericIdentification obj, Optional<PartyIdentificationInformation> value) {
			obj.setRelatedPartyIdentification(value.orElse(null));
		}
	};
	protected ISODate issueDate;
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
	 * {@linkplain com.tools20022.repository.msg.AlternateIdentification4#mmIssueDate
	 * AlternateIdentification4.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification82#mmIssueDate
	 * GenericIdentification82.mmIssueDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the identification was issued."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<GenericIdentification, ISODate> mmIssueDate = new MMBusinessAttribute<GenericIdentification, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(AlternateIdentification4.mmIssueDate, GenericIdentification82.mmIssueDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IssueDate";
			definition = "Date at which the identification was issued.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(GenericIdentification obj) {
			return obj.getIssueDate();
		}

		@Override
		public void setValue(GenericIdentification obj, ISODate value) {
			obj.setIssueDate(value);
		}
	};
	protected ISODate expiryDate;
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
	 * {@linkplain com.tools20022.repository.msg.AlternateIdentification4#mmExpiryDate
	 * AlternateIdentification4.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification82#mmExpiryDate
	 * GenericIdentification82.mmExpiryDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the identification expires."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<GenericIdentification, ISODate> mmExpiryDate = new MMBusinessAttribute<GenericIdentification, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(AlternateIdentification4.mmExpiryDate, GenericIdentification82.mmExpiryDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpiryDate";
			definition = "Date at which the identification expires.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(GenericIdentification obj) {
			return obj.getExpiryDate();
		}

		@Override
		public void setValue(GenericIdentification obj, ISODate value) {
			obj.setExpiryDate(value);
		}
	};
	protected Scheme scheme;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Scheme#mmIdentification
	 * Scheme.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Scheme Scheme}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericFinancialIdentification1#mmSchemeName
	 * GenericFinancialIdentification1.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericAccountIdentification1#mmSchemeName
	 * GenericAccountIdentification1.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericOrganisationIdentification1#mmSchemeName
	 * GenericOrganisationIdentification1.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericPersonIdentification1#mmSchemeName
	 * GenericPersonIdentification1.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingVenueIdentification2#mmType
	 * TradingVenueIdentification2.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Scheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information regarding an enumerated code list and its owner."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<GenericIdentification, Scheme> mmScheme = new MMBusinessAssociationEnd<GenericIdentification, Scheme>() {
		{
			derivation_lazy = () -> Arrays.asList(GenericFinancialIdentification1.mmSchemeName, GenericAccountIdentification1.mmSchemeName, GenericOrganisationIdentification1.mmSchemeName, GenericPersonIdentification1.mmSchemeName,
					TradingVenueIdentification2.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Scheme";
			definition = "Information regarding an enumerated code list and its owner.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Scheme.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Scheme.mmObject();
		}

		@Override
		public Scheme getValue(GenericIdentification obj) {
			return obj.getScheme();
		}

		@Override
		public void setValue(GenericIdentification obj, Scheme value) {
			obj.setScheme(value);
		}
	};
	protected SecuritiesCertificate identificationForSecuritiesCertificate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#mmNumber
	 * SecuritiesCertificate.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate
	 * SecuritiesCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForSecuritiesCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities certificate which uses a generic identification as certificate number."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<GenericIdentification, SecuritiesCertificate> mmIdentificationForSecuritiesCertificate = new MMBusinessAssociationEnd<GenericIdentification, SecuritiesCertificate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForSecuritiesCertificate";
			definition = "Securities certificate which uses a generic identification as certificate number.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesCertificate.mmNumber;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesCertificate.mmObject();
		}

		@Override
		public SecuritiesCertificate getValue(GenericIdentification obj) {
			return obj.getIdentificationForSecuritiesCertificate();
		}

		@Override
		public void setValue(GenericIdentification obj, SecuritiesCertificate value) {
			obj.setIdentificationForSecuritiesCertificate(value);
		}
	};
	protected LotBreakdown identificationForLot;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotNumber
	 * LotBreakdown.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LotBreakdown
	 * LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForLot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Lot breakdown which uses a generic identification as lot number."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<GenericIdentification, Optional<LotBreakdown>> mmIdentificationForLot = new MMBusinessAssociationEnd<GenericIdentification, Optional<LotBreakdown>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForLot";
			definition = "Lot breakdown which uses a generic identification as lot number.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> LotBreakdown.mmLotNumber;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> LotBreakdown.mmObject();
		}

		@Override
		public Optional<LotBreakdown> getValue(GenericIdentification obj) {
			return obj.getIdentificationForLot();
		}

		@Override
		public void setValue(GenericIdentification obj, Optional<LotBreakdown> value) {
			obj.setIdentificationForLot(value.orElse(null));
		}
	};
	protected List<InformationPartyRole> partyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#mmGenericIdentification
	 * InformationPartyRole.mmGenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
	 * InformationPartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification6#mmIssuer
	 * PersonIdentification6.mmIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity8#mmIssuer
	 * ProprietaryQuantity8.mmIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity7#mmIssuer
	 * ProprietaryQuantity7.mmIssuer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity that assigns the identification."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<GenericIdentification, List<InformationPartyRole>> mmPartyRole = new MMBusinessAssociationEnd<GenericIdentification, List<InformationPartyRole>>() {
		{
			derivation_lazy = () -> Arrays.asList(PersonIdentification6.mmIssuer, ProprietaryQuantity8.mmIssuer, ProprietaryQuantity7.mmIssuer);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Entity that assigns the identification.";
			minOccurs = 0;
			opposite_lazy = () -> InformationPartyRole.mmGenericIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InformationPartyRole.mmObject();
		}

		@Override
		public List<InformationPartyRole> getValue(GenericIdentification obj) {
			return obj.getPartyRole();
		}

		@Override
		public void setValue(GenericIdentification obj, List<InformationPartyRole> value) {
			obj.setPartyRole(value);
		}
	};
	protected CashProceedsDefinition identificationForCashProceedsIncome;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmIncomeType
	 * CashProceedsDefinition.mmIncomeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForCashProceedsIncome"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash proceeds definition which uses a generic identification as type of income."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<GenericIdentification, Optional<CashProceedsDefinition>> mmIdentificationForCashProceedsIncome = new MMBusinessAssociationEnd<GenericIdentification, Optional<CashProceedsDefinition>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForCashProceedsIncome";
			definition = "Cash proceeds definition which uses a generic identification as type of income.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CashProceedsDefinition.mmIncomeType;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashProceedsDefinition.mmObject();
		}

		@Override
		public Optional<CashProceedsDefinition> getValue(GenericIdentification obj) {
			return obj.getIdentificationForCashProceedsIncome();
		}

		@Override
		public void setValue(GenericIdentification obj, Optional<CashProceedsDefinition> value) {
			obj.setIdentificationForCashProceedsIncome(value.orElse(null));
		}
	};
	protected StatusReason relatedStatusReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmDataSourceScheme
	 * StatusReason.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.StatusReason
	 * StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status reason for which a data source scheme is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<GenericIdentification, StatusReason> mmRelatedStatusReason = new MMBusinessAssociationEnd<GenericIdentification, StatusReason>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedStatusReason";
			definition = "Specifies the status reason for which a data source scheme is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> StatusReason.mmDataSourceScheme;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> StatusReason.mmObject();
		}

		@Override
		public StatusReason getValue(GenericIdentification obj) {
			return obj.getRelatedStatusReason();
		}

		@Override
		public void setValue(GenericIdentification obj, StatusReason value) {
			obj.setRelatedStatusReason(value);
		}
	};
	protected List<BankTransaction> identificationForBankTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction#mmProprietaryIdentification
	 * BankTransaction.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BankTransaction
	 * BankTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForBankTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bank transaction which uses a generic identification as proprietary identification."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<GenericIdentification, List<BankTransaction>> mmIdentificationForBankTransaction = new MMBusinessAssociationEnd<GenericIdentification, List<BankTransaction>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForBankTransaction";
			definition = "Bank transaction which uses a generic identification as proprietary identification.";
			minOccurs = 0;
			opposite_lazy = () -> BankTransaction.mmProprietaryIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BankTransaction.mmObject();
		}

		@Override
		public List<BankTransaction> getValue(GenericIdentification obj) {
			return obj.getIdentificationForBankTransaction();
		}

		@Override
		public void setValue(GenericIdentification obj, List<BankTransaction> value) {
			obj.setIdentificationForBankTransaction(value);
		}
	};
	protected AccountIdentification identificationForAccountCostReferencePattern;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmCostReferencePattern
	 * AccountIdentification.mmCostReferencePattern}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForAccountCostReferencePattern"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account identification for which a cost reference pattern is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<GenericIdentification, Optional<AccountIdentification>> mmIdentificationForAccountCostReferencePattern = new MMBusinessAssociationEnd<GenericIdentification, Optional<AccountIdentification>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForAccountCostReferencePattern";
			definition = "Account identification for which a cost reference pattern is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> AccountIdentification.mmCostReferencePattern;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AccountIdentification.mmObject();
		}

		@Override
		public Optional<AccountIdentification> getValue(GenericIdentification obj) {
			return obj.getIdentificationForAccountCostReferencePattern();
		}

		@Override
		public void setValue(GenericIdentification obj, Optional<AccountIdentification> value) {
			obj.setIdentificationForAccountCostReferencePattern(value.orElse(null));
		}
	};
	protected Account account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Account#mmType
	 * Account.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account for which a type is specified"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<GenericIdentification, Account> mmAccount = new MMBusinessAssociationEnd<GenericIdentification, Account>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account for which a type is specified";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Account.mmType;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Account.mmObject();
		}

		@Override
		public Account getValue(GenericIdentification obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(GenericIdentification obj, Account value) {
			obj.setAccount(value);
		}
	};
	protected SystemIdentification relatedSystemIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmIdentification
	 * SystemIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification
	 * SystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSystemIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "System identification which uses a generic identification."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<GenericIdentification, SystemIdentification> mmRelatedSystemIdentification = new MMBusinessAssociationEnd<GenericIdentification, SystemIdentification>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSystemIdentification";
			definition = "System identification which uses a generic identification.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SystemIdentification.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SystemIdentification.mmObject();
		}

		@Override
		public SystemIdentification getValue(GenericIdentification obj) {
			return obj.getRelatedSystemIdentification();
		}

		@Override
		public void setValue(GenericIdentification obj, SystemIdentification value) {
			obj.setRelatedSystemIdentification(value);
		}
	};
	protected Interest identificationForInterestName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestName
	 * Interest.mmInterestName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForInterestName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest which uses a generic identification as name."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<GenericIdentification, Optional<Interest>> mmIdentificationForInterestName = new MMBusinessAssociationEnd<GenericIdentification, Optional<Interest>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForInterestName";
			definition = "Interest which uses a generic identification as name.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Interest.mmInterestName;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Interest.mmObject();
		}

		@Override
		public Optional<Interest> getValue(GenericIdentification obj) {
			return obj.getIdentificationForInterestName();
		}

		@Override
		public void setValue(GenericIdentification obj, Optional<Interest> value) {
			obj.setIdentificationForInterestName(value.orElse(null));
		}
	};
	protected CashAccountService relatedCashAccountService;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmIdentification
	 * CashAccountService.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCashAccountService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash account service identified in a generic way."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<GenericIdentification, CashAccountService> mmRelatedCashAccountService = new MMBusinessAssociationEnd<GenericIdentification, CashAccountService>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCashAccountService";
			definition = "Cash account service identified in a generic way.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CashAccountService.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashAccountService.mmObject();
		}

		@Override
		public CashAccountService getValue(GenericIdentification obj) {
			return obj.getRelatedCashAccountService();
		}

		@Override
		public void setValue(GenericIdentification obj, CashAccountService value) {
			obj.setRelatedCashAccountService(value);
		}
	};
	protected InvestmentFundClass identificationForInvestmentFundClass;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmFundClassification
	 * InvestmentFundClass.mmFundClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForInvestmentFundClass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund class which uses a generic identification as fund classification."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<GenericIdentification, InvestmentFundClass> mmIdentificationForInvestmentFundClass = new MMBusinessAssociationEnd<GenericIdentification, InvestmentFundClass>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForInvestmentFundClass";
			definition = "Investment fund class which uses a generic identification as fund classification.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> InvestmentFundClass.mmFundClassification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestmentFundClass.mmObject();
		}

		@Override
		public InvestmentFundClass getValue(GenericIdentification obj) {
			return obj.getIdentificationForInvestmentFundClass();
		}

		@Override
		public void setValue(GenericIdentification obj, InvestmentFundClass value) {
			obj.setIdentificationForInvestmentFundClass(value);
		}
	};
	protected Location identifiedLocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmIdentification
	 * Location.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentifiedLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Location for which an identification is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<GenericIdentification, Location> mmIdentifiedLocation = new MMBusinessAssociationEnd<GenericIdentification, Location>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentifiedLocation";
			definition = "Location for which an identification is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Location.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Location.mmObject();
		}

		@Override
		public Location getValue(GenericIdentification obj) {
			return obj.getIdentifiedLocation();
		}

		@Override
		public void setValue(GenericIdentification obj, Location value) {
			obj.setIdentifiedLocation(value);
		}
	};
	protected SecuritiesIdentification relatedSecuritiesIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmGenericIdentification
	 * SecuritiesIdentification.mmGenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities identification for which generic identification elements and scheme are provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<GenericIdentification, SecuritiesIdentification> mmRelatedSecuritiesIdentification = new MMBusinessAssociationEnd<GenericIdentification, SecuritiesIdentification>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesIdentification";
			definition = "Securities identification for which generic identification elements and scheme are provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesIdentification.mmGenericIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesIdentification.mmObject();
		}

		@Override
		public SecuritiesIdentification getValue(GenericIdentification obj) {
			return obj.getRelatedSecuritiesIdentification();
		}

		@Override
		public void setValue(GenericIdentification obj, SecuritiesIdentification value) {
			obj.setRelatedSecuritiesIdentification(value);
		}
	};
	protected Document identifiedDocument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmDocumentIdentification
	 * Document.mmDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentifiedDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document for which an identification is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<GenericIdentification, Document> mmIdentifiedDocument = new MMBusinessAssociationEnd<GenericIdentification, Document>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentifiedDocument";
			definition = "Document for which an identification is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Document.mmDocumentIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Document.mmObject();
		}

		@Override
		public Document getValue(GenericIdentification obj) {
			return obj.getIdentifiedDocument();
		}

		@Override
		public void setValue(GenericIdentification obj, Document value) {
			obj.setIdentifiedDocument(value);
		}
	};
	protected PurchaseOrder relatedPurchaseOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#mmIdentification
	 * PurchaseOrder.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PurchaseOrder
	 * PurchaseOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPurchaseOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Purchase order for which an identification is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<GenericIdentification, PurchaseOrder> mmRelatedPurchaseOrder = new MMBusinessAssociationEnd<GenericIdentification, PurchaseOrder>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPurchaseOrder";
			definition = "Purchase order for which an identification is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> PurchaseOrder.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PurchaseOrder.mmObject();
		}

		@Override
		public PurchaseOrder getValue(GenericIdentification obj) {
			return obj.getRelatedPurchaseOrder();
		}

		@Override
		public void setValue(GenericIdentification obj, PurchaseOrder value) {
			obj.setRelatedPurchaseOrder(value);
		}
	};
	protected RegisteredContract relatedCertificate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmCertificate
	 * RegisteredContract.mmCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Related certificate against which all transactions in the scope of the regulatory requirements are registered."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<GenericIdentification, RegisteredContract> mmRelatedCertificate = new MMBusinessAssociationEnd<GenericIdentification, RegisteredContract>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCertificate";
			definition = "Related certificate against which all transactions in the scope of the regulatory requirements are registered.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> RegisteredContract.mmCertificate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> RegisteredContract.mmObject();
		}

		@Override
		public RegisteredContract getValue(GenericIdentification obj) {
			return obj.getRelatedCertificate();
		}

		@Override
		public void setValue(GenericIdentification obj, RegisteredContract value) {
			obj.setRelatedCertificate(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GenericIdentification";
				definition = "Information related to a non-standardised identification, such as a proprietary party identification or account identification.";
				associationDomain_lazy = () -> Arrays.asList(InvestmentFundClass.mmFundClassification, SecuritiesIdentification.mmGenericIdentification, InformationPartyRole.mmGenericIdentification, ContactPoint.mmIdentification,
						PartyIdentificationInformation.mmOtherIdentification, Account.mmType, AccountIdentification.mmProprietaryIdentification, AccountIdentification.mmCostReferencePattern, Location.mmIdentification,
						Scheme.mmIdentification, Document.mmDocumentIdentification, StatusReason.mmDataSourceScheme, SystemIdentification.mmIdentification, LotBreakdown.mmLotNumber, CashAccountService.mmIdentification,
						SecuritiesCertificate.mmNumber, Interest.mmInterestName, CashProceedsDefinition.mmIncomeType, BankTransaction.mmProprietaryIdentification, PurchaseOrder.mmIdentification, RegisteredContract.mmCertificate);
				derivationElement_lazy = () -> Arrays.asList(GenericIdentification21.mmType, GenericIdentification58.mmType, GenericIdentification78.mmType, GenericIdentification80.mmType, AlternateIdentification4.mmIssuerCountry,
						OtherIdentification4Choice.mmProprietary, GenericIdentification81.mmIdentificationType, ReversedStatus2Choice.mmDataSourceScheme, PostalAddress21.mmCareOf, GenericIdentification82.mmIssuerCountry,
						OtherIdentification3Choice.mmProprietary);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.mmIdentification, com.tools20022.repository.entity.GenericIdentification.mmIdentificationForContactPoint,
						com.tools20022.repository.entity.GenericIdentification.mmIdentificationForAccount, com.tools20022.repository.entity.GenericIdentification.mmRelatedPartyIdentification,
						com.tools20022.repository.entity.GenericIdentification.mmIssueDate, com.tools20022.repository.entity.GenericIdentification.mmExpiryDate, com.tools20022.repository.entity.GenericIdentification.mmScheme,
						com.tools20022.repository.entity.GenericIdentification.mmIdentificationForSecuritiesCertificate, com.tools20022.repository.entity.GenericIdentification.mmIdentificationForLot,
						com.tools20022.repository.entity.GenericIdentification.mmPartyRole, com.tools20022.repository.entity.GenericIdentification.mmIdentificationForCashProceedsIncome,
						com.tools20022.repository.entity.GenericIdentification.mmRelatedStatusReason, com.tools20022.repository.entity.GenericIdentification.mmIdentificationForBankTransaction,
						com.tools20022.repository.entity.GenericIdentification.mmIdentificationForAccountCostReferencePattern, com.tools20022.repository.entity.GenericIdentification.mmAccount,
						com.tools20022.repository.entity.GenericIdentification.mmRelatedSystemIdentification, com.tools20022.repository.entity.GenericIdentification.mmIdentificationForInterestName,
						com.tools20022.repository.entity.GenericIdentification.mmRelatedCashAccountService, com.tools20022.repository.entity.GenericIdentification.mmIdentificationForInvestmentFundClass,
						com.tools20022.repository.entity.GenericIdentification.mmIdentifiedLocation, com.tools20022.repository.entity.GenericIdentification.mmRelatedSecuritiesIdentification,
						com.tools20022.repository.entity.GenericIdentification.mmIdentifiedDocument, com.tools20022.repository.entity.GenericIdentification.mmRelatedPurchaseOrder,
						com.tools20022.repository.entity.GenericIdentification.mmRelatedCertificate);
				derivationComponent_lazy = () -> Arrays.asList(SimpleIdentificationInformation.mmObject(), GenericIdentification1.mmObject(), GenericIdentification7.mmObject(), AdditionalReference2.mmObject(),
						AdditionalReference3.mmObject(), GenericIdentification13.mmObject(), GenericIdentification20.mmObject(), GenericIdentification47.mmObject(), SimpleIdentificationInformation2.mmObject(),
						GenericIdentification4.mmObject(), GenericIdentification19.mmObject(), GenericIdentification37.mmObject(), GenericIdentification21.mmObject(), GenericIdentification27.mmObject(),
						SimpleIdentificationInformation4.mmObject(), GenericIdentification6.mmObject(), GenericIdentification5.mmObject(), GenericIdentification38.mmObject(), GenericIdentification29.mmObject(),
						GenericIdentification36.mmObject(), GenericIdentification16.mmObject(), GenericIdentification30.mmObject(), GenericIdentification40.mmObject(), GenericIdentification49.mmObject(), GenericIdentification56.mmObject(),
						GenericIdentification58.mmObject(), AdditionalReference6.mmObject(), GenericIdentification78.mmObject(), GenericIdentification80.mmObject(), AlternateIdentification4.mmObject(),
						OtherIdentification4Choice.mmObject(), AdditionalReference7.mmObject(), GenericIdentification81.mmObject(), GenericIdentification82.mmObject(), OtherIdentification3Choice.mmObject(), AdditionalReference8.mmObject(),
						GenericIdentification164.mmObject(), AdditionalReference9.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return GenericIdentification.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public GenericIdentification setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public List<ContactPoint> getIdentificationForContactPoint() {
		return identificationForContactPoint == null ? identificationForContactPoint = new ArrayList<>() : identificationForContactPoint;
	}

	public GenericIdentification setIdentificationForContactPoint(List<ContactPoint> identificationForContactPoint) {
		this.identificationForContactPoint = Objects.requireNonNull(identificationForContactPoint);
		return this;
	}

	public AccountIdentification getIdentificationForAccount() {
		return identificationForAccount;
	}

	public GenericIdentification setIdentificationForAccount(AccountIdentification identificationForAccount) {
		this.identificationForAccount = Objects.requireNonNull(identificationForAccount);
		return this;
	}

	public Optional<PartyIdentificationInformation> getRelatedPartyIdentification() {
		return relatedPartyIdentification == null ? Optional.empty() : Optional.of(relatedPartyIdentification);
	}

	public GenericIdentification setRelatedPartyIdentification(PartyIdentificationInformation relatedPartyIdentification) {
		this.relatedPartyIdentification = relatedPartyIdentification;
		return this;
	}

	public ISODate getIssueDate() {
		return issueDate;
	}

	public GenericIdentification setIssueDate(ISODate issueDate) {
		this.issueDate = Objects.requireNonNull(issueDate);
		return this;
	}

	public ISODate getExpiryDate() {
		return expiryDate;
	}

	public GenericIdentification setExpiryDate(ISODate expiryDate) {
		this.expiryDate = Objects.requireNonNull(expiryDate);
		return this;
	}

	public Scheme getScheme() {
		return scheme;
	}

	public GenericIdentification setScheme(Scheme scheme) {
		this.scheme = Objects.requireNonNull(scheme);
		return this;
	}

	public SecuritiesCertificate getIdentificationForSecuritiesCertificate() {
		return identificationForSecuritiesCertificate;
	}

	public GenericIdentification setIdentificationForSecuritiesCertificate(SecuritiesCertificate identificationForSecuritiesCertificate) {
		this.identificationForSecuritiesCertificate = Objects.requireNonNull(identificationForSecuritiesCertificate);
		return this;
	}

	public Optional<LotBreakdown> getIdentificationForLot() {
		return identificationForLot == null ? Optional.empty() : Optional.of(identificationForLot);
	}

	public GenericIdentification setIdentificationForLot(LotBreakdown identificationForLot) {
		this.identificationForLot = identificationForLot;
		return this;
	}

	public List<InformationPartyRole> getPartyRole() {
		return partyRole == null ? partyRole = new ArrayList<>() : partyRole;
	}

	public GenericIdentification setPartyRole(List<InformationPartyRole> partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}

	public Optional<CashProceedsDefinition> getIdentificationForCashProceedsIncome() {
		return identificationForCashProceedsIncome == null ? Optional.empty() : Optional.of(identificationForCashProceedsIncome);
	}

	public GenericIdentification setIdentificationForCashProceedsIncome(CashProceedsDefinition identificationForCashProceedsIncome) {
		this.identificationForCashProceedsIncome = identificationForCashProceedsIncome;
		return this;
	}

	public StatusReason getRelatedStatusReason() {
		return relatedStatusReason;
	}

	public GenericIdentification setRelatedStatusReason(StatusReason relatedStatusReason) {
		this.relatedStatusReason = Objects.requireNonNull(relatedStatusReason);
		return this;
	}

	public List<BankTransaction> getIdentificationForBankTransaction() {
		return identificationForBankTransaction == null ? identificationForBankTransaction = new ArrayList<>() : identificationForBankTransaction;
	}

	public GenericIdentification setIdentificationForBankTransaction(List<BankTransaction> identificationForBankTransaction) {
		this.identificationForBankTransaction = Objects.requireNonNull(identificationForBankTransaction);
		return this;
	}

	public Optional<AccountIdentification> getIdentificationForAccountCostReferencePattern() {
		return identificationForAccountCostReferencePattern == null ? Optional.empty() : Optional.of(identificationForAccountCostReferencePattern);
	}

	public GenericIdentification setIdentificationForAccountCostReferencePattern(AccountIdentification identificationForAccountCostReferencePattern) {
		this.identificationForAccountCostReferencePattern = identificationForAccountCostReferencePattern;
		return this;
	}

	public Account getAccount() {
		return account;
	}

	public GenericIdentification setAccount(Account account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}

	public SystemIdentification getRelatedSystemIdentification() {
		return relatedSystemIdentification;
	}

	public GenericIdentification setRelatedSystemIdentification(SystemIdentification relatedSystemIdentification) {
		this.relatedSystemIdentification = Objects.requireNonNull(relatedSystemIdentification);
		return this;
	}

	public Optional<Interest> getIdentificationForInterestName() {
		return identificationForInterestName == null ? Optional.empty() : Optional.of(identificationForInterestName);
	}

	public GenericIdentification setIdentificationForInterestName(Interest identificationForInterestName) {
		this.identificationForInterestName = identificationForInterestName;
		return this;
	}

	public CashAccountService getRelatedCashAccountService() {
		return relatedCashAccountService;
	}

	public GenericIdentification setRelatedCashAccountService(CashAccountService relatedCashAccountService) {
		this.relatedCashAccountService = Objects.requireNonNull(relatedCashAccountService);
		return this;
	}

	public InvestmentFundClass getIdentificationForInvestmentFundClass() {
		return identificationForInvestmentFundClass;
	}

	public GenericIdentification setIdentificationForInvestmentFundClass(InvestmentFundClass identificationForInvestmentFundClass) {
		this.identificationForInvestmentFundClass = Objects.requireNonNull(identificationForInvestmentFundClass);
		return this;
	}

	public Location getIdentifiedLocation() {
		return identifiedLocation;
	}

	public GenericIdentification setIdentifiedLocation(Location identifiedLocation) {
		this.identifiedLocation = Objects.requireNonNull(identifiedLocation);
		return this;
	}

	public SecuritiesIdentification getRelatedSecuritiesIdentification() {
		return relatedSecuritiesIdentification;
	}

	public GenericIdentification setRelatedSecuritiesIdentification(SecuritiesIdentification relatedSecuritiesIdentification) {
		this.relatedSecuritiesIdentification = Objects.requireNonNull(relatedSecuritiesIdentification);
		return this;
	}

	public Document getIdentifiedDocument() {
		return identifiedDocument;
	}

	public GenericIdentification setIdentifiedDocument(Document identifiedDocument) {
		this.identifiedDocument = Objects.requireNonNull(identifiedDocument);
		return this;
	}

	public PurchaseOrder getRelatedPurchaseOrder() {
		return relatedPurchaseOrder;
	}

	public GenericIdentification setRelatedPurchaseOrder(PurchaseOrder relatedPurchaseOrder) {
		this.relatedPurchaseOrder = Objects.requireNonNull(relatedPurchaseOrder);
		return this;
	}

	public RegisteredContract getRelatedCertificate() {
		return relatedCertificate;
	}

	public GenericIdentification setRelatedCertificate(RegisteredContract relatedCertificate) {
		this.relatedCertificate = Objects.requireNonNull(relatedCertificate);
		return this;
	}
}