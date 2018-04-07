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
 * If LateDeliveryDate is present then the transaction must be a pool trades
 * that result from the original TBA (To Be Announced). The original TBA would
 * be offset by an opposite transaction and replaced by buys or sells of
 * individual pools. It is a date greater than the settlement date stated in the
 * trade, for pools designed as settling late.
 */
public class ConstraintLateDeliveryDateRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71
	 * SecuritiesTradeDetails71}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is present then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails71> forSecuritiesTradeDetails71 = new MMConstraint<SecuritiesTradeDetails71>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is present then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails71.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails71 obj) throws Exception {
			checkSecuritiesTradeDetails71(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails79
	 * SecuritiesTradeDetails79}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails79> forSecuritiesTradeDetails79 = new MMConstraint<SecuritiesTradeDetails79>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails79.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails79 obj) throws Exception {
			checkSecuritiesTradeDetails79(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails73
	 * SecuritiesTradeDetails73}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails73> forSecuritiesTradeDetails73 = new MMConstraint<SecuritiesTradeDetails73>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails73.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails73 obj) throws Exception {
			checkSecuritiesTradeDetails73(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails75
	 * SecuritiesTradeDetails75}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is present, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails75> forSecuritiesTradeDetails75 = new MMConstraint<SecuritiesTradeDetails75>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is present, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails75.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails75 obj) throws Exception {
			checkSecuritiesTradeDetails75(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails80
	 * SecuritiesTradeDetails80}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails80> forSecuritiesTradeDetails80 = new MMConstraint<SecuritiesTradeDetails80>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails80.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails80 obj) throws Exception {
			checkSecuritiesTradeDetails80(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails78
	 * SecuritiesTradeDetails78}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails78> forSecuritiesTradeDetails78 = new MMConstraint<SecuritiesTradeDetails78>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails78.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails78 obj) throws Exception {
			checkSecuritiesTradeDetails78(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails104
	 * TransactionDetails104}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is present then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails104> forTransactionDetails104 = new MMConstraint<TransactionDetails104>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is present then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> TransactionDetails104.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails104 obj) throws Exception {
			checkTransactionDetails104(obj);
		}
	};

	/**
	 * If LateDeliveryDate is present then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails71(SecuritiesTradeDetails71 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails79(SecuritiesTradeDetails79 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails73(SecuritiesTradeDetails73 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is present, then the transaction must be a pool
	 * trades that result from the original TBA (To Be Announced). The original
	 * TBA would be offset by an opposite transaction and replaced by buys or
	 * sells of individual pools. It is a date greater than the settlement date
	 * stated in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails75(SecuritiesTradeDetails75 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails80(SecuritiesTradeDetails80 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails78(SecuritiesTradeDetails78 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is present then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkTransactionDetails104(TransactionDetails104 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}