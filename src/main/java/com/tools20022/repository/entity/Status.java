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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * The status of an instruction, advice or request.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Status" src="doc-files/Status.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Status#mmStatusReason
 * Status.mmStatusReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#mmStatusDateTime
 * Status.mmStatusDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#mmValidityTime
 * Status.mmValidityTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#mmStatusDescription
 * Status.mmStatusDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Status#mmInstructionProcessingStatus
 * Status.mmInstructionProcessingStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#mmPartyRole
 * Status.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#mmSettlementStatus
 * Status.mmSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Status#mmCancellationProcessingStatus
 * Status.mmCancellationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Status#mmTransactionProcessingStatus
 * Status.mmTransactionProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Status#mmModificationProcessingStatus
 * Status.mmModificationProcessingStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#mmStatus
 * DateTimePeriod.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StatusReason#mmStatus
 * StatusReason.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationPartyRole#mmStatus
 * InvestigationPartyRole.mmStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason1#mmProprietaryStatus
 * ProprietaryStatusAndReason1.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionProcessingStatus1#mmStatus
 * CorporateActionInstructionProcessingStatus1.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericValidationRuleIdentification1#mmIdentification
 * GenericValidationRuleIdentification1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ResponseStatus6Choice#mmRejected
 * ResponseStatus6Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ResponseStatus6Choice#mmPending
 * ResponseStatus6Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StatusOrStatement7Choice#mmStatusAdvice
 * StatusOrStatement7Choice.mmStatusAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason28#mmProcessingStatus
 * StatusAndReason28.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail6#mmProcessingStatus
 * StatusTrail6.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail6#mmModificationProcessingStatus
 * StatusTrail6.mmModificationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail6#mmCancellationStatus
 * StatusTrail6.mmCancellationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail6#mmSettled
 * StatusTrail6.mmSettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice#mmProprietary
 * ModificationProcessingStatus7Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason6#mmProprietaryStatus
 * ProprietaryStatusAndReason6.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status18Choice#mmProprietary
 * Status18Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason32#mmStatusAndReason
 * StatusAndReason32.mmStatusAndReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.AccountStatus AccountStatus}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemStatus SystemStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LimitStatus LimitStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
 * SecuritiesTradeStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CorporateActionStatus
 * CorporateActionStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesStatus
 * SecuritiesStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.UndertakingStatus
 * UndertakingStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MandateStatus MandateStatus}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
 * TreasuryTradeSettlementStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPaymentStatus
 * CardPaymentStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
 * SecuritiesOrderStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestigationCaseStatus
 * InvestigationCaseStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MeetingStatus MeetingStatus}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.CollateralStatus
 * CollateralStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus
 * InvoiceFinancingStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BaselineStatus
 * BaselineStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.QuoteStatus QuoteStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvoiceStatus InvoiceStatus}
 * </li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason1
 * ProprietaryStatusAndReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason10
 * StatusAndReason10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice
 * ReplacementProcessingStatus7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ReportItemStatus1Choice
 * ReportItemStatus1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericValidationRuleIdentification1
 * GenericValidationRuleIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ResponseStatus6Choice
 * ResponseStatus6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason28
 * StatusAndReason28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail6 StatusTrail6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice
 * ModificationProcessingStatus7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ResponseStatus5Choice
 * ResponseStatus5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus8Choice
 * ReplacementProcessingStatus8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason6
 * ProprietaryStatusAndReason6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RegistrationProcessingStatus3Choice
 * RegistrationProcessingStatus3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DeliveryReturn3Choice
 * DeliveryReturn3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status19Choice
 * Status19Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementConditionModificationStatus3Choice
 * SettlementConditionModificationStatus3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingDenied3Choice
 * MatchingDenied3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason32
 * StatusAndReason32}</li>
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
 * "Status"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "The status of an instruction, advice or request."</li>
 * </ul>
 */
