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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Asset;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Financial instruments representing a sum of rights of the investor vis-a-vis
 * the issuer.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Security" src="doc-files/Security.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmIdentification
 * Security.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmRegisteredDistributionCountry
 * Security.mmRegisteredDistributionCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmDenominationCurrency
 * Security.mmDenominationCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmRegistrationForm
 * Security.mmRegistrationForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmDematerialisedIndicator
 * Security.mmDematerialisedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmEUSavingsDirective
 * Security.mmEUSavingsDirective}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesQuantity
 * Security.mmSecuritiesQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmFees
 * Security.mmFees}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmPricing
 * Security.mmPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesAccount
 * Security.mmSecuritiesAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmTradingMarket
 * Security.mmTradingMarket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmPlaceOfListing
 * Security.mmPlaceOfListing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmRegistration
 * Security.mmRegistration}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmRestriction
 * Security.mmRestriction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmCorporateEvent
 * Security.mmCorporateEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmTemporaryFinancialInstrumentIndicator
 * Security.mmTemporaryFinancialInstrumentIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmAvailableDate
 * Security.mmAvailableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmDeclarationDetails
 * Security.mmDeclarationDetails}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmSpread
 * Security.mmSpread}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmDividend
 * Security.mmDividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmBalance
 * Security.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmFungibleIndicator
 * Security.mmFungibleIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmAppearance
 * Security.mmAppearance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmNearTermPositionLimit
 * Security.mmNearTermPositionLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmContractSettlementMonth
 * Security.mmContractSettlementMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmMinimumTradingPricingIncrement
 * Security.mmMinimumTradingPricingIncrement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmRating
 * Security.mmRating}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmCouponAttached
 * Security.mmCouponAttached}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmSector
 * Security.mmSector}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmWarrantAttachedOnDelivery
 * Security.mmWarrantAttachedOnDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmStrippableIndicator
 * Security.mmStrippableIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmFirstDealingDate
 * Security.mmFirstDealingDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmTaxDetails
 * Security.mmTaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmSecuritiesTrade
 * Security.mmSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmRegistrationJurisdiction
 * Security.mmRegistrationJurisdiction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmPartyRole
 * Security.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmSecurityStatus
 * Security.mmSecurityStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmModification
 * Security.mmModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmRedemptionSchedule
 * Security.mmRedemptionSchedule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesSettlement
 * Security.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesTransfer
 * Security.mmSecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmCorporateActionStandingInstructions
 * Security.mmCorporateActionStandingInstructions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmQuote
 * Security.mmQuote}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmSecuritiesOrder
 * Security.mmSecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmRelatedVariableInterest
 * Security.mmRelatedVariableInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmConversion
 * Security.mmConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmComponentSecurity
 * Security.mmComponentSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmRecompositionIndicator
 * Security.mmRecompositionIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmSeries
 * Security.mmSeries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmPercentageOfDebtClaim
 * Security.mmPercentageOfDebtClaim}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmCoverRate
 * Security.mmCoverRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmMaturityRedemption
 * Security.mmMaturityRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmRelatedMarginCall
 * Security.mmRelatedMarginCall}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmCloseLink
 * Security.mmCloseLink}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmPotentialEuroSystemEligibility
 * Security.mmPotentialEuroSystemEligibility}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmMinimumQuantity
 * Security.mmMinimumQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmRestrictedIndicator
 * Security.mmRestrictedIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmIdentifiedSecurity
 * SecuritiesIdentification.mmIdentifiedSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmSecurity
 * Dividend.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSecurity
 * SecuritiesPricing.mmSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmCloseLinkSecurity
 * Party.mmCloseLinkSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmSecurity
 * RedemptionSchedule.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmTradedSecurity
 * TradingMarket.mmTradedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmListedSecurity
 * TradingMarket.mmListedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecurity
 * SecuritiesAccount.mmSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#mmSecurity
 * SecuritiesTax.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecurityIdentification
 * SecuritiesQuantity.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumQuantityDebt
 * SecuritiesQuantity.mmMinimumQuantityDebt}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecurity
 * SecuritiesTrade.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmSecurity
 * SecuritiesTransfer.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole#mmSecurity
 * SecuritiesPartyRole.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecurity
 * SecuritiesSettlement.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmSecurity
 * SecuritiesRelatedFees.mmSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesStatus#mmSecurity
 * SecuritiesStatus.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmBenchmarkReference
 * VariableInterest.mmBenchmarkReference}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CouponAttached#mmSecurity
 * CouponAttached.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmSecurityIdentification
 * SecuritiesConversion.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmSecurity
 * BasicSecuritiesRegistration.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction#mmSecurity
 * SecuritiesRestriction.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecurity
 * SecuritiesBalance.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmUnderlyingSecurity
 * CorporateActionEvent.mmUnderlyingSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmNewSecurityReferenceData
 * SecuritiesModification.mmNewSecurityReferenceData}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#mmBenchmarkSecurity
 * Spread.mmBenchmarkSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedSecurity
 * SecuritiesOrder.mmOrderedSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Rating#mmSecurity
 * Rating.mmSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Sector#mmSecurity
 * Sector.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmRegisteredSecurities
 * Jurisdiction.mmRegisteredSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction#mmSecurity
 * AgentCorporateActionStandingInstruction.mmSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#mmSecurity
 * MarginCall.mmSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmQuotedSecurity
 * Quote.mmQuotedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ComponentSecurity#mmSecurity
 * ComponentSecurity.mmSecurity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingFinancialInstrument2#mmAttributes
 * UnderlyingFinancialInstrument2.mmAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution5#mmSecuritiesCollateral
 * CollateralSubstitution5.mmSecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution4#mmSecuritiesCollateral
 * CollateralSubstitution4.mmSecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmSecuritiesCollateral
 * CollateralValuation5.mmSecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5#mmFinancialInstrumentGeneralAttributes
 * SecuritiesReferenceDataReport5.mmFinancialInstrumentGeneralAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription13#mmFinancialInstrumentGeneralAttributes
 * SecurityInstrumentDescription13.mmFinancialInstrumentGeneralAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails24#mmFinancialInstrumentAttributes
 * FinancialInstrumentDetails24.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Collateral16#mmSecuritiesCollateral
 * Collateral16.mmSecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Collateral17#mmSecuritiesCollateral
 * Collateral17.mmSecuritiesCollateral}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFundClass
 * InvestmentFundClass}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt Debt}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Warrant Warrant}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entitlement Entitlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.FormOfSecurity4Choice
 * FormOfSecurity4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
 * FinancialInstrumentStipulations2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingFinancialInstrument2
 * UnderlyingFinancialInstrument2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDescription3
 * FinancialInstrumentDescription3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.FormOfSecurity6Choice
 * FormOfSecurity6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate12 SecurityDate12}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator3Choice
 * TemporaryFinancialInstrumentIndicator3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesCollateral6
 * SecuritiesCollateral6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesCollateral5
 * SecuritiesCollateral5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesCollateral7
 * SecuritiesCollateral7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9
 * SecurityInstrumentDescription9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription11
 * SecurityInstrumentDescription11}</li>
 * <li>{@linkplain com.tools20022.repository.choice.FinancialInstrument46Choice
 * FinancialInstrument46Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument53
 * FinancialInstrument53}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransparencyDataReport11
 * TransparencyDataReport11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransparencyDataReport13
 * TransparencyDataReport13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5
 * SecuritiesReferenceDataReport5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransparencyDataReport12
 * TransparencyDataReport12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransparencyDataReport15
 * TransparencyDataReport15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransparencyDataReport10
 * TransparencyDataReport10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransparencyDataReport14
 * TransparencyDataReport14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument58
 * FinancialInstrument58}</li>
 * <li>{@linkplain com.tools20022.repository.choice.FinancialInstrument48Choice
 * FinancialInstrument48Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentAttributes3Choice
 * FinancialInstrumentAttributes3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription13
 * SecurityInstrumentDescription13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails25
 * FinancialInstrumentDetails25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails24
 * FinancialInstrumentDetails24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesCollateral8
 * SecuritiesCollateral8}</li>
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
 * "Security"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer."
 * </li>
 * </ul>
 */
