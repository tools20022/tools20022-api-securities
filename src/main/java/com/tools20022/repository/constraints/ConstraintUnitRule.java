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
import com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07;
import com.tools20022.repository.area.acmt.AccountModificationInstructionV07;
import com.tools20022.repository.area.acmt.AccountOpeningInstructionV07;

/**
 * If SavingsInvestmentPlan is present, then SavingsInvestmentPlan/Quantity/Unit
 * is not allowed.
 */
public class ConstraintUnitRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07
	 * AccountOpeningInstructionV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SavingsInvestmentPlan[*]/Quantity/Unit&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SavingsInvestmentPlan[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SavingsInvestmentPlan is present, then SavingsInvestmentPlan/Quantity/Unit is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountOpeningInstructionV07> for_acmt_AccountOpeningInstructionV07 = new MMConstraint<AccountOpeningInstructionV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitRule";
			definition = "If SavingsInvestmentPlan is present, then SavingsInvestmentPlan/Quantity/Unit is not allowed.";
			owner_lazy = () -> AccountOpeningInstructionV07.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SavingsInvestmentPlan[*]/Quantity/Unit</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SavingsInvestmentPlan[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(AccountOpeningInstructionV07 obj) throws Exception {
			check_acmt_AccountOpeningInstructionV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07
	 * AccountModificationInstructionV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ModifiedSavingsInvestmentPlan[*]/InvestmentPlan/Quantity/Unit&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ModifiedSavingsInvestmentPlan[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ModifiedSavingsInvestmentPlan is present, then ModifiedSavingsInvestmentPlan/InvestmentPlan/Quantity/Unit is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountModificationInstructionV07> for_acmt_AccountModificationInstructionV07 = new MMConstraint<AccountModificationInstructionV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitRule";
			definition = "If ModifiedSavingsInvestmentPlan is present, then ModifiedSavingsInvestmentPlan/InvestmentPlan/Quantity/Unit is not allowed.";
			owner_lazy = () -> AccountModificationInstructionV07.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ModifiedSavingsInvestmentPlan[*]/InvestmentPlan/Quantity/Unit</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ModifiedSavingsInvestmentPlan[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(AccountModificationInstructionV07 obj) throws Exception {
			check_acmt_AccountModificationInstructionV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07
	 * AccountDetailsConfirmationV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SavingsInvestmentPlan[*]/Quantity/Unit&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SavingsInvestmentPlan[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SavingsInvestmentPlan is present, then SavingsInvestmentPlan/Quantity/Unit is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountDetailsConfirmationV07> for_acmt_AccountDetailsConfirmationV07 = new MMConstraint<AccountDetailsConfirmationV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitRule";
			definition = "If SavingsInvestmentPlan is present, then SavingsInvestmentPlan/Quantity/Unit is not allowed.";
			owner_lazy = () -> AccountDetailsConfirmationV07.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SavingsInvestmentPlan[*]/Quantity/Unit</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SavingsInvestmentPlan[*]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(AccountDetailsConfirmationV07 obj) throws Exception {
			check_acmt_AccountDetailsConfirmationV07(obj);
		}
	};

	/**
	 * If SavingsInvestmentPlan is present, then
	 * SavingsInvestmentPlan/Quantity/Unit is not allowed.
	 */
	public static void check_acmt_AccountOpeningInstructionV07(AccountOpeningInstructionV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ModifiedSavingsInvestmentPlan is present, then
	 * ModifiedSavingsInvestmentPlan/InvestmentPlan/Quantity/Unit is not
	 * allowed.
	 */
	public static void check_acmt_AccountModificationInstructionV07(AccountModificationInstructionV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SavingsInvestmentPlan is present, then
	 * SavingsInvestmentPlan/Quantity/Unit is not allowed.
	 */
	public static void check_acmt_AccountDetailsConfirmationV07(AccountDetailsConfirmationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}