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
import com.tools20022.repository.area.seev.AgentCAElectionAdviceV01;
import com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV09;
import com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV09;
import com.tools20022.repository.msg.CorporateActionOption141;

/**
 * The CorporateActionConfirmationDetails/OptionNumber value provided must be
 * the same as the one provided in the related
 * CorporateActionOptionDetails/OptionNumber element of the
 * CorporateActionNotification or CorporateActionMovementPreliminaryAdvice
 * messages previously sent.
 */
public class ConstraintOptionNumberRule {

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
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided in the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV09> for_seev_CorporateActionMovementConfirmationV09 = new MMConstraint<CorporateActionMovementConfirmationV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided in the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent.";
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption141
	 * CorporateActionOption141}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber rather than the OptionType must be used, for example, in the case where two or more offers can be described by the same corporate action option code. Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption141> forCorporateActionOption141 = new MMConstraint<CorporateActionOption141>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "For differentiation between options, the OptionNumber rather than the OptionType must be used, for example, in the case where two or more offers can be described by the same corporate action option code. Therefore, the OptionNumber value must be different for each option.";
			owner_lazy = () -> CorporateActionOption141.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption141 obj) throws Exception {
			checkCorporateActionOption141(obj);
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
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided in the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV09> for_seev_CorporateActionMovementReversalAdviceV09 = new MMConstraint<CorporateActionMovementReversalAdviceV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided in the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent.";
			owner_lazy = () -> CorporateActionMovementReversalAdviceV09.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV09 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionAdviceV01
	 * AgentCAElectionAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ElectionDetails/OptionNumber is present, then OptionNumber is not allowed in any occurrences of ElectionDetails/SecuritiesMovementDetails/DebitAccountDetails and/or ElectionDetails/SecuritiesMovementDetails/CreditAccountDetails.\n\nIf ElectionDetails/SecuritiesMovementDetails/DebitAccountDetails/OptionNumber is present at least once and/or ElectionDetails/SecuritiesMovementDetails/CreditAccountDetails/OptionNumber is present at least once then ElectionDetails/CorporateActionOptionNumber is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AgentCAElectionAdviceV01> for_seev_AgentCAElectionAdviceV01 = new MMConstraint<AgentCAElectionAdviceV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "If ElectionDetails/OptionNumber is present, then OptionNumber is not allowed in any occurrences of ElectionDetails/SecuritiesMovementDetails/DebitAccountDetails and/or ElectionDetails/SecuritiesMovementDetails/CreditAccountDetails.\n\nIf ElectionDetails/SecuritiesMovementDetails/DebitAccountDetails/OptionNumber is present at least once and/or ElectionDetails/SecuritiesMovementDetails/CreditAccountDetails/OptionNumber is present at least once then ElectionDetails/CorporateActionOptionNumber is not allowed.";
			owner_lazy = () -> AgentCAElectionAdviceV01.mmObject();
		}

		@Override
		public void executeValidator(AgentCAElectionAdviceV01 obj) throws Exception {
			check_seev_AgentCAElectionAdviceV01(obj);
		}
	};

	/**
	 * The CorporateActionConfirmationDetails/OptionNumber value provided must
	 * be the same as the one provided in the related
	 * CorporateActionOptionDetails/OptionNumber element of the
	 * CorporateActionNotification or CorporateActionMovementPreliminaryAdvice
	 * messages previously sent.
	 */
	public static void check_seev_CorporateActionMovementConfirmationV09(CorporateActionMovementConfirmationV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber rather than the
	 * OptionType must be used, for example, in the case where two or more
	 * offers can be described by the same corporate action option code.
	 * Therefore, the OptionNumber value must be different for each option.
	 */
	public static void checkCorporateActionOption141(CorporateActionOption141 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CorporateActionConfirmationDetails/OptionNumber value provided must
	 * be the same as the one provided in the related
	 * CorporateActionOptionDetails/OptionNumber element of the
	 * CorporateActionNotification or CorporateActionMovementPreliminaryAdvice
	 * messages previously sent.
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV09(CorporateActionMovementReversalAdviceV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ElectionDetails/OptionNumber is present, then OptionNumber is not
	 * allowed in any occurrences of
	 * ElectionDetails/SecuritiesMovementDetails/DebitAccountDetails and/or
	 * ElectionDetails/SecuritiesMovementDetails/CreditAccountDetails.
	 * 
	 * If ElectionDetails/SecuritiesMovementDetails/DebitAccountDetails/
	 * OptionNumber is present at least once and/or
	 * ElectionDetails/SecuritiesMovementDetails
	 * /CreditAccountDetails/OptionNumber is present at least once then
	 * ElectionDetails/CorporateActionOptionNumber is not allowed.
	 */
	public static void check_seev_AgentCAElectionAdviceV01(AgentCAElectionAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}