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
import com.tools20022.repository.choice.Status19Choice;

/**
 * If a specific Status is requested, then it must be in line with the statuses
 * available for the message type requested.
 */
public class ConstraintStatusRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Status19Choice
	 * Status19Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If a specific Status is requested, then it must be in line with the statuses available for the message type requested."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Status19Choice> forStatus19Choice = new MMConstraint<Status19Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusRule";
			definition = "If a specific Status is requested, then it must be in line with the statuses available for the message type requested.";
			owner_lazy = () -> Status19Choice.mmObject();
		}

		@Override
		public void executeValidator(Status19Choice obj) throws Exception {
			checkStatus19Choice(obj);
		}
	};

	/**
	 * If a specific Status is requested, then it must be in line with the
	 * statuses available for the message type requested.
	 */
	public static void checkStatus19Choice(Status19Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}