public class Security extends Asset {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.SecuritiesIdentification> identification;
	/**
	 * Way(s) of identifying the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmIdentifiedSecurity
	 * SecuritiesIdentification.mmIdentifiedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1#mmSecurityIdentification
	 * FundProcessingPassport1.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument17#mmIdentification
	 * FinancialInstrument17.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument8#mmIdentification
	 * FinancialInstrument8.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument13#mmIdentification
	 * FinancialInstrument13.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingFinancialInstrument2#mmIdentification
	 * UnderlyingFinancialInstrument2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument9#mmIdentification
	 * FinancialInstrument9.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDescription3#mmSecurityIdentification
	 * FinancialInstrumentDescription3.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1#mmSecurityIdentification
	 * SecurityOption1.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmAssentedLineSecurityIdentification
	 * CorporateActionOption1.mmAssentedLineSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement2#mmSecurityIdentification
	 * CorporateActionSecuritiesMovement2.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmSecurityIdentification
	 * BeneficialOwner1.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesEntitlement1#mmSecurityIdentification
	 * SecuritiesEntitlement1.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityMovement1#mmSecurityIdentification
	 * SecurityMovement1.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingSecurityMovement1#mmSecurityIdentification
	 * UnderlyingSecurityMovement1.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesProceeds1#mmSecurityIdentification
	 * SecuritiesProceeds1.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement1#mmSecurityIdentification
	 * CorporateActionSecuritiesMovement1.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailedMovement1#mmSecurityIdentification
	 * FailedMovement1.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount6#mmSecurityIdentification
	 * SecuritiesAccount6.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VariationMargin3#mmFinancialInstrumentIdentification
	 * VariationMargin3.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarginCalculation2#mmFinancialInstrumentIdentification
	 * MarginCalculation2.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmFinancialInstrumentIdentification
	 * Order18.mmFinancialInstrumentIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund2#mmIdentification
	 * Fund2.mmIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund1#mmIdentification
	 * Fund1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmFinancialInstrumentIdentification
	 * TradeLeg8.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance2#mmFinancialInstrumentIdentification
	 * AggregateHoldingBalance2.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation7#mmFinancialInstrumentIdentification
	 * SettlementObligation7.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition3#mmFinancialInstrumentIdentification
	 * NetPosition3.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmFinancialInstrumentIdentification
	 * TradeLeg9.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmFinancialInstrumentIdentification
	 * SettlementObligation8.mmFinancialInstrumentIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund3#mmIdentification
	 * Fund3.mmIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund4#mmIdentification
	 * Fund4.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition8#mmFinancialInstrumentIdentification
	 * SecurityPosition8.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition9#mmFinancialInstrumentIdentification
	 * SecurityPosition9.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#mmFinancialInstrumentIdentification
	 * AggregateBalanceInformation30.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails81#mmFinancialInstrumentIdentification
	 * TransactionDetails81.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails74#mmFinancialInstrumentIdentification
	 * TransactionDetails74.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails82#mmFinancialInstrumentIdentification
	 * TransactionDetails82.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmFinancialInstrumentIdentification
	 * SecuritiesTradeDetails48.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#mmFinancialInstrumentIdentification
	 * AggregateBalanceInformation31.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails80#mmFinancialInstrumentIdentification
	 * TransactionDetails80.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmUnderlyingFinancialInstrumentIdentification
	 * FinancialInstrumentAttributes63.
	 * mmUnderlyingFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmUnderlyingFinancialInstrumentIdentification
	 * FinancialInstrumentAttributes64.
	 * mmUnderlyingFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters11#mmFinancialInstrumentIdentification
	 * AdditionalQueryParameters11.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption116#mmFinancialInstrumentIdentification
	 * CorporateActionOption116.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes68#mmSecurityIdentification
	 * FinancialInstrumentAttributes68.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption53#mmFinancialInstrumentIdentification
	 * SecuritiesOption53.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument50#mmIdentification
	 * FinancialInstrument50.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument49#mmIdentification
	 * FinancialInstrument49.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument48#mmIdentification
	 * FinancialInstrument48.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47#mmIdentification
	 * FinancialInstrument47.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#mmIdentification
	 * FinancialInstrument46.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral6#mmSecurityIdentification
	 * SecuritiesCollateral6.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral5#mmSecurityIdentification
	 * SecuritiesCollateral5.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#mmSecurityIdentification
	 * SecuritiesCollateral7.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9#mmIdentification
	 * SecurityInstrumentDescription9.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription11#mmIdentification
	 * SecurityInstrumentDescription11.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57#mmIdentification
	 * FinancialInstrument57.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmIdentification
	 * FinancialInstrument56.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument55#mmIdentification
	 * FinancialInstrument55.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4#mmFinancialInstrument
	 * SecuritiesTransactionReport4.mmFinancialInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation111#mmFinancialInstrumentIdentification
	 * CorporateActionGeneralInformation111.mmFinancialInstrumentIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation112#mmFinancialInstrumentIdentification
	 * CorporateActionGeneralInformation112.mmFinancialInstrumentIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation110#mmFinancialInstrumentIdentification
	 * CorporateActionGeneralInformation110.mmFinancialInstrumentIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmFinancialInstrumentIdentification
	 * CorporateActionOption130.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#mmSecurityIdentification
	 * CorporateActionOption131.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmSecurityIdentification
	 * CorporateActionOption129.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation108#mmFinancialInstrumentIdentification
	 * CorporateActionGeneralInformation108.mmFinancialInstrumentIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmFinancialInstrumentIdentification
	 * FinancialInstrumentAttributes79.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#mmFinancialInstrumentIdentification
	 * SecuritiesOption60.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#mmFinancialInstrumentIdentification
	 * FinancialInstrumentAttributes81.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmFinancialInstrumentIdentification
	 * FinancialInstrumentAttributes80.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails25#mmFinancialInstrumentIdentification
	 * FinancialInstrumentDetails25.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails24#mmFinancialInstrumentIdentification
	 * FinancialInstrumentDetails24.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmFinancialInstrumentIdentification
	 * SecuritiesTradeDetails68.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmFinancialInstrumentIdentification
	 * TransactionDetails97.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails39#mmFinancialInstrumentIdentification
	 * IntraPositionDetails39.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation13#mmFinancialInstrumentIdentification
	 * AdditionalInformation13.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmFinancialInstrumentIdentification
	 * SecuritiesFinancingTransactionDetails35.
	 * mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28#mmFinancialInstrumentIdentification
	 * SecuritiesSettlementTransactionDetails28.
	 * mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#mmFinancialInstrumentIdentification
	 * TransactionDetails96.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral8#mmSecurityIdentification
	 * SecuritiesCollateral8.mmSecurityIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Way(s) of identifying the security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FundProcessingPassport1.mmSecurityIdentification, FinancialInstrument17.mmIdentification, FinancialInstrument8.mmIdentification, FinancialInstrument13.mmIdentification,
					UnderlyingFinancialInstrument2.mmIdentification, FinancialInstrument9.mmIdentification, FinancialInstrumentDescription3.mmSecurityIdentification, SecurityOption1.mmSecurityIdentification,
					CorporateActionOption1.mmAssentedLineSecurityIdentification, CorporateActionSecuritiesMovement2.mmSecurityIdentification, BeneficialOwner1.mmSecurityIdentification, SecuritiesEntitlement1.mmSecurityIdentification,
					SecurityMovement1.mmSecurityIdentification, UnderlyingSecurityMovement1.mmSecurityIdentification, SecuritiesProceeds1.mmSecurityIdentification, CorporateActionSecuritiesMovement1.mmSecurityIdentification,
					FailedMovement1.mmSecurityIdentification, SecuritiesAccount6.mmSecurityIdentification, VariationMargin3.mmFinancialInstrumentIdentification, MarginCalculation2.mmFinancialInstrumentIdentification,
					Order18.mmFinancialInstrumentIdentification, Fund2.mmIdentification, Fund1.mmIdentification, TradeLeg8.mmFinancialInstrumentIdentification, AggregateHoldingBalance2.mmFinancialInstrumentIdentification,
					SettlementObligation7.mmFinancialInstrumentIdentification, NetPosition3.mmFinancialInstrumentIdentification, TradeLeg9.mmFinancialInstrumentIdentification, SettlementObligation8.mmFinancialInstrumentIdentification,
					Fund3.mmIdentification, Fund4.mmIdentification, SecurityPosition8.mmFinancialInstrumentIdentification, SecurityPosition9.mmFinancialInstrumentIdentification,
					AggregateBalanceInformation30.mmFinancialInstrumentIdentification, TransactionDetails81.mmFinancialInstrumentIdentification, TransactionDetails74.mmFinancialInstrumentIdentification,
					TransactionDetails82.mmFinancialInstrumentIdentification, SecuritiesTradeDetails48.mmFinancialInstrumentIdentification, AggregateBalanceInformation31.mmFinancialInstrumentIdentification,
					TransactionDetails80.mmFinancialInstrumentIdentification, FinancialInstrumentAttributes63.mmUnderlyingFinancialInstrumentIdentification, FinancialInstrumentAttributes64.mmUnderlyingFinancialInstrumentIdentification,
					AdditionalQueryParameters11.mmFinancialInstrumentIdentification, CorporateActionOption116.mmFinancialInstrumentIdentification, FinancialInstrumentAttributes68.mmSecurityIdentification,
					SecuritiesOption53.mmFinancialInstrumentIdentification, FinancialInstrument50.mmIdentification, FinancialInstrument49.mmIdentification, FinancialInstrument48.mmIdentification, FinancialInstrument47.mmIdentification,
					FinancialInstrument46.mmIdentification, SecuritiesCollateral6.mmSecurityIdentification, SecuritiesCollateral5.mmSecurityIdentification, SecuritiesCollateral7.mmSecurityIdentification,
					SecurityInstrumentDescription9.mmIdentification, SecurityInstrumentDescription11.mmIdentification, FinancialInstrument57.mmIdentification, FinancialInstrument56.mmIdentification, FinancialInstrument55.mmIdentification,
					SecuritiesTransactionReport4.mmFinancialInstrument, CorporateActionGeneralInformation111.mmFinancialInstrumentIdentification, CorporateActionGeneralInformation112.mmFinancialInstrumentIdentification,
					CorporateActionGeneralInformation110.mmFinancialInstrumentIdentification, CorporateActionOption130.mmFinancialInstrumentIdentification, CorporateActionOption131.mmSecurityIdentification,
					CorporateActionOption129.mmSecurityIdentification, CorporateActionGeneralInformation108.mmFinancialInstrumentIdentification, FinancialInstrumentAttributes79.mmFinancialInstrumentIdentification,
					SecuritiesOption60.mmFinancialInstrumentIdentification, FinancialInstrumentAttributes81.mmFinancialInstrumentIdentification, FinancialInstrumentAttributes80.mmFinancialInstrumentIdentification,
					FinancialInstrumentDetails25.mmFinancialInstrumentIdentification, FinancialInstrumentDetails24.mmFinancialInstrumentIdentification, SecuritiesTradeDetails68.mmFinancialInstrumentIdentification,
					TransactionDetails97.mmFinancialInstrumentIdentification, IntraPositionDetails39.mmFinancialInstrumentIdentification, AdditionalInformation13.mmFinancialInstrumentIdentification,
					SecuritiesFinancingTransactionDetails35.mmFinancialInstrumentIdentification, SecuritiesSettlementTransactionDetails28.mmFinancialInstrumentIdentification, TransactionDetails96.mmFinancialInstrumentIdentification,
					SecuritiesCollateral8.mmSecurityIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Way(s) of identifying the security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmIdentifiedSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
		}
	};
	protected CountryCode registeredDistributionCountry;
	/**
	 * Country in which the processing characteristic applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification1#mmRegisteredDistributionCountry
	 * SecurityIdentification1.mmRegisteredDistributionCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#mmRegisteredDistributionCountry
	 * FinancialInstrument21.mmRegisteredDistributionCountry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredDistributionCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country in which the processing characteristic applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRegisteredDistributionCountry = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification1.mmRegisteredDistributionCountry, FinancialInstrument21.mmRegisteredDistributionCountry);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegisteredDistributionCountry";
			definition = "Country in which the processing characteristic applies.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getRegisteredDistributionCountry", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode denominationCurrency;
	/**
	 * Currency in which a security is issued or redenominated.
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument8#mmDenominationCurrency
	 * FinancialInstrument8.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#mmDenominationCurrency
	 * FinancialInstrument21.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmCurrency
	 * FinancialInstrumentStipulations2.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmDenominationCurrency
	 * FinancialInstrumentAttributes44.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmNewDenominationCurrency
	 * CorporateAction2.mmNewDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmDenominationCurrency
	 * FinancialInstrumentAttributes63.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmDenominationCurrency
	 * FinancialInstrumentAttributes64.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmDenominationCurrency
	 * FinancialInstrumentAttributes79.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#mmDenominationCurrency
	 * FinancialInstrumentAttributes81.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmDenominationCurrency
	 * FinancialInstrumentAttributes80.mmDenominationCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency in which a security is issued or redenominated."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDenominationCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrument8.mmDenominationCurrency, FinancialInstrument21.mmDenominationCurrency, FinancialInstrumentStipulations2.mmCurrency,
					FinancialInstrumentAttributes44.mmDenominationCurrency, CorporateAction2.mmNewDenominationCurrency, FinancialInstrumentAttributes63.mmDenominationCurrency, FinancialInstrumentAttributes64.mmDenominationCurrency,
					FinancialInstrumentAttributes79.mmDenominationCurrency, FinancialInstrumentAttributes81.mmDenominationCurrency, FinancialInstrumentAttributes80.mmDenominationCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DenominationCurrency";
			definition = "Currency in which a security is issued or redenominated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getDenominationCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FormOfSecurityCode registrationForm;
	/**
	 * Specifies the form, ie, ownership, of the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FormOfSecurityCode
	 * FormOfSecurityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument17#mmSecuritiesForm
	 * FinancialInstrument17.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument8#mmSecuritiesForm
	 * FinancialInstrument8.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument13#mmSecuritiesForm
	 * FinancialInstrument13.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#mmSecuritiesForm
	 * FinancialInstrument21.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity4Choice#mmCode
	 * FormOfSecurity4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity4Choice#mmProprietary
	 * FormOfSecurity4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmRegistrationForm
	 * FinancialInstrumentAttributes44.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument9#mmSecuritiesForm
	 * FinancialInstrument9.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount9#mmSecurityHoldingForm
	 * SecuritiesAccount9.mmSecurityHoldingForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount12#mmSecurityHoldingForm
	 * SecuritiesAccount12.mmSecurityHoldingForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount8#mmSecurityHoldingForm
	 * SecuritiesAccount8.mmSecurityHoldingForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount10#mmSecurityHoldingForm
	 * SecuritiesAccount10.mmSecurityHoldingForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund3#mmSecuritiesForm
	 * InvestmentFundTransactionsByFund3.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance1#mmHoldingForm
	 * AggregateHoldingBalance1.mmHoldingForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmRegistrationForm
	 * FinancialInstrumentAttributes63.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmRegistrationForm
	 * FinancialInstrumentAttributes64.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity6Choice#mmCode
	 * FormOfSecurity6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity6Choice#mmProprietary
	 * FormOfSecurity6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount54#mmSecuritiesForm
	 * InvestmentAccount54.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount56#mmSecuritiesForm
	 * InvestmentAccount56.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55#mmSecuritiesForm
	 * InvestmentAccount55.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument49#mmSecuritiesForm
	 * FinancialInstrument49.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#mmSecuritiesForm
	 * InvestmentAccount57.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57#mmSecuritiesForm
	 * FinancialInstrument57.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmSecuritiesForm
	 * FinancialInstrument56.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument55#mmSecuritiesForm
	 * FinancialInstrument55.mmSecuritiesForm}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the form, ie, ownership, of the security."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRegistrationForm = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrument17.mmSecuritiesForm, FinancialInstrument8.mmSecuritiesForm, FinancialInstrument13.mmSecuritiesForm, FinancialInstrument21.mmSecuritiesForm, FormOfSecurity4Choice.mmCode,
					FormOfSecurity4Choice.mmProprietary, FinancialInstrumentAttributes44.mmRegistrationForm, FinancialInstrument9.mmSecuritiesForm, SecuritiesAccount9.mmSecurityHoldingForm, SecuritiesAccount12.mmSecurityHoldingForm,
					SecuritiesAccount8.mmSecurityHoldingForm, SecuritiesAccount10.mmSecurityHoldingForm, InvestmentFundTransactionsByFund3.mmSecuritiesForm, AggregateHoldingBalance1.mmHoldingForm,
					FinancialInstrumentAttributes63.mmRegistrationForm, FinancialInstrumentAttributes64.mmRegistrationForm, FormOfSecurity6Choice.mmCode, FormOfSecurity6Choice.mmProprietary, InvestmentAccount54.mmSecuritiesForm,
					InvestmentAccount56.mmSecuritiesForm, InvestmentAccount55.mmSecuritiesForm, FinancialInstrument49.mmSecuritiesForm, InvestmentAccount57.mmSecuritiesForm, FinancialInstrument57.mmSecuritiesForm,
					FinancialInstrument56.mmSecuritiesForm, FinancialInstrument55.mmSecuritiesForm);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationForm";
			definition = "Specifies the form, ie, ownership, of the security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FormOfSecurityCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getRegistrationForm", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator dematerialisedIndicator;
	/**
	 * Indicates whether a security exists only as an electronic record, ie,
	 * there is no physical document representing the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount54#mmDematerialisedIndicator
	 * InvestmentAccount54.mmDematerialisedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount56#mmDematerialisedIndicator
	 * InvestmentAccount56.mmDematerialisedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55#mmDematerialisedIndicator
	 * InvestmentAccount55.mmDematerialisedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#mmDematerialisedIndicator
	 * InvestmentAccount57.mmDematerialisedIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DematerialisedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a security exists only as an electronic record, ie, there is no physical document representing the security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDematerialisedIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentAccount54.mmDematerialisedIndicator, InvestmentAccount56.mmDematerialisedIndicator, InvestmentAccount55.mmDematerialisedIndicator, InvestmentAccount57.mmDematerialisedIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DematerialisedIndicator";
			definition = "Indicates whether a security exists only as an electronic record, ie, there is no physical document representing the security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getDematerialisedIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected EUSavingsDirectiveCode eUSavingsDirective;
	/**
	 * Indicates whether the investment fund class is subject to the European
	 * Union Saving Directive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EUSavingsDirectiveCode
	 * EUSavingsDirectiveCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#mmEUSavingsDirective
	 * FinancialInstrument20.mmEUSavingsDirective}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUSavingsDirective"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the investment fund class is subject to the European Union Saving Directive."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEUSavingsDirective = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrument20.mmEUSavingsDirective);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EUSavingsDirective";
			definition = "Indicates whether the investment fund class is subject to the European Union Saving Directive.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EUSavingsDirectiveCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getEUSavingsDirective", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesQuantity> securitiesQuantity;
	/**
	 * Specifies the quantity associated with a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecurityIdentification
	 * SecuritiesQuantity.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAvailability#mmQuantity
	 * QuantityAndAvailability.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity1#mmFinancialInstrumentQuantity
	 * AmountPricePerFinancialInstrumentQuantity1.mmFinancialInstrumentQuantity}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmElectedSecuritiesQuantity
	 * BeneficialOwner1.mmElectedSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherTypeOfCollateral2#mmQuantity
	 * OtherTypeOfCollateral2.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmQuantity
	 * SecuritiesTransaction1.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification93#mmOwnedSecuritiesQuantity
	 * PartyIdentification93.mmOwnedSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes68#mmQuantity
	 * FinancialInstrumentAttributes68.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity6#mmFinancialInstrumentQuantity
	 * AmountPricePerFinancialInstrumentQuantity6.mmFinancialInstrumentQuantity}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument48#mmQuantity
	 * FinancialInstrument48.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47#mmQuantity
	 * FinancialInstrument47.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#mmQuantity
	 * FinancialInstrument46.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmBlockedQuantity
	 * OtherCollateral6.mmBlockedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral6#mmQuantity
	 * SecuritiesCollateral6.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral6#mmBlockedQuantity
	 * SecuritiesCollateral6.mmBlockedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral5#mmQuantity
	 * SecuritiesCollateral5.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#mmQuantity
	 * SecuritiesCollateral7.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation13#mmQuantity
	 * AdditionalInformation13.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral8#mmQuantity
	 * SecuritiesCollateral8.mmQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the quantity associated with a security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(QuantityAndAvailability.mmQuantity, AmountPricePerFinancialInstrumentQuantity1.mmFinancialInstrumentQuantity, BeneficialOwner1.mmElectedSecuritiesQuantity,
					OtherTypeOfCollateral2.mmQuantity, SecuritiesTransaction1.mmQuantity, PartyIdentification93.mmOwnedSecuritiesQuantity, FinancialInstrumentAttributes68.mmQuantity,
					AmountPricePerFinancialInstrumentQuantity6.mmFinancialInstrumentQuantity, FinancialInstrument48.mmQuantity, FinancialInstrument47.mmQuantity, FinancialInstrument46.mmQuantity, OtherCollateral6.mmBlockedQuantity,
					SecuritiesCollateral6.mmQuantity, SecuritiesCollateral6.mmBlockedQuantity, SecuritiesCollateral5.mmQuantity, SecuritiesCollateral7.mmQuantity, AdditionalInformation13.mmQuantity, SecuritiesCollateral8.mmQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantity";
			definition = "Specifies the quantity associated with a security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmSecurityIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesRelatedFees> fees;
	/**
	 * Fees related to securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmSecurity
	 * SecuritiesRelatedFees.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees
	 * SecuritiesRelatedFees}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmChargeDetails
	 * UnitPrice15.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmMatchingConfirmationFee
	 * OtherAmounts16.mmMatchingConfirmationFee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmMarketMemberFeeAmount
	 * OtherAmounts16.mmMarketMemberFeeAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts16#mmOddLotFee
	 * OtherAmounts16.mmOddLotFee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#mmChargeDetails
	 * ReceiveInformation17.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#mmChargeDetails
	 * ReceiveInformation16.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmChargeDetails
	 * DeliverInformation16.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#mmChargeDetails
	 * DeliverInformation17.mmChargeDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fees related to securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmFees = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(UnitPrice15.mmChargeDetails, OtherAmounts16.mmMatchingConfirmationFee, OtherAmounts16.mmMarketMemberFeeAmount, OtherAmounts16.mmOddLotFee, ReceiveInformation17.mmChargeDetails,
					ReceiveInformation16.mmChargeDetails, DeliverInformation16.mmChargeDetails, DeliverInformation17.mmChargeDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Fees";
			definition = "Fees related to securities.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesRelatedFees.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesRelatedFees.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesPricing> pricing;
	/**
	 * Information on the price of the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSecurity
	 * SecuritiesPricing.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace4.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#mmPriceDetails
	 * AggregateBalanceInformation3.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace3.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#mmPriceDetails
	 * AggregateBalanceInformation4.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmPriceRange
	 * FinancialInstrumentStipulations2.mmPriceRange}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFund1#mmPrice
	 * InvestmentFund1.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#mmPriceDetails
	 * AggregateBalanceInformation30.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#mmPriceDetails
	 * AggregateBalanceInformation31.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace28.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#mmPriceDetails
	 * AggregateBalancePerSafekeepingPlace29.mmPriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit6#mmPriceDetails
	 * Unit6.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral6#mmPrice
	 * SecuritiesCollateral6.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral5#mmPrice
	 * SecuritiesCollateral5.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#mmPrice
	 * SecuritiesCollateral7.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmIssuePrice
	 * FinancialInstrumentAttributes80.mmIssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails25#mmPriceDetails
	 * FinancialInstrumentDetails25.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral8#mmPrice
	 * SecuritiesCollateral8.mmPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pricing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information on the price of the security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPricing = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AggregateBalancePerSafekeepingPlace4.mmPriceDetails, AggregateBalanceInformation3.mmPriceDetails, AggregateBalancePerSafekeepingPlace3.mmPriceDetails,
					AggregateBalanceInformation4.mmPriceDetails, FinancialInstrumentStipulations2.mmPriceRange, InvestmentFund1.mmPrice, AggregateBalanceInformation30.mmPriceDetails, AggregateBalanceInformation31.mmPriceDetails,
					AggregateBalancePerSafekeepingPlace28.mmPriceDetails, AggregateBalancePerSafekeepingPlace29.mmPriceDetails, Unit6.mmPriceDetails, SecuritiesCollateral6.mmPrice, SecuritiesCollateral5.mmPrice,
					SecuritiesCollateral7.mmPrice, FinancialInstrumentAttributes80.mmIssuePrice, FinancialInstrumentDetails25.mmPriceDetails, SecuritiesCollateral8.mmPrice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Pricing";
			definition = "Information on the price of the security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesAccount securitiesAccount;
	/**
	 * Account on which the security is held.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecurity
	 * SecuritiesAccount.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails82#mmSafekeepingAccount
	 * TransactionDetails82.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails76#mmSafekeepingAccount
	 * TransactionDetails76.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails80#mmSafekeepingAccount
	 * TransactionDetails80.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#mmSafekeepingAccount
	 * OtherCollateral7.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmSafekeepingAccount
	 * OtherCollateral6.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral6#mmSafekeepingAccount
	 * SecuritiesCollateral6.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral5#mmSafekeepingAccount
	 * SecuritiesCollateral5.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral5#mmSafekeepingAccount
	 * OtherCollateral5.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#mmSafekeepingAccount
	 * SecuritiesCollateral7.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmSafekeepingAccount
	 * TransactionDetails97.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation13#mmSafekeepingAccount
	 * AdditionalInformation13.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral8#mmSafekeepingAccount
	 * SecuritiesCollateral8.mmSafekeepingAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account on which the security is held."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionDetails82.mmSafekeepingAccount, TransactionDetails76.mmSafekeepingAccount, TransactionDetails80.mmSafekeepingAccount, OtherCollateral7.mmSafekeepingAccount,
					OtherCollateral6.mmSafekeepingAccount, SecuritiesCollateral6.mmSafekeepingAccount, SecuritiesCollateral5.mmSafekeepingAccount, OtherCollateral5.mmSafekeepingAccount, SecuritiesCollateral7.mmSafekeepingAccount,
					TransactionDetails97.mmSafekeepingAccount, AdditionalInformation13.mmSafekeepingAccount, SecuritiesCollateral8.mmSafekeepingAccount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccount";
			definition = "Account on which the security is held.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.TradingMarket> tradingMarket;
	/**
	 * Market(s) on which the security is traded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmTradedSecurity
	 * TradingMarket.mmTradedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradingMarket
	 * TradingMarket}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1#mmLocalMarketAnnex
	 * FundProcessingPassport1.mmLocalMarketAnnex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmPlaceOfTrade
	 * SecuritiesTradeDetails51.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#mmPlaceOfTrade
	 * SecuritiesTradeDetails53.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#mmPlaceOfTrade
	 * SecuritiesTradeDetails55.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmPlaceOfTrade
	 * SecuritiesTradeDetails56.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54#mmPlaceOfTrade
	 * SecuritiesTradeDetails54.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#mmPlaceOfTrade
	 * SecuritiesTradeDetails52.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#mmPlaceOfTrade
	 * SecuritiesTradeDetails50.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmPlaceOfTrade
	 * CorporateActionOption132.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#mmPlaceOfTrade
	 * SecuritiesTradeDetails67.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmPlaceOfTrade
	 * SecuritiesTradeDetails68.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmPlaceOfTrade
	 * TransactionDetails97.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmPlaceOfTrade
	 * SecuritiesFinancingTransactionDetails35.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#mmPlaceOfTrade
	 * TransactionDetails96.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmPlaceOfTrade
	 * TransactionDetails95.mmPlaceOfTrade}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market(s) on which the security is traded."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTradingMarket = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FundProcessingPassport1.mmLocalMarketAnnex, SecuritiesTradeDetails51.mmPlaceOfTrade, SecuritiesTradeDetails53.mmPlaceOfTrade, SecuritiesTradeDetails55.mmPlaceOfTrade,
					SecuritiesTradeDetails56.mmPlaceOfTrade, SecuritiesTradeDetails54.mmPlaceOfTrade, SecuritiesTradeDetails52.mmPlaceOfTrade, SecuritiesTradeDetails50.mmPlaceOfTrade, CorporateActionOption132.mmPlaceOfTrade,
					SecuritiesTradeDetails67.mmPlaceOfTrade, SecuritiesTradeDetails68.mmPlaceOfTrade, TransactionDetails97.mmPlaceOfTrade, SecuritiesFinancingTransactionDetails35.mmPlaceOfTrade, TransactionDetails96.mmPlaceOfTrade,
					TransactionDetails95.mmPlaceOfTrade);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingMarket";
			definition = "Market(s) on which the security is traded.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmTradedSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.TradingMarket> placeOfListing;
	/**
	 * Market(s) on which the security is listed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmListedSecurity
	 * TradingMarket.mmListedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradingMarket
	 * TradingMarket}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmPlaceOfListing
	 * FinancialInstrumentAttributes44.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDescription3#mmPlaceOfListing
	 * FinancialInstrumentDescription3.mmPlaceOfListing}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmPlaceOfListing
	 * TradeLeg8.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg10#mmPlaceOfListing
	 * TradeLeg10.mmPlaceOfListing}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmPlaceOfListing
	 * TradeLeg9.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmPlaceOfListing
	 * AggregateBalancePerSafekeepingPlace28.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#mmPlaceOfListing
	 * AggregateBalancePerSafekeepingPlace29.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmPlaceOfListing
	 * FinancialInstrumentAttributes63.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmPlaceOfListing
	 * FinancialInstrumentAttributes64.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VolumeCapReport1#mmTradingVenue
	 * VolumeCapReport1.mmTradingVenue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11#mmTradingVenue
	 * TransparencyDataReport11.mmTradingVenue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport13#mmTradingVenue
	 * TransparencyDataReport13.mmTradingVenue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5#mmTradingVenueRelatedAttributes
	 * SecuritiesReferenceDataReport5.mmTradingVenueRelatedAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12#mmTradingVenue
	 * TransparencyDataReport12.mmTradingVenue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12#mmRelevantMarket
	 * TransparencyDataReport12.mmRelevantMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport15#mmTradingVenue
	 * TransparencyDataReport15.mmTradingVenue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#mmTradingVenue
	 * TransparencyDataReport10.mmTradingVenue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14#mmTradingVenue
	 * TransparencyDataReport14.mmTradingVenue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmPlaceOfListing
	 * FinancialInstrumentAttributes79.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#mmPlaceOfListing
	 * FinancialInstrumentAttributes81.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmPlaceOfListing
	 * FinancialInstrumentAttributes80.mmPlaceOfListing}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market(s) on which the security is listed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPlaceOfListing = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes44.mmPlaceOfListing, FinancialInstrumentDescription3.mmPlaceOfListing, TradeLeg8.mmPlaceOfListing, TradeLeg10.mmPlaceOfListing, TradeLeg9.mmPlaceOfListing,
					AggregateBalancePerSafekeepingPlace28.mmPlaceOfListing, AggregateBalancePerSafekeepingPlace29.mmPlaceOfListing, FinancialInstrumentAttributes63.mmPlaceOfListing, FinancialInstrumentAttributes64.mmPlaceOfListing,
					VolumeCapReport1.mmTradingVenue, TransparencyDataReport11.mmTradingVenue, TransparencyDataReport13.mmTradingVenue, SecuritiesReferenceDataReport5.mmTradingVenueRelatedAttributes, TransparencyDataReport12.mmTradingVenue,
					TransparencyDataReport12.mmRelevantMarket, TransparencyDataReport15.mmTradingVenue, TransparencyDataReport10.mmTradingVenue, TransparencyDataReport14.mmTradingVenue, FinancialInstrumentAttributes79.mmPlaceOfListing,
					FinancialInstrumentAttributes81.mmPlaceOfListing, FinancialInstrumentAttributes80.mmPlaceOfListing);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlaceOfListing";
			definition = "Market(s) on which the security is listed.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmListedSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.BasicSecuritiesRegistration> registration;
	/**
	 * Information related to registration of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmSecurity
	 * BasicSecuritiesRegistration.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
	 * BasicSecuritiesRegistration}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation1#mmRegistrationDetails
	 * PartyTextInformation1.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmRegistration
	 * SettlementDetails43.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount6#mmRegistrationDetails
	 * SecuritiesAccount6.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmAdditionalPhysicalOrRegistrationDetails
	 * Order17.mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmAdditionalPhysicalOrRegistrationDetails
	 * Order18.mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails100#mmRegistration
	 * SettlementDetails100.mmRegistration}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldIndicator6#mmReason
	 * HoldIndicator6.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmRegistration
	 * SettlementDetails128.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmRegistration
	 * SettlementDetails120.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmRegistration
	 * SettlementDetails119.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125#mmRegistration
	 * SettlementDetails125.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmRegistration
	 * SettlementDetails126.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails27.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails28.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails26.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmRegistration
	 * SettlementDetails122.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#mmRegistration
	 * SettlementDetails127.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmRegistration
	 * SettlementDetails121.mmRegistration}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to registration of securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRegistration = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(PartyTextInformation1.mmRegistrationDetails, SettlementDetails43.mmRegistration, SecuritiesAccount6.mmRegistrationDetails, Order17.mmAdditionalPhysicalOrRegistrationDetails,
					Order18.mmAdditionalPhysicalOrRegistrationDetails, SettlementDetails100.mmRegistration, HoldIndicator6.mmReason, SettlementDetails128.mmRegistration, SettlementDetails120.mmRegistration,
					SettlementDetails119.mmRegistration, SettlementDetails125.mmRegistration, SettlementDetails126.mmRegistration, SecuritiesSettlementTransactionDetails27.mmAdditionalPhysicalOrRegistrationDetails,
					SecuritiesSettlementTransactionDetails28.mmAdditionalPhysicalOrRegistrationDetails, SecuritiesSettlementTransactionDetails26.mmAdditionalPhysicalOrRegistrationDetails, SettlementDetails122.mmRegistration,
					SettlementDetails127.mmRegistration, SettlementDetails121.mmRegistration);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Registration";
			definition = "Information related to registration of securities.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BasicSecuritiesRegistration.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BasicSecuritiesRegistration.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesRestriction> restriction;
	/**
	 * Regulatory restriction(s) linked to the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction#mmSecurity
	 * SecuritiesRestriction.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction
	 * SecuritiesRestriction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmLegalRestrictions
	 * SettlementDetails43.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#mmLegalRestrictions
	 * SettlementDetails96.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmLegalRestrictions
	 * SettlementDetails97.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails100#mmLegalRestrictions
	 * SettlementDetails100.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#mmLegalRestrictions
	 * SettlementDetails98.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative29#mmSecurityRestriction
	 * CorporateActionNarrative29.mmSecurityRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmLegalRestrictions
	 * SettlementDetails128.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmLegalRestrictions
	 * SettlementDetails120.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmLegalRestrictions
	 * SettlementDetails119.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmLegalRestrictions
	 * SettlementDetails126.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmLegalRestrictions
	 * SettlementDetails122.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#mmLegalRestrictions
	 * SettlementDetails127.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmLegalRestrictions
	 * SettlementDetails121.mmLegalRestrictions}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restriction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Regulatory restriction(s) linked to the security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRestriction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementDetails43.mmLegalRestrictions, SettlementDetails96.mmLegalRestrictions, SettlementDetails97.mmLegalRestrictions, SettlementDetails100.mmLegalRestrictions,
					SettlementDetails98.mmLegalRestrictions, CorporateActionNarrative29.mmSecurityRestriction, SettlementDetails128.mmLegalRestrictions, SettlementDetails120.mmLegalRestrictions, SettlementDetails119.mmLegalRestrictions,
					SettlementDetails126.mmLegalRestrictions, SettlementDetails122.mmLegalRestrictions, SettlementDetails127.mmLegalRestrictions, SettlementDetails121.mmLegalRestrictions);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Restriction";
			definition = "Regulatory restriction(s) linked to the security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesRestriction.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesRestriction.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CorporateActionEvent> corporateEvent;
	/**
	 * Corporate event linked to the security
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmUnderlyingSecurity
	 * CorporateActionEvent.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification40#mmCorporateActionEventAndBalance
	 * AccountIdentification40.mmCorporateActionEventAndBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmCorporateActionEventType
	 * IntraPositionDetails41.mmCorporateActionEventType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate event linked to the security"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCorporateEvent = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AccountIdentification40.mmCorporateActionEventAndBalance, IntraPositionDetails41.mmCorporateActionEventType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateEvent";
			definition = "Corporate event linked to the security";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmUnderlyingSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	protected YesNoIndicator temporaryFinancialInstrumentIndicator;
	/**
	 * Specifies that the security is a temporary security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1#mmTemporaryFinancialInstrumentIndicator
	 * SecurityOption1.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator3Choice#mmTemporaryIndicator
	 * TemporaryFinancialInstrumentIndicator3Choice.mmTemporaryIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator3Choice#mmProprietary
	 * TemporaryFinancialInstrumentIndicator3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption60.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption59.mmTemporaryFinancialInstrumentIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TemporaryFinancialInstrumentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies that the security is a temporary security."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTemporaryFinancialInstrumentIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityOption1.mmTemporaryFinancialInstrumentIndicator, TemporaryFinancialInstrumentIndicator3Choice.mmTemporaryIndicator, TemporaryFinancialInstrumentIndicator3Choice.mmProprietary,
					SecuritiesOption60.mmTemporaryFinancialInstrumentIndicator, SecuritiesOption59.mmTemporaryFinancialInstrumentIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TemporaryFinancialInstrumentIndicator";
			definition = "Specifies that the security is a temporary security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getTemporaryFinancialInstrumentIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime availableDate;
	/**
	 * Date on which securities become available for sale.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate3#mmAvailableDate
	 * CorporateActionDate3.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate12#mmAvailableDate
	 * SecurityDate12.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate11#mmAvailableDate
	 * SecurityDate11.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmAvailableDate
	 * IntraPositionDetails41.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails13#mmAvailableDate
	 * IntraPositionMovementDetails13.mmAvailableDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which securities become available for sale."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAvailableDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate3.mmAvailableDate, SecurityDate12.mmAvailableDate, SecurityDate11.mmAvailableDate, IntraPositionDetails41.mmAvailableDate, IntraPositionMovementDetails13.mmAvailableDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AvailableDate";
			definition = "Date on which securities become available for sale.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getAvailableDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max350Text declarationDetails;
	/**
	 * Provides declaration details narrative relative to the financial
	 * instrument, eg, beneficial ownership.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative2#mmDeclarationDetails
	 * CorporateActionNarrative2.mmDeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmDeclarationDetails
	 * BeneficialOwner1.mmDeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#mmDeclarationDetails
	 * BeneficialOwner2.mmDeclarationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclarationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides declaration details narrative relative to the financial instrument, eg, beneficial ownership."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDeclarationDetails = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionNarrative2.mmDeclarationDetails, BeneficialOwner1.mmDeclarationDetails, BeneficialOwner2.mmDeclarationDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeclarationDetails";
			definition = "Provides declaration details narrative relative to the financial instrument, eg, beneficial ownership.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getDeclarationDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Spread spread;
	/**
	 * Spread that uses the security as benchmark reference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Spread#mmBenchmarkSecurity
	 * Spread.mmBenchmarkSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Spread Spread}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate1#mmSpread
	 * CorporateActionRate1.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#mmSpread
	 * CorporateActionRate66.mmSpread}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Spread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Spread that uses the security as benchmark reference."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSpread = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate1.mmSpread, CorporateActionRate66.mmSpread);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "Spread that uses the security as benchmark reference.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.mmBenchmarkSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Dividend> dividend;
	/**
	 * Dividend per financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmSecurity
	 * Dividend.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmDividendType
	 * CorporateAction2.mmDividendType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmDividendType
	 * CorporateAction31.mmDividendType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend per financial instrument."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDividend = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateAction2.mmDividendType, CorporateAction31.mmDividendType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Dividend";
			definition = "Dividend per financial instrument.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
		}
	};
	protected SecuritiesBalance balance;
	/**
	 * Balance of the account which holds a specific security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecurity
	 * SecuritiesBalance.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of the account which holds a specific security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Balance";
			definition = "Balance of the account which holds a specific security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};
	protected YesNoIndicator fungibleIndicator;
	/**
	 * Indicates whether a security is interchangeable, ie, the security is
	 * allowed to be replaced by another security, without loss of value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount2#mmFungibleIndicator
	 * SafekeepingAccount2.mmFungibleIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification3#mmFungibleIndicator
	 * SubAccountIdentification3.mmFungibleIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification5#mmFungibleIndicator
	 * SubAccountIdentification5.mmFungibleIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FungibleIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a security is interchangeable, ie, the security is allowed to be replaced by another security, without loss of value."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFungibleIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SafekeepingAccount2.mmFungibleIndicator, SubAccountIdentification3.mmFungibleIndicator, SubAccountIdentification5.mmFungibleIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FungibleIndicator";
			definition = "Indicates whether a security is interchangeable, ie, the security is allowed to be replaced by another security, without loss of value.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getFungibleIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AppearanceCode appearance;
	/**
	 * Specifies the deliverability of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AppearanceCode
	 * AppearanceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmAppearance
	 * FutureOrOptionDetails1.mmAppearance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Appearance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the deliverability of a security."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAppearance = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FutureOrOptionDetails1.mmAppearance);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Appearance";
			definition = "Specifies the deliverability of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AppearanceCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getAppearance", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number nearTermPositionLimit;
	/**
	 * Position limit in the near-term contract for a given exchange-traded
	 * product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmNearTermPositionLimit
	 * FutureOrOptionDetails1.mmNearTermPositionLimit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NearTermPositionLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Position limit in the near-term contract for a given exchange-traded product."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNearTermPositionLimit = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FutureOrOptionDetails1.mmNearTermPositionLimit);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NearTermPositionLimit";
			definition = "Position limit in the near-term contract for a given exchange-traded product.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getNearTermPositionLimit", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISOYearMonth contractSettlementMonth;
	/**
	 * Specifies when the contract (i.e. MBS/TBA) will settle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISOYearMonth ISOYearMonth}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmContractSettlementMonth
	 * FutureOrOptionDetails1.mmContractSettlementMonth}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractSettlementMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies when the contract (i.e. MBS/TBA) will settle."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmContractSettlementMonth = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FutureOrOptionDetails1.mmContractSettlementMonth);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ContractSettlementMonth";
			definition = "Specifies when the contract (i.e. MBS/TBA) will settle.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getContractSettlementMonth", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number minimumTradingPricingIncrement;
	/**
	 * Minimum price increase for a given exchange-traded Instrument
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmMinimumTradingPricingIncrement
	 * FutureOrOptionDetails1.mmMinimumTradingPricingIncrement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumTradingPricingIncrement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum price increase for a given exchange-traded Instrument"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMinimumTradingPricingIncrement = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FutureOrOptionDetails1.mmMinimumTradingPricingIncrement);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumTradingPricingIncrement";
			definition = "Minimum price increase for a given exchange-traded Instrument";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getMinimumTradingPricingIncrement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Rating> rating;
	/**
	 * Rating(s) of the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Rating#mmSecurity
	 * Rating.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Rating Rating}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmRating
	 * FinancialInstrumentStipulations2.mmRating}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmRating
	 * FutureOrOptionDetails1.mmRating}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmRating
	 * FinancialInstrumentAttributes44.mmRating}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rating"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rating(s) of the security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRating = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentStipulations2.mmRating, FutureOrOptionDetails1.mmRating, FinancialInstrumentAttributes44.mmRating);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rating";
			definition = "Rating(s) of the security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Rating.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Rating.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CouponAttached> couponAttached;
	/**
	 * Coupon information of the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached#mmSecurity
	 * CouponAttached.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CouponAttached
	 * CouponAttached}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmCouponRange
	 * FinancialInstrumentStipulations2.mmCouponRange}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CouponAttached"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Coupon information of the security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCouponAttached = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentStipulations2.mmCouponRange);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CouponAttached";
			definition = "Coupon information of the security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CouponAttached.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CouponAttached.mmObject();
		}
	};
	protected Sector sector;
	/**
	 * Indicates the market sector the security is classified as
	 * pharmaceuticals, automobile, housing, etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Sector#mmSecurity
	 * Sector.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Sector Sector}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmSector
	 * FinancialInstrumentStipulations2.mmSector}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sector"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the market sector the security is classified as pharmaceuticals, automobile, housing, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSector = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentStipulations2.mmSector);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Sector";
			definition = "Indicates the market sector the security is classified as pharmaceuticals, automobile, housing, etc.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Sector.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Sector.mmObject();
		}
	};
	protected YesNoIndicator warrantAttachedOnDelivery;
	/**
	 * Indicates whether the warrants on a financial instrument (which has been
	 * traded cum warrants) will be attached on delivery.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmWarrantAttachedOnDelivery
	 * FinancialInstrumentAttributes44.mmWarrantAttachedOnDelivery}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WarrantAttachedOnDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the warrants on a financial instrument (which has been traded cum warrants) will be attached on delivery."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmWarrantAttachedOnDelivery = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes44.mmWarrantAttachedOnDelivery);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WarrantAttachedOnDelivery";
			definition = "Indicates whether the warrants on a financial instrument (which has been traded cum warrants) will be attached on delivery.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getWarrantAttachedOnDelivery", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator strippableIndicator;
	/**
	 * Indicates whether the interest is separable from the principal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmStrippableIndicator
	 * FutureOrOptionDetails1.mmStrippableIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrippableIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the interest is separable from the principal."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStrippableIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FutureOrOptionDetails1.mmStrippableIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StrippableIndicator";
			definition = "Indicates whether the interest is separable from the principal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getStrippableIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime firstDealingDate;
	/**
	 * Date on which new securities begin trading.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmFirstDealingDate
	 * FutureOrOptionDetails1.mmFirstDealingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate3#mmFirstDealingDate
	 * CorporateActionDate3.mmFirstDealingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstDealingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which new securities begin trading."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFirstDealingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FutureOrOptionDetails1.mmFirstDealingDate, CorporateActionDate3.mmFirstDealingDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FirstDealingDate";
			definition = "Date on which new securities begin trading.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getFirstDealingDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesTax> taxDetails;
	/**
	 * Tax details of the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmSecurity
	 * SecuritiesTax.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTax
	 * SecuritiesTax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount8#mmStampDuty
	 * SecuritiesAccount8.mmStampDuty}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax details of the security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTaxDetails = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesAccount8.mmStampDuty);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxDetails";
			definition = "Tax details of the security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
		}
	};
	protected SecuritiesTrade securitiesTrade;
	/**
	 * Trade in which the security is involved.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecurity
	 * SecuritiesTrade.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade in which the security is involved."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesTrade";
			definition = "Trade in which the security is involved.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
		}
	};
	protected Jurisdiction registrationJurisdiction;
	/**
	 * Jurisdiction (country, county, state, province, city) in which the
	 * security is legally recorded for regulatory and/or tax purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmRegisteredSecurities
	 * Jurisdiction.mmRegisteredSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Jurisdiction
	 * Jurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationJurisdiction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Jurisdiction (country, county, state, province, city) in which the security is legally recorded for regulatory and/or tax purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRegistrationJurisdiction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationJurisdiction";
			definition = "Jurisdiction (country, county, state, province, city) in which the security is legally recorded for regulatory and/or tax purposes.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmRegisteredSecurities;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesPartyRole> partyRole;
	/**
	 * Specifies roles played by a party that are linked to the handling of
	 * securities but not related to a specific process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole#mmSecurity
	 * SecuritiesPartyRole.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole
	 * SecuritiesPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies roles played by a party that are linked to the handling of securities but not related to a specific process."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies roles played by a party that are linked to the handling of securities but not related to a specific process.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPartyRole.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPartyRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesStatus> securityStatus;
	/**
	 * Specifies the status of the security within its lifecycle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus#mmSecurity
	 * SecuritiesStatus.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesStatus
	 * SecuritiesStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the security within its lifecycle."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecurityStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecurityStatus";
			definition = "Specifies the status of the security within its lifecycle.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesStatus.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesStatus.mmObject();
		}
	};
	protected SecuritiesModification modification;
	/**
	 * Modification process which applies to a specific security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmNewSecurityReferenceData
	 * SecuritiesModification.mmNewSecurityReferenceData}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification
	 * SecuritiesModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Modification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification process which applies to a specific security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmModification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Modification";
			definition = "Modification process which applies to a specific security.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmNewSecurityReferenceData;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.RedemptionSchedule> redemptionSchedule;
	/**
	 * RedemptionSchedule(s) linked to the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmSecurity
	 * RedemptionSchedule.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RedemptionSchedule
	 * RedemptionSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionSchedule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "RedemptionSchedule(s) linked to the security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRedemptionSchedule = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RedemptionSchedule";
			definition = "RedemptionSchedule(s) linked to the security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesSettlement> securitiesSettlement;
	/**
	 * Settlement of a specific security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecurity
	 * SecuritiesSettlement.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral5#mmSettlementParameters
	 * SecuritiesCollateral5.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#mmSettlementParameters
	 * SecuritiesCollateral7.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral8#mmSettlementParameters
	 * SecuritiesCollateral8.mmSettlementParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement of a specific security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesCollateral5.mmSettlementParameters, SecuritiesCollateral7.mmSettlementParameters, SecuritiesCollateral8.mmSettlementParameters);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Settlement of a specific security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
		}
	};
	protected SecuritiesTransfer securitiesTransfer;
	/**
	 * Transfer process in which that security is transferred..
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmSecurity
	 * SecuritiesTransfer.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer process in which that security is transferred.."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesTransfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesTransfer";
			definition = "Transfer process in which that security is transferred..";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.AgentCorporateActionStandingInstruction> corporateActionStandingInstructions;
	/**
	 * Standing instructions related to the security in the context of corporate
	 * action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction#mmSecurity
	 * AgentCorporateActionStandingInstruction.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction
	 * AgentCorporateActionStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionStandingInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Standing instructions related to the security in the context of corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCorporateActionStandingInstructions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionStandingInstructions";
			definition = "Standing instructions related to the security in the context of corporate action.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.mmObject();
		}
	};
	protected Quote quote;
	/**
	 * Quote of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmQuotedSecurity
	 * Quote.mmQuotedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote of a security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmQuote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quote";
			definition = "Quote of a security.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.mmQuotedSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
		}
	};
	protected SecuritiesOrder securitiesOrder;
	/**
	 * Order for which a specific security is indicated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedSecurity
	 * SecuritiesOrder.mmOrderedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order for which a specific security is indicated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrder";
			definition = "Order for which a specific security is indicated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmOrderedSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};
	protected VariableInterest relatedVariableInterest;
	/**
	 * Variable interest parameters specified for interest related to a
	 * financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmBenchmarkReference
	 * VariableInterest.mmBenchmarkReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedVariableInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Variable interest parameters specified for interest related to a financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedVariableInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedVariableInterest";
			definition = "Variable interest parameters specified for interest related to a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmBenchmarkReference;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesConversion> conversion;
	/**
	 * Information on the conversion exchange of an entitlement or of preferred
	 * equities or of convertible bonds, into another form of securities,
	 * usually common equities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmSecurityIdentification
	 * SecuritiesConversion.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Conversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the conversion exchange of an entitlement or of preferred equities or of convertible bonds, into another form of securities, usually common equities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmConversion = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Conversion";
			definition = "Information on the conversion exchange of an entitlement or of preferred equities or of convertible bonds, into another form of securities, usually common equities.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmSecurityIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ComponentSecurity> componentSecurity;
	/**
	 * The security is part of the component security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ComponentSecurity#mmSecurity
	 * ComponentSecurity.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ComponentSecurity
	 * ComponentSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ComponentSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The security is part of the component security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmComponentSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ComponentSecurity";
			definition = "The security is part of the component security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ComponentSecurity.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ComponentSecurity.mmObject();
		}
	};
	protected YesNoIndicator recompositionIndicator;
	/**
	 * Indicates whether the interest and the principal can be recomposed. This
	 * is the reverse operation of stripping.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecompositionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the interest and the principal can be recomposed. This is the reverse operation of stripping."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRecompositionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RecompositionIndicator";
			definition = "Indicates whether the interest and the principal can be recomposed. This is the reverse operation of stripping.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getRecompositionIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text series;
	/**
	 * Identifier that links multiple security classes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Series"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier that links multiple security classes."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSeries = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Series";
			definition = "Identifier that links multiple security classes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getSeries", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate percentageOfDebtClaim;
	/**
	 * Percentage of the underlying assets of a fund that represents a debt and
	 * is in the scope of the EU Savings directive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmPercentageOfDebtClaims
	 * FinancialInstrumentAttributes44.mmPercentageOfDebtClaims}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmPercentageOfDebtClaim
	 * FinancialInstrumentAttributes79.mmPercentageOfDebtClaim}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageOfDebtClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the underlying assets of a fund that represents a debt and is in the scope of the EU Savings directive."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPercentageOfDebtClaim = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes44.mmPercentageOfDebtClaims, FinancialInstrumentAttributes79.mmPercentageOfDebtClaim);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PercentageOfDebtClaim";
			definition = "Percentage of the underlying assets of a fund that represents a debt and is in the scope of the EU Savings directive.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getPercentageOfDebtClaim", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate coverRate;
	/**
	 * Amount of dividends the issuer intends to pay out the following year
	 * based on their normalised earnings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of dividends the issuer intends to pay out the following year based on their normalised earnings."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCoverRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CoverRate";
			definition = "Amount of dividends the issuer intends to pay out the following year based on their normalised earnings.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getCoverRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MaturityRedemptionTypeCode maturityRedemption;
	/**
	 * Return of an investor's principal in a security at maturity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MaturityRedemptionTypeCode
	 * MaturityRedemptionTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityRedemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Return of an investor's principal in a security at maturity."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMaturityRedemption = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityRedemption";
			definition = "Return of an investor's principal in a security at maturity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MaturityRedemptionTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getMaturityRedemption", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MarginCall relatedMarginCall;
	/**
	 * Margin call for which the associated securities are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmSecurity
	 * MarginCall.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MarginCall
	 * MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMarginCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin call for which the associated securities are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedMarginCall = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedMarginCall";
			definition = "Margin call for which the associated securities are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.MarginCall.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
		}
	};
	protected Party closeLink;
	/**
	 * Situation in which two entities are linked because one of these entities
	 * owns some of the capital of the other one, or has a control relationship
	 * with it.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmCloseLinkSecurity
	 * Party.mmCloseLinkSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CloseLink"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Situation in which two entities are linked because one of these entities owns some of the capital of the other one, or has a control relationship with it."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCloseLink = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CloseLink";
			definition = "Situation in which two entities are linked because one of these entities owns some of the capital of the other one, or has a control relationship with it.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Party.mmCloseLinkSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
		}
	};
	protected YesNoIndicator potentialEuroSystemEligibility;
	/**
	 * Indicates that the security is intended to be held in a manner that could
	 * allow the Eurosystem eligibility.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PotentialEuroSystemEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the security is intended to be held in a manner that could allow the Eurosystem eligibility."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPotentialEuroSystemEligibility = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PotentialEuroSystemEligibility";
			definition = "Indicates that the security is intended to be held in a manner that could allow the Eurosystem eligibility.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getPotentialEuroSystemEligibility", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesQuantity minimumQuantity;
	/**
	 * Indicates the minimum tradable quantity of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumQuantityDebt
	 * SecuritiesQuantity.mmMinimumQuantityDebt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmMinimumQuantity
	 * FinancialInstrumentStipulations2.mmMinimumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes44.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes63.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes64.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes79.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes81.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes80.mmMinimumNominalQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the minimum tradable quantity of a security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMinimumQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentStipulations2.mmMinimumQuantity, FinancialInstrumentAttributes44.mmMinimumNominalQuantity, FinancialInstrumentAttributes63.mmMinimumNominalQuantity,
					FinancialInstrumentAttributes64.mmMinimumNominalQuantity, FinancialInstrumentAttributes79.mmMinimumNominalQuantity, FinancialInstrumentAttributes81.mmMinimumNominalQuantity,
					FinancialInstrumentAttributes80.mmMinimumNominalQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantity";
			definition = "Indicates the minimum tradable quantity of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumQuantityDebt;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected YesNoIndicator restrictedIndicator;
	/**
	 * Identifies if the securities is restricted or not (as per Rule 144 of the
	 * Securities and Exchange Commission,that sets the conditions under which
	 * restricted, unregistered and control securities can be sold).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Security
	 * Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies if the securities is restricted or not (as per Rule 144 of the Securities and Exchange Commission,that sets the conditions under which restricted, unregistered and control securities can be sold)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRestrictedIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RestrictedIndicator";
			definition = "Identifies if the securities is restricted or not (as per Rule 144 of the Securities and Exchange Commission,that sets the conditions under which restricted, unregistered and control securities can be sold).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Security.class.getMethod("getRestrictedIndicator", new Class[]{});
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
				name = "Security";
				definition = "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesIdentification.mmIdentifiedSecurity, com.tools20022.repository.entity.Dividend.mmSecurity,
						com.tools20022.repository.entity.SecuritiesPricing.mmSecurity, com.tools20022.repository.entity.Party.mmCloseLinkSecurity, com.tools20022.repository.entity.RedemptionSchedule.mmSecurity,
						com.tools20022.repository.entity.TradingMarket.mmTradedSecurity, com.tools20022.repository.entity.TradingMarket.mmListedSecurity, com.tools20022.repository.entity.SecuritiesAccount.mmSecurity,
						com.tools20022.repository.entity.SecuritiesTax.mmSecurity, com.tools20022.repository.entity.SecuritiesQuantity.mmSecurityIdentification, com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumQuantityDebt,
						com.tools20022.repository.entity.SecuritiesTrade.mmSecurity, com.tools20022.repository.entity.SecuritiesTransfer.mmSecurity, com.tools20022.repository.entity.SecuritiesPartyRole.mmSecurity,
						com.tools20022.repository.entity.SecuritiesSettlement.mmSecurity, com.tools20022.repository.entity.SecuritiesRelatedFees.mmSecurity, com.tools20022.repository.entity.SecuritiesStatus.mmSecurity,
						com.tools20022.repository.entity.VariableInterest.mmBenchmarkReference, com.tools20022.repository.entity.CouponAttached.mmSecurity, com.tools20022.repository.entity.SecuritiesConversion.mmSecurityIdentification,
						com.tools20022.repository.entity.BasicSecuritiesRegistration.mmSecurity, com.tools20022.repository.entity.SecuritiesRestriction.mmSecurity, com.tools20022.repository.entity.SecuritiesBalance.mmSecurity,
						com.tools20022.repository.entity.CorporateActionEvent.mmUnderlyingSecurity, com.tools20022.repository.entity.SecuritiesModification.mmNewSecurityReferenceData,
						com.tools20022.repository.entity.Spread.mmBenchmarkSecurity, com.tools20022.repository.entity.SecuritiesOrder.mmOrderedSecurity, com.tools20022.repository.entity.Rating.mmSecurity,
						com.tools20022.repository.entity.Sector.mmSecurity, com.tools20022.repository.entity.Jurisdiction.mmRegisteredSecurities, com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.mmSecurity,
						com.tools20022.repository.entity.MarginCall.mmSecurity, com.tools20022.repository.entity.Quote.mmQuotedSecurity, com.tools20022.repository.entity.ComponentSecurity.mmSecurity);
				derivationElement_lazy = () -> Arrays.asList(UnderlyingFinancialInstrument2.mmAttributes, CollateralSubstitution5.mmSecuritiesCollateral, CollateralSubstitution4.mmSecuritiesCollateral,
						CollateralValuation5.mmSecuritiesCollateral, SecuritiesReferenceDataReport5.mmFinancialInstrumentGeneralAttributes, SecurityInstrumentDescription13.mmFinancialInstrumentGeneralAttributes,
						FinancialInstrumentDetails24.mmFinancialInstrumentAttributes, Collateral16.mmSecuritiesCollateral, Collateral17.mmSecuritiesCollateral);
				subType_lazy = () -> Arrays.asList(InvestmentFundClass.mmObject(), Debt.mmObject(), Warrant.mmObject(), Entitlement.mmObject());
				superType_lazy = () -> Asset.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmIdentification, com.tools20022.repository.entity.Security.mmRegisteredDistributionCountry,
						com.tools20022.repository.entity.Security.mmDenominationCurrency, com.tools20022.repository.entity.Security.mmRegistrationForm, com.tools20022.repository.entity.Security.mmDematerialisedIndicator,
						com.tools20022.repository.entity.Security.mmEUSavingsDirective, com.tools20022.repository.entity.Security.mmSecuritiesQuantity, com.tools20022.repository.entity.Security.mmFees,
						com.tools20022.repository.entity.Security.mmPricing, com.tools20022.repository.entity.Security.mmSecuritiesAccount, com.tools20022.repository.entity.Security.mmTradingMarket,
						com.tools20022.repository.entity.Security.mmPlaceOfListing, com.tools20022.repository.entity.Security.mmRegistration, com.tools20022.repository.entity.Security.mmRestriction,
						com.tools20022.repository.entity.Security.mmCorporateEvent, com.tools20022.repository.entity.Security.mmTemporaryFinancialInstrumentIndicator, com.tools20022.repository.entity.Security.mmAvailableDate,
						com.tools20022.repository.entity.Security.mmDeclarationDetails, com.tools20022.repository.entity.Security.mmSpread, com.tools20022.repository.entity.Security.mmDividend,
						com.tools20022.repository.entity.Security.mmBalance, com.tools20022.repository.entity.Security.mmFungibleIndicator, com.tools20022.repository.entity.Security.mmAppearance,
						com.tools20022.repository.entity.Security.mmNearTermPositionLimit, com.tools20022.repository.entity.Security.mmContractSettlementMonth, com.tools20022.repository.entity.Security.mmMinimumTradingPricingIncrement,
						com.tools20022.repository.entity.Security.mmRating, com.tools20022.repository.entity.Security.mmCouponAttached, com.tools20022.repository.entity.Security.mmSector,
						com.tools20022.repository.entity.Security.mmWarrantAttachedOnDelivery, com.tools20022.repository.entity.Security.mmStrippableIndicator, com.tools20022.repository.entity.Security.mmFirstDealingDate,
						com.tools20022.repository.entity.Security.mmTaxDetails, com.tools20022.repository.entity.Security.mmSecuritiesTrade, com.tools20022.repository.entity.Security.mmRegistrationJurisdiction,
						com.tools20022.repository.entity.Security.mmPartyRole, com.tools20022.repository.entity.Security.mmSecurityStatus, com.tools20022.repository.entity.Security.mmModification,
						com.tools20022.repository.entity.Security.mmRedemptionSchedule, com.tools20022.repository.entity.Security.mmSecuritiesSettlement, com.tools20022.repository.entity.Security.mmSecuritiesTransfer,
						com.tools20022.repository.entity.Security.mmCorporateActionStandingInstructions, com.tools20022.repository.entity.Security.mmQuote, com.tools20022.repository.entity.Security.mmSecuritiesOrder,
						com.tools20022.repository.entity.Security.mmRelatedVariableInterest, com.tools20022.repository.entity.Security.mmConversion, com.tools20022.repository.entity.Security.mmComponentSecurity,
						com.tools20022.repository.entity.Security.mmRecompositionIndicator, com.tools20022.repository.entity.Security.mmSeries, com.tools20022.repository.entity.Security.mmPercentageOfDebtClaim,
						com.tools20022.repository.entity.Security.mmCoverRate, com.tools20022.repository.entity.Security.mmMaturityRedemption, com.tools20022.repository.entity.Security.mmRelatedMarginCall,
						com.tools20022.repository.entity.Security.mmCloseLink, com.tools20022.repository.entity.Security.mmPotentialEuroSystemEligibility, com.tools20022.repository.entity.Security.mmMinimumQuantity,
						com.tools20022.repository.entity.Security.mmRestrictedIndicator);
				derivationComponent_lazy = () -> Arrays.asList(FormOfSecurity4Choice.mmObject(), FinancialInstrumentStipulations2.mmObject(), UnderlyingFinancialInstrument2.mmObject(), FinancialInstrumentDescription3.mmObject(),
						FormOfSecurity6Choice.mmObject(), SecurityDate12.mmObject(), TemporaryFinancialInstrumentIndicator3Choice.mmObject(), SecuritiesCollateral6.mmObject(), SecuritiesCollateral5.mmObject(),
						SecuritiesCollateral7.mmObject(), SecurityInstrumentDescription9.mmObject(), SecurityInstrumentDescription11.mmObject(), FinancialInstrument46Choice.mmObject(), FinancialInstrument53.mmObject(),
						TransparencyDataReport11.mmObject(), TransparencyDataReport13.mmObject(), SecuritiesReferenceDataReport5.mmObject(), TransparencyDataReport12.mmObject(), TransparencyDataReport15.mmObject(),
						TransparencyDataReport10.mmObject(), TransparencyDataReport14.mmObject(), FinancialInstrument58.mmObject(), FinancialInstrument48Choice.mmObject(), FinancialInstrumentAttributes3Choice.mmObject(),
						SecurityInstrumentDescription13.mmObject(), FinancialInstrumentDetails25.mmObject(), FinancialInstrumentDetails24.mmObject(), SecuritiesCollateral8.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Security.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecuritiesIdentification> getIdentification() {
		return identification;
	}

	public void setIdentification(List<com.tools20022.repository.entity.SecuritiesIdentification> identification) {
		this.identification = identification;
	}

	public CountryCode getRegisteredDistributionCountry() {
		return registeredDistributionCountry;
	}

	public void setRegisteredDistributionCountry(CountryCode registeredDistributionCountry) {
		this.registeredDistributionCountry = registeredDistributionCountry;
	}

	public CurrencyCode getDenominationCurrency() {
		return denominationCurrency;
	}

	public void setDenominationCurrency(CurrencyCode denominationCurrency) {
		this.denominationCurrency = denominationCurrency;
	}

	public FormOfSecurityCode getRegistrationForm() {
		return registrationForm;
	}

	public void setRegistrationForm(FormOfSecurityCode registrationForm) {
		this.registrationForm = registrationForm;
	}

	public YesNoIndicator getDematerialisedIndicator() {
		return dematerialisedIndicator;
	}

	public void setDematerialisedIndicator(YesNoIndicator dematerialisedIndicator) {
		this.dematerialisedIndicator = dematerialisedIndicator;
	}

	public EUSavingsDirectiveCode getEUSavingsDirective() {
		return eUSavingsDirective;
	}

	public void setEUSavingsDirective(EUSavingsDirectiveCode eUSavingsDirective) {
		this.eUSavingsDirective = eUSavingsDirective;
	}

	public List<SecuritiesQuantity> getSecuritiesQuantity() {
		return securitiesQuantity;
	}

	public void setSecuritiesQuantity(List<com.tools20022.repository.entity.SecuritiesQuantity> securitiesQuantity) {
		this.securitiesQuantity = securitiesQuantity;
	}

	public List<SecuritiesRelatedFees> getFees() {
		return fees;
	}

	public void setFees(List<com.tools20022.repository.entity.SecuritiesRelatedFees> fees) {
		this.fees = fees;
	}

	public List<SecuritiesPricing> getPricing() {
		return pricing;
	}

	public void setPricing(List<com.tools20022.repository.entity.SecuritiesPricing> pricing) {
		this.pricing = pricing;
	}

	public SecuritiesAccount getSecuritiesAccount() {
		return securitiesAccount;
	}

	public void setSecuritiesAccount(com.tools20022.repository.entity.SecuritiesAccount securitiesAccount) {
		this.securitiesAccount = securitiesAccount;
	}

	public List<TradingMarket> getTradingMarket() {
		return tradingMarket;
	}

	public void setTradingMarket(List<com.tools20022.repository.entity.TradingMarket> tradingMarket) {
		this.tradingMarket = tradingMarket;
	}

	public List<TradingMarket> getPlaceOfListing() {
		return placeOfListing;
	}

	public void setPlaceOfListing(List<com.tools20022.repository.entity.TradingMarket> placeOfListing) {
		this.placeOfListing = placeOfListing;
	}

	public List<BasicSecuritiesRegistration> getRegistration() {
		return registration;
	}

	public void setRegistration(List<com.tools20022.repository.entity.BasicSecuritiesRegistration> registration) {
		this.registration = registration;
	}

	public List<SecuritiesRestriction> getRestriction() {
		return restriction;
	}

	public void setRestriction(List<com.tools20022.repository.entity.SecuritiesRestriction> restriction) {
		this.restriction = restriction;
	}

	public List<CorporateActionEvent> getCorporateEvent() {
		return corporateEvent;
	}

	public void setCorporateEvent(List<com.tools20022.repository.entity.CorporateActionEvent> corporateEvent) {
		this.corporateEvent = corporateEvent;
	}

	public YesNoIndicator getTemporaryFinancialInstrumentIndicator() {
		return temporaryFinancialInstrumentIndicator;
	}

	public void setTemporaryFinancialInstrumentIndicator(YesNoIndicator temporaryFinancialInstrumentIndicator) {
		this.temporaryFinancialInstrumentIndicator = temporaryFinancialInstrumentIndicator;
	}

	public ISODateTime getAvailableDate() {
		return availableDate;
	}

	public void setAvailableDate(ISODateTime availableDate) {
		this.availableDate = availableDate;
	}

	public Max350Text getDeclarationDetails() {
		return declarationDetails;
	}

	public void setDeclarationDetails(Max350Text declarationDetails) {
		this.declarationDetails = declarationDetails;
	}

	public Spread getSpread() {
		return spread;
	}

	public void setSpread(com.tools20022.repository.entity.Spread spread) {
		this.spread = spread;
	}

	public List<Dividend> getDividend() {
		return dividend;
	}

	public void setDividend(List<com.tools20022.repository.entity.Dividend> dividend) {
		this.dividend = dividend;
	}

	public SecuritiesBalance getBalance() {
		return balance;
	}

	public void setBalance(com.tools20022.repository.entity.SecuritiesBalance balance) {
		this.balance = balance;
	}

	public YesNoIndicator getFungibleIndicator() {
		return fungibleIndicator;
	}

	public void setFungibleIndicator(YesNoIndicator fungibleIndicator) {
		this.fungibleIndicator = fungibleIndicator;
	}

	public AppearanceCode getAppearance() {
		return appearance;
	}

	public void setAppearance(AppearanceCode appearance) {
		this.appearance = appearance;
	}

	public Number getNearTermPositionLimit() {
		return nearTermPositionLimit;
	}

	public void setNearTermPositionLimit(Number nearTermPositionLimit) {
		this.nearTermPositionLimit = nearTermPositionLimit;
	}

	public ISOYearMonth getContractSettlementMonth() {
		return contractSettlementMonth;
	}

	public void setContractSettlementMonth(ISOYearMonth contractSettlementMonth) {
		this.contractSettlementMonth = contractSettlementMonth;
	}

	public Number getMinimumTradingPricingIncrement() {
		return minimumTradingPricingIncrement;
	}

	public void setMinimumTradingPricingIncrement(Number minimumTradingPricingIncrement) {
		this.minimumTradingPricingIncrement = minimumTradingPricingIncrement;
	}

	public List<Rating> getRating() {
		return rating;
	}

	public void setRating(List<com.tools20022.repository.entity.Rating> rating) {
		this.rating = rating;
	}

	public List<CouponAttached> getCouponAttached() {
		return couponAttached;
	}

	public void setCouponAttached(List<com.tools20022.repository.entity.CouponAttached> couponAttached) {
		this.couponAttached = couponAttached;
	}

	public Sector getSector() {
		return sector;
	}

	public void setSector(com.tools20022.repository.entity.Sector sector) {
		this.sector = sector;
	}

	public YesNoIndicator getWarrantAttachedOnDelivery() {
		return warrantAttachedOnDelivery;
	}

	public void setWarrantAttachedOnDelivery(YesNoIndicator warrantAttachedOnDelivery) {
		this.warrantAttachedOnDelivery = warrantAttachedOnDelivery;
	}

	public YesNoIndicator getStrippableIndicator() {
		return strippableIndicator;
	}

	public void setStrippableIndicator(YesNoIndicator strippableIndicator) {
		this.strippableIndicator = strippableIndicator;
	}

	public ISODateTime getFirstDealingDate() {
		return firstDealingDate;
	}

	public void setFirstDealingDate(ISODateTime firstDealingDate) {
		this.firstDealingDate = firstDealingDate;
	}

	public List<SecuritiesTax> getTaxDetails() {
		return taxDetails;
	}

	public void setTaxDetails(List<com.tools20022.repository.entity.SecuritiesTax> taxDetails) {
		this.taxDetails = taxDetails;
	}

	public SecuritiesTrade getSecuritiesTrade() {
		return securitiesTrade;
	}

	public void setSecuritiesTrade(com.tools20022.repository.entity.SecuritiesTrade securitiesTrade) {
		this.securitiesTrade = securitiesTrade;
	}

	public Jurisdiction getRegistrationJurisdiction() {
		return registrationJurisdiction;
	}

	public void setRegistrationJurisdiction(com.tools20022.repository.entity.Jurisdiction registrationJurisdiction) {
		this.registrationJurisdiction = registrationJurisdiction;
	}

	public List<SecuritiesPartyRole> getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(List<com.tools20022.repository.entity.SecuritiesPartyRole> partyRole) {
		this.partyRole = partyRole;
	}

	public List<SecuritiesStatus> getSecurityStatus() {
		return securityStatus;
	}

	public void setSecurityStatus(List<com.tools20022.repository.entity.SecuritiesStatus> securityStatus) {
		this.securityStatus = securityStatus;
	}

	public SecuritiesModification getModification() {
		return modification;
	}

	public void setModification(com.tools20022.repository.entity.SecuritiesModification modification) {
		this.modification = modification;
	}

	public List<RedemptionSchedule> getRedemptionSchedule() {
		return redemptionSchedule;
	}

	public void setRedemptionSchedule(List<com.tools20022.repository.entity.RedemptionSchedule> redemptionSchedule) {
		this.redemptionSchedule = redemptionSchedule;
	}

	public List<SecuritiesSettlement> getSecuritiesSettlement() {
		return securitiesSettlement;
	}

	public void setSecuritiesSettlement(List<com.tools20022.repository.entity.SecuritiesSettlement> securitiesSettlement) {
		this.securitiesSettlement = securitiesSettlement;
	}

	public SecuritiesTransfer getSecuritiesTransfer() {
		return securitiesTransfer;
	}

	public void setSecuritiesTransfer(com.tools20022.repository.entity.SecuritiesTransfer securitiesTransfer) {
		this.securitiesTransfer = securitiesTransfer;
	}

	public List<AgentCorporateActionStandingInstruction> getCorporateActionStandingInstructions() {
		return corporateActionStandingInstructions;
	}

	public void setCorporateActionStandingInstructions(List<com.tools20022.repository.entity.AgentCorporateActionStandingInstruction> corporateActionStandingInstructions) {
		this.corporateActionStandingInstructions = corporateActionStandingInstructions;
	}

	public Quote getQuote() {
		return quote;
	}

	public void setQuote(com.tools20022.repository.entity.Quote quote) {
		this.quote = quote;
	}

	public SecuritiesOrder getSecuritiesOrder() {
		return securitiesOrder;
	}

	public void setSecuritiesOrder(com.tools20022.repository.entity.SecuritiesOrder securitiesOrder) {
		this.securitiesOrder = securitiesOrder;
	}

	public VariableInterest getRelatedVariableInterest() {
		return relatedVariableInterest;
	}

	public void setRelatedVariableInterest(com.tools20022.repository.entity.VariableInterest relatedVariableInterest) {
		this.relatedVariableInterest = relatedVariableInterest;
	}

	public List<SecuritiesConversion> getConversion() {
		return conversion;
	}

	public void setConversion(List<com.tools20022.repository.entity.SecuritiesConversion> conversion) {
		this.conversion = conversion;
	}

	public List<ComponentSecurity> getComponentSecurity() {
		return componentSecurity;
	}

	public void setComponentSecurity(List<com.tools20022.repository.entity.ComponentSecurity> componentSecurity) {
		this.componentSecurity = componentSecurity;
	}

	public YesNoIndicator getRecompositionIndicator() {
		return recompositionIndicator;
	}

	public void setRecompositionIndicator(YesNoIndicator recompositionIndicator) {
		this.recompositionIndicator = recompositionIndicator;
	}

	public Max35Text getSeries() {
		return series;
	}

	public void setSeries(Max35Text series) {
		this.series = series;
	}

	public PercentageRate getPercentageOfDebtClaim() {
		return percentageOfDebtClaim;
	}

	public void setPercentageOfDebtClaim(PercentageRate percentageOfDebtClaim) {
		this.percentageOfDebtClaim = percentageOfDebtClaim;
	}

	public PercentageRate getCoverRate() {
		return coverRate;
	}

	public void setCoverRate(PercentageRate coverRate) {
		this.coverRate = coverRate;
	}

	public MaturityRedemptionTypeCode getMaturityRedemption() {
		return maturityRedemption;
	}

	public void setMaturityRedemption(MaturityRedemptionTypeCode maturityRedemption) {
		this.maturityRedemption = maturityRedemption;
	}

	public MarginCall getRelatedMarginCall() {
		return relatedMarginCall;
	}

	public void setRelatedMarginCall(com.tools20022.repository.entity.MarginCall relatedMarginCall) {
		this.relatedMarginCall = relatedMarginCall;
	}

	public Party getCloseLink() {
		return closeLink;
	}

	public void setCloseLink(com.tools20022.repository.entity.Party closeLink) {
		this.closeLink = closeLink;
	}

	public YesNoIndicator getPotentialEuroSystemEligibility() {
		return potentialEuroSystemEligibility;
	}

	public void setPotentialEuroSystemEligibility(YesNoIndicator potentialEuroSystemEligibility) {
		this.potentialEuroSystemEligibility = potentialEuroSystemEligibility;
	}

	public SecuritiesQuantity getMinimumQuantity() {
		return minimumQuantity;
	}

	public void setMinimumQuantity(com.tools20022.repository.entity.SecuritiesQuantity minimumQuantity) {
		this.minimumQuantity = minimumQuantity;
	}

	public YesNoIndicator getRestrictedIndicator() {
		return restrictedIndicator;
	}

	public void setRestrictedIndicator(YesNoIndicator restrictedIndicator) {
		this.restrictedIndicator = restrictedIndicator;
	}
}