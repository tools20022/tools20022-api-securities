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
import com.tools20022.repository.msg.ReceiveInformation19;
import com.tools20022.repository.msg.ReceivingPartiesAndAccount16;
import com.tools20022.repository.msg.ReceivingPartiesAndAccount17;
import com.tools20022.repository.msg.ReceivingPartiesAndAccount18;

/**
 * If ReceiversIntermediary2Details is present, then
 * ReceiversIntermediary1Details must also be present.
 */
public class ConstraintReceiversIntermediary1DetailsRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount18
	 * ReceivingPartiesAndAccount18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceiversIntermediary1Details&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceiversIntermediary2Details&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversIntermediary1DetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReceiversIntermediary2Details is present, then ReceiversIntermediary1Details must also be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceivingPartiesAndAccount18> forReceivingPartiesAndAccount18 = new MMConstraint<ReceivingPartiesAndAccount18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediary1DetailsRule";
			definition = "If ReceiversIntermediary2Details is present, then ReceiversIntermediary1Details must also be present.";
			owner_lazy = () -> ReceivingPartiesAndAccount18.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceiversIntermediary1Details</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceiversIntermediary2Details</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(ReceivingPartiesAndAccount18 obj) throws Exception {
			checkReceivingPartiesAndAccount18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation19
	 * ReceiveInformation19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversIntermediary1DetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediary1Details is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation19> forReceiveInformation19 = new MMConstraint<ReceiveInformation19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediary1DetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediary1Details is not allowed.";
			owner_lazy = () -> ReceiveInformation19.mmObject();
		}

		@Override
		public void executeValidator(ReceiveInformation19 obj) throws Exception {
			checkReceiveInformation19(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount17
	 * ReceivingPartiesAndAccount17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceiversIntermediary1Details&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceiversIntermediary2Details&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversIntermediary1DetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReceiversIntermediary2Details is present, then ReceiversIntermediary1Details must also be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceivingPartiesAndAccount17> forReceivingPartiesAndAccount17 = new MMConstraint<ReceivingPartiesAndAccount17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediary1DetailsRule";
			definition = "If ReceiversIntermediary2Details is present, then ReceiversIntermediary1Details must also be present.";
			owner_lazy = () -> ReceivingPartiesAndAccount17.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceiversIntermediary1Details</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceiversIntermediary2Details</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(ReceivingPartiesAndAccount17 obj) throws Exception {
			checkReceivingPartiesAndAccount17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount16
	 * ReceivingPartiesAndAccount16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceiversIntermediary1Details&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceiversIntermediary2Details&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversIntermediary1DetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReceiversIntermediary2Details is present, then ReceiversIntermediary1Details must be present. If ReceiversIntermediary2Details is not present, then ReceiversIntermediary1Details is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceivingPartiesAndAccount16> forReceivingPartiesAndAccount16 = new MMConstraint<ReceivingPartiesAndAccount16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediary1DetailsRule";
			definition = "If ReceiversIntermediary2Details is present, then ReceiversIntermediary1Details must be present. If ReceiversIntermediary2Details is not present, then ReceiversIntermediary1Details is optional.";
			owner_lazy = () -> ReceivingPartiesAndAccount16.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceiversIntermediary1Details</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceiversIntermediary2Details</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(ReceivingPartiesAndAccount16 obj) throws Exception {
			checkReceivingPartiesAndAccount16(obj);
		}
	};

	/**
	 * If ReceiversIntermediary2Details is present, then
	 * ReceiversIntermediary1Details must also be present.
	 */
	public static void checkReceivingPartiesAndAccount18(ReceivingPartiesAndAccount18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversIntermediary1Details is not allowed.
	 */
	public static void checkReceiveInformation19(ReceiveInformation19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReceiversIntermediary2Details is present, then
	 * ReceiversIntermediary1Details must also be present.
	 */
	public static void checkReceivingPartiesAndAccount17(ReceivingPartiesAndAccount17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReceiversIntermediary2Details is present, then
	 * ReceiversIntermediary1Details must be present. If
	 * ReceiversIntermediary2Details is not present, then
	 * ReceiversIntermediary1Details is optional.
	 */
	public static void checkReceivingPartiesAndAccount16(ReceivingPartiesAndAccount16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}