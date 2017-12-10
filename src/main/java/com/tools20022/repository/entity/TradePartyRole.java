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
import com.tools20022.repository.choice.InvestmentFundRole2Choice;
import com.tools20022.repository.choice.TradingPartyCapacity1Choice;
import com.tools20022.repository.choice.TradingPartyCapacity2Choice;
import com.tools20022.repository.codeset.OptionPartyCode;
import com.tools20022.repository.codeset.TradingCapacityCode;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Trading party in a commercial, securities, treasury trade. This role may also
 * represent parties which play different intermediary roles in a trade.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TradePartyRole" src="doc-files/TradePartyRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.TradePartyRole#mmAccount
 * TradePartyRole.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradePartyRole#mmTradingPartyCapacity
 * TradePartyRole.mmTradingPartyCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradePartyRole#mmBuyerOrSeller
 * TradePartyRole.mmBuyerOrSeller}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradePartyRole#mmTrade
 * TradePartyRole.mmTrade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmTradePartyRole
 * Account.mmTradePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmTradePartyRole
 * Trade.mmTradePartyRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary29#mmRole
 * Intermediary29.mmRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction11#mmCounterparty
 * StandingSettlementInstruction11.mmCounterparty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary36#mmRole
 * Intermediary36.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary39#mmRole
 * Intermediary39.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary40#mmRole
 * Intermediary40.mmRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InvestmentFundRole2Choice#mmCode
 * InvestmentFundRole2Choice.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InvestmentFundRole2Choice#mmProprietary
 * InvestmentFundRole2Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.InvestorRole InvestorRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradeOriginatorRole
 * TradeOriginatorRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTradePartyRole
 * SecuritiesTradePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BuyerRole BuyerRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Borrower Borrower}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SellerRole SellerRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Lender Lender}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Broker Broker}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TreasuryTradePartyRole
 * TreasuryTradePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CommercialTradePartyRole
 * CommercialTradePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StockExchange StockExchange}
 * </li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails4
 * ConfirmationPartyDetails4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails2
 * ConfirmationPartyDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails3
 * ConfirmationPartyDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationParties3
 * ConfirmationParties3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails1
 * ConfirmationPartyDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails6
 * ConfirmationPartyDetails6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationParties4
 * ConfirmationParties4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails5
 * ConfirmationPartyDetails5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationParties2
 * ConfirmationParties2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary29 Intermediary29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary39 Intermediary39}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary40 Intermediary40}</li>
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
 * "TradePartyRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Trading party in a commercial, securities, treasury trade. This role may also represent parties which play different intermediary roles in a trade."
 * </li>
 * </ul>
 */
