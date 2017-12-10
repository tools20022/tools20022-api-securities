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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.SettlingCapacityCode;
import com.tools20022.repository.codeset.TaxLiabilityCode;
import com.tools20022.repository.entity.SettlementPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Role played by a party in the context of the settlement of securities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesSettlementPartyRole"
 * src="doc-files/SecuritiesSettlementPartyRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SettlementPartyRole
 * SettlementPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmSecuritiesSettlement
 * SecuritiesSettlementPartyRole.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmSecuritiesSettlementSystem
 * SecuritiesSettlementPartyRole.mmSecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmSettlingCapacity
 * SecuritiesSettlementPartyRole.mmSettlingCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmTaxCapacity
 * SecuritiesSettlementPartyRole.mmTaxCapacity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPartyRole
 * SecuritiesSettlement.mmPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementSystem#mmSettlementParty
 * SecuritiesSettlementSystem.mmSettlementParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount7#mmParty1
 * ReceivingPartiesAndAccount7.mmParty1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount7#mmParty2
 * ReceivingPartiesAndAccount7.mmParty2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementParties32#mmDepository
 * SettlementParties32.mmDepository}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties32#mmParty1
 * SettlementParties32.mmParty1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties32#mmParty2
 * SettlementParties32.mmParty2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties32#mmParty3
 * SettlementParties32.mmParty3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties32#mmParty4
 * SettlementParties32.mmParty4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties32#mmParty5
 * SettlementParties32.mmParty5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount11#mmParty1
 * ReceivingPartiesAndAccount11.mmParty1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount11#mmParty2
 * ReceivingPartiesAndAccount11.mmParty2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount54#mmSettlementPartiesDetails
 * InvestmentAccount54.mmSettlementPartiesDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount15#mmParty1
 * ReceivingPartiesAndAccount15.mmParty1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount15#mmParty2
 * ReceivingPartiesAndAccount15.mmParty2}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ReceivingSettlementParty
 * ReceivingSettlementParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DeliveringSettlementParty
 * DeliveringSettlementParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PlaceOfSettlement
 * PlaceOfSettlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties23
 * SettlementParties23}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCapacityParty3Choice
 * TaxCapacityParty3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount7
 * DeliveringPartiesAndAccount7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount7
 * ReceivingPartiesAndAccount7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementParties2Choice
 * SettlementParties2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties32
 * SettlementParties32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount11
 * ReceivingPartiesAndAccount11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount11
 * DeliveringPartiesAndAccount11}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementParties4Choice
 * SettlementParties4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties36
 * SettlementParties36}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties39
 * SettlementParties39}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties40
 * SettlementParties40}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCapacityParty4Choice
 * TaxCapacityParty4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties42
 * SettlementParties42}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount14
 * DeliveringPartiesAndAccount14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount13
 * DeliveringPartiesAndAccount13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount14
 * ReceivingPartiesAndAccount14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13
 * ReceivingPartiesAndAccount13}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementParties5Choice
 * SettlementParties5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount15
 * ReceivingPartiesAndAccount15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount15
 * DeliveringPartiesAndAccount15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount16
 * ReceivingPartiesAndAccount16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount16
 * DeliveringPartiesAndAccount16}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementParties7Choice
 * SettlementParties7Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesSettlementPartyRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Role played by a party in the context of the settlement of securities."</li>
 * </ul>
 */
