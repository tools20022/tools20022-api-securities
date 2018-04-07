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
import com.tools20022.repository.msg.DeliverInformation18;
import com.tools20022.repository.msg.DeliverInformation19;

/**
 * If PhysicalTransferDetails is present, then
 * SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.
 */
public class ConstraintDeliverersIntermediaryDetailsRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation18
	 * DeliverInformation18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation18> forDeliverInformation18 = new MMConstraint<DeliverInformation18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.";
			owner_lazy = () -> DeliverInformation18.mmObject();
		}

		@Override
		public void executeValidator(DeliverInformation18 obj) throws Exception {
			checkDeliverInformation18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation19
	 * DeliverInformation19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation19> forDeliverInformation19 = new MMConstraint<DeliverInformation19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.";
			owner_lazy = () -> DeliverInformation19.mmObject();
		}

		@Override
		public void executeValidator(DeliverInformation19 obj) throws Exception {
			checkDeliverInformation19(obj);
		}
	};

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.
	 */
	public static void checkDeliverInformation18(DeliverInformation18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.
	 */
	public static void checkDeliverInformation19(DeliverInformation19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}