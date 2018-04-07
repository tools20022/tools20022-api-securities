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
import com.tools20022.repository.area.acmt.AccountOpeningInstructionV07;

/**
 * If InstructionDetails/OpeningType/Code is SUPA (SupplementaryAccountOpening),
 * then InvestmentAccount/Identification must be present and must contain the
 * identification of the main account to which the supplementary account is
 * related.
 */
public class ConstraintInvestmentAccountIdentificationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07
	 * AccountOpeningInstructionV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InstructionDetails/OpeningType/Code is SUPA (SupplementaryAccountOpening), then InvestmentAccount/Identification must be present and must contain the identification of the main account to which the supplementary account is related."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountOpeningInstructionV07> for_acmt_AccountOpeningInstructionV07 = new MMConstraint<AccountOpeningInstructionV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountIdentificationRule";
			definition = "If InstructionDetails/OpeningType/Code is SUPA (SupplementaryAccountOpening), then InvestmentAccount/Identification must be present and must contain the identification of the main account to which the supplementary account is related.";
			owner_lazy = () -> AccountOpeningInstructionV07.mmObject();
		}

		@Override
		public void executeValidator(AccountOpeningInstructionV07 obj) throws Exception {
			check_acmt_AccountOpeningInstructionV07(obj);
		}
	};

	/**
	 * If InstructionDetails/OpeningType/Code is SUPA
	 * (SupplementaryAccountOpening), then InvestmentAccount/Identification must
	 * be present and must contain the identification of the main account to
	 * which the supplementary account is related.
	 */
	public static void check_acmt_AccountOpeningInstructionV07(AccountOpeningInstructionV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}