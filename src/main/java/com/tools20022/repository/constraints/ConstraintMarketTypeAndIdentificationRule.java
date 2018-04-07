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
 * If Type/Code is OverTheCounter (OTCO) and if Identification is present, then
 * Identification/Description must specify a system.<br>
 * If Type/Code is Exchange (EXCH) and if Identification is present, then
 * Identification/MarketIdentifierCode must be present.
 */
public class ConstraintMarketTypeAndIdentificationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification85
	 * MarketIdentification85}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketTypeAndIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type/Code is OverTheCounter (OTCO) and if Identification is present, then Identification/Description must specify a system.\r\nIf Type/Code is Exchange (EXCH) and if Identification is present, then Identification/MarketIdentifierCode must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification85> forMarketIdentification85 = new MMConstraint<MarketIdentification85>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketTypeAndIdentificationRule";
			definition = "If Type/Code is OverTheCounter (OTCO) and if Identification is present, then Identification/Description must specify a system.\r\nIf Type/Code is Exchange (EXCH) and if Identification is present, then Identification/MarketIdentifierCode must be present.";
			owner_lazy = () -> MarketIdentification85.mmObject();
		}

		@Override
		public void executeValidator(MarketIdentification85 obj) throws Exception {
			checkMarketIdentification85(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification20
	 * MarketIdentification20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketTypeAndIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If MarketType is OverTheCounter (OTCO), then Identification/Description must specify a system. If MarketType is Exchange (EXCH), then Identification/MarketIdentificationCode must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMarketTypeAndIdentificationRule#forMarketIdentification84
	 * ConstraintMarketTypeAndIdentificationRule.forMarketIdentification84}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification20> forMarketIdentification20 = new MMConstraint<MarketIdentification20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketTypeAndIdentificationRule";
			definition = "If MarketType is OverTheCounter (OTCO), then Identification/Description must specify a system. If MarketType is Exchange (EXCH), then Identification/MarketIdentificationCode must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMarketTypeAndIdentificationRule.forMarketIdentification84);
			owner_lazy = () -> MarketIdentification20.mmObject();
		}

		@Override
		public void executeValidator(MarketIdentification20 obj) throws Exception {
			checkMarketIdentification20(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification79
	 * MarketIdentification79}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketTypeAndIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type/Code is OverTheCounter (OTCO) and if Identification is present, then Identification/Description must specify a system.\r\nIf Type/Code is Exchange (EXCH) and if Identification is present, then Identification/MarketIdentifierCode must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification79> forMarketIdentification79 = new MMConstraint<MarketIdentification79>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketTypeAndIdentificationRule";
			definition = "If Type/Code is OverTheCounter (OTCO) and if Identification is present, then Identification/Description must specify a system.\r\nIf Type/Code is Exchange (EXCH) and if Identification is present, then Identification/MarketIdentifierCode must be present.";
			owner_lazy = () -> MarketIdentification79.mmObject();
		}

		@Override
		public void executeValidator(MarketIdentification79 obj) throws Exception {
			checkMarketIdentification79(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification84
	 * MarketIdentification84}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketTypeAndIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type/Code is OverTheCounter (OTCO) and if Identification is present, then Identification/Description must specify a system.\r\nIf Type/Code is Exchange (EXCH) and if Identification is present, then Identification/MarketIdentifierCode must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMarketTypeAndIdentificationRule#forMarketIdentification20
	 * ConstraintMarketTypeAndIdentificationRule.forMarketIdentification20}</li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification84> forMarketIdentification84 = new MMConstraint<MarketIdentification84>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketTypeAndIdentificationRule";
			definition = "If Type/Code is OverTheCounter (OTCO) and if Identification is present, then Identification/Description must specify a system.\r\nIf Type/Code is Exchange (EXCH) and if Identification is present, then Identification/MarketIdentifierCode must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMarketTypeAndIdentificationRule.forMarketIdentification20;
			owner_lazy = () -> MarketIdentification84.mmObject();
		}

		@Override
		public void executeValidator(MarketIdentification84 obj) throws Exception {
			checkMarketIdentification84(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification80
	 * MarketIdentification80}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketTypeAndIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type/Code is OverTheCounter (OTCO) and if Identification is present, then Identification/Description must specify a system.\r\nIf Type/Code is Exchange (EXCH) and if Identification is present, then Identification/MarketIdentifierCode must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification80> forMarketIdentification80 = new MMConstraint<MarketIdentification80>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketTypeAndIdentificationRule";
			definition = "If Type/Code is OverTheCounter (OTCO) and if Identification is present, then Identification/Description must specify a system.\r\nIf Type/Code is Exchange (EXCH) and if Identification is present, then Identification/MarketIdentifierCode must be present.";
			owner_lazy = () -> MarketIdentification80.mmObject();
		}

		@Override
		public void executeValidator(MarketIdentification80 obj) throws Exception {
			checkMarketIdentification80(obj);
		}
	};

	/**
	 * If Type/Code is OverTheCounter (OTCO) and if Identification is present,
	 * then Identification/Description must specify a system.<br>
	 * If Type/Code is Exchange (EXCH) and if Identification is present, then
	 * Identification/MarketIdentifierCode must be present.
	 */
	public static void checkMarketIdentification85(MarketIdentification85 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If MarketType is OverTheCounter (OTCO), then Identification/Description
	 * must specify a system. If MarketType is Exchange (EXCH), then
	 * Identification/MarketIdentificationCode must be present.
	 */
	public static void checkMarketIdentification20(MarketIdentification20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Type/Code is OverTheCounter (OTCO) and if Identification is present,
	 * then Identification/Description must specify a system.<br>
	 * If Type/Code is Exchange (EXCH) and if Identification is present, then
	 * Identification/MarketIdentifierCode must be present.
	 */
	public static void checkMarketIdentification79(MarketIdentification79 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Type/Code is OverTheCounter (OTCO) and if Identification is present,
	 * then Identification/Description must specify a system.<br>
	 * If Type/Code is Exchange (EXCH) and if Identification is present, then
	 * Identification/MarketIdentifierCode must be present.
	 */
	public static void checkMarketIdentification84(MarketIdentification84 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Type/Code is OverTheCounter (OTCO) and if Identification is present,
	 * then Identification/Description must specify a system.<br>
	 * If Type/Code is Exchange (EXCH) and if Identification is present, then
	 * Identification/MarketIdentifierCode must be present.
	 */
	public static void checkMarketIdentification80(MarketIdentification80 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}