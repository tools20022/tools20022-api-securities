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
 * The AdditionalInformation field in all elements must not contain information
 * that can be provided in a structured field unless bilaterally agreed or
 * advised differently in the element definition as in NarrativeVersion.
 */
public class ConstraintAdditionalInforrmationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount34
	 * PartyIdentificationAndAccount34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount34> forPartyIdentificationAndAccount34 = new MMConstraint<PartyIdentificationAndAccount34>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			owner_lazy = () -> PartyIdentificationAndAccount34.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentificationAndAccount34 obj) throws Exception {
			checkPartyIdentificationAndAccount34(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification92
	 * PartyIdentification92}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification92> forPartyIdentification92 = new MMConstraint<PartyIdentification92>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			owner_lazy = () -> PartyIdentification92.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification92 obj) throws Exception {
			checkPartyIdentification92(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount121
	 * PartyIdentificationAndAccount121}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount121> forPartyIdentificationAndAccount121 = new MMConstraint<PartyIdentificationAndAccount121>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			owner_lazy = () -> PartyIdentificationAndAccount121.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentificationAndAccount121 obj) throws Exception {
			checkPartyIdentificationAndAccount121(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount122
	 * PartyIdentificationAndAccount122}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount122> forPartyIdentificationAndAccount122 = new MMConstraint<PartyIdentificationAndAccount122>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			owner_lazy = () -> PartyIdentificationAndAccount122.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentificationAndAccount122 obj) throws Exception {
			checkPartyIdentificationAndAccount122(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount120
	 * PartyIdentificationAndAccount120}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount120> forPartyIdentificationAndAccount120 = new MMConstraint<PartyIdentificationAndAccount120>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInforrmationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			owner_lazy = () -> PartyIdentificationAndAccount120.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentificationAndAccount120 obj) throws Exception {
			checkPartyIdentificationAndAccount120(obj);
		}
	};

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkPartyIdentificationAndAccount34(PartyIdentificationAndAccount34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkPartyIdentification92(PartyIdentification92 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkPartyIdentificationAndAccount121(PartyIdentificationAndAccount121 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkPartyIdentificationAndAccount122(PartyIdentificationAndAccount122 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkPartyIdentificationAndAccount120(PartyIdentificationAndAccount120 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}