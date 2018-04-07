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
import com.tools20022.repository.msg.DocumentNumber12;

/**
 * The reference used to identify the transaction must be in line with the
 * identification available for the status advice requested by the
 * SecuritiesTransactionStatusQuery. For example, a
 * SecuritiesTransactionStatusQuery must not request a
 * SecuritiesSettlementTransactionStatusAdvice using a
 * CorporateActionEventIdentification.
 */
public class ConstraintReferenceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DocumentNumber12
	 * DocumentNumber12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The reference used to identify the transaction must be in line with the identification available for the status advice requested by the SecuritiesTransactionStatusQuery. For example, a SecuritiesTransactionStatusQuery must not request a SecuritiesSettlementTransactionStatusAdvice using a CorporateActionEventIdentification."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DocumentNumber12> forDocumentNumber12 = new MMConstraint<DocumentNumber12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceRule";
			definition = "The reference used to identify the transaction must be in line with the identification available for the status advice requested by the SecuritiesTransactionStatusQuery. For example, a SecuritiesTransactionStatusQuery must not request a SecuritiesSettlementTransactionStatusAdvice using a CorporateActionEventIdentification.";
			owner_lazy = () -> DocumentNumber12.mmObject();
		}

		@Override
		public void executeValidator(DocumentNumber12 obj) throws Exception {
			checkDocumentNumber12(obj);
		}
	};

	/**
	 * The reference used to identify the transaction must be in line with the
	 * identification available for the status advice requested by the
	 * SecuritiesTransactionStatusQuery. For example, a
	 * SecuritiesTransactionStatusQuery must not request a
	 * SecuritiesSettlementTransactionStatusAdvice using a
	 * CorporateActionEventIdentification.
	 */
	public static void checkDocumentNumber12(DocumentNumber12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}