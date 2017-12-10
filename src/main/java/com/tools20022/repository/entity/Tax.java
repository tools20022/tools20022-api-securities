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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Amount of money due to the government or tax authority, according to various
 * pre-defined parameters such as thresholds or income.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Tax" src="doc-files/Tax.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmExemptionReason
 * Tax.mmExemptionReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmCountry Tax.mmCountry}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxLiabilityValueCalculation
 * Tax.mmTaxLiabilityValueCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmType Tax.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxableParty
 * Tax.mmTaxableParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxRefundValueCalculation
 * Tax.mmTaxRefundValueCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmBasis Tax.mmBasis}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmSecuritiesTransfer
 * Tax.mmSecuritiesTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxRateType
 * Tax.mmTaxRateType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxAccount
 * Tax.mmTaxAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxationConditions
 * Tax.mmTaxationConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmAdjustment
 * Tax.mmAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmInterest
 * Tax.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmIdentification
 * Tax.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#mmRelatedPaymentSettlement
 * Tax.mmRelatedPaymentSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxableBaseAmount
 * Tax.mmTaxableBaseAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxDate Tax.mmTaxDate}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#mmCertificateIdentification
 * Tax.mmCertificateIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmAdministrationZone
 * Tax.mmAdministrationZone}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmMethod Tax.mmMethod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmRecord Tax.mmRecord}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmProduct Tax.mmProduct}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmCurrencyExchange
 * Tax.mmCurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmCurrency
 * Tax.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmPartyRole
 * Tax.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxDeduction
 * Tax.mmTaxDeduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#mmRelatedCorporateActionDistribution
 * Tax.mmRelatedCorporateActionDistribution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmCalculationDate
 * Tax.mmCalculationDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmDividend
 * Tax.mmDividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmWithholdingTaxType
 * Tax.mmWithholdingTaxType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmCorporateActionEvent
 * Tax.mmCorporateActionEvent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxIdentificationType
 * Tax.mmTaxIdentificationType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Country#mmTax Country.mmTax}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmTax
 * Dividend.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmTaxLiability
 * NetAssetValueCalculation.mmTaxLiability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmTaxRefund
 * NetAssetValueCalculation.mmTaxRefund}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmTaxationConditions
 * Party.mmTaxationConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#mmTax
 * CashAccount.mmTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmTax Product.mmTax}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmTax
 * Adjustment.mmTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmTaxOnPayment
 * Payment.mmTaxOnPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferTax
 * SecuritiesTransfer.mmTransferTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmInterestTax
 * Interest.mmInterestTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CurrencyExchange#mmTax
 * CurrencyExchange.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmTransactionTax
 * CorporateActionEvent.mmTransactionTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxPartyRole#mmTax
 * TaxPartyRole.mmTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxRecord#mmTax
 * TaxRecord.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#mmDistributionTax
 * Distribution.mmDistributionTax}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmGermanLocalTax1
 * CorporateActionRate2.mmGermanLocalTax1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmGermanLocalTax2
 * CorporateActionRate2.mmGermanLocalTax2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmGermanLocalTax3
 * CorporateActionRate2.mmGermanLocalTax3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmGermanLocalTax4
 * CorporateActionRate2.mmGermanLocalTax4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmAdditionalTax
 * CorporateActionRate2.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate82#mmAdditionalTax
 * CorporateActionRate82.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#mmAdditionalTax
 * CorporateActionRate80.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#mmAdditionalTax
 * CorporateActionRate81.mmAdditionalTax}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
 * </li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.TaxType3FormatChoice
 * TaxType3FormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxType1Choice
 * TaxType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ExemptionReason1Choice
 * ExemptionReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxBasis1Choice
 * TaxBasis1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndPercentageRate8
 * RateTypeAndPercentageRate8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType42Choice
 * RateType42Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType37Choice
 * RateType37Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxExemptionReason2Choice
 * TaxExemptionReason2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxReporting2 TaxReporting2}</li>
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
 * "Tax"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income."
 * </li>
 * </ul>
 */
