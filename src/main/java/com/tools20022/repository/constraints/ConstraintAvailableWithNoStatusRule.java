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
import com.tools20022.repository.msg.SubBalanceInformation14;
import com.tools20022.repository.msg.SubBalanceInformation15;

/**
 * If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability
 * cannot be used.
 */
public class ConstraintAvailableWithNoStatusRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation15
	 * SubBalanceInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Quantity/Quantity/QuantityAndAvailability&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SubBalanceType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;AvailableWithNoAdditionalStatus&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableWithNoStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability cannot be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation15> forSubBalanceInformation15 = new MMConstraint<SubBalanceInformation15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableWithNoStatusRule";
			definition = "If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability cannot be used.";
			owner_lazy = () -> SubBalanceInformation15.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Quantity/Quantity/QuantityAndAvailability</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SubBalanceType/Code</leftOperand><rightOperand>AvailableWithNoAdditionalStatus</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SubBalanceInformation15 obj) throws Exception {
			checkSubBalanceInformation15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation14
	 * SubBalanceInformation14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Quantity/QuantityAndAvailability&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SubBalanceType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;AvailableWithNoAdditionalStatus&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableWithNoStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability cannot be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation14> forSubBalanceInformation14 = new MMConstraint<SubBalanceInformation14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableWithNoStatusRule";
			definition = "If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability cannot be used.";
			owner_lazy = () -> SubBalanceInformation14.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Quantity/QuantityAndAvailability</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SubBalanceType/Code</leftOperand><rightOperand>AvailableWithNoAdditionalStatus</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SubBalanceInformation14 obj) throws Exception {
			checkSubBalanceInformation14(obj);
		}
	};

	/**
	 * If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability
	 * cannot be used.
	 */
	public static void checkSubBalanceInformation15(SubBalanceInformation15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Subbalance type is AvailableWithNoStatus, then QuantityAndAvailability
	 * cannot be used.
	 */
	public static void checkSubBalanceInformation14(SubBalanceInformation14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}