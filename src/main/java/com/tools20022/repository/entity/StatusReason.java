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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.RegisteredContract;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the underlying reason for the status of an object.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="StatusReason" src="doc-files/StatusReason.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.StatusReason#mmStatus
 * StatusReason.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StatusReason#mmReason
 * StatusReason.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#mmNoSpecifiedReason
 * StatusReason.mmNoSpecifiedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#mmDataSourceScheme
 * StatusReason.mmDataSourceScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectedStatusReason
 * StatusReason.mmRejectedStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#mmFailingReason
 * StatusReason.mmFailingReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#mmCancellationReason
 * StatusReason.mmCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
 * StatusReason.mmPendingReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectionReason
 * StatusReason.mmRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#mmAcknowledgedAcceptedReason
 * StatusReason.mmAcknowledgedAcceptedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRelatedClosureReason
 * StatusReason.mmRelatedClosureReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedStatusReason
 * GenericIdentification.mmRelatedStatusReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#mmStatusReason
 * Status.mmStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmClosureReason
 * RegisteredContract.mmClosureReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryReason1#mmReason
 * ProprietaryReason1.mmReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryReason4#mmReason
 * ProprietaryReason4.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferUnmatchedStatus3Choice#mmReason
 * TransferUnmatchedStatus3Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferUnmatchedStatus3Choice#mmExtendedReason
 * TransferUnmatchedStatus3Choice.mmExtendedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FailedSettlementStatus2Choice#mmDataSourceScheme
 * FailedSettlementStatus2Choice.mmDataSourceScheme}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status21Choice#mmRejected
 * Status21Choice.mmRejected}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status21Choice#mmComplete
 * Status21Choice.mmComplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancelledCompleteReason1#mmAdditionalReasonInformation
 * CancelledCompleteReason1.mmAdditionalReasonInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ClosedStatusReason1#mmCode
 * ClosedStatusReason1.mmCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProformaStatusReason1#mmCode
 * ProformaStatusReason1.mmCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DisabledStatusReason1#mmCode
 * DisabledStatusReason1.mmCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EnabledStatusReason1#mmCode
 * EnabledStatusReason1.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SuspendedStatusReason4#mmReason
 * SuspendedStatusReason4.mmReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InRepairStatusReason4#mmReason
 * InRepairStatusReason4.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason4#mmStatus
 * CancellationStatusAndReason4.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferReference12#mmReversalReason
 * TransferReference12.mmReversalReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
 * SecuritiesTradeStatusReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
 * CorporateActionStatusReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.UndertakingStatusReason
 * UndertakingStatusReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MeetingStatusReason
 * MeetingStatusReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryReason1
 * ProprietaryReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NoSpecifiedReason1
 * NoSpecifiedReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryReason4
 * ProprietaryReason4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferUnmatchedStatus3Choice
 * TransferUnmatchedStatus3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FailedSettlementStatus2Choice
 * FailedSettlementStatus2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CancellationPendingStatus7Choice
 * CancellationPendingStatus7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedReason17Choice
 * RejectedReason17Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancelledCompleteReason1
 * CancelledCompleteReason1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedReason16Choice
 * RejectedReason16Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedReason15Choice
 * RejectedReason15Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ClosedStatusReason1
 * ClosedStatusReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProformaStatusReason1
 * ProformaStatusReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DisabledStatusReason1
 * DisabledStatusReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EnabledStatusReason1
 * EnabledStatusReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SuspendedStatusReason4
 * SuspendedStatusReason4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BlockedReason2Choice
 * BlockedReason2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatusReason3
 * ConditionallyAcceptedStatusReason3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InRepairStatusReason4
 * InRepairStatusReason4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingStatusReason14
 * PendingStatusReason14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingOpeningStatusReason1
 * PendingOpeningStatusReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ClosurePendingStatusReason1
 * ClosurePendingStatusReason1}</li>
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
 * "StatusReason"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the underlying reason for the status of an object."</li>
 * </ul>
 */
