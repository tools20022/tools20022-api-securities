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
 * For settlement of two parts transactions (buy-sell back, sell buy-back,
 * collateral in and out), the opening/initiation and closing/return of the
 * transaction is alleged by sending the below combination of
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
 * SettlementParameters/SecuritiesTransactionType codes:<br>
 * <br>
 * Sell-Buy Back: Sell<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)<br>
 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
 * Sell-Buy Back: Buy Back<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)<br>
 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
 * <br>
 * Buy-Sell Back: Buy<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)<br>
 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
 * Buy-Sell Back: Sell Back<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) <br>
 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
 * <br>
 * Collateral (giver) Out Initiation<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)<br>
 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
 * Collateral (giver) Out Return<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)<br>
 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
 * <br>
 * Collateral (taker) In Initiation<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)<br>
 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
 * Collateral (taker) In Return<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) <br>
 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
 */
public class ConstraintTwoLegTransactionOpeningClosing2Rule {

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
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV07> for_sese_SecuritiesSettlementTransactionAllegementNotificationV07 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
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
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails71> forSecuritiesTradeDetails71 = new MMConstraint<SecuritiesTradeDetails71>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
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
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails103> forTransactionDetails103 = new MMConstraint<TransactionDetails103>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
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
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV08> for_sese_SecuritiesSettlementTransactionConfirmationV08 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
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
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails105> forTransactionDetails105 = new MMConstraint<TransactionDetails105>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
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
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV08> for_sese_SecuritiesSettlementTransactionInstructionV08 = new MMConstraint<SecuritiesSettlementTransactionInstructionV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
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
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails104> forTransactionDetails104 = new MMConstraint<TransactionDetails104>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails104.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails104 obj) throws Exception {
			checkTransactionDetails104(obj);
		}
	};

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is alleged by sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void check_sese_SecuritiesSettlementTransactionAllegementNotificationV07(SecuritiesSettlementTransactionAllegementNotificationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is alleged by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesTradeDetails71(SecuritiesTradeDetails71 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is confirmed by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails103(TransactionDetails103 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is confirmed by sending the below combination of
	 * TransactionIdentificationDetails/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void check_sese_SecuritiesSettlementTransactionConfirmationV08(SecuritiesSettlementTransactionConfirmationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails105(TransactionDetails105 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is instructed by sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstructionV08(SecuritiesSettlementTransactionInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails104(TransactionDetails104 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}