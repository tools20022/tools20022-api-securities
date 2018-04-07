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

package com.tools20022.repository.area.semt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesManagementLatestVersion;
import com.tools20022.repository.msg.AdditionalReference2;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msg.Pagination;
import com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer, for example, a transfer agent sends the
 * StatementOfInvestmentFundTransactionsCancellation message to the account
 * owner, for example, an investment manager or its authorised representative to
 * cancel a previously sent StatementOfInvestmentFundTransactions message.<br>
 * <b>Usage</b><br>
 * The StatementOfInvestmentFundTransactionsCancellation message is used to
 * cancel a previously sent StatementOfInvestmentFundTransactions message. This
 * message must contain the reference of the message to be cancelled.<br>
 * This message may also contain all the details of the message to be cancelled,
 * but this is not recommended.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV03#mmMessageIdentification
 * StatementOfInvestmentFundTransactionsCancellationV03.mmMessageIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV03#mmPreviousReference
 * StatementOfInvestmentFundTransactionsCancellationV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV03#mmRelatedReference
 * StatementOfInvestmentFundTransactionsCancellationV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV03#mmMessagePagination
 * StatementOfInvestmentFundTransactionsCancellationV03.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV03#mmStatementToBeCancelled
 * StatementOfInvestmentFundTransactionsCancellationV03.mmStatementToBeCancelled
 * }</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "StmtOfInvstmtFndTxsCxl"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesManagementLatestVersion
 * SecuritiesManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code semt.007.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatementOfInvestmentFundTransactionsCancellationV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer, for example, a transfer agent sends the StatementOfInvestmentFundTransactionsCancellation message to the account owner, for example, an investment manager or its authorised representative to cancel a previously sent StatementOfInvestmentFundTransactions message.\r\nUsage\r\nThe StatementOfInvestmentFundTransactionsCancellation message is used to cancel a previously sent StatementOfInvestmentFundTransactions message. This message must contain the reference of the message to be cancelled.\r\nThis message may also contain all the details of the message to be cancelled, but this is not recommended."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StatementOfInvestmentFundTransactionsCancellationV03", propOrder = {"messageIdentification", "previousReference", "relatedReference", "messagePagination", "statementToBeCancelled"})
