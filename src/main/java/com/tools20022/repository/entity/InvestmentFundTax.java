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
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestmentAccount;
import com.tools20022.repository.entity.InvestmentFundTransaction;
import com.tools20022.repository.entity.SecuritiesTax;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Tax related to an investment fund order.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentFundTax" src="doc-files/InvestmentFundTax.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.SecuritiesTax
 * SecuritiesTax}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmFiscalExemption
 * InvestmentFundTax.mmFiscalExemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmInvestmentAccount
 * InvestmentFundTax.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmPercentageOfDebtClaim
 * InvestmentFundTax.mmPercentageOfDebtClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmPercentageGrandfatheredDebt
 * InvestmentFundTax.mmPercentageGrandfatheredDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmExemptionIndicator
 * InvestmentFundTax.mmExemptionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmTransaction
 * InvestmentFundTax.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundTax
 * InvestmentAccount.mmInvestmentFundTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmTransactionTax
 * InvestmentFundTransaction.mmTransactionTax}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Tax17#mmTaxCalculationDetails
 * Tax17.mmTaxCalculationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmTransactionOverhead
 * RedemptionOrder14.mmTransactionOverhead}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmTransactionOverhead
 * SwitchSubscriptionLegOrder6.mmTransactionOverhead}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FeeAndTax1#mmIndividualTax
 * FeeAndTax1.mmIndividualTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InformativeTax1#mmIndividualTax
 * InformativeTax1.mmIndividualTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax32#mmTaxCalculationDetails
 * Tax32.mmTaxCalculationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmTransactionOverhead
 * SubscriptionExecution13.mmTransactionOverhead}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40#mmTotalTaxes
 * TotalFeesAndTaxes40.mmTotalTaxes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40#mmIndividualTax
 * TotalFeesAndTaxes40.mmIndividualTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmTransactionOverhead
 * SubscriptionExecution12.mmTransactionOverhead}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmTransactionOverhead
 * SubscriptionOrder15.mmTransactionOverhead}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmTaxExemption
 * InvestmentAccountOwnershipInformation15.mmTaxExemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmTransactionOverhead
 * SwitchRedemptionLegOrder6.mmTransactionOverhead}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmTransactionOverhead
 * RedemptionOrder15.mmTransactionOverhead}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax30#mmTaxCalculationDetails
 * Tax30.mmTaxCalculationDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax31#mmTaxCalculationDetails
 * Tax31.mmTaxCalculationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmTransactionOverhead
 * RedemptionExecution16.mmTransactionOverhead}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmTaxExemption
 * InvestmentAccountOwnershipInformation14.mmTaxExemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmTransactionOverhead
 * SubscriptionOrder14.mmTransactionOverhead}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmTransactionOverhead
 * SwitchSubscriptionLegExecution4.mmTransactionOverhead}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmTransactionOverhead
 * RedemptionExecution15.mmTransactionOverhead}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmTransactionOverhead
 * SwitchRedemptionLegExecution4.mmTransactionOverhead}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation18#mmIndividualTax
 * ReceiveInformation18.mmIndividualTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation19#mmIndividualTax
 * DeliverInformation19.mmIndividualTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation19#mmIndividualTax
 * ReceiveInformation19.mmIndividualTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation18#mmIndividualTax
 * DeliverInformation18.mmIndividualTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Unit8#mmTransactionOverhead
 * Unit8.mmTransactionOverhead}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax34#mmTaxCalculationDetails
 * Tax34.mmTaxCalculationDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculationInformation4
 * TaxCalculationInformation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax17 Tax17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FeeAndTax1 FeeAndTax1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax32 Tax32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40
 * TotalFeesAndTaxes40}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax30 Tax30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculationInformation9
 * TaxCalculationInformation9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax31 Tax31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculationInformation10
 * TaxCalculationInformation10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fees1 Fees1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax34 Tax34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculationInformation11
 * TaxCalculationInformation11}</li>
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
 * "InvestmentFundTax"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Tax related to an investment fund order."</li>
 * </ul>
 */
