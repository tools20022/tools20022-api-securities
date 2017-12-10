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
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Provides information about the alternatives available to an account owner
 * when participating to a corporate action event. This is defined at a general
 * level without looking at the specificities of the securities balances.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionOption"
 * src="doc-files/CorporateActionOption.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionNumber
 * CorporateActionOption.mmOptionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionType
 * CorporateActionOption.mmOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmFractionDisposition
 * CorporateActionOption.mmFractionDisposition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmCurrencyOption
 * CorporateActionOption.mmCurrencyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmRelatedChoiceCorporateAction
 * CorporateActionOption.mmRelatedChoiceCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmCorporateActionElection
 * CorporateActionOption.mmCorporateActionElection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionFeatures
 * CorporateActionOption.mmOptionFeatures}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmActionPeriod
 * CorporateActionOption.mmActionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOfferType
 * CorporateActionOption.mmOfferType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmChargesAppliedIndicator
 * CorporateActionOption.mmChargesAppliedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmWithdrawalAllowedIndicator
 * CorporateActionOption.mmWithdrawalAllowedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmChangeAllowedIndicator
 * CorporateActionOption.mmChangeAllowedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmCorporateActionOptionServicing
 * CorporateActionOption.mmCorporateActionOptionServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmProceedsDefinition
 * CorporateActionOption.mmProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmDistribution
 * CorporateActionOption.mmDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmDefault
 * CorporateActionOption.mmDefault}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmCorporateActionOption
 * DateTimePeriod.mmCorporateActionOption}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmOption
 * ProceedsDefinition.mmOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmOption
 * CorporateActionElection.mmOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ChoiceCorporateAction#mmCorporateActionOptionDefinition
 * ChoiceCorporateAction.mmCorporateActionOptionDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmOption
 * CorporateActionDistribution.mmOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOptionServicing#mmRelatedOption
 * CorporateActionOptionServicing.mmRelatedOption}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionOption1FormatChoice
 * CorporateActionOption1FormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OfferType1FormatChoice
 * OfferType1FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType1FormatChoice
 * FractionDispositionType1FormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityOption1
 * SecurityOption1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OptionFeatures1FormatChoice
 * OptionFeatures1FormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption1
 * CorporateActionOption1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption2
 * CorporateActionOption2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption119
 * CorporateActionOption119}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption116
 * CorporateActionOption116}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption120
 * CorporateActionOption120}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionOption19Choice
 * CorporateActionOption19Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption6
 * InstructedCorporateActionOption6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionOption18Choice
 * CorporateActionOption18Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionOption21Choice
 * CorporateActionOption21Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType25Choice
 * FractionDispositionType25Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption51
 * SecuritiesOption51}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType27Choice
 * FractionDispositionType27Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionOption20Choice
 * CorporateActionOption20Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType26Choice
 * FractionDispositionType26Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption53
 * SecuritiesOption53}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OfferTypeFormat10Choice
 * OfferTypeFormat10Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType28Choice
 * FractionDispositionType28Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat18Choice
 * OptionFeaturesFormat18Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption54
 * SecuritiesOption54}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption132
 * CorporateActionOption132}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption130
 * CorporateActionOption130}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption131
 * CorporateActionOption131}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption129
 * CorporateActionOption129}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption60
 * SecuritiesOption60}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat22Choice
 * OptionFeaturesFormat22Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption59
 * SecuritiesOption59}</li>
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
 * "CorporateActionOption"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information about the alternatives available to an account owner when participating to a corporate action event. This is defined at a general level without looking at the specificities of the securities balances."
 * </li>
 * </ul>
 */
