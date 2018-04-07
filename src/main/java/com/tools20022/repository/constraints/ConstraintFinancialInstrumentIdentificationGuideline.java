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

/**
 * It is recommended that ISIN be used in
 * Identification\SecurityIdentification3Choice.
 */
public class ConstraintFinancialInstrumentIdentificationGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument8
	 * FinancialInstrument8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument8> forFinancialInstrument8 = new MMConstraint<FinancialInstrument8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice.";
			owner_lazy = () -> FinancialInstrument8.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument8 obj) throws Exception {
			checkFinancialInstrument8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument9
	 * FinancialInstrument9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument9> forFinancialInstrument9 = new MMConstraint<FinancialInstrument9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice.";
			owner_lazy = () -> FinancialInstrument9.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument9 obj) throws Exception {
			checkFinancialInstrument9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument17
	 * FinancialInstrument17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument17> forFinancialInstrument17 = new MMConstraint<FinancialInstrument17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice.";
			owner_lazy = () -> FinancialInstrument17.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument17 obj) throws Exception {
			checkFinancialInstrument17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument13
	 * FinancialInstrument13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument13> forFinancialInstrument13 = new MMConstraint<FinancialInstrument13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification\\SecurityIdentification3Choice.";
			owner_lazy = () -> FinancialInstrument13.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument13 obj) throws Exception {
			checkFinancialInstrument13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20
	 * FinancialInstrument20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "It is recommended that ISIN be used in Identification."</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument20> forFinancialInstrument20 = new MMConstraint<FinancialInstrument20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationGuideline";
			definition = "It is recommended that ISIN be used in Identification.";
			owner_lazy = () -> FinancialInstrument20.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument20 obj) throws Exception {
			checkFinancialInstrument20(obj);
		}
	};

	/**
	 * It is recommended that ISIN be used in
	 * Identification\SecurityIdentification3Choice.
	 */
	public static void checkFinancialInstrument8(FinancialInstrument8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Identification\SecurityIdentification3Choice.
	 */
	public static void checkFinancialInstrument9(FinancialInstrument9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Identification\SecurityIdentification3Choice.
	 */
	public static void checkFinancialInstrument17(FinancialInstrument17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in
	 * Identification\SecurityIdentification3Choice.
	 */
	public static void checkFinancialInstrument13(FinancialInstrument13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN be used in Identification.
	 */
	public static void checkFinancialInstrument20(FinancialInstrument20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}