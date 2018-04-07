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
import com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV07;
import com.tools20022.repository.area.seev.CorporateActionInstructionV08;

/**
 * ChangeInstructionIndicator may only be used if
 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or
 * '0' (No) in the CorporateActionNotification message previously received and
 * if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or
 * '1' (Yes) in the CorporateActionNotification message previously received.
 */
public class ConstraintChangeInstructionIndicatorGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV08
	 * CorporateActionInstructionV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV08> for_seev_CorporateActionInstructionV08 = new MMConstraint<CorporateActionInstructionV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received.";
			owner_lazy = () -> CorporateActionInstructionV08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionV08 obj) throws Exception {
			check_seev_CorporateActionInstructionV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV07
	 * CorporateActionInstructionCancellationRequestV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestV07> for_seev_CorporateActionInstructionCancellationRequestV07 = new MMConstraint<CorporateActionInstructionCancellationRequestV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicatorGuideline";
			definition = "ChangeInstructionIndicator may only be used if CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to 'false' or '0' (No) in the CorporateActionNotification message previously received and if CorporateActionOptionDetails/ChangeAllowedIndicator was set to 'true' or '1' (Yes) in the CorporateActionNotification message previously received.";
			owner_lazy = () -> CorporateActionInstructionCancellationRequestV07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestV07 obj) throws Exception {
			check_seev_CorporateActionInstructionCancellationRequestV07(obj);
		}
	};

	/**
	 * ChangeInstructionIndicator may only be used if
	 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to
	 * 'false' or '0' (No) in the CorporateActionNotification message previously
	 * received and if CorporateActionOptionDetails/ChangeAllowedIndicator was
	 * set to 'true' or '1' (Yes) in the CorporateActionNotification message
	 * previously received.
	 */
	public static void check_seev_CorporateActionInstructionV08(CorporateActionInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ChangeInstructionIndicator may only be used if
	 * CorporateActionOptionDetails/WithdrawalAllowedIndicator was set to
	 * 'false' or '0' (No) in the CorporateActionNotification message previously
	 * received and if CorporateActionOptionDetails/ChangeAllowedIndicator was
	 * set to 'true' or '1' (Yes) in the CorporateActionNotification message
	 * previously received.
	 */
	public static void check_seev_CorporateActionInstructionCancellationRequestV07(CorporateActionInstructionCancellationRequestV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}