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
import com.tools20022.repository.msg.CashCollateralResponse2;
import com.tools20022.repository.msg.OtherCollateralResponse2;
import com.tools20022.repository.msg.SecuritiesCollateralResponse1;

/**
 * If ResponseType equals "Rejected" then RejectionReason must be present or
 * RejectionInformation must be present. Both RejectionReason and
 * RejectionInformation may be present.
 */
public class ConstraintProposalRejectionRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateralResponse1
	 * SecuritiesCollateralResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/RejectionReason&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/RejectionInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/ResponseType&lt;/leftOperand&gt;&lt;rightOperand&gt;Rejected&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProposalRejectionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ResponseType equals \"Rejected\" then RejectionReason must be present or RejectionInformation must be present. Both RejectionReason and RejectionInformation may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesCollateralResponse1> forSecuritiesCollateralResponse1 = new MMConstraint<SecuritiesCollateralResponse1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProposalRejectionRule";
			definition = "If ResponseType equals \"Rejected\" then RejectionReason must be present or RejectionInformation must be present. Both RejectionReason and RejectionInformation may be present.";
			owner_lazy = () -> SecuritiesCollateralResponse1.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/RejectionReason</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/RejectionInformation</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/ResponseType</leftOperand><rightOperand>Rejected</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesCollateralResponse1 obj) throws Exception {
			checkSecuritiesCollateralResponse1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse2
	 * CashCollateralResponse2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/RejectionReason&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/ResponseType&lt;/leftOperand&gt;&lt;rightOperand&gt;Rejected&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProposalRejectionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ResponseType equals \"Rejected\" then RejectionReason must be present or RejectionInformation must be present. Both RejectionReason and RejectionInformation may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashCollateralResponse2> forCashCollateralResponse2 = new MMConstraint<CashCollateralResponse2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProposalRejectionRule";
			definition = "If ResponseType equals \"Rejected\" then RejectionReason must be present or RejectionInformation must be present. Both RejectionReason and RejectionInformation may be present.";
			owner_lazy = () -> CashCollateralResponse2.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/RejectionReason</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/ResponseType</leftOperand><rightOperand>Rejected</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CashCollateralResponse2 obj) throws Exception {
			checkCashCollateralResponse2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateralResponse2
	 * OtherCollateralResponse2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/RejectionReason&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/ResponseType&lt;/leftOperand&gt;&lt;rightOperand&gt;Rejected&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProposalRejectionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ResponseType equals \"Rejected\" then RejectionReason must be present or RejectionInformation must be present. Both RejectionReason and RejectionInformation may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherCollateralResponse2> forOtherCollateralResponse2 = new MMConstraint<OtherCollateralResponse2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProposalRejectionRule";
			definition = "If ResponseType equals \"Rejected\" then RejectionReason must be present or RejectionInformation must be present. Both RejectionReason and RejectionInformation may be present.";
			owner_lazy = () -> OtherCollateralResponse2.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/RejectionReason</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/ResponseType</leftOperand><rightOperand>Rejected</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(OtherCollateralResponse2 obj) throws Exception {
			checkOtherCollateralResponse2(obj);
		}
	};

	/**
	 * If ResponseType equals "Rejected" then RejectionReason must be present or
	 * RejectionInformation must be present. Both RejectionReason and
	 * RejectionInformation may be present.
	 */
	public static void checkSecuritiesCollateralResponse1(SecuritiesCollateralResponse1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ResponseType equals "Rejected" then RejectionReason must be present or
	 * RejectionInformation must be present. Both RejectionReason and
	 * RejectionInformation may be present.
	 */
	public static void checkCashCollateralResponse2(CashCollateralResponse2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ResponseType equals "Rejected" then RejectionReason must be present or
	 * RejectionInformation must be present. Both RejectionReason and
	 * RejectionInformation may be present.
	 */
	public static void checkOtherCollateralResponse2(OtherCollateralResponse2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}