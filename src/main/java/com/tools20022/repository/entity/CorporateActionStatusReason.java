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
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the underlying reason for a status of a corporate action.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionStatusReason"
 * src="doc-files/CorporateActionStatusReason.svg">
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
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmCorporateActionCancellationReason
 * CorporateActionStatusReason.mmCorporateActionCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmCorporateActionStatus
 * CorporateActionStatusReason.mmCorporateActionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmAcceptedReason
 * CorporateActionStatusReason.mmAcceptedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmReversalReason
 * CorporateActionStatusReason.mmReversalReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmMovementFailureReason
 * CorporateActionStatusReason.mmMovementFailureReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmMovementRejectionReason
 * CorporateActionStatusReason.mmMovementRejectionReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmCorporateActionStatusReason
 * CorporateActionStatus.mmCorporateActionStatusReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionReversalReason3#mmReason
 * CorporateActionReversalReason3.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AcceptedStatus8Choice#mmReason
 * AcceptedStatus8Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingStatus41Choice#mmReason
 * PendingStatus41Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus29Choice#mmDefaultAction
 * InstructionProcessingStatus29Choice.mmDefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus29Choice#mmStandingInstruction
 * InstructionProcessingStatus29Choice.mmStandingInstruction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionReason11FormatChoice
 * RejectionReason11FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionReason6FormatChoice
 * RejectionReason6FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionReason18FormatChoice
 * RejectionReason18FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionReason9FormatChoice
 * RejectionReason9FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionReason8FormatChoice
 * RejectionReason8FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionReason19FormatChoice
 * RejectionReason19FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FailedSettlementReason1FormatChoice
 * FailedSettlementReason1FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionReason13FormatChoice
 * RejectionReason13FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionReason14FormatChoice
 * RejectionReason14FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionReason15FormatChoice
 * RejectionReason15FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionReason20FormatChoice
 * RejectionReason20FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionReason10FormatChoice
 * RejectionReason10FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionReason12FormatChoice
 * RejectionReason12FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionReason7FormatChoice
 * RejectionReason7FormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionReversalReason3
 * CorporateActionReversalReason3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedReason14Choice
 * RejectedReason14Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancelledStatusReason12
 * CancelledStatusReason12}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancelledReason9Choice
 * CancelledReason9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AcceptedStatus8Choice
 * AcceptedStatus8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancelledStatus12Choice
 * CancelledStatus12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancelledStatus11Choice
 * CancelledStatus11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedStatus18Choice
 * RejectedStatus18Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionReversalReason3Choice
 * CorporateActionReversalReason3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancelledReason8Choice
 * CancelledReason8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatusReason18
 * RejectedStatusReason18}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingReason32Choice
 * PendingReason32Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingStatus41Choice
 * PendingStatus41Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptedStatusReason9
 * AcceptedStatusReason9}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AcceptedReason10Choice
 * AcceptedReason10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingStatusReason9
 * PendingStatusReason9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancelledStatusReason11
 * CancelledStatusReason11}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancelledReason12Choice
 * CancelledReason12Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus29Choice
 * InstructionProcessingStatus29Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason5Choice
 * PendingCancellationReason5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus7Choice
 * PendingCancellationStatus7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingReason48Choice
 * PendingReason48Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedStatus23Choice
 * RejectedStatus23Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingStatus52Choice
 * PendingStatus52Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason7
 * PendingCancellationStatusReason7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatusReason21
 * RejectedStatusReason21}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedReason22Choice
 * RejectedReason22Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingStatusReason13
 * PendingStatusReason13}</li>
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
 * "CorporateActionStatusReason"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the underlying reason for a status of a corporate action."</li>
 * </ul>
 */
