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
import com.tools20022.repository.msg.GlobalDistributionRequest1;

/**
 * At least one occurrence of either CashMovement or SecuritiesMovement must be
 * present. Both may be present.
 */
public class ConstraintMovementRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1
	 * GlobalDistributionRequest1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one occurrence of either CashMovement or SecuritiesMovement must be present. Both may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GlobalDistributionRequest1> forGlobalDistributionRequest1 = new MMConstraint<GlobalDistributionRequest1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MovementRule";
			definition = "At least one occurrence of either CashMovement or SecuritiesMovement must be present. Both may be present.";
			owner_lazy = () -> GlobalDistributionRequest1.mmObject();
		}

		@Override
		public void executeValidator(GlobalDistributionRequest1 obj) throws Exception {
			checkGlobalDistributionRequest1(obj);
		}
	};

	/**
	 * At least one occurrence of either CashMovement or SecuritiesMovement must
	 * be present. Both may be present.
	 */
	public static void checkGlobalDistributionRequest1(GlobalDistributionRequest1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}