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
import com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09;
import com.tools20022.repository.area.seev.CorporateActionNotificationV08;

/**
 * If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/
 * NotSpecifiedRate Code value or
 * CorporateActionOptionDetails/RateAndAmountDetails
 * /InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil
 * Payment), then CorporateActionGeneralInformation/EventType/Code must be
 * either DVCA (CashDividend) or INTR (InterestPayment).<br>
 * If CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/
 * GrossDividendRate/NotSpecifiedRate Code value or
 * CorporateActionOptionDetails/
 * CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment
 * /NotSpecifiedRate Code value is NILP (Nil Payment), then
 * CorporateActionGeneralInformation/EventType/Code must be either DVCA
 * (CashDividend) or INTR (InterestPayment).
 */
public class ConstraintRateAndCorporateActionEventRule {

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
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV08> for_seev_CorporateActionNotificationV08 = new MMConstraint<CorporateActionNotificationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			owner_lazy = () -> CorporateActionNotificationV08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotificationV08 obj) throws Exception {
			check_seev_CorporateActionNotificationV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09
	 * CorporateActionMovementPreliminaryAdviceV09}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV09> for_seev_CorporateActionMovementPreliminaryAdviceV09 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV09.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceV09 obj) throws Exception {
			check_seev_CorporateActionMovementPreliminaryAdviceV09(obj);
		}
	};

	/**
	 * If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/
	 * NotSpecifiedRate Code value or
	 * CorporateActionOptionDetails/RateAndAmountDetails
	 * /InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil
	 * Payment), then CorporateActionGeneralInformation/EventType/Code must be
	 * either DVCA (CashDividend) or INTR (InterestPayment).<br>
	 * If CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/
	 * GrossDividendRate/NotSpecifiedRate Code value or
	 * CorporateActionOptionDetails
	 * /CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment
	 * /NotSpecifiedRate Code value is NILP (Nil Payment), then
	 * CorporateActionGeneralInformation/EventType/Code must be either DVCA
	 * (CashDividend) or INTR (InterestPayment).
	 */
	public static void check_seev_CorporateActionNotificationV08(CorporateActionNotificationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/
	 * NotSpecifiedRate Code value or
	 * CorporateActionMovementDetails/RateAndAmountDetails
	 * /InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil
	 * Payment), then CorporateActionGeneralInformation/EventType/Code must be
	 * either DVCA (CashDividend) or INTR (InterestPayment).<br>
	 * If
	 * CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails
	 * /GrossDividendRate/NotSpecifiedRate Code value or
	 * CorporateActionMovementDetails
	 * /CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment
	 * /NotSpecifiedRate Code value is NILP (Nil Payment), then
	 * CorporateActionGeneralInformation/EventType/Code must be either DVCA
	 * (CashDividend) or INTR (InterestPayment).
	 */
	public static void check_seev_CorporateActionMovementPreliminaryAdviceV09(CorporateActionMovementPreliminaryAdviceV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}