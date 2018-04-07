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
import com.tools20022.repository.msg.SettlementDetails146;

/**
 * For settlement of two parts transactions (Securities Financing, buy-sell
 * back, sell buy-back), the opening/initiation and closing/return of the
 * transaction will be confirmed by sending the below combination of
 * ReceiveDelivery codes and SettlementTransactionType codes:
 * 
 * Repo Opening ReceiveDelivery: Delivery (DELI) SettlementTransactionType: Repo
 * (REPU) Repo Closing ReceiveDelivery: Receive (RECE)
 * SettlementTransactionType: Repo (REPU)
 * 
 * Reverse Repo Opening ReceiveDelivery: Receive (RECE)
 * SettlementTransactionType: ReverseRepo (RVPO) Reverse Repo Closing
 * ReceiveDelivery: Delivery (DELI) SettlementTransactionType: ReverseRepo
 * (RVPO)
 * 
 * TriParty Repo Opening ReceiveDelivery: Delivery (DELI)
 * SettlementTransactionType: TriPartyRepo (TRPO) TriParty Repo Closing
 * ReceiveDelivery: Receive (RECE) SettlementTransactionType: TriPartyRepo
 * (TRPO)
 * 
 * TriParty Reverse Repo Opening ReceiveDelivery: Receive (RECE)
 * SettlementTransactionType: TriPartyReverseRepo (TRVO) TriParty Reverse Repo
 * Closing ReceiveDelivery: Delivery (DELI) SettlementTransactionType:
 * TriPartyReverseRepo (TRVO)
 * 
 * Securities Lending Initiation ReceiveDelivery: Delivery (DELI)
 * SettlementTransactionType: SecuritiesLending (SECL) Securities Lending Return
 * ReceiveDelivery: Receive (RECE) SettlementTransactionType: SecuritiesLending
 * (SECL)
 * 
 * Securities Borrowing Initiation ReceiveDelivery: Receive (RECE)
 * SettlementTransactionType: SecuritiesBorrowing (SECB) Securities Borrowing
 * Return ReceiveDelivery: Delivery (DELI) SettlementTransactionType:
 * SecuritiesBorrowing (SECB)
 * 
 * Sell-Buy Back: Sell ReceiveDelivery: Delivery (DELI)
 * SettlementTransactionType: SellBuyBack (SBBK) Sell-Buy Back: Buy Back
 * ReceiveDelivery: Receive (RECE) SettlementTransactionType: SellBuyBack (SBBK)
 * 
 * Buy-Sell Back: Buy ReceiveDelivery: Receive (RECE) SettlementTransactionType:
 * BuySellBack (BSBK) Buy-Sell Back: Sell Back ReceiveDelivery: Delivery (DELI)
 * SettlementTransactionType: BuySellBack (BSBK)
 * 
 * Collateral (giver) Out Initiation ReceiveDelivery: Delivery (DELI)
 * SettlementTransactionType: CollateralOut (COLO) Collateral (giver) Out Return
 * ReceiveDelivery: Receive (RECE) SettlementTransactionType: CollateralOut
 * (COLO)
 * 
 * Collateral (taker) In Initiation ReceiveDelivery: Receive (RECE)
 * SettlementTransactionType: CollateralIn (COLI) Collateral (taker) In Return
 * ReceiveDelivery: Delivery (DELI) SettlementTransactionType: CollateralIn
 * (COLI).
 */
public class ConstraintOpeningClosingUsageRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146
	 * SettlementDetails146}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningClosingUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing, buy-sell back, sell buy-back), the opening/initiation and closing/return of the transaction will be confirmed by sending the below combination of ReceiveDelivery codes and SettlementTransactionType codes:\n\nRepo Opening\nReceiveDelivery: Delivery (DELI)\nSettlementTransactionType: Repo (REPU)\nRepo Closing\nReceiveDelivery: Receive (RECE)\nSettlementTransactionType: Repo (REPU)\n\nReverse Repo Opening\nReceiveDelivery: Receive (RECE)\nSettlementTransactionType: ReverseRepo (RVPO)\nReverse Repo Closing\nReceiveDelivery: Delivery (DELI) \nSettlementTransactionType: ReverseRepo (RVPO)\n\nTriParty Repo Opening\nReceiveDelivery: Delivery (DELI)\nSettlementTransactionType: TriPartyRepo (TRPO)\nTriParty Repo Closing\nReceiveDelivery: Receive (RECE)\nSettlementTransactionType: TriPartyRepo (TRPO)\n\nTriParty Reverse Repo Opening\nReceiveDelivery: Receive (RECE)\nSettlementTransactionType: TriPartyReverseRepo (TRVO)\nTriParty Reverse Repo Closing\nReceiveDelivery: Delivery (DELI) \nSettlementTransactionType: TriPartyReverseRepo (TRVO)\n\nSecurities Lending Initiation\nReceiveDelivery: Delivery (DELI)\nSettlementTransactionType: SecuritiesLending (SECL)\nSecurities Lending Return\nReceiveDelivery: Receive (RECE)\nSettlementTransactionType: SecuritiesLending (SECL)\n\nSecurities Borrowing Initiation\nReceiveDelivery: Receive (RECE)\nSettlementTransactionType: SecuritiesBorrowing (SECB)\nSecurities Borrowing Return\nReceiveDelivery: Delivery (DELI) \nSettlementTransactionType: SecuritiesBorrowing (SECB)\n\nSell-Buy Back: Sell\nReceiveDelivery: Delivery (DELI)\nSettlementTransactionType: SellBuyBack (SBBK)\nSell-Buy Back: Buy Back\nReceiveDelivery: Receive (RECE)\nSettlementTransactionType: SellBuyBack (SBBK)\n\nBuy-Sell Back: Buy\nReceiveDelivery: Receive (RECE)\nSettlementTransactionType: BuySellBack (BSBK)\nBuy-Sell Back: Sell Back\nReceiveDelivery: Delivery (DELI) \nSettlementTransactionType: BuySellBack (BSBK)\n\nCollateral (giver) Out Initiation\nReceiveDelivery: Delivery (DELI)\nSettlementTransactionType: CollateralOut (COLO)\nCollateral (giver) Out Return\nReceiveDelivery: Receive (RECE)\nSettlementTransactionType: CollateralOut (COLO)\n\nCollateral (taker) In Initiation\nReceiveDelivery: Receive (RECE)\nSettlementTransactionType: CollateralIn (COLI)\nCollateral (taker) In Return\nReceiveDelivery: Delivery (DELI) \nSettlementTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails146> forSettlementDetails146 = new MMConstraint<SettlementDetails146>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningClosingUsageRule";
			definition = "For settlement of two parts transactions (Securities Financing, buy-sell back, sell buy-back), the opening/initiation and closing/return of the transaction will be confirmed by sending the below combination of ReceiveDelivery codes and SettlementTransactionType codes:\n\nRepo Opening\nReceiveDelivery: Delivery (DELI)\nSettlementTransactionType: Repo (REPU)\nRepo Closing\nReceiveDelivery: Receive (RECE)\nSettlementTransactionType: Repo (REPU)\n\nReverse Repo Opening\nReceiveDelivery: Receive (RECE)\nSettlementTransactionType: ReverseRepo (RVPO)\nReverse Repo Closing\nReceiveDelivery: Delivery (DELI) \nSettlementTransactionType: ReverseRepo (RVPO)\n\nTriParty Repo Opening\nReceiveDelivery: Delivery (DELI)\nSettlementTransactionType: TriPartyRepo (TRPO)\nTriParty Repo Closing\nReceiveDelivery: Receive (RECE)\nSettlementTransactionType: TriPartyRepo (TRPO)\n\nTriParty Reverse Repo Opening\nReceiveDelivery: Receive (RECE)\nSettlementTransactionType: TriPartyReverseRepo (TRVO)\nTriParty Reverse Repo Closing\nReceiveDelivery: Delivery (DELI) \nSettlementTransactionType: TriPartyReverseRepo (TRVO)\n\nSecurities Lending Initiation\nReceiveDelivery: Delivery (DELI)\nSettlementTransactionType: SecuritiesLending (SECL)\nSecurities Lending Return\nReceiveDelivery: Receive (RECE)\nSettlementTransactionType: SecuritiesLending (SECL)\n\nSecurities Borrowing Initiation\nReceiveDelivery: Receive (RECE)\nSettlementTransactionType: SecuritiesBorrowing (SECB)\nSecurities Borrowing Return\nReceiveDelivery: Delivery (DELI) \nSettlementTransactionType: SecuritiesBorrowing (SECB)\n\nSell-Buy Back: Sell\nReceiveDelivery: Delivery (DELI)\nSettlementTransactionType: SellBuyBack (SBBK)\nSell-Buy Back: Buy Back\nReceiveDelivery: Receive (RECE)\nSettlementTransactionType: SellBuyBack (SBBK)\n\nBuy-Sell Back: Buy\nReceiveDelivery: Receive (RECE)\nSettlementTransactionType: BuySellBack (BSBK)\nBuy-Sell Back: Sell Back\nReceiveDelivery: Delivery (DELI) \nSettlementTransactionType: BuySellBack (BSBK)\n\nCollateral (giver) Out Initiation\nReceiveDelivery: Delivery (DELI)\nSettlementTransactionType: CollateralOut (COLO)\nCollateral (giver) Out Return\nReceiveDelivery: Receive (RECE)\nSettlementTransactionType: CollateralOut (COLO)\n\nCollateral (taker) In Initiation\nReceiveDelivery: Receive (RECE)\nSettlementTransactionType: CollateralIn (COLI)\nCollateral (taker) In Return\nReceiveDelivery: Delivery (DELI) \nSettlementTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> SettlementDetails146.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails146 obj) throws Exception {
			checkSettlementDetails146(obj);
		}
	};

	/**
	 * For settlement of two parts transactions (Securities Financing, buy-sell
	 * back, sell buy-back), the opening/initiation and closing/return of the
	 * transaction will be confirmed by sending the below combination of
	 * ReceiveDelivery codes and SettlementTransactionType codes:
	 * 
	 * Repo Opening ReceiveDelivery: Delivery (DELI) SettlementTransactionType:
	 * Repo (REPU) Repo Closing ReceiveDelivery: Receive (RECE)
	 * SettlementTransactionType: Repo (REPU)
	 * 
	 * Reverse Repo Opening ReceiveDelivery: Receive (RECE)
	 * SettlementTransactionType: ReverseRepo (RVPO) Reverse Repo Closing
	 * ReceiveDelivery: Delivery (DELI) SettlementTransactionType: ReverseRepo
	 * (RVPO)
	 * 
	 * TriParty Repo Opening ReceiveDelivery: Delivery (DELI)
	 * SettlementTransactionType: TriPartyRepo (TRPO) TriParty Repo Closing
	 * ReceiveDelivery: Receive (RECE) SettlementTransactionType: TriPartyRepo
	 * (TRPO)
	 * 
	 * TriParty Reverse Repo Opening ReceiveDelivery: Receive (RECE)
	 * SettlementTransactionType: TriPartyReverseRepo (TRVO) TriParty Reverse
	 * Repo Closing ReceiveDelivery: Delivery (DELI) SettlementTransactionType:
	 * TriPartyReverseRepo (TRVO)
	 * 
	 * Securities Lending Initiation ReceiveDelivery: Delivery (DELI)
	 * SettlementTransactionType: SecuritiesLending (SECL) Securities Lending
	 * Return ReceiveDelivery: Receive (RECE) SettlementTransactionType:
	 * SecuritiesLending (SECL)
	 * 
	 * Securities Borrowing Initiation ReceiveDelivery: Receive (RECE)
	 * SettlementTransactionType: SecuritiesBorrowing (SECB) Securities
	 * Borrowing Return ReceiveDelivery: Delivery (DELI)
	 * SettlementTransactionType: SecuritiesBorrowing (SECB)
	 * 
	 * Sell-Buy Back: Sell ReceiveDelivery: Delivery (DELI)
	 * SettlementTransactionType: SellBuyBack (SBBK) Sell-Buy Back: Buy Back
	 * ReceiveDelivery: Receive (RECE) SettlementTransactionType: SellBuyBack
	 * (SBBK)
	 * 
	 * Buy-Sell Back: Buy ReceiveDelivery: Receive (RECE)
	 * SettlementTransactionType: BuySellBack (BSBK) Buy-Sell Back: Sell Back
	 * ReceiveDelivery: Delivery (DELI) SettlementTransactionType: BuySellBack
	 * (BSBK)
	 * 
	 * Collateral (giver) Out Initiation ReceiveDelivery: Delivery (DELI)
	 * SettlementTransactionType: CollateralOut (COLO) Collateral (giver) Out
	 * Return ReceiveDelivery: Receive (RECE) SettlementTransactionType:
	 * CollateralOut (COLO)
	 * 
	 * Collateral (taker) In Initiation ReceiveDelivery: Receive (RECE)
	 * SettlementTransactionType: CollateralIn (COLI) Collateral (taker) In
	 * Return ReceiveDelivery: Delivery (DELI) SettlementTransactionType:
	 * CollateralIn (COLI).
	 */
	public static void checkSettlementDetails146(SettlementDetails146 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}