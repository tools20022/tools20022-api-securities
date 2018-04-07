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
import com.tools20022.repository.entity.SecuritiesTradeStatus;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Specifies the underlying reason for a status of a securities trade.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesTradeStatusReason"
 * src="doc-files/SecuritiesTradeStatusReason.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.StatusReason
 * StatusReason}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmUnmatchedReason
 * SecuritiesTradeStatusReason.mmUnmatchedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmDeniedReason
 * SecuritiesTradeStatusReason.mmDeniedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmSecuritiesTradeStatus
 * SecuritiesTradeStatusReason.mmSecuritiesTradeStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmGeneratedReason
 * SecuritiesTradeStatusReason.mmGeneratedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmAllegementReason
 * SecuritiesTradeStatusReason.mmAllegementReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmPendingSettlementReason
 * SecuritiesTradeStatusReason.mmPendingSettlementReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmRepoCallAcknowledgementReason
 * SecuritiesTradeStatusReason.mmRepoCallAcknowledgementReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmRepairReason
 * SecuritiesTradeStatusReason.mmRepairReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmDeliveryReturnReason
 * SecuritiesTradeStatusReason.mmDeliveryReturnReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmCounterpartyStatusReason
 * SecuritiesTradeStatusReason.mmCounterpartyStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmModifiedStatusReason
 * SecuritiesTradeStatusReason.mmModifiedStatusReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmReason
 * SecuritiesTradeStatus.mmReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AffirmationReason1#mmCode
 * AffirmationReason1.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingProcessing1Choice#mmReason
 * PendingProcessing1Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmAlreadyMatchedAndAffirmed
 * ProcessingStatus17Choice.mmAlreadyMatchedAndAffirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmDefaultAction
 * ProcessingStatus17Choice.mmDefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmDone
 * ProcessingStatus17Choice.mmDone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmForcedRejection
 * ProcessingStatus17Choice.mmForcedRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmFullyExecutedConfirmationSent
 * ProcessingStatus17Choice.mmFullyExecutedConfirmationSent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmFuture
 * ProcessingStatus17Choice.mmFuture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmGenerated
 * ProcessingStatus17Choice.mmGenerated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmNoInstruction
 * ProcessingStatus17Choice.mmNoInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmOpenOrder
 * ProcessingStatus17Choice.mmOpenOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmReceivedAtIntermediary
 * ProcessingStatus17Choice.mmReceivedAtIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmSettlementInstructionSent
 * ProcessingStatus17Choice.mmSettlementInstructionSent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmStandingInstruction
 * ProcessingStatus17Choice.mmStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmTradingSuspendedByStockExchange
 * ProcessingStatus17Choice.mmTradingSuspendedByStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmTreated
 * ProcessingStatus17Choice.mmTreated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmProprietaryStatus
 * ProcessingStatus17Choice.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CancellationReason11Choice#mmReason
 * CancellationReason11Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingStatus20Choice#mmForwarded
 * PendingStatus20Choice.mmForwarded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingStatus20Choice#mmUnderInvestigation
 * PendingStatus20Choice.mmUnderInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AllegementMatchingReason1#mmCode
 * AllegementMatchingReason1.mmCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportItemStatus1#mmException
 * ReportItemStatus1.mmException}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus55Choice#mmProprietary
 * ProcessingStatus55Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus5Choice#mmRejected
 * IntraPositionProcessingStatus5Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus5Choice#mmRepair
 * IntraPositionProcessingStatus5Choice.mmRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus50Choice#mmCompleted
 * ProcessingStatus50Choice.mmCompleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus50Choice#mmProprietary
 * ProcessingStatus50Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#mmCancellationRequested
 * ProcessingStatus48Choice.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#mmModificationRequested
 * ProcessingStatus48Choice.mmModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus54Choice#mmProprietary
 * ProcessingStatus54Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus51Choice#mmProprietary
 * ProcessingStatus51Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus51Choice#mmCancellationRequested
 * ProcessingStatus51Choice.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus51Choice#mmModificationRequested
 * ProcessingStatus51Choice.mmModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus52Choice#mmProprietary
 * ProcessingStatus52Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus52Choice#mmCancellationRequested
 * ProcessingStatus52Choice.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus31Choice#mmReason
 * RejectionOrRepairStatus31Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationStatus4Choice#mmReason
 * ModificationStatus4Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason25#mmCode
 * RejectionOrRepairReason25.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus17Choice#mmReason
 * UnmatchedStatus17Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus49Choice#mmProprietary
 * ProcessingStatus49Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus49Choice#mmCancellationRequested
 * ProcessingStatus49Choice.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus49Choice#mmModificationRequested
 * ProcessingStatus49Choice.mmModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus16Choice#mmReason
 * UnmatchedStatus16Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#mmModificationRequested
 * InstructionProcessingStatus22Choice.mmModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus29Choice#mmReason
 * RejectionOrRepairStatus29Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason23#mmCode
 * RejectionOrRepairReason23.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus53Choice#mmProprietary
 * ProcessingStatus53Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GeneratedStatus7Choice#mmReason
 * GeneratedStatus7Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus32Choice#mmReason
 * RejectionOrRepairStatus32Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus18Choice#mmReason
 * UnmatchedStatus18Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason26#mmCode
 * RejectionOrRepairReason26.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus30Choice#mmReason
 * RejectionOrRepairStatus30Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason24#mmCode
 * RejectionOrRepairReason24.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferInstructionStatus4#mmReason
 * TransferInstructionStatus4.mmReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.UnaffirmedReason2Choice
 * UnaffirmedReason2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AffirmationReason1
 * AffirmationReason1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AffirmationReason1Choice
 * AffirmationReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepairReason9Choice
 * RepairReason9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RepairReason5 RepairReason5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingReason2Choice
 * InstructionProcessingReason2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AwaitingAffirmationReason1Choice
 * AwaitingAffirmationReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AwaitingAffirmationReason1
 * AwaitingAffirmationReason1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingProcessing1Choice
 * PendingProcessing1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectionReason9Choice
 * RejectionReason9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason9
 * RejectionReason9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingReason1Choice
 * InstructionProcessingReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice
 * ProcessingStatus17Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.UnmatchedReason7Choice
 * UnmatchedReason7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason5
 * UnmatchedReason5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingReason1Choice
 * MatchingReason1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AwaitingCancellationReason1Choice
 * AwaitingCancellationReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AwaitingCancellationReason1
 * AwaitingCancellationReason1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancellationReason11Choice
 * CancellationReason11Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferCancellationPendingStatus1
 * TransferCancellationPendingStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingStatus20Choice
 * PendingStatus20Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ProprietaryReason1Choice
 * ProprietaryReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ReceivedReason2Choice
 * ReceivedReason2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivedStatusReason1
 * ReceivedStatusReason1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ReceivedReason1Choice
 * ReceivedReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingProcessingStatusReason1
 * PendingProcessingStatusReason1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason9Choice
 * PendingProcessingReason9Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason8Choice
 * PendingProcessingReason8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedReason8Choice
 * RejectedReason8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedReason7Choice
 * RejectedReason7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptedStatusReason7
 * AcceptedStatusReason7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AcceptedReason8Choice
 * AcceptedReason8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatusReason12
 * RejectedStatusReason12}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AcceptedReason7Choice
 * AcceptedReason7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingReason4Choice
 * MatchingReason4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AllegementReason1Choice
 * AllegementReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AllegementMatchingReason1
 * AllegementMatchingReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason23
 * RejectionReason23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportItemStatus1
 * ReportItemStatus1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReportItemRejectionReason1Choice
 * ReportItemRejectionReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ProcessingStatus55Choice
 * ProcessingStatus55Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus5Choice
 * IntraPositionProcessingStatus5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GeneratedReason5
 * GeneratedReason5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ProcessingStatus50Choice
 * ProcessingStatus50Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice
 * ProcessingStatus48Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ProcessingStatus54Choice
 * ProcessingStatus54Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ProcessingStatus51Choice
 * ProcessingStatus51Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason26
 * RejectionReason26}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectionReason24Choice
 * RejectionReason24Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingReason17
 * PendingReason17}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingReason30Choice
 * PendingReason30Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancellationReason10
 * CancellationReason10}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancellationReason21Choice
 * CancellationReason21Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DeniedReason16Choice
 * DeniedReason16Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RepairReason8 RepairReason8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepairReason10Choice
 * RepairReason10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingReason16
 * PendingReason16}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingReason28Choice
 * PendingReason28Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason12Choice
 * PendingProcessingReason12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectionStatus17Choice
 * RejectionStatus17Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason25
 * RejectionReason25}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepairStatus12Choice
 * RepairStatus12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectionReason22Choice
 * RejectionReason22Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectionReason23Choice
 * RejectionReason23Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancellationStatus16Choice
 * CancellationStatus16Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancellationReason12
 * CancellationReason12}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancellationReason23Choice
 * CancellationReason23Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.FailingReason8Choice
 * FailingReason8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ProcessingStatus52Choice
 * ProcessingStatus52Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DeniedReason15Choice
 * DeniedReason15Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus21Choice
 * AcknowledgedAcceptedStatus21Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcknowledgementReason9
 * AcknowledgementReason9}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingStatus37Choice
 * PendingStatus37Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingReason15
 * PendingReason15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcknowledgementReason10
 * AcknowledgementReason10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason13Choice
 * AcknowledgementReason13Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DeniedStatus17Choice
 * DeniedStatus17Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason12 DeniedReason12}</li>
 * <li>{@linkplain com.tools20022.repository.choice.UnmatchedReason24Choice
 * UnmatchedReason24Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectionReason26Choice
 * RejectionReason26Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DeniedStatus16Choice
 * DeniedStatus16Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason11 DeniedReason11}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancellationReason19Choice
 * CancellationReason19Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason12Choice
 * AcknowledgementReason12Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus23Choice
 * AcknowledgedAcceptedStatus23Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcknowledgementReason11
 * AcknowledgementReason11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason29
 * RejectionReason29}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ConsentOrRejectionReason4Choice
 * ConsentOrRejectionReason4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus31Choice
 * RejectionOrRepairStatus31Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingStatus38Choice
 * PendingStatus38Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DeniedStatus15Choice
 * DeniedStatus15Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingProcessingReason10
 * PendingProcessingReason10}</li>
 * <li>{@linkplain com.tools20022.repository.choice.FailingReason9Choice
 * FailingReason9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ModificationStatus4Choice
 * ModificationStatus4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectionStatus18Choice
 * RejectionStatus18Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepairStatus13Choice
 * RepairStatus13Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus13Choice
 * PendingProcessingStatus13Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason25
 * RejectionOrRepairReason25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingReason14
 * PendingReason14}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingReason26Choice
 * PendingReason26Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FailingReason7 FailingReason7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.FailingReason7Choice
 * FailingReason7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.UnmatchedStatus17Choice
 * UnmatchedStatus17Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason15Choice
 * AcknowledgementReason15Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ProcessingStatus49Choice
 * ProcessingStatus49Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus11Choice
 * PendingProcessingStatus11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancellationStatus14Choice
 * CancellationStatus14Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RepairReason10 RepairReason10}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepairReason12Choice
 * RepairReason12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingStatus40Choice
 * PendingStatus40Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.FailingStatus10Choice
 * FailingStatus10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.UnmatchedStatus16Choice
 * UnmatchedStatus16Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectionStatus21Choice
 * RejectionStatus21Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason30
 * RejectionReason30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason16
 * UnmatchedReason16}</li>
 * <li>{@linkplain com.tools20022.repository.choice.UnmatchedReason22Choice
 * UnmatchedReason22Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingProcessingReason8
 * PendingProcessingReason8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancellationReason9
 * CancellationReason9}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectionStatus20Choice
 * RejectionStatus20Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DeniedReason17Choice
 * DeniedReason17Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.GeneratedReasons5Choice
 * GeneratedReasons5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason17
 * UnmatchedReason17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason14Choice
 * AcknowledgementReason14Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingReason29Choice
 * PendingReason29Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice
 * InstructionProcessingStatus22Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus29Choice
 * RejectionOrRepairStatus29Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason23
 * RejectionOrRepairReason23}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason10Choice
 * PendingProcessingReason10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingStatus39Choice
 * PendingStatus39Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus12Choice
 * PendingProcessingStatus12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingProcessingReason9
 * PendingProcessingReason9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason23Choice
 * RejectionAndRepairReason23Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcknowledgementReason12
 * AcknowledgementReason12}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepairReason11Choice
 * RepairReason11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason15
 * UnmatchedReason15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RepairReason9 RepairReason9}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ConsentStatus4Choice
 * ConsentStatus4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConsentReason4 ConsentReason4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason25Choice
 * RejectionAndRepairReason25Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.UnmatchedReason23Choice
 * UnmatchedReason23Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ProcessingStatus53Choice
 * ProcessingStatus53Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.GeneratedStatus7Choice
 * GeneratedStatus7Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason11Choice
 * PendingProcessingReason11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingReason27Choice
 * PendingReason27Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus22Choice
 * AcknowledgedAcceptedStatus22Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason24Choice
 * RejectionAndRepairReason24Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus32Choice
 * RejectionOrRepairStatus32Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus24Choice
 * AcknowledgedAcceptedStatus24Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.UnmatchedStatus18Choice
 * UnmatchedStatus18Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectionReason27Choice
 * RejectionReason27Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason26
 * RejectionOrRepairReason26}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason26Choice
 * RejectionAndRepairReason26Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason28
 * RejectionReason28}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepairStatus14Choice
 * RepairStatus14Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DeniedReason14Choice
 * DeniedReason14Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FailingReason8 FailingReason8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ModificationReason4
 * ModificationReason4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingStatus36Choice
 * PendingStatus36Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Reason16Choice
 * Reason16Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ModificationReason4Choice
 * ModificationReason4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus30Choice
 * RejectionOrRepairStatus30Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancellationStatus15Choice
 * CancellationStatus15Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingReason18
 * PendingReason18}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancellationReason20Choice
 * CancellationReason20Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingCancellationReasons4Choice
 * PendingCancellationReasons4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.UnmatchedReason21Choice
 * UnmatchedReason21Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.FailingStatus9Choice
 * FailingStatus9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingReason31Choice
 * PendingReason31Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectionStatus19Choice
 * RejectionStatus19Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason10 DeniedReason10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason24
 * RejectionOrRepairReason24}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancelledStatus13Choice
 * CancelledStatus13Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ReversedStatus2Choice
 * ReversedStatus2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatus3Choice
 * PendingSettlementStatus3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancellationReason13
 * CancellationReason13}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancellationReason31Choice
 * CancellationReason31Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancelledStatusReason16
 * CancelledStatusReason16}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancellationReason32Choice
 * CancellationReason32Choice}</li>
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
 * "SecuritiesTradeStatusReason"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the underlying reason for a status of a securities trade."</li>
 * </ul>
 */
