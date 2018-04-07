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
import com.tools20022.repository.msg.ClosingBalance3;
import com.tools20022.repository.msg.OpeningBalance3;

/**
 * If Shortlong is absent, then the default is long, that is, balance is
 * positive.
 */
public class ConstraintShortLongDefaultRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OpeningBalance3
	 * OpeningBalance3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLongDefaultRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Shortlong is absent, then the default is long, that is, balance is positive."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OpeningBalance3> forOpeningBalance3 = new MMConstraint<OpeningBalance3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLongDefaultRule";
			definition = "If Shortlong is absent, then the default is long, that is, balance is positive.";
			owner_lazy = () -> OpeningBalance3.mmObject();
		}

		@Override
		public void executeValidator(OpeningBalance3 obj) throws Exception {
			checkOpeningBalance3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ClosingBalance3
	 * ClosingBalance3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLongDefaultRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Shortlong is absent, then the default is long, that is, balance is positive."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ClosingBalance3> forClosingBalance3 = new MMConstraint<ClosingBalance3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLongDefaultRule";
			definition = "If Shortlong is absent, then the default is long, that is, balance is positive.";
			owner_lazy = () -> ClosingBalance3.mmObject();
		}

		@Override
		public void executeValidator(ClosingBalance3 obj) throws Exception {
			checkClosingBalance3(obj);
		}
	};

	/**
	 * If Shortlong is absent, then the default is long, that is, balance is
	 * positive.
	 */
	public static void checkOpeningBalance3(OpeningBalance3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Shortlong is absent, then the default is long, that is, balance is
	 * positive.
	 */
	public static void checkClosingBalance3(ClosingBalance3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}