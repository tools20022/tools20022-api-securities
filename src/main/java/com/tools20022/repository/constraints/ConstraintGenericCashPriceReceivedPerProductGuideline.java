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
import com.tools20022.repository.msg.CorporateActionPrice61;

/**
 * GenericCashPriceReceivedPerProduct is the price received in the course of an
 * event. The specific meaning (redemption price, subscription price,
 * reinvestment price, ETC.) is derived from the event type.
 */
public class ConstraintGenericCashPriceReceivedPerProductGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice61
	 * CorporateActionPrice61}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPriceReceivedPerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct is the price received in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice61> forCorporateActionPrice61 = new MMConstraint<CorporateActionPrice61>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPriceReceivedPerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct is the price received in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice61.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice61 obj) throws Exception {
			checkCorporateActionPrice61(obj);
		}
	};

	/**
	 * GenericCashPriceReceivedPerProduct is the price received in the course of
	 * an event. The specific meaning (redemption price, subscription price,
	 * reinvestment price, ETC.) is derived from the event type.
	 */
	public static void checkCorporateActionPrice61(CorporateActionPrice61 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}