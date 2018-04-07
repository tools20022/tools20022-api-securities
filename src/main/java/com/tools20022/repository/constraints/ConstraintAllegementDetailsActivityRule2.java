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
import com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV07;

/**
 * If StatementGeneralDetails/ActivityIndicator is TRUE (YES), then at least one
 * occurrence of AllegementDetails must be present.
 */
public class ConstraintAllegementDetailsActivityRule2 {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV07
	 * SecuritiesSettlementTransactionAllegementReportV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AllegementDetails[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllegementDetailsActivityRule2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (YES), then at least one occurrence of AllegementDetails must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementReportV07> for_semt_SecuritiesSettlementTransactionAllegementReportV07 = new MMConstraint<SecuritiesSettlementTransactionAllegementReportV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllegementDetailsActivityRule2";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (YES), then at least one occurrence of AllegementDetails must be present.";
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementReportV07.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AllegementDetails[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionAllegementReportV07 obj) throws Exception {
			check_semt_SecuritiesSettlementTransactionAllegementReportV07(obj);
		}
	};

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (YES), then at least
	 * one occurrence of AllegementDetails must be present.
	 */
	public static void check_semt_SecuritiesSettlementTransactionAllegementReportV07(SecuritiesSettlementTransactionAllegementReportV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}