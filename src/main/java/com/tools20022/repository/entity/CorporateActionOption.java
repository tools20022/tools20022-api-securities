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
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption120
 * CorporateActionOption120}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionOption19Choice
 * CorporateActionOption19Choice}</li>
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
 * <li>{@linkplain com.tools20022.repository.choice.OfferTypeFormat10Choice
 * OfferTypeFormat10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption52
 * SecuritiesOption52}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType28Choice
 * FractionDispositionType28Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat18Choice
 * OptionFeaturesFormat18Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat22Choice
 * OptionFeaturesFormat22Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption140
 * CorporateActionOption140}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption141
 * CorporateActionOption141}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption138
 * CorporateActionOption138}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption142
 * CorporateActionOption142}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption139
 * CorporateActionOption139}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption64
 * SecuritiesOption64}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption8
 * InstructedCorporateActionOption8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption65
 * SecuritiesOption65}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption143
 * CorporateActionOption143}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption66
 * SecuritiesOption66}</li>
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
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption120#mmOptionNumber
	 * CorporateActionOption120.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption140#mmOptionNumber
	 * CorporateActionOption140.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption141#mmOptionNumber
	 * CorporateActionOption141.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138#mmOptionNumber
	 * CorporateActionOption138.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption142#mmOptionNumber
	 * CorporateActionOption142.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139#mmOptionNumber
	 * CorporateActionOption139.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption8#mmOptionNumber
	 * InstructedCorporateActionOption8.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption143#mmOptionNumber
	 * CorporateActionOption143.mmOptionNumber}</li>
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
	public static final MMBusinessAttribute<CorporateActionOption, Exact3NumericText> mmOptionNumber = new MMBusinessAttribute<CorporateActionOption, Exact3NumericText>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionOption1.mmOptionNumber, SecuritiesAccount9.mmOptionNumber, CorporateActionElection3.mmOptionNumber, CorporateActionElection1.mmOptionNumber,
					CorporateActionElection2.mmOptionNumber, EntitlementAdvice1.mmOptionNumber, GlobalDistributionRequest1.mmOptionNumber, CorporateActionMovement1.mmOptionNumber, SecuritiesAccount8.mmOptionNumber,
					CorporateActionOption2.mmOptionNumber, CorporateActionDeactivationInstructionStatus1.mmOptionNumber, CorporateActionOption120.mmOptionNumber, CorporateActionOption140.mmOptionNumber,
					CorporateActionOption141.mmOptionNumber, CorporateActionOption138.mmOptionNumber, CorporateActionOption142.mmOptionNumber, CorporateActionOption139.mmOptionNumber, InstructedCorporateActionOption8.mmOptionNumber,
					CorporateActionOption143.mmOptionNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionNumber";
			definition = "Number identifying the available corporate action options.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}

		@Override
		public Exact3NumericText getValue(CorporateActionOption obj) {
			return obj.getOptionNumber();
		}

		@Override
		public void setValue(CorporateActionOption obj, Exact3NumericText value) {
			obj.setOptionNumber(value);
		}
	};
	protected CorporateActionOptionCode optionType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption120#mmOptionType
	 * CorporateActionOption120.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption19Choice#mmCode
	 * CorporateActionOption19Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption19Choice#mmProprietary
	 * CorporateActionOption19Choice.mmProprietary}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption140#mmOptionType
	 * CorporateActionOption140.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption141#mmOptionType
	 * CorporateActionOption141.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138#mmOptionType
	 * CorporateActionOption138.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption142#mmOptionType
	 * CorporateActionOption142.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139#mmOptionType
	 * CorporateActionOption139.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption8#mmOptionType
	 * InstructedCorporateActionOption8.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption143#mmOptionType
	 * CorporateActionOption143.mmOptionType}</li>
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
	public static final MMBusinessAttribute<CorporateActionOption, CorporateActionOptionCode> mmOptionType = new MMBusinessAttribute<CorporateActionOption, CorporateActionOptionCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionOption1FormatChoice.mmCode, CorporateActionOption1FormatChoice.mmProprietary, CorporateAction2.mmDefaultOptionType, CorporateActionOption1.mmOptionType,
					SecuritiesAccount9.mmOptionType, CorporateActionElection3.mmOptionType, CorporateActionElection1.mmOptionType, CorporateActionElection2.mmOptionType, EntitlementAdvice1.mmOptionType,
					GlobalDistributionRequest1.mmOptionType, CorporateActionMovement1.mmOptionType, SecuritiesAccount8.mmOptionType, CorporateActionOption2.mmOptionType, CorporateActionDeactivationInstructionStatus1.mmOptionType,
					AggregateBalanceInformation30.mmCorporateActionOptionType, AggregateBalanceInformation31.mmCorporateActionOptionType, CorporateActionOption120.mmOptionType, CorporateActionOption19Choice.mmCode,
					CorporateActionOption19Choice.mmProprietary, CorporateActionOption18Choice.mmCode, CorporateActionOption18Choice.mmProprietary, CorporateActionOption21Choice.mmCode, CorporateActionOption21Choice.mmProprietary,
					CorporateActionOption20Choice.mmCode, CorporateActionOption20Choice.mmProprietary, CorporateActionOption140.mmOptionType, CorporateActionOption141.mmOptionType, CorporateActionOption138.mmOptionType,
					CorporateActionOption142.mmOptionType, CorporateActionOption139.mmOptionType, InstructedCorporateActionOption8.mmOptionType, CorporateActionOption143.mmOptionType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionType";
			definition = "Type of corporate action options available to the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionOptionCode.mmObject();
		}

		@Override
		public CorporateActionOptionCode getValue(CorporateActionOption obj) {
			return obj.getOptionType();
		}

		@Override
		public void setValue(CorporateActionOption obj, CorporateActionOptionCode value) {
			obj.setOptionType(value);
		}
	};
	protected FractionDispositionTypeCode fractionDisposition;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption140#mmFractionDisposition
	 * CorporateActionOption140.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138#mmFractionDisposition
	 * CorporateActionOption138.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption142#mmFractionDisposition
	 * CorporateActionOption142.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139#mmFractionDisposition
	 * CorporateActionOption139.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmFractionDisposition
	 * SecuritiesOption64.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption65#mmFractionDisposition
	 * SecuritiesOption65.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93#mmFractionDisposition
	 * FinancialInstrumentAttributes93.mmFractionDisposition}</li>
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
	public static final MMBusinessAttribute<CorporateActionOption, FractionDispositionTypeCode> mmFractionDisposition = new MMBusinessAttribute<CorporateActionOption, FractionDispositionTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(FractionDispositionType1FormatChoice.mmCode, FractionDispositionType1FormatChoice.mmProprietary, SecurityOption1.mmFractionDisposition, CorporateActionOption1.mmFractionDisposition,
					FractionDispositionType25Choice.mmCode, FractionDispositionType25Choice.mmProprietary, FractionDispositionType27Choice.mmCode, FractionDispositionType27Choice.mmProprietary, FractionDispositionType26Choice.mmCode,
					FractionDispositionType26Choice.mmProprietary, FractionDispositionType28Choice.mmCode, FractionDispositionType28Choice.mmProprietary, CorporateActionOption140.mmFractionDisposition,
					CorporateActionOption138.mmFractionDisposition, CorporateActionOption142.mmFractionDisposition, CorporateActionOption139.mmFractionDisposition, SecuritiesOption64.mmFractionDisposition,
					SecuritiesOption65.mmFractionDisposition, FinancialInstrumentAttributes93.mmFractionDisposition);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FractionDisposition";
			definition = "Treatment of the fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FractionDispositionTypeCode.mmObject();
		}

		@Override
		public FractionDispositionTypeCode getValue(CorporateActionOption obj) {
			return obj.getFractionDisposition();
		}

		@Override
		public void setValue(CorporateActionOption obj, FractionDispositionTypeCode value) {
			obj.setFractionDisposition(value);
		}
	};
	protected CurrencyCode currencyOption;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption140#mmCurrencyOption
	 * CorporateActionOption140.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138#mmCurrencyOption
	 * CorporateActionOption138.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption142#mmCurrencyOption
	 * CorporateActionOption142.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139#mmCurrencyOption
	 * CorporateActionOption139.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmCurrencyOption
	 * SecuritiesOption64.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption65#mmCurrencyOption
	 * SecuritiesOption65.mmCurrencyOption}</li>
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
	public static final MMBusinessAttribute<CorporateActionOption, CurrencyCode> mmCurrencyOption = new MMBusinessAttribute<CorporateActionOption, CurrencyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CashOption1.mmCurrency, CorporateActionOption140.mmCurrencyOption, CorporateActionOption138.mmCurrencyOption, CorporateActionOption142.mmCurrencyOption,
					CorporateActionOption139.mmCurrencyOption, SecuritiesOption64.mmCurrencyOption, SecuritiesOption65.mmCurrencyOption);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyOption";
			definition = "Currency choice given to the investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(CorporateActionOption obj) {
			return obj.getCurrencyOption();
		}

		@Override
		public void setValue(CorporateActionOption obj, CurrencyCode value) {
			obj.setCurrencyOption(value);
		}
	};
	protected ChoiceCorporateAction relatedChoiceCorporateAction;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption140#mmDateDetails
	 * CorporateActionOption140.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption140#mmPeriodDetails
	 * CorporateActionOption140.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption140#mmRateAndAmountDetails
	 * CorporateActionOption140.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138#mmDateDetails
	 * CorporateActionOption138.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138#mmPeriodDetails
	 * CorporateActionOption138.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138#mmRateAndAmountDetails
	 * CorporateActionOption138.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption142#mmRateAndAmountDetails
	 * CorporateActionOption142.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139#mmDateDetails
	 * CorporateActionOption139.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139#mmPeriodDetails
	 * CorporateActionOption139.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139#mmRateAndAmountDetails
	 * CorporateActionOption139.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption56#mmAmountDetails
	 * CashOption56.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption56#mmDateDetails
	 * CashOption56.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption56#mmRateAndAmountDetails
	 * CashOption56.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption57#mmAmountDetails
	 * CashOption57.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption57#mmDateDetails
	 * CashOption57.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption57#mmRateAndAmountDetails
	 * CashOption57.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption58#mmAmountDetails
	 * CashOption58.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption58#mmDateDetails
	 * CashOption58.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption58#mmRateAndAmountDetails
	 * CashOption58.mmRateAndAmountDetails}</li>
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
	public static final MMBusinessAssociationEnd<CorporateActionOption, Optional<ChoiceCorporateAction>> mmRelatedChoiceCorporateAction = new MMBusinessAssociationEnd<CorporateActionOption, Optional<ChoiceCorporateAction>>() {
		{
			derivation_lazy = () -> Arrays.asList(CashOption1.mmDateDetails, CashOption1.mmAmountDetails, CorporateActionOption1.mmDateDetails, CorporateActionOption1.mmRateAndAmountDetails, CorporateActionOption1.mmPeriodDetails,
					CorporateActionOption140.mmDateDetails, CorporateActionOption140.mmPeriodDetails, CorporateActionOption140.mmRateAndAmountDetails, CorporateActionOption138.mmDateDetails, CorporateActionOption138.mmPeriodDetails,
					CorporateActionOption138.mmRateAndAmountDetails, CorporateActionOption142.mmRateAndAmountDetails, CorporateActionOption139.mmDateDetails, CorporateActionOption139.mmPeriodDetails,
					CorporateActionOption139.mmRateAndAmountDetails, CashOption56.mmAmountDetails, CashOption56.mmDateDetails, CashOption56.mmRateAndAmountDetails, CashOption57.mmAmountDetails, CashOption57.mmDateDetails,
					CashOption57.mmRateAndAmountDetails, CashOption58.mmAmountDetails, CashOption58.mmDateDetails, CashOption58.mmRateAndAmountDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedChoiceCorporateAction";
			definition = "Corporate action for which one or more options are provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ChoiceCorporateAction.mmCorporateActionOptionDefinition;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ChoiceCorporateAction.mmObject();
		}

		@Override
		public Optional<ChoiceCorporateAction> getValue(CorporateActionOption obj) {
			return obj.getRelatedChoiceCorporateAction();
		}

		@Override
		public void setValue(CorporateActionOption obj, Optional<ChoiceCorporateAction> value) {
			obj.setRelatedChoiceCorporateAction(value.orElse(null));
		}
	};
	protected CorporateActionElection corporateActionElection;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<CorporateActionOption, CorporateActionElection> mmCorporateActionElection = new MMBusinessAssociationEnd<CorporateActionOption, CorporateActionElection>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionElection";
			definition = "Election process which selected a specific option.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CorporateActionElection.mmOption;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionElection.mmObject();
		}

		@Override
		public CorporateActionElection getValue(CorporateActionOption obj) {
			return obj.getCorporateActionElection();
		}

		@Override
		public void setValue(CorporateActionOption obj, CorporateActionElection value) {
			obj.setCorporateActionElection(value);
		}
	};
	protected OptionFeaturesCode optionFeatures;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat22Choice#mmCode
	 * OptionFeaturesFormat22Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat22Choice#mmProprietary
	 * OptionFeaturesFormat22Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption140#mmOptionFeatures
	 * CorporateActionOption140.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138#mmOptionFeatures
	 * CorporateActionOption138.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139#mmOptionFeatures
	 * CorporateActionOption139.mmOptionFeatures}</li>
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
	public static final MMBusinessAttribute<CorporateActionOption, OptionFeaturesCode> mmOptionFeatures = new MMBusinessAttribute<CorporateActionOption, OptionFeaturesCode>() {
		{
			derivation_lazy = () -> Arrays.asList(OptionFeatures1FormatChoice.mmCode, OptionFeatures1FormatChoice.mmProprietary, CorporateActionOption1.mmOptionFeatures, OptionFeaturesFormat18Choice.mmCode,
					OptionFeaturesFormat18Choice.mmProprietary, OptionFeaturesFormat22Choice.mmCode, OptionFeaturesFormat22Choice.mmProprietary, CorporateActionOption140.mmOptionFeatures, CorporateActionOption138.mmOptionFeatures,
					CorporateActionOption139.mmOptionFeatures);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionFeatures";
			definition = "Features that may apply to a corporate action option.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionFeaturesCode.mmObject();
		}

		@Override
		public OptionFeaturesCode getValue(CorporateActionOption obj) {
			return obj.getOptionFeatures();
		}

		@Override
		public void setValue(CorporateActionOption obj, OptionFeaturesCode value) {
			obj.setOptionFeatures(value);
		}
	};
	protected DateTimePeriod actionPeriod;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod1#mmActionPeriod
	 * CorporateActionPeriod1.mmActionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod2#mmActionPeriod
	 * CorporateActionPeriod2.mmActionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod12#mmActionPeriod
	 * CorporateActionPeriod12.mmActionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod13#mmActionPeriod
	 * CorporateActionPeriod13.mmActionPeriod}</li>
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
	public static final MMBusinessAssociationEnd<CorporateActionOption, DateTimePeriod> mmActionPeriod = new MMBusinessAssociationEnd<CorporateActionOption, DateTimePeriod>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPeriod1.mmActionPeriod, CorporateActionPeriod2.mmActionPeriod, CorporateActionPeriod12.mmActionPeriod, CorporateActionPeriod13.mmActionPeriod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ActionPeriod";
			definition = "Period during which the specified option remains valid, eg, offer period.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmCorporateActionOption;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(CorporateActionOption obj) {
			return obj.getActionPeriod();
		}

		@Override
		public void setValue(CorporateActionOption obj, DateTimePeriod value) {
			obj.setActionPeriod(value);
		}
	};
	protected OfferTypeV2Code offerType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat10Choice#mmCode
	 * OfferTypeFormat10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat10Choice#mmProprietary
	 * OfferTypeFormat10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmOfferType
	 * CorporateAction41.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138#mmOfferType
	 * CorporateActionOption138.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139#mmOfferType
	 * CorporateActionOption139.mmOfferType}</li>
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
	public static final MMBusinessAttribute<CorporateActionOption, OfferTypeV2Code> mmOfferType = new MMBusinessAttribute<CorporateActionOption, OfferTypeV2Code>() {
		{
			derivation_lazy = () -> Arrays.asList(OfferType1FormatChoice.mmCode, OfferType1FormatChoice.mmProprietary, CorporateAction2.mmOfferType, CorporateActionOption1.mmOfferType, OfferTypeFormat10Choice.mmCode,
					OfferTypeFormat10Choice.mmProprietary, CorporateAction41.mmOfferType, CorporateActionOption138.mmOfferType, CorporateActionOption139.mmOfferType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfferType";
			definition = "Conditions that apply to the offer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OfferTypeV2Code.mmObject();
		}

		@Override
		public OfferTypeV2Code getValue(CorporateActionOption obj) {
			return obj.getOfferType();
		}

		@Override
		public void setValue(CorporateActionOption obj, OfferTypeV2Code value) {
			obj.setOfferType(value);
		}
	};
	protected YesNoIndicator chargesAppliedIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmRedemptionChargesAppliedIndicator
	 * CorporateAction2.mmRedemptionChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmRedemptionChargesAppliedIndicator
	 * CorporateActionOption1.mmRedemptionChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmChargesAppliedIndicator
	 * CorporateAction41.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138#mmChargesAppliedIndicator
	 * CorporateActionOption138.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139#mmChargesAppliedIndicator
	 * CorporateActionOption139.mmChargesAppliedIndicator}</li>
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
	public static final MMBusinessAttribute<CorporateActionOption, YesNoIndicator> mmChargesAppliedIndicator = new MMBusinessAttribute<CorporateActionOption, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateAction2.mmRedemptionChargesAppliedIndicator, CorporateActionOption1.mmRedemptionChargesAppliedIndicator, CorporateAction41.mmChargesAppliedIndicator,
					CorporateActionOption138.mmChargesAppliedIndicator, CorporateActionOption139.mmChargesAppliedIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChargesAppliedIndicator";
			definition = "Indicates whether charges apply to the holder, for instance redemption charges.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CorporateActionOption obj) {
			return obj.getChargesAppliedIndicator();
		}

		@Override
		public void setValue(CorporateActionOption obj, YesNoIndicator value) {
			obj.setChargesAppliedIndicator(value);
		}
	};
	protected YesNoIndicator withdrawalAllowedIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmWithdrawalAllowedIndicator
	 * CorporateActionOption1.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138#mmWithdrawalAllowedIndicator
	 * CorporateActionOption138.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139#mmWithdrawalAllowedIndicator
	 * CorporateActionOption139.mmWithdrawalAllowedIndicator}</li>
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
	public static final MMBusinessAttribute<CorporateActionOption, YesNoIndicator> mmWithdrawalAllowedIndicator = new MMBusinessAttribute<CorporateActionOption, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionOption1.mmWithdrawalAllowedIndicator, CorporateActionOption138.mmWithdrawalAllowedIndicator, CorporateActionOption139.mmWithdrawalAllowedIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WithdrawalAllowedIndicator";
			definition = "Indicates whether withdrawal of instruction is allowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CorporateActionOption obj) {
			return obj.getWithdrawalAllowedIndicator();
		}

		@Override
		public void setValue(CorporateActionOption obj, YesNoIndicator value) {
			obj.setWithdrawalAllowedIndicator(value);
		}
	};
	protected YesNoIndicator changeAllowedIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmChangeAllowedIndicator
	 * CorporateActionOption1.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138#mmChangeAllowedIndicator
	 * CorporateActionOption138.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139#mmChangeAllowedIndicator
	 * CorporateActionOption139.mmChangeAllowedIndicator}</li>
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
	public static final MMBusinessAttribute<CorporateActionOption, YesNoIndicator> mmChangeAllowedIndicator = new MMBusinessAttribute<CorporateActionOption, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionOption1.mmChangeAllowedIndicator, CorporateActionOption138.mmChangeAllowedIndicator, CorporateActionOption139.mmChangeAllowedIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChangeAllowedIndicator";
			definition = "Indicates whether change of instruction is allowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CorporateActionOption obj) {
			return obj.getChangeAllowedIndicator();
		}

		@Override
		public void setValue(CorporateActionOption obj, YesNoIndicator value) {
			obj.setChangeAllowedIndicator(value);
		}
	};
	protected List<CorporateActionOptionServicing> corporateActionOptionServicing;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<CorporateActionOption, List<CorporateActionOptionServicing>> mmCorporateActionOptionServicing = new MMBusinessAssociationEnd<CorporateActionOption, List<CorporateActionOptionServicing>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionOptionServicing";
			definition = "Calculation of the entitlement on the basis of the proposed option.";
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionOptionServicing.mmRelatedOption;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionOptionServicing.mmObject();
		}

		@Override
		public List<CorporateActionOptionServicing> getValue(CorporateActionOption obj) {
			return obj.getCorporateActionOptionServicing();
		}

		@Override
		public void setValue(CorporateActionOption obj, List<CorporateActionOptionServicing> value) {
			obj.setCorporateActionOptionServicing(value);
		}
	};
	protected List<ProceedsDefinition> proceedsDefinition;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<CorporateActionOption, List<ProceedsDefinition>> mmProceedsDefinition = new MMBusinessAssociationEnd<CorporateActionOption, List<ProceedsDefinition>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProceedsDefinition";
			definition = "Definition of exchanges of cash and / or securities available in the processing of corporate actions.";
			minOccurs = 0;
			opposite_lazy = () -> ProceedsDefinition.mmOption;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ProceedsDefinition.mmObject();
		}

		@Override
		public List<ProceedsDefinition> getValue(CorporateActionOption obj) {
			return obj.getProceedsDefinition();
		}

		@Override
		public void setValue(CorporateActionOption obj, List<ProceedsDefinition> value) {
			obj.setProceedsDefinition(value);
		}
	};
	protected List<CorporateActionDistribution> distribution;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<CorporateActionOption, List<CorporateActionDistribution>> mmDistribution = new MMBusinessAssociationEnd<CorporateActionOption, List<CorporateActionDistribution>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Distribution";
			definition = "Distribution process for which an option is selected.";
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionDistribution.mmOption;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionDistribution.mmObject();
		}

		@Override
		public List<CorporateActionDistribution> getValue(CorporateActionOption obj) {
			return obj.getDistribution();
		}

		@Override
		public void setValue(CorporateActionOption obj, List<CorporateActionDistribution> value) {
			obj.setDistribution(value);
		}
	};
	protected YesNoIndicator default_;
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
	public static final MMBusinessAttribute<CorporateActionOption, YesNoIndicator> mmDefault = new MMBusinessAttribute<CorporateActionOption, YesNoIndicator>() {
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

		@Override
		public YesNoIndicator getValue(CorporateActionOption obj) {
			return obj.getDefault();
		}

		@Override
		public void setValue(CorporateActionOption obj, YesNoIndicator value) {
			obj.setDefault(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionOption";
				definition = "Provides information about the alternatives available to an account owner when participating to a corporate action event. This is defined at a general level without looking at the specificities of the securities balances.";
				associationDomain_lazy = () -> Arrays.asList(DateTimePeriod.mmCorporateActionOption, ProceedsDefinition.mmOption, CorporateActionElection.mmOption, ChoiceCorporateAction.mmCorporateActionOptionDefinition,
						CorporateActionDistribution.mmOption, CorporateActionOptionServicing.mmRelatedOption);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionOption.mmOptionNumber, com.tools20022.repository.entity.CorporateActionOption.mmOptionType,
						com.tools20022.repository.entity.CorporateActionOption.mmFractionDisposition, com.tools20022.repository.entity.CorporateActionOption.mmCurrencyOption,
						com.tools20022.repository.entity.CorporateActionOption.mmRelatedChoiceCorporateAction, com.tools20022.repository.entity.CorporateActionOption.mmCorporateActionElection,
						com.tools20022.repository.entity.CorporateActionOption.mmOptionFeatures, com.tools20022.repository.entity.CorporateActionOption.mmActionPeriod, com.tools20022.repository.entity.CorporateActionOption.mmOfferType,
						com.tools20022.repository.entity.CorporateActionOption.mmChargesAppliedIndicator, com.tools20022.repository.entity.CorporateActionOption.mmWithdrawalAllowedIndicator,
						com.tools20022.repository.entity.CorporateActionOption.mmChangeAllowedIndicator, com.tools20022.repository.entity.CorporateActionOption.mmCorporateActionOptionServicing,
						com.tools20022.repository.entity.CorporateActionOption.mmProceedsDefinition, com.tools20022.repository.entity.CorporateActionOption.mmDistribution, com.tools20022.repository.entity.CorporateActionOption.mmDefault);
				derivationComponent_lazy = () -> Arrays.asList(CorporateActionOption1FormatChoice.mmObject(), OfferType1FormatChoice.mmObject(), FractionDispositionType1FormatChoice.mmObject(), SecurityOption1.mmObject(),
						OptionFeatures1FormatChoice.mmObject(), CorporateActionOption1.mmObject(), CorporateActionOption2.mmObject(), CorporateActionOption120.mmObject(), CorporateActionOption19Choice.mmObject(),
						CorporateActionOption18Choice.mmObject(), CorporateActionOption21Choice.mmObject(), FractionDispositionType25Choice.mmObject(), SecuritiesOption51.mmObject(), FractionDispositionType27Choice.mmObject(),
						CorporateActionOption20Choice.mmObject(), FractionDispositionType26Choice.mmObject(), OfferTypeFormat10Choice.mmObject(), SecuritiesOption52.mmObject(), FractionDispositionType28Choice.mmObject(),
						OptionFeaturesFormat18Choice.mmObject(), OptionFeaturesFormat22Choice.mmObject(), CorporateActionOption140.mmObject(), CorporateActionOption141.mmObject(), CorporateActionOption138.mmObject(),
						CorporateActionOption142.mmObject(), CorporateActionOption139.mmObject(), SecuritiesOption64.mmObject(), InstructedCorporateActionOption8.mmObject(), SecuritiesOption65.mmObject(),
						CorporateActionOption143.mmObject(), SecuritiesOption66.mmObject());
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

	public CorporateActionOption setOptionNumber(Exact3NumericText optionNumber) {
		this.optionNumber = Objects.requireNonNull(optionNumber);
		return this;
	}

	public CorporateActionOptionCode getOptionType() {
		return optionType;
	}

	public CorporateActionOption setOptionType(CorporateActionOptionCode optionType) {
		this.optionType = Objects.requireNonNull(optionType);
		return this;
	}

	public FractionDispositionTypeCode getFractionDisposition() {
		return fractionDisposition;
	}

	public CorporateActionOption setFractionDisposition(FractionDispositionTypeCode fractionDisposition) {
		this.fractionDisposition = Objects.requireNonNull(fractionDisposition);
		return this;
	}

	public CurrencyCode getCurrencyOption() {
		return currencyOption;
	}

	public CorporateActionOption setCurrencyOption(CurrencyCode currencyOption) {
		this.currencyOption = Objects.requireNonNull(currencyOption);
		return this;
	}

	public Optional<ChoiceCorporateAction> getRelatedChoiceCorporateAction() {
		return relatedChoiceCorporateAction == null ? Optional.empty() : Optional.of(relatedChoiceCorporateAction);
	}

	public CorporateActionOption setRelatedChoiceCorporateAction(ChoiceCorporateAction relatedChoiceCorporateAction) {
		this.relatedChoiceCorporateAction = relatedChoiceCorporateAction;
		return this;
	}

	public CorporateActionElection getCorporateActionElection() {
		return corporateActionElection;
	}

	public CorporateActionOption setCorporateActionElection(CorporateActionElection corporateActionElection) {
		this.corporateActionElection = Objects.requireNonNull(corporateActionElection);
		return this;
	}

	public OptionFeaturesCode getOptionFeatures() {
		return optionFeatures;
	}

	public CorporateActionOption setOptionFeatures(OptionFeaturesCode optionFeatures) {
		this.optionFeatures = Objects.requireNonNull(optionFeatures);
		return this;
	}

	public DateTimePeriod getActionPeriod() {
		return actionPeriod;
	}

	public CorporateActionOption setActionPeriod(DateTimePeriod actionPeriod) {
		this.actionPeriod = Objects.requireNonNull(actionPeriod);
		return this;
	}

	public OfferTypeV2Code getOfferType() {
		return offerType;
	}

	public CorporateActionOption setOfferType(OfferTypeV2Code offerType) {
		this.offerType = Objects.requireNonNull(offerType);
		return this;
	}

	public YesNoIndicator getChargesAppliedIndicator() {
		return chargesAppliedIndicator;
	}

	public CorporateActionOption setChargesAppliedIndicator(YesNoIndicator chargesAppliedIndicator) {
		this.chargesAppliedIndicator = Objects.requireNonNull(chargesAppliedIndicator);
		return this;
	}

	public YesNoIndicator getWithdrawalAllowedIndicator() {
		return withdrawalAllowedIndicator;
	}

	public CorporateActionOption setWithdrawalAllowedIndicator(YesNoIndicator withdrawalAllowedIndicator) {
		this.withdrawalAllowedIndicator = Objects.requireNonNull(withdrawalAllowedIndicator);
		return this;
	}

	public YesNoIndicator getChangeAllowedIndicator() {
		return changeAllowedIndicator;
	}

	public CorporateActionOption setChangeAllowedIndicator(YesNoIndicator changeAllowedIndicator) {
		this.changeAllowedIndicator = Objects.requireNonNull(changeAllowedIndicator);
		return this;
	}

	public List<CorporateActionOptionServicing> getCorporateActionOptionServicing() {
		return corporateActionOptionServicing == null ? corporateActionOptionServicing = new ArrayList<>() : corporateActionOptionServicing;
	}

	public CorporateActionOption setCorporateActionOptionServicing(List<CorporateActionOptionServicing> corporateActionOptionServicing) {
		this.corporateActionOptionServicing = Objects.requireNonNull(corporateActionOptionServicing);
		return this;
	}

	public List<ProceedsDefinition> getProceedsDefinition() {
		return proceedsDefinition == null ? proceedsDefinition = new ArrayList<>() : proceedsDefinition;
	}

	public CorporateActionOption setProceedsDefinition(List<ProceedsDefinition> proceedsDefinition) {
		this.proceedsDefinition = Objects.requireNonNull(proceedsDefinition);
		return this;
	}

	public List<CorporateActionDistribution> getDistribution() {
		return distribution == null ? distribution = new ArrayList<>() : distribution;
	}

	public CorporateActionOption setDistribution(List<CorporateActionDistribution> distribution) {
		this.distribution = Objects.requireNonNull(distribution);
		return this;
	}

	public YesNoIndicator getDefault() {
		return default_;
	}

	public CorporateActionOption setDefault(YesNoIndicator default_) {
		this.default_ = Objects.requireNonNull(default_);
		return this;
	}
}