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
import com.tools20022.repository.msg.Statement42;

/**
 * If StatementType is used, then the statement requested must be a
 * SecuritiesBalanceAccountingReport, a SecuritiesBalanceCustodyReport or a
 * SecuritiesTransactionPostingReport.
 */
public class ConstraintStatementTypeRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement42 Statement42}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementType is used, then the statement requested must be a SecuritiesBalanceAccountingReport, a SecuritiesBalanceCustodyReport or a SecuritiesTransactionPostingReport."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement42> forStatement42 = new MMConstraint<Statement42>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementTypeRule";
			definition = "If StatementType is used, then the statement requested must be a SecuritiesBalanceAccountingReport, a SecuritiesBalanceCustodyReport or a SecuritiesTransactionPostingReport.";
			owner_lazy = () -> Statement42.mmObject();
		}

		@Override
		public void executeValidator(Statement42 obj) throws Exception {
			checkStatement42(obj);
		}
	};

	/**
	 * If StatementType is used, then the statement requested must be a
	 * SecuritiesBalanceAccountingReport, a SecuritiesBalanceCustodyReport or a
	 * SecuritiesTransactionPostingReport.
	 */
	public static void checkStatement42(Statement42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}