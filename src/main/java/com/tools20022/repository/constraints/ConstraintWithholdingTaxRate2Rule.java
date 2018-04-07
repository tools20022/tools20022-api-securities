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
 * Only a single occurrence of either WithholdingTaxRate/Amount or
 * WithholdingTaxRate/Rate or WithholdingTaxRate/NotSpecifiedRate may be
 * present, only one of those elements may be present. <br>
 * (MT 564 NVR C7).
 */
public class ConstraintWithholdingTaxRate2Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87
	 * CorporateActionRate87}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either WithholdingTaxRate/Amount or WithholdingTaxRate/Rate or WithholdingTaxRate/NotSpecifiedRate may be present, only one of those elements may be present. \r\n(MT 564 NVR C7)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate87> forCorporateActionRate87 = new MMConstraint<CorporateActionRate87>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxRate2Rule";
			definition = "Only a single occurrence of either WithholdingTaxRate/Amount or WithholdingTaxRate/Rate or WithholdingTaxRate/NotSpecifiedRate may be present, only one of those elements may be present. \r\n(MT 564 NVR C7).";
			owner_lazy = () -> CorporateActionRate87.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate87 obj) throws Exception {
			checkCorporateActionRate87(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate88
	 * CorporateActionRate88}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either WithholdingTaxRate/Amount or WithholdingTaxRate/Rate or WithholdingTaxRate/NotSpecifiedRate may be present, only one of these elements may be present. \r\n(MT 564 NVR C7)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate88> forCorporateActionRate88 = new MMConstraint<CorporateActionRate88>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxRate2Rule";
			definition = "Only a single occurrence of either WithholdingTaxRate/Amount or WithholdingTaxRate/Rate or WithholdingTaxRate/NotSpecifiedRate may be present, only one of these elements may be present. \r\n(MT 564 NVR C7).";
			owner_lazy = () -> CorporateActionRate88.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate88 obj) throws Exception {
			checkCorporateActionRate88(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails31 RateDetails31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either WithholdingTaxRate/Amount or WithholdingTaxRate/Rate or WithholdingTaxRate/NotSpecifiedRate may be present, only one of these elements may be present. \r\n(MT 564 NVR C7)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails31> forRateDetails31 = new MMConstraint<RateDetails31>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxRate2Rule";
			definition = "Only a single occurrence of either WithholdingTaxRate/Amount or WithholdingTaxRate/Rate or WithholdingTaxRate/NotSpecifiedRate may be present, only one of these elements may be present. \r\n(MT 564 NVR C7).";
			owner_lazy = () -> RateDetails31.mmObject();
		}

		@Override
		public void executeValidator(RateDetails31 obj) throws Exception {
			checkRateDetails31(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate86
	 * CorporateActionRate86}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either WithholdingTaxRate/Amount or WithholdingTaxRate/Rate or WithholdingTaxRate/NotSpecifiedRate may be present, only one of these elements may be present. \r\n(MT 564 NVR C7)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate86> forCorporateActionRate86 = new MMConstraint<CorporateActionRate86>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxRate2Rule";
			definition = "Only a single occurrence of either WithholdingTaxRate/Amount or WithholdingTaxRate/Rate or WithholdingTaxRate/NotSpecifiedRate may be present, only one of these elements may be present. \r\n(MT 564 NVR C7).";
			owner_lazy = () -> CorporateActionRate86.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate86 obj) throws Exception {
			checkCorporateActionRate86(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails32 RateDetails32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxRate2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either WithholdingTaxRate/Amount or WithholdingTaxRate/Rate or WithholdingTaxRate/NotSpecifiedRate may be present, only one of these elements may be present. \r\n(MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails32> forRateDetails32 = new MMConstraint<RateDetails32>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxRate2Rule";
			definition = "Only a single occurrence of either WithholdingTaxRate/Amount or WithholdingTaxRate/Rate or WithholdingTaxRate/NotSpecifiedRate may be present, only one of these elements may be present. \r\n(MT 566 NVR C3).";
			owner_lazy = () -> RateDetails32.mmObject();
		}

		@Override
		public void executeValidator(RateDetails32 obj) throws Exception {
			checkRateDetails32(obj);
		}
	};

	/**
	 * Only a single occurrence of either WithholdingTaxRate/Amount or
	 * WithholdingTaxRate/Rate or WithholdingTaxRate/NotSpecifiedRate may be
	 * present, only one of those elements may be present. <br>
	 * (MT 564 NVR C7).
	 */
	public static void checkCorporateActionRate87(CorporateActionRate87 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either WithholdingTaxRate/Amount or
	 * WithholdingTaxRate/Rate or WithholdingTaxRate/NotSpecifiedRate may be
	 * present, only one of these elements may be present. <br>
	 * (MT 564 NVR C7).
	 */
	public static void checkCorporateActionRate88(CorporateActionRate88 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either WithholdingTaxRate/Amount or
	 * WithholdingTaxRate/Rate or WithholdingTaxRate/NotSpecifiedRate may be
	 * present, only one of these elements may be present. <br>
	 * (MT 564 NVR C7).
	 */
	public static void checkRateDetails31(RateDetails31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either WithholdingTaxRate/Amount or
	 * WithholdingTaxRate/Rate or WithholdingTaxRate/NotSpecifiedRate may be
	 * present, only one of these elements may be present. <br>
	 * (MT 564 NVR C7).
	 */
	public static void checkCorporateActionRate86(CorporateActionRate86 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either WithholdingTaxRate/Amount or
	 * WithholdingTaxRate/Rate or WithholdingTaxRate/NotSpecifiedRate may be
	 * present, only one of these elements may be present. <br>
	 * (MT 566 NVR C3).
	 */
	public static void checkRateDetails32(RateDetails32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}