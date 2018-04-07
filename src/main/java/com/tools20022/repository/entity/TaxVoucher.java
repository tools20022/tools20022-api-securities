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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Statement showing the amount or value of a distribution and either the tax
 * credit to which the recipient is entitled in respect of that distribution; or
 * the amount of tax deducted from the distribution.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TaxVoucher" src="doc-files/TaxVoucher.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmRequestedTaxationRate
 * TaxVoucher.mmRequestedTaxationRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxVoucher#mmCreditRate
 * TaxVoucher.mmCreditRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmRelatedSecurityTax
 * TaxVoucher.mmRelatedSecurityTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmSundryOrOtherAmount
 * TaxVoucher.mmSundryOrOtherAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxVoucher#mmCreditAmount
 * TaxVoucher.mmCreditAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmCashAmountBroughtForward
 * TaxVoucher.mmCashAmountBroughtForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmCashAmountCarriedForward
 * TaxVoucher.mmCashAmountCarriedForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmNotionalTaxAmount
 * TaxVoucher.mmNotionalTaxAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxVoucher#mmDistribution
 * TaxVoucher.mmDistribution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxVoucher#mmIdentification
 * TaxVoucher.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxVoucher#mmBargainDate
 * TaxVoucher.mmBargainDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmBargainSettlementDate
 * TaxVoucher.mmBargainSettlementDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxVoucher#mmTaxVoucherRate
 * TaxVoucher.mmTaxVoucherRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmRecordDateHolding
 * TaxVoucher.mmRecordDateHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmScripDividendReinvestmentPricePerShare
 * TaxVoucher.mmScripDividendReinvestmentPricePerShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmAllotedSharesCost
 * TaxVoucher.mmAllotedSharesCost}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmForeignExchangeTransaction
 * TaxVoucher.mmForeignExchangeTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmTaxVoucher
 * SecuritiesPricing.mmTaxVoucher}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxVoucher
 * SecuritiesTax.mmTaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmTaxVoucher
 * SecuritiesQuantity.mmTaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmCurrencyExchangeForTaxVoucher
 * ForeignExchangeTrade.mmCurrencyExchangeForTaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmTaxVoucher
 * CorporateActionDistribution.mmTaxVoucher}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher1 TaxVoucher1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher4 TaxVoucher4}</li>
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
 * "TaxVoucher"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Statement showing the amount or value of a distribution and either the tax credit to which the recipient is entitled in respect of that distribution; or the amount of tax deducted from the distribution."
 * </li>
 * </ul>
 */
