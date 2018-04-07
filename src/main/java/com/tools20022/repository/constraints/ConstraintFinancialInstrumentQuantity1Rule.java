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
import com.tools20022.repository.msg.SwitchOrder7;

/**
 * If SubscriptionLegDetails/FinancialInstrumentQuantityChoice is not present,
 * then RedemptionLegDetails/FinancialInstrumentQuantityChoice is mandatory in
 * each occurrence of RedemptionLegDetails.<br>
 * If SubscriptionLegDetails/FinancialInstrumentQuantityChoice is present, then
 * it must be present in each occurrence of SubscriptionLegDetails.
 */
public class ConstraintFinancialInstrumentQuantity1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7 SwitchOrder7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentQuantity1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SubscriptionLegDetails/FinancialInstrumentQuantityChoice is not present, then RedemptionLegDetails/FinancialInstrumentQuantityChoice is mandatory in each occurrence of RedemptionLegDetails.\r\nIf SubscriptionLegDetails/FinancialInstrumentQuantityChoice is present, then it must be present in each occurrence of SubscriptionLegDetails."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrder7> forSwitchOrder7 = new MMConstraint<SwitchOrder7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentQuantity1Rule";
			definition = "If SubscriptionLegDetails/FinancialInstrumentQuantityChoice is not present, then RedemptionLegDetails/FinancialInstrumentQuantityChoice is mandatory in each occurrence of RedemptionLegDetails.\r\nIf SubscriptionLegDetails/FinancialInstrumentQuantityChoice is present, then it must be present in each occurrence of SubscriptionLegDetails.";
			owner_lazy = () -> SwitchOrder7.mmObject();
		}

		@Override
		public void executeValidator(SwitchOrder7 obj) throws Exception {
			checkSwitchOrder7(obj);
		}
	};

	/**
	 * If SubscriptionLegDetails/FinancialInstrumentQuantityChoice is not
	 * present, then RedemptionLegDetails/FinancialInstrumentQuantityChoice is
	 * mandatory in each occurrence of RedemptionLegDetails.<br>
	 * If SubscriptionLegDetails/FinancialInstrumentQuantityChoice is present,
	 * then it must be present in each occurrence of SubscriptionLegDetails.
	 */
	public static void checkSwitchOrder7(SwitchOrder7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}