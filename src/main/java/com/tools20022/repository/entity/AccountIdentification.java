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

import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

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
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification43
 * AccountIdentification43}</li>
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
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<AccountIdentification, Optional<Account>> mmAccount = new MMBusinessAssociationEnd<AccountIdentification, Optional<Account>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account for which an identification is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Account.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Account.mmObject();
		}

		@Override
		public Optional<Account> getValue(AccountIdentification obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(AccountIdentification obj, Optional<Account> value) {
			obj.setAccount(value.orElse(null));
		}
	};
	protected IBAN2007Identifier iBAN;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<AccountIdentification, IBAN2007Identifier> mmIBAN = new MMBusinessAttribute<AccountIdentification, IBAN2007Identifier>() {
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

		@Override
		public IBAN2007Identifier getValue(AccountIdentification obj) {
			return obj.getIBAN();
		}

		@Override
		public void setValue(AccountIdentification obj, IBAN2007Identifier value) {
			obj.setIBAN(value);
		}
	};
	protected BBANIdentifier bBAN;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<AccountIdentification, BBANIdentifier> mmBBAN = new MMBusinessAttribute<AccountIdentification, BBANIdentifier>() {
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

		@Override
		public BBANIdentifier getValue(AccountIdentification obj) {
			return obj.getBBAN();
		}

		@Override
		public void setValue(AccountIdentification obj, BBANIdentifier value) {
			obj.setBBAN(value);
		}
	};
	protected UPICIdentifier uPIC;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<AccountIdentification, UPICIdentifier> mmUPIC = new MMBusinessAttribute<AccountIdentification, UPICIdentifier>() {
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

		@Override
		public UPICIdentifier getValue(AccountIdentification obj) {
			return obj.getUPIC();
		}

		@Override
		public void setValue(AccountIdentification obj, UPICIdentifier value) {
			obj.setUPIC(value);
		}
	};
	protected GenericIdentification proprietaryIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=AdminComment, AdminComment=|Former definition of
	 * DomesticAccount: The account number used by financial institutions in
	 * individual countries | to identify an account of a customer but not
	 * necessarily the bank and | branch of the financial institution where the
	 * account is held.</li>
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
	public static final MMBusinessAssociationEnd<AccountIdentification, GenericIdentification> mmProprietaryIdentification = new MMBusinessAssociationEnd<AccountIdentification, GenericIdentification>() {
		{
			derivation_lazy = () -> Arrays.asList(AccountIdentification5Choice.mmDomesticAccount, AccountIdentification5Choice.mmDepositoryAccount, AccountIdentification1.mmProprietary, CashAccountIdentification1Choice.mmDomesticAccount,
					AccountIdentification3Choice.mmProprietaryAccount, CashAccountIdentification5Choice.mmProprietary, CashAccountIdentification2Choice.mmProprietary, AccountIdentification26.mmProprietary,
					AccountDesignation1Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountIdentification.mmObject();
			semanticMarkup_lazy = () -> Arrays
					.asList(new OtherSemanticMarkup(
							this,
							"AdminComment",
							new String[]{
									"AdminComment",
									"|Former definition of DomesticAccount: The account number used by financial institutions in individual countries\n| to identify an account of a customer but not necessarily the bank and\n| branch of the financial institution where the account is held. \n"}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProprietaryIdentification";
			definition = "Unique identifier for an account. It is assigned by the account servicer using a proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> GenericIdentification.mmIdentificationForAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}

		@Override
		public GenericIdentification getValue(AccountIdentification obj) {
			return obj.getProprietaryIdentification();
		}

		@Override
		public void setValue(AccountIdentification obj, GenericIdentification value) {
			obj.setProprietaryIdentification(value);
		}
	};
	protected Max70Text name;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.SubAccount5#mmName
	 * SubAccount5.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndName5#mmName
	 * AccountIdentificationAndName5.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount53#mmAccountName
	 * InvestmentAccount53.mmAccountName}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount66#mmAccountName
	 * InvestmentAccount66.mmAccountName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67#mmAccountName
	 * InvestmentAccount67.mmAccountName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount65#mmAccountName
	 * InvestmentAccount65.mmAccountName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount68#mmAccountName
	 * InvestmentAccount68.mmAccountName}</li>
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
	public static final MMBusinessAttribute<AccountIdentification, Max70Text> mmName = new MMBusinessAttribute<AccountIdentification, Max70Text>() {
		{
			derivation_lazy = () -> Arrays.asList(SubAccount1.mmName, SafekeepingAccount2.mmName, SecuritiesAccount20.mmName, SecuritiesAccount3.mmName, AccountIdentification5.mmName, SecuritiesAccount19.mmName, SecuritiesAccount18.mmName,
					SecuritiesAccount22.mmName, InvestmentAccount43.mmName, SubAccount4.mmName, SecuritiesAccount24.mmName, SecuritiesAccount26.mmName, SecuritiesAccount25.mmName, SubAccount5.mmName, AccountIdentificationAndName5.mmName,
					InvestmentAccount53.mmAccountName, CollateralAccount2.mmName, InvestmentAccount61.mmName, InvestmentAccount63.mmName, InvestmentAccount62.mmName, InvestmentAccount58.mmAccountName, SubAccount6.mmName,
					InvestmentAccount64.mmName, CollateralAccount3.mmName, InvestmentAccount66.mmAccountName, InvestmentAccount67.mmAccountName, InvestmentAccount65.mmAccountName, InvestmentAccount68.mmAccountName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Max70Text getValue(AccountIdentification obj) {
			return obj.getName();
		}

		@Override
		public void setValue(AccountIdentification obj, Max70Text value) {
			obj.setName(value);
		}
	};
	protected GenericIdentification costReferencePattern;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<AccountIdentification, GenericIdentification> mmCostReferencePattern = new MMBusinessAssociationEnd<AccountIdentification, GenericIdentification>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CostReferencePattern";
			definition = "Template describing the mask of the structure for the format of the accounting account identifier; for example \"AABBBBCC\" where AA represents the country, BBBB the service classification, CC the sales area.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> GenericIdentification.mmIdentificationForAccountCostReferencePattern;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}

		@Override
		public GenericIdentification getValue(AccountIdentification obj) {
			return obj.getCostReferencePattern();
		}

		@Override
		public void setValue(AccountIdentification obj, GenericIdentification value) {
			obj.setCostReferencePattern(value);
		}
	};
	protected Max35Text number;
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
	public static final MMBusinessAttribute<AccountIdentification, Max35Text> mmNumber = new MMBusinessAttribute<AccountIdentification, Max35Text>() {
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

		@Override
		public Max35Text getValue(AccountIdentification obj) {
			return obj.getNumber();
		}

		@Override
		public void setValue(AccountIdentification obj, Max35Text value) {
			obj.setNumber(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountIdentification";
				definition = "Unique identifier of an account, as assigned by the account servicer.";
				associationDomain_lazy = () -> Arrays.asList(GenericIdentification.mmIdentificationForAccount, GenericIdentification.mmIdentificationForAccountCostReferencePattern, Account.mmIdentification);
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
						AccountIdentification43.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountIdentification.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Account> getAccount() {
		return account == null ? Optional.empty() : Optional.of(account);
	}

	public AccountIdentification setAccount(Account account) {
		this.account = account;
		return this;
	}

	public IBAN2007Identifier getIBAN() {
		return iBAN;
	}

	public AccountIdentification setIBAN(IBAN2007Identifier iBAN) {
		this.iBAN = Objects.requireNonNull(iBAN);
		return this;
	}

	public BBANIdentifier getBBAN() {
		return bBAN;
	}

	public AccountIdentification setBBAN(BBANIdentifier bBAN) {
		this.bBAN = Objects.requireNonNull(bBAN);
		return this;
	}

	public UPICIdentifier getUPIC() {
		return uPIC;
	}

	public AccountIdentification setUPIC(UPICIdentifier uPIC) {
		this.uPIC = Objects.requireNonNull(uPIC);
		return this;
	}

	public GenericIdentification getProprietaryIdentification() {
		return proprietaryIdentification;
	}

	public AccountIdentification setProprietaryIdentification(GenericIdentification proprietaryIdentification) {
		this.proprietaryIdentification = Objects.requireNonNull(proprietaryIdentification);
		return this;
	}

	public Max70Text getName() {
		return name;
	}

	public AccountIdentification setName(Max70Text name) {
		this.name = Objects.requireNonNull(name);
		return this;
	}

	public GenericIdentification getCostReferencePattern() {
		return costReferencePattern;
	}

	public AccountIdentification setCostReferencePattern(GenericIdentification costReferencePattern) {
		this.costReferencePattern = Objects.requireNonNull(costReferencePattern);
		return this;
	}

	public Max35Text getNumber() {
		return number;
	}

	public AccountIdentification setNumber(Max35Text number) {
		this.number = Objects.requireNonNull(number);
		return this;
	}
}