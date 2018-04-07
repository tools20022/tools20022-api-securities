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
import com.tools20022.repository.msg.PriceInformation12;
import com.tools20022.repository.msg.PriceInformation18;
import com.tools20022.repository.msg.PriceInformation2;

/**
 * If TypeOfPriceCode is not MRKT, then Value may not be expressed with
 * UnknownIndicator.
 */
public class ConstraintValueRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation12
	 * PriceInformation12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TypeOfPriceCode is not MRKT, then Value\t may not be expressed with UnknownIndicator."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceInformation12> forPriceInformation12 = new MMConstraint<PriceInformation12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueRule";
			definition = "If TypeOfPriceCode is not MRKT, then Value\t may not be expressed with UnknownIndicator.";
			owner_lazy = () -> PriceInformation12.mmObject();
		}

		@Override
		public void executeValidator(PriceInformation12 obj) throws Exception {
			checkPriceInformation12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation2
	 * PriceInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type is not MRKT, then Value may not be expressed with UnknownIndicator."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceInformation2> forPriceInformation2 = new MMConstraint<PriceInformation2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueRule";
			definition = "If Type is not MRKT, then Value may not be expressed with UnknownIndicator.";
			owner_lazy = () -> PriceInformation2.mmObject();
		}

		@Override
		public void executeValidator(PriceInformation2 obj) throws Exception {
			checkPriceInformation2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation18
	 * PriceInformation18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TypeOfPriceCode is not MRKT, then Value\t may not be expressed with UnknownIndicator."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceInformation18> forPriceInformation18 = new MMConstraint<PriceInformation18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueRule";
			definition = "If TypeOfPriceCode is not MRKT, then Value\t may not be expressed with UnknownIndicator.";
			owner_lazy = () -> PriceInformation18.mmObject();
		}

		@Override
		public void executeValidator(PriceInformation18 obj) throws Exception {
			checkPriceInformation18(obj);
		}
	};

	/**
	 * If TypeOfPriceCode is not MRKT, then Value may not be expressed with
	 * UnknownIndicator.
	 */
	public static void checkPriceInformation12(PriceInformation12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Type is not MRKT, then Value may not be expressed with
	 * UnknownIndicator.
	 */
	public static void checkPriceInformation2(PriceInformation2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TypeOfPriceCode is not MRKT, then Value may not be expressed with
	 * UnknownIndicator.
	 */
	public static void checkPriceInformation18(PriceInformation18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}