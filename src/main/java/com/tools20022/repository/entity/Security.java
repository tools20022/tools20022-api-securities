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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.Collateral16#mmSecuritiesCollateral
 * Collateral16.mmSecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Collateral17#mmSecuritiesCollateral
 * Collateral17.mmSecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails29#mmFinancialInstrumentAttributes
 * FinancialInstrumentDetails29.mmFinancialInstrumentAttributes}</li>
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
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesCollateral8
 * SecuritiesCollateral8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails28
 * FinancialInstrumentDetails28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails29
 * FinancialInstrumentDetails29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate16 SecurityDate16}</li>
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
 * "Security"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer."
 * </li>
 * </ul>
 */
public class Security extends Asset {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<SecuritiesIdentification> identification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation110#mmFinancialInstrumentIdentification
	 * CorporateActionGeneralInformation110.mmFinancialInstrumentIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmFinancialInstrumentIdentification
	 * FinancialInstrumentAttributes79.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#mmFinancialInstrumentIdentification
	 * FinancialInstrumentAttributes81.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmFinancialInstrumentIdentification
	 * FinancialInstrumentAttributes80.mmFinancialInstrumentIdentification}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral8#mmSecurityIdentification
	 * SecuritiesCollateral8.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument60#mmIdentification
	 * FinancialInstrument60.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument64#mmIdentification
	 * FinancialInstrument64.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument63#mmIdentification
	 * FinancialInstrument63.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument61#mmIdentification
	 * FinancialInstrument61.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument65#mmIdentification
	 * FinancialInstrument65.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails28#mmFinancialInstrumentIdentification
	 * FinancialInstrumentDetails28.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71#mmFinancialInstrumentIdentification
	 * SecuritiesTradeDetails71.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails105#mmFinancialInstrumentIdentification
	 * TransactionDetails105.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails29#mmFinancialInstrumentIdentification
	 * FinancialInstrumentDetails29.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmFinancialInstrumentIdentification
	 * SecuritiesTradeDetails72.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails34#mmFinancialInstrumentIdentification
	 * SecuritiesSettlementTransactionDetails34.
	 * mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails104#mmFinancialInstrumentIdentification
	 * TransactionDetails104.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails107#mmFinancialInstrumentIdentification
	 * TransactionDetails107.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91#mmUnderlyingFinancialInstrumentIdentification
	 * FinancialInstrumentAttributes91.
	 * mmUnderlyingFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes92#mmUnderlyingFinancialInstrumentIdentification
	 * FinancialInstrumentAttributes92.
	 * mmUnderlyingFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation127#mmFinancialInstrumentIdentification
	 * CorporateActionGeneralInformation127.mmFinancialInstrumentIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation126#mmFinancialInstrumentIdentification
	 * CorporateActionGeneralInformation126.mmFinancialInstrumentIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption141#mmFinancialInstrumentIdentification
	 * CorporateActionOption141.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138#mmFinancialInstrumentIdentification
	 * CorporateActionOption138.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation124#mmFinancialInstrumentIdentification
	 * CorporateActionGeneralInformation124.mmFinancialInstrumentIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption142#mmSecurityIdentification
	 * CorporateActionOption142.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139#mmSecurityIdentification
	 * CorporateActionOption139.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption65#mmFinancialInstrumentIdentification
	 * SecuritiesOption65.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93#mmSecurityIdentification
	 * FinancialInstrumentAttributes93.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption66#mmFinancialInstrumentIdentification
	 * SecuritiesOption66.mmFinancialInstrumentIdentification}</li>
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
	public static final MMBusinessAssociationEnd<Security, List<SecuritiesIdentification>> mmIdentification = new MMBusinessAssociationEnd<Security, List<SecuritiesIdentification>>() {
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
					TransactionDetails82.mmFinancialInstrumentIdentification, AggregateBalanceInformation31.mmFinancialInstrumentIdentification, TransactionDetails80.mmFinancialInstrumentIdentification,
					FinancialInstrumentAttributes63.mmUnderlyingFinancialInstrumentIdentification, FinancialInstrumentAttributes64.mmUnderlyingFinancialInstrumentIdentification,
					AdditionalQueryParameters11.mmFinancialInstrumentIdentification, SecuritiesCollateral6.mmSecurityIdentification, SecuritiesCollateral5.mmSecurityIdentification, SecuritiesCollateral7.mmSecurityIdentification,
					SecurityInstrumentDescription9.mmIdentification, SecurityInstrumentDescription11.mmIdentification, FinancialInstrument57.mmIdentification, FinancialInstrument56.mmIdentification, FinancialInstrument55.mmIdentification,
					SecuritiesTransactionReport4.mmFinancialInstrument, CorporateActionGeneralInformation110.mmFinancialInstrumentIdentification, FinancialInstrumentAttributes79.mmFinancialInstrumentIdentification,
					FinancialInstrumentAttributes81.mmFinancialInstrumentIdentification, FinancialInstrumentAttributes80.mmFinancialInstrumentIdentification, IntraPositionDetails39.mmFinancialInstrumentIdentification,
					AdditionalInformation13.mmFinancialInstrumentIdentification, SecuritiesFinancingTransactionDetails35.mmFinancialInstrumentIdentification, SecuritiesCollateral8.mmSecurityIdentification,
					FinancialInstrument60.mmIdentification, FinancialInstrument64.mmIdentification, FinancialInstrument63.mmIdentification, FinancialInstrument61.mmIdentification, FinancialInstrument65.mmIdentification,
					FinancialInstrumentDetails28.mmFinancialInstrumentIdentification, SecuritiesTradeDetails71.mmFinancialInstrumentIdentification, TransactionDetails105.mmFinancialInstrumentIdentification,
					FinancialInstrumentDetails29.mmFinancialInstrumentIdentification, SecuritiesTradeDetails72.mmFinancialInstrumentIdentification, SecuritiesSettlementTransactionDetails34.mmFinancialInstrumentIdentification,
					TransactionDetails104.mmFinancialInstrumentIdentification, TransactionDetails107.mmFinancialInstrumentIdentification, FinancialInstrumentAttributes91.mmUnderlyingFinancialInstrumentIdentification,
					FinancialInstrumentAttributes92.mmUnderlyingFinancialInstrumentIdentification, CorporateActionGeneralInformation127.mmFinancialInstrumentIdentification,
					CorporateActionGeneralInformation126.mmFinancialInstrumentIdentification, CorporateActionOption141.mmFinancialInstrumentIdentification, CorporateActionOption138.mmFinancialInstrumentIdentification,
					CorporateActionGeneralInformation124.mmFinancialInstrumentIdentification, CorporateActionOption142.mmSecurityIdentification, CorporateActionOption139.mmSecurityIdentification,
					SecuritiesOption65.mmFinancialInstrumentIdentification, FinancialInstrumentAttributes93.mmSecurityIdentification, SecuritiesOption66.mmFinancialInstrumentIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Way(s) of identifying the security.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesIdentification.mmIdentifiedSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesIdentification.mmObject();
		}

		@Override
		public List<SecuritiesIdentification> getValue(Security obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(Security obj, List<SecuritiesIdentification> value) {
			obj.setIdentification(value);
		}
	};
	protected CountryCode registeredDistributionCountry;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Security, CountryCode> mmRegisteredDistributionCountry = new MMBusinessAttribute<Security, CountryCode>() {
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

		@Override
		public CountryCode getValue(Security obj) {
			return obj.getRegisteredDistributionCountry();
		}

		@Override
		public void setValue(Security obj, CountryCode value) {
			obj.setRegisteredDistributionCountry(value);
		}
	};
	protected CurrencyCode denominationCurrency;
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91#mmDenominationCurrency
	 * FinancialInstrumentAttributes91.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes92#mmDenominationCurrency
	 * FinancialInstrumentAttributes92.mmDenominationCurrency}</li>
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
	public static final MMBusinessAttribute<Security, CurrencyCode> mmDenominationCurrency = new MMBusinessAttribute<Security, CurrencyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrument8.mmDenominationCurrency, FinancialInstrument21.mmDenominationCurrency, FinancialInstrumentStipulations2.mmCurrency,
					FinancialInstrumentAttributes44.mmDenominationCurrency, CorporateAction2.mmNewDenominationCurrency, FinancialInstrumentAttributes63.mmDenominationCurrency, FinancialInstrumentAttributes64.mmDenominationCurrency,
					FinancialInstrumentAttributes79.mmDenominationCurrency, FinancialInstrumentAttributes81.mmDenominationCurrency, FinancialInstrumentAttributes80.mmDenominationCurrency,
					FinancialInstrumentAttributes91.mmDenominationCurrency, FinancialInstrumentAttributes92.mmDenominationCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DenominationCurrency";
			definition = "Currency in which a security is issued or redenominated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(Security obj) {
			return obj.getDenominationCurrency();
		}

		@Override
		public void setValue(Security obj, CurrencyCode value) {
			obj.setDenominationCurrency(value);
		}
	};
	protected FormOfSecurityCode registrationForm;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57#mmSecuritiesForm
	 * FinancialInstrument57.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmSecuritiesForm
	 * FinancialInstrument56.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument55#mmSecuritiesForm
	 * FinancialInstrument55.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount66#mmSecuritiesForm
	 * InvestmentAccount66.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67#mmSecuritiesForm
	 * InvestmentAccount67.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount65#mmSecuritiesForm
	 * InvestmentAccount65.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument63#mmSecuritiesForm
	 * FinancialInstrument63.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount68#mmSecuritiesForm
	 * InvestmentAccount68.mmSecuritiesForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91#mmRegistrationForm
	 * FinancialInstrumentAttributes91.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes92#mmRegistrationForm
	 * FinancialInstrumentAttributes92.mmRegistrationForm}</li>
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
	public static final MMBusinessAttribute<Security, FormOfSecurityCode> mmRegistrationForm = new MMBusinessAttribute<Security, FormOfSecurityCode>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrument17.mmSecuritiesForm, FinancialInstrument8.mmSecuritiesForm, FinancialInstrument13.mmSecuritiesForm, FinancialInstrument21.mmSecuritiesForm, FormOfSecurity4Choice.mmCode,
					FormOfSecurity4Choice.mmProprietary, FinancialInstrumentAttributes44.mmRegistrationForm, FinancialInstrument9.mmSecuritiesForm, SecuritiesAccount9.mmSecurityHoldingForm, SecuritiesAccount12.mmSecurityHoldingForm,
					SecuritiesAccount8.mmSecurityHoldingForm, SecuritiesAccount10.mmSecurityHoldingForm, InvestmentFundTransactionsByFund3.mmSecuritiesForm, AggregateHoldingBalance1.mmHoldingForm,
					FinancialInstrumentAttributes63.mmRegistrationForm, FinancialInstrumentAttributes64.mmRegistrationForm, FormOfSecurity6Choice.mmCode, FormOfSecurity6Choice.mmProprietary, FinancialInstrument57.mmSecuritiesForm,
					FinancialInstrument56.mmSecuritiesForm, FinancialInstrument55.mmSecuritiesForm, InvestmentAccount66.mmSecuritiesForm, InvestmentAccount67.mmSecuritiesForm, InvestmentAccount65.mmSecuritiesForm,
					FinancialInstrument63.mmSecuritiesForm, InvestmentAccount68.mmSecuritiesForm, FinancialInstrumentAttributes91.mmRegistrationForm, FinancialInstrumentAttributes92.mmRegistrationForm);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationForm";
			definition = "Specifies the form, ie, ownership, of the security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FormOfSecurityCode.mmObject();
		}

		@Override
		public FormOfSecurityCode getValue(Security obj) {
			return obj.getRegistrationForm();
		}

		@Override
		public void setValue(Security obj, FormOfSecurityCode value) {
			obj.setRegistrationForm(value);
		}
	};
	protected YesNoIndicator dematerialisedIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount66#mmDematerialisedIndicator
	 * InvestmentAccount66.mmDematerialisedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67#mmDematerialisedIndicator
	 * InvestmentAccount67.mmDematerialisedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount65#mmDematerialisedIndicator
	 * InvestmentAccount65.mmDematerialisedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount68#mmDematerialisedIndicator
	 * InvestmentAccount68.mmDematerialisedIndicator}</li>
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
	public static final MMBusinessAttribute<Security, YesNoIndicator> mmDematerialisedIndicator = new MMBusinessAttribute<Security, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentAccount66.mmDematerialisedIndicator, InvestmentAccount67.mmDematerialisedIndicator, InvestmentAccount65.mmDematerialisedIndicator, InvestmentAccount68.mmDematerialisedIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DematerialisedIndicator";
			definition = "Indicates whether a security exists only as an electronic record, ie, there is no physical document representing the security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Security obj) {
			return obj.getDematerialisedIndicator();
		}

		@Override
		public void setValue(Security obj, YesNoIndicator value) {
			obj.setDematerialisedIndicator(value);
		}
	};
	protected EUSavingsDirectiveCode eUSavingsDirective;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Security, EUSavingsDirectiveCode> mmEUSavingsDirective = new MMBusinessAttribute<Security, EUSavingsDirectiveCode>() {
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

		@Override
		public EUSavingsDirectiveCode getValue(Security obj) {
			return obj.getEUSavingsDirective();
		}

		@Override
		public void setValue(Security obj, EUSavingsDirectiveCode value) {
			obj.setEUSavingsDirective(value);
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesQuantity> securitiesQuantity;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity6#mmFinancialInstrumentQuantity
	 * AmountPricePerFinancialInstrumentQuantity6.mmFinancialInstrumentQuantity}
	 * </li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument60#mmQuantity
	 * FinancialInstrument60.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument61#mmQuantity
	 * FinancialInstrument61.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument65#mmQuantity
	 * FinancialInstrument65.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93#mmQuantity
	 * FinancialInstrumentAttributes93.mmQuantity}</li>
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
	public static final MMBusinessAssociationEnd<Security, List<SecuritiesQuantity>> mmSecuritiesQuantity = new MMBusinessAssociationEnd<Security, List<SecuritiesQuantity>>() {
		{
			derivation_lazy = () -> Arrays.asList(QuantityAndAvailability.mmQuantity, AmountPricePerFinancialInstrumentQuantity1.mmFinancialInstrumentQuantity, BeneficialOwner1.mmElectedSecuritiesQuantity,
					OtherTypeOfCollateral2.mmQuantity, SecuritiesTransaction1.mmQuantity, PartyIdentification93.mmOwnedSecuritiesQuantity, AmountPricePerFinancialInstrumentQuantity6.mmFinancialInstrumentQuantity,
					OtherCollateral6.mmBlockedQuantity, SecuritiesCollateral6.mmQuantity, SecuritiesCollateral6.mmBlockedQuantity, SecuritiesCollateral5.mmQuantity, SecuritiesCollateral7.mmQuantity, AdditionalInformation13.mmQuantity,
					SecuritiesCollateral8.mmQuantity, FinancialInstrument60.mmQuantity, FinancialInstrument61.mmQuantity, FinancialInstrument65.mmQuantity, FinancialInstrumentAttributes93.mmQuantity);
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

		@Override
		public List<SecuritiesQuantity> getValue(Security obj) {
			return obj.getSecuritiesQuantity();
		}

		@Override
		public void setValue(Security obj, List<SecuritiesQuantity> value) {
			obj.setSecuritiesQuantity(value);
		}
	};
	protected List<SecuritiesRelatedFees> fees;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation18#mmFees
	 * ReceiveInformation18.mmFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation19#mmFees
	 * DeliverInformation19.mmFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation19#mmFees
	 * ReceiveInformation19.mmFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation18#mmFees
	 * DeliverInformation18.mmFees}</li>
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
	public static final MMBusinessAssociationEnd<Security, List<SecuritiesRelatedFees>> mmFees = new MMBusinessAssociationEnd<Security, List<SecuritiesRelatedFees>>() {
		{
			derivation_lazy = () -> Arrays.asList(UnitPrice15.mmChargeDetails, OtherAmounts16.mmMatchingConfirmationFee, OtherAmounts16.mmMarketMemberFeeAmount, OtherAmounts16.mmOddLotFee, ReceiveInformation18.mmFees,
					DeliverInformation19.mmFees, ReceiveInformation19.mmFees, DeliverInformation18.mmFees);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Fees";
			definition = "Fees related to securities.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesRelatedFees.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesRelatedFees.mmObject();
		}

		@Override
		public List<SecuritiesRelatedFees> getValue(Security obj) {
			return obj.getFees();
		}

		@Override
		public void setValue(Security obj, List<SecuritiesRelatedFees> value) {
			obj.setFees(value);
		}
	};
	protected List<SecuritiesPricing> pricing;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral8#mmPrice
	 * SecuritiesCollateral8.mmPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit8#mmPriceDetails
	 * Unit8.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails28#mmPriceDetails
	 * FinancialInstrumentDetails28.mmPriceDetails}</li>
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
	public static final MMBusinessAssociationEnd<Security, List<SecuritiesPricing>> mmPricing = new MMBusinessAssociationEnd<Security, List<SecuritiesPricing>>() {
		{
			derivation_lazy = () -> Arrays.asList(AggregateBalancePerSafekeepingPlace4.mmPriceDetails, AggregateBalanceInformation3.mmPriceDetails, AggregateBalancePerSafekeepingPlace3.mmPriceDetails,
					AggregateBalanceInformation4.mmPriceDetails, FinancialInstrumentStipulations2.mmPriceRange, InvestmentFund1.mmPrice, AggregateBalanceInformation30.mmPriceDetails, AggregateBalanceInformation31.mmPriceDetails,
					AggregateBalancePerSafekeepingPlace28.mmPriceDetails, AggregateBalancePerSafekeepingPlace29.mmPriceDetails, SecuritiesCollateral6.mmPrice, SecuritiesCollateral5.mmPrice, SecuritiesCollateral7.mmPrice,
					FinancialInstrumentAttributes80.mmIssuePrice, SecuritiesCollateral8.mmPrice, Unit8.mmPriceDetails, FinancialInstrumentDetails28.mmPriceDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Pricing";
			definition = "Information on the price of the security.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesPricing.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}

		@Override
		public List<SecuritiesPricing> getValue(Security obj) {
			return obj.getPricing();
		}

		@Override
		public void setValue(Security obj, List<SecuritiesPricing> value) {
			obj.setPricing(value);
		}
	};
	protected SecuritiesAccount securitiesAccount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation13#mmSafekeepingAccount
	 * AdditionalInformation13.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral8#mmSafekeepingAccount
	 * SecuritiesCollateral8.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails105#mmSafekeepingAccount
	 * TransactionDetails105.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails106#mmSafekeepingAccount
	 * TransactionDetails106.mmSafekeepingAccount}</li>
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
	public static final MMBusinessAssociationEnd<Security, com.tools20022.repository.entity.SecuritiesAccount> mmSecuritiesAccount = new MMBusinessAssociationEnd<Security, com.tools20022.repository.entity.SecuritiesAccount>() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionDetails82.mmSafekeepingAccount, TransactionDetails80.mmSafekeepingAccount, OtherCollateral7.mmSafekeepingAccount, OtherCollateral6.mmSafekeepingAccount,
					SecuritiesCollateral6.mmSafekeepingAccount, SecuritiesCollateral5.mmSafekeepingAccount, OtherCollateral5.mmSafekeepingAccount, SecuritiesCollateral7.mmSafekeepingAccount, AdditionalInformation13.mmSafekeepingAccount,
					SecuritiesCollateral8.mmSafekeepingAccount, TransactionDetails105.mmSafekeepingAccount, TransactionDetails106.mmSafekeepingAccount);
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

		@Override
		public com.tools20022.repository.entity.SecuritiesAccount getValue(Security obj) {
			return obj.getSecuritiesAccount();
		}

		@Override
		public void setValue(Security obj, com.tools20022.repository.entity.SecuritiesAccount value) {
			obj.setSecuritiesAccount(value);
		}
	};
	protected List<com.tools20022.repository.entity.TradingMarket> tradingMarket;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmPlaceOfTrade
	 * SecuritiesFinancingTransactionDetails35.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71#mmPlaceOfTrade
	 * SecuritiesTradeDetails71.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails105#mmPlaceOfTrade
	 * TransactionDetails105.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails104#mmPlaceOfTrade
	 * TransactionDetails104.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails103#mmPlaceOfTrade
	 * TransactionDetails103.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails73#mmPlaceOfTrade
	 * SecuritiesTradeDetails73.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails74#mmPlaceOfTrade
	 * SecuritiesTradeDetails74.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails75#mmPlaceOfTrade
	 * SecuritiesTradeDetails75.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails76#mmPlaceOfTrade
	 * SecuritiesTradeDetails76.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails77#mmPlaceOfTrade
	 * SecuritiesTradeDetails77.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails78#mmPlaceOfTrade
	 * SecuritiesTradeDetails78.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails79#mmPlaceOfTrade
	 * SecuritiesTradeDetails79.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails80#mmPlaceOfTrade
	 * SecuritiesTradeDetails80.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption140#mmPlaceOfTrade
	 * CorporateActionOption140.mmPlaceOfTrade}</li>
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
	public static final MMBusinessAssociationEnd<Security, List<TradingMarket>> mmTradingMarket = new MMBusinessAssociationEnd<Security, List<TradingMarket>>() {
		{
			derivation_lazy = () -> Arrays.asList(FundProcessingPassport1.mmLocalMarketAnnex, SecuritiesFinancingTransactionDetails35.mmPlaceOfTrade, SecuritiesTradeDetails71.mmPlaceOfTrade, TransactionDetails105.mmPlaceOfTrade,
					TransactionDetails104.mmPlaceOfTrade, TransactionDetails103.mmPlaceOfTrade, SecuritiesTradeDetails73.mmPlaceOfTrade, SecuritiesTradeDetails74.mmPlaceOfTrade, SecuritiesTradeDetails75.mmPlaceOfTrade,
					SecuritiesTradeDetails76.mmPlaceOfTrade, SecuritiesTradeDetails77.mmPlaceOfTrade, SecuritiesTradeDetails78.mmPlaceOfTrade, SecuritiesTradeDetails79.mmPlaceOfTrade, SecuritiesTradeDetails80.mmPlaceOfTrade,
					CorporateActionOption140.mmPlaceOfTrade);
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

		@Override
		public List<TradingMarket> getValue(Security obj) {
			return obj.getTradingMarket();
		}

		@Override
		public void setValue(Security obj, List<TradingMarket> value) {
			obj.setTradingMarket(value);
		}
	};
	protected List<com.tools20022.repository.entity.TradingMarket> placeOfListing;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91#mmPlaceOfListing
	 * FinancialInstrumentAttributes91.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes92#mmPlaceOfListing
	 * FinancialInstrumentAttributes92.mmPlaceOfListing}</li>
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
	public static final MMBusinessAssociationEnd<Security, List<TradingMarket>> mmPlaceOfListing = new MMBusinessAssociationEnd<Security, List<TradingMarket>>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes44.mmPlaceOfListing, FinancialInstrumentDescription3.mmPlaceOfListing, TradeLeg8.mmPlaceOfListing, TradeLeg10.mmPlaceOfListing, TradeLeg9.mmPlaceOfListing,
					AggregateBalancePerSafekeepingPlace28.mmPlaceOfListing, AggregateBalancePerSafekeepingPlace29.mmPlaceOfListing, FinancialInstrumentAttributes63.mmPlaceOfListing, FinancialInstrumentAttributes64.mmPlaceOfListing,
					VolumeCapReport1.mmTradingVenue, TransparencyDataReport11.mmTradingVenue, TransparencyDataReport13.mmTradingVenue, SecuritiesReferenceDataReport5.mmTradingVenueRelatedAttributes, TransparencyDataReport12.mmTradingVenue,
					TransparencyDataReport12.mmRelevantMarket, TransparencyDataReport15.mmTradingVenue, TransparencyDataReport10.mmTradingVenue, TransparencyDataReport14.mmTradingVenue, FinancialInstrumentAttributes79.mmPlaceOfListing,
					FinancialInstrumentAttributes81.mmPlaceOfListing, FinancialInstrumentAttributes80.mmPlaceOfListing, FinancialInstrumentAttributes91.mmPlaceOfListing, FinancialInstrumentAttributes92.mmPlaceOfListing);
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

		@Override
		public List<TradingMarket> getValue(Security obj) {
			return obj.getPlaceOfListing();
		}

		@Override
		public void setValue(Security obj, List<TradingMarket> value) {
			obj.setPlaceOfListing(value);
		}
	};
	protected List<BasicSecuritiesRegistration> registration;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmRegistration
	 * SettlementDetails142.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmRegistration
	 * SettlementDetails144.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails141#mmRegistration
	 * SettlementDetails141.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmRegistration
	 * SettlementDetails145.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails34#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails34.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmRegistration
	 * SettlementDetails146.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails33#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails33.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143#mmRegistration
	 * SettlementDetails143.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails32.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails149#mmRegistration
	 * SettlementDetails149.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmRegistration
	 * SettlementDetails150.mmRegistration}</li>
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
	public static final MMBusinessAssociationEnd<Security, List<BasicSecuritiesRegistration>> mmRegistration = new MMBusinessAssociationEnd<Security, List<BasicSecuritiesRegistration>>() {
		{
			derivation_lazy = () -> Arrays.asList(PartyTextInformation1.mmRegistrationDetails, SettlementDetails43.mmRegistration, SecuritiesAccount6.mmRegistrationDetails, Order17.mmAdditionalPhysicalOrRegistrationDetails,
					Order18.mmAdditionalPhysicalOrRegistrationDetails, SettlementDetails100.mmRegistration, HoldIndicator6.mmReason, SettlementDetails142.mmRegistration, SettlementDetails144.mmRegistration,
					SettlementDetails141.mmRegistration, SettlementDetails145.mmRegistration, SecuritiesSettlementTransactionDetails34.mmAdditionalPhysicalOrRegistrationDetails, SettlementDetails146.mmRegistration,
					SecuritiesSettlementTransactionDetails33.mmAdditionalPhysicalOrRegistrationDetails, SettlementDetails143.mmRegistration, SecuritiesSettlementTransactionDetails32.mmAdditionalPhysicalOrRegistrationDetails,
					SettlementDetails149.mmRegistration, SettlementDetails150.mmRegistration);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Registration";
			definition = "Information related to registration of securities.";
			minOccurs = 0;
			opposite_lazy = () -> BasicSecuritiesRegistration.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BasicSecuritiesRegistration.mmObject();
		}

		@Override
		public List<BasicSecuritiesRegistration> getValue(Security obj) {
			return obj.getRegistration();
		}

		@Override
		public void setValue(Security obj, List<BasicSecuritiesRegistration> value) {
			obj.setRegistration(value);
		}
	};
	protected List<SecuritiesRestriction> restriction;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails147#mmLegalRestrictions
	 * SettlementDetails147.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmLegalRestrictions
	 * SettlementDetails142.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmLegalRestrictions
	 * SettlementDetails144.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148#mmLegalRestrictions
	 * SettlementDetails148.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmLegalRestrictions
	 * SettlementDetails145.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmLegalRestrictions
	 * SettlementDetails146.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143#mmLegalRestrictions
	 * SettlementDetails143.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails149#mmLegalRestrictions
	 * SettlementDetails149.mmLegalRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmLegalRestrictions
	 * SettlementDetails150.mmLegalRestrictions}</li>
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
	public static final MMBusinessAssociationEnd<Security, List<SecuritiesRestriction>> mmRestriction = new MMBusinessAssociationEnd<Security, List<SecuritiesRestriction>>() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementDetails43.mmLegalRestrictions, SettlementDetails97.mmLegalRestrictions, SettlementDetails100.mmLegalRestrictions, SettlementDetails98.mmLegalRestrictions,
					CorporateActionNarrative29.mmSecurityRestriction, SettlementDetails147.mmLegalRestrictions, SettlementDetails142.mmLegalRestrictions, SettlementDetails144.mmLegalRestrictions, SettlementDetails148.mmLegalRestrictions,
					SettlementDetails145.mmLegalRestrictions, SettlementDetails146.mmLegalRestrictions, SettlementDetails143.mmLegalRestrictions, SettlementDetails149.mmLegalRestrictions, SettlementDetails150.mmLegalRestrictions);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Restriction";
			definition = "Regulatory restriction(s) linked to the security.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesRestriction.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesRestriction.mmObject();
		}

		@Override
		public List<SecuritiesRestriction> getValue(Security obj) {
			return obj.getRestriction();
		}

		@Override
		public void setValue(Security obj, List<SecuritiesRestriction> value) {
			obj.setRestriction(value);
		}
	};
	protected List<CorporateActionEvent> corporateEvent;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46#mmCorporateActionEventType
	 * IntraPositionDetails46.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification43#mmCorporateActionEventAndBalance
	 * AccountIdentification43.mmCorporateActionEventAndBalance}</li>
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
	public static final MMBusinessAssociationEnd<Security, List<CorporateActionEvent>> mmCorporateEvent = new MMBusinessAssociationEnd<Security, List<CorporateActionEvent>>() {
		{
			derivation_lazy = () -> Arrays.asList(IntraPositionDetails46.mmCorporateActionEventType, AccountIdentification43.mmCorporateActionEventAndBalance);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateEvent";
			definition = "Corporate event linked to the security";
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionEvent.mmUnderlyingSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}

		@Override
		public List<CorporateActionEvent> getValue(Security obj) {
			return obj.getCorporateEvent();
		}

		@Override
		public void setValue(Security obj, List<CorporateActionEvent> value) {
			obj.setCorporateEvent(value);
		}
	};
	protected YesNoIndicator temporaryFinancialInstrumentIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption64.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption65#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption65.mmTemporaryFinancialInstrumentIndicator}</li>
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
	public static final MMBusinessAttribute<Security, YesNoIndicator> mmTemporaryFinancialInstrumentIndicator = new MMBusinessAttribute<Security, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityOption1.mmTemporaryFinancialInstrumentIndicator, TemporaryFinancialInstrumentIndicator3Choice.mmTemporaryIndicator, TemporaryFinancialInstrumentIndicator3Choice.mmProprietary,
					SecuritiesOption64.mmTemporaryFinancialInstrumentIndicator, SecuritiesOption65.mmTemporaryFinancialInstrumentIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TemporaryFinancialInstrumentIndicator";
			definition = "Specifies that the security is a temporary security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Security obj) {
			return obj.getTemporaryFinancialInstrumentIndicator();
		}

		@Override
		public void setValue(Security obj, YesNoIndicator value) {
			obj.setTemporaryFinancialInstrumentIndicator(value);
		}
	};
	protected ISODateTime availableDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate3#mmAvailableDate
	 * CorporateActionDate3.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46#mmAvailableDate
	 * IntraPositionDetails46.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails15#mmAvailableDate
	 * IntraPositionMovementDetails15.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate15#mmAvailableDate
	 * SecurityDate15.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate16#mmAvailableDate
	 * SecurityDate16.mmAvailableDate}</li>
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
	public static final MMBusinessAttribute<Security, ISODateTime> mmAvailableDate = new MMBusinessAttribute<Security, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate3.mmAvailableDate, IntraPositionDetails46.mmAvailableDate, IntraPositionMovementDetails15.mmAvailableDate, SecurityDate15.mmAvailableDate, SecurityDate16.mmAvailableDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AvailableDate";
			definition = "Date on which securities become available for sale.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Security obj) {
			return obj.getAvailableDate();
		}

		@Override
		public void setValue(Security obj, ISODateTime value) {
			obj.setAvailableDate(value);
		}
	};
	protected Max350Text declarationDetails;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Security, Max350Text> mmDeclarationDetails = new MMBusinessAttribute<Security, Max350Text>() {
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

		@Override
		public Max350Text getValue(Security obj) {
			return obj.getDeclarationDetails();
		}

		@Override
		public void setValue(Security obj, Max350Text value) {
			obj.setDeclarationDetails(value);
		}
	};
	protected Spread spread;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate91#mmSpread
	 * CorporateActionRate91.mmSpread}</li>
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
	public static final MMBusinessAssociationEnd<Security, Optional<Spread>> mmSpread = new MMBusinessAssociationEnd<Security, Optional<Spread>>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate1.mmSpread, CorporateActionRate91.mmSpread);
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

		@Override
		public Optional<Spread> getValue(Security obj) {
			return obj.getSpread();
		}

		@Override
		public void setValue(Security obj, Optional<Spread> value) {
			obj.setSpread(value.orElse(null));
		}
	};
	protected List<com.tools20022.repository.entity.Dividend> dividend;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmDividendType
	 * CorporateAction41.mmDividendType}</li>
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
	public static final MMBusinessAssociationEnd<Security, List<Dividend>> mmDividend = new MMBusinessAssociationEnd<Security, List<Dividend>>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateAction2.mmDividendType, CorporateAction41.mmDividendType);
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

		@Override
		public List<Dividend> getValue(Security obj) {
			return obj.getDividend();
		}

		@Override
		public void setValue(Security obj, List<Dividend> value) {
			obj.setDividend(value);
		}
	};
	protected SecuritiesBalance balance;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Security, SecuritiesBalance> mmBalance = new MMBusinessAssociationEnd<Security, SecuritiesBalance>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Balance";
			definition = "Balance of the account which holds a specific security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesBalance.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesBalance.mmObject();
		}

		@Override
		public SecuritiesBalance getValue(Security obj) {
			return obj.getBalance();
		}

		@Override
		public void setValue(Security obj, SecuritiesBalance value) {
			obj.setBalance(value);
		}
	};
	protected YesNoIndicator fungibleIndicator;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Security, YesNoIndicator> mmFungibleIndicator = new MMBusinessAttribute<Security, YesNoIndicator>() {
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

		@Override
		public YesNoIndicator getValue(Security obj) {
			return obj.getFungibleIndicator();
		}

		@Override
		public void setValue(Security obj, YesNoIndicator value) {
			obj.setFungibleIndicator(value);
		}
	};
	protected AppearanceCode appearance;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Security, AppearanceCode> mmAppearance = new MMBusinessAttribute<Security, AppearanceCode>() {
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

		@Override
		public AppearanceCode getValue(Security obj) {
			return obj.getAppearance();
		}

		@Override
		public void setValue(Security obj, AppearanceCode value) {
			obj.setAppearance(value);
		}
	};
	protected Number nearTermPositionLimit;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Security, Number> mmNearTermPositionLimit = new MMBusinessAttribute<Security, Number>() {
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

		@Override
		public Number getValue(Security obj) {
			return obj.getNearTermPositionLimit();
		}

		@Override
		public void setValue(Security obj, Number value) {
			obj.setNearTermPositionLimit(value);
		}
	};
	protected ISOYearMonth contractSettlementMonth;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 667</li>
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
	public static final MMBusinessAttribute<Security, ISOYearMonth> mmContractSettlementMonth = new MMBusinessAttribute<Security, ISOYearMonth>() {
		{
			derivation_lazy = () -> Arrays.asList(FutureOrOptionDetails1.mmContractSettlementMonth);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "667"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ContractSettlementMonth";
			definition = "Specifies when the contract (i.e. MBS/TBA) will settle.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}

		@Override
		public ISOYearMonth getValue(Security obj) {
			return obj.getContractSettlementMonth();
		}

		@Override
		public void setValue(Security obj, ISOYearMonth value) {
			obj.setContractSettlementMonth(value);
		}
	};
	protected Number minimumTradingPricingIncrement;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Security, Number> mmMinimumTradingPricingIncrement = new MMBusinessAttribute<Security, Number>() {
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

		@Override
		public Number getValue(Security obj) {
			return obj.getMinimumTradingPricingIncrement();
		}

		@Override
		public void setValue(Security obj, Number value) {
			obj.setMinimumTradingPricingIncrement(value);
		}
	};
	protected List<com.tools20022.repository.entity.Rating> rating;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Security, List<Rating>> mmRating = new MMBusinessAssociationEnd<Security, List<Rating>>() {
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

		@Override
		public List<Rating> getValue(Security obj) {
			return obj.getRating();
		}

		@Override
		public void setValue(Security obj, List<Rating> value) {
			obj.setRating(value);
		}
	};
	protected List<com.tools20022.repository.entity.CouponAttached> couponAttached;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Security, List<CouponAttached>> mmCouponAttached = new MMBusinessAssociationEnd<Security, List<CouponAttached>>() {
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

		@Override
		public List<CouponAttached> getValue(Security obj) {
			return obj.getCouponAttached();
		}

		@Override
		public void setValue(Security obj, List<CouponAttached> value) {
			obj.setCouponAttached(value);
		}
	};
	protected Sector sector;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Security, com.tools20022.repository.entity.Sector> mmSector = new MMBusinessAssociationEnd<Security, com.tools20022.repository.entity.Sector>() {
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

		@Override
		public com.tools20022.repository.entity.Sector getValue(Security obj) {
			return obj.getSector();
		}

		@Override
		public void setValue(Security obj, com.tools20022.repository.entity.Sector value) {
			obj.setSector(value);
		}
	};
	protected YesNoIndicator warrantAttachedOnDelivery;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Security, YesNoIndicator> mmWarrantAttachedOnDelivery = new MMBusinessAttribute<Security, YesNoIndicator>() {
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

		@Override
		public YesNoIndicator getValue(Security obj) {
			return obj.getWarrantAttachedOnDelivery();
		}

		@Override
		public void setValue(Security obj, YesNoIndicator value) {
			obj.setWarrantAttachedOnDelivery(value);
		}
	};
	protected YesNoIndicator strippableIndicator;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Security, YesNoIndicator> mmStrippableIndicator = new MMBusinessAttribute<Security, YesNoIndicator>() {
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

		@Override
		public YesNoIndicator getValue(Security obj) {
			return obj.getStrippableIndicator();
		}

		@Override
		public void setValue(Security obj, YesNoIndicator value) {
			obj.setStrippableIndicator(value);
		}
	};
	protected ISODateTime firstDealingDate;
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
	public static final MMBusinessAttribute<Security, ISODateTime> mmFirstDealingDate = new MMBusinessAttribute<Security, ISODateTime>() {
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

		@Override
		public ISODateTime getValue(Security obj) {
			return obj.getFirstDealingDate();
		}

		@Override
		public void setValue(Security obj, ISODateTime value) {
			obj.setFirstDealingDate(value);
		}
	};
	protected List<SecuritiesTax> taxDetails;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Security, List<SecuritiesTax>> mmTaxDetails = new MMBusinessAssociationEnd<Security, List<SecuritiesTax>>() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesAccount8.mmStampDuty);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxDetails";
			definition = "Tax details of the security.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesTax.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesTax.mmObject();
		}

		@Override
		public List<SecuritiesTax> getValue(Security obj) {
			return obj.getTaxDetails();
		}

		@Override
		public void setValue(Security obj, List<SecuritiesTax> value) {
			obj.setTaxDetails(value);
		}
	};
	protected SecuritiesTrade securitiesTrade;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Security, com.tools20022.repository.entity.SecuritiesTrade> mmSecuritiesTrade = new MMBusinessAssociationEnd<Security, com.tools20022.repository.entity.SecuritiesTrade>() {
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

		@Override
		public com.tools20022.repository.entity.SecuritiesTrade getValue(Security obj) {
			return obj.getSecuritiesTrade();
		}

		@Override
		public void setValue(Security obj, com.tools20022.repository.entity.SecuritiesTrade value) {
			obj.setSecuritiesTrade(value);
		}
	};
	protected Jurisdiction registrationJurisdiction;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Security, Jurisdiction> mmRegistrationJurisdiction = new MMBusinessAssociationEnd<Security, Jurisdiction>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationJurisdiction";
			definition = "Jurisdiction (country, county, state, province, city) in which the security is legally recorded for regulatory and/or tax purposes.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Jurisdiction.mmRegisteredSecurities;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Jurisdiction.mmObject();
		}

		@Override
		public Jurisdiction getValue(Security obj) {
			return obj.getRegistrationJurisdiction();
		}

		@Override
		public void setValue(Security obj, Jurisdiction value) {
			obj.setRegistrationJurisdiction(value);
		}
	};
	protected List<SecuritiesPartyRole> partyRole;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Security, List<SecuritiesPartyRole>> mmPartyRole = new MMBusinessAssociationEnd<Security, List<SecuritiesPartyRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies roles played by a party that are linked to the handling of securities but not related to a specific process.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesPartyRole.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPartyRole.mmObject();
		}

		@Override
		public List<SecuritiesPartyRole> getValue(Security obj) {
			return obj.getPartyRole();
		}

		@Override
		public void setValue(Security obj, List<SecuritiesPartyRole> value) {
			obj.setPartyRole(value);
		}
	};
	protected List<SecuritiesStatus> securityStatus;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Security, List<SecuritiesStatus>> mmSecurityStatus = new MMBusinessAssociationEnd<Security, List<SecuritiesStatus>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecurityStatus";
			definition = "Specifies the status of the security within its lifecycle.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesStatus.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesStatus.mmObject();
		}

		@Override
		public List<SecuritiesStatus> getValue(Security obj) {
			return obj.getSecurityStatus();
		}

		@Override
		public void setValue(Security obj, List<SecuritiesStatus> value) {
			obj.setSecurityStatus(value);
		}
	};
	protected SecuritiesModification modification;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Security, Optional<SecuritiesModification>> mmModification = new MMBusinessAssociationEnd<Security, Optional<SecuritiesModification>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Modification";
			definition = "Modification process which applies to a specific security.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesModification.mmNewSecurityReferenceData;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesModification.mmObject();
		}

		@Override
		public Optional<SecuritiesModification> getValue(Security obj) {
			return obj.getModification();
		}

		@Override
		public void setValue(Security obj, Optional<SecuritiesModification> value) {
			obj.setModification(value.orElse(null));
		}
	};
	protected List<com.tools20022.repository.entity.RedemptionSchedule> redemptionSchedule;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Security, List<RedemptionSchedule>> mmRedemptionSchedule = new MMBusinessAssociationEnd<Security, List<RedemptionSchedule>>() {
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

		@Override
		public List<RedemptionSchedule> getValue(Security obj) {
			return obj.getRedemptionSchedule();
		}

		@Override
		public void setValue(Security obj, List<RedemptionSchedule> value) {
			obj.setRedemptionSchedule(value);
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesSettlement> securitiesSettlement;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Security, List<SecuritiesSettlement>> mmSecuritiesSettlement = new MMBusinessAssociationEnd<Security, List<SecuritiesSettlement>>() {
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

		@Override
		public List<SecuritiesSettlement> getValue(Security obj) {
			return obj.getSecuritiesSettlement();
		}

		@Override
		public void setValue(Security obj, List<SecuritiesSettlement> value) {
			obj.setSecuritiesSettlement(value);
		}
	};
	protected SecuritiesTransfer securitiesTransfer;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Security, com.tools20022.repository.entity.SecuritiesTransfer> mmSecuritiesTransfer = new MMBusinessAssociationEnd<Security, com.tools20022.repository.entity.SecuritiesTransfer>() {
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

		@Override
		public com.tools20022.repository.entity.SecuritiesTransfer getValue(Security obj) {
			return obj.getSecuritiesTransfer();
		}

		@Override
		public void setValue(Security obj, com.tools20022.repository.entity.SecuritiesTransfer value) {
			obj.setSecuritiesTransfer(value);
		}
	};
	protected List<AgentCorporateActionStandingInstruction> corporateActionStandingInstructions;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Security, List<AgentCorporateActionStandingInstruction>> mmCorporateActionStandingInstructions = new MMBusinessAssociationEnd<Security, List<AgentCorporateActionStandingInstruction>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionStandingInstructions";
			definition = "Standing instructions related to the security in the context of corporate action.";
			minOccurs = 0;
			opposite_lazy = () -> AgentCorporateActionStandingInstruction.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AgentCorporateActionStandingInstruction.mmObject();
		}

		@Override
		public List<AgentCorporateActionStandingInstruction> getValue(Security obj) {
			return obj.getCorporateActionStandingInstructions();
		}

		@Override
		public void setValue(Security obj, List<AgentCorporateActionStandingInstruction> value) {
			obj.setCorporateActionStandingInstructions(value);
		}
	};
	protected Quote quote;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Security, Optional<Quote>> mmQuote = new MMBusinessAssociationEnd<Security, Optional<Quote>>() {
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

		@Override
		public Optional<Quote> getValue(Security obj) {
			return obj.getQuote();
		}

		@Override
		public void setValue(Security obj, Optional<Quote> value) {
			obj.setQuote(value.orElse(null));
		}
	};
	protected SecuritiesOrder securitiesOrder;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Security, com.tools20022.repository.entity.SecuritiesOrder> mmSecuritiesOrder = new MMBusinessAssociationEnd<Security, com.tools20022.repository.entity.SecuritiesOrder>() {
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

		@Override
		public com.tools20022.repository.entity.SecuritiesOrder getValue(Security obj) {
			return obj.getSecuritiesOrder();
		}

		@Override
		public void setValue(Security obj, com.tools20022.repository.entity.SecuritiesOrder value) {
			obj.setSecuritiesOrder(value);
		}
	};
	protected VariableInterest relatedVariableInterest;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Security, Optional<VariableInterest>> mmRelatedVariableInterest = new MMBusinessAssociationEnd<Security, Optional<VariableInterest>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedVariableInterest";
			definition = "Variable interest parameters specified for interest related to a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> VariableInterest.mmBenchmarkReference;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> VariableInterest.mmObject();
		}

		@Override
		public Optional<VariableInterest> getValue(Security obj) {
			return obj.getRelatedVariableInterest();
		}

		@Override
		public void setValue(Security obj, Optional<VariableInterest> value) {
			obj.setRelatedVariableInterest(value.orElse(null));
		}
	};
	protected List<SecuritiesConversion> conversion;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Security, List<SecuritiesConversion>> mmConversion = new MMBusinessAssociationEnd<Security, List<SecuritiesConversion>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Conversion";
			definition = "Information on the conversion exchange of an entitlement or of preferred equities or of convertible bonds, into another form of securities, usually common equities.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesConversion.mmSecurityIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesConversion.mmObject();
		}

		@Override
		public List<SecuritiesConversion> getValue(Security obj) {
			return obj.getConversion();
		}

		@Override
		public void setValue(Security obj, List<SecuritiesConversion> value) {
			obj.setConversion(value);
		}
	};
	protected List<com.tools20022.repository.entity.ComponentSecurity> componentSecurity;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Security, List<ComponentSecurity>> mmComponentSecurity = new MMBusinessAssociationEnd<Security, List<ComponentSecurity>>() {
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

		@Override
		public List<ComponentSecurity> getValue(Security obj) {
			return obj.getComponentSecurity();
		}

		@Override
		public void setValue(Security obj, List<ComponentSecurity> value) {
			obj.setComponentSecurity(value);
		}
	};
	protected YesNoIndicator recompositionIndicator;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Security, YesNoIndicator> mmRecompositionIndicator = new MMBusinessAttribute<Security, YesNoIndicator>() {
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

		@Override
		public YesNoIndicator getValue(Security obj) {
			return obj.getRecompositionIndicator();
		}

		@Override
		public void setValue(Security obj, YesNoIndicator value) {
			obj.setRecompositionIndicator(value);
		}
	};
	protected Max35Text series;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Security, Max35Text> mmSeries = new MMBusinessAttribute<Security, Max35Text>() {
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

		@Override
		public Max35Text getValue(Security obj) {
			return obj.getSeries();
		}

		@Override
		public void setValue(Security obj, Max35Text value) {
			obj.setSeries(value);
		}
	};
	protected PercentageRate percentageOfDebtClaim;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Security, PercentageRate> mmPercentageOfDebtClaim = new MMBusinessAttribute<Security, PercentageRate>() {
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

		@Override
		public PercentageRate getValue(Security obj) {
			return obj.getPercentageOfDebtClaim();
		}

		@Override
		public void setValue(Security obj, PercentageRate value) {
			obj.setPercentageOfDebtClaim(value);
		}
	};
	protected PercentageRate coverRate;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Security, PercentageRate> mmCoverRate = new MMBusinessAttribute<Security, PercentageRate>() {
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

		@Override
		public PercentageRate getValue(Security obj) {
			return obj.getCoverRate();
		}

		@Override
		public void setValue(Security obj, PercentageRate value) {
			obj.setCoverRate(value);
		}
	};
	protected MaturityRedemptionTypeCode maturityRedemption;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Security, MaturityRedemptionTypeCode> mmMaturityRedemption = new MMBusinessAttribute<Security, MaturityRedemptionTypeCode>() {
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

		@Override
		public MaturityRedemptionTypeCode getValue(Security obj) {
			return obj.getMaturityRedemption();
		}

		@Override
		public void setValue(Security obj, MaturityRedemptionTypeCode value) {
			obj.setMaturityRedemption(value);
		}
	};
	protected MarginCall relatedMarginCall;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Security, MarginCall> mmRelatedMarginCall = new MMBusinessAssociationEnd<Security, MarginCall>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedMarginCall";
			definition = "Margin call for which the associated securities are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> MarginCall.mmSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> MarginCall.mmObject();
		}

		@Override
		public MarginCall getValue(Security obj) {
			return obj.getRelatedMarginCall();
		}

		@Override
		public void setValue(Security obj, MarginCall value) {
			obj.setRelatedMarginCall(value);
		}
	};
	protected Party closeLink;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Security, Party> mmCloseLink = new MMBusinessAssociationEnd<Security, Party>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CloseLink";
			definition = "Situation in which two entities are linked because one of these entities owns some of the capital of the other one, or has a control relationship with it.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Party.mmCloseLinkSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Party.mmObject();
		}

		@Override
		public Party getValue(Security obj) {
			return obj.getCloseLink();
		}

		@Override
		public void setValue(Security obj, Party value) {
			obj.setCloseLink(value);
		}
	};
	protected YesNoIndicator potentialEuroSystemEligibility;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Security, YesNoIndicator> mmPotentialEuroSystemEligibility = new MMBusinessAttribute<Security, YesNoIndicator>() {
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

		@Override
		public YesNoIndicator getValue(Security obj) {
			return obj.getPotentialEuroSystemEligibility();
		}

		@Override
		public void setValue(Security obj, YesNoIndicator value) {
			obj.setPotentialEuroSystemEligibility(value);
		}
	};
	protected SecuritiesQuantity minimumQuantity;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes91.mmMinimumNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes92#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes92.mmMinimumNominalQuantity}</li>
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
	public static final MMBusinessAssociationEnd<Security, com.tools20022.repository.entity.SecuritiesQuantity> mmMinimumQuantity = new MMBusinessAssociationEnd<Security, com.tools20022.repository.entity.SecuritiesQuantity>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentStipulations2.mmMinimumQuantity, FinancialInstrumentAttributes44.mmMinimumNominalQuantity, FinancialInstrumentAttributes63.mmMinimumNominalQuantity,
					FinancialInstrumentAttributes64.mmMinimumNominalQuantity, FinancialInstrumentAttributes79.mmMinimumNominalQuantity, FinancialInstrumentAttributes81.mmMinimumNominalQuantity,
					FinancialInstrumentAttributes80.mmMinimumNominalQuantity, FinancialInstrumentAttributes91.mmMinimumNominalQuantity, FinancialInstrumentAttributes92.mmMinimumNominalQuantity);
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

		@Override
		public com.tools20022.repository.entity.SecuritiesQuantity getValue(Security obj) {
			return obj.getMinimumQuantity();
		}

		@Override
		public void setValue(Security obj, com.tools20022.repository.entity.SecuritiesQuantity value) {
			obj.setMinimumQuantity(value);
		}
	};
	protected YesNoIndicator restrictedIndicator;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Security, YesNoIndicator> mmRestrictedIndicator = new MMBusinessAttribute<Security, YesNoIndicator>() {
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

		@Override
		public YesNoIndicator getValue(Security obj) {
			return obj.getRestrictedIndicator();
		}

		@Override
		public void setValue(Security obj, YesNoIndicator value) {
			obj.setRestrictedIndicator(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Security";
				definition = "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer.";
				associationDomain_lazy = () -> Arrays.asList(SecuritiesIdentification.mmIdentifiedSecurity, com.tools20022.repository.entity.Dividend.mmSecurity, SecuritiesPricing.mmSecurity, Party.mmCloseLinkSecurity,
						com.tools20022.repository.entity.RedemptionSchedule.mmSecurity, com.tools20022.repository.entity.TradingMarket.mmTradedSecurity, com.tools20022.repository.entity.TradingMarket.mmListedSecurity,
						com.tools20022.repository.entity.SecuritiesAccount.mmSecurity, SecuritiesTax.mmSecurity, com.tools20022.repository.entity.SecuritiesQuantity.mmSecurityIdentification,
						com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumQuantityDebt, com.tools20022.repository.entity.SecuritiesTrade.mmSecurity, com.tools20022.repository.entity.SecuritiesTransfer.mmSecurity,
						SecuritiesPartyRole.mmSecurity, com.tools20022.repository.entity.SecuritiesSettlement.mmSecurity, SecuritiesRelatedFees.mmSecurity, SecuritiesStatus.mmSecurity, VariableInterest.mmBenchmarkReference,
						com.tools20022.repository.entity.CouponAttached.mmSecurity, SecuritiesConversion.mmSecurityIdentification, BasicSecuritiesRegistration.mmSecurity, SecuritiesRestriction.mmSecurity, SecuritiesBalance.mmSecurity,
						CorporateActionEvent.mmUnderlyingSecurity, SecuritiesModification.mmNewSecurityReferenceData, com.tools20022.repository.entity.Spread.mmBenchmarkSecurity,
						com.tools20022.repository.entity.SecuritiesOrder.mmOrderedSecurity, com.tools20022.repository.entity.Rating.mmSecurity, com.tools20022.repository.entity.Sector.mmSecurity, Jurisdiction.mmRegisteredSecurities,
						AgentCorporateActionStandingInstruction.mmSecurity, MarginCall.mmSecurity, com.tools20022.repository.entity.Quote.mmQuotedSecurity, com.tools20022.repository.entity.ComponentSecurity.mmSecurity);
				derivationElement_lazy = () -> Arrays.asList(UnderlyingFinancialInstrument2.mmAttributes, CollateralSubstitution5.mmSecuritiesCollateral, CollateralSubstitution4.mmSecuritiesCollateral,
						CollateralValuation5.mmSecuritiesCollateral, SecuritiesReferenceDataReport5.mmFinancialInstrumentGeneralAttributes, SecurityInstrumentDescription13.mmFinancialInstrumentGeneralAttributes,
						Collateral16.mmSecuritiesCollateral, Collateral17.mmSecuritiesCollateral, FinancialInstrumentDetails29.mmFinancialInstrumentAttributes);
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
						FormOfSecurity6Choice.mmObject(), TemporaryFinancialInstrumentIndicator3Choice.mmObject(), SecuritiesCollateral6.mmObject(), SecuritiesCollateral5.mmObject(), SecuritiesCollateral7.mmObject(),
						SecurityInstrumentDescription9.mmObject(), SecurityInstrumentDescription11.mmObject(), FinancialInstrument46Choice.mmObject(), FinancialInstrument53.mmObject(), TransparencyDataReport11.mmObject(),
						TransparencyDataReport13.mmObject(), SecuritiesReferenceDataReport5.mmObject(), TransparencyDataReport12.mmObject(), TransparencyDataReport15.mmObject(), TransparencyDataReport10.mmObject(),
						TransparencyDataReport14.mmObject(), FinancialInstrument58.mmObject(), FinancialInstrument48Choice.mmObject(), FinancialInstrumentAttributes3Choice.mmObject(), SecurityInstrumentDescription13.mmObject(),
						SecuritiesCollateral8.mmObject(), FinancialInstrumentDetails28.mmObject(), FinancialInstrumentDetails29.mmObject(), SecurityDate16.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Security.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecuritiesIdentification> getIdentification() {
		return identification == null ? identification = new ArrayList<>() : identification;
	}

	public Security setIdentification(List<SecuritiesIdentification> identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public CountryCode getRegisteredDistributionCountry() {
		return registeredDistributionCountry;
	}

	public Security setRegisteredDistributionCountry(CountryCode registeredDistributionCountry) {
		this.registeredDistributionCountry = Objects.requireNonNull(registeredDistributionCountry);
		return this;
	}

	public CurrencyCode getDenominationCurrency() {
		return denominationCurrency;
	}

	public Security setDenominationCurrency(CurrencyCode denominationCurrency) {
		this.denominationCurrency = Objects.requireNonNull(denominationCurrency);
		return this;
	}

	public FormOfSecurityCode getRegistrationForm() {
		return registrationForm;
	}

	public Security setRegistrationForm(FormOfSecurityCode registrationForm) {
		this.registrationForm = Objects.requireNonNull(registrationForm);
		return this;
	}

	public YesNoIndicator getDematerialisedIndicator() {
		return dematerialisedIndicator;
	}

	public Security setDematerialisedIndicator(YesNoIndicator dematerialisedIndicator) {
		this.dematerialisedIndicator = Objects.requireNonNull(dematerialisedIndicator);
		return this;
	}

	public EUSavingsDirectiveCode getEUSavingsDirective() {
		return eUSavingsDirective;
	}

	public Security setEUSavingsDirective(EUSavingsDirectiveCode eUSavingsDirective) {
		this.eUSavingsDirective = Objects.requireNonNull(eUSavingsDirective);
		return this;
	}

	public List<SecuritiesQuantity> getSecuritiesQuantity() {
		return securitiesQuantity == null ? securitiesQuantity = new ArrayList<>() : securitiesQuantity;
	}

	public Security setSecuritiesQuantity(List<com.tools20022.repository.entity.SecuritiesQuantity> securitiesQuantity) {
		this.securitiesQuantity = Objects.requireNonNull(securitiesQuantity);
		return this;
	}

	public List<SecuritiesRelatedFees> getFees() {
		return fees == null ? fees = new ArrayList<>() : fees;
	}

	public Security setFees(List<SecuritiesRelatedFees> fees) {
		this.fees = Objects.requireNonNull(fees);
		return this;
	}

	public List<SecuritiesPricing> getPricing() {
		return pricing == null ? pricing = new ArrayList<>() : pricing;
	}

	public Security setPricing(List<SecuritiesPricing> pricing) {
		this.pricing = Objects.requireNonNull(pricing);
		return this;
	}

	public SecuritiesAccount getSecuritiesAccount() {
		return securitiesAccount;
	}

	public Security setSecuritiesAccount(com.tools20022.repository.entity.SecuritiesAccount securitiesAccount) {
		this.securitiesAccount = Objects.requireNonNull(securitiesAccount);
		return this;
	}

	public List<TradingMarket> getTradingMarket() {
		return tradingMarket == null ? tradingMarket = new ArrayList<>() : tradingMarket;
	}

	public Security setTradingMarket(List<com.tools20022.repository.entity.TradingMarket> tradingMarket) {
		this.tradingMarket = Objects.requireNonNull(tradingMarket);
		return this;
	}

	public List<TradingMarket> getPlaceOfListing() {
		return placeOfListing == null ? placeOfListing = new ArrayList<>() : placeOfListing;
	}

	public Security setPlaceOfListing(List<com.tools20022.repository.entity.TradingMarket> placeOfListing) {
		this.placeOfListing = Objects.requireNonNull(placeOfListing);
		return this;
	}

	public List<BasicSecuritiesRegistration> getRegistration() {
		return registration == null ? registration = new ArrayList<>() : registration;
	}

	public Security setRegistration(List<BasicSecuritiesRegistration> registration) {
		this.registration = Objects.requireNonNull(registration);
		return this;
	}

	public List<SecuritiesRestriction> getRestriction() {
		return restriction == null ? restriction = new ArrayList<>() : restriction;
	}

	public Security setRestriction(List<SecuritiesRestriction> restriction) {
		this.restriction = Objects.requireNonNull(restriction);
		return this;
	}

	public List<CorporateActionEvent> getCorporateEvent() {
		return corporateEvent == null ? corporateEvent = new ArrayList<>() : corporateEvent;
	}

	public Security setCorporateEvent(List<CorporateActionEvent> corporateEvent) {
		this.corporateEvent = Objects.requireNonNull(corporateEvent);
		return this;
	}

	public YesNoIndicator getTemporaryFinancialInstrumentIndicator() {
		return temporaryFinancialInstrumentIndicator;
	}

	public Security setTemporaryFinancialInstrumentIndicator(YesNoIndicator temporaryFinancialInstrumentIndicator) {
		this.temporaryFinancialInstrumentIndicator = Objects.requireNonNull(temporaryFinancialInstrumentIndicator);
		return this;
	}

	public ISODateTime getAvailableDate() {
		return availableDate;
	}

	public Security setAvailableDate(ISODateTime availableDate) {
		this.availableDate = Objects.requireNonNull(availableDate);
		return this;
	}

	public Max350Text getDeclarationDetails() {
		return declarationDetails;
	}

	public Security setDeclarationDetails(Max350Text declarationDetails) {
		this.declarationDetails = Objects.requireNonNull(declarationDetails);
		return this;
	}

	public Optional<Spread> getSpread() {
		return spread == null ? Optional.empty() : Optional.of(spread);
	}

	public Security setSpread(com.tools20022.repository.entity.Spread spread) {
		this.spread = spread;
		return this;
	}

	public List<Dividend> getDividend() {
		return dividend == null ? dividend = new ArrayList<>() : dividend;
	}

	public Security setDividend(List<com.tools20022.repository.entity.Dividend> dividend) {
		this.dividend = Objects.requireNonNull(dividend);
		return this;
	}

	public SecuritiesBalance getBalance() {
		return balance;
	}

	public Security setBalance(SecuritiesBalance balance) {
		this.balance = Objects.requireNonNull(balance);
		return this;
	}

	public YesNoIndicator getFungibleIndicator() {
		return fungibleIndicator;
	}

	public Security setFungibleIndicator(YesNoIndicator fungibleIndicator) {
		this.fungibleIndicator = Objects.requireNonNull(fungibleIndicator);
		return this;
	}

	public AppearanceCode getAppearance() {
		return appearance;
	}

	public Security setAppearance(AppearanceCode appearance) {
		this.appearance = Objects.requireNonNull(appearance);
		return this;
	}

	public Number getNearTermPositionLimit() {
		return nearTermPositionLimit;
	}

	public Security setNearTermPositionLimit(Number nearTermPositionLimit) {
		this.nearTermPositionLimit = Objects.requireNonNull(nearTermPositionLimit);
		return this;
	}

	public ISOYearMonth getContractSettlementMonth() {
		return contractSettlementMonth;
	}

	public Security setContractSettlementMonth(ISOYearMonth contractSettlementMonth) {
		this.contractSettlementMonth = Objects.requireNonNull(contractSettlementMonth);
		return this;
	}

	public Number getMinimumTradingPricingIncrement() {
		return minimumTradingPricingIncrement;
	}

	public Security setMinimumTradingPricingIncrement(Number minimumTradingPricingIncrement) {
		this.minimumTradingPricingIncrement = Objects.requireNonNull(minimumTradingPricingIncrement);
		return this;
	}

	public List<Rating> getRating() {
		return rating == null ? rating = new ArrayList<>() : rating;
	}

	public Security setRating(List<com.tools20022.repository.entity.Rating> rating) {
		this.rating = Objects.requireNonNull(rating);
		return this;
	}

	public List<CouponAttached> getCouponAttached() {
		return couponAttached == null ? couponAttached = new ArrayList<>() : couponAttached;
	}

	public Security setCouponAttached(List<com.tools20022.repository.entity.CouponAttached> couponAttached) {
		this.couponAttached = Objects.requireNonNull(couponAttached);
		return this;
	}

	public Sector getSector() {
		return sector;
	}

	public Security setSector(com.tools20022.repository.entity.Sector sector) {
		this.sector = Objects.requireNonNull(sector);
		return this;
	}

	public YesNoIndicator getWarrantAttachedOnDelivery() {
		return warrantAttachedOnDelivery;
	}

	public Security setWarrantAttachedOnDelivery(YesNoIndicator warrantAttachedOnDelivery) {
		this.warrantAttachedOnDelivery = Objects.requireNonNull(warrantAttachedOnDelivery);
		return this;
	}

	public YesNoIndicator getStrippableIndicator() {
		return strippableIndicator;
	}

	public Security setStrippableIndicator(YesNoIndicator strippableIndicator) {
		this.strippableIndicator = Objects.requireNonNull(strippableIndicator);
		return this;
	}

	public ISODateTime getFirstDealingDate() {
		return firstDealingDate;
	}

	public Security setFirstDealingDate(ISODateTime firstDealingDate) {
		this.firstDealingDate = Objects.requireNonNull(firstDealingDate);
		return this;
	}

	public List<SecuritiesTax> getTaxDetails() {
		return taxDetails == null ? taxDetails = new ArrayList<>() : taxDetails;
	}

	public Security setTaxDetails(List<SecuritiesTax> taxDetails) {
		this.taxDetails = Objects.requireNonNull(taxDetails);
		return this;
	}

	public SecuritiesTrade getSecuritiesTrade() {
		return securitiesTrade;
	}

	public Security setSecuritiesTrade(com.tools20022.repository.entity.SecuritiesTrade securitiesTrade) {
		this.securitiesTrade = Objects.requireNonNull(securitiesTrade);
		return this;
	}

	public Jurisdiction getRegistrationJurisdiction() {
		return registrationJurisdiction;
	}

	public Security setRegistrationJurisdiction(Jurisdiction registrationJurisdiction) {
		this.registrationJurisdiction = Objects.requireNonNull(registrationJurisdiction);
		return this;
	}

	public List<SecuritiesPartyRole> getPartyRole() {
		return partyRole == null ? partyRole = new ArrayList<>() : partyRole;
	}

	public Security setPartyRole(List<SecuritiesPartyRole> partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}

	public List<SecuritiesStatus> getSecurityStatus() {
		return securityStatus == null ? securityStatus = new ArrayList<>() : securityStatus;
	}

	public Security setSecurityStatus(List<SecuritiesStatus> securityStatus) {
		this.securityStatus = Objects.requireNonNull(securityStatus);
		return this;
	}

	public Optional<SecuritiesModification> getModification() {
		return modification == null ? Optional.empty() : Optional.of(modification);
	}

	public Security setModification(SecuritiesModification modification) {
		this.modification = modification;
		return this;
	}

	public List<RedemptionSchedule> getRedemptionSchedule() {
		return redemptionSchedule == null ? redemptionSchedule = new ArrayList<>() : redemptionSchedule;
	}

	public Security setRedemptionSchedule(List<com.tools20022.repository.entity.RedemptionSchedule> redemptionSchedule) {
		this.redemptionSchedule = Objects.requireNonNull(redemptionSchedule);
		return this;
	}

	public List<SecuritiesSettlement> getSecuritiesSettlement() {
		return securitiesSettlement == null ? securitiesSettlement = new ArrayList<>() : securitiesSettlement;
	}

	public Security setSecuritiesSettlement(List<com.tools20022.repository.entity.SecuritiesSettlement> securitiesSettlement) {
		this.securitiesSettlement = Objects.requireNonNull(securitiesSettlement);
		return this;
	}

	public SecuritiesTransfer getSecuritiesTransfer() {
		return securitiesTransfer;
	}

	public Security setSecuritiesTransfer(com.tools20022.repository.entity.SecuritiesTransfer securitiesTransfer) {
		this.securitiesTransfer = Objects.requireNonNull(securitiesTransfer);
		return this;
	}

	public List<AgentCorporateActionStandingInstruction> getCorporateActionStandingInstructions() {
		return corporateActionStandingInstructions == null ? corporateActionStandingInstructions = new ArrayList<>() : corporateActionStandingInstructions;
	}

	public Security setCorporateActionStandingInstructions(List<AgentCorporateActionStandingInstruction> corporateActionStandingInstructions) {
		this.corporateActionStandingInstructions = Objects.requireNonNull(corporateActionStandingInstructions);
		return this;
	}

	public Optional<Quote> getQuote() {
		return quote == null ? Optional.empty() : Optional.of(quote);
	}

	public Security setQuote(com.tools20022.repository.entity.Quote quote) {
		this.quote = quote;
		return this;
	}

	public SecuritiesOrder getSecuritiesOrder() {
		return securitiesOrder;
	}

	public Security setSecuritiesOrder(com.tools20022.repository.entity.SecuritiesOrder securitiesOrder) {
		this.securitiesOrder = Objects.requireNonNull(securitiesOrder);
		return this;
	}

	public Optional<VariableInterest> getRelatedVariableInterest() {
		return relatedVariableInterest == null ? Optional.empty() : Optional.of(relatedVariableInterest);
	}

	public Security setRelatedVariableInterest(VariableInterest relatedVariableInterest) {
		this.relatedVariableInterest = relatedVariableInterest;
		return this;
	}

	public List<SecuritiesConversion> getConversion() {
		return conversion == null ? conversion = new ArrayList<>() : conversion;
	}

	public Security setConversion(List<SecuritiesConversion> conversion) {
		this.conversion = Objects.requireNonNull(conversion);
		return this;
	}

	public List<ComponentSecurity> getComponentSecurity() {
		return componentSecurity == null ? componentSecurity = new ArrayList<>() : componentSecurity;
	}

	public Security setComponentSecurity(List<com.tools20022.repository.entity.ComponentSecurity> componentSecurity) {
		this.componentSecurity = Objects.requireNonNull(componentSecurity);
		return this;
	}

	public YesNoIndicator getRecompositionIndicator() {
		return recompositionIndicator;
	}

	public Security setRecompositionIndicator(YesNoIndicator recompositionIndicator) {
		this.recompositionIndicator = Objects.requireNonNull(recompositionIndicator);
		return this;
	}

	public Max35Text getSeries() {
		return series;
	}

	public Security setSeries(Max35Text series) {
		this.series = Objects.requireNonNull(series);
		return this;
	}

	public PercentageRate getPercentageOfDebtClaim() {
		return percentageOfDebtClaim;
	}

	public Security setPercentageOfDebtClaim(PercentageRate percentageOfDebtClaim) {
		this.percentageOfDebtClaim = Objects.requireNonNull(percentageOfDebtClaim);
		return this;
	}

	public PercentageRate getCoverRate() {
		return coverRate;
	}

	public Security setCoverRate(PercentageRate coverRate) {
		this.coverRate = Objects.requireNonNull(coverRate);
		return this;
	}

	public MaturityRedemptionTypeCode getMaturityRedemption() {
		return maturityRedemption;
	}

	public Security setMaturityRedemption(MaturityRedemptionTypeCode maturityRedemption) {
		this.maturityRedemption = Objects.requireNonNull(maturityRedemption);
		return this;
	}

	public MarginCall getRelatedMarginCall() {
		return relatedMarginCall;
	}

	public Security setRelatedMarginCall(MarginCall relatedMarginCall) {
		this.relatedMarginCall = Objects.requireNonNull(relatedMarginCall);
		return this;
	}

	public Party getCloseLink() {
		return closeLink;
	}

	public Security setCloseLink(Party closeLink) {
		this.closeLink = Objects.requireNonNull(closeLink);
		return this;
	}

	public YesNoIndicator getPotentialEuroSystemEligibility() {
		return potentialEuroSystemEligibility;
	}

	public Security setPotentialEuroSystemEligibility(YesNoIndicator potentialEuroSystemEligibility) {
		this.potentialEuroSystemEligibility = Objects.requireNonNull(potentialEuroSystemEligibility);
		return this;
	}

	public SecuritiesQuantity getMinimumQuantity() {
		return minimumQuantity;
	}

	public Security setMinimumQuantity(com.tools20022.repository.entity.SecuritiesQuantity minimumQuantity) {
		this.minimumQuantity = Objects.requireNonNull(minimumQuantity);
		return this;
	}

	public YesNoIndicator getRestrictedIndicator() {
		return restrictedIndicator;
	}

	public Security setRestrictedIndicator(YesNoIndicator restrictedIndicator) {
		this.restrictedIndicator = Objects.requireNonNull(restrictedIndicator);
		return this;
	}
}