public class CorporateActionStatusReason extends StatusReason {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionCancellationReasonCode corporateActionCancellationReason;
	/**
	 * Specifies reasons for cancellation of a corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionCancellationReasonCode
	 * CorporateActionCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation3#mmCancellationReasonCode
	 * CorporateActionCancellation3.mmCancellationReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation3#mmCancellationReason
	 * CorporateActionCancellation3.mmCancellationReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
	 * CorporateActionStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionCancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies reasons for cancellation of a corporate action event."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCorporateActionCancellationReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionCancellation3.mmCancellationReasonCode, CorporateActionCancellation3.mmCancellationReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionCancellationReason";
			definition = "Specifies reasons for cancellation of a corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionCancellationReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionStatusReason.class.getMethod("getCorporateActionCancellationReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionStatus corporateActionStatus;
	/**
	 * Corporate actions status for which a reason is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmCorporateActionStatusReason
	 * CorporateActionStatus.mmCorporateActionStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
	 * CorporateActionStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate actions status for which a reason is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCorporateActionStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionStatus";
			definition = "Corporate actions status for which a reason is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.mmCorporateActionStatusReason;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.mmObject();
		}
	};
	protected AcknowledgementReasonCode acceptedReason;
	/**
	 * Specifies additional information about the processed instruction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason9#mmReasonCode
	 * AcceptedStatusReason9.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason10Choice#mmCode
	 * AcceptedReason10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason10Choice#mmProprietary
	 * AcceptedReason10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus11Choice#mmAccepted
	 * InstructionCancellationRequestStatus11Choice.mmAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus29Choice#mmAcceptedForFurtherProcessing
	 * InstructionProcessingStatus29Choice.mmAcceptedForFurtherProcessing}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
	 * CorporateActionStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies additional information about the processed instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAcceptedReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AcceptedStatusReason9.mmReasonCode, AcceptedReason10Choice.mmCode, AcceptedReason10Choice.mmProprietary, InstructionCancellationRequestStatus11Choice.mmAccepted,
					InstructionProcessingStatus29Choice.mmAcceptedForFurtherProcessing);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AcceptedReason";
			definition = "Specifies additional information about the processed instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AcknowledgementReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionStatusReason.class.getMethod("getAcceptedReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionReversalReasonCode reversalReason;
	/**
	 * Reason for the reversal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReasonCode
	 * CorporateActionReversalReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionReversalReason3Choice#mmCode
	 * CorporateActionReversalReason3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionReversalReason3Choice#mmProprietary
	 * CorporateActionReversalReason3Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
	 * CorporateActionStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the reversal."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmReversalReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionReversalReason3Choice.mmCode, CorporateActionReversalReason3Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReversalReason";
			definition = "Reason for the reversal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionReversalReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionStatusReason.class.getMethod("getReversalReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FailedSettlementReasonCode movementFailureReason;
	/**
	 * The reason for the failure.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FailedSettlementReasonCode
	 * FailedSettlementReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailedSettlementReason1FormatChoice#mmCode
	 * FailedSettlementReason1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailedSettlementReason1FormatChoice#mmProprietary
	 * FailedSettlementReason1FormatChoice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FailedMovement1#mmReason
	 * FailedMovement1.mmReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
	 * CorporateActionStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementFailureReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The reason for the failure."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMovementFailureReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FailedSettlementReason1FormatChoice.mmCode, FailedSettlementReason1FormatChoice.mmProprietary, FailedMovement1.mmReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MovementFailureReason";
			definition = "The reason for the failure.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FailedSettlementReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionStatusReason.class.getMethod("getMovementFailureReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RejectionReasonCode movementRejectionReason;
	/**
	 * Provides information about the rejection status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
	 * CorporateActionStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementRejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information about the rejection status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMovementRejectionReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MovementRejectionReason";
			definition = "Provides information about the rejection status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RejectionReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionStatusReason.class.getMethod("getMovementRejectionReason", new Class[]{});
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
				name = "CorporateActionStatusReason";
				definition = "Specifies the underlying reason for a status of a corporate action.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionStatus.mmCorporateActionStatusReason);
				derivationElement_lazy = () -> Arrays.asList(CorporateActionReversalReason3.mmReason, AcceptedStatus8Choice.mmReason, PendingStatus41Choice.mmReason, InstructionProcessingStatus29Choice.mmDefaultAction,
						InstructionProcessingStatus29Choice.mmStandingInstruction);
				superType_lazy = () -> StatusReason.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionStatusReason.mmCorporateActionCancellationReason, com.tools20022.repository.entity.CorporateActionStatusReason.mmCorporateActionStatus,
						com.tools20022.repository.entity.CorporateActionStatusReason.mmAcceptedReason, com.tools20022.repository.entity.CorporateActionStatusReason.mmReversalReason,
						com.tools20022.repository.entity.CorporateActionStatusReason.mmMovementFailureReason, com.tools20022.repository.entity.CorporateActionStatusReason.mmMovementRejectionReason);
				derivationComponent_lazy = () -> Arrays.asList(RejectionReason11FormatChoice.mmObject(), RejectionReason6FormatChoice.mmObject(), RejectionReason18FormatChoice.mmObject(), RejectionReason9FormatChoice.mmObject(),
						RejectionReason8FormatChoice.mmObject(), RejectionReason19FormatChoice.mmObject(), FailedSettlementReason1FormatChoice.mmObject(), RejectionReason13FormatChoice.mmObject(), RejectionReason14FormatChoice.mmObject(),
						RejectionReason15FormatChoice.mmObject(), RejectionReason20FormatChoice.mmObject(), RejectionReason10FormatChoice.mmObject(), RejectionReason12FormatChoice.mmObject(), RejectionReason7FormatChoice.mmObject(),
						CorporateActionReversalReason3.mmObject(), RejectedReason14Choice.mmObject(), CancelledStatusReason12.mmObject(), CancelledReason9Choice.mmObject(), AcceptedStatus8Choice.mmObject(),
						CancelledStatus12Choice.mmObject(), CancelledStatus11Choice.mmObject(), RejectedStatus18Choice.mmObject(), CorporateActionReversalReason3Choice.mmObject(), CancelledReason8Choice.mmObject(),
						RejectedStatusReason18.mmObject(), PendingReason32Choice.mmObject(), PendingStatus41Choice.mmObject(), AcceptedStatusReason9.mmObject(), AcceptedReason10Choice.mmObject(), PendingStatusReason9.mmObject(),
						CancelledStatusReason11.mmObject(), CancelledReason12Choice.mmObject(), InstructionProcessingStatus29Choice.mmObject(), PendingCancellationReason5Choice.mmObject(), PendingCancellationStatus7Choice.mmObject(),
						PendingReason48Choice.mmObject(), RejectedStatus23Choice.mmObject(), PendingStatus52Choice.mmObject(), PendingCancellationStatusReason7.mmObject(), RejectedStatusReason21.mmObject(),
						RejectedReason22Choice.mmObject(), PendingStatusReason13.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionStatusReason.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionCancellationReasonCode getCorporateActionCancellationReason() {
		return corporateActionCancellationReason;
	}

	public void setCorporateActionCancellationReason(CorporateActionCancellationReasonCode corporateActionCancellationReason) {
		this.corporateActionCancellationReason = corporateActionCancellationReason;
	}

	public CorporateActionStatus getCorporateActionStatus() {
		return corporateActionStatus;
	}

	public void setCorporateActionStatus(com.tools20022.repository.entity.CorporateActionStatus corporateActionStatus) {
		this.corporateActionStatus = corporateActionStatus;
	}

	public AcknowledgementReasonCode getAcceptedReason() {
		return acceptedReason;
	}

	public void setAcceptedReason(AcknowledgementReasonCode acceptedReason) {
		this.acceptedReason = acceptedReason;
	}

	public CorporateActionReversalReasonCode getReversalReason() {
		return reversalReason;
	}

	public void setReversalReason(CorporateActionReversalReasonCode reversalReason) {
		this.reversalReason = reversalReason;
	}

	public FailedSettlementReasonCode getMovementFailureReason() {
		return movementFailureReason;
	}

	public void setMovementFailureReason(FailedSettlementReasonCode movementFailureReason) {
		this.movementFailureReason = movementFailureReason;
	}

	public RejectionReasonCode getMovementRejectionReason() {
		return movementRejectionReason;
	}

	public void setMovementRejectionReason(RejectionReasonCode movementRejectionReason) {
		this.movementRejectionReason = movementRejectionReason;
	}
}