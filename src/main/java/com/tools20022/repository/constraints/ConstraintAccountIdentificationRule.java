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
import com.tools20022.repository.area.setr.*;
import com.tools20022.repository.msg.InvestmentAccount65;
import com.tools20022.repository.msg.InvestmentAccount68;

/**
 * If this message is linked to an account opening request and the account
 * identification is not yet known then the value of the AccountIdentification
 * element in MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.
 */
public class ConstraintAccountIdentificationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV04
	 * RedemptionOrderV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrderV04> for_setr_RedemptionOrderV04 = new MMConstraint<RedemptionOrderV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> RedemptionOrderV04.mmObject();
		}

		@Override
		public void executeValidator(RedemptionOrderV04 obj) throws Exception {
			check_setr_RedemptionOrderV04(obj);
		}
	};
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
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrderConfirmationV04> for_setr_RedemptionOrderConfirmationV04 = new MMConstraint<RedemptionOrderConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
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
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderV04
	 * SubscriptionOrderV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrderV04> for_setr_SubscriptionOrderV04 = new MMConstraint<SubscriptionOrderV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SubscriptionOrderV04.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionOrderV04 obj) throws Exception {
			check_setr_SubscriptionOrderV04(obj);
		}
	};
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
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one occurrence of one message element in the list (OwnerIdentification, AccountIdentification, AccountName) must be present. If an element in the list is repetitive, more than one occurrence of this message element may be present. More than one message element in the list may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount65> forInvestmentAccount65 = new MMConstraint<InvestmentAccount65>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "At least one occurrence of one message element in the list (OwnerIdentification, AccountIdentification, AccountName) must be present. If an element in the list is repetitive, more than one occurrence of this message element may be present. More than one message element in the list may be present.";
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
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV04
	 * RedemptionBulkOrderV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrderV04> for_setr_RedemptionBulkOrderV04 = new MMConstraint<RedemptionBulkOrderV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> RedemptionBulkOrderV04.mmObject();
		}

		@Override
		public void executeValidator(RedemptionBulkOrderV04 obj) throws Exception {
			check_setr_RedemptionBulkOrderV04(obj);
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
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrderConfirmationV04> for_setr_RedemptionBulkOrderConfirmationV04 = new MMConstraint<RedemptionBulkOrderConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount68
	 * InvestmentAccount68}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one occurrence of one message element in the list (OwnerIdentification, AccountIdentification, AccountName) must be present. If an element in the list is repetitive, more than one occurrence of this message element may be present. More than one message element in the list may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount68> forInvestmentAccount68 = new MMConstraint<InvestmentAccount68>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "At least one occurrence of one message element in the list (OwnerIdentification, AccountIdentification, AccountName) must be present. If an element in the list is repetitive, more than one occurrence of this message element may be present. More than one message element in the list may be present.";
			owner_lazy = () -> InvestmentAccount68.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount68 obj) throws Exception {
			checkInvestmentAccount68(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV04
	 * SubscriptionBulkOrderV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrderV04> for_setr_SubscriptionBulkOrderV04 = new MMConstraint<SubscriptionBulkOrderV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SubscriptionBulkOrderV04.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkOrderV04 obj) throws Exception {
			check_setr_SubscriptionBulkOrderV04(obj);
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
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrderConfirmationV04> for_setr_SubscriptionOrderConfirmationV04 = new MMConstraint<SubscriptionOrderConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
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
	 * name} = "AccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrderConfirmationV04> for_setr_SubscriptionBulkOrderConfirmationV04 = new MMConstraint<SubscriptionBulkOrderConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationRule";
			definition = "If this message is linked to an account opening request and the account identification is not yet known then the value of the AccountIdentification element in BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails must be UNKNOWN.";
			owner_lazy = () -> SubscriptionBulkOrderConfirmationV04.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkOrderConfirmationV04 obj) throws Exception {
			check_setr_SubscriptionBulkOrderConfirmationV04(obj);
		}
	};

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void check_setr_RedemptionOrderV04(RedemptionOrderV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void check_setr_RedemptionOrderConfirmationV04(RedemptionOrderConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * MultipleOrderDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void check_setr_SubscriptionOrderV04(SubscriptionOrderV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * At least one occurrence of one message element in the list
	 * (OwnerIdentification, AccountIdentification, AccountName) must be
	 * present. If an element in the list is repetitive, more than one
	 * occurrence of this message element may be present. More than one message
	 * element in the list may be present.
	 */
	public static void checkInvestmentAccount65(InvestmentAccount65 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be
	 * UNKNOWN.
	 */
	public static void check_setr_RedemptionBulkOrderV04(RedemptionBulkOrderV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails
	 * must be UNKNOWN.
	 */
	public static void check_setr_RedemptionBulkOrderConfirmationV04(RedemptionBulkOrderConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * At least one occurrence of one message element in the list
	 * (OwnerIdentification, AccountIdentification, AccountName) must be
	 * present. If an element in the list is repetitive, more than one
	 * occurrence of this message element may be present. More than one message
	 * element in the list may be present.
	 */
	public static void checkInvestmentAccount68(InvestmentAccount68 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * BulkOrderDetails/IndividualOrderDetails/InvestmentAccountDetails must be
	 * UNKNOWN.
	 */
	public static void check_setr_SubscriptionBulkOrderV04(SubscriptionBulkOrderV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * MultipleExecutionDetails/InvestmentAccountDetails must be UNKNOWN.
	 */
	public static void check_setr_SubscriptionOrderConfirmationV04(SubscriptionOrderConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If this message is linked to an account opening request and the account
	 * identification is not yet known then the value of the
	 * AccountIdentification element in
	 * BulkExecutionDetails/IndividualExecutionDetails/InvestmentAccountDetails
	 * must be UNKNOWN.
	 */
	public static void check_setr_SubscriptionBulkOrderConfirmationV04(SubscriptionBulkOrderConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}