public class StatusReason {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Status status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateralResponse1#mmResponseType
	 * SecuritiesCollateralResponse1.mmResponseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus5Choice#mmProprietary
	 * IntraPositionProcessingStatus5Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status for which a reason is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<StatusReason, Optional<Status>> mmStatus = new MMBusinessAssociationEnd<StatusReason, Optional<Status>>() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesCollateralResponse1.mmResponseType, IntraPositionProcessingStatus5Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status for which a reason is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Status.mmStatusReason;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Status.mmObject();
		}

		@Override
		public Optional<Status> getValue(StatusReason obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(StatusReason obj, Optional<Status> value) {
			obj.setStatus(value.orElse(null));
		}
	};
	protected Max35Text reason;
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
	 * {@linkplain com.tools20022.repository.msg.ProprietaryReason1#mmAdditionalReasonInformation
	 * ProprietaryReason1.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnaffirmedReason2Choice#mmCode
	 * UnaffirmedReason2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason10#mmAdditionalReasonInformation
	 * StatusAndReason10.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AffirmationReason1#mmAdditionalReasonInformation
	 * AffirmationReason1.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationReason1Choice#mmReason
	 * AffirmationReason1Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepairReason5#mmAdditionalReasonInformation
	 * RepairReason5.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AwaitingAffirmationReason1Choice#mmCode
	 * AwaitingAffirmationReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AwaitingAffirmationReason1Choice#mmProprietary
	 * AwaitingAffirmationReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AwaitingAffirmationReason1#mmCode
	 * AwaitingAffirmationReason1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AwaitingAffirmationReason1#mmAdditionalReasonInformation
	 * AwaitingAffirmationReason1.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason9#mmAdditionalReasonInformation
	 * RejectionReason9.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AwaitingCancellationReason1Choice#mmCode
	 * AwaitingCancellationReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AwaitingCancellationReason1Choice#mmProprietary
	 * AwaitingCancellationReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AwaitingCancellationReason1#mmCode
	 * AwaitingCancellationReason1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AwaitingCancellationReason1#mmAdditionalReasonInformation
	 * AwaitingCancellationReason1.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferCancellationStatus2#mmReason
	 * TransferCancellationStatus2.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferCancellationPendingStatus1#mmReason
	 * TransferCancellationPendingStatus1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingCancellationReason2#mmCancellationReason
	 * MeetingCancellationReason2.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalStatus1#mmAdditionalInformation
	 * AdditionalStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalStatus2#mmAdditionalInformation
	 * AdditionalStatus2.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmendmentRejectionStatus1#mmReason
	 * CorporateActionAmendmentRejectionStatus1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason20FormatChoice#mmCode
	 * RejectionReason20FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralCancellationReason1#mmAdditionalInformation
	 * CollateralCancellationReason1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionStatus2#mmAdditionalInformation
	 * RejectionStatus2.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitutionResponse2#mmRejectionReasonInformation
	 * CollateralSubstitutionResponse2.mmRejectionReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestResponse1#mmRejectionReasonInformation
	 * InterestResponse1.mmRejectionReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AllegementMatchingReason1#mmAdditionalReasonInformation
	 * AllegementMatchingReason1.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason23#mmAdditionalInformation
	 * RejectionReason23.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportItemStatus1#mmAdditionalReasonInformation
	 * ReportItemStatus1.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus6Choice#mmConsented
	 * ResponseStatus6Choice.mmConsented}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneratedReason5#mmAdditionalReasonInformation
	 * GeneratedReason5.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters11#mmReason
	 * AdditionalQueryParameters11.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason26#mmAdditionalReasonInformation
	 * RejectionReason26.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason17#mmAdditionalReasonInformation
	 * PendingReason17.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason10#mmAdditionalReasonInformation
	 * CancellationReason10.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepairReason8#mmAdditionalReasonInformation
	 * RepairReason8.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason16#mmAdditionalReasonInformation
	 * PendingReason16.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason25#mmAdditionalReasonInformation
	 * RejectionReason25.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus16Choice#mmReason
	 * CancellationStatus16Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason12#mmAdditionalReasonInformation
	 * CancellationReason12.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason9#mmAdditionalReasonInformation
	 * AcknowledgementReason9.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason15#mmAdditionalReasonInformation
	 * PendingReason15.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason10#mmAdditionalReasonInformation
	 * AcknowledgementReason10.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason12#mmAdditionalReasonInformation
	 * DeniedReason12.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason11#mmAdditionalReasonInformation
	 * DeniedReason11.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason11#mmAdditionalReasonInformation
	 * AcknowledgementReason11.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason29#mmAdditionalReasonInformation
	 * RejectionReason29.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryReason4#mmAdditionalReasonInformation
	 * ProprietaryReason4.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason10#mmAdditionalReasonInformation
	 * PendingProcessingReason10.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason25#mmAdditionalReasonInformation
	 * RejectionOrRepairReason25.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason14#mmAdditionalReasonInformation
	 * PendingReason14.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailingReason7#mmAdditionalReasonInformation
	 * FailingReason7.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepairReason10#mmAdditionalReasonInformation
	 * RepairReason10.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason30#mmAdditionalReasonInformation
	 * RejectionReason30.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason16#mmAdditionalReasonInformation
	 * UnmatchedReason16.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason8#mmAdditionalReasonInformation
	 * PendingProcessingReason8.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason9#mmAdditionalReasonInformation
	 * CancellationReason9.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason17#mmAdditionalReasonInformation
	 * UnmatchedReason17.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason23#mmAdditionalReasonInformation
	 * RejectionOrRepairReason23.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason9#mmAdditionalReasonInformation
	 * PendingProcessingReason9.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason12#mmAdditionalReasonInformation
	 * AcknowledgementReason12.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason15#mmAdditionalReasonInformation
	 * UnmatchedReason15.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepairReason9#mmAdditionalReasonInformation
	 * RepairReason9.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentStatus4Choice#mmReason
	 * ConsentStatus4Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ConsentReason4#mmCode
	 * ConsentReason4.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConsentReason4#mmAdditionalReasonInformation
	 * ConsentReason4.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason26#mmAdditionalReasonInformation
	 * RejectionOrRepairReason26.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason28#mmAdditionalReasonInformation
	 * RejectionReason28.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailingReason8#mmAdditionalReasonInformation
	 * FailingReason8.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ModificationReason4#mmAdditionalReasonInformation
	 * ModificationReason4.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus15Choice#mmReason
	 * CancellationStatus15Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason18#mmAdditionalReasonInformation
	 * PendingReason18.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason10#mmAdditionalReasonInformation
	 * DeniedReason10.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason24#mmAdditionalReasonInformation
	 * RejectionOrRepairReason24.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionReversalReason3#mmAdditionalReasonInformation
	 * CorporateActionReversalReason3.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason12#mmAdditionalReasonInformation
	 * CancelledStatusReason12.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason18#mmAdditionalReasonInformation
	 * RejectedStatusReason18.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason9#mmAdditionalReasonInformation
	 * AcceptedStatusReason9.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason9#mmAdditionalReasonInformation
	 * PendingStatusReason9.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason11#mmAdditionalReasonInformation
	 * CancelledStatusReason11.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InRepairStatus4Choice#mmReason
	 * InRepairStatus4Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailedSettlementStatus2Choice#mmReason
	 * FailedSettlementStatus2Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason32#mmAdditionalReasonInformation
	 * RejectionReason32.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationPendingStatus7Choice#mmReason
	 * CancellationPendingStatus7Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason33#mmAdditionalReasonInformation
	 * RejectionReason33.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason31#mmAdditionalReasonInformation
	 * RejectionReason31.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason13#mmCorporateActionEventIdentification
	 * CancellationReason13.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason16#mmAdditionalInformation
	 * CancelledStatusReason16.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatus9#mmAdditionalInformation
	 * RejectedStatus9.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus10#mmAdditionalInformation
	 * PartiallySettledStatus10.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BlockedReason2Choice#mmCode
	 * BlockedReason2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BlockedReason2Choice#mmProprietary
	 * BlockedReason2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatus10#mmAdditionalInformation
	 * RejectedStatus10.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason7#mmAdditionalReasonInformation
	 * PendingCancellationStatusReason7.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason21#mmAdditionalReasonInformation
	 * RejectedStatusReason21.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason13#mmAdditionalReasonInformation
	 * PendingStatusReason13.mmAdditionalReasonInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason provided for the status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<StatusReason, Max35Text> mmReason = new MMBusinessAttribute<StatusReason, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(ProprietaryReason1.mmAdditionalReasonInformation, UnaffirmedReason2Choice.mmCode, StatusAndReason10.mmAdditionalReasonInformation, AffirmationReason1.mmAdditionalReasonInformation,
					AffirmationReason1Choice.mmReason, RepairReason5.mmAdditionalReasonInformation, AwaitingAffirmationReason1Choice.mmCode, AwaitingAffirmationReason1Choice.mmProprietary, AwaitingAffirmationReason1.mmCode,
					AwaitingAffirmationReason1.mmAdditionalReasonInformation, RejectionReason9.mmAdditionalReasonInformation, AwaitingCancellationReason1Choice.mmCode, AwaitingCancellationReason1Choice.mmProprietary,
					AwaitingCancellationReason1.mmCode, AwaitingCancellationReason1.mmAdditionalReasonInformation, TransferCancellationStatus2.mmReason, TransferCancellationPendingStatus1.mmReason,
					MeetingCancellationReason2.mmCancellationReason, AdditionalStatus1.mmAdditionalInformation, AdditionalStatus2.mmAdditionalInformation, CorporateActionAmendmentRejectionStatus1.mmReason,
					RejectionReason20FormatChoice.mmCode, CollateralCancellationReason1.mmAdditionalInformation, RejectionStatus2.mmAdditionalInformation, CollateralSubstitutionResponse2.mmRejectionReasonInformation,
					InterestResponse1.mmRejectionReasonInformation, AllegementMatchingReason1.mmAdditionalReasonInformation, RejectionReason23.mmAdditionalInformation, ReportItemStatus1.mmAdditionalReasonInformation,
					ResponseStatus6Choice.mmConsented, GeneratedReason5.mmAdditionalReasonInformation, AdditionalQueryParameters11.mmReason, RejectionReason26.mmAdditionalReasonInformation, PendingReason17.mmAdditionalReasonInformation,
					CancellationReason10.mmAdditionalReasonInformation, RepairReason8.mmAdditionalReasonInformation, PendingReason16.mmAdditionalReasonInformation, RejectionReason25.mmAdditionalReasonInformation,
					CancellationStatus16Choice.mmReason, CancellationReason12.mmAdditionalReasonInformation, AcknowledgementReason9.mmAdditionalReasonInformation, PendingReason15.mmAdditionalReasonInformation,
					AcknowledgementReason10.mmAdditionalReasonInformation, DeniedReason12.mmAdditionalReasonInformation, DeniedReason11.mmAdditionalReasonInformation, AcknowledgementReason11.mmAdditionalReasonInformation,
					RejectionReason29.mmAdditionalReasonInformation, ProprietaryReason4.mmAdditionalReasonInformation, PendingProcessingReason10.mmAdditionalReasonInformation, RejectionOrRepairReason25.mmAdditionalReasonInformation,
					PendingReason14.mmAdditionalReasonInformation, FailingReason7.mmAdditionalReasonInformation, RepairReason10.mmAdditionalReasonInformation, RejectionReason30.mmAdditionalReasonInformation,
					UnmatchedReason16.mmAdditionalReasonInformation, PendingProcessingReason8.mmAdditionalReasonInformation, CancellationReason9.mmAdditionalReasonInformation, UnmatchedReason17.mmAdditionalReasonInformation,
					RejectionOrRepairReason23.mmAdditionalReasonInformation, PendingProcessingReason9.mmAdditionalReasonInformation, AcknowledgementReason12.mmAdditionalReasonInformation, UnmatchedReason15.mmAdditionalReasonInformation,
					RepairReason9.mmAdditionalReasonInformation, ConsentStatus4Choice.mmReason, ConsentReason4.mmCode, ConsentReason4.mmAdditionalReasonInformation, RejectionOrRepairReason26.mmAdditionalReasonInformation,
					RejectionReason28.mmAdditionalReasonInformation, FailingReason8.mmAdditionalReasonInformation, ModificationReason4.mmAdditionalReasonInformation, CancellationStatus15Choice.mmReason,
					PendingReason18.mmAdditionalReasonInformation, DeniedReason10.mmAdditionalReasonInformation, RejectionOrRepairReason24.mmAdditionalReasonInformation, CorporateActionReversalReason3.mmAdditionalReasonInformation,
					CancelledStatusReason12.mmAdditionalReasonInformation, RejectedStatusReason18.mmAdditionalReasonInformation, AcceptedStatusReason9.mmAdditionalReasonInformation, PendingStatusReason9.mmAdditionalReasonInformation,
					CancelledStatusReason11.mmAdditionalReasonInformation, InRepairStatus4Choice.mmReason, FailedSettlementStatus2Choice.mmReason, RejectionReason32.mmAdditionalReasonInformation, CancellationPendingStatus7Choice.mmReason,
					RejectionReason33.mmAdditionalReasonInformation, RejectionReason31.mmAdditionalReasonInformation, CancellationReason13.mmCorporateActionEventIdentification, CancelledStatusReason16.mmAdditionalInformation,
					RejectedStatus9.mmAdditionalInformation, PartiallySettledStatus10.mmAdditionalInformation, BlockedReason2Choice.mmCode, BlockedReason2Choice.mmProprietary, RejectedStatus10.mmAdditionalInformation,
					PendingCancellationStatusReason7.mmAdditionalReasonInformation, RejectedStatusReason21.mmAdditionalReasonInformation, PendingStatusReason13.mmAdditionalReasonInformation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reason";
			definition = "Reason provided for the status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(StatusReason obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(StatusReason obj, Max35Text value) {
			obj.setReason(value);
		}
	};
	protected NoReasonCode noSpecifiedReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.NoReasonCode
	 * NoReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NoSpecifiedReason1#mmNoSpecifiedReason
	 * NoSpecifiedReason1.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationReason1Choice#mmNoSpecifiedReason
	 * AffirmationReason1Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingReason2Choice#mmNoSpecifiedReason
	 * InstructionProcessingReason2Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessing1Choice#mmNoSpecifiedReason
	 * PendingProcessing1Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingReason1Choice#mmNoSpecifiedReason
	 * InstructionProcessingReason1Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingReason1Choice#mmNoSpecifiedReason
	 * MatchingReason1Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason11Choice#mmNoSpecifiedReason
	 * CancellationReason11Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProprietaryReason1Choice#mmNoSpecifiedReason
	 * ProprietaryReason1Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReceivedReason1Choice#mmNoSpecifiedReason
	 * ReceivedReason1Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason9Choice#mmNoSpecifiedReason
	 * PendingProcessingReason9Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason8Choice#mmNoSpecifiedReason
	 * RejectedReason8Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason8Choice#mmNoSpecifiedReason
	 * AcceptedReason8Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingReason4Choice#mmNoSpecifiedReason
	 * MatchingReason4Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus17Choice#mmNoSpecifiedReason
	 * RejectionStatus17Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus12Choice#mmNoSpecifiedReason
	 * RepairStatus12Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus16Choice#mmNoSpecifiedReason
	 * CancellationStatus16Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus21Choice#mmNoSpecifiedReason
	 * AcknowledgedAcceptedStatus21Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus37Choice#mmNoSpecifiedReason
	 * PendingStatus37Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus17Choice#mmNoSpecifiedReason
	 * DeniedStatus17Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus16Choice#mmNoSpecifiedReason
	 * DeniedStatus16Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus23Choice#mmNoSpecifiedReason
	 * AcknowledgedAcceptedStatus23Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus31Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus31Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus38Choice#mmNoSpecifiedReason
	 * PendingStatus38Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus15Choice#mmNoSpecifiedReason
	 * DeniedStatus15Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationStatus4Choice#mmNoSpecifiedReason
	 * ModificationStatus4Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus18Choice#mmNoSpecifiedReason
	 * RejectionStatus18Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus13Choice#mmNoSpecifiedReason
	 * RepairStatus13Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus13Choice#mmNoSpecifiedReason
	 * PendingProcessingStatus13Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus17Choice#mmNoSpecifiedReason
	 * UnmatchedStatus17Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus11Choice#mmNoSpecifiedReason
	 * PendingProcessingStatus11Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus14Choice#mmNoSpecifiedReason
	 * CancellationStatus14Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus40Choice#mmNoSpecifiedReason
	 * PendingStatus40Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus10Choice#mmNoSpecifiedReason
	 * FailingStatus10Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus16Choice#mmNoSpecifiedReason
	 * UnmatchedStatus16Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus21Choice#mmNoSpecifiedReason
	 * RejectionStatus21Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus20Choice#mmNoSpecifiedReason
	 * RejectionStatus20Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus29Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus29Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus39Choice#mmNoSpecifiedReason
	 * PendingStatus39Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus12Choice#mmNoSpecifiedReason
	 * PendingProcessingStatus12Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentStatus4Choice#mmNoSpecifiedReason
	 * ConsentStatus4Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedStatus7Choice#mmNoSpecifiedReason
	 * GeneratedStatus7Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus22Choice#mmNoSpecifiedReason
	 * AcknowledgedAcceptedStatus22Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus32Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus32Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus24Choice#mmNoSpecifiedReason
	 * AcknowledgedAcceptedStatus24Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus18Choice#mmNoSpecifiedReason
	 * UnmatchedStatus18Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus14Choice#mmNoSpecifiedReason
	 * RepairStatus14Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus36Choice#mmNoSpecifiedReason
	 * PendingStatus36Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus30Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus30Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus15Choice#mmNoSpecifiedReason
	 * CancellationStatus15Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus9Choice#mmNoSpecifiedReason
	 * FailingStatus9Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus19Choice#mmNoSpecifiedReason
	 * RejectionStatus19Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedStatus8Choice#mmNoSpecifiedReason
	 * AcceptedStatus8Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus12Choice#mmNoSpecifiedReason
	 * CancelledStatus12Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus11Choice#mmNoSpecifiedReason
	 * CancelledStatus11Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus18Choice#mmNoSpecifiedReason
	 * RejectedStatus18Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus41Choice#mmNoSpecifiedReason
	 * PendingStatus41Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferUnmatchedStatus3Choice#mmNoSpecifiedReason
	 * TransferUnmatchedStatus3Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus13Choice#mmNoSpecifiedReason
	 * CancelledStatus13Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReversedStatus2Choice#mmNoSpecifiedReason
	 * ReversedStatus2Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InRepairStatus4Choice#mmNoSpecifiedReason
	 * InRepairStatus4Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatus3Choice#mmNoSpecifiedReason
	 * PendingSettlementStatus3Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailedSettlementStatus2Choice#mmNoSpecifiedReason
	 * FailedSettlementStatus2Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationPendingStatus7Choice#mmNoSpecifiedReason
	 * CancellationPendingStatus7Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SuspendedStatusReason4Choice#mmNoSpecifiedReason
	 * SuspendedStatusReason4Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConditionallyAcceptedStatus3Choice#mmNoSpecifiedReason
	 * ConditionallyAcceptedStatus3Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InRepairStatusReason4Choice#mmNoSpecifiedReason
	 * InRepairStatusReason4Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason12Choice#mmNoSpecifiedReason
	 * CancelledReason12Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus7Choice#mmNotSpecifiedReason
	 * PendingCancellationStatus7Choice.mmNotSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus23Choice#mmNoSpecifiedReason
	 * RejectedStatus23Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus52Choice#mmNoSpecifiedReason
	 * PendingStatus52Choice.mmNoSpecifiedReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoSpecifiedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that there is no reason available or to report."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<StatusReason, NoReasonCode> mmNoSpecifiedReason = new MMBusinessAttribute<StatusReason, NoReasonCode>() {
		{
			derivation_lazy = () -> Arrays.asList(NoSpecifiedReason1.mmNoSpecifiedReason, AffirmationReason1Choice.mmNoSpecifiedReason, InstructionProcessingReason2Choice.mmNoSpecifiedReason, PendingProcessing1Choice.mmNoSpecifiedReason,
					InstructionProcessingReason1Choice.mmNoSpecifiedReason, MatchingReason1Choice.mmNoSpecifiedReason, CancellationReason11Choice.mmNoSpecifiedReason, ProprietaryReason1Choice.mmNoSpecifiedReason,
					ReceivedReason1Choice.mmNoSpecifiedReason, PendingProcessingReason9Choice.mmNoSpecifiedReason, RejectedReason8Choice.mmNoSpecifiedReason, AcceptedReason8Choice.mmNoSpecifiedReason,
					MatchingReason4Choice.mmNoSpecifiedReason, RejectionStatus17Choice.mmNoSpecifiedReason, RepairStatus12Choice.mmNoSpecifiedReason, CancellationStatus16Choice.mmNoSpecifiedReason,
					AcknowledgedAcceptedStatus21Choice.mmNoSpecifiedReason, PendingStatus37Choice.mmNoSpecifiedReason, DeniedStatus17Choice.mmNoSpecifiedReason, DeniedStatus16Choice.mmNoSpecifiedReason,
					AcknowledgedAcceptedStatus23Choice.mmNoSpecifiedReason, RejectionOrRepairStatus31Choice.mmNoSpecifiedReason, PendingStatus38Choice.mmNoSpecifiedReason, DeniedStatus15Choice.mmNoSpecifiedReason,
					ModificationStatus4Choice.mmNoSpecifiedReason, RejectionStatus18Choice.mmNoSpecifiedReason, RepairStatus13Choice.mmNoSpecifiedReason, PendingProcessingStatus13Choice.mmNoSpecifiedReason,
					UnmatchedStatus17Choice.mmNoSpecifiedReason, PendingProcessingStatus11Choice.mmNoSpecifiedReason, CancellationStatus14Choice.mmNoSpecifiedReason, PendingStatus40Choice.mmNoSpecifiedReason,
					FailingStatus10Choice.mmNoSpecifiedReason, UnmatchedStatus16Choice.mmNoSpecifiedReason, RejectionStatus21Choice.mmNoSpecifiedReason, RejectionStatus20Choice.mmNoSpecifiedReason,
					RejectionOrRepairStatus29Choice.mmNoSpecifiedReason, PendingStatus39Choice.mmNoSpecifiedReason, PendingProcessingStatus12Choice.mmNoSpecifiedReason, ConsentStatus4Choice.mmNoSpecifiedReason,
					GeneratedStatus7Choice.mmNoSpecifiedReason, AcknowledgedAcceptedStatus22Choice.mmNoSpecifiedReason, RejectionOrRepairStatus32Choice.mmNoSpecifiedReason, AcknowledgedAcceptedStatus24Choice.mmNoSpecifiedReason,
					UnmatchedStatus18Choice.mmNoSpecifiedReason, RepairStatus14Choice.mmNoSpecifiedReason, PendingStatus36Choice.mmNoSpecifiedReason, RejectionOrRepairStatus30Choice.mmNoSpecifiedReason,
					CancellationStatus15Choice.mmNoSpecifiedReason, FailingStatus9Choice.mmNoSpecifiedReason, RejectionStatus19Choice.mmNoSpecifiedReason, AcceptedStatus8Choice.mmNoSpecifiedReason,
					CancelledStatus12Choice.mmNoSpecifiedReason, CancelledStatus11Choice.mmNoSpecifiedReason, RejectedStatus18Choice.mmNoSpecifiedReason, PendingStatus41Choice.mmNoSpecifiedReason,
					TransferUnmatchedStatus3Choice.mmNoSpecifiedReason, CancelledStatus13Choice.mmNoSpecifiedReason, ReversedStatus2Choice.mmNoSpecifiedReason, InRepairStatus4Choice.mmNoSpecifiedReason,
					PendingSettlementStatus3Choice.mmNoSpecifiedReason, FailedSettlementStatus2Choice.mmNoSpecifiedReason, CancellationPendingStatus7Choice.mmNoSpecifiedReason, SuspendedStatusReason4Choice.mmNoSpecifiedReason,
					ConditionallyAcceptedStatus3Choice.mmNoSpecifiedReason, InRepairStatusReason4Choice.mmNoSpecifiedReason, CancelledReason12Choice.mmNoSpecifiedReason, PendingCancellationStatus7Choice.mmNotSpecifiedReason,
					RejectedStatus23Choice.mmNoSpecifiedReason, PendingStatus52Choice.mmNoSpecifiedReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoSpecifiedReason";
			definition = "Indicates that there is no reason available or to report.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NoReasonCode.mmObject();
		}

		@Override
		public NoReasonCode getValue(StatusReason obj) {
			return obj.getNoSpecifiedReason();
		}

		@Override
		public void setValue(StatusReason obj, NoReasonCode value) {
			obj.setNoSpecifiedReason(value);
		}
	};
	protected List<GenericIdentification> dataSourceScheme;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedStatusReason
	 * GenericIdentification.mmRelatedStatusReason}</li>
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
	 * {@linkplain com.tools20022.repository.choice.UnaffirmedReason2Choice#mmProprietary
	 * UnaffirmedReason2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferUnmatchedStatus3Choice#mmDataSourceScheme
	 * TransferUnmatchedStatus3Choice.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus13Choice#mmDataSourceScheme
	 * CancelledStatus13Choice.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InRepairStatus4Choice#mmDataSourceScheme
	 * InRepairStatus4Choice.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatus3Choice#mmDataSourceScheme
	 * PendingSettlementStatus3Choice.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationPendingStatus7Choice#mmDataSourceScheme
	 * CancellationPendingStatus7Choice.mmDataSourceScheme}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSourceScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proprietary identification of the reason for the status."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<StatusReason, List<GenericIdentification>> mmDataSourceScheme = new MMBusinessAssociationEnd<StatusReason, List<GenericIdentification>>() {
		{
			derivation_lazy = () -> Arrays.asList(UnaffirmedReason2Choice.mmProprietary, TransferUnmatchedStatus3Choice.mmDataSourceScheme, CancelledStatus13Choice.mmDataSourceScheme, InRepairStatus4Choice.mmDataSourceScheme,
					PendingSettlementStatus3Choice.mmDataSourceScheme, CancellationPendingStatus7Choice.mmDataSourceScheme);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DataSourceScheme";
			definition = "Proprietary identification of the reason for the status.";
			minOccurs = 0;
			opposite_lazy = () -> GenericIdentification.mmRelatedStatusReason;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}

		@Override
		public List<GenericIdentification> getValue(StatusReason obj) {
			return obj.getDataSourceScheme();
		}

		@Override
		public void setValue(StatusReason obj, List<GenericIdentification> value) {
			obj.setDataSourceScheme(value);
		}
	};
	protected RejectedStatusReasonCode rejectedStatusReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason23#mmReason
	 * RejectionReason23.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmRejected
	 * TransferStatus2Choice.mmRejected}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason32#mmReason
	 * RejectionReason32.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason33#mmReason
	 * RejectionReason33.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason17Choice#mmCode
	 * RejectedReason17Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason17Choice#mmProprietary
	 * RejectedReason17Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason16Choice#mmCode
	 * RejectedReason16Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason16Choice#mmProprietary
	 * RejectedReason16Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason31#mmReason
	 * RejectionReason31.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason15Choice#mmCode
	 * RejectedReason15Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason15Choice#mmProprietary
	 * RejectedReason15Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus22Choice#mmRejected
	 * CancellationStatus22Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status25Choice#mmRejected
	 * Status25Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus23Choice#mmReason
	 * RejectedStatus23Choice.mmReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the rejected status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<StatusReason, RejectedStatusReasonCode> mmRejectedStatusReason = new MMBusinessAttribute<StatusReason, RejectedStatusReasonCode>() {
		{
			derivation_lazy = () -> Arrays.asList(RejectionReason23.mmReason, TransferStatus2Choice.mmRejected, RejectionReason32.mmReason, RejectionReason33.mmReason, RejectedReason17Choice.mmCode, RejectedReason17Choice.mmProprietary,
					RejectedReason16Choice.mmCode, RejectedReason16Choice.mmProprietary, RejectionReason31.mmReason, RejectedReason15Choice.mmCode, RejectedReason15Choice.mmProprietary, CancellationStatus22Choice.mmRejected,
					Status25Choice.mmRejected, RejectedStatus23Choice.mmReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RejectedStatusReason";
			definition = "Reason for the rejected status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RejectedStatusReasonCode.mmObject();
		}

		@Override
		public RejectedStatusReasonCode getValue(StatusReason obj) {
			return obj.getRejectedStatusReason();
		}

		@Override
		public void setValue(StatusReason obj, RejectedStatusReasonCode value) {
			obj.setRejectedStatusReason(value);
		}
	};
	protected PendingFailingReasonCode failingReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonCode
	 * PendingFailingReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason8Choice#mmCode
	 * FailingReason8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason8Choice#mmProprietary
	 * FailingReason8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason9Choice#mmCode
	 * FailingReason9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason9Choice#mmProprietary
	 * FailingReason9Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FailingReason7#mmCode
	 * FailingReason7.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason7Choice#mmCode
	 * FailingReason7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason7Choice#mmProprietary
	 * FailingReason7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus10Choice#mmReason
	 * FailingStatus10Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FailingReason8#mmCode
	 * FailingReason8.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmFailingReason
	 * Reason16Choice.mmFailingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus9Choice#mmReason
	 * FailingStatus9Choice.mmReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailingReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason why a transaction has a failing status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<StatusReason, PendingFailingReasonCode> mmFailingReason = new MMBusinessAttribute<StatusReason, PendingFailingReasonCode>() {
		{
			derivation_lazy = () -> Arrays.asList(FailingReason8Choice.mmCode, FailingReason8Choice.mmProprietary, FailingReason9Choice.mmCode, FailingReason9Choice.mmProprietary, FailingReason7.mmCode, FailingReason7Choice.mmCode,
					FailingReason7Choice.mmProprietary, FailingStatus10Choice.mmReason, FailingReason8.mmCode, Reason16Choice.mmFailingReason, FailingStatus9Choice.mmReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FailingReason";
			definition = "Reason why a transaction has a failing status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PendingFailingReasonCode.mmObject();
		}

		@Override
		public PendingFailingReasonCode getValue(StatusReason obj) {
			return obj.getFailingReason();
		}

		@Override
		public void setValue(StatusReason obj, PendingFailingReasonCode value) {
			obj.setFailingReason(value);
		}
	};
	protected CancelledStatusReasonV2Code cancellationReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code
	 * CancelledStatusReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus5Choice#mmCancelled
	 * IntraPositionProcessingStatus5Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#mmCancelled
	 * ProcessingStatus48Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus54Choice#mmCancelled
	 * ProcessingStatus54Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus51Choice#mmCancelled
	 * ProcessingStatus51Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason10#mmCode
	 * CancellationReason10.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason21Choice#mmCode
	 * CancellationReason21Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason21Choice#mmProprietary
	 * CancellationReason21Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason12#mmCode
	 * CancellationReason12.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason23Choice#mmCode
	 * CancellationReason23Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason23Choice#mmProprietary
	 * CancellationReason23Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason19Choice#mmCode
	 * CancellationReason19Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason19Choice#mmProprietary
	 * CancellationReason19Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus49Choice#mmCancelled
	 * ProcessingStatus49Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus14Choice#mmReason
	 * CancellationStatus14Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancellationReason9#mmCode
	 * CancellationReason9.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#mmCancellationRequested
	 * InstructionProcessingStatus22Choice.mmCancellationRequested}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#mmCancelled
	 * InstructionProcessingStatus22Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus53Choice#mmCancelled
	 * ProcessingStatus53Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmCancellationReason
	 * Reason16Choice.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason20Choice#mmCode
	 * CancellationReason20Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason20Choice#mmProprietary
	 * CancellationReason20Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason12#mmReasonCode
	 * CancelledStatusReason12.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason9Choice#mmCode
	 * CancelledReason9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason9Choice#mmProprietary
	 * CancelledReason9Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus12Choice#mmReason
	 * CancelledStatus12Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus11Choice#mmReason
	 * CancelledStatus11Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason8Choice#mmCode
	 * CancelledReason8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason8Choice#mmProprietary
	 * CancelledReason8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason11#mmReasonCode
	 * CancelledStatusReason11.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmCancelled
	 * TransferStatus2Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus13Choice#mmReason
	 * CancelledStatus13Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledCompleteReason1#mmReason
	 * CancelledCompleteReason1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason13#mmCode
	 * CancellationReason13.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason31Choice#mmCode
	 * CancellationReason31Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason31Choice#mmProprietary
	 * CancellationReason31Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason16#mmReason
	 * CancelledStatusReason16.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason12Choice#mmCode
	 * CancelledReason12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason12Choice#mmProprietary
	 * CancelledReason12Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason32Choice#mmCode
	 * CancellationReason32Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason32Choice#mmProprietary
	 * CancellationReason32Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus11Choice#mmCancellationCompleted
	 * InstructionCancellationRequestStatus11Choice.mmCancellationCompleted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus29Choice#mmCancelled
	 * InstructionProcessingStatus29Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference11#mmCancellationReason
	 * TransferReference11.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference13#mmCancellationReason
	 * TransferReference13.mmCancellationReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the related instruction is cancelled, or the related cancellation request is executed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<StatusReason, CancelledStatusReasonV2Code> mmCancellationReason = new MMBusinessAttribute<StatusReason, CancelledStatusReasonV2Code>() {
		{
			derivation_lazy = () -> Arrays.asList(IntraPositionProcessingStatus5Choice.mmCancelled, ProcessingStatus48Choice.mmCancelled, ProcessingStatus54Choice.mmCancelled, ProcessingStatus51Choice.mmCancelled,
					CancellationReason10.mmCode, CancellationReason21Choice.mmCode, CancellationReason21Choice.mmProprietary, CancellationReason12.mmCode, CancellationReason23Choice.mmCode, CancellationReason23Choice.mmProprietary,
					CancellationReason19Choice.mmCode, CancellationReason19Choice.mmProprietary, ProcessingStatus49Choice.mmCancelled, CancellationStatus14Choice.mmReason, CancellationReason9.mmCode,
					InstructionProcessingStatus22Choice.mmCancellationRequested, InstructionProcessingStatus22Choice.mmCancelled, ProcessingStatus53Choice.mmCancelled, Reason16Choice.mmCancellationReason, CancellationReason20Choice.mmCode,
					CancellationReason20Choice.mmProprietary, CancelledStatusReason12.mmReasonCode, CancelledReason9Choice.mmCode, CancelledReason9Choice.mmProprietary, CancelledStatus12Choice.mmReason, CancelledStatus11Choice.mmReason,
					CancelledReason8Choice.mmCode, CancelledReason8Choice.mmProprietary, CancelledStatusReason11.mmReasonCode, TransferStatus2Choice.mmCancelled, CancelledStatus13Choice.mmReason, CancelledCompleteReason1.mmReason,
					CancellationReason13.mmCode, CancellationReason31Choice.mmCode, CancellationReason31Choice.mmProprietary, CancelledStatusReason16.mmReason, CancelledReason12Choice.mmCode, CancelledReason12Choice.mmProprietary,
					CancellationReason32Choice.mmCode, CancellationReason32Choice.mmProprietary, InstructionCancellationRequestStatus11Choice.mmCancellationCompleted, InstructionProcessingStatus29Choice.mmCancelled,
					TransferReference11.mmCancellationReason, TransferReference13.mmCancellationReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationReason";
			definition = "Specifies the reason why the related instruction is cancelled, or the related cancellation request is executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancelledStatusReasonV2Code.mmObject();
		}

		@Override
		public CancelledStatusReasonV2Code getValue(StatusReason obj) {
			return obj.getCancellationReason();
		}

		@Override
		public void setValue(StatusReason obj, CancelledStatusReasonV2Code value) {
			obj.setCancellationReason(value);
		}
	};
	protected PendingFailingReasonCode pendingReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonCode
	 * PendingFailingReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmPendingProcessing
	 * ProcessingStatus17Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus50Choice#mmPending
	 * ProcessingStatus50Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#mmPendingProcessing
	 * ProcessingStatus48Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#mmPendingCancellation
	 * ProcessingStatus48Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice#mmPendingProcessing
	 * ModificationProcessingStatus7Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus54Choice#mmPendingCancellation
	 * ProcessingStatus54Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus51Choice#mmPendingCancellation
	 * ProcessingStatus51Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus51Choice#mmPendingProcessing
	 * ProcessingStatus51Choice.mmPendingProcessing}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason17#mmCode
	 * PendingReason17.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason30Choice#mmCode
	 * PendingReason30Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason30Choice#mmProprietary
	 * PendingReason30Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason16#mmCode
	 * PendingReason16.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason28Choice#mmCode
	 * PendingReason28Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason28Choice#mmProprietary
	 * PendingReason28Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason12Choice#mmCode
	 * PendingProcessingReason12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason12Choice#mmProprietary
	 * PendingProcessingReason12Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus52Choice#mmPendingProcessing
	 * ProcessingStatus52Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus52Choice#mmPendingCancellation
	 * ProcessingStatus52Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus37Choice#mmReason
	 * PendingStatus37Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason15#mmCode
	 * PendingReason15.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus38Choice#mmReason
	 * PendingStatus38Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason10#mmCode
	 * PendingProcessingReason10.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus13Choice#mmReason
	 * PendingProcessingStatus13Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason14#mmCode
	 * PendingReason14.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason26Choice#mmCode
	 * PendingReason26Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason26Choice#mmProprietary
	 * PendingReason26Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus49Choice#mmPendingProcessing
	 * ProcessingStatus49Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus49Choice#mmPendingCancellation
	 * ProcessingStatus49Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus11Choice#mmReason
	 * PendingProcessingStatus11Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus40Choice#mmReason
	 * PendingStatus40Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason8#mmCode
	 * PendingProcessingReason8.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason29Choice#mmCode
	 * PendingReason29Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason29Choice#mmProprietary
	 * PendingReason29Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#mmPendingProcessing
	 * InstructionProcessingStatus22Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#mmPendingCancellation
	 * InstructionProcessingStatus22Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason10Choice#mmCode
	 * PendingProcessingReason10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason10Choice#mmProprietary
	 * PendingProcessingReason10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus39Choice#mmReason
	 * PendingStatus39Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus12Choice#mmReason
	 * PendingProcessingStatus12Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason9#mmCode
	 * PendingProcessingReason9.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus53Choice#mmPendingCancellation
	 * ProcessingStatus53Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason11Choice#mmCode
	 * PendingProcessingReason11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason11Choice#mmProprietary
	 * PendingProcessingReason11Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason27Choice#mmCode
	 * PendingReason27Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason27Choice#mmProprietary
	 * PendingReason27Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus36Choice#mmReason
	 * PendingStatus36Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmPendingCancellationReason
	 * Reason16Choice.mmPendingCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmPendingReason
	 * Reason16Choice.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmPendingProcessingReason
	 * Reason16Choice.mmPendingProcessingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmPendingModificationReason
	 * Reason16Choice.mmPendingModificationReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason18#mmCode
	 * PendingReason18.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReasons4Choice#mmCode
	 * PendingCancellationReasons4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReasons4Choice#mmProprietary
	 * PendingCancellationReasons4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason31Choice#mmCode
	 * PendingReason31Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason31Choice#mmProprietary
	 * PendingReason31Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus3Choice#mmPending
	 * EventProcessingStatus3Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason32Choice#mmCode
	 * PendingReason32Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason32Choice#mmProprietary
	 * PendingReason32Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason9#mmReasonCode
	 * PendingStatusReason9.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason14#mmCode
	 * PendingStatusReason14.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingOpeningStatusReason1#mmCode
	 * PendingOpeningStatusReason1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClosurePendingStatusReason1#mmCode
	 * ClosurePendingStatusReason1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus11Choice#mmPendingCancellation
	 * InstructionCancellationRequestStatus11Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus29Choice#mmPending
	 * InstructionProcessingStatus29Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus7Choice#mmReason
	 * PendingCancellationStatus7Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason48Choice#mmCode
	 * PendingReason48Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason48Choice#mmProprietary
	 * PendingReason48Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus52Choice#mmReason
	 * PendingStatus52Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason7#mmReasonCode
	 * PendingCancellationStatusReason7.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason13#mmReasonCode
	 * PendingStatusReason13.mmReasonCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction processing is pending."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<StatusReason, PendingFailingReasonCode> mmPendingReason = new MMBusinessAttribute<StatusReason, PendingFailingReasonCode>() {
		{
			derivation_lazy = () -> Arrays.asList(ProcessingStatus17Choice.mmPendingProcessing, ProcessingStatus50Choice.mmPending, ProcessingStatus48Choice.mmPendingProcessing, ProcessingStatus48Choice.mmPendingCancellation,
					ModificationProcessingStatus7Choice.mmPendingProcessing, ProcessingStatus54Choice.mmPendingCancellation, ProcessingStatus51Choice.mmPendingCancellation, ProcessingStatus51Choice.mmPendingProcessing,
					PendingReason17.mmCode, PendingReason30Choice.mmCode, PendingReason30Choice.mmProprietary, PendingReason16.mmCode, PendingReason28Choice.mmCode, PendingReason28Choice.mmProprietary,
					PendingProcessingReason12Choice.mmCode, PendingProcessingReason12Choice.mmProprietary, ProcessingStatus52Choice.mmPendingProcessing, ProcessingStatus52Choice.mmPendingCancellation, PendingStatus37Choice.mmReason,
					PendingReason15.mmCode, PendingStatus38Choice.mmReason, PendingProcessingReason10.mmCode, PendingProcessingStatus13Choice.mmReason, PendingReason14.mmCode, PendingReason26Choice.mmCode,
					PendingReason26Choice.mmProprietary, ProcessingStatus49Choice.mmPendingProcessing, ProcessingStatus49Choice.mmPendingCancellation, PendingProcessingStatus11Choice.mmReason, PendingStatus40Choice.mmReason,
					PendingProcessingReason8.mmCode, PendingReason29Choice.mmCode, PendingReason29Choice.mmProprietary, InstructionProcessingStatus22Choice.mmPendingProcessing, InstructionProcessingStatus22Choice.mmPendingCancellation,
					PendingProcessingReason10Choice.mmCode, PendingProcessingReason10Choice.mmProprietary, PendingStatus39Choice.mmReason, PendingProcessingStatus12Choice.mmReason, PendingProcessingReason9.mmCode,
					ProcessingStatus53Choice.mmPendingCancellation, PendingProcessingReason11Choice.mmCode, PendingProcessingReason11Choice.mmProprietary, PendingReason27Choice.mmCode, PendingReason27Choice.mmProprietary,
					PendingStatus36Choice.mmReason, Reason16Choice.mmPendingCancellationReason, Reason16Choice.mmPendingReason, Reason16Choice.mmPendingProcessingReason, Reason16Choice.mmPendingModificationReason, PendingReason18.mmCode,
					PendingCancellationReasons4Choice.mmCode, PendingCancellationReasons4Choice.mmProprietary, PendingReason31Choice.mmCode, PendingReason31Choice.mmProprietary, EventProcessingStatus3Choice.mmPending,
					PendingReason32Choice.mmCode, PendingReason32Choice.mmProprietary, PendingStatusReason9.mmReasonCode, PendingStatusReason14.mmCode, PendingOpeningStatusReason1.mmCode, ClosurePendingStatusReason1.mmCode,
					InstructionCancellationRequestStatus11Choice.mmPendingCancellation, InstructionProcessingStatus29Choice.mmPending, PendingCancellationStatus7Choice.mmReason, PendingReason48Choice.mmCode,
					PendingReason48Choice.mmProprietary, PendingStatus52Choice.mmReason, PendingCancellationStatusReason7.mmReasonCode, PendingStatusReason13.mmReasonCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PendingReason";
			definition = "Specifies the reason why the instruction processing is pending.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PendingFailingReasonCode.mmObject();
		}

		@Override
		public PendingFailingReasonCode getValue(StatusReason obj) {
			return obj.getPendingReason();
		}

		@Override
		public void setValue(StatusReason obj, PendingFailingReasonCode value) {
			obj.setPendingReason(value);
		}
	};
	protected RejectionReasonV2Code rejectionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV2Code
	 * RejectionReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason9Choice#mmCode
	 * RejectionReason9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason9Choice#mmProprietary
	 * RejectionReason9Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason9#mmCode
	 * RejectionReason9.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingReason1Choice#mmReason
	 * InstructionProcessingReason1Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmRejected
	 * ProcessingStatus17Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason11FormatChoice#mmCode
	 * RejectionReason11FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason11FormatChoice#mmProprietary
	 * RejectionReason11FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason6FormatChoice#mmCode
	 * RejectionReason6FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason6FormatChoice#mmProprietary
	 * RejectionReason6FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason18FormatChoice#mmCode
	 * RejectionReason18FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason18FormatChoice#mmProprietary
	 * RejectionReason18FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionRejectionStatus1#mmReason
	 * CorporateActionInstructionRejectionStatus1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason9FormatChoice#mmCode
	 * RejectionReason9FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason9FormatChoice#mmProprietary
	 * RejectionReason9FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason8FormatChoice#mmCode
	 * RejectionReason8FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason8FormatChoice#mmProprietary
	 * RejectionReason8FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason19FormatChoice#mmCode
	 * RejectionReason19FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason19FormatChoice#mmProprietary
	 * RejectionReason19FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason13FormatChoice#mmCode
	 * RejectionReason13FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason13FormatChoice#mmProprietary
	 * RejectionReason13FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementRejectionStatus1#mmReason
	 * CorporateActionMovementRejectionStatus1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason14FormatChoice#mmCode
	 * RejectionReason14FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason14FormatChoice#mmProprietary
	 * RejectionReason14FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementRejectionStatus2#mmReason
	 * CorporateActionMovementRejectionStatus2.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason15FormatChoice#mmCode
	 * RejectionReason15FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason15FormatChoice#mmProprietary
	 * RejectionReason15FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionRejectionStatus1#mmReason
	 * CorporateActionStandingInstructionRejectionStatus1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason10FormatChoice#mmCode
	 * RejectionReason10FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason10FormatChoice#mmProprietary
	 * RejectionReason10FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason12FormatChoice#mmCode
	 * RejectionReason12FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason12FormatChoice#mmProprietary
	 * RejectionReason12FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionRejectionStatus1#mmReason
	 * CorporateActionDeactivationInstructionRejectionStatus1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason7FormatChoice#mmCode
	 * RejectionReason7FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason7FormatChoice#mmProprietary
	 * RejectionReason7FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationCancellationRejectionStatus1#mmReason
	 * CorporateActionDeactivationCancellationRejectionStatus1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionStatus2#mmRejectedReason
	 * RejectionStatus2.mmRejectedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitutionResponse2#mmRejectionReason
	 * CollateralSubstitutionResponse2.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReportItemRejectionReason1Choice#mmCode
	 * ReportItemRejectionReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReportItemRejectionReason1Choice#mmProprietary
	 * ReportItemRejectionReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateralResponse1#mmRejectionReason
	 * SecuritiesCollateralResponse1.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus55Choice#mmRejected
	 * ProcessingStatus55Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus50Choice#mmRejected
	 * ProcessingStatus50Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#mmRejected
	 * ProcessingStatus48Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice#mmRejected
	 * ModificationProcessingStatus7Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus54Choice#mmRejected
	 * ProcessingStatus54Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus51Choice#mmRejected
	 * ProcessingStatus51Choice.mmRejected}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason26#mmCode
	 * RejectionReason26.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason24Choice#mmCode
	 * RejectionReason24Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason24Choice#mmProprietary
	 * RejectionReason24Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus17Choice#mmReason
	 * RejectionStatus17Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason25#mmCode
	 * RejectionReason25.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason22Choice#mmCode
	 * RejectionReason22Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason22Choice#mmProprietary
	 * RejectionReason22Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason23Choice#mmCode
	 * RejectionReason23Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason23Choice#mmProprietary
	 * RejectionReason23Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason26Choice#mmCode
	 * RejectionReason26Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason26Choice#mmProprietary
	 * RejectionReason26Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus18Choice#mmReason
	 * RejectionStatus18Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus49Choice#mmRejected
	 * ProcessingStatus49Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus21Choice#mmReason
	 * RejectionStatus21Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason30#mmCode
	 * RejectionReason30.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus20Choice#mmReason
	 * RejectionStatus20Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason23Choice#mmCode
	 * RejectionAndRepairReason23Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason23Choice#mmProprietary
	 * RejectionAndRepairReason23Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason25Choice#mmCode
	 * RejectionAndRepairReason25Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason25Choice#mmProprietary
	 * RejectionAndRepairReason25Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus53Choice#mmRejected
	 * ProcessingStatus53Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason24Choice#mmCode
	 * RejectionAndRepairReason24Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason24Choice#mmProprietary
	 * RejectionAndRepairReason24Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason27Choice#mmCode
	 * RejectionReason27Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason27Choice#mmProprietary
	 * RejectionReason27Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason26Choice#mmCode
	 * RejectionAndRepairReason26Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason26Choice#mmProprietary
	 * RejectionAndRepairReason26Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason28#mmCode
	 * RejectionReason28.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmRejectionReason
	 * Reason16Choice.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus19Choice#mmReason
	 * RejectionStatus19Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason14Choice#mmCode
	 * RejectedReason14Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason14Choice#mmProprietary
	 * RejectedReason14Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus18Choice#mmReason
	 * RejectedStatus18Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason18#mmReasonCode
	 * RejectedStatusReason18.mmReasonCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatus9#mmReason
	 * RejectedStatus9.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatus10#mmReason
	 * RejectedStatus10.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences2#mmLegRejectionReason
	 * SwitchLegReferences2.mmLegRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus11Choice#mmRejected
	 * InstructionCancellationRequestStatus11Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus29Choice#mmRejected
	 * InstructionProcessingStatus29Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason5Choice#mmCode
	 * PendingCancellationReason5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason5Choice#mmProprietary
	 * PendingCancellationReason5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason21#mmReasonCode
	 * RejectedStatusReason21.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason22Choice#mmCode
	 * RejectedReason22Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason22Choice#mmProprietary
	 * RejectedReason22Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateralResponse2#mmRejectionReason
	 * OtherCollateralResponse2.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse2#mmRejectionReason
	 * CashCollateralResponse2.mmRejectionReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction/request has a repair or rejection status."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<StatusReason, RejectionReasonV2Code> mmRejectionReason = new MMBusinessAttribute<StatusReason, RejectionReasonV2Code>() {
		{
			derivation_lazy = () -> Arrays.asList(RejectionReason9Choice.mmCode, RejectionReason9Choice.mmProprietary, RejectionReason9.mmCode, InstructionProcessingReason1Choice.mmReason, ProcessingStatus17Choice.mmRejected,
					RejectionReason11FormatChoice.mmCode, RejectionReason11FormatChoice.mmProprietary, RejectionReason6FormatChoice.mmCode, RejectionReason6FormatChoice.mmProprietary, RejectionReason18FormatChoice.mmCode,
					RejectionReason18FormatChoice.mmProprietary, CorporateActionInstructionRejectionStatus1.mmReason, RejectionReason9FormatChoice.mmCode, RejectionReason9FormatChoice.mmProprietary, RejectionReason8FormatChoice.mmCode,
					RejectionReason8FormatChoice.mmProprietary, RejectionReason19FormatChoice.mmCode, RejectionReason19FormatChoice.mmProprietary, RejectionReason13FormatChoice.mmCode, RejectionReason13FormatChoice.mmProprietary,
					CorporateActionMovementRejectionStatus1.mmReason, RejectionReason14FormatChoice.mmCode, RejectionReason14FormatChoice.mmProprietary, CorporateActionMovementRejectionStatus2.mmReason,
					RejectionReason15FormatChoice.mmCode, RejectionReason15FormatChoice.mmProprietary, CorporateActionStandingInstructionRejectionStatus1.mmReason, RejectionReason10FormatChoice.mmCode,
					RejectionReason10FormatChoice.mmProprietary, RejectionReason12FormatChoice.mmCode, RejectionReason12FormatChoice.mmProprietary, CorporateActionDeactivationInstructionRejectionStatus1.mmReason,
					RejectionReason7FormatChoice.mmCode, RejectionReason7FormatChoice.mmProprietary, CorporateActionDeactivationCancellationRejectionStatus1.mmReason, RejectionStatus2.mmRejectedReason,
					CollateralSubstitutionResponse2.mmRejectionReason, ReportItemRejectionReason1Choice.mmCode, ReportItemRejectionReason1Choice.mmProprietary, SecuritiesCollateralResponse1.mmRejectionReason,
					ProcessingStatus55Choice.mmRejected, ProcessingStatus50Choice.mmRejected, ProcessingStatus48Choice.mmRejected, ModificationProcessingStatus7Choice.mmRejected, ProcessingStatus54Choice.mmRejected,
					ProcessingStatus51Choice.mmRejected, RejectionReason26.mmCode, RejectionReason24Choice.mmCode, RejectionReason24Choice.mmProprietary, RejectionStatus17Choice.mmReason, RejectionReason25.mmCode,
					RejectionReason22Choice.mmCode, RejectionReason22Choice.mmProprietary, RejectionReason23Choice.mmCode, RejectionReason23Choice.mmProprietary, RejectionReason26Choice.mmCode, RejectionReason26Choice.mmProprietary,
					RejectionStatus18Choice.mmReason, ProcessingStatus49Choice.mmRejected, RejectionStatus21Choice.mmReason, RejectionReason30.mmCode, RejectionStatus20Choice.mmReason, RejectionAndRepairReason23Choice.mmCode,
					RejectionAndRepairReason23Choice.mmProprietary, RejectionAndRepairReason25Choice.mmCode, RejectionAndRepairReason25Choice.mmProprietary, ProcessingStatus53Choice.mmRejected, RejectionAndRepairReason24Choice.mmCode,
					RejectionAndRepairReason24Choice.mmProprietary, RejectionReason27Choice.mmCode, RejectionReason27Choice.mmProprietary, RejectionAndRepairReason26Choice.mmCode, RejectionAndRepairReason26Choice.mmProprietary,
					RejectionReason28.mmCode, Reason16Choice.mmRejectionReason, RejectionStatus19Choice.mmReason, RejectedReason14Choice.mmCode, RejectedReason14Choice.mmProprietary, RejectedStatus18Choice.mmReason,
					RejectedStatusReason18.mmReasonCode, RejectedStatus9.mmReason, RejectedStatus10.mmReason, SwitchLegReferences2.mmLegRejectionReason, InstructionCancellationRequestStatus11Choice.mmRejected,
					InstructionProcessingStatus29Choice.mmRejected, PendingCancellationReason5Choice.mmCode, PendingCancellationReason5Choice.mmProprietary, RejectedStatusReason21.mmReasonCode, RejectedReason22Choice.mmCode,
					RejectedReason22Choice.mmProprietary, OtherCollateralResponse2.mmRejectionReason, CashCollateralResponse2.mmRejectionReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RejectionReason";
			definition = "Specifies the reason why the instruction/request has a repair or rejection status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RejectionReasonV2Code.mmObject();
		}

		@Override
		public RejectionReasonV2Code getValue(StatusReason obj) {
			return obj.getRejectionReason();
		}

		@Override
		public void setValue(StatusReason obj, RejectionReasonV2Code value) {
			obj.setRejectionReason(value);
		}
	};
	protected AcknowledgementReasonCode acknowledgedAcceptedReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReasonCode
	 * AcknowledgementReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmAcknowledgedAccepted
	 * ProcessingStatus17Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReceivedReason2Choice#mmCode
	 * ReceivedReason2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceivedStatusReason1#mmReason
	 * ReceivedStatusReason1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReceivedReason1Choice#mmReason
	 * ReceivedReason1Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingStatusReason1#mmReason
	 * PendingProcessingStatusReason1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason9Choice#mmReason
	 * PendingProcessingReason9Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason8Choice#mmCode
	 * PendingProcessingReason8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason8Choice#mmReason
	 * RejectedReason8Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason7Choice#mmCode
	 * RejectedReason7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason7#mmReason
	 * AcceptedStatusReason7.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason8Choice#mmReason
	 * AcceptedReason8Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason12#mmReason
	 * RejectedStatusReason12.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason7Choice#mmCode
	 * AcceptedReason7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReportItemStatus1Choice#mmAccepted
	 * ReportItemStatus1Choice.mmAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus55Choice#mmAcknowledgedAccepted
	 * ProcessingStatus55Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus5Choice#mmAcknowledgedAccepted
	 * IntraPositionProcessingStatus5Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus50Choice#mmAcknowledgedAccepted
	 * ProcessingStatus50Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#mmAcknowledgedAccepted
	 * ProcessingStatus48Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice#mmAcknowledgedAccepted
	 * ModificationProcessingStatus7Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus54Choice#mmAcknowledgedAccepted
	 * ProcessingStatus54Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus51Choice#mmAcknowledgedAccepted
	 * ProcessingStatus51Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus52Choice#mmAcknowledgedAccepted
	 * ProcessingStatus52Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus21Choice#mmReason
	 * AcknowledgedAcceptedStatus21Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason9#mmCode
	 * AcknowledgementReason9.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason12Choice#mmCode
	 * AcknowledgementReason12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason12Choice#mmProprietary
	 * AcknowledgementReason12Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus23Choice#mmReason
	 * AcknowledgedAcceptedStatus23Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason11#mmCode
	 * AcknowledgementReason11.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason15Choice#mmCode
	 * AcknowledgementReason15Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason15Choice#mmProprietary
	 * AcknowledgementReason15Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus49Choice#mmAcknowledgedAccepted
	 * ProcessingStatus49Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason14Choice#mmCode
	 * AcknowledgementReason14Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason14Choice#mmProprietary
	 * AcknowledgementReason14Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#mmAcknowledgedAccepted
	 * InstructionProcessingStatus22Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason12#mmCode
	 * AcknowledgementReason12.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus53Choice#mmAcknowledgedAccepted
	 * ProcessingStatus53Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus22Choice#mmReason
	 * AcknowledgedAcceptedStatus22Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus24Choice#mmReason
	 * AcknowledgedAcceptedStatus24Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmAcknowledgedAcceptedReason
	 * Reason16Choice.mmAcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatusReason3#mmReason
	 * ConditionallyAcceptedStatusReason3.mmReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgedAcceptedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies additional information about the processed instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<StatusReason, AcknowledgementReasonCode> mmAcknowledgedAcceptedReason = new MMBusinessAttribute<StatusReason, AcknowledgementReasonCode>() {
		{
			derivation_lazy = () -> Arrays.asList(ProcessingStatus17Choice.mmAcknowledgedAccepted, ReceivedReason2Choice.mmCode, ReceivedStatusReason1.mmReason, ReceivedReason1Choice.mmReason, PendingProcessingStatusReason1.mmReason,
					PendingProcessingReason9Choice.mmReason, PendingProcessingReason8Choice.mmCode, RejectedReason8Choice.mmReason, RejectedReason7Choice.mmCode, AcceptedStatusReason7.mmReason, AcceptedReason8Choice.mmReason,
					RejectedStatusReason12.mmReason, AcceptedReason7Choice.mmCode, ReportItemStatus1Choice.mmAccepted, ProcessingStatus55Choice.mmAcknowledgedAccepted, IntraPositionProcessingStatus5Choice.mmAcknowledgedAccepted,
					ProcessingStatus50Choice.mmAcknowledgedAccepted, ProcessingStatus48Choice.mmAcknowledgedAccepted, ModificationProcessingStatus7Choice.mmAcknowledgedAccepted, ProcessingStatus54Choice.mmAcknowledgedAccepted,
					ProcessingStatus51Choice.mmAcknowledgedAccepted, ProcessingStatus52Choice.mmAcknowledgedAccepted, AcknowledgedAcceptedStatus21Choice.mmReason, AcknowledgementReason9.mmCode, AcknowledgementReason12Choice.mmCode,
					AcknowledgementReason12Choice.mmProprietary, AcknowledgedAcceptedStatus23Choice.mmReason, AcknowledgementReason11.mmCode, AcknowledgementReason15Choice.mmCode, AcknowledgementReason15Choice.mmProprietary,
					ProcessingStatus49Choice.mmAcknowledgedAccepted, AcknowledgementReason14Choice.mmCode, AcknowledgementReason14Choice.mmProprietary, InstructionProcessingStatus22Choice.mmAcknowledgedAccepted,
					AcknowledgementReason12.mmCode, ProcessingStatus53Choice.mmAcknowledgedAccepted, AcknowledgedAcceptedStatus22Choice.mmReason, AcknowledgedAcceptedStatus24Choice.mmReason, Reason16Choice.mmAcknowledgedAcceptedReason,
					ConditionallyAcceptedStatusReason3.mmReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AcknowledgedAcceptedReason";
			definition = "Specifies additional information about the processed instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AcknowledgementReasonCode.mmObject();
		}

		@Override
		public AcknowledgementReasonCode getValue(StatusReason obj) {
			return obj.getAcknowledgedAcceptedReason();
		}

		@Override
		public void setValue(StatusReason obj, AcknowledgementReasonCode value) {
			obj.setAcknowledgedAcceptedReason(value);
		}
	};
	protected RegisteredContract relatedClosureReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmClosureReason
	 * RegisteredContract.mmClosureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedClosureReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Related reason of closure of the contract. "</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<StatusReason, RegisteredContract> mmRelatedClosureReason = new MMBusinessAssociationEnd<StatusReason, RegisteredContract>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedClosureReason";
			definition = "Related reason of closure of the contract. ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> RegisteredContract.mmClosureReason;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> RegisteredContract.mmObject();
		}

		@Override
		public RegisteredContract getValue(StatusReason obj) {
			return obj.getRelatedClosureReason();
		}

		@Override
		public void setValue(StatusReason obj, RegisteredContract value) {
			obj.setRelatedClosureReason(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatusReason";
				definition = "Specifies the underlying reason for the status of an object.";
				associationDomain_lazy = () -> Arrays.asList(GenericIdentification.mmRelatedStatusReason, Status.mmStatusReason, RegisteredContract.mmClosureReason);
				derivationElement_lazy = () -> Arrays.asList(ProprietaryReason1.mmReason, ProprietaryReason4.mmReason, TransferUnmatchedStatus3Choice.mmReason, TransferUnmatchedStatus3Choice.mmExtendedReason,
						FailedSettlementStatus2Choice.mmDataSourceScheme, Status21Choice.mmRejected, Status21Choice.mmComplete, CancelledCompleteReason1.mmAdditionalReasonInformation, ClosedStatusReason1.mmCode,
						ProformaStatusReason1.mmCode, DisabledStatusReason1.mmCode, EnabledStatusReason1.mmCode, SuspendedStatusReason4.mmReason, InRepairStatusReason4.mmReason, CancellationStatusAndReason4.mmStatus,
						TransferReference12.mmReversalReason);
				subType_lazy = () -> Arrays.asList(SecuritiesTradeStatusReason.mmObject(), CorporateActionStatusReason.mmObject(), UndertakingStatusReason.mmObject(), MeetingStatusReason.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.StatusReason.mmStatus, com.tools20022.repository.entity.StatusReason.mmReason, com.tools20022.repository.entity.StatusReason.mmNoSpecifiedReason,
						com.tools20022.repository.entity.StatusReason.mmDataSourceScheme, com.tools20022.repository.entity.StatusReason.mmRejectedStatusReason, com.tools20022.repository.entity.StatusReason.mmFailingReason,
						com.tools20022.repository.entity.StatusReason.mmCancellationReason, com.tools20022.repository.entity.StatusReason.mmPendingReason, com.tools20022.repository.entity.StatusReason.mmRejectionReason,
						com.tools20022.repository.entity.StatusReason.mmAcknowledgedAcceptedReason, com.tools20022.repository.entity.StatusReason.mmRelatedClosureReason);
				derivationComponent_lazy = () -> Arrays.asList(ProprietaryReason1.mmObject(), NoSpecifiedReason1.mmObject(), ProprietaryReason4.mmObject(), TransferUnmatchedStatus3Choice.mmObject(),
						FailedSettlementStatus2Choice.mmObject(), CancellationPendingStatus7Choice.mmObject(), RejectedReason17Choice.mmObject(), CancelledCompleteReason1.mmObject(), RejectedReason16Choice.mmObject(),
						RejectedReason15Choice.mmObject(), ClosedStatusReason1.mmObject(), ProformaStatusReason1.mmObject(), DisabledStatusReason1.mmObject(), EnabledStatusReason1.mmObject(), SuspendedStatusReason4.mmObject(),
						BlockedReason2Choice.mmObject(), ConditionallyAcceptedStatusReason3.mmObject(), InRepairStatusReason4.mmObject(), PendingStatusReason14.mmObject(), PendingOpeningStatusReason1.mmObject(),
						ClosurePendingStatusReason1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return StatusReason.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Status> getStatus() {
		return status == null ? Optional.empty() : Optional.of(status);
	}

	public StatusReason setStatus(Status status) {
		this.status = status;
		return this;
	}

	public Max35Text getReason() {
		return reason;
	}

	public StatusReason setReason(Max35Text reason) {
		this.reason = Objects.requireNonNull(reason);
		return this;
	}

	public NoReasonCode getNoSpecifiedReason() {
		return noSpecifiedReason;
	}

	public StatusReason setNoSpecifiedReason(NoReasonCode noSpecifiedReason) {
		this.noSpecifiedReason = Objects.requireNonNull(noSpecifiedReason);
		return this;
	}

	public List<GenericIdentification> getDataSourceScheme() {
		return dataSourceScheme == null ? dataSourceScheme = new ArrayList<>() : dataSourceScheme;
	}

	public StatusReason setDataSourceScheme(List<GenericIdentification> dataSourceScheme) {
		this.dataSourceScheme = Objects.requireNonNull(dataSourceScheme);
		return this;
	}

	public RejectedStatusReasonCode getRejectedStatusReason() {
		return rejectedStatusReason;
	}

	public StatusReason setRejectedStatusReason(RejectedStatusReasonCode rejectedStatusReason) {
		this.rejectedStatusReason = Objects.requireNonNull(rejectedStatusReason);
		return this;
	}

	public PendingFailingReasonCode getFailingReason() {
		return failingReason;
	}

	public StatusReason setFailingReason(PendingFailingReasonCode failingReason) {
		this.failingReason = Objects.requireNonNull(failingReason);
		return this;
	}

	public CancelledStatusReasonV2Code getCancellationReason() {
		return cancellationReason;
	}

	public StatusReason setCancellationReason(CancelledStatusReasonV2Code cancellationReason) {
		this.cancellationReason = Objects.requireNonNull(cancellationReason);
		return this;
	}

	public PendingFailingReasonCode getPendingReason() {
		return pendingReason;
	}

	public StatusReason setPendingReason(PendingFailingReasonCode pendingReason) {
		this.pendingReason = Objects.requireNonNull(pendingReason);
		return this;
	}

	public RejectionReasonV2Code getRejectionReason() {
		return rejectionReason;
	}

	public StatusReason setRejectionReason(RejectionReasonV2Code rejectionReason) {
		this.rejectionReason = Objects.requireNonNull(rejectionReason);
		return this;
	}

	public AcknowledgementReasonCode getAcknowledgedAcceptedReason() {
		return acknowledgedAcceptedReason;
	}

	public StatusReason setAcknowledgedAcceptedReason(AcknowledgementReasonCode acknowledgedAcceptedReason) {
		this.acknowledgedAcceptedReason = Objects.requireNonNull(acknowledgedAcceptedReason);
		return this;
	}

	public RegisteredContract getRelatedClosureReason() {
		return relatedClosureReason;
	}

	public StatusReason setRelatedClosureReason(RegisteredContract relatedClosureReason) {
		this.relatedClosureReason = Objects.requireNonNull(relatedClosureReason);
		return this;
	}
}