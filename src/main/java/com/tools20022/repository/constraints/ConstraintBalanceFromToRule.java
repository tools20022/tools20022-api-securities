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
import com.tools20022.repository.msg.IntraPositionDetails33;
import com.tools20022.repository.msg.IntraPositionDetails46;

/**
 * The SecuritiesBalanceType of BalanceFrom must be different from the
 * SecuritiesBalanceType of BalanceTo.
 */
public class ConstraintBalanceFromToRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46
	 * IntraPositionDetails46}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/BalanceFrom/Type/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceTo/Type/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Type/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceTo/Type/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails46> forIntraPositionDetails46 = new MMConstraint<IntraPositionDetails46>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			owner_lazy = () -> IntraPositionDetails46.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/BalanceFrom/Type/Code</leftOperand><rightOperand>/BalanceTo/Type/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Type/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceTo/Type/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\r\n";
		}

		@Override
		public void executeValidator(IntraPositionDetails46 obj) throws Exception {
			checkIntraPositionDetails46(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails33
	 * IntraPositionDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromNode\"&gt;&lt;leftOperand&gt;/BalanceFrom/Type/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;/BalanceTo/Type/Code&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceFrom/Type/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/BalanceTo/Type/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFromToRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails33> forIntraPositionDetails33 = new MMConstraint<IntraPositionDetails33>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFromToRule";
			definition = "The SecuritiesBalanceType of BalanceFrom must be different from the SecuritiesBalanceType of BalanceTo.";
			owner_lazy = () -> IntraPositionDetails33.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromNode\"><leftOperand>/BalanceFrom/Type/Code</leftOperand><rightOperand>/BalanceTo/Type/Code</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceFrom/Type/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/BalanceTo/Type/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\r\n";
		}

		@Override
		public void executeValidator(IntraPositionDetails33 obj) throws Exception {
			checkIntraPositionDetails33(obj);
		}
	};

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails46(IntraPositionDetails46 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesBalanceType of BalanceFrom must be different from the
	 * SecuritiesBalanceType of BalanceTo.
	 */
	public static void checkIntraPositionDetails33(IntraPositionDetails33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}