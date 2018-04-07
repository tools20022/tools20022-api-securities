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
import com.tools20022.repository.msg.ReceivingPartiesAndAccount16;

/**
 * If ReceiversIntermediary1Details is present, then ReceiversCustodianDetails
 * must be present. If ReceiversIntermediary1Details is not present, then
 * ReceiversCustodianDetails is optional.
 */
public class ConstraintReceiversCustodianRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount16
	 * ReceivingPartiesAndAccount16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceiversCustodianDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceiversIntermediary1Details&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversCustodianRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReceiversIntermediary1Details is present, then ReceiversCustodianDetails must be present. If ReceiversIntermediary1Details is not present, then ReceiversCustodianDetails is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceivingPartiesAndAccount16> forReceivingPartiesAndAccount16 = new MMConstraint<ReceivingPartiesAndAccount16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianRule";
			definition = "If ReceiversIntermediary1Details is present, then ReceiversCustodianDetails must be present. If ReceiversIntermediary1Details is not present, then ReceiversCustodianDetails is optional.";
			owner_lazy = () -> ReceivingPartiesAndAccount16.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceiversCustodianDetails</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceiversIntermediary1Details</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(ReceivingPartiesAndAccount16 obj) throws Exception {
			checkReceivingPartiesAndAccount16(obj);
		}
	};

	/**
	 * If ReceiversIntermediary1Details is present, then
	 * ReceiversCustodianDetails must be present. If
	 * ReceiversIntermediary1Details is not present, then
	 * ReceiversCustodianDetails is optional.
	 */
	public static void checkReceivingPartiesAndAccount16(ReceivingPartiesAndAccount16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}