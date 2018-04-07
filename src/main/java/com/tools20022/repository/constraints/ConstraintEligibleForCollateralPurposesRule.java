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

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.msg.AdditionalBalanceInformation14;
import com.tools20022.repository.msg.AdditionalBalanceInformation15;

/**
 * If Subbalance type is EligibleForCollateralPurposes, then
 * QuantityAndAvailability cannot be used.
 */
public class ConstraintEligibleForCollateralPurposesRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation14
	 * AdditionalBalanceInformation14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Quantity/QuantityAndAvailability&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SubBalanceType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;EligibleForCollateralPurposes&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleForCollateralPurposesRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Subbalance type is EligibleForCollateralPurposes, then QuantityAndAvailability cannot be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalBalanceInformation14> forAdditionalBalanceInformation14 = new MMConstraint<AdditionalBalanceInformation14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleForCollateralPurposesRule";
			definition = "If Subbalance type is EligibleForCollateralPurposes, then QuantityAndAvailability cannot be used.";
			owner_lazy = () -> AdditionalBalanceInformation14.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Quantity/QuantityAndAvailability</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SubBalanceType/Code</leftOperand><rightOperand>EligibleForCollateralPurposes</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(AdditionalBalanceInformation14 obj) throws Exception {
			checkAdditionalBalanceInformation14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation15
	 * AdditionalBalanceInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Quantity/Quantity/QuantityAndAvailability&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SubBalanceType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;EligibleForCollateralPurposes&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleForCollateralPurposesRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Subbalance type is EligibleForCollateralPurposes, then QuantityAndAvailability cannot be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalBalanceInformation15> forAdditionalBalanceInformation15 = new MMConstraint<AdditionalBalanceInformation15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleForCollateralPurposesRule";
			definition = "If Subbalance type is EligibleForCollateralPurposes, then QuantityAndAvailability cannot be used.";
			owner_lazy = () -> AdditionalBalanceInformation15.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Quantity/Quantity/QuantityAndAvailability</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SubBalanceType/Code</leftOperand><rightOperand>EligibleForCollateralPurposes</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(AdditionalBalanceInformation15 obj) throws Exception {
			checkAdditionalBalanceInformation15(obj);
		}
	};

	/**
	 * If Subbalance type is EligibleForCollateralPurposes, then
	 * QuantityAndAvailability cannot be used.
	 */
	public static void checkAdditionalBalanceInformation14(AdditionalBalanceInformation14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Subbalance type is EligibleForCollateralPurposes, then
	 * QuantityAndAvailability cannot be used.
	 */
	public static void checkAdditionalBalanceInformation15(AdditionalBalanceInformation15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}