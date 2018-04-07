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
 * Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more
 * occurrences of RelatedPartyDetails/OrderOriginatorEligibility may be present,
 * but not both.
 */
public class ConstraintOrderOriginatorEligibility3Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15
	 * SubscriptionOrder15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more occurrences of RelatedPartyDetails/OrderOriginatorEligibility may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrder15> forSubscriptionOrder15 = new MMConstraint<SubscriptionOrder15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility3Rule";
			definition = "Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more occurrences of RelatedPartyDetails/OrderOriginatorEligibility may be present, but not both.";
			owner_lazy = () -> SubscriptionOrder15.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionOrder15 obj) throws Exception {
			checkSubscriptionOrder15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7
	 * SwitchExecution7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails/OrderOriginatorEligibility or a single occurrence of RedemptionLegDetails/InvestmentAccountDetails/OrderOriginatorEligibility or a single occurrence of SubscriptionLegDetails/InvestmentAccountDetails/OrderOriginatorEligibility should be only present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchExecution7> forSwitchExecution7 = new MMConstraint<SwitchExecution7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility3Rule";
			definition = "Either InvestmentAccountDetails/OrderOriginatorEligibility or a single occurrence of RedemptionLegDetails/InvestmentAccountDetails/OrderOriginatorEligibility or a single occurrence of SubscriptionLegDetails/InvestmentAccountDetails/OrderOriginatorEligibility should be only present.";
			owner_lazy = () -> SwitchExecution7.mmObject();
		}

		@Override
		public void executeValidator(SwitchExecution7 obj) throws Exception {
			checkSwitchExecution7(obj);
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
	 * name} = "OrderOriginatorEligibility3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more occurrences of RelatedPartyDetails/OrderOriginatorEligibility may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionExecution12> forSubscriptionExecution12 = new MMConstraint<SubscriptionExecution12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility3Rule";
			definition = "Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more occurrences of RelatedPartyDetails/OrderOriginatorEligibility may be present, but not both.";
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6
	 * RedemptionMultipleOrder6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more occurrences of IndividualOrderDetails/RelatedPartyDetails/OrderOriginatorEligibility may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionMultipleOrder6> forRedemptionMultipleOrder6 = new MMConstraint<RedemptionMultipleOrder6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility3Rule";
			definition = "Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more occurrences of IndividualOrderDetails/RelatedPartyDetails/OrderOriginatorEligibility may be present, but not both.";
			owner_lazy = () -> RedemptionMultipleOrder6.mmObject();
		}

		@Override
		public void executeValidator(RedemptionMultipleOrder6 obj) throws Exception {
			checkRedemptionMultipleOrder6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15
	 * RedemptionOrder15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more occurrences of RelatedPartyDetails/OrderOriginatorEligibility may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrder15> forRedemptionOrder15 = new MMConstraint<RedemptionOrder15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility3Rule";
			definition = "Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more occurrences of RelatedPartyDetails/OrderOriginatorEligibility may be present, but not both.";
			owner_lazy = () -> RedemptionOrder15.mmObject();
		}

		@Override
		public void executeValidator(RedemptionOrder15 obj) throws Exception {
			checkRedemptionOrder15(obj);
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
	 * name} = "OrderOriginatorEligibility3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more occurrences of RelatedPartyDetails/OrderOriginatorEligibility may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionExecution16> forRedemptionExecution16 = new MMConstraint<RedemptionExecution16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility3Rule";
			definition = "Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more occurrences of RelatedPartyDetails/OrderOriginatorEligibility may be present, but not both.";
			owner_lazy = () -> RedemptionExecution16.mmObject();
		}

		@Override
		public void executeValidator(RedemptionExecution16 obj) throws Exception {
			checkRedemptionExecution16(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7 SwitchOrder7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails/OrderOriginatorEligibility or a single occurrence of RedemptionLegDetails/InvestmentAccountDetails/OrderOriginatorEligibility or a single occurrence of SubscriptionLegDetails/InvestmentAccountDetails/OrderOriginatorEligibility should be only present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrder7> forSwitchOrder7 = new MMConstraint<SwitchOrder7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility3Rule";
			definition = "Either InvestmentAccountDetails/OrderOriginatorEligibility or a single occurrence of RedemptionLegDetails/InvestmentAccountDetails/OrderOriginatorEligibility or a single occurrence of SubscriptionLegDetails/InvestmentAccountDetails/OrderOriginatorEligibility should be only present.";
			owner_lazy = () -> SwitchOrder7.mmObject();
		}

		@Override
		public void executeValidator(SwitchOrder7 obj) throws Exception {
			checkSwitchOrder7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6
	 * SubscriptionMultipleOrder6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either one or more occurrences of IndividualOrderDetails/RelatedPartyDetails/OrderOriginatorEligibility or InvestmentAccountDetails/OrderOriginatorEligibility may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionMultipleOrder6> forSubscriptionMultipleOrder6 = new MMConstraint<SubscriptionMultipleOrder6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility3Rule";
			definition = "Either one or more occurrences of IndividualOrderDetails/RelatedPartyDetails/OrderOriginatorEligibility or InvestmentAccountDetails/OrderOriginatorEligibility may be present, but not both.";
			owner_lazy = () -> SubscriptionMultipleOrder6.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionMultipleOrder6 obj) throws Exception {
			checkSubscriptionMultipleOrder6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5
	 * RedemptionMultipleExecution5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more occurrences of IndividualExecutionDetails/RelatedPartyDetails/OrderOriginatorEligibility may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionMultipleExecution5> forRedemptionMultipleExecution5 = new MMConstraint<RedemptionMultipleExecution5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility3Rule";
			definition = "Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more occurrences of IndividualExecutionDetails/RelatedPartyDetails/OrderOriginatorEligibility may be present, but not both.";
			owner_lazy = () -> RedemptionMultipleExecution5.mmObject();
		}

		@Override
		public void executeValidator(RedemptionMultipleExecution5 obj) throws Exception {
			checkRedemptionMultipleExecution5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5
	 * SubscriptionMultipleExecution5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more occurrences of IndividualExecutionDetails/RelatedPartyDetails/OrderOriginatorEligibility may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionMultipleExecution5> forSubscriptionMultipleExecution5 = new MMConstraint<SubscriptionMultipleExecution5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility3Rule";
			definition = "Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more occurrences of IndividualExecutionDetails/RelatedPartyDetails/OrderOriginatorEligibility may be present, but not both.";
			owner_lazy = () -> SubscriptionMultipleExecution5.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionMultipleExecution5 obj) throws Exception {
			checkSubscriptionMultipleExecution5(obj);
		}
	};

	/**
	 * Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more
	 * occurrences of RelatedPartyDetails/OrderOriginatorEligibility may be
	 * present, but not both.
	 */
	public static void checkSubscriptionOrder15(SubscriptionOrder15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails/OrderOriginatorEligibility or a single
	 * occurrence of RedemptionLegDetails/InvestmentAccountDetails/
	 * OrderOriginatorEligibility or a single occurrence of
	 * SubscriptionLegDetails
	 * /InvestmentAccountDetails/OrderOriginatorEligibility should be only
	 * present.
	 */
	public static void checkSwitchExecution7(SwitchExecution7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more
	 * occurrences of RelatedPartyDetails/OrderOriginatorEligibility may be
	 * present, but not both.
	 */
	public static void checkSubscriptionExecution12(SubscriptionExecution12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more
	 * occurrences of
	 * IndividualOrderDetails/RelatedPartyDetails/OrderOriginatorEligibility may
	 * be present, but not both.
	 */
	public static void checkRedemptionMultipleOrder6(RedemptionMultipleOrder6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more
	 * occurrences of RelatedPartyDetails/OrderOriginatorEligibility may be
	 * present, but not both.
	 */
	public static void checkRedemptionOrder15(RedemptionOrder15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more
	 * occurrences of RelatedPartyDetails/OrderOriginatorEligibility may be
	 * present, but not both.
	 */
	public static void checkRedemptionExecution16(RedemptionExecution16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails/OrderOriginatorEligibility or a single
	 * occurrence of RedemptionLegDetails/InvestmentAccountDetails/
	 * OrderOriginatorEligibility or a single occurrence of
	 * SubscriptionLegDetails
	 * /InvestmentAccountDetails/OrderOriginatorEligibility should be only
	 * present.
	 */
	public static void checkSwitchOrder7(SwitchOrder7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either one or more occurrences of
	 * IndividualOrderDetails/RelatedPartyDetails/OrderOriginatorEligibility or
	 * InvestmentAccountDetails/OrderOriginatorEligibility may be present, but
	 * not both.
	 */
	public static void checkSubscriptionMultipleOrder6(SubscriptionMultipleOrder6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more
	 * occurrences of IndividualExecutionDetails/RelatedPartyDetails/
	 * OrderOriginatorEligibility may be present, but not both.
	 */
	public static void checkRedemptionMultipleExecution5(RedemptionMultipleExecution5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either InvestmentAccountDetails/OrderOriginatorEligibility or one or more
	 * occurrences of IndividualExecutionDetails/RelatedPartyDetails/
	 * OrderOriginatorEligibility may be present, but not both.
	 */
	public static void checkSubscriptionMultipleExecution5(SubscriptionMultipleExecution5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}