public class CorporateActionOption {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Exact3NumericText optionNumber;
	/**
	 * Number identifying the available corporate action options.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmOptionNumber
	 * CorporateActionOption1.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount9#mmOptionNumber
	 * SecuritiesAccount9.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#mmOptionNumber
	 * CorporateActionElection3.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection1#mmOptionNumber
	 * CorporateActionElection1.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection2#mmOptionNumber
	 * CorporateActionElection2.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAdvice1#mmOptionNumber
	 * EntitlementAdvice1.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1#mmOptionNumber
	 * GlobalDistributionRequest1.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovement1#mmOptionNumber
	 * CorporateActionMovement1.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount8#mmOptionNumber
	 * SecuritiesAccount8.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption2#mmOptionNumber
	 * CorporateActionOption2.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionStatus1#mmOptionNumber
	 * CorporateActionDeactivationInstructionStatus1.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption119#mmOptionNumber
	 * CorporateActionOption119.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption116#mmOptionNumber
	 * CorporateActionOption116.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption120#mmOptionNumber
	 * CorporateActionOption120.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption6#mmOptionNumber
	 * InstructedCorporateActionOption6.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmOptionNumber
	 * CorporateActionOption132.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmOptionNumber
	 * CorporateActionOption130.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#mmOptionNumber
	 * CorporateActionOption131.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmOptionNumber
	 * CorporateActionOption129.mmOptionNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number identifying the available corporate action options."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOptionNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionOption1.mmOptionNumber, SecuritiesAccount9.mmOptionNumber, CorporateActionElection3.mmOptionNumber, CorporateActionElection1.mmOptionNumber,
					CorporateActionElection2.mmOptionNumber, EntitlementAdvice1.mmOptionNumber, GlobalDistributionRequest1.mmOptionNumber, CorporateActionMovement1.mmOptionNumber, SecuritiesAccount8.mmOptionNumber,
					CorporateActionOption2.mmOptionNumber, CorporateActionDeactivationInstructionStatus1.mmOptionNumber, CorporateActionOption119.mmOptionNumber, CorporateActionOption116.mmOptionNumber,
					CorporateActionOption120.mmOptionNumber, InstructedCorporateActionOption6.mmOptionNumber, CorporateActionOption132.mmOptionNumber, CorporateActionOption130.mmOptionNumber, CorporateActionOption131.mmOptionNumber,
					CorporateActionOption129.mmOptionNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionNumber";
			definition = "Number identifying the available corporate action options.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionOption.class.getMethod("getOptionNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionOptionCode optionType;
	/**
	 * Type of corporate action options available to the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption1FormatChoice#mmCode
	 * CorporateActionOption1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption1FormatChoice#mmProprietary
	 * CorporateActionOption1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmDefaultOptionType
	 * CorporateAction2.mmDefaultOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmOptionType
	 * CorporateActionOption1.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount9#mmOptionType
	 * SecuritiesAccount9.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#mmOptionType
	 * CorporateActionElection3.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection1#mmOptionType
	 * CorporateActionElection1.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection2#mmOptionType
	 * CorporateActionElection2.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAdvice1#mmOptionType
	 * EntitlementAdvice1.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1#mmOptionType
	 * GlobalDistributionRequest1.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovement1#mmOptionType
	 * CorporateActionMovement1.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount8#mmOptionType
	 * SecuritiesAccount8.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption2#mmOptionType
	 * CorporateActionOption2.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionStatus1#mmOptionType
	 * CorporateActionDeactivationInstructionStatus1.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#mmCorporateActionOptionType
	 * AggregateBalanceInformation30.mmCorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#mmCorporateActionOptionType
	 * AggregateBalanceInformation31.mmCorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption119#mmOptionType
	 * CorporateActionOption119.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption116#mmOptionType
	 * CorporateActionOption116.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption120#mmOptionType
	 * CorporateActionOption120.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption19Choice#mmCode
	 * CorporateActionOption19Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption19Choice#mmProprietary
	 * CorporateActionOption19Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption6#mmOptionType
	 * InstructedCorporateActionOption6.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption18Choice#mmCode
	 * CorporateActionOption18Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption18Choice#mmProprietary
	 * CorporateActionOption18Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption21Choice#mmCode
	 * CorporateActionOption21Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption21Choice#mmProprietary
	 * CorporateActionOption21Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption20Choice#mmCode
	 * CorporateActionOption20Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption20Choice#mmProprietary
	 * CorporateActionOption20Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmOptionType
	 * CorporateActionOption132.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmOptionType
	 * CorporateActionOption130.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#mmOptionType
	 * CorporateActionOption131.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmOptionType
	 * CorporateActionOption129.mmOptionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of corporate action options available to the account owner."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOptionType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionOption1FormatChoice.mmCode, CorporateActionOption1FormatChoice.mmProprietary, CorporateAction2.mmDefaultOptionType, CorporateActionOption1.mmOptionType,
					SecuritiesAccount9.mmOptionType, CorporateActionElection3.mmOptionType, CorporateActionElection1.mmOptionType, CorporateActionElection2.mmOptionType, EntitlementAdvice1.mmOptionType,
					GlobalDistributionRequest1.mmOptionType, CorporateActionMovement1.mmOptionType, SecuritiesAccount8.mmOptionType, CorporateActionOption2.mmOptionType, CorporateActionDeactivationInstructionStatus1.mmOptionType,
					AggregateBalanceInformation30.mmCorporateActionOptionType, AggregateBalanceInformation31.mmCorporateActionOptionType, CorporateActionOption119.mmOptionType, CorporateActionOption116.mmOptionType,
					CorporateActionOption120.mmOptionType, CorporateActionOption19Choice.mmCode, CorporateActionOption19Choice.mmProprietary, InstructedCorporateActionOption6.mmOptionType, CorporateActionOption18Choice.mmCode,
					CorporateActionOption18Choice.mmProprietary, CorporateActionOption21Choice.mmCode, CorporateActionOption21Choice.mmProprietary, CorporateActionOption20Choice.mmCode, CorporateActionOption20Choice.mmProprietary,
					CorporateActionOption132.mmOptionType, CorporateActionOption130.mmOptionType, CorporateActionOption131.mmOptionType, CorporateActionOption129.mmOptionType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionType";
			definition = "Type of corporate action options available to the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionOptionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionOption.class.getMethod("getOptionType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FractionDispositionTypeCode fractionDisposition;
	/**
	 * Treatment of the fractions resulting from derived securities will be
	 * processed or how prorated decisions will be rounding, if provided with a
	 * pro ration rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode
	 * FractionDispositionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType1FormatChoice#mmCode
	 * FractionDispositionType1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType1FormatChoice#mmProprietary
	 * FractionDispositionType1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1#mmFractionDisposition
	 * SecurityOption1.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmFractionDisposition
	 * CorporateActionOption1.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes68#mmFractionDisposition
	 * FinancialInstrumentAttributes68.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType25Choice#mmCode
	 * FractionDispositionType25Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType25Choice#mmProprietary
	 * FractionDispositionType25Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType27Choice#mmCode
	 * FractionDispositionType27Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType27Choice#mmProprietary
	 * FractionDispositionType27Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType26Choice#mmCode
	 * FractionDispositionType26Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType26Choice#mmProprietary
	 * FractionDispositionType26Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType28Choice#mmCode
	 * FractionDispositionType28Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType28Choice#mmProprietary
	 * FractionDispositionType28Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmFractionDisposition
	 * CorporateActionOption132.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmFractionDisposition
	 * CorporateActionOption130.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#mmFractionDisposition
	 * CorporateActionOption131.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmFractionDisposition
	 * CorporateActionOption129.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#mmFractionDisposition
	 * SecuritiesOption60.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmFractionDisposition
	 * SecuritiesOption59.mmFractionDisposition}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionDisposition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Treatment of the fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFractionDisposition = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FractionDispositionType1FormatChoice.mmCode, FractionDispositionType1FormatChoice.mmProprietary, SecurityOption1.mmFractionDisposition, CorporateActionOption1.mmFractionDisposition,
					FinancialInstrumentAttributes68.mmFractionDisposition, FractionDispositionType25Choice.mmCode, FractionDispositionType25Choice.mmProprietary, FractionDispositionType27Choice.mmCode,
					FractionDispositionType27Choice.mmProprietary, FractionDispositionType26Choice.mmCode, FractionDispositionType26Choice.mmProprietary, FractionDispositionType28Choice.mmCode,
					FractionDispositionType28Choice.mmProprietary, CorporateActionOption132.mmFractionDisposition, CorporateActionOption130.mmFractionDisposition, CorporateActionOption131.mmFractionDisposition,
					CorporateActionOption129.mmFractionDisposition, SecuritiesOption60.mmFractionDisposition, SecuritiesOption59.mmFractionDisposition);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FractionDisposition";
			definition = "Treatment of the fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FractionDispositionTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionOption.class.getMethod("getFractionDisposition", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode currencyOption;
	/**
	 * Currency choice given to the investor.
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
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption1#mmCurrency
	 * CashOption1.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmCurrencyOption
	 * CorporateActionOption132.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmCurrencyOption
	 * CorporateActionOption130.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#mmCurrencyOption
	 * CorporateActionOption131.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmCurrencyOption
	 * CorporateActionOption129.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#mmCurrencyOption
	 * SecuritiesOption60.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmCurrencyOption
	 * SecuritiesOption59.mmCurrencyOption}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency choice given to the investor."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCurrencyOption = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CashOption1.mmCurrency, CorporateActionOption132.mmCurrencyOption, CorporateActionOption130.mmCurrencyOption, CorporateActionOption131.mmCurrencyOption,
					CorporateActionOption129.mmCurrencyOption, SecuritiesOption60.mmCurrencyOption, SecuritiesOption59.mmCurrencyOption);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyOption";
			definition = "Currency choice given to the investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionOption.class.getMethod("getCurrencyOption", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ChoiceCorporateAction relatedChoiceCorporateAction;
	/**
	 * Corporate action for which one or more options are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ChoiceCorporateAction#mmCorporateActionOptionDefinition
	 * ChoiceCorporateAction.mmCorporateActionOptionDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ChoiceCorporateAction
	 * ChoiceCorporateAction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption1#mmDateDetails
	 * CashOption1.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption1#mmAmountDetails
	 * CashOption1.mmAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmDateDetails
	 * CorporateActionOption1.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmRateAndAmountDetails
	 * CorporateActionOption1.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmPeriodDetails
	 * CorporateActionOption1.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmDateDetails
	 * CorporateActionOption132.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmPeriodDetails
	 * CorporateActionOption132.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmRateAndAmountDetails
	 * CorporateActionOption132.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmDateDetails
	 * CorporateActionOption130.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmPeriodDetails
	 * CorporateActionOption130.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmRateAndAmountDetails
	 * CorporateActionOption130.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#mmRateAndAmountDetails
	 * CorporateActionOption131.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmDateDetails
	 * CorporateActionOption129.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmPeriodDetails
	 * CorporateActionOption129.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmRateAndAmountDetails
	 * CorporateActionOption129.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption52#mmAmountDetails
	 * CashOption52.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption52#mmDateDetails
	 * CashOption52.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption52#mmRateAndAmountDetails
	 * CashOption52.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption51#mmAmountDetails
	 * CashOption51.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption51#mmDateDetails
	 * CashOption51.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption51#mmRateAndAmountDetails
	 * CashOption51.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption50#mmAmountDetails
	 * CashOption50.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption50#mmDateDetails
	 * CashOption50.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption50#mmRateAndAmountDetails
	 * CashOption50.mmRateAndAmountDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedChoiceCorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action for which one or more options are provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedChoiceCorporateAction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CashOption1.mmDateDetails, CashOption1.mmAmountDetails, CorporateActionOption1.mmDateDetails, CorporateActionOption1.mmRateAndAmountDetails, CorporateActionOption1.mmPeriodDetails,
					CorporateActionOption132.mmDateDetails, CorporateActionOption132.mmPeriodDetails, CorporateActionOption132.mmRateAndAmountDetails, CorporateActionOption130.mmDateDetails, CorporateActionOption130.mmPeriodDetails,
					CorporateActionOption130.mmRateAndAmountDetails, CorporateActionOption131.mmRateAndAmountDetails, CorporateActionOption129.mmDateDetails, CorporateActionOption129.mmPeriodDetails,
					CorporateActionOption129.mmRateAndAmountDetails, CashOption52.mmAmountDetails, CashOption52.mmDateDetails, CashOption52.mmRateAndAmountDetails, CashOption51.mmAmountDetails, CashOption51.mmDateDetails,
					CashOption51.mmRateAndAmountDetails, CashOption50.mmAmountDetails, CashOption50.mmDateDetails, CashOption50.mmRateAndAmountDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedChoiceCorporateAction";
			definition = "Corporate action for which one or more options are provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ChoiceCorporateAction.mmCorporateActionOptionDefinition;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ChoiceCorporateAction.mmObject();
		}
	};
	protected CorporateActionElection corporateActionElection;
	/**
	 * Election process which selected a specific option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmOption
	 * CorporateActionElection.mmOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
	 * CorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionElection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Election process which selected a specific option."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCorporateActionElection = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionElection";
			definition = "Election process which selected a specific option.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.mmOption;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.mmObject();
		}
	};
	protected OptionFeaturesCode optionFeatures;
	/**
	 * Features that may apply to a corporate action option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode
	 * OptionFeaturesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeatures1FormatChoice#mmCode
	 * OptionFeatures1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeatures1FormatChoice#mmProprietary
	 * OptionFeatures1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmOptionFeatures
	 * CorporateActionOption1.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat18Choice#mmCode
	 * OptionFeaturesFormat18Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat18Choice#mmProprietary
	 * OptionFeaturesFormat18Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmOptionFeatures
	 * CorporateActionOption132.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmOptionFeatures
	 * CorporateActionOption130.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmOptionFeatures
	 * CorporateActionOption129.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat22Choice#mmCode
	 * OptionFeaturesFormat22Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat22Choice#mmProprietary
	 * OptionFeaturesFormat22Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionFeatures"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Features that may apply to a corporate action option."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOptionFeatures = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OptionFeatures1FormatChoice.mmCode, OptionFeatures1FormatChoice.mmProprietary, CorporateActionOption1.mmOptionFeatures, OptionFeaturesFormat18Choice.mmCode,
					OptionFeaturesFormat18Choice.mmProprietary, CorporateActionOption132.mmOptionFeatures, CorporateActionOption130.mmOptionFeatures, CorporateActionOption129.mmOptionFeatures, OptionFeaturesFormat22Choice.mmCode,
					OptionFeaturesFormat22Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionFeatures";
			definition = "Features that may apply to a corporate action option.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionFeaturesCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionOption.class.getMethod("getOptionFeatures", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DateTimePeriod actionPeriod;
	/**
	 * Period during which the specified option remains valid, eg, offer period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmCorporateActionOption
	 * DateTimePeriod.mmCorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7#mmActionPeriod
	 * CorporateActionPeriod7.mmActionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod1#mmActionPeriod
	 * CorporateActionPeriod1.mmActionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod2#mmActionPeriod
	 * CorporateActionPeriod2.mmActionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod11#mmActionPeriod
	 * CorporateActionPeriod11.mmActionPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the specified option remains valid, eg, offer period."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmActionPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPeriod7.mmActionPeriod, CorporateActionPeriod1.mmActionPeriod, CorporateActionPeriod2.mmActionPeriod, CorporateActionPeriod11.mmActionPeriod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ActionPeriod";
			definition = "Period during which the specified option remains valid, eg, offer period.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmCorporateActionOption;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected OfferTypeV2Code offerType;
	/**
	 * Conditions that apply to the offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OfferTypeV2Code
	 * OfferTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferType1FormatChoice#mmCode
	 * OfferType1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferType1FormatChoice#mmProprietary
	 * OfferType1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmOfferType
	 * CorporateAction2.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmOfferType
	 * CorporateActionOption1.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmOfferType
	 * CorporateAction31.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat10Choice#mmCode
	 * OfferTypeFormat10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat10Choice#mmProprietary
	 * OfferTypeFormat10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmOfferType
	 * CorporateActionOption130.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmOfferType
	 * CorporateActionOption129.mmOfferType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Conditions that apply to the offer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOfferType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OfferType1FormatChoice.mmCode, OfferType1FormatChoice.mmProprietary, CorporateAction2.mmOfferType, CorporateActionOption1.mmOfferType, CorporateAction31.mmOfferType,
					OfferTypeFormat10Choice.mmCode, OfferTypeFormat10Choice.mmProprietary, CorporateActionOption130.mmOfferType, CorporateActionOption129.mmOfferType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfferType";
			definition = "Conditions that apply to the offer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OfferTypeV2Code.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionOption.class.getMethod("getOfferType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator chargesAppliedIndicator;
	/**
	 * Indicates whether charges apply to the holder, for instance redemption
	 * charges.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmRedemptionChargesAppliedIndicator
	 * CorporateAction2.mmRedemptionChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmRedemptionChargesAppliedIndicator
	 * CorporateActionOption1.mmRedemptionChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmChargesAppliedIndicator
	 * CorporateAction31.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmChargesAppliedIndicator
	 * CorporateActionOption130.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmChargesAppliedIndicator
	 * CorporateActionOption129.mmChargesAppliedIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesAppliedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether charges apply to the holder, for instance redemption charges."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmChargesAppliedIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateAction2.mmRedemptionChargesAppliedIndicator, CorporateActionOption1.mmRedemptionChargesAppliedIndicator, CorporateAction31.mmChargesAppliedIndicator,
					CorporateActionOption130.mmChargesAppliedIndicator, CorporateActionOption129.mmChargesAppliedIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChargesAppliedIndicator";
			definition = "Indicates whether charges apply to the holder, for instance redemption charges.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionOption.class.getMethod("getChargesAppliedIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator withdrawalAllowedIndicator;
	/**
	 * Indicates whether withdrawal of instruction is allowed.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmWithdrawalAllowedIndicator
	 * CorporateActionOption1.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmWithdrawalAllowedIndicator
	 * CorporateActionOption130.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmWithdrawalAllowedIndicator
	 * CorporateActionOption129.mmWithdrawalAllowedIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalAllowedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether withdrawal of instruction is allowed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmWithdrawalAllowedIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionOption1.mmWithdrawalAllowedIndicator, CorporateActionOption130.mmWithdrawalAllowedIndicator, CorporateActionOption129.mmWithdrawalAllowedIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WithdrawalAllowedIndicator";
			definition = "Indicates whether withdrawal of instruction is allowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionOption.class.getMethod("getWithdrawalAllowedIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator changeAllowedIndicator;
	/**
	 * Indicates whether change of instruction is allowed.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmChangeAllowedIndicator
	 * CorporateActionOption1.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmChangeAllowedIndicator
	 * CorporateActionOption130.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmChangeAllowedIndicator
	 * CorporateActionOption129.mmChangeAllowedIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeAllowedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether change of instruction is allowed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmChangeAllowedIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionOption1.mmChangeAllowedIndicator, CorporateActionOption130.mmChangeAllowedIndicator, CorporateActionOption129.mmChangeAllowedIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChangeAllowedIndicator";
			definition = "Indicates whether change of instruction is allowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionOption.class.getMethod("getChangeAllowedIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CorporateActionOptionServicing> corporateActionOptionServicing;
	/**
	 * Calculation of the entitlement on the basis of the proposed option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOptionServicing#mmRelatedOption
	 * CorporateActionOptionServicing.mmRelatedOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOptionServicing
	 * CorporateActionOptionServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionOptionServicing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Calculation of the entitlement on the basis of the proposed option."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCorporateActionOptionServicing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionOptionServicing";
			definition = "Calculation of the entitlement on the basis of the proposed option.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionOptionServicing.mmRelatedOption;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionOptionServicing.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ProceedsDefinition> proceedsDefinition;
	/**
	 * Definition of exchanges of cash and / or securities available in the
	 * processing of corporate actions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmOption
	 * ProceedsDefinition.mmOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Definition of exchanges of cash and / or securities available in the processing of corporate actions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProceedsDefinition";
			definition = "Definition of exchanges of cash and / or securities available in the processing of corporate actions.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProceedsDefinition.mmOption;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProceedsDefinition.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CorporateActionDistribution> distribution;
	/**
	 * Distribution process for which an option is selected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmOption
	 * CorporateActionDistribution.mmOption}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Distribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Distribution process for which an option is selected."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Distribution";
			definition = "Distribution process for which an option is selected.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmOption;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmObject();
		}
	};
	protected YesNoIndicator default_;
	/**
	 * Specifies whether the option is the default option or not.
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Default"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the option is the default option or not."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDefault = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Default";
			definition = "Specifies whether the option is the default option or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionOption.class.getMethod("getDefault", new Class[]{});
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
				name = "CorporateActionOption";
				definition = "Provides information about the alternatives available to an account owner when participating to a corporate action event. This is defined at a general level without looking at the specificities of the securities balances.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.mmCorporateActionOption, com.tools20022.repository.entity.ProceedsDefinition.mmOption,
						com.tools20022.repository.entity.CorporateActionElection.mmOption, com.tools20022.repository.entity.ChoiceCorporateAction.mmCorporateActionOptionDefinition,
						com.tools20022.repository.entity.CorporateActionDistribution.mmOption, com.tools20022.repository.entity.CorporateActionOptionServicing.mmRelatedOption);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionOption.mmOptionNumber, com.tools20022.repository.entity.CorporateActionOption.mmOptionType,
						com.tools20022.repository.entity.CorporateActionOption.mmFractionDisposition, com.tools20022.repository.entity.CorporateActionOption.mmCurrencyOption,
						com.tools20022.repository.entity.CorporateActionOption.mmRelatedChoiceCorporateAction, com.tools20022.repository.entity.CorporateActionOption.mmCorporateActionElection,
						com.tools20022.repository.entity.CorporateActionOption.mmOptionFeatures, com.tools20022.repository.entity.CorporateActionOption.mmActionPeriod, com.tools20022.repository.entity.CorporateActionOption.mmOfferType,
						com.tools20022.repository.entity.CorporateActionOption.mmChargesAppliedIndicator, com.tools20022.repository.entity.CorporateActionOption.mmWithdrawalAllowedIndicator,
						com.tools20022.repository.entity.CorporateActionOption.mmChangeAllowedIndicator, com.tools20022.repository.entity.CorporateActionOption.mmCorporateActionOptionServicing,
						com.tools20022.repository.entity.CorporateActionOption.mmProceedsDefinition, com.tools20022.repository.entity.CorporateActionOption.mmDistribution, com.tools20022.repository.entity.CorporateActionOption.mmDefault);
				derivationComponent_lazy = () -> Arrays.asList(CorporateActionOption1FormatChoice.mmObject(), OfferType1FormatChoice.mmObject(), FractionDispositionType1FormatChoice.mmObject(), SecurityOption1.mmObject(),
						OptionFeatures1FormatChoice.mmObject(), CorporateActionOption1.mmObject(), CorporateActionOption2.mmObject(), CorporateActionOption119.mmObject(), CorporateActionOption116.mmObject(),
						CorporateActionOption120.mmObject(), CorporateActionOption19Choice.mmObject(), InstructedCorporateActionOption6.mmObject(), CorporateActionOption18Choice.mmObject(), CorporateActionOption21Choice.mmObject(),
						FractionDispositionType25Choice.mmObject(), SecuritiesOption51.mmObject(), FractionDispositionType27Choice.mmObject(), CorporateActionOption20Choice.mmObject(), FractionDispositionType26Choice.mmObject(),
						SecuritiesOption53.mmObject(), OfferTypeFormat10Choice.mmObject(), FractionDispositionType28Choice.mmObject(), OptionFeaturesFormat18Choice.mmObject(), SecuritiesOption54.mmObject(),
						CorporateActionOption132.mmObject(), CorporateActionOption130.mmObject(), CorporateActionOption131.mmObject(), CorporateActionOption129.mmObject(), SecuritiesOption60.mmObject(),
						OptionFeaturesFormat22Choice.mmObject(), SecuritiesOption59.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionOption.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Exact3NumericText getOptionNumber() {
		return optionNumber;
	}

	public void setOptionNumber(Exact3NumericText optionNumber) {
		this.optionNumber = optionNumber;
	}

	public CorporateActionOptionCode getOptionType() {
		return optionType;
	}

	public void setOptionType(CorporateActionOptionCode optionType) {
		this.optionType = optionType;
	}

	public FractionDispositionTypeCode getFractionDisposition() {
		return fractionDisposition;
	}

	public void setFractionDisposition(FractionDispositionTypeCode fractionDisposition) {
		this.fractionDisposition = fractionDisposition;
	}

	public CurrencyCode getCurrencyOption() {
		return currencyOption;
	}

	public void setCurrencyOption(CurrencyCode currencyOption) {
		this.currencyOption = currencyOption;
	}

	public ChoiceCorporateAction getRelatedChoiceCorporateAction() {
		return relatedChoiceCorporateAction;
	}

	public void setRelatedChoiceCorporateAction(com.tools20022.repository.entity.ChoiceCorporateAction relatedChoiceCorporateAction) {
		this.relatedChoiceCorporateAction = relatedChoiceCorporateAction;
	}

	public CorporateActionElection getCorporateActionElection() {
		return corporateActionElection;
	}

	public void setCorporateActionElection(com.tools20022.repository.entity.CorporateActionElection corporateActionElection) {
		this.corporateActionElection = corporateActionElection;
	}

	public OptionFeaturesCode getOptionFeatures() {
		return optionFeatures;
	}

	public void setOptionFeatures(OptionFeaturesCode optionFeatures) {
		this.optionFeatures = optionFeatures;
	}

	public DateTimePeriod getActionPeriod() {
		return actionPeriod;
	}

	public void setActionPeriod(com.tools20022.repository.entity.DateTimePeriod actionPeriod) {
		this.actionPeriod = actionPeriod;
	}

	public OfferTypeV2Code getOfferType() {
		return offerType;
	}

	public void setOfferType(OfferTypeV2Code offerType) {
		this.offerType = offerType;
	}

	public YesNoIndicator getChargesAppliedIndicator() {
		return chargesAppliedIndicator;
	}

	public void setChargesAppliedIndicator(YesNoIndicator chargesAppliedIndicator) {
		this.chargesAppliedIndicator = chargesAppliedIndicator;
	}

	public YesNoIndicator getWithdrawalAllowedIndicator() {
		return withdrawalAllowedIndicator;
	}

	public void setWithdrawalAllowedIndicator(YesNoIndicator withdrawalAllowedIndicator) {
		this.withdrawalAllowedIndicator = withdrawalAllowedIndicator;
	}

	public YesNoIndicator getChangeAllowedIndicator() {
		return changeAllowedIndicator;
	}

	public void setChangeAllowedIndicator(YesNoIndicator changeAllowedIndicator) {
		this.changeAllowedIndicator = changeAllowedIndicator;
	}

	public List<CorporateActionOptionServicing> getCorporateActionOptionServicing() {
		return corporateActionOptionServicing;
	}

	public void setCorporateActionOptionServicing(List<com.tools20022.repository.entity.CorporateActionOptionServicing> corporateActionOptionServicing) {
		this.corporateActionOptionServicing = corporateActionOptionServicing;
	}

	public List<ProceedsDefinition> getProceedsDefinition() {
		return proceedsDefinition;
	}

	public void setProceedsDefinition(List<com.tools20022.repository.entity.ProceedsDefinition> proceedsDefinition) {
		this.proceedsDefinition = proceedsDefinition;
	}

	public List<CorporateActionDistribution> getDistribution() {
		return distribution;
	}

	public void setDistribution(List<com.tools20022.repository.entity.CorporateActionDistribution> distribution) {
		this.distribution = distribution;
	}

	public YesNoIndicator getDefault() {
		return default_;
	}

	public void setDefault(YesNoIndicator default_) {
		this.default_ = default_;
	}
}