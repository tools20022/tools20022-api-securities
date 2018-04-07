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
 * The SafekeepingPlace functionality in the settlement instructions is only to
 * be used for global custodians that allow their clients to specify where the
 * securities are to be held, for example, in an ICSD account versus an account
 * at the local CSD.
 */
public class ConstraintSafekeepingPlaceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount68
	 * QuantityAndAccount68}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount68> forQuantityAndAccount68 = new MMConstraint<QuantityAndAccount68>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> QuantityAndAccount68.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount68 obj) throws Exception {
			checkQuantityAndAccount68(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification32
	 * AccountIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification32> forAccountIdentification32 = new MMConstraint<AccountIdentification32>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountIdentification32.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification32 obj) throws Exception {
			checkAccountIdentification32(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance34
	 * AccountAndBalance34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance34> forAccountAndBalance34 = new MMConstraint<AccountAndBalance34>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountAndBalance34.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance34 obj) throws Exception {
			checkAccountAndBalance34(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount64
	 * QuantityAndAccount64}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount64> forQuantityAndAccount64 = new MMConstraint<QuantityAndAccount64>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> QuantityAndAccount64.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount64 obj) throws Exception {
			checkQuantityAndAccount64(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification31
	 * AccountIdentification31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification31> forAccountIdentification31 = new MMConstraint<AccountIdentification31>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountIdentification31.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification31 obj) throws Exception {
			checkAccountIdentification31(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount67
	 * QuantityAndAccount67}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount67> forQuantityAndAccount67 = new MMConstraint<QuantityAndAccount67>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> QuantityAndAccount67.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount67 obj) throws Exception {
			checkQuantityAndAccount67(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount63
	 * QuantityAndAccount63}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount63> forQuantityAndAccount63 = new MMConstraint<QuantityAndAccount63>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> QuantityAndAccount63.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount63 obj) throws Exception {
			checkQuantityAndAccount63(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance35
	 * AccountAndBalance35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance35> forAccountAndBalance35 = new MMConstraint<AccountAndBalance35>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountAndBalance35.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance35 obj) throws Exception {
			checkAccountAndBalance35(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification43
	 * AccountIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification43> forAccountIdentification43 = new MMConstraint<AccountIdentification43>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountIdentification43.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification43 obj) throws Exception {
			checkAccountIdentification43(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance33
	 * AccountAndBalance33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance33> forAccountAndBalance33 = new MMConstraint<AccountAndBalance33>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountAndBalance33.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance33 obj) throws Exception {
			checkAccountAndBalance33(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption141
	 * CorporateActionOption141}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SafekeepingPlace must only be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption141> forCorporateActionOption141 = new MMConstraint<CorporateActionOption141>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "SafekeepingPlace must only be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> CorporateActionOption141.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption141 obj) throws Exception {
			checkCorporateActionOption141(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount65
	 * QuantityAndAccount65}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount65> forQuantityAndAccount65 = new MMConstraint<QuantityAndAccount65>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> QuantityAndAccount65.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount65 obj) throws Exception {
			checkQuantityAndAccount65(obj);
		}
	};

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount68(QuantityAndAccount68 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, for
	 * example, in an ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification32(AccountIdentification32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance34(AccountAndBalance34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount64(QuantityAndAccount64 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, for
	 * example, in an ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification31(AccountIdentification31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount67(QuantityAndAccount67 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount63(QuantityAndAccount63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance35(AccountAndBalance35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SafekeepingPlace is only to be used by global custodians that allow their
	 * clients to specify where the securities are to be held, for example, in
	 * an ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification43(AccountIdentification43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance33(AccountAndBalance33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SafekeepingPlace must only be used by global custodians that allow their
	 * clients to specify where the securities are to be held, for example, in
	 * an ICSD account versus an account at the local CSD.
	 */
	public static void checkCorporateActionOption141(CorporateActionOption141 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount65(QuantityAndAccount65 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}