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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Unique and unambiguous way to identify an organisation.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="OrganisationIdentification"
 * src="doc-files/OrganisationIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
 * PartyIdentificationInformation}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmBICFI
 * OrganisationIdentification.mmBICFI}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmAnyBIC
 * OrganisationIdentification.mmAnyBIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmOrganisationName
 * OrganisationIdentification.mmOrganisationName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmOrganisation
 * OrganisationIdentification.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmClearingSystemMemberIdentificationType
 * OrganisationIdentification.mmClearingSystemMemberIdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmBICNonFI
 * OrganisationIdentification.mmBICNonFI}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmEANGLN
 * OrganisationIdentification.mmEANGLN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmCHIPSUniversalIdentifier
 * OrganisationIdentification.mmCHIPSUniversalIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmDUNS
 * OrganisationIdentification.mmDUNS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmBankPartyIdentification
 * OrganisationIdentification.mmBankPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmMIC
 * OrganisationIdentification.mmMIC}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
 * Organisation.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationName#mmOrganisation
 * OrganisationName.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmOrganisationIdentification
 * CashClearingSystemMember.mmOrganisationIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification8#mmOther
 * FinancialInstitutionIdentification8.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party10Choice#mmOrganisationIdentification
 * Party10Choice.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party9Choice#mmOrganisationIdentification
 * Party9Choice.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party9Choice#mmFinancialInstitutionIdentification
 * Party9Choice.mmFinancialInstitutionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradingVenueIdentification1Choice#mmOther
 * TradingVenueIdentification1Choice.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice#mmNameAndAddress
 * FinancialInstitutionIdentification7Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification10#mmParty
 * FinancialInstitutionIdentification10.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification8Choice#mmNameAndAddress
 * FinancialInstitutionIdentification8Choice.mmNameAndAddress}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BranchData BranchData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericFinancialIdentification1
 * GenericFinancialIdentification1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification8
 * FinancialInstitutionIdentification8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BranchData2 BranchData2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OrganisationIdentificationSchemeName1Choice
 * OrganisationIdentificationSchemeName1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericOrganisationIdentification1
 * GenericOrganisationIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrganisationIdentification7
 * OrganisationIdentification7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrganisationIdentification5
 * OrganisationIdentification5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradingVenueIdentification1Choice
 * TradingVenueIdentification1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionTransmission2
 * SecuritiesTransactionTransmission2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice
 * FinancialInstitutionIdentification7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradingVenueIdentification2
 * TradingVenueIdentification2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification10
 * FinancialInstitutionIdentification10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification8Choice
 * FinancialInstitutionIdentification8Choice}</li>
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
 * "OrganisationIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Unique and unambiguous way to identify an organisation."</li>
 * </ul>
 */
