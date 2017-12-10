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
import com.tools20022.repository.choice.TwoLegTransactionType1Choice;
import com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode;
import com.tools20022.repository.codeset.InstrumentSubStructureTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Tangible items of value to a business.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Asset" src="doc-files/Asset.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmExpiryDate
 * Asset.mmExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmMaturityDate
 * Asset.mmMaturityDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmDerivative
 * Asset.mmDerivative}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmAssetValue
 * Asset.mmAssetValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmAssetClassification
 * Asset.mmAssetClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Asset#mmFinancialAssetCategory
 * Asset.mmFinancialAssetCategory}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmAssetPartyRole
 * Asset.mmAssetPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmIssuance
 * Asset.mmIssuance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmPortfolio
 * Asset.mmPortfolio}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmInvestmentAmount
 * Asset.mmInvestmentAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmInvestmentRate
 * Asset.mmInvestmentRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmEffectiveDate
 * Asset.mmEffectiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Asset#mmFinancialInstrumentSubStructure
 * Asset.mmFinancialInstrumentSubStructure}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmInvestmentPlan
 * Asset.mmInvestmentPlan}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmTrade Asset.mmTrade}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmTranche
 * Asset.mmTranche}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Asset#mmLegAdditionalInformation
 * Asset.mmLegAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Asset#mmStandingSettlementInstruction
 * Asset.mmStandingSettlementInstruction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmAsset Trade.mmAsset}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#mmAsset
 * InvestmentPlan.mmAsset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Portfolio#mmAssetDescription
 * Portfolio.mmAssetDescription}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmAsset
 * AssetHolding.mmAsset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetPartyRole#mmAsset
 * AssetPartyRole.mmAsset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetClassification#mmAsset
 * AssetClassification.mmAsset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Derivative#mmUnderlyingAsset
 * Derivative.mmUnderlyingAsset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#mmIssuedAsset
 * Issuance.mmIssuedAsset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmAsset
 * StandingSettlementInstruction.mmAsset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Leg#mmRelatedAsset
 * Leg.mmRelatedAsset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tranche#mmAsset
 * Tranche.mmAsset}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution5#mmOtherCollateral
 * CollateralSubstitution5.mmOtherCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution4#mmOtherCollateral
 * CollateralSubstitution4.mmOtherCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#mmOtherTypeOfCollateral
 * OtherCollateral7.mmOtherTypeOfCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmOtherCollateral
 * CollateralValuation5.mmOtherCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmLetterOfCreditIdentification
 * OtherCollateral6.mmLetterOfCreditIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmOtherTypeOfCollateral
 * OtherCollateral6.mmOtherTypeOfCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral5#mmOtherTypeOfCollateral
 * OtherCollateral5.mmOtherTypeOfCollateral}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security Security}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Money Money}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LetterOfCredit
 * LetterOfCredit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Guarantee Guarantee}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Commodity Commodity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44
 * FinancialInstrumentAttributes44}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherTypeOfCollateral2
 * OtherTypeOfCollateral2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63
 * FinancialInstrumentAttributes63}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
 * FinancialInstrumentAttributes64}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes68
 * FinancialInstrumentAttributes68}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral7
 * OtherCollateral7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral6
 * OtherCollateral6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral5
 * OtherCollateral5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79
 * FinancialInstrumentAttributes79}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81
 * FinancialInstrumentAttributes81}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80
 * FinancialInstrumentAttributes80}</li>
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
 * "Asset"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Tangible items of value to a business."</li>
 * </ul>
 */
