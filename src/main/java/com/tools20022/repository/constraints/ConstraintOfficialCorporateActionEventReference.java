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
 * The Securities Market Practice Group (SMPG) has published market practice
 * recommendations on the structure and usage of the Official Corporate Action
 * Event Reference (COAF). Those recommendations are<br>
 * available in the SMPG Global Market Practices Part 1 document on
 * www.smpg.info.
 */
public class ConstraintOfficialCorporateActionEventReference {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation128
	 * CorporateActionGeneralInformation128}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation128> forCorporateActionGeneralInformation128 = new MMConstraint<CorporateActionGeneralInformation128>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation128.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation128 obj) throws Exception {
			checkCorporateActionGeneralInformation128(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation125
	 * CorporateActionGeneralInformation125}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). These recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation125> forCorporateActionGeneralInformation125 = new MMConstraint<CorporateActionGeneralInformation125>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). These recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation125.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation125 obj) throws Exception {
			checkCorporateActionGeneralInformation125(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation110
	 * CorporateActionGeneralInformation110}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation110> forCorporateActionGeneralInformation110 = new MMConstraint<CorporateActionGeneralInformation110>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation110.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation110 obj) throws Exception {
			checkCorporateActionGeneralInformation110(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation124
	 * CorporateActionGeneralInformation124}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are available in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation124> forCorporateActionGeneralInformation124 = new MMConstraint<CorporateActionGeneralInformation124>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are available in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation124.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation124 obj) throws Exception {
			checkCorporateActionGeneralInformation124(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation109
	 * CorporateActionGeneralInformation109}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation109> forCorporateActionGeneralInformation109 = new MMConstraint<CorporateActionGeneralInformation109>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation109.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation109 obj) throws Exception {
			checkCorporateActionGeneralInformation109(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation107
	 * CorporateActionGeneralInformation107}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation107> forCorporateActionGeneralInformation107 = new MMConstraint<CorporateActionGeneralInformation107>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation107.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation107 obj) throws Exception {
			checkCorporateActionGeneralInformation107(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation126
	 * CorporateActionGeneralInformation126}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation126> forCorporateActionGeneralInformation126 = new MMConstraint<CorporateActionGeneralInformation126>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation126.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation126 obj) throws Exception {
			checkCorporateActionGeneralInformation126(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation92
	 * CorporateActionGeneralInformation92}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation92> forCorporateActionGeneralInformation92 = new MMConstraint<CorporateActionGeneralInformation92>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are\r\navailable in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation92.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation92 obj) throws Exception {
			checkCorporateActionGeneralInformation92(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation127
	 * CorporateActionGeneralInformation127}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are available in the SMPG Global Market Practices Part 1 document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation127> forCorporateActionGeneralInformation127 = new MMConstraint<CorporateActionGeneralInformation127>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventReference";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the structure and usage of the Official Corporate Action Event Reference (COAF). Those recommendations are available in the SMPG Global Market Practices Part 1 document on www.smpg.info.";
			owner_lazy = () -> CorporateActionGeneralInformation127.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation127 obj) throws Exception {
			checkCorporateActionGeneralInformation127(obj);
		}
	};

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation128(CorporateActionGeneralInformation128 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). These recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation125(CorporateActionGeneralInformation125 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation110(CorporateActionGeneralInformation110 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are available in the
	 * SMPG Global Market Practices Part 1 document on www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation124(CorporateActionGeneralInformation124 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation109(CorporateActionGeneralInformation109 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation107(CorporateActionGeneralInformation107 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation126(CorporateActionGeneralInformation126 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are<br>
	 * available in the SMPG Global Market Practices Part 1 document on
	 * www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation92(CorporateActionGeneralInformation92 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the structure and usage of the Official Corporate
	 * Action Event Reference (COAF). Those recommendations are available in the
	 * SMPG Global Market Practices Part 1 document on www.smpg.info.
	 */
	public static void checkCorporateActionGeneralInformation127(CorporateActionGeneralInformation127 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}