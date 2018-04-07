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
 * In a delivery, the receiving depository is to be understood as the requested
 * depository of the receiving counterparty. <br>
 * In a receive, the delivering depository is to be understood as the requested
 * depository of the delivering counterparty.<br>
 * The field must be populated with the BIC of a national or international CSD.
 * When no CSD exists in a particular market, the stock exchange BIC will be
 * used.<br>
 * Country code should be used for settlement taking place outside of an
 * institution published in the PSET's BIC list. This includes physical
 * deliveries and investment funds not settling at a CSD. <br>
 * The format and content of the settlement party sequences will comply with the
 * market practices published for the counterparty depository included in the
 * message.<br>
 * For more details, see the relevant market practice document on www.smpg.info.
 */
public class ConstraintDepositoryGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties23
	 * SettlementParties23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties23> forSettlementParties23 = new MMConstraint<SettlementParties23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryGuideline";
			definition = "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementParties23.mmObject();
		}

		@Override
		public void executeValidator(SettlementParties23 obj) throws Exception {
			checkSettlementParties23(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount15
	 * ReceivingPartiesAndAccount15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceivingPartiesAndAccount15> forReceivingPartiesAndAccount15 = new MMConstraint<ReceivingPartiesAndAccount15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryGuideline";
			definition = "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.";
			owner_lazy = () -> ReceivingPartiesAndAccount15.mmObject();
		}

		@Override
		public void executeValidator(ReceivingPartiesAndAccount15 obj) throws Exception {
			checkReceivingPartiesAndAccount15(obj);
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
	 * name} = "DepositoryGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDepositoryGuideline#forSettlementParties36
	 * ConstraintDepositoryGuideline.forSettlementParties36}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties62> forSettlementParties62 = new MMConstraint<SettlementParties62>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryGuideline";
			definition = "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDepositoryGuideline.forSettlementParties36;
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
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount7
	 * ReceivingPartiesAndAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDepositoryGuideline#forReceivingPartiesAndAccount11
	 * ConstraintDepositoryGuideline.forReceivingPartiesAndAccount11}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceivingPartiesAndAccount7> forReceivingPartiesAndAccount7 = new MMConstraint<ReceivingPartiesAndAccount7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryGuideline";
			definition = "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDepositoryGuideline.forReceivingPartiesAndAccount11);
			owner_lazy = () -> ReceivingPartiesAndAccount7.mmObject();
		}

		@Override
		public void executeValidator(ReceivingPartiesAndAccount7 obj) throws Exception {
			checkReceivingPartiesAndAccount7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount11
	 * ReceivingPartiesAndAccount11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDepositoryGuideline#forReceivingPartiesAndAccount7
	 * ConstraintDepositoryGuideline.forReceivingPartiesAndAccount7}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceivingPartiesAndAccount11> forReceivingPartiesAndAccount11 = new MMConstraint<ReceivingPartiesAndAccount11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryGuideline";
			definition = "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDepositoryGuideline.forReceivingPartiesAndAccount7;
			owner_lazy = () -> ReceivingPartiesAndAccount11.mmObject();
		}

		@Override
		public void executeValidator(ReceivingPartiesAndAccount11 obj) throws Exception {
			checkReceivingPartiesAndAccount11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount11
	 * DeliveringPartiesAndAccount11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDepositoryGuideline#forDeliveringPartiesAndAccount7
	 * ConstraintDepositoryGuideline.forDeliveringPartiesAndAccount7}</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliveringPartiesAndAccount11> forDeliveringPartiesAndAccount11 = new MMConstraint<DeliveringPartiesAndAccount11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryGuideline";
			definition = "In a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDepositoryGuideline.forDeliveringPartiesAndAccount7;
			owner_lazy = () -> DeliveringPartiesAndAccount11.mmObject();
		}

		@Override
		public void executeValidator(DeliveringPartiesAndAccount11 obj) throws Exception {
			checkDeliveringPartiesAndAccount11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount15
	 * DeliveringPartiesAndAccount15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliveringPartiesAndAccount15> forDeliveringPartiesAndAccount15 = new MMConstraint<DeliveringPartiesAndAccount15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryGuideline";
			definition = "In a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.";
			owner_lazy = () -> DeliveringPartiesAndAccount15.mmObject();
		}

		@Override
		public void executeValidator(DeliveringPartiesAndAccount15 obj) throws Exception {
			checkDeliveringPartiesAndAccount15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount7
	 * DeliveringPartiesAndAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDepositoryGuideline#forDeliveringPartiesAndAccount11
	 * ConstraintDepositoryGuideline.forDeliveringPartiesAndAccount11}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliveringPartiesAndAccount7> forDeliveringPartiesAndAccount7 = new MMConstraint<DeliveringPartiesAndAccount7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryGuideline";
			definition = "In a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDepositoryGuideline.forDeliveringPartiesAndAccount11);
			owner_lazy = () -> DeliveringPartiesAndAccount7.mmObject();
		}

		@Override
		public void executeValidator(DeliveringPartiesAndAccount7 obj) throws Exception {
			checkDeliveringPartiesAndAccount7(obj);
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
	 * name} = "DepositoryGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDepositoryGuideline#forSettlementParties62
	 * ConstraintDepositoryGuideline.forSettlementParties62}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties36> forSettlementParties36 = new MMConstraint<SettlementParties36>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryGuideline";
			definition = "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDepositoryGuideline.forSettlementParties62);
			owner_lazy = () -> SettlementParties36.mmObject();
		}

		@Override
		public void executeValidator(SettlementParties36 obj) throws Exception {
			checkSettlementParties36(obj);
		}
	};

	/**
	 * In a delivery, the receiving depository is to be understood as the
	 * requested depository of the receiving counterparty. <br>
	 * In a receive, the delivering depository is to be understood as the
	 * requested depository of the delivering counterparty.<br>
	 * The field must be populated with the BIC of a national or international
	 * CSD. When no CSD exists in a particular market, the stock exchange BIC
	 * will be used.<br>
	 * Country code should be used for settlement taking place outside of an
	 * institution published in the PSET's BIC list. This includes physical
	 * deliveries and investment funds not settling at a CSD. <br>
	 * The format and content of the settlement party sequences will comply with
	 * the market practices published for the counterparty depository included
	 * in the message.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties23(SettlementParties23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In a delivery, the receiving depository is to be understood as the
	 * requested depository of the receiving counterparty. <br>
	 * The field must be populated with the BIC of a national or international
	 * CSD. When no CSD exists in a particular market, the stock exchange BIC
	 * will be used.
	 */
	public static void checkReceivingPartiesAndAccount15(ReceivingPartiesAndAccount15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In a delivery, the receiving depository is to be understood as the
	 * requested depository of the receiving counterparty. <br>
	 * In a receive, the delivering depository is to be understood as the
	 * requested depository of the delivering counterparty.<br>
	 * The field must be populated with the BIC of a national or international
	 * CSD. When no CSD exists in a particular market, the stock exchange BIC
	 * will be used.<br>
	 * Country code should be used for settlement taking place outside of an
	 * institution published in the PSET's BIC list. This includes physical
	 * deliveries and investment funds not settling at a CSD. <br>
	 * The format and content of the settlement party sequences will comply with
	 * the market practices published for the counterparty depository included
	 * in the message.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties62(SettlementParties62 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In a delivery, the receiving depository is to be understood as the
	 * requested depository of the receiving counterparty. <br>
	 * The field must be populated with the BIC of a national or international
	 * CSD. When no CSD exists in a particular market, the stock exchange BIC
	 * will be used.
	 */
	public static void checkReceivingPartiesAndAccount7(ReceivingPartiesAndAccount7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In a delivery, the receiving depository is to be understood as the
	 * requested depository of the receiving counterparty. <br>
	 * The field must be populated with the BIC of a national or international
	 * CSD. When no CSD exists in a particular market, the stock exchange BIC
	 * will be used.
	 */
	public static void checkReceivingPartiesAndAccount11(ReceivingPartiesAndAccount11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In a receive, the delivering depository is to be understood as the
	 * requested depository of the delivering counterparty.<br>
	 * The field must be populated with the BIC of a national or international
	 * CSD. When no CSD exists in a particular market, the stock exchange BIC
	 * will be used.
	 */
	public static void checkDeliveringPartiesAndAccount11(DeliveringPartiesAndAccount11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In a receive, the delivering depository is to be understood as the
	 * requested depository of the delivering counterparty.<br>
	 * The field must be populated with the BIC of a national or international
	 * CSD. When no CSD exists in a particular market, the stock exchange BIC
	 * will be used.
	 */
	public static void checkDeliveringPartiesAndAccount15(DeliveringPartiesAndAccount15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In a receive, the delivering depository is to be understood as the
	 * requested depository of the delivering counterparty.<br>
	 * The field must be populated with the BIC of a national or international
	 * CSD. When no CSD exists in a particular market, the stock exchange BIC
	 * will be used.
	 */
	public static void checkDeliveringPartiesAndAccount7(DeliveringPartiesAndAccount7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In a delivery, the receiving depository is to be understood as the
	 * requested depository of the receiving counterparty. <br>
	 * In a receive, the delivering depository is to be understood as the
	 * requested depository of the delivering counterparty.<br>
	 * The field must be populated with the BIC of a national or international
	 * CSD. When no CSD exists in a particular market, the stock exchange BIC
	 * will be used.<br>
	 * Country code should be used for settlement taking place outside of an
	 * institution published in the PSET's BIC list. This includes physical
	 * deliveries and investment funds not settling at a CSD. <br>
	 * The format and content of the settlement party sequences will comply with
	 * the market practices published for the counterparty depository included
	 * in the message.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties36(SettlementParties36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}