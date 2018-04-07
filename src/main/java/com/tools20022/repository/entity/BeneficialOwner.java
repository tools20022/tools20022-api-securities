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
import com.tools20022.repository.choice.BeneficiaryCertificationType10Choice;
import com.tools20022.repository.choice.BeneficiaryCertificationType1FormatChoice;
import com.tools20022.repository.choice.BeneficiaryCertificationType9Choice;
import com.tools20022.repository.choice.CertificationTypeFormat3Choice;
import com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode;
import com.tools20022.repository.codeset.CertificationFormatTypeCode;
import com.tools20022.repository.codeset.ERISAEligibilityCode;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Country;
import com.tools20022.repository.entity.SecuritiesPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Characteristics of an individual or entity that is ultimately entitled to the
 * benefit of income and rights in a security, as opposed to a nominal or legal
 * owner.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="BeneficialOwner" src="doc-files/BeneficialOwner.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole
 * SecuritiesPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmCertificationType
 * BeneficialOwner.mmCertificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmNonDomicileCountry
 * BeneficialOwner.mmNonDomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmCertificationIndicator
 * BeneficialOwner.mmCertificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmCertificationFormat
 * BeneficialOwner.mmCertificationFormat}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmERISAEligibility
 * BeneficialOwner.mmERISAEligibility}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BeneficialOwner#mmERISARate
 * BeneficialOwner.mmERISARate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmBenefitPlanDeclarationIndicator
 * BeneficialOwner.mmBenefitPlanDeclarationIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#mmCountryForBeneficialOwner
 * Country.mmCountryForBeneficialOwner}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties3#mmTradeBeneficiaryParty
 * ConfirmationParties3.mmTradeBeneficiaryParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4#mmTradeBeneficiaryParty
 * ConfirmationParties4.mmTradeBeneficiaryParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2#mmTradeBeneficiaryParty
 * ConfirmationParties2.mmTradeBeneficiaryParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1#mmBeneficialOwnerDetails
 * CorporateActionAdditionalInformation1.mmBeneficialOwnerDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification93#mmOwnerIdentification
 * PartyIdentification93.mmOwnerIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties15#mmBeneficiary
 * AccountParties15.mmBeneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount7#mmBeneficialOwner
 * SafekeepingAccount7.mmBeneficialOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties16#mmBeneficiary
 * AccountParties16.mmBeneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15#mmBeneficialOwner
 * AccountSubLevel15.mmBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel16#mmBeneficialOwner
 * AccountSubLevel16.mmBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18#mmBeneficialOwner
 * AccountSubLevel18.mmBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel19#mmBeneficialOwner
 * AccountSubLevel19.mmBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel11#mmBeneficialOwner
 * AccountSubLevel11.mmBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel12#mmBeneficialOwner
 * AccountSubLevel12.mmBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel17#mmBeneficialOwner
 * AccountSubLevel17.mmBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13#mmBeneficialOwner
 * AccountSubLevel13.mmBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel14#mmBeneficialOwner
 * AccountSubLevel14.mmBeneficialOwner}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType1FormatChoice
 * BeneficiaryCertificationType1FormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BeneficialOwner1
 * BeneficialOwner1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BeneficialOwner2
 * BeneficialOwner2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType9Choice
 * BeneficiaryCertificationType9Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType10Choice
 * BeneficiaryCertificationType10Choice}</li>
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
 * "BeneficialOwner"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Characteristics of an individual or entity that is ultimately entitled to the benefit of income and rights in a security, as opposed to a nominal or legal owner."
 * </li>
 * </ul>
 */