public class Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.StatusReason> statusReason;
	/**
	 * Specifies the reasons for the status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmStatus
	 * StatusReason.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.StatusReason
	 * StatusReason}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason1#mmProprietaryReason
	 * ProprietaryStatusAndReason1.mmProprietaryReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReportItemStatus1Choice#mmAcceptedWithException
	 * ReportItemStatus1Choice.mmAcceptedWithException}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason6#mmProprietaryReason
	 * ProprietaryStatusAndReason6.mmProprietaryReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeliveryReturn3Choice#mmCode
	 * DeliveryReturn3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeliveryReturn3Choice#mmProprietary
	 * DeliveryReturn3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmUnmatched
	 * TransferStatus2Choice.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmInRepair
	 * TransferStatus2Choice.mmInRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmFailedSettlement
	 * TransferStatus2Choice.mmFailedSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmCancellationPending
	 * TransferStatus2Choice.mmCancellationPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status21Choice#mmPending
	 * Status21Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5#mmStatusReason
	 * AccountManagementStatusAndReason5.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#mmCancelled
	 * OrderStatus5Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#mmInRepair
	 * OrderStatus5Choice.mmInRepair}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatus2#mmEnabled
	 * AccountStatus2.mmEnabled}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatus2#mmDisabled
	 * AccountStatus2.mmDisabled}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatus2#mmPending
	 * AccountStatus2.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatus2#mmPendingOpening
	 * AccountStatus2.mmPendingOpening}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatus2#mmProforma
	 * AccountStatus2.mmProforma}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatus2#mmClosed
	 * AccountStatus2.mmClosed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatus2#mmClosurePending
	 * AccountStatus2.mmClosurePending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAccountStatus1#mmReason
	 * OtherAccountStatus1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#mmCancelled
	 * OrderStatus3Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus4Choice#mmCancelled
	 * OrderStatus4Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus4Choice#mmInRepair
	 * OrderStatus4Choice.mmInRepair}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reasons for the status."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmStatusReason = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(ProprietaryStatusAndReason1.mmProprietaryReason, ReportItemStatus1Choice.mmAcceptedWithException, ProprietaryStatusAndReason6.mmProprietaryReason, DeliveryReturn3Choice.mmCode,
					DeliveryReturn3Choice.mmProprietary, TransferStatus2Choice.mmUnmatched, TransferStatus2Choice.mmInRepair, TransferStatus2Choice.mmFailedSettlement, TransferStatus2Choice.mmCancellationPending, Status21Choice.mmPending,
					AccountManagementStatusAndReason5.mmStatusReason, OrderStatus5Choice.mmCancelled, OrderStatus5Choice.mmInRepair, AccountStatus2.mmEnabled, AccountStatus2.mmDisabled, AccountStatus2.mmPending,
					AccountStatus2.mmPendingOpening, AccountStatus2.mmProforma, AccountStatus2.mmClosed, AccountStatus2.mmClosurePending, OtherAccountStatus1.mmReason, OrderStatus3Choice.mmCancelled, OrderStatus4Choice.mmCancelled,
					OrderStatus4Choice.mmInRepair);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StatusReason";
			definition = "Specifies the reasons for the status.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.StatusReason.mmStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
		}
	};
	protected ISODateTime statusDateTime;
	/**
	 * Date and time at which the status was assigned.
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
	 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail6#mmStatusDate
	 * StatusTrail6.mmStatusDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmStatusDate
	 * InvestmentAccount62.mmStatusDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the status was assigned."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStatusDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(StatusTrail6.mmStatusDate, InvestmentAccount62.mmStatusDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StatusDateTime";
			definition = "Date and time at which the status was assigned.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Status.class.getMethod("getStatusDateTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DateTimePeriod validityTime;
	/**
	 * Period of time during which the status is valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmStatus
	 * DateTimePeriod.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period of time during which the status is valid."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmValidityTime = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidityTime";
			definition = "Period of time during which the status is valid.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected Max350Text statusDescription;
	/**
	 * Specifies the state or the condition.
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
	 * {@linkplain com.tools20022.repository.msg.CancellationProcessingStatus1#mmAdditionalInformation
	 * CancellationProcessingStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionProcessingStatus1#mmAdditionalInformation
	 * CorporateActionInstructionProcessingStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionRejectionStatus1#mmAdditionalInformation
	 * CorporateActionInstructionRejectionStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellationProcessingStatus1#mmAdditionalInformation
	 * CorporateActionCancellationProcessingStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellationRejectionStatus1#mmAdditionalInformation
	 * CorporateActionCancellationRejectionStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmendmentProcessingStatus1#mmAdditionalInformation
	 * CorporateActionAmendmentProcessingStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmendmentRejectionStatus1#mmAdditionalInformation
	 * CorporateActionAmendmentRejectionStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementProcessingStatus1#mmAdditionalInformation
	 * CorporateActionMovementProcessingStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementRejectionStatus1#mmAdditionalInformation
	 * CorporateActionMovementRejectionStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporationActionMovementProcessingStatus2#mmAdditionalInformation
	 * CorporationActionMovementProcessingStatus2.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementRejectionStatus2#mmAdditionalInformation
	 * CorporateActionMovementRejectionStatus2.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformationProcessingStatus1#mmAdditionalInformation
	 * CorporateActionInformationProcessingStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformationRejectedStatus1#mmAdditionalInformation
	 * CorporateActionInformationRejectedStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionProcessingStatus1#mmAdditionalInformation
	 * CorporateActionStandingInstructionProcessingStatus1.
	 * mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionRejectionStatus1#mmAdditionalInformation
	 * CorporateActionStandingInstructionRejectionStatus1.
	 * mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionCancellationProcessingStatus1#mmAdditionalInformation
	 * CorporateActionStandingInstructionCancellationProcessingStatus1.
	 * mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionCancellationRejectionStatus1#mmAdditionalInformation
	 * CorporateActionStandingInstructionCancellationRejectionStatus1.
	 * mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionProcessingStatus1#mmAdditionalInformation
	 * CorporateActionDeactivationInstructionProcessingStatus1.
	 * mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionRejectionStatus1#mmAdditionalInformation
	 * CorporateActionDeactivationInstructionRejectionStatus1.
	 * mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationCancellationProcessingStatus1#mmAdditionalInformation
	 * CorporateActionDeactivationCancellationProcessingStatus1.
	 * mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationCancellationRejectionStatus1#mmAdditionalInformation
	 * CorporateActionDeactivationCancellationRejectionStatus1.
	 * mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralCancellationStatus1#mmAdditionalInformation
	 * CollateralCancellationStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericValidationRuleIdentification1#mmDescription
	 * GenericValidationRuleIdentification1.mmDescription}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the state or the condition."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStatusDescription = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CancellationProcessingStatus1.mmAdditionalInformation, CorporateActionInstructionProcessingStatus1.mmAdditionalInformation,
					CorporateActionInstructionRejectionStatus1.mmAdditionalInformation, CorporateActionCancellationProcessingStatus1.mmAdditionalInformation, CorporateActionCancellationRejectionStatus1.mmAdditionalInformation,
					CorporateActionAmendmentProcessingStatus1.mmAdditionalInformation, CorporateActionAmendmentRejectionStatus1.mmAdditionalInformation, CorporateActionMovementProcessingStatus1.mmAdditionalInformation,
					CorporateActionMovementRejectionStatus1.mmAdditionalInformation, CorporationActionMovementProcessingStatus2.mmAdditionalInformation, CorporateActionMovementRejectionStatus2.mmAdditionalInformation,
					CorporateActionInformationProcessingStatus1.mmAdditionalInformation, CorporateActionInformationRejectedStatus1.mmAdditionalInformation, CorporateActionStandingInstructionProcessingStatus1.mmAdditionalInformation,
					CorporateActionStandingInstructionRejectionStatus1.mmAdditionalInformation, CorporateActionStandingInstructionCancellationProcessingStatus1.mmAdditionalInformation,
					CorporateActionStandingInstructionCancellationRejectionStatus1.mmAdditionalInformation, CorporateActionDeactivationInstructionProcessingStatus1.mmAdditionalInformation,
					CorporateActionDeactivationInstructionRejectionStatus1.mmAdditionalInformation, CorporateActionDeactivationCancellationProcessingStatus1.mmAdditionalInformation,
					CorporateActionDeactivationCancellationRejectionStatus1.mmAdditionalInformation, CollateralCancellationStatus1.mmAdditionalInformation, GenericValidationRuleIdentification1.mmDescription);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StatusDescription";
			definition = "Specifies the state or the condition.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Status.class.getMethod("getStatusDescription", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected StatusCode instructionProcessingStatus;
	/**
	 * Status of the processing of an instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.StatusCode
	 * StatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralCancellationStatus1#mmCollateralStatusCode
	 * CollateralCancellationStatus1.mmCollateralStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubstitutionResponse1#mmResponseType
	 * SubstitutionResponse1.mmResponseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestResponse1#mmResponseType
	 * InterestResponse1.mmResponseType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmStatus
	 * TradeLeg8.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionTypeStatus2Choice#mmInstructionStatus
	 * InstructionTypeStatus2Choice.mmInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus5Choice#mmGlobalInstructionStatus
	 * InstructionStatus5Choice.mmGlobalInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus5Choice#mmDetailedInstructionStatus
	 * InstructionStatus5Choice.mmDetailedInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus6Choice#mmProcessingStatus
	 * InstructionStatus6Choice.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus11#mmInstructionStatus
	 * DetailedInstructionStatus11.mmInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionProcessingStatus3#mmStatus
	 * InstructionProcessingStatus3.mmStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the processing of an instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInstructionProcessingStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CollateralCancellationStatus1.mmCollateralStatusCode, SubstitutionResponse1.mmResponseType, InterestResponse1.mmResponseType, TradeLeg8.mmStatus,
					InstructionTypeStatus2Choice.mmInstructionStatus, InstructionStatus5Choice.mmGlobalInstructionStatus, InstructionStatus5Choice.mmDetailedInstructionStatus, InstructionStatus6Choice.mmProcessingStatus,
					DetailedInstructionStatus11.mmInstructionStatus, InstructionProcessingStatus3.mmStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructionProcessingStatus";
			definition = "Status of the processing of an instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Status.class.getMethod("getInstructionProcessingStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestigationPartyRole partyRole;
	/**
	 * Role played by a party in the context of assigning a status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationPartyRole#mmStatus
	 * InvestigationPartyRole.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationPartyRole
	 * InvestigationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Role played by a party in the context of assigning a status."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Role played by a party in the context of assigning a status.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestigationPartyRole.mmStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestigationPartyRole.mmObject();
		}
	};
	protected SecuritiesSettlementStatusCode settlementStatus;
	/**
	 * Status of settlement of a transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesSettlementStatusCode
	 * SecuritiesSettlementStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason28#mmSettlementStatus
	 * StatusAndReason28.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail6#mmSettlementStatus
	 * StatusTrail6.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status18Choice#mmSettlementStatus
	 * Status18Choice.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmSettlementStatus
	 * Status19Choice.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus19Choice#mmCode
	 * SettlementStatus19Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus19Choice#mmProprietary
	 * SettlementStatus19Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of settlement of a transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSettlementStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(StatusAndReason28.mmSettlementStatus, StatusTrail6.mmSettlementStatus, Status18Choice.mmSettlementStatus, Status19Choice.mmSettlementStatus, SettlementStatus19Choice.mmCode,
					SettlementStatus19Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementStatus";
			definition = "Status of settlement of a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecuritiesSettlementStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Status.class.getMethod("getSettlementStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CancellationProcessingStatusCode cancellationProcessingStatus;
	/**
	 * Specifies the status of a cancellation request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatusCode
	 * CancellationProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmCancellationProcessingStatus
	 * Status19Choice.mmCancellationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus7Choice#mmCode
	 * CancellationProcessingStatus7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus7Choice#mmProprietary
	 * CancellationProcessingStatus7Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of a cancellation request."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCancellationProcessingStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Status19Choice.mmCancellationProcessingStatus, CancellationProcessingStatus7Choice.mmCode, CancellationProcessingStatus7Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationProcessingStatus";
			definition = "Specifies the status of a cancellation request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancellationProcessingStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Status.class.getMethod("getCancellationProcessingStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InstructionProcessingStatusCode transactionProcessingStatus;
	/**
	 * Status of processing of a transaction at account servicer level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmAccepted
	 * ReplacementProcessingStatus7Choice.mmAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmCompleted
	 * ReplacementProcessingStatus7Choice.mmCompleted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmDenied
	 * ReplacementProcessingStatus7Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmInRepair
	 * ReplacementProcessingStatus7Choice.mmInRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmPartialReplacementAccepted
	 * ReplacementProcessingStatus7Choice.mmPartialReplacementAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmPending
	 * ReplacementProcessingStatus7Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmReceivedAtIntermediary
	 * ReplacementProcessingStatus7Choice.mmReceivedAtIntermediary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmReceivedAtStockExchange
	 * ReplacementProcessingStatus7Choice.mmReceivedAtStockExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmRejected
	 * ReplacementProcessingStatus7Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmModificationRequested
	 * ReplacementProcessingStatus7Choice.mmModificationRequested}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmProprietaryStatus
	 * ReplacementProcessingStatus7Choice.mmProprietaryStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReportItemStatus1Choice#mmRejected
	 * ReportItemStatus1Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status18Choice#mmInstructionProcessingStatus
	 * Status18Choice.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus23Choice#mmCode
	 * InstructionProcessingStatus23Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus23Choice#mmProprietary
	 * InstructionProcessingStatus23Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmInstructionProcessingStatus
	 * Status19Choice.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmRegistrationProcessingStatus
	 * Status19Choice.mmRegistrationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmReplacementProcessingStatus
	 * Status19Choice.mmReplacementProcessingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of processing of a transaction at account servicer level."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTransactionProcessingStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ReplacementProcessingStatus7Choice.mmAccepted, ReplacementProcessingStatus7Choice.mmCompleted, ReplacementProcessingStatus7Choice.mmDenied, ReplacementProcessingStatus7Choice.mmInRepair,
					ReplacementProcessingStatus7Choice.mmPartialReplacementAccepted, ReplacementProcessingStatus7Choice.mmPending, ReplacementProcessingStatus7Choice.mmReceivedAtIntermediary,
					ReplacementProcessingStatus7Choice.mmReceivedAtStockExchange, ReplacementProcessingStatus7Choice.mmRejected, ReplacementProcessingStatus7Choice.mmModificationRequested,
					ReplacementProcessingStatus7Choice.mmProprietaryStatus, ReportItemStatus1Choice.mmRejected, Status18Choice.mmInstructionProcessingStatus, InstructionProcessingStatus23Choice.mmCode,
					InstructionProcessingStatus23Choice.mmProprietary, Status19Choice.mmInstructionProcessingStatus, Status19Choice.mmRegistrationProcessingStatus, Status19Choice.mmReplacementProcessingStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionProcessingStatus";
			definition = "Status of processing of a transaction at account servicer level.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InstructionProcessingStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Status.class.getMethod("getTransactionProcessingStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ModificationProcessingStatusCode modificationProcessingStatus;
	/**
	 * Provides the status of a modification request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationProcessingStatusCode
	 * ModificationProcessingStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of a modification request."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmModificationProcessingStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationProcessingStatus";
			definition = "Provides the status of a modification request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ModificationProcessingStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Status.class.getMethod("getModificationProcessingStatus", new Class[]{});
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
				name = "Status";
				definition = "The status of an instruction, advice or request.";
				associationDomain_lazy = () -> Arrays
						.asList(com.tools20022.repository.entity.DateTimePeriod.mmStatus, com.tools20022.repository.entity.StatusReason.mmStatus, com.tools20022.repository.entity.InvestigationPartyRole.mmStatus);
				derivationElement_lazy = () -> Arrays.asList(ProprietaryStatusAndReason1.mmProprietaryStatus, CorporateActionInstructionProcessingStatus1.mmStatus, GenericValidationRuleIdentification1.mmIdentification,
						ResponseStatus6Choice.mmRejected, ResponseStatus6Choice.mmPending, StatusOrStatement7Choice.mmStatusAdvice, StatusAndReason28.mmProcessingStatus, StatusTrail6.mmProcessingStatus,
						StatusTrail6.mmModificationProcessingStatus, StatusTrail6.mmCancellationStatus, StatusTrail6.mmSettled, ModificationProcessingStatus7Choice.mmProprietary, ProprietaryStatusAndReason6.mmProprietaryStatus,
						Status18Choice.mmProprietary, StatusAndReason32.mmStatusAndReason);
				subType_lazy = () -> Arrays.asList(AccountStatus.mmObject(), PaymentStatus.mmObject(), SystemStatus.mmObject(), LimitStatus.mmObject(), SecuritiesTradeStatus.mmObject(), CorporateActionStatus.mmObject(),
						SecuritiesStatus.mmObject(), UndertakingStatus.mmObject(), MandateStatus.mmObject(), TreasuryTradeSettlementStatus.mmObject(), CardPaymentStatus.mmObject(), SecuritiesOrderStatus.mmObject(),
						InvestigationCaseStatus.mmObject(), MeetingStatus.mmObject(), CollateralStatus.mmObject(), InvoiceFinancingStatus.mmObject(), BaselineStatus.mmObject(), QuoteStatus.mmObject(), InvoiceStatus.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Status.mmStatusReason, com.tools20022.repository.entity.Status.mmStatusDateTime, com.tools20022.repository.entity.Status.mmValidityTime,
						com.tools20022.repository.entity.Status.mmStatusDescription, com.tools20022.repository.entity.Status.mmInstructionProcessingStatus, com.tools20022.repository.entity.Status.mmPartyRole,
						com.tools20022.repository.entity.Status.mmSettlementStatus, com.tools20022.repository.entity.Status.mmCancellationProcessingStatus, com.tools20022.repository.entity.Status.mmTransactionProcessingStatus,
						com.tools20022.repository.entity.Status.mmModificationProcessingStatus);
				derivationComponent_lazy = () -> Arrays.asList(ProprietaryStatusAndReason1.mmObject(), StatusAndReason10.mmObject(), ReplacementProcessingStatus7Choice.mmObject(), ReportItemStatus1Choice.mmObject(),
						GenericValidationRuleIdentification1.mmObject(), ResponseStatus6Choice.mmObject(), StatusAndReason28.mmObject(), StatusTrail6.mmObject(), ModificationProcessingStatus7Choice.mmObject(),
						ResponseStatus5Choice.mmObject(), ReplacementProcessingStatus8Choice.mmObject(), ProprietaryStatusAndReason6.mmObject(), RegistrationProcessingStatus3Choice.mmObject(), DeliveryReturn3Choice.mmObject(),
						Status19Choice.mmObject(), SettlementConditionModificationStatus3Choice.mmObject(), MatchingDenied3Choice.mmObject(), StatusAndReason32.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Status.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<StatusReason> getStatusReason() {
		return statusReason;
	}

	public void setStatusReason(List<com.tools20022.repository.entity.StatusReason> statusReason) {
		this.statusReason = statusReason;
	}

	public ISODateTime getStatusDateTime() {
		return statusDateTime;
	}

	public void setStatusDateTime(ISODateTime statusDateTime) {
		this.statusDateTime = statusDateTime;
	}

	public DateTimePeriod getValidityTime() {
		return validityTime;
	}

	public void setValidityTime(com.tools20022.repository.entity.DateTimePeriod validityTime) {
		this.validityTime = validityTime;
	}

	public Max350Text getStatusDescription() {
		return statusDescription;
	}

	public void setStatusDescription(Max350Text statusDescription) {
		this.statusDescription = statusDescription;
	}

	public StatusCode getInstructionProcessingStatus() {
		return instructionProcessingStatus;
	}

	public void setInstructionProcessingStatus(StatusCode instructionProcessingStatus) {
		this.instructionProcessingStatus = instructionProcessingStatus;
	}

	public InvestigationPartyRole getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(com.tools20022.repository.entity.InvestigationPartyRole partyRole) {
		this.partyRole = partyRole;
	}

	public SecuritiesSettlementStatusCode getSettlementStatus() {
		return settlementStatus;
	}

	public void setSettlementStatus(SecuritiesSettlementStatusCode settlementStatus) {
		this.settlementStatus = settlementStatus;
	}

	public CancellationProcessingStatusCode getCancellationProcessingStatus() {
		return cancellationProcessingStatus;
	}

	public void setCancellationProcessingStatus(CancellationProcessingStatusCode cancellationProcessingStatus) {
		this.cancellationProcessingStatus = cancellationProcessingStatus;
	}

	public InstructionProcessingStatusCode getTransactionProcessingStatus() {
		return transactionProcessingStatus;
	}

	public void setTransactionProcessingStatus(InstructionProcessingStatusCode transactionProcessingStatus) {
		this.transactionProcessingStatus = transactionProcessingStatus;
	}

	public ModificationProcessingStatusCode getModificationProcessingStatus() {
		return modificationProcessingStatus;
	}

	public void setModificationProcessingStatus(ModificationProcessingStatusCode modificationProcessingStatus) {
		this.modificationProcessingStatus = modificationProcessingStatus;
	}
}