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
import com.tools20022.repository.msg.MessageAndBusinessReference11;

/**
 * If Reference/PreviousReference/MessageName is present, it must start with
 * sese.001, sese.002, sese.005, sese.006, sese.012 or sese.014.
 */
public class ConstraintPreviousReferenceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference11
	 * MessageAndBusinessReference11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Reference/PreviousReference/MessageName is present, it must start with sese.001, sese.002, sese.005, sese.006, sese.012 or sese.014."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MessageAndBusinessReference11> forMessageAndBusinessReference11 = new MMConstraint<MessageAndBusinessReference11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReferenceRule";
			definition = "If Reference/PreviousReference/MessageName is present, it must start with sese.001, sese.002, sese.005, sese.006, sese.012 or sese.014.";
			owner_lazy = () -> MessageAndBusinessReference11.mmObject();
		}

		@Override
		public void executeValidator(MessageAndBusinessReference11 obj) throws Exception {
			checkMessageAndBusinessReference11(obj);
		}
	};

	/**
	 * If Reference/PreviousReference/MessageName is present, it must start with
	 * sese.001, sese.002, sese.005, sese.006, sese.012 or sese.014.
	 */
	public static void checkMessageAndBusinessReference11(MessageAndBusinessReference11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}