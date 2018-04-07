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
import com.tools20022.repository.msg.AdditionalInformation13;

/**
 * If pre-agreed between account servicer and account owner, then Quantity will
 * be used to instruct the quantity of securities that should be partially
 * processed, for example, partially authorised.
 */
public class ConstraintQuantityRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation13
	 * AdditionalInformation13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If pre-agreed between account servicer and account owner, then Quantity will be used to instruct the quantity of securities that should be partially processed, for example, partially authorised."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalInformation13> forAdditionalInformation13 = new MMConstraint<AdditionalInformation13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityRule";
			definition = "If pre-agreed between account servicer and account owner, then Quantity will be used to instruct the quantity of securities that should be partially processed, for example, partially authorised.";
			owner_lazy = () -> AdditionalInformation13.mmObject();
		}

		@Override
		public void executeValidator(AdditionalInformation13 obj) throws Exception {
			checkAdditionalInformation13(obj);
		}
	};

	/**
	 * If pre-agreed between account servicer and account owner, then Quantity
	 * will be used to instruct the quantity of securities that should be
	 * partially processed, for example, partially authorised.
	 */
	public static void checkAdditionalInformation13(AdditionalInformation13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}