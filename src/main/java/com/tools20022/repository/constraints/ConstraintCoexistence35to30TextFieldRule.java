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
import com.tools20022.repository.msg.GenericIdentification21;
import com.tools20022.repository.msg.SafekeepingPlaceTypeAndText2;

/**
 * During ISO 15022 – 20022 coexistence, Identification must be 30 characters or
 * less. The field must not start or end with a slash ‘/’ or contain two
 * consecutive slashes ‘//’.
 */
public class ConstraintCoexistence35to30TextFieldRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText2
	 * SafekeepingPlaceTypeAndText2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Coexistence35to30TextFieldRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Identification must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SafekeepingPlaceTypeAndText2> forSafekeepingPlaceTypeAndText2 = new MMConstraint<SafekeepingPlaceTypeAndText2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coexistence35to30TextFieldRule";
			definition = "During ISO 15022 – 20022 coexistence, Identification must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> SafekeepingPlaceTypeAndText2.mmObject();
		}

		@Override
		public void executeValidator(SafekeepingPlaceTypeAndText2 obj) throws Exception {
			checkSafekeepingPlaceTypeAndText2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification21
	 * GenericIdentification21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Coexistence35to30TextFieldRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Identification must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two cons\tecutive slashes ‘//’."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GenericIdentification21> forGenericIdentification21 = new MMConstraint<GenericIdentification21>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coexistence35to30TextFieldRule";
			definition = "During ISO 15022 – 20022 coexistence, Identification must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two cons\tecutive slashes ‘//’.";
			owner_lazy = () -> GenericIdentification21.mmObject();
		}

		@Override
		public void executeValidator(GenericIdentification21 obj) throws Exception {
			checkGenericIdentification21(obj);
		}
	};

	/**
	 * During ISO 15022 – 20022 coexistence, Identification must be 30
	 * characters or less. The field must not start or end with a slash ‘/’ or
	 * contain two consecutive slashes ‘//’.
	 */
	public static void checkSafekeepingPlaceTypeAndText2(SafekeepingPlaceTypeAndText2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Identification must be 30
	 * characters or less. The field must not start or end with a slash ‘/’ or
	 * contain two cons ecutive slashes ‘//’.
	 */
	public static void checkGenericIdentification21(GenericIdentification21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}