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
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV08;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV08;
import com.tools20022.repository.msg.SecuritiesTradeDetails71;
import com.tools20022.repository.msg.TransactionDetails103;
import com.tools20022.repository.msg.TransactionDetails104;
import com.tools20022.repository.msg.TransactionDetails105;

/**
 * For settlement of two parts transactions (Securities Financing), the
 * opening/initiation and closing/return of the transaction is alleged by
 * sending the below combination of
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
 * SettlementParameters/SecuritiesTransactionType codes:<br>
 * <br>
 * Repo Opening<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)<br>
 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
 * Repo Closing<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)<br>
 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
 * <br>
 * Reverse Repo Opening<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)<br>
 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
 * Reverse Repo Closing<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) <br>
 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
 * <br>
 * TriParty Repo Opening<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)<br>
 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
 * TriParty Repo Closing<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)<br>
 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
 * <br>
 * TriParty Reverse Repo Opening<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)<br>
 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)<br>
 * TriParty Reverse Repo Closing<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) <br>
 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)<br>
 * <br>
 * Securities Lending Initiation<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)<br>
 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
 * Securities Lending Return<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)<br>
 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
 * <br>
 * Securities Borrowing Initiation<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)<br>
 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)<br>
 * Securities Borrowing Return<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) <br>
 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).
 */
public class ConstraintTwoLegTransactionOpeningClosing1Rule {

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
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV07> for_sese_SecuritiesSettlementTransactionAllegementNotificationV07 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71
	 * SecuritiesTradeDetails71}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails71> forSecuritiesTradeDetails71 = new MMConstraint<SecuritiesTradeDetails71>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails103
	 * TransactionDetails103}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails103> forTransactionDetails103 = new MMConstraint<TransactionDetails103>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails103.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails103 obj) throws Exception {
			checkTransactionDetails103(obj);
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
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV08> for_sese_SecuritiesSettlementTransactionConfirmationV08 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails105
	 * TransactionDetails105}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails105> forTransactionDetails105 = new MMConstraint<TransactionDetails105>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails105.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails105 obj) throws Exception {
			checkTransactionDetails105(obj);
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
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV08> for_sese_SecuritiesSettlementTransactionInstructionV08 = new MMConstraint<SecuritiesSettlementTransactionInstructionV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails104
	 * TransactionDetails104}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails104> forTransactionDetails104 = new MMConstraint<TransactionDetails104>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails104.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails104 obj) throws Exception {
			checkTransactionDetails104(obj);
		}
	};

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionAllegementNotificationV07(SecuritiesSettlementTransactionAllegementNotificationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkSecuritiesTradeDetails71(SecuritiesTradeDetails71 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails103(TransactionDetails103 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of
	 * TransactionIdentificationDetails/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionConfirmationV08(SecuritiesSettlementTransactionConfirmationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails105(TransactionDetails105 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is instructed by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstructionV08(SecuritiesSettlementTransactionInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails104(TransactionDetails104 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}