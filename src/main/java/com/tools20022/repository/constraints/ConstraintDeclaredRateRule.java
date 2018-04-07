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
import com.tools20022.repository.area.seev.CorporateActionNotificationV08;
import com.tools20022.repository.msg.CorporateActionRate91;

/**
 * If CorporateActionOptionDetails/RateAndAmountDetails/
 * IssuerDeclaredExchangeRate is present, then
 * CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present.
 */
public class ConstraintDeclaredRateRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08
	 * CorporateActionNotificationV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionDetails/RateAndAmountDetails/DeclaredRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/RateAndAmountDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/RateAndAmountDetails/IssuerDeclaredExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/RateAndAmountDetails/IssuerDeclaredExchangeRate is present, then CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV08> for_seev_CorporateActionNotificationV08 = new MMConstraint<CorporateActionNotificationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredRateRule";
			definition = "If CorporateActionOptionDetails/RateAndAmountDetails/IssuerDeclaredExchangeRate is present, then CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present.";
			owner_lazy = () -> CorporateActionNotificationV08.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionDetails/RateAndAmountDetails/DeclaredRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]/RateAndAmountDetails</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]/RateAndAmountDetails/IssuerDeclaredExchangeRate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionNotificationV08 obj) throws Exception {
			check_seev_CorporateActionNotificationV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate91
	 * CorporateActionRate91}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DeclaredRate may only be used if the dividend or interest declared by the issuer is actually paid in a different currency than the declared one or if the dividend or the interest event makes it possible to elect amongst multiple currency options."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate91> forCorporateActionRate91 = new MMConstraint<CorporateActionRate91>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredRateRule";
			definition = "DeclaredRate may only be used if the dividend or interest declared by the issuer is actually paid in a different currency than the declared one or if the dividend or the interest event makes it possible to elect amongst multiple currency options.";
			owner_lazy = () -> CorporateActionRate91.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate91 obj) throws Exception {
			checkCorporateActionRate91(obj);
		}
	};

	/**
	 * If CorporateActionOptionDetails/RateAndAmountDetails/
	 * IssuerDeclaredExchangeRate is present, then
	 * CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present.
	 */
	public static void check_seev_CorporateActionNotificationV08(CorporateActionNotificationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * DeclaredRate may only be used if the dividend or interest declared by the
	 * issuer is actually paid in a different currency than the declared one or
	 * if the dividend or the interest event makes it possible to elect amongst
	 * multiple currency options.
	 */
	public static void checkCorporateActionRate91(CorporateActionRate91 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}