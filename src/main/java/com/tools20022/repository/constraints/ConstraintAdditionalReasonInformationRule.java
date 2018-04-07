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
import com.tools20022.repository.msg.*;

/**
 * The AdditionalReasonInformation element must not contain information that can
 * be provided in a structured field unless bilaterally agreed.
 */
public class ConstraintAdditionalReasonInformationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingStatusReason1
	 * PendingProcessingStatusReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PendingProcessingStatusReason1> forPendingProcessingStatusReason1 = new MMConstraint<PendingProcessingStatusReason1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInformationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> PendingProcessingStatusReason1.mmObject();
		}

		@Override
		public void executeValidator(PendingProcessingStatusReason1 obj) throws Exception {
			checkPendingProcessingStatusReason1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason5
	 * ProprietaryStatusAndReason5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ProprietaryStatusAndReason5> forProprietaryStatusAndReason5 = new MMConstraint<ProprietaryStatusAndReason5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInformationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> ProprietaryStatusAndReason5.mmObject();
		}

		@Override
		public void executeValidator(ProprietaryStatusAndReason5 obj) throws Exception {
			checkProprietaryStatusAndReason5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceivedStatusReason1
	 * ReceivedStatusReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceivedStatusReason1> forReceivedStatusReason1 = new MMConstraint<ReceivedStatusReason1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInformationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> ReceivedStatusReason1.mmObject();
		}

		@Override
		public void executeValidator(ReceivedStatusReason1 obj) throws Exception {
			checkReceivedStatusReason1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason12
	 * RejectedStatusReason12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RejectedStatusReason12> forRejectedStatusReason12 = new MMConstraint<RejectedStatusReason12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInformationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> RejectedStatusReason12.mmObject();
		}

		@Override
		public void executeValidator(RejectedStatusReason12 obj) throws Exception {
			checkRejectedStatusReason12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason7
	 * AcceptedStatusReason7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AcceptedStatusReason7> forAcceptedStatusReason7 = new MMConstraint<AcceptedStatusReason7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInformationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> AcceptedStatusReason7.mmObject();
		}

		@Override
		public void executeValidator(AcceptedStatusReason7 obj) throws Exception {
			checkAcceptedStatusReason7(obj);
		}
	};

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkPendingProcessingStatusReason1(PendingProcessingStatusReason1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkProprietaryStatusAndReason5(ProprietaryStatusAndReason5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkReceivedStatusReason1(ReceivedStatusReason1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkRejectedStatusReason12(RejectedStatusReason12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkAcceptedStatusReason7(AcceptedStatusReason7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}