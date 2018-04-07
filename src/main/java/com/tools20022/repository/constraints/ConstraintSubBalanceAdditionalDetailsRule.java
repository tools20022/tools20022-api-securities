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
import com.tools20022.repository.msg.AdditionalBalanceInformation14;
import com.tools20022.repository.msg.AdditionalBalanceInformation15;
import com.tools20022.repository.msg.SubBalanceInformation14;
import com.tools20022.repository.msg.SubBalanceInformation15;

/**
 * Unless bilaterally agreed between the Sender and Receiver, if
 * SubBalanceAdditionnalDetails is used, them it must not contain information
 * that can be provided in a structured field.
 */
public class ConstraintSubBalanceAdditionalDetailsRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation15
	 * SubBalanceInformation15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation15> forSubBalanceInformation15 = new MMConstraint<SubBalanceInformation15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SubBalanceInformation15.mmObject();
		}

		@Override
		public void executeValidator(SubBalanceInformation15 obj) throws Exception {
			checkSubBalanceInformation15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation14
	 * SubBalanceInformation14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation14> forSubBalanceInformation14 = new MMConstraint<SubBalanceInformation14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SubBalanceInformation14.mmObject();
		}

		@Override
		public void executeValidator(SubBalanceInformation14 obj) throws Exception {
			checkSubBalanceInformation14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation14
	 * AdditionalBalanceInformation14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalBalanceInformation14> forAdditionalBalanceInformation14 = new MMConstraint<AdditionalBalanceInformation14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AdditionalBalanceInformation14.mmObject();
		}

		@Override
		public void executeValidator(AdditionalBalanceInformation14 obj) throws Exception {
			checkAdditionalBalanceInformation14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation15
	 * AdditionalBalanceInformation15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalBalanceInformation15> forAdditionalBalanceInformation15 = new MMConstraint<AdditionalBalanceInformation15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if SubBalanceAdditionnalDetails is used, them it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> AdditionalBalanceInformation15.mmObject();
		}

		@Override
		public void executeValidator(AdditionalBalanceInformation15 obj) throws Exception {
			checkAdditionalBalanceInformation15(obj);
		}
	};

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is used, them it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkSubBalanceInformation15(SubBalanceInformation15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is used, them it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkSubBalanceInformation14(SubBalanceInformation14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is used, them it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAdditionalBalanceInformation14(AdditionalBalanceInformation14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * SubBalanceAdditionnalDetails is used, them it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkAdditionalBalanceInformation15(AdditionalBalanceInformation15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}