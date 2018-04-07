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
 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
 * must be the local time of the place of trade, eg, of the stock exchange, or
 * of the selling broker for OTC.
 */
public class ConstraintTradeDateTimeUTCRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Order18 Order18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Order18> forOrder18 = new MMConstraint<Order18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> Order18.mmObject();
		}

		@Override
		public void executeValidator(Order18 obj) throws Exception {
			checkOrder18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails77
	 * SecuritiesTradeDetails77}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, for example, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails77> forSecuritiesTradeDetails77 = new MMConstraint<SecuritiesTradeDetails77>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, for example, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails77.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails77 obj) throws Exception {
			checkSecuritiesTradeDetails77(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails74
	 * SecuritiesTradeDetails74}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, for example, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails74> forSecuritiesTradeDetails74 = new MMConstraint<SecuritiesTradeDetails74>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, for example, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails74.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails74 obj) throws Exception {
			checkSecuritiesTradeDetails74(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Order17 Order17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Order17> forOrder17 = new MMConstraint<Order17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> Order17.mmObject();
		}

		@Override
		public void executeValidator(Order17 obj) throws Exception {
			checkOrder17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails79
	 * SecuritiesTradeDetails79}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, for example, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails79> forSecuritiesTradeDetails79 = new MMConstraint<SecuritiesTradeDetails79>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, for example, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails79.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails79 obj) throws Exception {
			checkSecuritiesTradeDetails79(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails73
	 * SecuritiesTradeDetails73}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, for example, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails73> forSecuritiesTradeDetails73 = new MMConstraint<SecuritiesTradeDetails73>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, for example, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails73.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails73 obj) throws Exception {
			checkSecuritiesTradeDetails73(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails75
	 * SecuritiesTradeDetails75}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is present with a time or a time + UTC indicator, then it must be the local time of the place of trade, for example, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails75> forSecuritiesTradeDetails75 = new MMConstraint<SecuritiesTradeDetails75>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is present with a time or a time + UTC indicator, then it must be the local time of the place of trade, for example, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails75.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails75 obj) throws Exception {
			checkSecuritiesTradeDetails75(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails80
	 * SecuritiesTradeDetails80}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, for example, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails80> forSecuritiesTradeDetails80 = new MMConstraint<SecuritiesTradeDetails80>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, for example, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails80.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails80 obj) throws Exception {
			checkSecuritiesTradeDetails80(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails5
	 * SecuritiesTradeDetails5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails5> forSecuritiesTradeDetails5 = new MMConstraint<SecuritiesTradeDetails5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails5.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails5 obj) throws Exception {
			checkSecuritiesTradeDetails5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails76
	 * SecuritiesTradeDetails76}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, for example, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails76> forSecuritiesTradeDetails76 = new MMConstraint<SecuritiesTradeDetails76>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, for example, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails76.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails76 obj) throws Exception {
			checkSecuritiesTradeDetails76(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails78
	 * SecuritiesTradeDetails78}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTimeUTCRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, for example, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails78> forSecuritiesTradeDetails78 = new MMConstraint<SecuritiesTradeDetails78>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTimeUTCRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, for example, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails78.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails78 obj) throws Exception {
			checkSecuritiesTradeDetails78(obj);
		}
	};

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkOrder18(Order18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, for example, of the stock
	 * exchange, or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails77(SecuritiesTradeDetails77 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, for example, of the stock
	 * exchange, or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails74(SecuritiesTradeDetails74 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkOrder17(Order17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, for example, of the stock
	 * exchange, or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails79(SecuritiesTradeDetails79 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, for example, of the stock
	 * exchange, or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails73(SecuritiesTradeDetails73 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is present with a time or a time + UTC indicator, then
	 * it must be the local time of the place of trade, for example, of the
	 * stock exchange, or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails75(SecuritiesTradeDetails75 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, for example, of the stock
	 * exchange, or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails80(SecuritiesTradeDetails80 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails5(SecuritiesTradeDetails5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, for example, of the stock
	 * exchange, or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails76(SecuritiesTradeDetails76 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, for example, of the stock
	 * exchange, or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails78(SecuritiesTradeDetails78 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}