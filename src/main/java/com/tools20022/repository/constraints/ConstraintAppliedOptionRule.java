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
import com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09;
import com.tools20022.repository.area.seev.CorporateActionNotificationV08;
import com.tools20022.repository.msg.CorporateActionOption138;
import com.tools20022.repository.msg.CorporateActionOption139;

/**
 * If CorporateActionOptionDetails/AppliedOptionIndicator value is 'true' or '1'
 * (Yes) in one or more occurrences of CorporateActionOptionDetails, then
 * CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must
 * be CHOS (MandatoryWithOptions) and at least one of the
 * CorporateActionDetails/AdditionalBusinessProcessIndicator/Code values must be
 * REAC (RequiredAction).
 */
public class ConstraintAppliedOptionRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08
	 * CorporateActionNotificationV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionOptionDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code values must be REAC (RequiredAction)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV08> for_seev_CorporateActionNotificationV08 = new MMConstraint<CorporateActionNotificationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If CorporateActionOptionDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionOptionDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code values must be REAC (RequiredAction).";
			owner_lazy = () -> CorporateActionNotificationV08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotificationV08 obj) throws Exception {
			check_seev_CorporateActionNotificationV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139
	 * CorporateActionOption139}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption139> forCorporateActionOption139 = new MMConstraint<CorporateActionOption139>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes).";
			owner_lazy = () -> CorporateActionOption139.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption139 obj) throws Exception {
			checkCorporateActionOption139(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138
	 * CorporateActionOption138}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption138> forCorporateActionOption138 = new MMConstraint<CorporateActionOption138>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes).";
			owner_lazy = () -> CorporateActionOption138.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption138 obj) throws Exception {
			checkCorporateActionOption138(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09
	 * CorporateActionMovementPreliminaryAdviceV09}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionMovementDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionMovementDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code values must be REAC (RequiredAction)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV09> for_seev_CorporateActionMovementPreliminaryAdviceV09 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If CorporateActionMovementDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionMovementDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code values must be REAC (RequiredAction).";
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV09.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceV09 obj) throws Exception {
			check_seev_CorporateActionMovementPreliminaryAdviceV09(obj);
		}
	};

	/**
	 * If CorporateActionOptionDetails/AppliedOptionIndicator value is 'true' or
	 * '1' (Yes) in one or more occurrences of CorporateActionOptionDetails,
	 * then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code
	 * value must be CHOS (MandatoryWithOptions) and at least one of the
	 * CorporateActionDetails/AdditionalBusinessProcessIndicator/Code values
	 * must be REAC (RequiredAction).
	 */
	public static void check_seev_CorporateActionNotificationV08(CorporateActionNotificationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is
	 * present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator
	 * value must not be '1' or 'true' (Yes).
	 */
	public static void checkCorporateActionOption139(CorporateActionOption139 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is
	 * present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator
	 * value must not be '1' or 'true' (Yes).
	 */
	public static void checkCorporateActionOption138(CorporateActionOption138 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionMovementDetails/AppliedOptionIndicator value is 'true'
	 * or '1' (Yes) in one or more occurrences of
	 * CorporateActionMovementDetails, then
	 * CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value
	 * must be CHOS (MandatoryWithOptions) and at least one of the
	 * CorporateActionDetails/AdditionalBusinessProcessIndicator/Code values
	 * must be REAC (RequiredAction).
	 */
	public static void check_seev_CorporateActionMovementPreliminaryAdviceV09(CorporateActionMovementPreliminaryAdviceV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}