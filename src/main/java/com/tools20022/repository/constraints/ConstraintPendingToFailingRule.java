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
import com.tools20022.repository.choice.SettlementStatus16Choice;
import com.tools20022.repository.choice.SettlementStatus17Choice;
import com.tools20022.repository.choice.SettlementStatus18Choice;
import com.tools20022.repository.choice.Status18Choice;

/**
 * A pending transaction (PEND) becomes a failing transaction (PENF) on the
 * settlement date instructed in the message, during the end of day reporting.
 */
public class ConstraintPendingToFailingRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus18Choice
	 * SettlementStatus18Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingToFailingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementStatus18Choice> forSettlementStatus18Choice = new MMConstraint<SettlementStatus18Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingToFailingRule";
			definition = "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting.";
			owner_lazy = () -> SettlementStatus18Choice.mmObject();
		}

		@Override
		public void executeValidator(SettlementStatus18Choice obj) throws Exception {
			checkSettlementStatus18Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus16Choice
	 * SettlementStatus16Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingToFailingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementStatus16Choice> forSettlementStatus16Choice = new MMConstraint<SettlementStatus16Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingToFailingRule";
			definition = "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting.";
			owner_lazy = () -> SettlementStatus16Choice.mmObject();
		}

		@Override
		public void executeValidator(SettlementStatus16Choice obj) throws Exception {
			checkSettlementStatus16Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus17Choice
	 * SettlementStatus17Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingToFailingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementStatus17Choice> forSettlementStatus17Choice = new MMConstraint<SettlementStatus17Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingToFailingRule";
			definition = "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting.";
			owner_lazy = () -> SettlementStatus17Choice.mmObject();
		}

		@Override
		public void executeValidator(SettlementStatus17Choice obj) throws Exception {
			checkSettlementStatus17Choice(obj);
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
	 * name} = "PendingToFailingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Status18Choice> forStatus18Choice = new MMConstraint<Status18Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingToFailingRule";
			definition = "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting.";
			owner_lazy = () -> Status18Choice.mmObject();
		}

		@Override
		public void executeValidator(Status18Choice obj) throws Exception {
			checkStatus18Choice(obj);
		}
	};

	/**
	 * A pending transaction (PEND) becomes a failing transaction (PENF) on the
	 * settlement date instructed in the message, during the end of day
	 * reporting.
	 */
	public static void checkSettlementStatus18Choice(SettlementStatus18Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * A pending transaction (PEND) becomes a failing transaction (PENF) on the
	 * settlement date instructed in the message, during the end of day
	 * reporting.
	 */
	public static void checkSettlementStatus16Choice(SettlementStatus16Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * A pending transaction (PEND) becomes a failing transaction (PENF) on the
	 * settlement date instructed in the message, during the end of day
	 * reporting.
	 */
	public static void checkSettlementStatus17Choice(SettlementStatus17Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * A pending transaction (PEND) becomes a failing transaction (PENF) on the
	 * settlement date instructed in the message, during the end of day
	 * reporting.
	 */
	public static void checkStatus18Choice(Status18Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}