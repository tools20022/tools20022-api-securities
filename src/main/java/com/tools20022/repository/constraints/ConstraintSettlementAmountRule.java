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
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.msg.SecuritiesTradeDetails71;
import com.tools20022.repository.msg.SecuritiesTradeDetails72;

/**
 * If the instruction is against payment, then SettlementAmount must be present.
 * .
 */
public class ConstraintSettlementAmountRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07
	 * SecuritiesSettlementTransactionAllegementNotificationV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementTypeAndAdditionalParameters/Payment&lt;/leftOperand&gt;&lt;rightOperand&gt;AgainstPaymentSettlement&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is against payment, then SettlementAmount must be present.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV07> for_sese_SecuritiesSettlementTransactionAllegementNotificationV07 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountRule";
			definition = "If the instruction is against payment, then SettlementAmount must be present.\n.";
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV07.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SettlementAmount</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementTypeAndAdditionalParameters/Payment</leftOperand><rightOperand>AgainstPaymentSettlement</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/Payment&lt;/leftOperand&gt;&lt;rightOperand&gt;AgainstPaymentSettlement&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is against payment, then SettlementAmount must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails71> forSecuritiesTradeDetails71 = new MMConstraint<SecuritiesTradeDetails71>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountRule";
			definition = "If the instruction is against payment, then SettlementAmount must be present.";
			owner_lazy = () -> SecuritiesTradeDetails71.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SettlementAmount</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/Payment</leftOperand><rightOperand>AgainstPaymentSettlement</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV06
	 * SecuritiesFinancingModificationInstructionV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OpeningSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionTypeAndModificationAdditionalParameters/Payment&lt;/leftOperand&gt;&lt;rightOperand&gt;AgainstPaymentSettlement&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the Transaction is against payment, then OpeningSettlementAmount must be present.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingModificationInstructionV06> for_sese_SecuritiesFinancingModificationInstructionV06 = new MMConstraint<SecuritiesFinancingModificationInstructionV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountRule";
			definition = "If the Transaction is against payment, then OpeningSettlementAmount must be present.\r\n";
			owner_lazy = () -> SecuritiesFinancingModificationInstructionV06.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OpeningSettlementAmount</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionTypeAndModificationAdditionalParameters/Payment</leftOperand><rightOperand>AgainstPaymentSettlement</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesFinancingModificationInstructionV06 obj) throws Exception {
			check_sese_SecuritiesFinancingModificationInstructionV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV08
	 * SecuritiesFinancingInstructionV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OpeningSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionTypeAndAdditionalParameters/Payment&lt;/leftOperand&gt;&lt;rightOperand&gt;AgainstPaymentSettlement&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the Transaction is against payment, then OpeningSettlementAmount must be present.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV08> for_sese_SecuritiesFinancingInstructionV08 = new MMConstraint<SecuritiesFinancingInstructionV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountRule";
			definition = "If the Transaction is against payment, then OpeningSettlementAmount must be present.\r\n";
			owner_lazy = () -> SecuritiesFinancingInstructionV08.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OpeningSettlementAmount</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionTypeAndAdditionalParameters/Payment</leftOperand><rightOperand>AgainstPaymentSettlement</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesFinancingInstructionV08 obj) throws Exception {
			check_sese_SecuritiesFinancingInstructionV08(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementTypeAndAdditionalParameters/Payment&lt;/leftOperand&gt;&lt;rightOperand&gt;AgainstPaymentSettlement&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is against payment, then SettlementAmount must be present.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV08> for_sese_SecuritiesSettlementTransactionInstructionV08 = new MMConstraint<SecuritiesSettlementTransactionInstructionV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountRule";
			definition = "If the instruction is against payment, then SettlementAmount must be present.\n.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV08.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SettlementAmount</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementTypeAndAdditionalParameters/Payment</leftOperand><rightOperand>AgainstPaymentSettlement</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72
	 * SecuritiesTradeDetails72}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/Payment&lt;/leftOperand&gt;&lt;rightOperand&gt;AgainstPaymentSettlement&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is against payment, then SettlementAmount must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails72> forSecuritiesTradeDetails72 = new MMConstraint<SecuritiesTradeDetails72>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountRule";
			definition = "If the instruction is against payment, then SettlementAmount must be present.";
			owner_lazy = () -> SecuritiesTradeDetails72.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SettlementAmount</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/Payment</leftOperand><rightOperand>AgainstPaymentSettlement</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails72 obj) throws Exception {
			checkSecuritiesTradeDetails72(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV08
	 * SecuritiesSettlementTransactionGenerationNotificationV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/Payment&lt;/leftOperand&gt;&lt;rightOperand&gt;AgainstPaymentSettlement&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the TransactionIdentificationDetails/Payment equal to \"Against Payment Settlement\" (APMT) then SettlementAmount must be present.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV08> for_sese_SecuritiesSettlementTransactionGenerationNotificationV08 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountRule";
			definition = "If the TransactionIdentificationDetails/Payment equal to \"Against Payment Settlement\" (APMT) then SettlementAmount must be present.\r\n";
			owner_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV08.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SettlementAmount</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/Payment</leftOperand><rightOperand>AgainstPaymentSettlement</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionGenerationNotificationV08 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionGenerationNotificationV08(obj);
		}
	};

	/**
	 * If the instruction is against payment, then SettlementAmount must be
	 * present. .
	 */
	public static void check_sese_SecuritiesSettlementTransactionAllegementNotificationV07(SecuritiesSettlementTransactionAllegementNotificationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is against payment, then SettlementAmount must be
	 * present.
	 */
	public static void checkSecuritiesTradeDetails71(SecuritiesTradeDetails71 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the Transaction is against payment, then OpeningSettlementAmount must
	 * be present.<br>
	 */
	public static void check_sese_SecuritiesFinancingModificationInstructionV06(SecuritiesFinancingModificationInstructionV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the Transaction is against payment, then OpeningSettlementAmount must
	 * be present.<br>
	 */
	public static void check_sese_SecuritiesFinancingInstructionV08(SecuritiesFinancingInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is against payment, then SettlementAmount must be
	 * present. .
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstructionV08(SecuritiesSettlementTransactionInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is against payment, then SettlementAmount must be
	 * present.
	 */
	public static void checkSecuritiesTradeDetails72(SecuritiesTradeDetails72 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the TransactionIdentificationDetails/Payment equal to
	 * "Against Payment Settlement" (APMT) then SettlementAmount must be
	 * present.<br>
	 */
	public static void check_sese_SecuritiesSettlementTransactionGenerationNotificationV08(SecuritiesSettlementTransactionGenerationNotificationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}