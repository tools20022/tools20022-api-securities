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
import com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV09;
import com.tools20022.repository.area.seev.CorporateActionNotificationV08;

/**
 * IssuerAgent must be used only in the communication between a CSD and local
 * custodians.
 */
public class ConstraintIssuerAgentGuideline {

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
	 * name} = "IssuerAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IssuerAgent must be used only in the communication between a CSD and local custodians."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV09> for_seev_CorporateActionMovementConfirmationV09 = new MMConstraint<CorporateActionMovementConfirmationV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgentGuideline";
			definition = "IssuerAgent must be used only in the communication between a CSD and local custodians.";
			owner_lazy = () -> CorporateActionMovementConfirmationV09.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV09 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV09(obj);
		}
	};
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
	 * name} = "IssuerAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IssuerAgent must be used only in the communication between a CSD and local custodians."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV08> for_seev_CorporateActionNotificationV08 = new MMConstraint<CorporateActionNotificationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgentGuideline";
			definition = "IssuerAgent must be used only in the communication between a CSD and local custodians.";
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
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV09
	 * CorporateActionMovementReversalAdviceV09}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IssuerAgent must be used only in the communication between a CSD and local custodians."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV09> for_seev_CorporateActionMovementReversalAdviceV09 = new MMConstraint<CorporateActionMovementReversalAdviceV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgentGuideline";
			definition = "IssuerAgent must be used only in the communication between a CSD and local custodians.";
			owner_lazy = () -> CorporateActionMovementReversalAdviceV09.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV09 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV09(obj);
		}
	};

	/**
	 * IssuerAgent must be used only in the communication between a CSD and
	 * local custodians.
	 */
	public static void check_seev_CorporateActionMovementConfirmationV09(CorporateActionMovementConfirmationV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * IssuerAgent must be used only in the communication between a CSD and
	 * local custodians.
	 */
	public static void check_seev_CorporateActionNotificationV08(CorporateActionNotificationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * IssuerAgent must be used only in the communication between a CSD and
	 * local custodians.
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV09(CorporateActionMovementReversalAdviceV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}