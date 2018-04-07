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
import com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV04;
import com.tools20022.repository.area.setr.RedemptionOrderConfirmationV04;
import com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV04;
import com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04;

/**
 * If this message is not solicited by the receiver, then the value of the
 * OrderReference element in every occurrence of
 * MultipleExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.
 */
public class ConstraintOrderReferenceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV04
	 * RedemptionOrderConfirmationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of MultipleExecutionDetails/IndividualExecutionDetails must be UNSOLICITED."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrderConfirmationV04> for_setr_RedemptionOrderConfirmationV04 = new MMConstraint<RedemptionOrderConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReferenceRule";
			definition = "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of MultipleExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.";
			owner_lazy = () -> RedemptionOrderConfirmationV04.mmObject();
		}

		@Override
		public void executeValidator(RedemptionOrderConfirmationV04 obj) throws Exception {
			check_setr_RedemptionOrderConfirmationV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV04
	 * RedemptionBulkOrderConfirmationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of BulkExecutionDetails/IndividualExecutionDetails must be UNSOLICITED."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrderConfirmationV04> for_setr_RedemptionBulkOrderConfirmationV04 = new MMConstraint<RedemptionBulkOrderConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReferenceRule";
			definition = "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of BulkExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.";
			owner_lazy = () -> RedemptionBulkOrderConfirmationV04.mmObject();
		}

		@Override
		public void executeValidator(RedemptionBulkOrderConfirmationV04 obj) throws Exception {
			check_setr_RedemptionBulkOrderConfirmationV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04
	 * SubscriptionOrderConfirmationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of MultipleExecutionDetails/IndividualExecutionDetails must be UNSOLICITED."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrderConfirmationV04> for_setr_SubscriptionOrderConfirmationV04 = new MMConstraint<SubscriptionOrderConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReferenceRule";
			definition = "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of MultipleExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.";
			owner_lazy = () -> SubscriptionOrderConfirmationV04.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionOrderConfirmationV04 obj) throws Exception {
			check_setr_SubscriptionOrderConfirmationV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV04
	 * SubscriptionBulkOrderConfirmationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of BulkExecutionDetails/IndividualExecutionDetails must be UNSOLICITED."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrderConfirmationV04> for_setr_SubscriptionBulkOrderConfirmationV04 = new MMConstraint<SubscriptionBulkOrderConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReferenceRule";
			definition = "If this message is not solicited by the receiver, then the value of the OrderReference element in every occurrence of BulkExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.";
			owner_lazy = () -> SubscriptionBulkOrderConfirmationV04.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkOrderConfirmationV04 obj) throws Exception {
			check_setr_SubscriptionBulkOrderConfirmationV04(obj);
		}
	};

	/**
	 * If this message is not solicited by the receiver, then the value of the
	 * OrderReference element in every occurrence of
	 * MultipleExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.
	 */
	public static void check_setr_RedemptionOrderConfirmationV04(RedemptionOrderConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is not solicited by the receiver, then the value of the
	 * OrderReference element in every occurrence of
	 * BulkExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.
	 */
	public static void check_setr_RedemptionBulkOrderConfirmationV04(RedemptionBulkOrderConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is not solicited by the receiver, then the value of the
	 * OrderReference element in every occurrence of
	 * MultipleExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.
	 */
	public static void check_setr_SubscriptionOrderConfirmationV04(SubscriptionOrderConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is not solicited by the receiver, then the value of the
	 * OrderReference element in every occurrence of
	 * BulkExecutionDetails/IndividualExecutionDetails must be UNSOLICITED.
	 */
	public static void check_setr_SubscriptionBulkOrderConfirmationV04(SubscriptionBulkOrderConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}