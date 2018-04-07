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
import com.tools20022.repository.msg.Transfer34;
import com.tools20022.repository.msg.Transfer35;

/**
 * TotalUnitsNumber must be the sum of all occurrences of
 * UnitsDetails/UnitsNumber when UnitsDetails is present.
 */
public class ConstraintTotalUnitsNumberRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer35 Transfer35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber when UnitsDetails is present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer35> forTransfer35 = new MMConstraint<Transfer35>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumberRule";
			definition = "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber when UnitsDetails is present.";
			owner_lazy = () -> Transfer35.mmObject();
		}

		@Override
		public void executeValidator(Transfer35 obj) throws Exception {
			checkTransfer35(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer34 Transfer34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity/TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber when UnitsDetails is present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer34> forTransfer34 = new MMConstraint<Transfer34>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumberRule";
			definition = "Quantity/TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber when UnitsDetails is present.";
			owner_lazy = () -> Transfer34.mmObject();
		}

		@Override
		public void executeValidator(Transfer34 obj) throws Exception {
			checkTransfer34(obj);
		}
	};

	/**
	 * TotalUnitsNumber must be the sum of all occurrences of
	 * UnitsDetails/UnitsNumber when UnitsDetails is present.
	 */
	public static void checkTransfer35(Transfer35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Quantity/TotalUnitsNumber must be the sum of all occurrences of
	 * UnitsDetails/UnitsNumber when UnitsDetails is present.
	 */
	public static void checkTransfer34(Transfer34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}