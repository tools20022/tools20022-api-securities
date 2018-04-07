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
 * If RequestedSettlementCurrency is present, it must be the same Currency as in
 * SettlementAmount, if present.
 */
public class ConstraintRequestedSettlementCurrencyRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14
	 * SubscriptionOrder14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/RequestedSettlementCurrency&lt;/leftOperand&gt;&lt;rightOperand&gt;/SettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/RequestedSettlementCurrency&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount, if present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionOrder14> forSubscriptionOrder14 = new MMConstraint<SubscriptionOrder14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrencyRule";
			definition = "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount, if present.";
			owner_lazy = () -> SubscriptionOrder14.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/RequestedSettlementCurrency</leftOperand><rightOperand>/SettlementAmount/@Currency</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/RequestedSettlementCurrency</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/SettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SubscriptionOrder14 obj) throws Exception {
			checkSubscriptionOrder14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6
	 * RedemptionBulkOrder6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedSettlementCurrency is present, it must be the same Currency as in all occurrences of IndividualOrderDetails/SettlementAmount, if present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkOrder6> forRedemptionBulkOrder6 = new MMConstraint<RedemptionBulkOrder6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrencyRule";
			definition = "If RequestedSettlementCurrency is present, it must be the same Currency as in all occurrences of IndividualOrderDetails/SettlementAmount, if present.";
			owner_lazy = () -> RedemptionBulkOrder6.mmObject();
		}

		@Override
		public void executeValidator(RedemptionBulkOrder6 obj) throws Exception {
			checkRedemptionBulkOrder6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15
	 * RedemptionExecution15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/RequestedSettlementCurrency&lt;/leftOperand&gt;&lt;rightOperand&gt;/SettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/RequestedSettlementCurrency&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount, if present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionExecution15> forRedemptionExecution15 = new MMConstraint<RedemptionExecution15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrencyRule";
			definition = "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount, if present.";
			owner_lazy = () -> RedemptionExecution15.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/RequestedSettlementCurrency</leftOperand><rightOperand>/SettlementAmount/@Currency</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/RequestedSettlementCurrency</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/SettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(RedemptionExecution15 obj) throws Exception {
			checkRedemptionExecution15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5
	 * RedemptionBulkExecution5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedSettlementCurrency is present, it must be the same Currency as in all occurrences of IndividualExecutionDetails/SettlementAmount."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionBulkExecution5> forRedemptionBulkExecution5 = new MMConstraint<RedemptionBulkExecution5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrencyRule";
			definition = "If RequestedSettlementCurrency is present, it must be the same Currency as in all occurrences of IndividualExecutionDetails/SettlementAmount.";
			owner_lazy = () -> RedemptionBulkExecution5.mmObject();
		}

		@Override
		public void executeValidator(RedemptionBulkExecution5 obj) throws Exception {
			checkRedemptionBulkExecution5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/RequestedSettlementCurrency&lt;/leftOperand&gt;&lt;rightOperand&gt;/SettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/RequestedSettlementCurrency&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount, if present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RedemptionOrder14> forRedemptionOrder14 = new MMConstraint<RedemptionOrder14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrencyRule";
			definition = "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount, if present.";
			owner_lazy = () -> RedemptionOrder14.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/RequestedSettlementCurrency</leftOperand><rightOperand>/SettlementAmount/@Currency</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/RequestedSettlementCurrency</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/SettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(RedemptionOrder14 obj) throws Exception {
			checkRedemptionOrder14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4
	 * SubscriptionBulkExecution4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedSettlementCurrency is present, it must be the same Currency as in all occurrences of IndividualExecutionDetails/SettlementAmount."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkExecution4> forSubscriptionBulkExecution4 = new MMConstraint<SubscriptionBulkExecution4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrencyRule";
			definition = "If RequestedSettlementCurrency is present, it must be the same Currency as in all occurrences of IndividualExecutionDetails/SettlementAmount.";
			owner_lazy = () -> SubscriptionBulkExecution4.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkExecution4 obj) throws Exception {
			checkSubscriptionBulkExecution4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/RequestedSettlementCurrency&lt;/leftOperand&gt;&lt;rightOperand&gt;/SettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/RequestedSettlementCurrency&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount, if present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionExecution13> forSubscriptionExecution13 = new MMConstraint<SubscriptionExecution13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrencyRule";
			definition = "If RequestedSettlementCurrency is present, it must be the same Currency as in SettlementAmount, if present.";
			owner_lazy = () -> SubscriptionExecution13.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/RequestedSettlementCurrency</leftOperand><rightOperand>/SettlementAmount/@Currency</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/RequestedSettlementCurrency</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/SettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SubscriptionExecution13 obj) throws Exception {
			checkSubscriptionExecution13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5
	 * SubscriptionBulkOrder5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedSettlementCurrency is present, it must be the same Currency as in all occurrences of IndividualOrderDetails/SettlementAmount, if present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrder5> forSubscriptionBulkOrder5 = new MMConstraint<SubscriptionBulkOrder5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrencyRule";
			definition = "If RequestedSettlementCurrency is present, it must be the same Currency as in all occurrences of IndividualOrderDetails/SettlementAmount, if present.";
			owner_lazy = () -> SubscriptionBulkOrder5.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkOrder5 obj) throws Exception {
			checkSubscriptionBulkOrder5(obj);
		}
	};

	/**
	 * If RequestedSettlementCurrency is present, it must be the same Currency
	 * as in SettlementAmount, if present.
	 */
	public static void checkSubscriptionOrder14(SubscriptionOrder14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RequestedSettlementCurrency is present, it must be the same Currency
	 * as in all occurrences of IndividualOrderDetails/SettlementAmount, if
	 * present.
	 */
	public static void checkRedemptionBulkOrder6(RedemptionBulkOrder6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RequestedSettlementCurrency is present, it must be the same Currency
	 * as in SettlementAmount, if present.
	 */
	public static void checkRedemptionExecution15(RedemptionExecution15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RequestedSettlementCurrency is present, it must be the same Currency
	 * as in all occurrences of IndividualExecutionDetails/SettlementAmount.
	 */
	public static void checkRedemptionBulkExecution5(RedemptionBulkExecution5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RequestedSettlementCurrency is present, it must be the same Currency
	 * as in SettlementAmount, if present.
	 */
	public static void checkRedemptionOrder14(RedemptionOrder14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RequestedSettlementCurrency is present, it must be the same Currency
	 * as in all occurrences of IndividualExecutionDetails/SettlementAmount.
	 */
	public static void checkSubscriptionBulkExecution4(SubscriptionBulkExecution4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RequestedSettlementCurrency is present, it must be the same Currency
	 * as in SettlementAmount, if present.
	 */
	public static void checkSubscriptionExecution13(SubscriptionExecution13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RequestedSettlementCurrency is present, it must be the same Currency
	 * as in all occurrences of IndividualOrderDetails/SettlementAmount, if
	 * present.
	 */
	public static void checkSubscriptionBulkOrder5(SubscriptionBulkOrder5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}