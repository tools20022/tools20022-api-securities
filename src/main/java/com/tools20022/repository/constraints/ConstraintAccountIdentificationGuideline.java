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
import com.tools20022.repository.msg.InvestmentAccount65;
import com.tools20022.repository.msg.InvestmentAccount68;

/**
 * It is recommended that AccountIdentification be used to identify an account.
 */
public class ConstraintAccountIdentificationGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount65
	 * InvestmentAccount65}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that AccountIdentification be used to identify an account."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount65> forInvestmentAccount65 = new MMConstraint<InvestmentAccount65>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationGuideline";
			definition = "It is recommended that AccountIdentification be used to identify an account.";
			owner_lazy = () -> InvestmentAccount65.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount65 obj) throws Exception {
			checkInvestmentAccount65(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount68
	 * InvestmentAccount68}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that AccountIdentification be used to identify an account."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount68> forInvestmentAccount68 = new MMConstraint<InvestmentAccount68>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationGuideline";
			definition = "It is recommended that AccountIdentification be used to identify an account.";
			owner_lazy = () -> InvestmentAccount68.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount68 obj) throws Exception {
			checkInvestmentAccount68(obj);
		}
	};

	/**
	 * It is recommended that AccountIdentification be used to identify an
	 * account.
	 */
	public static void checkInvestmentAccount65(InvestmentAccount65 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that AccountIdentification be used to identify an
	 * account.
	 */
	public static void checkInvestmentAccount68(InvestmentAccount68 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}