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
import com.tools20022.repository.area.seev.AgentCAElectionAdviceV01;
import com.tools20022.repository.area.seev.CorporateActionInstructionV08;

/**
 * If CorporateActionInstruction/OptionType/Code value is TAXI (Tax
 * Instruction), then at least one occurrence of BeneficialOwnerDetails must be
 * present.
 */
public class ConstraintOptionTypeRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV08
	 * CorporateActionInstructionV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionInstruction/OptionType/Code value is TAXI (Tax Instruction), then at least one occurrence of BeneficialOwnerDetails must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV08> for_seev_CorporateActionInstructionV08 = new MMConstraint<CorporateActionInstructionV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeRule";
			definition = "If CorporateActionInstruction/OptionType/Code value is TAXI (Tax Instruction), then at least one occurrence of BeneficialOwnerDetails must be present.";
			owner_lazy = () -> CorporateActionInstructionV08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionV08 obj) throws Exception {
			check_seev_CorporateActionInstructionV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionAdviceV01
	 * AgentCAElectionAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ElectionDetails/OptionType is present, then OptionType is not allowed in any occurrences of ElectionDetails/SecuritiesMovementDetails/DebitAccountDetails and/or ElectionDetails/SecuritiesMovementDetails/CreditAccountDetails.\n\nIf ElectionDetails/SecuritiesMovementDetails/DebitAccountDetails/OptionType is present at least once and/or ElectionDetails/SecuritiesMovementDetails/CreditAccountDetails/OptionType is present at least once then ElectionDetails/CorporateActionOptionType is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AgentCAElectionAdviceV01> for_seev_AgentCAElectionAdviceV01 = new MMConstraint<AgentCAElectionAdviceV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeRule";
			definition = "If ElectionDetails/OptionType is present, then OptionType is not allowed in any occurrences of ElectionDetails/SecuritiesMovementDetails/DebitAccountDetails and/or ElectionDetails/SecuritiesMovementDetails/CreditAccountDetails.\n\nIf ElectionDetails/SecuritiesMovementDetails/DebitAccountDetails/OptionType is present at least once and/or ElectionDetails/SecuritiesMovementDetails/CreditAccountDetails/OptionType is present at least once then ElectionDetails/CorporateActionOptionType is not allowed.";
			owner_lazy = () -> AgentCAElectionAdviceV01.mmObject();
		}

		@Override
		public void executeValidator(AgentCAElectionAdviceV01 obj) throws Exception {
			check_seev_AgentCAElectionAdviceV01(obj);
		}
	};

	/**
	 * If CorporateActionInstruction/OptionType/Code value is TAXI (Tax
	 * Instruction), then at least one occurrence of BeneficialOwnerDetails must
	 * be present.
	 */
	public static void check_seev_CorporateActionInstructionV08(CorporateActionInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ElectionDetails/OptionType is present, then OptionType is not allowed
	 * in any occurrences of
	 * ElectionDetails/SecuritiesMovementDetails/DebitAccountDetails and/or
	 * ElectionDetails/SecuritiesMovementDetails/CreditAccountDetails.
	 * 
	 * If ElectionDetails/SecuritiesMovementDetails/DebitAccountDetails/
	 * OptionType is present at least once and/or
	 * ElectionDetails/SecuritiesMovementDetails/CreditAccountDetails/OptionType
	 * is present at least once then ElectionDetails/CorporateActionOptionType
	 * is not allowed.
	 */
	public static void check_seev_AgentCAElectionAdviceV01(AgentCAElectionAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}