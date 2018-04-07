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
import com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV07;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV09;
import com.tools20022.repository.choice.Status18Choice;
import com.tools20022.repository.msg.StatusAndReason28;

/**
 * If settlement status/reason is present alone, then it means that the
 * transaction is matched (if a matching process exists in the concerned market
 * or at the concerned account servicer).
 */
public class ConstraintSettlementStatusAndMatchedRule {

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
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is present alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV09> for_sese_SecuritiesSettlementTransactionStatusAdviceV09 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is present alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV07
	 * SecuritiesFinancingStatusAdviceV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementStatus is present alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingStatusAdviceV07> for_sese_SecuritiesFinancingStatusAdviceV07 = new MMConstraint<SecuritiesFinancingStatusAdviceV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If SettlementStatus is present alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			owner_lazy = () -> SecuritiesFinancingStatusAdviceV07.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingStatusAdviceV07 obj) throws Exception {
			check_sese_SecuritiesFinancingStatusAdviceV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason28
	 * StatusAndReason28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<StatusAndReason28> forStatusAndReason28 = new MMConstraint<StatusAndReason28>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			owner_lazy = () -> StatusAndReason28.mmObject();
		}

		@Override
		public void executeValidator(StatusAndReason28 obj) throws Exception {
			checkStatusAndReason28(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Status18Choice
	 * Status18Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Status18Choice> forStatus18Choice = new MMConstraint<Status18Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			owner_lazy = () -> Status18Choice.mmObject();
		}

		@Override
		public void executeValidator(Status18Choice obj) throws Exception {
			checkStatus18Choice(obj);
		}
	};

	/**
	 * If settlement status/reason is present alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void check_sese_SecuritiesSettlementTransactionStatusAdviceV09(SecuritiesSettlementTransactionStatusAdviceV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementStatus is present alone, then it means that the transaction
	 * is matched (if a matching process exists in the concerned market or at
	 * the concerned account servicer).
	 */
	public static void check_sese_SecuritiesFinancingStatusAdviceV07(SecuritiesFinancingStatusAdviceV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void checkStatusAndReason28(StatusAndReason28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void checkStatus18Choice(Status18Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}