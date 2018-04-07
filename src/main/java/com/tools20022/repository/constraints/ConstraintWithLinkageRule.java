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
import com.tools20022.repository.choice.ProcessingPosition7Choice;
import com.tools20022.repository.choice.ProcessingPosition8Choice;

/**
 * If Code WITH is used, then the one or more instruction which are linked
 * become bound and which must be executed together. Even if one single
 * transactions/instructions/notifications can not be executed, then all the
 * other transactions/instructions/notifications must also be kept pending.
 * Therefore the use of code WITH must be limited to combine up to 2 or 3
 * transactions/instructions/notifications.
 */
public class ConstraintWithLinkageRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingPosition7Choice
	 * ProcessingPosition7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithLinkageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code WITH is used, then the one or more instruction which are linked become bound and which must be executed together. Even if one single transactions/instructions/notifications can not be executed, then all the other transactions/instructions/notifications must also be kept pending. Therefore the use of code WITH must be limited to combine up to 2 or 3 transactions/instructions/notifications."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ProcessingPosition7Choice> forProcessingPosition7Choice = new MMConstraint<ProcessingPosition7Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithLinkageRule";
			definition = "If Code WITH is used, then the one or more instruction which are linked become bound and which must be executed together. Even if one single transactions/instructions/notifications can not be executed, then all the other transactions/instructions/notifications must also be kept pending. Therefore the use of code WITH must be limited to combine up to 2 or 3 transactions/instructions/notifications.";
			owner_lazy = () -> ProcessingPosition7Choice.mmObject();
		}

		@Override
		public void executeValidator(ProcessingPosition7Choice obj) throws Exception {
			checkProcessingPosition7Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingPosition8Choice
	 * ProcessingPosition8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithLinkageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code WITH is used, then the one or more instruction which are linked become bound and which must be executed together. Even if one single transactions/instructions/notifications can not be executed, then all the other transactions/instructions/notifications must also be kept pending. Therefore the use of code WITH must be limited to combine up to 2 or 3 transactions/instructions/notifications."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ProcessingPosition8Choice> forProcessingPosition8Choice = new MMConstraint<ProcessingPosition8Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithLinkageRule";
			definition = "If Code WITH is used, then the one or more instruction which are linked become bound and which must be executed together. Even if one single transactions/instructions/notifications can not be executed, then all the other transactions/instructions/notifications must also be kept pending. Therefore the use of code WITH must be limited to combine up to 2 or 3 transactions/instructions/notifications.";
			owner_lazy = () -> ProcessingPosition8Choice.mmObject();
		}

		@Override
		public void executeValidator(ProcessingPosition8Choice obj) throws Exception {
			checkProcessingPosition8Choice(obj);
		}
	};

	/**
	 * If Code WITH is used, then the one or more instruction which are linked
	 * become bound and which must be executed together. Even if one single
	 * transactions/instructions/notifications can not be executed, then all the
	 * other transactions/instructions/notifications must also be kept pending.
	 * Therefore the use of code WITH must be limited to combine up to 2 or 3
	 * transactions/instructions/notifications.
	 */
	public static void checkProcessingPosition7Choice(ProcessingPosition7Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code WITH is used, then the one or more instruction which are linked
	 * become bound and which must be executed together. Even if one single
	 * transactions/instructions/notifications can not be executed, then all the
	 * other transactions/instructions/notifications must also be kept pending.
	 * Therefore the use of code WITH must be limited to combine up to 2 or 3
	 * transactions/instructions/notifications.
	 */
	public static void checkProcessingPosition8Choice(ProcessingPosition8Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}