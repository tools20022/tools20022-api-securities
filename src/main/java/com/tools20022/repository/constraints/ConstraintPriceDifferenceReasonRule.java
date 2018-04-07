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
import com.tools20022.repository.msg.RedemptionExecution15;
import com.tools20022.repository.msg.RedemptionExecution16;
import com.tools20022.repository.msg.SubscriptionExecution12;
import com.tools20022.repository.msg.SubscriptionExecution13;

/**
 * Any occurrence of InformativePriceDetails/PriceDifferenceReason may not be
 * present.
 */
public class ConstraintPriceDifferenceReasonRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15
	 * RedemptionExecution15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDifferenceReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Any occurrence of InformativePriceDetails/PriceDifferenceReason may not be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionExecution15> forRedemptionExecution15 = new MMConstraint<RedemptionExecution15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDifferenceReasonRule";
			definition = "Any occurrence of InformativePriceDetails/PriceDifferenceReason may not be present.";
			owner_lazy = () -> RedemptionExecution15.mmObject();
		}

		@Override
		public void executeValidator(RedemptionExecution15 obj) throws Exception {
			checkRedemptionExecution15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12
	 * SubscriptionExecution12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDifferenceReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Any occurrence of InformativePriceDetails/PriceDifferenceReason may not be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionExecution12> forSubscriptionExecution12 = new MMConstraint<SubscriptionExecution12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDifferenceReasonRule";
			definition = "Any occurrence of InformativePriceDetails/PriceDifferenceReason may not be present.";
			owner_lazy = () -> SubscriptionExecution12.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionExecution12 obj) throws Exception {
			checkSubscriptionExecution12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDifferenceReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Any occurrence of InformativePriceDetails/PriceDifferenceReason may not be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionExecution13> forSubscriptionExecution13 = new MMConstraint<SubscriptionExecution13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDifferenceReasonRule";
			definition = "Any occurrence of InformativePriceDetails/PriceDifferenceReason may not be present.";
			owner_lazy = () -> SubscriptionExecution13.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionExecution13 obj) throws Exception {
			checkSubscriptionExecution13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDifferenceReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Any occurrence of InformativePriceDetails/PriceDifferenceReason may not be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionExecution16> forRedemptionExecution16 = new MMConstraint<RedemptionExecution16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDifferenceReasonRule";
			definition = "Any occurrence of InformativePriceDetails/PriceDifferenceReason may not be present.";
			owner_lazy = () -> RedemptionExecution16.mmObject();
		}

		@Override
		public void executeValidator(RedemptionExecution16 obj) throws Exception {
			checkRedemptionExecution16(obj);
		}
	};

	/**
	 * Any occurrence of InformativePriceDetails/PriceDifferenceReason may not
	 * be present.
	 */
	public static void checkRedemptionExecution15(RedemptionExecution15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Any occurrence of InformativePriceDetails/PriceDifferenceReason may not
	 * be present.
	 */
	public static void checkSubscriptionExecution12(SubscriptionExecution12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Any occurrence of InformativePriceDetails/PriceDifferenceReason may not
	 * be present.
	 */
	public static void checkSubscriptionExecution13(SubscriptionExecution13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Any occurrence of InformativePriceDetails/PriceDifferenceReason may not
	 * be present.
	 */
	public static void checkRedemptionExecution16(RedemptionExecution16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}