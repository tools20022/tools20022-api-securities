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
import com.tools20022.repository.choice.DateFormat42Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Security that is a sub-set of an investment fund, and is governed by the same
 * investment fund policy, for example, a dividend option or valuation currency.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentFundClass" src="doc-files/InvestmentFundClass.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmClassType
 * InvestmentFundClass.mmClassType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmDistributionPolicy
 * InvestmentFundClass.mmDistributionPolicy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmDividendPolicy
 * InvestmentFundClass.mmDividendPolicy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmDualFundIndicator
 * InvestmentFundClass.mmDualFundIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmRequestedNAVCurrency
 * InvestmentFundClass.mmRequestedNAVCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmTradingCurrency
 * InvestmentFundClass.mmTradingCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmInvestmentFund
 * InvestmentFundClass.mmInvestmentFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmPhysicalBearerSecurities
 * InvestmentFundClass.mmPhysicalBearerSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmDematerialisedBearerSecurities
 * InvestmentFundClass.mmDematerialisedBearerSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmPhysicalRegisteredSecurities
 * InvestmentFundClass.mmPhysicalRegisteredSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmDematerialisedRegisteredSecurities
 * InvestmentFundClass.mmDematerialisedRegisteredSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmProcessingCharacteristics
 * InvestmentFundClass.mmProcessingCharacteristics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmProductGroup
 * InvestmentFundClass.mmProductGroup}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmInvestmentAccount
 * InvestmentFundClass.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmNetAssetValueCalculation
 * InvestmentFundClass.mmNetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmInvestmentFundTransaction
 * InvestmentFundClass.mmInvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmSeriesIssueIdentificationDate
 * InvestmentFundClass.mmSeriesIssueIdentificationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmSeriesName
 * InvestmentFundClass.mmSeriesName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmNewIssueIndicator
 * InvestmentFundClass.mmNewIssueIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmEqualisation
 * InvestmentFundClass.mmEqualisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmTopUpAmount
 * InvestmentFundClass.mmTopUpAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmHoldBackAmount
 * InvestmentFundClass.mmHoldBackAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmHoldBackReleaseDate
 * InvestmentFundClass.mmHoldBackReleaseDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmLotDescription
 * InvestmentFundClass.mmLotDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmFundClassification
 * InvestmentFundClass.mmFundClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmUnderlyingAssetType
 * InvestmentFundClass.mmUnderlyingAssetType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmInvestorType
 * InvestmentFundClass.mmInvestorType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmReinvestment
 * InvestmentFundClass.mmReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmOutstandingUnits
 * InvestmentFundClass.mmOutstandingUnits}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForInvestmentFundClass
 * GenericIdentification.mmIdentificationForInvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmInvestmentFundClass
 * InvestmentFund.mmInvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmFundClass
 * InvestmentFundClassProcessingCharacteristics.mmFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmRelatedFund
 * NetAssetValueCalculation.mmRelatedFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundClass
 * InvestmentAccount.mmInvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundClass
 * InvestmentFundTransaction.mmInvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Equalisation#mmRelatedInvestmentFundTransaction
 * Equalisation.mmRelatedInvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reinvestment#mmInvestmentFundClass
 * Reinvestment.mmInvestmentFundClass}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#mmFinancialInstrumentDetails
 * AggregateBalanceInformation3.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#mmFinancialInstrumentDetails
 * AggregateBalanceInformation4.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFund1#mmFinancialInstrumentIdentification
 * InvestmentFund1.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1#mmInvestmentFundDetails
 * TotalPortfolioValuation1.mmInvestmentFundDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#mmInvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation30.mmInvestmentFundsFinancialInstrumentAttributes}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#mmInvestmentFundsFinancialInstrumentAttributes
 * AggregateBalanceInformation31.mmInvestmentFundsFinancialInstrumentAttributes}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer23#mmFinancialInstrumentAssetForTransfer
 * ISATransfer23.mmFinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer26#mmFinancialInstrumentAssetForTransfer
 * ISATransfer26.mmFinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer31#mmFinancialInstrumentDetails
 * Transfer31.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer30#mmFinancialInstrumentDetails
 * Transfer30.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer32#mmFinancialInstrumentDetails
 * Transfer32.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer27#mmFinancialInstrumentAssetForTransfer
 * ISATransfer27.mmFinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer33#mmFinancialInstrumentDetails
 * Transfer33.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer22#mmFinancialInstrumentAssetForTransfer
 * ISATransfer22.mmFinancialInstrumentAssetForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BlockedHoldingDetails2#mmBlockedHolding
 * BlockedHoldingDetails2.mmBlockedHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmSecurityDetails
 * InvestmentPlan14.mmSecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmSecurityDetails
 * InvestmentPlan15.mmSecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Repartition5#mmFinancialInstrument
 * Repartition5.mmFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmBlockedHoldingDetails
 * FinancialInstrument56.mmBlockedHoldingDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument20
 * FinancialInstrument20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument17
 * FinancialInstrument17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument8
 * FinancialInstrument8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument13
 * FinancialInstrument13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument21
 * FinancialInstrument21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument9
 * FinancialInstrument9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFund1
 * InvestmentFund1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument50
 * FinancialInstrument50}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument49
 * FinancialInstrument49}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument48
 * FinancialInstrument48}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BlockedHoldingDetails2
 * BlockedHoldingDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument47
 * FinancialInstrument47}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument46
 * FinancialInstrument46}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Series1 Series1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument57
 * FinancialInstrument57}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Repartition5 Repartition5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument56
 * FinancialInstrument56}</li>
 * <li>{@linkplain com.tools20022.repository.msg.HoldBackInformation2
 * HoldBackInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument55
 * FinancialInstrument55}</li>
 * <li>{@linkplain com.tools20022.repository.msg.HoldBackInformation3
 * HoldBackInformation3}</li>
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
 * "InvestmentFundClass"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, for example, a dividend option or valuation currency."
 * </li>
 * </ul>
 */
