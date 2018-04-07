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
 * If SettlementDetails elements are used, then their conditions of use must be
 * pre-agreed between account owner and account servicer.
 */
public class ConstraintSettlementDetailsRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143
	 * SettlementDetails143}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails143> forSettlementDetails143 = new MMConstraint<SettlementDetails143>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails143.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails143 obj) throws Exception {
			checkSettlementDetails143(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150
	 * SettlementDetails150}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails150> forSettlementDetails150 = new MMConstraint<SettlementDetails150>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails150.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails150 obj) throws Exception {
			checkSettlementDetails150(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144
	 * SettlementDetails144}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails144> forSettlementDetails144 = new MMConstraint<SettlementDetails144>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails144.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails144 obj) throws Exception {
			checkSettlementDetails144(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148
	 * SettlementDetails148}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails97
	 * ConstraintSettlementDetailsRule.forSettlementDetails97}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails148> forSettlementDetails148 = new MMConstraint<SettlementDetails148>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails97;
			owner_lazy = () -> SettlementDetails148.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails148 obj) throws Exception {
			checkSettlementDetails148(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails149
	 * SettlementDetails149}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails149> forSettlementDetails149 = new MMConstraint<SettlementDetails149>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails149.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails149 obj) throws Exception {
			checkSettlementDetails149(obj);
		}
	};
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
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails43> forSettlementDetails43 = new MMConstraint<SettlementDetails43>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails100
	 * SettlementDetails100}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails100> forSettlementDetails100 = new MMConstraint<SettlementDetails100>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails100.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails100 obj) throws Exception {
			checkSettlementDetails100(obj);
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
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails142> forSettlementDetails142 = new MMConstraint<SettlementDetails142>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
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
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails145> forSettlementDetails145 = new MMConstraint<SettlementDetails145>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails145.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails145 obj) throws Exception {
			checkSettlementDetails145(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails141
	 * SettlementDetails141}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails141> forSettlementDetails141 = new MMConstraint<SettlementDetails141>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails141.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails141 obj) throws Exception {
			checkSettlementDetails141(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98
	 * SettlementDetails98}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails98> forSettlementDetails98 = new MMConstraint<SettlementDetails98>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails98.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails98 obj) throws Exception {
			checkSettlementDetails98(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails147
	 * SettlementDetails147}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails147> forSettlementDetails147 = new MMConstraint<SettlementDetails147>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			owner_lazy = () -> SettlementDetails147.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails147 obj) throws Exception {
			checkSettlementDetails147(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97
	 * SettlementDetails97}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails148
	 * ConstraintSettlementDetailsRule.forSettlementDetails148}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails97> forSettlementDetails97 = new MMConstraint<SettlementDetails97>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetailsRule";
			definition = "If SettlementDetails elements are used, then their conditions of use must be pre-agreed between account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails148);
			owner_lazy = () -> SettlementDetails97.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails97 obj) throws Exception {
			checkSettlementDetails97(obj);
		}
	};

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails143(SettlementDetails143 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails150(SettlementDetails150 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails144(SettlementDetails144 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails148(SettlementDetails148 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails149(SettlementDetails149 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails43(SettlementDetails43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails100(SettlementDetails100 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails142(SettlementDetails142 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails145(SettlementDetails145 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails141(SettlementDetails141 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails98(SettlementDetails98 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails147(SettlementDetails147 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementDetails elements are used, then their conditions of use must
	 * be pre-agreed between account owner and account servicer.
	 */
	public static void checkSettlementDetails97(SettlementDetails97 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}