public class OrganisationIdentification extends PartyIdentificationInformation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected BICFIIdentifier bICFI;
	/**
	 * Code allocated to a financial institution by the ISO 9362 Registration
	 * Authority as described in ISO 9362
	 * "Banking - Banking telecommunication messages - Business identifier code (BIC)"
	 * .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICFIIdentifier
	 * BICFIIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount21#mmServicer
	 * CashAccount21.mmServicer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount22#mmServicer
	 * CashAccount22.mmServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification8#mmBICFI
	 * FinancialInstitutionIdentification8.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification32Choice#mmBIC
	 * PartyIdentification32Choice.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification35Choice#mmBIC
	 * PartyIdentification35Choice.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification54#mmBIC
	 * PartyIdentification54.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification68Choice#mmBIC
	 * PartyIdentification68Choice.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification34Choice#mmBIC
	 * PartyIdentification34Choice.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification94Choice#mmBICFI
	 * PartyIdentification94Choice.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice#mmBICFI
	 * FinancialInstitutionIdentification7Choice.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification102Choice#mmAnyBIC
	 * PartyIdentification102Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification101Choice#mmBIC
	 * PartyIdentification101Choice.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification8Choice#mmBICFI
	 * FinancialInstitutionIdentification8Choice.mmBICFI}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BICFI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\"."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBICFI = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CashAccount21.mmServicer, CashAccount22.mmServicer, FinancialInstitutionIdentification8.mmBICFI, PartyIdentification32Choice.mmBIC, PartyIdentification35Choice.mmBIC,
					PartyIdentification54.mmBIC, PartyIdentification68Choice.mmBIC, PartyIdentification34Choice.mmBIC, PartyIdentification94Choice.mmBICFI, FinancialInstitutionIdentification7Choice.mmBICFI,
					PartyIdentification102Choice.mmAnyBIC, PartyIdentification101Choice.mmBIC, FinancialInstitutionIdentification8Choice.mmBICFI);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BICFI";
			definition = "Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BICFIIdentifier.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return OrganisationIdentification.class.getMethod("getBICFI", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AnyBICIdentifier anyBIC;
	/**
	 * Code allocated to a financial or non-financial institution by the ISO
	 * 9362 Registration Authority, as described in ISO 9362
	 * "Banking - Banking telecommunication messages - Business identifier code (BIC)"
	 * .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification1Choice#mmBICOrBEI
	 * PartyIdentification1Choice.mmBICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice#mmBICOrBEI
	 * PartyIdentification2Choice.mmBICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification7#mmAnyBIC
	 * OrganisationIdentification7.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification44Choice#mmAnyBIC
	 * PartyIdentification44Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndAnyBICIdentifier1#mmIdentification
	 * SafekeepingPlaceTypeAndAnyBICIdentifier1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification40Choice#mmAnyBIC
	 * PartyIdentification40Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification3#mmBICOrBEI
	 * PartyIdentification3.mmBICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification70Choice#mmAnyBIC
	 * PartyIdentification70Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification44#mmAnyBIC
	 * PartyIdentification44.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PlaceOfTradeIdentification1Choice#mmParty
	 * PlaceOfTradeIdentification1Choice.mmParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount17#mmCorrespondentBankIdentification
	 * CashAccount17.mmCorrespondentBankIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification33Choice#mmAnyBIC
	 * PartyIdentification33Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification72Choice#mmAnyBIC
	 * PartyIdentification72Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice#mmAnyBIC
	 * PartyIdentification71Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification62#mmBICFI
	 * PartyIdentification62.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification64#mmAnyBIC
	 * PartyIdentification64.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification75Choice#mmAnyBIC
	 * PartyIdentification75Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification83Choice#mmAnyBIC
	 * PartyIdentification83Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification90Choice#mmAnyBIC
	 * PartyIdentification90Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification92Choice#mmAnyBIC
	 * PartyIdentification92Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmPlaceOfClearing
	 * SecuritiesTradeDetails51.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#mmPlaceOfClearing
	 * SecuritiesTradeDetails53.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#mmPlaceOfClearing
	 * SecuritiesTradeDetails55.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmPlaceOfClearing
	 * SecuritiesTradeDetails56.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54#mmPlaceOfClearing
	 * SecuritiesTradeDetails54.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#mmPlaceOfClearing
	 * SecuritiesTradeDetails52.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification93Choice#mmAnyBIC
	 * PartyIdentification93Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#mmPlaceOfClearing
	 * SecuritiesTradeDetails50.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification97Choice#mmAnyBIC
	 * PartyIdentification97Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification96Choice#mmAnyBIC
	 * PartyIdentification96Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification99Choice#mmAnyBIC
	 * PartyIdentification99Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification100Choice#mmAnyBIC
	 * PartyIdentification100Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#mmPlaceOfClearing
	 * SecuritiesTradeDetails67.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmPlaceOfClearing
	 * SecuritiesTradeDetails68.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmPlaceOfClearing
	 * TransactionDetails97.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#mmPlaceOfClearing
	 * TransactionDetails96.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmPlaceOfClearing
	 * TransactionDetails95.mmPlaceOfClearing}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnyBIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\"."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAnyBIC = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PartyIdentification1Choice.mmBICOrBEI, PartyIdentification2Choice.mmBICOrBEI, OrganisationIdentification7.mmAnyBIC, PartyIdentification44Choice.mmAnyBIC,
					SafekeepingPlaceTypeAndAnyBICIdentifier1.mmIdentification, PartyIdentification40Choice.mmAnyBIC, PartyIdentification3.mmBICOrBEI, PartyIdentification70Choice.mmAnyBIC, PartyIdentification44.mmAnyBIC,
					PlaceOfTradeIdentification1Choice.mmParty, CashAccount17.mmCorrespondentBankIdentification, PartyIdentification33Choice.mmAnyBIC, PartyIdentification72Choice.mmAnyBIC, PartyIdentification71Choice.mmAnyBIC,
					PartyIdentification62.mmBICFI, PartyIdentification64.mmAnyBIC, PartyIdentification75Choice.mmAnyBIC, PartyIdentification83Choice.mmAnyBIC, PartyIdentification90Choice.mmAnyBIC, PartyIdentification92Choice.mmAnyBIC,
					SecuritiesTradeDetails51.mmPlaceOfClearing, SecuritiesTradeDetails53.mmPlaceOfClearing, SecuritiesTradeDetails55.mmPlaceOfClearing, SecuritiesTradeDetails56.mmPlaceOfClearing, SecuritiesTradeDetails54.mmPlaceOfClearing,
					SecuritiesTradeDetails52.mmPlaceOfClearing, PartyIdentification93Choice.mmAnyBIC, SecuritiesTradeDetails50.mmPlaceOfClearing, PartyIdentification97Choice.mmAnyBIC, PartyIdentification96Choice.mmAnyBIC,
					PartyIdentification99Choice.mmAnyBIC, PartyIdentification100Choice.mmAnyBIC, SecuritiesTradeDetails67.mmPlaceOfClearing, SecuritiesTradeDetails68.mmPlaceOfClearing, TransactionDetails97.mmPlaceOfClearing,
					TransactionDetails96.mmPlaceOfClearing, TransactionDetails95.mmPlaceOfClearing);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AnyBIC";
			definition = "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return OrganisationIdentification.class.getMethod("getAnyBIC", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.OrganisationName> organisationName;
	/**
	 * Name by which an organisation is known and which is usually used to
	 * identify that organisation. It is derived from the association between
	 * PartyIdentificationInformation and PartyName.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationName#mmOrganisation
	 * OrganisationName.mmOrganisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.OrganisationName
	 * OrganisationName}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation21#mmName
	 * Organisation21.mmName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name by which an organisation is known and which is usually used to identify that organisation. It is derived from the association between PartyIdentificationInformation and PartyName."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOrganisationName = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Organisation21.mmName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrganisationName";
			definition = "Name by which an organisation is known and which is usually used to identify that organisation. It is derived from the association between PartyIdentificationInformation and PartyName.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationName.mmOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.OrganisationName.mmObject();
		}
	};
	protected Organisation organisation;
	/**
	 * Organisation which is identified
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Organisation
	 * Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Organisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Organisation which is identified"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOrganisation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Organisation";
			definition = "Organisation which is identified";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.mmOrganisationIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CashClearingSystemMember> clearingSystemMemberIdentificationType;
	/**
	 * Unique and unambiguous identifier of a clearing system member, assigned
	 * by the system or system administrator.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmOrganisationIdentification
	 * CashClearingSystemMember.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification8#mmClearingSystemMemberIdentification
	 * FinancialInstitutionIdentification8.mmClearingSystemMemberIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice#mmClearingSystemMemberIdentification
	 * FinancialInstitutionIdentification7Choice.
	 * mmClearingSystemMemberIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification8Choice#mmClearingSystemMemberIdentification
	 * FinancialInstitutionIdentification8Choice.
	 * mmClearingSystemMemberIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystemMemberIdentificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of a clearing system member, assigned by the system or system administrator."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmClearingSystemMemberIdentificationType = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstitutionIdentification8.mmClearingSystemMemberIdentification, FinancialInstitutionIdentification7Choice.mmClearingSystemMemberIdentification,
					FinancialInstitutionIdentification8Choice.mmClearingSystemMemberIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingSystemMemberIdentificationType";
			definition = "Unique and unambiguous identifier of a clearing system member, assigned by the system or system administrator.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmOrganisationIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmObject();
		}
	};
	protected BICNonFIIdentifier bICNonFI;
	/**
	 * Code allocated to a non-financial institution by the ISO 9362
	 * Registration Authority as described in ISO 9362
	 * "Banking - Banking telecommunication messages - Business identifier code (BIC)"
	 * .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICNonFIIdentifier
	 * BICNonFIIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmIssuerIdentification
	 * FinancialInstrumentStipulations2.mmIssuerIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BICNonFI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code allocated to a non-financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\"."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBICNonFI = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentStipulations2.mmIssuerIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BICNonFI";
			definition = "Code allocated to a non-financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BICNonFIIdentifier.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return OrganisationIdentification.class.getMethod("getBICNonFI", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected EANGLNIdentifier eANGLN;
	/**
	 * Global Location Number. A non-significant reference number used to
	 * identify legal entities, functional entities, or physical entities
	 * according to the European Association for Numbering (EAN) numbering
	 * scheme rules. The number is used to retrieve detailed information that is
	 * linked to it.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.EANGLNIdentifier
	 * EANGLNIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EANGLN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Global Location Number. A non-significant reference number used to identify legal entities, functional entities, or physical entities according to the European Association for Numbering (EAN) numbering scheme rules. The number is used to retrieve detailed information that is linked to it."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEANGLN = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EANGLN";
			definition = "Global Location Number. A non-significant reference number used to identify legal entities, functional entities, or physical entities according to the European Association for Numbering (EAN) numbering scheme rules. The number is used to retrieve detailed information that is linked to it.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EANGLNIdentifier.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return OrganisationIdentification.class.getMethod("getEANGLN", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CHIPSUniversalIdentifier cHIPSUniversalIdentifier;
	/**
	 * (United States) Clearing House Interbank Payments System (CHIPS)
	 * Universal Identification (UID). Identifies entities that own accounts at
	 * CHIPS participating financial institutions, through which CHIPS payments
	 * are effected. The CHIPS UID is assigned by the New York Clearing House.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CHIPSUniversalIdentifier
	 * CHIPSUniversalIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CHIPSUniversalIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "(United States) Clearing House Interbank Payments System (CHIPS) Universal Identification (UID). Identifies entities that own accounts at CHIPS participating financial institutions, through which CHIPS payments are effected. The CHIPS UID is assigned by the New York Clearing House."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCHIPSUniversalIdentifier = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CHIPSUniversalIdentifier";
			definition = "(United States) Clearing House Interbank Payments System (CHIPS) Universal Identification (UID). Identifies entities that own accounts at CHIPS participating financial institutions, through which CHIPS payments are effected. The CHIPS UID is assigned by the New York Clearing House.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> com.tools20022.repository.datatype.CHIPSUniversalIdentifier.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return OrganisationIdentification.class.getMethod("getCHIPSUniversalIdentifier", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DunsIdentifier dUNS;
	/**
	 * Data Universal Numbering System. A unique identification number provided
	 * by Dun &amp; Bradstreet to identify an organization.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DunsIdentifier
	 * DunsIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DUNS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data Universal Numbering System. A unique identification number provided by Dun &amp; Bradstreet to identify an organization."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDUNS = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DUNS";
			definition = "Data Universal Numbering System. A unique identification number provided by Dun & Bradstreet to identify an organization.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DunsIdentifier.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return OrganisationIdentification.class.getMethod("getDUNS", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text bankPartyIdentification;
	/**
	 * Unique and unambiguous assignment made by a specific bank to identify a
	 * relationship as defined between the bank and its client.
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
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankPartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous assignment made by a specific bank to identify a relationship as defined between the bank and its client."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBankPartyIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BankPartyIdentification";
			definition = "Unique and unambiguous assignment made by a specific bank to identify a relationship as defined between the bank and its client.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return OrganisationIdentification.class.getMethod("getBankPartyIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MICIdentifier mIC;
	/**
	 * Market Identifier Code. Identification of a financial market, as
	 * stipulated in the norm ISO 10383
	 * "Codes for exchanges and market identifications".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.MICIdentifier
	 * MICIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketIdentification1Choice#mmMarketIdentifierCode
	 * MarketIdentification1Choice.mmMarketIdentifierCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketIdentification3Choice#mmMarketIdentifierCode
	 * MarketIdentification3Choice.mmMarketIdentifierCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketIdentification3Choice#mmDescription
	 * MarketIdentification3Choice.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceSourceFormatChoice#mmLocalMarketPlace
	 * PriceSourceFormatChoice.mmLocalMarketPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PlaceOfTradeIdentification1Choice#mmExchange
	 * PlaceOfTradeIdentification1Choice.mmExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingContactPerson2#mmPlaceOfListing
	 * MeetingContactPerson2.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradingVenueIdentification1Choice#mmMarketIdentificationCode
	 * TradingVenueIdentification1Choice.mmMarketIdentificationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingVenueAttributes1#mmIdentification
	 * TradingVenueAttributes1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation1Choice#mmMIC
	 * PersonOrOrganisation1Choice.mmMIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation30#mmPlaceOfListing
	 * Organisation30.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation29#mmPlaceOfListing
	 * Organisation29.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketDetail2#mmIdentification
	 * MarketDetail2.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Market Identifier Code. Identification of a financial market, as stipulated in the norm ISO 10383 \"Codes for exchanges and market identifications\"."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMIC = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(MarketIdentification1Choice.mmMarketIdentifierCode, MarketIdentification3Choice.mmMarketIdentifierCode, MarketIdentification3Choice.mmDescription,
					PriceSourceFormatChoice.mmLocalMarketPlace, PlaceOfTradeIdentification1Choice.mmExchange, MeetingContactPerson2.mmPlaceOfListing, TradingVenueIdentification1Choice.mmMarketIdentificationCode,
					TradingVenueAttributes1.mmIdentification, PersonOrOrganisation1Choice.mmMIC, Organisation30.mmPlaceOfListing, Organisation29.mmPlaceOfListing, MarketDetail2.mmIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MIC";
			definition = "Market Identifier Code. Identification of a financial market, as stipulated in the norm ISO 10383 \"Codes for exchanges and market identifications\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return OrganisationIdentification.class.getMethod("getMIC", new Class[]{});
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
				name = "OrganisationIdentification";
				definition = "Unique and unambiguous way to identify an organisation.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Organisation.mmOrganisationIdentification, com.tools20022.repository.entity.OrganisationName.mmOrganisation,
						com.tools20022.repository.entity.CashClearingSystemMember.mmOrganisationIdentification);
				derivationElement_lazy = () -> Arrays.asList(FinancialInstitutionIdentification8.mmOther, Party10Choice.mmOrganisationIdentification, Party9Choice.mmOrganisationIdentification,
						Party9Choice.mmFinancialInstitutionIdentification, TradingVenueIdentification1Choice.mmOther, FinancialInstitutionIdentification7Choice.mmNameAndAddress, FinancialInstitutionIdentification10.mmParty,
						FinancialInstitutionIdentification8Choice.mmNameAndAddress);
				superType_lazy = () -> PartyIdentificationInformation.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.OrganisationIdentification.mmBICFI, com.tools20022.repository.entity.OrganisationIdentification.mmAnyBIC,
						com.tools20022.repository.entity.OrganisationIdentification.mmOrganisationName, com.tools20022.repository.entity.OrganisationIdentification.mmOrganisation,
						com.tools20022.repository.entity.OrganisationIdentification.mmClearingSystemMemberIdentificationType, com.tools20022.repository.entity.OrganisationIdentification.mmBICNonFI,
						com.tools20022.repository.entity.OrganisationIdentification.mmEANGLN, com.tools20022.repository.entity.OrganisationIdentification.mmCHIPSUniversalIdentifier,
						com.tools20022.repository.entity.OrganisationIdentification.mmDUNS, com.tools20022.repository.entity.OrganisationIdentification.mmBankPartyIdentification,
						com.tools20022.repository.entity.OrganisationIdentification.mmMIC);
				derivationComponent_lazy = () -> Arrays.asList(BranchData.mmObject(), GenericFinancialIdentification1.mmObject(), FinancialInstitutionIdentification8.mmObject(), BranchData2.mmObject(),
						OrganisationIdentificationSchemeName1Choice.mmObject(), GenericOrganisationIdentification1.mmObject(), OrganisationIdentification7.mmObject(), OrganisationIdentification5.mmObject(),
						TradingVenueIdentification1Choice.mmObject(), SecuritiesTransactionTransmission2.mmObject(), FinancialInstitutionIdentification7Choice.mmObject(), TradingVenueIdentification2.mmObject(),
						FinancialInstitutionIdentification10.mmObject(), FinancialInstitutionIdentification8Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return OrganisationIdentification.class;
			}
		});
		return mmObject_lazy.get();
	}

	public BICFIIdentifier getBICFI() {
		return bICFI;
	}

	public void setBICFI(BICFIIdentifier bICFI) {
		this.bICFI = bICFI;
	}

	public AnyBICIdentifier getAnyBIC() {
		return anyBIC;
	}

	public void setAnyBIC(AnyBICIdentifier anyBIC) {
		this.anyBIC = anyBIC;
	}

	public List<OrganisationName> getOrganisationName() {
		return organisationName;
	}

	public void setOrganisationName(List<com.tools20022.repository.entity.OrganisationName> organisationName) {
		this.organisationName = organisationName;
	}

	public Organisation getOrganisation() {
		return organisation;
	}

	public void setOrganisation(com.tools20022.repository.entity.Organisation organisation) {
		this.organisation = organisation;
	}

	public List<CashClearingSystemMember> getClearingSystemMemberIdentificationType() {
		return clearingSystemMemberIdentificationType;
	}

	public void setClearingSystemMemberIdentificationType(List<com.tools20022.repository.entity.CashClearingSystemMember> clearingSystemMemberIdentificationType) {
		this.clearingSystemMemberIdentificationType = clearingSystemMemberIdentificationType;
	}

	public BICNonFIIdentifier getBICNonFI() {
		return bICNonFI;
	}

	public void setBICNonFI(BICNonFIIdentifier bICNonFI) {
		this.bICNonFI = bICNonFI;
	}

	public EANGLNIdentifier getEANGLN() {
		return eANGLN;
	}

	public void setEANGLN(EANGLNIdentifier eANGLN) {
		this.eANGLN = eANGLN;
	}

	public CHIPSUniversalIdentifier getCHIPSUniversalIdentifier() {
		return cHIPSUniversalIdentifier;
	}

	public void setCHIPSUniversalIdentifier(com.tools20022.repository.datatype.CHIPSUniversalIdentifier cHIPSUniversalIdentifier) {
		this.cHIPSUniversalIdentifier = cHIPSUniversalIdentifier;
	}

	public DunsIdentifier getDUNS() {
		return dUNS;
	}

	public void setDUNS(DunsIdentifier dUNS) {
		this.dUNS = dUNS;
	}

	public Max35Text getBankPartyIdentification() {
		return bankPartyIdentification;
	}

	public void setBankPartyIdentification(Max35Text bankPartyIdentification) {
		this.bankPartyIdentification = bankPartyIdentification;
	}

	public MICIdentifier getMIC() {
		return mIC;
	}

	public void setMIC(MICIdentifier mIC) {
		this.mIC = mIC;
	}
}