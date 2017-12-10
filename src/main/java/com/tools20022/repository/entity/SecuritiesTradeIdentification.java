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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.TradeIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the different identifications associated with a securities
 * transaction.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesTradeIdentification"
 * src="doc-files/SecuritiesTradeIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.TradeIdentification
 * TradeIdentification}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmIdentifiedTrade
 * SecuritiesTradeIdentification.mmIdentifiedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmMarketInfrastructureTransactionIdentification
 * SecuritiesTradeIdentification.mmMarketInfrastructureTransactionIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmProcessorTransactionIdentification
 * SecuritiesTradeIdentification.mmProcessorTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmPoolIdentification
 * SecuritiesTradeIdentification.mmPoolIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmCollateralTransactionIdentification
 * SecuritiesTradeIdentification.mmCollateralTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmClientTripartyCollateralTransactionIdentification
 * SecuritiesTradeIdentification.
 * mmClientTripartyCollateralTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmTripartyAgentCollateralTransactionIdentification
 * SecuritiesTradeIdentification.
 * mmTripartyAgentCollateralTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmBasketIdentification
 * SecuritiesTradeIdentification.mmBasketIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmProgramIdentification
 * SecuritiesTradeIdentification.mmProgramIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmBlockIdentification
 * SecuritiesTradeIdentification.mmBlockIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmAllocationIdentification
 * SecuritiesTradeIdentification.mmAllocationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmComplianceIdentification
 * SecuritiesTradeIdentification.mmComplianceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmCSDTransactionIdentification
 * SecuritiesTradeIdentification.mmCSDTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmCentralCounterpartyTransactionIdentification
 * SecuritiesTradeIdentification.mmCentralCounterpartyTransactionIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmCancellationRequestIdentification
 * SecuritiesTradeIdentification.mmCancellationRequestIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeRelatedIdentifications
 * SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages15#mmReference
 * Linkages15.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages18#mmReference
 * Linkages18.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Identification14#mmIdentification
 * Identification14.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages36#mmReference
 * Linkages36.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages37#mmReference
 * Linkages37.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages38#mmReference
 * Linkages38.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages40#mmReference
 * Linkages40.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference8#mmReference
 * MessageAndBusinessReference8.mmReference}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice
 * IdentificationReference8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages15 Linkages15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice
 * IdentificationReference11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages18 Linkages18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification14
 * Identification14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages36 Linkages36}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References45Choice
 * References45Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentification6
 * TransactionIdentification6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications29
 * TransactionIdentifications29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages37 Linkages37}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications31
 * TransactionIdentifications31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications33
 * TransactionIdentifications33}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References43Choice
 * References43Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications30
 * TransactionIdentifications30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications32
 * TransactionIdentifications32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages38 Linkages38}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References46Choice
 * References46Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification15
 * Identification15}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References41Choice
 * References41Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References44Choice
 * References44Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages40 Linkages40}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References47Choice
 * References47Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References42Choice
 * References42Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.References18 References18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.References20 References20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MessageAndBusinessReference8
 * MessageAndBusinessReference8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References48Choice
 * References48Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MessageAndBusinessReference10
 * MessageAndBusinessReference10}</li>
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
 * "SecuritiesTradeIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the different identifications associated with a securities transaction."
 * </li>
 * </ul>
 */
