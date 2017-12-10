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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Unique identifier of an account, as assigned by the account servicer.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AccountIdentification"
 * src="doc-files/AccountIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmAccount
 * AccountIdentification.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmIBAN
 * AccountIdentification.mmIBAN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmBBAN
 * AccountIdentification.mmBBAN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmUPIC
 * AccountIdentification.mmUPIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmProprietaryIdentification
 * AccountIdentification.mmProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmName
 * AccountIdentification.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmCostReferencePattern
 * AccountIdentification.mmCostReferencePattern}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmNumber
 * AccountIdentification.mmNumber}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForAccount
 * GenericIdentification.mmIdentificationForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForAccountCostReferencePattern
 * GenericIdentification.mmIdentificationForAccountCostReferencePattern}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmIdentification
 * Account.mmIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndPurpose#mmIdentification
 * AccountIdentificationAndPurpose.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification3#mmIdentification
 * AccountIdentification3.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentificationFormatChoice#mmSimpleIdentification
 * AccountIdentificationFormatChoice.mmSimpleIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentificationFormatChoice#mmIdentificationAndPurpose
 * AccountIdentificationFormatChoice.mmIdentificationAndPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentificationFormatChoice#mmIdentificationAsDSS
 * AccountIdentificationFormatChoice.mmIdentificationAsDSS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification10#mmIdentificationCode
 * AccountIdentification10.mmIdentificationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification3#mmIdentification
 * SubAccountIdentification3.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification5#mmIdentification
 * SubAccountIdentification5.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification36#mmIdentification
 * SubAccountIdentification36.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification33Choice#mmForAllAccounts
 * AccountIdentification33Choice.mmForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification33Choice#mmAccountsListAndBalanceDetails
 * AccountIdentification33Choice.mmAccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification29Choice#mmForAllAccounts
 * AccountIdentification29Choice.mmForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification29Choice#mmAccountsList
 * AccountIdentification29Choice.mmAccountsList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification32Choice#mmForAllAccounts
 * AccountIdentification32Choice.mmForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndName5#mmIdentification
 * AccountIdentificationAndName5.mmIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification5Choice
 * AccountIdentification5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification1
 * AccountIdentification1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndPurpose
 * AccountIdentificationAndPurpose}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification3
 * AccountIdentification3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentificationFormatChoice
 * AccountIdentificationFormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification1Choice
 * CashAccountIdentification1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification3Choice
 * AccountIdentification3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericAccountIdentification1
 * GenericAccountIdentification1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice
 * AccountIdentification4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification5Choice
 * CashAccountIdentification5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification2Choice
 * CashAccountIdentification2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification10
 * AccountIdentification10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification26
 * AccountIdentification26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification3
 * SubAccountIdentification3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification5
 * SubAccountIdentification5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification2Choice
 * AccountIdentification2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification5
 * AccountIdentification5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification36
 * SubAccountIdentification36}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification33Choice
 * AccountIdentification33Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification29Choice
 * AccountIdentification29Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification32Choice
 * AccountIdentification32Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification31
 * AccountIdentification31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification32
 * AccountIdentification32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentificationAndName5
 * AccountIdentificationAndName5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification40
 * AccountIdentification40}</li>
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
 * "AccountIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Unique identifier of an account, as assigned by the account servicer."</li>
 * </ul>
 */
