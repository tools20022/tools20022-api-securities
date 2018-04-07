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
 * When an agenda item needs to be linked to a resolution, it is recommended to
 * have the resolution information following directly the agenda item
 * information to which the resolution is linked as illustrated in the following
 * example:
 * 
 * Resolution/IssuerLabel = Agenda item 1 Description = &lt;Item
 * description.&gt; ForInformationOnly = True Type =.
 * 
 * Directly followed by
 * 
 * Resolution/IssuerLabel = Resolution 1 Description = &lt;Resolution
 * description.&gt; ForInformationOnly = False Type =. .
 */
public class ConstraintResolution1Guideline {

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
	 * name} = "Resolution1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When an agenda item needs to be linked to a resolution, it is recommended to have the resolution information following directly the agenda item information to which the resolution is linked as illustrated in the following example: \n\nResolution/IssuerLabel = Agenda item 1\nDescription = &lt;Item description.&gt;\nForInformationOnly = True\nType =.\n\nDirectly followed by\n\nResolution/IssuerLabel = Resolution 1\nDescription = &lt;Resolution description.&gt;\nForInformationOnly = False\nType =.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MeetingNotificationV05> for_seev_MeetingNotificationV05 = new MMConstraint<MeetingNotificationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Resolution1Guideline";
			definition = "When an agenda item needs to be linked to a resolution, it is recommended to have the resolution information following directly the agenda item information to which the resolution is linked as illustrated in the following example: \n\nResolution/IssuerLabel = Agenda item 1\nDescription = <Item description.>\nForInformationOnly = True\nType =.\n\nDirectly followed by\n\nResolution/IssuerLabel = Resolution 1\nDescription = <Resolution description.>\nForInformationOnly = False\nType =.\n.";
			owner_lazy = () -> MeetingNotificationV05.mmObject();
		}

		@Override
		public void executeValidator(MeetingNotificationV05 obj) throws Exception {
			check_seev_MeetingNotificationV05(obj);
		}
	};

	/**
	 * When an agenda item needs to be linked to a resolution, it is recommended
	 * to have the resolution information following directly the agenda item
	 * information to which the resolution is linked as illustrated in the
	 * following example:
	 * 
	 * Resolution/IssuerLabel = Agenda item 1 Description = &lt;Item
	 * description.&gt; ForInformationOnly = True Type =.
	 * 
	 * Directly followed by
	 * 
	 * Resolution/IssuerLabel = Resolution 1 Description = &lt;Resolution
	 * description.&gt; ForInformationOnly = False Type =. .
	 */
	public static void check_seev_MeetingNotificationV05(MeetingNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}