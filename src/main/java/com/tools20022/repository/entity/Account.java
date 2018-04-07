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
import com.tools20022.repository.choice.AccountSelection2Choice;
import com.tools20022.repository.choice.BalanceType7Choice;
import com.tools20022.repository.choice.CollateralAccountIdentificationType2Choice;
import com.tools20022.repository.choice.CollateralAccountIdentificationType3Choice;
import com.tools20022.repository.codeset.CollateralAccountTypeCode;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Record of transactions in specific types of assets, maintained by a servicing
 * party on behalf of one or more owning parties. Business relationship between
 * an account servicer and one or more account owners.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Account" src="doc-files/Account.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmBaseCurrency
 * Account.mmBaseCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmIdentification
 * Account.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmParentAccount
 * Account.mmParentAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmSubAccount
 * Account.mmSubAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmRelatedFundProcessingCharacteristics
 * Account.mmRelatedFundProcessingCharacteristics}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmStatus
 * Account.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmLanguage
 * Account.mmLanguage}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmPartyRole
 * Account.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmTradePartyRole
 * Account.mmTradePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmReportingCurrency
 * Account.mmReportingCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmAccountRestriction
 * Account.mmAccountRestriction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmSettlementPartyRole
 * Account.mmSettlementPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmPurpose
 * Account.mmPurpose}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmClosingDate
 * Account.mmClosingDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmLiveDate
 * Account.mmLiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmReportedPeriod
 * Account.mmReportedPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmInvestmentFundPartyRole
 * Account.mmInvestmentFundPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmRelatedCollateralProcess
 * Account.mmRelatedCollateralProcess}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmType
 * Account.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmRelatedProceedsDelivery
 * Account.mmRelatedProceedsDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmRelatedCorporateActionPartyRole
 * Account.mmRelatedCorporateActionPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmDefaultFundAccountOwner
 * Account.mmDefaultFundAccountOwner}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmSystem
 * Account.mmSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmBalance
 * Account.mmBalance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmEntry
 * Account.mmEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmAccountContract
 * Account.mmAccountContract}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmOpeningDate
 * Account.mmOpeningDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmCurrencyExchange
 * Account.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmDefaultFundContribution
 * Account.mmDefaultFundContribution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmSystemMember
 * Account.mmSystemMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmCollateralAccountType
 * Account.mmCollateralAccountType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmAccountService
 * Account.mmAccountService}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmReconciliation
 * Account.mmReconciliation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmManagedAccountProduct
 * Account.mmManagedAccountProduct}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmAccount
 * GenericIdentification.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmSettlementAccount
 * InvestmentFundClassProcessingCharacteristics.mmSettlementAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmParentAccount
 * Account.mmParentAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmSubAccount
 * Account.mmSubAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmAccount
 * AccountIdentification.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#mmAccount
 * DateTimePeriod.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountPartyRole#mmAccount
 * AccountPartyRole.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountService#mmAccount
 * AccountService.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountStatus#mmAccount
 * AccountStatus.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountContract#mmAccount
 * AccountContract.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#mmAccount
 * Entry.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundPartyRole#mmAccount
 * InvestmentFundPartyRole.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradePartyRole#mmAccount
 * TradePartyRole.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmAccount
 * System.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemMemberRole#mmAccount
 * SystemMemberRole.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmDefaultFundAccount
 * ClearingMemberRole.mmDefaultFundAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#mmAccount
 * Balance.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SettlementPartyRole#mmSettlementAccount
 * SettlementPartyRole.mmSettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountRestriction#mmAccount
 * AccountRestriction.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmReportedAccount
 * CurrencyExchange.mmReportedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralAccount
 * Collateral.mmCollateralAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmSettlementAccount
 * CorporateActionProceedsDeliveryInstruction.mmSettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPartyRole#mmAccount
 * CorporateActionPartyRole.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#mmContributionAccount
 * DefaultFundContribution.mmContributionAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Reconciliation#mmAccount
 * Reconciliation.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ManagedAccountProduct#mmAccount
 * ManagedAccountProduct.mmAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccount1#mmCharacteristic
 * SubAccount1.mmCharacteristic}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccount4#mmCharacteristic
 * SubAccount4.mmCharacteristic}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccount5#mmCharacteristic
 * SubAccount5.mmCharacteristic}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccount6#mmCharacteristic
 * SubAccount6.mmCharacteristic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Account23#mmRelatedAccountDetails
 * Account23.mmRelatedAccountDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesAccount
 * SecuritiesAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentAccount
 * InvestmentAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Account7 Account7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccount1 SubAccount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccount2 SubAccount2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccount4 SubAccount4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account18 Account18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccount5 SubAccount5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account20 Account20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralAccount2
 * CollateralAccount2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralAccountIdentificationType2Choice
 * CollateralAccountIdentificationType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccount6 SubAccount6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account23 Account23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account22 Account22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralAccount3
 * CollateralAccount3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralAccountIdentificationType3Choice
 * CollateralAccountIdentificationType3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account25 Account25}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = ISO15022Synonym: :11A::ACCT</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Account"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Record of transactions in specific types of assets, maintained by a servicing party on behalf of one or more owning parties. Business relationship between an account servicer and one or more account owners."
 * </li>
 * </ul>
 */
