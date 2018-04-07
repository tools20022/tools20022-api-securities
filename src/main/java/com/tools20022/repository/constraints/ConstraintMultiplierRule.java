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
import com.tools20022.repository.datatype.NonNegativeDecimalNumber;
import com.tools20022.repository.msg.DerivativeInstrument5;
import com.tools20022.repository.msg.DerivativeInstrument6;

/**
 * Price Multiplier must not be zero.
 */
public class ConstraintMultiplierRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5#mmPriceMultiplier
	 * DerivativeInstrument5.mmPriceMultiplier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultiplierRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price Multiplier must not be zero."</li>
	 * </ul>
	 */
	public static final MMConstraint<NonNegativeDecimalNumber> forDerivativeInstrument5_PriceMultiplier = new MMConstraint<NonNegativeDecimalNumber>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultiplierRule";
			definition = "Price Multiplier must not be zero.";
			owner_lazy = () -> DerivativeInstrument5.mmPriceMultiplier;
		}

		@Override
		public void executeValidator(NonNegativeDecimalNumber obj) throws Exception {
			checkDerivativeInstrument5_PriceMultiplier(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6#mmPriceMultiplier
	 * DerivativeInstrument6.mmPriceMultiplier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultiplierRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price Multiplier must not be zero."</li>
	 * </ul>
	 */
	public static final MMConstraint<NonNegativeDecimalNumber> forDerivativeInstrument6_PriceMultiplier = new MMConstraint<NonNegativeDecimalNumber>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultiplierRule";
			definition = "Price Multiplier must not be zero.";
			owner_lazy = () -> DerivativeInstrument6.mmPriceMultiplier;
		}

		@Override
		public void executeValidator(NonNegativeDecimalNumber obj) throws Exception {
			checkDerivativeInstrument6_PriceMultiplier(obj);
		}
	};

	/**
	 * Price Multiplier must not be zero.
	 */
	public static void checkDerivativeInstrument5_PriceMultiplier(NonNegativeDecimalNumber obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Price Multiplier must not be zero.
	 */
	public static void checkDerivativeInstrument6_PriceMultiplier(NonNegativeDecimalNumber obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}