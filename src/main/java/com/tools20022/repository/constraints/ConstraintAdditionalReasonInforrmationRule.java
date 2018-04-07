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
import java.util.Arrays;

/**
 * The AdditionalReasonInformation element must not contain information that can
 * be provided in a structured field unless bilaterally agreed.
 */
public class ConstraintAdditionalReasonInforrmationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason7
	 * PendingCancellationStatusReason7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PendingCancellationStatusReason7> forPendingCancellationStatusReason7 = new MMConstraint<PendingCancellationStatusReason7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> PendingCancellationStatusReason7.mmObject();
		}

		@Override
		public void executeValidator(PendingCancellationStatusReason7 obj) throws Exception {
			checkPendingCancellationStatusReason7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason21
	 * RejectedStatusReason21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RejectedStatusReason21> forRejectedStatusReason21 = new MMConstraint<RejectedStatusReason21>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> RejectedStatusReason21.mmObject();
		}

		@Override
		public void executeValidator(RejectedStatusReason21 obj) throws Exception {
			checkRejectedStatusReason21(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason11
	 * CancelledStatusReason11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CancelledStatusReason11> forCancelledStatusReason11 = new MMConstraint<CancelledStatusReason11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> CancelledStatusReason11.mmObject();
		}

		@Override
		public void executeValidator(CancelledStatusReason11 obj) throws Exception {
			checkCancelledStatusReason11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason18
	 * RejectedStatusReason18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RejectedStatusReason18> forRejectedStatusReason18 = new MMConstraint<RejectedStatusReason18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> RejectedStatusReason18.mmObject();
		}

		@Override
		public void executeValidator(RejectedStatusReason18 obj) throws Exception {
			checkRejectedStatusReason18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionReversalReason3
	 * CorporateActionReversalReason3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionReversalReason3> forCorporateActionReversalReason3 = new MMConstraint<CorporateActionReversalReason3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> CorporateActionReversalReason3.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionReversalReason3 obj) throws Exception {
			checkCorporateActionReversalReason3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason9
	 * PendingStatusReason9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PendingStatusReason9> forPendingStatusReason9 = new MMConstraint<PendingStatusReason9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> PendingStatusReason9.mmObject();
		}

		@Override
		public void executeValidator(PendingStatusReason9 obj) throws Exception {
			checkPendingStatusReason9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason12
	 * CancelledStatusReason12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CancelledStatusReason12> forCancelledStatusReason12 = new MMConstraint<CancelledStatusReason12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> CancelledStatusReason12.mmObject();
		}

		@Override
		public void executeValidator(CancelledStatusReason12 obj) throws Exception {
			checkCancelledStatusReason12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forProprietaryReason4
	 * ConstraintAdditionalReasonInforrmationRule.forProprietaryReason4}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ProprietaryReason1> forProprietaryReason1 = new MMConstraint<ProprietaryReason1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forProprietaryReason4);
			owner_lazy = () -> ProprietaryReason1.mmObject();
		}

		@Override
		public void executeValidator(ProprietaryReason1 obj) throws Exception {
			checkProprietaryReason1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryReason4
	 * ProprietaryReason4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forProprietaryReason1
	 * ConstraintAdditionalReasonInforrmationRule.forProprietaryReason1}</li>
	 * </ul>
	 */
	public static final MMConstraint<ProprietaryReason4> forProprietaryReason4 = new MMConstraint<ProprietaryReason4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forProprietaryReason1;
			owner_lazy = () -> ProprietaryReason4.mmObject();
		}

		@Override
		public void executeValidator(ProprietaryReason4 obj) throws Exception {
			checkProprietaryReason4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason10
	 * StatusAndReason10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<StatusAndReason10> forStatusAndReason10 = new MMConstraint<StatusAndReason10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> StatusAndReason10.mmObject();
		}

		@Override
		public void executeValidator(StatusAndReason10 obj) throws Exception {
			checkStatusAndReason10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason9
	 * AcceptedStatusReason9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AcceptedStatusReason9> forAcceptedStatusReason9 = new MMConstraint<AcceptedStatusReason9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> AcceptedStatusReason9.mmObject();
		}

		@Override
		public void executeValidator(AcceptedStatusReason9 obj) throws Exception {
			checkAcceptedStatusReason9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason13
	 * PendingStatusReason13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PendingStatusReason13> forPendingStatusReason13 = new MMConstraint<PendingStatusReason13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> PendingStatusReason13.mmObject();
		}

		@Override
		public void executeValidator(PendingStatusReason13 obj) throws Exception {
			checkPendingStatusReason13(obj);
		}
	};

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkPendingCancellationStatusReason7(PendingCancellationStatusReason7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkRejectedStatusReason21(RejectedStatusReason21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkCancelledStatusReason11(CancelledStatusReason11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkRejectedStatusReason18(RejectedStatusReason18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkCorporateActionReversalReason3(CorporateActionReversalReason3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkPendingStatusReason9(PendingStatusReason9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkCancelledStatusReason12(CancelledStatusReason12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkProprietaryReason1(ProprietaryReason1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkProprietaryReason4(ProprietaryReason4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkStatusAndReason10(StatusAndReason10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkAcceptedStatusReason9(AcceptedStatusReason9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkPendingStatusReason13(PendingStatusReason13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}