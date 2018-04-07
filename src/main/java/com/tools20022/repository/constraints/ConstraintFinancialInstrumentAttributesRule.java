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
import com.tools20022.repository.msg.AggregateBalanceInformation30;
import com.tools20022.repository.msg.AggregateBalanceInformation31;

/**
 * If InvestmentFundsFinancialInstrumentAttributes is present, then
 * FinancialInstrumentAttributes is not allowed.
 */
public class ConstraintFinancialInstrumentAttributesRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31
	 * AggregateBalanceInformation31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributesRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation31> forAggregateBalanceInformation31 = new MMConstraint<AggregateBalanceInformation31>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributesRule";
			definition = "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed.";
			owner_lazy = () -> AggregateBalanceInformation31.mmObject();
		}

		@Override
		public void executeValidator(AggregateBalanceInformation31 obj) throws Exception {
			checkAggregateBalanceInformation31(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30
	 * AggregateBalanceInformation30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributesRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation30> forAggregateBalanceInformation30 = new MMConstraint<AggregateBalanceInformation30>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributesRule";
			definition = "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed.";
			owner_lazy = () -> AggregateBalanceInformation30.mmObject();
		}

		@Override
		public void executeValidator(AggregateBalanceInformation30 obj) throws Exception {
			checkAggregateBalanceInformation30(obj);
		}
	};

	/**
	 * If InvestmentFundsFinancialInstrumentAttributes is present, then
	 * FinancialInstrumentAttributes is not allowed.
	 */
	public static void checkAggregateBalanceInformation31(AggregateBalanceInformation31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InvestmentFundsFinancialInstrumentAttributes is present, then
	 * FinancialInstrumentAttributes is not allowed.
	 */
	public static void checkAggregateBalanceInformation30(AggregateBalanceInformation30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}