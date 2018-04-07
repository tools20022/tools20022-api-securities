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

/**
 * If the confirmation is on a receive and no standing settlement instruction
 * applies, then DeliveringDepository and Party1 must be present.
 */
public class ConstraintDeliveringDepositoryAndParty1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV08
	 * SecuritiesFinancingConfirmationV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DeliveringSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DeliveringSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Receive&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the confirmation is on a receive and no standing settlement instruction applies, then DeliveringDepository and Party1 must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingConfirmationV08> for_sese_SecuritiesFinancingConfirmationV08 = new MMConstraint<SecuritiesFinancingConfirmationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringDepositoryAndParty1Rule";
			definition = "If the confirmation is on a receive and no standing settlement instruction applies, then DeliveringDepository and Party1 must be present.";
			owner_lazy = () -> SecuritiesFinancingConfirmationV08.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DeliveringSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/DeliveringSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Receive</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(SecuritiesFinancingConfirmationV08 obj) throws Exception {
			check_sese_SecuritiesFinancingConfirmationV08(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DeliveringSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DeliveringSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Receive&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a receive and no standing settlement instruction applies, then DeliveringDepository and Party1 must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV08> for_sese_SecuritiesSettlementTransactionConfirmationV08 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringDepositoryAndParty1Rule";
			definition = "If the instruction is a receive and no standing settlement instruction applies, then DeliveringDepository and Party1 must be present.";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV08.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DeliveringSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/DeliveringSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Receive</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV08
	 * SecuritiesSettlementTransactionInstructionV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DeliveringSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DeliveringSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementTypeAndAdditionalParameters/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Receive&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a receive and no standing settlement instruction applies, then DeliveringDepository and Party1 must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV08> for_sese_SecuritiesSettlementTransactionInstructionV08 = new MMConstraint<SecuritiesSettlementTransactionInstructionV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringDepositoryAndParty1Rule";
			definition = "If the instruction is a receive and no standing settlement instruction applies, then DeliveringDepository and Party1 must be present.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV08.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DeliveringSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/DeliveringSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementTypeAndAdditionalParameters/SecuritiesMovementType</leftOperand><rightOperand>Receive</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV07
	 * SecuritiesSettlementTransactionReversalAdviceV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DeliveringSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DeliveringSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Receive&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the instruction is a receive and no standing settlement instruction applies, then DeliveringDepository and Party1 must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionReversalAdviceV07> for_sese_SecuritiesSettlementTransactionReversalAdviceV07 = new MMConstraint<SecuritiesSettlementTransactionReversalAdviceV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringDepositoryAndParty1Rule";
			definition = "If the instruction is a receive and no standing settlement instruction applies, then DeliveringDepository and Party1 must be present.";
			owner_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV07.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DeliveringSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/DeliveringSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Receive</rightOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionReversalAdviceV07 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionReversalAdviceV07(obj);
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DeliveringSettlementParties/Depository&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DeliveringSettlementParties/Party1&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionIdentificationDetails/SecuritiesMovementType&lt;/leftOperand&gt;&lt;rightOperand&gt;Receive&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringDepositoryAndParty1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the TransactionIdentificationDetails/SecuritiesMovementType is equal to \"Receive\" (RECE) then DeliveringSettlementParties/DeliveringDepository and DeliveringSettlementParties/Party1 must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV08> for_sese_SecuritiesSettlementTransactionGenerationNotificationV08 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringDepositoryAndParty1Rule";
			definition = "If the TransactionIdentificationDetails/SecuritiesMovementType is equal to \"Receive\" (RECE) then DeliveringSettlementParties/DeliveringDepository and DeliveringSettlementParties/Party1 must be present.";
			owner_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV08.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DeliveringSettlementParties/Depository</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/DeliveringSettlementParties/Party1</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionIdentificationDetails/SecuritiesMovementType</leftOperand><rightOperand>Receive</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionGenerationNotificationV08 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionGenerationNotificationV08(obj);
		}
	};

	/**
	 * If the confirmation is on a receive and no standing settlement
	 * instruction applies, then DeliveringDepository and Party1 must be
	 * present.
	 */
	public static void check_sese_SecuritiesFinancingConfirmationV08(SecuritiesFinancingConfirmationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a receive and no standing settlement instruction
	 * applies, then DeliveringDepository and Party1 must be present.
	 */
	public static void check_sese_SecuritiesSettlementTransactionConfirmationV08(SecuritiesSettlementTransactionConfirmationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a receive and no standing settlement instruction
	 * applies, then DeliveringDepository and Party1 must be present.
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstructionV08(SecuritiesSettlementTransactionInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the instruction is a receive and no standing settlement instruction
	 * applies, then DeliveringDepository and Party1 must be present.
	 */
	public static void check_sese_SecuritiesSettlementTransactionReversalAdviceV07(SecuritiesSettlementTransactionReversalAdviceV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the TransactionIdentificationDetails/SecuritiesMovementType is equal
	 * to "Receive" (RECE) then DeliveringSettlementParties/DeliveringDepository
	 * and DeliveringSettlementParties/Party1 must be present.
	 */
	public static void check_sese_SecuritiesSettlementTransactionGenerationNotificationV08(SecuritiesSettlementTransactionGenerationNotificationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}