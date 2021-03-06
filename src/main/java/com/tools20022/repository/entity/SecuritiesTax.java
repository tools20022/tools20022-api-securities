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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Amount of money due to the government or tax authority, according to various
 * pre-defined parameters such as thresholds or income.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesTax" src="doc-files/SecuritiesTax.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerShare
 * SecuritiesTax.mmTaxableIncomePerShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerShareCalculated
 * SecuritiesTax.mmTaxableIncomePerShareCalculated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmEUCapitalGain
 * SecuritiesTax.mmEUCapitalGain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmEUDividendStatus
 * SecuritiesTax.mmEUDividendStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerDividend
 * SecuritiesTax.mmTaxableIncomePerDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmStampDutyType
 * SecuritiesTax.mmStampDutyType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmStampDutyTaxBasis
 * SecuritiesTax.mmStampDutyTaxBasis}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxVoucher
 * SecuritiesTax.mmTaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerDividendShare
 * SecuritiesTax.mmTaxableIncomePerDividendShare}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#mmRelatedTax
 * SecuritiesTax.mmRelatedTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxLotNumber
 * SecuritiesTax.mmTaxLotNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#mmSecurity
 * SecuritiesTax.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxRuleExemptIndicator
 * SecuritiesTax.mmTaxRuleExemptIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmEffectivePeriod
 * SecuritiesTax.mmEffectivePeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#mmFrankedRate
 * SecuritiesTax.mmFrankedRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTEFRARule
 * SecuritiesTax.mmTEFRARule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmJurisdiction
 * SecuritiesTax.mmJurisdiction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmTaxDetails
 * Security.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmRelatedSecurityTax
 * TaxVoucher.mmRelatedSecurityTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmSecuritiesTax
 * RateAndAmount.mmSecuritiesTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmRelatedSecuritiesTax
 * Jurisdiction.mmRelatedSecuritiesTax}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat40Choice#mmRateTypeAndRate
 * RateAndAmountFormat40Choice.mmRateTypeAndRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmInformativeTaxDetails
 * SubscriptionExecution13.mmInformativeTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmInformativeTaxDetails
 * SubscriptionExecution12.mmInformativeTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmInformativeTaxDetails
 * RedemptionExecution16.mmInformativeTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmInformativeTaxDetails
 * SwitchSubscriptionLegExecution4.mmInformativeTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmInformativeTaxDetails
 * RedemptionExecution15.mmInformativeTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmInformativeTaxDetails
 * SwitchRedemptionLegExecution4.mmInformativeTaxDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFundTax
 * InvestmentFundTax}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.EUCapitalGainType2Choice
 * EUCapitalGainType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.StampDutyType1FormatChoice
 * StampDutyType1FormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateAndAmountFormat40Choice
 * RateAndAmountFormat40Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat3Choice
 * TaxableIncomePerShareCalculatedFormat3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CapitalGainFormat3Choice
 * CapitalGainFormat3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InformativeTax1
 * InformativeTax1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.EUCapitalGain3Choice
 * EUCapitalGain3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.EUDividendStatusType2Choice
 * EUDividendStatusType2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculated2Choice
 * TaxableIncomePerShareCalculated2Choice}</li>
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
 * "SecuritiesTax"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income."
 * </li>
 * </ul>
 */
