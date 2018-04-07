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
import com.tools20022.repository.msg.CorporateActionDate61;

/**
 * Effective date is to be used in events where there is no concept of
 * entitlement, for example Name Change (CHAN) or Place of Incorporation (PLAC),
 * and in events where there is a sense of eligibility but with a legal
 * obligation, for example Merger (MRGR).
 */
public class ConstraintEffectiveDateRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61
	 * CorporateActionDate61}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Effective date is to be used in events where there is no concept of entitlement, for example Name Change (CHAN) or Place of Incorporation (PLAC), and in events where there is a sense of eligibility but with a legal obligation, for example Merger (MRGR)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionDate61> forCorporateActionDate61 = new MMConstraint<CorporateActionDate61>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDateRule";
			definition = "Effective date is to be used in events where there is no concept of entitlement, for example Name Change (CHAN) or Place of Incorporation (PLAC), and in events where there is a sense of eligibility but with a legal obligation, for example Merger (MRGR).";
			owner_lazy = () -> CorporateActionDate61.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionDate61 obj) throws Exception {
			checkCorporateActionDate61(obj);
		}
	};

	/**
	 * Effective date is to be used in events where there is no concept of
	 * entitlement, for example Name Change (CHAN) or Place of Incorporation
	 * (PLAC), and in events where there is a sense of eligibility but with a
	 * legal obligation, for example Merger (MRGR).
	 */
	public static void checkCorporateActionDate61(CorporateActionDate61 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}