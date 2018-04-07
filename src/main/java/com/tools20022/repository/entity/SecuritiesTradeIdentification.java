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
import com.tools20022.repository.entity.SecuritiesTrade;
import com.tools20022.repository.entity.TradeIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

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
 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference11#mmReference
 * MessageAndBusinessReference11.mmReference}</li>
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
 * <li>{@linkplain com.tools20022.repository.msg.MessageAndBusinessReference10
 * MessageAndBusinessReference10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MessageAndBusinessReference11
 * MessageAndBusinessReference11}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References63Choice
 * References63Choice}</li>
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
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<SecuritiesTradeIdentification, SecuritiesTrade> mmIdentifiedTrade = new MMBusinessAssociationEnd<SecuritiesTradeIdentification, SecuritiesTrade>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentifiedTrade";
			definition = "Trade for which one or more identifications are provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesTrade.mmObject();
		}

		@Override
		public SecuritiesTrade getValue(SecuritiesTradeIdentification obj) {
			return obj.getIdentifiedTrade();
		}

		@Override
		public void setValue(SecuritiesTradeIdentification obj, SecuritiesTrade value) {
			obj.setIdentifiedTrade(value);
		}
	};
	protected Max35Text marketInfrastructureTransactionIdentification;
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
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#mmMarketInfrastructureTransactionIdentification
	 * IdentificationReference8Choice.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmMarketInfrastructureTransactionIdentification
	 * IdentificationReference11Choice.
	 * mmMarketInfrastructureTransactionIdentification}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71#mmMarketInfrastructureTransactionIdentification
	 * SecuritiesTradeDetails71.mmMarketInfrastructureTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction60#mmMarketInfrastructureTransactionIdentification
	 * Transaction60.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction61#mmMarketInfrastructureTransactionIdentification
	 * Transaction61.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction62#mmMarketInfrastructureTransactionIdentification
	 * Transaction62.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails106#mmMarketInfrastructureTransactionIdentification
	 * TransactionDetails106.mmMarketInfrastructureTransactionIdentification}</li>
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
	public static final MMBusinessAttribute<SecuritiesTradeIdentification, Max35Text> mmMarketInfrastructureTransactionIdentification = new MMBusinessAttribute<SecuritiesTradeIdentification, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(IdentificationReference8Choice.mmMarketInfrastructureTransactionIdentification, IdentificationReference11Choice.mmMarketInfrastructureTransactionIdentification,
					TransactionIdentification6.mmMarketInfrastructureTransactionIdentification, TransactionIdentifications29.mmMarketInfrastructureTransactionIdentification,
					SettlementTypeAndIdentification19.mmMarketInfrastructureTransactionIdentification, TransactionIdentifications31.mmMarketInfrastructureTransactionIdentification,
					TransactionIdentifications33.mmMarketInfrastructureTransactionIdentification, TransactionIdentifications30.mmMarketInfrastructureTransactionIdentification,
					References46Choice.mmMarketInfrastructureTransactionIdentification, Identification15.mmMarketInfrastructureTransactionIdentification, References41Choice.mmMarketInfrastructureTransactionIdentification,
					References42Choice.mmMarketInfrastructureTransactionIdentification, References18.mmMarketInfrastructureTransactionIdentification, SecuritiesTradeDetails71.mmMarketInfrastructureTransactionIdentification,
					Transaction60.mmMarketInfrastructureTransactionIdentification, Transaction61.mmMarketInfrastructureTransactionIdentification, Transaction62.mmMarketInfrastructureTransactionIdentification,
					TransactionDetails106.mmMarketInfrastructureTransactionIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketInfrastructureTransactionIdentification";
			definition = "Identification of a transaction assigned by a market infrastructure other than a central securities depository, for example, Target2-Securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SecuritiesTradeIdentification obj) {
			return obj.getMarketInfrastructureTransactionIdentification();
		}

		@Override
		public void setValue(SecuritiesTradeIdentification obj, Max35Text value) {
			obj.setMarketInfrastructureTransactionIdentification(value);
		}
	};
	protected Max35Text processorTransactionIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71#mmProcessorTransactionIdentification
	 * SecuritiesTradeDetails71.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction60#mmProcessorTransactionIdentification
	 * Transaction60.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction61#mmProcessorTransactionIdentification
	 * Transaction61.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction62#mmProcessorTransactionIdentification
	 * Transaction62.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails106#mmProcessorTransactionIdentification
	 * TransactionDetails106.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails80#mmProcessorTransactionIdentification
	 * SecuritiesTradeDetails80.mmProcessorTransactionIdentification}</li>
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
	public static final MMBusinessAttribute<SecuritiesTradeIdentification, Max35Text> mmProcessorTransactionIdentification = new MMBusinessAttribute<SecuritiesTradeIdentification, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionIdentification6.mmProcessorTransactionIdentification, TransactionIdentifications29.mmProcessorTransactionIdentification,
					SettlementTypeAndIdentification19.mmProcessorTransactionIdentification, TransactionIdentifications31.mmProcessorTransactionIdentification, TransactionIdentifications33.mmProcessorTransactionIdentification,
					AdditionalParameters21.mmProcessorTransactionIdentification, TransactionIdentifications30.mmProcessorTransactionIdentification, Identification15.mmProcessorTransactionIdentification,
					References42Choice.mmProcessorTransactionIdentification, References18.mmProcessorTransactionIdentification, SecuritiesTradeDetails71.mmProcessorTransactionIdentification,
					Transaction60.mmProcessorTransactionIdentification, Transaction61.mmProcessorTransactionIdentification, Transaction62.mmProcessorTransactionIdentification, TransactionDetails106.mmProcessorTransactionIdentification,
					SecuritiesTradeDetails80.mmProcessorTransactionIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProcessorTransactionIdentification";
			definition = "Identification of the transaction assigned by the processor of the instruction other than the account owner the account servicer and the market infrastructure.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SecuritiesTradeIdentification obj) {
			return obj.getProcessorTransactionIdentification();
		}

		@Override
		public void setValue(SecuritiesTradeIdentification obj, Max35Text value) {
			obj.setProcessorTransactionIdentification(value);
		}
	};
	protected Max35Text poolIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters17#mmPoolIdentification
	 * TransactionTypeAndAdditionalParameters17.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16#mmPoolIdentification
	 * TransactionTypeAndAdditionalParameters16.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmPoolIdentification
	 * SecuritiesFinancingTransactionDetails35.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71#mmPoolIdentification
	 * SecuritiesTradeDetails71.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails105#mmPoolIdentification
	 * TransactionDetails105.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction60#mmPoolIdentification
	 * Transaction60.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction61#mmPoolIdentification
	 * Transaction61.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction62#mmPoolIdentification
	 * Transaction62.mmPoolIdentification}</li>
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
	public static final MMBusinessAttribute<SecuritiesTradeIdentification, Max35Text> mmPoolIdentification = new MMBusinessAttribute<SecuritiesTradeIdentification, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(IdentificationReference8Choice.mmPoolIdentification, IdentificationReference11Choice.mmPoolIdentification, SettlementTypeAndIdentification19.mmPoolIdentification,
					AdditionalParameters21.mmPoolIdentification, References46Choice.mmPoolIdentification, Identification15.mmPoolIdentification, References41Choice.mmPoolIdentification, References47Choice.mmPoolIdentification,
					References42Choice.mmPoolIdentification, References18.mmPoolIdentification, TransactionTypeAndAdditionalParameters17.mmPoolIdentification, TransactionTypeAndAdditionalParameters16.mmPoolIdentification,
					SecuritiesFinancingTransactionDetails35.mmPoolIdentification, SecuritiesTradeDetails71.mmPoolIdentification, TransactionDetails105.mmPoolIdentification, Transaction60.mmPoolIdentification,
					Transaction61.mmPoolIdentification, Transaction62.mmPoolIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PoolIdentification";
			definition = "Collective reference identifying a set of messages.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SecuritiesTradeIdentification obj) {
			return obj.getPoolIdentification();
		}

		@Override
		public void setValue(SecuritiesTradeIdentification obj, Max35Text value) {
			obj.setPoolIdentification(value);
		}
	};
	protected Max35Text collateralTransactionIdentification;
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
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#mmCollateralTransactionIdentification
	 * IdentificationReference8Choice.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmCollateralTransactionIdentification
	 * IdentificationReference11Choice.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails71.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails105#mmClientCollateralInstructionIdentification
	 * TransactionDetails105.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction60#mmClientCollateralInstructionIdentification
	 * Transaction60.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction61#mmClientCollateralInstructionIdentification
	 * Transaction61.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction62#mmClientCollateralInstructionIdentification
	 * Transaction62.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails73#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails73.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails75#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails75.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails76#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails76.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails78#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails78.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails79#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails79.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails80#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails80.mmCollateralTransactionIdentification}</li>
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
	public static final MMBusinessAttribute<SecuritiesTradeIdentification, Max35Text> mmCollateralTransactionIdentification = new MMBusinessAttribute<SecuritiesTradeIdentification, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(IdentificationReference8Choice.mmCollateralTransactionIdentification, IdentificationReference11Choice.mmCollateralTransactionIdentification,
					SecuritiesTradeDetails71.mmCollateralTransactionIdentification, TransactionDetails105.mmClientCollateralInstructionIdentification, Transaction60.mmClientCollateralInstructionIdentification,
					Transaction61.mmClientCollateralInstructionIdentification, Transaction62.mmClientCollateralInstructionIdentification, SecuritiesTradeDetails73.mmCollateralTransactionIdentification,
					SecuritiesTradeDetails75.mmCollateralTransactionIdentification, SecuritiesTradeDetails76.mmCollateralTransactionIdentification, SecuritiesTradeDetails78.mmCollateralTransactionIdentification,
					SecuritiesTradeDetails79.mmCollateralTransactionIdentification, SecuritiesTradeDetails80.mmCollateralTransactionIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralTransactionIdentification";
			definition = "Unambiguous identification of a collateral transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SecuritiesTradeIdentification obj) {
			return obj.getCollateralTransactionIdentification();
		}

		@Override
		public void setValue(SecuritiesTradeIdentification obj, Max35Text value) {
			obj.setCollateralTransactionIdentification(value);
		}
	};
	protected Max35Text clientTripartyCollateralTransactionIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmClientTripartyCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails35.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails105#mmClientTripartyCollateralTransactionIdentification
	 * TransactionDetails105.mmClientTripartyCollateralTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction60#mmClientTripartyCollateralTransactionIdentification
	 * Transaction60.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction61#mmClientTripartyCollateralTransactionIdentification
	 * Transaction61.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction62#mmClientTripartyCollateralTransactionIdentification
	 * Transaction62.mmClientTripartyCollateralTransactionIdentification}</li>
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
	public static final MMBusinessAttribute<SecuritiesTradeIdentification, Max35Text> mmClientTripartyCollateralTransactionIdentification = new MMBusinessAttribute<SecuritiesTradeIdentification, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(AdditionalParameters21.mmMarketInfrastructureTransactionIdentification, AdditionalParameters29.mmClientTripartyCollateralTransactionIdentification,
					AdditionalParameters29.mmClientCollateralInstructionIdentification, AdditionalParameters30.mmClientTripartyCollateralTransactionIdentification,
					SecuritiesFinancingTransactionDetails35.mmClientTripartyCollateralTransactionIdentification, TransactionDetails105.mmClientTripartyCollateralTransactionIdentification,
					Transaction60.mmClientTripartyCollateralTransactionIdentification, Transaction61.mmClientTripartyCollateralTransactionIdentification, Transaction62.mmClientTripartyCollateralTransactionIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClientTripartyCollateralTransactionIdentification";
			definition = "Unique reference identifying the triparty collateral management transaction from the client's point of view.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SecuritiesTradeIdentification obj) {
			return obj.getClientTripartyCollateralTransactionIdentification();
		}

		@Override
		public void setValue(SecuritiesTradeIdentification obj, Max35Text value) {
			obj.setClientTripartyCollateralTransactionIdentification(value);
		}
	};
	protected Max35Text tripartyAgentCollateralTransactionIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmTripartyAgentServiceProviderCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails35.
	 * mmTripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails105#mmTripartyAgentServiceProviderCollateralTransactionIdentification
	 * TransactionDetails105.
	 * mmTripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails105#mmTripartyAgentServiceProviderCollateralInstructionIdentification
	 * TransactionDetails105.
	 * mmTripartyAgentServiceProviderCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction60#mmTripartyAgentServiceProviderCollateralTransactionIdentification
	 * Transaction60.
	 * mmTripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction60#mmTripartyAgentServiceProviderCollateralInstructionIdentification
	 * Transaction60.
	 * mmTripartyAgentServiceProviderCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction61#mmTripartyAgentServiceProviderCollateralTransactionIdentification
	 * Transaction61.
	 * mmTripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction61#mmTripartyAgentServiceProviderCollateralInstructionIdentification
	 * Transaction61.
	 * mmTripartyAgentServiceProviderCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction62#mmTripartyAgentServiceProviderCollateralTransactionIdentification
	 * Transaction62.
	 * mmTripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction62#mmTripartyAgentServiceProviderCollateralInstructionIdentification
	 * Transaction62.
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
	public static final MMBusinessAttribute<SecuritiesTradeIdentification, Max35Text> mmTripartyAgentCollateralTransactionIdentification = new MMBusinessAttribute<SecuritiesTradeIdentification, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(AdditionalParameters29.mmTripartyAgentServiceProviderCollateralTransactionIdentification, AdditionalParameters29.mmTripartyAgentServiceProviderCollateralInstructionIdentification,
					AdditionalParameters30.mmTripartyAgentServiceProviderCollateralTransactionIdentification, SecuritiesFinancingTransactionDetails35.mmTripartyAgentServiceProviderCollateralTransactionIdentification,
					TransactionDetails105.mmTripartyAgentServiceProviderCollateralTransactionIdentification, TransactionDetails105.mmTripartyAgentServiceProviderCollateralInstructionIdentification,
					Transaction60.mmTripartyAgentServiceProviderCollateralTransactionIdentification, Transaction60.mmTripartyAgentServiceProviderCollateralInstructionIdentification,
					Transaction61.mmTripartyAgentServiceProviderCollateralTransactionIdentification, Transaction61.mmTripartyAgentServiceProviderCollateralInstructionIdentification,
					Transaction62.mmTripartyAgentServiceProviderCollateralTransactionIdentification, Transaction62.mmTripartyAgentServiceProviderCollateralInstructionIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TripartyAgentCollateralTransactionIdentification";
			definition = "Unique reference identifying the triparty collateral management transaction from the triparty agent's point of view.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SecuritiesTradeIdentification obj) {
			return obj.getTripartyAgentCollateralTransactionIdentification();
		}

		@Override
		public void setValue(SecuritiesTradeIdentification obj, Max35Text value) {
			obj.setTripartyAgentCollateralTransactionIdentification(value);
		}
	};
	protected Max35Text basketIdentification;
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
	public static final MMBusinessAttribute<SecuritiesTradeIdentification, Max35Text> mmBasketIdentification = new MMBusinessAttribute<SecuritiesTradeIdentification, Max35Text>() {
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

		@Override
		public Max35Text getValue(SecuritiesTradeIdentification obj) {
			return obj.getBasketIdentification();
		}

		@Override
		public void setValue(SecuritiesTradeIdentification obj, Max35Text value) {
			obj.setBasketIdentification(value);
		}
	};
	protected Max35Text programIdentification;
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
	public static final MMBusinessAttribute<SecuritiesTradeIdentification, Max35Text> mmProgramIdentification = new MMBusinessAttribute<SecuritiesTradeIdentification, Max35Text>() {
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

		@Override
		public Max35Text getValue(SecuritiesTradeIdentification obj) {
			return obj.getProgramIdentification();
		}

		@Override
		public void setValue(SecuritiesTradeIdentification obj, Max35Text value) {
			obj.setProgramIdentification(value);
		}
	};
	protected Max35Text blockIdentification;
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
	public static final MMBusinessAttribute<SecuritiesTradeIdentification, Max35Text> mmBlockIdentification = new MMBusinessAttribute<SecuritiesTradeIdentification, Max35Text>() {
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

		@Override
		public Max35Text getValue(SecuritiesTradeIdentification obj) {
			return obj.getBlockIdentification();
		}

		@Override
		public void setValue(SecuritiesTradeIdentification obj, Max35Text value) {
			obj.setBlockIdentification(value);
		}
	};
	protected Max35Text allocationIdentification;
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
	public static final MMBusinessAttribute<SecuritiesTradeIdentification, Max35Text> mmAllocationIdentification = new MMBusinessAttribute<SecuritiesTradeIdentification, Max35Text>() {
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

		@Override
		public Max35Text getValue(SecuritiesTradeIdentification obj) {
			return obj.getAllocationIdentification();
		}

		@Override
		public void setValue(SecuritiesTradeIdentification obj, Max35Text value) {
			obj.setAllocationIdentification(value);
		}
	};
	protected Max35Text complianceIdentification;
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
	public static final MMBusinessAttribute<SecuritiesTradeIdentification, Max35Text> mmComplianceIdentification = new MMBusinessAttribute<SecuritiesTradeIdentification, Max35Text>() {
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

		@Override
		public Max35Text getValue(SecuritiesTradeIdentification obj) {
			return obj.getComplianceIdentification();
		}

		@Override
		public void setValue(SecuritiesTradeIdentification obj, Max35Text value) {
			obj.setComplianceIdentification(value);
		}
	};
	protected Max35Text cSDTransactionIdentification;
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
	public static final MMBusinessAttribute<SecuritiesTradeIdentification, Max35Text> mmCSDTransactionIdentification = new MMBusinessAttribute<SecuritiesTradeIdentification, Max35Text>() {
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

		@Override
		public Max35Text getValue(SecuritiesTradeIdentification obj) {
			return obj.getCSDTransactionIdentification();
		}

		@Override
		public void setValue(SecuritiesTradeIdentification obj, Max35Text value) {
			obj.setCSDTransactionIdentification(value);
		}
	};
	protected Max35Text centralCounterpartyTransactionIdentification;
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
	public static final MMBusinessAttribute<SecuritiesTradeIdentification, Max35Text> mmCentralCounterpartyTransactionIdentification = new MMBusinessAttribute<SecuritiesTradeIdentification, Max35Text>() {
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

		@Override
		public Max35Text getValue(SecuritiesTradeIdentification obj) {
			return obj.getCentralCounterpartyTransactionIdentification();
		}

		@Override
		public void setValue(SecuritiesTradeIdentification obj, Max35Text value) {
			obj.setCentralCounterpartyTransactionIdentification(value);
		}
	};
	protected Max35Text cancellationRequestIdentification;
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
	public static final MMBusinessAttribute<SecuritiesTradeIdentification, Max35Text> mmCancellationRequestIdentification = new MMBusinessAttribute<SecuritiesTradeIdentification, Max35Text>() {
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

		@Override
		public Max35Text getValue(SecuritiesTradeIdentification obj) {
			return obj.getCancellationRequestIdentification();
		}

		@Override
		public void setValue(SecuritiesTradeIdentification obj, Max35Text value) {
			obj.setCancellationRequestIdentification(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTradeIdentification";
				definition = "Specifies the different identifications associated with a securities transaction.";
				associationDomain_lazy = () -> Arrays.asList(SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications);
				derivationElement_lazy = () -> Arrays.asList(Linkages15.mmReference, Linkages18.mmReference, Identification14.mmIdentification, Linkages36.mmReference, Linkages37.mmReference, Linkages38.mmReference, Linkages40.mmReference,
						MessageAndBusinessReference11.mmReference);
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
						MessageAndBusinessReference10.mmObject(), MessageAndBusinessReference11.mmObject(), References63Choice.mmObject());
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

	public SecuritiesTradeIdentification setIdentifiedTrade(SecuritiesTrade identifiedTrade) {
		this.identifiedTrade = Objects.requireNonNull(identifiedTrade);
		return this;
	}

	public Max35Text getMarketInfrastructureTransactionIdentification() {
		return marketInfrastructureTransactionIdentification;
	}

	public SecuritiesTradeIdentification setMarketInfrastructureTransactionIdentification(Max35Text marketInfrastructureTransactionIdentification) {
		this.marketInfrastructureTransactionIdentification = Objects.requireNonNull(marketInfrastructureTransactionIdentification);
		return this;
	}

	public Max35Text getProcessorTransactionIdentification() {
		return processorTransactionIdentification;
	}

	public SecuritiesTradeIdentification setProcessorTransactionIdentification(Max35Text processorTransactionIdentification) {
		this.processorTransactionIdentification = Objects.requireNonNull(processorTransactionIdentification);
		return this;
	}

	public Max35Text getPoolIdentification() {
		return poolIdentification;
	}

	public SecuritiesTradeIdentification setPoolIdentification(Max35Text poolIdentification) {
		this.poolIdentification = Objects.requireNonNull(poolIdentification);
		return this;
	}

	public Max35Text getCollateralTransactionIdentification() {
		return collateralTransactionIdentification;
	}

	public SecuritiesTradeIdentification setCollateralTransactionIdentification(Max35Text collateralTransactionIdentification) {
		this.collateralTransactionIdentification = Objects.requireNonNull(collateralTransactionIdentification);
		return this;
	}

	public Max35Text getClientTripartyCollateralTransactionIdentification() {
		return clientTripartyCollateralTransactionIdentification;
	}

	public SecuritiesTradeIdentification setClientTripartyCollateralTransactionIdentification(Max35Text clientTripartyCollateralTransactionIdentification) {
		this.clientTripartyCollateralTransactionIdentification = Objects.requireNonNull(clientTripartyCollateralTransactionIdentification);
		return this;
	}

	public Max35Text getTripartyAgentCollateralTransactionIdentification() {
		return tripartyAgentCollateralTransactionIdentification;
	}

	public SecuritiesTradeIdentification setTripartyAgentCollateralTransactionIdentification(Max35Text tripartyAgentCollateralTransactionIdentification) {
		this.tripartyAgentCollateralTransactionIdentification = Objects.requireNonNull(tripartyAgentCollateralTransactionIdentification);
		return this;
	}

	public Max35Text getBasketIdentification() {
		return basketIdentification;
	}

	public SecuritiesTradeIdentification setBasketIdentification(Max35Text basketIdentification) {
		this.basketIdentification = Objects.requireNonNull(basketIdentification);
		return this;
	}

	public Max35Text getProgramIdentification() {
		return programIdentification;
	}

	public SecuritiesTradeIdentification setProgramIdentification(Max35Text programIdentification) {
		this.programIdentification = Objects.requireNonNull(programIdentification);
		return this;
	}

	public Max35Text getBlockIdentification() {
		return blockIdentification;
	}

	public SecuritiesTradeIdentification setBlockIdentification(Max35Text blockIdentification) {
		this.blockIdentification = Objects.requireNonNull(blockIdentification);
		return this;
	}

	public Max35Text getAllocationIdentification() {
		return allocationIdentification;
	}

	public SecuritiesTradeIdentification setAllocationIdentification(Max35Text allocationIdentification) {
		this.allocationIdentification = Objects.requireNonNull(allocationIdentification);
		return this;
	}

	public Max35Text getComplianceIdentification() {
		return complianceIdentification;
	}

	public SecuritiesTradeIdentification setComplianceIdentification(Max35Text complianceIdentification) {
		this.complianceIdentification = Objects.requireNonNull(complianceIdentification);
		return this;
	}

	public Max35Text getCSDTransactionIdentification() {
		return cSDTransactionIdentification;
	}

	public SecuritiesTradeIdentification setCSDTransactionIdentification(Max35Text cSDTransactionIdentification) {
		this.cSDTransactionIdentification = Objects.requireNonNull(cSDTransactionIdentification);
		return this;
	}

	public Max35Text getCentralCounterpartyTransactionIdentification() {
		return centralCounterpartyTransactionIdentification;
	}

	public SecuritiesTradeIdentification setCentralCounterpartyTransactionIdentification(Max35Text centralCounterpartyTransactionIdentification) {
		this.centralCounterpartyTransactionIdentification = Objects.requireNonNull(centralCounterpartyTransactionIdentification);
		return this;
	}

	public Max35Text getCancellationRequestIdentification() {
		return cancellationRequestIdentification;
	}

	public SecuritiesTradeIdentification setCancellationRequestIdentification(Max35Text cancellationRequestIdentification) {
		this.cancellationRequestIdentification = Objects.requireNonNull(cancellationRequestIdentification);
		return this;
	}
}