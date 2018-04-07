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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.SettlingCapacityCode;
import com.tools20022.repository.codeset.TaxLiabilityCode;
import com.tools20022.repository.entity.SecuritiesSettlement;
import com.tools20022.repository.entity.SecuritiesSettlementSystem;
import com.tools20022.repository.entity.SettlementPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

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
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount15#mmParty1
 * ReceivingPartiesAndAccount15.mmParty1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount15#mmParty2
 * ReceivingPartiesAndAccount15.mmParty2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount66#mmSettlementPartiesDetails
 * InvestmentAccount66.mmSettlementPartiesDetails}</li>
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
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties40
 * SettlementParties40}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCapacityParty4Choice
 * TaxCapacityParty4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties42
 * SettlementParties42}</li>
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
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount18
 * DeliveringPartiesAndAccount18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount17
 * DeliveringPartiesAndAccount17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount17
 * ReceivingPartiesAndAccount17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount18
 * ReceivingPartiesAndAccount18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties62
 * SettlementParties62}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties63
 * SettlementParties63}</li>
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
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesSettlementPartyRole, List<SecuritiesSettlement>> mmSecuritiesSettlement = new MMBusinessAssociationEnd<SecuritiesSettlementPartyRole, List<SecuritiesSettlement>>() {
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

		@Override
		public List<SecuritiesSettlement> getValue(SecuritiesSettlementPartyRole obj) {
			return obj.getSecuritiesSettlement();
		}

		@Override
		public void setValue(SecuritiesSettlementPartyRole obj, List<SecuritiesSettlement> value) {
			obj.setSecuritiesSettlement(value);
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesSettlementSystem> securitiesSettlementSystem;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesSettlementPartyRole, List<SecuritiesSettlementSystem>> mmSecuritiesSettlementSystem = new MMBusinessAssociationEnd<SecuritiesSettlementPartyRole, List<SecuritiesSettlementSystem>>() {
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

		@Override
		public List<SecuritiesSettlementSystem> getValue(SecuritiesSettlementPartyRole obj) {
			return obj.getSecuritiesSettlementSystem();
		}

		@Override
		public void setValue(SecuritiesSettlementPartyRole obj, List<SecuritiesSettlementSystem> value) {
			obj.setSecuritiesSettlementSystem(value);
		}
	};
	protected SettlingCapacityCode settlingCapacity;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmSettlingCapacity
	 * SettlementDetails97.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#mmSettlingCapacity
	 * SettlementDetails98.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails147#mmSettlingCapacity
	 * SettlementDetails147.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmSettlingCapacity
	 * SettlementDetails142.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmSettlingCapacity
	 * SettlementDetails144.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148#mmSettlingCapacity
	 * SettlementDetails148.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmSettlingCapacity
	 * SettlementDetails145.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmSettlingCapacity
	 * SettlementDetails146.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143#mmSettlingCapacity
	 * SettlementDetails143.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails149#mmSettlingCapacity
	 * SettlementDetails149.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmSettlingCapacity
	 * SettlementDetails150.mmSettlingCapacity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
	 * SecuritiesSettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TRCA</li>
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
	public static final MMBusinessAttribute<SecuritiesSettlementPartyRole, SettlingCapacityCode> mmSettlingCapacity = new MMBusinessAttribute<SecuritiesSettlementPartyRole, SettlingCapacityCode>() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementDetails43.mmSettlingCapacity, SettlementDetails97.mmSettlingCapacity, SettlementDetails98.mmSettlingCapacity, SettlementDetails147.mmSettlingCapacity,
					SettlementDetails142.mmSettlingCapacity, SettlementDetails144.mmSettlingCapacity, SettlementDetails148.mmSettlingCapacity, SettlementDetails145.mmSettlingCapacity, SettlementDetails146.mmSettlingCapacity,
					SettlementDetails143.mmSettlingCapacity, SettlementDetails149.mmSettlingCapacity, SettlementDetails150.mmSettlingCapacity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TRCA"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlingCapacity";
			definition = "Role of a party in the settlement of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlingCapacityCode.mmObject();
		}

		@Override
		public SettlingCapacityCode getValue(SecuritiesSettlementPartyRole obj) {
			return obj.getSettlingCapacity();
		}

		@Override
		public void setValue(SecuritiesSettlementPartyRole obj, SettlingCapacityCode value) {
			obj.setSettlingCapacity(value);
		}
	};
	protected TaxLiabilityCode taxCapacity;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails147#mmTaxCapacity
	 * SettlementDetails147.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmTaxCapacity
	 * SettlementDetails142.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmTaxCapacity
	 * SettlementDetails144.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148#mmTaxCapacity
	 * SettlementDetails148.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmTaxCapacity
	 * SettlementDetails145.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmTaxCapacity
	 * SettlementDetails146.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143#mmTaxCapacity
	 * SettlementDetails143.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails149#mmTaxCapacity
	 * SettlementDetails149.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmTaxCapacity
	 * SettlementDetails150.mmTaxCapacity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
	 * SecuritiesSettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TCPI</li>
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
	public static final MMBusinessAttribute<SecuritiesSettlementPartyRole, TaxLiabilityCode> mmTaxCapacity = new MMBusinessAttribute<SecuritiesSettlementPartyRole, TaxLiabilityCode>() {
		{
			derivation_lazy = () -> Arrays.asList(TaxCapacityParty3Choice.mmCode, TaxCapacityParty3Choice.mmProprietary, SettlementDetails43.mmTaxCapacity, SettlementDetails97.mmTaxCapacity, SettlementDetails100.mmTaxCapacity,
					TaxCapacityParty4Choice.mmCode, TaxCapacityParty4Choice.mmProprietary, SettlementDetails98.mmTaxCapacity, SettlementDetails147.mmTaxCapacity, SettlementDetails142.mmTaxCapacity, SettlementDetails144.mmTaxCapacity,
					SettlementDetails148.mmTaxCapacity, SettlementDetails145.mmTaxCapacity, SettlementDetails146.mmTaxCapacity, SettlementDetails143.mmTaxCapacity, SettlementDetails149.mmTaxCapacity, SettlementDetails150.mmTaxCapacity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TCPI"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxCapacity";
			definition = "Tax role capacity of the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxLiabilityCode.mmObject();
		}

		@Override
		public TaxLiabilityCode getValue(SecuritiesSettlementPartyRole obj) {
			return obj.getTaxCapacity();
		}

		@Override
		public void setValue(SecuritiesSettlementPartyRole obj, TaxLiabilityCode value) {
			obj.setTaxCapacity(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlementPartyRole";
				definition = "Role played by a party in the context of the settlement of securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesSettlement.mmPartyRole, com.tools20022.repository.entity.SecuritiesSettlementSystem.mmSettlementParty);
				derivationElement_lazy = () -> Arrays.asList(ReceivingPartiesAndAccount7.mmParty1, ReceivingPartiesAndAccount7.mmParty2, SettlementParties32.mmDepository, SettlementParties32.mmParty1, SettlementParties32.mmParty2,
						SettlementParties32.mmParty3, SettlementParties32.mmParty4, SettlementParties32.mmParty5, ReceivingPartiesAndAccount11.mmParty1, ReceivingPartiesAndAccount11.mmParty2, ReceivingPartiesAndAccount15.mmParty1,
						ReceivingPartiesAndAccount15.mmParty2, InvestmentAccount66.mmSettlementPartiesDetails);
				subType_lazy = () -> Arrays.asList(ReceivingSettlementParty.mmObject(), DeliveringSettlementParty.mmObject(), PlaceOfSettlement.mmObject());
				superType_lazy = () -> SettlementPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmSecuritiesSettlement, com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmSecuritiesSettlementSystem,
						com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmSettlingCapacity, com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmTaxCapacity);
				derivationComponent_lazy = () -> Arrays.asList(SettlementParties23.mmObject(), TaxCapacityParty3Choice.mmObject(), DeliveringPartiesAndAccount7.mmObject(), ReceivingPartiesAndAccount7.mmObject(),
						SettlementParties2Choice.mmObject(), SettlementParties32.mmObject(), ReceivingPartiesAndAccount11.mmObject(), DeliveringPartiesAndAccount11.mmObject(), SettlementParties4Choice.mmObject(),
						SettlementParties36.mmObject(), SettlementParties40.mmObject(), TaxCapacityParty4Choice.mmObject(), SettlementParties42.mmObject(), SettlementParties5Choice.mmObject(), ReceivingPartiesAndAccount15.mmObject(),
						DeliveringPartiesAndAccount15.mmObject(), ReceivingPartiesAndAccount16.mmObject(), DeliveringPartiesAndAccount16.mmObject(), SettlementParties7Choice.mmObject(), DeliveringPartiesAndAccount18.mmObject(),
						DeliveringPartiesAndAccount17.mmObject(), ReceivingPartiesAndAccount17.mmObject(), ReceivingPartiesAndAccount18.mmObject(), SettlementParties62.mmObject(), SettlementParties63.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesSettlementPartyRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecuritiesSettlement> getSecuritiesSettlement() {
		return securitiesSettlement == null ? securitiesSettlement = new ArrayList<>() : securitiesSettlement;
	}

	public SecuritiesSettlementPartyRole setSecuritiesSettlement(List<com.tools20022.repository.entity.SecuritiesSettlement> securitiesSettlement) {
		this.securitiesSettlement = Objects.requireNonNull(securitiesSettlement);
		return this;
	}

	public List<SecuritiesSettlementSystem> getSecuritiesSettlementSystem() {
		return securitiesSettlementSystem == null ? securitiesSettlementSystem = new ArrayList<>() : securitiesSettlementSystem;
	}

	public SecuritiesSettlementPartyRole setSecuritiesSettlementSystem(List<com.tools20022.repository.entity.SecuritiesSettlementSystem> securitiesSettlementSystem) {
		this.securitiesSettlementSystem = Objects.requireNonNull(securitiesSettlementSystem);
		return this;
	}

	public SettlingCapacityCode getSettlingCapacity() {
		return settlingCapacity;
	}

	public SecuritiesSettlementPartyRole setSettlingCapacity(SettlingCapacityCode settlingCapacity) {
		this.settlingCapacity = Objects.requireNonNull(settlingCapacity);
		return this;
	}

	public TaxLiabilityCode getTaxCapacity() {
		return taxCapacity;
	}

	public SecuritiesSettlementPartyRole setTaxCapacity(TaxLiabilityCode taxCapacity) {
		this.taxCapacity = Objects.requireNonNull(taxCapacity);
		return this;
	}
}