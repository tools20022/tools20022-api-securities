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
import com.tools20022.repository.msg.SettlementParties36;
import com.tools20022.repository.msg.SettlementParties62;
import com.tools20022.repository.msg.SettlementParties63;
import java.util.Arrays;

/**
 * In case of own account internal transfer, own account external transfer,
 * portfolio transfer and in specie transfer (see SecuritiesTransactionType),
 * the account of (delivering) Party2 at (delivering) Party1 must be provided.<br>
 * For more details, see the relevant market practice document on www.smpg.info.
 */
public class ConstraintBookTransferGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties63
	 * SettlementParties63}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookTransferGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of own account internal transfer, own account external transfer, portfolio transfer and in specie transfer (see SecuritiesTransactionType), the account of (delivering) Party2 at (delivering) Party1 must be provided.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties63> forSettlementParties63 = new MMConstraint<SettlementParties63>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookTransferGuideline";
			definition = "In case of own account internal transfer, own account external transfer, portfolio transfer and in specie transfer (see SecuritiesTransactionType), the account of (delivering) Party2 at (delivering) Party1 must be provided.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementParties63.mmObject();
		}

		@Override
		public void executeValidator(SettlementParties63 obj) throws Exception {
			checkSettlementParties63(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties62
	 * SettlementParties62}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookTransferGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of own account internal transfer, own account external transfer, portfolio transfer and in specie transfer (see SecuritiesTransactionType), the account of (delivering) Party2 at (delivering) Party1 must be provided.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBookTransferGuideline#forSettlementParties36
	 * ConstraintBookTransferGuideline.forSettlementParties36}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties62> forSettlementParties62 = new MMConstraint<SettlementParties62>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookTransferGuideline";
			definition = "In case of own account internal transfer, own account external transfer, portfolio transfer and in specie transfer (see SecuritiesTransactionType), the account of (delivering) Party2 at (delivering) Party1 must be provided.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBookTransferGuideline.forSettlementParties36;
			owner_lazy = () -> SettlementParties62.mmObject();
		}

		@Override
		public void executeValidator(SettlementParties62 obj) throws Exception {
			checkSettlementParties62(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties36
	 * SettlementParties36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookTransferGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of own account internal transfer, own account external transfer, portfolio transfer and in specie transfer (see SecuritiesTransactionType), the account of (delivering) Party2 at (delivering) Party1 must be provided.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBookTransferGuideline#forSettlementParties62
	 * ConstraintBookTransferGuideline.forSettlementParties62}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties36> forSettlementParties36 = new MMConstraint<SettlementParties36>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookTransferGuideline";
			definition = "In case of own account internal transfer, own account external transfer, portfolio transfer and in specie transfer (see SecuritiesTransactionType), the account of (delivering) Party2 at (delivering) Party1 must be provided.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBookTransferGuideline.forSettlementParties62);
			owner_lazy = () -> SettlementParties36.mmObject();
		}

		@Override
		public void executeValidator(SettlementParties36 obj) throws Exception {
			checkSettlementParties36(obj);
		}
	};

	/**
	 * In case of own account internal transfer, own account external transfer,
	 * portfolio transfer and in specie transfer (see
	 * SecuritiesTransactionType), the account of (delivering) Party2 at
	 * (delivering) Party1 must be provided.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties63(SettlementParties63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of own account internal transfer, own account external transfer,
	 * portfolio transfer and in specie transfer (see
	 * SecuritiesTransactionType), the account of (delivering) Party2 at
	 * (delivering) Party1 must be provided.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties62(SettlementParties62 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of own account internal transfer, own account external transfer,
	 * portfolio transfer and in specie transfer (see
	 * SecuritiesTransactionType), the account of (delivering) Party2 at
	 * (delivering) Party1 must be provided.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties36(SettlementParties36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}