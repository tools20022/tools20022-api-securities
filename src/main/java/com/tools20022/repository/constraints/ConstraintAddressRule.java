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
import com.tools20022.repository.msg.AccountParties16;

/**
 * If ModificationScopeIndication is INSE (InsertNewDataSet), then one of the
 * following must be present:<br>
 * PrincipalAccountParty/./Party/./ModifiedPostalAddress/
 * ModificationScopeIndication/INSE (InsertNewDataSet)<br>
 * CustodianForMinor/Party/./ModifiedPostalAddress/ModificationScopeIndication/
 * INSE (InsertNewDataSet)<br>
 * SecondaryOwner/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE
 * (InsertNewDataSet)<br>
 * Beneficiary/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE
 * (InsertNewDataSet)<br>
 * PowerOfAttorney/Party/./ModifiedPostalAddress/ModificationScopeIndication/
 * INSE (InsertNewDataSet)<br>
 * LegalGuardian/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE
 * (InsertNewDataSet)<br>
 * SuccessorOnDeath/Party/./ModifiedPostalAddress/ModificationScopeIndication/
 * INSE (InsertNewDataSet)<br>
 * Administrator/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE
 * (InsertNewDataSet)<br>
 * OtherParty/OtherPartyDetails/Party/./ModifiedPostalAddress/
 * ModificationScopeIndication/INSE (InsertNewDataSet)<br>
 * Granter/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE
 * (InsertNewDataSet)<br>
 * Settlor/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE
 * (InsertNewDataSet)<br>
 * SeniorManagingOfficial/./ModifiedPostalAddress/ModificationScopeIndication/
 * INSE (InsertNewDataSet)<br>
 * Protector/./ModifiedPostalAddress/ModificationScopeIndication/INSE
 * (InsertNewDataSet).
 */
public class ConstraintAddressRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties16
	 * AccountParties16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ModificationScopeIndication is INSE (InsertNewDataSet), then one of the following must be present:\r\nPrincipalAccountParty/./Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nCustodianForMinor/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nSecondaryOwner/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nBeneficiary/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nPowerOfAttorney/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nLegalGuardian/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nSuccessorOnDeath/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nAdministrator/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nOtherParty/OtherPartyDetails/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nGranter/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nSettlor/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nSeniorManagingOfficial/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nProtector/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties16> forAccountParties16 = new MMConstraint<AccountParties16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressRule";
			definition = "If ModificationScopeIndication is INSE (InsertNewDataSet), then one of the following must be present:\r\nPrincipalAccountParty/./Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nCustodianForMinor/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nSecondaryOwner/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nBeneficiary/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nPowerOfAttorney/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nLegalGuardian/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nSuccessorOnDeath/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nAdministrator/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nOtherParty/OtherPartyDetails/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nGranter/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nSettlor/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nSeniorManagingOfficial/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nProtector/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet).";
			owner_lazy = () -> AccountParties16.mmObject();
		}

		@Override
		public void executeValidator(AccountParties16 obj) throws Exception {
			checkAccountParties16(obj);
		}
	};

	/**
	 * If ModificationScopeIndication is INSE (InsertNewDataSet), then one of
	 * the following must be present:<br>
	 * PrincipalAccountParty/./Party/./ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE (InsertNewDataSet)<br>
	 * CustodianForMinor/Party/./ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE (InsertNewDataSet)<br>
	 * SecondaryOwner/Party/./ModifiedPostalAddress/ModificationScopeIndication/
	 * INSE (InsertNewDataSet)<br>
	 * Beneficiary/Party/./ModifiedPostalAddress/ModificationScopeIndication/
	 * INSE (InsertNewDataSet)<br>
	 * PowerOfAttorney/Party/./ModifiedPostalAddress/ModificationScopeIndication
	 * /INSE (InsertNewDataSet)<br>
	 * LegalGuardian/Party/./ModifiedPostalAddress/ModificationScopeIndication/
	 * INSE (InsertNewDataSet)<br>
	 * SuccessorOnDeath/Party/./ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE (InsertNewDataSet)<br>
	 * Administrator/Party/./ModifiedPostalAddress/ModificationScopeIndication/
	 * INSE (InsertNewDataSet)<br>
	 * OtherParty/OtherPartyDetails/Party/./ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE (InsertNewDataSet)<br>
	 * Granter/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE
	 * (InsertNewDataSet)<br>
	 * Settlor/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE
	 * (InsertNewDataSet)<br>
	 * SeniorManagingOfficial/./ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE (InsertNewDataSet)<br>
	 * Protector/./ModifiedPostalAddress/ModificationScopeIndication/INSE
	 * (InsertNewDataSet).
	 */
	public static void checkAccountParties16(AccountParties16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}