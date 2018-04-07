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
import com.tools20022.repository.msg.Linkages37;
import com.tools20022.repository.msg.Linkages38;

/**
 * If linked quantity for partial pair-off and turned quantity for partial turns
 * is used, then its usage must be pre-agreed between the message account owner
 * and account servicer.
 */
public class ConstraintLinkedQuantityRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Linkages37 Linkages37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If linked quantity for partial pair-off and turned quantity for partial turns is used, then its usage must be pre-agreed between the message account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Linkages37> forLinkages37 = new MMConstraint<Linkages37>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedQuantityRule";
			definition = "If linked quantity for partial pair-off and turned quantity for partial turns is used, then its usage must be pre-agreed between the message account owner and account servicer.";
			owner_lazy = () -> Linkages37.mmObject();
		}

		@Override
		public void executeValidator(Linkages37 obj) throws Exception {
			checkLinkages37(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Linkages38 Linkages38}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If linked quantity for partial pair-off and turned quantity for partial turns is used, then its usage must be pre-agreed between the message account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Linkages38> forLinkages38 = new MMConstraint<Linkages38>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedQuantityRule";
			definition = "If linked quantity for partial pair-off and turned quantity for partial turns is used, then its usage must be pre-agreed between the message account owner and account servicer.";
			owner_lazy = () -> Linkages38.mmObject();
		}

		@Override
		public void executeValidator(Linkages38 obj) throws Exception {
			checkLinkages38(obj);
		}
	};

	/**
	 * If linked quantity for partial pair-off and turned quantity for partial
	 * turns is used, then its usage must be pre-agreed between the message
	 * account owner and account servicer.
	 */
	public static void checkLinkages37(Linkages37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If linked quantity for partial pair-off and turned quantity for partial
	 * turns is used, then its usage must be pre-agreed between the message
	 * account owner and account servicer.
	 */
	public static void checkLinkages38(Linkages38 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}