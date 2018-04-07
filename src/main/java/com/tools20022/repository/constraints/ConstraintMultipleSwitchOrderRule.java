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
import com.tools20022.repository.area.setr.SwitchOrderV04;

/**
 * If SwitchOrderDetails is present more than once, then
 * SwitchOrderDetails/RedemptionLegDetails and
 * SwitchOrderDetails/SubscriptionLegDetails must only be present once.
 */
public class ConstraintMultipleSwitchOrderRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV04
	 * SwitchOrderV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleSwitchOrderRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SwitchOrderDetails is present more than once, then SwitchOrderDetails/RedemptionLegDetails and SwitchOrderDetails/SubscriptionLegDetails must only be present once."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderV04> for_setr_SwitchOrderV04 = new MMConstraint<SwitchOrderV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleSwitchOrderRule";
			definition = "If SwitchOrderDetails is present more than once, then SwitchOrderDetails/RedemptionLegDetails and SwitchOrderDetails/SubscriptionLegDetails must only be present once.";
			owner_lazy = () -> SwitchOrderV04.mmObject();
		}

		@Override
		public void executeValidator(SwitchOrderV04 obj) throws Exception {
			check_setr_SwitchOrderV04(obj);
		}
	};

	/**
	 * If SwitchOrderDetails is present more than once, then
	 * SwitchOrderDetails/RedemptionLegDetails and
	 * SwitchOrderDetails/SubscriptionLegDetails must only be present once.
	 */
	public static void check_setr_SwitchOrderV04(SwitchOrderV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}