public class StatementOfInvestmentFundTransactionsCancellationV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId", required = true)
	protected MessageIdentification1 messageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference that uniquely identifies a message from a business application standpoint."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<StatementOfInvestmentFundTransactionsCancellationV03, MessageIdentification1> mmMessageIdentification = new MMMessageBuildingBlock<StatementOfInvestmentFundTransactionsCancellationV03, MessageIdentification1>() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies a message from a business application standpoint.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(StatementOfInvestmentFundTransactionsCancellationV03 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(StatementOfInvestmentFundTransactionsCancellationV03 obj, MessageIdentification1 value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "PrvsRef")
	protected AdditionalReference2 previousReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference2
	 * AdditionalReference2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to a linked message that was previously sent."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<StatementOfInvestmentFundTransactionsCancellationV03, Optional<AdditionalReference2>> mmPreviousReference = new MMMessageBuildingBlock<StatementOfInvestmentFundTransactionsCancellationV03, Optional<AdditionalReference2>>() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference2.mmObject();
		}

		@Override
		public Optional<AdditionalReference2> getValue(StatementOfInvestmentFundTransactionsCancellationV03 obj) {
			return obj.getPreviousReference();
		}

		@Override
		public void setValue(StatementOfInvestmentFundTransactionsCancellationV03 obj, Optional<AdditionalReference2> value) {
			obj.setPreviousReference(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdRef")
	protected AdditionalReference2 relatedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference2
	 * AdditionalReference2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a linked message that was previously received."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<StatementOfInvestmentFundTransactionsCancellationV03, Optional<AdditionalReference2>> mmRelatedReference = new MMMessageBuildingBlock<StatementOfInvestmentFundTransactionsCancellationV03, Optional<AdditionalReference2>>() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference2.mmObject();
		}

		@Override
		public Optional<AdditionalReference2> getValue(StatementOfInvestmentFundTransactionsCancellationV03 obj) {
			return obj.getRelatedReference();
		}

		@Override
		public void setValue(StatementOfInvestmentFundTransactionsCancellationV03 obj, Optional<AdditionalReference2> value) {
			obj.setRelatedReference(value.orElse(null));
		}
	};
	@XmlElement(name = "MsgPgntn", required = true)
	protected Pagination messagePagination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Pagination
	 * Pagination}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgPgntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessagePagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pagination of the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<StatementOfInvestmentFundTransactionsCancellationV03, Pagination> mmMessagePagination = new MMMessageBuildingBlock<StatementOfInvestmentFundTransactionsCancellationV03, Pagination>() {
		{
			xmlTag = "MsgPgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessagePagination";
			definition = "Pagination of the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Pagination.mmObject();
		}

		@Override
		public Pagination getValue(StatementOfInvestmentFundTransactionsCancellationV03 obj) {
			return obj.getMessagePagination();
		}

		@Override
		public void setValue(StatementOfInvestmentFundTransactionsCancellationV03 obj, Pagination value) {
			obj.setMessagePagination(value);
		}
	};
	@XmlElement(name = "StmtToBeCanc")
	protected StatementOfInvestmentFundTransactions3 statementToBeCancelled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3
	 * StatementOfInvestmentFundTransactions3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtToBeCanc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementToBeCancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Statement of Investment Fund Transactions message to cancel."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<StatementOfInvestmentFundTransactionsCancellationV03, Optional<StatementOfInvestmentFundTransactions3>> mmStatementToBeCancelled = new MMMessageBuildingBlock<StatementOfInvestmentFundTransactionsCancellationV03, Optional<StatementOfInvestmentFundTransactions3>>() {
		{
			xmlTag = "StmtToBeCanc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementToBeCancelled";
			definition = "The Statement of Investment Fund Transactions message to cancel.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StatementOfInvestmentFundTransactions3.mmObject();
		}

		@Override
		public Optional<StatementOfInvestmentFundTransactions3> getValue(StatementOfInvestmentFundTransactionsCancellationV03 obj) {
			return obj.getStatementToBeCancelled();
		}

		@Override
		public void setValue(StatementOfInvestmentFundTransactionsCancellationV03 obj, Optional<StatementOfInvestmentFundTransactions3> value) {
			obj.setStatementToBeCancelled(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatementOfInvestmentFundTransactionsCancellationV03";
				definition = "Scope\r\nAn account servicer, for example, a transfer agent sends the StatementOfInvestmentFundTransactionsCancellation message to the account owner, for example, an investment manager or its authorised representative to cancel a previously sent StatementOfInvestmentFundTransactions message.\r\nUsage\r\nThe StatementOfInvestmentFundTransactionsCancellation message is used to cancel a previously sent StatementOfInvestmentFundTransactions message. This message must contain the reference of the message to be cancelled.\r\nThis message may also contain all the details of the message to be cancelled, but this is not recommended.";
				rootElement = "Document";
				xmlTag = "StmtOfInvstmtFndTxsCxl";
				businessArea_lazy = () -> SecuritiesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV03.mmMessageIdentification,
						com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV03.mmPreviousReference,
						com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV03.mmRelatedReference,
						com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV03.mmMessagePagination,
						com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV03.mmStatementToBeCancelled);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "semt";
						messageFunctionality = "007";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return StatementOfInvestmentFundTransactionsCancellationV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public StatementOfInvestmentFundTransactionsCancellationV03 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<AdditionalReference2> getPreviousReference() {
		return previousReference == null ? Optional.empty() : Optional.of(previousReference);
	}

	public StatementOfInvestmentFundTransactionsCancellationV03 setPreviousReference(AdditionalReference2 previousReference) {
		this.previousReference = previousReference;
		return this;
	}

	public Optional<AdditionalReference2> getRelatedReference() {
		return relatedReference == null ? Optional.empty() : Optional.of(relatedReference);
	}

	public StatementOfInvestmentFundTransactionsCancellationV03 setRelatedReference(AdditionalReference2 relatedReference) {
		this.relatedReference = relatedReference;
		return this;
	}

	public Pagination getMessagePagination() {
		return messagePagination;
	}

	public StatementOfInvestmentFundTransactionsCancellationV03 setMessagePagination(Pagination messagePagination) {
		this.messagePagination = Objects.requireNonNull(messagePagination);
		return this;
	}

	public Optional<StatementOfInvestmentFundTransactions3> getStatementToBeCancelled() {
		return statementToBeCancelled == null ? Optional.empty() : Optional.of(statementToBeCancelled);
	}

	public StatementOfInvestmentFundTransactionsCancellationV03 setStatementToBeCancelled(StatementOfInvestmentFundTransactions3 statementToBeCancelled) {
		this.statementToBeCancelled = statementToBeCancelled;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.007.001.03")
	static public class Document {
		@XmlElement(name = "StmtOfInvstmtFndTxsCxl", required = true)
		public StatementOfInvestmentFundTransactionsCancellationV03 messageBody;
	}
}