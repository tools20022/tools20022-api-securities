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
import com.tools20022.repository.msg.*;

/**
 * Unless bilaterally agreed between the account owner and servicer, if
 * DenominationChoice is used, it must not contain information that can be
 * provided in a structured field.
 */
public class ConstraintDenominationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount68
	 * QuantityAndAccount68}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount68> forQuantityAndAccount68 = new MMConstraint<QuantityAndAccount68>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount68.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount68 obj) throws Exception {
			checkQuantityAndAccount68(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount64
	 * QuantityAndAccount64}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount64> forQuantityAndAccount64 = new MMConstraint<QuantityAndAccount64>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount64.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount64 obj) throws Exception {
			checkQuantityAndAccount64(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount67
	 * QuantityAndAccount67}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount67> forQuantityAndAccount67 = new MMConstraint<QuantityAndAccount67>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount67.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount67 obj) throws Exception {
			checkQuantityAndAccount67(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount63
	 * QuantityAndAccount63}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount63> forQuantityAndAccount63 = new MMConstraint<QuantityAndAccount63>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount63.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount63 obj) throws Exception {
			checkQuantityAndAccount63(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount66
	 * QuantityAndAccount66}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount66> forQuantityAndAccount66 = new MMConstraint<QuantityAndAccount66>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount66.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount66 obj) throws Exception {
			checkQuantityAndAccount66(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount65
	 * QuantityAndAccount65}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount65> forQuantityAndAccount65 = new MMConstraint<QuantityAndAccount65>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationRule";
			definition = "Unless bilaterally agreed between the account owner and servicer, if DenominationChoice is used, it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> QuantityAndAccount65.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount65 obj) throws Exception {
			checkQuantityAndAccount65(obj);
		}
	};

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount68(QuantityAndAccount68 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount64(QuantityAndAccount64 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount67(QuantityAndAccount67 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount63(QuantityAndAccount63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount66(QuantityAndAccount66 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the account owner and servicer, if
	 * DenominationChoice is used, it must not contain information that can be
	 * provided in a structured field.
	 */
	public static void checkQuantityAndAccount65(QuantityAndAccount65 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}