public class Asset {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime expiryDate;
	/**
	 * Date on which an order, a privilege, an entitlement or an offer
	 * terminates. For an interest bearing asset, it is the date/time at which
	 * it becomes due and has to be repaid.
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmExpirationDate
	 * FinancialInstrumentStipulations2.mmExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmExpiryDate
	 * FinancialInstrumentAttributes44.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmExpiryDate
	 * FinancialInstrumentAttributes63.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmExpiryDate
	 * FinancialInstrumentAttributes64.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes68#mmExpiryDate
	 * FinancialInstrumentAttributes68.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#mmExpiryDate
	 * OtherCollateral7.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmExpiryDate
	 * OtherCollateral6.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral5#mmExpiryDate
	 * OtherCollateral5.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmExpiryDate
	 * FinancialInstrumentAttributes79.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#mmExpiryDate
	 * FinancialInstrumentAttributes81.mmExpiryDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which an order, a privilege, an entitlement or an offer terminates. For an interest bearing asset, it is the date/time at which it becomes due and has to be repaid."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExpiryDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentStipulations2.mmExpirationDate, FinancialInstrumentAttributes44.mmExpiryDate, FinancialInstrumentAttributes63.mmExpiryDate, FinancialInstrumentAttributes64.mmExpiryDate,
					FinancialInstrumentAttributes68.mmExpiryDate, OtherCollateral7.mmExpiryDate, OtherCollateral6.mmExpiryDate, OtherCollateral5.mmExpiryDate, FinancialInstrumentAttributes79.mmExpiryDate,
					FinancialInstrumentAttributes81.mmExpiryDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpiryDate";
			definition = "Date on which an order, a privilege, an entitlement or an offer terminates. For an interest bearing asset, it is the date/time at which it becomes due and has to be repaid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Asset.class.getMethod("getExpiryDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime maturityDate;
	/**
	 * Planned date, at the time of issuance, on which an interest bearing
	 * financial instrument becomes due and principal is repaid by the issuer to
	 * the investor.
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmMaturityDate
	 * FinancialInstrumentStipulations2.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmMaturityDate
	 * FinancialInstrumentAttributes44.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmMaturityDate
	 * CorporateActionDate2.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral3#mmMaturityDate
	 * CashCollateral3.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral4#mmMaturityDate
	 * CashCollateral4.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral2#mmMaturityDate
	 * CashCollateral2.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral5#mmMaturityDate
	 * CashCollateral5.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebtInstrument2#mmMaturityDate
	 * DebtInstrument2.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmMaturityDate
	 * FinancialInstrumentAttributes63.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmMaturityDate
	 * FinancialInstrumentAttributes64.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmNewMaturityDate
	 * CorporateActionDate44.mmNewMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral6#mmMaturityDate
	 * SecuritiesCollateral6.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral5#mmMaturityDate
	 * SecuritiesCollateral5.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#mmMaturityDate
	 * SecuritiesCollateral7.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebtInstrument4#mmMaturityDate
	 * DebtInstrument4.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#mmMaturityDate
	 * TransparencyDataReport10.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebtInstrument5#mmIssuanceDate
	 * DebtInstrument5.mmIssuanceDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRateDerivative5#mmUnderlyingSwapMaturityDate
	 * InterestRateDerivative5.mmUnderlyingSwapMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BondDerivative2#mmMaturityDate
	 * BondDerivative2.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmMaturityDate
	 * FinancialInstrumentAttributes79.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#mmMaturityDate
	 * FinancialInstrumentAttributes81.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmMaturityDate
	 * FinancialInstrumentAttributes80.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral8#mmMaturityDate
	 * SecuritiesCollateral8.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmMaturityDate
	 * SecuredMarketTransaction4.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#mmMaturityDate
	 * ForeignExchangeSwapTransaction3.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmMaturityDate
	 * OvernightIndexSwapTransaction4.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmMaturityDate
	 * UnsecuredMarketTransaction4.mmMaturityDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Planned date, at the time of issuance, on which an interest bearing financial instrument becomes due and principal is repaid by the issuer to the investor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMaturityDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentStipulations2.mmMaturityDate, FinancialInstrumentAttributes44.mmMaturityDate, CorporateActionDate2.mmMaturityDate, CashCollateral3.mmMaturityDate,
					CashCollateral4.mmMaturityDate, CashCollateral2.mmMaturityDate, CashCollateral5.mmMaturityDate, DebtInstrument2.mmMaturityDate, FinancialInstrumentAttributes63.mmMaturityDate,
					FinancialInstrumentAttributes64.mmMaturityDate, CorporateActionDate44.mmNewMaturityDate, SecuritiesCollateral6.mmMaturityDate, SecuritiesCollateral5.mmMaturityDate, SecuritiesCollateral7.mmMaturityDate,
					DebtInstrument4.mmMaturityDate, TransparencyDataReport10.mmMaturityDate, DebtInstrument5.mmIssuanceDate, InterestRateDerivative5.mmUnderlyingSwapMaturityDate, BondDerivative2.mmMaturityDate,
					FinancialInstrumentAttributes79.mmMaturityDate, FinancialInstrumentAttributes81.mmMaturityDate, FinancialInstrumentAttributes80.mmMaturityDate, SecuritiesCollateral8.mmMaturityDate,
					SecuredMarketTransaction4.mmMaturityDate, ForeignExchangeSwapTransaction3.mmMaturityDate, OvernightIndexSwapTransaction4.mmMaturityDate, UnsecuredMarketTransaction4.mmMaturityDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaturityDate";
			definition = "Planned date, at the time of issuance, on which an interest bearing financial instrument becomes due and principal is repaid by the issuer to the investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Asset.class.getMethod("getMaturityDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Derivative> derivative;
	/**
	 * Specifies the parameters of a derivative instrument based on a specific
	 * asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmUnderlyingAsset
	 * Derivative.mmUnderlyingAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Derivative
	 * Derivative}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TwoLegTransactionType1Choice#mmFutureOrOptionDetails
	 * TwoLegTransactionType1Choice.mmFutureOrOptionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#mmAdditionalDerivativeAttributes
	 * AggregateBalanceInformation31.mmAdditionalDerivativeAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5#mmDerivativeInstrumentAttributes
	 * SecuritiesReferenceDataReport5.mmDerivativeInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#mmDerivative
	 * TransparencyDataReport10.mmDerivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription13#mmDerivativeInstrumentAttributes
	 * SecurityInstrumentDescription13.mmDerivativeInstrumentAttributes}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Derivative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the parameters of a derivative instrument based on a specific asset."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDerivative = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(TwoLegTransactionType1Choice.mmFutureOrOptionDetails, AggregateBalanceInformation31.mmAdditionalDerivativeAttributes, SecuritiesReferenceDataReport5.mmDerivativeInstrumentAttributes,
					TransparencyDataReport10.mmDerivative, SecurityInstrumentDescription13.mmDerivativeInstrumentAttributes);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Derivative";
			definition = "Specifies the parameters of a derivative instrument based on a specific asset.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Derivative.mmUnderlyingAsset;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.AssetHolding> assetValue;
	/**
	 * Specifies the different values of an asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmAsset
	 * AssetHolding.mmAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetHolding
	 * AssetHolding}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown28#mmAccountBaseCurrencyAmounts
	 * QuantityBreakdown28.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown28#mmInstrumentCurrencyAmounts
	 * QuantityBreakdown28.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown28#mmAlternateReportingCurrencyAmounts
	 * QuantityBreakdown28.mmAlternateReportingCurrencyAmounts}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the different values of an asset."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAssetValue = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(QuantityBreakdown28.mmAccountBaseCurrencyAmounts, QuantityBreakdown28.mmInstrumentCurrencyAmounts, QuantityBreakdown28.mmAlternateReportingCurrencyAmounts);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AssetValue";
			definition = "Specifies the different values of an asset.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmAsset;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.AssetClassification> assetClassification;
	/**
	 * Classification of the asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmAsset
	 * AssetClassification.mmAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetClassification
	 * AssetClassification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation13#mmClassificationType
	 * AdditionalInformation13.mmClassificationType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Classification of the asset."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAssetClassification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AdditionalInformation13.mmClassificationType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AssetClassification";
			definition = "Classification of the asset.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AssetClassification.mmAsset;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AssetClassification.mmObject();
		}
	};
	protected FinancialAssetTypeCategoryCode financialAssetCategory;
	/**
	 * Categorization of financial asset type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode
	 * FinancialAssetTypeCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceDetails6#mmCategory
	 * BalanceDetails6.mmCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeForeignExchange3#mmFXType
	 * DerivativeForeignExchange3.mmFXType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAssetCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Categorization of financial asset type."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFinancialAssetCategory = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(BalanceDetails6.mmCategory, DerivativeForeignExchange3.mmFXType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialAssetCategory";
			definition = "Categorization of financial asset type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancialAssetTypeCategoryCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Asset.class.getMethod("getFinancialAssetCategory", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AssetPartyRole assetPartyRole;
	/**
	 * Party which plays a role for a specific asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetPartyRole#mmAsset
	 * AssetPartyRole.mmAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetPartyRole
	 * AssetPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party which plays a role for a specific asset."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAssetPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AssetPartyRole";
			definition = "Party which plays a role for a specific asset.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AssetPartyRole.mmAsset;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AssetPartyRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Issuance> issuance;
	/**
	 * Details regarding the issuance of an asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssuedAsset
	 * Issuance.mmIssuedAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Issuance Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details regarding the issuance of an asset."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIssuance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Issuance";
			definition = "Details regarding the issuance of an asset.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.mmIssuedAsset;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
		}
	};
	protected Portfolio portfolio;
	/**
	 * Asset which is part of a portfolio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Portfolio#mmAssetDescription
	 * Portfolio.mmAssetDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Portfolio Portfolio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Portfolio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset which is part of a portfolio."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPortfolio = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Portfolio";
			definition = "Asset which is part of a portfolio.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Portfolio.mmAssetDescription;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
		}
	};
	protected CurrencyAndAmount investmentAmount;
	/**
	 * Invested amount of the portfolio asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invested amount of the portfolio asset."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInvestmentAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentAmount";
			definition = "Invested amount of the portfolio asset.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Asset.class.getMethod("getInvestmentAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate investmentRate;
	/**
	 * Invested percentage of the portfolio asset.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invested percentage of the portfolio asset."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInvestmentRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentRate";
			definition = "Invested percentage of the portfolio asset.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Asset.class.getMethod("getInvestmentRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime effectiveDate;
	/**
	 * Cut off date/time for the information of the specified portfolio asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cut off date/time for the information of the specified portfolio asset."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEffectiveDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EffectiveDate";
			definition = "Cut off date/time for the information of the specified portfolio asset.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Asset.class.getMethod("getEffectiveDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InstrumentSubStructureTypeCode financialInstrumentSubStructure;
	/**
	 * Indicates the type of deal for structured finance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode
	 * InstrumentSubStructureTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentSubStructure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the type of deal for structured finance."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFinancialInstrumentSubStructure = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentSubStructure";
			definition = "Indicates the type of deal for structured finance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Asset.class.getMethod("getFinancialInstrumentSubStructure", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestmentPlan investmentPlan;
	/**
	 * Investment plan that invests in a specific asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#mmAsset
	 * InvestmentPlan.mmAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment plan that invests in a specific asset."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvestmentPlan = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentPlan";
			definition = "Investment plan that invests in a specific asset.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmAsset;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Trade> trade;
	/**
	 * Trade which which involves a specific asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Trade#mmAsset
	 * Trade.mmAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade which which involves a specific asset."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			definition = "Trade which which involves a specific asset.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.mmAsset;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
		}
	};
	protected Tranche tranche;
	/**
	 * One of a number of related assets offered as part of the same
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Tranche#mmAsset
	 * Tranche.mmAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tranche Tranche}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tranche"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One of a number of related assets offered as part of the same transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTranche = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tranche";
			definition = "One of a number of related assets offered as part of the same transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tranche.mmAsset;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tranche.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Leg> legAdditionalInformation;
	/**
	 * Provides details about the leg.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Leg#mmRelatedAsset
	 * Leg.mmRelatedAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Leg Leg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegAdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about the leg."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmLegAdditionalInformation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LegAdditionalInformation";
			definition = "Provides details about the leg.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Leg.mmRelatedAsset;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Leg.mmObject();
		}
	};
	protected StandingSettlementInstruction standingSettlementInstruction;
	/**
	 * Standing settlement instruction for which an asset is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmAsset
	 * StandingSettlementInstruction.mmAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingSettlementInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Standing settlement instruction for which an asset is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmStandingSettlementInstruction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingSettlementInstruction";
			definition = "Standing settlement instruction for which an asset is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.mmAsset;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Asset";
				definition = "Tangible items of value to a business.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.mmAsset, com.tools20022.repository.entity.InvestmentPlan.mmAsset, com.tools20022.repository.entity.Portfolio.mmAssetDescription,
						com.tools20022.repository.entity.AssetHolding.mmAsset, com.tools20022.repository.entity.AssetPartyRole.mmAsset, com.tools20022.repository.entity.AssetClassification.mmAsset,
						com.tools20022.repository.entity.Derivative.mmUnderlyingAsset, com.tools20022.repository.entity.Issuance.mmIssuedAsset, com.tools20022.repository.entity.StandingSettlementInstruction.mmAsset,
						com.tools20022.repository.entity.Leg.mmRelatedAsset, com.tools20022.repository.entity.Tranche.mmAsset);
				derivationElement_lazy = () -> Arrays.asList(CollateralSubstitution5.mmOtherCollateral, CollateralSubstitution4.mmOtherCollateral, OtherCollateral7.mmOtherTypeOfCollateral, CollateralValuation5.mmOtherCollateral,
						OtherCollateral6.mmLetterOfCreditIdentification, OtherCollateral6.mmOtherTypeOfCollateral, OtherCollateral5.mmOtherTypeOfCollateral);
				subType_lazy = () -> Arrays.asList(Security.mmObject(), com.tools20022.repository.entity.Derivative.mmObject(), Money.mmObject(), LetterOfCredit.mmObject(), Guarantee.mmObject(), Commodity.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.mmExpiryDate, com.tools20022.repository.entity.Asset.mmMaturityDate, com.tools20022.repository.entity.Asset.mmDerivative,
						com.tools20022.repository.entity.Asset.mmAssetValue, com.tools20022.repository.entity.Asset.mmAssetClassification, com.tools20022.repository.entity.Asset.mmFinancialAssetCategory,
						com.tools20022.repository.entity.Asset.mmAssetPartyRole, com.tools20022.repository.entity.Asset.mmIssuance, com.tools20022.repository.entity.Asset.mmPortfolio,
						com.tools20022.repository.entity.Asset.mmInvestmentAmount, com.tools20022.repository.entity.Asset.mmInvestmentRate, com.tools20022.repository.entity.Asset.mmEffectiveDate,
						com.tools20022.repository.entity.Asset.mmFinancialInstrumentSubStructure, com.tools20022.repository.entity.Asset.mmInvestmentPlan, com.tools20022.repository.entity.Asset.mmTrade,
						com.tools20022.repository.entity.Asset.mmTranche, com.tools20022.repository.entity.Asset.mmLegAdditionalInformation, com.tools20022.repository.entity.Asset.mmStandingSettlementInstruction);
				derivationComponent_lazy = () -> Arrays.asList(FinancialInstrumentAttributes44.mmObject(), OtherTypeOfCollateral2.mmObject(), FinancialInstrumentAttributes63.mmObject(), FinancialInstrumentAttributes64.mmObject(),
						FinancialInstrumentAttributes68.mmObject(), OtherCollateral7.mmObject(), OtherCollateral6.mmObject(), OtherCollateral5.mmObject(), FinancialInstrumentAttributes79.mmObject(),
						FinancialInstrumentAttributes81.mmObject(), FinancialInstrumentAttributes80.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Asset.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(ISODateTime expiryDate) {
		this.expiryDate = expiryDate;
	}

	public ISODateTime getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(ISODateTime maturityDate) {
		this.maturityDate = maturityDate;
	}

	public List<Derivative> getDerivative() {
		return derivative;
	}

	public void setDerivative(List<com.tools20022.repository.entity.Derivative> derivative) {
		this.derivative = derivative;
	}

	public List<AssetHolding> getAssetValue() {
		return assetValue;
	}

	public void setAssetValue(List<com.tools20022.repository.entity.AssetHolding> assetValue) {
		this.assetValue = assetValue;
	}

	public List<AssetClassification> getAssetClassification() {
		return assetClassification;
	}

	public void setAssetClassification(List<com.tools20022.repository.entity.AssetClassification> assetClassification) {
		this.assetClassification = assetClassification;
	}

	public FinancialAssetTypeCategoryCode getFinancialAssetCategory() {
		return financialAssetCategory;
	}

	public void setFinancialAssetCategory(FinancialAssetTypeCategoryCode financialAssetCategory) {
		this.financialAssetCategory = financialAssetCategory;
	}

	public AssetPartyRole getAssetPartyRole() {
		return assetPartyRole;
	}

	public void setAssetPartyRole(com.tools20022.repository.entity.AssetPartyRole assetPartyRole) {
		this.assetPartyRole = assetPartyRole;
	}

	public List<Issuance> getIssuance() {
		return issuance;
	}

	public void setIssuance(List<com.tools20022.repository.entity.Issuance> issuance) {
		this.issuance = issuance;
	}

	public Portfolio getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(com.tools20022.repository.entity.Portfolio portfolio) {
		this.portfolio = portfolio;
	}

	public CurrencyAndAmount getInvestmentAmount() {
		return investmentAmount;
	}

	public void setInvestmentAmount(CurrencyAndAmount investmentAmount) {
		this.investmentAmount = investmentAmount;
	}

	public PercentageRate getInvestmentRate() {
		return investmentRate;
	}

	public void setInvestmentRate(PercentageRate investmentRate) {
		this.investmentRate = investmentRate;
	}

	public ISODateTime getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(ISODateTime effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public InstrumentSubStructureTypeCode getFinancialInstrumentSubStructure() {
		return financialInstrumentSubStructure;
	}

	public void setFinancialInstrumentSubStructure(InstrumentSubStructureTypeCode financialInstrumentSubStructure) {
		this.financialInstrumentSubStructure = financialInstrumentSubStructure;
	}

	public InvestmentPlan getInvestmentPlan() {
		return investmentPlan;
	}

	public void setInvestmentPlan(com.tools20022.repository.entity.InvestmentPlan investmentPlan) {
		this.investmentPlan = investmentPlan;
	}

	public List<Trade> getTrade() {
		return trade;
	}

	public void setTrade(List<com.tools20022.repository.entity.Trade> trade) {
		this.trade = trade;
	}

	public Tranche getTranche() {
		return tranche;
	}

	public void setTranche(com.tools20022.repository.entity.Tranche tranche) {
		this.tranche = tranche;
	}

	public List<Leg> getLegAdditionalInformation() {
		return legAdditionalInformation;
	}

	public void setLegAdditionalInformation(List<com.tools20022.repository.entity.Leg> legAdditionalInformation) {
		this.legAdditionalInformation = legAdditionalInformation;
	}

	public StandingSettlementInstruction getStandingSettlementInstruction() {
		return standingSettlementInstruction;
	}

	public void setStandingSettlementInstruction(com.tools20022.repository.entity.StandingSettlementInstruction standingSettlementInstruction) {
		this.standingSettlementInstruction = standingSettlementInstruction;
	}
}