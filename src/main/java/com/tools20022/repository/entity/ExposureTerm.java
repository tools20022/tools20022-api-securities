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
import com.tools20022.repository.choice.ExposureType16Choice;
import com.tools20022.repository.choice.ExposureType9Choice;
import com.tools20022.repository.choice.MarginTerms1Choice;
import com.tools20022.repository.codeset.ExposureTypeCode;
import com.tools20022.repository.codeset.RoundingMethodCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.CollateralAgreement;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Specifies the terms used to calculate a risk exposure and its coverage.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ExposureTerm" src="doc-files/ExposureTerm.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ExposureTerm#mmExposureType
 * ExposureTerm.mmExposureType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureTerm#mmMinimumTransferAmount
 * ExposureTerm.mmMinimumTransferAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureTerm#mmRoundingAmount
 * ExposureTerm.mmRoundingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureTerm#mmRoundingMethod
 * ExposureTerm.mmRoundingMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureTerm#mmRelatedCollateralAgreement
 * ExposureTerm.mmRelatedCollateralAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureTerm#mmMinimumRequirementDeposit
 * ExposureTerm.mmMinimumRequirementDeposit}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmExposureTerm
 * CollateralAgreement.mmExposureTerm}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MarginTerms1Choice#mmMarginDetails
 * MarginTerms1Choice.mmMarginDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.IndependentAmountTerm
 * IndependentAmountTerm}</li>
 * <li>{@linkplain com.tools20022.repository.entity.VariationMarginTerm
 * VariationMarginTerm}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.ExposureType9Choice
 * ExposureType9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Margin1 Margin1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarginTerms1Choice
 * MarginTerms1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ExposureType16Choice
 * ExposureType16Choice}</li>
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
 * "ExposureTerm"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the terms used to calculate a risk exposure and its coverage."</li>
 * </ul>
 */
public class ExposureTerm {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ExposureTypeCode exposureType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType9Choice#mmCode
	 * ExposureType9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType9Choice#mmProprietary
	 * ExposureType9Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Summary1#mmExposureType
	 * Summary1.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType16Choice#mmCode
	 * ExposureType16Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType16Choice#mmProprietary
	 * ExposureType16Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Obligation4#mmExposureType
	 * Obligation4.mmExposureType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Obligation5#mmExposureType
	 * Obligation5.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmExposureType
	 * SettlementDetails142.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmExposureType
	 * SettlementDetails144.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmExposureType
	 * SettlementDetails145.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmExposureType
	 * SettlementDetails146.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143#mmExposureType
	 * SettlementDetails143.mmExposureType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm ExposureTerm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExposureType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the underlying business area/type of trade causing the collateral movement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ExposureTerm, ExposureTypeCode> mmExposureType = new MMBusinessAttribute<ExposureTerm, ExposureTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(ExposureType9Choice.mmCode, ExposureType9Choice.mmProprietary, Summary1.mmExposureType, ExposureType16Choice.mmCode, ExposureType16Choice.mmProprietary, Obligation4.mmExposureType,
					Obligation5.mmExposureType, SettlementDetails142.mmExposureType, SettlementDetails144.mmExposureType, SettlementDetails145.mmExposureType, SettlementDetails146.mmExposureType, SettlementDetails143.mmExposureType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureTerm.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExposureType";
			definition = "Specifies the underlying business area/type of trade causing the collateral movement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExposureTypeCode.mmObject();
		}

		@Override
		public ExposureTypeCode getValue(ExposureTerm obj) {
			return obj.getExposureType();
		}

