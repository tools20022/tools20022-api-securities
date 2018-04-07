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
 * CurrencyToBuyOrSell in the TradeDetails message component, provides an
 * instruction to the account servicer to execute a foreign exchange deal on
 * behalf of the account owner. The purpose of the forex deal is to fund the
 * purchase of securities. This field is not to be used when standing
 * instructions have been established. <br>
 * <br>
 * If CurrencyToSell is used, then it implies the following:<br>
 * - the instruction is to receive.<br>
 * - the currency required for funding a purchase of securities, eg, the
 * currency to be purchased, is the currency of the settlement amount. The
 * currency to be sold to obtain settlement currency is provided by the currency
 * to sell message element. Normally, this is the base currency of the
 * portfolio. <br>
 * - the amount of currency to be bought is equal to the settlement amount of
 * the transaction. This implies the forex will not be used for other
 * transactions and that a bulk forex deal must be instructed by other means. <br>
 * - a forex deal to fund the purchase of securities should be executed in time
 * for the currency to be available on the settlement date of the securities
 * transaction. <br>
 * - a bilateral agreement regarding the use of this field has been established.<br>
 * <br>
 * If CurrencyToBuy is used, then it implies the following:<br>
 * - the instruction is to delivery<br>
 * - the currency received as proceeds from the sale of securities, eg, the
 * currency to be sold, is the currency of the settlement amount. The currency
 * to be bought is provided by the currency to buy message element. If proceeds
 * are repatriated, this is in the base currency of the portfolio. <br>
 * - the amount of currency to be sold is equal to the settlement amount of the
 * transaction. This implies a bulk forex deal must be instructed by other
 * means. <br>
 * - a forex deal to repatriate proceeds after the sale of securities should be
 * executed for the soonest possible value date after settlement of the
 * securities, as permitted by market convention. <br>
 * - a bilateral agreement regarding the use of this field has been established.
 */
public class ConstraintCurrencyToBuyOrSellRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Order18 Order18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuyOrSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \r\n\r\nIf CurrencyToSell is used, then it implies the following:\r\n- the instruction is to receive.\r\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \r\n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \r\n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \r\n- a bilateral agreement regarding the use of this field has been established.\r\n\r\nIf CurrencyToBuy is used, then it implies the following:\r\n- the instruction is to delivery\r\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \r\n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \r\n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \r\n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Order18> forOrder18 = new MMConstraint<Order18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuyOrSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \r\n\r\nIf CurrencyToSell is used, then it implies the following:\r\n- the instruction is to receive.\r\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \r\n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \r\n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \r\n- a bilateral agreement regarding the use of this field has been established.\r\n\r\nIf CurrencyToBuy is used, then it implies the following:\r\n- the instruction is to delivery\r\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \r\n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \r\n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \r\n- a bilateral agreement regarding the use of this field has been established.";
			owner_lazy = () -> Order18.mmObject();
		}

		@Override
		public void executeValidator(Order18 obj) throws Exception {
			checkOrder18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails77
	 * SecuritiesTradeDetails77}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \r\n\r\nIf CurrencyToSell is used, then it implies the following:\r\n- the instruction is a receive.\r\n- the currency required for funding a purchase of securities, for example, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \r\n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \r\n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \r\n- a bilateral agreement regarding the use of this field has been established.\r\n\r\nIf CurrencyToBuy is used, then it implies the following:\r\n- the instruction is a delivery\r\n- the currency received as proceeds from the sale of securities, for example, the currency to be sold, is the currency of the settlement amount. The currency to be bought is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \r\n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \r\n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \r\n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails77> forSecuritiesTradeDetails77 = new MMConstraint<SecuritiesTradeDetails77>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \r\n\r\nIf CurrencyToSell is used, then it implies the following:\r\n- the instruction is a receive.\r\n- the currency required for funding a purchase of securities, for example, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \r\n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \r\n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \r\n- a bilateral agreement regarding the use of this field has been established.\r\n\r\nIf CurrencyToBuy is used, then it implies the following:\r\n- the instruction is a delivery\r\n- the currency received as proceeds from the sale of securities, for example, the currency to be sold, is the currency of the settlement amount. The currency to be bought is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \r\n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \r\n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \r\n- a bilateral agreement regarding the use of this field has been established.";
			owner_lazy = () -> SecuritiesTradeDetails77.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails77 obj) throws Exception {
			checkSecuritiesTradeDetails77(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails74
	 * SecuritiesTradeDetails74}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \r\n\r\nIf CurrencyToSell is used, then it implies the following:\r\n- the instruction is a receive.\r\n- the currency required for funding a purchase of securities, for example, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \r\n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \r\n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \r\n- a bilateral agreement regarding the use of this field has been established.\r\n\r\nIf CurrencyToBuy is used, then it implies the following:\r\n- the instruction is a delivery\r\n- the currency received as proceeds from the sale of securities, for example, the currency to be sold, is the currency of the settlement amount. The currency to be bought is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \r\n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \r\n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \r\n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails74> forSecuritiesTradeDetails74 = new MMConstraint<SecuritiesTradeDetails74>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \r\n\r\nIf CurrencyToSell is used, then it implies the following:\r\n- the instruction is a receive.\r\n- the currency required for funding a purchase of securities, for example, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \r\n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \r\n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \r\n- a bilateral agreement regarding the use of this field has been established.\r\n\r\nIf CurrencyToBuy is used, then it implies the following:\r\n- the instruction is a delivery\r\n- the currency received as proceeds from the sale of securities, for example, the currency to be sold, is the currency of the settlement amount. The currency to be bought is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \r\n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \r\n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \r\n- a bilateral agreement regarding the use of this field has been established.";
			owner_lazy = () -> SecuritiesTradeDetails74.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails74 obj) throws Exception {
			checkSecuritiesTradeDetails74(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Order17 Order17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuyOrSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \r\n\r\nIf CurrencyToSell is used, then it implies the following:\r\n- the instruction is to receive.\r\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \r\n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \r\n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \r\n- a bilateral agreement regarding the use of this field has been established.\r\n\r\nIf CurrencyToBuy is used, then it implies the following:\r\n- the instruction is to delivery\r\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \r\n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \r\n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \r\n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Order17> forOrder17 = new MMConstraint<Order17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuyOrSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \r\n\r\nIf CurrencyToSell is used, then it implies the following:\r\n- the instruction is to receive.\r\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \r\n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \r\n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \r\n- a bilateral agreement regarding the use of this field has been established.\r\n\r\nIf CurrencyToBuy is used, then it implies the following:\r\n- the instruction is to delivery\r\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \r\n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \r\n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \r\n- a bilateral agreement regarding the use of this field has been established.";
			owner_lazy = () -> Order17.mmObject();
		}

		@Override
		public void executeValidator(Order17 obj) throws Exception {
			checkOrder17(obj);
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
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \r\n\r\nIf CurrencyToSell is used, then it implies the following:\r\n- the instruction is a receive.\r\n- the currency required for funding a purchase of securities, for example, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \r\n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \r\n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \r\n- a bilateral agreement regarding the use of this field has been established.\r\n\r\nIf CurrencyToBuy is used, then it implies the following:\r\n- the instruction is a delivery\r\n- the currency received as proceeds from the sale of securities, for example, the currency to be sold, is the currency of the settlement amount. The currency to be bought is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \r\n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \r\n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \r\n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails79> forSecuritiesTradeDetails79 = new MMConstraint<SecuritiesTradeDetails79>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \r\n\r\nIf CurrencyToSell is used, then it implies the following:\r\n- the instruction is a receive.\r\n- the currency required for funding a purchase of securities, for example, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \r\n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \r\n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \r\n- a bilateral agreement regarding the use of this field has been established.\r\n\r\nIf CurrencyToBuy is used, then it implies the following:\r\n- the instruction is a delivery\r\n- the currency received as proceeds from the sale of securities, for example, the currency to be sold, is the currency of the settlement amount. The currency to be bought is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \r\n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \r\n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \r\n- a bilateral agreement regarding the use of this field has been established.";
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
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \r\n\r\nIf CurrencyToSell is used, then it implies the following:\r\n- the instruction is a receive.\r\n- the currency required for funding a purchase of securities, for example, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \r\n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \r\n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \r\n- a bilateral agreement regarding the use of this field has been established.\r\n\r\nIf CurrencyToBuy is used, then it implies the following:\r\n- the instruction is a delivery\r\n- the currency received as proceeds from the sale of securities, for example, the currency to be sold, is the currency of the settlement amount. The currency to be bought is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \r\n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \r\n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \r\n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails73> forSecuritiesTradeDetails73 = new MMConstraint<SecuritiesTradeDetails73>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \r\n\r\nIf CurrencyToSell is used, then it implies the following:\r\n- the instruction is a receive.\r\n- the currency required for funding a purchase of securities, for example, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \r\n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \r\n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \r\n- a bilateral agreement regarding the use of this field has been established.\r\n\r\nIf CurrencyToBuy is used, then it implies the following:\r\n- the instruction is a delivery\r\n- the currency received as proceeds from the sale of securities, for example, the currency to be sold, is the currency of the settlement amount. The currency to be bought is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \r\n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \r\n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \r\n- a bilateral agreement regarding the use of this field has been established.";
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
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \r\n\r\nIf CurrencyToSell is used, then it implies the following:\r\n- the instruction is a receive.\r\n- the currency required for funding a purchase of securities, for example, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \r\n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \r\n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \r\n- a bilateral agreement regarding the use of this field has been established.\r\n\r\nIf CurrencyToBuy is used, then it implies the following:\r\n- the instruction is a delivery\r\n- the currency received as proceeds from the sale of securities, for example, the currency to be sold, is the currency of the settlement amount. The currency to be bought is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \r\n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \r\n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \r\n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails75> forSecuritiesTradeDetails75 = new MMConstraint<SecuritiesTradeDetails75>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \r\n\r\nIf CurrencyToSell is used, then it implies the following:\r\n- the instruction is a receive.\r\n- the currency required for funding a purchase of securities, for example, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \r\n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \r\n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \r\n- a bilateral agreement regarding the use of this field has been established.\r\n\r\nIf CurrencyToBuy is used, then it implies the following:\r\n- the instruction is a delivery\r\n- the currency received as proceeds from the sale of securities, for example, the currency to be sold, is the currency of the settlement amount. The currency to be bought is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \r\n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \r\n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \r\n- a bilateral agreement regarding the use of this field has been established.";
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails78
	 * SecuritiesTradeDetails78}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \r\n\r\nIf CurrencyToSell is used, then it implies the following:\r\n- the instruction is a receive.\r\n- the currency required for funding a purchase of securities, for example, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \r\n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \r\n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \r\n- a bilateral agreement regarding the use of this field has been established.\r\n\r\nIf CurrencyToBuy is used, then it implies the following:\r\n- the instruction is a delivery\r\n- the currency received as proceeds from the sale of securities, for example, the currency to be sold, is the currency of the settlement amount. The currency to be bought is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \r\n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \r\n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \r\n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails78> forSecuritiesTradeDetails78 = new MMConstraint<SecuritiesTradeDetails78>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \r\n\r\nIf CurrencyToSell is used, then it implies the following:\r\n- the instruction is a receive.\r\n- the currency required for funding a purchase of securities, for example, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \r\n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \r\n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \r\n- a bilateral agreement regarding the use of this field has been established.\r\n\r\nIf CurrencyToBuy is used, then it implies the following:\r\n- the instruction is a delivery\r\n- the currency received as proceeds from the sale of securities, for example, the currency to be sold, is the currency of the settlement amount. The currency to be bought is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \r\n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \r\n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \r\n- a bilateral agreement regarding the use of this field has been established.";
			owner_lazy = () -> SecuritiesTradeDetails78.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails78 obj) throws Exception {
			checkSecuritiesTradeDetails78(obj);
		}
	};

	/**
	 * CurrencyToBuyOrSell in the TradeDetails message component, provides an
	 * instruction to the account servicer to execute a foreign exchange deal on
	 * behalf of the account owner. The purpose of the forex deal is to fund the
	 * purchase of securities. This field is not to be used when standing
	 * instructions have been established. <br>
	 * <br>
	 * If CurrencyToSell is used, then it implies the following:<br>
	 * - the instruction is to receive.<br>
	 * - the currency required for funding a purchase of securities, eg, the
	 * currency to be purchased, is the currency of the settlement amount. The
	 * currency to be sold to obtain settlement currency is provided by the
	 * currency to sell message element. Normally, this is the base currency of
	 * the portfolio. <br>
	 * - the amount of currency to be bought is equal to the settlement amount
	 * of the transaction. This implies the forex will not be used for other
	 * transactions and that a bulk forex deal must be instructed by other
	 * means. <br>
	 * - a forex deal to fund the purchase of securities should be executed in
	 * time for the currency to be available on the settlement date of the
	 * securities transaction. <br>
	 * - a bilateral agreement regarding the use of this field has been
	 * established.<br>
	 * <br>
	 * If CurrencyToBuy is used, then it implies the following:<br>
	 * - the instruction is to delivery<br>
	 * - the currency received as proceeds from the sale of securities, eg, the
	 * currency to be sold, is the currency of the settlement amount. The
	 * currency to be bought is provided by the currency to buy message element.
	 * If proceeds are repatriated, this is in the base currency of the
	 * portfolio. <br>
	 * - the amount of currency to be sold is equal to the settlement amount of
	 * the transaction. This implies a bulk forex deal must be instructed by
	 * other means. <br>
	 * - a forex deal to repatriate proceeds after the sale of securities should
	 * be executed for the soonest possible value date after settlement of the
	 * securities, as permitted by market convention. <br>
	 * - a bilateral agreement regarding the use of this field has been
	 * established.
	 */
	public static void checkOrder18(Order18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established. <br>
	 * <br>
	 * If CurrencyToSell is used, then it implies the following:<br>
	 * - the instruction is a receive.<br>
	 * - the currency required for funding a purchase of securities, for
	 * example, the currency to be purchased, is the currency of the settlement
	 * amount. The currency to be sold to obtain settlement currency is provided
	 * by the currency to sell message element. Normally, this is the base
	 * currency of the portfolio. <br>
	 * - the amount of currency to be bought is equal to the settlement amount
	 * of the transaction. This implies the forex will not be used for other
	 * transactions and that a bulk forex deal must be instructed by other
	 * means. <br>
	 * - a forex deal to fund the purchase of securities should be executed in
	 * time for the currency to be available on the settlement date of the
	 * securities transaction. <br>
	 * - a bilateral agreement regarding the use of this field has been
	 * established.<br>
	 * <br>
	 * If CurrencyToBuy is used, then it implies the following:<br>
	 * - the instruction is a delivery<br>
	 * - the currency received as proceeds from the sale of securities, for
	 * example, the currency to be sold, is the currency of the settlement
	 * amount. The currency to be bought is provided by the currency to buy
	 * message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. <br>
	 * - the amount of currency to be sold is equal to the settlement amount of
	 * the transaction. This implies a bulk forex deal must be instructed by
	 * other means. <br>
	 * - a forex deal to repatriate proceeds after the sale of securities should
	 * be executed for the soonest possible value date after settlement of the
	 * securities, as permitted by market convention. <br>
	 * - a bilateral agreement regarding the use of this field has been
	 * established.
	 */
	public static void checkSecuritiesTradeDetails77(SecuritiesTradeDetails77 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established. <br>
	 * <br>
	 * If CurrencyToSell is used, then it implies the following:<br>
	 * - the instruction is a receive.<br>
	 * - the currency required for funding a purchase of securities, for
	 * example, the currency to be purchased, is the currency of the settlement
	 * amount. The currency to be sold to obtain settlement currency is provided
	 * by the currency to sell message element. Normally, this is the base
	 * currency of the portfolio. <br>
	 * - the amount of currency to be bought is equal to the settlement amount
	 * of the transaction. This implies the forex will not be used for other
	 * transactions and that a bulk forex deal must be instructed by other
	 * means. <br>
	 * - a forex deal to fund the purchase of securities should be executed in
	 * time for the currency to be available on the settlement date of the
	 * securities transaction. <br>
	 * - a bilateral agreement regarding the use of this field has been
	 * established.<br>
	 * <br>
	 * If CurrencyToBuy is used, then it implies the following:<br>
	 * - the instruction is a delivery<br>
	 * - the currency received as proceeds from the sale of securities, for
	 * example, the currency to be sold, is the currency of the settlement
	 * amount. The currency to be bought is provided by the currency to buy
	 * message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. <br>
	 * - the amount of currency to be sold is equal to the settlement amount of
	 * the transaction. This implies a bulk forex deal must be instructed by
	 * other means. <br>
	 * - a forex deal to repatriate proceeds after the sale of securities should
	 * be executed for the soonest possible value date after settlement of the
	 * securities, as permitted by market convention. <br>
	 * - a bilateral agreement regarding the use of this field has been
	 * established.
	 */
	public static void checkSecuritiesTradeDetails74(SecuritiesTradeDetails74 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuyOrSell in the TradeDetails message component, provides an
	 * instruction to the account servicer to execute a foreign exchange deal on
	 * behalf of the account owner. The purpose of the forex deal is to fund the
	 * purchase of securities. This field is not to be used when standing
	 * instructions have been established. <br>
	 * <br>
	 * If CurrencyToSell is used, then it implies the following:<br>
	 * - the instruction is to receive.<br>
	 * - the currency required for funding a purchase of securities, eg, the
	 * currency to be purchased, is the currency of the settlement amount. The
	 * currency to be sold to obtain settlement currency is provided by the
	 * currency to sell message element. Normally, this is the base currency of
	 * the portfolio. <br>
	 * - the amount of currency to be bought is equal to the settlement amount
	 * of the transaction. This implies the forex will not be used for other
	 * transactions and that a bulk forex deal must be instructed by other
	 * means. <br>
	 * - a forex deal to fund the purchase of securities should be executed in
	 * time for the currency to be available on the settlement date of the
	 * securities transaction. <br>
	 * - a bilateral agreement regarding the use of this field has been
	 * established.<br>
	 * <br>
	 * If CurrencyToBuy is used, then it implies the following:<br>
	 * - the instruction is to delivery<br>
	 * - the currency received as proceeds from the sale of securities, eg, the
	 * currency to be sold, is the currency of the settlement amount. The
	 * currency to be bought is provided by the currency to buy message element.
	 * If proceeds are repatriated, this is in the base currency of the
	 * portfolio. <br>
	 * - the amount of currency to be sold is equal to the settlement amount of
	 * the transaction. This implies a bulk forex deal must be instructed by
	 * other means. <br>
	 * - a forex deal to repatriate proceeds after the sale of securities should
	 * be executed for the soonest possible value date after settlement of the
	 * securities, as permitted by market convention. <br>
	 * - a bilateral agreement regarding the use of this field has been
	 * established.
	 */
	public static void checkOrder17(Order17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established. <br>
	 * <br>
	 * If CurrencyToSell is used, then it implies the following:<br>
	 * - the instruction is a receive.<br>
	 * - the currency required for funding a purchase of securities, for
	 * example, the currency to be purchased, is the currency of the settlement
	 * amount. The currency to be sold to obtain settlement currency is provided
	 * by the currency to sell message element. Normally, this is the base
	 * currency of the portfolio. <br>
	 * - the amount of currency to be bought is equal to the settlement amount
	 * of the transaction. This implies the forex will not be used for other
	 * transactions and that a bulk forex deal must be instructed by other
	 * means. <br>
	 * - a forex deal to fund the purchase of securities should be executed in
	 * time for the currency to be available on the settlement date of the
	 * securities transaction. <br>
	 * - a bilateral agreement regarding the use of this field has been
	 * established.<br>
	 * <br>
	 * If CurrencyToBuy is used, then it implies the following:<br>
	 * - the instruction is a delivery<br>
	 * - the currency received as proceeds from the sale of securities, for
	 * example, the currency to be sold, is the currency of the settlement
	 * amount. The currency to be bought is provided by the currency to buy
	 * message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. <br>
	 * - the amount of currency to be sold is equal to the settlement amount of
	 * the transaction. This implies a bulk forex deal must be instructed by
	 * other means. <br>
	 * - a forex deal to repatriate proceeds after the sale of securities should
	 * be executed for the soonest possible value date after settlement of the
	 * securities, as permitted by market convention. <br>
	 * - a bilateral agreement regarding the use of this field has been
	 * established.
	 */
	public static void checkSecuritiesTradeDetails79(SecuritiesTradeDetails79 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established. <br>
	 * <br>
	 * If CurrencyToSell is used, then it implies the following:<br>
	 * - the instruction is a receive.<br>
	 * - the currency required for funding a purchase of securities, for
	 * example, the currency to be purchased, is the currency of the settlement
	 * amount. The currency to be sold to obtain settlement currency is provided
	 * by the currency to sell message element. Normally, this is the base
	 * currency of the portfolio. <br>
	 * - the amount of currency to be bought is equal to the settlement amount
	 * of the transaction. This implies the forex will not be used for other
	 * transactions and that a bulk forex deal must be instructed by other
	 * means. <br>
	 * - a forex deal to fund the purchase of securities should be executed in
	 * time for the currency to be available on the settlement date of the
	 * securities transaction. <br>
	 * - a bilateral agreement regarding the use of this field has been
	 * established.<br>
	 * <br>
	 * If CurrencyToBuy is used, then it implies the following:<br>
	 * - the instruction is a delivery<br>
	 * - the currency received as proceeds from the sale of securities, for
	 * example, the currency to be sold, is the currency of the settlement
	 * amount. The currency to be bought is provided by the currency to buy
	 * message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. <br>
	 * - the amount of currency to be sold is equal to the settlement amount of
	 * the transaction. This implies a bulk forex deal must be instructed by
	 * other means. <br>
	 * - a forex deal to repatriate proceeds after the sale of securities should
	 * be executed for the soonest possible value date after settlement of the
	 * securities, as permitted by market convention. <br>
	 * - a bilateral agreement regarding the use of this field has been
	 * established.
	 */
	public static void checkSecuritiesTradeDetails73(SecuritiesTradeDetails73 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established. <br>
	 * <br>
	 * If CurrencyToSell is used, then it implies the following:<br>
	 * - the instruction is a receive.<br>
	 * - the currency required for funding a purchase of securities, for
	 * example, the currency to be purchased, is the currency of the settlement
	 * amount. The currency to be sold to obtain settlement currency is provided
	 * by the currency to sell message element. Normally, this is the base
	 * currency of the portfolio. <br>
	 * - the amount of currency to be bought is equal to the settlement amount
	 * of the transaction. This implies the forex will not be used for other
	 * transactions and that a bulk forex deal must be instructed by other
	 * means. <br>
	 * - a forex deal to fund the purchase of securities should be executed in
	 * time for the currency to be available on the settlement date of the
	 * securities transaction. <br>
	 * - a bilateral agreement regarding the use of this field has been
	 * established.<br>
	 * <br>
	 * If CurrencyToBuy is used, then it implies the following:<br>
	 * - the instruction is a delivery<br>
	 * - the currency received as proceeds from the sale of securities, for
	 * example, the currency to be sold, is the currency of the settlement
	 * amount. The currency to be bought is provided by the currency to buy
	 * message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. <br>
	 * - the amount of currency to be sold is equal to the settlement amount of
	 * the transaction. This implies a bulk forex deal must be instructed by
	 * other means. <br>
	 * - a forex deal to repatriate proceeds after the sale of securities should
	 * be executed for the soonest possible value date after settlement of the
	 * securities, as permitted by market convention. <br>
	 * - a bilateral agreement regarding the use of this field has been
	 * established.
	 */
	public static void checkSecuritiesTradeDetails75(SecuritiesTradeDetails75 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established. <br>
	 * <br>
	 * If CurrencyToSell is used, then it implies the following:<br>
	 * - the instruction is a receive.<br>
	 * - the currency required for funding a purchase of securities, for
	 * example, the currency to be purchased, is the currency of the settlement
	 * amount. The currency to be sold to obtain settlement currency is provided
	 * by the currency to sell message element. Normally, this is the base
	 * currency of the portfolio. <br>
	 * - the amount of currency to be bought is equal to the settlement amount
	 * of the transaction. This implies the forex will not be used for other
	 * transactions and that a bulk forex deal must be instructed by other
	 * means. <br>
	 * - a forex deal to fund the purchase of securities should be executed in
	 * time for the currency to be available on the settlement date of the
	 * securities transaction. <br>
	 * - a bilateral agreement regarding the use of this field has been
	 * established.<br>
	 * <br>
	 * If CurrencyToBuy is used, then it implies the following:<br>
	 * - the instruction is a delivery<br>
	 * - the currency received as proceeds from the sale of securities, for
	 * example, the currency to be sold, is the currency of the settlement
	 * amount. The currency to be bought is provided by the currency to buy
	 * message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. <br>
	 * - the amount of currency to be sold is equal to the settlement amount of
	 * the transaction. This implies a bulk forex deal must be instructed by
	 * other means. <br>
	 * - a forex deal to repatriate proceeds after the sale of securities should
	 * be executed for the soonest possible value date after settlement of the
	 * securities, as permitted by market convention. <br>
	 * - a bilateral agreement regarding the use of this field has been
	 * established.
	 */
	public static void checkSecuritiesTradeDetails78(SecuritiesTradeDetails78 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}