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
import com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09;
import com.tools20022.repository.area.seev.CorporateActionNotificationV08;

/**
 * If AccountDetails/ForAllAccounts/IdentificationCode value is GENR (General)
 * then AmountDetails must not be present in any occurrences of
 * CorporateActionOptionDetails/CashMovementDetails.<br>
 * (MT564 Rule C2 - part 2).
 */
public class ConstraintSafekeepingAccount2Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08
	 * CorporateActionNotificationV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/CashMovementDetails[*]/AmountDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts/IdentificationCode&lt;/leftOperand&gt;&lt;rightOperand&gt;General&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR (General) then AmountDetails must not be present in any occurrences of CorporateActionOptionDetails/CashMovementDetails.\r\n(MT564 Rule C2 - part 2)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV08> for_seev_CorporateActionNotificationV08 = new MMConstraint<CorporateActionNotificationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount2Rule";
			definition = "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR (General) then AmountDetails must not be present in any occurrences of CorporateActionOptionDetails/CashMovementDetails.\r\n(MT564 Rule C2 - part 2).";
			owner_lazy = () -> CorporateActionNotificationV08.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/CashMovementDetails[*]/AmountDetails</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountDetails/ForAllAccounts</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountDetails/ForAllAccounts/IdentificationCode</leftOperand><rightOperand>General</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionNotificationV08 obj) throws Exception {
			check_seev_CorporateActionNotificationV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09
	 * CorporateActionMovementPreliminaryAdviceV09}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/CashMovementDetails[*]/AmountDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts/IdentificationCode&lt;/leftOperand&gt;&lt;rightOperand&gt;General&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR (General), then AmountDetails must not be present in any occurrences of CorporateActionMovementDetails/CashMovementDetails.\r\n(MT564 Rule C2 - part 2)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV09> for_seev_CorporateActionMovementPreliminaryAdviceV09 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount2Rule";
			definition = "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR (General), then AmountDetails must not be present in any occurrences of CorporateActionMovementDetails/CashMovementDetails.\r\n(MT564 Rule C2 - part 2).";
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV09.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/CashMovementDetails[*]/AmountDetails</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountDetails/ForAllAccounts</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountDetails/ForAllAccounts/IdentificationCode</leftOperand><rightOperand>General</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceV09 obj) throws Exception {
			check_seev_CorporateActionMovementPreliminaryAdviceV09(obj);
		}
	};

	/**
	 * If AccountDetails/ForAllAccounts/IdentificationCode value is GENR
	 * (General) then AmountDetails must not be present in any occurrences of
	 * CorporateActionOptionDetails/CashMovementDetails.<br>
	 * (MT564 Rule C2 - part 2).
	 */
	public static void check_seev_CorporateActionNotificationV08(CorporateActionNotificationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccountDetails/ForAllAccounts/IdentificationCode value is GENR
	 * (General), then AmountDetails must not be present in any occurrences of
	 * CorporateActionMovementDetails/CashMovementDetails.<br>
	 * (MT564 Rule C2 - part 2).
	 */
	public static void check_seev_CorporateActionMovementPreliminaryAdviceV09(CorporateActionMovementPreliminaryAdviceV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}