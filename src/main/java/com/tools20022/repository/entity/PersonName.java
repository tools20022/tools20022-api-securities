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
import com.tools20022.repository.choice.NamePrefix1Choice;
import com.tools20022.repository.codeset.NamePrefix1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PartyName;
import com.tools20022.repository.entity.PersonIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Name by which a person is known and that is usually used to identify that
 * person.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PersonName" src="doc-files/PersonName.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.PartyName
 * PartyName}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PersonName#mmBirthName
 * PersonName.mmBirthName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PersonName#mmNamePrefix
 * PersonName.mmNamePrefix}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PersonName#mmGivenName
 * PersonName.mmGivenName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PersonName#mmMiddleName
 * PersonName.mmMiddleName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PersonName#mmNameSuffix
 * PersonName.mmNameSuffix}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PersonName#mmIdentification
 * PersonName.mmIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmPersonName
 * PersonIdentification.mmPersonName}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.NamePrefix1Choice
 * NamePrefix1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PersonalInformation1
 * PersonalInformation1}</li>
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
 * "PersonName"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Name by which a person is known and that is usually used to identify that person."
 * </li>
 * </ul>
 */
public class PersonName extends PartyName {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text birthName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson8#mmName
	 * IndividualPerson8.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson25#mmBirthName
	 * IndividualPerson25.mmBirthName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson26#mmBirthName
	 * IndividualPerson26.mmBirthName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson30#mmName
	 * IndividualPerson30.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonalInformation1#mmNameOfFather
	 * PersonalInformation1.mmNameOfFather}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson29#mmName
	 * IndividualPerson29.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson32#mmName
	 * IndividualPerson32.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson31#mmName
	 * IndividualPerson31.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson33#mmName
	 * IndividualPerson33.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson35#mmName
	 * IndividualPerson35.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson34#mmName
	 * IndividualPerson34.mmName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonName PersonName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BirthName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name received at birth, eg, maiden name."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PersonName, Max35Text> mmBirthName = new MMBusinessAttribute<PersonName, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(IndividualPerson8.mmName, IndividualPerson25.mmBirthName, IndividualPerson26.mmBirthName, IndividualPerson30.mmName, PersonalInformation1.mmNameOfFather, IndividualPerson29.mmName,
					IndividualPerson32.mmName, IndividualPerson31.mmName, IndividualPerson33.mmName, IndividualPerson35.mmName, IndividualPerson34.mmName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonName.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BirthName";
			definition = "Name received at birth, eg, maiden name.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PersonName obj) {
			return obj.getBirthName();
		}

		@Override
		public void setValue(PersonName obj, Max35Text value) {
			obj.setBirthName(value);
		}
	};
	protected NamePrefix1Code namePrefix;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NamePrefix1Code
	 * NamePrefix1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NamePrefix1Choice#mmCode
	 * NamePrefix1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NamePrefix1Choice#mmProprietary
	 * NamePrefix1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson8#mmNamePrefix
	 * IndividualPerson8.mmNamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactDetails2#mmNamePrefix
	 * ContactDetails2.mmNamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification2#mmNamePrefix
	 * ContactIdentification2.mmNamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1#mmNamePrefix
	 * ContactIdentification1.mmNamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification4#mmNamePrefix
	 * ContactIdentification4.mmNamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson29#mmNamePrefix
	 * IndividualPerson29.mmNamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#mmNamePrefix
	 * IndividualPerson33.mmNamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmNamePrefix
	 * IndividualPerson34.mmNamePrefix}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonName PersonName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NamePrefix"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the terms used to formally address a person."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PersonName, NamePrefix1Code> mmNamePrefix = new MMBusinessAttribute<PersonName, NamePrefix1Code>() {
		{
			derivation_lazy = () -> Arrays.asList(NamePrefix1Choice.mmCode, NamePrefix1Choice.mmProprietary, IndividualPerson8.mmNamePrefix, ContactDetails2.mmNamePrefix, ContactIdentification2.mmNamePrefix,
					ContactIdentification1.mmNamePrefix, ContactIdentification4.mmNamePrefix, IndividualPerson29.mmNamePrefix, IndividualPerson33.mmNamePrefix, IndividualPerson34.mmNamePrefix);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonName.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NamePrefix";
			definition = "Specifies the terms used to formally address a person.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NamePrefix1Code.mmObject();
		}

		@Override
		public NamePrefix1Code getValue(PersonName obj) {
			return obj.getNamePrefix();
		}

		@Override
		public void setValue(PersonName obj, NamePrefix1Code value) {
			obj.setNamePrefix(value);
		}
	};
	protected Max35Text givenName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson8#mmGivenName
	 * IndividualPerson8.mmGivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification2#mmGivenName
	 * ContactIdentification2.mmGivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1#mmGivenName
	 * ContactIdentification1.mmGivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification4#mmGivenName
	 * ContactIdentification4.mmGivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson25#mmGivenName
	 * IndividualPerson25.mmGivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson26#mmGivenName
	 * IndividualPerson26.mmGivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification10#mmFirstName
	 * PersonIdentification10.mmFirstName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson30#mmGivenName
	 * IndividualPerson30.mmGivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonalInformation1#mmNameOfPartner
	 * PersonalInformation1.mmNameOfPartner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson29#mmGivenName
	 * IndividualPerson29.mmGivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#mmGivenName
	 * IndividualPerson33.mmGivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson35#mmGivenName
	 * IndividualPerson35.mmGivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmGivenName
	 * IndividualPerson34.mmGivenName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonName PersonName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GivenName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "First name of a person."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PersonName, Max35Text> mmGivenName = new MMBusinessAttribute<PersonName, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(IndividualPerson8.mmGivenName, ContactIdentification2.mmGivenName, ContactIdentification1.mmGivenName, ContactIdentification4.mmGivenName, IndividualPerson25.mmGivenName,
					IndividualPerson26.mmGivenName, PersonIdentification10.mmFirstName, IndividualPerson30.mmGivenName, PersonalInformation1.mmNameOfPartner, IndividualPerson29.mmGivenName, IndividualPerson33.mmGivenName,
					IndividualPerson35.mmGivenName, IndividualPerson34.mmGivenName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonName.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GivenName";
			definition = "First name of a person.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PersonName obj) {
			return obj.getGivenName();
		}

		@Override
		public void setValue(PersonName obj, Max35Text value) {
			obj.setGivenName(value);
		}
	};
	protected Max35Text middleName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson30#mmMiddleName
	 * IndividualPerson30.mmMiddleName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson29#mmMiddleName
	 * IndividualPerson29.mmMiddleName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#mmMiddleName
	 * IndividualPerson33.mmMiddleName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson35#mmMiddleName
	 * IndividualPerson35.mmMiddleName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmMiddleName
	 * IndividualPerson34.mmMiddleName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonName PersonName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiddleName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Second name of a person."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PersonName, Max35Text> mmMiddleName = new MMBusinessAttribute<PersonName, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(IndividualPerson30.mmMiddleName, IndividualPerson29.mmMiddleName, IndividualPerson33.mmMiddleName, IndividualPerson35.mmMiddleName, IndividualPerson34.mmMiddleName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonName.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MiddleName";
			definition = "Second name of a person.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PersonName obj) {
			return obj.getMiddleName();
		}

		@Override
		public void setValue(PersonName obj, Max35Text value) {
			obj.setMiddleName(value);
		}
	};
	protected Max35Text nameSuffix;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson8#mmNameSuffix
	 * IndividualPerson8.mmNameSuffix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#mmNameSuffix
	 * IndividualPerson33.mmNameSuffix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmNameSuffix
	 * IndividualPerson34.mmNameSuffix}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonName PersonName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameSuffix"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information about a person that follows a person's name, eg, qualification such as Doctor of Philosophy (PhD)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PersonName, Max35Text> mmNameSuffix = new MMBusinessAttribute<PersonName, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(IndividualPerson8.mmNameSuffix, IndividualPerson33.mmNameSuffix, IndividualPerson34.mmNameSuffix);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonName.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NameSuffix";
			definition = "Additional information about a person that follows a person's name, eg, qualification such as Doctor of Philosophy (PhD).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PersonName obj) {
			return obj.getNameSuffix();
		}

		@Override
		public void setValue(PersonName obj, Max35Text value) {
			obj.setNameSuffix(value);
		}
	};
	protected PersonIdentification identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmPersonName
	 * PersonIdentification.mmPersonName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonName PersonName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person identification which contains a name."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PersonName, Optional<PersonIdentification>> mmIdentification = new MMBusinessAssociationEnd<PersonName, Optional<PersonIdentification>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonName.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Person identification which contains a name.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> PersonIdentification.mmPersonName;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PersonIdentification.mmObject();
		}

		@Override
		public Optional<PersonIdentification> getValue(PersonName obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(PersonName obj, Optional<PersonIdentification> value) {
			obj.setIdentification(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PersonName";
				definition = "Name by which a person is known and that is usually used to identify that person.";
				associationDomain_lazy = () -> Arrays.asList(PersonIdentification.mmPersonName);
				superType_lazy = () -> PartyName.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PersonName.mmBirthName, com.tools20022.repository.entity.PersonName.mmNamePrefix, com.tools20022.repository.entity.PersonName.mmGivenName,
						com.tools20022.repository.entity.PersonName.mmMiddleName, com.tools20022.repository.entity.PersonName.mmNameSuffix, com.tools20022.repository.entity.PersonName.mmIdentification);
				derivationComponent_lazy = () -> Arrays.asList(NamePrefix1Choice.mmObject(), PersonalInformation1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PersonName.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getBirthName() {
		return birthName;
	}

	public PersonName setBirthName(Max35Text birthName) {
		this.birthName = Objects.requireNonNull(birthName);
		return this;
	}

	public NamePrefix1Code getNamePrefix() {
		return namePrefix;
	}

	public PersonName setNamePrefix(NamePrefix1Code namePrefix) {
		this.namePrefix = Objects.requireNonNull(namePrefix);
		return this;
	}

	public Max35Text getGivenName() {
		return givenName;
	}

	public PersonName setGivenName(Max35Text givenName) {
		this.givenName = Objects.requireNonNull(givenName);
		return this;
	}

	public Max35Text getMiddleName() {
		return middleName;
	}

	public PersonName setMiddleName(Max35Text middleName) {
		this.middleName = Objects.requireNonNull(middleName);
		return this;
	}

	public Max35Text getNameSuffix() {
		return nameSuffix;
	}

	public PersonName setNameSuffix(Max35Text nameSuffix) {
		this.nameSuffix = Objects.requireNonNull(nameSuffix);
		return this;
	}

	public Optional<PersonIdentification> getIdentification() {
		return identification == null ? Optional.empty() : Optional.of(identification);
	}

	public PersonName setIdentification(PersonIdentification identification) {
		this.identification = identification;
		return this;
	}
}