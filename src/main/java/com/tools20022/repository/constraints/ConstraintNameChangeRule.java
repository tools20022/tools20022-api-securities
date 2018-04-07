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
import com.tools20022.repository.area.seev.CorporateActionNotificationV08;

/**
 * If CorporateActionDetails/AdditionalInformation/NewCompanyName/
 * AdditionalInformation is present, then
 * CorporateActionGeneralInformation/EventType/Code value CHAN (Change) must be
 * present and CorporateActionDetails/ChangeType/Code value NAME (Name) must be
 * present in at least one occurrence of CorporateActionDetails/ChangeType.<br>
 * (MT 564 NVR C10).
 */
public class ConstraintNameChangeRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08
	 * CorporateActionNotificationV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameChangeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionDetails/AdditionalInformation/NewCompanyName/AdditionalInformation is present, then CorporateActionGeneralInformation/EventType/Code value CHAN (Change) must be present and CorporateActionDetails/ChangeType/Code value NAME (Name) must be present in at least one occurrence of CorporateActionDetails/ChangeType.\r\n(MT 564 NVR C10)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV08> for_seev_CorporateActionNotificationV08 = new MMConstraint<CorporateActionNotificationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameChangeRule";
			definition = "If CorporateActionDetails/AdditionalInformation/NewCompanyName/AdditionalInformation is present, then CorporateActionGeneralInformation/EventType/Code value CHAN (Change) must be present and CorporateActionDetails/ChangeType/Code value NAME (Name) must be present in at least one occurrence of CorporateActionDetails/ChangeType.\r\n(MT 564 NVR C10).";
			owner_lazy = () -> CorporateActionNotificationV08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotificationV08 obj) throws Exception {
			check_seev_CorporateActionNotificationV08(obj);
		}
	};

	/**
	 * If CorporateActionDetails/AdditionalInformation/NewCompanyName/
	 * AdditionalInformation is present, then
	 * CorporateActionGeneralInformation/EventType/Code value CHAN (Change) must
	 * be present and CorporateActionDetails/ChangeType/Code value NAME (Name)
	 * must be present in at least one occurrence of
	 * CorporateActionDetails/ChangeType.<br>
	 * (MT 564 NVR C10).
	 */
	public static void check_seev_CorporateActionNotificationV08(CorporateActionNotificationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}