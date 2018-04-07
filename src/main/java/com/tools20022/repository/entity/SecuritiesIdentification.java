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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Unique and unambiguous identifier of a security, assigned under a formal or
 * proprietary identification scheme.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesIdentification"
 * src="doc-files/SecuritiesIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmIdentifiedSecurity
 * SecuritiesIdentification.mmIdentifiedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSecurityIdentification
 * SecuritiesIdentification.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmRIC
 * SecuritiesIdentification.mmRIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmTickerSymbol
 * SecuritiesIdentification.mmTickerSymbol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmBloomberg
 * SecuritiesIdentification.mmBloomberg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmCTA
 * SecuritiesIdentification.mmCTA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmCommon
 * SecuritiesIdentification.mmCommon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmName
 * SecuritiesIdentification.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSEDOL
 * SecuritiesIdentification.mmSEDOL}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmCUSIP
 * SecuritiesIdentification.mmCUSIP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmQUICK
 * SecuritiesIdentification.mmQUICK}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmWertpapier
 * SecuritiesIdentification.mmWertpapier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmDutch
 * SecuritiesIdentification.mmDutch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmValoren
 * SecuritiesIdentification.mmValoren}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSicovam
 * SecuritiesIdentification.mmSicovam}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmBelgian
 * SecuritiesIdentification.mmBelgian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmIdentificationSuffix
 * SecuritiesIdentification.mmIdentificationSuffix}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmGenericIdentification
 * SecuritiesIdentification.mmGenericIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmValidityPeriod
 * SecuritiesIdentification.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmApplicableTradingMarket
 * SecuritiesIdentification.mmApplicableTradingMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmPrimeIdentification
 * SecuritiesIdentification.mmPrimeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmRelatedOtherIdentification
 * SecuritiesIdentification.mmRelatedOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmTradingIdentification
 * SecuritiesIdentification.mmTradingIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmIdentification
 * Security.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmPrimeIdentification
 * SecuritiesIdentification.mmPrimeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmRelatedOtherIdentification
 * SecuritiesIdentification.mmRelatedOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedSecuritiesIdentification
 * GenericIdentification.mmRelatedSecuritiesIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LocalName#mmRelatedSecurity
 * LocalName.mmRelatedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmListedSecurityTradingIdentification
 * TradingMarket.mmListedSecurityTradingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedSecuritiesIdentification
 * DateTimePeriod.mmRelatedSecuritiesIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7#mmOtherIdentification
 * SecurityIdentification7.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7#mmDescription
 * SecurityIdentification7.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification1#mmIdentification
 * SecurityIdentification1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmOtherProprietaryIdentification
 * SecurityIdentification3Choice.mmOtherProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14#mmOtherIdentification
 * SecurityIdentification14.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14#mmDescription
 * SecurityIdentification14.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportItem1#mmFinancialInstrumentIdentification
 * ReportItem1.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance1#mmFinancialInstrumentIdentification
 * AggregateHoldingBalance1.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19#mmOtherIdentification
 * SecurityIdentification19.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19#mmDescription
 * SecurityIdentification19.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmOtherProprietaryIdentification
 * SecurityIdentification25Choice.mmOtherProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwapLegIdentification2#mmSwapIn
 * SwapLegIdentification2.mmSwapIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwapLegIdentification2#mmSwapOut
 * SwapLegIdentification2.mmSwapOut}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification3
 * AlternateSecurityIdentification3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification7
 * SecurityIdentification7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification1
 * SecurityIdentification1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification1
 * AlternateSecurityIdentification1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice
 * SecurityIdentification3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherIdentification1
 * OtherIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification14
 * SecurityIdentification14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherIdentification4
 * OtherIdentification4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification7
 * AlternateSecurityIdentification7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification19
 * SecurityIdentification19}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice
 * SecurityIdentification25Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification6Choice
 * FinancialInstrumentIdentification6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BasketDescription3
 * BasketDescription3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification7Choice
 * FinancialInstrumentIdentification7Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification5Choice
 * FinancialInstrumentIdentification5Choice}</li>
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
 * "SecuritiesIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Unique and unambiguous identifier of a security, assigned under a formal or proprietary identification scheme."
 * </li>
 * </ul>
 */
