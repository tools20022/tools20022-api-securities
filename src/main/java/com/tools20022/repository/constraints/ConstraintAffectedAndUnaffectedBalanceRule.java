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
import com.tools20022.repository.msg.CorporateActionBalanceDetails29;
import com.tools20022.repository.msg.CorporateActionBalanceDetails31;

/**
 * Unaffected balance and Affected balances should only be mentioned as a result
 * of the process that was run through the event. For instance lottery results,
 * Dutch auction results or tender offer results.
 */
public class ConstraintAffectedAndUnaffectedBalanceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31
	 * CorporateActionBalanceDetails31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffectedAndUnaffectedBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unaffected balance and Affected balances should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionBalanceDetails31> forCorporateActionBalanceDetails31 = new MMConstraint<CorporateActionBalanceDetails31>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffectedAndUnaffectedBalanceRule";
			definition = "Unaffected balance and Affected balances should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results.";
			owner_lazy = () -> CorporateActionBalanceDetails31.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionBalanceDetails31 obj) throws Exception {
			checkCorporateActionBalanceDetails31(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29
	 * CorporateActionBalanceDetails29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffectedAndUnaffectedBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UnaffectedBalance and AffectedBalance should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionBalanceDetails29> forCorporateActionBalanceDetails29 = new MMConstraint<CorporateActionBalanceDetails29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffectedAndUnaffectedBalanceRule";
			definition = "UnaffectedBalance and AffectedBalance should only be mentioned as a result of the process that was run through the event. For instance lottery results, Dutch auction results or tender offer results.";
			owner_lazy = () -> CorporateActionBalanceDetails29.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionBalanceDetails29 obj) throws Exception {
			checkCorporateActionBalanceDetails29(obj);
		}
	};

	/**
	 * Unaffected balance and Affected balances should only be mentioned as a
	 * result of the process that was run through the event. For instance
	 * lottery results, Dutch auction results or tender offer results.
	 */
	public static void checkCorporateActionBalanceDetails31(CorporateActionBalanceDetails31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * UnaffectedBalance and AffectedBalance should only be mentioned as a
	 * result of the process that was run through the event. For instance
	 * lottery results, Dutch auction results or tender offer results.
	 */
	public static void checkCorporateActionBalanceDetails29(CorporateActionBalanceDetails29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}