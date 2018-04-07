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
import com.tools20022.repository.entity.SecuritiesTrade;
import com.tools20022.repository.entity.SecuritiesTradeStatusReason;
import com.tools20022.repository.entity.SecuritiesTransfer;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Status of a securities trade.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesTradeStatus"
 * src="doc-files/SecuritiesTradeStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmMatchingStatus
 * SecuritiesTradeStatus.mmMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmAffirmationStatus
 * SecuritiesTradeStatus.mmAffirmationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmReason
 * SecuritiesTradeStatus.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmSecuritiesTrade
 * SecuritiesTradeStatus.mmSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmTransactionStatus
 * SecuritiesTradeStatus.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmReplacementProcessingStatus
 * SecuritiesTradeStatus.mmReplacementProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmCancellationStatus
 * SecuritiesTradeStatus.mmCancellationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmCancellationRight
 * SecuritiesTradeStatus.mmCancellationRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmTransferStatus
 * SecuritiesTradeStatus.mmTransferStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmAllegedStatus
 * SecuritiesTradeStatus.mmAllegedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmCollateralAllocationStatus
 * SecuritiesTradeStatus.mmCollateralAllocationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmRepoCallRequestStatus
 * SecuritiesTradeStatus.mmRepoCallRequestStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmSettlementConditionModificationStatus
 * SecuritiesTradeStatus.mmSettlementConditionModificationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmMatchingProcess
 * SecuritiesTradeStatus.mmMatchingProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmRelatedSecuritiesTransfer
 * SecuritiesTradeStatus.mmRelatedSecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmTradeConfirmationStatus
 * SecuritiesTradeStatus.mmTradeConfirmationStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeStatus
 * SecuritiesTrade.mmSecuritiesTradeStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmStatus
 * SecuritiesTransfer.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmSecuritiesTradeStatus
 * SecuritiesTradeStatusReason.mmSecuritiesTradeStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus6Choice#mmProprietaryStatus
 * CancellationProcessingStatus6Choice.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus23Choice#mmProprietaryStatus
 * MatchingStatus23Choice.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus16Choice#mmPending
 * SettlementStatus16Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus16Choice#mmFailing
 * SettlementStatus16Choice.mmFailing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus16Choice#mmProprietary
 * SettlementStatus16Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#mmProprietary
 * ProcessingStatus48Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus24Choice#mmProprietary
 * MatchingStatus24Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus17Choice#mmPending
 * SettlementStatus17Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus17Choice#mmFailing
 * SettlementStatus17Choice.mmFailing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus17Choice#mmProprietary
 * SettlementStatus17Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters11#mmStatus
 * AdditionalQueryParameters11.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus26Choice#mmProprietary
 * MatchingStatus26Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus7Choice#mmProprietary
 * RepoCallRequestStatus7Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus18Choice#mmPending
 * SettlementStatus18Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus18Choice#mmFailing
 * SettlementStatus18Choice.mmFailing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus18Choice#mmProprietary
 * SettlementStatus18Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus25Choice#mmProprietary
 * MatchingStatus25Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmStatus
 * TransferStatus2Choice.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status21Choice#mmStatus
 * Status21Choice.mmStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.AffirmationStatus7Choice
 * AffirmationStatus7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AffirmationStatus6Choice
 * AffirmationStatus6Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus6Choice
 * CancellationProcessingStatus6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus8Choice
 * MatchingStatus8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferCancellationStatus2
 * TransferCancellationStatus2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ProcessingStatus43Choice
 * ProcessingStatus43Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus23Choice
 * MatchingStatus23Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus16Choice
 * SettlementStatus16Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus24Choice
 * MatchingStatus24Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus17Choice
 * SettlementStatus17Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalQueryParameters11
 * AdditionalQueryParameters11}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus26Choice
 * MatchingStatus26Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus7Choice
 * RepoCallRequestStatus7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus18Choice
 * SettlementStatus18Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus8Choice
 * RepoCallRequestStatus8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AffirmationStatus8Choice
 * AffirmationStatus8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus27Choice
 * MatchingStatus27Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus25Choice
 * MatchingStatus25Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus23Choice
 * InstructionProcessingStatus23Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AllocationSatus3Choice
 * AllocationSatus3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AllegementStatus3Choice
 * AllegementStatus3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus7Choice
 * CancellationProcessingStatus7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus19Choice
 * SettlementStatus19Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferInstructionStatus4
 * TransferInstructionStatus4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TransferStatus2Choice
 * TransferStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferStatusAndReason5
 * TransferStatusAndReason5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancellationStatusAndReason4
 * CancellationStatusAndReason4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PortfolioTransferStatus1Choice
 * PortfolioTransferStatus1Choice}</li>
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
 * "SecuritiesTradeStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status of a securities trade."</li>
 * </ul>
 */
