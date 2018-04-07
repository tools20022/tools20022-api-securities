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
import com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35;
import com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16;

/**
 * For transactions settling in two legs (Securities Financing), the
 * opening/initiation and closing/return information of the transaction is
 * provided by sending the below combination of SecuritiesMovementType codes and
 * SecuritiesFinancingTransactionType codes:<br>
 * <br>
 * Repo Opening<br>
 * SecuritiesMovementType: Delivery (DELI)<br>
 * SecuritiesFinancingTransactionType: Repo (REPU)<br>
 * Repo Closing<br>
 * SecuritiesMovementType: Receive (RECE)<br>
 * SecuritiesFinancingTransactionType: Repo (REPU)<br>
 * <br>
 * Reverse Repo Opening<br>
 * SecuritiesMovementType: Receive (RECE)<br>
 * SecuritiesFinancingTransactionType: ReverseRepo (RVPO)<br>
 * Reverse Repo Closing<br>
 * SecuritiesMovementType: Delivery (DELI) <br>
 * SecuritiesFinancingTransactionType: ReverseRepo (RVPO)<br>
 * <br>
 * Securities Lending Initiation<br>
 * SecuritiesMovementType: Delivery (DELI)<br>
 * SecuritiesFinancingTransactionType: SecuritiesLending (SECL)<br>
 * Securities Lending Return<br>
 * SecuritiesMovementType: Receive (RECE)<br>
 * SecuritiesFinancingTransactionType: SecuritiesLending (SECL)<br>
 * <br>
 * Securities Borrowing Initiation<br>
 * SecuritiesMovementType: Receive (RECE)<br>
 * SecuritiesFinancingTransactionType: SecuritiesBorrowing (SECB)<br>
 * Securities Borrowing Return<br>
 * SecuritiesMovementType: Delivery (DELI) <br>
 * SecuritiesFinancingTransactionType: SecuritiesBorrowing (SECB).
 */
public class ConstraintTwoLegTransactionOpeningClosingRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16
	 * TransactionTypeAndAdditionalParameters16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSecuritiesFinancingTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSecuritiesFinancingTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSecuritiesFinancingTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSecuritiesFinancingTransactionType: ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSecuritiesFinancingTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSecuritiesFinancingTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSecuritiesFinancingTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSecuritiesFinancingTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionTypeAndAdditionalParameters16> forTransactionTypeAndAdditionalParameters16 = new MMConstraint<TransactionTypeAndAdditionalParameters16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosingRule";
			definition = "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSecuritiesFinancingTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSecuritiesFinancingTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSecuritiesFinancingTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSecuritiesFinancingTransactionType: ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSecuritiesFinancingTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSecuritiesFinancingTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSecuritiesFinancingTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSecuritiesFinancingTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionTypeAndAdditionalParameters16.mmObject();
		}

		@Override
		public void executeValidator(TransactionTypeAndAdditionalParameters16 obj) throws Exception {
			checkTransactionTypeAndAdditionalParameters16(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSecuritiesFinancingTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSecuritiesFinancingTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSecuritiesFinancingTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSecuritiesFinancingTransactionType: ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSecuritiesFinancingTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSecuritiesFinancingTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSecuritiesFinancingTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSecuritiesFinancingTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails35> forSecuritiesFinancingTransactionDetails35 = new MMConstraint<SecuritiesFinancingTransactionDetails35>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosingRule";
			definition = "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSecuritiesFinancingTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSecuritiesFinancingTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSecuritiesFinancingTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSecuritiesFinancingTransactionType: ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSecuritiesFinancingTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSecuritiesFinancingTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSecuritiesFinancingTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSecuritiesFinancingTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingTransactionDetails35 obj) throws Exception {
			checkSecuritiesFinancingTransactionDetails35(obj);
		}
	};

	/**
	 * For transactions settling in two legs (Securities Financing), the
	 * opening/initiation and closing/return information of the transaction is
	 * provided by sending the below combination of SecuritiesMovementType codes
	 * and SecuritiesFinancingTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType: SecuritiesBorrowing (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType: SecuritiesBorrowing (SECB).
	 */
	public static void checkTransactionTypeAndAdditionalParameters16(TransactionTypeAndAdditionalParameters16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For transactions settling in two legs (Securities Financing), the
	 * opening/initiation and closing/return information of the transaction is
	 * provided by sending the below combination of SecuritiesMovementType codes
	 * and SecuritiesFinancingTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType: SecuritiesBorrowing (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType: SecuritiesBorrowing (SECB).
	 */
	public static void checkSecuritiesFinancingTransactionDetails35(SecuritiesFinancingTransactionDetails35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}