public class InvestmentFundTax extends SecuritiesTax {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator fiscalExemption;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmFiscalExemption
	 * InvestmentAccountOwnershipInformation15.mmFiscalExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmFiscalExemption
	 * InvestmentAccountOwnershipInformation14.mmFiscalExemption}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FiscalExemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an owner of an investment account may benefit from a fiscal exemption or amnesty for instance for declaring overseas investments."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<InvestmentFundTax, YesNoIndicator> mmFiscalExemption = new MMBusinessAttribute<InvestmentFundTax, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation15.mmFiscalExemption, InvestmentAccountOwnershipInformation14.mmFiscalExemption);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FiscalExemption";
			definition = "Indicates whether an owner of an investment account may benefit from a fiscal exemption or amnesty for instance for declaring overseas investments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(InvestmentFundTax obj) {
			return obj.getFiscalExemption();
		}

		@Override
		public void setValue(InvestmentFundTax obj, YesNoIndicator value) {
			obj.setFiscalExemption(value);
		}
	};
	protected InvestmentAccount investmentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundTax
	 * InvestmentAccount.mmInvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment account for which taxes are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InvestmentFundTax, Optional<InvestmentAccount>> mmInvestmentAccount = new MMBusinessAssociationEnd<InvestmentFundTax, Optional<InvestmentAccount>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccount";
			definition = "Investment account for which taxes are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmInvestmentFundTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
		}

		@Override
		public Optional<InvestmentAccount> getValue(InvestmentFundTax obj) {
			return obj.getInvestmentAccount();
		}

		@Override
		public void setValue(InvestmentFundTax obj, Optional<InvestmentAccount> value) {
			obj.setInvestmentAccount(value.orElse(null));
		}
	};
	protected PercentageRate percentageOfDebtClaim;
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
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#mmPercentageOfDebtClaim
	 * TaxCalculationInformation4.mmPercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InformativeTax1#mmPercentageOfDebtClaim
	 * InformativeTax1.mmPercentageOfDebtClaim}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageOfDebtClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the underlying assets of the funds that represents a debt and is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<InvestmentFundTax, PercentageRate> mmPercentageOfDebtClaim = new MMBusinessAttribute<InvestmentFundTax, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(TaxCalculationInformation4.mmPercentageOfDebtClaim, InformativeTax1.mmPercentageOfDebtClaim);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PercentageOfDebtClaim";
			definition = "Percentage of the underlying assets of the funds that represents a debt and is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(InvestmentFundTax obj) {
			return obj.getPercentageOfDebtClaim();
		}

		@Override
		public void setValue(InvestmentFundTax obj, PercentageRate value) {
			obj.setPercentageOfDebtClaim(value);
		}
	};
	protected PercentageRate percentageGrandfatheredDebt;
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
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#mmPercentageGrandfatheredDebt
	 * TaxCalculationInformation4.mmPercentageGrandfatheredDebt}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageGrandfatheredDebt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of grandfathered debt claim."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<InvestmentFundTax, PercentageRate> mmPercentageGrandfatheredDebt = new MMBusinessAttribute<InvestmentFundTax, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(TaxCalculationInformation4.mmPercentageGrandfatheredDebt);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PercentageGrandfatheredDebt";
			definition = "Percentage of grandfathered debt claim.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(InvestmentFundTax obj) {
			return obj.getPercentageGrandfatheredDebt();
		}

		@Override
		public void setValue(InvestmentFundTax obj, PercentageRate value) {
			obj.setPercentageGrandfatheredDebt(value);
		}
	};
	protected YesNoIndicator exemptionIndicator;
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
	 * <li>{@linkplain com.tools20022.repository.msg.Tax32#mmExemptionIndicator
	 * Tax32.mmExemptionIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax30#mmExemptionIndicator
	 * Tax30.mmExemptionIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax34#mmExemptionIndicator
	 * Tax34.mmExemptionIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether a tax exemption applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<InvestmentFundTax, YesNoIndicator> mmExemptionIndicator = new MMBusinessAttribute<InvestmentFundTax, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(Tax32.mmExemptionIndicator, Tax30.mmExemptionIndicator, Tax34.mmExemptionIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExemptionIndicator";
			definition = "Indicates whether a tax exemption applies.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(InvestmentFundTax obj) {
			return obj.getExemptionIndicator();
		}

		@Override
		public void setValue(InvestmentFundTax obj, YesNoIndicator value) {
			obj.setExemptionIndicator(value);
		}
	};
	protected InvestmentFundTransaction transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmTransactionTax
	 * InvestmentFundTransaction.mmTransactionTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction for which the tax is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InvestmentFundTax, Optional<InvestmentFundTransaction>> mmTransaction = new MMBusinessAssociationEnd<InvestmentFundTax, Optional<InvestmentFundTransaction>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Transaction";
			definition = "Transaction for which the tax is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> InvestmentFundTransaction.mmTransactionTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestmentFundTransaction.mmObject();
		}

		@Override
		public Optional<InvestmentFundTransaction> getValue(InvestmentFundTax obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(InvestmentFundTax obj, Optional<InvestmentFundTransaction> value) {
			obj.setTransaction(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundTax";
				definition = "Tax related to an investment fund order.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccount.mmInvestmentFundTax, InvestmentFundTransaction.mmTransactionTax);
				derivationElement_lazy = () -> Arrays.asList(Tax17.mmTaxCalculationDetails, RedemptionOrder14.mmTransactionOverhead, SwitchSubscriptionLegOrder6.mmTransactionOverhead, FeeAndTax1.mmIndividualTax,
						InformativeTax1.mmIndividualTax, Tax32.mmTaxCalculationDetails, SubscriptionExecution13.mmTransactionOverhead, TotalFeesAndTaxes40.mmTotalTaxes, TotalFeesAndTaxes40.mmIndividualTax,
						SubscriptionExecution12.mmTransactionOverhead, SubscriptionOrder15.mmTransactionOverhead, InvestmentAccountOwnershipInformation15.mmTaxExemption, SwitchRedemptionLegOrder6.mmTransactionOverhead,
						RedemptionOrder15.mmTransactionOverhead, Tax30.mmTaxCalculationDetails, Tax31.mmTaxCalculationDetails, RedemptionExecution16.mmTransactionOverhead, InvestmentAccountOwnershipInformation14.mmTaxExemption,
						SubscriptionOrder14.mmTransactionOverhead, SwitchSubscriptionLegExecution4.mmTransactionOverhead, RedemptionExecution15.mmTransactionOverhead, SwitchRedemptionLegExecution4.mmTransactionOverhead,
						ReceiveInformation18.mmIndividualTax, DeliverInformation19.mmIndividualTax, ReceiveInformation19.mmIndividualTax, DeliverInformation18.mmIndividualTax, Unit8.mmTransactionOverhead, Tax34.mmTaxCalculationDetails);
				superType_lazy = () -> SecuritiesTax.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundTax.mmFiscalExemption, com.tools20022.repository.entity.InvestmentFundTax.mmInvestmentAccount,
						com.tools20022.repository.entity.InvestmentFundTax.mmPercentageOfDebtClaim, com.tools20022.repository.entity.InvestmentFundTax.mmPercentageGrandfatheredDebt,
						com.tools20022.repository.entity.InvestmentFundTax.mmExemptionIndicator, com.tools20022.repository.entity.InvestmentFundTax.mmTransaction);
				derivationComponent_lazy = () -> Arrays.asList(TaxCalculationInformation4.mmObject(), Tax17.mmObject(), FeeAndTax1.mmObject(), Tax32.mmObject(), TotalFeesAndTaxes40.mmObject(), Tax30.mmObject(),
						TaxCalculationInformation9.mmObject(), Tax31.mmObject(), TaxCalculationInformation10.mmObject(), Fees1.mmObject(), Tax34.mmObject(), TaxCalculationInformation11.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvestmentFundTax.class;
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getFiscalExemption() {
		return fiscalExemption;
	}

	public InvestmentFundTax setFiscalExemption(YesNoIndicator fiscalExemption) {
		this.fiscalExemption = Objects.requireNonNull(fiscalExemption);
		return this;
	}

	public Optional<InvestmentAccount> getInvestmentAccount() {
		return investmentAccount == null ? Optional.empty() : Optional.of(investmentAccount);
	}

	public InvestmentFundTax setInvestmentAccount(com.tools20022.repository.entity.InvestmentAccount investmentAccount) {
		this.investmentAccount = investmentAccount;
		return this;
	}

	public PercentageRate getPercentageOfDebtClaim() {
		return percentageOfDebtClaim;
	}

	public InvestmentFundTax setPercentageOfDebtClaim(PercentageRate percentageOfDebtClaim) {
		this.percentageOfDebtClaim = Objects.requireNonNull(percentageOfDebtClaim);
		return this;
	}

	public PercentageRate getPercentageGrandfatheredDebt() {
		return percentageGrandfatheredDebt;
	}

	public InvestmentFundTax setPercentageGrandfatheredDebt(PercentageRate percentageGrandfatheredDebt) {
		this.percentageGrandfatheredDebt = Objects.requireNonNull(percentageGrandfatheredDebt);
		return this;
	}

	public YesNoIndicator getExemptionIndicator() {
		return exemptionIndicator;
	}

	public InvestmentFundTax setExemptionIndicator(YesNoIndicator exemptionIndicator) {
		this.exemptionIndicator = Objects.requireNonNull(exemptionIndicator);
		return this;
	}

	public Optional<InvestmentFundTransaction> getTransaction() {
		return transaction == null ? Optional.empty() : Optional.of(transaction);
	}

	public InvestmentFundTax setTransaction(InvestmentFundTransaction transaction) {
		this.transaction = transaction;
		return this;
	}
}