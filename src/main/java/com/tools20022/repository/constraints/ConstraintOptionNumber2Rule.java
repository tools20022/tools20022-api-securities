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
import com.tools20022.repository.msg.CorporateActionOption120;
import com.tools20022.repository.msg.CorporateActionOption142;

/**
 * When the CorporateActionInstruction is unsolicited, ie, the instruction has
 * not been preceded by an Corporate ActionNotification, then OptionNumber/code
 * must be UNSO (unsolicited).
 */
public class ConstraintOptionNumber2Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption120
	 * CorporateActionOption120}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When the CorporateActionInstruction is unsolicited, ie, the instruction has not been preceded by an Corporate ActionNotification, then OptionNumber/code must be UNSO (unsolicited)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption120> forCorporateActionOption120 = new MMConstraint<CorporateActionOption120>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber2Rule";
			definition = "When the CorporateActionInstruction is unsolicited, ie, the instruction has not been preceded by an Corporate ActionNotification, then OptionNumber/code must be UNSO (unsolicited).";
			owner_lazy = () -> CorporateActionOption120.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption120 obj) throws Exception {
			checkCorporateActionOption120(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption142
	 * CorporateActionOption142}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When the CorporateActionInstruction is unsolicited, that is, the instruction has not been preceded by a Corporate ActionNotification, then OptionNumber/code must be UNSO (unsolicited)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption142> forCorporateActionOption142 = new MMConstraint<CorporateActionOption142>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber2Rule";
			definition = "When the CorporateActionInstruction is unsolicited, that is, the instruction has not been preceded by a Corporate ActionNotification, then OptionNumber/code must be UNSO (unsolicited).";
			owner_lazy = () -> CorporateActionOption142.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption142 obj) throws Exception {
			checkCorporateActionOption142(obj);
		}
	};

	/**
	 * When the CorporateActionInstruction is unsolicited, ie, the instruction
	 * has not been preceded by an Corporate ActionNotification, then
	 * OptionNumber/code must be UNSO (unsolicited).
	 */
	public static void checkCorporateActionOption120(CorporateActionOption120 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When the CorporateActionInstruction is unsolicited, that is, the
	 * instruction has not been preceded by a Corporate ActionNotification, then
	 * OptionNumber/code must be UNSO (unsolicited).
	 */
	public static void checkCorporateActionOption142(CorporateActionOption142 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}