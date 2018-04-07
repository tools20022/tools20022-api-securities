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
import com.tools20022.repository.area.semt.AccountingStatementOfHoldingsV02;
import com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02;
import com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09;
import com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV09;
import com.tools20022.repository.msg.AccountingStatementOfHoldings2;
import com.tools20022.repository.msg.CustodyStatementOfHoldings2;

/**
 * If StatementGeneralDetails/ActivityIndicator is "true" or "1" (Yes), then
 * either BalanceForAccount or SubAccountDetails is mandatory. If
 * StatementGeneralDetails/ActivityIndicator is "false" or "0" (No), then
 * BalanceForAccount and SubAccountDetails may be present.
 */
public class ConstraintBalanceForAccountOrSubAccountDetailsRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings2
	 * CustodyStatementOfHoldings2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountOrSubAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is \"true\" or \"1\" (Yes), then either BalanceForAccount or SubAccountDetails is mandatory. If StatementGeneralDetails/ActivityIndicator is \"false\" or \"0\" (No), then BalanceForAccount and SubAccountDetails may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CustodyStatementOfHoldings2> forCustodyStatementOfHoldings2 = new MMConstraint<CustodyStatementOfHoldings2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountOrSubAccountDetailsRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is \"true\" or \"1\" (Yes), then either BalanceForAccount or SubAccountDetails is mandatory. If StatementGeneralDetails/ActivityIndicator is \"false\" or \"0\" (No), then BalanceForAccount and SubAccountDetails may be present.";
			owner_lazy = () -> CustodyStatementOfHoldings2.mmObject();
		}

		@Override
		public void executeValidator(CustodyStatementOfHoldings2 obj) throws Exception {
			checkCustodyStatementOfHoldings2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02
	 * CustodyStatementOfHoldingsV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountOrSubAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is \"true\" or \"1\" (Yes), then either BalanceForAccount or SubAccountDetails is mandatory. If StatementGeneralDetails/ActivityIndicator is \"false\" or \"0\" (No), then BalanceForAccount and SubAccountDetails may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CustodyStatementOfHoldingsV02> for_semt_CustodyStatementOfHoldingsV02 = new MMConstraint<CustodyStatementOfHoldingsV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountOrSubAccountDetailsRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is \"true\" or \"1\" (Yes), then either BalanceForAccount or SubAccountDetails is mandatory. If StatementGeneralDetails/ActivityIndicator is \"false\" or \"0\" (No), then BalanceForAccount and SubAccountDetails may be present.";
			owner_lazy = () -> CustodyStatementOfHoldingsV02.mmObject();
		}

		@Override
		public void executeValidator(CustodyStatementOfHoldingsV02 obj) throws Exception {
			check_semt_CustodyStatementOfHoldingsV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09
	 * SecuritiesBalanceAccountingReportV09}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountOrSubAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV09> for_semt_SecuritiesBalanceAccountingReportV09 = new MMConstraint<SecuritiesBalanceAccountingReportV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountOrSubAccountDetailsRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent.";
			owner_lazy = () -> SecuritiesBalanceAccountingReportV09.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesBalanceAccountingReportV09 obj) throws Exception {
			check_semt_SecuritiesBalanceAccountingReportV09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountingStatementOfHoldings2
	 * AccountingStatementOfHoldings2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountOrSubAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is \"true\" or \"1\" (Yes), then either BalanceForAccount or SubAccountDetails is mandatory. If StatementGeneralDetails/ActivityIndicator is \"false\" or \"0\" (No), then BalanceForAccount and SubAccountDetails may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountingStatementOfHoldings2> forAccountingStatementOfHoldings2 = new MMConstraint<AccountingStatementOfHoldings2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountOrSubAccountDetailsRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is \"true\" or \"1\" (Yes), then either BalanceForAccount or SubAccountDetails is mandatory. If StatementGeneralDetails/ActivityIndicator is \"false\" or \"0\" (No), then BalanceForAccount and SubAccountDetails may be present.";
			owner_lazy = () -> AccountingStatementOfHoldings2.mmObject();
		}

		@Override
		public void executeValidator(AccountingStatementOfHoldings2 obj) throws Exception {
			checkAccountingStatementOfHoldings2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsV02
	 * AccountingStatementOfHoldingsV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountOrSubAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is \"true\" or \"1\" (Yes), then either BalanceForAccount or SubAccountDetails is mandatory. If StatementGeneralDetails/ActivityIndicator is \"false\" or \"0\" (No), then BalanceForAccount and SubAccountDetails may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountingStatementOfHoldingsV02> for_semt_AccountingStatementOfHoldingsV02 = new MMConstraint<AccountingStatementOfHoldingsV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountOrSubAccountDetailsRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is \"true\" or \"1\" (Yes), then either BalanceForAccount or SubAccountDetails is mandatory. If StatementGeneralDetails/ActivityIndicator is \"false\" or \"0\" (No), then BalanceForAccount and SubAccountDetails may be present.";
			owner_lazy = () -> AccountingStatementOfHoldingsV02.mmObject();
		}

		@Override
		public void executeValidator(AccountingStatementOfHoldingsV02 obj) throws Exception {
			check_semt_AccountingStatementOfHoldingsV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV09
	 * SecuritiesBalanceCustodyReportV09}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SubAccountDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/BalanceForAccount[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatementGeneralDetails/ActivityIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccountOrSubAccountDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV09> for_semt_SecuritiesBalanceCustodyReportV09 = new MMConstraint<SecuritiesBalanceCustodyReportV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccountOrSubAccountDetailsRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either BalanceForAccount or SubAccountDetails must be present. If StatementGeneralDetails/ActivityIndicator is FALSE (No), then BalanceForAccount and SubAccountDetails must be absent.";
			owner_lazy = () -> SecuritiesBalanceCustodyReportV09.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/SubAccountDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/BalanceForAccount[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatementGeneralDetails/ActivityIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesBalanceCustodyReportV09 obj) throws Exception {
			check_semt_SecuritiesBalanceCustodyReportV09(obj);
		}
	};

	/**
	 * If StatementGeneralDetails/ActivityIndicator is "true" or "1" (Yes), then
	 * either BalanceForAccount or SubAccountDetails is mandatory. If
	 * StatementGeneralDetails/ActivityIndicator is "false" or "0" (No), then
	 * BalanceForAccount and SubAccountDetails may be present.
	 */
	public static void checkCustodyStatementOfHoldings2(CustodyStatementOfHoldings2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is "true" or "1" (Yes), then
	 * either BalanceForAccount or SubAccountDetails is mandatory. If
	 * StatementGeneralDetails/ActivityIndicator is "false" or "0" (No), then
	 * BalanceForAccount and SubAccountDetails may be present.
	 */
	public static void check_semt_CustodyStatementOfHoldingsV02(CustodyStatementOfHoldingsV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either
	 * BalanceForAccount or SubAccountDetails must be present. If
	 * StatementGeneralDetails/ActivityIndicator is FALSE (No), then
	 * BalanceForAccount and SubAccountDetails must be absent.
	 */
	public static void check_semt_SecuritiesBalanceAccountingReportV09(SecuritiesBalanceAccountingReportV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is "true" or "1" (Yes), then
	 * either BalanceForAccount or SubAccountDetails is mandatory. If
	 * StatementGeneralDetails/ActivityIndicator is "false" or "0" (No), then
	 * BalanceForAccount and SubAccountDetails may be present.
	 */
	public static void checkAccountingStatementOfHoldings2(AccountingStatementOfHoldings2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is "true" or "1" (Yes), then
	 * either BalanceForAccount or SubAccountDetails is mandatory. If
	 * StatementGeneralDetails/ActivityIndicator is "false" or "0" (No), then
	 * BalanceForAccount and SubAccountDetails may be present.
	 */
	public static void check_semt_AccountingStatementOfHoldingsV02(AccountingStatementOfHoldingsV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is TRUE (Yes), then either
	 * BalanceForAccount or SubAccountDetails must be present. If
	 * StatementGeneralDetails/ActivityIndicator is FALSE (No), then
	 * BalanceForAccount and SubAccountDetails must be absent.
	 */
	public static void check_semt_SecuritiesBalanceCustodyReportV09(SecuritiesBalanceCustodyReportV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}