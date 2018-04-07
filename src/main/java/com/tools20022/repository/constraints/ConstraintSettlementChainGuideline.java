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
import java.util.Arrays;

/**
 * SMPG recommends that at least three settlement parties be instructed in
 * equity or fixed income receive<br>
 * free or against payment settlement instructions; the depository, the
 * participant of the depository (Party1) and the client of Party1 (Party2).<br>
 * The data format for the identification of Party1 depends on the market. If no
 * country specific requirement is available, BIC is recommended.<br>
 * For more details, see the relevant market practice document on www.smpg.info.
 */
public class ConstraintSettlementChainGuideline {

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
	 * name} = "SettlementChainGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SMPG recommends that at least three settlement parties be instructed in equity or fixed income receive\r\nfree or against payment settlement instructions; the depository, the participant of the depository (Party1) and the client of Party1 (Party2).\r\nThe data format for the identification of Party1 depends on the market. If no country specific requirement is available, BIC is recommended.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementChainGuideline#forSettlementParties36
	 * ConstraintSettlementChainGuideline.forSettlementParties36}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties62> forSettlementParties62 = new MMConstraint<SettlementParties62>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementChainGuideline";
			definition = "SMPG recommends that at least three settlement parties be instructed in equity or fixed income receive\r\nfree or against payment settlement instructions; the depository, the participant of the depository (Party1) and the client of Party1 (Party2).\r\nThe data format for the identification of Party1 depends on the market. If no country specific requirement is available, BIC is recommended.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementChainGuideline.forSettlementParties36;
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
	 * name} = "SettlementChainGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SMPG recommends that at least three settlement parties be instructed in equity or fixed income receive\r\nfree or against payment settlement instructions; the depository, the participant of the depository (Party1) and the client of Party1 (Party2).\r\nThe data format for the identification of Party1 depends on the market. If no country specific requirement is available, BIC is recommended.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementChainGuideline#forSettlementParties62
	 * ConstraintSettlementChainGuideline.forSettlementParties62}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties36> forSettlementParties36 = new MMConstraint<SettlementParties36>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementChainGuideline";
			definition = "SMPG recommends that at least three settlement parties be instructed in equity or fixed income receive\r\nfree or against payment settlement instructions; the depository, the participant of the depository (Party1) and the client of Party1 (Party2).\r\nThe data format for the identification of Party1 depends on the market. If no country specific requirement is available, BIC is recommended.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementChainGuideline.forSettlementParties62);
			owner_lazy = () -> SettlementParties36.mmObject();
		}

		@Override
		public void executeValidator(SettlementParties36 obj) throws Exception {
			checkSettlementParties36(obj);
		}
	};

	/**
	 * SMPG recommends that at least three settlement parties be instructed in
	 * equity or fixed income receive<br>
	 * free or against payment settlement instructions; the depository, the
	 * participant of the depository (Party1) and the client of Party1 (Party2).<br>
	 * The data format for the identification of Party1 depends on the market.
	 * If no country specific requirement is available, BIC is recommended.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties62(SettlementParties62 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SMPG recommends that at least three settlement parties be instructed in
	 * equity or fixed income receive<br>
	 * free or against payment settlement instructions; the depository, the
	 * participant of the depository (Party1) and the client of Party1 (Party2).<br>
	 * The data format for the identification of Party1 depends on the market.
	 * If no country specific requirement is available, BIC is recommended.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties36(SettlementParties36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}