public class TradePartyRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.Account> account;
	/**
	 * Unambiguous identification of the account used in the context of the
	 * party role.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmTradePartyRole
	 * Account.mmTradePartyRole}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradingPartyAccount
	 * TradeLeg8.mmTradingPartyAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg10#mmTradingPartyAccount
	 * TradeLeg10.mmTradingPartyAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmTradingPartyAccount
	 * TradeLeg9.mmTradingPartyAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary39#mmAccount
	 * Intermediary39.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary40#mmAccount
	 * Intermediary40.mmAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole
	 * TradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account used in the context of the party role."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(TradeLeg8.mmTradingPartyAccount, TradeLeg10.mmTradingPartyAccount, TradeLeg9.mmTradingPartyAccount, Intermediary39.mmAccount, Intermediary40.mmAccount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradePartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Unambiguous identification of the account used in the context of the party role.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmTradePartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	protected TradingCapacityCode tradingPartyCapacity;
	/**
	 * Specifies the role of a trading party in a transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode
	 * TradingCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradingPartyCapacity1Choice#mmCode
	 * TradingPartyCapacity1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradingPartyCapacity1Choice#mmProprietary
	 * TradingPartyCapacity1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails2#mmTradingPartyCapacity
	 * ConfirmationPartyDetails2.mmTradingPartyCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradingPartyCapacity2Choice#mmCode
	 * TradingPartyCapacity2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradingPartyCapacity2Choice#mmProprietary
	 * TradingPartyCapacity2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails3#mmPartyCapacity
	 * ConfirmationPartyDetails3.mmPartyCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails6#mmPartyCapacity
	 * ConfirmationPartyDetails6.mmPartyCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradingCapacity
	 * TradeLeg8.mmTradingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition3#mmTradingCapacity
	 * NetPosition3.mmTradingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg10#mmTradingCapacity
	 * TradeLeg10.mmTradingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmTradingCapacity
	 * TradeLeg9.mmTradingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmTradingCapacity
	 * SettlementObligation8.mmTradingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmTradingCapacity
	 * SecuritiesTransaction1.mmTradingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary39#mmTradingPartyCapacity
	 * Intermediary39.mmTradingPartyCapacity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole
	 * TradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingPartyCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the role of a trading party in a transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTradingPartyCapacity = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TradingPartyCapacity1Choice.mmCode, TradingPartyCapacity1Choice.mmProprietary, ConfirmationPartyDetails2.mmTradingPartyCapacity, TradingPartyCapacity2Choice.mmCode,
					TradingPartyCapacity2Choice.mmProprietary, ConfirmationPartyDetails3.mmPartyCapacity, ConfirmationPartyDetails6.mmPartyCapacity, TradeLeg8.mmTradingCapacity, NetPosition3.mmTradingCapacity, TradeLeg10.mmTradingCapacity,
					TradeLeg9.mmTradingCapacity, SettlementObligation8.mmTradingCapacity, SecuritiesTransaction1.mmTradingCapacity, Intermediary39.mmTradingPartyCapacity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradePartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingPartyCapacity";
			definition = "Specifies the role of a trading party in a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradingCapacityCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradePartyRole.class.getMethod("getTradingPartyCapacity", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OptionPartyCode buyerOrSeller;
	/**
	 * Specifies the party which is the buyer or the seller.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OptionPartyCode
	 * OptionPartyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#mmCounterpartyIdentification
	 * ForeignExchangeSwapTransaction3.mmCounterpartyIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole
	 * TradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerOrSeller"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the party which is the buyer or the seller."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBuyerOrSeller = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ForeignExchangeSwapTransaction3.mmCounterpartyIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradePartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuyerOrSeller";
			definition = "Specifies the party which is the buyer or the seller.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionPartyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradePartyRole.class.getMethod("getBuyerOrSeller", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Trade> trade;
	/**
	 * Trade in which a party plays a role.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradePartyRole
	 * Trade.mmTradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole
	 * TradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade in which a party plays a role."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradePartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Trade in which a party plays a role.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.mmTradePartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradePartyRole";
				definition = "Trading party in a commercial, securities, treasury trade. This role may also represent parties which play different intermediary roles in a trade.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.mmTradePartyRole, com.tools20022.repository.entity.Trade.mmTradePartyRole);
				derivationElement_lazy = () -> Arrays.asList(Intermediary29.mmRole, StandingSettlementInstruction11.mmCounterparty, Intermediary36.mmRole, Intermediary39.mmRole, Intermediary40.mmRole, InvestmentFundRole2Choice.mmCode,
						InvestmentFundRole2Choice.mmProprietary);
				subType_lazy = () -> Arrays.asList(InvestorRole.mmObject(), TradeOriginatorRole.mmObject(), SecuritiesTradePartyRole.mmObject(), BuyerRole.mmObject(), Borrower.mmObject(), SellerRole.mmObject(), Lender.mmObject(),
						Broker.mmObject(), TreasuryTradePartyRole.mmObject(), CommercialTradePartyRole.mmObject(), StockExchange.mmObject());
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TradePartyRole.mmAccount, com.tools20022.repository.entity.TradePartyRole.mmTradingPartyCapacity,
						com.tools20022.repository.entity.TradePartyRole.mmBuyerOrSeller, com.tools20022.repository.entity.TradePartyRole.mmTrade);
				derivationComponent_lazy = () -> Arrays.asList(ConfirmationPartyDetails4.mmObject(), ConfirmationPartyDetails2.mmObject(), ConfirmationPartyDetails3.mmObject(), ConfirmationParties3.mmObject(),
						ConfirmationPartyDetails1.mmObject(), ConfirmationPartyDetails6.mmObject(), ConfirmationParties4.mmObject(), ConfirmationPartyDetails5.mmObject(), ConfirmationParties2.mmObject(), Intermediary29.mmObject(),
						Intermediary39.mmObject(), Intermediary40.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return TradePartyRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<com.tools20022.repository.entity.Account> account) {
		this.account = account;
	}

	public TradingCapacityCode getTradingPartyCapacity() {
		return tradingPartyCapacity;
	}

	public void setTradingPartyCapacity(TradingCapacityCode tradingPartyCapacity) {
		this.tradingPartyCapacity = tradingPartyCapacity;
	}

	public OptionPartyCode getBuyerOrSeller() {
		return buyerOrSeller;
	}

	public void setBuyerOrSeller(OptionPartyCode buyerOrSeller) {
		this.buyerOrSeller = buyerOrSeller;
	}

	public List<Trade> getTrade() {
		return trade;
	}

	public void setTrade(List<com.tools20022.repository.entity.Trade> trade) {
		this.trade = trade;
	}
}