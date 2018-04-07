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
import com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV07;

/**
 * If StatementGeneralDetails/ActivityIndicator is 'true' or '1' (Yes) then at
 * least one occurrence of
 * AccountAndStatementDetails/CorporateActionEventAndBalance must be present.<br>
 * If StatementGeneralDetails/ActivityIndicator is 'false' or '0' (No) then
 * AccountAndStatementDetails/CorporateActionEventAndBalance must not be present
 * in any occurrences of AccountAndStatementDetails.
 */
public class ConstraintCorporateActionEventAndBalanceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV07
	 * CorporateActionInstructionStatementReportV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventAndBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is 'true' or '1' (Yes) then at least one occurrence of AccountAndStatementDetails/CorporateActionEventAndBalance must be present.\r\nIf StatementGeneralDetails/ActivityIndicator is 'false' or '0' (No) then AccountAndStatementDetails/CorporateActionEventAndBalance must not be present in any occurrences of AccountAndStatementDetails."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatementReportV07> for_seev_CorporateActionInstructionStatementReportV07 = new MMConstraint<CorporateActionInstructionStatementReportV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventAndBalanceRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is 'true' or '1' (Yes) then at least one occurrence of AccountAndStatementDetails/CorporateActionEventAndBalance must be present.\r\nIf StatementGeneralDetails/ActivityIndicator is 'false' or '0' (No) then AccountAndStatementDetails/CorporateActionEventAndBalance must not be present in any occurrences of AccountAndStatementDetails.";
			owner_lazy = () -> CorporateActionInstructionStatementReportV07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionStatementReportV07 obj) throws Exception {
			check_seev_CorporateActionInstructionStatementReportV07(obj);
		}
	};

	/**
	 * If StatementGeneralDetails/ActivityIndicator is 'true' or '1' (Yes) then
	 * at least one occurrence of
	 * AccountAndStatementDetails/CorporateActionEventAndBalance must be
	 * present.<br>
	 * If StatementGeneralDetails/ActivityIndicator is 'false' or '0' (No) then
	 * AccountAndStatementDetails/CorporateActionEventAndBalance must not be
	 * present in any occurrences of AccountAndStatementDetails.
	 */
	public static void check_seev_CorporateActionInstructionStatementReportV07(CorporateActionInstructionStatementReportV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}