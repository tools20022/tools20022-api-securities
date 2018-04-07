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
import com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09;
import com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV09;
import com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV09;
import com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV08;
import com.tools20022.repository.area.sese.*;

/**
 * The Securities Market Practice Group (SMPG) has published market practice
 * recommendations on the use of this message.<br>
 * These market practices are available on www.smpg.info.
 */
public class ConstraintSecuritiesMarketPracticeGroupGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV08
	 * SecuritiesTransactionPostingReportV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReportV08> for_semt_SecuritiesTransactionPostingReportV08 = new MMConstraint<SecuritiesTransactionPostingReportV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesTransactionPostingReportV08.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionPostingReportV08 obj) throws Exception {
			check_semt_SecuritiesTransactionPostingReportV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07
	 * SecuritiesSettlementTransactionAllegementNotificationV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV07> for_sese_SecuritiesSettlementTransactionAllegementNotificationV07 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV07.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionAllegementNotificationV07 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionAllegementNotificationV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV09
	 * SecuritiesSettlementTransactionStatusAdviceV09}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV09> for_sese_SecuritiesSettlementTransactionStatusAdviceV09 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV09.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionStatusAdviceV09 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionStatusAdviceV09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV07
	 * SecuritiesSettlementConditionsModificationRequestV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionsModificationRequestV07> for_sese_SecuritiesSettlementConditionsModificationRequestV07 = new MMConstraint<SecuritiesSettlementConditionsModificationRequestV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementConditionsModificationRequestV07.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementConditionsModificationRequestV07 obj) throws Exception {
			check_sese_SecuritiesSettlementConditionsModificationRequestV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV08
	 * SecuritiesSettlementTransactionConfirmationV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV08> for_sese_SecuritiesSettlementTransactionConfirmationV08 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV08.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionConfirmationV08 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionConfirmationV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV09
	 * SecuritiesTransactionPendingReportV09}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReportV09> for_semt_SecuritiesTransactionPendingReportV09 = new MMConstraint<SecuritiesTransactionPendingReportV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesTransactionPendingReportV09.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionPendingReportV09 obj) throws Exception {
			check_semt_SecuritiesTransactionPendingReportV09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV08
	 * SecuritiesFinancingInstructionV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV08> for_sese_SecuritiesFinancingInstructionV08 = new MMConstraint<SecuritiesFinancingInstructionV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesFinancingInstructionV08.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingInstructionV08 obj) throws Exception {
			check_sese_SecuritiesFinancingInstructionV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV05
	 * PortfolioTransferNotificationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferNotificationV05> for_sese_PortfolioTransferNotificationV05 = new MMConstraint<PortfolioTransferNotificationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> PortfolioTransferNotificationV05.mmObject();
		}

		@Override
		public void executeValidator(PortfolioTransferNotificationV05 obj) throws Exception {
			check_sese_PortfolioTransferNotificationV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV08
	 * SecuritiesSettlementTransactionInstructionV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV08> for_sese_SecuritiesSettlementTransactionInstructionV08 = new MMConstraint<SecuritiesSettlementTransactionInstructionV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV08.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstructionV08 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionInstructionV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09
	 * SecuritiesBalanceAccountingReportV09}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV09> for_semt_SecuritiesBalanceAccountingReportV09 = new MMConstraint<SecuritiesBalanceAccountingReportV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesBalanceAccountingReportV09.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesBalanceAccountingReportV09 obj) throws Exception {
			check_semt_SecuritiesBalanceAccountingReportV09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV09
	 * SecuritiesBalanceCustodyReportV09}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV09> for_semt_SecuritiesBalanceCustodyReportV09 = new MMConstraint<SecuritiesBalanceCustodyReportV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesBalanceCustodyReportV09.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesBalanceCustodyReportV09 obj) throws Exception {
			check_semt_SecuritiesBalanceCustodyReportV09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV05
	 * SecuritiesTransactionCancellationRequestStatusAdviceV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV05> for_sese_SecuritiesTransactionCancellationRequestStatusAdviceV05 = new MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesTransactionCancellationRequestStatusAdviceV05.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionCancellationRequestStatusAdviceV05 obj) throws Exception {
			check_sese_SecuritiesTransactionCancellationRequestStatusAdviceV05(obj);
		}
	};

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesTransactionPostingReportV08(SecuritiesTransactionPostingReportV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionAllegementNotificationV07(SecuritiesSettlementTransactionAllegementNotificationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionStatusAdviceV09(SecuritiesSettlementTransactionStatusAdviceV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementConditionsModificationRequestV07(SecuritiesSettlementConditionsModificationRequestV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionConfirmationV08(SecuritiesSettlementTransactionConfirmationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesTransactionPendingReportV09(SecuritiesTransactionPendingReportV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesFinancingInstructionV08(SecuritiesFinancingInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_PortfolioTransferNotificationV05(PortfolioTransferNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstructionV08(SecuritiesSettlementTransactionInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesBalanceAccountingReportV09(SecuritiesBalanceAccountingReportV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesBalanceCustodyReportV09(SecuritiesBalanceCustodyReportV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesTransactionCancellationRequestStatusAdviceV05(SecuritiesTransactionCancellationRequestStatusAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}