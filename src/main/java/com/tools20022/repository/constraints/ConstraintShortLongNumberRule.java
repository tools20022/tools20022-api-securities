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
import com.tools20022.repository.choice.DocumentNumber4Choice;
import com.tools20022.repository.choice.DocumentNumber5Choice;

/**
 * ShortNumber must contain the FIN message type number of the linked message.
 * LongNumber must contain the XML message identifier of the linked message.
 */
public class ConstraintShortLongNumberRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.DocumentNumber4Choice
	 * DocumentNumber4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLongNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ShortNumber must contain the FIN message type number of the linked message. LongNumber must contain the XML message identifier of the linked message."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DocumentNumber4Choice> forDocumentNumber4Choice = new MMConstraint<DocumentNumber4Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLongNumberRule";
			definition = "ShortNumber must contain the FIN message type number of the linked message. LongNumber must contain the XML message identifier of the linked message.";
			owner_lazy = () -> DocumentNumber4Choice.mmObject();
		}

		@Override
		public void executeValidator(DocumentNumber4Choice obj) throws Exception {
			checkDocumentNumber4Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.DocumentNumber5Choice
	 * DocumentNumber5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLongNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ShortNumber must contain the FIN message type number of the linked message. LongNumber must contain the XML message identifier of the linked message."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DocumentNumber5Choice> forDocumentNumber5Choice = new MMConstraint<DocumentNumber5Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLongNumberRule";
			definition = "ShortNumber must contain the FIN message type number of the linked message. LongNumber must contain the XML message identifier of the linked message.";
			owner_lazy = () -> DocumentNumber5Choice.mmObject();
		}

		@Override
		public void executeValidator(DocumentNumber5Choice obj) throws Exception {
			checkDocumentNumber5Choice(obj);
		}
	};

	/**
	 * ShortNumber must contain the FIN message type number of the linked
	 * message. LongNumber must contain the XML message identifier of the linked
	 * message.
	 */
	public static void checkDocumentNumber4Choice(DocumentNumber4Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ShortNumber must contain the FIN message type number of the linked
	 * message. LongNumber must contain the XML message identifier of the linked
	 * message.
	 */
	public static void checkDocumentNumber5Choice(DocumentNumber5Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}