		@Override
		public void setValue(ExposureTerm obj, ExposureTypeCode value) {
			obj.setExposureType(value);
		}
	};
	protected ActiveCurrencyAndAmount minimumTransferAmount;
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
	 * {@linkplain com.tools20022.repository.msg.VariationMargin1#mmMinimumTransferAmount
	 * VariationMargin1.mmMinimumTransferAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SegregatedIndependentAmountMargin1#mmMinimumTransferAmount
	 * SegregatedIndependentAmountMargin1.mmMinimumTransferAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1#mmMinimumTransferAmount
	 * SummaryAmounts1.mmMinimumTransferAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm ExposureTerm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumTransferAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum amount to pay/receive as specified in the agreement in the base currency (to avoid the need to transfer an inconveniently small amount of variation margin)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ExposureTerm, ActiveCurrencyAndAmount> mmMinimumTransferAmount = new MMBusinessAttribute<ExposureTerm, ActiveCurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(VariationMargin1.mmMinimumTransferAmount, SegregatedIndependentAmountMargin1.mmMinimumTransferAmount, SummaryAmounts1.mmMinimumTransferAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureTerm.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumTransferAmount";
			definition = "Minimum amount to pay/receive as specified in the agreement in the base currency (to avoid the need to transfer an inconveniently small amount of variation margin).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(ExposureTerm obj) {
			return obj.getMinimumTransferAmount();
		}

		@Override
		public void setValue(ExposureTerm obj, ActiveCurrencyAndAmount value) {
			obj.setMinimumTransferAmount(value);
		}
	};
	protected ActiveCurrencyAndAmount roundingAmount;
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
	 * {@linkplain com.tools20022.repository.msg.VariationMargin1#mmRoundingAmount
	 * VariationMargin1.mmRoundingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SegregatedIndependentAmountMargin1#mmRoundingAmount
	 * SegregatedIndependentAmountMargin1.mmRoundingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1#mmRoundingAmount
	 * SummaryAmounts1.mmRoundingAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm ExposureTerm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount specified to avoid the need to transfer uneven amounts of collateral."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ExposureTerm, ActiveCurrencyAndAmount> mmRoundingAmount = new MMBusinessAttribute<ExposureTerm, ActiveCurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(VariationMargin1.mmRoundingAmount, SegregatedIndependentAmountMargin1.mmRoundingAmount, SummaryAmounts1.mmRoundingAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureTerm.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingAmount";
			definition = "Amount specified to avoid the need to transfer uneven amounts of collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(ExposureTerm obj) {
			return obj.getRoundingAmount();
		}

		@Override
		public void setValue(ExposureTerm obj, ActiveCurrencyAndAmount value) {
			obj.setRoundingAmount(value);
		}
	};
	protected RoundingMethodCode roundingMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingMethodCode
	 * RoundingMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VariationMargin1#mmRoundingMethod
	 * VariationMargin1.mmRoundingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SegregatedIndependentAmountMargin1#mmRoundingMethod
	 * SegregatedIndependentAmountMargin1.mmRoundingMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm ExposureTerm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundingMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines how the rounding amount is applied in the calculation to avoid the need to transfer uneven amounts of collateral. For example, should the amount of collateral required be rounded up, down, to the closer integral multiple specified or not rounded."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ExposureTerm, RoundingMethodCode> mmRoundingMethod = new MMBusinessAttribute<ExposureTerm, RoundingMethodCode>() {
		{
			derivation_lazy = () -> Arrays.asList(VariationMargin1.mmRoundingMethod, SegregatedIndependentAmountMargin1.mmRoundingMethod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureTerm.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingMethod";
			definition = "Defines how the rounding amount is applied in the calculation to avoid the need to transfer uneven amounts of collateral. For example, should the amount of collateral required be rounded up, down, to the closer integral multiple specified or not rounded.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RoundingMethodCode.mmObject();
		}

		@Override
		public RoundingMethodCode getValue(ExposureTerm obj) {
			return obj.getRoundingMethod();
		}

		@Override
		public void setValue(ExposureTerm obj, RoundingMethodCode value) {
			obj.setRoundingMethod(value);
		}
	};
	protected CollateralAgreement relatedCollateralAgreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmExposureTerm
	 * CollateralAgreement.mmExposureTerm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralAgreement
	 * CollateralAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm ExposureTerm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCollateralAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agreement in which the exposure terms are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ExposureTerm, Optional<CollateralAgreement>> mmRelatedCollateralAgreement = new MMBusinessAssociationEnd<ExposureTerm, Optional<CollateralAgreement>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureTerm.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCollateralAgreement";
			definition = "Agreement in which the exposure terms are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CollateralAgreement.mmExposureTerm;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CollateralAgreement.mmObject();
		}

		@Override
		public Optional<CollateralAgreement> getValue(ExposureTerm obj) {
			return obj.getRelatedCollateralAgreement();
		}

		@Override
		public void setValue(ExposureTerm obj, Optional<CollateralAgreement> value) {
			obj.setRelatedCollateralAgreement(value.orElse(null));
		}
	};
	protected ActiveCurrencyAndAmount minimumRequirementDeposit;
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
	 * {@linkplain com.tools20022.repository.msg.MarginCalculation1#mmMinimumRequirementDeposit
	 * MarginCalculation1.mmMinimumRequirementDeposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarginCalculation2#mmMinimumRequirementDeposit
	 * MarginCalculation2.mmMinimumRequirementDeposit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm ExposureTerm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumRequirementDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum requirement for a participant if their requirement falls below a specific amount set by the central counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ExposureTerm, ActiveCurrencyAndAmount> mmMinimumRequirementDeposit = new MMBusinessAttribute<ExposureTerm, ActiveCurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(MarginCalculation1.mmMinimumRequirementDeposit, MarginCalculation2.mmMinimumRequirementDeposit);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureTerm.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumRequirementDeposit";
			definition = "Minimum requirement for a participant if their requirement falls below a specific amount set by the central counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(ExposureTerm obj) {
			return obj.getMinimumRequirementDeposit();
		}

		@Override
		public void setValue(ExposureTerm obj, ActiveCurrencyAndAmount value) {
			obj.setMinimumRequirementDeposit(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExposureTerm";
				definition = "Specifies the terms used to calculate a risk exposure and its coverage.";
				associationDomain_lazy = () -> Arrays.asList(CollateralAgreement.mmExposureTerm);
				derivationElement_lazy = () -> Arrays.asList(MarginTerms1Choice.mmMarginDetails);
				subType_lazy = () -> Arrays.asList(IndependentAmountTerm.mmObject(), VariationMarginTerm.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ExposureTerm.mmExposureType, com.tools20022.repository.entity.ExposureTerm.mmMinimumTransferAmount,
						com.tools20022.repository.entity.ExposureTerm.mmRoundingAmount, com.tools20022.repository.entity.ExposureTerm.mmRoundingMethod, com.tools20022.repository.entity.ExposureTerm.mmRelatedCollateralAgreement,
						com.tools20022.repository.entity.ExposureTerm.mmMinimumRequirementDeposit);
				derivationComponent_lazy = () -> Arrays.asList(ExposureType9Choice.mmObject(), Margin1.mmObject(), MarginTerms1Choice.mmObject(), ExposureType16Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return ExposureTerm.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ExposureTypeCode getExposureType() {
		return exposureType;
	}

	public ExposureTerm setExposureType(ExposureTypeCode exposureType) {
		this.exposureType = Objects.requireNonNull(exposureType);
		return this;
	}

	public ActiveCurrencyAndAmount getMinimumTransferAmount() {
		return minimumTransferAmount;
	}

	public ExposureTerm setMinimumTransferAmount(ActiveCurrencyAndAmount minimumTransferAmount) {
		this.minimumTransferAmount = Objects.requireNonNull(minimumTransferAmount);
		return this;
	}

	public ActiveCurrencyAndAmount getRoundingAmount() {
		return roundingAmount;
	}

	public ExposureTerm setRoundingAmount(ActiveCurrencyAndAmount roundingAmount) {
		this.roundingAmount = Objects.requireNonNull(roundingAmount);
		return this;
	}

	public RoundingMethodCode getRoundingMethod() {
		return roundingMethod;
	}

	public ExposureTerm setRoundingMethod(RoundingMethodCode roundingMethod) {
		this.roundingMethod = Objects.requireNonNull(roundingMethod);
		return this;
	}

	public Optional<CollateralAgreement> getRelatedCollateralAgreement() {
		return relatedCollateralAgreement == null ? Optional.empty() : Optional.of(relatedCollateralAgreement);
	}

	public ExposureTerm setRelatedCollateralAgreement(CollateralAgreement relatedCollateralAgreement) {
		this.relatedCollateralAgreement = relatedCollateralAgreement;
		return this;
	}

	public ActiveCurrencyAndAmount getMinimumRequirementDeposit() {
		return minimumRequirementDeposit;
	}

	public ExposureTerm setMinimumRequirementDeposit(ActiveCurrencyAndAmount minimumRequirementDeposit) {
		this.minimumRequirementDeposit = Objects.requireNonNull(minimumRequirementDeposit);
		return this;
	}
}