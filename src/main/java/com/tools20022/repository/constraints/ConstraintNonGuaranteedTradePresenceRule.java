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
import com.tools20022.repository.msg.Clearing4;

/**
 * If GuaranteedTrade Indicator is No then NonGuaranteed trade details must be
 * present.
 */
public class ConstraintNonGuaranteedTradePresenceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Clearing4 Clearing4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/NonGuaranteedTrade&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/GuaranteedTrade&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GuaranteedTrade&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonGuaranteedTradePresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GuaranteedTrade Indicator is No then NonGuaranteed trade details must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Clearing4> forClearing4 = new MMConstraint<Clearing4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonGuaranteedTradePresenceRule";
			definition = "If GuaranteedTrade Indicator is No then NonGuaranteed trade details must be present.";
			owner_lazy = () -> Clearing4.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/NonGuaranteedTrade</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/GuaranteedTrade</leftOperand><rightOperand>false</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/GuaranteedTrade</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(Clearing4 obj) throws Exception {
			checkClearing4(obj);
		}
	};

	/**
	 * If GuaranteedTrade Indicator is No then NonGuaranteed trade details must
	 * be present.
	 */
	public static void checkClearing4(Clearing4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}