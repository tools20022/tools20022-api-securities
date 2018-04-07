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
import com.tools20022.repository.msg.BreakdownByUserDefinedParameter3;

/**
 * At least one message element in the list (Party, Country, Currency,
 * UserDefined) must be present. More than one element in the list (Party,
 * Country, Currency, UserDefined) may be present.
 */
public class ConstraintUserDefinedRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter3
	 * BreakdownByUserDefinedParameter3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UserDefinedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one message element in the list (Party, Country, Currency, UserDefined) must be present. More than one element in the list (Party, Country, Currency, UserDefined) may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<BreakdownByUserDefinedParameter3> forBreakdownByUserDefinedParameter3 = new MMConstraint<BreakdownByUserDefinedParameter3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserDefinedRule";
			definition = "At least one message element in the list (Party, Country, Currency, UserDefined) must be present. More than one element in the list (Party, Country, Currency, UserDefined) may be present.";
			owner_lazy = () -> BreakdownByUserDefinedParameter3.mmObject();
		}

		@Override
		public void executeValidator(BreakdownByUserDefinedParameter3 obj) throws Exception {
			checkBreakdownByUserDefinedParameter3(obj);
		}
	};

	/**
	 * At least one message element in the list (Party, Country, Currency,
	 * UserDefined) must be present. More than one element in the list (Party,
	 * Country, Currency, UserDefined) may be present.
	 */
	public static void checkBreakdownByUserDefinedParameter3(BreakdownByUserDefinedParameter3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}