public class BeneficialOwner extends SecuritiesPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected BeneficiaryCertificationTypeCode certificationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode
	 * BeneficiaryCertificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType1FormatChoice#mmCode
	 * BeneficiaryCertificationType1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType1FormatChoice#mmProprietary
	 * BeneficiaryCertificationType1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmCertificationType
	 * CorporateAction2.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmCertificationType
	 * CorporateActionOption1.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmCertificationType
	 * BeneficialOwner1.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1#mmCertificationType
	 * CorporateActionAdditionalInformation1.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#mmCertificationType
	 * BeneficialOwner2.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType9Choice#mmCode
	 * BeneficiaryCertificationType9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType9Choice#mmProprietary
	 * BeneficiaryCertificationType9Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification93#mmCertificationType
	 * PartyIdentification93.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType10Choice#mmCode
	 * BeneficiaryCertificationType10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType10Choice#mmProprietary
	 * BeneficiaryCertificationType10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmCertificationType
	 * CorporateAction41.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138#mmCertificationBreakdownType
	 * CorporateActionOption138.mmCertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139#mmCertificationBreakdownType
	 * CorporateActionOption139.mmCertificationBreakdownType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of certification which is required."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<BeneficialOwner, BeneficiaryCertificationTypeCode> mmCertificationType = new MMBusinessAttribute<BeneficialOwner, BeneficiaryCertificationTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(BeneficiaryCertificationType1FormatChoice.mmCode, BeneficiaryCertificationType1FormatChoice.mmProprietary, CorporateAction2.mmCertificationType, CorporateActionOption1.mmCertificationType,
					BeneficialOwner1.mmCertificationType, CorporateActionAdditionalInformation1.mmCertificationType, BeneficialOwner2.mmCertificationType, BeneficiaryCertificationType9Choice.mmCode,
					BeneficiaryCertificationType9Choice.mmProprietary, PartyIdentification93.mmCertificationType, BeneficiaryCertificationType10Choice.mmCode, BeneficiaryCertificationType10Choice.mmProprietary,
					CorporateAction41.mmCertificationType, CorporateActionOption138.mmCertificationBreakdownType, CorporateActionOption139.mmCertificationBreakdownType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BeneficialOwner.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertificationType";
			definition = "Type of certification which is required.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BeneficiaryCertificationTypeCode.mmObject();
		}

		@Override
		public BeneficiaryCertificationTypeCode getValue(BeneficialOwner obj) {
			return obj.getCertificationType();
		}

		@Override
		public void setValue(BeneficialOwner obj, BeneficiaryCertificationTypeCode value) {
			obj.setCertificationType(value);
		}
	};
	protected Country nonDomicileCountry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmCountryForBeneficialOwner
	 * Country.mmCountryForBeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmNonDomicileCountry
	 * BeneficialOwner1.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#mmNonDomicileCountry
	 * BeneficialOwner2.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138#mmNonDomicileCountry
	 * CorporateActionOption138.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139#mmNonDomicileCountry
	 * CorporateActionOption139.mmNonDomicileCountry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonDomicileCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The holder of the security has to certify, in line with the terms of the corporate action, that it is not domiciled in the country indicated."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<BeneficialOwner, Country> mmNonDomicileCountry = new MMBusinessAssociationEnd<BeneficialOwner, Country>() {
		{
			derivation_lazy = () -> Arrays.asList(BeneficialOwner1.mmNonDomicileCountry, BeneficialOwner2.mmNonDomicileCountry, CorporateActionOption138.mmNonDomicileCountry, CorporateActionOption139.mmNonDomicileCountry);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BeneficialOwner.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonDomicileCountry";
			definition = "The holder of the security has to certify, in line with the terms of the corporate action, that it is not domiciled in the country indicated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Country.mmCountryForBeneficialOwner;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Country.mmObject();
		}

		@Override
		public Country getValue(BeneficialOwner obj) {
			return obj.getNonDomicileCountry();
		}

		@Override
		public void setValue(BeneficialOwner obj, Country value) {
			obj.setNonDomicileCountry(value);
		}
	};
	protected YesNoIndicator certificationIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmCertificationRequiredIndicator
	 * CorporateAction2.mmCertificationRequiredIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmCertificationIndicator
	 * CorporateActionOption1.mmCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmCertificationIndicator
	 * BeneficialOwner1.mmCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1#mmCertificationIndicator
	 * CorporateActionAdditionalInformation1.mmCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#mmCertificationIndicator
	 * BeneficialOwner2.mmCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmCertificationBreakdownIndicator
	 * CorporateAction41.mmCertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138#mmCertificationBreakdownIndicator
	 * CorporateActionOption138.mmCertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139#mmCertificationBreakdownIndicator
	 * CorporateActionOption139.mmCertificationBreakdownIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not certification is required from the account owner, for instance a certification is required to participate to a corporate action event.\r\nY: certification required \r\nN: no certification required"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<BeneficialOwner, YesNoIndicator> mmCertificationIndicator = new MMBusinessAttribute<BeneficialOwner, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateAction2.mmCertificationRequiredIndicator, CorporateActionOption1.mmCertificationIndicator, BeneficialOwner1.mmCertificationIndicator,
					CorporateActionAdditionalInformation1.mmCertificationIndicator, BeneficialOwner2.mmCertificationIndicator, CorporateAction41.mmCertificationBreakdownIndicator, CorporateActionOption138.mmCertificationBreakdownIndicator,
					CorporateActionOption139.mmCertificationBreakdownIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BeneficialOwner.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertificationIndicator";
			definition = "Indicates whether or not certification is required from the account owner, for instance a certification is required to participate to a corporate action event.\r\nY: certification required \r\nN: no certification required";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(BeneficialOwner obj) {
			return obj.getCertificationIndicator();
		}

		@Override
		public void setValue(BeneficialOwner obj, YesNoIndicator value) {
			obj.setCertificationIndicator(value);
		}
	};
	protected CertificationFormatTypeCode certificationFormat;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CertificationFormatTypeCode
	 * CertificationFormatTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertificationTypeFormat3Choice#mmCode
	 * CertificationTypeFormat3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertificationTypeFormat3Choice#mmProprietary
	 * CertificationTypeFormat3Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationFormat"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the certification format required, that is, physical or electronic format."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<BeneficialOwner, CertificationFormatTypeCode> mmCertificationFormat = new MMBusinessAttribute<BeneficialOwner, CertificationFormatTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CertificationTypeFormat3Choice.mmCode, CertificationTypeFormat3Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BeneficialOwner.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertificationFormat";
			definition = "Specifies the certification format required, that is, physical or electronic format.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CertificationFormatTypeCode.mmObject();
		}

		@Override
		public CertificationFormatTypeCode getValue(BeneficialOwner obj) {
			return obj.getCertificationFormat();
		}

		@Override
		public void setValue(BeneficialOwner obj, CertificationFormatTypeCode value) {
			obj.setCertificationFormat(value);
		}
	};
	protected ERISAEligibilityCode eRISAEligibility;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ERISAEligibilityCode
	 * ERISAEligibilityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ERISAEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Eligibility to federal Employee Retirement Income Security Act."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<BeneficialOwner, ERISAEligibilityCode> mmERISAEligibility = new MMBusinessAttribute<BeneficialOwner, ERISAEligibilityCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BeneficialOwner.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ERISAEligibility";
			definition = "Eligibility to federal Employee Retirement Income Security Act.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ERISAEligibilityCode.mmObject();
		}

		@Override
		public ERISAEligibilityCode getValue(BeneficialOwner obj) {
			return obj.getERISAEligibility();
		}

		@Override
		public void setValue(BeneficialOwner obj, ERISAEligibilityCode value) {
			obj.setERISAEligibility(value);
		}
	};
	protected PercentageRate eRISARate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ERISARate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Federal Employee Retirement Income Security Act (ERISA) rate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<BeneficialOwner, PercentageRate> mmERISARate = new MMBusinessAttribute<BeneficialOwner, PercentageRate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BeneficialOwner.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ERISARate";
			definition = "Federal Employee Retirement Income Security Act (ERISA) rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(BeneficialOwner obj) {
			return obj.getERISARate();
		}

		@Override
		public void setValue(BeneficialOwner obj, PercentageRate value) {
			obj.setERISARate(value);
		}
	};
	protected YesNoIndicator benefitPlanDeclarationIndicator;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenefitPlanDeclarationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the investor is a benefit plan investor."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<BeneficialOwner, YesNoIndicator> mmBenefitPlanDeclarationIndicator = new MMBusinessAttribute<BeneficialOwner, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BeneficialOwner.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BenefitPlanDeclarationIndicator";
			definition = "Indicates whether the investor is a benefit plan investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(BeneficialOwner obj) {
			return obj.getBenefitPlanDeclarationIndicator();
		}

		@Override
		public void setValue(BeneficialOwner obj, YesNoIndicator value) {
			obj.setBenefitPlanDeclarationIndicator(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BeneficialOwner";
				definition = "Characteristics of an individual or entity that is ultimately entitled to the benefit of income and rights in a security, as opposed to a nominal or legal owner.";
				associationDomain_lazy = () -> Arrays.asList(Country.mmCountryForBeneficialOwner);
				derivationElement_lazy = () -> Arrays.asList(ConfirmationParties3.mmTradeBeneficiaryParty, ConfirmationParties4.mmTradeBeneficiaryParty, ConfirmationParties2.mmTradeBeneficiaryParty,
						CorporateActionAdditionalInformation1.mmBeneficialOwnerDetails, PartyIdentification93.mmOwnerIdentification, AccountParties15.mmBeneficiary, SafekeepingAccount7.mmBeneficialOwner, AccountParties16.mmBeneficiary,
						AccountSubLevel15.mmBeneficialOwner, AccountSubLevel16.mmBeneficialOwner, AccountSubLevel18.mmBeneficialOwner, AccountSubLevel19.mmBeneficialOwner, AccountSubLevel11.mmBeneficialOwner,
						AccountSubLevel12.mmBeneficialOwner, AccountSubLevel17.mmBeneficialOwner, AccountSubLevel13.mmBeneficialOwner, AccountSubLevel14.mmBeneficialOwner);
				superType_lazy = () -> SecuritiesPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BeneficialOwner.mmCertificationType, com.tools20022.repository.entity.BeneficialOwner.mmNonDomicileCountry,
						com.tools20022.repository.entity.BeneficialOwner.mmCertificationIndicator, com.tools20022.repository.entity.BeneficialOwner.mmCertificationFormat, com.tools20022.repository.entity.BeneficialOwner.mmERISAEligibility,
						com.tools20022.repository.entity.BeneficialOwner.mmERISARate, com.tools20022.repository.entity.BeneficialOwner.mmBenefitPlanDeclarationIndicator);
				derivationComponent_lazy = () -> Arrays.asList(BeneficiaryCertificationType1FormatChoice.mmObject(), BeneficialOwner1.mmObject(), BeneficialOwner2.mmObject(), BeneficiaryCertificationType9Choice.mmObject(),
						BeneficiaryCertificationType10Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return BeneficialOwner.class;
			}
		});
		return mmObject_lazy.get();
	}

	public BeneficiaryCertificationTypeCode getCertificationType() {
		return certificationType;
	}

	public BeneficialOwner setCertificationType(BeneficiaryCertificationTypeCode certificationType) {
		this.certificationType = Objects.requireNonNull(certificationType);
		return this;
	}

	public Country getNonDomicileCountry() {
		return nonDomicileCountry;
	}

	public BeneficialOwner setNonDomicileCountry(Country nonDomicileCountry) {
		this.nonDomicileCountry = Objects.requireNonNull(nonDomicileCountry);
		return this;
	}

	public YesNoIndicator getCertificationIndicator() {
		return certificationIndicator;
	}

	public BeneficialOwner setCertificationIndicator(YesNoIndicator certificationIndicator) {
		this.certificationIndicator = Objects.requireNonNull(certificationIndicator);
		return this;
	}

	public CertificationFormatTypeCode getCertificationFormat() {
		return certificationFormat;
	}

	public BeneficialOwner setCertificationFormat(CertificationFormatTypeCode certificationFormat) {
		this.certificationFormat = Objects.requireNonNull(certificationFormat);
		return this;
	}

	public ERISAEligibilityCode getERISAEligibility() {
		return eRISAEligibility;
	}

	public BeneficialOwner setERISAEligibility(ERISAEligibilityCode eRISAEligibility) {
		this.eRISAEligibility = Objects.requireNonNull(eRISAEligibility);
		return this;
	}

	public PercentageRate getERISARate() {
		return eRISARate;
	}

	public BeneficialOwner setERISARate(PercentageRate eRISARate) {
		this.eRISARate = Objects.requireNonNull(eRISARate);
		return this;
	}

	public YesNoIndicator getBenefitPlanDeclarationIndicator() {
		return benefitPlanDeclarationIndicator;
	}

	public BeneficialOwner setBenefitPlanDeclarationIndicator(YesNoIndicator benefitPlanDeclarationIndicator) {
		this.benefitPlanDeclarationIndicator = Objects.requireNonNull(benefitPlanDeclarationIndicator);
		return this;
	}
}