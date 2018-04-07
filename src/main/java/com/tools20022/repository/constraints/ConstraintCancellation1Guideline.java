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
import com.tools20022.repository.area.seev.MeetingCancellationV05;

/**
 * It is recommended to cancel a meeting by using
 * MeetingReference/MeetingIdentification and Reason only. It is recommended to
 * avoid the repetition of optional building blocks or components.
 */
public class ConstraintCancellation1Guideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV05
	 * MeetingCancellationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellation1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended to cancel a meeting by using MeetingReference/MeetingIdentification and Reason only. It is recommended to avoid the repetition of optional building blocks or components."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MeetingCancellationV05> for_seev_MeetingCancellationV05 = new MMConstraint<MeetingCancellationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation1Guideline";
			definition = "It is recommended to cancel a meeting by using MeetingReference/MeetingIdentification and Reason only. It is recommended to avoid the repetition of optional building blocks or components.";
			owner_lazy = () -> MeetingCancellationV05.mmObject();
		}

		@Override
		public void executeValidator(MeetingCancellationV05 obj) throws Exception {
			check_seev_MeetingCancellationV05(obj);
		}
	};

	/**
	 * It is recommended to cancel a meeting by using
	 * MeetingReference/MeetingIdentification and Reason only. It is recommended
	 * to avoid the repetition of optional building blocks or components.
	 */
	public static void check_seev_MeetingCancellationV05(MeetingCancellationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}