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
import java.util.Arrays;

/**
 * If HoldIndicator is present and is value TRUE (Yes), then
 * FXStandingInstruction must be absent.
 */
public class ConstraintFXStandingInstructionPresenceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148
	 * SettlementDetails148}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must be absent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule#forSettlementDetails97
	 * ConstraintFXStandingInstructionPresenceRule.forSettlementDetails97}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails148> forSettlementDetails148 = new MMConstraint<SettlementDetails148>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must be absent.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule.forSettlementDetails97;
			owner_lazy = () -> SettlementDetails148.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SettlementDetails148 obj) throws Exception {
			checkSettlementDetails148(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43
	 * SettlementDetails43}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022, and therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed in a released mode."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails43> forSettlementDetails43 = new MMConstraint<SettlementDetails43>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022, and therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed in a released mode.";
			owner_lazy = () -> SettlementDetails43.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SettlementDetails43 obj) throws Exception {
			checkSettlementDetails43(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142
	 * SettlementDetails142}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator/Indicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022,\r\nand therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed\r\nin a released mode."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails142> forSettlementDetails142 = new MMConstraint<SettlementDetails142>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022,\r\nand therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed\r\nin a released mode.";
			owner_lazy = () -> SettlementDetails142.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator/Indicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SettlementDetails142 obj) throws Exception {
			checkSettlementDetails142(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145
	 * SettlementDetails145}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator/Indicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. \r\nIn ISO 15022, and therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transaction is instructed in a released mode."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails145> forSettlementDetails145 = new MMConstraint<SettlementDetails145>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. \r\nIn ISO 15022, and therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transaction is instructed in a released mode.";
			owner_lazy = () -> SettlementDetails145.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator/Indicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SettlementDetails145 obj) throws Exception {
			checkSettlementDetails145(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97
	 * SettlementDetails97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must be absent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule#forSettlementDetails148
	 * ConstraintFXStandingInstructionPresenceRule.forSettlementDetails148}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails97> forSettlementDetails97 = new MMConstraint<SettlementDetails97>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule.forSettlementDetails148);
			owner_lazy = () -> SettlementDetails97.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SettlementDetails97 obj) throws Exception {
			checkSettlementDetails97(obj);
		}
	};

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must be absent.
	 */
	public static void checkSettlementDetails148(SettlementDetails148 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must not be present. In ISO 15022, and therefore in
	 * ISO 20022, the FXStandingInstruction indicator can only be used when the
	 * transation is instructed in a released mode.
	 */
	public static void checkSettlementDetails43(SettlementDetails43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must not be present. In ISO 15022,<br>
	 * and therefore in ISO 20022, the FXStandingInstruction indicator can only
	 * be used when the transation is instructed<br>
	 * in a released mode.
	 */
	public static void checkSettlementDetails142(SettlementDetails142 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must not be present. <br>
	 * In ISO 15022, and therefore in ISO 20022, the FXStandingInstruction
	 * indicator can only be used when the transaction is instructed in a
	 * released mode.
	 */
	public static void checkSettlementDetails145(SettlementDetails145 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must be absent.
	 */
	public static void checkSettlementDetails97(SettlementDetails97 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}