public class SecuritiesTradeStatusReason extends StatusReason {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected UnmatchedReasonCode unmatchedReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason7Choice#mmCode
	 * UnmatchedReason7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason7Choice#mmProprietary
	 * UnmatchedReason7Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason5#mmCode
	 * UnmatchedReason5.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason5#mmAdditionalReasonInformation
	 * UnmatchedReason5.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingReason1Choice#mmReason
	 * MatchingReason1Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingReason4Choice#mmReason
	 * MatchingReason4Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason24Choice#mmCode
	 * UnmatchedReason24Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason24Choice#mmProprietary
	 * UnmatchedReason24Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason16#mmCode
	 * UnmatchedReason16.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason22Choice#mmCode
	 * UnmatchedReason22Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason22Choice#mmProprietary
	 * UnmatchedReason22Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason17#mmCode
	 * UnmatchedReason17.mmCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason15#mmCode
	 * UnmatchedReason15.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason23Choice#mmCode
	 * UnmatchedReason23Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason23Choice#mmProprietary
	 * UnmatchedReason23Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmUnmatchedReason
	 * Reason16Choice.mmUnmatchedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason21Choice#mmCode
	 * UnmatchedReason21Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason21Choice#mmProprietary
	 * UnmatchedReason21Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnmatchedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the unmatched status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatusReason, UnmatchedReasonCode> mmUnmatchedReason = new MMBusinessAttribute<SecuritiesTradeStatusReason, UnmatchedReasonCode>() {
		{
			derivation_lazy = () -> Arrays.asList(UnmatchedReason7Choice.mmCode, UnmatchedReason7Choice.mmProprietary, UnmatchedReason5.mmCode, UnmatchedReason5.mmAdditionalReasonInformation, MatchingReason1Choice.mmReason,
					MatchingReason4Choice.mmReason, UnmatchedReason24Choice.mmCode, UnmatchedReason24Choice.mmProprietary, UnmatchedReason16.mmCode, UnmatchedReason22Choice.mmCode, UnmatchedReason22Choice.mmProprietary,
					UnmatchedReason17.mmCode, UnmatchedReason15.mmCode, UnmatchedReason23Choice.mmCode, UnmatchedReason23Choice.mmProprietary, Reason16Choice.mmUnmatchedReason, UnmatchedReason21Choice.mmCode,
					UnmatchedReason21Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnmatchedReason";
			definition = "Reason for the unmatched status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnmatchedReasonCode.mmObject();
		}

		@Override
		public UnmatchedReasonCode getValue(SecuritiesTradeStatusReason obj) {
			return obj.getUnmatchedReason();
		}

		@Override
		public void setValue(SecuritiesTradeStatusReason obj, UnmatchedReasonCode value) {
			obj.setUnmatchedReason(value);
		}
	};
	protected DeniedReasonCode deniedReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReasonCode
	 * DeniedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus50Choice#mmDenied
	 * ProcessingStatus50Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice#mmDenied
	 * ModificationProcessingStatus7Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus54Choice#mmDenied
	 * ProcessingStatus54Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus7Choice#mmDenied
	 * RepoCallRequestStatus7Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason16Choice#mmCode
	 * DeniedReason16Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason16Choice#mmProprietary
	 * DeniedReason16Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason15Choice#mmCode
	 * DeniedReason15Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason15Choice#mmProprietary
	 * DeniedReason15Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus17Choice#mmReason
	 * DeniedStatus17Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason12#mmCode
	 * DeniedReason12.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus16Choice#mmReason
	 * DeniedStatus16Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason11#mmCode
	 * DeniedReason11.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus15Choice#mmReason
	 * DeniedStatus15Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason17Choice#mmCode
	 * DeniedReason17Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason17Choice#mmProprietary
	 * DeniedReason17Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus53Choice#mmDenied
	 * ProcessingStatus53Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason14Choice#mmCode
	 * DeniedReason14Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason14Choice#mmProprietary
	 * DeniedReason14Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmDeniedReason
	 * Reason16Choice.mmDeniedReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason10#mmCode
	 * DeniedReason10.mmCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeniedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason why the request was denied."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatusReason, DeniedReasonCode> mmDeniedReason = new MMBusinessAttribute<SecuritiesTradeStatusReason, DeniedReasonCode>() {
		{
			derivation_lazy = () -> Arrays.asList(ProcessingStatus50Choice.mmDenied, ModificationProcessingStatus7Choice.mmDenied, ProcessingStatus54Choice.mmDenied, RepoCallRequestStatus7Choice.mmDenied, DeniedReason16Choice.mmCode,
					DeniedReason16Choice.mmProprietary, DeniedReason15Choice.mmCode, DeniedReason15Choice.mmProprietary, DeniedStatus17Choice.mmReason, DeniedReason12.mmCode, DeniedStatus16Choice.mmReason, DeniedReason11.mmCode,
					DeniedStatus15Choice.mmReason, DeniedReason17Choice.mmCode, DeniedReason17Choice.mmProprietary, ProcessingStatus53Choice.mmDenied, DeniedReason14Choice.mmCode, DeniedReason14Choice.mmProprietary,
					Reason16Choice.mmDeniedReason, DeniedReason10.mmCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeniedReason";
			definition = "Specifies the reason why the request was denied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DeniedReasonCode.mmObject();
		}

		@Override
		public DeniedReasonCode getValue(SecuritiesTradeStatusReason obj) {
			return obj.getDeniedReason();
		}

		@Override
		public void setValue(SecuritiesTradeStatusReason obj, DeniedReasonCode value) {
			obj.setDeniedReason(value);
		}
	};
	protected SecuritiesTradeStatus securitiesTradeStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmReason
	 * SecuritiesTradeStatus.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTradeStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status for which a reason is provided. It is derived from the association between StatusReason and Status."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesTradeStatusReason, Optional<SecuritiesTradeStatus>> mmSecuritiesTradeStatus = new MMBusinessAssociationEnd<SecuritiesTradeStatusReason, Optional<SecuritiesTradeStatus>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeStatus";
			definition = "Status for which a reason is provided. It is derived from the association between StatusReason and Status.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmReason;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
		}

