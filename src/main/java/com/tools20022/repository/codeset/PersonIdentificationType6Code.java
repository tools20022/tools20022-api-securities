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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.PersonIdentificationType6Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies an alternative identification of an individual person, for example,
 * national registration identification number, passport number.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType6Code#AlienRegistrationNumber
 * PersonIdentificationType6Code.AlienRegistrationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType6Code#CPFAccountNumber
 * PersonIdentificationType6Code.CPFAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType6Code#DriversLicenseNumber
 * PersonIdentificationType6Code.DriversLicenseNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType6Code#EmployerIdentificationNumber
 * PersonIdentificationType6Code.EmployerIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType6Code#IdentityCardNumber
 * PersonIdentificationType6Code.IdentityCardNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType6Code#NationalRegistrationIdentificationNumber
 * PersonIdentificationType6Code.NationalRegistrationIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType6Code#Other
 * PersonIdentificationType6Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType6Code#PassportNumber
 * PersonIdentificationType6Code.PassportNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType6Code#PostOfficeCardNumber
 * PersonIdentificationType6Code.PostOfficeCardNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType6Code#SocialSecurityNumber
 * PersonIdentificationType6Code.SocialSecurityNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType6Code#SRSAccountNumber
 * PersonIdentificationType6Code.SRSAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType6Code#GunLicenseNumber
 * PersonIdentificationType6Code.GunLicenseNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType6Code#AdoptionTaxpayerIdentificationNumber
 * PersonIdentificationType6Code.AdoptionTaxpayerIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType6Code#GenericTaxIdentificationNumber
 * PersonIdentificationType6Code.GenericTaxIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType6Code#IndividualTaxpayerIdentificationNumber
 * PersonIdentificationType6Code.IndividualTaxpayerIdentificationNumber}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode
 * PersonIdentificationTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AREG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PersonIdentificationType6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies an alternative identification of an individual person, for example, national registration identification number, passport number."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PersonIdentificationType6Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType6Code
	 * PersonIdentificationType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlienRegistrationNumber"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType6Code AlienRegistrationNumber = new PersonIdentificationType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlienRegistrationNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType6Code.mmObject();
			codeName = PersonIdentificationTypeCode.AlienRegistrationNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType6Code
	 * PersonIdentificationType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CPFAccountNumber"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType6Code CPFAccountNumber = new PersonIdentificationType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CPFAccountNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType6Code.mmObject();
			codeName = PersonIdentificationTypeCode.CPFAccountNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType6Code
	 * PersonIdentificationType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DriversLicenseNumber"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType6Code DriversLicenseNumber = new PersonIdentificationType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DriversLicenseNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType6Code.mmObject();
			codeName = PersonIdentificationTypeCode.DriversLicenseNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType6Code
	 * PersonIdentificationType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployerIdentificationNumber"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType6Code EmployerIdentificationNumber = new PersonIdentificationType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployerIdentificationNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType6Code.mmObject();
			codeName = PersonIdentificationTypeCode.EmployerIdentificationNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType6Code
	 * PersonIdentificationType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentityCardNumber"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType6Code IdentityCardNumber = new PersonIdentificationType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentityCardNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType6Code.mmObject();
			codeName = PersonIdentificationTypeCode.IdentityCardNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType6Code
	 * PersonIdentificationType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalRegistrationIdentificationNumber"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType6Code NationalRegistrationIdentificationNumber = new PersonIdentificationType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NationalRegistrationIdentificationNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType6Code.mmObject();
			codeName = PersonIdentificationTypeCode.NationalRegistrationIdentificationNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType6Code
	 * PersonIdentificationType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType6Code Other = new PersonIdentificationType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType6Code.mmObject();
			codeName = PersonIdentificationTypeCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType6Code
	 * PersonIdentificationType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PassportNumber"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType6Code PassportNumber = new PersonIdentificationType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PassportNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType6Code.mmObject();
			codeName = PersonIdentificationTypeCode.PassportNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType6Code
	 * PersonIdentificationType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostOfficeCardNumber"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType6Code PostOfficeCardNumber = new PersonIdentificationType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostOfficeCardNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType6Code.mmObject();
			codeName = PersonIdentificationTypeCode.PostOfficeCardNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType6Code
	 * PersonIdentificationType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SocialSecurityNumber"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType6Code SocialSecurityNumber = new PersonIdentificationType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SocialSecurityNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType6Code.mmObject();
			codeName = PersonIdentificationTypeCode.SocialSecurityNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType6Code
	 * PersonIdentificationType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SRSAccountNumber"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType6Code SRSAccountNumber = new PersonIdentificationType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SRSAccountNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType6Code.mmObject();
			codeName = PersonIdentificationTypeCode.SRSAccountNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType6Code
	 * PersonIdentificationType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GunLicenseNumber"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType6Code GunLicenseNumber = new PersonIdentificationType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GunLicenseNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType6Code.mmObject();
			codeName = PersonIdentificationTypeCode.GunLicenseNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType6Code
	 * PersonIdentificationType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdoptionTaxpayerIdentificationNumber"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType6Code AdoptionTaxpayerIdentificationNumber = new PersonIdentificationType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdoptionTaxpayerIdentificationNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType6Code.mmObject();
			codeName = PersonIdentificationTypeCode.AdoptionTaxpayerIdentificationNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType6Code
	 * PersonIdentificationType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericTaxIdentificationNumber"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType6Code GenericTaxIdentificationNumber = new PersonIdentificationType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericTaxIdentificationNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType6Code.mmObject();
			codeName = PersonIdentificationTypeCode.GenericTaxIdentificationNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType6Code
	 * PersonIdentificationType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualTaxpayerIdentificationNumber"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType6Code IndividualTaxpayerIdentificationNumber = new PersonIdentificationType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualTaxpayerIdentificationNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType6Code.mmObject();
			codeName = PersonIdentificationTypeCode.IndividualTaxpayerIdentificationNumber.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PersonIdentificationType6Code> codesByName = new LinkedHashMap<>();

	protected PersonIdentificationType6Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AREG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PersonIdentificationType6Code";
				definition = "Specifies an alternative identification of an individual person, for example, national registration identification number, passport number.";
				trace_lazy = () -> PersonIdentificationTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PersonIdentificationType6Code.AlienRegistrationNumber, com.tools20022.repository.codeset.PersonIdentificationType6Code.CPFAccountNumber,
						com.tools20022.repository.codeset.PersonIdentificationType6Code.DriversLicenseNumber, com.tools20022.repository.codeset.PersonIdentificationType6Code.EmployerIdentificationNumber,
						com.tools20022.repository.codeset.PersonIdentificationType6Code.IdentityCardNumber, com.tools20022.repository.codeset.PersonIdentificationType6Code.NationalRegistrationIdentificationNumber,
						com.tools20022.repository.codeset.PersonIdentificationType6Code.Other, com.tools20022.repository.codeset.PersonIdentificationType6Code.PassportNumber,
						com.tools20022.repository.codeset.PersonIdentificationType6Code.PostOfficeCardNumber, com.tools20022.repository.codeset.PersonIdentificationType6Code.SocialSecurityNumber,
						com.tools20022.repository.codeset.PersonIdentificationType6Code.SRSAccountNumber, com.tools20022.repository.codeset.PersonIdentificationType6Code.GunLicenseNumber,
						com.tools20022.repository.codeset.PersonIdentificationType6Code.AdoptionTaxpayerIdentificationNumber, com.tools20022.repository.codeset.PersonIdentificationType6Code.GenericTaxIdentificationNumber,
						com.tools20022.repository.codeset.PersonIdentificationType6Code.IndividualTaxpayerIdentificationNumber);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AlienRegistrationNumber.getCodeName().get(), AlienRegistrationNumber);
		codesByName.put(CPFAccountNumber.getCodeName().get(), CPFAccountNumber);
		codesByName.put(DriversLicenseNumber.getCodeName().get(), DriversLicenseNumber);
		codesByName.put(EmployerIdentificationNumber.getCodeName().get(), EmployerIdentificationNumber);
		codesByName.put(IdentityCardNumber.getCodeName().get(), IdentityCardNumber);
		codesByName.put(NationalRegistrationIdentificationNumber.getCodeName().get(), NationalRegistrationIdentificationNumber);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(PassportNumber.getCodeName().get(), PassportNumber);
		codesByName.put(PostOfficeCardNumber.getCodeName().get(), PostOfficeCardNumber);
		codesByName.put(SocialSecurityNumber.getCodeName().get(), SocialSecurityNumber);
		codesByName.put(SRSAccountNumber.getCodeName().get(), SRSAccountNumber);
		codesByName.put(GunLicenseNumber.getCodeName().get(), GunLicenseNumber);
		codesByName.put(AdoptionTaxpayerIdentificationNumber.getCodeName().get(), AdoptionTaxpayerIdentificationNumber);
		codesByName.put(GenericTaxIdentificationNumber.getCodeName().get(), GenericTaxIdentificationNumber);
		codesByName.put(IndividualTaxpayerIdentificationNumber.getCodeName().get(), IndividualTaxpayerIdentificationNumber);
	}

	public static PersonIdentificationType6Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PersonIdentificationType6Code[] values() {
		PersonIdentificationType6Code[] values = new PersonIdentificationType6Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PersonIdentificationType6Code> {
		@Override
		public PersonIdentificationType6Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PersonIdentificationType6Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}