public class SecuritiesIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<Security> identifiedSecurity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification6Choice#mmIndex
	 * FinancialInstrumentIdentification6Choice.mmIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification7Choice#mmSingle
	 * FinancialInstrumentIdentification7Choice.mmSingle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification7Choice#mmBasket
	 * FinancialInstrumentIdentification7Choice.mmBasket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification5Choice#mmSingle
	 * FinancialInstrumentIdentification5Choice.mmSingle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification5Choice#mmBasket
	 * FinancialInstrumentIdentification5Choice.mmBasket}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentifiedSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security for which an identification is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesIdentification, List<Security>> mmIdentifiedSecurity = new MMBusinessAssociationEnd<SecuritiesIdentification, List<Security>>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentIdentification6Choice.mmIndex, FinancialInstrumentIdentification7Choice.mmSingle, FinancialInstrumentIdentification7Choice.mmBasket,
					FinancialInstrumentIdentification5Choice.mmSingle, FinancialInstrumentIdentification5Choice.mmBasket);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentifiedSecurity";
			definition = "Security for which an identification is provided.";
			minOccurs = 1;
			opposite_lazy = () -> Security.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}

		@Override
		public List<Security> getValue(SecuritiesIdentification obj) {
			return obj.getIdentifiedSecurity();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, List<Security> value) {
			obj.setIdentifiedSecurity(value);
		}
	};
	protected ISINOct2015Identifier securityIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISINOct2015Identifier
	 * ISINOct2015Identifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7#mmISIN
	 * SecurityIdentification7.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmISIN
	 * SecurityIdentification3Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14#mmISIN
	 * SecurityIdentification14.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund3#mmIdentification
	 * InvestmentFundTransactionsByFund3.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InflationIndex1Choice#mmISIN
	 * InflationIndex1Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19#mmISIN
	 * SecurityIdentification19.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation6#mmISIN
	 * CollateralValuation6.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VolumeCapReport2#mmIdentification
	 * VolumeCapReport2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrument46Choice#mmISIN
	 * FinancialInstrument46Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument53#mmISIN
	 * FinancialInstrument53.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName6Choice#mmISIN
	 * BenchmarkCurveName6Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmISIN
	 * SecurityIdentification25Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11#mmIdentification
	 * TransparencyDataReport11.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport13#mmIdentification
	 * TransparencyDataReport13.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12#mmIdentification
	 * TransparencyDataReport12.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport15#mmIdentification
	 * TransparencyDataReport15.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#mmIdentification
	 * TransparencyDataReport10.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14#mmIdentification
	 * TransparencyDataReport14.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification6Choice#mmISIN
	 * FinancialInstrumentIdentification6Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument58#mmISIN
	 * FinancialInstrument58.mmISIN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BasketDescription3#mmISIN
	 * BasketDescription3.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrument48Choice#mmISIN
	 * FinancialInstrument48Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative4#mmUnderlyingNameIdentification
	 * CreditDefaultSwapDerivative4.mmUnderlyingNameIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative4#mmObligationIdentification
	 * CreditDefaultSwapDerivative4.mmObligationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentAttributes3Choice#mmIdentification
	 * FinancialInstrumentAttributes3Choice.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a security by an ISIN."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesIdentification, ISINOct2015Identifier> mmSecurityIdentification = new MMBusinessAttribute<SecuritiesIdentification, ISINOct2015Identifier>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification7.mmISIN, SecurityIdentification3Choice.mmISIN, SecurityIdentification14.mmISIN, InvestmentFundTransactionsByFund3.mmIdentification, InflationIndex1Choice.mmISIN,
					SecurityIdentification19.mmISIN, CollateralValuation6.mmISIN, VolumeCapReport2.mmIdentification, FinancialInstrument46Choice.mmISIN, FinancialInstrument53.mmISIN, BenchmarkCurveName6Choice.mmISIN,
					SecurityIdentification25Choice.mmISIN, TransparencyDataReport11.mmIdentification, TransparencyDataReport13.mmIdentification, TransparencyDataReport12.mmIdentification, TransparencyDataReport15.mmIdentification,
					TransparencyDataReport10.mmIdentification, TransparencyDataReport14.mmIdentification, FinancialInstrumentIdentification6Choice.mmISIN, FinancialInstrument58.mmISIN, BasketDescription3.mmISIN,
					FinancialInstrument48Choice.mmISIN, CreditDefaultSwapDerivative4.mmUnderlyingNameIdentification, CreditDefaultSwapDerivative4.mmObligationIdentification, FinancialInstrumentAttributes3Choice.mmIdentification);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecurityIdentification";
			definition = "Identification of a security by an ISIN.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISINOct2015Identifier.mmObject();
		}

		@Override
		public ISINOct2015Identifier getValue(SecuritiesIdentification obj) {
			return obj.getSecurityIdentification();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, ISINOct2015Identifier value) {
			obj.setSecurityIdentification(value);
		}
	};
	protected RICIdentifier rIC;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RICIdentifier
	 * RICIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmRIC
	 * SecurityIdentification3Choice.mmRIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmRIC
	 * SecurityIdentification25Choice.mmRIC}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reuters Identification Code (RIC). A numbering system used within the Reuters system to identify instruments worldwide. The RIC contains an X-character market specific code (can be the CUSIP or EPIC codes) followed by a full stop, then the two-digit ISO country code, eg, IBM in UK is IBM.UK."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesIdentification, RICIdentifier> mmRIC = new MMBusinessAttribute<SecuritiesIdentification, RICIdentifier>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification3Choice.mmRIC, SecurityIdentification25Choice.mmRIC);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RIC";
			definition = "Reuters Identification Code (RIC). A numbering system used within the Reuters system to identify instruments worldwide. The RIC contains an X-character market specific code (can be the CUSIP or EPIC codes) followed by a full stop, then the two-digit ISO country code, eg, IBM in UK is IBM.UK.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RICIdentifier.mmObject();
		}

		@Override
		public RICIdentifier getValue(SecuritiesIdentification obj) {
			return obj.getRIC();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, RICIdentifier value) {
			obj.setRIC(value);
		}
	};
	protected TickerIdentifier tickerSymbol;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TickerIdentifier
	 * TickerIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmTickerSymbol
	 * SecurityIdentification3Choice.mmTickerSymbol}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmTickerSymbol
	 * SecurityIdentification25Choice.mmTickerSymbol}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TickerSymbol"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Letters that identify a stock traded on a stock exchange. The Ticker Symbol is a short and convenient way of identifying a stock, eg, RTR.L for Reuters quoted in London."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesIdentification, TickerIdentifier> mmTickerSymbol = new MMBusinessAttribute<SecuritiesIdentification, TickerIdentifier>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification3Choice.mmTickerSymbol, SecurityIdentification25Choice.mmTickerSymbol);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TickerSymbol";
			definition = "Letters that identify a stock traded on a stock exchange. The Ticker Symbol is a short and convenient way of identifying a stock, eg, RTR.L for Reuters quoted in London.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TickerIdentifier.mmObject();
		}

		@Override
		public TickerIdentifier getValue(SecuritiesIdentification obj) {
			return obj.getTickerSymbol();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, TickerIdentifier value) {
			obj.setTickerSymbol(value);
		}
	};
	protected Bloomberg2Identifier bloomberg;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Bloomberg2Identifier
	 * Bloomberg2Identifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmBloomberg
	 * SecurityIdentification3Choice.mmBloomberg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmBloomberg
	 * SecurityIdentification25Choice.mmBloomberg}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bloomberg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of a security assigned by the Bloomberg organisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesIdentification, Bloomberg2Identifier> mmBloomberg = new MMBusinessAttribute<SecuritiesIdentification, Bloomberg2Identifier>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification3Choice.mmBloomberg, SecurityIdentification25Choice.mmBloomberg);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Bloomberg";
			definition = "Identifier of a security assigned by the Bloomberg organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Bloomberg2Identifier.mmObject();
		}

		@Override
		public Bloomberg2Identifier getValue(SecuritiesIdentification obj) {
			return obj.getBloomberg();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, Bloomberg2Identifier value) {
			obj.setBloomberg(value);
		}
	};
	protected ConsolidatedTapeAssociationIdentifier cTA;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ConsolidatedTapeAssociationIdentifier
	 * ConsolidatedTapeAssociationIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmCTA
	 * SecurityIdentification3Choice.mmCTA}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmCTA
	 * SecurityIdentification25Choice.mmCTA}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of a security assigned by the Consolidated Tape Association."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesIdentification, ConsolidatedTapeAssociationIdentifier> mmCTA = new MMBusinessAttribute<SecuritiesIdentification, ConsolidatedTapeAssociationIdentifier>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification3Choice.mmCTA, SecurityIdentification25Choice.mmCTA);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CTA";
			definition = "Identifier of a security assigned by the Consolidated Tape Association.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ConsolidatedTapeAssociationIdentifier.mmObject();
		}

		@Override
		public ConsolidatedTapeAssociationIdentifier getValue(SecuritiesIdentification obj) {
			return obj.getCTA();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, ConsolidatedTapeAssociationIdentifier value) {
			obj.setCTA(value);
		}
	};
	protected EuroclearClearstreamIdentifier common;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.EuroclearClearstreamIdentifier
	 * EuroclearClearstreamIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmCommon
	 * SecurityIdentification3Choice.mmCommon}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmCommon
	 * SecurityIdentification25Choice.mmCommon}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Common"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of securities issued in Luxembourg.  The common code is a 9-digit code that replaces the CEDEL (Clearstream) and Euroclear codes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesIdentification, EuroclearClearstreamIdentifier> mmCommon = new MMBusinessAttribute<SecuritiesIdentification, EuroclearClearstreamIdentifier>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification3Choice.mmCommon, SecurityIdentification25Choice.mmCommon);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Common";
			definition = "Identifier of securities issued in Luxembourg.  The common code is a 9-digit code that replaces the CEDEL (Clearstream) and Euroclear codes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EuroclearClearstreamIdentifier.mmObject();
		}

		@Override
		public EuroclearClearstreamIdentifier getValue(SecuritiesIdentification obj) {
			return obj.getCommon();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, EuroclearClearstreamIdentifier value) {
			obj.setCommon(value);
		}
	};
	protected LocalName name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LocalName#mmRelatedSecurity
	 * LocalName.mmRelatedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LocalName LocalName}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund3#mmName
	 * InvestmentFundTransactionsByFund3.mmName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70a::FIAN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the financial instrument in free format text."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesIdentification, LocalName> mmName = new MMBusinessAssociationEnd<SecuritiesIdentification, LocalName>() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentFundTransactionsByFund3.mmName);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70a::FIAN"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name of the financial instrument in free format text.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> LocalName.mmRelatedSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> LocalName.mmObject();
		}

		@Override
		public LocalName getValue(SecuritiesIdentification obj) {
			return obj.getName();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, LocalName value) {
			obj.setName(value);
		}
	};
	protected SEDOLIdentifier sEDOL;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SEDOLIdentifier
	 * SEDOLIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmSEDOL
	 * SecurityIdentification3Choice.mmSEDOL}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmSEDOL
	 * SecurityIdentification25Choice.mmSEDOL}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SEDOL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Stock Exchange Daily Official List (SEDOL) number.  A code used by the London Stock Exchange to identify foreign stocks, especially those that aren't actively traded in the US and don't have a CUSIP number."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesIdentification, SEDOLIdentifier> mmSEDOL = new MMBusinessAttribute<SecuritiesIdentification, SEDOLIdentifier>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification3Choice.mmSEDOL, SecurityIdentification25Choice.mmSEDOL);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SEDOL";
			definition = "Stock Exchange Daily Official List (SEDOL) number.  A code used by the London Stock Exchange to identify foreign stocks, especially those that aren't actively traded in the US and don't have a CUSIP number.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SEDOLIdentifier.mmObject();
		}

		@Override
		public SEDOLIdentifier getValue(SecuritiesIdentification obj) {
			return obj.getSEDOL();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, SEDOLIdentifier value) {
			obj.setSEDOL(value);
		}
	};
	protected CUSIPIdentifier cUSIP;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CUSIPIdentifier
	 * CUSIPIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmCUSIP
	 * SecurityIdentification3Choice.mmCUSIP}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmCUSIP
	 * SecurityIdentification25Choice.mmCUSIP}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CUSIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Committee on Uniform Securities and Identification Procedures (CUSIP). The standards body that created and maintains the securities classification system in the US. The CUSIP is composed of a 9-character number that uniquely identifies a particular security.  Non-US securities have a similar number called the CINS number."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesIdentification, CUSIPIdentifier> mmCUSIP = new MMBusinessAttribute<SecuritiesIdentification, CUSIPIdentifier>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification3Choice.mmCUSIP, SecurityIdentification25Choice.mmCUSIP);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CUSIP";
			definition = "Committee on Uniform Securities and Identification Procedures (CUSIP). The standards body that created and maintains the securities classification system in the US. The CUSIP is composed of a 9-character number that uniquely identifies a particular security.  Non-US securities have a similar number called the CINS number.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CUSIPIdentifier.mmObject();
		}

		@Override
		public CUSIPIdentifier getValue(SecuritiesIdentification obj) {
			return obj.getCUSIP();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, CUSIPIdentifier value) {
			obj.setCUSIP(value);
		}
	};
	protected QUICKIdentifier qUICK;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.QUICKIdentifier
	 * QUICKIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmQUICK
	 * SecurityIdentification3Choice.mmQUICK}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmQUICK
	 * SecurityIdentification25Choice.mmQUICK}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QUICK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of a security assigned by the Japanese QUICK identification scheme for financial instruments."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesIdentification, QUICKIdentifier> mmQUICK = new MMBusinessAttribute<SecuritiesIdentification, QUICKIdentifier>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification3Choice.mmQUICK, SecurityIdentification25Choice.mmQUICK);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QUICK";
			definition = "Identifier of a security assigned by the Japanese QUICK identification scheme for financial instruments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> QUICKIdentifier.mmObject();
		}

		@Override
		public QUICKIdentifier getValue(SecuritiesIdentification obj) {
			return obj.getQUICK();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, QUICKIdentifier value) {
			obj.setQUICK(value);
		}
	};
	protected WertpapierIdentifier wertpapier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.WertpapierIdentifier
	 * WertpapierIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmWertpapier
	 * SecurityIdentification3Choice.mmWertpapier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmWertpapier
	 * SecurityIdentification25Choice.mmWertpapier}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Wertpapier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Wertpapier Kenn-nummer.  A number issued in Germany by the Wertpapier Mitteilungen. The Wertpapier Kenn-nummer, sometimes called WPK, contains 6-digits, but no check digit. There are different ranges of numbers representing different classes of securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesIdentification, WertpapierIdentifier> mmWertpapier = new MMBusinessAttribute<SecuritiesIdentification, WertpapierIdentifier>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification3Choice.mmWertpapier, SecurityIdentification25Choice.mmWertpapier);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Wertpapier";
			definition = "Wertpapier Kenn-nummer.  A number issued in Germany by the Wertpapier Mitteilungen. The Wertpapier Kenn-nummer, sometimes called WPK, contains 6-digits, but no check digit. There are different ranges of numbers representing different classes of securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> WertpapierIdentifier.mmObject();
		}

		@Override
		public WertpapierIdentifier getValue(SecuritiesIdentification obj) {
			return obj.getWertpapier();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, WertpapierIdentifier value) {
			obj.setWertpapier(value);
		}
	};
	protected DutchIdentifier dutch;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DutchIdentifier
	 * DutchIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmDutch
	 * SecurityIdentification3Choice.mmDutch}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmDutch
	 * SecurityIdentification25Choice.mmDutch}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dutch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier for Dutch securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesIdentification, DutchIdentifier> mmDutch = new MMBusinessAttribute<SecuritiesIdentification, DutchIdentifier>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification3Choice.mmDutch, SecurityIdentification25Choice.mmDutch);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Dutch";
			definition = "Identifier for Dutch securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DutchIdentifier.mmObject();
		}

		@Override
		public DutchIdentifier getValue(SecuritiesIdentification obj) {
			return obj.getDutch();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, DutchIdentifier value) {
			obj.setDutch(value);
		}
	};
	protected ValorenIdentifier valoren;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ValorenIdentifier
	 * ValorenIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmValoren
	 * SecurityIdentification3Choice.mmValoren}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmValoren
	 * SecurityIdentification25Choice.mmValoren}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Valoren"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier for Swiss securities assigned by Telekurs Financial, the Swiss numbering agency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesIdentification, ValorenIdentifier> mmValoren = new MMBusinessAttribute<SecuritiesIdentification, ValorenIdentifier>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification3Choice.mmValoren, SecurityIdentification25Choice.mmValoren);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Valoren";
			definition = "Identifier for Swiss securities assigned by Telekurs Financial, the Swiss numbering agency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ValorenIdentifier.mmObject();
		}

		@Override
		public ValorenIdentifier getValue(SecuritiesIdentification obj) {
			return obj.getValoren();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, ValorenIdentifier value) {
			obj.setValoren(value);
		}
	};
	protected SicovamIdentifier sicovam;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SicovamIdentifier
	 * SicovamIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmSicovam
	 * SecurityIdentification3Choice.mmSicovam}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmSicovam
	 * SecurityIdentification25Choice.mmSicovam}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sicovam"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier for French securities assigned by the Societe Interprofessionnelle Pour La Compensation des Valeurs Mobilieres in France.  The Sicovam is composed of 5-digits."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesIdentification, SicovamIdentifier> mmSicovam = new MMBusinessAttribute<SecuritiesIdentification, SicovamIdentifier>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification3Choice.mmSicovam, SecurityIdentification25Choice.mmSicovam);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Sicovam";
			definition = "Identifier for French securities assigned by the Societe Interprofessionnelle Pour La Compensation des Valeurs Mobilieres in France.  The Sicovam is composed of 5-digits.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SicovamIdentifier.mmObject();
		}

		@Override
		public SicovamIdentifier getValue(SecuritiesIdentification obj) {
			return obj.getSicovam();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, SicovamIdentifier value) {
			obj.setSicovam(value);
		}
	};
	protected BelgianIdentifier belgian;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BelgianIdentifier
	 * BelgianIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmBelgian
	 * SecurityIdentification3Choice.mmBelgian}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmBelgian
	 * SecurityIdentification25Choice.mmBelgian}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Belgian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier for Belgian securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesIdentification, BelgianIdentifier> mmBelgian = new MMBusinessAttribute<SecuritiesIdentification, BelgianIdentifier>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification3Choice.mmBelgian, SecurityIdentification25Choice.mmBelgian);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Belgian";
			definition = "Identifier for Belgian securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BelgianIdentifier.mmObject();
		}

		@Override
		public BelgianIdentifier getValue(SecuritiesIdentification obj) {
			return obj.getBelgian();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, BelgianIdentifier value) {
			obj.setBelgian(value);
		}
	};
	protected Max35Text identificationSuffix;
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
	 * {@linkplain com.tools20022.repository.msg.OtherIdentification1#mmSuffix
	 * OtherIdentification1.mmSuffix}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationSuffix"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the suffix of the security identification."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesIdentification, Max35Text> mmIdentificationSuffix = new MMBusinessAttribute<SecuritiesIdentification, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(OtherIdentification1.mmSuffix);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationSuffix";
			definition = "Identifies the suffix of the security identification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SecuritiesIdentification obj) {
			return obj.getIdentificationSuffix();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, Max35Text value) {
			obj.setIdentificationSuffix(value);
		}
	};
	protected GenericIdentification genericIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedSecuritiesIdentification
	 * GenericIdentification.mmRelatedSecuritiesIdentification}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification7#mmIdentificationSource
	 * AlternateSecurityIdentification7.mmIdentificationSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentAttributes3Choice#mmOther
	 * FinancialInstrumentAttributes3Choice.mmOther}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proprietary identification of a security assigned by an institution or organisation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesIdentification, GenericIdentification> mmGenericIdentification = new MMBusinessAssociationEnd<SecuritiesIdentification, GenericIdentification>() {
		{
			derivation_lazy = () -> Arrays.asList(AlternateSecurityIdentification7.mmIdentificationSource, FinancialInstrumentAttributes3Choice.mmOther);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GenericIdentification";
			definition = "Proprietary identification of a security assigned by an institution or organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> GenericIdentification.mmRelatedSecuritiesIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}

		@Override
		public GenericIdentification getValue(SecuritiesIdentification obj) {
			return obj.getGenericIdentification();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, GenericIdentification value) {
			obj.setGenericIdentification(value);
		}
	};
	protected List<DateTimePeriod> validityPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedSecuritiesIdentification
	 * DateTimePeriod.mmRelatedSecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the period during which an identification is valid."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesIdentification, List<DateTimePeriod>> mmValidityPeriod = new MMBusinessAssociationEnd<SecuritiesIdentification, List<DateTimePeriod>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Specifies the period during which an identification is valid.";
			minOccurs = 0;
			opposite_lazy = () -> DateTimePeriod.mmRelatedSecuritiesIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public List<DateTimePeriod> getValue(SecuritiesIdentification obj) {
			return obj.getValidityPeriod();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, List<DateTimePeriod> value) {
			obj.setValidityPeriod(value);
		}
	};
	protected List<TradingMarket> applicableTradingMarket;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmListedSecurityTradingIdentification
	 * TradingMarket.mmListedSecurityTradingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradingMarket
	 * TradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicableTradingMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market(s) on which the trading identification is used."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesIdentification, List<TradingMarket>> mmApplicableTradingMarket = new MMBusinessAssociationEnd<SecuritiesIdentification, List<TradingMarket>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ApplicableTradingMarket";
			definition = "Market(s) on which the trading identification is used.";
			minOccurs = 0;
			opposite_lazy = () -> TradingMarket.mmListedSecurityTradingIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TradingMarket.mmObject();
		}

		@Override
		public List<TradingMarket> getValue(SecuritiesIdentification obj) {
			return obj.getApplicableTradingMarket();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, List<TradingMarket> value) {
			obj.setApplicableTradingMarket(value);
		}
	};
	protected SecuritiesIdentification primeIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmRelatedOtherIdentification
	 * SecuritiesIdentification.mmRelatedOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the main identification of a security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesIdentification, SecuritiesIdentification> mmPrimeIdentification = new MMBusinessAssociationEnd<SecuritiesIdentification, SecuritiesIdentification>() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PrimeIdentification";
			definition = "Specifies the main identification of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesIdentification.mmRelatedOtherIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesIdentification.mmObject();
		}

		@Override
		public SecuritiesIdentification getValue(SecuritiesIdentification obj) {
			return obj.getPrimeIdentification();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, SecuritiesIdentification value) {
			obj.setPrimeIdentification(value);
		}
	};
	protected List<SecuritiesIdentification> relatedOtherIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmPrimeIdentification
	 * SecuritiesIdentification.mmPrimeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOtherIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Alternate security identification(s) related to the security trading identification."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesIdentification, List<SecuritiesIdentification>> mmRelatedOtherIdentification = new MMBusinessAssociationEnd<SecuritiesIdentification, List<SecuritiesIdentification>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOtherIdentification";
			definition = "Alternate security identification(s) related to the security trading identification.";
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesIdentification.mmPrimeIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesIdentification.mmObject();
		}

		@Override
		public List<SecuritiesIdentification> getValue(SecuritiesIdentification obj) {
			return obj.getRelatedOtherIdentification();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, List<SecuritiesIdentification> value) {
			obj.setRelatedOtherIdentification(value);
		}
	};
	protected Max70Text tradingIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security identifier specific to a trading market or markets, for example, Ticker."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesIdentification, Max70Text> mmTradingIdentification = new MMBusinessAttribute<SecuritiesIdentification, Max70Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingIdentification";
			definition = "Security identifier specific to a trading market or markets, for example, Ticker.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Max70Text getValue(SecuritiesIdentification obj) {
			return obj.getTradingIdentification();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, Max70Text value) {
			obj.setTradingIdentification(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesIdentification";
				definition = "Unique and unambiguous identifier of a security, assigned under a formal or proprietary identification scheme.";
				associationDomain_lazy = () -> Arrays.asList(Security.mmIdentification, SecuritiesIdentification.mmPrimeIdentification, SecuritiesIdentification.mmRelatedOtherIdentification,
						GenericIdentification.mmRelatedSecuritiesIdentification, LocalName.mmRelatedSecurity, TradingMarket.mmListedSecurityTradingIdentification, DateTimePeriod.mmRelatedSecuritiesIdentification);
				derivationElement_lazy = () -> Arrays.asList(SecurityIdentification7.mmOtherIdentification, SecurityIdentification7.mmDescription, SecurityIdentification1.mmIdentification,
						SecurityIdentification3Choice.mmOtherProprietaryIdentification, SecurityIdentification14.mmOtherIdentification, SecurityIdentification14.mmDescription, ReportItem1.mmFinancialInstrumentIdentification,
						AggregateHoldingBalance1.mmFinancialInstrumentIdentification, SecurityIdentification19.mmOtherIdentification, SecurityIdentification19.mmDescription, SecurityIdentification25Choice.mmOtherProprietaryIdentification,
						SwapLegIdentification2.mmSwapIn, SwapLegIdentification2.mmSwapOut);
				element_lazy = () -> Arrays.asList(SecuritiesIdentification.mmIdentifiedSecurity, SecuritiesIdentification.mmSecurityIdentification, SecuritiesIdentification.mmRIC, SecuritiesIdentification.mmTickerSymbol,
						SecuritiesIdentification.mmBloomberg, SecuritiesIdentification.mmCTA, SecuritiesIdentification.mmCommon, SecuritiesIdentification.mmName, SecuritiesIdentification.mmSEDOL, SecuritiesIdentification.mmCUSIP,
						SecuritiesIdentification.mmQUICK, SecuritiesIdentification.mmWertpapier, SecuritiesIdentification.mmDutch, SecuritiesIdentification.mmValoren, SecuritiesIdentification.mmSicovam, SecuritiesIdentification.mmBelgian,
						SecuritiesIdentification.mmIdentificationSuffix, SecuritiesIdentification.mmGenericIdentification, SecuritiesIdentification.mmValidityPeriod, SecuritiesIdentification.mmApplicableTradingMarket,
						SecuritiesIdentification.mmPrimeIdentification, SecuritiesIdentification.mmRelatedOtherIdentification, SecuritiesIdentification.mmTradingIdentification);
				derivationComponent_lazy = () -> Arrays.asList(AlternateSecurityIdentification3.mmObject(), SecurityIdentification7.mmObject(), SecurityIdentification1.mmObject(), AlternateSecurityIdentification1.mmObject(),
						SecurityIdentification3Choice.mmObject(), OtherIdentification1.mmObject(), SecurityIdentification14.mmObject(), OtherIdentification4.mmObject(), AlternateSecurityIdentification7.mmObject(),
						SecurityIdentification19.mmObject(), SecurityIdentification25Choice.mmObject(), FinancialInstrumentIdentification6Choice.mmObject(), BasketDescription3.mmObject(),
						FinancialInstrumentIdentification7Choice.mmObject(), FinancialInstrumentIdentification5Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesIdentification.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Security> getIdentifiedSecurity() {
		return identifiedSecurity == null ? identifiedSecurity = new ArrayList<>() : identifiedSecurity;
	}

	public SecuritiesIdentification setIdentifiedSecurity(List<Security> identifiedSecurity) {
		this.identifiedSecurity = Objects.requireNonNull(identifiedSecurity);
		return this;
	}

	public ISINOct2015Identifier getSecurityIdentification() {
		return securityIdentification;
	}

	public SecuritiesIdentification setSecurityIdentification(ISINOct2015Identifier securityIdentification) {
		this.securityIdentification = Objects.requireNonNull(securityIdentification);
		return this;
	}

	public RICIdentifier getRIC() {
		return rIC;
	}

	public SecuritiesIdentification setRIC(RICIdentifier rIC) {
		this.rIC = Objects.requireNonNull(rIC);
		return this;
	}

	public TickerIdentifier getTickerSymbol() {
		return tickerSymbol;
	}

	public SecuritiesIdentification setTickerSymbol(TickerIdentifier tickerSymbol) {
		this.tickerSymbol = Objects.requireNonNull(tickerSymbol);
		return this;
	}

	public Bloomberg2Identifier getBloomberg() {
		return bloomberg;
	}

	public SecuritiesIdentification setBloomberg(Bloomberg2Identifier bloomberg) {
		this.bloomberg = Objects.requireNonNull(bloomberg);
		return this;
	}

	public ConsolidatedTapeAssociationIdentifier getCTA() {
		return cTA;
	}

	public SecuritiesIdentification setCTA(ConsolidatedTapeAssociationIdentifier cTA) {
		this.cTA = Objects.requireNonNull(cTA);
		return this;
	}

	public EuroclearClearstreamIdentifier getCommon() {
		return common;
	}

	public SecuritiesIdentification setCommon(EuroclearClearstreamIdentifier common) {
		this.common = Objects.requireNonNull(common);
		return this;
	}

	public LocalName getName() {
		return name;
	}

	public SecuritiesIdentification setName(LocalName name) {
		this.name = Objects.requireNonNull(name);
		return this;
	}

	public SEDOLIdentifier getSEDOL() {
		return sEDOL;
	}

	public SecuritiesIdentification setSEDOL(SEDOLIdentifier sEDOL) {
		this.sEDOL = Objects.requireNonNull(sEDOL);
		return this;
	}

	public CUSIPIdentifier getCUSIP() {
		return cUSIP;
	}

	public SecuritiesIdentification setCUSIP(CUSIPIdentifier cUSIP) {
		this.cUSIP = Objects.requireNonNull(cUSIP);
		return this;
	}

	public QUICKIdentifier getQUICK() {
		return qUICK;
	}

	public SecuritiesIdentification setQUICK(QUICKIdentifier qUICK) {
		this.qUICK = Objects.requireNonNull(qUICK);
		return this;
	}

	public WertpapierIdentifier getWertpapier() {
		return wertpapier;
	}

	public SecuritiesIdentification setWertpapier(WertpapierIdentifier wertpapier) {
		this.wertpapier = Objects.requireNonNull(wertpapier);
		return this;
	}

	public DutchIdentifier getDutch() {
		return dutch;
	}

	public SecuritiesIdentification setDutch(DutchIdentifier dutch) {
		this.dutch = Objects.requireNonNull(dutch);
		return this;
	}

	public ValorenIdentifier getValoren() {
		return valoren;
	}

	public SecuritiesIdentification setValoren(ValorenIdentifier valoren) {
		this.valoren = Objects.requireNonNull(valoren);
		return this;
	}

	public SicovamIdentifier getSicovam() {
		return sicovam;
	}

	public SecuritiesIdentification setSicovam(SicovamIdentifier sicovam) {
		this.sicovam = Objects.requireNonNull(sicovam);
		return this;
	}

	public BelgianIdentifier getBelgian() {
		return belgian;
	}

	public SecuritiesIdentification setBelgian(BelgianIdentifier belgian) {
		this.belgian = Objects.requireNonNull(belgian);
		return this;
	}

	public Max35Text getIdentificationSuffix() {
		return identificationSuffix;
	}

	public SecuritiesIdentification setIdentificationSuffix(Max35Text identificationSuffix) {
		this.identificationSuffix = Objects.requireNonNull(identificationSuffix);
		return this;
	}

	public GenericIdentification getGenericIdentification() {
		return genericIdentification;
	}

	public SecuritiesIdentification setGenericIdentification(GenericIdentification genericIdentification) {
		this.genericIdentification = Objects.requireNonNull(genericIdentification);
		return this;
	}

	public List<DateTimePeriod> getValidityPeriod() {
		return validityPeriod == null ? validityPeriod = new ArrayList<>() : validityPeriod;
	}

	public SecuritiesIdentification setValidityPeriod(List<DateTimePeriod> validityPeriod) {
		this.validityPeriod = Objects.requireNonNull(validityPeriod);
		return this;
	}

	public List<TradingMarket> getApplicableTradingMarket() {
		return applicableTradingMarket == null ? applicableTradingMarket = new ArrayList<>() : applicableTradingMarket;
	}

	public SecuritiesIdentification setApplicableTradingMarket(List<TradingMarket> applicableTradingMarket) {
		this.applicableTradingMarket = Objects.requireNonNull(applicableTradingMarket);
		return this;
	}

	public SecuritiesIdentification getPrimeIdentification() {
		return primeIdentification;
	}

	public SecuritiesIdentification setPrimeIdentification(SecuritiesIdentification primeIdentification) {
		this.primeIdentification = Objects.requireNonNull(primeIdentification);
		return this;
	}

	public List<SecuritiesIdentification> getRelatedOtherIdentification() {
		return relatedOtherIdentification == null ? relatedOtherIdentification = new ArrayList<>() : relatedOtherIdentification;
	}

	public SecuritiesIdentification setRelatedOtherIdentification(List<SecuritiesIdentification> relatedOtherIdentification) {
		this.relatedOtherIdentification = Objects.requireNonNull(relatedOtherIdentification);
		return this;
	}

	public Max70Text getTradingIdentification() {
		return tradingIdentification;
	}

	public SecuritiesIdentification setTradingIdentification(Max70Text tradingIdentification) {
		this.tradingIdentification = Objects.requireNonNull(tradingIdentification);
		return this;
	}
}