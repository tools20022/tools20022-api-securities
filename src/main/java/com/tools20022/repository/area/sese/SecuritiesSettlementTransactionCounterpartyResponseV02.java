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

package com.tools20022.repository.area.sese;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesSettlementLatestVersion;
import com.tools20022.repository.choice.ResponseStatus6Choice;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msg.TransactionDetails82;
import com.tools20022.repository.msg.TransactionIdentification6;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account owner sends a SecuritiesSettlementTransactionCounterpartyResponse
 * to advise the account servicer that:<br>
 * - the allegement received is either rejected (that is counterparty's
 * transaction is unknown) or accepted (i.e. either the allegement was passed to
 * the client or the transaction is know with or without mismatches)<br>
 * - the modification or cancellation request sent by the counterparty for a
 * matched transaction is affirmed or not. The account servicer will therefore
 * proceed or not with the counterparty's request to modify or cancel the
 * transaction.<br>
 * The account servicer may be a central securities depository or another
 * settlement market infrastructure acting on behalf of their participants<br>
 * The account owner may be:<br>
 * - a central securities depository participant which has an account with a
 * central securities depository or a market infrastructure<br>
 * - an agent (sub-custodian) acting on behalf of their global custodian
 * customer, or<br>
 * - a custodian acting on behalf of an investment management institution or a
 * broker/dealer.<br>
 * <br>
 * <b>Usage</b><br>
 * The message may also be used to:<br>
 * - re-send a message sent by the account owner to the account servicer,<br>
 * - provide a third party with a copy of a message being sent by the account
 * owner for information,<br>
 * - re-send to a third party a copy of a message being sent by the account
 * owner for information<br>
 * using the relevant elements in the Business Application Header.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionCounterpartyResponseV02#mmTransactionIdentification
 * SecuritiesSettlementTransactionCounterpartyResponseV02.
 * mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionCounterpartyResponseV02#mmResponseStatus
 * SecuritiesSettlementTransactionCounterpartyResponseV02.mmResponseStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionCounterpartyResponseV02#mmTransactionDetails
 * SecuritiesSettlementTransactionCounterpartyResponseV02.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionCounterpartyResponseV02#mmSupplementaryData
 * SecuritiesSettlementTransactionCounterpartyResponseV02.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesSttlmTxCtrPtyRspn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementLatestVersion
 * SecuritiesSettlementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.040.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesSettlementTransactionCounterpartyResponseV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account owner sends a SecuritiesSettlementTransactionCounterpartyResponse to advise the account servicer that:\r\n- the allegement received is either rejected (that is counterparty's transaction is unknown) or accepted (i.e. either the allegement was passed to the client or the transaction is know with or without mismatches)\r\n- the modification or cancellation request sent by the counterparty for a matched transaction is affirmed or not. The account servicer will therefore proceed or not with the counterparty's request to modify or cancel the transaction.\r\nThe account servicer may be a central securities depository or another settlement market infrastructure acting on behalf of their participants\r\nThe account owner may be:\r\n- a central securities depository participant which has an account with a central securities depository or a market infrastructure\r\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or\r\n- a custodian acting on behalf of an investment management institution or a broker/dealer.\r\n\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message sent by the account owner to the account servicer,\r\n- provide a third party with a copy of a message being sent by the account owner for information,\r\n- re-send to a third party a copy of a message being sent by the account owner for information\r\nusing the relevant elements in the Business Application Header."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecuritiesSettlementTransactionCounterpartyResponseV02", propOrder = {"transactionIdentification", "responseStatus", "transactionDetails", "supplementaryData"})
public class SecuritiesSettlementTransactionCounterpartyResponseV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected TransactionIdentification6 transactionIdentification;
	/**
	 * Provides unambiguous transaction identification information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification6
	 * TransactionIdentification6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides unambiguous transaction identification information."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Provides unambiguous transaction identification information.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactionIdentification6.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionCounterpartyResponseV02.class.getMethod("getTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ResponseStatus6Choice responseStatus;
	/**
	 * Provides the response status related to an allegement or a counterparty's
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus6Choice
	 * ResponseStatus6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the response status related to an allegement or a counterparty's instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmResponseStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "RspnSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseStatus";
			definition = "Provides the response status related to an allegement or a counterparty's instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ResponseStatus6Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionCounterpartyResponseV02.class.getMethod("getResponseStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TransactionDetails82 transactionDetails;
	/**
	 * Identifies the details of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails82
	 * TransactionDetails82}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the details of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDetails";
			definition = "Identifies the details of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TransactionDetails82.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionCounterpartyResponseV02.class.getMethod("getTransactionDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionCounterpartyResponseV02.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlementTransactionCounterpartyResponseV02";
				definition = "Scope\r\nAn account owner sends a SecuritiesSettlementTransactionCounterpartyResponse to advise the account servicer that:\r\n- the allegement received is either rejected (that is counterparty's transaction is unknown) or accepted (i.e. either the allegement was passed to the client or the transaction is know with or without mismatches)\r\n- the modification or cancellation request sent by the counterparty for a matched transaction is affirmed or not. The account servicer will therefore proceed or not with the counterparty's request to modify or cancel the transaction.\r\nThe account servicer may be a central securities depository or another settlement market infrastructure acting on behalf of their participants\r\nThe account owner may be:\r\n- a central securities depository participant which has an account with a central securities depository or a market infrastructure\r\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or\r\n- a custodian acting on behalf of an investment management institution or a broker/dealer.\r\n\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message sent by the account owner to the account servicer,\r\n- provide a third party with a copy of a message being sent by the account owner for information,\r\n- re-send to a third party a copy of a message being sent by the account owner for information\r\nusing the relevant elements in the Business Application Header.";
				rootElement = "Document";
				xmlTag = "SctiesSttlmTxCtrPtyRspn";
				businessArea_lazy = () -> SecuritiesSettlementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesSettlementTransactionCounterpartyResponseV02.mmTransactionIdentification,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionCounterpartyResponseV02.mmResponseStatus,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionCounterpartyResponseV02.mmTransactionDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionCounterpartyResponseV02.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "040";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesSettlementTransactionCounterpartyResponseV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TxId", required = true)
	public TransactionIdentification6 getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(TransactionIdentification6 transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	@XmlElement(name = "RspnSts", required = true)
	public ResponseStatus6Choice getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(ResponseStatus6Choice responseStatus) {
		this.responseStatus = responseStatus;
	}

	@XmlElement(name = "TxDtls")
	public TransactionDetails82 getTransactionDetails() {
		return transactionDetails;
	}

	public void setTransactionDetails(TransactionDetails82 transactionDetails) {
		this.transactionDetails = transactionDetails;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:sese.040.02.02")
	static public class Document {
		@XmlElement(name = "SctiesSttlmTxCtrPtyRspn", required = true)
		public SecuritiesSettlementTransactionCounterpartyResponseV02 messageBody;
	}
}