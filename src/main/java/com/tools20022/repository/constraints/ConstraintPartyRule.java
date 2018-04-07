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
 * Investor, DeliveringParty1 and ReceivingParty1 cannot be requested to be
 * modified using the SecuritiesSettlementConditionModificationRequest. These
 * fields are made available in the
 * SecuritiesSettlementConditionModificationRequest to enable the processing of
 * the request vis-a-vis the transaction requested to be modified.
 */
public class ConstraintPartyRule {

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
	 * name} = "PartyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investor, DeliveringParty1 and ReceivingParty1 cannot be requested to be modified using the SecuritiesSettlementConditionModificationRequest. These fields are made available in the SecuritiesSettlementConditionModificationRequest to enable the processing of the request vis-a-vis the transaction requested to be modified."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalInformation13> forAdditionalInformation13 = new MMConstraint<AdditionalInformation13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyRule";
			definition = "Investor, DeliveringParty1 and ReceivingParty1 cannot be requested to be modified using the SecuritiesSettlementConditionModificationRequest. These fields are made available in the SecuritiesSettlementConditionModificationRequest to enable the processing of the request vis-a-vis the transaction requested to be modified.";
			owner_lazy = () -> AdditionalInformation13.mmObject();
		}

		@Override
		public void executeValidator(AdditionalInformation13 obj) throws Exception {
			checkAdditionalInformation13(obj);
		}
	};

	/**
	 * Investor, DeliveringParty1 and ReceivingParty1 cannot be requested to be
	 * modified using the SecuritiesSettlementConditionModificationRequest.
	 * These fields are made available in the
	 * SecuritiesSettlementConditionModificationRequest to enable the processing
	 * of the request vis-a-vis the transaction requested to be modified.
	 */
	public static void checkAdditionalInformation13(AdditionalInformation13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}