public class SecuritiesTradeStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected MatchingStatusCode matchingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MatchingStatusCode
	 * MatchingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus8Choice#mmCode
	 * MatchingStatus8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus8Choice#mmProprietary
	 * MatchingStatus8Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmMatchStatus
	 * Order17.mmMatchStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmMatchStatus
	 * Order18.mmMatchStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus23Choice#mmMatched
	 * MatchingStatus23Choice.mmMatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus23Choice#mmMatchedWithTolerance
	 * MatchingStatus23Choice.mmMatchedWithTolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus23Choice#mmMatchingAlleged
	 * MatchingStatus23Choice.mmMatchingAlleged}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason28#mmInferredMatchingStatus
	 * StatusAndReason28.mmInferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason28#mmMatchingStatus
	 * StatusAndReason28.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail6#mmInferredMatchingStatus
	 * StatusTrail6.mmInferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail6#mmMatchingStatus
	 * StatusTrail6.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus24Choice#mmMatched
	 * MatchingStatus24Choice.mmMatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus26Choice#mmMatched
	 * MatchingStatus26Choice.mmMatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus27Choice#mmCode
	 * MatchingStatus27Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus27Choice#mmProprietary
	 * MatchingStatus27Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status18Choice#mmMatchingStatus
	 * Status18Choice.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status18Choice#mmInferredMatchingStatus
	 * Status18Choice.mmInferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus25Choice#mmMatched
	 * MatchingStatus25Choice.mmMatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmInferredMatchingStatus
	 * Status19Choice.mmInferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmMatchingStatus
	 * Status19Choice.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails73#mmMatchingStatus
	 * SecuritiesTradeDetails73.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails75#mmMatchingStatus
	 * SecuritiesTradeDetails75.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails77#mmMatchingStatus
	 * SecuritiesTradeDetails77.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails78#mmMatchingStatus
	 * SecuritiesTradeDetails78.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails79#mmMatchingStatus
	 * SecuritiesTradeDetails79.mmMatchingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of matching of a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatus, MatchingStatusCode> mmMatchingStatus = new MMBusinessAttribute<SecuritiesTradeStatus, MatchingStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(MatchingStatus8Choice.mmCode, MatchingStatus8Choice.mmProprietary, Order17.mmMatchStatus, Order18.mmMatchStatus, MatchingStatus23Choice.mmMatched,
					MatchingStatus23Choice.mmMatchedWithTolerance, MatchingStatus23Choice.mmMatchingAlleged, StatusAndReason28.mmInferredMatchingStatus, StatusAndReason28.mmMatchingStatus, StatusTrail6.mmInferredMatchingStatus,
					StatusTrail6.mmMatchingStatus, MatchingStatus24Choice.mmMatched, MatchingStatus26Choice.mmMatched, MatchingStatus27Choice.mmCode, MatchingStatus27Choice.mmProprietary, Status18Choice.mmMatchingStatus,
					Status18Choice.mmInferredMatchingStatus, MatchingStatus25Choice.mmMatched, Status19Choice.mmInferredMatchingStatus, Status19Choice.mmMatchingStatus, SecuritiesTradeDetails73.mmMatchingStatus,
					SecuritiesTradeDetails75.mmMatchingStatus, SecuritiesTradeDetails77.mmMatchingStatus, SecuritiesTradeDetails78.mmMatchingStatus, SecuritiesTradeDetails79.mmMatchingStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MatchingStatus";
			definition = "Status of matching of a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MatchingStatusCode.mmObject();
		}

		@Override
		public MatchingStatusCode getValue(SecuritiesTradeStatus obj) {
			return obj.getMatchingStatus();
		}

		@Override
		public void setValue(SecuritiesTradeStatus obj, MatchingStatusCode value) {
			obj.setMatchingStatus(value);
		}
	};
	protected AffirmationStatusCode affirmationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AffirmationStatusCode
	 * AffirmationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus7Choice#mmCode
	 * AffirmationStatus7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus7Choice#mmProprietary
	 * AffirmationStatus7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason10#mmAffirmationStatus
	 * StatusAndReason10.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus6Choice#mmAffirmed
	 * AffirmationStatus6Choice.mmAffirmed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus6Choice#mmUnaffirmed
	 * AffirmationStatus6Choice.mmUnaffirmed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus6Choice#mmProprietaryStatus
	 * AffirmationStatus6Choice.mmProprietaryStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus8Choice#mmCode
	 * AffirmationStatus8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus8Choice#mmProprietary
	 * AffirmationStatus8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmAffirmationStatus
	 * Status19Choice.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails73#mmAffirmationStatus
	 * SecuritiesTradeDetails73.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails75#mmAffirmationStatus
	 * SecuritiesTradeDetails75.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails77#mmAffirmationStatus
	 * SecuritiesTradeDetails77.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails78#mmAffirmationStatus
	 * SecuritiesTradeDetails78.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails79#mmAffirmationStatus
	 * SecuritiesTradeDetails79.mmAffirmationStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffirmationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of affirmation of a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatus, AffirmationStatusCode> mmAffirmationStatus = new MMBusinessAttribute<SecuritiesTradeStatus, AffirmationStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(AffirmationStatus7Choice.mmCode, AffirmationStatus7Choice.mmProprietary, StatusAndReason10.mmAffirmationStatus, AffirmationStatus6Choice.mmAffirmed, AffirmationStatus6Choice.mmUnaffirmed,
					AffirmationStatus6Choice.mmProprietaryStatus, AffirmationStatus8Choice.mmCode, AffirmationStatus8Choice.mmProprietary, Status19Choice.mmAffirmationStatus, SecuritiesTradeDetails73.mmAffirmationStatus,
					SecuritiesTradeDetails75.mmAffirmationStatus, SecuritiesTradeDetails77.mmAffirmationStatus, SecuritiesTradeDetails78.mmAffirmationStatus, SecuritiesTradeDetails79.mmAffirmationStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AffirmationStatus";
			definition = "Status of affirmation of a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AffirmationStatusCode.mmObject();
		}

		@Override
		public AffirmationStatusCode getValue(SecuritiesTradeStatus obj) {
			return obj.getAffirmationStatus();
		}

		@Override
		public void setValue(SecuritiesTradeStatus obj, AffirmationStatusCode value) {
			obj.setAffirmationStatus(value);
		}
	};
	protected List<SecuritiesTradeStatusReason> reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmSecuritiesTradeStatus
	 * SecuritiesTradeStatusReason.mmSecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus6Choice#mmCancellationPending
	 * CancellationProcessingStatus6Choice.mmCancellationPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus23Choice#mmUnmatched
	 * MatchingStatus23Choice.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus24Choice#mmUnmatched
	 * MatchingStatus24Choice.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus26Choice#mmUnmatched
	 * MatchingStatus26Choice.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus25Choice#mmUnmatched
	 * MatchingStatus25Choice.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmReversed
	 * TransferStatus2Choice.mmReversed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmDeliveryReturnReason
	 * SettlementDetails142.mmDeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmDeliveryReturnReason
	 * SettlementDetails145.mmDeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmDeliveryReturnReason
	 * SettlementDetails146.mmDeliveryReturnReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reasons for the status. It is derived from the relationship between Status and Status Reason."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesTradeStatus, List<SecuritiesTradeStatusReason>> mmReason = new MMBusinessAssociationEnd<SecuritiesTradeStatus, List<SecuritiesTradeStatusReason>>() {
		{
			derivation_lazy = () -> Arrays.asList(CancellationProcessingStatus6Choice.mmCancellationPending, MatchingStatus23Choice.mmUnmatched, MatchingStatus24Choice.mmUnmatched, MatchingStatus26Choice.mmUnmatched,
					MatchingStatus25Choice.mmUnmatched, TransferStatus2Choice.mmReversed, SettlementDetails142.mmDeliveryReturnReason, SettlementDetails145.mmDeliveryReturnReason, SettlementDetails146.mmDeliveryReturnReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reason";
			definition = "Specifies the reasons for the status. It is derived from the relationship between Status and Status Reason.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesTradeStatusReason.mmSecuritiesTradeStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesTradeStatusReason.mmObject();
		}

		@Override
		public List<SecuritiesTradeStatusReason> getValue(SecuritiesTradeStatus obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(SecuritiesTradeStatus obj, List<SecuritiesTradeStatusReason> value) {
			obj.setReason(value);
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesTrade> securitiesTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeStatus
	 * SecuritiesTrade.mmSecuritiesTradeStatus}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the trade which has a specific status."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesTradeStatus, List<SecuritiesTrade>> mmSecuritiesTrade = new MMBusinessAssociationEnd<SecuritiesTradeStatus, List<SecuritiesTrade>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTrade";
			definition = "Specifies the trade which has a specific status.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesTradeStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
		}

		@Override
		public List<SecuritiesTrade> getValue(SecuritiesTradeStatus obj) {
			return obj.getSecuritiesTrade();
		}

		@Override
		public void setValue(SecuritiesTradeStatus obj, List<SecuritiesTrade> value) {
			obj.setSecuritiesTrade(value);
		}
	};
	protected TransactionStatusCode transactionStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionStatusCode
	 * TransactionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmBookingStatus
	 * InvestmentFundTransaction4.mmBookingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of an investment fund transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatus, TransactionStatusCode> mmTransactionStatus = new MMBusinessAttribute<SecuritiesTradeStatus, TransactionStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentFundTransaction4.mmBookingStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionStatus";
			definition = "Status of an investment fund transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionStatusCode.mmObject();
		}

		@Override
		public TransactionStatusCode getValue(SecuritiesTradeStatus obj) {
			return obj.getTransactionStatus();
		}

		@Override
		public void setValue(SecuritiesTradeStatus obj, TransactionStatusCode value) {
			obj.setTransactionStatus(value);
		}
	};
	protected ReplacementProcessingStatusCode replacementProcessingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatusCode
	 * ReplacementProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus8Choice#mmCode
	 * ReplacementProcessingStatus8Choice.mmCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReplacementProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the processing status of the replacement request."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatus, ReplacementProcessingStatusCode> mmReplacementProcessingStatus = new MMBusinessAttribute<SecuritiesTradeStatus, ReplacementProcessingStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(ReplacementProcessingStatus8Choice.mmCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReplacementProcessingStatus";
			definition = "Provides the processing status of the replacement request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReplacementProcessingStatusCode.mmObject();
		}

		@Override
		public ReplacementProcessingStatusCode getValue(SecuritiesTradeStatus obj) {
			return obj.getReplacementProcessingStatus();
		}

		@Override
		public void setValue(SecuritiesTradeStatus obj, ReplacementProcessingStatusCode value) {
			obj.setReplacementProcessingStatus(value);
		}
	};
	protected CancellationStatusCode cancellationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationStatusCode
	 * CancellationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus6Choice#mmCancellationRequested
	 * CancellationProcessingStatus6Choice.mmCancellationRequested}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus6Choice#mmCancellationCompleted
	 * CancellationProcessingStatus6Choice.mmCancellationCompleted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferCancellationStatus2#mmStatus
	 * TransferCancellationStatus2.mmStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the cancellation of a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatus, CancellationStatusCode> mmCancellationStatus = new MMBusinessAttribute<SecuritiesTradeStatus, CancellationStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CancellationProcessingStatus6Choice.mmCancellationRequested, CancellationProcessingStatus6Choice.mmCancellationCompleted, TransferCancellationStatus2.mmStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationStatus";
			definition = "Status of the cancellation of a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancellationStatusCode.mmObject();
		}

		@Override
		public CancellationStatusCode getValue(SecuritiesTradeStatus obj) {
			return obj.getCancellationStatus();
		}

		@Override
		public void setValue(SecuritiesTradeStatus obj, CancellationStatusCode value) {
			obj.setCancellationStatus(value);
		}
	};
	protected CancellationRightCode cancellationRight;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationRightCode
	 * CancellationRightCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation right of an investor with respect to an order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatus, CancellationRightCode> mmCancellationRight = new MMBusinessAttribute<SecuritiesTradeStatus, CancellationRightCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationRight";
			definition = "Cancellation right of an investor with respect to an order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancellationRightCode.mmObject();
		}

		@Override
		public CancellationRightCode getValue(SecuritiesTradeStatus obj) {
			return obj.getCancellationRight();
		}

		@Override
		public void setValue(SecuritiesTradeStatus obj, CancellationRightCode value) {
			obj.setCancellationRight(value);
		}
	};
	protected TransferStatusCode transferStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransferStatusCode
	 * TransferStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferInstructionStatus4#mmStatus
	 * TransferInstructionStatus4.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason5#mmTransferStatus
	 * TransferStatusAndReason5.mmTransferStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the transfer is accepted, sent to next party, matched, already executed, or settled."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatus, TransferStatusCode> mmTransferStatus = new MMBusinessAttribute<SecuritiesTradeStatus, TransferStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(TransferInstructionStatus4.mmStatus, TransferStatusAndReason5.mmTransferStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferStatus";
			definition = "Status of the transfer is accepted, sent to next party, matched, already executed, or settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransferStatusCode.mmObject();
		}

		@Override
		public TransferStatusCode getValue(SecuritiesTradeStatus obj) {
			return obj.getTransferStatus();
		}

		@Override
		public void setValue(SecuritiesTradeStatus obj, TransferStatusCode value) {
			obj.setTransferStatus(value);
		}
	};
	protected AllegementStatusCode allegedStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AllegementStatusCode
	 * AllegementStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllegementStatus3Choice#mmCode
	 * AllegementStatus3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllegementStatus3Choice#mmProprietary
	 * AllegementStatus3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71#mmStatus
	 * SecuritiesTradeDetails71.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmStatus
	 * SecuritiesTradeDetails72.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PortfolioTransferStatus1Choice#mmCode
	 * PortfolioTransferStatus1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PortfolioTransferStatus1Choice#mmProprietary
	 * PortfolioTransferStatus1Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllegedStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of an allegement."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatus, AllegementStatusCode> mmAllegedStatus = new MMBusinessAttribute<SecuritiesTradeStatus, AllegementStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(AllegementStatus3Choice.mmCode, AllegementStatus3Choice.mmProprietary, SecuritiesTradeDetails71.mmStatus, SecuritiesTradeDetails72.mmStatus, PortfolioTransferStatus1Choice.mmCode,
					PortfolioTransferStatus1Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AllegedStatus";
			definition = "Provides the status of an allegement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AllegementStatusCode.mmObject();
		}

		@Override
		public AllegementStatusCode getValue(SecuritiesTradeStatus obj) {
			return obj.getAllegedStatus();
		}

		@Override
		public void setValue(SecuritiesTradeStatus obj, AllegementStatusCode value) {
			obj.setAllegedStatus(value);
		}
	};
	protected AllocationStatusCode collateralAllocationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AllocationStatusCode
	 * AllocationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllocationSatus3Choice#mmCode
	 * AllocationSatus3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllocationSatus3Choice#mmProprietary
	 * AllocationSatus3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmAllocationStatus
	 * Status19Choice.mmAllocationStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralAllocationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the status of allocation of collateral to cover the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatus, AllocationStatusCode> mmCollateralAllocationStatus = new MMBusinessAttribute<SecuritiesTradeStatus, AllocationStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(AllocationSatus3Choice.mmCode, AllocationSatus3Choice.mmProprietary, Status19Choice.mmAllocationStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralAllocationStatus";
			definition = "Provides the status of allocation of collateral to cover the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AllocationStatusCode.mmObject();
		}

		@Override
		public AllocationStatusCode getValue(SecuritiesTradeStatus obj) {
			return obj.getCollateralAllocationStatus();
		}

		@Override
		public void setValue(SecuritiesTradeStatus obj, AllocationStatusCode value) {
			obj.setCollateralAllocationStatus(value);
		}
	};
	protected RepoCallRequestStatusCode repoCallRequestStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RepoCallRequestStatusCode
	 * RepoCallRequestStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus8Choice#mmCode
	 * RepoCallRequestStatus8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus8Choice#mmProprietary
	 * RepoCallRequestStatus8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmRepoCallRequestStatus
	 * Status19Choice.mmRepoCallRequestStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepoCallRequestStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies additional information about the status of the repurchase agreement call processed instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatus, RepoCallRequestStatusCode> mmRepoCallRequestStatus = new MMBusinessAttribute<SecuritiesTradeStatus, RepoCallRequestStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(RepoCallRequestStatus8Choice.mmCode, RepoCallRequestStatus8Choice.mmProprietary, Status19Choice.mmRepoCallRequestStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RepoCallRequestStatus";
			definition = "Specifies additional information about the status of the repurchase agreement call processed instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RepoCallRequestStatusCode.mmObject();
		}

		@Override
		public RepoCallRequestStatusCode getValue(SecuritiesTradeStatus obj) {
			return obj.getRepoCallRequestStatus();
		}

		@Override
		public void setValue(SecuritiesTradeStatus obj, RepoCallRequestStatusCode value) {
			obj.setRepoCallRequestStatus(value);
		}
	};
	protected SettlementConditionModificationStatusStatusCode settlementConditionModificationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementConditionModificationStatusStatusCode
	 * SettlementConditionModificationStatusStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmSettlementConditionModificationStatus
	 * Status19Choice.mmSettlementConditionModificationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementConditionModificationStatus3Choice#mmCode
	 * SettlementConditionModificationStatus3Choice.mmCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementConditionModificationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the status of the securities settlement condition modification request."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatus, SettlementConditionModificationStatusStatusCode> mmSettlementConditionModificationStatus = new MMBusinessAttribute<SecuritiesTradeStatus, SettlementConditionModificationStatusStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(Status19Choice.mmSettlementConditionModificationStatus, SettlementConditionModificationStatus3Choice.mmCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementConditionModificationStatus";
			definition = "Provides the status of the securities settlement condition modification request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementConditionModificationStatusStatusCode.mmObject();
		}

		@Override
		public SettlementConditionModificationStatusStatusCode getValue(SecuritiesTradeStatus obj) {
			return obj.getSettlementConditionModificationStatus();
		}

		@Override
		public void setValue(SecuritiesTradeStatus obj, SettlementConditionModificationStatusStatusCode value) {
			obj.setSettlementConditionModificationStatus(value);
		}
	};
	protected MatchingProcessCode matchingProcess;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MatchingProcessCode
	 * MatchingProcessCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the matching status of a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatus, MatchingProcessCode> mmMatchingProcess = new MMBusinessAttribute<SecuritiesTradeStatus, MatchingProcessCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MatchingProcess";
			definition = "Specifies the matching status of a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MatchingProcessCode.mmObject();
		}

		@Override
		public MatchingProcessCode getValue(SecuritiesTradeStatus obj) {
			return obj.getMatchingProcess();
		}

		@Override
		public void setValue(SecuritiesTradeStatus obj, MatchingProcessCode value) {
			obj.setMatchingProcess(value);
		}
	};
	protected SecuritiesTransfer relatedSecuritiesTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmStatus
	 * SecuritiesTransfer.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer operation for which a status is provided"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesTradeStatus, SecuritiesTransfer> mmRelatedSecuritiesTransfer = new MMBusinessAssociationEnd<SecuritiesTradeStatus, SecuritiesTransfer>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesTransfer";
			definition = "Transfer operation for which a status is provided";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesTransfer.mmStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesTransfer.mmObject();
		}

		@Override
		public SecuritiesTransfer getValue(SecuritiesTradeStatus obj) {
			return obj.getRelatedSecuritiesTransfer();
		}

		@Override
		public void setValue(SecuritiesTradeStatus obj, SecuritiesTransfer value) {
			obj.setRelatedSecuritiesTransfer(value);
		}
	};
	protected TradeConfirmationTypeCode tradeConfirmationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationTypeCode
	 * TradeConfirmationTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeConfirmationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the contract was electronically confirmed, non-electronically confirmed or remains unconfirmed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatus, TradeConfirmationTypeCode> mmTradeConfirmationStatus = new MMBusinessAttribute<SecuritiesTradeStatus, TradeConfirmationTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeConfirmationStatus";
			definition = "Specifies whether the contract was electronically confirmed, non-electronically confirmed or remains unconfirmed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeConfirmationTypeCode.mmObject();
		}

		@Override
		public TradeConfirmationTypeCode getValue(SecuritiesTradeStatus obj) {
			return obj.getTradeConfirmationStatus();
		}

		@Override
		public void setValue(SecuritiesTradeStatus obj, TradeConfirmationTypeCode value) {
			obj.setTradeConfirmationStatus(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTradeStatus";
				definition = "Status of a securities trade.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesTradeStatus, SecuritiesTransfer.mmStatus, SecuritiesTradeStatusReason.mmSecuritiesTradeStatus);
				derivationElement_lazy = () -> Arrays.asList(CancellationProcessingStatus6Choice.mmProprietaryStatus, MatchingStatus23Choice.mmProprietaryStatus, SettlementStatus16Choice.mmPending, SettlementStatus16Choice.mmFailing,
						SettlementStatus16Choice.mmProprietary, ProcessingStatus48Choice.mmProprietary, MatchingStatus24Choice.mmProprietary, SettlementStatus17Choice.mmPending, SettlementStatus17Choice.mmFailing,
						SettlementStatus17Choice.mmProprietary, AdditionalQueryParameters11.mmStatus, MatchingStatus26Choice.mmProprietary, RepoCallRequestStatus7Choice.mmProprietary, SettlementStatus18Choice.mmPending,
						SettlementStatus18Choice.mmFailing, SettlementStatus18Choice.mmProprietary, MatchingStatus25Choice.mmProprietary, TransferStatus2Choice.mmStatus, Status21Choice.mmStatus);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTradeStatus.mmMatchingStatus, com.tools20022.repository.entity.SecuritiesTradeStatus.mmAffirmationStatus,
						com.tools20022.repository.entity.SecuritiesTradeStatus.mmReason, com.tools20022.repository.entity.SecuritiesTradeStatus.mmSecuritiesTrade, com.tools20022.repository.entity.SecuritiesTradeStatus.mmTransactionStatus,
						com.tools20022.repository.entity.SecuritiesTradeStatus.mmReplacementProcessingStatus, com.tools20022.repository.entity.SecuritiesTradeStatus.mmCancellationStatus,
						com.tools20022.repository.entity.SecuritiesTradeStatus.mmCancellationRight, com.tools20022.repository.entity.SecuritiesTradeStatus.mmTransferStatus,
						com.tools20022.repository.entity.SecuritiesTradeStatus.mmAllegedStatus, com.tools20022.repository.entity.SecuritiesTradeStatus.mmCollateralAllocationStatus,
						com.tools20022.repository.entity.SecuritiesTradeStatus.mmRepoCallRequestStatus, com.tools20022.repository.entity.SecuritiesTradeStatus.mmSettlementConditionModificationStatus,
						com.tools20022.repository.entity.SecuritiesTradeStatus.mmMatchingProcess, com.tools20022.repository.entity.SecuritiesTradeStatus.mmRelatedSecuritiesTransfer,
						com.tools20022.repository.entity.SecuritiesTradeStatus.mmTradeConfirmationStatus);
				derivationComponent_lazy = () -> Arrays.asList(AffirmationStatus7Choice.mmObject(), AffirmationStatus6Choice.mmObject(), CancellationProcessingStatus6Choice.mmObject(), MatchingStatus8Choice.mmObject(),
						TransferCancellationStatus2.mmObject(), ProcessingStatus43Choice.mmObject(), MatchingStatus23Choice.mmObject(), SettlementStatus16Choice.mmObject(), MatchingStatus24Choice.mmObject(),
						SettlementStatus17Choice.mmObject(), AdditionalQueryParameters11.mmObject(), MatchingStatus26Choice.mmObject(), RepoCallRequestStatus7Choice.mmObject(), SettlementStatus18Choice.mmObject(),
						RepoCallRequestStatus8Choice.mmObject(), AffirmationStatus8Choice.mmObject(), MatchingStatus27Choice.mmObject(), MatchingStatus25Choice.mmObject(), InstructionProcessingStatus23Choice.mmObject(),
						AllocationSatus3Choice.mmObject(), AllegementStatus3Choice.mmObject(), CancellationProcessingStatus7Choice.mmObject(), SettlementStatus19Choice.mmObject(), TransferInstructionStatus4.mmObject(),
						TransferStatus2Choice.mmObject(), TransferStatusAndReason5.mmObject(), CancellationStatusAndReason4.mmObject(), PortfolioTransferStatus1Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesTradeStatus.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MatchingStatusCode getMatchingStatus() {
		return matchingStatus;
	}

	public SecuritiesTradeStatus setMatchingStatus(MatchingStatusCode matchingStatus) {
		this.matchingStatus = Objects.requireNonNull(matchingStatus);
		return this;
	}

	public AffirmationStatusCode getAffirmationStatus() {
		return affirmationStatus;
	}

	public SecuritiesTradeStatus setAffirmationStatus(AffirmationStatusCode affirmationStatus) {
		this.affirmationStatus = Objects.requireNonNull(affirmationStatus);
		return this;
	}

	public List<SecuritiesTradeStatusReason> getReason() {
		return reason == null ? reason = new ArrayList<>() : reason;
	}

	public SecuritiesTradeStatus setReason(List<SecuritiesTradeStatusReason> reason) {
		this.reason = Objects.requireNonNull(reason);
		return this;
	}

	public List<SecuritiesTrade> getSecuritiesTrade() {
		return securitiesTrade == null ? securitiesTrade = new ArrayList<>() : securitiesTrade;
	}

	public SecuritiesTradeStatus setSecuritiesTrade(List<com.tools20022.repository.entity.SecuritiesTrade> securitiesTrade) {
		this.securitiesTrade = Objects.requireNonNull(securitiesTrade);
		return this;
	}

	public TransactionStatusCode getTransactionStatus() {
		return transactionStatus;
	}

	public SecuritiesTradeStatus setTransactionStatus(TransactionStatusCode transactionStatus) {
		this.transactionStatus = Objects.requireNonNull(transactionStatus);
		return this;
	}

	public ReplacementProcessingStatusCode getReplacementProcessingStatus() {
		return replacementProcessingStatus;
	}

	public SecuritiesTradeStatus setReplacementProcessingStatus(ReplacementProcessingStatusCode replacementProcessingStatus) {
		this.replacementProcessingStatus = Objects.requireNonNull(replacementProcessingStatus);
		return this;
	}

	public CancellationStatusCode getCancellationStatus() {
		return cancellationStatus;
	}

	public SecuritiesTradeStatus setCancellationStatus(CancellationStatusCode cancellationStatus) {
		this.cancellationStatus = Objects.requireNonNull(cancellationStatus);
		return this;
	}

	public CancellationRightCode getCancellationRight() {
		return cancellationRight;
	}

	public SecuritiesTradeStatus setCancellationRight(CancellationRightCode cancellationRight) {
		this.cancellationRight = Objects.requireNonNull(cancellationRight);
		return this;
	}

	public TransferStatusCode getTransferStatus() {
		return transferStatus;
	}

	public SecuritiesTradeStatus setTransferStatus(TransferStatusCode transferStatus) {
		this.transferStatus = Objects.requireNonNull(transferStatus);
		return this;
	}

	public AllegementStatusCode getAllegedStatus() {
		return allegedStatus;
	}

	public SecuritiesTradeStatus setAllegedStatus(AllegementStatusCode allegedStatus) {
		this.allegedStatus = Objects.requireNonNull(allegedStatus);
		return this;
	}

	public AllocationStatusCode getCollateralAllocationStatus() {
		return collateralAllocationStatus;
	}

	public SecuritiesTradeStatus setCollateralAllocationStatus(AllocationStatusCode collateralAllocationStatus) {
		this.collateralAllocationStatus = Objects.requireNonNull(collateralAllocationStatus);
		return this;
	}

	public RepoCallRequestStatusCode getRepoCallRequestStatus() {
		return repoCallRequestStatus;
	}

	public SecuritiesTradeStatus setRepoCallRequestStatus(RepoCallRequestStatusCode repoCallRequestStatus) {
		this.repoCallRequestStatus = Objects.requireNonNull(repoCallRequestStatus);
		return this;
	}

	public SettlementConditionModificationStatusStatusCode getSettlementConditionModificationStatus() {
		return settlementConditionModificationStatus;
	}

	public SecuritiesTradeStatus setSettlementConditionModificationStatus(SettlementConditionModificationStatusStatusCode settlementConditionModificationStatus) {
		this.settlementConditionModificationStatus = Objects.requireNonNull(settlementConditionModificationStatus);
		return this;
	}

	public MatchingProcessCode getMatchingProcess() {
		return matchingProcess;
	}

	public SecuritiesTradeStatus setMatchingProcess(MatchingProcessCode matchingProcess) {
		this.matchingProcess = Objects.requireNonNull(matchingProcess);
		return this;
	}

	public SecuritiesTransfer getRelatedSecuritiesTransfer() {
		return relatedSecuritiesTransfer;
	}

	public SecuritiesTradeStatus setRelatedSecuritiesTransfer(SecuritiesTransfer relatedSecuritiesTransfer) {
		this.relatedSecuritiesTransfer = Objects.requireNonNull(relatedSecuritiesTransfer);
		return this;
	}

	public TradeConfirmationTypeCode getTradeConfirmationStatus() {
		return tradeConfirmationStatus;
	}

	public SecuritiesTradeStatus setTradeConfirmationStatus(TradeConfirmationTypeCode tradeConfirmationStatus) {
		this.tradeConfirmationStatus = Objects.requireNonNull(tradeConfirmationStatus);
		return this;
	}
}