		@Override
		public Optional<SecuritiesTradeStatus> getValue(SecuritiesTradeStatusReason obj) {
			return obj.getSecuritiesTradeStatus();
		}

		@Override
		public void setValue(SecuritiesTradeStatusReason obj, Optional<SecuritiesTradeStatus> value) {
			obj.setSecuritiesTradeStatus(value.orElse(null));
		}
	};
	protected GeneratedReasonCode generatedReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.GeneratedReasonCode
	 * GeneratedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.GeneratedReason5#mmCode
	 * GeneratedReason5.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedReasons5Choice#mmCode
	 * GeneratedReasons5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedReasons5Choice#mmProprietary
	 * GeneratedReasons5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#mmGenerated
	 * InstructionProcessingStatus22Choice.mmGenerated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmGeneratedReason
	 * Reason16Choice.mmGeneratedReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GeneratedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason why the transaction was generated."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatusReason, GeneratedReasonCode> mmGeneratedReason = new MMBusinessAttribute<SecuritiesTradeStatusReason, GeneratedReasonCode>() {
		{
			derivation_lazy = () -> Arrays.asList(GeneratedReason5.mmCode, GeneratedReasons5Choice.mmCode, GeneratedReasons5Choice.mmProprietary, InstructionProcessingStatus22Choice.mmGenerated, Reason16Choice.mmGeneratedReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GeneratedReason";
			definition = "Specifies the reason why the transaction was generated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> GeneratedReasonCode.mmObject();
		}

		@Override
		public GeneratedReasonCode getValue(SecuritiesTradeStatusReason obj) {
			return obj.getGeneratedReason();
		}

		@Override
		public void setValue(SecuritiesTradeStatusReason obj, GeneratedReasonCode value) {
			obj.setGeneratedReason(value);
		}
	};
	protected AllegementReasonCode allegementReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AllegementReasonCode
	 * AllegementReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllegementReason1Choice#mmCode
	 * AllegementReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllegementReason1Choice#mmProprietary
	 * AllegementReason1Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllegementReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason why the instruction has an allegement status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatusReason, AllegementReasonCode> mmAllegementReason = new MMBusinessAttribute<SecuritiesTradeStatusReason, AllegementReasonCode>() {
		{
			derivation_lazy = () -> Arrays.asList(AllegementReason1Choice.mmCode, AllegementReason1Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AllegementReason";
			definition = "Reason why the instruction has an allegement status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AllegementReasonCode.mmObject();
		}

		@Override
		public AllegementReasonCode getValue(SecuritiesTradeStatusReason obj) {
			return obj.getAllegementReason();
		}

		@Override
		public void setValue(SecuritiesTradeStatusReason obj, AllegementReasonCode value) {
			obj.setAllegementReason(value);
		}
	};
	protected PendingSettlementStatusReasonCode pendingSettlementReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmPendingSettlement
	 * TransferStatus2Choice.mmPendingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatus3Choice#mmReason
	 * PendingSettlementStatus3Choice.mmReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingSettlementReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the settlement pending status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatusReason, PendingSettlementStatusReasonCode> mmPendingSettlementReason = new MMBusinessAttribute<SecuritiesTradeStatusReason, PendingSettlementStatusReasonCode>() {
		{
			derivation_lazy = () -> Arrays.asList(TransferStatus2Choice.mmPendingSettlement, PendingSettlementStatus3Choice.mmReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PendingSettlementReason";
			definition = "Reason for the settlement pending status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
		}

		@Override
		public PendingSettlementStatusReasonCode getValue(SecuritiesTradeStatusReason obj) {
			return obj.getPendingSettlementReason();
		}

		@Override
		public void setValue(SecuritiesTradeStatusReason obj, PendingSettlementStatusReasonCode value) {
			obj.setPendingSettlementReason(value);
		}
	};
	protected RepoCallAcknowledgementReasonCode repoCallAcknowledgementReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RepoCallAcknowledgementReasonCode
	 * RepoCallAcknowledgementReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus7Choice#mmAcknowledgedAccepted
	 * RepoCallRequestStatus7Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason10#mmCode
	 * AcknowledgementReason10.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason13Choice#mmCode
	 * AcknowledgementReason13Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason13Choice#mmProprietary
	 * AcknowledgementReason13Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmRepoCallAcknowledgementReason
	 * Reason16Choice.mmRepoCallAcknowledgementReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepoCallAcknowledgementReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies additional information about the processed instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatusReason, RepoCallAcknowledgementReasonCode> mmRepoCallAcknowledgementReason = new MMBusinessAttribute<SecuritiesTradeStatusReason, RepoCallAcknowledgementReasonCode>() {
		{
			derivation_lazy = () -> Arrays.asList(RepoCallRequestStatus7Choice.mmAcknowledgedAccepted, AcknowledgementReason10.mmCode, AcknowledgementReason13Choice.mmCode, AcknowledgementReason13Choice.mmProprietary,
					Reason16Choice.mmRepoCallAcknowledgementReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RepoCallAcknowledgementReason";
			definition = "Specifies additional information about the processed instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RepoCallAcknowledgementReasonCode.mmObject();
		}

		@Override
		public RepoCallAcknowledgementReasonCode getValue(SecuritiesTradeStatusReason obj) {
			return obj.getRepoCallAcknowledgementReason();
		}

		@Override
		public void setValue(SecuritiesTradeStatusReason obj, RepoCallAcknowledgementReasonCode value) {
			obj.setRepoCallAcknowledgementReason(value);
		}
	};
	protected RepairReasonV2Code repairReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason9Choice#mmCode
	 * RepairReason9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason9Choice#mmProprietary
	 * RepairReason9Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RepairReason5#mmCode
	 * RepairReason5.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingReason2Choice#mmReason
	 * InstructionProcessingReason2Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmInRepair
	 * ProcessingStatus17Choice.mmInRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#mmRepair
	 * ProcessingStatus48Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice#mmRepaired
	 * ModificationProcessingStatus7Choice.mmRepaired}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus54Choice#mmRepair
	 * ProcessingStatus54Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus51Choice#mmRepair
	 * ProcessingStatus51Choice.mmRepair}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RepairReason8#mmCode
	 * RepairReason8.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason10Choice#mmCode
	 * RepairReason10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason10Choice#mmProprietary
	 * RepairReason10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus12Choice#mmReason
	 * RepairStatus12Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus52Choice#mmRepair
	 * ProcessingStatus52Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus13Choice#mmReason
	 * RepairStatus13Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus49Choice#mmRepair
	 * ProcessingStatus49Choice.mmRepair}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RepairReason10#mmCode
	 * RepairReason10.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason12Choice#mmCode
	 * RepairReason12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason12Choice#mmProprietary
	 * RepairReason12Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#mmRepair
	 * InstructionProcessingStatus22Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason11Choice#mmCode
	 * RepairReason11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason11Choice#mmProprietary
	 * RepairReason11Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RepairReason9#mmCode
	 * RepairReason9.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus53Choice#mmRepair
	 * ProcessingStatus53Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus14Choice#mmReason
	 * RepairStatus14Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmRepairReason
	 * Reason16Choice.mmRepairReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepairReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction/request has a repair status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatusReason, RepairReasonV2Code> mmRepairReason = new MMBusinessAttribute<SecuritiesTradeStatusReason, RepairReasonV2Code>() {
		{
			derivation_lazy = () -> Arrays.asList(RepairReason9Choice.mmCode, RepairReason9Choice.mmProprietary, RepairReason5.mmCode, InstructionProcessingReason2Choice.mmReason, ProcessingStatus17Choice.mmInRepair,
					ProcessingStatus48Choice.mmRepair, ModificationProcessingStatus7Choice.mmRepaired, ProcessingStatus54Choice.mmRepair, ProcessingStatus51Choice.mmRepair, RepairReason8.mmCode, RepairReason10Choice.mmCode,
					RepairReason10Choice.mmProprietary, RepairStatus12Choice.mmReason, ProcessingStatus52Choice.mmRepair, RepairStatus13Choice.mmReason, ProcessingStatus49Choice.mmRepair, RepairReason10.mmCode, RepairReason12Choice.mmCode,
					RepairReason12Choice.mmProprietary, InstructionProcessingStatus22Choice.mmRepair, RepairReason11Choice.mmCode, RepairReason11Choice.mmProprietary, RepairReason9.mmCode, ProcessingStatus53Choice.mmRepair,
					RepairStatus14Choice.mmReason, Reason16Choice.mmRepairReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RepairReason";
			definition = "Specifies the reason why the instruction/request has a repair status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RepairReasonV2Code.mmObject();
		}

		@Override
		public RepairReasonV2Code getValue(SecuritiesTradeStatusReason obj) {
			return obj.getRepairReason();
		}

		@Override
		public void setValue(SecuritiesTradeStatusReason obj, RepairReasonV2Code value) {
			obj.setRepairReason(value);
		}
	};
	protected DeliveryReturnCode deliveryReturnReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReturnCode
	 * DeliveryReturnCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryReturnReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason why the trade was returned."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatusReason, DeliveryReturnCode> mmDeliveryReturnReason = new MMBusinessAttribute<SecuritiesTradeStatusReason, DeliveryReturnCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveryReturnReason";
			definition = "Reason why the trade was returned.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DeliveryReturnCode.mmObject();
		}

		@Override
		public DeliveryReturnCode getValue(SecuritiesTradeStatusReason obj) {
			return obj.getDeliveryReturnReason();
		}

		@Override
		public void setValue(SecuritiesTradeStatusReason obj, DeliveryReturnCode value) {
			obj.setDeliveryReturnReason(value);
		}
	};
	protected CounterpartyResponseStatusReasonCode counterpartyStatusReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CounterpartyResponseStatusReasonCode
	 * CounterpartyResponseStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason29#mmCode
	 * RejectionReason29.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentOrRejectionReason4Choice#mmCode
	 * ConsentOrRejectionReason4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentOrRejectionReason4Choice#mmProprietary
	 * ConsentOrRejectionReason4Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the counterparty action which is the reason of the trade status."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatusReason, CounterpartyResponseStatusReasonCode> mmCounterpartyStatusReason = new MMBusinessAttribute<SecuritiesTradeStatusReason, CounterpartyResponseStatusReasonCode>() {
		{
			derivation_lazy = () -> Arrays.asList(RejectionReason29.mmCode, ConsentOrRejectionReason4Choice.mmCode, ConsentOrRejectionReason4Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CounterpartyStatusReason";
			definition = "Specifies the counterparty action which is the reason of the trade status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CounterpartyResponseStatusReasonCode.mmObject();
		}

		@Override
		public CounterpartyResponseStatusReasonCode getValue(SecuritiesTradeStatusReason obj) {
			return obj.getCounterpartyStatusReason();
		}

		@Override
		public void setValue(SecuritiesTradeStatusReason obj, CounterpartyResponseStatusReasonCode value) {
			obj.setCounterpartyStatusReason(value);
		}
	};
	protected ModifiedStatusReasonCode modifiedStatusReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ModifiedStatusReasonCode
	 * ModifiedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice#mmModified
	 * ModificationProcessingStatus7Choice.mmModified}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ModificationReason4#mmCode
	 * ModificationReason4.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationReason4Choice#mmCode
	 * ModificationReason4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationReason4Choice#mmProprietary
	 * ModificationReason4Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the related instruction is modified."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatusReason, ModifiedStatusReasonCode> mmModifiedStatusReason = new MMBusinessAttribute<SecuritiesTradeStatusReason, ModifiedStatusReasonCode>() {
		{
			derivation_lazy = () -> Arrays.asList(ModificationProcessingStatus7Choice.mmModified, ModificationReason4.mmCode, ModificationReason4Choice.mmCode, ModificationReason4Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ModifiedStatusReason";
			definition = "Specifies the reason why the related instruction is modified.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ModifiedStatusReasonCode.mmObject();
		}

		@Override
		public ModifiedStatusReasonCode getValue(SecuritiesTradeStatusReason obj) {
			return obj.getModifiedStatusReason();
		}

		@Override
		public void setValue(SecuritiesTradeStatusReason obj, ModifiedStatusReasonCode value) {
			obj.setModifiedStatusReason(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTradeStatusReason";
				definition = "Specifies the underlying reason for a status of a securities trade.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTradeStatus.mmReason);
				derivationElement_lazy = () -> Arrays.asList(AffirmationReason1.mmCode, PendingProcessing1Choice.mmReason, ProcessingStatus17Choice.mmAlreadyMatchedAndAffirmed, ProcessingStatus17Choice.mmDefaultAction,
						ProcessingStatus17Choice.mmDone, ProcessingStatus17Choice.mmForcedRejection, ProcessingStatus17Choice.mmFullyExecutedConfirmationSent, ProcessingStatus17Choice.mmFuture, ProcessingStatus17Choice.mmGenerated,
						ProcessingStatus17Choice.mmNoInstruction, ProcessingStatus17Choice.mmOpenOrder, ProcessingStatus17Choice.mmReceivedAtIntermediary, ProcessingStatus17Choice.mmSettlementInstructionSent,
						ProcessingStatus17Choice.mmStandingInstruction, ProcessingStatus17Choice.mmTradingSuspendedByStockExchange, ProcessingStatus17Choice.mmTreated, ProcessingStatus17Choice.mmProprietaryStatus,
						CancellationReason11Choice.mmReason, PendingStatus20Choice.mmForwarded, PendingStatus20Choice.mmUnderInvestigation, AllegementMatchingReason1.mmCode, ReportItemStatus1.mmException,
						ProcessingStatus55Choice.mmProprietary, IntraPositionProcessingStatus5Choice.mmRejected, IntraPositionProcessingStatus5Choice.mmRepair, ProcessingStatus50Choice.mmCompleted, ProcessingStatus50Choice.mmProprietary,
						ProcessingStatus48Choice.mmCancellationRequested, ProcessingStatus48Choice.mmModificationRequested, ProcessingStatus54Choice.mmProprietary, ProcessingStatus51Choice.mmProprietary,
						ProcessingStatus51Choice.mmCancellationRequested, ProcessingStatus51Choice.mmModificationRequested, ProcessingStatus52Choice.mmProprietary, ProcessingStatus52Choice.mmCancellationRequested,
						RejectionOrRepairStatus31Choice.mmReason, ModificationStatus4Choice.mmReason, RejectionOrRepairReason25.mmCode, UnmatchedStatus17Choice.mmReason, ProcessingStatus49Choice.mmProprietary,
						ProcessingStatus49Choice.mmCancellationRequested, ProcessingStatus49Choice.mmModificationRequested, UnmatchedStatus16Choice.mmReason, InstructionProcessingStatus22Choice.mmModificationRequested,
						RejectionOrRepairStatus29Choice.mmReason, RejectionOrRepairReason23.mmCode, ProcessingStatus53Choice.mmProprietary, GeneratedStatus7Choice.mmReason, RejectionOrRepairStatus32Choice.mmReason,
						UnmatchedStatus18Choice.mmReason, RejectionOrRepairReason26.mmCode, RejectionOrRepairStatus30Choice.mmReason, RejectionOrRepairReason24.mmCode, TransferInstructionStatus4.mmReason);
				superType_lazy = () -> StatusReason.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmUnmatchedReason, com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmDeniedReason,
						com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmSecuritiesTradeStatus, com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmGeneratedReason,
						com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmAllegementReason, com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmPendingSettlementReason,
						com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmRepoCallAcknowledgementReason, com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmRepairReason,
						com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmDeliveryReturnReason, com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmCounterpartyStatusReason,
						com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmModifiedStatusReason);
				derivationComponent_lazy = () -> Arrays.asList(UnaffirmedReason2Choice.mmObject(), AffirmationReason1.mmObject(), AffirmationReason1Choice.mmObject(), RepairReason9Choice.mmObject(), RepairReason5.mmObject(),
						InstructionProcessingReason2Choice.mmObject(), AwaitingAffirmationReason1Choice.mmObject(), AwaitingAffirmationReason1.mmObject(), PendingProcessing1Choice.mmObject(), RejectionReason9Choice.mmObject(),
						RejectionReason9.mmObject(), InstructionProcessingReason1Choice.mmObject(), ProcessingStatus17Choice.mmObject(), UnmatchedReason7Choice.mmObject(), UnmatchedReason5.mmObject(), MatchingReason1Choice.mmObject(),
						AwaitingCancellationReason1Choice.mmObject(), AwaitingCancellationReason1.mmObject(), CancellationReason11Choice.mmObject(), TransferCancellationPendingStatus1.mmObject(), PendingStatus20Choice.mmObject(),
						ProprietaryReason1Choice.mmObject(), ReceivedReason2Choice.mmObject(), ReceivedStatusReason1.mmObject(), ReceivedReason1Choice.mmObject(), PendingProcessingStatusReason1.mmObject(),
						PendingProcessingReason9Choice.mmObject(), PendingProcessingReason8Choice.mmObject(), RejectedReason8Choice.mmObject(), RejectedReason7Choice.mmObject(), AcceptedStatusReason7.mmObject(),
						AcceptedReason8Choice.mmObject(), RejectedStatusReason12.mmObject(), AcceptedReason7Choice.mmObject(), MatchingReason4Choice.mmObject(), AllegementReason1Choice.mmObject(), AllegementMatchingReason1.mmObject(),
						RejectionReason23.mmObject(), ReportItemStatus1.mmObject(), ReportItemRejectionReason1Choice.mmObject(), ProcessingStatus55Choice.mmObject(), IntraPositionProcessingStatus5Choice.mmObject(),
						GeneratedReason5.mmObject(), ProcessingStatus50Choice.mmObject(), ProcessingStatus48Choice.mmObject(), ProcessingStatus54Choice.mmObject(), ProcessingStatus51Choice.mmObject(), RejectionReason26.mmObject(),
						RejectionReason24Choice.mmObject(), PendingReason17.mmObject(), PendingReason30Choice.mmObject(), CancellationReason10.mmObject(), CancellationReason21Choice.mmObject(), DeniedReason16Choice.mmObject(),
						RepairReason8.mmObject(), RepairReason10Choice.mmObject(), PendingReason16.mmObject(), PendingReason28Choice.mmObject(), PendingProcessingReason12Choice.mmObject(), RejectionStatus17Choice.mmObject(),
						RejectionReason25.mmObject(), RepairStatus12Choice.mmObject(), RejectionReason22Choice.mmObject(), RejectionReason23Choice.mmObject(), CancellationStatus16Choice.mmObject(), CancellationReason12.mmObject(),
						CancellationReason23Choice.mmObject(), FailingReason8Choice.mmObject(), ProcessingStatus52Choice.mmObject(), DeniedReason15Choice.mmObject(), AcknowledgedAcceptedStatus21Choice.mmObject(),
						AcknowledgementReason9.mmObject(), PendingStatus37Choice.mmObject(), PendingReason15.mmObject(), AcknowledgementReason10.mmObject(), AcknowledgementReason13Choice.mmObject(), DeniedStatus17Choice.mmObject(),
						DeniedReason12.mmObject(), UnmatchedReason24Choice.mmObject(), RejectionReason26Choice.mmObject(), DeniedStatus16Choice.mmObject(), DeniedReason11.mmObject(), CancellationReason19Choice.mmObject(),
						AcknowledgementReason12Choice.mmObject(), AcknowledgedAcceptedStatus23Choice.mmObject(), AcknowledgementReason11.mmObject(), RejectionReason29.mmObject(), ConsentOrRejectionReason4Choice.mmObject(),
						RejectionOrRepairStatus31Choice.mmObject(), PendingStatus38Choice.mmObject(), DeniedStatus15Choice.mmObject(), PendingProcessingReason10.mmObject(), FailingReason9Choice.mmObject(),
						ModificationStatus4Choice.mmObject(), RejectionStatus18Choice.mmObject(), RepairStatus13Choice.mmObject(), PendingProcessingStatus13Choice.mmObject(), RejectionOrRepairReason25.mmObject(),
						PendingReason14.mmObject(), PendingReason26Choice.mmObject(), FailingReason7.mmObject(), FailingReason7Choice.mmObject(), UnmatchedStatus17Choice.mmObject(), AcknowledgementReason15Choice.mmObject(),
						ProcessingStatus49Choice.mmObject(), PendingProcessingStatus11Choice.mmObject(), CancellationStatus14Choice.mmObject(), RepairReason10.mmObject(), RepairReason12Choice.mmObject(), PendingStatus40Choice.mmObject(),
						FailingStatus10Choice.mmObject(), UnmatchedStatus16Choice.mmObject(), RejectionStatus21Choice.mmObject(), RejectionReason30.mmObject(), UnmatchedReason16.mmObject(), UnmatchedReason22Choice.mmObject(),
						PendingProcessingReason8.mmObject(), CancellationReason9.mmObject(), RejectionStatus20Choice.mmObject(), DeniedReason17Choice.mmObject(), GeneratedReasons5Choice.mmObject(), UnmatchedReason17.mmObject(),
						AcknowledgementReason14Choice.mmObject(), PendingReason29Choice.mmObject(), InstructionProcessingStatus22Choice.mmObject(), RejectionOrRepairStatus29Choice.mmObject(), RejectionOrRepairReason23.mmObject(),
						PendingProcessingReason10Choice.mmObject(), PendingStatus39Choice.mmObject(), PendingProcessingStatus12Choice.mmObject(), PendingProcessingReason9.mmObject(), RejectionAndRepairReason23Choice.mmObject(),
						AcknowledgementReason12.mmObject(), RepairReason11Choice.mmObject(), UnmatchedReason15.mmObject(), RepairReason9.mmObject(), ConsentStatus4Choice.mmObject(), ConsentReason4.mmObject(),
						RejectionAndRepairReason25Choice.mmObject(), UnmatchedReason23Choice.mmObject(), ProcessingStatus53Choice.mmObject(), GeneratedStatus7Choice.mmObject(), PendingProcessingReason11Choice.mmObject(),
						PendingReason27Choice.mmObject(), AcknowledgedAcceptedStatus22Choice.mmObject(), RejectionAndRepairReason24Choice.mmObject(), RejectionOrRepairStatus32Choice.mmObject(),
						AcknowledgedAcceptedStatus24Choice.mmObject(), UnmatchedStatus18Choice.mmObject(), RejectionReason27Choice.mmObject(), RejectionOrRepairReason26.mmObject(), RejectionAndRepairReason26Choice.mmObject(),
						RejectionReason28.mmObject(), RepairStatus14Choice.mmObject(), DeniedReason14Choice.mmObject(), FailingReason8.mmObject(), ModificationReason4.mmObject(), PendingStatus36Choice.mmObject(), Reason16Choice.mmObject(),
						ModificationReason4Choice.mmObject(), RejectionOrRepairStatus30Choice.mmObject(), CancellationStatus15Choice.mmObject(), PendingReason18.mmObject(), CancellationReason20Choice.mmObject(),
						PendingCancellationReasons4Choice.mmObject(), UnmatchedReason21Choice.mmObject(), FailingStatus9Choice.mmObject(), PendingReason31Choice.mmObject(), RejectionStatus19Choice.mmObject(), DeniedReason10.mmObject(),
						RejectionOrRepairReason24.mmObject(), CancelledStatus13Choice.mmObject(), ReversedStatus2Choice.mmObject(), PendingSettlementStatus3Choice.mmObject(), CancellationReason13.mmObject(),
						CancellationReason31Choice.mmObject(), CancelledStatusReason16.mmObject(), CancellationReason32Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesTradeStatusReason.class;
			}
		});
		return mmObject_lazy.get();
	}

	public UnmatchedReasonCode getUnmatchedReason() {
		return unmatchedReason;
	}

	public SecuritiesTradeStatusReason setUnmatchedReason(UnmatchedReasonCode unmatchedReason) {
		this.unmatchedReason = Objects.requireNonNull(unmatchedReason);
		return this;
	}

	public DeniedReasonCode getDeniedReason() {
		return deniedReason;
	}

	public SecuritiesTradeStatusReason setDeniedReason(DeniedReasonCode deniedReason) {
		this.deniedReason = Objects.requireNonNull(deniedReason);
		return this;
	}

	public Optional<SecuritiesTradeStatus> getSecuritiesTradeStatus() {
		return securitiesTradeStatus == null ? Optional.empty() : Optional.of(securitiesTradeStatus);
	}

	public SecuritiesTradeStatusReason setSecuritiesTradeStatus(com.tools20022.repository.entity.SecuritiesTradeStatus securitiesTradeStatus) {
		this.securitiesTradeStatus = securitiesTradeStatus;
		return this;
	}

	public GeneratedReasonCode getGeneratedReason() {
		return generatedReason;
	}

	public SecuritiesTradeStatusReason setGeneratedReason(GeneratedReasonCode generatedReason) {
		this.generatedReason = Objects.requireNonNull(generatedReason);
		return this;
	}

	public AllegementReasonCode getAllegementReason() {
		return allegementReason;
	}

	public SecuritiesTradeStatusReason setAllegementReason(AllegementReasonCode allegementReason) {
		this.allegementReason = Objects.requireNonNull(allegementReason);
		return this;
	}

	public PendingSettlementStatusReasonCode getPendingSettlementReason() {
		return pendingSettlementReason;
	}

	public SecuritiesTradeStatusReason setPendingSettlementReason(PendingSettlementStatusReasonCode pendingSettlementReason) {
		this.pendingSettlementReason = Objects.requireNonNull(pendingSettlementReason);
		return this;
	}

	public RepoCallAcknowledgementReasonCode getRepoCallAcknowledgementReason() {
		return repoCallAcknowledgementReason;
	}

	public SecuritiesTradeStatusReason setRepoCallAcknowledgementReason(RepoCallAcknowledgementReasonCode repoCallAcknowledgementReason) {
		this.repoCallAcknowledgementReason = Objects.requireNonNull(repoCallAcknowledgementReason);
		return this;
	}

	public RepairReasonV2Code getRepairReason() {
		return repairReason;
	}

	public SecuritiesTradeStatusReason setRepairReason(RepairReasonV2Code repairReason) {
		this.repairReason = Objects.requireNonNull(repairReason);
		return this;
	}

	public DeliveryReturnCode getDeliveryReturnReason() {
		return deliveryReturnReason;
	}

	public SecuritiesTradeStatusReason setDeliveryReturnReason(DeliveryReturnCode deliveryReturnReason) {
		this.deliveryReturnReason = Objects.requireNonNull(deliveryReturnReason);
		return this;
	}

	public CounterpartyResponseStatusReasonCode getCounterpartyStatusReason() {
		return counterpartyStatusReason;
	}

	public SecuritiesTradeStatusReason setCounterpartyStatusReason(CounterpartyResponseStatusReasonCode counterpartyStatusReason) {
		this.counterpartyStatusReason = Objects.requireNonNull(counterpartyStatusReason);
		return this;
	}

	public ModifiedStatusReasonCode getModifiedStatusReason() {
		return modifiedStatusReason;
	}

	public SecuritiesTradeStatusReason setModifiedStatusReason(ModifiedStatusReasonCode modifiedStatusReason) {
		this.modifiedStatusReason = Objects.requireNonNull(modifiedStatusReason);
		return this;
	}
}