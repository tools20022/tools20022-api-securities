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
import com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV05;
import com.tools20022.repository.msg.*;

/**
 * If no reference is available for the AccountOwnerTransactionIdentification,
 * for example, the transaction was sent by fax, then the
 * AccountOwnerTransactionIdentification must be NONREF.
 */
public class ConstraintNoAccountOwnerTransactionIdentificationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications29
	 * TransactionIdentifications29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications29> forTransactionIdentifications29 = new MMConstraint<TransactionIdentifications29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> TransactionIdentifications29.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications29 obj) throws Exception {
			checkTransactionIdentifications29(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails106
	 * TransactionDetails106}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails106> forTransactionDetails106 = new MMConstraint<TransactionDetails106>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> TransactionDetails106.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails106 obj) throws Exception {
			checkTransactionDetails106(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV05
	 * SecuritiesTransactionCancellationRequestV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionCancellationRequestV05> for_sese_SecuritiesTransactionCancellationRequestV05 = new MMConstraint<SecuritiesTransactionCancellationRequestV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> SecuritiesTransactionCancellationRequestV05.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionCancellationRequestV05 obj) throws Exception {
			check_sese_SecuritiesTransactionCancellationRequestV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction62 Transaction62}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction62> forTransaction62 = new MMConstraint<Transaction62>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction62.mmObject();
		}

		@Override
		public void executeValidator(Transaction62 obj) throws Exception {
			checkTransaction62(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction60 Transaction60}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction60> forTransaction60 = new MMConstraint<Transaction60>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction60.mmObject();
		}

		@Override
		public void executeValidator(Transaction60 obj) throws Exception {
			checkTransaction60(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications31
	 * TransactionIdentifications31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications31> forTransactionIdentifications31 = new MMConstraint<TransactionIdentifications31>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> TransactionIdentifications31.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications31 obj) throws Exception {
			checkTransactionIdentifications31(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications32
	 * TransactionIdentifications32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications32> forTransactionIdentifications32 = new MMConstraint<TransactionIdentifications32>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> TransactionIdentifications32.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications32 obj) throws Exception {
			checkTransactionIdentifications32(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications30
	 * TransactionIdentifications30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications30> forTransactionIdentifications30 = new MMConstraint<TransactionIdentifications30>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> TransactionIdentifications30.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications30 obj) throws Exception {
			checkTransactionIdentifications30(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications33
	 * TransactionIdentifications33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications33> forTransactionIdentifications33 = new MMConstraint<TransactionIdentifications33>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> TransactionIdentifications33.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications33 obj) throws Exception {
			checkTransactionIdentifications33(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification19
	 * SettlementTypeAndIdentification19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementTypeAndIdentification19> forSettlementTypeAndIdentification19 = new MMConstraint<SettlementTypeAndIdentification19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> SettlementTypeAndIdentification19.mmObject();
		}

		@Override
		public void executeValidator(SettlementTypeAndIdentification19 obj) throws Exception {
			checkSettlementTypeAndIdentification19(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction61 Transaction61}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction61> forTransaction61 = new MMConstraint<Transaction61>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction61.mmObject();
		}

		@Override
		public void executeValidator(Transaction61 obj) throws Exception {
			checkTransaction61(obj);
		}
	};

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications29(TransactionIdentifications29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, then the
	 * AccountOwnerTransactionIdentification must be NONREF.
	 */
	public static void checkTransactionDetails106(TransactionDetails106 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, then the
	 * AccountOwnerTransactionIdentification must be NONREF.
	 */
	public static void check_sese_SecuritiesTransactionCancellationRequestV05(SecuritiesTransactionCancellationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction62(Transaction62 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction60(Transaction60 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications31(TransactionIdentifications31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications32(TransactionIdentifications32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications30(TransactionIdentifications30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, then the
	 * AccountOwnerTransactionIdentification must be NONREF.
	 */
	public static void checkTransactionIdentifications33(TransactionIdentifications33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkSettlementTypeAndIdentification19(SettlementTypeAndIdentification19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction61(Transaction61 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}