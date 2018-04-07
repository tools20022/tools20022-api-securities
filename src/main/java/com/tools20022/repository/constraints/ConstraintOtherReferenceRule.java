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
import com.tools20022.repository.area.sese.TransferCancellationStatusReportV06;
import com.tools20022.repository.area.sese.TransferInstructionStatusReportV06;
import com.tools20022.repository.msg.MessageAndBusinessReference11;

/**
 * Reference/OtherReference should be used to reference a transfer instruction
 * or a transfer cancellation request 'message' sent in a proprietary way or
 * used for a system reference. If Reference/OtherReference is present,
 * Reference/OtherReference/MessageName must contain 'fax' or 'phone' or
 * 'email', etc.
 */
public class ConstraintOtherReferenceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV06
	 * TransferInstructionStatusReportV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference/OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInstructionStatusReportV06> for_sese_TransferInstructionStatusReportV06 = new MMConstraint<TransferInstructionStatusReportV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceRule";
			definition = "Reference/OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			owner_lazy = () -> TransferInstructionStatusReportV06.mmObject();
		}

		@Override
		public void executeValidator(TransferInstructionStatusReportV06 obj) throws Exception {
			check_sese_TransferInstructionStatusReportV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference11
	 * MessageAndBusinessReference11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference/OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MessageAndBusinessReference11> forMessageAndBusinessReference11 = new MMConstraint<MessageAndBusinessReference11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceRule";
			definition = "Reference/OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			owner_lazy = () -> MessageAndBusinessReference11.mmObject();
		}

		@Override
		public void executeValidator(MessageAndBusinessReference11 obj) throws Exception {
			checkMessageAndBusinessReference11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV06
	 * TransferCancellationStatusReportV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference/OtherReference should be used to reference a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, References/OtherReference/MessageName must contain, for example, 'fax' or 'phone' or 'email'."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferCancellationStatusReportV06> for_sese_TransferCancellationStatusReportV06 = new MMConstraint<TransferCancellationStatusReportV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceRule";
			definition = "Reference/OtherReference should be used to reference a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, References/OtherReference/MessageName must contain, for example, 'fax' or 'phone' or 'email'.";
			owner_lazy = () -> TransferCancellationStatusReportV06.mmObject();
		}

		@Override
		public void executeValidator(TransferCancellationStatusReportV06 obj) throws Exception {
			check_sese_TransferCancellationStatusReportV06(obj);
		}
	};

	/**
	 * Reference/OtherReference should be used to reference a transfer
	 * instruction or a transfer cancellation request 'message' sent in a
	 * proprietary way or used for a system reference. If
	 * Reference/OtherReference is present, Reference/OtherReference/MessageName
	 * must contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void check_sese_TransferInstructionStatusReportV06(TransferInstructionStatusReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Reference/OtherReference should be used to reference a transfer
	 * instruction or a transfer cancellation request 'message' sent in a
	 * proprietary way or used for a system reference. If
	 * Reference/OtherReference is present, Reference/OtherReference/MessageName
	 * must contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void checkMessageAndBusinessReference11(MessageAndBusinessReference11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Reference/OtherReference should be used to reference a transfer
	 * cancellation request 'message' sent in a proprietary way or used for a
	 * system reference. If Reference/OtherReference is present,
	 * References/OtherReference/MessageName must contain, for example, 'fax' or
	 * 'phone' or 'email'.
	 */
	public static void check_sese_TransferCancellationStatusReportV06(TransferCancellationStatusReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}