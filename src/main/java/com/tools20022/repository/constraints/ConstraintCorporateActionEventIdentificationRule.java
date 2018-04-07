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
 * If the CorporateActionInstruction message is unsolicited (that is, this
 * instruction has not been preceded by an CorporateActionNotification), then,
 * CorporateActionGeneralInformation/CorporateActionEventIdentification must be
 * NONREF.
 */
public class ConstraintCorporateActionEventIdentificationRule {

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
	 * name} = "CorporateActionEventIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the CorporateActionInstruction message is unsolicited (that is, this instruction has not been preceded by an CorporateActionNotification), then, CorporateActionGeneralInformation/CorporateActionEventIdentification must be NONREF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV08> for_seev_CorporateActionInstructionV08 = new MMConstraint<CorporateActionInstructionV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventIdentificationRule";
			definition = "If the CorporateActionInstruction message is unsolicited (that is, this instruction has not been preceded by an CorporateActionNotification), then, CorporateActionGeneralInformation/CorporateActionEventIdentification must be NONREF.";
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
	 * name} = "CorporateActionEventIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the CorporateActionInstruction message was unsolicited (that is, this instruction has not been preceded by a CorporateActionNotification), then, CorporateActionGeneralInformation/CorporateActionEventIdentification must be NONREF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestV07> for_seev_CorporateActionInstructionCancellationRequestV07 = new MMConstraint<CorporateActionInstructionCancellationRequestV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventIdentificationRule";
			definition = "If the CorporateActionInstruction message was unsolicited (that is, this instruction has not been preceded by a CorporateActionNotification), then, CorporateActionGeneralInformation/CorporateActionEventIdentification must be NONREF.";
			owner_lazy = () -> CorporateActionInstructionCancellationRequestV07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestV07 obj) throws Exception {
			check_seev_CorporateActionInstructionCancellationRequestV07(obj);
		}
	};

	/**
	 * If the CorporateActionInstruction message is unsolicited (that is, this
	 * instruction has not been preceded by an CorporateActionNotification),
	 * then,
	 * CorporateActionGeneralInformation/CorporateActionEventIdentification must
	 * be NONREF.
	 */
	public static void check_seev_CorporateActionInstructionV08(CorporateActionInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the CorporateActionInstruction message was unsolicited (that is, this
	 * instruction has not been preceded by a CorporateActionNotification),
	 * then,
	 * CorporateActionGeneralInformation/CorporateActionEventIdentification must
	 * be NONREF.
	 */
	public static void check_seev_CorporateActionInstructionCancellationRequestV07(CorporateActionInstructionCancellationRequestV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}