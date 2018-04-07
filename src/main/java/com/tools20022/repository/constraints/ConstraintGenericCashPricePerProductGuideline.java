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

/**
 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
 * prices received or paid in the course of an event. The specific meaning
 * (redemption price, subscription price, reinvestment price, etc.) is derived
 * from the event type.
 */
public class ConstraintGenericCashPricePerProductGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice59
	 * CorporateActionPrice59}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice59> forCorporateActionPrice59 = new MMConstraint<CorporateActionPrice59>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice59.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice59 obj) throws Exception {
			checkCorporateActionPrice59(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption56 CashOption56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption56> forCashOption56 = new MMConstraint<CashOption56>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price.) is derived from the event type.";
			owner_lazy = () -> CashOption56.mmObject();
		}

		@Override
		public void executeValidator(CashOption56 obj) throws Exception {
			checkCashOption56(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceDetails23 PriceDetails23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceDetails23> forPriceDetails23 = new MMConstraint<PriceDetails23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> PriceDetails23.mmObject();
		}

		@Override
		public void executeValidator(PriceDetails23 obj) throws Exception {
			checkPriceDetails23(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice60
	 * CorporateActionPrice60}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice60> forCorporateActionPrice60 = new MMConstraint<CorporateActionPrice60>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice60.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice60 obj) throws Exception {
			checkCorporateActionPrice60(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceDetails22 PriceDetails22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceDetails22> forPriceDetails22 = new MMConstraint<PriceDetails22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> PriceDetails22.mmObject();
		}

		@Override
		public void executeValidator(PriceDetails22 obj) throws Exception {
			checkPriceDetails22(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice56
	 * CorporateActionPrice56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice56> forCorporateActionPrice56 = new MMConstraint<CorporateActionPrice56>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice56.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice56 obj) throws Exception {
			checkCorporateActionPrice56(obj);
		}
	};

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, etc.) is
	 * derived from the event type.
	 */
	public static void checkCorporateActionPrice59(CorporateActionPrice59 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price.) is derived
	 * from the event type.
	 */
	public static void checkCashOption56(CashOption56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkPriceDetails23(PriceDetails23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Generic Cash Price Received per Product (OFFR) and Generic Cash Price
	 * Paid per Product (PRPP) are prices received or paid in the course of an
	 * event. The specific meaning (redemption price, subscription price,
	 * reinvestment price, etc.) is derived from the event type.
	 */
	public static void checkCorporateActionPrice60(CorporateActionPrice60 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkPriceDetails22(PriceDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, etc.) is
	 * derived from the event type.
	 */
	public static void checkCorporateActionPrice56(CorporateActionPrice56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}