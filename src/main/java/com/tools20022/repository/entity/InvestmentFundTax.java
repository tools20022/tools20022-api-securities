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
import com.tools20022.repository.entity.SecuritiesTax;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#mmTaxDetails
 * ReceiveInformation17.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#mmTaxDetails
 * ReceiveInformation16.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmTaxDetails
 * DeliverInformation16.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#mmTaxDetails
 * DeliverInformation17.mmTaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax28#mmTaxCalculationDetails
 * Tax28.mmTaxCalculationDetails}</li>
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
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculationInformation4
 * TaxCalculationInformation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax17 Tax17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculationInformation8
 * TaxCalculationInformation8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax28 Tax28}</li>
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
 * "InvestmentFundTax"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Tax related to an investment fund order."</li>
 * </ul>
 */
public class InvestmentFundTax extends SecuritiesTax {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator fiscalExemption;
	/**
	 * Indicates whether an owner of an investment account may benefit from a
	 * fiscal exemption or amnesty for instance for declaring overseas
	 * investments.
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
	public static final MMBusinessAttribute mmFiscalExemption = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return InvestmentFundTax.class.getMethod("getFiscalExemption", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestmentAccount investmentAccount;
	/**
	 * Investment account for which taxes are specified.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmInvestmentAccount = new MMBusinessAssociationEnd() {
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
	};
	protected PercentageRate percentageOfDebtClaim;
	/**
	 * Percentage of the underlying assets of the funds that represents a debt
	 * and is in the scope of the European directive on taxation of savings
	 * income in the form of interest payments (Council Directive 2003/48/EC 3
	 * June).
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
	public static final MMBusinessAttribute mmPercentageOfDebtClaim = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return InvestmentFundTax.class.getMethod("getPercentageOfDebtClaim", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate percentageGrandfatheredDebt;
	/**
	 * Percentage of grandfathered debt claim.
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
	public static final MMBusinessAttribute mmPercentageGrandfatheredDebt = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return InvestmentFundTax.class.getMethod("getPercentageGrandfatheredDebt", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator exemptionIndicator;
	/**
	 * Indicates whether a tax exemption applies.
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
	 * <li>{@linkplain com.tools20022.repository.msg.Tax28#mmExemptionIndicator
	 * Tax28.mmExemptionIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax32#mmExemptionIndicator
	 * Tax32.mmExemptionIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax30#mmExemptionIndicator
	 * Tax30.mmExemptionIndicator}</li>
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
	public static final MMBusinessAttribute mmExemptionIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Tax28.mmExemptionIndicator, Tax32.mmExemptionIndicator, Tax30.mmExemptionIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExemptionIndicator";
			definition = "Indicates whether a tax exemption applies.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundTax.class.getMethod("getExemptionIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestmentFundTransaction transaction;
	/**
	 * Transaction for which the tax is specified.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Transaction";
			definition = "Transaction for which the tax is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmTransactionTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundTax";
				definition = "Tax related to an investment fund order.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccount.mmInvestmentFundTax, com.tools20022.repository.entity.InvestmentFundTransaction.mmTransactionTax);
				derivationElement_lazy = () -> Arrays.asList(Tax17.mmTaxCalculationDetails, ReceiveInformation17.mmTaxDetails, ReceiveInformation16.mmTaxDetails, DeliverInformation16.mmTaxDetails, DeliverInformation17.mmTaxDetails,
						Tax28.mmTaxCalculationDetails, RedemptionOrder14.mmTransactionOverhead, SwitchSubscriptionLegOrder6.mmTransactionOverhead, FeeAndTax1.mmIndividualTax, InformativeTax1.mmIndividualTax, Tax32.mmTaxCalculationDetails,
						SubscriptionExecution13.mmTransactionOverhead, TotalFeesAndTaxes40.mmTotalTaxes, TotalFeesAndTaxes40.mmIndividualTax, SubscriptionExecution12.mmTransactionOverhead, SubscriptionOrder15.mmTransactionOverhead,
						InvestmentAccountOwnershipInformation15.mmTaxExemption, SwitchRedemptionLegOrder6.mmTransactionOverhead, RedemptionOrder15.mmTransactionOverhead, Tax30.mmTaxCalculationDetails, Tax31.mmTaxCalculationDetails,
						RedemptionExecution16.mmTransactionOverhead, InvestmentAccountOwnershipInformation14.mmTaxExemption, SubscriptionOrder14.mmTransactionOverhead, SwitchSubscriptionLegExecution4.mmTransactionOverhead,
						RedemptionExecution15.mmTransactionOverhead, SwitchRedemptionLegExecution4.mmTransactionOverhead);
				superType_lazy = () -> SecuritiesTax.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundTax.mmFiscalExemption, com.tools20022.repository.entity.InvestmentFundTax.mmInvestmentAccount,
						com.tools20022.repository.entity.InvestmentFundTax.mmPercentageOfDebtClaim, com.tools20022.repository.entity.InvestmentFundTax.mmPercentageGrandfatheredDebt,
						com.tools20022.repository.entity.InvestmentFundTax.mmExemptionIndicator, com.tools20022.repository.entity.InvestmentFundTax.mmTransaction);
				derivationComponent_lazy = () -> Arrays.asList(TaxCalculationInformation4.mmObject(), Tax17.mmObject(), TaxCalculationInformation8.mmObject(), Tax28.mmObject(), FeeAndTax1.mmObject(), Tax32.mmObject(),
						TotalFeesAndTaxes40.mmObject(), Tax30.mmObject(), TaxCalculationInformation9.mmObject(), Tax31.mmObject(), TaxCalculationInformation10.mmObject());
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

	public void setFiscalExemption(YesNoIndicator fiscalExemption) {
		this.fiscalExemption = fiscalExemption;
	}

	public InvestmentAccount getInvestmentAccount() {
		return investmentAccount;
	}

	public void setInvestmentAccount(com.tools20022.repository.entity.InvestmentAccount investmentAccount) {
		this.investmentAccount = investmentAccount;
	}

	public PercentageRate getPercentageOfDebtClaim() {
		return percentageOfDebtClaim;
	}

	public void setPercentageOfDebtClaim(PercentageRate percentageOfDebtClaim) {
		this.percentageOfDebtClaim = percentageOfDebtClaim;
	}

	public PercentageRate getPercentageGrandfatheredDebt() {
		return percentageGrandfatheredDebt;
	}

	public void setPercentageGrandfatheredDebt(PercentageRate percentageGrandfatheredDebt) {
		this.percentageGrandfatheredDebt = percentageGrandfatheredDebt;
	}

	public YesNoIndicator getExemptionIndicator() {
		return exemptionIndicator;
	}

	public void setExemptionIndicator(YesNoIndicator exemptionIndicator) {
		this.exemptionIndicator = exemptionIndicator;
	}

	public InvestmentFundTransaction getTransaction() {
		return transaction;
	}

	public void setTransaction(com.tools20022.repository.entity.InvestmentFundTransaction transaction) {
		this.transaction = transaction;
	}
}