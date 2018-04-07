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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.msg.CorporateActionGeneralInformation107;
import com.tools20022.repository.msg.CorporateActionGeneralInformation109;
import com.tools20022.repository.msg.CorporateActionGeneralInformation110;

/**
 * If Code is present, the code OTHR (Other) must only be used in case no other
 * corporate action event code is appropriate. <br>
 * <br>
 * If Code is present, the code CHAN (Change) must only be used in case no other
 * corporate action event code is appropriate and only for an event which
 * relates to a change. <br>
 * <br>
 * If Code is present, the code REDM (Final Maturity) must only be used when the
 * redemption is decided by the issuer and not by the securities holders.
 */
public class ConstraintEventTypeRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType74Choice
	 * CorporateActionEventType74Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code is present, the code OTHR (Other) must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN (Change) must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM (Final Maturity) must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType74Choice> forCorporateActionEventType74Choice = new MMConstraint<CorporateActionEventType74Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR (Other) must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN (Change) must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM (Final Maturity) must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType74Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType74Choice obj) throws Exception {
			checkCorporateActionEventType74Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation110
	 * CorporateActionGeneralInformation110}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation110> forCorporateActionGeneralInformation110 = new MMConstraint<CorporateActionGeneralInformation110>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation110.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation110 obj) throws Exception {
			checkCorporateActionGeneralInformation110(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType75Choice
	 * CorporateActionEventType75Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code is present, the code OTHR (Other) must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN (Change) must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM (Final Maturity) must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType75Choice> forCorporateActionEventType75Choice = new MMConstraint<CorporateActionEventType75Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR (Other) must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN (Change) must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM (Final Maturity) must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType75Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType75Choice obj) throws Exception {
			checkCorporateActionEventType75Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation109
	 * CorporateActionGeneralInformation109}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation109> forCorporateActionGeneralInformation109 = new MMConstraint<CorporateActionGeneralInformation109>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation109.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation109 obj) throws Exception {
			checkCorporateActionGeneralInformation109(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation107
	 * CorporateActionGeneralInformation107}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation107> forCorporateActionGeneralInformation107 = new MMConstraint<CorporateActionGeneralInformation107>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation107.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation107 obj) throws Exception {
			checkCorporateActionGeneralInformation107(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType76Choice
	 * CorporateActionEventType76Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code is present, the code OTHR (Other) must only be used if no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN (Change) must only be used if no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM (Final Maturity) must only be used if the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType76Choice> forCorporateActionEventType76Choice = new MMConstraint<CorporateActionEventType76Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR (Other) must only be used if no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN (Change) must only be used if no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM (Final Maturity) must only be used if the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType76Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType76Choice obj) throws Exception {
			checkCorporateActionEventType76Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType52Choice
	 * CorporateActionEventType52Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType52Choice> forCorporateActionEventType52Choice = new MMConstraint<CorporateActionEventType52Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType52Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType52Choice obj) throws Exception {
			checkCorporateActionEventType52Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType73Choice
	 * CorporateActionEventType73Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The use of a specific corporate action event type code is allowed only if this specific event triggers a securities movement as per the Event Interpretation Grid published by the Securities Market Practice Group (SMPG).\r\nThe corporate action event indicator code OTHR must only be used in case no other corporate action event code is appropriate.\r\nThe corporate action event indicator code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change.\r\nThe corporate action event indicator code REDM must only be used when the redemption is decided by the issuer and not by the holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType73Choice> forCorporateActionEventType73Choice = new MMConstraint<CorporateActionEventType73Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "The use of a specific corporate action event type code is allowed only if this specific event triggers a securities movement as per the Event Interpretation Grid published by the Securities Market Practice Group (SMPG).\r\nThe corporate action event indicator code OTHR must only be used in case no other corporate action event code is appropriate.\r\nThe corporate action event indicator code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change.\r\nThe corporate action event indicator code REDM must only be used when the redemption is decided by the issuer and not by the holders.";
			owner_lazy = () -> CorporateActionEventType73Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType73Choice obj) throws Exception {
			checkCorporateActionEventType73Choice(obj);
		}
	};

	/**
	 * If Code is present, the code OTHR (Other) must only be used in case no
	 * other corporate action event code is appropriate. <br>
	 * <br>
	 * If Code is present, the code CHAN (Change) must only be used in case no
	 * other corporate action event code is appropriate and only for an event
	 * which relates to a change. <br>
	 * <br>
	 * If Code is present, the code REDM (Final Maturity) must only be used when
	 * the redemption is decided by the issuer and not by the securities
	 * holders.
	 */
	public static void checkCorporateActionEventType74Choice(CorporateActionEventType74Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation110(CorporateActionGeneralInformation110 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code is present, the code OTHR (Other) must only be used in case no
	 * other corporate action event code is appropriate. <br>
	 * <br>
	 * If Code is present, the code CHAN (Change) must only be used in case no
	 * other corporate action event code is appropriate and only for an event
	 * which relates to a change. <br>
	 * <br>
	 * If Code is present, the code REDM (Final Maturity) must only be used when
	 * the redemption is decided by the issuer and not by the securities
	 * holders.
	 */
	public static void checkCorporateActionEventType75Choice(CorporateActionEventType75Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation109(CorporateActionGeneralInformation109 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation107(CorporateActionGeneralInformation107 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code is present, the code OTHR (Other) must only be used if no other
	 * corporate action event code is appropriate. <br>
	 * <br>
	 * If Code is present, the code CHAN (Change) must only be used if no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change. <br>
	 * <br>
	 * If Code is present, the code REDM (Final Maturity) must only be used if
	 * the redemption is decided by the issuer and not by the securities
	 * holders.
	 */
	public static void checkCorporateActionEventType76Choice(CorporateActionEventType76Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate. <br>
	 * <br>
	 * If Code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change. <br>
	 * <br>
	 * If Code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType52Choice(CorporateActionEventType52Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The use of a specific corporate action event type code is allowed only if
	 * this specific event triggers a securities movement as per the Event
	 * Interpretation Grid published by the Securities Market Practice Group
	 * (SMPG).<br>
	 * The corporate action event indicator code OTHR must only be used in case
	 * no other corporate action event code is appropriate.<br>
	 * The corporate action event indicator code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change.<br>
	 * The corporate action event indicator code REDM must only be used when the
	 * redemption is decided by the issuer and not by the holders.
	 */
	public static void checkCorporateActionEventType73Choice(CorporateActionEventType73Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}