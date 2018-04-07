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
import com.tools20022.repository.area.seev.CorporateActionNotificationV08;

/**
 * CorporateActionDetails/RateAndAmountDetails/InterestRate and
 * CorporateActionOptionsDetails/RateAndAmountDetails/InterestRateUsedforPayment
 * must not be mixed. InterestRate is used to provide the annual rate of the
 * financial instrument. InterestRateUsedforPayment is used to provide the
 * applicable rate for the current payment, after all calculations have been
 * performed, that is, application of period and method of interest computation.
 */
public class ConstraintInterestPaymentRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08
	 * CorporateActionNotificationV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPaymentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CorporateActionDetails/RateAndAmountDetails/InterestRate and CorporateActionOptionsDetails/RateAndAmountDetails/InterestRateUsedforPayment must not be mixed. InterestRate is used to provide the annual rate of the financial instrument. InterestRateUsedforPayment is used to provide the applicable rate for the current payment, after all calculations have been performed, that is, application of period and method of interest computation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV08> for_seev_CorporateActionNotificationV08 = new MMConstraint<CorporateActionNotificationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentRule";
			definition = "CorporateActionDetails/RateAndAmountDetails/InterestRate and CorporateActionOptionsDetails/RateAndAmountDetails/InterestRateUsedforPayment must not be mixed. InterestRate is used to provide the annual rate of the financial instrument. InterestRateUsedforPayment is used to provide the applicable rate for the current payment, after all calculations have been performed, that is, application of period and method of interest computation.";
			owner_lazy = () -> CorporateActionNotificationV08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotificationV08 obj) throws Exception {
			check_seev_CorporateActionNotificationV08(obj);
		}
	};

	/**
	 * CorporateActionDetails/RateAndAmountDetails/InterestRate and
	 * CorporateActionOptionsDetails
	 * /RateAndAmountDetails/InterestRateUsedforPayment must not be mixed.
	 * InterestRate is used to provide the annual rate of the financial
	 * instrument. InterestRateUsedforPayment is used to provide the applicable
	 * rate for the current payment, after all calculations have been performed,
	 * that is, application of period and method of interest computation.
	 */
	public static void check_seev_CorporateActionNotificationV08(CorporateActionNotificationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}