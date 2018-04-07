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
import com.tools20022.repository.choice.RateStatus3Choice;

/**
 * The code value ACTU is the default value for a rate status.
 */
public class ConstraintRateStatusGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RateStatus3Choice
	 * RateStatus3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateStatusGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The code value ACTU is the default value for a rate status."</li>
	 * </ul>
	 */
	public static final MMConstraint<RateStatus3Choice> forRateStatus3Choice = new MMConstraint<RateStatus3Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateStatusGuideline";
			definition = "The code value ACTU is the default value for a rate status.";
			owner_lazy = () -> RateStatus3Choice.mmObject();
		}

		@Override
		public void executeValidator(RateStatus3Choice obj) throws Exception {
			checkRateStatus3Choice(obj);
		}
	};

	/**
	 * The code value ACTU is the default value for a rate status.
	 */
	public static void checkRateStatus3Choice(RateStatus3Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}