public class SecuritiesTradeIdentification extends TradeIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesTrade identifiedTrade;
	/**
	 * Trade for which one or more identifications are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeRelatedIdentifications
	 * SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentifiedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade for which one or more identifications are provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIdentifiedTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentifiedTrade";
			definition = "Trade for which one or more identifications are provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
		}
	};
	protected Max35Text marketInfrastructureTransactionIdentification;
	/**
	 * Identification of a transaction assigned by a market infrastructure other
	 * than a central securities depository, for example, Target2-Securities.
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
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#mmMarketInfrastructureTransactionIdentification
	 * IdentificationReference8Choice.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmMarketInfrastructureTransactionIdentification
	 * IdentificationReference11Choice.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails76#mmMarketInfrastructureTransactionIdentification
	 * TransactionDetails76.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification6#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentification6.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications29#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications29.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification19#mmMarketInfrastructureTransactionIdentification
	 * SettlementTypeAndIdentification19.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications31#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications31.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications33#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications33.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications30#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications30.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References46Choice#mmMarketInfrastructureTransactionIdentification
	 * References46Choice.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#mmMarketInfrastructureTransactionIdentification
	 * Identification15.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References41Choice#mmMarketInfrastructureTransactionIdentification
	 * References41Choice.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References42Choice#mmMarketInfrastructureTransactionIdentification
	 * References42Choice.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References18#mmMarketInfrastructureTransactionIdentification
	 * References18.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#mmMarketInfrastructureTransactionIdentification
	 * Transaction53.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmMarketInfrastructureTransactionIdentification
	 * SecuritiesTradeDetails68.mmMarketInfrastructureTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#mmMarketInfrastructureTransactionIdentification
	 * Transaction54.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#mmMarketInfrastructureTransactionIdentification
	 * Transaction52.mmMarketInfrastructureTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketInfrastructureTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a transaction assigned by a market infrastructure other than a central securities depository, for example, Target2-Securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMarketInfrastructureTransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(IdentificationReference8Choice.mmMarketInfrastructureTransactionIdentification, IdentificationReference11Choice.mmMarketInfrastructureTransactionIdentification,
					TransactionDetails76.mmMarketInfrastructureTransactionIdentification, TransactionIdentification6.mmMarketInfrastructureTransactionIdentification,
					TransactionIdentifications29.mmMarketInfrastructureTransactionIdentification, SettlementTypeAndIdentification19.mmMarketInfrastructureTransactionIdentification,
					TransactionIdentifications31.mmMarketInfrastructureTransactionIdentification, TransactionIdentifications33.mmMarketInfrastructureTransactionIdentification,
					TransactionIdentifications30.mmMarketInfrastructureTransactionIdentification, References46Choice.mmMarketInfrastructureTransactionIdentification, Identification15.mmMarketInfrastructureTransactionIdentification,
					References41Choice.mmMarketInfrastructureTransactionIdentification, References42Choice.mmMarketInfrastructureTransactionIdentification, References18.mmMarketInfrastructureTransactionIdentification,
					Transaction53.mmMarketInfrastructureTransactionIdentification, SecuritiesTradeDetails68.mmMarketInfrastructureTransactionIdentification, Transaction54.mmMarketInfrastructureTransactionIdentification,
					Transaction52.mmMarketInfrastructureTransactionIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketInfrastructureTransactionIdentification";
			definition = "Identification of a transaction assigned by a market infrastructure other than a central securities depository, for example, Target2-Securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeIdentification.class.getMethod("getMarketInfrastructureTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text processorTransactionIdentification;
	/**
	 * Identification of the transaction assigned by the processor of the
	 * instruction other than the account owner the account servicer and the
	 * market infrastructure.
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails76#mmProcessorTransactionIdentification
	 * TransactionDetails76.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification6#mmProcessorTransactionIdentification
	 * TransactionIdentification6.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications29#mmProcessorTransactionIdentification
	 * TransactionIdentifications29.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification19#mmProcessorTransactionIdentification
	 * SettlementTypeAndIdentification19.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications31#mmProcessorTransactionIdentification
	 * TransactionIdentifications31.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications33#mmProcessorTransactionIdentification
	 * TransactionIdentifications33.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters21#mmProcessorTransactionIdentification
	 * AdditionalParameters21.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54#mmProcessorTransactionIdentification
	 * SecuritiesTradeDetails54.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications30#mmProcessorTransactionIdentification
	 * TransactionIdentifications30.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#mmProcessorTransactionIdentification
	 * Identification15.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References42Choice#mmProcessorTransactionIdentification
	 * References42Choice.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References18#mmProcessorTransactionIdentification
	 * References18.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#mmProcessorTransactionIdentification
	 * Transaction53.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmProcessorTransactionIdentification
	 * SecuritiesTradeDetails68.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#mmProcessorTransactionIdentification
	 * Transaction54.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#mmProcessorTransactionIdentification
	 * Transaction52.mmProcessorTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessorTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the transaction assigned by the processor of the instruction other than the account owner the account servicer and the market infrastructure."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmProcessorTransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionDetails76.mmProcessorTransactionIdentification, TransactionIdentification6.mmProcessorTransactionIdentification,
					TransactionIdentifications29.mmProcessorTransactionIdentification, SettlementTypeAndIdentification19.mmProcessorTransactionIdentification, TransactionIdentifications31.mmProcessorTransactionIdentification,
					TransactionIdentifications33.mmProcessorTransactionIdentification, AdditionalParameters21.mmProcessorTransactionIdentification, SecuritiesTradeDetails54.mmProcessorTransactionIdentification,
					TransactionIdentifications30.mmProcessorTransactionIdentification, Identification15.mmProcessorTransactionIdentification, References42Choice.mmProcessorTransactionIdentification,
					References18.mmProcessorTransactionIdentification, Transaction53.mmProcessorTransactionIdentification, SecuritiesTradeDetails68.mmProcessorTransactionIdentification, Transaction54.mmProcessorTransactionIdentification,
					Transaction52.mmProcessorTransactionIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProcessorTransactionIdentification";
			definition = "Identification of the transaction assigned by the processor of the instruction other than the account owner the account servicer and the market infrastructure.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeIdentification.class.getMethod("getProcessorTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text poolIdentification;
	/**
	 * Collective reference identifying a set of messages.
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
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#mmPoolIdentification
	 * IdentificationReference8Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmPoolIdentification
	 * IdentificationReference11Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification19#mmPoolIdentification
	 * SettlementTypeAndIdentification19.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters21#mmPoolIdentification
	 * AdditionalParameters21.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References46Choice#mmPoolIdentification
	 * References46Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#mmPoolIdentification
	 * Identification15.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References41Choice#mmPoolIdentification
	 * References41Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References47Choice#mmPoolIdentification
	 * References47Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References42Choice#mmPoolIdentification
	 * References42Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References18#mmPoolIdentification
	 * References18.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#mmPoolIdentification
	 * Transaction53.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmPoolIdentification
	 * SecuritiesTradeDetails68.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmPoolIdentification
	 * TransactionDetails97.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters17#mmPoolIdentification
	 * TransactionTypeAndAdditionalParameters17.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16#mmPoolIdentification
	 * TransactionTypeAndAdditionalParameters16.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmPoolIdentification
	 * SecuritiesFinancingTransactionDetails35.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#mmPoolIdentification
	 * Transaction54.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#mmPoolIdentification
	 * Transaction52.mmPoolIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collective reference identifying a set of messages."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPoolIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(IdentificationReference8Choice.mmPoolIdentification, IdentificationReference11Choice.mmPoolIdentification, SettlementTypeAndIdentification19.mmPoolIdentification,
					AdditionalParameters21.mmPoolIdentification, References46Choice.mmPoolIdentification, Identification15.mmPoolIdentification, References41Choice.mmPoolIdentification, References47Choice.mmPoolIdentification,
					References42Choice.mmPoolIdentification, References18.mmPoolIdentification, Transaction53.mmPoolIdentification, SecuritiesTradeDetails68.mmPoolIdentification, TransactionDetails97.mmPoolIdentification,
					TransactionTypeAndAdditionalParameters17.mmPoolIdentification, TransactionTypeAndAdditionalParameters16.mmPoolIdentification, SecuritiesFinancingTransactionDetails35.mmPoolIdentification,
					Transaction54.mmPoolIdentification, Transaction52.mmPoolIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PoolIdentification";
			definition = "Collective reference identifying a set of messages.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeIdentification.class.getMethod("getPoolIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text collateralTransactionIdentification;
	/**
	 * Unambiguous identification of a collateral transaction.
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
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#mmCollateralTransactionIdentification
	 * IdentificationReference8Choice.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmCollateralTransactionIdentification
	 * IdentificationReference11Choice.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails51.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails53.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails54.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails52.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails50.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails67.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#mmClientCollateralInstructionIdentification
	 * Transaction53.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails68.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmClientCollateralInstructionIdentification
	 * TransactionDetails97.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#mmClientCollateralInstructionIdentification
	 * Transaction54.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#mmClientCollateralInstructionIdentification
	 * Transaction52.mmClientCollateralInstructionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unambiguous identification of a collateral transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCollateralTransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(IdentificationReference8Choice.mmCollateralTransactionIdentification, IdentificationReference11Choice.mmCollateralTransactionIdentification,
					SecuritiesTradeDetails51.mmCollateralTransactionIdentification, SecuritiesTradeDetails53.mmCollateralTransactionIdentification, SecuritiesTradeDetails54.mmCollateralTransactionIdentification,
					SecuritiesTradeDetails52.mmCollateralTransactionIdentification, SecuritiesTradeDetails50.mmCollateralTransactionIdentification, SecuritiesTradeDetails67.mmCollateralTransactionIdentification,
					Transaction53.mmClientCollateralInstructionIdentification, SecuritiesTradeDetails68.mmCollateralTransactionIdentification, TransactionDetails97.mmClientCollateralInstructionIdentification,
					Transaction54.mmClientCollateralInstructionIdentification, Transaction52.mmClientCollateralInstructionIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralTransactionIdentification";
			definition = "Unambiguous identification of a collateral transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeIdentification.class.getMethod("getCollateralTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text clientTripartyCollateralTransactionIdentification;
	/**
	 * Unique reference identifying the triparty collateral management
	 * transaction from the client's point of view.
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
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters21#mmMarketInfrastructureTransactionIdentification
	 * AdditionalParameters21.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29#mmClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters29.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29#mmClientCollateralInstructionIdentification
	 * AdditionalParameters29.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters30#mmClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters30.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#mmClientTripartyCollateralTransactionIdentification
	 * Transaction53.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmClientTripartyCollateralTransactionIdentification
	 * TransactionDetails97.mmClientTripartyCollateralTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmClientTripartyCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails35.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#mmClientTripartyCollateralTransactionIdentification
	 * Transaction54.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#mmClientTripartyCollateralTransactionIdentification
	 * Transaction52.mmClientTripartyCollateralTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientTripartyCollateralTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference identifying the triparty collateral management transaction from the client's point of view."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmClientTripartyCollateralTransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AdditionalParameters21.mmMarketInfrastructureTransactionIdentification, AdditionalParameters29.mmClientTripartyCollateralTransactionIdentification,
					AdditionalParameters29.mmClientCollateralInstructionIdentification, AdditionalParameters30.mmClientTripartyCollateralTransactionIdentification, Transaction53.mmClientTripartyCollateralTransactionIdentification,
					TransactionDetails97.mmClientTripartyCollateralTransactionIdentification, SecuritiesFinancingTransactionDetails35.mmClientTripartyCollateralTransactionIdentification,
					Transaction54.mmClientTripartyCollateralTransactionIdentification, Transaction52.mmClientTripartyCollateralTransactionIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClientTripartyCollateralTransactionIdentification";
			definition = "Unique reference identifying the triparty collateral management transaction from the client's point of view.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeIdentification.class.getMethod("getClientTripartyCollateralTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text tripartyAgentCollateralTransactionIdentification;
	/**
	 * Unique reference identifying the triparty collateral management
	 * transaction from the triparty agent's point of view.
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
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29#mmTripartyAgentServiceProviderCollateralTransactionIdentification
	 * AdditionalParameters29.
	 * mmTripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29#mmTripartyAgentServiceProviderCollateralInstructionIdentification
	 * AdditionalParameters29.
	 * mmTripartyAgentServiceProviderCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters30#mmTripartyAgentServiceProviderCollateralTransactionIdentification
	 * AdditionalParameters30.
	 * mmTripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#mmTripartyAgentServiceProviderCollateralTransactionIdentification
	 * Transaction53.
	 * mmTripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#mmTripartyAgentServiceProviderCollateralInstructionIdentification
	 * Transaction53.
	 * mmTripartyAgentServiceProviderCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmTripartyAgentServiceProviderCollateralTransactionIdentification
	 * TransactionDetails97.
	 * mmTripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmTripartyAgentServiceProviderCollateralInstructionIdentification
	 * TransactionDetails97.
	 * mmTripartyAgentServiceProviderCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmTripartyAgentServiceProviderCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails35.
	 * mmTripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#mmTripartyAgentServiceProviderCollateralTransactionIdentification
	 * Transaction54.
	 * mmTripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#mmTripartyAgentServiceProviderCollateralInstructionIdentification
	 * Transaction54.
	 * mmTripartyAgentServiceProviderCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#mmTripartyAgentServiceProviderCollateralTransactionIdentification
	 * Transaction52.
	 * mmTripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#mmTripartyAgentServiceProviderCollateralInstructionIdentification
	 * Transaction52.
	 * mmTripartyAgentServiceProviderCollateralInstructionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyAgentCollateralTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference identifying the triparty collateral management transaction from the triparty agent's point of view."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTripartyAgentCollateralTransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AdditionalParameters29.mmTripartyAgentServiceProviderCollateralTransactionIdentification, AdditionalParameters29.mmTripartyAgentServiceProviderCollateralInstructionIdentification,
					AdditionalParameters30.mmTripartyAgentServiceProviderCollateralTransactionIdentification, Transaction53.mmTripartyAgentServiceProviderCollateralTransactionIdentification,
					Transaction53.mmTripartyAgentServiceProviderCollateralInstructionIdentification, TransactionDetails97.mmTripartyAgentServiceProviderCollateralTransactionIdentification,
					TransactionDetails97.mmTripartyAgentServiceProviderCollateralInstructionIdentification, SecuritiesFinancingTransactionDetails35.mmTripartyAgentServiceProviderCollateralTransactionIdentification,
					Transaction54.mmTripartyAgentServiceProviderCollateralTransactionIdentification, Transaction54.mmTripartyAgentServiceProviderCollateralInstructionIdentification,
					Transaction52.mmTripartyAgentServiceProviderCollateralTransactionIdentification, Transaction52.mmTripartyAgentServiceProviderCollateralInstructionIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TripartyAgentCollateralTransactionIdentification";
			definition = "Unique reference identifying the triparty collateral management transaction from the triparty agent's point of view.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeIdentification.class.getMethod("getTripartyAgentCollateralTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text basketIdentification;
	/**
	 * Identification of a basket trade.
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
	 * {@linkplain com.tools20022.repository.msg.Identification15#mmBasketIdentification
	 * Identification15.mmBasketIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasketIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a basket trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBasketIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Identification15.mmBasketIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BasketIdentification";
			definition = "Identification of a basket trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeIdentification.class.getMethod("getBasketIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text programIdentification;
	/**
	 * Program reference which identifies a program trade.
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
	 * {@linkplain com.tools20022.repository.msg.Identification15#mmProgramIdentification
	 * Identification15.mmProgramIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProgramIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Program reference which identifies a program trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmProgramIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Identification15.mmProgramIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProgramIdentification";
			definition = "Program reference which identifies a program trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeIdentification.class.getMethod("getProgramIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text blockIdentification;
	/**
	 * Reference of the linked message at the trade/block level which identifies
	 * a centrally matched transaction.
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
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#mmBlockIdentification
	 * IdentificationReference8Choice.mmBlockIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmBlockIdentification
	 * IdentificationReference11Choice.mmBlockIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of the linked message at the trade/block level which identifies a centrally matched transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBlockIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(IdentificationReference8Choice.mmBlockIdentification, IdentificationReference11Choice.mmBlockIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BlockIdentification";
			definition = "Reference of the linked message at the trade/block level which identifies a centrally matched transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeIdentification.class.getMethod("getBlockIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text allocationIdentification;
	/**
	 * Identification at the allocation level.
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
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#mmAllocationIdentification
	 * IdentificationReference8Choice.mmAllocationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#mmIndividualAllocationIdentification
	 * IdentificationReference8Choice.mmIndividualAllocationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#mmSecondaryAllocationIdentification
	 * IdentificationReference8Choice.mmSecondaryAllocationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmAllocationIdentification
	 * IdentificationReference11Choice.mmAllocationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmIndividualAllocationIdentification
	 * IdentificationReference11Choice.mmIndividualAllocationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmSecondaryAllocationIdentification
	 * IdentificationReference11Choice.mmSecondaryAllocationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmAllocationIdentification
	 * TradeLeg8.mmAllocationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg10#mmAllocationIdentification
	 * TradeLeg10.mmAllocationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmAllocationIdentification
	 * TradeLeg9.mmAllocationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification at the allocation level."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAllocationIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(IdentificationReference8Choice.mmAllocationIdentification, IdentificationReference8Choice.mmIndividualAllocationIdentification,
					IdentificationReference8Choice.mmSecondaryAllocationIdentification, IdentificationReference11Choice.mmAllocationIdentification, IdentificationReference11Choice.mmIndividualAllocationIdentification,
					IdentificationReference11Choice.mmSecondaryAllocationIdentification, TradeLeg8.mmAllocationIdentification, TradeLeg10.mmAllocationIdentification, TradeLeg9.mmAllocationIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AllocationIdentification";
			definition = "Identification at the allocation level.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeIdentification.class.getMethod("getAllocationIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text complianceIdentification;
	/**
	 * Identification which represents this transaction for compliance purposes.
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
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#mmComplianceIdentification
	 * IdentificationReference8Choice.mmComplianceIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmComplianceIdentification
	 * IdentificationReference11Choice.mmComplianceIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ComplianceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification which represents this transaction for compliance purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmComplianceIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(IdentificationReference8Choice.mmComplianceIdentification, IdentificationReference11Choice.mmComplianceIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ComplianceIdentification";
			definition = "Identification which represents this transaction for compliance purposes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeIdentification.class.getMethod("getComplianceIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text cSDTransactionIdentification;
	/**
	 * Identification given by the central securities depository to the
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification given by the central securities depository  to the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCSDTransactionIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CSDTransactionIdentification";
			definition = "Identification given by the central securities depository  to the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeIdentification.class.getMethod("getCSDTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text centralCounterpartyTransactionIdentification;
	/**
	 * Identification of the transaction assigned by the central counterparty.
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
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation7#mmCentralCounterpartyTransactionIdentification
	 * SettlementObligation7.mmCentralCounterpartyTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralCounterpartyTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the transaction assigned by the central counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCentralCounterpartyTransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementObligation7.mmCentralCounterpartyTransactionIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CentralCounterpartyTransactionIdentification";
			definition = "Identification of the transaction assigned by the central counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeIdentification.class.getMethod("getCentralCounterpartyTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text cancellationRequestIdentification;
	/**
	 * Unambiguous identification of the cancellation request as known by the
	 * instructing party.
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
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmCancellationRequestIdentification
	 * IdentificationReference11Choice.mmCancellationRequestIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder11#mmCancellationReference
	 * InvestmentFundOrder11.mmCancellationReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder9#mmCancellationReference
	 * InvestmentFundOrder9.mmCancellationReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder8#mmCancellationReference
	 * InvestmentFundOrder8.mmCancellationReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the cancellation request as known by the instructing party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCancellationRequestIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(IdentificationReference11Choice.mmCancellationRequestIdentification, InvestmentFundOrder11.mmCancellationReference, InvestmentFundOrder9.mmCancellationReference,
					InvestmentFundOrder8.mmCancellationReference);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationRequestIdentification";
			definition = "Unambiguous identification of the cancellation request as known by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeIdentification.class.getMethod("getCancellationRequestIdentification", new Class[]{});
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
				name = "SecuritiesTradeIdentification";
				definition = "Specifies the different identifications associated with a securities transaction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications);
				derivationElement_lazy = () -> Arrays.asList(Linkages15.mmReference, Linkages18.mmReference, Identification14.mmIdentification, Linkages36.mmReference, Linkages37.mmReference, Linkages38.mmReference, Linkages40.mmReference,
						MessageAndBusinessReference8.mmReference);
				superType_lazy = () -> TradeIdentification.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTradeIdentification.mmIdentifiedTrade,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.entity.SecuritiesTradeIdentification.mmProcessorTransactionIdentification,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.mmPoolIdentification, com.tools20022.repository.entity.SecuritiesTradeIdentification.mmCollateralTransactionIdentification,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.mmClientTripartyCollateralTransactionIdentification,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.entity.SecuritiesTradeIdentification.mmBasketIdentification,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.mmProgramIdentification, com.tools20022.repository.entity.SecuritiesTradeIdentification.mmBlockIdentification,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.mmAllocationIdentification, com.tools20022.repository.entity.SecuritiesTradeIdentification.mmComplianceIdentification,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.mmCSDTransactionIdentification, com.tools20022.repository.entity.SecuritiesTradeIdentification.mmCentralCounterpartyTransactionIdentification,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.mmCancellationRequestIdentification);
				derivationComponent_lazy = () -> Arrays.asList(IdentificationReference8Choice.mmObject(), Linkages15.mmObject(), IdentificationReference11Choice.mmObject(), Linkages18.mmObject(), Identification14.mmObject(),
						Linkages36.mmObject(), References45Choice.mmObject(), TransactionIdentification6.mmObject(), TransactionIdentifications29.mmObject(), Linkages37.mmObject(), TransactionIdentifications31.mmObject(),
						TransactionIdentifications33.mmObject(), References43Choice.mmObject(), TransactionIdentifications30.mmObject(), TransactionIdentifications32.mmObject(), Linkages38.mmObject(), References46Choice.mmObject(),
						Identification15.mmObject(), References41Choice.mmObject(), References44Choice.mmObject(), Linkages40.mmObject(), References47Choice.mmObject(), References42Choice.mmObject(), References18.mmObject(),
						References20.mmObject(), MessageAndBusinessReference8.mmObject(), References48Choice.mmObject(), MessageAndBusinessReference10.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesTradeIdentification.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesTrade getIdentifiedTrade() {
		return identifiedTrade;
	}

	public void setIdentifiedTrade(com.tools20022.repository.entity.SecuritiesTrade identifiedTrade) {
		this.identifiedTrade = identifiedTrade;
	}

	public Max35Text getMarketInfrastructureTransactionIdentification() {
		return marketInfrastructureTransactionIdentification;
	}

	public void setMarketInfrastructureTransactionIdentification(Max35Text marketInfrastructureTransactionIdentification) {
		this.marketInfrastructureTransactionIdentification = marketInfrastructureTransactionIdentification;
	}

	public Max35Text getProcessorTransactionIdentification() {
		return processorTransactionIdentification;
	}

	public void setProcessorTransactionIdentification(Max35Text processorTransactionIdentification) {
		this.processorTransactionIdentification = processorTransactionIdentification;
	}

	public Max35Text getPoolIdentification() {
		return poolIdentification;
	}

	public void setPoolIdentification(Max35Text poolIdentification) {
		this.poolIdentification = poolIdentification;
	}

	public Max35Text getCollateralTransactionIdentification() {
		return collateralTransactionIdentification;
	}

	public void setCollateralTransactionIdentification(Max35Text collateralTransactionIdentification) {
		this.collateralTransactionIdentification = collateralTransactionIdentification;
	}

	public Max35Text getClientTripartyCollateralTransactionIdentification() {
		return clientTripartyCollateralTransactionIdentification;
	}

	public void setClientTripartyCollateralTransactionIdentification(Max35Text clientTripartyCollateralTransactionIdentification) {
		this.clientTripartyCollateralTransactionIdentification = clientTripartyCollateralTransactionIdentification;
	}

	public Max35Text getTripartyAgentCollateralTransactionIdentification() {
		return tripartyAgentCollateralTransactionIdentification;
	}

	public void setTripartyAgentCollateralTransactionIdentification(Max35Text tripartyAgentCollateralTransactionIdentification) {
		this.tripartyAgentCollateralTransactionIdentification = tripartyAgentCollateralTransactionIdentification;
	}

	public Max35Text getBasketIdentification() {
		return basketIdentification;
	}

	public void setBasketIdentification(Max35Text basketIdentification) {
		this.basketIdentification = basketIdentification;
	}

	public Max35Text getProgramIdentification() {
		return programIdentification;
	}

	public void setProgramIdentification(Max35Text programIdentification) {
		this.programIdentification = programIdentification;
	}

	public Max35Text getBlockIdentification() {
		return blockIdentification;
	}

	public void setBlockIdentification(Max35Text blockIdentification) {
		this.blockIdentification = blockIdentification;
	}

	public Max35Text getAllocationIdentification() {
		return allocationIdentification;
	}

	public void setAllocationIdentification(Max35Text allocationIdentification) {
		this.allocationIdentification = allocationIdentification;
	}

	public Max35Text getComplianceIdentification() {
		return complianceIdentification;
	}

	public void setComplianceIdentification(Max35Text complianceIdentification) {
		this.complianceIdentification = complianceIdentification;
	}

	public Max35Text getCSDTransactionIdentification() {
		return cSDTransactionIdentification;
	}

	public void setCSDTransactionIdentification(Max35Text cSDTransactionIdentification) {
		this.cSDTransactionIdentification = cSDTransactionIdentification;
	}

	public Max35Text getCentralCounterpartyTransactionIdentification() {
		return centralCounterpartyTransactionIdentification;
	}

	public void setCentralCounterpartyTransactionIdentification(Max35Text centralCounterpartyTransactionIdentification) {
		this.centralCounterpartyTransactionIdentification = centralCounterpartyTransactionIdentification;
	}

	public Max35Text getCancellationRequestIdentification() {
		return cancellationRequestIdentification;
	}

	public void setCancellationRequestIdentification(Max35Text cancellationRequestIdentification) {
		this.cancellationRequestIdentification = cancellationRequestIdentification;
	}
}