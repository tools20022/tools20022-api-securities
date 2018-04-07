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
import com.tools20022.repository.msg.CorporateActionOption138;
import com.tools20022.repository.msg.CorporateActionOption139;

/**
 * If OptionType/Code is OTHR (Other), then
 * AdditionalInformation/AdditionalText/AdditionalInformation must be present.<br>
 * (MT564 NVR C5).
 */
public class ConstraintAdditionalTextRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139
	 * CorporateActionOption139}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR (Other), then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption139> forCorporateActionOption139 = new MMConstraint<CorporateActionOption139>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR (Other), then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			owner_lazy = () -> CorporateActionOption139.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption139 obj) throws Exception {
			checkCorporateActionOption139(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138
	 * CorporateActionOption138}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/AdditionalText/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Other&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTextRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is OTHR (Other), then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption138> forCorporateActionOption138 = new MMConstraint<CorporateActionOption138>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTextRule";
			definition = "If OptionType/Code is OTHR (Other), then AdditionalInformation/AdditionalText/AdditionalInformation must be present.\r\n(MT564 NVR C5).";
			owner_lazy = () -> CorporateActionOption138.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/AdditionalText/AdditionalInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>Other</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionOption138 obj) throws Exception {
			checkCorporateActionOption138(obj);
		}
	};

	/**
	 * If OptionType/Code is OTHR (Other), then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption139(CorporateActionOption139 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is OTHR (Other), then
	 * AdditionalInformation/AdditionalText/AdditionalInformation must be
	 * present.<br>
	 * (MT564 NVR C5).
	 */
	public static void checkCorporateActionOption138(CorporateActionOption138 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}