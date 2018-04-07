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
import com.tools20022.repository.choice.References43Choice;

/**
 * If OtherMessageIdentification is used, then the message to be cancelled must
 * not be one that can be identified using of the message identification
 * available in the choice list.
 */
public class ConstraintOtherMessageIdentificationUsageRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.References43Choice
	 * References43Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherMessageIdentificationUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OtherMessageIdentification is used, then the message to be cancelled must not be one that can be identified using of the message identification available in the choice list."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<References43Choice> forReferences43Choice = new MMConstraint<References43Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherMessageIdentificationUsageRule";
			definition = "If OtherMessageIdentification is used, then the message to be cancelled must not be one that can be identified using of the message identification available in the choice list.";
			owner_lazy = () -> References43Choice.mmObject();
		}

		@Override
		public void executeValidator(References43Choice obj) throws Exception {
			checkReferences43Choice(obj);
		}
	};

	/**
	 * If OtherMessageIdentification is used, then the message to be cancelled
	 * must not be one that can be identified using of the message
	 * identification available in the choice list.
	 */
	public static void checkReferences43Choice(References43Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}