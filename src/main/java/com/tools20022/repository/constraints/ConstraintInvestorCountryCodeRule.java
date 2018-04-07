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
import com.tools20022.repository.msg.OtherParties26;
import com.tools20022.repository.msg.OtherParties27;
import com.tools20022.repository.msg.OtherParties28;
import com.tools20022.repository.msg.TransactionDetails105;

/**
 * If Investor is used with a country code, then the country code specifies the
 * nationality of the investor, for example for the settlement of certain
 * securities (that is airlines, defence manufacturers) under the EU
 * legislation.
 */
public class ConstraintInvestorCountryCodeRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties26 OtherParties26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties26> forOtherParties26 = new MMConstraint<OtherParties26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			owner_lazy = () -> OtherParties26.mmObject();
		}

		@Override
		public void executeValidator(OtherParties26 obj) throws Exception {
			checkOtherParties26(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails105
	 * TransactionDetails105}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is present with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails105> forTransactionDetails105 = new MMConstraint<TransactionDetails105>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is present with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			owner_lazy = () -> TransactionDetails105.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails105 obj) throws Exception {
			checkTransactionDetails105(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties28 OtherParties28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties28> forOtherParties28 = new MMConstraint<OtherParties28>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			owner_lazy = () -> OtherParties28.mmObject();
		}

		@Override
		public void executeValidator(OtherParties28 obj) throws Exception {
			checkOtherParties28(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties27 OtherParties27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties27> forOtherParties27 = new MMConstraint<OtherParties27>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			owner_lazy = () -> OtherParties27.mmObject();
		}

		@Override
		public void executeValidator(OtherParties27 obj) throws Exception {
			checkOtherParties27(obj);
		}
	};

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkOtherParties26(OtherParties26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is present with a country code, then the country code
	 * specifies the nationality of the investor, for example for the settlement
	 * of certain securities (that is airlines, defence manufacturers) under the
	 * EU legislation.
	 */
	public static void checkTransactionDetails105(TransactionDetails105 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkOtherParties28(OtherParties28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkOtherParties27(OtherParties27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}