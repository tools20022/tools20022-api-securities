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
import com.tools20022.repository.msg.SecuritiesTradeDetails71;

/**
 * Unless bilaterally agreed between the Sender and Receiver, if
 * AllegementStatus is present, then the statement must be a delta statement
 * (UpdateType: Delta). In a complete statement (UpdateType: Complete), a
 * removed or cancelled allegement must not be reported.
 */
public class ConstraintAllegementStatusRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71
	 * SecuritiesTradeDetails71}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllegementStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if AllegementStatus is present, then the statement must be a delta statement (UpdateType: Delta). In a complete statement (UpdateType: Complete), a removed or cancelled allegement must not be reported."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails71> forSecuritiesTradeDetails71 = new MMConstraint<SecuritiesTradeDetails71>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllegementStatusRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if AllegementStatus is present, then the statement must be a delta statement (UpdateType: Delta). In a complete statement (UpdateType: Complete), a removed or cancelled allegement must not be reported.";
			owner_lazy = () -> SecuritiesTradeDetails71.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails71 obj) throws Exception {
			checkSecuritiesTradeDetails71(obj);
		}
	};

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * AllegementStatus is present, then the statement must be a delta statement
	 * (UpdateType: Delta). In a complete statement (UpdateType: Complete), a
	 * removed or cancelled allegement must not be reported.
	 */
	public static void checkSecuritiesTradeDetails71(SecuritiesTradeDetails71 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}