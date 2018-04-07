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
 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
 * provided in the message and it must not be used in events such as dividend or
 * interest.<br>
 * The list of proprietary IssuerOfferorTaxabilityIndicator codes that may be
 * used are provided in the document "TXAP Taxability Codes" available on the
 * SMPG website at www.smpg.info.
 */
public class ConstraintIssuerOfferorTaxabilityIndicatorUsageRule {

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
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document \"TXAP Taxability Codes\" available on the SMPG website at www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption56> forCashOption56 = new MMConstraint<CashOption56>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document \"TXAP Taxability Codes\" available on the SMPG website at www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.msg.CashOption58 CashOption58}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document \" TXAP Taxability Codes\" available on the SMPG website at www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption58> forCashOption58 = new MMConstraint<CashOption58>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document \" TXAP Taxability Codes\" available on the SMPG website at www.smpg.info.";
			owner_lazy = () -> CashOption58.mmObject();
		}

		@Override
		public void executeValidator(CashOption58 obj) throws Exception {
			checkCashOption58(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption65
	 * SecuritiesOption65}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document \" TXAP Taxability Codes\" available on the SMPG website at www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption65> forSecuritiesOption65 = new MMConstraint<SecuritiesOption65>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document \" TXAP Taxability Codes\" available on the SMPG website at www.smpg.info.";
			owner_lazy = () -> SecuritiesOption65.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption65 obj) throws Exception {
			checkSecuritiesOption65(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64
	 * SecuritiesOption64}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document \" TXAP Taxability Codes\" available on the SMPG website at www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption64> forSecuritiesOption64 = new MMConstraint<SecuritiesOption64>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document \" TXAP Taxability Codes\" available on the SMPG website at www.smpg.info.";
			owner_lazy = () -> SecuritiesOption64.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption64 obj) throws Exception {
			checkSecuritiesOption64(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption57 CashOption57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document \" TXAP Taxability Codes\" available on the SMPG website at www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption57> forCashOption57 = new MMConstraint<CashOption57>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document \" TXAP Taxability Codes\" available on the SMPG website at www.smpg.info.";
			owner_lazy = () -> CashOption57.mmObject();
		}

		@Override
		public void executeValidator(CashOption57 obj) throws Exception {
			checkCashOption57(obj);
		}
	};

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of proprietary IssuerOfferorTaxabilityIndicator codes that may
	 * be used are provided in the document "TXAP Taxability Codes" available on
	 * the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption56(CashOption56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of proprietary IssuerOfferorTaxabilityIndicator codes that may
	 * be used are provided in the document " TXAP Taxability Codes" available
	 * on the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption58(CashOption58 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of proprietary IssuerOfferorTaxabilityIndicator codes that may
	 * be used are provided in the document " TXAP Taxability Codes" available
	 * on the SMPG website at www.smpg.info.
	 */
	public static void checkSecuritiesOption65(SecuritiesOption65 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of proprietary IssuerOfferorTaxabilityIndicator codes that may
	 * be used are provided in the document " TXAP Taxability Codes" available
	 * on the SMPG website at www.smpg.info.
	 */
	public static void checkSecuritiesOption64(SecuritiesOption64 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of proprietary IssuerOfferorTaxabilityIndicator codes that may
	 * be used are provided in the document " TXAP Taxability Codes" available
	 * on the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption57(CashOption57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}