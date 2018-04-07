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
import com.tools20022.repository.msg.OtherParties18;
import com.tools20022.repository.msg.OtherParties27;

/**
 * If Qualified Foreign Intermediary is used, then the instruction must be a
 * delivery.
 */
public class ConstraintQualifiedForeignIntermediaryRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties18 OtherParties18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QualifiedForeignIntermediaryRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Qualified Foreign Intermediary is used, then the instruction must be a delivery."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties18> forOtherParties18 = new MMConstraint<OtherParties18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QualifiedForeignIntermediaryRule";
			definition = "If Qualified Foreign Intermediary is used, then the instruction must be a delivery.";
			owner_lazy = () -> OtherParties18.mmObject();
		}

		@Override
		public void executeValidator(OtherParties18 obj) throws Exception {
			checkOtherParties18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties27 OtherParties27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QualifiedForeignIntermediaryRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Qualified Foreign Intermediary is used, then the instruction must be a delivery."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties27> forOtherParties27 = new MMConstraint<OtherParties27>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QualifiedForeignIntermediaryRule";
			definition = "If Qualified Foreign Intermediary is used, then the instruction must be a delivery.";
			owner_lazy = () -> OtherParties27.mmObject();
		}

		@Override
		public void executeValidator(OtherParties27 obj) throws Exception {
			checkOtherParties27(obj);
		}
	};

	/**
	 * If Qualified Foreign Intermediary is used, then the instruction must be a
	 * delivery.
	 */
	public static void checkOtherParties18(OtherParties18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Qualified Foreign Intermediary is used, then the instruction must be a
	 * delivery.
	 */
	public static void checkOtherParties27(OtherParties27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}