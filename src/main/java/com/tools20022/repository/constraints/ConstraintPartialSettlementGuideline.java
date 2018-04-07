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
import com.tools20022.repository.msg.AdditionalParameters24;
import com.tools20022.repository.msg.AdditionalParameters29;
import com.tools20022.repository.msg.QuantityAndAccount64;

/**
 * Partial settlement information only applies to markets where partial
 * settlement is allowed.<br>
 * The PartialSettlement field should be used as follows:<br>
 * - with code PAIN in the first message(s) (there may be more than one)
 * confirming the partial settlement of an instruction.<br>
 * - with code PARC in the very last message sent to confirm the settlement of
 * the remaining part.<br>
 * For more details, see the relevant market practice document on www.smpg.info.
 */
public class ConstraintPartialSettlementGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters24
	 * AdditionalParameters24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe PartialSettlement field should be used as follows:\r\n- with code PAIN in the first message(s) (there may be more than one) confirming the partial settlement of an instruction.\r\n- with code PARC in the very last message sent to confirm the settlement of the remaining part.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalParameters24> forAdditionalParameters24 = new MMConstraint<AdditionalParameters24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementGuideline";
			definition = "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe PartialSettlement field should be used as follows:\r\n- with code PAIN in the first message(s) (there may be more than one) confirming the partial settlement of an instruction.\r\n- with code PARC in the very last message sent to confirm the settlement of the remaining part.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> AdditionalParameters24.mmObject();
		}

		@Override
		public void executeValidator(AdditionalParameters24 obj) throws Exception {
			checkAdditionalParameters24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29
	 * AdditionalParameters29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe PartialSettlement field should be used as follows:\r\n- with code PAIN in the first message(s) (there may be more than one) confirming the partial settlement of an instruction.\r\n- with code PARC in the very last message sent to confirm the settlement of the remaining part.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalParameters29> forAdditionalParameters29 = new MMConstraint<AdditionalParameters29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementGuideline";
			definition = "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe PartialSettlement field should be used as follows:\r\n- with code PAIN in the first message(s) (there may be more than one) confirming the partial settlement of an instruction.\r\n- with code PARC in the very last message sent to confirm the settlement of the remaining part.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> AdditionalParameters29.mmObject();
		}

		@Override
		public void executeValidator(AdditionalParameters29 obj) throws Exception {
			checkAdditionalParameters29(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount64
	 * QuantityAndAccount64}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe SettledQuantity field provides the quantity of securities effectively settled.\r\nThe other quantities (PreviouslySettledQuantity and/or RemainingToBeSettledQuantity) may be provided, but this is not mandatory.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount64> forQuantityAndAccount64 = new MMConstraint<QuantityAndAccount64>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementGuideline";
			definition = "Partial settlement information only applies to markets where partial settlement is allowed.\r\nThe SettledQuantity field provides the quantity of securities effectively settled.\r\nThe other quantities (PreviouslySettledQuantity and/or RemainingToBeSettledQuantity) may be provided, but this is not mandatory.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> QuantityAndAccount64.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount64 obj) throws Exception {
			checkQuantityAndAccount64(obj);
		}
	};

	/**
	 * Partial settlement information only applies to markets where partial
	 * settlement is allowed.<br>
	 * The PartialSettlement field should be used as follows:<br>
	 * - with code PAIN in the first message(s) (there may be more than one)
	 * confirming the partial settlement of an instruction.<br>
	 * - with code PARC in the very last message sent to confirm the settlement
	 * of the remaining part.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkAdditionalParameters24(AdditionalParameters24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Partial settlement information only applies to markets where partial
	 * settlement is allowed.<br>
	 * The PartialSettlement field should be used as follows:<br>
	 * - with code PAIN in the first message(s) (there may be more than one)
	 * confirming the partial settlement of an instruction.<br>
	 * - with code PARC in the very last message sent to confirm the settlement
	 * of the remaining part.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkAdditionalParameters29(AdditionalParameters29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Partial settlement information only applies to markets where partial
	 * settlement is allowed.<br>
	 * The SettledQuantity field provides the quantity of securities effectively
	 * settled.<br>
	 * The other quantities (PreviouslySettledQuantity and/or
	 * RemainingToBeSettledQuantity) may be provided, but this is not mandatory.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount64(QuantityAndAccount64 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}