public class Tax {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected TaxExemptReasonCode exemptionReason;
	/**
	 * Reason for a tax exemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExemptionReason1Choice#mmCode
	 * ExemptionReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExemptionReason1Choice#mmProprietary
	 * ExemptionReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxExemptionReason2Choice#mmCode
	 * TaxExemptionReason2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxExemptionReason2Choice#mmProprietary
	 * TaxExemptionReason2Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax28#mmExemptionReason
	 * Tax28.mmExemptionReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax32#mmExemptionReason
	 * Tax32.mmExemptionReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax30#mmExemptionReason
	 * Tax30.mmExemptionReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for a tax exemption."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExemptionReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ExemptionReason1Choice.mmCode, ExemptionReason1Choice.mmProprietary, TaxExemptionReason2Choice.mmCode, TaxExemptionReason2Choice.mmProprietary, Tax28.mmExemptionReason,
					Tax32.mmExemptionReason, Tax30.mmExemptionReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExemptionReason";
			definition = "Reason for a tax exemption.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxExemptReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getExemptionReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Country country;
	/**
	 * Place of taxation of an individual person or an organisation, where the
	 * tax is due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Country#mmTax
	 * Country.mmTax}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TaxReporting2#mmTaxationCountry
	 * TaxReporting2.mmTaxationCountry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place of taxation of an individual person or an organisation, where the tax is due."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCountry = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(TaxReporting2.mmTaxationCountry);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Place of taxation of an individual person or an organisation, where the tax is due.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Country.mmTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
		}
	};
	protected NetAssetValueCalculation taxLiabilityValueCalculation;
	/**
	 * Net asset value calculation for which tax liability information is
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmTaxLiability
	 * NetAssetValueCalculation.mmTaxLiability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxLiabilityValueCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net asset value calculation for which tax liability information is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTaxLiabilityValueCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxLiabilityValueCalculation";
			definition = "Net asset value calculation for which tax liability information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmTaxLiability;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
		}
	};
	protected TaxTypeCode type;
	/**
	 * Type of tax applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.TaxTypeCode
	 * TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax17#mmType Tax17.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax17#mmExtendedType
	 * Tax17.mmExtendedType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxType3FormatChoice#mmCode
	 * TaxType3FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxType3FormatChoice#mmProprietary
	 * TaxType3FormatChoice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RelatedTaxType1#mmTaxType
	 * RelatedTaxType1.mmTaxType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.TaxType1Choice#mmCode
	 * TaxType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxType1Choice#mmProprietary
	 * TaxType1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax28#mmType Tax28.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.TaxType3Choice#mmCode
	 * TaxType3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxType3Choice#mmProprietary
	 * TaxType3Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax32#mmType Tax32.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax30#mmType Tax30.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax31#mmType Tax31.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of tax applied."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Tax17.mmType, Tax17.mmExtendedType, TaxType3FormatChoice.mmCode, TaxType3FormatChoice.mmProprietary, RelatedTaxType1.mmTaxType, TaxType1Choice.mmCode, TaxType1Choice.mmProprietary,
					Tax28.mmType, TaxType3Choice.mmCode, TaxType3Choice.mmProprietary, Tax32.mmType, Tax30.mmType, Tax31.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of tax applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount amount;
	/**
	 * Amount of money resulting from the calculation of the tax.
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
	 * <li>{@linkplain com.tools20022.repository.msg.Tax17#mmAmount
	 * Tax17.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmCountryNationalFederalTax
	 * OtherAmounts16.mmCountryNationalFederalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmPaymentLevyTax
	 * OtherAmounts16.mmPaymentLevyTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts16#mmLocalTax
	 * OtherAmounts16.mmLocalTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts16#mmStampDuty
	 * OtherAmounts16.mmStampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmStockExchangeTax
	 * OtherAmounts16.mmStockExchangeTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmTransactionTax
	 * OtherAmounts16.mmTransactionTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmValueAddedTax
	 * OtherAmounts16.mmValueAddedTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmWithholdingTax
	 * OtherAmounts16.mmWithholdingTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmConsumptionTax
	 * OtherAmounts16.mmConsumptionTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmLocalTaxCountrySpecific1
	 * OtherAmounts16.mmLocalTaxCountrySpecific1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmLocalTaxCountrySpecific2
	 * OtherAmounts16.mmLocalTaxCountrySpecific2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmLocalTaxCountrySpecific3
	 * OtherAmounts16.mmLocalTaxCountrySpecific3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmLocalTaxCountrySpecific4
	 * OtherAmounts16.mmLocalTaxCountrySpecific4}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmTaxFreeAmount
	 * CorporateActionAmounts1.mmTaxFreeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmTaxDeferredAmount
	 * CorporateActionAmounts1.mmTaxDeferredAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmGermanLocalTax1Amount
	 * CorporateActionAmounts1.mmGermanLocalTax1Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmGermanLocalTax2Amount
	 * CorporateActionAmounts1.mmGermanLocalTax2Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmGermanLocalTax3Amount
	 * CorporateActionAmounts1.mmGermanLocalTax3Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmGermanLocalTax4Amount
	 * CorporateActionAmounts1.mmGermanLocalTax4Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmStockExchangeTaxAmount
	 * CorporateActionAmounts1.mmStockExchangeTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmTransferTaxAmount
	 * CorporateActionAmounts1.mmTransferTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmTransactionTaxAmount
	 * CorporateActionAmounts1.mmTransactionTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmValueAddedTaxAmount
	 * CorporateActionAmounts1.mmValueAddedTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmEURetentionTaxAmount
	 * CorporateActionAmounts1.mmEURetentionTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmLocalTaxAmount
	 * CorporateActionAmounts1.mmLocalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmPaymentLevyTaxAmount
	 * CorporateActionAmounts1.mmPaymentLevyTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmCountryNationalFederalTaxAmount
	 * CorporateActionAmounts1.mmCountryNationalFederalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmStampDutyAmount
	 * CorporateActionAmounts1.mmStampDutyAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmTaxReclaimAmount
	 * CorporateActionAmounts1.mmTaxReclaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmWithholdingOfForeignTaxAmount
	 * CorporateActionAmounts1.mmWithholdingOfForeignTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmWithholdingOfLocalTaxAmount
	 * CorporateActionAmounts1.mmWithholdingOfLocalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmAdditionalTaxAmount
	 * CorporateActionAmounts1.mmAdditionalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmWithholdingTaxAmount
	 * CorporateActionAmounts1.mmWithholdingTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmFiscalStampAmount
	 * CorporateActionAmounts1.mmFiscalStampAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashMovement1#mmTaxAmount
	 * CashMovement1.mmTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmWithholdingTaxAmount
	 * TaxVoucher1.mmWithholdingTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmStampDutyAmount
	 * TaxVoucher1.mmStampDutyAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#mmCountryNationalFederalTax
	 * OtherAmounts28.mmCountryNationalFederalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#mmPaymentLevyTax
	 * OtherAmounts28.mmPaymentLevyTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts28#mmLocalTax
	 * OtherAmounts28.mmLocalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#mmLocalTaxCountrySpecific
	 * OtherAmounts28.mmLocalTaxCountrySpecific}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts28#mmStampDuty
	 * OtherAmounts28.mmStampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#mmStockExchangeTax
	 * OtherAmounts28.mmStockExchangeTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#mmTransactionTax
	 * OtherAmounts28.mmTransactionTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#mmValueAddedTax
	 * OtherAmounts28.mmValueAddedTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#mmWithholdingTax
	 * OtherAmounts28.mmWithholdingTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#mmConsumptionTax
	 * OtherAmounts28.mmConsumptionTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#mmCountryNationalFederalTax
	 * OtherAmounts30.mmCountryNationalFederalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#mmPaymentLevyTax
	 * OtherAmounts30.mmPaymentLevyTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts30#mmLocalTax
	 * OtherAmounts30.mmLocalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#mmLocalTaxCountrySpecific
	 * OtherAmounts30.mmLocalTaxCountrySpecific}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts30#mmStampDuty
	 * OtherAmounts30.mmStampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#mmStockExchangeTax
	 * OtherAmounts30.mmStockExchangeTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#mmTransactionTax
	 * OtherAmounts30.mmTransactionTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#mmValueAddedTax
	 * OtherAmounts30.mmValueAddedTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#mmWithholdingTax
	 * OtherAmounts30.mmWithholdingTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#mmConsumptionTax
	 * OtherAmounts30.mmConsumptionTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmCountryNationalFederalTax
	 * OtherAmounts31.mmCountryNationalFederalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmPaymentLevyTax
	 * OtherAmounts31.mmPaymentLevyTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts31#mmLocalTax
	 * OtherAmounts31.mmLocalTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts31#mmStampDuty
	 * OtherAmounts31.mmStampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmStockExchangeTax
	 * OtherAmounts31.mmStockExchangeTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmTransactionTax
	 * OtherAmounts31.mmTransactionTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmValueAddedTax
	 * OtherAmounts31.mmValueAddedTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmWithholdingTax
	 * OtherAmounts31.mmWithholdingTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmConsumptionTax
	 * OtherAmounts31.mmConsumptionTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts32#mmLocalTax
	 * OtherAmounts32.mmLocalTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts32#mmStampDuty
	 * OtherAmounts32.mmStampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts32#mmTransactionTax
	 * OtherAmounts32.mmTransactionTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts32#mmWithholdingTax
	 * OtherAmounts32.mmWithholdingTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts32#mmConsumptionTax
	 * OtherAmounts32.mmConsumptionTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29#mmCountryNationalFederalTax
	 * OtherAmounts29.mmCountryNationalFederalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29#mmPaymentLevyTax
	 * OtherAmounts29.mmPaymentLevyTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts29#mmLocalTax
	 * OtherAmounts29.mmLocalTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts29#mmStampDuty
	 * OtherAmounts29.mmStampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29#mmStockExchangeTax
	 * OtherAmounts29.mmStockExchangeTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29#mmTransactionTax
	 * OtherAmounts29.mmTransactionTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29#mmValueAddedTax
	 * OtherAmounts29.mmValueAddedTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29#mmWithholdingTax
	 * OtherAmounts29.mmWithholdingTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29#mmConsumptionTax
	 * OtherAmounts29.mmConsumptionTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat40Choice#mmAmount
	 * RateAndAmountFormat40Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmTaxFreeAmount
	 * CorporateActionAmounts37.mmTaxFreeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmTaxDeferredAmount
	 * CorporateActionAmounts37.mmTaxDeferredAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmValueAddedTaxAmount
	 * CorporateActionAmounts37.mmValueAddedTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmStampDutyAmount
	 * CorporateActionAmounts37.mmStampDutyAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmTaxReclaimAmount
	 * CorporateActionAmounts37.mmTaxReclaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmAdditionalTaxAmount
	 * CorporateActionAmounts37.mmAdditionalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmWithholdingTaxAmount
	 * CorporateActionAmounts37.mmWithholdingTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmSecondLevelTaxAmount
	 * CorporateActionAmounts37.mmSecondLevelTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmFiscalStampAmount
	 * CorporateActionAmounts37.mmFiscalStampAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmTaxArrearsAmount
	 * CorporateActionAmounts37.mmTaxArrearsAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmStockExchangeTax
	 * CorporateActionAmounts37.mmStockExchangeTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmEUTaxRetentionAmount
	 * CorporateActionAmounts37.mmEUTaxRetentionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmFATCATaxAmount
	 * CorporateActionAmounts37.mmFATCATaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmNRATaxAmount
	 * CorporateActionAmounts37.mmNRATaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmBackUpWithholdingTaxAmount
	 * CorporateActionAmounts37.mmBackUpWithholdingTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmTaxOnIncomeAmount
	 * CorporateActionAmounts37.mmTaxOnIncomeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmTransactionTax
	 * CorporateActionAmounts37.mmTransactionTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate71#mmRequestedSecondLevelTaxRate
	 * CorporateActionRate71.mmRequestedSecondLevelTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmTaxFreeAmount
	 * CorporateActionAmounts36.mmTaxFreeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmTaxDeferredAmount
	 * CorporateActionAmounts36.mmTaxDeferredAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmValueAddedTaxAmount
	 * CorporateActionAmounts36.mmValueAddedTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmStampDutyAmount
	 * CorporateActionAmounts36.mmStampDutyAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmTaxReclaimAmount
	 * CorporateActionAmounts36.mmTaxReclaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmAdditionalTaxAmount
	 * CorporateActionAmounts36.mmAdditionalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmWithholdingTaxAmount
	 * CorporateActionAmounts36.mmWithholdingTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmSecondLevelTaxAmount
	 * CorporateActionAmounts36.mmSecondLevelTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmFiscalStampAmount
	 * CorporateActionAmounts36.mmFiscalStampAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmStockExchangeTax
	 * CorporateActionAmounts36.mmStockExchangeTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmEUTaxRetentionAmount
	 * CorporateActionAmounts36.mmEUTaxRetentionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmFATCATaxAmount
	 * CorporateActionAmounts36.mmFATCATaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmNRATaxAmount
	 * CorporateActionAmounts36.mmNRATaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmBackUpWithholdingTaxAmount
	 * CorporateActionAmounts36.mmBackUpWithholdingTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmTaxOnIncomeAmount
	 * CorporateActionAmounts36.mmTaxOnIncomeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmTransactionTax
	 * CorporateActionAmounts36.mmTransactionTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax28#mmAmount
	 * Tax28.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmTaxFreeAmount
	 * CorporateActionAmounts38.mmTaxFreeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmTaxDeferredAmount
	 * CorporateActionAmounts38.mmTaxDeferredAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmValueAddedTaxAmount
	 * CorporateActionAmounts38.mmValueAddedTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmStampDutyAmount
	 * CorporateActionAmounts38.mmStampDutyAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmTaxReclaimAmount
	 * CorporateActionAmounts38.mmTaxReclaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmAdditionalTaxAmount
	 * CorporateActionAmounts38.mmAdditionalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmWithholdingTaxAmount
	 * CorporateActionAmounts38.mmWithholdingTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmSecondLevelTaxAmount
	 * CorporateActionAmounts38.mmSecondLevelTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmFiscalStampAmount
	 * CorporateActionAmounts38.mmFiscalStampAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmFATCATaxAmount
	 * CorporateActionAmounts38.mmFATCATaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmNRATaxAmount
	 * CorporateActionAmounts38.mmNRATaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmBackUpWithholdingTaxAmount
	 * CorporateActionAmounts38.mmBackUpWithholdingTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmTaxOnIncomeAmount
	 * CorporateActionAmounts38.mmTaxOnIncomeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmTransactionTax
	 * CorporateActionAmounts38.mmTransactionTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax32#mmInformativeAmount
	 * Tax32.mmInformativeAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax30#mmTax Tax30.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax31#mmAppliedAmount
	 * Tax31.mmAppliedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxAmountOrRate4Choice#mmAmount
	 * TaxAmountOrRate4Choice.mmAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money resulting from the calculation of the tax."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Tax17.mmAmount, OtherAmounts16.mmCountryNationalFederalTax, OtherAmounts16.mmPaymentLevyTax, OtherAmounts16.mmLocalTax, OtherAmounts16.mmStampDuty, OtherAmounts16.mmStockExchangeTax,
					OtherAmounts16.mmTransactionTax, OtherAmounts16.mmValueAddedTax, OtherAmounts16.mmWithholdingTax, OtherAmounts16.mmConsumptionTax, OtherAmounts16.mmLocalTaxCountrySpecific1, OtherAmounts16.mmLocalTaxCountrySpecific2,
					OtherAmounts16.mmLocalTaxCountrySpecific3, OtherAmounts16.mmLocalTaxCountrySpecific4, CorporateActionAmounts1.mmTaxFreeAmount, CorporateActionAmounts1.mmTaxDeferredAmount,
					CorporateActionAmounts1.mmGermanLocalTax1Amount, CorporateActionAmounts1.mmGermanLocalTax2Amount, CorporateActionAmounts1.mmGermanLocalTax3Amount, CorporateActionAmounts1.mmGermanLocalTax4Amount,
					CorporateActionAmounts1.mmStockExchangeTaxAmount, CorporateActionAmounts1.mmTransferTaxAmount, CorporateActionAmounts1.mmTransactionTaxAmount, CorporateActionAmounts1.mmValueAddedTaxAmount,
					CorporateActionAmounts1.mmEURetentionTaxAmount, CorporateActionAmounts1.mmLocalTaxAmount, CorporateActionAmounts1.mmPaymentLevyTaxAmount, CorporateActionAmounts1.mmCountryNationalFederalTaxAmount,
					CorporateActionAmounts1.mmStampDutyAmount, CorporateActionAmounts1.mmTaxReclaimAmount, CorporateActionAmounts1.mmWithholdingOfForeignTaxAmount, CorporateActionAmounts1.mmWithholdingOfLocalTaxAmount,
					CorporateActionAmounts1.mmAdditionalTaxAmount, CorporateActionAmounts1.mmWithholdingTaxAmount, CorporateActionAmounts1.mmFiscalStampAmount, CashMovement1.mmTaxAmount, TaxVoucher1.mmWithholdingTaxAmount,
					TaxVoucher1.mmStampDutyAmount, OtherAmounts28.mmCountryNationalFederalTax, OtherAmounts28.mmPaymentLevyTax, OtherAmounts28.mmLocalTax, OtherAmounts28.mmLocalTaxCountrySpecific, OtherAmounts28.mmStampDuty,
					OtherAmounts28.mmStockExchangeTax, OtherAmounts28.mmTransactionTax, OtherAmounts28.mmValueAddedTax, OtherAmounts28.mmWithholdingTax, OtherAmounts28.mmConsumptionTax, OtherAmounts30.mmCountryNationalFederalTax,
					OtherAmounts30.mmPaymentLevyTax, OtherAmounts30.mmLocalTax, OtherAmounts30.mmLocalTaxCountrySpecific, OtherAmounts30.mmStampDuty, OtherAmounts30.mmStockExchangeTax, OtherAmounts30.mmTransactionTax,
					OtherAmounts30.mmValueAddedTax, OtherAmounts30.mmWithholdingTax, OtherAmounts30.mmConsumptionTax, OtherAmounts31.mmCountryNationalFederalTax, OtherAmounts31.mmPaymentLevyTax, OtherAmounts31.mmLocalTax,
					OtherAmounts31.mmStampDuty, OtherAmounts31.mmStockExchangeTax, OtherAmounts31.mmTransactionTax, OtherAmounts31.mmValueAddedTax, OtherAmounts31.mmWithholdingTax, OtherAmounts31.mmConsumptionTax,
					OtherAmounts32.mmLocalTax, OtherAmounts32.mmStampDuty, OtherAmounts32.mmTransactionTax, OtherAmounts32.mmWithholdingTax, OtherAmounts32.mmConsumptionTax, OtherAmounts29.mmCountryNationalFederalTax,
					OtherAmounts29.mmPaymentLevyTax, OtherAmounts29.mmLocalTax, OtherAmounts29.mmStampDuty, OtherAmounts29.mmStockExchangeTax, OtherAmounts29.mmTransactionTax, OtherAmounts29.mmValueAddedTax,
					OtherAmounts29.mmWithholdingTax, OtherAmounts29.mmConsumptionTax, RateAndAmountFormat40Choice.mmAmount, CorporateActionAmounts37.mmTaxFreeAmount, CorporateActionAmounts37.mmTaxDeferredAmount,
					CorporateActionAmounts37.mmValueAddedTaxAmount, CorporateActionAmounts37.mmStampDutyAmount, CorporateActionAmounts37.mmTaxReclaimAmount, CorporateActionAmounts37.mmAdditionalTaxAmount,
					CorporateActionAmounts37.mmWithholdingTaxAmount, CorporateActionAmounts37.mmSecondLevelTaxAmount, CorporateActionAmounts37.mmFiscalStampAmount, CorporateActionAmounts37.mmTaxArrearsAmount,
					CorporateActionAmounts37.mmStockExchangeTax, CorporateActionAmounts37.mmEUTaxRetentionAmount, CorporateActionAmounts37.mmFATCATaxAmount, CorporateActionAmounts37.mmNRATaxAmount,
					CorporateActionAmounts37.mmBackUpWithholdingTaxAmount, CorporateActionAmounts37.mmTaxOnIncomeAmount, CorporateActionAmounts37.mmTransactionTax, CorporateActionRate71.mmRequestedSecondLevelTaxRate,
					CorporateActionAmounts36.mmTaxFreeAmount, CorporateActionAmounts36.mmTaxDeferredAmount, CorporateActionAmounts36.mmValueAddedTaxAmount, CorporateActionAmounts36.mmStampDutyAmount,
					CorporateActionAmounts36.mmTaxReclaimAmount, CorporateActionAmounts36.mmAdditionalTaxAmount, CorporateActionAmounts36.mmWithholdingTaxAmount, CorporateActionAmounts36.mmSecondLevelTaxAmount,
					CorporateActionAmounts36.mmFiscalStampAmount, CorporateActionAmounts36.mmStockExchangeTax, CorporateActionAmounts36.mmEUTaxRetentionAmount, CorporateActionAmounts36.mmFATCATaxAmount,
					CorporateActionAmounts36.mmNRATaxAmount, CorporateActionAmounts36.mmBackUpWithholdingTaxAmount, CorporateActionAmounts36.mmTaxOnIncomeAmount, CorporateActionAmounts36.mmTransactionTax, Tax28.mmAmount,
					CorporateActionAmounts38.mmTaxFreeAmount, CorporateActionAmounts38.mmTaxDeferredAmount, CorporateActionAmounts38.mmValueAddedTaxAmount, CorporateActionAmounts38.mmStampDutyAmount,
					CorporateActionAmounts38.mmTaxReclaimAmount, CorporateActionAmounts38.mmAdditionalTaxAmount, CorporateActionAmounts38.mmWithholdingTaxAmount, CorporateActionAmounts38.mmSecondLevelTaxAmount,
					CorporateActionAmounts38.mmFiscalStampAmount, CorporateActionAmounts38.mmFATCATaxAmount, CorporateActionAmounts38.mmNRATaxAmount, CorporateActionAmounts38.mmBackUpWithholdingTaxAmount,
					CorporateActionAmounts38.mmTaxOnIncomeAmount, CorporateActionAmounts38.mmTransactionTax, Tax32.mmInformativeAmount, Tax30.mmTax, Tax31.mmAppliedAmount, TaxAmountOrRate4Choice.mmAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money resulting from the calculation of the tax.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate rate;
	/**
	 * Rate used for calculation of the tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax17#mmRate Tax17.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission16#mmVATRate
	 * Commission16.mmVATRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmWithholdingTax
	 * CorporateActionRate2.mmWithholdingTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmTaxOnIncome
	 * CorporateActionRate2.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmTaxOnProfit
	 * CorporateActionRate2.mmTaxOnProfit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmTaxReclaim
	 * CorporateActionRate2.mmTaxReclaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmFiscalStamp
	 * CorporateActionRate2.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmNonResidentRate
	 * CorporateActionRate2.mmNonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmTaxCreditRate
	 * TaxVoucher1.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmWithholdingTaxRate
	 * TaxVoucher1.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat40Choice#mmRate
	 * RateAndAmountFormat40Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndPercentageRate8#mmRate
	 * RateTypeAndPercentageRate8.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate69#mmFiscalStamp
	 * CorporateActionRate69.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate72#mmFiscalStamp
	 * CorporateActionRate72.mmFiscalStamp}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TreasuryProfile1#mmRate
	 * TreasuryProfile1.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax32#mmInformativeRate
	 * Tax32.mmInformativeRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax31#mmAppliedRate
	 * Tax31.mmAppliedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxAmountOrRate4Choice#mmRate
	 * TaxAmountOrRate4Choice.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxReporting2#mmTaxRate
	 * TaxReporting2.mmTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#mmWithholdingTaxRate
	 * RateDetails26.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#mmSecondLevelTax
	 * RateDetails26.mmSecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#mmFiscalStamp
	 * RateDetails26.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#mmTaxOnIncome
	 * RateDetails26.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#mmTaxOnProfits
	 * RateDetails26.mmTaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#mmTaxReclaimRate
	 * RateDetails26.mmTaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate82#mmWithholdingTaxRate
	 * CorporateActionRate82.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate82#mmSecondLevelTax
	 * CorporateActionRate82.mmSecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#mmWithholdingTaxRate
	 * CorporateActionRate80.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#mmSecondLevelTax
	 * CorporateActionRate80.mmSecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#mmTaxOnIncome
	 * CorporateActionRate80.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#mmFiscalStamp
	 * RateDetails27.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#mmWithholdingTaxRate
	 * RateDetails27.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#mmSecondLevelTax
	 * RateDetails27.mmSecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#mmTaxOnIncome
	 * RateDetails27.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#mmTaxOnProfits
	 * RateDetails27.mmTaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#mmTaxReclaimRate
	 * RateDetails27.mmTaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#mmWithholdingTaxRate
	 * CorporateActionRate81.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#mmSecondLevelTax
	 * CorporateActionRate81.mmSecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#mmTaxOnIncome
	 * CorporateActionRate81.mmTaxOnIncome}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate used for calculation of the tax."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Tax17.mmRate, Commission16.mmVATRate, CorporateActionRate2.mmWithholdingTax, CorporateActionRate2.mmTaxOnIncome, CorporateActionRate2.mmTaxOnProfit, CorporateActionRate2.mmTaxReclaim,
					CorporateActionRate2.mmFiscalStamp, CorporateActionRate2.mmNonResidentRate, TaxVoucher1.mmTaxCreditRate, TaxVoucher1.mmWithholdingTaxRate, RateAndAmountFormat40Choice.mmRate, RateTypeAndPercentageRate8.mmRate,
					CorporateActionRate69.mmFiscalStamp, CorporateActionRate72.mmFiscalStamp, TreasuryProfile1.mmRate, Tax32.mmInformativeRate, Tax31.mmAppliedRate, TaxAmountOrRate4Choice.mmRate, TaxReporting2.mmTaxRate,
					RateDetails26.mmWithholdingTaxRate, RateDetails26.mmSecondLevelTax, RateDetails26.mmFiscalStamp, RateDetails26.mmTaxOnIncome, RateDetails26.mmTaxOnProfits, RateDetails26.mmTaxReclaimRate,
					CorporateActionRate82.mmWithholdingTaxRate, CorporateActionRate82.mmSecondLevelTax, CorporateActionRate80.mmWithholdingTaxRate, CorporateActionRate80.mmSecondLevelTax, CorporateActionRate80.mmTaxOnIncome,
					RateDetails27.mmFiscalStamp, RateDetails27.mmWithholdingTaxRate, RateDetails27.mmSecondLevelTax, RateDetails27.mmTaxOnIncome, RateDetails27.mmTaxOnProfits, RateDetails27.mmTaxReclaimRate,
					CorporateActionRate81.mmWithholdingTaxRate, CorporateActionRate81.mmSecondLevelTax, CorporateActionRate81.mmTaxOnIncome);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Rate used for calculation of the tax.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Party taxableParty;
	/**
	 * Party which is taxable at a specific location
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmTaxationConditions
	 * Party.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party which is taxable at a specific location"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTaxableParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxableParty";
			definition = "Party which is taxable at a specific location";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Party.mmTaxationConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
		}
	};
	protected NetAssetValueCalculation taxRefundValueCalculation;
	/**
	 * Net asset value calculation for which tax refund information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmTaxRefund
	 * NetAssetValueCalculation.mmTaxRefund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRefundValueCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net asset value calculation for which tax refund information is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTaxRefundValueCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxRefundValueCalculation";
			definition = "Net asset value calculation for which tax refund information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmTaxRefund;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
		}
	};
	protected TaxationBasisCode basis;
	/**
	 * Basis used to determine the capital gain or loss, eg, the purchase price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxationBasisCode
	 * TaxationBasisCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeTaxBasisType1Choice#mmCode
	 * ChargeTaxBasisType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeTaxBasisType1Choice#mmProprietary
	 * ChargeTaxBasisType1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.TaxBasis1Choice#mmCode
	 * TaxBasis1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxBasis1Choice#mmProprietary
	 * TaxBasis1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation8#mmBasis
	 * TaxCalculationInformation8.mmBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmChargeTaxBasisType
	 * Order17.mmChargeTaxBasisType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmChargeTaxBasisType
	 * Order18.mmChargeTaxBasisType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeBasisType1Choice#mmCode
	 * ChargeBasisType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeBasisType1Choice#mmProprietary
	 * ChargeBasisType1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax28#mmBasis
	 * Tax28.mmBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation9#mmBasis
	 * TaxCalculationInformation9.mmBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation10#mmBasis
	 * TaxCalculationInformation10.mmBasis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Basis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Basis used to determine the capital gain or loss, eg, the purchase price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBasis = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ChargeTaxBasisType1Choice.mmCode, ChargeTaxBasisType1Choice.mmProprietary, TaxBasis1Choice.mmCode, TaxBasis1Choice.mmProprietary, TaxCalculationInformation8.mmBasis,
					Order17.mmChargeTaxBasisType, Order18.mmChargeTaxBasisType, ChargeBasisType1Choice.mmCode, ChargeBasisType1Choice.mmProprietary, Tax28.mmBasis, TaxCalculationInformation9.mmBasis, TaxCalculationInformation10.mmBasis);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Basis";
			definition = "Basis used to determine the capital gain or loss, eg, the purchase price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxationBasisCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getBasis", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesTransfer securitiesTransfer;
	/**
	 * Transfer process for which a tax is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferTax
	 * SecuritiesTransfer.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer process for which a tax is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesTransfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTransfer";
			definition = "Transfer process for which a tax is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmTransferTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
		}
	};
	protected RateTypeCode taxRateType;
	/**
	 * Specifies the type of tax rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.RateTypeCode
	 * RateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType37Choice#mmCode
	 * RateType37Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType37Choice#mmProprietary
	 * RateType37Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of tax rate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxRateType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RateType37Choice.mmCode, RateType37Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxRateType";
			definition = "Specifies the type of tax rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RateTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getTaxRateType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CashAccount> taxAccount;
	/**
	 * Account to be used for taxes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmTax
	 * CashAccount.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Account8Choice#mmTaxAccount
	 * Account8Choice.mmTaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxReporting2#mmCashAccountDetails
	 * TaxReporting2.mmCashAccountDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to be used for taxes."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTaxAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Account8Choice.mmTaxAccount, TaxReporting2.mmCashAccountDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxAccount";
			definition = "Account to be used for taxes.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	protected Max350Text taxationConditions;
	/**
	 * Specifies other taxation conditions.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative1#mmTaxationConditions
	 * CorporateActionNarrative1.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative2#mmTaxationConditions
	 * CorporateActionNarrative2.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27#mmTaxationConditions
	 * CorporateActionNarrative27.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative31#mmTaxationConditions
	 * CorporateActionNarrative31.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative28#mmTaxationConditions
	 * CorporateActionNarrative28.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative29#mmTaxationConditions
	 * CorporateActionNarrative29.mmTaxationConditions}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxationConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies other taxation conditions."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxationConditions = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionNarrative1.mmTaxationConditions, CorporateActionNarrative2.mmTaxationConditions, CorporateActionNarrative27.mmTaxationConditions,
					CorporateActionNarrative31.mmTaxationConditions, CorporateActionNarrative28.mmTaxationConditions, CorporateActionNarrative29.mmTaxationConditions);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxationConditions";
			definition = "Specifies other taxation conditions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getTaxationConditions", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Adjustment adjustment;
	/**
	 * Specifies the adjustments subject to a tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmTax
	 * Adjustment.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Adjustment
	 * Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Adjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the adjustments subject to a tax."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAdjustment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Adjustment";
			definition = "Specifies the adjustments subject to a tax.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.mmTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
		}
	};
	protected Interest interest;
	/**
	 * Interest for which a tax is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestTax
	 * Interest.mmInterestTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest for which a tax is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest for which a tax is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.mmInterestTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	protected Max35Text identification;
	/**
	 * Reference used to identify the nature of tax levied, such as Value Added
	 * Tax (VAT).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference used to identify the nature of tax levied, such as Value Added Tax (VAT)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Reference used to identify the nature of tax levied, such as Value Added Tax (VAT).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Payment relatedPaymentSettlement;
	/**
	 * Payment to which the tax applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmTaxOnPayment
	 * Payment.mmTaxOnPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPaymentSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment to which the tax applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedPaymentSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentSettlement";
			definition = "Payment to which the tax applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmTaxOnPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	protected CurrencyAndAmount taxableBaseAmount;
	/**
	 * Amount of money on which the tax is based.
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
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation8#mmTaxableAmount
	 * TaxCalculationInformation8.mmTaxableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation10#mmTaxableAmount
	 * TaxCalculationInformation10.mmTaxableAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableBaseAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money on which the tax is based."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxableBaseAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TaxCalculationInformation8.mmTaxableAmount, TaxCalculationInformation10.mmTaxableAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxableBaseAmount";
			definition = "Amount of money on which the tax is based.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getTaxableBaseAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate taxDate;
	/**
	 * Date by which tax is due.
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmFiscalYear
	 * InvestmentAccount61.mmFiscalYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmFiscalYear
	 * InvestmentAccount63.mmFiscalYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmFiscalYear
	 * InvestmentAccount62.mmFiscalYear}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date by which tax is due."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentAccount61.mmFiscalYear, InvestmentAccount63.mmFiscalYear, InvestmentAccount62.mmFiscalYear);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxDate";
			definition = "Date by which tax is due.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getTaxDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text certificateIdentification;
	/**
	 * Document issued by taxing authority identifying the tax payer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document issued by taxing authority identifying the tax payer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCertificateIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertificateIdentification";
			definition = "Document issued by taxing authority identifying the tax payer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getCertificateIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max140Text administrationZone;
	/**
	 * Territorial part of a country to which the tax payment is related.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdministrationZone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Territorial part of a country to which the tax payment is related."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAdministrationZone = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdministrationZone";
			definition = "Territorial part of a country to which the tax payment is related.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getAdministrationZone", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text method;
	/**
	 * Method used to indicate the underlying business or how the tax is paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Method"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method used to indicate the underlying business or how the tax is paid."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Method";
			definition = "Method used to indicate the underlying business or how the tax is paid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getMethod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.TaxRecord> record;
	/**
	 * Record of tax details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.TaxRecord#mmTax
	 * TaxRecord.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TaxRecord TaxRecord}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Record"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Record of tax details."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRecord = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Record";
			definition = "Record of tax details.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TaxRecord.mmTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TaxRecord.mmObject();
		}
	};
	protected Product product;
	/**
	 * Product on which a tax is applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Product#mmTax
	 * Product.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Product"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Product on which a tax is applied."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmProduct = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Product";
			definition = "Product on which a tax is applied.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Product.mmTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CurrencyExchange> currencyExchange;
	/**
	 * Currency exchange applicable to a tax
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmTax
	 * CurrencyExchange.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency exchange applicable to a tax"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCurrencyExchange = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Currency exchange applicable to a tax";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};
	protected CurrencyCode currency;
	/**
	 * Currency in which the tax must be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency in which the tax must be settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency in which the tax must be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.TaxPartyRole> partyRole;
	/**
	 * Specifies each role linked to a tax and played by a party in that
	 * context.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TaxPartyRole#mmTax
	 * TaxPartyRole.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TaxPartyRole
	 * TaxPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to a tax and played by a party in that context."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to a tax and played by a party in that context.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TaxPartyRole.mmTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TaxPartyRole.mmObject();
		}
	};
	protected CurrencyAndAmount taxDeduction;
	/**
	 * Amount of tax that have been previously deducted.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDeduction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of tax that have been previously deducted."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxDeduction = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxDeduction";
			definition = "Amount of tax that have been previously deducted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getTaxDeduction", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Distribution relatedCorporateActionDistribution;
	/**
	 * Distribution process for which a tax is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#mmDistributionTax
	 * Distribution.mmDistributionTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Distribution
	 * Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateActionDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Distribution process for which a tax is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCorporateActionDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionDistribution";
			definition = "Distribution process for which a tax is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.mmDistributionTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
		}
	};
	protected ISODate calculationDate;
	/**
	 * Date on which the tax is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the tax is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCalculationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationDate";
			definition = "Date on which the tax is calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getCalculationDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Dividend> dividend;
	/**
	 * Dividend for which a tax is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Dividend#mmTax
	 * Dividend.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend for which a tax is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDividend = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Dividend";
			definition = "Dividend for which a tax is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.mmTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
		}
	};
	protected WithholdingTaxRateTypeCode withholdingTaxType;
	/**
	 * Type of withholding tax rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.WithholdingTaxRateTypeCode
	 * WithholdingTaxRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndPercentageRate8#mmRateType
	 * RateTypeAndPercentageRate8.mmRateType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType42Choice#mmCode
	 * RateType42Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType42Choice#mmProprietary
	 * RateType42Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of withholding tax rate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmWithholdingTaxType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RateTypeAndPercentageRate8.mmRateType, RateType42Choice.mmCode, RateType42Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WithholdingTaxType";
			definition = "Type of withholding tax rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> WithholdingTaxRateTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getWithholdingTaxType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionEvent corporateActionEvent;
	/**
	 * Event for which a transaction tax is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmTransactionTax
	 * CorporateActionEvent.mmTransactionTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event for which a transaction tax is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEvent";
			definition = "Event for which a transaction tax is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmTransactionTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	protected TaxIdentificationNumberTypeCode taxIdentificationType;
	/**
	 * Type of tax identification number or identifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxIdentificationNumberTypeCode
	 * TaxIdentificationNumberTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxIdentificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of tax identification number or identifier."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxIdentificationType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxIdentificationType";
			definition = "Type of tax identification number or identifier.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxIdentificationNumberTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getTaxIdentificationType", new Class[]{});
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
				name = "Tax";
				definition = "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.mmTax, com.tools20022.repository.entity.Dividend.mmTax, com.tools20022.repository.entity.NetAssetValueCalculation.mmTaxLiability,
						com.tools20022.repository.entity.NetAssetValueCalculation.mmTaxRefund, com.tools20022.repository.entity.Party.mmTaxationConditions, com.tools20022.repository.entity.CashAccount.mmTax,
						com.tools20022.repository.entity.Product.mmTax, com.tools20022.repository.entity.Adjustment.mmTax, com.tools20022.repository.entity.Payment.mmTaxOnPayment,
						com.tools20022.repository.entity.SecuritiesTransfer.mmTransferTax, com.tools20022.repository.entity.Interest.mmInterestTax, com.tools20022.repository.entity.CurrencyExchange.mmTax,
						com.tools20022.repository.entity.CorporateActionEvent.mmTransactionTax, com.tools20022.repository.entity.TaxPartyRole.mmTax, com.tools20022.repository.entity.TaxRecord.mmTax,
						com.tools20022.repository.entity.Distribution.mmDistributionTax);
				derivationElement_lazy = () -> Arrays.asList(CorporateActionRate2.mmGermanLocalTax1, CorporateActionRate2.mmGermanLocalTax2, CorporateActionRate2.mmGermanLocalTax3, CorporateActionRate2.mmGermanLocalTax4,
						CorporateActionRate2.mmAdditionalTax, CorporateActionRate82.mmAdditionalTax, CorporateActionRate80.mmAdditionalTax, CorporateActionRate81.mmAdditionalTax);
				subType_lazy = () -> Arrays.asList(SecuritiesTax.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Tax.mmExemptionReason, com.tools20022.repository.entity.Tax.mmCountry, com.tools20022.repository.entity.Tax.mmTaxLiabilityValueCalculation,
						com.tools20022.repository.entity.Tax.mmType, com.tools20022.repository.entity.Tax.mmAmount, com.tools20022.repository.entity.Tax.mmRate, com.tools20022.repository.entity.Tax.mmTaxableParty,
						com.tools20022.repository.entity.Tax.mmTaxRefundValueCalculation, com.tools20022.repository.entity.Tax.mmBasis, com.tools20022.repository.entity.Tax.mmSecuritiesTransfer,
						com.tools20022.repository.entity.Tax.mmTaxRateType, com.tools20022.repository.entity.Tax.mmTaxAccount, com.tools20022.repository.entity.Tax.mmTaxationConditions, com.tools20022.repository.entity.Tax.mmAdjustment,
						com.tools20022.repository.entity.Tax.mmInterest, com.tools20022.repository.entity.Tax.mmIdentification, com.tools20022.repository.entity.Tax.mmRelatedPaymentSettlement,
						com.tools20022.repository.entity.Tax.mmTaxableBaseAmount, com.tools20022.repository.entity.Tax.mmTaxDate, com.tools20022.repository.entity.Tax.mmCertificateIdentification,
						com.tools20022.repository.entity.Tax.mmAdministrationZone, com.tools20022.repository.entity.Tax.mmMethod, com.tools20022.repository.entity.Tax.mmRecord, com.tools20022.repository.entity.Tax.mmProduct,
						com.tools20022.repository.entity.Tax.mmCurrencyExchange, com.tools20022.repository.entity.Tax.mmCurrency, com.tools20022.repository.entity.Tax.mmPartyRole, com.tools20022.repository.entity.Tax.mmTaxDeduction,
						com.tools20022.repository.entity.Tax.mmRelatedCorporateActionDistribution, com.tools20022.repository.entity.Tax.mmCalculationDate, com.tools20022.repository.entity.Tax.mmDividend,
						com.tools20022.repository.entity.Tax.mmWithholdingTaxType, com.tools20022.repository.entity.Tax.mmCorporateActionEvent, com.tools20022.repository.entity.Tax.mmTaxIdentificationType);
				derivationComponent_lazy = () -> Arrays.asList(TaxType3FormatChoice.mmObject(), TaxType1Choice.mmObject(), ExemptionReason1Choice.mmObject(), TaxBasis1Choice.mmObject(), RateTypeAndPercentageRate8.mmObject(),
						RateType42Choice.mmObject(), RateType37Choice.mmObject(), TaxExemptionReason2Choice.mmObject(), TaxReporting2.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Tax.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TaxExemptReasonCode getExemptionReason() {
		return exemptionReason;
	}

	public void setExemptionReason(TaxExemptReasonCode exemptionReason) {
		this.exemptionReason = exemptionReason;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(com.tools20022.repository.entity.Country country) {
		this.country = country;
	}

	public NetAssetValueCalculation getTaxLiabilityValueCalculation() {
		return taxLiabilityValueCalculation;
	}

	public void setTaxLiabilityValueCalculation(com.tools20022.repository.entity.NetAssetValueCalculation taxLiabilityValueCalculation) {
		this.taxLiabilityValueCalculation = taxLiabilityValueCalculation;
	}

	public TaxTypeCode getType() {
		return type;
	}

	public void setType(TaxTypeCode type) {
		this.type = type;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(CurrencyAndAmount amount) {
		this.amount = amount;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public void setRate(PercentageRate rate) {
		this.rate = rate;
	}

	public Party getTaxableParty() {
		return taxableParty;
	}

	public void setTaxableParty(com.tools20022.repository.entity.Party taxableParty) {
		this.taxableParty = taxableParty;
	}

	public NetAssetValueCalculation getTaxRefundValueCalculation() {
		return taxRefundValueCalculation;
	}

	public void setTaxRefundValueCalculation(com.tools20022.repository.entity.NetAssetValueCalculation taxRefundValueCalculation) {
		this.taxRefundValueCalculation = taxRefundValueCalculation;
	}

	public TaxationBasisCode getBasis() {
		return basis;
	}

	public void setBasis(TaxationBasisCode basis) {
		this.basis = basis;
	}

	public SecuritiesTransfer getSecuritiesTransfer() {
		return securitiesTransfer;
	}

	public void setSecuritiesTransfer(com.tools20022.repository.entity.SecuritiesTransfer securitiesTransfer) {
		this.securitiesTransfer = securitiesTransfer;
	}

	public RateTypeCode getTaxRateType() {
		return taxRateType;
	}

	public void setTaxRateType(RateTypeCode taxRateType) {
		this.taxRateType = taxRateType;
	}

	public List<CashAccount> getTaxAccount() {
		return taxAccount;
	}

	public void setTaxAccount(List<com.tools20022.repository.entity.CashAccount> taxAccount) {
		this.taxAccount = taxAccount;
	}

	public Max350Text getTaxationConditions() {
		return taxationConditions;
	}

	public void setTaxationConditions(Max350Text taxationConditions) {
		this.taxationConditions = taxationConditions;
	}

	public Adjustment getAdjustment() {
		return adjustment;
	}

	public void setAdjustment(com.tools20022.repository.entity.Adjustment adjustment) {
		this.adjustment = adjustment;
	}

	public Interest getInterest() {
		return interest;
	}

	public void setInterest(com.tools20022.repository.entity.Interest interest) {
		this.interest = interest;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public Payment getRelatedPaymentSettlement() {
		return relatedPaymentSettlement;
	}

	public void setRelatedPaymentSettlement(com.tools20022.repository.entity.Payment relatedPaymentSettlement) {
		this.relatedPaymentSettlement = relatedPaymentSettlement;
	}

	public CurrencyAndAmount getTaxableBaseAmount() {
		return taxableBaseAmount;
	}

	public void setTaxableBaseAmount(CurrencyAndAmount taxableBaseAmount) {
		this.taxableBaseAmount = taxableBaseAmount;
	}

	public ISODate getTaxDate() {
		return taxDate;
	}

	public void setTaxDate(ISODate taxDate) {
		this.taxDate = taxDate;
	}

	public Max35Text getCertificateIdentification() {
		return certificateIdentification;
	}

	public void setCertificateIdentification(Max35Text certificateIdentification) {
		this.certificateIdentification = certificateIdentification;
	}

	public Max140Text getAdministrationZone() {
		return administrationZone;
	}

	public void setAdministrationZone(Max140Text administrationZone) {
		this.administrationZone = administrationZone;
	}

	public Max35Text getMethod() {
		return method;
	}

	public void setMethod(Max35Text method) {
		this.method = method;
	}

	public List<TaxRecord> getRecord() {
		return record;
	}

	public void setRecord(List<com.tools20022.repository.entity.TaxRecord> record) {
		this.record = record;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(com.tools20022.repository.entity.Product product) {
		this.product = product;
	}

	public List<CurrencyExchange> getCurrencyExchange() {
		return currencyExchange;
	}

	public void setCurrencyExchange(List<com.tools20022.repository.entity.CurrencyExchange> currencyExchange) {
		this.currencyExchange = currencyExchange;
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyCode currency) {
		this.currency = currency;
	}

	public List<TaxPartyRole> getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(List<com.tools20022.repository.entity.TaxPartyRole> partyRole) {
		this.partyRole = partyRole;
	}

	public CurrencyAndAmount getTaxDeduction() {
		return taxDeduction;
	}

	public void setTaxDeduction(CurrencyAndAmount taxDeduction) {
		this.taxDeduction = taxDeduction;
	}

	public Distribution getRelatedCorporateActionDistribution() {
		return relatedCorporateActionDistribution;
	}

	public void setRelatedCorporateActionDistribution(com.tools20022.repository.entity.Distribution relatedCorporateActionDistribution) {
		this.relatedCorporateActionDistribution = relatedCorporateActionDistribution;
	}

	public ISODate getCalculationDate() {
		return calculationDate;
	}

	public void setCalculationDate(ISODate calculationDate) {
		this.calculationDate = calculationDate;
	}

	public List<Dividend> getDividend() {
		return dividend;
	}

	public void setDividend(List<com.tools20022.repository.entity.Dividend> dividend) {
		this.dividend = dividend;
	}

	public WithholdingTaxRateTypeCode getWithholdingTaxType() {
		return withholdingTaxType;
	}

	public void setWithholdingTaxType(WithholdingTaxRateTypeCode withholdingTaxType) {
		this.withholdingTaxType = withholdingTaxType;
	}

	public CorporateActionEvent getCorporateActionEvent() {
		return corporateActionEvent;
	}

	public void setCorporateActionEvent(com.tools20022.repository.entity.CorporateActionEvent corporateActionEvent) {
		this.corporateActionEvent = corporateActionEvent;
	}

	public TaxIdentificationNumberTypeCode getTaxIdentificationType() {
		return taxIdentificationType;
	}

	public void setTaxIdentificationType(TaxIdentificationNumberTypeCode taxIdentificationType) {
		this.taxIdentificationType = taxIdentificationType;
	}
}