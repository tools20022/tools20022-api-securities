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
import com.tools20022.repository.msg.DetailedInstructionStatus10;
import com.tools20022.repository.msg.EligiblePosition5;
import com.tools20022.repository.msg.EligiblePosition6;
import com.tools20022.repository.msg.SafekeepingAccount6;

/**
 * It is recommended that RightsHolder can only be repetitive in the case of
 * joint ownership.
 */
public class ConstraintRightsHolderMultiplicty1Guideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition5
	 * EligiblePosition5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsHolderMultiplicty1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that RightsHolder can only be repetitive in the case of joint ownership."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<EligiblePosition5> forEligiblePosition5 = new MMConstraint<EligiblePosition5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsHolderMultiplicty1Guideline";
			definition = "It is recommended that RightsHolder can only be repetitive in the case of joint ownership.";
			owner_lazy = () -> EligiblePosition5.mmObject();
		}

		@Override
		public void executeValidator(EligiblePosition5 obj) throws Exception {
			checkEligiblePosition5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition6
	 * EligiblePosition6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsHolderMultiplicty1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that RightsHolder can only be repetitive in the case of joint ownership."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<EligiblePosition6> forEligiblePosition6 = new MMConstraint<EligiblePosition6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsHolderMultiplicty1Guideline";
			definition = "It is recommended that RightsHolder can only be repetitive in the case of joint ownership.";
			owner_lazy = () -> EligiblePosition6.mmObject();
		}

		@Override
		public void executeValidator(EligiblePosition6 obj) throws Exception {
			checkEligiblePosition6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus10
	 * DetailedInstructionStatus10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsHolderMultiplicty1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that RightsHolder can only be repetitive in the case of joint ownership."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DetailedInstructionStatus10> forDetailedInstructionStatus10 = new MMConstraint<DetailedInstructionStatus10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsHolderMultiplicty1Guideline";
			definition = "It is recommended that RightsHolder can only be repetitive in the case of joint ownership.";
			owner_lazy = () -> DetailedInstructionStatus10.mmObject();
		}

		@Override
		public void executeValidator(DetailedInstructionStatus10 obj) throws Exception {
			checkDetailedInstructionStatus10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount6
	 * SafekeepingAccount6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsHolderMultiplicty1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that RightsHolder can only be repetitive in case of joint ownership."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SafekeepingAccount6> forSafekeepingAccount6 = new MMConstraint<SafekeepingAccount6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsHolderMultiplicty1Guideline";
			definition = "It is recommended that RightsHolder can only be repetitive in case of joint ownership.";
			owner_lazy = () -> SafekeepingAccount6.mmObject();
		}

		@Override
		public void executeValidator(SafekeepingAccount6 obj) throws Exception {
			checkSafekeepingAccount6(obj);
		}
	};

	/**
	 * It is recommended that RightsHolder can only be repetitive in the case of
	 * joint ownership.
	 */
	public static void checkEligiblePosition5(EligiblePosition5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that RightsHolder can only be repetitive in the case of
	 * joint ownership.
	 */
	public static void checkEligiblePosition6(EligiblePosition6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that RightsHolder can only be repetitive in the case of
	 * joint ownership.
	 */
	public static void checkDetailedInstructionStatus10(DetailedInstructionStatus10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that RightsHolder can only be repetitive in case of
	 * joint ownership.
	 */
	public static void checkSafekeepingAccount6(SafekeepingAccount6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}