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
import com.tools20022.repository.msg.SecurityIdentification14;
import com.tools20022.repository.msg.SecurityIdentification19;
import java.util.Arrays;

/**
 * When an ISIN code exists, it is strongly recommended that the ISIN be used.
 */
public class ConstraintISINGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19
	 * SecurityIdentification19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISINGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When an ISIN code exists, it is strongly recommended that the ISIN be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintISINGuideline#forSecurityIdentification14
	 * ConstraintISINGuideline.forSecurityIdentification14}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecurityIdentification19> forSecurityIdentification19 = new MMConstraint<SecurityIdentification19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISINGuideline";
			definition = "When an ISIN code exists, it is strongly recommended that the ISIN be used.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintISINGuideline.forSecurityIdentification14;
			owner_lazy = () -> SecurityIdentification19.mmObject();
		}

		@Override
		public void executeValidator(SecurityIdentification19 obj) throws Exception {
			checkSecurityIdentification19(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISINGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When a ISIN code exist. It is strongly recommended that the ISIN be used."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintISINGuideline#forSecurityIdentification19
	 * ConstraintISINGuideline.forSecurityIdentification19}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecurityIdentification14> forSecurityIdentification14 = new MMConstraint<SecurityIdentification14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISINGuideline";
			definition = "When a ISIN code exist. It is strongly recommended that the ISIN be used.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintISINGuideline.forSecurityIdentification19);
			owner_lazy = () -> SecurityIdentification14.mmObject();
		}

		@Override
		public void executeValidator(SecurityIdentification14 obj) throws Exception {
			checkSecurityIdentification14(obj);
		}
	};

	/**
	 * When an ISIN code exists, it is strongly recommended that the ISIN be
	 * used.
	 */
	public static void checkSecurityIdentification19(SecurityIdentification19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When a ISIN code exist. It is strongly recommended that the ISIN be used.
	 */
	public static void checkSecurityIdentification14(SecurityIdentification14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}