public class TaxVoucher {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PercentageRate requestedTaxationRate;
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate71#mmRequestedWithholdingTaxRate
	 * CorporateActionRate71.mmRequestedWithholdingTaxRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedTaxationRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requested tax rate in case of breakdown of tax rate, for example, used for adjustment of tax rate. This is the new requested applicable rate."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TaxVoucher, PercentageRate> mmRequestedTaxationRate = new MMBusinessAttribute<TaxVoucher, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate71.mmRequestedWithholdingTaxRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedTaxationRate";
			definition = "Requested tax rate in case of breakdown of tax rate, for example, used for adjustment of tax rate. This is the new requested applicable rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(TaxVoucher obj) {
			return obj.getRequestedTaxationRate();
		}

		@Override
		public void setValue(TaxVoucher obj, PercentageRate value) {
			obj.setRequestedTaxationRate(value);
		}
	};
	protected PercentageRate creditRate;
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails31#mmTaxCreditRate
	 * RateDetails31.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails32#mmTaxCreditRate
	 * RateDetails32.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate90#mmTaxCreditRate
	 * CorporateActionRate90.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate89#mmTaxCreditRate
	 * CorporateActionRate89.mmTaxCreditRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Applicable tax rate on the tax credit amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TaxVoucher, PercentageRate> mmCreditRate = new MMBusinessAttribute<TaxVoucher, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(RateDetails31.mmTaxCreditRate, RateDetails32.mmTaxCreditRate, CorporateActionRate90.mmTaxCreditRate, CorporateActionRate89.mmTaxCreditRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditRate";
			definition = "Applicable tax rate on the tax credit amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(TaxVoucher obj) {
			return obj.getCreditRate();
		}

		@Override
		public void setValue(TaxVoucher obj, PercentageRate value) {
			obj.setCreditRate(value);
		}
	};
	protected List<SecuritiesTax> relatedSecurityTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxVoucher
	 * SecuritiesTax.mmTaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTax
	 * SecuritiesTax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmWithholdingOfForeignTax
	 * CorporateActionRate2.mmWithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmWithholdingOfLocalTax
	 * CorporateActionRate2.mmWithholdingOfLocalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmRelatedTax
	 * CorporateActionRate2.mmRelatedTax}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecurityTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies tax elements on the security which is involved in the corporate event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TaxVoucher, List<SecuritiesTax>> mmRelatedSecurityTax = new MMBusinessAssociationEnd<TaxVoucher, List<SecuritiesTax>>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate2.mmWithholdingOfForeignTax, CorporateActionRate2.mmWithholdingOfLocalTax, CorporateActionRate2.mmRelatedTax);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecurityTax";
			definition = "Specifies tax elements on the security which is involved in the corporate event.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesTax.mmTaxVoucher;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesTax.mmObject();
		}

		@Override
		public List<SecuritiesTax> getValue(TaxVoucher obj) {
			return obj.getRelatedSecurityTax();
		}

		@Override
		public void setValue(TaxVoucher obj, List<SecuritiesTax> value) {
			obj.setRelatedSecurityTax(value);
		}
	};
	protected CurrencyAndAmount sundryOrOtherAmount;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmSundryOrOtherAmount
	 * CorporateActionAmounts1.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts42#mmSundryOrOtherAmount
	 * CorporateActionAmounts42.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts43#mmSundryOrOtherAmount
	 * CorporateActionAmounts43.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmSundryOrOtherAmount
	 * CorporateActionAmounts44.mmSundryOrOtherAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SundryOrOtherAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money related to taxable income that cannot be categorised."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TaxVoucher, CurrencyAndAmount> mmSundryOrOtherAmount = new MMBusinessAttribute<TaxVoucher, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays
					.asList(CorporateActionAmounts1.mmSundryOrOtherAmount, CorporateActionAmounts42.mmSundryOrOtherAmount, CorporateActionAmounts43.mmSundryOrOtherAmount, CorporateActionAmounts44.mmSundryOrOtherAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SundryOrOtherAmount";
			definition = "Amount of money related to taxable income that cannot be categorised.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(TaxVoucher obj) {
			return obj.getSundryOrOtherAmount();
		}

		@Override
		public void setValue(TaxVoucher obj, CurrencyAndAmount value) {
			obj.setSundryOrOtherAmount(value);
		}
	};
	protected CurrencyAndAmount creditAmount;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmTaxCreditAmount
	 * CorporateActionAmounts1.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts42#mmTaxCreditAmount
	 * CorporateActionAmounts42.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts43#mmTaxCreditAmount
	 * CorporateActionAmounts43.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmTaxCreditAmount
	 * CorporateActionAmounts44.mmTaxCreditAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money per equity allocated as the result of a tax credit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TaxVoucher, CurrencyAndAmount> mmCreditAmount = new MMBusinessAttribute<TaxVoucher, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionAmounts1.mmTaxCreditAmount, CorporateActionAmounts42.mmTaxCreditAmount, CorporateActionAmounts43.mmTaxCreditAmount, CorporateActionAmounts44.mmTaxCreditAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditAmount";
			definition = "Amount of money per equity allocated as the result of a tax credit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(TaxVoucher obj) {
			return obj.getCreditAmount();
		}

		@Override
		public void setValue(TaxVoucher obj, CurrencyAndAmount value) {
			obj.setCreditAmount(value);
		}
	};
	protected CurrencyAndAmount cashAmountBroughtForward;
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
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmCashAmountBroughtForward
	 * TaxVoucher1.mmCashAmountBroughtForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmCashAmountBroughtForward
	 * CorporateActionAmounts44.mmCashAmountBroughtForward}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAmountBroughtForward"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash amount retained from previous dividend or interest payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TaxVoucher, CurrencyAndAmount> mmCashAmountBroughtForward = new MMBusinessAttribute<TaxVoucher, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(TaxVoucher1.mmCashAmountBroughtForward, CorporateActionAmounts44.mmCashAmountBroughtForward);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAmountBroughtForward";
			definition = "Cash amount retained from previous dividend or interest payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(TaxVoucher obj) {
			return obj.getCashAmountBroughtForward();
		}

		@Override
		public void setValue(TaxVoucher obj, CurrencyAndAmount value) {
			obj.setCashAmountBroughtForward(value);
		}
	};
	protected CurrencyAndAmount cashAmountCarriedForward;
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
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmCashAmountCarriedForward
	 * TaxVoucher1.mmCashAmountCarriedForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmCashAmountCarriedForward
	 * CorporateActionAmounts44.mmCashAmountCarriedForward}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAmountCarriedForward"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash amount carried forward to next dividend or interest payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TaxVoucher, CurrencyAndAmount> mmCashAmountCarriedForward = new MMBusinessAttribute<TaxVoucher, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(TaxVoucher1.mmCashAmountCarriedForward, CorporateActionAmounts44.mmCashAmountCarriedForward);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAmountCarriedForward";
			definition = "Cash amount carried forward to next dividend or interest payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(TaxVoucher obj) {
			return obj.getCashAmountCarriedForward();
		}

		@Override
		public void setValue(TaxVoucher obj, CurrencyAndAmount value) {
			obj.setCashAmountCarriedForward(value);
		}
	};
	protected CurrencyAndAmount notionalTaxAmount;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmNotionalTaxAmount
	 * CorporateActionAmounts44.mmNotionalTaxAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalTaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax on the amount of cash that would have been paid when new securities are issued in lieu of a cash dividend."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TaxVoucher, CurrencyAndAmount> mmNotionalTaxAmount = new MMBusinessAttribute<TaxVoucher, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionAmounts44.mmNotionalTaxAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotionalTaxAmount";
			definition = "Tax on the amount of cash that would have been paid when new securities are issued in lieu of a cash dividend.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(TaxVoucher obj) {
			return obj.getNotionalTaxAmount();
		}

		@Override
		public void setValue(TaxVoucher obj, CurrencyAndAmount value) {
			obj.setNotionalTaxAmount(value);
		}
	};
	protected CorporateActionDistribution distribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmTaxVoucher
	 * CorporateActionDistribution.mmTaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Distribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action distribution process for which tax voucher information is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TaxVoucher, Optional<CorporateActionDistribution>> mmDistribution = new MMBusinessAssociationEnd<TaxVoucher, Optional<CorporateActionDistribution>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Distribution";
			definition = "Corporate action distribution process for which tax voucher information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionDistribution.mmTaxVoucher;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionDistribution.mmObject();
		}

		@Override
		public Optional<CorporateActionDistribution> getValue(TaxVoucher obj) {
			return obj.getDistribution();
		}

		@Override
		public void setValue(TaxVoucher obj, Optional<CorporateActionDistribution> value) {
			obj.setDistribution(value.orElse(null));
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher4#mmIdentification
	 * TaxVoucher4.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the tax voucher."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TaxVoucher, Max35Text> mmIdentification = new MMBusinessAttribute<TaxVoucher, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(TaxVoucher4.mmIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification for the tax voucher.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TaxVoucher obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(TaxVoucher obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	protected ISODate bargainDate;
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
	 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher1#mmBargainDate
	 * TaxVoucher1.mmBargainDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher4#mmBargainDate
	 * TaxVoucher4.mmBargainDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BargainDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which DRIP purchase completed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TaxVoucher, ISODate> mmBargainDate = new MMBusinessAttribute<TaxVoucher, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(TaxVoucher1.mmBargainDate, TaxVoucher4.mmBargainDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BargainDate";
			definition = "Date on which DRIP purchase completed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(TaxVoucher obj) {
			return obj.getBargainDate();
		}

		@Override
		public void setValue(TaxVoucher obj, ISODate value) {
			obj.setBargainDate(value);
		}
	};
	protected ISODate bargainSettlementDate;
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
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmBargainSettlementDate
	 * TaxVoucher1.mmBargainSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher4#mmBargainSettlementDate
	 * TaxVoucher4.mmBargainSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BargainSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement date of the DRIP purchase transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TaxVoucher, ISODate> mmBargainSettlementDate = new MMBusinessAttribute<TaxVoucher, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(TaxVoucher1.mmBargainSettlementDate, TaxVoucher4.mmBargainSettlementDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BargainSettlementDate";
			definition = "Settlement date of the DRIP purchase transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(TaxVoucher obj) {
			return obj.getBargainSettlementDate();
		}

		@Override
		public void setValue(TaxVoucher obj, ISODate value) {
			obj.setBargainSettlementDate(value);
		}
	};
	protected BaseOneRate taxVoucherRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmTaxVoucherRate
	 * TaxVoucher1.mmTaxVoucherRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxVoucherRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Distribution rate per share."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TaxVoucher, BaseOneRate> mmTaxVoucherRate = new MMBusinessAttribute<TaxVoucher, BaseOneRate>() {
		{
			derivation_lazy = () -> Arrays.asList(TaxVoucher1.mmTaxVoucherRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxVoucherRate";
			definition = "Distribution rate per share.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public BaseOneRate getValue(TaxVoucher obj) {
			return obj.getTaxVoucherRate();
		}

		@Override
		public void setValue(TaxVoucher obj, BaseOneRate value) {
			obj.setTaxVoucherRate(value);
		}
	};
	protected SecuritiesQuantity recordDateHolding;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmTaxVoucher
	 * SecuritiesQuantity.mmTaxVoucher}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmRecordDateHolding
	 * TaxVoucher1.mmRecordDateHolding}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecordDateHolding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities holding on record date."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TaxVoucher, SecuritiesQuantity> mmRecordDateHolding = new MMBusinessAssociationEnd<TaxVoucher, SecuritiesQuantity>() {
		{
			derivation_lazy = () -> Arrays.asList(TaxVoucher1.mmRecordDateHolding);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RecordDateHolding";
			definition = "Securities holding on record date.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuantity.mmTaxVoucher;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public SecuritiesQuantity getValue(TaxVoucher obj) {
			return obj.getRecordDateHolding();
		}

		@Override
		public void setValue(TaxVoucher obj, SecuritiesQuantity value) {
			obj.setRecordDateHolding(value);
		}
	};
	protected SecuritiesPricing scripDividendReinvestmentPricePerShare;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmTaxVoucher
	 * SecuritiesPricing.mmTaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmScripDividendReinvestmentPricePerShare
	 * TaxVoucher1.mmScripDividendReinvestmentPricePerShare}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripDividendReinvestmentPricePerShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cost per share of new shares allotted."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TaxVoucher, SecuritiesPricing> mmScripDividendReinvestmentPricePerShare = new MMBusinessAssociationEnd<TaxVoucher, SecuritiesPricing>() {
		{
			derivation_lazy = () -> Arrays.asList(TaxVoucher1.mmScripDividendReinvestmentPricePerShare);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ScripDividendReinvestmentPricePerShare";
			definition = "Cost per share of new shares allotted.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesPricing.mmTaxVoucher;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}

		@Override
		public SecuritiesPricing getValue(TaxVoucher obj) {
			return obj.getScripDividendReinvestmentPricePerShare();
		}

		@Override
		public void setValue(TaxVoucher obj, SecuritiesPricing value) {
			obj.setScripDividendReinvestmentPricePerShare(value);
		}
	};
	protected ActiveCurrencyAndAmount allotedSharesCost;
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
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmAllotedSharesCost
	 * TaxVoucher1.mmAllotedSharesCost}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllotedSharesCost"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total cash amount required to purchase shares allotted."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TaxVoucher, ActiveCurrencyAndAmount> mmAllotedSharesCost = new MMBusinessAttribute<TaxVoucher, ActiveCurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(TaxVoucher1.mmAllotedSharesCost);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AllotedSharesCost";
			definition = "Total cash amount required to purchase shares allotted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(TaxVoucher obj) {
			return obj.getAllotedSharesCost();
		}

		@Override
		public void setValue(TaxVoucher obj, ActiveCurrencyAndAmount value) {
			obj.setAllotedSharesCost(value);
		}
	};
	protected List<ForeignExchangeTrade> foreignExchangeTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmCurrencyExchangeForTaxVoucher
	 * ForeignExchangeTrade.mmCurrencyExchangeForTaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the foreign exchange transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TaxVoucher, List<ForeignExchangeTrade>> mmForeignExchangeTransaction = new MMBusinessAssociationEnd<TaxVoucher, List<ForeignExchangeTrade>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForeignExchangeTransaction";
			definition = "Provides information about the foreign exchange transaction.";
			minOccurs = 0;
			opposite_lazy = () -> ForeignExchangeTrade.mmCurrencyExchangeForTaxVoucher;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ForeignExchangeTrade.mmObject();
		}

		@Override
		public List<ForeignExchangeTrade> getValue(TaxVoucher obj) {
			return obj.getForeignExchangeTransaction();
		}

		@Override
		public void setValue(TaxVoucher obj, List<ForeignExchangeTrade> value) {
			obj.setForeignExchangeTransaction(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxVoucher";
				definition = "Statement showing the amount or value of a distribution and either the tax credit to which the recipient is entitled in respect of that distribution; or the amount of tax deducted from the distribution.";
				associationDomain_lazy = () -> Arrays.asList(SecuritiesPricing.mmTaxVoucher, SecuritiesTax.mmTaxVoucher, SecuritiesQuantity.mmTaxVoucher, ForeignExchangeTrade.mmCurrencyExchangeForTaxVoucher,
						CorporateActionDistribution.mmTaxVoucher);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TaxVoucher.mmRequestedTaxationRate, com.tools20022.repository.entity.TaxVoucher.mmCreditRate,
						com.tools20022.repository.entity.TaxVoucher.mmRelatedSecurityTax, com.tools20022.repository.entity.TaxVoucher.mmSundryOrOtherAmount, com.tools20022.repository.entity.TaxVoucher.mmCreditAmount,
						com.tools20022.repository.entity.TaxVoucher.mmCashAmountBroughtForward, com.tools20022.repository.entity.TaxVoucher.mmCashAmountCarriedForward, com.tools20022.repository.entity.TaxVoucher.mmNotionalTaxAmount,
						com.tools20022.repository.entity.TaxVoucher.mmDistribution, com.tools20022.repository.entity.TaxVoucher.mmIdentification, com.tools20022.repository.entity.TaxVoucher.mmBargainDate,
						com.tools20022.repository.entity.TaxVoucher.mmBargainSettlementDate, com.tools20022.repository.entity.TaxVoucher.mmTaxVoucherRate, com.tools20022.repository.entity.TaxVoucher.mmRecordDateHolding,
						com.tools20022.repository.entity.TaxVoucher.mmScripDividendReinvestmentPricePerShare, com.tools20022.repository.entity.TaxVoucher.mmAllotedSharesCost,
						com.tools20022.repository.entity.TaxVoucher.mmForeignExchangeTransaction);
				derivationComponent_lazy = () -> Arrays.asList(TaxVoucher1.mmObject(), TaxVoucher4.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return TaxVoucher.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PercentageRate getRequestedTaxationRate() {
		return requestedTaxationRate;
	}

	public TaxVoucher setRequestedTaxationRate(PercentageRate requestedTaxationRate) {
		this.requestedTaxationRate = Objects.requireNonNull(requestedTaxationRate);
		return this;
	}

	public PercentageRate getCreditRate() {
		return creditRate;
	}

	public TaxVoucher setCreditRate(PercentageRate creditRate) {
		this.creditRate = Objects.requireNonNull(creditRate);
		return this;
	}

	public List<SecuritiesTax> getRelatedSecurityTax() {
		return relatedSecurityTax == null ? relatedSecurityTax = new ArrayList<>() : relatedSecurityTax;
	}

	public TaxVoucher setRelatedSecurityTax(List<SecuritiesTax> relatedSecurityTax) {
		this.relatedSecurityTax = Objects.requireNonNull(relatedSecurityTax);
		return this;
	}

	public CurrencyAndAmount getSundryOrOtherAmount() {
		return sundryOrOtherAmount;
	}

	public TaxVoucher setSundryOrOtherAmount(CurrencyAndAmount sundryOrOtherAmount) {
		this.sundryOrOtherAmount = Objects.requireNonNull(sundryOrOtherAmount);
		return this;
	}

	public CurrencyAndAmount getCreditAmount() {
		return creditAmount;
	}

	public TaxVoucher setCreditAmount(CurrencyAndAmount creditAmount) {
		this.creditAmount = Objects.requireNonNull(creditAmount);
		return this;
	}

	public CurrencyAndAmount getCashAmountBroughtForward() {
		return cashAmountBroughtForward;
	}

	public TaxVoucher setCashAmountBroughtForward(CurrencyAndAmount cashAmountBroughtForward) {
		this.cashAmountBroughtForward = Objects.requireNonNull(cashAmountBroughtForward);
		return this;
	}

	public CurrencyAndAmount getCashAmountCarriedForward() {
		return cashAmountCarriedForward;
	}

	public TaxVoucher setCashAmountCarriedForward(CurrencyAndAmount cashAmountCarriedForward) {
		this.cashAmountCarriedForward = Objects.requireNonNull(cashAmountCarriedForward);
		return this;
	}

	public CurrencyAndAmount getNotionalTaxAmount() {
		return notionalTaxAmount;
	}

	public TaxVoucher setNotionalTaxAmount(CurrencyAndAmount notionalTaxAmount) {
		this.notionalTaxAmount = Objects.requireNonNull(notionalTaxAmount);
		return this;
	}

	public Optional<CorporateActionDistribution> getDistribution() {
		return distribution == null ? Optional.empty() : Optional.of(distribution);
	}

	public TaxVoucher setDistribution(CorporateActionDistribution distribution) {
		this.distribution = distribution;
		return this;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public TaxVoucher setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public ISODate getBargainDate() {
		return bargainDate;
	}

	public TaxVoucher setBargainDate(ISODate bargainDate) {
		this.bargainDate = Objects.requireNonNull(bargainDate);
		return this;
	}

	public ISODate getBargainSettlementDate() {
		return bargainSettlementDate;
	}

	public TaxVoucher setBargainSettlementDate(ISODate bargainSettlementDate) {
		this.bargainSettlementDate = Objects.requireNonNull(bargainSettlementDate);
		return this;
	}

	public BaseOneRate getTaxVoucherRate() {
		return taxVoucherRate;
	}

	public TaxVoucher setTaxVoucherRate(BaseOneRate taxVoucherRate) {
		this.taxVoucherRate = Objects.requireNonNull(taxVoucherRate);
		return this;
	}

	public SecuritiesQuantity getRecordDateHolding() {
		return recordDateHolding;
	}

	public TaxVoucher setRecordDateHolding(SecuritiesQuantity recordDateHolding) {
		this.recordDateHolding = Objects.requireNonNull(recordDateHolding);
		return this;
	}

	public SecuritiesPricing getScripDividendReinvestmentPricePerShare() {
		return scripDividendReinvestmentPricePerShare;
	}

	public TaxVoucher setScripDividendReinvestmentPricePerShare(SecuritiesPricing scripDividendReinvestmentPricePerShare) {
		this.scripDividendReinvestmentPricePerShare = Objects.requireNonNull(scripDividendReinvestmentPricePerShare);
		return this;
	}

	public ActiveCurrencyAndAmount getAllotedSharesCost() {
		return allotedSharesCost;
	}

	public TaxVoucher setAllotedSharesCost(ActiveCurrencyAndAmount allotedSharesCost) {
		this.allotedSharesCost = Objects.requireNonNull(allotedSharesCost);
		return this;
	}

	public List<ForeignExchangeTrade> getForeignExchangeTransaction() {
		return foreignExchangeTransaction == null ? foreignExchangeTransaction = new ArrayList<>() : foreignExchangeTransaction;
	}

	public TaxVoucher setForeignExchangeTransaction(List<ForeignExchangeTrade> foreignExchangeTransaction) {
		this.foreignExchangeTransaction = Objects.requireNonNull(foreignExchangeTransaction);
		return this;
	}
}