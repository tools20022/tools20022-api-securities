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
 * In addition to the settlement date (ISO 20022 mandatory), trade date is one
 * of the 10 common elements recommended by SMPG for equities and fixed income
 * settlement instructions.<br>
 * For more details, see the relevant market practice document on www.smpg.info.
 */
public class ConstraintTradeDateGuideline {

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
	 * name} = "TradeDateGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails79> forSecuritiesTradeDetails79 = new MMConstraint<SecuritiesTradeDetails79>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateGuideline";
			definition = "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
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
	 * name} = "TradeDateGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails73> forSecuritiesTradeDetails73 = new MMConstraint<SecuritiesTradeDetails73>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateGuideline";
			definition = "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
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
	 * name} = "TradeDateGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails75> forSecuritiesTradeDetails75 = new MMConstraint<SecuritiesTradeDetails75>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateGuideline";
			definition = "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails76
	 * SecuritiesTradeDetails76}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails76> forSecuritiesTradeDetails76 = new MMConstraint<SecuritiesTradeDetails76>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateGuideline";
			definition = "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
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
	 * name} = "TradeDateGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails78> forSecuritiesTradeDetails78 = new MMConstraint<SecuritiesTradeDetails78>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateGuideline";
			definition = "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SecuritiesTradeDetails78.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails78 obj) throws Exception {
			checkSecuritiesTradeDetails78(obj);
		}
	};

	/**
	 * In addition to the settlement date (ISO 20022 mandatory), trade date is
	 * one of the 10 common elements recommended by SMPG for equities and fixed
	 * income settlement instructions.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSecuritiesTradeDetails79(SecuritiesTradeDetails79 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In addition to the settlement date (ISO 20022 mandatory), trade date is
	 * one of the 10 common elements recommended by SMPG for equities and fixed
	 * income settlement instructions.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSecuritiesTradeDetails73(SecuritiesTradeDetails73 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In addition to the settlement date (ISO 20022 mandatory), trade date is
	 * one of the 10 common elements recommended by SMPG for equities and fixed
	 * income settlement instructions.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSecuritiesTradeDetails75(SecuritiesTradeDetails75 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In addition to the settlement date (ISO 20022 mandatory), trade date is
	 * one of the 10 common elements recommended by SMPG for equities and fixed
	 * income settlement instructions.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSecuritiesTradeDetails76(SecuritiesTradeDetails76 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In addition to the settlement date (ISO 20022 mandatory), trade date is
	 * one of the 10 common elements recommended by SMPG for equities and fixed
	 * income settlement instructions.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSecuritiesTradeDetails78(SecuritiesTradeDetails78 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}