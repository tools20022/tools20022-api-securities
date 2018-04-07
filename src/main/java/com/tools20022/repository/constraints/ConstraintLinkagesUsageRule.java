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
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV06;

/**
 * The linkages can only be used when modifying the Paired or Turned Quantity.
 * For the changes of linking and unlinking messages this must be done with the
 * SecuritiesSettlementConditionsModificationRequest.
 */
public class ConstraintLinkagesUsageRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV06
	 * SecuritiesSettlementTransactionModificationRequestV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkagesUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The linkages can only be used when modifying the Paired or Turned Quantity. For the changes of linking and unlinking messages this must be done with the SecuritiesSettlementConditionsModificationRequest."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionModificationRequestV06> for_sese_SecuritiesSettlementTransactionModificationRequestV06 = new MMConstraint<SecuritiesSettlementTransactionModificationRequestV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkagesUsageRule";
			definition = "The linkages can only be used when modifying the Paired or Turned Quantity. For the changes of linking and unlinking messages this must be done with the SecuritiesSettlementConditionsModificationRequest.";
			owner_lazy = () -> SecuritiesSettlementTransactionModificationRequestV06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionModificationRequestV06 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionModificationRequestV06(obj);
		}
	};

	/**
	 * The linkages can only be used when modifying the Paired or Turned
	 * Quantity. For the changes of linking and unlinking messages this must be
	 * done with the SecuritiesSettlementConditionsModificationRequest.
	 */
	public static void check_sese_SecuritiesSettlementTransactionModificationRequestV06(SecuritiesSettlementTransactionModificationRequestV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}