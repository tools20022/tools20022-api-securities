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
import com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV08;

/**
 * If the transaction is a reverse repo and no standing settlement instruction
 * applies, then DeliveringDepository and Party1 must be present.
 */
public class ConstraintDeliveringDepositoryAndParty1Part1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV08
	 * SecuritiesFinancingInstructionV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DeliveringSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DeliveringSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionTypeAndAdditionalParameters/SecuritiesFinancingTransactionType&lt;/leftOperand&gt;&lt;rightOperand&gt;ReverseRepo&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringDepositoryAndParty1Part1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the transaction is a reverse repo and no standing settlement instruction applies, then DeliveringDepository and Party1 must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV08> for_sese_SecuritiesFinancingInstructionV08 = new MMConstraint<SecuritiesFinancingInstructionV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringDepositoryAndParty1Part1Rule";
			definition = "If the transaction is a reverse repo and no standing settlement instruction applies, then DeliveringDepository and Party1 must be present.";
			owner_lazy = () -> SecuritiesFinancingInstructionV08.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DeliveringSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/DeliveringSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionTypeAndAdditionalParameters/SecuritiesFinancingTransactionType</leftOperand><rightOperand>ReverseRepo</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesFinancingInstructionV08 obj) throws Exception {
			check_sese_SecuritiesFinancingInstructionV08(obj);
		}
	};

	/**
	 * If the transaction is a reverse repo and no standing settlement
	 * instruction applies, then DeliveringDepository and Party1 must be
	 * present.
	 */
	public static void check_sese_SecuritiesFinancingInstructionV08(SecuritiesFinancingInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}