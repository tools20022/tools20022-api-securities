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
import com.tools20022.repository.msg.SecuritiesTradeDetails71;
import com.tools20022.repository.msg.SecuritiesTradeDetails72;

/**
 * If Trade Date/Time is present with a time or a time + UTC indicator, then it
 * must be the local time of the place of trade, for example, of the stock
 * exchange, or of the selling broker for OTC.
 */
public class ConstraintTradeDateRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71
	 * SecuritiesTradeDetails71}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is present with a time or a time + UTC indicator, then it must be the local time of the place of trade, for example, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails71> forSecuritiesTradeDetails71 = new MMConstraint<SecuritiesTradeDetails71>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateRule";
			definition = "If Trade Date/Time is present with a time or a time + UTC indicator, then it must be the local time of the place of trade, for example, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails71.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails71 obj) throws Exception {
			checkSecuritiesTradeDetails71(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72
	 * SecuritiesTradeDetails72}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, for example, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails72> forSecuritiesTradeDetails72 = new MMConstraint<SecuritiesTradeDetails72>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, for example, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails72.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails72 obj) throws Exception {
			checkSecuritiesTradeDetails72(obj);
		}
	};

	/**
	 * If Trade Date/Time is present with a time or a time + UTC indicator, then
	 * it must be the local time of the place of trade, for example, of the
	 * stock exchange, or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails71(SecuritiesTradeDetails71 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, for example, of the stock
	 * exchange, or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails72(SecuritiesTradeDetails72 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}