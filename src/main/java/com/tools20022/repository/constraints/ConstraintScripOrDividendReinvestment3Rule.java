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
import com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV09;

/**
 * If CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/
 * BargainDate or
 * CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails
 * /BargainSettlementDate is present, then
 * CorporateActionGeneralInformation/EventType/Code value must be DRIP
 * (DividendReinvestment).
 */
public class ConstraintScripOrDividendReinvestment3Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV09
	 * CorporateActionMovementConfirmationV09}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripOrDividendReinvestment3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then CorporateActionGeneralInformation/EventType/Code value must be DRIP (DividendReinvestment)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV09> for_seev_CorporateActionMovementConfirmationV09 = new MMConstraint<CorporateActionMovementConfirmationV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripOrDividendReinvestment3Rule";
			definition = "If CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainDate or CorporateActionConfirmationDetails/CashMovementDetails/TaxVoucherDetails/BargainSettlementDate is present, then CorporateActionGeneralInformation/EventType/Code value must be DRIP (DividendReinvestment).";
			owner_lazy = () -> CorporateActionMovementConfirmationV09.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV09 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV09(obj);
		}
	};

	/**
	 * If CorporateActionConfirmationDetails/CashMovementDetails/
	 * TaxVoucherDetails/BargainDate or
	 * CorporateActionConfirmationDetails/CashMovementDetails
	 * /TaxVoucherDetails/BargainSettlementDate is present, then
	 * CorporateActionGeneralInformation/EventType/Code value must be DRIP
	 * (DividendReinvestment).
	 */
	public static void check_seev_CorporateActionMovementConfirmationV09(CorporateActionMovementConfirmationV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}