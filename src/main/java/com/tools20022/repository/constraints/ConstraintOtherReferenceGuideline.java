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
import com.tools20022.repository.choice.LinkedMessage4Choice;

/**
 * OtherReference should be used to reference an order cancellation 'message'
 * sent in a proprietary way or used for a system reference. If OtherReference
 * is present, OtherReference/MessageName must contain 'fax' or 'phone' or
 * 'email', etc.
 */
public class ConstraintOtherReferenceGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV04
	 * OrderCancellationStatusReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OtherReference should be used to reference an order cancellation 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OrderCancellationStatusReportV04> for_setr_OrderCancellationStatusReportV04 = new MMConstraint<OrderCancellationStatusReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceGuideline";
			definition = "OtherReference should be used to reference an order cancellation 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			owner_lazy = () -> OrderCancellationStatusReportV04.mmObject();
		}

		@Override
		public void executeValidator(OrderCancellationStatusReportV04 obj) throws Exception {
			check_setr_OrderCancellationStatusReportV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV02
	 * RequestForOrderConfirmationStatusReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "RequestDetails/Reference/OtherReference should be used to reference an order instruction or cancellation 'message' sent in a proprietary way or used for a system reference. If RequestDetails/Reference/OtherReference is present, RequestDetails/Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RequestForOrderConfirmationStatusReportV02> for_setr_RequestForOrderConfirmationStatusReportV02 = new MMConstraint<RequestForOrderConfirmationStatusReportV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceGuideline";
			definition = "RequestDetails/Reference/OtherReference should be used to reference an order instruction or cancellation 'message' sent in a proprietary way or used for a system reference. If RequestDetails/Reference/OtherReference is present, RequestDetails/Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			owner_lazy = () -> RequestForOrderConfirmationStatusReportV02.mmObject();
		}

		@Override
		public void executeValidator(RequestForOrderConfirmationStatusReportV02 obj) throws Exception {
			check_setr_RequestForOrderConfirmationStatusReportV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02
	 * OrderConfirmationStatusReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OtherReference should be used to reference an order confirmation cancellation 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OrderConfirmationStatusReportV02> for_setr_OrderConfirmationStatusReportV02 = new MMConstraint<OrderConfirmationStatusReportV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceGuideline";
			definition = "OtherReference should be used to reference an order confirmation cancellation 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			owner_lazy = () -> OrderConfirmationStatusReportV02.mmObject();
		}

		@Override
		public void executeValidator(OrderConfirmationStatusReportV02 obj) throws Exception {
			check_setr_OrderConfirmationStatusReportV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV04
	 * RequestForOrderStatusReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "RequestDetails/Reference/OtherReference should be used to reference an order instruction or cancellation 'message' sent in a proprietary way or used for a system reference. If RequestDetails/Reference/OtherReference is present, RequestDetails/Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RequestForOrderStatusReportV04> for_setr_RequestForOrderStatusReportV04 = new MMConstraint<RequestForOrderStatusReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceGuideline";
			definition = "RequestDetails/Reference/OtherReference should be used to reference an order instruction or cancellation 'message' sent in a proprietary way or used for a system reference. If RequestDetails/Reference/OtherReference is present, RequestDetails/Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			owner_lazy = () -> RequestForOrderStatusReportV04.mmObject();
		}

		@Override
		public void executeValidator(RequestForOrderStatusReportV04 obj) throws Exception {
			check_setr_RequestForOrderStatusReportV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV04
	 * OrderInstructionStatusReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference/OtherReference should be used to reference an order instruction sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OrderInstructionStatusReportV04> for_setr_OrderInstructionStatusReportV04 = new MMConstraint<OrderInstructionStatusReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceGuideline";
			definition = "Reference/OtherReference should be used to reference an order instruction sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			owner_lazy = () -> OrderInstructionStatusReportV04.mmObject();
		}

		@Override
		public void executeValidator(OrderInstructionStatusReportV04 obj) throws Exception {
			check_setr_OrderInstructionStatusReportV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.LinkedMessage4Choice
	 * LinkedMessage4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OtherReference should be used for an account opening or an account modification instruction sent in a proprietary way or for system references. \r\nIf OtherReference is present, OtherReference/MessageName must contain, for example, 'fax' or 'phone' or 'email'."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<LinkedMessage4Choice> forLinkedMessage4Choice = new MMConstraint<LinkedMessage4Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceGuideline";
			definition = "OtherReference should be used for an account opening or an account modification instruction sent in a proprietary way or for system references. \r\nIf OtherReference is present, OtherReference/MessageName must contain, for example, 'fax' or 'phone' or 'email'.";
			owner_lazy = () -> LinkedMessage4Choice.mmObject();
		}

		@Override
		public void executeValidator(LinkedMessage4Choice obj) throws Exception {
			checkLinkedMessage4Choice(obj);
		}
	};

	/**
	 * OtherReference should be used to reference an order cancellation
	 * 'message' sent in a proprietary way or used for a system reference. If
	 * OtherReference is present, OtherReference/MessageName must contain 'fax'
	 * or 'phone' or 'email', etc.
	 */
	public static void check_setr_OrderCancellationStatusReportV04(OrderCancellationStatusReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * RequestDetails/Reference/OtherReference should be used to reference an
	 * order instruction or cancellation 'message' sent in a proprietary way or
	 * used for a system reference. If RequestDetails/Reference/OtherReference
	 * is present, RequestDetails/Reference/OtherReference/MessageName must
	 * contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void check_setr_RequestForOrderConfirmationStatusReportV02(RequestForOrderConfirmationStatusReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OtherReference should be used to reference an order confirmation
	 * cancellation 'message' sent in a proprietary way or used for a system
	 * reference. If OtherReference is present, OtherReference/MessageName must
	 * contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void check_setr_OrderConfirmationStatusReportV02(OrderConfirmationStatusReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * RequestDetails/Reference/OtherReference should be used to reference an
	 * order instruction or cancellation 'message' sent in a proprietary way or
	 * used for a system reference. If RequestDetails/Reference/OtherReference
	 * is present, RequestDetails/Reference/OtherReference/MessageName must
	 * contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void check_setr_RequestForOrderStatusReportV04(RequestForOrderStatusReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Reference/OtherReference should be used to reference an order instruction
	 * sent in a proprietary way or used for a system reference. If
	 * Reference/OtherReference is present, Reference/OtherReference/MessageName
	 * must contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void check_setr_OrderInstructionStatusReportV04(OrderInstructionStatusReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OtherReference should be used for an account opening or an account
	 * modification instruction sent in a proprietary way or for system
	 * references. <br>
	 * If OtherReference is present, OtherReference/MessageName must contain,
	 * for example, 'fax' or 'phone' or 'email'.
	 */
	public static void checkLinkedMessage4Choice(LinkedMessage4Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}