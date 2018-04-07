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
import com.tools20022.repository.area.seev.MeetingNotificationV05;

/**
 * If all of the vote instructions types are to be the same for all resolutions,
 * it is recommended to use only the element Vote/VoteInstructionType. If the
 * vote instruction types are not going to be the same for each resolution,
 * then, it is recommended to use only the element
 * Resolution/VoteInstructionType in each occurrence of Resolution.
 */
public class ConstraintVoteInstructionType1Guideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05
	 * MeetingNotificationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteInstructionType1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If all of the vote instructions types are to be the same for all resolutions, it is recommended to use only the element Vote/VoteInstructionType. If the vote instruction types are not going to be the same for each resolution, then, it is recommended to use only the element Resolution/VoteInstructionType in each occurrence of Resolution."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MeetingNotificationV05> for_seev_MeetingNotificationV05 = new MMConstraint<MeetingNotificationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteInstructionType1Guideline";
			definition = "If all of the vote instructions types are to be the same for all resolutions, it is recommended to use only the element Vote/VoteInstructionType. If the vote instruction types are not going to be the same for each resolution, then, it is recommended to use only the element Resolution/VoteInstructionType in each occurrence of Resolution.";
			owner_lazy = () -> MeetingNotificationV05.mmObject();
		}

		@Override
		public void executeValidator(MeetingNotificationV05 obj) throws Exception {
			check_seev_MeetingNotificationV05(obj);
		}
	};

	/**
	 * If all of the vote instructions types are to be the same for all
	 * resolutions, it is recommended to use only the element
	 * Vote/VoteInstructionType. If the vote instruction types are not going to
	 * be the same for each resolution, then, it is recommended to use only the
	 * element Resolution/VoteInstructionType in each occurrence of Resolution.
	 */
	public static void check_seev_MeetingNotificationV05(MeetingNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}