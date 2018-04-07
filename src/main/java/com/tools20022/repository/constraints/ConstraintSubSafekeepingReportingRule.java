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
import com.tools20022.repository.msg.SubAccountIdentification42;
import com.tools20022.repository.msg.SubAccountIdentification43;

/**
 * Use of consolidated reports on a sub-safekeeping accounts must be bilaterally
 * agreed between sender and receiver.
 */
public class ConstraintSubSafekeepingReportingRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification43
	 * SubAccountIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubSafekeepingReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification43> forSubAccountIdentification43 = new MMConstraint<SubAccountIdentification43>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubSafekeepingReportingRule";
			definition = "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver.";
			owner_lazy = () -> SubAccountIdentification43.mmObject();
		}

		@Override
		public void executeValidator(SubAccountIdentification43 obj) throws Exception {
			checkSubAccountIdentification43(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification42
	 * SubAccountIdentification42}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubSafekeepingReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubAccountIdentification42> forSubAccountIdentification42 = new MMConstraint<SubAccountIdentification42>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubSafekeepingReportingRule";
			definition = "Use of consolidated reports on a sub-safekeeping accounts must be bilaterally agreed between sender and receiver.";
			owner_lazy = () -> SubAccountIdentification42.mmObject();
		}

		@Override
		public void executeValidator(SubAccountIdentification42 obj) throws Exception {
			checkSubAccountIdentification42(obj);
		}
	};

	/**
	 * Use of consolidated reports on a sub-safekeeping accounts must be
	 * bilaterally agreed between sender and receiver.
	 */
	public static void checkSubAccountIdentification43(SubAccountIdentification43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Use of consolidated reports on a sub-safekeeping accounts must be
	 * bilaterally agreed between sender and receiver.
	 */
	public static void checkSubAccountIdentification42(SubAccountIdentification42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}