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
import com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV03;
import com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3;

/**
 * If StatementGeneralDetails/ActivityIndicator is "true" or "1" (Yes), then
 * either one or more occurrences of TransactionOnAccount or one or more
 * occurrences of SubAccountDetails is mandatory. If
 * StatementGeneralDetails/ActivityIndicator is "false" or "0" (No), then
 * TransactionOnAccount and SubAccountDetails are not allowed.
 */
public class ConstraintTransactionOnAccountOrSubAccountDetailsRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV03
	 * StatementOfInvestmentFundTransactionsV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionOnAccountOrSubAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is \"true\" or \"1\" (Yes), then either one or more occurrences of TransactionOnAccount or one or more occurrences of SubAccountDetails is mandatory. If StatementGeneralDetails/ActivityIndicator is \"false\" or \"0\" (No), then TransactionOnAccount and SubAccountDetails are not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<StatementOfInvestmentFundTransactionsV03> for_semt_StatementOfInvestmentFundTransactionsV03 = new MMConstraint<StatementOfInvestmentFundTransactionsV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionOnAccountOrSubAccountDetailsRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is \"true\" or \"1\" (Yes), then either one or more occurrences of TransactionOnAccount or one or more occurrences of SubAccountDetails is mandatory. If StatementGeneralDetails/ActivityIndicator is \"false\" or \"0\" (No), then TransactionOnAccount and SubAccountDetails are not allowed.";
			owner_lazy = () -> StatementOfInvestmentFundTransactionsV03.mmObject();
		}

		@Override
		public void executeValidator(StatementOfInvestmentFundTransactionsV03 obj) throws Exception {
			check_semt_StatementOfInvestmentFundTransactionsV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3
	 * StatementOfInvestmentFundTransactions3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionOnAccountOrSubAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is \"true\" or \"1\" (Yes), then either one or more occurrences of TransactionOnAccount or one or more occurrences of SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is \"false\" or \"0\" (No), then TransactionOnAccount and SubAccountDetails are not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<StatementOfInvestmentFundTransactions3> forStatementOfInvestmentFundTransactions3 = new MMConstraint<StatementOfInvestmentFundTransactions3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionOnAccountOrSubAccountDetailsRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is \"true\" or \"1\" (Yes), then either one or more occurrences of TransactionOnAccount or one or more occurrences of SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is \"false\" or \"0\" (No), then TransactionOnAccount and SubAccountDetails are not allowed.";
			owner_lazy = () -> StatementOfInvestmentFundTransactions3.mmObject();
		}

		@Override
		public void executeValidator(StatementOfInvestmentFundTransactions3 obj) throws Exception {
			checkStatementOfInvestmentFundTransactions3(obj);
		}
	};

	/**
	 * If StatementGeneralDetails/ActivityIndicator is "true" or "1" (Yes), then
	 * either one or more occurrences of TransactionOnAccount or one or more
	 * occurrences of SubAccountDetails is mandatory. If
	 * StatementGeneralDetails/ActivityIndicator is "false" or "0" (No), then
	 * TransactionOnAccount and SubAccountDetails are not allowed.
	 */
	public static void check_semt_StatementOfInvestmentFundTransactionsV03(StatementOfInvestmentFundTransactionsV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is "true" or "1" (Yes), then
	 * either one or more occurrences of TransactionOnAccount or one or more
	 * occurrences of SubAccountDetails must be present. If
	 * StatementGeneralDetails/ActivityIndicator is "false" or "0" (No), then
	 * TransactionOnAccount and SubAccountDetails are not allowed.
	 */
	public static void checkStatementOfInvestmentFundTransactions3(StatementOfInvestmentFundTransactions3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}