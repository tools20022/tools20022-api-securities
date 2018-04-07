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
import com.tools20022.repository.choice.CounterpartyIdentification3Choice;

/**
 * When the reported transaction is not an interbank transaction and the
 * counterparty is not a supranational authority and the transaction is not
 * conducted via a central clearing counterparty, please refer to the relevant
 * reporting instructions. <br>
 */
public class ConstraintNonInterbankReportingRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification3Choice
	 * CounterpartyIdentification3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonInterbankReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When the reported transaction is not an interbank transaction and the counterparty is not a supranational authority and the transaction is not conducted via a central clearing counterparty, please refer to the relevant reporting instructions. \r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CounterpartyIdentification3Choice> forCounterpartyIdentification3Choice = new MMConstraint<CounterpartyIdentification3Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonInterbankReportingRule";
			definition = "When the reported transaction is not an interbank transaction and the counterparty is not a supranational authority and the transaction is not conducted via a central clearing counterparty, please refer to the relevant reporting instructions. \r\n";
			owner_lazy = () -> CounterpartyIdentification3Choice.mmObject();
		}

		@Override
		public void executeValidator(CounterpartyIdentification3Choice obj) throws Exception {
			checkCounterpartyIdentification3Choice(obj);
		}
	};

	/**
	 * When the reported transaction is not an interbank transaction and the
	 * counterparty is not a supranational authority and the transaction is not
	 * conducted via a central clearing counterparty, please refer to the
	 * relevant reporting instructions. <br>
	 */
	public static void checkCounterpartyIdentification3Choice(CounterpartyIdentification3Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}