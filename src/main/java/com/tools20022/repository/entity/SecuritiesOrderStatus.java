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
import com.tools20022.repository.entity.InvestmentFundOrder;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.entity.SecuritiesQuantity;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Status of a securities order or of the processing of a securities order.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesOrderStatus"
 * src="doc-files/SecuritiesOrderStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmConfirmationRejectedStatusReason
 * SecuritiesOrderStatus.mmConfirmationRejectedStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmConfirmationStatus
 * SecuritiesOrderStatus.mmConfirmationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmCancellationStatus
 * SecuritiesOrderStatus.mmCancellationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmPartiallySettledStatusReason
 * SecuritiesOrderStatus.mmPartiallySettledStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmSuspendedStatusReason
 * SecuritiesOrderStatus.mmSuspendedStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmListOrderStatus
 * SecuritiesOrderStatus.mmListOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmSecuritiesOrder
 * SecuritiesOrderStatus.mmSecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmInvestmentFundOrder
 * SecuritiesOrderStatus.mmInvestmentFundOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmCumulativeQuantity
 * SecuritiesOrderStatus.mmCumulativeQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmRemainingQuantity
 * SecuritiesOrderStatus.mmRemainingQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmConditionallyAcceptedStatus
 * SecuritiesOrderStatus.mmConditionallyAcceptedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmOrderStatus
 * SecuritiesOrderStatus.mmOrderStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderStatus
 * InvestmentFundOrder.mmOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedOrderStatus
 * SecuritiesQuantity.mmRelatedOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesOrderStatus
 * SecuritiesQuantity.mmSecuritiesOrderStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmStatus
 * SecuritiesOrder.mmStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#mmRejected
 * OrderStatus5Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ConfirmationStatus1Choice#mmAmendmentRejected
 * ConfirmationStatus1Choice.mmAmendmentRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#mmRejected
 * OrderStatus3Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OrderStatus4Choice#mmRejected
 * OrderStatus4Choice.mmRejected}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.InRepairStatus4Choice
 * InRepairStatus4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SuspendedStatusReason4Choice
 * SuspendedStatusReason4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ConditionallyAcceptedStatus3Choice
 * ConditionallyAcceptedStatus3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatus9
 * RejectedStatus9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartiallySettledStatus10
 * PartiallySettledStatus10}</li>
 * <li>{@linkplain com.tools20022.repository.choice.InRepairStatusReason4Choice
 * InRepairStatusReason4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ConfirmationStatus1Choice
 * ConfirmationStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationRejectedStatus2
 * ConfirmationRejectedStatus2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7
 * IndividualOrderStatusAndReason7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrderStatusAndReason10
 * OrderStatusAndReason10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrderStatusAndReason9
 * OrderStatusAndReason9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason8
 * IndividualOrderStatusAndReason8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatus10
 * RejectedStatus10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ConfirmationRejectedReason1Choice
 * ConfirmationRejectedReason1Choice}</li>
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
 * "SecuritiesOrderStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status of a securities order or of the processing of a securities order."</li>
 * </ul>
 */
