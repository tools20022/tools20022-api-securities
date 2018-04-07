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
import com.tools20022.repository.msg.QuantityAndAccount64;
import com.tools20022.repository.msg.QuantityAndAccount65;
import com.tools20022.repository.msg.QuantityAndAccount66;
import com.tools20022.repository.msg.QuantityAndAccount68;

/**
 * When used (see usage rule SafekeepingPlaceRule), unless special arrangements
 * exist between the account servicer and the<br>
 * account owner, it is recommended to use the place of safekeeping field
 * following the market practice<br>
 * described below:<br>
 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
 * domestic and NCSD to NCSD settlement instructions.<br>
 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD
 * internal, ICSD/local and ICSD to ICSD settlement<br>
 * instructions.<br>
 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance,
 * when the account servicer is a global custodian and provides the account
 * owner with a position reporting at global custodian's agents' level. When
 * instructing, the fund manager would therefore mention, as a place of
 * safekeeping, the BIC of the global custodian's agent on the market.<br>
 * Absence of SafekeepingPlace means that:<br>
 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
 * structure, ETC.) and should not be provided by the account owner.<br>
 * • The SafekeepingPlace is the counterparty's Depository. The transaction is
 * therefore domestic (to an NCSD) or internal to an ICSD.<br>
 * For more details, see the relevant market practice document on www.smpg.info.
 */
public class ConstraintSafekeepingPlaceGuideline {

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
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount68> forQuantityAndAccount68 = new MMConstraint<QuantityAndAccount68>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount64
	 * QuantityAndAccount64}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount64> forQuantityAndAccount64 = new MMConstraint<QuantityAndAccount64>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount66
	 * QuantityAndAccount66}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount66> forQuantityAndAccount66 = new MMConstraint<QuantityAndAccount66>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> QuantityAndAccount66.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount66 obj) throws Exception {
			checkQuantityAndAccount66(obj);
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
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the account owner, it is recommended to use the place of safekeeping field following the market practice described below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount65> forQuantityAndAccount65 = new MMConstraint<QuantityAndAccount65>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the account owner, it is recommended to use the place of safekeeping field following the market practice described below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> QuantityAndAccount65.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount65 obj) throws Exception {
			checkQuantityAndAccount65(obj);
		}
	};

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount68(QuantityAndAccount68 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount64(QuantityAndAccount64 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount66(QuantityAndAccount66 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the account owner, it
	 * is recommended to use the place of safekeeping field following the market
	 * practice described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount65(QuantityAndAccount65 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}