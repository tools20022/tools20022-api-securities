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
import com.tools20022.repository.msg.CorporateActionOption142;

/**
 * If OptionType/Code is SPLI (Split Instruction), then at least one occurrence
 * of AdditionalInformation/InstructionAdditionalInformation must be present.
 */
public class ConstraintInstructionAdditionalInformationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption142
	 * CorporateActionOption142}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/InstructionAdditionalInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;SplitInstruction&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionAdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is SPLI (Split Instruction), then at least one occurrence of AdditionalInformation/InstructionAdditionalInformation must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption142> forCorporateActionOption142 = new MMConstraint<CorporateActionOption142>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionAdditionalInformationRule";
			definition = "If OptionType/Code is SPLI (Split Instruction), then at least one occurrence of AdditionalInformation/InstructionAdditionalInformation must be present.";
			owner_lazy = () -> CorporateActionOption142.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/InstructionAdditionalInformation[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>SplitInstruction</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption142 obj) throws Exception {
			checkCorporateActionOption142(obj);
		}
	};

	/**
	 * If OptionType/Code is SPLI (Split Instruction), then at least one
	 * occurrence of AdditionalInformation/InstructionAdditionalInformation must
	 * be present.
	 */
	public static void checkCorporateActionOption142(CorporateActionOption142 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}