public class SecuritiesTax extends Tax {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyAndAmount taxableIncomePerShare;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmTaxableIncomePerShare
	 * UnitPrice15.mmTaxableIncomePerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmTaxableIncomePerShare
	 * FinancialInstrumentAttributes44.mmTaxableIncomePerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice22#mmTaxableIncomePerShare
	 * UnitPrice22.mmTaxableIncomePerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice23#mmTaxableIncomePerShare
	 * UnitPrice23.mmTaxableIncomePerShare}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableIncomePerShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount included in the NAV that corresponds to gains directly or indirectly derived from interest payment in the scope of the European Directive on taxation of savings income in the form of interest payments."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTax, ActiveCurrencyAndAmount> mmTaxableIncomePerShare = new MMBusinessAttribute<SecuritiesTax, ActiveCurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(UnitPrice15.mmTaxableIncomePerShare, FinancialInstrumentAttributes44.mmTaxableIncomePerShare, UnitPrice22.mmTaxableIncomePerShare, UnitPrice23.mmTaxableIncomePerShare);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxableIncomePerShare";
			definition = "Amount included in the NAV that corresponds to gains directly or indirectly derived from interest payment in the scope of the European Directive on taxation of savings income in the form of interest payments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(SecuritiesTax obj) {
			return obj.getTaxableIncomePerShare();
		}

		@Override
		public void setValue(SecuritiesTax obj, ActiveCurrencyAndAmount value) {
			obj.setTaxableIncomePerShare(value);
		}
	};
	protected TaxableIncomePerShareCalculatedCode taxableIncomePerShareCalculated;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode
	 * TaxableIncomePerShareCalculatedCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmTaxableIncomePerShareCalculated
	 * UnitPrice15.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmExtendedTaxableIncomePerShareCalculated
	 * UnitPrice15.mmExtendedTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmTaxableIncomePerShareCalculated
	 * CorporateAction2.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat3Choice#mmCode
	 * TaxableIncomePerShareCalculatedFormat3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat3Choice#mmProprietary
	 * TaxableIncomePerShareCalculatedFormat3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice22#mmTaxableIncomePerShareCalculated
	 * UnitPrice22.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculated2Choice#mmCode
	 * TaxableIncomePerShareCalculated2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculated2Choice#mmProprietary
	 * TaxableIncomePerShareCalculated2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice23#mmTaxableIncomePerShareCalculated
	 * UnitPrice23.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmTaxableIncomePerShareCalculated
	 * CorporateAction41.mmTaxableIncomePerShareCalculated}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableIncomePerShareCalculated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the fund calculates a taxable interest per share (TIS)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTax, TaxableIncomePerShareCalculatedCode> mmTaxableIncomePerShareCalculated = new MMBusinessAttribute<SecuritiesTax, TaxableIncomePerShareCalculatedCode>() {
		{
			derivation_lazy = () -> Arrays.asList(UnitPrice15.mmTaxableIncomePerShareCalculated, UnitPrice15.mmExtendedTaxableIncomePerShareCalculated, CorporateAction2.mmTaxableIncomePerShareCalculated,
					TaxableIncomePerShareCalculatedFormat3Choice.mmCode, TaxableIncomePerShareCalculatedFormat3Choice.mmProprietary, UnitPrice22.mmTaxableIncomePerShareCalculated, TaxableIncomePerShareCalculated2Choice.mmCode,
					TaxableIncomePerShareCalculated2Choice.mmProprietary, UnitPrice23.mmTaxableIncomePerShareCalculated, CorporateAction41.mmTaxableIncomePerShareCalculated);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxableIncomePerShareCalculated";
			definition = "Specifies whether the fund calculates a taxable interest per share (TIS).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxableIncomePerShareCalculatedCode.mmObject();
		}

		@Override
		public TaxableIncomePerShareCalculatedCode getValue(SecuritiesTax obj) {
			return obj.getTaxableIncomePerShareCalculated();
		}

		@Override
		public void setValue(SecuritiesTax obj, TaxableIncomePerShareCalculatedCode value) {
			obj.setTaxableIncomePerShareCalculated(value);
		}
	};
	protected EUCapitalGainCode eUCapitalGain;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EUCapitalGainCode
	 * EUCapitalGainCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#mmEUCapitalGain
	 * TaxCalculationInformation4.mmEUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#mmExtendedEUCapitalGain
	 * TaxCalculationInformation4.mmExtendedEUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EUCapitalGainType2Choice#mmEUCapitalGain
	 * EUCapitalGainType2Choice.mmEUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EUCapitalGainType2Choice#mmProprietary
	 * EUCapitalGainType2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmCapitalGain
	 * CorporateAction2.mmCapitalGain}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmCapitalGainType
	 * Order17.mmCapitalGainType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmCapitalGainType
	 * Order18.mmCapitalGainType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CapitalGainFormat3Choice#mmCode
	 * CapitalGainFormat3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CapitalGainFormat3Choice#mmProprietary
	 * CapitalGainFormat3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InformativeTax1#mmEUCapitalGain
	 * InformativeTax1.mmEUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EUCapitalGain3Choice#mmCode
	 * EUCapitalGain3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EUCapitalGain3Choice#mmProprietary
	 * EUCapitalGain3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmCapitalGainInOutIndicator
	 * CorporateAction41.mmCapitalGainInOutIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUCapitalGain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether capital gain is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June), or an income realised upon sale, a refund or redemption of shares and units, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTax, EUCapitalGainCode> mmEUCapitalGain = new MMBusinessAttribute<SecuritiesTax, EUCapitalGainCode>() {
		{
			derivation_lazy = () -> Arrays.asList(TaxCalculationInformation4.mmEUCapitalGain, TaxCalculationInformation4.mmExtendedEUCapitalGain, EUCapitalGainType2Choice.mmEUCapitalGain, EUCapitalGainType2Choice.mmProprietary,
					CorporateAction2.mmCapitalGain, Order17.mmCapitalGainType, Order18.mmCapitalGainType, CapitalGainFormat3Choice.mmCode, CapitalGainFormat3Choice.mmProprietary, InformativeTax1.mmEUCapitalGain,
					EUCapitalGain3Choice.mmCode, EUCapitalGain3Choice.mmProprietary, CorporateAction41.mmCapitalGainInOutIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EUCapitalGain";
			definition = "Specifies whether capital gain is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June), or an income realised upon sale, a refund or redemption of shares and units, etc.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EUCapitalGainCode.mmObject();
		}

		@Override
		public EUCapitalGainCode getValue(SecuritiesTax obj) {
			return obj.getEUCapitalGain();
		}

		@Override
		public void setValue(SecuritiesTax obj, EUCapitalGainCode value) {
			obj.setEUCapitalGain(value);
		}
	};
	protected EUDividendStatusCode eUDividendStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EUDividendStatusCode
	 * EUDividendStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#mmEUDividendStatus
	 * TaxCalculationInformation4.mmEUDividendStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#mmExtendedEUDividendStatus
	 * TaxCalculationInformation4.mmExtendedEUDividendStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmEUDividendStatus
	 * UnitPrice15.mmEUDividendStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmExtendedEUDividendStatus
	 * UnitPrice15.mmExtendedEUDividendStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InformativeTax1#mmEUDividendStatus
	 * InformativeTax1.mmEUDividendStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EUDividendStatusType2Choice#mmCode
	 * EUDividendStatusType2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EUDividendStatusType2Choice#mmProprietary
	 * EUDividendStatusType2Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUDividendStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether dividend is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June), or an income realised upon sale, a refund or redemption of shares and units, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTax, EUDividendStatusCode> mmEUDividendStatus = new MMBusinessAttribute<SecuritiesTax, EUDividendStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(TaxCalculationInformation4.mmEUDividendStatus, TaxCalculationInformation4.mmExtendedEUDividendStatus, UnitPrice15.mmEUDividendStatus, UnitPrice15.mmExtendedEUDividendStatus,
					InformativeTax1.mmEUDividendStatus, EUDividendStatusType2Choice.mmCode, EUDividendStatusType2Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EUDividendStatus";
			definition = "Specifies whether dividend is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June), or an income realised upon sale, a refund or redemption of shares and units, etc.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EUDividendStatusCode.mmObject();
		}

		@Override
		public EUDividendStatusCode getValue(SecuritiesTax obj) {
			return obj.getEUDividendStatus();
		}

		@Override
		public void setValue(SecuritiesTax obj, EUDividendStatusCode value) {
			obj.setEUDividendStatus(value);
		}
	};
	protected CurrencyAndAmount taxableIncomePerDividend;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#mmTaxableIncomePerDividend
	 * TaxCalculationInformation4.mmTaxableIncomePerDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmTaxableIncomePerDividend
	 * UnitPrice15.mmTaxableIncomePerDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InformativeTax1#mmTaxableIncomePerDividend
	 * InformativeTax1.mmTaxableIncomePerDividend}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableIncomePerDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount included in the dividend that corresponds to gains directly or indirectly derived from interest payment in the scope of the European Directive on taxation of savings income in the form of interest payments."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTax, CurrencyAndAmount> mmTaxableIncomePerDividend = new MMBusinessAttribute<SecuritiesTax, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(TaxCalculationInformation4.mmTaxableIncomePerDividend, UnitPrice15.mmTaxableIncomePerDividend, InformativeTax1.mmTaxableIncomePerDividend);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxableIncomePerDividend";
			definition = "Amount included in the dividend that corresponds to gains directly or indirectly derived from interest payment in the scope of the European Directive on taxation of savings income in the form of interest payments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(SecuritiesTax obj) {
			return obj.getTaxableIncomePerDividend();
		}

		@Override
		public void setValue(SecuritiesTax obj, CurrencyAndAmount value) {
			obj.setTaxableIncomePerDividend(value);
		}
	};
	protected StampDutyTypeCode stampDutyType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StampDutyTypeCode
	 * StampDutyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StampDutyType1FormatChoice#mmCode
	 * StampDutyType1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StampDutyType1FormatChoice#mmProprietary
	 * StampDutyType1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation18#mmStampDuty
	 * ReceiveInformation18.mmStampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation19#mmStampDuty
	 * DeliverInformation19.mmStampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation19#mmStampDuty
	 * ReceiveInformation19.mmStampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation18#mmStampDuty
	 * DeliverInformation18.mmStampDuty}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDutyType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates how the stamp duty should be applied."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTax, StampDutyTypeCode> mmStampDutyType = new MMBusinessAttribute<SecuritiesTax, StampDutyTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(StampDutyType1FormatChoice.mmCode, StampDutyType1FormatChoice.mmProprietary, ReceiveInformation18.mmStampDuty, DeliverInformation19.mmStampDuty, ReceiveInformation19.mmStampDuty,
					DeliverInformation18.mmStampDuty);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StampDutyType";
			definition = "Indicates how the stamp duty should be applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StampDutyTypeCode.mmObject();
		}

		@Override
		public StampDutyTypeCode getValue(SecuritiesTax obj) {
			return obj.getStampDutyType();
		}

		@Override
		public void setValue(SecuritiesTax obj, StampDutyTypeCode value) {
			obj.setStampDutyType(value);
		}
	};
	protected Max4AlphaNumericText stampDutyTaxBasis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmStampDutyTaxBasis
	 * SettlementDetails43.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmStampDutyTaxBasis
	 * SettlementDetails97.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails100#mmStampDutyTaxBasis
	 * SettlementDetails100.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#mmStampDutyTaxBasis
	 * SettlementDetails98.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails147#mmStampDutyTaxBasis
	 * SettlementDetails147.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmStampDutyTaxBasis
	 * SettlementDetails142.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmStampDutyTaxBasis
	 * SettlementDetails144.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148#mmStampDutyTaxBasis
	 * SettlementDetails148.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails141#mmStampDutyTaxBasis
	 * SettlementDetails141.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmStampDutyTaxBasis
	 * SettlementDetails145.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmStampDutyTaxBasis
	 * SettlementDetails146.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143#mmStampDutyTaxBasis
	 * SettlementDetails143.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails149#mmStampDutyTaxBasis
	 * SettlementDetails149.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmStampDutyTaxBasis
	 * SettlementDetails150.mmStampDutyTaxBasis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::STAM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDutyTaxBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the stamp duty type or exemption reason applicable to the settlement transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTax, Max4AlphaNumericText> mmStampDutyTaxBasis = new MMBusinessAttribute<SecuritiesTax, Max4AlphaNumericText>() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementDetails43.mmStampDutyTaxBasis, SettlementDetails97.mmStampDutyTaxBasis, SettlementDetails100.mmStampDutyTaxBasis, SettlementDetails98.mmStampDutyTaxBasis,
					SettlementDetails147.mmStampDutyTaxBasis, SettlementDetails142.mmStampDutyTaxBasis, SettlementDetails144.mmStampDutyTaxBasis, SettlementDetails148.mmStampDutyTaxBasis, SettlementDetails141.mmStampDutyTaxBasis,
					SettlementDetails145.mmStampDutyTaxBasis, SettlementDetails146.mmStampDutyTaxBasis, SettlementDetails143.mmStampDutyTaxBasis, SettlementDetails149.mmStampDutyTaxBasis, SettlementDetails150.mmStampDutyTaxBasis);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::STAM"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StampDutyTaxBasis";
			definition = "Specifies the stamp duty type or exemption reason applicable to the settlement transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}

		@Override
		public Max4AlphaNumericText getValue(SecuritiesTax obj) {
			return obj.getStampDutyTaxBasis();
		}

		@Override
		public void setValue(SecuritiesTax obj, Max4AlphaNumericText value) {
			obj.setStampDutyTaxBasis(value);
		}
	};
	protected TaxVoucher taxVoucher;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmRelatedSecurityTax
	 * TaxVoucher.mmRelatedSecurityTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TaxVoucher
	 * TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxVoucher"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax voucher which is related to a securities tax."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesTax, Optional<TaxVoucher>> mmTaxVoucher = new MMBusinessAssociationEnd<SecuritiesTax, Optional<TaxVoucher>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxVoucher";
			definition = "Tax voucher which is related to a securities tax.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmRelatedSecurityTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
		}

		@Override
		public Optional<TaxVoucher> getValue(SecuritiesTax obj) {
			return obj.getTaxVoucher();
		}

		@Override
		public void setValue(SecuritiesTax obj, Optional<TaxVoucher> value) {
			obj.setTaxVoucher(value.orElse(null));
		}
	};
	protected ActiveCurrencyAndAmount taxableIncomePerDividendShare;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1#mmTaxableIncomePerDividendShare
	 * CorporateActionPrice1.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate86#mmTaxableIncomePerDividendShare
	 * CorporateActionRate86.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87#mmTaxableIncomePerDividendShare
	 * CorporateActionRate87.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate88#mmTaxableIncomePerDividendShare
	 * CorporateActionRate88.mmTaxableIncomePerDividendShare}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableIncomePerDividendShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount included in the dividend/NAV that is identified as gains directly or indirectly derived from interest payments within the scope of the EU Savings directive"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTax, ActiveCurrencyAndAmount> mmTaxableIncomePerDividendShare = new MMBusinessAttribute<SecuritiesTax, ActiveCurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPrice1.mmTaxableIncomePerDividendShare, CorporateActionRate86.mmTaxableIncomePerDividendShare, CorporateActionRate87.mmTaxableIncomePerDividendShare,
					CorporateActionRate88.mmTaxableIncomePerDividendShare);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxableIncomePerDividendShare";
			definition = "Amount included in the dividend/NAV that is identified as gains directly or indirectly derived from interest payments within the scope of the EU Savings directive";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(SecuritiesTax obj) {
			return obj.getTaxableIncomePerDividendShare();
		}

		@Override
		public void setValue(SecuritiesTax obj, ActiveCurrencyAndAmount value) {
			obj.setTaxableIncomePerDividendShare(value);
		}
	};
	protected RateAndAmount relatedTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmSecuritiesTax
	 * RateAndAmount.mmSecuritiesTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RateAndAmount
	 * RateAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the gross dividend rate on which tax must be paid ."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesTax, RateAndAmount> mmRelatedTax = new MMBusinessAssociationEnd<SecuritiesTax, RateAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedTax";
			definition = "Percentage of the gross dividend rate on which tax must be paid .";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> RateAndAmount.mmSecuritiesTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> RateAndAmount.mmObject();
		}

		@Override
		public RateAndAmount getValue(SecuritiesTax obj) {
			return obj.getRelatedTax();
		}

		@Override
		public void setValue(SecuritiesTax obj, RateAndAmount value) {
			obj.setRelatedTax(value);
		}
	};
	protected Max15NumericText taxLotNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxLotNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification, for tax purposes, of a lot of identical securities that are bought at a certain date and at a certain price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTax, Max15NumericText> mmTaxLotNumber = new MMBusinessAttribute<SecuritiesTax, Max15NumericText>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxLotNumber";
			definition = "Identification, for tax purposes, of a lot of identical securities that are bought at a certain date and at a certain price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		@Override
		public Max15NumericText getValue(SecuritiesTax obj) {
			return obj.getTaxLotNumber();
		}

		@Override
		public void setValue(SecuritiesTax obj, Max15NumericText value) {
			obj.setTaxLotNumber(value);
		}
	};
	protected Security security;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmTaxDetails
	 * Security.mmTaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security on which the tax applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesTax, Optional<Security>> mmSecurity = new MMBusinessAssociationEnd<SecuritiesTax, Optional<Security>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security on which the tax applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmTaxDetails;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}

		@Override
		public Optional<Security> getValue(SecuritiesTax obj) {
			return obj.getSecurity();
		}

		@Override
		public void setValue(SecuritiesTax obj, Optional<Security> value) {
			obj.setSecurity(value.orElse(null));
		}
	};
	protected YesNoIndicator taxRuleExemptIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRuleExemptIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the tax rule applies within the jurisdiction as a condition of this security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTax, YesNoIndicator> mmTaxRuleExemptIndicator = new MMBusinessAttribute<SecuritiesTax, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxRuleExemptIndicator";
			definition = "Indicates whether the tax rule applies within the jurisdiction as a condition of this security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesTax obj) {
			return obj.getTaxRuleExemptIndicator();
		}

		@Override
		public void setValue(SecuritiesTax obj, YesNoIndicator value) {
			obj.setTaxRuleExemptIndicator(value);
		}
	};
	protected DateTimePeriod effectivePeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectivePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the tax rule applies within the jurisdiction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTax, DateTimePeriod> mmEffectivePeriod = new MMBusinessAttribute<SecuritiesTax, DateTimePeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EffectivePeriod";
			definition = "Period during which the tax rule applies within the jurisdiction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(SecuritiesTax obj) {
			return obj.getEffectivePeriod();
		}

		@Override
		public void setValue(SecuritiesTax obj, DateTimePeriod value) {
			obj.setEffectivePeriod(value);
		}
	};
	protected PercentageRate frankedRate;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrankedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of dividend for which tax is already paid."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTax, PercentageRate> mmFrankedRate = new MMBusinessAttribute<SecuritiesTax, PercentageRate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FrankedRate";
			definition = "Percentage of dividend for which tax is already paid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(SecuritiesTax obj) {
			return obj.getFrankedRate();
		}

		@Override
		public void setValue(SecuritiesTax obj, PercentageRate value) {
			obj.setFrankedRate(value);
		}
	};
	protected TEFRARulesCode tEFRARule;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TEFRARulesCode
	 * TEFRARulesCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TEFRARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the TEFRA rule under which the security is issued."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTax, TEFRARulesCode> mmTEFRARule = new MMBusinessAttribute<SecuritiesTax, TEFRARulesCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TEFRARule";
			definition = "Indicates the TEFRA rule under which the security is issued.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TEFRARulesCode.mmObject();
		}

		@Override
		public TEFRARulesCode getValue(SecuritiesTax obj) {
			return obj.getTEFRARule();
		}

		@Override
		public void setValue(SecuritiesTax obj, TEFRARulesCode value) {
			obj.setTEFRARule(value);
		}
	};
	protected Jurisdiction jurisdiction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmRelatedSecuritiesTax
	 * Jurisdiction.mmRelatedSecuritiesTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Jurisdiction
	 * Jurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Jurisdiction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Jurisdiction in which the tax rule applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesTax, com.tools20022.repository.entity.Jurisdiction> mmJurisdiction = new MMBusinessAssociationEnd<SecuritiesTax, com.tools20022.repository.entity.Jurisdiction>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Jurisdiction";
			definition = "Jurisdiction in which the tax rule applies.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmRelatedSecuritiesTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.Jurisdiction getValue(SecuritiesTax obj) {
			return obj.getJurisdiction();
		}

		@Override
		public void setValue(SecuritiesTax obj, com.tools20022.repository.entity.Jurisdiction value) {
			obj.setJurisdiction(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTax";
				definition = "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmTaxDetails, com.tools20022.repository.entity.TaxVoucher.mmRelatedSecurityTax, RateAndAmount.mmSecuritiesTax,
						com.tools20022.repository.entity.Jurisdiction.mmRelatedSecuritiesTax);
				derivationElement_lazy = () -> Arrays.asList(RateAndAmountFormat40Choice.mmRateTypeAndRate, SubscriptionExecution13.mmInformativeTaxDetails, SubscriptionExecution12.mmInformativeTaxDetails,
						RedemptionExecution16.mmInformativeTaxDetails, SwitchSubscriptionLegExecution4.mmInformativeTaxDetails, RedemptionExecution15.mmInformativeTaxDetails, SwitchRedemptionLegExecution4.mmInformativeTaxDetails);
				subType_lazy = () -> Arrays.asList(InvestmentFundTax.mmObject());
				superType_lazy = () -> Tax.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTax.mmTaxableIncomePerShare, com.tools20022.repository.entity.SecuritiesTax.mmTaxableIncomePerShareCalculated,
						com.tools20022.repository.entity.SecuritiesTax.mmEUCapitalGain, com.tools20022.repository.entity.SecuritiesTax.mmEUDividendStatus, com.tools20022.repository.entity.SecuritiesTax.mmTaxableIncomePerDividend,
						com.tools20022.repository.entity.SecuritiesTax.mmStampDutyType, com.tools20022.repository.entity.SecuritiesTax.mmStampDutyTaxBasis, com.tools20022.repository.entity.SecuritiesTax.mmTaxVoucher,
						com.tools20022.repository.entity.SecuritiesTax.mmTaxableIncomePerDividendShare, com.tools20022.repository.entity.SecuritiesTax.mmRelatedTax, com.tools20022.repository.entity.SecuritiesTax.mmTaxLotNumber,
						com.tools20022.repository.entity.SecuritiesTax.mmSecurity, com.tools20022.repository.entity.SecuritiesTax.mmTaxRuleExemptIndicator, com.tools20022.repository.entity.SecuritiesTax.mmEffectivePeriod,
						com.tools20022.repository.entity.SecuritiesTax.mmFrankedRate, com.tools20022.repository.entity.SecuritiesTax.mmTEFRARule, com.tools20022.repository.entity.SecuritiesTax.mmJurisdiction);
				derivationComponent_lazy = () -> Arrays.asList(EUCapitalGainType2Choice.mmObject(), StampDutyType1FormatChoice.mmObject(), RateAndAmountFormat40Choice.mmObject(), TaxableIncomePerShareCalculatedFormat3Choice.mmObject(),
						CapitalGainFormat3Choice.mmObject(), InformativeTax1.mmObject(), EUCapitalGain3Choice.mmObject(), EUDividendStatusType2Choice.mmObject(), TaxableIncomePerShareCalculated2Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesTax.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAndAmount getTaxableIncomePerShare() {
		return taxableIncomePerShare;
	}

	public SecuritiesTax setTaxableIncomePerShare(ActiveCurrencyAndAmount taxableIncomePerShare) {
		this.taxableIncomePerShare = Objects.requireNonNull(taxableIncomePerShare);
		return this;
	}

	public TaxableIncomePerShareCalculatedCode getTaxableIncomePerShareCalculated() {
		return taxableIncomePerShareCalculated;
	}

	public SecuritiesTax setTaxableIncomePerShareCalculated(TaxableIncomePerShareCalculatedCode taxableIncomePerShareCalculated) {
		this.taxableIncomePerShareCalculated = Objects.requireNonNull(taxableIncomePerShareCalculated);
		return this;
	}

	public EUCapitalGainCode getEUCapitalGain() {
		return eUCapitalGain;
	}

	public SecuritiesTax setEUCapitalGain(EUCapitalGainCode eUCapitalGain) {
		this.eUCapitalGain = Objects.requireNonNull(eUCapitalGain);
		return this;
	}

	public EUDividendStatusCode getEUDividendStatus() {
		return eUDividendStatus;
	}

	public SecuritiesTax setEUDividendStatus(EUDividendStatusCode eUDividendStatus) {
		this.eUDividendStatus = Objects.requireNonNull(eUDividendStatus);
		return this;
	}

	public CurrencyAndAmount getTaxableIncomePerDividend() {
		return taxableIncomePerDividend;
	}

	public SecuritiesTax setTaxableIncomePerDividend(CurrencyAndAmount taxableIncomePerDividend) {
		this.taxableIncomePerDividend = Objects.requireNonNull(taxableIncomePerDividend);
		return this;
	}

	public StampDutyTypeCode getStampDutyType() {
		return stampDutyType;
	}

	public SecuritiesTax setStampDutyType(StampDutyTypeCode stampDutyType) {
		this.stampDutyType = Objects.requireNonNull(stampDutyType);
		return this;
	}

	public Max4AlphaNumericText getStampDutyTaxBasis() {
		return stampDutyTaxBasis;
	}

	public SecuritiesTax setStampDutyTaxBasis(Max4AlphaNumericText stampDutyTaxBasis) {
		this.stampDutyTaxBasis = Objects.requireNonNull(stampDutyTaxBasis);
		return this;
	}

	public Optional<TaxVoucher> getTaxVoucher() {
		return taxVoucher == null ? Optional.empty() : Optional.of(taxVoucher);
	}

	public SecuritiesTax setTaxVoucher(com.tools20022.repository.entity.TaxVoucher taxVoucher) {
		this.taxVoucher = taxVoucher;
		return this;
	}

	public ActiveCurrencyAndAmount getTaxableIncomePerDividendShare() {
		return taxableIncomePerDividendShare;
	}

	public SecuritiesTax setTaxableIncomePerDividendShare(ActiveCurrencyAndAmount taxableIncomePerDividendShare) {
		this.taxableIncomePerDividendShare = Objects.requireNonNull(taxableIncomePerDividendShare);
		return this;
	}

	public RateAndAmount getRelatedTax() {
		return relatedTax;
	}

	public SecuritiesTax setRelatedTax(RateAndAmount relatedTax) {
		this.relatedTax = Objects.requireNonNull(relatedTax);
		return this;
	}

	public Max15NumericText getTaxLotNumber() {
		return taxLotNumber;
	}

	public SecuritiesTax setTaxLotNumber(Max15NumericText taxLotNumber) {
		this.taxLotNumber = Objects.requireNonNull(taxLotNumber);
		return this;
	}

	public Optional<Security> getSecurity() {
		return security == null ? Optional.empty() : Optional.of(security);
	}

	public SecuritiesTax setSecurity(com.tools20022.repository.entity.Security security) {
		this.security = security;
		return this;
	}

	public YesNoIndicator getTaxRuleExemptIndicator() {
		return taxRuleExemptIndicator;
	}

	public SecuritiesTax setTaxRuleExemptIndicator(YesNoIndicator taxRuleExemptIndicator) {
		this.taxRuleExemptIndicator = Objects.requireNonNull(taxRuleExemptIndicator);
		return this;
	}

	public DateTimePeriod getEffectivePeriod() {
		return effectivePeriod;
	}

	public SecuritiesTax setEffectivePeriod(DateTimePeriod effectivePeriod) {
		this.effectivePeriod = Objects.requireNonNull(effectivePeriod);
		return this;
	}

	public PercentageRate getFrankedRate() {
		return frankedRate;
	}

	public SecuritiesTax setFrankedRate(PercentageRate frankedRate) {
		this.frankedRate = Objects.requireNonNull(frankedRate);
		return this;
	}

	public TEFRARulesCode getTEFRARule() {
		return tEFRARule;
	}

	public SecuritiesTax setTEFRARule(TEFRARulesCode tEFRARule) {
		this.tEFRARule = Objects.requireNonNull(tEFRARule);
		return this;
	}

	public Jurisdiction getJurisdiction() {
		return jurisdiction;
	}

	public SecuritiesTax setJurisdiction(com.tools20022.repository.entity.Jurisdiction jurisdiction) {
		this.jurisdiction = Objects.requireNonNull(jurisdiction);
		return this;
	}
}