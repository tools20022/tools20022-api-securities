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
import com.tools20022.repository.msg.ISAYearsOfIssue4;
import com.tools20022.repository.msg.ISAYearsOfIssue5;
import com.tools20022.repository.msg.ISAYearsOfIssue7;

/**
 * If CurrentYear is not present, then PreviousYears is mandatory. If
 * CurrentYear is present then PreviousYears is optional.
 */
public class ConstraintCurrentYearRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue5
	 * ISAYearsOfIssue5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYearRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CurrentYear is not present, then PreviousYears is mandatory. If CurrentYear is present then PreviousYears is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ISAYearsOfIssue5> forISAYearsOfIssue5 = new MMConstraint<ISAYearsOfIssue5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearRule";
			definition = "If CurrentYear is not present, then PreviousYears is mandatory. If CurrentYear is present then PreviousYears is optional.";
			owner_lazy = () -> ISAYearsOfIssue5.mmObject();
		}

		@Override
		public void executeValidator(ISAYearsOfIssue5 obj) throws Exception {
			checkISAYearsOfIssue5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue7
	 * ISAYearsOfIssue7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYearRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CurrentYear is not present, then PreviousYears is mandatory. If CurrentYear is present then PreviousYears is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ISAYearsOfIssue7> forISAYearsOfIssue7 = new MMConstraint<ISAYearsOfIssue7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearRule";
			definition = "If CurrentYear is not present, then PreviousYears is mandatory. If CurrentYear is present then PreviousYears is optional.";
			owner_lazy = () -> ISAYearsOfIssue7.mmObject();
		}

		@Override
		public void executeValidator(ISAYearsOfIssue7 obj) throws Exception {
			checkISAYearsOfIssue7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue4
	 * ISAYearsOfIssue4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYearRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CurrentYear is not present, then PreviousYears is mandatory. If CurrentYear is present then PreviousYears is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ISAYearsOfIssue4> forISAYearsOfIssue4 = new MMConstraint<ISAYearsOfIssue4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearRule";
			definition = "If CurrentYear is not present, then PreviousYears is mandatory. If CurrentYear is present then PreviousYears is optional.";
			owner_lazy = () -> ISAYearsOfIssue4.mmObject();
		}

		@Override
		public void executeValidator(ISAYearsOfIssue4 obj) throws Exception {
			checkISAYearsOfIssue4(obj);
		}
	};

	/**
	 * If CurrentYear is not present, then PreviousYears is mandatory. If
	 * CurrentYear is present then PreviousYears is optional.
	 */
	public static void checkISAYearsOfIssue5(ISAYearsOfIssue5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CurrentYear is not present, then PreviousYears is mandatory. If
	 * CurrentYear is present then PreviousYears is optional.
	 */
	public static void checkISAYearsOfIssue7(ISAYearsOfIssue7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CurrentYear is not present, then PreviousYears is mandatory. If
	 * CurrentYear is present then PreviousYears is optional.
	 */
	public static void checkISAYearsOfIssue4(ISAYearsOfIssue4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}