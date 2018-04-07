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
 * Unless bilaterally agreed between the Sender and Receiver, if
 * TransactionAdditionalDetails is present, then it must not contain information
 * that can be provided in a structured field.
 */
public class ConstraintAdditionalDetailsRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails103
	 * TransactionDetails103}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails103> forTransactionDetails103 = new MMConstraint<TransactionDetails103>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> TransactionDetails103.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails103 obj) throws Exception {
			checkTransactionDetails103(obj);
		}
	};
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
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forFinancialInstrumentAttributes91
	 * ConstraintAdditionalDetailsRule.forFinancialInstrumentAttributes91}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes64> forFinancialInstrumentAttributes64 = new MMConstraint<FinancialInstrumentAttributes64>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forFinancialInstrumentAttributes91);
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails77
	 * SecuritiesTradeDetails77}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails77> forSecuritiesTradeDetails77 = new MMConstraint<SecuritiesTradeDetails77>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails77.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails77 obj) throws Exception {
			checkSecuritiesTradeDetails77(obj);
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
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes44> forFinancialInstrumentAttributes44 = new MMConstraint<FinancialInstrumentAttributes44>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
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
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forFinancialInstrumentAttributes63
	 * ConstraintAdditionalDetailsRule.forFinancialInstrumentAttributes63}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes92> forFinancialInstrumentAttributes92 = new MMConstraint<FinancialInstrumentAttributes92>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forFinancialInstrumentAttributes63;
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails74
	 * SecuritiesTradeDetails74}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails74> forSecuritiesTradeDetails74 = new MMConstraint<SecuritiesTradeDetails74>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails74.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails74 obj) throws Exception {
			checkSecuritiesTradeDetails74(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If SettlementInstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails35> forSecuritiesFinancingTransactionDetails35 = new MMConstraint<SecuritiesFinancingTransactionDetails35>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If SettlementInstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingTransactionDetails35 obj) throws Exception {
			checkSecuritiesFinancingTransactionDetails35(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46
	 * IntraPositionDetails46}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails46> forIntraPositionDetails46 = new MMConstraint<IntraPositionDetails46>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> IntraPositionDetails46.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionDetails46 obj) throws Exception {
			checkIntraPositionDetails46(obj);
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
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forFinancialInstrumentAttributes64
	 * ConstraintAdditionalDetailsRule.forFinancialInstrumentAttributes64}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes91> forFinancialInstrumentAttributes91 = new MMConstraint<FinancialInstrumentAttributes91>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forFinancialInstrumentAttributes64;
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
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails33
	 * IntraPositionDetails33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails33> forIntraPositionDetails33 = new MMConstraint<IntraPositionDetails33>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> IntraPositionDetails33.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionDetails33 obj) throws Exception {
			checkIntraPositionDetails33(obj);
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
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forFinancialInstrumentAttributes92
	 * ConstraintAdditionalDetailsRule.forFinancialInstrumentAttributes92}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes63> forFinancialInstrumentAttributes63 = new MMConstraint<FinancialInstrumentAttributes63>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FinancialInstrumentAttributeAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forFinancialInstrumentAttributes92);
			owner_lazy = () -> FinancialInstrumentAttributes63.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes63 obj) throws Exception {
			checkFinancialInstrumentAttributes63(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails79
	 * SecuritiesTradeDetails79}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails79> forSecuritiesTradeDetails79 = new MMConstraint<SecuritiesTradeDetails79>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails79.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails79 obj) throws Exception {
			checkSecuritiesTradeDetails79(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails73
	 * SecuritiesTradeDetails73}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails73> forSecuritiesTradeDetails73 = new MMConstraint<SecuritiesTradeDetails73>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails73.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails73 obj) throws Exception {
			checkSecuritiesTradeDetails73(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails75
	 * SecuritiesTradeDetails75}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails75> forSecuritiesTradeDetails75 = new MMConstraint<SecuritiesTradeDetails75>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails75.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails75 obj) throws Exception {
			checkSecuritiesTradeDetails75(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation2
	 * PartyTextInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if DeclarationlDetails and/or PartyContactDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyTextInformation2> forPartyTextInformation2 = new MMConstraint<PartyTextInformation2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if DeclarationlDetails and/or PartyContactDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> PartyTextInformation2.mmObject();
		}

		@Override
		public void executeValidator(PartyTextInformation2 obj) throws Exception {
			checkPartyTextInformation2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails5
	 * SecuritiesTradeDetails5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails5> forSecuritiesTradeDetails5 = new MMConstraint<SecuritiesTradeDetails5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails5.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails5 obj) throws Exception {
			checkSecuritiesTradeDetails5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails76
	 * SecuritiesTradeDetails76}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails76> forSecuritiesTradeDetails76 = new MMConstraint<SecuritiesTradeDetails76>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails76.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails76 obj) throws Exception {
			checkSecuritiesTradeDetails76(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails78
	 * SecuritiesTradeDetails78}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails78> forSecuritiesTradeDetails78 = new MMConstraint<SecuritiesTradeDetails78>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, If FXAdditionalDetails and/or SettlementInstructionProcessingAdditionalDetails are present, then they must not contain information that can be provided in a structured field.";
			owner_lazy = () -> SecuritiesTradeDetails78.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails78 obj) throws Exception {
			checkSecuritiesTradeDetails78(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails15
	 * IntraPositionMovementDetails15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementDetails15> forIntraPositionMovementDetails15 = new MMConstraint<IntraPositionMovementDetails15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if InstructionProcessingAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> IntraPositionMovementDetails15.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionMovementDetails15 obj) throws Exception {
			checkIntraPositionMovementDetails15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails104
	 * TransactionDetails104}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails104> forTransactionDetails104 = new MMConstraint<TransactionDetails104>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDetailsRule";
			definition = "Unless bilaterally agreed between the Sender and Receiver, if TransactionAdditionalDetails is present, then it must not contain information that can be provided in a structured field.";
			owner_lazy = () -> TransactionDetails104.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails104 obj) throws Exception {
			checkTransactionDetails104(obj);
		}
	};

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails103(TransactionDetails103 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FinancialInstrumentAttributeAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkFinancialInstrumentAttributes64(FinancialInstrumentAttributes64 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails77(SecuritiesTradeDetails77 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FinancialInstrumentAttributeAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkFinancialInstrumentAttributes44(FinancialInstrumentAttributes44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FinancialInstrumentAttributeAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkFinancialInstrumentAttributes92(FinancialInstrumentAttributes92 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails74(SecuritiesTradeDetails74 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * SettlementInstructionProcessingAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesFinancingTransactionDetails35(SecuritiesFinancingTransactionDetails35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionDetails46(IntraPositionDetails46 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FinancialInstrumentAttributeAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkFinancialInstrumentAttributes91(FinancialInstrumentAttributes91 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionDetails33(IntraPositionDetails33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FinancialInstrumentAttributeAdditionalDetails is present, then it must
	 * not contain information that can be provided in a structured field.
	 */
	public static void checkFinancialInstrumentAttributes63(FinancialInstrumentAttributes63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails79(SecuritiesTradeDetails79 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails73(SecuritiesTradeDetails73 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails75(SecuritiesTradeDetails75 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * DeclarationlDetails and/or PartyContactDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkPartyTextInformation2(PartyTextInformation2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails5(SecuritiesTradeDetails5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails76(SecuritiesTradeDetails76 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, If
	 * FXAdditionalDetails and/or
	 * SettlementInstructionProcessingAdditionalDetails are present, then they
	 * must not contain information that can be provided in a structured field.
	 */
	public static void checkSecuritiesTradeDetails78(SecuritiesTradeDetails78 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * InstructionProcessingAdditionalDetails is present, then it must not
	 * contain information that can be provided in a structured field.
	 */
	public static void checkIntraPositionMovementDetails15(IntraPositionMovementDetails15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed between the Sender and Receiver, if
	 * TransactionAdditionalDetails is present, then it must not contain
	 * information that can be provided in a structured field.
	 */
	public static void checkTransactionDetails104(TransactionDetails104 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}