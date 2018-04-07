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
import com.tools20022.repository.msg.CorporateActionOption120;
import com.tools20022.repository.msg.CorporateActionOption142;

/**
 * For differentiation between options, the OptionNumber must be used (preferred
 * rather than the OptionType for example in the case where two or more offers
 * can be described by the same corporate action option code). Therefore, the
 * OptionNumber value must be different for each option.
 */
public class ConstraintOptionNumber1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption120
	 * CorporateActionOption120}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType for example in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption120> forCorporateActionOption120 = new MMConstraint<CorporateActionOption120>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber1Rule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType for example in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			owner_lazy = () -> CorporateActionOption120.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption120 obj) throws Exception {
			checkCorporateActionOption120(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption142
	 * CorporateActionOption142}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber rather than the OptionType must be used, for example, in the case where two or more offers can be described by the same corporate action option code. Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption142> forCorporateActionOption142 = new MMConstraint<CorporateActionOption142>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber1Rule";
			definition = "For differentiation between options, the OptionNumber rather than the OptionType must be used, for example, in the case where two or more offers can be described by the same corporate action option code. Therefore, the OptionNumber value must be different for each option.";
			owner_lazy = () -> CorporateActionOption142.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption142 obj) throws Exception {
			checkCorporateActionOption142(obj);
		}
	};

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType for example in the case where two
	 * or more offers can be described by the same corporate action option
	 * code). Therefore, the OptionNumber value must be different for each
	 * option.
	 */
	public static void checkCorporateActionOption120(CorporateActionOption120 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber rather than the
	 * OptionType must be used, for example, in the case where two or more
	 * offers can be described by the same corporate action option code.
	 * Therefore, the OptionNumber value must be different for each option.
	 */
	public static void checkCorporateActionOption142(CorporateActionOption142 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}