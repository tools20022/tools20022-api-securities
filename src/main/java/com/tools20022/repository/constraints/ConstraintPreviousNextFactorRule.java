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
import com.tools20022.repository.msg.FinancialInstrumentAttributes79;
import com.tools20022.repository.msg.FinancialInstrumentAttributes80;
import com.tools20022.repository.msg.FinancialInstrumentAttributes81;

/**
 * In case of partial redemption by pool factor, PreviousFactor provides the
 * factor applicable before redemption and NextFactor provides the factor
 * applicable after redemption.
 */
public class ConstraintPreviousNextFactorRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79
	 * FinancialInstrumentAttributes79}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes79> forFinancialInstrumentAttributes79 = new MMConstraint<FinancialInstrumentAttributes79>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes79.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes79 obj) throws Exception {
			checkFinancialInstrumentAttributes79(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81
	 * FinancialInstrumentAttributes81}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes81> forFinancialInstrumentAttributes81 = new MMConstraint<FinancialInstrumentAttributes81>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes81.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes81 obj) throws Exception {
			checkFinancialInstrumentAttributes81(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80
	 * FinancialInstrumentAttributes80}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes80> forFinancialInstrumentAttributes80 = new MMConstraint<FinancialInstrumentAttributes80>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes80.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes80 obj) throws Exception {
			checkFinancialInstrumentAttributes80(obj);
		}
	};

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes79(FinancialInstrumentAttributes79 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes81(FinancialInstrumentAttributes81 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes80(FinancialInstrumentAttributes80 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}