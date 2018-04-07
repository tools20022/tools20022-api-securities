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

import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.entity.InvestigationPartyRole;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

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
 * {@linkplain com.tools20022.repository.msg.StatusAndReason34#mmStatusAndReason
 * StatusAndReason34.mmStatusAndReason}</li>
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
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason34
 * StatusAndReason34}</li>
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
 * "Status"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "The status of an instruction, advice or request."</li>
 * </ul>
 */
public class Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<StatusReason> statusReason;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Status, List<StatusReason>> mmStatusReason = new MMBusinessAssociationEnd<Status, List<StatusReason>>() {
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
			opposite_lazy = () -> StatusReason.mmStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> StatusReason.mmObject();
		}

		@Override
		public List<StatusReason> getValue(Status obj) {
			return obj.getStatusReason();
		}

		@Override
		public void setValue(Status obj, List<StatusReason> value) {
			obj.setStatusReason(value);
		}
	};
	protected ISODateTime statusDateTime;
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
	public static final MMBusinessAttribute<Status, ISODateTime> mmStatusDateTime = new MMBusinessAttribute<Status, ISODateTime>() {
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

		@Override
		public ISODateTime getValue(Status obj) {
			return obj.getStatusDateTime();
		}

		@Override
		public void setValue(Status obj, ISODateTime value) {
			obj.setStatusDateTime(value);
		}
	};
	protected DateTimePeriod validityTime;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=SampleData, SampleData=<?xml version="1.0"
	 * encoding="UTF-8"?> <InstanceInfo> <key KeyValue="Sample1"/> <key
	 * KeyValue="Sample2"/> <key KeyValue="Sample3"/> <key KeyValue="Sample4"/>
	 * <key KeyValue="Sample5"/> <key KeyValue="Sample6"/> <key
	 * KeyValue="Sample7"/> <key KeyValue="Sample8"/> <key KeyValue="Sample9"/>
	 * <key KeyValue="Sample10"/> </InstanceInfo>
	 * 
	 * 
	 * </li>
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
	public static final MMBusinessAssociationEnd<Status, DateTimePeriod> mmValidityTime = new MMBusinessAssociationEnd<Status, DateTimePeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			semanticMarkup_lazy = () -> Arrays
					.asList(new OtherSemanticMarkup(
							this,
							"SampleData",
							new String[]{
									"SampleData",
									"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<InstanceInfo>\n<key KeyValue=\"Sample1\"/>\n<key KeyValue=\"Sample2\"/>\n<key KeyValue=\"Sample3\"/>\n<key KeyValue=\"Sample4\"/>\n<key KeyValue=\"Sample5\"/>\n<key KeyValue=\"Sample6\"/>\n<key KeyValue=\"Sample7\"/>\n<key KeyValue=\"Sample8\"/>\n<key KeyValue=\"Sample9\"/>\n<key KeyValue=\"Sample10\"/>\n</InstanceInfo>\n\n\n"}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidityTime";
			definition = "Period of time during which the status is valid.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(Status obj) {
			return obj.getValidityTime();
		}

		@Override
		public void setValue(Status obj, DateTimePeriod value) {
			obj.setValidityTime(value);
		}
	};
	protected Max350Text statusDescription;
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
	public static final MMBusinessAttribute<Status, Max350Text> mmStatusDescription = new MMBusinessAttribute<Status, Max350Text>() {
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

		@Override
		public Max350Text getValue(Status obj) {
			return obj.getStatusDescription();
		}

		@Override
		public void setValue(Status obj, Max350Text value) {
			obj.setStatusDescription(value);
		}
	};
	protected StatusCode instructionProcessingStatus;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Status, StatusCode> mmInstructionProcessingStatus = new MMBusinessAttribute<Status, StatusCode>() {
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

		@Override
		public StatusCode getValue(Status obj) {
			return obj.getInstructionProcessingStatus();
		}

		@Override
		public void setValue(Status obj, StatusCode value) {
			obj.setInstructionProcessingStatus(value);
		}
	};
	protected InvestigationPartyRole partyRole;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Status, InvestigationPartyRole> mmPartyRole = new MMBusinessAssociationEnd<Status, InvestigationPartyRole>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Role played by a party in the context of assigning a status.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> InvestigationPartyRole.mmStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestigationPartyRole.mmObject();
		}

		@Override
		public InvestigationPartyRole getValue(Status obj) {
			return obj.getPartyRole();
		}

		@Override
		public void setValue(Status obj, InvestigationPartyRole value) {
			obj.setPartyRole(value);
		}
	};
	protected SecuritiesSettlementStatusCode settlementStatus;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Status, SecuritiesSettlementStatusCode> mmSettlementStatus = new MMBusinessAttribute<Status, SecuritiesSettlementStatusCode>() {
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

		@Override
		public SecuritiesSettlementStatusCode getValue(Status obj) {
			return obj.getSettlementStatus();
		}

		@Override
		public void setValue(Status obj, SecuritiesSettlementStatusCode value) {
			obj.setSettlementStatus(value);
		}
	};
	protected CancellationProcessingStatusCode cancellationProcessingStatus;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Status, CancellationProcessingStatusCode> mmCancellationProcessingStatus = new MMBusinessAttribute<Status, CancellationProcessingStatusCode>() {
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

		@Override
		public CancellationProcessingStatusCode getValue(Status obj) {
			return obj.getCancellationProcessingStatus();
		}

		@Override
		public void setValue(Status obj, CancellationProcessingStatusCode value) {
			obj.setCancellationProcessingStatus(value);
		}
	};
	protected InstructionProcessingStatusCode transactionProcessingStatus;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Status, InstructionProcessingStatusCode> mmTransactionProcessingStatus = new MMBusinessAttribute<Status, InstructionProcessingStatusCode>() {
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

		@Override
		public InstructionProcessingStatusCode getValue(Status obj) {
			return obj.getTransactionProcessingStatus();
		}

		@Override
		public void setValue(Status obj, InstructionProcessingStatusCode value) {
			obj.setTransactionProcessingStatus(value);
		}
	};
	protected ModificationProcessingStatusCode modificationProcessingStatus;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Status, ModificationProcessingStatusCode> mmModificationProcessingStatus = new MMBusinessAttribute<Status, ModificationProcessingStatusCode>() {
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

		@Override
		public ModificationProcessingStatusCode getValue(Status obj) {
			return obj.getModificationProcessingStatus();
		}

		@Override
		public void setValue(Status obj, ModificationProcessingStatusCode value) {
			obj.setModificationProcessingStatus(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Status";
				definition = "The status of an instruction, advice or request.";
				associationDomain_lazy = () -> Arrays.asList(DateTimePeriod.mmStatus, StatusReason.mmStatus, InvestigationPartyRole.mmStatus);
				derivationElement_lazy = () -> Arrays.asList(ProprietaryStatusAndReason1.mmProprietaryStatus, CorporateActionInstructionProcessingStatus1.mmStatus, GenericValidationRuleIdentification1.mmIdentification,
						ResponseStatus6Choice.mmRejected, ResponseStatus6Choice.mmPending, StatusOrStatement7Choice.mmStatusAdvice, StatusAndReason28.mmProcessingStatus, StatusTrail6.mmProcessingStatus,
						StatusTrail6.mmModificationProcessingStatus, StatusTrail6.mmCancellationStatus, StatusTrail6.mmSettled, ModificationProcessingStatus7Choice.mmProprietary, ProprietaryStatusAndReason6.mmProprietaryStatus,
						Status18Choice.mmProprietary, StatusAndReason34.mmStatusAndReason);
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
						Status19Choice.mmObject(), SettlementConditionModificationStatus3Choice.mmObject(), MatchingDenied3Choice.mmObject(), StatusAndReason34.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Status.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<StatusReason> getStatusReason() {
		return statusReason == null ? statusReason = new ArrayList<>() : statusReason;
	}

	public Status setStatusReason(List<StatusReason> statusReason) {
		this.statusReason = Objects.requireNonNull(statusReason);
		return this;
	}

	public ISODateTime getStatusDateTime() {
		return statusDateTime;
	}

	public Status setStatusDateTime(ISODateTime statusDateTime) {
		this.statusDateTime = Objects.requireNonNull(statusDateTime);
		return this;
	}

	public DateTimePeriod getValidityTime() {
		return validityTime;
	}

	public Status setValidityTime(DateTimePeriod validityTime) {
		this.validityTime = Objects.requireNonNull(validityTime);
		return this;
	}

	public Max350Text getStatusDescription() {
		return statusDescription;
	}

	public Status setStatusDescription(Max350Text statusDescription) {
		this.statusDescription = Objects.requireNonNull(statusDescription);
		return this;
	}

	public StatusCode getInstructionProcessingStatus() {
		return instructionProcessingStatus;
	}

	public Status setInstructionProcessingStatus(StatusCode instructionProcessingStatus) {
		this.instructionProcessingStatus = Objects.requireNonNull(instructionProcessingStatus);
		return this;
	}

	public InvestigationPartyRole getPartyRole() {
		return partyRole;
	}

	public Status setPartyRole(InvestigationPartyRole partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}

	public SecuritiesSettlementStatusCode getSettlementStatus() {
		return settlementStatus;
	}

	public Status setSettlementStatus(SecuritiesSettlementStatusCode settlementStatus) {
		this.settlementStatus = Objects.requireNonNull(settlementStatus);
		return this;
	}

	public CancellationProcessingStatusCode getCancellationProcessingStatus() {
		return cancellationProcessingStatus;
	}

	public Status setCancellationProcessingStatus(CancellationProcessingStatusCode cancellationProcessingStatus) {
		this.cancellationProcessingStatus = Objects.requireNonNull(cancellationProcessingStatus);
		return this;
	}

	public InstructionProcessingStatusCode getTransactionProcessingStatus() {
		return transactionProcessingStatus;
	}

	public Status setTransactionProcessingStatus(InstructionProcessingStatusCode transactionProcessingStatus) {
		this.transactionProcessingStatus = Objects.requireNonNull(transactionProcessingStatus);
		return this;
	}

	public ModificationProcessingStatusCode getModificationProcessingStatus() {
		return modificationProcessingStatus;
	}

	public Status setModificationProcessingStatus(ModificationProcessingStatusCode modificationProcessingStatus) {
		this.modificationProcessingStatus = Objects.requireNonNull(modificationProcessingStatus);
		return this;
	}
}