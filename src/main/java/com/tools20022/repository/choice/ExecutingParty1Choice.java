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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.NoReasonCode;
import com.tools20022.repository.datatype.Max50Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PersonIdentification12;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of the executing party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ExecutingParty1Choice#mmPerson
 * ExecutingParty1Choice.mmPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ExecutingParty1Choice#mmAlgorithm
 * ExecutingParty1Choice.mmAlgorithm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ExecutingParty1Choice#mmClient
 * ExecutingParty1Choice.mmClient}</li>
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
 * "ExecutingParty1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of the executing party."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.InvestmentParty1Choice
 * InvestmentParty1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ExecutingParty1Choice", propOrder = {"person", "algorithm", "client"})
public class ExecutingParty1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Prsn", required = true)
	protected PersonIdentification12 person;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PersonIdentification12
	 * PersonIdentification12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ExecutingParty1Choice
	 * ExecutingParty1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Person"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a person."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InvestmentParty1Choice#mmPerson
	 * InvestmentParty1Choice.mmPerson}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ExecutingParty1Choice, PersonIdentification12> mmPerson = new MMMessageAssociationEnd<ExecutingParty1Choice, PersonIdentification12>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.ExecutingParty1Choice.mmObject();
			isDerived = false;
			xmlTag = "Prsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Person";
			definition = "Identification of a person.";
			previousVersion_lazy = () -> InvestmentParty1Choice.mmPerson;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PersonIdentification12.mmObject();
		}

		@Override
		public PersonIdentification12 getValue(ExecutingParty1Choice obj) {
			return obj.getPerson();
		}

		@Override
		public void setValue(ExecutingParty1Choice obj, PersonIdentification12 value) {
			obj.setPerson(value);
		}
	};
	@XmlElement(name = "Algo", required = true)
	protected Max50Text algorithm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max50Text
	 * Max50Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ExecutingParty1Choice
	 * ExecutingParty1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Algo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Algorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of an algorithm."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InvestmentParty1Choice#mmAlgorithm
	 * InvestmentParty1Choice.mmAlgorithm}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ExecutingParty1Choice, Max50Text> mmAlgorithm = new MMMessageAttribute<ExecutingParty1Choice, Max50Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.ExecutingParty1Choice.mmObject();
			isDerived = false;
			xmlTag = "Algo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Algorithm";
			definition = "Identification of an algorithm.";
			previousVersion_lazy = () -> InvestmentParty1Choice.mmAlgorithm;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max50Text.mmObject();
		}

		@Override
		public Max50Text getValue(ExecutingParty1Choice obj) {
			return obj.getAlgorithm();
		}

		@Override
		public void setValue(ExecutingParty1Choice obj, Max50Text value) {
			obj.setAlgorithm(value);
		}
	};
	@XmlElement(name = "Clnt", required = true)
	protected NoReasonCode client;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.NoReasonCode
	 * NoReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ExecutingParty1Choice
	 * ExecutingParty1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Clnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Client"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication that the transaction was executed directly by the client."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ExecutingParty1Choice, NoReasonCode> mmClient = new MMMessageAttribute<ExecutingParty1Choice, NoReasonCode>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.ExecutingParty1Choice.mmObject();
			isDerived = false;
			xmlTag = "Clnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Client";
			definition = "Indication that the transaction was executed directly by the client.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NoReasonCode.mmObject();
		}

		@Override
		public NoReasonCode getValue(ExecutingParty1Choice obj) {
			return obj.getClient();
		}

		@Override
		public void setValue(ExecutingParty1Choice obj, NoReasonCode value) {
			obj.setClient(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ExecutingParty1Choice.mmPerson, com.tools20022.repository.choice.ExecutingParty1Choice.mmAlgorithm,
						com.tools20022.repository.choice.ExecutingParty1Choice.mmClient);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExecutingParty1Choice";
				definition = "Identification of the executing party.";
				previousVersion_lazy = () -> InvestmentParty1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public PersonIdentification12 getPerson() {
		return person;
	}

	public ExecutingParty1Choice setPerson(PersonIdentification12 person) {
		this.person = Objects.requireNonNull(person);
		return this;
	}

	public Max50Text getAlgorithm() {
		return algorithm;
	}

	public ExecutingParty1Choice setAlgorithm(Max50Text algorithm) {
		this.algorithm = Objects.requireNonNull(algorithm);
		return this;
	}

	public NoReasonCode getClient() {
		return client;
	}

	public ExecutingParty1Choice setClient(NoReasonCode client) {
		this.client = Objects.requireNonNull(client);
		return this;
	}
}