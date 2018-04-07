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
import java.util.Arrays;

/**
 * If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be
 * identified, the ISO 10383 Market Identifier Code (MIC) must be used.
 */
public class ConstraintPlaceOfListingRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPlaceOfListingRule#forFinancialInstrumentAttributes91
	 * ConstraintPlaceOfListingRule.forFinancialInstrumentAttributes91}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes64> forFinancialInstrumentAttributes64 = new MMConstraint<FinancialInstrumentAttributes64>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListingRule";
			definition = "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPlaceOfListingRule.forFinancialInstrumentAttributes91);
			owner_lazy = () -> FinancialInstrumentAttributes64.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes64 obj) throws Exception {
			checkFinancialInstrumentAttributes64(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44
	 * FinancialInstrumentAttributes44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes44> forFinancialInstrumentAttributes44 = new MMConstraint<FinancialInstrumentAttributes44>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListingRule";
			definition = "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used.";
			owner_lazy = () -> FinancialInstrumentAttributes44.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes44 obj) throws Exception {
			checkFinancialInstrumentAttributes44(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes92
	 * FinancialInstrumentAttributes92}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PlaceOfListing is used and an ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPlaceOfListingRule#forFinancialInstrumentAttributes63
	 * ConstraintPlaceOfListingRule.forFinancialInstrumentAttributes63}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes92> forFinancialInstrumentAttributes92 = new MMConstraint<FinancialInstrumentAttributes92>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListingRule";
			definition = "If PlaceOfListing is used and an ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPlaceOfListingRule.forFinancialInstrumentAttributes63;
			owner_lazy = () -> FinancialInstrumentAttributes92.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes92 obj) throws Exception {
			checkFinancialInstrumentAttributes92(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91
	 * FinancialInstrumentAttributes91}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPlaceOfListingRule#forFinancialInstrumentAttributes64
	 * ConstraintPlaceOfListingRule.forFinancialInstrumentAttributes64}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes91> forFinancialInstrumentAttributes91 = new MMConstraint<FinancialInstrumentAttributes91>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListingRule";
			definition = "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPlaceOfListingRule.forFinancialInstrumentAttributes64;
			owner_lazy = () -> FinancialInstrumentAttributes91.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes91 obj) throws Exception {
			checkFinancialInstrumentAttributes91(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63
	 * FinancialInstrumentAttributes63}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PlaceOfListing is used and an ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPlaceOfListingRule#forFinancialInstrumentAttributes92
	 * ConstraintPlaceOfListingRule.forFinancialInstrumentAttributes92}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes63> forFinancialInstrumentAttributes63 = new MMConstraint<FinancialInstrumentAttributes63>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListingRule";
			definition = "If PlaceOfListing is used and an ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPlaceOfListingRule.forFinancialInstrumentAttributes92);
			owner_lazy = () -> FinancialInstrumentAttributes63.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes63 obj) throws Exception {
			checkFinancialInstrumentAttributes63(obj);
		}
	};

	/**
	 * If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be
	 * identified, the ISO 10383 Market Identifier Code (MIC) must be used.
	 */
	public static void checkFinancialInstrumentAttributes64(FinancialInstrumentAttributes64 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be
	 * identified, the ISO 10383 Market Identifier Code (MIC) must be used.
	 */
	public static void checkFinancialInstrumentAttributes44(FinancialInstrumentAttributes44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PlaceOfListing is used and an ISO 10383 MIC exists for the market to
	 * be identified, the ISO 10383 Market Identifier Code (MIC) must be used.
	 */
	public static void checkFinancialInstrumentAttributes92(FinancialInstrumentAttributes92 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be
	 * identified, the ISO 10383 Market Identifier Code (MIC) must be used.
	 */
	public static void checkFinancialInstrumentAttributes91(FinancialInstrumentAttributes91 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PlaceOfListing is used and an ISO 10383 MIC exists for the market to
	 * be identified, the ISO 10383 Market Identifier Code (MIC) must be used.
	 */
	public static void checkFinancialInstrumentAttributes63(FinancialInstrumentAttributes63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}