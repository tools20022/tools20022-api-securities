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
import com.tools20022.repository.msg.SettlementDetails146;

/**
 * Conditions of use of the codes for the SettlementDetails field must be
 * pre-agreed between account owner and account servicer.
 */
public class ConstraintSettlementDetailsElementsUsageRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146
	 * SettlementDetails146}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsElementsUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conditions of use of the codes for the SettlementDetails field must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails146> forSettlementDetails146 = new MMConstraint<SettlementDetails146>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsElementsUsageRule";
			definition = "Conditions of use of the codes for the SettlementDetails field must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails146.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails146 obj) throws Exception {
			checkSettlementDetails146(obj);
		}
	};

	/**
	 * Conditions of use of the codes for the SettlementDetails field must be
	 * pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails146(SettlementDetails146 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}