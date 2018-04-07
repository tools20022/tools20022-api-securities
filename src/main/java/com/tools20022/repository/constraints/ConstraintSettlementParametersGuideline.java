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
import com.tools20022.repository.msg.SettlementDetails142;
import com.tools20022.repository.msg.SettlementDetails145;
import com.tools20022.repository.msg.SettlementDetails43;

/**
 * • Physical settlement:<br>
 * In case of physical receipt at local agent level, the receiving agent must
 * receive a receipt free instruction<br>
 * for reconciliation purposes. If the final beneficiary of the securities uses
 * a global custodian, the receipt free<br>
 * instruction will be sent to the global custodian that will forward it to his
 * receiving agent on the market.<br>
 * For physical settlement, SettlementTransactionCondition/Physical must be
 * used.<br>
 * • Partial settlement:<br>
 * This market practice only applies in markets where partial settlement is
 * allowed.<br>
 * If an account owner wants to specify in its original instruction that partial
 * settlement is allowed or not, they<br>
 * must use the PartialSettlementIndicator.<br>
 * • Book Transfer:<br>
 * The use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other
 * booktransfer<br>
 * related fields is governed by a market practice document.<br>
 * • Block Trades:<br>
 * The parent transaction must be identified using the BloclTrade field with
 * code BLPA. The children<br>
 * transactions must be identified using the code BLCH.<br>
 * <br>
 * For more details, see the relevant market practice document on www.smpg.info.
 */
public class ConstraintSettlementParametersGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43
	 * SettlementDetails43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParametersGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails43> forSettlementDetails43 = new MMConstraint<SettlementDetails43>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParametersGuideline";
			definition = "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementDetails43.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails43 obj) throws Exception {
			checkSettlementDetails43(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142
	 * SettlementDetails142}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParametersGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails142> forSettlementDetails142 = new MMConstraint<SettlementDetails142>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParametersGuideline";
			definition = "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementDetails142.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails142 obj) throws Exception {
			checkSettlementDetails142(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145
	 * SettlementDetails145}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParametersGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails145> forSettlementDetails145 = new MMConstraint<SettlementDetails145>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParametersGuideline";
			definition = "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementDetails145.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails145 obj) throws Exception {
			checkSettlementDetails145(obj);
		}
	};

	/**
	 * • Physical settlement:<br>
	 * In case of physical receipt at local agent level, the receiving agent
	 * must receive a receipt free instruction<br>
	 * for reconciliation purposes. If the final beneficiary of the securities
	 * uses a global custodian, the receipt free<br>
	 * instruction will be sent to the global custodian that will forward it to
	 * his receiving agent on the market.<br>
	 * For physical settlement, SettlementTransactionCondition/Physical must be
	 * used.<br>
	 * • Partial settlement:<br>
	 * This market practice only applies in markets where partial settlement is
	 * allowed.<br>
	 * If an account owner wants to specify in its original instruction that
	 * partial settlement is allowed or not, they<br>
	 * must use the PartialSettlementIndicator.<br>
	 * • Book Transfer:<br>
	 * The use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other
	 * booktransfer<br>
	 * related fields is governed by a market practice document.<br>
	 * • Block Trades:<br>
	 * The parent transaction must be identified using the BloclTrade field with
	 * code BLPA. The children<br>
	 * transactions must be identified using the code BLCH.<br>
	 * <br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementDetails43(SettlementDetails43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * • Physical settlement:<br>
	 * In case of physical receipt at local agent level, the receiving agent
	 * must receive a receipt free instruction<br>
	 * for reconciliation purposes. If the final beneficiary of the securities
	 * uses a global custodian, the receipt free<br>
	 * instruction will be sent to the global custodian that will forward it to
	 * his receiving agent on the market.<br>
	 * For physical settlement, SettlementTransactionCondition/Physical must be
	 * used.<br>
	 * • Partial settlement:<br>
	 * This market practice only applies in markets where partial settlement is
	 * allowed.<br>
	 * If an account owner wants to specify in its original instruction that
	 * partial settlement is allowed or not, they<br>
	 * must use the PartialSettlementIndicator.<br>
	 * • Book Transfer:<br>
	 * The use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other
	 * booktransfer<br>
	 * related fields is governed by a market practice document.<br>
	 * • Block Trades:<br>
	 * The parent transaction must be identified using the BloclTrade field with
	 * code BLPA. The children<br>
	 * transactions must be identified using the code BLCH.<br>
	 * <br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementDetails142(SettlementDetails142 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * • Physical settlement:<br>
	 * In case of physical receipt at local agent level, the receiving agent
	 * must receive a receipt free instruction<br>
	 * for reconciliation purposes. If the final beneficiary of the securities
	 * uses a global custodian, the receipt free<br>
	 * instruction will be sent to the global custodian that will forward it to
	 * his receiving agent on the market.<br>
	 * For physical settlement, SettlementTransactionCondition/Physical must be
	 * used.<br>
	 * • Partial settlement:<br>
	 * This market practice only applies in markets where partial settlement is
	 * allowed.<br>
	 * If an account owner wants to specify in its original instruction that
	 * partial settlement is allowed or not, they<br>
	 * must use the PartialSettlementIndicator.<br>
	 * • Book Transfer:<br>
	 * The use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other
	 * booktransfer<br>
	 * related fields is governed by a market practice document.<br>
	 * • Block Trades:<br>
	 * The parent transaction must be identified using the BloclTrade field with
	 * code BLPA. The children<br>
	 * transactions must be identified using the code BLCH.<br>
	 * <br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementDetails145(SettlementDetails145 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}