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

/**
 * If ConfirmationDetails/ConfirmationType/Code is ACCO (AccountOpening), then
 * InvestmentAccount must be present.
 */
public class ConstraintInvestmentAccountRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07
	 * AccountDetailsConfirmationV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ConfirmationDetails/ConfirmationType/Code is ACCO (AccountOpening), then InvestmentAccount must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountDetailsConfirmationV07> for_acmt_AccountDetailsConfirmationV07 = new MMConstraint<AccountDetailsConfirmationV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountRule";
			definition = "If ConfirmationDetails/ConfirmationType/Code is ACCO (AccountOpening), then InvestmentAccount must be present.";
			owner_lazy = () -> AccountDetailsConfirmationV07.mmObject();
		}

		@Override
		public void executeValidator(AccountDetailsConfirmationV07 obj) throws Exception {
			check_acmt_AccountDetailsConfirmationV07(obj);
		}
	};

	/**
	 * If ConfirmationDetails/ConfirmationType/Code is ACCO (AccountOpening),
	 * then InvestmentAccount must be present.
	 */
	public static void check_acmt_AccountDetailsConfirmationV07(AccountDetailsConfirmationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}