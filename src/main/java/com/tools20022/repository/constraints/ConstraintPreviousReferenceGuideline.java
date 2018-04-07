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
import com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV02;
import com.tools20022.repository.area.setr.RequestForOrderStatusReportV04;
import com.tools20022.repository.choice.LinkedMessage4Choice;

/**
 * If RequestDetails/Reference/PreviousReference/MessageName is present, it must
 * contain 502 or must start with setr.047, setr.049, setr.051, setr.053, or
 * setr.055 and RequestDetails/Reference/PreviousReference/Reference must
 * contain the reference of a message in this list.
 */
public class ConstraintPreviousReferenceGuideline {

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
	 * name} = "PreviousReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestDetails/Reference/PreviousReference/MessageName is present, it must contain 502 or must start with setr.047, setr.049, setr.051, setr.053, or setr.055 and RequestDetails/Reference/PreviousReference/Reference must contain the reference of a message in this list."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RequestForOrderConfirmationStatusReportV02> for_setr_RequestForOrderConfirmationStatusReportV02 = new MMConstraint<RequestForOrderConfirmationStatusReportV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReferenceGuideline";
			definition = "If RequestDetails/Reference/PreviousReference/MessageName is present, it must contain 502 or must start with setr.047, setr.049, setr.051, setr.053, or setr.055 and RequestDetails/Reference/PreviousReference/Reference must contain the reference of a message in this list.";
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
	 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV04
	 * RequestForOrderStatusReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestDetails/Reference/PreviousReference/MessageName is present, it must contain 502 or must start with setr.001, setr.002, setr.004, setr.005, setr.007, setr.008, setr.010, setr.011, setr.013 or setr.014 and RequestDetails/Reference/PreviousReference/Reference must contain the reference of a message in this list."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RequestForOrderStatusReportV04> for_setr_RequestForOrderStatusReportV04 = new MMConstraint<RequestForOrderStatusReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReferenceGuideline";
			definition = "If RequestDetails/Reference/PreviousReference/MessageName is present, it must contain 502 or must start with setr.001, setr.002, setr.004, setr.005, setr.007, setr.008, setr.010, setr.011, setr.013 or setr.014 and RequestDetails/Reference/PreviousReference/Reference must contain the reference of a message in this list.";
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
	 * {@linkplain com.tools20022.repository.choice.LinkedMessage4Choice
	 * LinkedMessage4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReferenceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PreviousReference/MessageName is present, it must start with acmt.001 or acmt.003 and PreviousReference/Reference must contain the business reference of a message."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<LinkedMessage4Choice> forLinkedMessage4Choice = new MMConstraint<LinkedMessage4Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReferenceGuideline";
			definition = "If PreviousReference/MessageName is present, it must start with acmt.001 or acmt.003 and PreviousReference/Reference must contain the business reference of a message.";
			owner_lazy = () -> LinkedMessage4Choice.mmObject();
		}

		@Override
		public void executeValidator(LinkedMessage4Choice obj) throws Exception {
			checkLinkedMessage4Choice(obj);
		}
	};

	/**
	 * If RequestDetails/Reference/PreviousReference/MessageName is present, it
	 * must contain 502 or must start with setr.047, setr.049, setr.051,
	 * setr.053, or setr.055 and
	 * RequestDetails/Reference/PreviousReference/Reference must contain the
	 * reference of a message in this list.
	 */
	public static void check_setr_RequestForOrderConfirmationStatusReportV02(RequestForOrderConfirmationStatusReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RequestDetails/Reference/PreviousReference/MessageName is present, it
	 * must contain 502 or must start with setr.001, setr.002, setr.004,
	 * setr.005, setr.007, setr.008, setr.010, setr.011, setr.013 or setr.014
	 * and RequestDetails/Reference/PreviousReference/Reference must contain the
	 * reference of a message in this list.
	 */
	public static void check_setr_RequestForOrderStatusReportV04(RequestForOrderStatusReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PreviousReference/MessageName is present, it must start with acmt.001
	 * or acmt.003 and PreviousReference/Reference must contain the business
	 * reference of a message.
	 */
	public static void checkLinkedMessage4Choice(LinkedMessage4Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}