public class InvestmentFundClass extends Security {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text classType;
	/**
	 * Features of units offered by a fund. For example, a unit may have a
	 * specific load structure, eg, front end or back end, an income policy, eg,
	 * pay out or accumulate, or a trailer policy, eg, with or without. Fund
	 * classes are typically denoted by a single character, eg, 'Class A',
	 * 'Class 2'.
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
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification1#mmClassType
	 * SecurityIdentification1.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument17#mmClassType
	 * FinancialInstrument17.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument8#mmClassType
	 * FinancialInstrument8.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument13#mmClassType
	 * FinancialInstrument13.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#mmClassType
	 * FinancialInstrument21.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument9#mmClassType
	 * FinancialInstrument9.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFund1#mmClassType
	 * InvestmentFund1.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund3#mmClassType
	 * InvestmentFundTransactionsByFund3.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument49#mmClassType
	 * FinancialInstrument49.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57#mmClassType
	 * FinancialInstrument57.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmClassType
	 * FinancialInstrument56.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument55#mmClassType
	 * FinancialInstrument55.mmClassType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Features of units offered by a fund. For example, a unit may have a specific load structure, eg, front end or back end, an income policy, eg, pay out or accumulate, or a trailer policy, eg, with or without. Fund classes are typically denoted by a single character, eg, 'Class A', 'Class 2'."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmClassType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification1.mmClassType, FinancialInstrument17.mmClassType, FinancialInstrument8.mmClassType, FinancialInstrument13.mmClassType, FinancialInstrument21.mmClassType,
					FinancialInstrument9.mmClassType, InvestmentFund1.mmClassType, InvestmentFundTransactionsByFund3.mmClassType, FinancialInstrument49.mmClassType, FinancialInstrument57.mmClassType, FinancialInstrument56.mmClassType,
					FinancialInstrument55.mmClassType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClassType";
			definition = "Features of units offered by a fund. For example, a unit may have a specific load structure, eg, front end or back end, an income policy, eg, pay out or accumulate, or a trailer policy, eg, with or without. Fund classes are typically denoted by a single character, eg, 'Class A', 'Class 2'.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getClassType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DistributionPolicyCode distributionPolicy;
	/**
	 * Income policy relating to a class type, ie, if income is paid out or
	 * retained in the fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionPolicyCode
	 * DistributionPolicyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#mmDistributionPolicy
	 * FinancialInstrument20.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument17#mmDistributionPolicy
	 * FinancialInstrument17.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument8#mmDistributionPolicy
	 * FinancialInstrument8.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument13#mmDistributionPolicy
	 * FinancialInstrument13.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#mmDistributionPolicy
	 * FinancialInstrument21.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument9#mmDistributionPolicy
	 * FinancialInstrument9.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund3#mmDistributionPolicy
	 * InvestmentFundTransactionsByFund3.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument49#mmDistributionPolicy
	 * FinancialInstrument49.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57#mmDistributionPolicy
	 * FinancialInstrument57.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmDistributionPolicy
	 * FinancialInstrument56.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument55#mmDistributionPolicy
	 * FinancialInstrument55.mmDistributionPolicy}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistributionPolicy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Income policy relating to a class type, ie, if income is paid out or retained in the fund."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDistributionPolicy = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrument20.mmDistributionPolicy, FinancialInstrument17.mmDistributionPolicy, FinancialInstrument8.mmDistributionPolicy, FinancialInstrument13.mmDistributionPolicy,
					FinancialInstrument21.mmDistributionPolicy, FinancialInstrument9.mmDistributionPolicy, InvestmentFundTransactionsByFund3.mmDistributionPolicy, FinancialInstrument49.mmDistributionPolicy,
					FinancialInstrument57.mmDistributionPolicy, FinancialInstrument56.mmDistributionPolicy, FinancialInstrument55.mmDistributionPolicy);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DistributionPolicy";
			definition = "Income policy relating to a class type, ie, if income is paid out or retained in the fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DistributionPolicyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getDistributionPolicy", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DividendPolicyCode dividendPolicy;
	/**
	 * Dividend policy of the fund, eg, cash, units.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DividendPolicyCode
	 * DividendPolicyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#mmDividendPolicy
	 * FinancialInstrument20.mmDividendPolicy}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPolicy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend policy of the fund, eg, cash, units."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDividendPolicy = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrument20.mmDividendPolicy);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DividendPolicy";
			definition = "Dividend policy of the fund, eg, cash, units.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DividendPolicyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getDividendPolicy", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator dualFundIndicator;
	/**
	 * Indicates whether the fund has two prices.
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
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics2#mmDualFundIndicator
	 * ValuationDealingProcessingCharacteristics2.mmDualFundIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument8#mmDualFundIndicator
	 * FinancialInstrument8.mmDualFundIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#mmDualFundIndicator
	 * FinancialInstrument21.mmDualFundIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument9#mmDualFundIndicator
	 * FinancialInstrument9.mmDualFundIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DualFundIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the fund has two prices."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDualFundIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays
					.asList(ValuationDealingProcessingCharacteristics2.mmDualFundIndicator, FinancialInstrument8.mmDualFundIndicator, FinancialInstrument21.mmDualFundIndicator, FinancialInstrument9.mmDualFundIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DualFundIndicator";
			definition = "Indicates whether the fund has two prices.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getDualFundIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode requestedNAVCurrency;
	/**
	 * Currency to be used for pricing the fund. This currency must be among the
	 * set of currencies in which the price may be expressed, as stated in the
	 * prospectus.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics2#mmPriceCurrency
	 * ValuationDealingProcessingCharacteristics2.mmPriceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#mmRequestedNAVCurrency
	 * FinancialInstrument21.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument9#mmRequestedNAVCurrency
	 * FinancialInstrument9.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#mmRequestedNAVCurrency
	 * SubscriptionBulkOrder5.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#mmRequestedNAVCurrency
	 * RedemptionBulkExecution5.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4#mmRequestedNAVCurrency
	 * SubscriptionBulkExecution4.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#mmRequestedNAVCurrency
	 * RedemptionBulkOrder6.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmRequestedNAVCurrency
	 * RedemptionOrder14.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmRequestedNAVCurrency
	 * SwitchSubscriptionLegOrder6.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmRequestedNAVCurrency
	 * SubscriptionExecution13.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Reinvestment3#mmRequestedNAVCurrency
	 * Reinvestment3.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmRequestedNAVCurrency
	 * SwitchRedemptionLegOrder6.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmRequestedNAVCurrency
	 * SubscriptionOrder14.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmRequestedNAVCurrency
	 * SwitchSubscriptionLegExecution4.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmRequestedNAVCurrency
	 * RedemptionExecution15.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmRequestedNAVCurrency
	 * SwitchRedemptionLegExecution4.mmRequestedNAVCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedNAVCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency to be used for pricing the fund. This currency must be among the set of currencies in which the price may be expressed, as stated in the prospectus."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRequestedNAVCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ValuationDealingProcessingCharacteristics2.mmPriceCurrency, FinancialInstrument21.mmRequestedNAVCurrency, FinancialInstrument9.mmRequestedNAVCurrency,
					SubscriptionBulkOrder5.mmRequestedNAVCurrency, RedemptionBulkExecution5.mmRequestedNAVCurrency, SubscriptionBulkExecution4.mmRequestedNAVCurrency, RedemptionBulkOrder6.mmRequestedNAVCurrency,
					RedemptionOrder14.mmRequestedNAVCurrency, SwitchSubscriptionLegOrder6.mmRequestedNAVCurrency, SubscriptionExecution13.mmRequestedNAVCurrency, Reinvestment3.mmRequestedNAVCurrency,
					SwitchRedemptionLegOrder6.mmRequestedNAVCurrency, SubscriptionOrder14.mmRequestedNAVCurrency, SwitchSubscriptionLegExecution4.mmRequestedNAVCurrency, RedemptionExecution15.mmRequestedNAVCurrency,
					SwitchRedemptionLegExecution4.mmRequestedNAVCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedNAVCurrency";
			definition = "Currency to be used for pricing the fund. This currency must be among the set of currencies in which the price may be expressed, as stated in the prospectus.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getRequestedNAVCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode tradingCurrency;
	/**
	 * Currency of the investment fund class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification1#mmBaseCurrency
	 * SecurityIdentification1.mmBaseCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#mmBaseCurrency
	 * FinancialInstrument21.mmBaseCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmInvestmentCurrency
	 * FundCashForecast7.mmInvestmentCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund2#mmCurrency
	 * Fund2.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmInvestmentCurrency
	 * EstimatedFundCashForecast6.mmInvestmentCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund1#mmCurrency
	 * Fund1.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmInvestmentCurrency
	 * FundCashForecast6.mmInvestmentCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmInvestmentCurrency
	 * EstimatedFundCashForecast5.mmInvestmentCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund3#mmCurrency
	 * Fund3.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund4#mmCurrency
	 * Fund4.mmCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency of the investment fund class."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTradingCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification1.mmBaseCurrency, FinancialInstrument21.mmBaseCurrency, FundCashForecast7.mmInvestmentCurrency, Fund2.mmCurrency, EstimatedFundCashForecast6.mmInvestmentCurrency,
					Fund1.mmCurrency, FundCashForecast6.mmInvestmentCurrency, EstimatedFundCashForecast5.mmInvestmentCurrency, Fund3.mmCurrency, Fund4.mmCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingCurrency";
			definition = "Currency of the investment fund class.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getTradingCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestmentFund investmentFund;
	/**
	 * Investment fund which is related to the investment fund class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmInvestmentFundClass
	 * InvestmentFund.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFund
	 * InvestmentFund}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmFinancialInstrumentDetails
	 * FundCashForecast7.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmFinancialInstrumentDetails
	 * EstimatedFundCashForecast6.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmFinancialInstrumentDetails
	 * FundCashForecast6.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmFinancialInstrumentDetails
	 * EstimatedFundCashForecast5.mmFinancialInstrumentDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund which is related to the investment fund class."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvestmentFund = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FundCashForecast7.mmFinancialInstrumentDetails, EstimatedFundCashForecast6.mmFinancialInstrumentDetails, FundCashForecast6.mmFinancialInstrumentDetails,
					EstimatedFundCashForecast5.mmFinancialInstrumentDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFund";
			definition = "Investment fund which is related to the investment fund class.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmInvestmentFundClass;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmObject();
		}
	};
	protected YesNoIndicator physicalBearerSecurities;
	/**
	 * Indicates whether or not it is possible to hold bearer units/shares in
	 * this class in certified form
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#mmPhysicalBearerSecurities
	 * FinancialInstrument20.mmPhysicalBearerSecurities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalBearerSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not it is possible to hold bearer units/shares in this class in certified form"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPhysicalBearerSecurities = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrument20.mmPhysicalBearerSecurities);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PhysicalBearerSecurities";
			definition = "Indicates whether or not it is possible to hold bearer units/shares in this class in certified form";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getPhysicalBearerSecurities", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator dematerialisedBearerSecurities;
	/**
	 * Indicate whether or not it is possible to hold bearer units/shares in
	 * paperless form
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#mmDematerialisedBearerSecurities
	 * FinancialInstrument20.mmDematerialisedBearerSecurities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DematerialisedBearerSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicate whether or not it is possible to hold bearer units/shares in paperless form"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDematerialisedBearerSecurities = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrument20.mmDematerialisedBearerSecurities);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DematerialisedBearerSecurities";
			definition = "Indicate whether or not it is possible to hold bearer units/shares in paperless form";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getDematerialisedBearerSecurities", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator physicalRegisteredSecurities;
	/**
	 * Indicate whether or not it is possible to hold registered units/shares in
	 * this class in paperless form
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#mmPhysicalRegisteredSecurities
	 * FinancialInstrument20.mmPhysicalRegisteredSecurities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalRegisteredSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicate whether or not it is possible to hold registered units/shares in this class in paperless form"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPhysicalRegisteredSecurities = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrument20.mmPhysicalRegisteredSecurities);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PhysicalRegisteredSecurities";
			definition = "Indicate whether or not it is possible to hold registered units/shares in this class in paperless form";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getPhysicalRegisteredSecurities", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator dematerialisedRegisteredSecurities;
	/**
	 * Indicate whether or not it is possible to hold registered units/shares in
	 * this class in paperless form
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#mmDematerialisedRegisteredSecurities
	 * FinancialInstrument20.mmDematerialisedRegisteredSecurities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DematerialisedRegisteredSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicate whether or not it is possible to hold registered units/shares in this class in paperless form"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDematerialisedRegisteredSecurities = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrument20.mmDematerialisedRegisteredSecurities);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DematerialisedRegisteredSecurities";
			definition = "Indicate whether or not it is possible to hold registered units/shares in this class in paperless form";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getDematerialisedRegisteredSecurities", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics> processingCharacteristics;
	/**
	 * Processing characteristics linked to the investment fund class, ie, not
	 * to the market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmFundClass
	 * InvestmentFundClassProcessingCharacteristics.mmFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LocalMarketAnnex2#mmSubscriptionProcessingCharacteristics
	 * LocalMarketAnnex2.mmSubscriptionProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LocalMarketAnnex2#mmRedemptionProcessingCharacteristics
	 * LocalMarketAnnex2.mmRedemptionProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1#mmValuationDealingCharacteristics
	 * FundProcessingPassport1.mmValuationDealingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1#mmSubscriptionProcessingCharacteristics
	 * FundProcessingPassport1.mmSubscriptionProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1#mmRedemptionProcessingCharacteristics
	 * FundProcessingPassport1.mmRedemptionProcessingCharacteristics}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingCharacteristics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Processing characteristics linked to the investment fund class, ie, not to  the market."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmProcessingCharacteristics = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(LocalMarketAnnex2.mmSubscriptionProcessingCharacteristics, LocalMarketAnnex2.mmRedemptionProcessingCharacteristics, FundProcessingPassport1.mmValuationDealingCharacteristics,
					FundProcessingPassport1.mmSubscriptionProcessingCharacteristics, FundProcessingPassport1.mmRedemptionProcessingCharacteristics);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProcessingCharacteristics";
			definition = "Processing characteristics linked to the investment fund class, ie, not to  the market.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmFundClass;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
		}
	};
	protected Max140Text productGroup;
	/**
	 * Company specific description of a group of funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument17#mmProductGroup
	 * FinancialInstrument17.mmProductGroup}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#mmProductGroup
	 * FinancialInstrument21.mmProductGroup}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57#mmProductGroup
	 * FinancialInstrument57.mmProductGroup}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmProductGroup
	 * FinancialInstrument56.mmProductGroup}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument55#mmProductGroup
	 * FinancialInstrument55.mmProductGroup}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductGroup"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Company specific description of a group of funds."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmProductGroup = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrument17.mmProductGroup, FinancialInstrument21.mmProductGroup, FinancialInstrument57.mmProductGroup, FinancialInstrument56.mmProductGroup, FinancialInstrument55.mmProductGroup);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProductGroup";
			definition = "Company specific description of a group of funds.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getProductGroup", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentAccount> investmentAccount;
	/**
	 * Account which holds investment fund classes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundClass
	 * InvestmentAccount.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument50#mmTransfereeAccount
	 * FinancialInstrument50.mmTransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument50#mmSubAccountDetails
	 * FinancialInstrument50.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument48#mmTransfereeAccount
	 * FinancialInstrument48.mmTransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument48#mmSubAccountDetails
	 * FinancialInstrument48.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47#mmTransfereeAccount
	 * FinancialInstrument47.mmTransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47#mmSubAccountDetails
	 * FinancialInstrument47.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#mmTransfereeAccount
	 * FinancialInstrument46.mmTransfereeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#mmSubAccountDetails
	 * FinancialInstrument46.mmSubAccountDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account which holds investment fund classes."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvestmentAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrument50.mmTransfereeAccount, FinancialInstrument50.mmSubAccountDetails, FinancialInstrument48.mmTransfereeAccount, FinancialInstrument48.mmSubAccountDetails,
					FinancialInstrument47.mmTransfereeAccount, FinancialInstrument47.mmSubAccountDetails, FinancialInstrument46.mmTransfereeAccount, FinancialInstrument46.mmSubAccountDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccount";
			definition = "Account which holds investment fund classes.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmInvestmentFundClass;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
		}
	};
	protected NetAssetValueCalculation netAssetValueCalculation;
	/**
	 * Calculation of the value of the fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmRelatedFund
	 * NetAssetValueCalculation.mmRelatedFund}</li>
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAssetValueCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Calculation of the value of the fund."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNetAssetValueCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetAssetValueCalculation";
			definition = "Calculation of the value of the fund.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmRelatedFund;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentFundTransaction> investmentFundTransaction;
	/**
	 * Transaction which is related to the fund class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundClass
	 * InvestmentFundTransaction.mmInvestmentFundClass}</li>
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction which is related to the fund class."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvestmentFundTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundTransaction";
			definition = "Transaction which is related to the fund class.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentFundClass;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
		}
	};
	protected ISODate seriesIssueIdentificationDate;
	/**
	 * Date that identifies the issue of a fund series. Typically applicable to
	 * a redemption or order confirmation, but may be specified in the
	 * subscription, if known.
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
	 * <li>{@linkplain com.tools20022.repository.msg.Series1#mmSeriesDate
	 * Series1.mmSeriesDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DateFormat42Choice#mmYearMonth
	 * DateFormat42Choice.mmYearMonth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DateFormat42Choice#mmYearMonthDay
	 * DateFormat42Choice.mmYearMonthDay}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SeriesIssueIdentificationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date that identifies the issue of a fund series. Typically applicable to a redemption or order confirmation, but may be specified in the subscription, if known."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSeriesIssueIdentificationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Series1.mmSeriesDate, DateFormat42Choice.mmYearMonth, DateFormat42Choice.mmYearMonthDay);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SeriesIssueIdentificationDate";
			definition = "Date that identifies the issue of a fund series. Typically applicable to a redemption or order confirmation, but may be specified in the subscription, if known.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getSeriesIssueIdentificationDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text seriesName;
	/**
	 * Identifies the name of a fund series. Typically applicable to a
	 * redemption or order confirmation, but may be specified in the
	 * subscription, if known.
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
	 * <li>{@linkplain com.tools20022.repository.msg.Series1#mmSeriesName
	 * Series1.mmSeriesName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57#mmSeriesIdentification
	 * FinancialInstrument57.mmSeriesIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SeriesName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the name of a fund series. Typically applicable to a redemption or order confirmation, but may be specified in the subscription, if known."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSeriesName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Series1.mmSeriesName, FinancialInstrument57.mmSeriesIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SeriesName";
			definition = "Identifies the name of a fund series. Typically applicable to a redemption or order confirmation, but may be specified in the subscription, if known.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getSeriesName", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator newIssueIndicator;
	/**
	 * Indicates that the financial instrument and/or series included in the
	 * message is a new issue.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewIssueIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the financial instrument and/or series included in the message is a new issue."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNewIssueIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NewIssueIndicator";
			definition = "Indicates that the financial instrument and/or series included in the message is a new issue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getNewIssueIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Equalisation equalisation;
	/**
	 * Part of an investor's subscription amount that is held by the fund in
	 * order to pay incentive / performance fees at the end of the fiscal year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Equalisation#mmRelatedInvestmentFundTransaction
	 * Equalisation.mmRelatedInvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Equalisation
	 * Equalisation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmEqualisation
	 * RedemptionOrder14.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmEqualisation
	 * SwitchSubscriptionLegOrder6.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmEqualisation
	 * SubscriptionExecution13.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmEqualisation
	 * SubscriptionExecution12.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmEqualisation
	 * SubscriptionOrder15.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmEqualisation
	 * SwitchRedemptionLegOrder6.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmEqualisation
	 * RedemptionOrder15.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmEqualisation
	 * RedemptionExecution16.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmEqualisation
	 * SubscriptionOrder14.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmEqualisation
	 * SwitchSubscriptionLegExecution4.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmEqualisation
	 * RedemptionExecution15.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmEqualisation
	 * SwitchRedemptionLegExecution4.mmEqualisation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equalisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Part of an investor's subscription amount that is held by the fund in order to pay incentive / performance fees at the end of the fiscal year."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmEqualisation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(RedemptionOrder14.mmEqualisation, SwitchSubscriptionLegOrder6.mmEqualisation, SubscriptionExecution13.mmEqualisation, SubscriptionExecution12.mmEqualisation,
					SubscriptionOrder15.mmEqualisation, SwitchRedemptionLegOrder6.mmEqualisation, RedemptionOrder15.mmEqualisation, RedemptionExecution16.mmEqualisation, SubscriptionOrder14.mmEqualisation,
					SwitchSubscriptionLegExecution4.mmEqualisation, RedemptionExecution15.mmEqualisation, SwitchRedemptionLegExecution4.mmEqualisation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Equalisation";
			definition = "Part of an investor's subscription amount that is held by the fund in order to pay incentive / performance fees at the end of the fiscal year.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Equalisation.mmRelatedInvestmentFundTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Equalisation.mmObject();
		}
	};
	protected CurrencyAndAmount topUpAmount;
	/**
	 * Additional amount of money (top-up amount) required to meet the minimum
	 * subscription amount.
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TopUpAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional amount of money (top-up amount) required to meet the minimum subscription amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTopUpAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TopUpAmount";
			definition = "Additional amount of money (top-up amount) required to meet the minimum subscription amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getTopUpAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount holdBackAmount;
	/**
	 * Value of the redemption amount subject to hold back.
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
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation2#mmAmount
	 * HoldBackInformation2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation3#mmAmount
	 * HoldBackInformation3.mmAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldBackAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the redemption amount subject to hold back."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmHoldBackAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(HoldBackInformation2.mmAmount, HoldBackInformation3.mmAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HoldBackAmount";
			definition = "Value of the redemption amount subject to hold back.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getHoldBackAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate holdBackReleaseDate;
	/**
	 * Date on which the hold back amount is to be released.
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
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation2#mmExpectedReleaseDate
	 * HoldBackInformation2.mmExpectedReleaseDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation3#mmExpectedReleaseDate
	 * HoldBackInformation3.mmExpectedReleaseDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldBackReleaseDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the hold back amount is to be released."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmHoldBackReleaseDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(HoldBackInformation2.mmExpectedReleaseDate, HoldBackInformation3.mmExpectedReleaseDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HoldBackReleaseDate";
			definition = "Date on which the hold back amount is to be released.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getHoldBackReleaseDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max350Text lotDescription;
	/**
	 * Description of the lot.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of the lot."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLotDescription = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LotDescription";
			definition = "Description of the lot.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getLotDescription", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected GenericIdentification fundClassification;
	/**
	 * Method of classifying a fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForInvestmentFundClass
	 * GenericIdentification.mmIdentificationForInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Method of classifying a fund."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmFundClassification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundClassification";
			definition = "Method of classifying a fund.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmIdentificationForInvestmentFundClass;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
		}
	};
	protected FinancialInstrumentProductTypeCode underlyingAssetType;
	/**
	 * Specifies the type of assets in which the fund invests.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingAssetType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of assets in which the fund invests."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmUnderlyingAssetType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnderlyingAssetType";
			definition = "Specifies the type of assets in which the fund invests.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getUnderlyingAssetType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestorTypeCode investorType;
	/**
	 * Type of investor that can invest in the fund class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorTypeCode
	 * InvestorTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of investor that can invest in the fund class."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInvestorType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestorType";
			definition = "Type of investor that can invest in the fund class.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InvestorTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getInvestorType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Reinvestment reinvestment;
	/**
	 * Reinvestment information which involves this investment fund class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reinvestment#mmInvestmentFundClass
	 * Reinvestment.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Reinvestment
	 * Reinvestment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reinvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reinvestment information which involves this investment fund class."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmReinvestment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reinvestment";
			definition = "Reinvestment information which involves this investment fund class.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Reinvestment.mmInvestmentFundClass;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Reinvestment.mmObject();
		}
	};
	protected DecimalNumber outstandingUnits;
	/**
	 * Investment fund class currently held by shareholders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFund1#mmTotalUnitsOutstanding
	 * InvestmentFund1.mmTotalUnitsOutstanding}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutstandingUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment fund class currently held by shareholders."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOutstandingUnits = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentFund1.mmTotalUnitsOutstanding);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OutstandingUnits";
			definition = "Investment fund class currently held by shareholders.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClass.class.getMethod("getOutstandingUnits", new Class[]{});
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
				name = "InvestmentFundClass";
				definition = "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, for example, a dividend option or valuation currency.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.mmIdentificationForInvestmentFundClass, com.tools20022.repository.entity.InvestmentFund.mmInvestmentFundClass,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmFundClass, com.tools20022.repository.entity.NetAssetValueCalculation.mmRelatedFund,
						com.tools20022.repository.entity.InvestmentAccount.mmInvestmentFundClass, com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentFundClass,
						com.tools20022.repository.entity.Equalisation.mmRelatedInvestmentFundTransaction, com.tools20022.repository.entity.Reinvestment.mmInvestmentFundClass);
				derivationElement_lazy = () -> Arrays.asList(AggregateBalanceInformation3.mmFinancialInstrumentDetails, AggregateBalanceInformation4.mmFinancialInstrumentDetails, InvestmentFund1.mmFinancialInstrumentIdentification,
						TotalPortfolioValuation1.mmInvestmentFundDetails, AggregateBalanceInformation30.mmInvestmentFundsFinancialInstrumentAttributes, AggregateBalanceInformation31.mmInvestmentFundsFinancialInstrumentAttributes,
						ISATransfer23.mmFinancialInstrumentAssetForTransfer, ISATransfer26.mmFinancialInstrumentAssetForTransfer, Transfer31.mmFinancialInstrumentDetails, Transfer30.mmFinancialInstrumentDetails,
						Transfer32.mmFinancialInstrumentDetails, ISATransfer27.mmFinancialInstrumentAssetForTransfer, Transfer33.mmFinancialInstrumentDetails, ISATransfer22.mmFinancialInstrumentAssetForTransfer,
						BlockedHoldingDetails2.mmBlockedHolding, InvestmentPlan14.mmSecurityDetails, InvestmentPlan15.mmSecurityDetails, Repartition5.mmFinancialInstrument, FinancialInstrument56.mmBlockedHoldingDetails);
				superType_lazy = () -> Security.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.mmClassType, com.tools20022.repository.entity.InvestmentFundClass.mmDistributionPolicy,
						com.tools20022.repository.entity.InvestmentFundClass.mmDividendPolicy, com.tools20022.repository.entity.InvestmentFundClass.mmDualFundIndicator,
						com.tools20022.repository.entity.InvestmentFundClass.mmRequestedNAVCurrency, com.tools20022.repository.entity.InvestmentFundClass.mmTradingCurrency,
						com.tools20022.repository.entity.InvestmentFundClass.mmInvestmentFund, com.tools20022.repository.entity.InvestmentFundClass.mmPhysicalBearerSecurities,
						com.tools20022.repository.entity.InvestmentFundClass.mmDematerialisedBearerSecurities, com.tools20022.repository.entity.InvestmentFundClass.mmPhysicalRegisteredSecurities,
						com.tools20022.repository.entity.InvestmentFundClass.mmDematerialisedRegisteredSecurities, com.tools20022.repository.entity.InvestmentFundClass.mmProcessingCharacteristics,
						com.tools20022.repository.entity.InvestmentFundClass.mmProductGroup, com.tools20022.repository.entity.InvestmentFundClass.mmInvestmentAccount,
						com.tools20022.repository.entity.InvestmentFundClass.mmNetAssetValueCalculation, com.tools20022.repository.entity.InvestmentFundClass.mmInvestmentFundTransaction,
						com.tools20022.repository.entity.InvestmentFundClass.mmSeriesIssueIdentificationDate, com.tools20022.repository.entity.InvestmentFundClass.mmSeriesName,
						com.tools20022.repository.entity.InvestmentFundClass.mmNewIssueIndicator, com.tools20022.repository.entity.InvestmentFundClass.mmEqualisation, com.tools20022.repository.entity.InvestmentFundClass.mmTopUpAmount,
						com.tools20022.repository.entity.InvestmentFundClass.mmHoldBackAmount, com.tools20022.repository.entity.InvestmentFundClass.mmHoldBackReleaseDate,
						com.tools20022.repository.entity.InvestmentFundClass.mmLotDescription, com.tools20022.repository.entity.InvestmentFundClass.mmFundClassification,
						com.tools20022.repository.entity.InvestmentFundClass.mmUnderlyingAssetType, com.tools20022.repository.entity.InvestmentFundClass.mmInvestorType, com.tools20022.repository.entity.InvestmentFundClass.mmReinvestment,
						com.tools20022.repository.entity.InvestmentFundClass.mmOutstandingUnits);
				derivationComponent_lazy = () -> Arrays.asList(FinancialInstrument20.mmObject(), FinancialInstrument17.mmObject(), FinancialInstrument8.mmObject(), FinancialInstrument13.mmObject(), FinancialInstrument21.mmObject(),
						FinancialInstrument9.mmObject(), InvestmentFund1.mmObject(), FinancialInstrument50.mmObject(), FinancialInstrument49.mmObject(), FinancialInstrument48.mmObject(), BlockedHoldingDetails2.mmObject(),
						FinancialInstrument47.mmObject(), FinancialInstrument46.mmObject(), Series1.mmObject(), FinancialInstrument57.mmObject(), Repartition5.mmObject(), FinancialInstrument56.mmObject(), HoldBackInformation2.mmObject(),
						FinancialInstrument55.mmObject(), HoldBackInformation3.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvestmentFundClass.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getClassType() {
		return classType;
	}

	public void setClassType(Max35Text classType) {
		this.classType = classType;
	}

	public DistributionPolicyCode getDistributionPolicy() {
		return distributionPolicy;
	}

	public void setDistributionPolicy(DistributionPolicyCode distributionPolicy) {
		this.distributionPolicy = distributionPolicy;
	}

	public DividendPolicyCode getDividendPolicy() {
		return dividendPolicy;
	}

	public void setDividendPolicy(DividendPolicyCode dividendPolicy) {
		this.dividendPolicy = dividendPolicy;
	}

	public YesNoIndicator getDualFundIndicator() {
		return dualFundIndicator;
	}

	public void setDualFundIndicator(YesNoIndicator dualFundIndicator) {
		this.dualFundIndicator = dualFundIndicator;
	}

	public CurrencyCode getRequestedNAVCurrency() {
		return requestedNAVCurrency;
	}

	public void setRequestedNAVCurrency(CurrencyCode requestedNAVCurrency) {
		this.requestedNAVCurrency = requestedNAVCurrency;
	}

	public CurrencyCode getTradingCurrency() {
		return tradingCurrency;
	}

	public void setTradingCurrency(CurrencyCode tradingCurrency) {
		this.tradingCurrency = tradingCurrency;
	}

	public InvestmentFund getInvestmentFund() {
		return investmentFund;
	}

	public void setInvestmentFund(com.tools20022.repository.entity.InvestmentFund investmentFund) {
		this.investmentFund = investmentFund;
	}

	public YesNoIndicator getPhysicalBearerSecurities() {
		return physicalBearerSecurities;
	}

	public void setPhysicalBearerSecurities(YesNoIndicator physicalBearerSecurities) {
		this.physicalBearerSecurities = physicalBearerSecurities;
	}

	public YesNoIndicator getDematerialisedBearerSecurities() {
		return dematerialisedBearerSecurities;
	}

	public void setDematerialisedBearerSecurities(YesNoIndicator dematerialisedBearerSecurities) {
		this.dematerialisedBearerSecurities = dematerialisedBearerSecurities;
	}

	public YesNoIndicator getPhysicalRegisteredSecurities() {
		return physicalRegisteredSecurities;
	}

	public void setPhysicalRegisteredSecurities(YesNoIndicator physicalRegisteredSecurities) {
		this.physicalRegisteredSecurities = physicalRegisteredSecurities;
	}

	public YesNoIndicator getDematerialisedRegisteredSecurities() {
		return dematerialisedRegisteredSecurities;
	}

	public void setDematerialisedRegisteredSecurities(YesNoIndicator dematerialisedRegisteredSecurities) {
		this.dematerialisedRegisteredSecurities = dematerialisedRegisteredSecurities;
	}

	public List<InvestmentFundClassProcessingCharacteristics> getProcessingCharacteristics() {
		return processingCharacteristics;
	}

	public void setProcessingCharacteristics(List<com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics> processingCharacteristics) {
		this.processingCharacteristics = processingCharacteristics;
	}

	public Max140Text getProductGroup() {
		return productGroup;
	}

	public void setProductGroup(Max140Text productGroup) {
		this.productGroup = productGroup;
	}

	public List<InvestmentAccount> getInvestmentAccount() {
		return investmentAccount;
	}

	public void setInvestmentAccount(List<com.tools20022.repository.entity.InvestmentAccount> investmentAccount) {
		this.investmentAccount = investmentAccount;
	}

	public NetAssetValueCalculation getNetAssetValueCalculation() {
		return netAssetValueCalculation;
	}

	public void setNetAssetValueCalculation(com.tools20022.repository.entity.NetAssetValueCalculation netAssetValueCalculation) {
		this.netAssetValueCalculation = netAssetValueCalculation;
	}

	public List<InvestmentFundTransaction> getInvestmentFundTransaction() {
		return investmentFundTransaction;
	}

	public void setInvestmentFundTransaction(List<com.tools20022.repository.entity.InvestmentFundTransaction> investmentFundTransaction) {
		this.investmentFundTransaction = investmentFundTransaction;
	}

	public ISODate getSeriesIssueIdentificationDate() {
		return seriesIssueIdentificationDate;
	}

	public void setSeriesIssueIdentificationDate(ISODate seriesIssueIdentificationDate) {
		this.seriesIssueIdentificationDate = seriesIssueIdentificationDate;
	}

	public Max35Text getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(Max35Text seriesName) {
		this.seriesName = seriesName;
	}

	public YesNoIndicator getNewIssueIndicator() {
		return newIssueIndicator;
	}

	public void setNewIssueIndicator(YesNoIndicator newIssueIndicator) {
		this.newIssueIndicator = newIssueIndicator;
	}

	public Equalisation getEqualisation() {
		return equalisation;
	}

	public void setEqualisation(com.tools20022.repository.entity.Equalisation equalisation) {
		this.equalisation = equalisation;
	}

	public CurrencyAndAmount getTopUpAmount() {
		return topUpAmount;
	}

	public void setTopUpAmount(CurrencyAndAmount topUpAmount) {
		this.topUpAmount = topUpAmount;
	}

	public CurrencyAndAmount getHoldBackAmount() {
		return holdBackAmount;
	}

	public void setHoldBackAmount(CurrencyAndAmount holdBackAmount) {
		this.holdBackAmount = holdBackAmount;
	}

	public ISODate getHoldBackReleaseDate() {
		return holdBackReleaseDate;
	}

	public void setHoldBackReleaseDate(ISODate holdBackReleaseDate) {
		this.holdBackReleaseDate = holdBackReleaseDate;
	}

	public Max350Text getLotDescription() {
		return lotDescription;
	}

	public void setLotDescription(Max350Text lotDescription) {
		this.lotDescription = lotDescription;
	}

	public GenericIdentification getFundClassification() {
		return fundClassification;
	}

	public void setFundClassification(com.tools20022.repository.entity.GenericIdentification fundClassification) {
		this.fundClassification = fundClassification;
	}

	public FinancialInstrumentProductTypeCode getUnderlyingAssetType() {
		return underlyingAssetType;
	}

	public void setUnderlyingAssetType(FinancialInstrumentProductTypeCode underlyingAssetType) {
		this.underlyingAssetType = underlyingAssetType;
	}

	public InvestorTypeCode getInvestorType() {
		return investorType;
	}

	public void setInvestorType(InvestorTypeCode investorType) {
		this.investorType = investorType;
	}

	public Reinvestment getReinvestment() {
		return reinvestment;
	}

	public void setReinvestment(com.tools20022.repository.entity.Reinvestment reinvestment) {
		this.reinvestment = reinvestment;
	}

	public DecimalNumber getOutstandingUnits() {
		return outstandingUnits;
	}

	public void setOutstandingUnits(DecimalNumber outstandingUnits) {
		this.outstandingUnits = outstandingUnits;
	}
}