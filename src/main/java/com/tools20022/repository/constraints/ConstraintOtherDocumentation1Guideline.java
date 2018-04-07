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
import com.tools20022.repository.msg.PowerOfAttorneyRequirements3;

/**
 * If PowerOfAttorney specific deadlines are announced, it is recommended that
 * OtherDocumentation be used.
 */
public class ConstraintOtherDocumentation1Guideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PowerOfAttorneyRequirements3
	 * PowerOfAttorneyRequirements3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherDocumentation1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PowerOfAttorney specific deadlines are announced, it is recommended that OtherDocumentation be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PowerOfAttorneyRequirements3> forPowerOfAttorneyRequirements3 = new MMConstraint<PowerOfAttorneyRequirements3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherDocumentation1Guideline";
			definition = "If PowerOfAttorney specific deadlines are announced, it is recommended that OtherDocumentation be used.";
			owner_lazy = () -> PowerOfAttorneyRequirements3.mmObject();
		}

		@Override
		public void executeValidator(PowerOfAttorneyRequirements3 obj) throws Exception {
			checkPowerOfAttorneyRequirements3(obj);
		}
	};

	/**
	 * If PowerOfAttorney specific deadlines are announced, it is recommended
	 * that OtherDocumentation be used.
	 */
	public static void checkPowerOfAttorneyRequirements3(PowerOfAttorneyRequirements3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}