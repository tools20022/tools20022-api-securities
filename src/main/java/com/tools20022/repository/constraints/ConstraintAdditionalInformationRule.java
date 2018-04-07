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
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.msg.*;

/**
 * All elements in the AdditionalInformation element must not contain
 * information that can be provided in a structured field unless bilaterally
 * agreed.
 */
public class ConstraintAdditionalInformationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV09
	 * CorporateActionInstructionStatusAdviceV09}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatusAdviceV09> for_seev_CorporateActionInstructionStatusAdviceV09 = new MMConstraint<CorporateActionInstructionStatusAdviceV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> CorporateActionInstructionStatusAdviceV09.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionStatusAdviceV09 obj) throws Exception {
			check_seev_CorporateActionInstructionStatusAdviceV09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV08
	 * CorporateActionInstructionV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elements in AdditionalInformation and CorporateActionInstruction/AdditionalInformation must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV08> for_seev_CorporateActionInstructionV08 = new MMConstraint<CorporateActionInstructionV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "Elements in AdditionalInformation and CorporateActionInstruction/AdditionalInformation must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition.";
			owner_lazy = () -> CorporateActionInstructionV08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionV08 obj) throws Exception {
			check_seev_CorporateActionInstructionV08(obj);
		}
	};
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
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in AdditionalInformation/NarrativeVersion."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV09> for_seev_CorporateActionMovementConfirmationV09 = new MMConstraint<CorporateActionMovementConfirmationV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in AdditionalInformation/NarrativeVersion.";
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
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV08
	 * CorporateActionInstructionCancellationRequestStatusAdviceV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV08> for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV08 = new MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> CorporateActionInstructionCancellationRequestStatusAdviceV08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestStatusAdviceV08 obj) throws Exception {
			check_seev_CorporateActionInstructionCancellationRequestStatusAdviceV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27
	 * CorporateActionNarrative27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrative27> forCorporateActionNarrative27 = new MMConstraint<CorporateActionNarrative27>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			owner_lazy = () -> CorporateActionNarrative27.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNarrative27 obj) throws Exception {
			checkCorporateActionNarrative27(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative28
	 * CorporateActionNarrative28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrative28> forCorporateActionNarrative28 = new MMConstraint<CorporateActionNarrative28>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			owner_lazy = () -> CorporateActionNarrative28.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNarrative28 obj) throws Exception {
			checkCorporateActionNarrative28(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative29
	 * CorporateActionNarrative29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrative29> forCorporateActionNarrative29 = new MMConstraint<CorporateActionNarrative29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			owner_lazy = () -> CorporateActionNarrative29.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNarrative29 obj) throws Exception {
			checkCorporateActionNarrative29(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative26
	 * CorporateActionNarrative26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrative26> forCorporateActionNarrative26 = new MMConstraint<CorporateActionNarrative26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition.";
			owner_lazy = () -> CorporateActionNarrative26.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNarrative26 obj) throws Exception {
			checkCorporateActionNarrative26(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation8
	 * UpdatedAdditionalInformation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Additionalnformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<UpdatedAdditionalInformation8> forUpdatedAdditionalInformation8 = new MMConstraint<UpdatedAdditionalInformation8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "The Additionalnformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> UpdatedAdditionalInformation8.mmObject();
		}

		@Override
		public void executeValidator(UpdatedAdditionalInformation8 obj) throws Exception {
			checkUpdatedAdditionalInformation8(obj);
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
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in AdditionalInformation/NarrativeVersion."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV09> for_seev_CorporateActionMovementReversalAdviceV09 = new MMConstraint<CorporateActionMovementReversalAdviceV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in AdditionalInformation/NarrativeVersion.";
			owner_lazy = () -> CorporateActionMovementReversalAdviceV09.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV09 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV09(obj);
		}
	};

	/**
	 * All elements in the AdditionalInformation element must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void check_seev_CorporateActionInstructionStatusAdviceV09(CorporateActionInstructionStatusAdviceV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Elements in AdditionalInformation and
	 * CorporateActionInstruction/AdditionalInformation must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition.
	 */
	public static void check_seev_CorporateActionInstructionV08(CorporateActionInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * AdditionalInformation/NarrativeVersion.
	 */
	public static void check_seev_CorporateActionMovementConfirmationV09(CorporateActionMovementConfirmationV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void check_seev_CorporateActionInstructionCancellationRequestStatusAdviceV08(CorporateActionInstructionCancellationRequestStatusAdviceV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkCorporateActionNarrative27(CorporateActionNarrative27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkCorporateActionNarrative28(CorporateActionNarrative28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkCorporateActionNarrative29(CorporateActionNarrative29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition.
	 */
	public static void checkCorporateActionNarrative26(CorporateActionNarrative26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Additionalnformation element must not contain information that can be
	 * provided in a structured field unless bilaterally agreed.
	 */
	public static void checkUpdatedAdditionalInformation8(UpdatedAdditionalInformation8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * AdditionalInformation/NarrativeVersion.
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV09(CorporateActionMovementReversalAdviceV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}