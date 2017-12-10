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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Account between an investor(s) and a fund manager or a fund. The account can
 * contain holdings in any investment fund or investment fund class managed (or
 * distributed) by the fund manager, within the same fund family.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentAccount" src="doc-files/InvestmentAccount.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentAccountType
 * InvestmentAccount.mmInvestmentAccountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmOwnershipType
 * InvestmentAccount.mmOwnershipType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmDesignation
 * InvestmentAccount.mmDesignation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmReferenceCurrency
 * InvestmentAccount.mmReferenceCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundClass
 * InvestmentAccount.mmInvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmCashAccount
 * InvestmentAccount.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmSecuritiesAccount
 * InvestmentAccount.mmSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundTax
 * InvestmentAccount.mmInvestmentFundTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundTransaction
 * InvestmentAccount.mmInvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmSidePocket
 * InvestmentAccount.mmSidePocket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentAccountPartyRole
 * InvestmentAccount.mmInvestmentAccountPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmDebitPortfolioTransfer
 * InvestmentAccount.mmDebitPortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmCreditPortfolioTransfer
 * InvestmentAccount.mmCreditPortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmAccountForInvestmentFundProcessing
 * InvestmentAccount.mmAccountForInvestmentFundProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentAccountContract
 * InvestmentAccount.mmInvestmentAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmAccountUsageType
 * InvestmentAccount.mmAccountUsageType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmCategory
 * InvestmentAccount.mmCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmPortfolio
 * InvestmentAccount.mmPortfolio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmRelatedPortfolioTransfer
 * InvestmentAccount.mmRelatedPortfolioTransfer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmInvestmentAccount
 * InvestmentFundClass.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedInvestmentAccount
 * CashAccount.mmRelatedInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedInvestmentAccount
 * SecuritiesAccount.mmRelatedInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#mmInvestmentAccount
 * InvestmentAccountContract.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmInvestmentAccount
 * InvestmentAccountPartyRole.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmInvestmentAccount
 * InvestmentFundTax.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentAccount
 * InvestmentFundTransaction.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmAccountFrom
 * PortfolioTransfer.mmAccountFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmAccountTo
 * PortfolioTransfer.mmAccountTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmNomineeAccount
 * PortfolioTransfer.mmNomineeAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#mmAccount
 * Portfolio.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SidePocket#mmInvestmentAccount
 * SidePocket.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundOrderDesk#mmMainFundOrderDeskAccount
 * FundOrderDesk.mmMainFundOrderDeskAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3#mmInvestmentAccountDetails
 * StatementOfInvestmentFundTransactions3.mmInvestmentAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13#mmReceiverDetails
 * ReceivingPartiesAndAccount13.mmReceiverDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut17#mmAccountDetails
 * TransferOut17.mmAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn14#mmAccountDetails
 * TransferIn14.mmAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn15#mmAccountDetails
 * TransferIn15.mmAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut16#mmAccountDetails
 * TransferOut16.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountUsageType2Choice#mmCode
 * AccountUsageType2Choice.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountUsageType2Choice#mmProprietary
 * AccountUsageType2Choice.mmProprietary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmType
 * InvestmentAccount61.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmAccountUsageType
 * InvestmentAccount61.mmAccountUsageType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountSelection2Choice#mmOtherAccountSelectionData
 * AccountSelection2Choice.mmOtherAccountSelectionData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmType
 * InvestmentAccount63.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmAccountUsageType
 * InvestmentAccount63.mmAccountUsageType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmType
 * InvestmentAccount62.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmAccountUsageType
 * InvestmentAccount62.mmAccountUsageType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InvestmentAccountType1Choice
 * InvestmentAccountType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount43
 * InvestmentAccount43}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3
 * StatementOfInvestmentFundTransactions3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount42
 * InvestmentAccount42}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account19 Account19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount54
 * InvestmentAccount54}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount56
 * InvestmentAccount56}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AccountType2Choice
 * AccountType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount55
 * InvestmentAccount55}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount53
 * InvestmentAccount53}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount57
 * InvestmentAccount57}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AccountUsageType2Choice
 * AccountUsageType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OwnershipType2Choice
 * OwnershipType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount61
 * InvestmentAccount61}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount63
 * InvestmentAccount63}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount62
 * InvestmentAccount62}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount58
 * InvestmentAccount58}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount64
 * InvestmentAccount64}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount60
 * InvestmentAccount60}</li>
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
 * "InvestmentAccount"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family."
 * </li>
 * </ul>
 */
