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
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV08;

/**
 * If SettlementParameters/Registration is present with code YREG (Registration
 * to take place), then additional registration details must be specified in the
 * AdditonalInformation/RegistrationDetails field of the Party (Receiving or
 * DeliveringSettlementParties) under whom the registration must take place,
 * unless this information is already available at the account servicer via
 * standing instruction/SLA.
 */
public class ConstraintRegistrationDetailsRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV08
	 * SecuritiesSettlementTransactionInstructionV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementParameters/Registration is present with code YREG (Registration to take place), then additional registration details must be specified in the AdditonalInformation/RegistrationDetails field of the Party (Receiving or DeliveringSettlementParties) under whom the registration must take place, unless this information is already available at the account servicer via standing instruction/SLA."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV08> for_sese_SecuritiesSettlementTransactionInstructionV08 = new MMConstraint<SecuritiesSettlementTransactionInstructionV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDetailsRule";
			definition = "If SettlementParameters/Registration is present with code YREG (Registration to take place), then additional registration details must be specified in the AdditonalInformation/RegistrationDetails field of the Party (Receiving or DeliveringSettlementParties) under whom the registration must take place, unless this information is already available at the account servicer via standing instruction/SLA.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV08.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstructionV08 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionInstructionV08(obj);
		}
	};

	/**
	 * If SettlementParameters/Registration is present with code YREG
	 * (Registration to take place), then additional registration details must
	 * be specified in the AdditonalInformation/RegistrationDetails field of the
	 * Party (Receiving or DeliveringSettlementParties) under whom the
	 * registration must take place, unless this information is already
	 * available at the account servicer via standing instruction/SLA.
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstructionV08(SecuritiesSettlementTransactionInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}