public class Account {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyCode baseCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount22#mmCurrency
	 * CashAccount22.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount17#mmPaymentCurrency
	 * CashAccount17.mmPaymentCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount21#mmBaseCurrency
	 * SecuritiesAccount21.mmBaseCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Base currency of the account."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Account, CurrencyCode> mmBaseCurrency = new MMBusinessAttribute<Account, CurrencyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CashAccount22.mmCurrency, CashAccount17.mmPaymentCurrency, SecuritiesAccount21.mmBaseCurrency);
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BaseCurrency";
			definition = "Base currency of the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(Account obj) {
			return obj.getBaseCurrency();
		}

		@Override
		public void setValue(Account obj, CurrencyCode value) {
			obj.setBaseCurrency(value);
		}
	};
	protected AccountIdentification identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmAccount
	 * AccountIdentification.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount21#mmIdentification
	 * CashAccount21.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount22#mmIdentification
	 * CashAccount22.mmIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account7#mmIdentification
	 * Account7.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccount1#mmIdentification
	 * SubAccount1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount2#mmIdentification
	 * SafekeepingAccount2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount79#mmCashAccount
	 * PartyIdentificationAndAccount79.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount83#mmCashAccount
	 * PartyIdentificationAndAccount83.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount20#mmIdentification
	 * SecuritiesAccount20.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails3#mmCashDetails
	 * ConfirmationPartyDetails3.mmCashDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails6#mmCashDetails
	 * ConfirmationPartyDetails6.mmCashDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount80#mmCashAccount
	 * PartyIdentificationAndAccount80.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount80#mmChargesAccount
	 * PartyIdentificationAndAccount80.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount80#mmCommissionAccount
	 * PartyIdentificationAndAccount80.mmCommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount80#mmTaxAccount
	 * PartyIdentificationAndAccount80.mmTaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountingStatementOfHoldings2#mmSubAccountDetails
	 * AccountingStatementOfHoldings2.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings2#mmSubAccountDetails
	 * CustodyStatementOfHoldings2.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccount2#mmIdentification
	 * SubAccount2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmAgentSecuritiesAccountIdentification
	 * CorporateActionOption1.mmAgentSecuritiesAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmAgentCashAccountIdentification
	 * CorporateActionOption1.mmAgentCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount19#mmAccountIdentification
	 * CashAccount19.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProceedsDelivery1#mmCashAccountIdentification
	 * ProceedsDelivery1.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount18#mmAccountIdentification
	 * CashAccount18.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementFailedStatus1#mmAgentAccountIdentification
	 * CorporateActionMovementFailedStatus1.mmAgentAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementFailedStatus1#mmClientAccountIdentification
	 * CorporateActionMovementFailedStatus1.mmClientAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IncludedAccount1#mmSecuritiesAccountIdentification
	 * IncludedAccount1.mmSecuritiesAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount17#mmAccountIdentification
	 * CashAccount17.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount21#mmAccount
	 * SecuritiesAccount21.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType7Choice#mmAccount
	 * BalanceType7Choice.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount19#mmIdentification
	 * SecuritiesAccount19.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount18#mmIdentification
	 * SecuritiesAccount18.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount32#mmAccountIdentification
	 * PartyIdentificationAndAccount32.mmAccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Contribution1#mmAccount
	 * Contribution1.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DefaultFund1#mmDefaultFundAccount
	 * DefaultFund1.mmDefaultFundAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount97#mmAccountIdentification
	 * PartyIdentificationAndAccount97.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount96#mmAccountIdentification
	 * PartyIdentificationAndAccount96.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount43#mmIdentification
	 * InvestmentAccount43.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3#mmSubAccountDetails
	 * StatementOfInvestmentFundTransactions3.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount42#mmAccountIdentification
	 * InvestmentAccount42.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral3#mmCashAccountIdentification
	 * CashCollateral3.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral2#mmCashAccountIdentification
	 * CashCollateral2.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus10#mmAccountIdentification
	 * DetailedInstructionStatus10.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus10#mmSubAccountIdentification
	 * DetailedInstructionStatus10.mmSubAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition5#mmAccountIdentification
	 * EligiblePosition5.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition6#mmAccountIdentification
	 * EligiblePosition6.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount102#mmAccountIdentification
	 * PartyIdentificationAndAccount102.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccount4#mmIdentification
	 * SubAccount4.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral5#mmCashAccountIdentification
	 * CashCollateral5.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount40#mmCashAccount
	 * QuantityAndAccount40.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount38#mmCashAccount
	 * QuantityAndAccount38.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112#mmCashAccount
	 * PartyIdentificationAndAccount112.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112#mmChargesAccount
	 * PartyIdentificationAndAccount112.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112#mmCommissionAccount
	 * PartyIdentificationAndAccount112.mmCommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112#mmTaxAccount
	 * PartyIdentificationAndAccount112.mmTaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount111#mmCashAccount
	 * PartyIdentificationAndAccount111.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount111#mmChargesAccount
	 * PartyIdentificationAndAccount111.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount111#mmCommissionAccount
	 * PartyIdentificationAndAccount111.mmCommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount111#mmTaxAccount
	 * PartyIdentificationAndAccount111.mmTaxAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account18#mmIdentification
	 * Account18.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount120#mmCashAccount
	 * PartyIdentificationAndAccount120.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount121#mmCashAccount
	 * PartyIdentificationAndAccount121.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccount5#mmIdentification
	 * SubAccount5.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmDebtorAccount
	 * DirectDebitMandate5.mmDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount53#mmAccountIdentification
	 * InvestmentAccount53.mmAccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account20#mmIdentification
	 * Account20.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount33#mmIdentification
	 * CashAccount33.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralAccount2#mmIdentification
	 * CollateralAccount2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#mmCollateralAccountIdentification
	 * InterestCalculation4.mmCollateralAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount126#mmAccountIdentification
	 * PartyIdentificationAndAccount126.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmIdentification
	 * InvestmentAccount61.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountSelection2Choice#mmAccountIdentification
	 * AccountSelection2Choice.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5#mmExistingAccountIdentification
	 * AccountManagementStatusAndReason5.mmExistingAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5#mmAccountIdentification
	 * AccountManagementStatusAndReason5.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmIdentification
	 * InvestmentAccount62.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15#mmAccountIdentification
	 * AccountSubLevel15.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel16#mmAccountIdentification
	 * AccountSubLevel16.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount58#mmAccountIdentification
	 * InvestmentAccount58.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18#mmAccountIdentification
	 * AccountSubLevel18.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel19#mmAccountIdentification
	 * AccountSubLevel19.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccount6#mmIdentification
	 * SubAccount6.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel11#mmAccountIdentification
	 * AccountSubLevel11.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel12#mmAccountIdentification
	 * AccountSubLevel12.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount147#mmAccountIdentification
	 * PartyIdentificationAndAccount147.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Account23#mmAccountIdentification
	 * Account23.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel17#mmAccountIdentification
	 * AccountSubLevel17.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13#mmAccountIdentification
	 * AccountSubLevel13.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel14#mmAccountIdentification
	 * AccountSubLevel14.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer8#mmCreditorAgentAccount
	 * CreditTransfer8.mmCreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount60#mmAccountIdentification
	 * InvestmentAccount60.mmAccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account22#mmIdentification
	 * Account22.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate6#mmDebtorAccount
	 * DirectDebitMandate6.mmDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse2#mmCashAccountIdentification
	 * CashCollateralResponse2.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralAccount3#mmIdentification
	 * CollateralAccount3.mmIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account24#mmIdentification
	 * Account24.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount201#mmIdentification
	 * CashAccount201.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount66#mmAccountIdentification
	 * InvestmentAccount66.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67#mmAccountIdentification
	 * InvestmentAccount67.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount157#mmAccountIdentification
	 * PartyIdentificationAndAccount157.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount65#mmAccountIdentification
	 * InvestmentAccount65.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount156#mmAccountIdentification
	 * PartyIdentificationAndAccount156.mmAccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account25#mmIdentification
	 * Account25.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount158#mmAccountIdentification
	 * PartyIdentificationAndAccount158.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount68#mmAccountIdentification
	 * InvestmentAccount68.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount64#mmCashAccount
	 * QuantityAndAccount64.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount63#mmCashAccount
	 * QuantityAndAccount63.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount65#mmCashAccount
	 * QuantityAndAccount65.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount66#mmCashAccount
	 * QuantityAndAccount66.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount67#mmCashAccount
	 * QuantityAndAccount67.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount68#mmCashAccount
	 * QuantityAndAccount68.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption56#mmCashAccountIdentification
	 * CashOption56.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption57#mmCashAccountIdentification
	 * CashOption57.mmCashAccountIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Account, AccountIdentification> mmIdentification = new MMBusinessAssociationEnd<Account, AccountIdentification>() {
		{
			derivation_lazy = () -> Arrays.asList(CashAccount21.mmIdentification, CashAccount22.mmIdentification, Account7.mmIdentification, SubAccount1.mmIdentification, SafekeepingAccount2.mmIdentification,
					PartyIdentificationAndAccount79.mmCashAccount, PartyIdentificationAndAccount83.mmCashAccount, SecuritiesAccount20.mmIdentification, ConfirmationPartyDetails3.mmCashDetails, ConfirmationPartyDetails6.mmCashDetails,
					PartyIdentificationAndAccount80.mmCashAccount, PartyIdentificationAndAccount80.mmChargesAccount, PartyIdentificationAndAccount80.mmCommissionAccount, PartyIdentificationAndAccount80.mmTaxAccount,
					AccountingStatementOfHoldings2.mmSubAccountDetails, CustodyStatementOfHoldings2.mmSubAccountDetails, SubAccount2.mmIdentification, CorporateActionOption1.mmAgentSecuritiesAccountIdentification,
					CorporateActionOption1.mmAgentCashAccountIdentification, CashAccount19.mmAccountIdentification, ProceedsDelivery1.mmCashAccountIdentification, CashAccount18.mmAccountIdentification,
					CorporateActionMovementFailedStatus1.mmAgentAccountIdentification, CorporateActionMovementFailedStatus1.mmClientAccountIdentification, IncludedAccount1.mmSecuritiesAccountIdentification,
					CashAccount17.mmAccountIdentification, SecuritiesAccount21.mmAccount, BalanceType7Choice.mmAccount, SecuritiesAccount19.mmIdentification, SecuritiesAccount18.mmIdentification,
					PartyIdentificationAndAccount32.mmAccountIdentification, Contribution1.mmAccount, DefaultFund1.mmDefaultFundAccount, PartyIdentificationAndAccount97.mmAccountIdentification,
					PartyIdentificationAndAccount96.mmAccountIdentification, InvestmentAccount43.mmIdentification, StatementOfInvestmentFundTransactions3.mmSubAccountDetails, InvestmentAccount42.mmAccountIdentification,
					CashCollateral3.mmCashAccountIdentification, CashCollateral2.mmCashAccountIdentification, DetailedInstructionStatus10.mmAccountIdentification, DetailedInstructionStatus10.mmSubAccountIdentification,
					EligiblePosition5.mmAccountIdentification, EligiblePosition6.mmAccountIdentification, PartyIdentificationAndAccount102.mmAccountIdentification, SubAccount4.mmIdentification, CashCollateral5.mmCashAccountIdentification,
					QuantityAndAccount40.mmCashAccount, QuantityAndAccount38.mmCashAccount, PartyIdentificationAndAccount112.mmCashAccount, PartyIdentificationAndAccount112.mmChargesAccount,
					PartyIdentificationAndAccount112.mmCommissionAccount, PartyIdentificationAndAccount112.mmTaxAccount, PartyIdentificationAndAccount111.mmCashAccount, PartyIdentificationAndAccount111.mmChargesAccount,
					PartyIdentificationAndAccount111.mmCommissionAccount, PartyIdentificationAndAccount111.mmTaxAccount, Account18.mmIdentification, PartyIdentificationAndAccount120.mmCashAccount,
					PartyIdentificationAndAccount121.mmCashAccount, SubAccount5.mmIdentification, DirectDebitMandate5.mmDebtorAccount, InvestmentAccount53.mmAccountIdentification, Account20.mmIdentification, CashAccount33.mmIdentification,
					CollateralAccount2.mmIdentification, InterestCalculation4.mmCollateralAccountIdentification, PartyIdentificationAndAccount126.mmAccountIdentification, InvestmentAccount61.mmIdentification,
					AccountSelection2Choice.mmAccountIdentification, AccountManagementStatusAndReason5.mmExistingAccountIdentification, AccountManagementStatusAndReason5.mmAccountIdentification, InvestmentAccount62.mmIdentification,
					AccountSubLevel15.mmAccountIdentification, AccountSubLevel16.mmAccountIdentification, InvestmentAccount58.mmAccountIdentification, AccountSubLevel18.mmAccountIdentification, AccountSubLevel19.mmAccountIdentification,
					SubAccount6.mmIdentification, AccountSubLevel11.mmAccountIdentification, AccountSubLevel12.mmAccountIdentification, PartyIdentificationAndAccount147.mmAccountIdentification, Account23.mmAccountIdentification,
					AccountSubLevel17.mmAccountIdentification, AccountSubLevel13.mmAccountIdentification, AccountSubLevel14.mmAccountIdentification, CreditTransfer8.mmCreditorAgentAccount, InvestmentAccount60.mmAccountIdentification,
					Account22.mmIdentification, DirectDebitMandate6.mmDebtorAccount, CashCollateralResponse2.mmCashAccountIdentification, CollateralAccount3.mmIdentification, Account24.mmIdentification, CashAccount201.mmIdentification,
					InvestmentAccount66.mmAccountIdentification, InvestmentAccount67.mmAccountIdentification, PartyIdentificationAndAccount157.mmAccountIdentification, InvestmentAccount65.mmAccountIdentification,
					PartyIdentificationAndAccount156.mmAccountIdentification, Account25.mmIdentification, PartyIdentificationAndAccount158.mmAccountIdentification, InvestmentAccount68.mmAccountIdentification,
					QuantityAndAccount64.mmCashAccount, QuantityAndAccount63.mmCashAccount, QuantityAndAccount65.mmCashAccount, QuantityAndAccount66.mmCashAccount, QuantityAndAccount67.mmCashAccount, QuantityAndAccount68.mmCashAccount,
					CashOption56.mmCashAccountIdentification, CashOption57.mmCashAccountIdentification);
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> AccountIdentification.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AccountIdentification.mmObject();
		}

		@Override
		public AccountIdentification getValue(Account obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(Account obj, AccountIdentification value) {
			obj.setIdentification(value);
		}
	};
	protected Account parentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmSubAccount
	 * Account.mmSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account for which one or more sub-accounts are specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Account, Account> mmParentAccount = new MMBusinessAssociationEnd<Account, Account>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ParentAccount";
			definition = "Account for which one or more sub-accounts are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Account.mmSubAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Account.mmObject();
		}

		@Override
		public Account getValue(Account obj) {
			return obj.getParentAccount();
		}

		@Override
		public void setValue(Account obj, Account value) {
			obj.setParentAccount(value);
		}
	};
	protected List<Account> subAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmParentAccount
	 * Account.mmParentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount22#mmSecondaryAccount
	 * CashAccount22.mmSecondaryAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount32#mmSubAccountDetails
	 * PartyIdentificationAndAccount32.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount6#mmSubAccountDetails
	 * SafekeepingAccount6.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount102#mmSubAccount
	 * PartyIdentificationAndAccount102.mmSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount126#mmSubAccount
	 * PartyIdentificationAndAccount126.mmSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmSubAccountForHolding
	 * RedemptionOrder14.mmSubAccountForHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount58#mmSubAccountDetails
	 * InvestmentAccount58.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmSubAccountForHolding
	 * SubscriptionExecution13.mmSubAccountForHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmSubAccountForHolding
	 * SubscriptionOrder14.mmSubAccountForHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmSubAccountForHolding
	 * RedemptionExecution15.mmSubAccountForHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount66#mmSubAccountDetails
	 * InvestmentAccount66.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67#mmSubAccountDetails
	 * InvestmentAccount67.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount65#mmSubAccountDetails
	 * InvestmentAccount65.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount158#mmSubAccountDetails
	 * PartyIdentificationAndAccount158.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount68#mmSubAccountDetails
	 * InvestmentAccount68.mmSubAccountDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Subdivision of an account used to segregate specific holdings."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Account, List<Account>> mmSubAccount = new MMBusinessAssociationEnd<Account, List<Account>>() {
		{
			derivation_lazy = () -> Arrays.asList(CashAccount22.mmSecondaryAccount, PartyIdentificationAndAccount32.mmSubAccountDetails, SafekeepingAccount6.mmSubAccountDetails, PartyIdentificationAndAccount102.mmSubAccount,
					PartyIdentificationAndAccount126.mmSubAccount, RedemptionOrder14.mmSubAccountForHolding, InvestmentAccount58.mmSubAccountDetails, SubscriptionExecution13.mmSubAccountForHolding,
					SubscriptionOrder14.mmSubAccountForHolding, RedemptionExecution15.mmSubAccountForHolding, InvestmentAccount66.mmSubAccountDetails, InvestmentAccount67.mmSubAccountDetails, InvestmentAccount65.mmSubAccountDetails,
					PartyIdentificationAndAccount158.mmSubAccountDetails, InvestmentAccount68.mmSubAccountDetails);
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubAccount";
			definition = "Subdivision of an account used to segregate specific holdings.";
			minOccurs = 0;
			opposite_lazy = () -> Account.mmParentAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Account.mmObject();
		}

		@Override
		public List<Account> getValue(Account obj) {
			return obj.getSubAccount();
		}

		@Override
		public void setValue(Account obj, List<Account> value) {
			obj.setSubAccount(value);
		}
	};
	protected InvestmentFundClassProcessingCharacteristics relatedFundProcessingCharacteristics;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmSettlementAccount
	 * InvestmentFundClassProcessingCharacteristics.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedFundProcessingCharacteristics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fund processing characteristics for which a settlement account is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Account, InvestmentFundClassProcessingCharacteristics> mmRelatedFundProcessingCharacteristics = new MMBusinessAssociationEnd<Account, InvestmentFundClassProcessingCharacteristics>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedFundProcessingCharacteristics";
			definition = "Fund processing characteristics for which a settlement account is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmSettlementAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
		}

		@Override
		public InvestmentFundClassProcessingCharacteristics getValue(Account obj) {
			return obj.getRelatedFundProcessingCharacteristics();
		}

		@Override
		public void setValue(Account obj, InvestmentFundClassProcessingCharacteristics value) {
			obj.setRelatedFundProcessingCharacteristics(value);
		}
	};
	protected AccountStatus status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus#mmAccount
	 * AccountStatus.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountStatus
	 * AccountStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmBlockedStatus
	 * InvestmentAccount61.mmBlockedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5#mmAccountStatus
	 * AccountManagementStatusAndReason5.mmAccountStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5#mmBlockedStatus
	 * AccountManagementStatusAndReason5.mmBlockedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmBlockedStatus
	 * InvestmentAccount63.mmBlockedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmAccountStatus
	 * InvestmentAccount62.mmAccountStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmBlockedStatus
	 * InvestmentAccount62.mmBlockedStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the current state of an account, eg, enabled or deleted."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Account, AccountStatus> mmStatus = new MMBusinessAssociationEnd<Account, AccountStatus>() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentAccount61.mmBlockedStatus, AccountManagementStatusAndReason5.mmAccountStatus, AccountManagementStatusAndReason5.mmBlockedStatus, InvestmentAccount63.mmBlockedStatus,
					InvestmentAccount62.mmAccountStatus, InvestmentAccount62.mmBlockedStatus);
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Specifies the current state of an account, eg, enabled or deleted.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> AccountStatus.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AccountStatus.mmObject();
		}

		@Override
		public AccountStatus getValue(Account obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(Account obj, AccountStatus value) {
			obj.setStatus(value);
		}
	};
	protected LanguageCode language;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.LanguageCode
	 * LanguageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmLanguage
	 * InvestmentAccount61.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmLanguage
	 * InvestmentAccount63.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmLanguage
	 * InvestmentAccount62.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmLanguage
	 * InvestmentAccountOwnershipInformation15.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmLanguage
	 * InvestmentAccountOwnershipInformation14.mmLanguage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Language"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Language for all communication concerning the account."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Account, LanguageCode> mmLanguage = new MMBusinessAttribute<Account, LanguageCode>() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentAccount61.mmLanguage, InvestmentAccount63.mmLanguage, InvestmentAccount62.mmLanguage, InvestmentAccountOwnershipInformation15.mmLanguage,
					InvestmentAccountOwnershipInformation14.mmLanguage);
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Language";
			definition = "Language for all communication concerning the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}

		@Override
		public LanguageCode getValue(Account obj) {
			return obj.getLanguage();
		}

		@Override
		public void setValue(Account obj, LanguageCode value) {
			obj.setLanguage(value);
		}
	};
	protected List<AccountPartyRole> partyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountPartyRole#mmAccount
	 * AccountPartyRole.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountPartyRole
	 * AccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to an account and played by a party in that context."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Account, List<AccountPartyRole>> mmPartyRole = new MMBusinessAssociationEnd<Account, List<AccountPartyRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to an account and played by a party in that context.";
			minOccurs = 0;
			opposite_lazy = () -> AccountPartyRole.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AccountPartyRole.mmObject();
		}

		@Override
		public List<AccountPartyRole> getValue(Account obj) {
			return obj.getPartyRole();
		}

		@Override
		public void setValue(Account obj, List<AccountPartyRole> value) {
			obj.setPartyRole(value);
		}
	};
	protected TradePartyRole tradePartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole#mmAccount
	 * TradePartyRole.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradePartyRole
	 * TradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradePartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party for which an account is specified in the context of a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Account, TradePartyRole> mmTradePartyRole = new MMBusinessAssociationEnd<Account, TradePartyRole>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradePartyRole";
			definition = "Party for which an account is specified in the context of a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> TradePartyRole.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TradePartyRole.mmObject();
		}

		@Override
		public TradePartyRole getValue(Account obj) {
			return obj.getTradePartyRole();
		}

		@Override
		public void setValue(Account obj, TradePartyRole value) {
			obj.setTradePartyRole(value);
		}
	};
	protected CurrencyCode reportingCurrency;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount21#mmReportingCurrency
	 * SecuritiesAccount21.mmReportingCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :11A::ACCT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency used to calculate and report the balance and related entries of an account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Account, CurrencyCode> mmReportingCurrency = new MMBusinessAttribute<Account, CurrencyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesAccount21.mmReportingCurrency);
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":11A::ACCT"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReportingCurrency";
			definition = "Currency used to calculate and report the balance and related entries of an account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(Account obj) {
			return obj.getReportingCurrency();
		}

		@Override
		public void setValue(Account obj, CurrencyCode value) {
			obj.setReportingCurrency(value);
		}
	};
	protected List<AccountRestriction> accountRestriction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountRestriction#mmAccount
	 * AccountRestriction.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountRestriction
	 * AccountRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountRestriction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Restriction on capability or operations allowed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Account, List<AccountRestriction>> mmAccountRestriction = new MMBusinessAssociationEnd<Account, List<AccountRestriction>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountRestriction";
			definition = "Restriction on capability or operations allowed.";
			minOccurs = 0;
			opposite_lazy = () -> AccountRestriction.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AccountRestriction.mmObject();
		}

		@Override
		public List<AccountRestriction> getValue(Account obj) {
			return obj.getAccountRestriction();
		}

		@Override
		public void setValue(Account obj, List<AccountRestriction> value) {
			obj.setAccountRestriction(value);
		}
	};
	protected SettlementPartyRole settlementPartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SettlementPartyRole#mmSettlementAccount
	 * SettlementPartyRole.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SettlementPartyRole
	 * SettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the role of the party which uses the account for settlement."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Account, SettlementPartyRole> mmSettlementPartyRole = new MMBusinessAssociationEnd<Account, SettlementPartyRole>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementPartyRole";
			definition = "Specifies the role of the party which uses the account for settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SettlementPartyRole.mmSettlementAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SettlementPartyRole.mmObject();
		}

		@Override
		public SettlementPartyRole getValue(Account obj) {
			return obj.getSettlementPartyRole();
		}

		@Override
		public void setValue(Account obj, SettlementPartyRole value) {
			obj.setSettlementPartyRole(value);
		}
	};
	protected Max140Text purpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the purpose of the account."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Account, Max140Text> mmPurpose = new MMBusinessAttribute<Account, Max140Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Specifies the purpose of the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(Account obj) {
			return obj.getPurpose();
		}

		@Override
		public void setValue(Account obj, Max140Text value) {
			obj.setPurpose(value);
		}
	};
	protected ISODateTime closingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmClosingDate
	 * InvestmentAccount61.mmClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmClosingDate
	 * InvestmentAccount63.mmClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmClosingDate
	 * InvestmentAccount62.mmClosingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the account and related services cease effectively to be operational for the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Account, Optional<ISODateTime>> mmClosingDate = new MMBusinessAttribute<Account, Optional<ISODateTime>>() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentAccount61.mmClosingDate, InvestmentAccount63.mmClosingDate, InvestmentAccount62.mmClosingDate);
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClosingDate";
			definition = "Date on which the account and related services cease effectively to be operational for the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(Account obj) {
			return obj.getClosingDate();
		}

		@Override
		public void setValue(Account obj, Optional<ISODateTime> value) {
			obj.setClosingDate(value.orElse(null));
		}
	};
	protected ISODateTime liveDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the first movement on the account."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Account, ISODateTime> mmLiveDate = new MMBusinessAttribute<Account, ISODateTime>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LiveDate";
			definition = "Date of the first movement on the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Account obj) {
			return obj.getLiveDate();
		}

		@Override
		public void setValue(Account obj, ISODateTime value) {
			obj.setLiveDate(value);
		}
	};
	protected DateTimePeriod reportedPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmAccount
	 * DateTimePeriod.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportedPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the period for which the movements in the account are reported."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Account, DateTimePeriod> mmReportedPeriod = new MMBusinessAssociationEnd<Account, DateTimePeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReportedPeriod";
			definition = "Specifies the period for which the movements in the account are reported.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(Account obj) {
			return obj.getReportedPeriod();
		}

		@Override
		public void setValue(Account obj, DateTimePeriod value) {
			obj.setReportedPeriod(value);
		}
	};
	protected InvestmentFundPartyRole investmentFundPartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundPartyRole#mmAccount
	 * InvestmentFundPartyRole.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundPartyRole
	 * InvestmentFundPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party role for which an account is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Account, InvestmentFundPartyRole> mmInvestmentFundPartyRole = new MMBusinessAssociationEnd<Account, InvestmentFundPartyRole>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundPartyRole";
			definition = "Party role for which an account is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> InvestmentFundPartyRole.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestmentFundPartyRole.mmObject();
		}

		@Override
		public InvestmentFundPartyRole getValue(Account obj) {
			return obj.getInvestmentFundPartyRole();
		}

		@Override
		public void setValue(Account obj, InvestmentFundPartyRole value) {
			obj.setInvestmentFundPartyRole(value);
		}
	};
	protected Collateral relatedCollateralProcess;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralAccount
	 * Collateral.mmCollateralAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Collateral
	 * Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCollateralProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral data for which a collateral account is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Account, Optional<Collateral>> mmRelatedCollateralProcess = new MMBusinessAssociationEnd<Account, Optional<Collateral>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCollateralProcess";
			definition = "Collateral data for which a collateral account is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Collateral.mmCollateralAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Collateral.mmObject();
		}

		@Override
		public Optional<Collateral> getValue(Account obj) {
			return obj.getRelatedCollateralProcess();
		}

		@Override
		public void setValue(Account obj, Optional<Collateral> value) {
			obj.setRelatedCollateralProcess(value.orElse(null));
		}
	};
	protected GenericIdentification type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmAccount
	 * GenericIdentification.mmAccount}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification5#mmType
	 * AccountIdentification5.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Account, GenericIdentification> mmType = new MMBusinessAssociationEnd<Account, GenericIdentification>() {
		{
			derivation_lazy = () -> Arrays.asList(AccountIdentification5.mmType);
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> GenericIdentification.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}

		@Override
		public GenericIdentification getValue(Account obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Account obj, GenericIdentification value) {
			obj.setType(value);
		}
	};
	protected CorporateActionProceedsDeliveryInstruction relatedProceedsDelivery;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmSettlementAccount
	 * CorporateActionProceedsDeliveryInstruction.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction
	 * CorporateActionProceedsDeliveryInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedProceedsDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proceeds delivery instruction which contain account identification."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Account, CorporateActionProceedsDeliveryInstruction> mmRelatedProceedsDelivery = new MMBusinessAssociationEnd<Account, CorporateActionProceedsDeliveryInstruction>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedProceedsDelivery";
			definition = "Proceeds delivery instruction which contain account identification.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmSettlementAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmObject();
		}

		@Override
		public CorporateActionProceedsDeliveryInstruction getValue(Account obj) {
			return obj.getRelatedProceedsDelivery();
		}

		@Override
		public void setValue(Account obj, CorporateActionProceedsDeliveryInstruction value) {
			obj.setRelatedProceedsDelivery(value);
		}
	};
	protected CorporateActionPartyRole relatedCorporateActionPartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPartyRole#mmAccount
	 * CorporateActionPartyRole.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPartyRole
	 * CorporateActionPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateActionPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party for which an account is specified in the context of a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Account, CorporateActionPartyRole> mmRelatedCorporateActionPartyRole = new MMBusinessAssociationEnd<Account, CorporateActionPartyRole>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionPartyRole";
			definition = "Party for which an account is specified in the context of a corporate action.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CorporateActionPartyRole.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionPartyRole.mmObject();
		}

		@Override
		public CorporateActionPartyRole getValue(Account obj) {
			return obj.getRelatedCorporateActionPartyRole();
		}

		@Override
		public void setValue(Account obj, CorporateActionPartyRole value) {
			obj.setRelatedCorporateActionPartyRole(value);
		}
	};
	protected ClearingMemberRole defaultFundAccountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmDefaultFundAccount
	 * ClearingMemberRole.mmDefaultFundAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultFundAccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Clearing member which holds a default fund account at an ICSD or at the central bank."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Account, Optional<ClearingMemberRole>> mmDefaultFundAccountOwner = new MMBusinessAssociationEnd<Account, Optional<ClearingMemberRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DefaultFundAccountOwner";
			definition = "Clearing member which holds a default fund account at an ICSD or at the central bank.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ClearingMemberRole.mmDefaultFundAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ClearingMemberRole.mmObject();
		}

		@Override
		public Optional<ClearingMemberRole> getValue(Account obj) {
			return obj.getDefaultFundAccountOwner();
		}

		@Override
		public void setValue(Account obj, Optional<ClearingMemberRole> value) {
			obj.setDefaultFundAccountOwner(value.orElse(null));
		}
	};
	protected List<System> system;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.System#mmAccount
	 * System.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.System System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "System"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "System where the account is held."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Account, List<System>> mmSystem = new MMBusinessAssociationEnd<Account, List<System>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System where the account is held.";
			minOccurs = 0;
			opposite_lazy = () -> System.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> System.mmObject();
		}

		@Override
		public List<System> getValue(Account obj) {
			return obj.getSystem();
		}

		@Override
		public void setValue(Account obj, List<System> value) {
			obj.setSystem(value);
		}
	};
	protected List<Balance> balance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmAccount
	 * Balance.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Balance Balance}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification3#mmBalanceForSubAccount
	 * SubAccountIdentification3.mmBalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification5#mmBalanceForSubAccount
	 * SubAccountIdentification5.mmBalanceForSubAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Overall position representing the net debits and credits in an account at a specific point in time."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Account, List<Balance>> mmBalance = new MMBusinessAssociationEnd<Account, List<Balance>>() {
		{
			derivation_lazy = () -> Arrays.asList(SubAccountIdentification3.mmBalanceForSubAccount, SubAccountIdentification5.mmBalanceForSubAccount);
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Balance";
			definition = "Overall position representing the net debits and credits in an account at a specific point in time.";
			minOccurs = 1;
			opposite_lazy = () -> Balance.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Balance.mmObject();
		}

		@Override
		public List<Balance> getValue(Account obj) {
			return obj.getBalance();
		}

		@Override
		public void setValue(Account obj, List<Balance> value) {
			obj.setBalance(value);
		}
	};
	protected List<Entry> entry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Entry#mmAccount
	 * Entry.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Entry Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Entry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Record of the movements into or out of an account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Account, List<Entry>> mmEntry = new MMBusinessAssociationEnd<Account, List<Entry>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Entry";
			definition = "Record of the movements into or out of an account.";
			minOccurs = 0;
			opposite_lazy = () -> Entry.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Entry.mmObject();
		}

		@Override
		public List<Entry> getValue(Account obj) {
			return obj.getEntry();
		}

		@Override
		public void setValue(Account obj, List<Entry> value) {
			obj.setEntry(value);
		}
	};
	protected List<AccountContract> accountContract;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract#mmAccount
	 * AccountContract.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountContract
	 * AccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agreement which provides information on the account and on the services linked to it."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Account, List<AccountContract>> mmAccountContract = new MMBusinessAssociationEnd<Account, List<AccountContract>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountContract";
			definition = "Agreement which provides information on the account and on the services linked to it.";
			minOccurs = 0;
			opposite_lazy = () -> AccountContract.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AccountContract.mmObject();
		}

		@Override
		public List<AccountContract> getValue(Account obj) {
			return obj.getAccountContract();
		}

		@Override
		public void setValue(Account obj, List<AccountContract> value) {
			obj.setAccountContract(value);
		}
	};
	protected ISODateTime openingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmOpeningDate
	 * InvestmentAccount61.mmOpeningDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmOpeningDate
	 * InvestmentAccount63.mmOpeningDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmOpeningDate
	 * InvestmentAccount62.mmOpeningDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the account and related basic services are effectively operational for the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Account, ISODateTime> mmOpeningDate = new MMBusinessAttribute<Account, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentAccount61.mmOpeningDate, InvestmentAccount63.mmOpeningDate, InvestmentAccount62.mmOpeningDate);
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OpeningDate";
			definition = "Date on which the account and related basic services are effectively operational for the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Account obj) {
			return obj.getOpeningDate();
		}

		@Override
		public void setValue(Account obj, ISODateTime value) {
			obj.setOpeningDate(value);
		}
	};
	protected List<CurrencyExchange> currencyExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmReportedAccount
	 * CurrencyExchange.mmReportedAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate used to calculate the difference between amounts based on the base currency and the reporting currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Account, List<CurrencyExchange>> mmCurrencyExchange = new MMBusinessAssociationEnd<Account, List<CurrencyExchange>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyExchange";
			definition = "Rate used to calculate the difference between amounts based on the base currency and the reporting currency.";
			minOccurs = 0;
			opposite_lazy = () -> CurrencyExchange.mmReportedAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CurrencyExchange.mmObject();
		}

		@Override
		public List<CurrencyExchange> getValue(Account obj) {
			return obj.getCurrencyExchange();
		}

		@Override
		public void setValue(Account obj, List<CurrencyExchange> value) {
			obj.setCurrencyExchange(value);
		}
	};
	protected DefaultFundContribution defaultFundContribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#mmContributionAccount
	 * DefaultFundContribution.mmContributionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution
	 * DefaultFundContribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultFundContribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Default fund contribution parameters associated with a contribution account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Account, Optional<DefaultFundContribution>> mmDefaultFundContribution = new MMBusinessAssociationEnd<Account, Optional<DefaultFundContribution>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultFundContribution";
			definition = "Default fund contribution parameters associated with a contribution account.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> DefaultFundContribution.mmContributionAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DefaultFundContribution.mmObject();
		}

		@Override
		public Optional<DefaultFundContribution> getValue(Account obj) {
			return obj.getDefaultFundContribution();
		}

		@Override
		public void setValue(Account obj, Optional<DefaultFundContribution> value) {
			obj.setDefaultFundContribution(value.orElse(null));
		}
	};
	protected SystemMemberRole systemMember;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemMemberRole#mmAccount
	 * SystemMemberRole.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SystemMemberRole
	 * SystemMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Member of a system which is the owner of an account with the system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Account, SystemMemberRole> mmSystemMember = new MMBusinessAssociationEnd<Account, SystemMemberRole>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemMember";
			definition = "Member of a system which is the owner of an account with the system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SystemMemberRole.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SystemMemberRole.mmObject();
		}

		@Override
		public SystemMemberRole getValue(Account obj) {
			return obj.getSystemMember();
		}

		@Override
		public void setValue(Account obj, SystemMemberRole value) {
			obj.setSystemMember(value);
		}
	};
	protected CollateralAccountTypeCode collateralAccountType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralAccountTypeCode
	 * CollateralAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CollateralAccount2#mmType
	 * CollateralAccount2.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralAccountIdentificationType2Choice#mmType
	 * CollateralAccountIdentificationType2Choice.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralAccountIdentificationType2Choice#mmProprietary
	 * CollateralAccountIdentificationType2Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CollateralAccount3#mmType
	 * CollateralAccount3.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralAccountIdentificationType3Choice#mmType
	 * CollateralAccountIdentificationType3Choice.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralAccountIdentificationType3Choice#mmProprietary
	 * CollateralAccountIdentificationType3Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralAccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the collateral account type."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Account, CollateralAccountTypeCode> mmCollateralAccountType = new MMBusinessAttribute<Account, CollateralAccountTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CollateralAccount2.mmType, CollateralAccountIdentificationType2Choice.mmType, CollateralAccountIdentificationType2Choice.mmProprietary, CollateralAccount3.mmType,
					CollateralAccountIdentificationType3Choice.mmType, CollateralAccountIdentificationType3Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralAccountType";
			definition = "Specifies the collateral account type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralAccountTypeCode.mmObject();
		}

		@Override
		public CollateralAccountTypeCode getValue(Account obj) {
			return obj.getCollateralAccountType();
		}

		@Override
		public void setValue(Account obj, CollateralAccountTypeCode value) {
			obj.setCollateralAccountType(value);
		}
	};
	protected AccountService accountService;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountService#mmAccount
	 * AccountService.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountService
	 * AccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Services linked to the account and specified in the account contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Account, AccountService> mmAccountService = new MMBusinessAssociationEnd<Account, AccountService>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountService";
			definition = "Services linked to the account and specified in the account contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> AccountService.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AccountService.mmObject();
		}

		@Override
		public AccountService getValue(Account obj) {
			return obj.getAccountService();
		}

		@Override
		public void setValue(Account obj, AccountService value) {
			obj.setAccountService(value);
		}
	};
	protected Reconciliation reconciliation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reconciliation#mmAccount
	 * Reconciliation.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Reconciliation
	 * Reconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reconciliation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which compares and matches trade information with entries in an account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Account, Reconciliation> mmReconciliation = new MMBusinessAssociationEnd<Account, Reconciliation>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reconciliation";
			definition = "Process which compares and matches trade information with entries in an account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Reconciliation.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Reconciliation.mmObject();
		}

		@Override
		public Reconciliation getValue(Account obj) {
			return obj.getReconciliation();
		}

		@Override
		public void setValue(Account obj, Reconciliation value) {
			obj.setReconciliation(value);
		}
	};
	protected ManagedAccountProduct managedAccountProduct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ManagedAccountProduct#mmAccount
	 * ManagedAccountProduct.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ManagedAccountProduct
	 * ManagedAccountProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManagedAccountProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Product which provides guidance to investors to manage their portfolios."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Account, ManagedAccountProduct> mmManagedAccountProduct = new MMBusinessAssociationEnd<Account, ManagedAccountProduct>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ManagedAccountProduct";
			definition = "Product which provides guidance to investors to manage their portfolios.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> ManagedAccountProduct.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ManagedAccountProduct.mmObject();
		}

		@Override
		public ManagedAccountProduct getValue(Account obj) {
			return obj.getManagedAccountProduct();
		}

		@Override
		public void setValue(Account obj, ManagedAccountProduct value) {
			obj.setManagedAccountProduct(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":11A::ACCT"));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Account";
				definition = "Record of transactions in specific types of assets, maintained by a servicing party on behalf of one or more owning parties. Business relationship between an account servicer and one or more account owners.";
				associationDomain_lazy = () -> Arrays.asList(GenericIdentification.mmAccount, InvestmentFundClassProcessingCharacteristics.mmSettlementAccount, Account.mmParentAccount, Account.mmSubAccount, AccountIdentification.mmAccount,
						DateTimePeriod.mmAccount, AccountPartyRole.mmAccount, AccountService.mmAccount, AccountStatus.mmAccount, AccountContract.mmAccount, Entry.mmAccount, InvestmentFundPartyRole.mmAccount, TradePartyRole.mmAccount,
						System.mmAccount, SystemMemberRole.mmAccount, ClearingMemberRole.mmDefaultFundAccount, Balance.mmAccount, SettlementPartyRole.mmSettlementAccount, AccountRestriction.mmAccount, CurrencyExchange.mmReportedAccount,
						Collateral.mmCollateralAccount, CorporateActionProceedsDeliveryInstruction.mmSettlementAccount, CorporateActionPartyRole.mmAccount, DefaultFundContribution.mmContributionAccount, Reconciliation.mmAccount,
						ManagedAccountProduct.mmAccount);
				derivationElement_lazy = () -> Arrays.asList(SubAccount1.mmCharacteristic, SubAccount4.mmCharacteristic, SubAccount5.mmCharacteristic, SubAccount6.mmCharacteristic, Account23.mmRelatedAccountDetails);
				subType_lazy = () -> Arrays.asList(CashAccount.mmObject(), SecuritiesAccount.mmObject(), InvestmentAccount.mmObject());
				element_lazy = () -> Arrays.asList(Account.mmBaseCurrency, Account.mmIdentification, Account.mmParentAccount, Account.mmSubAccount, Account.mmRelatedFundProcessingCharacteristics, Account.mmStatus, Account.mmLanguage,
						Account.mmPartyRole, Account.mmTradePartyRole, Account.mmReportingCurrency, Account.mmAccountRestriction, Account.mmSettlementPartyRole, Account.mmPurpose, Account.mmClosingDate, Account.mmLiveDate,
						Account.mmReportedPeriod, Account.mmInvestmentFundPartyRole, Account.mmRelatedCollateralProcess, Account.mmType, Account.mmRelatedProceedsDelivery, Account.mmRelatedCorporateActionPartyRole,
						Account.mmDefaultFundAccountOwner, Account.mmSystem, Account.mmBalance, Account.mmEntry, Account.mmAccountContract, Account.mmOpeningDate, Account.mmCurrencyExchange, Account.mmDefaultFundContribution,
						Account.mmSystemMember, Account.mmCollateralAccountType, Account.mmAccountService, Account.mmReconciliation, Account.mmManagedAccountProduct);
				derivationComponent_lazy = () -> Arrays.asList(Account7.mmObject(), SubAccount1.mmObject(), SubAccount2.mmObject(), SubAccount4.mmObject(), Account18.mmObject(), SubAccount5.mmObject(), Account20.mmObject(),
						CollateralAccount2.mmObject(), CollateralAccountIdentificationType2Choice.mmObject(), SubAccount6.mmObject(), Account23.mmObject(), Account22.mmObject(), CollateralAccount3.mmObject(),
						CollateralAccountIdentificationType3Choice.mmObject(), Account25.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Account.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyCode getBaseCurrency() {
		return baseCurrency;
	}

	public Account setBaseCurrency(CurrencyCode baseCurrency) {
		this.baseCurrency = Objects.requireNonNull(baseCurrency);
		return this;
	}

	public AccountIdentification getIdentification() {
		return identification;
	}

	public Account setIdentification(AccountIdentification identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Account getParentAccount() {
		return parentAccount;
	}

	public Account setParentAccount(Account parentAccount) {
		this.parentAccount = Objects.requireNonNull(parentAccount);
		return this;
	}

	public List<Account> getSubAccount() {
		return subAccount == null ? subAccount = new ArrayList<>() : subAccount;
	}

	public Account setSubAccount(List<Account> subAccount) {
		this.subAccount = Objects.requireNonNull(subAccount);
		return this;
	}

	public InvestmentFundClassProcessingCharacteristics getRelatedFundProcessingCharacteristics() {
		return relatedFundProcessingCharacteristics;
	}

	public Account setRelatedFundProcessingCharacteristics(InvestmentFundClassProcessingCharacteristics relatedFundProcessingCharacteristics) {
		this.relatedFundProcessingCharacteristics = Objects.requireNonNull(relatedFundProcessingCharacteristics);
		return this;
	}

	public AccountStatus getStatus() {
		return status;
	}

	public Account setStatus(AccountStatus status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public LanguageCode getLanguage() {
		return language;
	}

	public Account setLanguage(LanguageCode language) {
		this.language = Objects.requireNonNull(language);
		return this;
	}

	public List<AccountPartyRole> getPartyRole() {
		return partyRole == null ? partyRole = new ArrayList<>() : partyRole;
	}

	public Account setPartyRole(List<AccountPartyRole> partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}

	public TradePartyRole getTradePartyRole() {
		return tradePartyRole;
	}

	public Account setTradePartyRole(TradePartyRole tradePartyRole) {
		this.tradePartyRole = Objects.requireNonNull(tradePartyRole);
		return this;
	}

	public CurrencyCode getReportingCurrency() {
		return reportingCurrency;
	}

	public Account setReportingCurrency(CurrencyCode reportingCurrency) {
		this.reportingCurrency = Objects.requireNonNull(reportingCurrency);
		return this;
	}

	public List<AccountRestriction> getAccountRestriction() {
		return accountRestriction == null ? accountRestriction = new ArrayList<>() : accountRestriction;
	}

	public Account setAccountRestriction(List<AccountRestriction> accountRestriction) {
		this.accountRestriction = Objects.requireNonNull(accountRestriction);
		return this;
	}

	public SettlementPartyRole getSettlementPartyRole() {
		return settlementPartyRole;
	}

	public Account setSettlementPartyRole(SettlementPartyRole settlementPartyRole) {
		this.settlementPartyRole = Objects.requireNonNull(settlementPartyRole);
		return this;
	}

	public Max140Text getPurpose() {
		return purpose;
	}

	public Account setPurpose(Max140Text purpose) {
		this.purpose = Objects.requireNonNull(purpose);
		return this;
	}

	public Optional<ISODateTime> getClosingDate() {
		return closingDate == null ? Optional.empty() : Optional.of(closingDate);
	}

	public Account setClosingDate(ISODateTime closingDate) {
		this.closingDate = closingDate;
		return this;
	}

	public ISODateTime getLiveDate() {
		return liveDate;
	}

	public Account setLiveDate(ISODateTime liveDate) {
		this.liveDate = Objects.requireNonNull(liveDate);
		return this;
	}

	public DateTimePeriod getReportedPeriod() {
		return reportedPeriod;
	}

	public Account setReportedPeriod(DateTimePeriod reportedPeriod) {
		this.reportedPeriod = Objects.requireNonNull(reportedPeriod);
		return this;
	}

	public InvestmentFundPartyRole getInvestmentFundPartyRole() {
		return investmentFundPartyRole;
	}

	public Account setInvestmentFundPartyRole(InvestmentFundPartyRole investmentFundPartyRole) {
		this.investmentFundPartyRole = Objects.requireNonNull(investmentFundPartyRole);
		return this;
	}

	public Optional<Collateral> getRelatedCollateralProcess() {
		return relatedCollateralProcess == null ? Optional.empty() : Optional.of(relatedCollateralProcess);
	}

	public Account setRelatedCollateralProcess(Collateral relatedCollateralProcess) {
		this.relatedCollateralProcess = relatedCollateralProcess;
		return this;
	}

	public GenericIdentification getType() {
		return type;
	}

	public Account setType(GenericIdentification type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public CorporateActionProceedsDeliveryInstruction getRelatedProceedsDelivery() {
		return relatedProceedsDelivery;
	}

	public Account setRelatedProceedsDelivery(CorporateActionProceedsDeliveryInstruction relatedProceedsDelivery) {
		this.relatedProceedsDelivery = Objects.requireNonNull(relatedProceedsDelivery);
		return this;
	}

	public CorporateActionPartyRole getRelatedCorporateActionPartyRole() {
		return relatedCorporateActionPartyRole;
	}

	public Account setRelatedCorporateActionPartyRole(CorporateActionPartyRole relatedCorporateActionPartyRole) {
		this.relatedCorporateActionPartyRole = Objects.requireNonNull(relatedCorporateActionPartyRole);
		return this;
	}

	public Optional<ClearingMemberRole> getDefaultFundAccountOwner() {
		return defaultFundAccountOwner == null ? Optional.empty() : Optional.of(defaultFundAccountOwner);
	}

	public Account setDefaultFundAccountOwner(ClearingMemberRole defaultFundAccountOwner) {
		this.defaultFundAccountOwner = defaultFundAccountOwner;
		return this;
	}

	public List<System> getSystem() {
		return system == null ? system = new ArrayList<>() : system;
	}

	public Account setSystem(List<System> system) {
		this.system = Objects.requireNonNull(system);
		return this;
	}

	public List<Balance> getBalance() {
		return balance == null ? balance = new ArrayList<>() : balance;
	}

	public Account setBalance(List<Balance> balance) {
		this.balance = Objects.requireNonNull(balance);
		return this;
	}

	public List<Entry> getEntry() {
		return entry == null ? entry = new ArrayList<>() : entry;
	}

	public Account setEntry(List<Entry> entry) {
		this.entry = Objects.requireNonNull(entry);
		return this;
	}

	public List<AccountContract> getAccountContract() {
		return accountContract == null ? accountContract = new ArrayList<>() : accountContract;
	}

	public Account setAccountContract(List<AccountContract> accountContract) {
		this.accountContract = Objects.requireNonNull(accountContract);
		return this;
	}

	public ISODateTime getOpeningDate() {
		return openingDate;
	}

	public Account setOpeningDate(ISODateTime openingDate) {
		this.openingDate = Objects.requireNonNull(openingDate);
		return this;
	}

	public List<CurrencyExchange> getCurrencyExchange() {
		return currencyExchange == null ? currencyExchange = new ArrayList<>() : currencyExchange;
	}

	public Account setCurrencyExchange(List<CurrencyExchange> currencyExchange) {
		this.currencyExchange = Objects.requireNonNull(currencyExchange);
		return this;
	}

	public Optional<DefaultFundContribution> getDefaultFundContribution() {
		return defaultFundContribution == null ? Optional.empty() : Optional.of(defaultFundContribution);
	}

	public Account setDefaultFundContribution(DefaultFundContribution defaultFundContribution) {
		this.defaultFundContribution = defaultFundContribution;
		return this;
	}

	public SystemMemberRole getSystemMember() {
		return systemMember;
	}

	public Account setSystemMember(SystemMemberRole systemMember) {
		this.systemMember = Objects.requireNonNull(systemMember);
		return this;
	}

	public CollateralAccountTypeCode getCollateralAccountType() {
		return collateralAccountType;
	}

	public Account setCollateralAccountType(CollateralAccountTypeCode collateralAccountType) {
		this.collateralAccountType = Objects.requireNonNull(collateralAccountType);
		return this;
	}

	public AccountService getAccountService() {
		return accountService;
	}

	public Account setAccountService(AccountService accountService) {
		this.accountService = Objects.requireNonNull(accountService);
		return this;
	}

	public Reconciliation getReconciliation() {
		return reconciliation;
	}

	public Account setReconciliation(Reconciliation reconciliation) {
		this.reconciliation = Objects.requireNonNull(reconciliation);
		return this;
	}

	public ManagedAccountProduct getManagedAccountProduct() {
		return managedAccountProduct;
	}

	public Account setManagedAccountProduct(ManagedAccountProduct managedAccountProduct) {
		this.managedAccountProduct = Objects.requireNonNull(managedAccountProduct);
		return this;
	}
}