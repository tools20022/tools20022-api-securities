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
import com.tools20022.repository.msg.CorporateActionOption138;
import com.tools20022.repository.msg.CorporateActionOption139;

/**
 * For differentiation between options, it is recommended to use the
 * OptionNumber rather than the OptionType, for example, in the case where two
 * or more offers can be described by the same corporate action option code.
 */
public class ConstraintOptionNumberGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139
	 * CorporateActionOption139}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, it is recommended to use the OptionNumber rather than the OptionType, for example, in the case where two or more offers can be described by the same corporate action option code."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption139> forCorporateActionOption139 = new MMConstraint<CorporateActionOption139>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberGuideline";
			definition = "For differentiation between options, it is recommended to use the OptionNumber rather than the OptionType, for example, in the case where two or more offers can be described by the same corporate action option code.";
			owner_lazy = () -> CorporateActionOption139.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption139 obj) throws Exception {
			checkCorporateActionOption139(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138
	 * CorporateActionOption138}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, it is recommended to use the OptionNumber rather than the OptionType, for example, in the case where two or more offers can be described by the same corporate action option code."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption138> forCorporateActionOption138 = new MMConstraint<CorporateActionOption138>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberGuideline";
			definition = "For differentiation between options, it is recommended to use the OptionNumber rather than the OptionType, for example, in the case where two or more offers can be described by the same corporate action option code.";
			owner_lazy = () -> CorporateActionOption138.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption138 obj) throws Exception {
			checkCorporateActionOption138(obj);
		}
	};

	/**
	 * For differentiation between options, it is recommended to use the
	 * OptionNumber rather than the OptionType, for example, in the case where
	 * two or more offers can be described by the same corporate action option
	 * code.
	 */
	public static void checkCorporateActionOption139(CorporateActionOption139 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, it is recommended to use the
	 * OptionNumber rather than the OptionType, for example, in the case where
	 * two or more offers can be described by the same corporate action option
	 * code.
	 */
	public static void checkCorporateActionOption138(CorporateActionOption138 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}