public class SecuritiesSettlementPartyRole extends SettlementPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.SecuritiesSettlement> securitiesSettlement;
	/**
	 * Specifies the settlement process in which a party plays a role.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPartyRole
	 * SecuritiesSettlement.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
	 * SecuritiesSettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the settlement process in which a party plays a role."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Specifies the settlement process in which a party plays a role.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmPartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesSettlementSystem> securitiesSettlementSystem;
	/**
	 * Specifies the system which may be used by a party in a settlement
	 * process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementSystem#mmSettlementParty
	 * SecuritiesSettlementSystem.mmSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementSystem
	 * SecuritiesSettlementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
	 * SecuritiesSettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the system which may be used by a party in a settlement process."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesSettlementSystem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlementSystem";
			definition = "Specifies the system which may be used by a party in a settlement process.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementSystem.mmSettlementParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementSystem.mmObject();
		}
	};
	protected SettlingCapacityCode settlingCapacity;
	/**
	 * Role of a party in the settlement of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlingCapacityCode
	 * SettlingCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmSettlingCapacity
	 * SettlementDetails43.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#mmSettlingCapacity
	 * SettlementDetails96.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmSettlingCapacity
	 * SettlementDetails97.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#mmSettlingCapacity
	 * SettlementDetails98.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmSettlingCapacity
	 * SettlementDetails128.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmSettlingCapacity
	 * SettlementDetails120.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmSettlingCapacity
	 * SettlementDetails119.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmSettlingCapacity
	 * SettlementDetails126.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmSettlingCapacity
	 * SettlementDetails122.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#mmSettlingCapacity
	 * SettlementDetails127.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmSettlingCapacity
	 * SettlementDetails121.mmSettlingCapacity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
	 * SecuritiesSettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlingCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role of a party in the settlement of the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSettlingCapacity = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementDetails43.mmSettlingCapacity, SettlementDetails96.mmSettlingCapacity, SettlementDetails97.mmSettlingCapacity, SettlementDetails98.mmSettlingCapacity,
					SettlementDetails128.mmSettlingCapacity, SettlementDetails120.mmSettlingCapacity, SettlementDetails119.mmSettlingCapacity, SettlementDetails126.mmSettlingCapacity, SettlementDetails122.mmSettlingCapacity,
					SettlementDetails127.mmSettlingCapacity, SettlementDetails121.mmSettlingCapacity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlingCapacity";
			definition = "Role of a party in the settlement of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlingCapacityCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementPartyRole.class.getMethod("getSettlingCapacity", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TaxLiabilityCode taxCapacity;
	/**
	 * Tax role capacity of the instructing party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxLiabilityCode
	 * TaxLiabilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCapacityParty3Choice#mmCode
	 * TaxCapacityParty3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCapacityParty3Choice#mmProprietary
	 * TaxCapacityParty3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmTaxCapacity
	 * SettlementDetails43.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#mmTaxCapacity
	 * SettlementDetails96.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmTaxCapacity
	 * SettlementDetails97.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails100#mmTaxCapacity
	 * SettlementDetails100.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCapacityParty4Choice#mmCode
	 * TaxCapacityParty4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCapacityParty4Choice#mmProprietary
	 * TaxCapacityParty4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#mmTaxCapacity
	 * SettlementDetails98.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmTaxCapacity
	 * SettlementDetails128.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmTaxCapacity
	 * SettlementDetails120.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmTaxCapacity
	 * SettlementDetails119.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmTaxCapacity
	 * SettlementDetails126.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmTaxCapacity
	 * SettlementDetails122.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#mmTaxCapacity
	 * SettlementDetails127.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmTaxCapacity
	 * SettlementDetails121.mmTaxCapacity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
	 * SecuritiesSettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax role capacity of the instructing party."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxCapacity = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TaxCapacityParty3Choice.mmCode, TaxCapacityParty3Choice.mmProprietary, SettlementDetails43.mmTaxCapacity, SettlementDetails96.mmTaxCapacity, SettlementDetails97.mmTaxCapacity,
					SettlementDetails100.mmTaxCapacity, TaxCapacityParty4Choice.mmCode, TaxCapacityParty4Choice.mmProprietary, SettlementDetails98.mmTaxCapacity, SettlementDetails128.mmTaxCapacity, SettlementDetails120.mmTaxCapacity,
					SettlementDetails119.mmTaxCapacity, SettlementDetails126.mmTaxCapacity, SettlementDetails122.mmTaxCapacity, SettlementDetails127.mmTaxCapacity, SettlementDetails121.mmTaxCapacity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxCapacity";
			definition = "Tax role capacity of the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxLiabilityCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementPartyRole.class.getMethod("getTaxCapacity", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlementPartyRole";
				definition = "Role played by a party in the context of the settlement of securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesSettlement.mmPartyRole, com.tools20022.repository.entity.SecuritiesSettlementSystem.mmSettlementParty);
				derivationElement_lazy = () -> Arrays.asList(ReceivingPartiesAndAccount7.mmParty1, ReceivingPartiesAndAccount7.mmParty2, SettlementParties32.mmDepository, SettlementParties32.mmParty1, SettlementParties32.mmParty2,
						SettlementParties32.mmParty3, SettlementParties32.mmParty4, SettlementParties32.mmParty5, ReceivingPartiesAndAccount11.mmParty1, ReceivingPartiesAndAccount11.mmParty2, InvestmentAccount54.mmSettlementPartiesDetails,
						ReceivingPartiesAndAccount15.mmParty1, ReceivingPartiesAndAccount15.mmParty2);
				subType_lazy = () -> Arrays.asList(ReceivingSettlementParty.mmObject(), DeliveringSettlementParty.mmObject(), PlaceOfSettlement.mmObject());
				superType_lazy = () -> SettlementPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmSecuritiesSettlement, com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmSecuritiesSettlementSystem,
						com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmSettlingCapacity, com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmTaxCapacity);
				derivationComponent_lazy = () -> Arrays.asList(SettlementParties23.mmObject(), TaxCapacityParty3Choice.mmObject(), DeliveringPartiesAndAccount7.mmObject(), ReceivingPartiesAndAccount7.mmObject(),
						SettlementParties2Choice.mmObject(), SettlementParties32.mmObject(), ReceivingPartiesAndAccount11.mmObject(), DeliveringPartiesAndAccount11.mmObject(), SettlementParties4Choice.mmObject(),
						SettlementParties36.mmObject(), SettlementParties39.mmObject(), SettlementParties40.mmObject(), TaxCapacityParty4Choice.mmObject(), SettlementParties42.mmObject(), DeliveringPartiesAndAccount14.mmObject(),
						DeliveringPartiesAndAccount13.mmObject(), ReceivingPartiesAndAccount14.mmObject(), ReceivingPartiesAndAccount13.mmObject(), SettlementParties5Choice.mmObject(), ReceivingPartiesAndAccount15.mmObject(),
						DeliveringPartiesAndAccount15.mmObject(), ReceivingPartiesAndAccount16.mmObject(), DeliveringPartiesAndAccount16.mmObject(), SettlementParties7Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesSettlementPartyRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecuritiesSettlement> getSecuritiesSettlement() {
		return securitiesSettlement;
	}

	public void setSecuritiesSettlement(List<com.tools20022.repository.entity.SecuritiesSettlement> securitiesSettlement) {
		this.securitiesSettlement = securitiesSettlement;
	}

	public List<SecuritiesSettlementSystem> getSecuritiesSettlementSystem() {
		return securitiesSettlementSystem;
	}

	public void setSecuritiesSettlementSystem(List<com.tools20022.repository.entity.SecuritiesSettlementSystem> securitiesSettlementSystem) {
		this.securitiesSettlementSystem = securitiesSettlementSystem;
	}

	public SettlingCapacityCode getSettlingCapacity() {
		return settlingCapacity;
	}

	public void setSettlingCapacity(SettlingCapacityCode settlingCapacity) {
		this.settlingCapacity = settlingCapacity;
	}

	public TaxLiabilityCode getTaxCapacity() {
		return taxCapacity;
	}

	public void setTaxCapacity(TaxLiabilityCode taxCapacity) {
		this.taxCapacity = taxCapacity;
	}
}