public class InvestmentAccount extends Account {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected FundCashAccountCode investmentAccountType;
	/**
	 * Purpose of the account/source fund type. This is typically linked to an
	 * investment product, eg, wrapper, PEP, ISA.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode
	 * FundCashAccountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestmentAccountType1Choice#mmCode
	 * InvestmentAccountType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestmentAccountType1Choice#mmProprietary
	 * InvestmentAccountType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountType2Choice#mmCode
	 * AccountType2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountType2Choice#mmProprietary
	 * AccountType2Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount60#mmType
	 * InvestmentAccount60.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Purpose of the account/source fund type. This is typically linked to an investment product, eg, wrapper, PEP, ISA."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInvestmentAccountType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentAccountType1Choice.mmCode, InvestmentAccountType1Choice.mmProprietary, AccountType2Choice.mmCode, AccountType2Choice.mmProprietary, InvestmentAccount60.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountType";
			definition = "Purpose of the account/source fund type. This is typically linked to an investment product, eg, wrapper, PEP, ISA.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FundCashAccountCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentAccount.class.getMethod("getInvestmentAccountType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AccountOwnershipTypeCode ownershipType;
	/**
	 * Ownership status of the account, eg, joint owners.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode
	 * AccountOwnershipTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OwnershipType2Choice#mmCode
	 * OwnershipType2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OwnershipType2Choice#mmProprietary
	 * OwnershipType2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmOwnershipType
	 * InvestmentAccount61.mmOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmOwnershipType
	 * InvestmentAccount63.mmOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmOwnershipType
	 * InvestmentAccount62.mmOwnershipType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnershipType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ownership status of the account, eg, joint owners."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOwnershipType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OwnershipType2Choice.mmCode, OwnershipType2Choice.mmProprietary, InvestmentAccount61.mmOwnershipType, InvestmentAccount63.mmOwnershipType, InvestmentAccount62.mmOwnershipType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OwnershipType";
			definition = "Ownership status of the account, eg, joint owners.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AccountOwnershipTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentAccount.class.getMethod("getOwnershipType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max70Text designation;
	/**
	 * Supplementary registration information applying to a specific block of
	 * units for dealing and reporting purposes. The supplementary registration
	 * information may be used when all the units are registered, for example,
	 * to a funds supermarket, but holdings for each investor have to be
	 * reconciled individually.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount2#mmDesignation
	 * SafekeepingAccount2.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount43#mmDesignation
	 * InvestmentAccount43.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount26#mmDesignation
	 * SecuritiesAccount26.mmDesignation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account19#mmDesignation
	 * Account19.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount54#mmAccountDesignation
	 * InvestmentAccount54.mmAccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount56#mmAccountDesignation
	 * InvestmentAccount56.mmAccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55#mmAccountDesignation
	 * InvestmentAccount55.mmAccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount53#mmAccountDesignation
	 * InvestmentAccount53.mmAccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#mmAccountDesignation
	 * InvestmentAccount57.mmAccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmDesignation
	 * InvestmentAccount61.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmDesignation
	 * InvestmentAccount63.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmDesignation
	 * InvestmentAccount62.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount58#mmAccountDesignation
	 * InvestmentAccount58.mmAccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccount6#mmAccountDesignation
	 * SubAccount6.mmAccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount64#mmDesignation
	 * InvestmentAccount64.mmDesignation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Designation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Supplementary registration information applying to a specific block of units for dealing and reporting purposes. The supplementary registration information may be used when all the units are registered, for example, to a funds supermarket, but holdings for each investor have to be reconciled individually."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDesignation = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SafekeepingAccount2.mmDesignation, InvestmentAccount43.mmDesignation, SecuritiesAccount26.mmDesignation, Account19.mmDesignation, InvestmentAccount54.mmAccountDesignation,
					InvestmentAccount56.mmAccountDesignation, InvestmentAccount55.mmAccountDesignation, InvestmentAccount53.mmAccountDesignation, InvestmentAccount57.mmAccountDesignation, InvestmentAccount61.mmDesignation,
					InvestmentAccount63.mmDesignation, InvestmentAccount62.mmDesignation, InvestmentAccount58.mmAccountDesignation, SubAccount6.mmAccountDesignation, InvestmentAccount64.mmDesignation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Designation";
			definition = "Supplementary registration information applying to a specific block of units for dealing and reporting purposes. The supplementary registration information may be used when all the units are registered, for example, to a funds supermarket, but holdings for each investor have to be reconciled individually.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentAccount.class.getMethod("getDesignation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode referenceCurrency;
	/**
	 * Currency chosen for reporting purposes by the account owner in agreement
	 * with the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmReferenceCurrency
	 * InvestmentAccount61.mmReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmReferenceCurrency
	 * InvestmentAccount63.mmReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmReferenceCurrency
	 * InvestmentAccount62.mmReferenceCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency chosen for reporting purposes by the account owner in agreement with the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmReferenceCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentAccount61.mmReferenceCurrency, InvestmentAccount63.mmReferenceCurrency, InvestmentAccount62.mmReferenceCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReferenceCurrency";
			definition = "Currency chosen for reporting purposes by the account owner in agreement with the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentAccount.class.getMethod("getReferenceCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentFundClass> investmentFundClass;
	/**
	 * Investment fund classes held in an investment account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmInvestmentAccount
	 * InvestmentFundClass.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmFinancialInstrumentDetails
	 * InvestmentAccount61.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmModifiedFinancialInstrumentDetails
	 * InvestmentAccount63.mmModifiedFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmFinancialInstrumentDetails
	 * InvestmentAccount62.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount64#mmSecurityDetails
	 * InvestmentAccount64.mmSecurityDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundClass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment fund classes held in an investment account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvestmentFundClass = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentAccount61.mmFinancialInstrumentDetails, InvestmentAccount63.mmModifiedFinancialInstrumentDetails, InvestmentAccount62.mmFinancialInstrumentDetails,
					InvestmentAccount64.mmSecurityDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundClass";
			definition = "Investment fund classes held in an investment account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmInvestmentAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CashAccount> cashAccount;
	/**
	 * Part of the investment account to or from which cash entries are made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedInvestmentAccount
	 * CashAccount.mmRelatedInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer24#mmCashAccount
	 * ISATransfer24.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument21Choice#mmCashAccountDetails
	 * PaymentInstrument21Choice.mmCashAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument20Choice#mmCashAccountDetails
	 * PaymentInstrument20Choice.mmCashAccountDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Part of the investment account to or from which cash entries are made."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(ISATransfer24.mmCashAccount, PaymentInstrument21Choice.mmCashAccountDetails, PaymentInstrument20Choice.mmCashAccountDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Part of the investment account to or from which cash entries are made.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmRelatedInvestmentAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesAccount> securitiesAccount;
	/**
	 * Part of the investment account to or from which securities entries are
	 * made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedInvestmentAccount
	 * SecuritiesAccount.mmRelatedInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Part of the investment account to or from which securities entries are made."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccount";
			definition = "Part of the investment account to or from which securities entries are made.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmRelatedInvestmentAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentFundTax> investmentFundTax;
	/**
	 * Taxes specific to the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmInvestmentAccount
	 * InvestmentFundTax.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmTaxExemption
	 * InvestmentAccount61.mmTaxExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmTaxExemption
	 * InvestmentAccount63.mmTaxExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmTaxExemption
	 * InvestmentAccount62.mmTaxExemption}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Taxes specific to the account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvestmentFundTax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentAccount61.mmTaxExemption, InvestmentAccount63.mmTaxExemption, InvestmentAccount62.mmTaxExemption);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundTax";
			definition = "Taxes specific to the account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTax.mmInvestmentAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTax.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentFundTransaction> investmentFundTransaction;
	/**
	 * Investment fund transaction which uses the investment account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentAccount
	 * InvestmentFundTransaction.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification36#mmTransactionOnSubAccount
	 * SubAccountIdentification36.mmTransactionOnSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3#mmTransactionOnAccount
	 * StatementOfInvestmentFundTransactions3.mmTransactionOnAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund transaction which uses the investment account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvestmentFundTransaction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SubAccountIdentification36.mmTransactionOnSubAccount, StatementOfInvestmentFundTransactions3.mmTransactionOnAccount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundTransaction";
			definition = "Investment fund transaction which uses the investment account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SidePocket> sidePocket;
	/**
	 * Separate account containing illiquid assets of a hedge fund portfolio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SidePocket#mmInvestmentAccount
	 * SidePocket.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SidePocket
	 * SidePocket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SidePocket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Separate account containing illiquid assets of a hedge fund portfolio."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSidePocket = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SidePocket";
			definition = "Separate account containing illiquid assets of a hedge fund portfolio.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SidePocket.mmInvestmentAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SidePocket.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentAccountPartyRole> investmentAccountPartyRole;
	/**
	 * Specifies each role linked to an investment account and played by a party
	 * in that context.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmInvestmentAccount
	 * InvestmentAccountPartyRole.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to an investment account and played by a party in that context."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvestmentAccountPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountPartyRole";
			definition = "Specifies each role linked to an investment account and played by a party in that context.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountPartyRole.mmInvestmentAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccountPartyRole.mmObject();
		}
	};
	protected PortfolioTransfer debitPortfolioTransfer;
	/**
	 * Transfer process for which a debit investment account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmAccountFrom
	 * PortfolioTransfer.mmAccountFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitPortfolioTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transfer process for which a debit investment account is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDebitPortfolioTransfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebitPortfolioTransfer";
			definition = "Transfer process for which a debit investment account is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmAccountFrom;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
		}
	};
	protected PortfolioTransfer creditPortfolioTransfer;
	/**
	 * Transfer process for which a beneficiary investment account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmAccountTo
	 * PortfolioTransfer.mmAccountTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditPortfolioTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transfer process for which a beneficiary investment account is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCreditPortfolioTransfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditPortfolioTransfer";
			definition = "Transfer process for which a beneficiary investment account is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmAccountTo;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
		}
	};
	protected FundOrderDesk accountForInvestmentFundProcessing;
	/**
	 * Order desk for which an account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FundOrderDesk#mmMainFundOrderDeskAccount
	 * FundOrderDesk.mmMainFundOrderDeskAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.FundOrderDesk
	 * FundOrderDesk}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountForInvestmentFundProcessing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order desk for which an account is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAccountForInvestmentFundProcessing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountForInvestmentFundProcessing";
			definition = "Order desk for which an account is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.FundOrderDesk.mmMainFundOrderDeskAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FundOrderDesk.mmObject();
		}
	};
	protected InvestmentAccountContract investmentAccountContract;
	/**
	 * Contract defining the related account
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#mmInvestmentAccount
	 * InvestmentAccountContract.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract
	 * InvestmentAccountContract}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmLetterIntentReference
	 * SubscriptionExecution13.mmLetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmLetterIntentReference
	 * SubscriptionExecution12.mmLetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmLetterIntentReference
	 * SubscriptionOrder15.mmLetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmLetterIntentReference
	 * SubscriptionOrder14.mmLetterIntentReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract defining the related account"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvestmentAccountContract = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SubscriptionExecution13.mmLetterIntentReference, SubscriptionExecution12.mmLetterIntentReference, SubscriptionOrder15.mmLetterIntentReference, SubscriptionOrder14.mmLetterIntentReference);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountContract";
			definition = "Contract defining the related account";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountContract.mmInvestmentAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccountContract.mmObject();
		}
	};
	protected AccountUsageTypeCode accountUsageType;
	/**
	 * Specifies whether the account is used for investment or for settlement
	 * purpose.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AccountUsageTypeCode
	 * AccountUsageTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountUsageType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the account is used for investment or for settlement purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAccountUsageType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountUsageType";
			definition = "Specifies whether the account is used for investment or for settlement purpose.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AccountUsageTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentAccount.class.getMethod("getAccountUsageType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestmentAccountCategoryCode category;
	/**
	 * Specifies the investment account category.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentAccountCategoryCode
	 * InvestmentAccountCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestmentAccountCategory1Choice#mmCode
	 * InvestmentAccountCategory1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestmentAccountCategory1Choice#mmProprietary
	 * InvestmentAccountCategory1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmInvestmentAccountCategory
	 * InvestmentAccount61.mmInvestmentAccountCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmInvestmentAccountCategory
	 * InvestmentAccount63.mmInvestmentAccountCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmInvestmentAccountCategory
	 * InvestmentAccount62.mmInvestmentAccountCategory}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Category"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the investment account category."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCategory = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentAccountCategory1Choice.mmCode, InvestmentAccountCategory1Choice.mmProprietary, InvestmentAccount61.mmInvestmentAccountCategory, InvestmentAccount63.mmInvestmentAccountCategory,
					InvestmentAccount62.mmInvestmentAccountCategory);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Category";
			definition = "Specifies the investment account category.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InvestmentAccountCategoryCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentAccount.class.getMethod("getCategory", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Portfolio portfolio;
	/**
	 * Portfolio held on an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Portfolio#mmAccount
	 * Portfolio.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Portfolio Portfolio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Portfolio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Portfolio held on an account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPortfolio = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Portfolio";
			definition = "Portfolio held on an account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Portfolio.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
		}
	};
	protected PortfolioTransfer relatedPortfolioTransfer;
	/**
	 * Transfer of a portfolio held on a nominee account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmNomineeAccount
	 * PortfolioTransfer.mmNomineeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPortfolioTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer of a portfolio held on a nominee account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedPortfolioTransfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPortfolioTransfer";
			definition = "Transfer of a portfolio held on a nominee account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmNomineeAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccount";
				definition = "Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.mmInvestmentAccount, com.tools20022.repository.entity.CashAccount.mmRelatedInvestmentAccount,
						com.tools20022.repository.entity.SecuritiesAccount.mmRelatedInvestmentAccount, com.tools20022.repository.entity.InvestmentAccountContract.mmInvestmentAccount,
						com.tools20022.repository.entity.InvestmentAccountPartyRole.mmInvestmentAccount, com.tools20022.repository.entity.InvestmentFundTax.mmInvestmentAccount,
						com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentAccount, com.tools20022.repository.entity.PortfolioTransfer.mmAccountFrom, com.tools20022.repository.entity.PortfolioTransfer.mmAccountTo,
						com.tools20022.repository.entity.PortfolioTransfer.mmNomineeAccount, com.tools20022.repository.entity.Portfolio.mmAccount, com.tools20022.repository.entity.SidePocket.mmInvestmentAccount,
						com.tools20022.repository.entity.FundOrderDesk.mmMainFundOrderDeskAccount);
				derivationElement_lazy = () -> Arrays.asList(StatementOfInvestmentFundTransactions3.mmInvestmentAccountDetails, ReceivingPartiesAndAccount13.mmReceiverDetails, TransferOut17.mmAccountDetails, TransferIn14.mmAccountDetails,
						TransferIn15.mmAccountDetails, TransferOut16.mmAccountDetails, AccountUsageType2Choice.mmCode, AccountUsageType2Choice.mmProprietary, InvestmentAccount61.mmType, InvestmentAccount61.mmAccountUsageType,
						AccountSelection2Choice.mmOtherAccountSelectionData, InvestmentAccount63.mmType, InvestmentAccount63.mmAccountUsageType, InvestmentAccount62.mmType, InvestmentAccount62.mmAccountUsageType);
				superType_lazy = () -> Account.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccount.mmInvestmentAccountType, com.tools20022.repository.entity.InvestmentAccount.mmOwnershipType,
						com.tools20022.repository.entity.InvestmentAccount.mmDesignation, com.tools20022.repository.entity.InvestmentAccount.mmReferenceCurrency, com.tools20022.repository.entity.InvestmentAccount.mmInvestmentFundClass,
						com.tools20022.repository.entity.InvestmentAccount.mmCashAccount, com.tools20022.repository.entity.InvestmentAccount.mmSecuritiesAccount, com.tools20022.repository.entity.InvestmentAccount.mmInvestmentFundTax,
						com.tools20022.repository.entity.InvestmentAccount.mmInvestmentFundTransaction, com.tools20022.repository.entity.InvestmentAccount.mmSidePocket,
						com.tools20022.repository.entity.InvestmentAccount.mmInvestmentAccountPartyRole, com.tools20022.repository.entity.InvestmentAccount.mmDebitPortfolioTransfer,
						com.tools20022.repository.entity.InvestmentAccount.mmCreditPortfolioTransfer, com.tools20022.repository.entity.InvestmentAccount.mmAccountForInvestmentFundProcessing,
						com.tools20022.repository.entity.InvestmentAccount.mmInvestmentAccountContract, com.tools20022.repository.entity.InvestmentAccount.mmAccountUsageType, com.tools20022.repository.entity.InvestmentAccount.mmCategory,
						com.tools20022.repository.entity.InvestmentAccount.mmPortfolio, com.tools20022.repository.entity.InvestmentAccount.mmRelatedPortfolioTransfer);
				derivationComponent_lazy = () -> Arrays.asList(InvestmentAccountType1Choice.mmObject(), InvestmentAccount43.mmObject(), StatementOfInvestmentFundTransactions3.mmObject(), InvestmentAccount42.mmObject(),
						Account19.mmObject(), InvestmentAccount54.mmObject(), InvestmentAccount56.mmObject(), AccountType2Choice.mmObject(), InvestmentAccount55.mmObject(), InvestmentAccount53.mmObject(), InvestmentAccount57.mmObject(),
						AccountUsageType2Choice.mmObject(), OwnershipType2Choice.mmObject(), InvestmentAccount61.mmObject(), InvestmentAccount63.mmObject(), InvestmentAccount62.mmObject(), InvestmentAccount58.mmObject(),
						InvestmentAccount64.mmObject(), InvestmentAccount60.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvestmentAccount.class;
			}
		});
		return mmObject_lazy.get();
	}

	public FundCashAccountCode getInvestmentAccountType() {
		return investmentAccountType;
	}

	public void setInvestmentAccountType(FundCashAccountCode investmentAccountType) {
		this.investmentAccountType = investmentAccountType;
	}

	public AccountOwnershipTypeCode getOwnershipType() {
		return ownershipType;
	}

	public void setOwnershipType(AccountOwnershipTypeCode ownershipType) {
		this.ownershipType = ownershipType;
	}

	public Max70Text getDesignation() {
		return designation;
	}

	public void setDesignation(Max70Text designation) {
		this.designation = designation;
	}

	public CurrencyCode getReferenceCurrency() {
		return referenceCurrency;
	}

	public void setReferenceCurrency(CurrencyCode referenceCurrency) {
		this.referenceCurrency = referenceCurrency;
	}

	public List<InvestmentFundClass> getInvestmentFundClass() {
		return investmentFundClass;
	}

	public void setInvestmentFundClass(List<com.tools20022.repository.entity.InvestmentFundClass> investmentFundClass) {
		this.investmentFundClass = investmentFundClass;
	}

	public List<CashAccount> getCashAccount() {
		return cashAccount;
	}

	public void setCashAccount(List<com.tools20022.repository.entity.CashAccount> cashAccount) {
		this.cashAccount = cashAccount;
	}

	public List<SecuritiesAccount> getSecuritiesAccount() {
		return securitiesAccount;
	}

	public void setSecuritiesAccount(List<com.tools20022.repository.entity.SecuritiesAccount> securitiesAccount) {
		this.securitiesAccount = securitiesAccount;
	}

	public List<InvestmentFundTax> getInvestmentFundTax() {
		return investmentFundTax;
	}

	public void setInvestmentFundTax(List<com.tools20022.repository.entity.InvestmentFundTax> investmentFundTax) {
		this.investmentFundTax = investmentFundTax;
	}

	public List<InvestmentFundTransaction> getInvestmentFundTransaction() {
		return investmentFundTransaction;
	}

	public void setInvestmentFundTransaction(List<com.tools20022.repository.entity.InvestmentFundTransaction> investmentFundTransaction) {
		this.investmentFundTransaction = investmentFundTransaction;
	}

	public List<SidePocket> getSidePocket() {
		return sidePocket;
	}

	public void setSidePocket(List<com.tools20022.repository.entity.SidePocket> sidePocket) {
		this.sidePocket = sidePocket;
	}

	public List<InvestmentAccountPartyRole> getInvestmentAccountPartyRole() {
		return investmentAccountPartyRole;
	}

	public void setInvestmentAccountPartyRole(List<com.tools20022.repository.entity.InvestmentAccountPartyRole> investmentAccountPartyRole) {
		this.investmentAccountPartyRole = investmentAccountPartyRole;
	}

	public PortfolioTransfer getDebitPortfolioTransfer() {
		return debitPortfolioTransfer;
	}

	public void setDebitPortfolioTransfer(com.tools20022.repository.entity.PortfolioTransfer debitPortfolioTransfer) {
		this.debitPortfolioTransfer = debitPortfolioTransfer;
	}

	public PortfolioTransfer getCreditPortfolioTransfer() {
		return creditPortfolioTransfer;
	}

	public void setCreditPortfolioTransfer(com.tools20022.repository.entity.PortfolioTransfer creditPortfolioTransfer) {
		this.creditPortfolioTransfer = creditPortfolioTransfer;
	}

	public FundOrderDesk getAccountForInvestmentFundProcessing() {
		return accountForInvestmentFundProcessing;
	}

	public void setAccountForInvestmentFundProcessing(com.tools20022.repository.entity.FundOrderDesk accountForInvestmentFundProcessing) {
		this.accountForInvestmentFundProcessing = accountForInvestmentFundProcessing;
	}

	public InvestmentAccountContract getInvestmentAccountContract() {
		return investmentAccountContract;
	}

	public void setInvestmentAccountContract(com.tools20022.repository.entity.InvestmentAccountContract investmentAccountContract) {
		this.investmentAccountContract = investmentAccountContract;
	}

	public AccountUsageTypeCode getAccountUsageType() {
		return accountUsageType;
	}

	public void setAccountUsageType(AccountUsageTypeCode accountUsageType) {
		this.accountUsageType = accountUsageType;
	}

	public InvestmentAccountCategoryCode getCategory() {
		return category;
	}

	public void setCategory(InvestmentAccountCategoryCode category) {
		this.category = category;
	}

	public Portfolio getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(com.tools20022.repository.entity.Portfolio portfolio) {
		this.portfolio = portfolio;
	}

	public PortfolioTransfer getRelatedPortfolioTransfer() {
		return relatedPortfolioTransfer;
	}

	public void setRelatedPortfolioTransfer(com.tools20022.repository.entity.PortfolioTransfer relatedPortfolioTransfer) {
		this.relatedPortfolioTransfer = relatedPortfolioTransfer;
	}
}