public class SecuritiesOrderStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected RejectedConfirmationStatusReasonCode confirmationRejectedStatusReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConfirmationStatus1Choice#mmConfirmationRejected
	 * ConfirmationStatus1Choice.mmConfirmationRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationRejectedStatus2#mmReason
	 * ConfirmationRejectedStatus2.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConfirmationRejectedReason1Choice#mmCode
	 * ConfirmationRejectedReason1Choice.mmCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationRejectedStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason for a confirmation rejected status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderStatus, RejectedConfirmationStatusReasonCode> mmConfirmationRejectedStatusReason = new MMBusinessAttribute<SecuritiesOrderStatus, RejectedConfirmationStatusReasonCode>() {
		{
			derivation_lazy = () -> Arrays.asList(ConfirmationStatus1Choice.mmConfirmationRejected, ConfirmationRejectedStatus2.mmReason, ConfirmationRejectedReason1Choice.mmCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConfirmationRejectedStatusReason";
			definition = "Specifies the reason for a confirmation rejected status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
		}

		@Override
		public RejectedConfirmationStatusReasonCode getValue(SecuritiesOrderStatus obj) {
			return obj.getConfirmationRejectedStatusReason();
		}

		@Override
		public void setValue(SecuritiesOrderStatus obj, RejectedConfirmationStatusReasonCode value) {
			obj.setConfirmationRejectedStatusReason(value);
		}
	};
	protected OrderConfirmationStatusCode confirmationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderConfirmationStatusCode
	 * OrderConfirmationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConfirmationStatus1Choice#mmStatus
	 * ConfirmationStatus1Choice.mmStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the confirmation of a status order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderStatus, OrderConfirmationStatusCode> mmConfirmationStatus = new MMBusinessAttribute<SecuritiesOrderStatus, OrderConfirmationStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(ConfirmationStatus1Choice.mmStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConfirmationStatus";
			definition = "Status of the confirmation of a status order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderConfirmationStatusCode.mmObject();
		}

		@Override
		public OrderConfirmationStatusCode getValue(SecuritiesOrderStatus obj) {
			return obj.getConfirmationStatus();
		}

		@Override
		public void setValue(SecuritiesOrderStatus obj, OrderConfirmationStatusCode value) {
			obj.setConfirmationStatus(value);
		}
	};
	protected OrderCancellationStatusCode cancellationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderCancellationStatusCode
	 * OrderCancellationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus22Choice#mmStatus
	 * CancellationStatus22Choice.mmStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the cancellation of a securities order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderStatus, OrderCancellationStatusCode> mmCancellationStatus = new MMBusinessAttribute<SecuritiesOrderStatus, OrderCancellationStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CancellationStatus22Choice.mmStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationStatus";
			definition = "Status of the cancellation of a securities order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderCancellationStatusCode.mmObject();
		}

		@Override
		public OrderCancellationStatusCode getValue(SecuritiesOrderStatus obj) {
			return obj.getCancellationStatus();
		}

		@Override
		public void setValue(SecuritiesOrderStatus obj, OrderCancellationStatusCode value) {
			obj.setCancellationStatus(value);
		}
	};
	protected PartiallySettledStatusReasonCode partiallySettledStatusReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReasonCode
	 * PartiallySettledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#mmPartiallySettled
	 * OrderStatus5Choice.mmPartiallySettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus10#mmReason
	 * PartiallySettledStatus10.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#mmPartiallySettled
	 * OrderStatus3Choice.mmPartiallySettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus4Choice#mmPartiallySettled
	 * OrderStatus4Choice.mmPartiallySettled}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallySettledStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the partially settled status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderStatus, PartiallySettledStatusReasonCode> mmPartiallySettledStatusReason = new MMBusinessAttribute<SecuritiesOrderStatus, PartiallySettledStatusReasonCode>() {
		{
			derivation_lazy = () -> Arrays.asList(OrderStatus5Choice.mmPartiallySettled, PartiallySettledStatus10.mmReason, OrderStatus3Choice.mmPartiallySettled, OrderStatus4Choice.mmPartiallySettled);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartiallySettledStatusReason";
			definition = "Reason for the partially settled status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PartiallySettledStatusReasonCode.mmObject();
		}

		@Override
		public PartiallySettledStatusReasonCode getValue(SecuritiesOrderStatus obj) {
			return obj.getPartiallySettledStatusReason();
		}

		@Override
		public void setValue(SecuritiesOrderStatus obj, PartiallySettledStatusReasonCode value) {
			obj.setPartiallySettledStatusReason(value);
		}
	};
	protected SuspendedStatusReasonCode suspendedStatusReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SuspendedStatusReasonCode
	 * SuspendedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#mmSuspended
	 * OrderStatus5Choice.mmSuspended}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#mmSuspended
	 * OrderStatus3Choice.mmSuspended}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus4Choice#mmSuspended
	 * OrderStatus4Choice.mmSuspended}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspendedStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the suspended status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderStatus, SuspendedStatusReasonCode> mmSuspendedStatusReason = new MMBusinessAttribute<SecuritiesOrderStatus, SuspendedStatusReasonCode>() {
		{
			derivation_lazy = () -> Arrays.asList(OrderStatus5Choice.mmSuspended, OrderStatus3Choice.mmSuspended, OrderStatus4Choice.mmSuspended);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SuspendedStatusReason";
			definition = "Reason for the suspended status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SuspendedStatusReasonCode.mmObject();
		}

		@Override
		public SuspendedStatusReasonCode getValue(SecuritiesOrderStatus obj) {
			return obj.getSuspendedStatusReason();
		}

		@Override
		public void setValue(SecuritiesOrderStatus obj, SuspendedStatusReasonCode value) {
			obj.setSuspendedStatusReason(value);
		}
	};
	protected ListStatusTypeCode listOrderStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ListStatusTypeCode
	 * ListStatusTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListOrderStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of a list order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderStatus, ListStatusTypeCode> mmListOrderStatus = new MMBusinessAttribute<SecuritiesOrderStatus, ListStatusTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ListOrderStatus";
			definition = "Specifies the status of a list order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ListStatusTypeCode.mmObject();
		}

		@Override
		public ListStatusTypeCode getValue(SecuritiesOrderStatus obj) {
			return obj.getListOrderStatus();
		}

		@Override
		public void setValue(SecuritiesOrderStatus obj, ListStatusTypeCode value) {
			obj.setListOrderStatus(value);
		}
	};
	protected SecuritiesOrder securitiesOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmStatus
	 * SecuritiesOrder.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order for which a status is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesOrderStatus, Optional<SecuritiesOrder>> mmSecuritiesOrder = new MMBusinessAssociationEnd<SecuritiesOrderStatus, Optional<SecuritiesOrder>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrder";
			definition = "Order for which a status is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}

		@Override
		public Optional<SecuritiesOrder> getValue(SecuritiesOrderStatus obj) {
			return obj.getSecuritiesOrder();
		}

		@Override
		public void setValue(SecuritiesOrderStatus obj, Optional<SecuritiesOrder> value) {
			obj.setSecuritiesOrder(value.orElse(null));
		}
	};
	protected InvestmentFundOrder investmentFundOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderStatus
	 * InvestmentFundOrder.mmOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#mmOrderData
	 * IndividualOrderStatusAndReason7.mmOrderData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment fund order for which a status is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesOrderStatus, Optional<InvestmentFundOrder>> mmInvestmentFundOrder = new MMBusinessAssociationEnd<SecuritiesOrderStatus, Optional<InvestmentFundOrder>>() {
		{
			derivation_lazy = () -> Arrays.asList(IndividualOrderStatusAndReason7.mmOrderData);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundOrder";
			definition = "Investment fund order for which a status is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmOrderStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
		}

		@Override
		public Optional<InvestmentFundOrder> getValue(SecuritiesOrderStatus obj) {
			return obj.getInvestmentFundOrder();
		}

		@Override
		public void setValue(SecuritiesOrderStatus obj, Optional<InvestmentFundOrder> value) {
			obj.setInvestmentFundOrder(value.orElse(null));
		}
	};
	protected SecuritiesQuantity cumulativeQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesOrderStatus
	 * SecuritiesQuantity.mmSecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumulativeQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity (for instance number of shares) filled."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesOrderStatus, SecuritiesQuantity> mmCumulativeQuantity = new MMBusinessAssociationEnd<SecuritiesOrderStatus, SecuritiesQuantity>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CumulativeQuantity";
			definition = "Total quantity (for instance number of shares) filled.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuantity.mmSecuritiesOrderStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public SecuritiesQuantity getValue(SecuritiesOrderStatus obj) {
			return obj.getCumulativeQuantity();
		}

		@Override
		public void setValue(SecuritiesOrderStatus obj, SecuritiesQuantity value) {
			obj.setCumulativeQuantity(value);
		}
	};
	protected SecuritiesQuantity remainingQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedOrderStatus
	 * SecuritiesQuantity.mmRelatedOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartialFill2#mmRemainingQuantity
	 * PartialFill2.mmRemainingQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemainingQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity opened for further execution."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesOrderStatus, SecuritiesQuantity> mmRemainingQuantity = new MMBusinessAssociationEnd<SecuritiesOrderStatus, SecuritiesQuantity>() {
		{
			derivation_lazy = () -> Arrays.asList(PartialFill2.mmRemainingQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RemainingQuantity";
			definition = "Quantity opened for further execution.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuantity.mmRelatedOrderStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public SecuritiesQuantity getValue(SecuritiesOrderStatus obj) {
			return obj.getRemainingQuantity();
		}

		@Override
		public void setValue(SecuritiesOrderStatus obj, SecuritiesQuantity value) {
			obj.setRemainingQuantity(value);
		}
	};
	protected ConditionallyAcceptedStatusReasonCode conditionallyAcceptedStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode
	 * ConditionallyAcceptedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#mmConditionallyAccepted
	 * OrderStatus5Choice.mmConditionallyAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SuspendedStatusReason4Choice#mmReasonDetails
	 * SuspendedStatusReason4Choice.mmReasonDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConditionallyAcceptedStatus3Choice#mmReasonDetails
	 * ConditionallyAcceptedStatus3Choice.mmReasonDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InRepairStatusReason4Choice#mmReasonDetails
	 * InRepairStatusReason4Choice.mmReasonDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#mmConditionallyAccepted
	 * OrderStatus3Choice.mmConditionallyAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus4Choice#mmConditionallyAccepted
	 * OrderStatus4Choice.mmConditionallyAccepted}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionallyAcceptedStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the conditionally accepted status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderStatus, ConditionallyAcceptedStatusReasonCode> mmConditionallyAcceptedStatus = new MMBusinessAttribute<SecuritiesOrderStatus, ConditionallyAcceptedStatusReasonCode>() {
		{
			derivation_lazy = () -> Arrays.asList(OrderStatus5Choice.mmConditionallyAccepted, SuspendedStatusReason4Choice.mmReasonDetails, ConditionallyAcceptedStatus3Choice.mmReasonDetails, InRepairStatusReason4Choice.mmReasonDetails,
					OrderStatus3Choice.mmConditionallyAccepted, OrderStatus4Choice.mmConditionallyAccepted);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConditionallyAcceptedStatus";
			definition = "Reason for the conditionally accepted status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
		}

		@Override
		public ConditionallyAcceptedStatusReasonCode getValue(SecuritiesOrderStatus obj) {
			return obj.getConditionallyAcceptedStatus();
		}

		@Override
		public void setValue(SecuritiesOrderStatus obj, ConditionallyAcceptedStatusReasonCode value) {
			obj.setConditionallyAcceptedStatus(value);
		}
	};
	protected OrderStatusCode orderStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#mmStatus
	 * OrderStatus5Choice.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#mmOrderStatus
	 * IndividualOrderStatusAndReason7.mmOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmOrderStatus
	 * SwitchOrderStatusAndReason2.mmOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason10#mmOrderStatus
	 * OrderStatusAndReason10.mmOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#mmStatus
	 * OrderStatus3Choice.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus4Choice#mmStatus
	 * OrderStatus4Choice.mmStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the status of an order at a specific point in time."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderStatus, OrderStatusCode> mmOrderStatus = new MMBusinessAttribute<SecuritiesOrderStatus, OrderStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(OrderStatus5Choice.mmStatus, IndividualOrderStatusAndReason7.mmOrderStatus, SwitchOrderStatusAndReason2.mmOrderStatus, OrderStatusAndReason10.mmOrderStatus, OrderStatus3Choice.mmStatus,
					OrderStatus4Choice.mmStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderStatus";
			definition = "Indicates the status of an order at a specific point in time.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderStatusCode.mmObject();
		}

		@Override
		public OrderStatusCode getValue(SecuritiesOrderStatus obj) {
			return obj.getOrderStatus();
		}

		@Override
		public void setValue(SecuritiesOrderStatus obj, OrderStatusCode value) {
			obj.setOrderStatus(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesOrderStatus";
				definition = "Status of a securities order or of the processing of a securities order.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundOrder.mmOrderStatus, SecuritiesQuantity.mmRelatedOrderStatus, SecuritiesQuantity.mmSecuritiesOrderStatus,
						com.tools20022.repository.entity.SecuritiesOrder.mmStatus);
				derivationElement_lazy = () -> Arrays.asList(OrderStatus5Choice.mmRejected, ConfirmationStatus1Choice.mmAmendmentRejected, OrderStatus3Choice.mmRejected, OrderStatus4Choice.mmRejected);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrderStatus.mmConfirmationRejectedStatusReason, com.tools20022.repository.entity.SecuritiesOrderStatus.mmConfirmationStatus,
						com.tools20022.repository.entity.SecuritiesOrderStatus.mmCancellationStatus, com.tools20022.repository.entity.SecuritiesOrderStatus.mmPartiallySettledStatusReason,
						com.tools20022.repository.entity.SecuritiesOrderStatus.mmSuspendedStatusReason, com.tools20022.repository.entity.SecuritiesOrderStatus.mmListOrderStatus,
						com.tools20022.repository.entity.SecuritiesOrderStatus.mmSecuritiesOrder, com.tools20022.repository.entity.SecuritiesOrderStatus.mmInvestmentFundOrder,
						com.tools20022.repository.entity.SecuritiesOrderStatus.mmCumulativeQuantity, com.tools20022.repository.entity.SecuritiesOrderStatus.mmRemainingQuantity,
						com.tools20022.repository.entity.SecuritiesOrderStatus.mmConditionallyAcceptedStatus, com.tools20022.repository.entity.SecuritiesOrderStatus.mmOrderStatus);
				derivationComponent_lazy = () -> Arrays.asList(InRepairStatus4Choice.mmObject(), SuspendedStatusReason4Choice.mmObject(), ConditionallyAcceptedStatus3Choice.mmObject(), RejectedStatus9.mmObject(),
						PartiallySettledStatus10.mmObject(), InRepairStatusReason4Choice.mmObject(), ConfirmationStatus1Choice.mmObject(), ConfirmationRejectedStatus2.mmObject(), IndividualOrderStatusAndReason7.mmObject(),
						OrderStatusAndReason10.mmObject(), OrderStatusAndReason9.mmObject(), IndividualOrderStatusAndReason8.mmObject(), RejectedStatus10.mmObject(), ConfirmationRejectedReason1Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesOrderStatus.class;
			}
		});
		return mmObject_lazy.get();
	}

	public RejectedConfirmationStatusReasonCode getConfirmationRejectedStatusReason() {
		return confirmationRejectedStatusReason;
	}

	public SecuritiesOrderStatus setConfirmationRejectedStatusReason(RejectedConfirmationStatusReasonCode confirmationRejectedStatusReason) {
		this.confirmationRejectedStatusReason = Objects.requireNonNull(confirmationRejectedStatusReason);
		return this;
	}

	public OrderConfirmationStatusCode getConfirmationStatus() {
		return confirmationStatus;
	}

	public SecuritiesOrderStatus setConfirmationStatus(OrderConfirmationStatusCode confirmationStatus) {
		this.confirmationStatus = Objects.requireNonNull(confirmationStatus);
		return this;
	}

	public OrderCancellationStatusCode getCancellationStatus() {
		return cancellationStatus;
	}

	public SecuritiesOrderStatus setCancellationStatus(OrderCancellationStatusCode cancellationStatus) {
		this.cancellationStatus = Objects.requireNonNull(cancellationStatus);
		return this;
	}

	public PartiallySettledStatusReasonCode getPartiallySettledStatusReason() {
		return partiallySettledStatusReason;
	}

	public SecuritiesOrderStatus setPartiallySettledStatusReason(PartiallySettledStatusReasonCode partiallySettledStatusReason) {
		this.partiallySettledStatusReason = Objects.requireNonNull(partiallySettledStatusReason);
		return this;
	}

	public SuspendedStatusReasonCode getSuspendedStatusReason() {
		return suspendedStatusReason;
	}

	public SecuritiesOrderStatus setSuspendedStatusReason(SuspendedStatusReasonCode suspendedStatusReason) {
		this.suspendedStatusReason = Objects.requireNonNull(suspendedStatusReason);
		return this;
	}

	public ListStatusTypeCode getListOrderStatus() {
		return listOrderStatus;
	}

	public SecuritiesOrderStatus setListOrderStatus(ListStatusTypeCode listOrderStatus) {
		this.listOrderStatus = Objects.requireNonNull(listOrderStatus);
		return this;
	}

	public Optional<SecuritiesOrder> getSecuritiesOrder() {
		return securitiesOrder == null ? Optional.empty() : Optional.of(securitiesOrder);
	}

	public SecuritiesOrderStatus setSecuritiesOrder(com.tools20022.repository.entity.SecuritiesOrder securitiesOrder) {
		this.securitiesOrder = securitiesOrder;
		return this;
	}

	public Optional<InvestmentFundOrder> getInvestmentFundOrder() {
		return investmentFundOrder == null ? Optional.empty() : Optional.of(investmentFundOrder);
	}

	public SecuritiesOrderStatus setInvestmentFundOrder(com.tools20022.repository.entity.InvestmentFundOrder investmentFundOrder) {
		this.investmentFundOrder = investmentFundOrder;
		return this;
	}

	public SecuritiesQuantity getCumulativeQuantity() {
		return cumulativeQuantity;
	}

	public SecuritiesOrderStatus setCumulativeQuantity(SecuritiesQuantity cumulativeQuantity) {
		this.cumulativeQuantity = Objects.requireNonNull(cumulativeQuantity);
		return this;
	}

	public SecuritiesQuantity getRemainingQuantity() {
		return remainingQuantity;
	}

	public SecuritiesOrderStatus setRemainingQuantity(SecuritiesQuantity remainingQuantity) {
		this.remainingQuantity = Objects.requireNonNull(remainingQuantity);
		return this;
	}

	public ConditionallyAcceptedStatusReasonCode getConditionallyAcceptedStatus() {
		return conditionallyAcceptedStatus;
	}

	public SecuritiesOrderStatus setConditionallyAcceptedStatus(ConditionallyAcceptedStatusReasonCode conditionallyAcceptedStatus) {
		this.conditionallyAcceptedStatus = Objects.requireNonNull(conditionallyAcceptedStatus);
		return this;
	}

	public OrderStatusCode getOrderStatus() {
		return orderStatus;
	}

	public SecuritiesOrderStatus setOrderStatus(OrderStatusCode orderStatus) {
		this.orderStatus = Objects.requireNonNull(orderStatus);
		return this;
	}
}