public class AccountIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Account account;
	/**
	 * Account for which an identification is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account for which an identification is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account for which an identification is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	protected IBAN2007Identifier iBAN;
	/**
	 * International Bank Account Number (IBAN) - identifier used
	 * internationally by financial institutions to uniquely identify the
	 * account of a customer. Further specifications of the format and content
	 * of the IBAN can be found in the standard ISO 13616
	 * "Banking and related financial services - International Bank Account Number (IBAN)"
	 * version 1997-10-01, or later revisions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.IBAN2007Identifier
	 * IBAN2007Identifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification5Choice#mmIBAN
	 * AccountIdentification5Choice.mmIBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification1Choice#mmIBAN
	 * CashAccountIdentification1Choice.mmIBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification3Choice#mmIBAN
	 * AccountIdentification3Choice.mmIBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice#mmIBAN
	 * AccountIdentification4Choice.mmIBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice#mmOther
	 * AccountIdentification4Choice.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification5Choice#mmIBAN
	 * CashAccountIdentification5Choice.mmIBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification2Choice#mmIBAN
	 * CashAccountIdentification2Choice.mmIBAN}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IBAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "International Bank Account Number (IBAN) - identifier used internationally by financial institutions to uniquely identify the account of a customer. Further specifications of the format and content of the IBAN can be found in the standard ISO 13616 \"Banking and related financial services - International Bank Account Number (IBAN)\" version 1997-10-01, or later revisions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIBAN = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AccountIdentification5Choice.mmIBAN, CashAccountIdentification1Choice.mmIBAN, AccountIdentification3Choice.mmIBAN, AccountIdentification4Choice.mmIBAN, AccountIdentification4Choice.mmOther,
					CashAccountIdentification5Choice.mmIBAN, CashAccountIdentification2Choice.mmIBAN);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IBAN";
			definition = "International Bank Account Number (IBAN) - identifier used internationally by financial institutions to uniquely identify the account of a customer. Further specifications of the format and content of the IBAN can be found in the standard ISO 13616 \"Banking and related financial services - International Bank Account Number (IBAN)\" version 1997-10-01, or later revisions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IBAN2007Identifier.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountIdentification.class.getMethod("getIBAN", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BBANIdentifier bBAN;
	/**
	 * Basic Bank Account Number (BBAN) - identifier used nationally by
	 * financial institutions, ie, in individual countries, generally as part of
	 * a National Account Numbering Scheme(s), to uniquely identify the account
	 * of a customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BBANIdentifier
	 * BBANIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification5Choice#mmBBAN
	 * AccountIdentification5Choice.mmBBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification1Choice#mmBBAN
	 * CashAccountIdentification1Choice.mmBBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification3Choice#mmBBAN
	 * AccountIdentification3Choice.mmBBAN}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BBAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Basic Bank Account Number (BBAN) - identifier used nationally by financial institutions, ie, in individual countries, generally as part of a National Account Numbering Scheme(s), to uniquely identify the account of a customer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBBAN = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AccountIdentification5Choice.mmBBAN, CashAccountIdentification1Choice.mmBBAN, AccountIdentification3Choice.mmBBAN);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BBAN";
			definition = "Basic Bank Account Number (BBAN) - identifier used nationally by financial institutions, ie, in individual countries, generally as part of a National Account Numbering Scheme(s), to uniquely identify the account of a customer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BBANIdentifier.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountIdentification.class.getMethod("getBBAN", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected UPICIdentifier uPIC;
	/**
	 * Universal Payment Identification Code (UPIC) - identifier used by the New
	 * York Clearing House to mask confidential data, such as bank accounts and
	 * bank routing numbers. UPIC numbers remain with business customers,
	 * regardless of banking relationship changes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.UPICIdentifier
	 * UPICIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification1Choice#mmUPIC
	 * CashAccountIdentification1Choice.mmUPIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification3Choice#mmUPIC
	 * AccountIdentification3Choice.mmUPIC}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UPIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Universal Payment Identification Code (UPIC) - identifier used by the New York Clearing House to mask confidential data, such as bank accounts and bank routing numbers. UPIC numbers remain with business customers, regardless of banking relationship changes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmUPIC = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CashAccountIdentification1Choice.mmUPIC, AccountIdentification3Choice.mmUPIC);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UPIC";
			definition = "Universal Payment Identification Code (UPIC) - identifier used by the New York Clearing House to mask confidential data, such as bank accounts and bank routing numbers. UPIC numbers remain with business customers, regardless of banking relationship changes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UPICIdentifier.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountIdentification.class.getMethod("getUPIC", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected GenericIdentification proprietaryIdentification;
	/**
	 * Unique identifier for an account. It is assigned by the account servicer
	 * using a proprietary identification scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForAccount
	 * GenericIdentification.mmIdentificationForAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification5Choice#mmDomesticAccount
	 * AccountIdentification5Choice.mmDomesticAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification5Choice#mmDepositoryAccount
	 * AccountIdentification5Choice.mmDepositoryAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification1#mmProprietary
	 * AccountIdentification1.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification1Choice#mmDomesticAccount
	 * CashAccountIdentification1Choice.mmDomesticAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification3Choice#mmProprietaryAccount
	 * AccountIdentification3Choice.mmProprietaryAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification5Choice#mmProprietary
	 * CashAccountIdentification5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification2Choice#mmProprietary
	 * CashAccountIdentification2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification26#mmProprietary
	 * AccountIdentification26.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountDesignation1Choice#mmProprietary
	 * AccountDesignation1Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for an account. It is assigned by the account servicer using a proprietary identification scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmProprietaryIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AccountIdentification5Choice.mmDomesticAccount, AccountIdentification5Choice.mmDepositoryAccount, AccountIdentification1.mmProprietary, CashAccountIdentification1Choice.mmDomesticAccount,
					AccountIdentification3Choice.mmProprietaryAccount, CashAccountIdentification5Choice.mmProprietary, CashAccountIdentification2Choice.mmProprietary, AccountIdentification26.mmProprietary,
					AccountDesignation1Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProprietaryIdentification";
			definition = "Unique identifier for an account. It is assigned by the account servicer using a proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmIdentificationForAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
		}
	};
	protected Max70Text name;
	/**
	 * Name of the account. It provides an additional means of identification,
	 * and is designated by the account servicer in agreement with the account
	 * owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.SubAccount1#mmName
	 * SubAccount1.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingAccount2#mmName
	 * SafekeepingAccount2.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount20#mmName
	 * SecuritiesAccount20.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount3#mmName
	 * SecuritiesAccount3.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification5#mmName
	 * AccountIdentification5.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount19#mmName
	 * SecuritiesAccount19.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount18#mmName
	 * SecuritiesAccount18.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount22#mmName
	 * SecuritiesAccount22.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount43#mmName
	 * InvestmentAccount43.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SubAccount4#mmName
	 * SubAccount4.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount24#mmName
	 * SecuritiesAccount24.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount26#mmName
	 * SecuritiesAccount26.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount25#mmName
	 * SecuritiesAccount25.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount54#mmAccountName
	 * InvestmentAccount54.mmAccountName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount56#mmAccountName
	 * InvestmentAccount56.mmAccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SubAccount5#mmName
	 * SubAccount5.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55#mmAccountName
	 * InvestmentAccount55.mmAccountName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndName5#mmName
	 * AccountIdentificationAndName5.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount53#mmAccountName
	 * InvestmentAccount53.mmAccountName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#mmAccountName
	 * InvestmentAccount57.mmAccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CollateralAccount2#mmName
	 * CollateralAccount2.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmName
	 * InvestmentAccount61.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmName
	 * InvestmentAccount63.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmName
	 * InvestmentAccount62.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount58#mmAccountName
	 * InvestmentAccount58.mmAccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SubAccount6#mmName
	 * SubAccount6.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount64#mmName
	 * InvestmentAccount64.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CollateralAccount3#mmName
	 * CollateralAccount3.mmName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays
					.asList(SubAccount1.mmName, SafekeepingAccount2.mmName, SecuritiesAccount20.mmName, SecuritiesAccount3.mmName, AccountIdentification5.mmName, SecuritiesAccount19.mmName, SecuritiesAccount18.mmName,
							SecuritiesAccount22.mmName, InvestmentAccount43.mmName, SubAccount4.mmName, SecuritiesAccount24.mmName, SecuritiesAccount26.mmName, SecuritiesAccount25.mmName, InvestmentAccount54.mmAccountName,
							InvestmentAccount56.mmAccountName, SubAccount5.mmName, InvestmentAccount55.mmAccountName, AccountIdentificationAndName5.mmName, InvestmentAccount53.mmAccountName, InvestmentAccount57.mmAccountName,
							CollateralAccount2.mmName, InvestmentAccount61.mmName, InvestmentAccount63.mmName, InvestmentAccount62.mmName, InvestmentAccount58.mmAccountName, SubAccount6.mmName, InvestmentAccount64.mmName,
							CollateralAccount3.mmName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountIdentification.class.getMethod("getName", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected GenericIdentification costReferencePattern;
	/**
	 * Template describing the mask of the structure for the format of the
	 * accounting account identifier; for example "AABBBBCC" where AA represents
	 * the country, BBBB the service classification, CC the sales area.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForAccountCostReferencePattern
	 * GenericIdentification.mmIdentificationForAccountCostReferencePattern}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CostReferencePattern"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Template describing the mask of the structure for the format of the accounting account identifier; for example \"AABBBBCC\" where AA represents the country, BBBB the service classification, CC the sales area."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCostReferencePattern = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CostReferencePattern";
			definition = "Template describing the mask of the structure for the format of the accounting account identifier; for example \"AABBBBCC\" where AA represents the country, BBBB the service classification, CC the sales area.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmIdentificationForAccountCostReferencePattern;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
		}
	};
	protected Max35Text number;
	/**
	 * String of characters (mainly numbers) used to identify an account.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.Entitlement1#mmAccountIdentification
	 * Entitlement1.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus11#mmAccountIdentification
	 * DetailedInstructionStatus11.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus11#mmSubAccountIdentification
	 * DetailedInstructionStatus11.mmSubAccountIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Number"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "String of characters (mainly numbers) used to identify an account."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Entitlement1.mmAccountIdentification, DetailedInstructionStatus11.mmAccountIdentification, DetailedInstructionStatus11.mmSubAccountIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Number";
			definition = "String of characters (mainly numbers) used to identify an account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountIdentification.class.getMethod("getNumber", new Class[]{});
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
				name = "AccountIdentification";
				definition = "Unique identifier of an account, as assigned by the account servicer.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.mmIdentificationForAccount,
						com.tools20022.repository.entity.GenericIdentification.mmIdentificationForAccountCostReferencePattern, com.tools20022.repository.entity.Account.mmIdentification);
				derivationElement_lazy = () -> Arrays.asList(AccountIdentificationAndPurpose.mmIdentification, AccountIdentification3.mmIdentification, AccountIdentificationFormatChoice.mmSimpleIdentification,
						AccountIdentificationFormatChoice.mmIdentificationAndPurpose, AccountIdentificationFormatChoice.mmIdentificationAsDSS, AccountIdentification10.mmIdentificationCode, SubAccountIdentification3.mmIdentification,
						SubAccountIdentification5.mmIdentification, SubAccountIdentification36.mmIdentification, AccountIdentification33Choice.mmForAllAccounts, AccountIdentification33Choice.mmAccountsListAndBalanceDetails,
						AccountIdentification29Choice.mmForAllAccounts, AccountIdentification29Choice.mmAccountsList, AccountIdentification32Choice.mmForAllAccounts, AccountIdentificationAndName5.mmIdentification);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountIdentification.mmAccount, com.tools20022.repository.entity.AccountIdentification.mmIBAN,
						com.tools20022.repository.entity.AccountIdentification.mmBBAN, com.tools20022.repository.entity.AccountIdentification.mmUPIC, com.tools20022.repository.entity.AccountIdentification.mmProprietaryIdentification,
						com.tools20022.repository.entity.AccountIdentification.mmName, com.tools20022.repository.entity.AccountIdentification.mmCostReferencePattern, com.tools20022.repository.entity.AccountIdentification.mmNumber);
				derivationComponent_lazy = () -> Arrays.asList(AccountIdentification5Choice.mmObject(), AccountIdentification1.mmObject(), AccountIdentificationAndPurpose.mmObject(), AccountIdentification3.mmObject(),
						AccountIdentificationFormatChoice.mmObject(), CashAccountIdentification1Choice.mmObject(), AccountIdentification3Choice.mmObject(), GenericAccountIdentification1.mmObject(), AccountIdentification4Choice.mmObject(),
						CashAccountIdentification5Choice.mmObject(), CashAccountIdentification2Choice.mmObject(), AccountIdentification10.mmObject(), AccountIdentification26.mmObject(), SubAccountIdentification3.mmObject(),
						SubAccountIdentification5.mmObject(), AccountIdentification2Choice.mmObject(), AccountIdentification5.mmObject(), SubAccountIdentification36.mmObject(), AccountIdentification33Choice.mmObject(),
						AccountIdentification29Choice.mmObject(), AccountIdentification32Choice.mmObject(), AccountIdentification31.mmObject(), AccountIdentification32.mmObject(), AccountIdentificationAndName5.mmObject(),
						AccountIdentification40.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountIdentification.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(com.tools20022.repository.entity.Account account) {
		this.account = account;
	}

	public IBAN2007Identifier getIBAN() {
		return iBAN;
	}

	public void setIBAN(IBAN2007Identifier iBAN) {
		this.iBAN = iBAN;
	}

	public BBANIdentifier getBBAN() {
		return bBAN;
	}

	public void setBBAN(BBANIdentifier bBAN) {
		this.bBAN = bBAN;
	}

	public UPICIdentifier getUPIC() {
		return uPIC;
	}

	public void setUPIC(UPICIdentifier uPIC) {
		this.uPIC = uPIC;
	}

	public GenericIdentification getProprietaryIdentification() {
		return proprietaryIdentification;
	}

	public void setProprietaryIdentification(com.tools20022.repository.entity.GenericIdentification proprietaryIdentification) {
		this.proprietaryIdentification = proprietaryIdentification;
	}

	public Max70Text getName() {
		return name;
	}

	public void setName(Max70Text name) {
		this.name = name;
	}

	public GenericIdentification getCostReferencePattern() {
		return costReferencePattern;
	}

	public void setCostReferencePattern(com.tools20022.repository.entity.GenericIdentification costReferencePattern) {
		this.costReferencePattern = costReferencePattern;
	}

	public Max35Text getNumber() {
		return number;
	}

	public void setNumber(Max35Text number) {
		this.number = number;
	}
}