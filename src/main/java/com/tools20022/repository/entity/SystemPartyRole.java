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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.NonGuaranteedTrade3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Role played by a party in a system.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SystemPartyRole" src="doc-files/SystemPartyRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemPartyRole#mmRelatedSystem
 * SystemPartyRole.mmRelatedSystem}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmPartyRole
 * System.mmPartyRole}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SystemMemberRole
 * SystemMemberRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TransactionAdministrator
 * TransactionAdministrator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SubmittingPartyRole
 * SubmittingPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TerminalManagerRole
 * TerminalManagerRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ClearingMemberRole
 * ClearingMemberRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.NonGuaranteedTrade3
 * NonGuaranteedTrade3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SystemPartyRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Role played by a party in a system."</li>
 * </ul>
 */
public class SystemPartyRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<System> relatedSystem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.System#mmPartyRole
	 * System.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.System System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemPartyRole
	 * SystemPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the system for which a party plays a role"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SystemPartyRole, List<System>> mmRelatedSystem = new MMBusinessAssociationEnd<SystemPartyRole, List<System>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSystem";
			definition = "Specifies the system for which a party plays a role";
			minOccurs = 1;
			opposite_lazy = () -> System.mmPartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> System.mmObject();
		}

		@Override
		public List<System> getValue(SystemPartyRole obj) {
			return obj.getRelatedSystem();
		}

		@Override
		public void setValue(SystemPartyRole obj, List<System> value) {
			obj.setRelatedSystem(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SystemPartyRole";
				definition = "Role played by a party in a system.";
				associationDomain_lazy = () -> Arrays.asList(System.mmPartyRole);
				subType_lazy = () -> Arrays.asList(SystemMemberRole.mmObject(), TransactionAdministrator.mmObject(), SubmittingPartyRole.mmObject(), TerminalManagerRole.mmObject(), ClearingMemberRole.mmObject());
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SystemPartyRole.mmRelatedSystem);
				derivationComponent_lazy = () -> Arrays.asList(NonGuaranteedTrade3.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SystemPartyRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<System> getRelatedSystem() {
		return relatedSystem == null ? relatedSystem = new ArrayList<>() : relatedSystem;
	}

	public SystemPartyRole setRelatedSystem(List<System> relatedSystem) {
		this.relatedSystem = Objects.requireNonNull(relatedSystem);
		return this;
	}
}