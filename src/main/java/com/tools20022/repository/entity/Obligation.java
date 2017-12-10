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
import com.tools20022.repository.choice.PriorityNumeric3Choice;
import com.tools20022.repository.choice.SettlementDate11Choice;
import com.tools20022.repository.choice.SettlementDate9Choice;
import com.tools20022.repository.codeset.ExposureTypeV2Code;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Specifies the assets (quantity of securities, goods, services, and cash
 * amounts) that have to be delivered.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Obligation" src="doc-files/Obligation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementDate
 * Obligation.mmRequestedSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementAmount
 * Obligation.mmRequestedSettlementAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#mmPriority
 * Obligation.mmPriority}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#mmTrade
 * Obligation.mmTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Obligation#mmTransactionRisk
 * Obligation.mmTransactionRisk}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Obligation#mmParentObligation
 * Obligation.mmParentObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#mmSubObligation
 * Obligation.mmSubObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#mmOffset
 * Obligation.mmOffset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Obligation#mmOriginalObligationProcess
 * Obligation.mmOriginalObligationProcess}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#mmExposureType
 * Obligation.mmExposureType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmObligation
 * Trade.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Obligation#mmParentObligation
 * Obligation.mmParentObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#mmSubObligation
 * Obligation.mmSubObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmObligationOffset
 * ObligationFulfilment.mmObligationOffset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmResultingObligation
 * ObligationFulfilment.mmResultingObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionRisk#mmObligation
 * TransactionRisk.mmObligation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentObligation
 * PaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
 * SecuritiesDeliveryObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductDeliveryObligation
 * ProductDeliveryObligation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.PriorityNumeric3Choice
 * PriorityNumeric3Choice}</li>
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
 * "Obligation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the assets (quantity of securities, goods, services, and cash amounts) that have to be delivered."
 * </li>
 * </ul>
 */
public class Obligation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime requestedSettlementDate;
	/**
	 * Date and time at which a trade must be executed. For a direct debit, it
	 * is the date and time at which the creditor requests that the amount of
	 * money is to be collected from the debtor. For a credit transfer, it is
	 * the date and time at which the debtor requests the clearing agent to
	 * process the payment. For a securities trade, it is the date and time at
	 * which the securities are to be delivered or received.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails2#mmExpectedCashSettlementDate
	 * ExpectedExecutionDetails2.mmExpectedCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Summary1#mmRequestedSettlementDate
	 * Summary1.mmRequestedSettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmSettlementDate
	 * Order17.mmSettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmSettlementDate
	 * Order18.mmSettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmSettlementDate
	 * TradeLeg8.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg10#mmSettlementDate
	 * TradeLeg10.mmSettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmSettlementDate
	 * TradeLeg9.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails81#mmSettlementDate
	 * TransactionDetails81.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails74#mmSettlementDate
	 * TransactionDetails74.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails82#mmSettlementDate
	 * TransactionDetails82.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmSettlementDate
	 * SecuritiesTradeDetails48.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails80#mmSettlementDate
	 * TransactionDetails80.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmSettlementDate
	 * SecuritiesTradeDetails51.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#mmSettlementDate
	 * SecuritiesTradeDetails53.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#mmSettlementDate
	 * SecuritiesTradeDetails55.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54#mmSettlementDate
	 * SecuritiesTradeDetails54.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementDate9Choice#mmDateCode
	 * SettlementDate9Choice.mmDateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementDate11Choice#mmDateCode
	 * SettlementDate11Choice.mmDateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#mmSettlementDate
	 * SecuritiesTradeDetails52.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#mmRequestedSettlementDate
	 * ReceiveInformation17.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#mmRequestedSettlementDate
	 * Transfer31.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmRequestedSettlementDate
	 * Transfer30.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#mmRequestedSettlementDate
	 * ReceiveInformation16.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmRequestedSettlementDate
	 * DeliverInformation16.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer32#mmRequestedSettlementDate
	 * Transfer32.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#mmRequestedSettlementDate
	 * DeliverInformation17.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#mmRequestedSettlementDate
	 * Transfer33.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut17#mmRequestedTransferDate
	 * TransferOut17.mmRequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn15#mmRequestedTransferDate
	 * TransferIn15.mmRequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument48#mmRequestedSettlementDate
	 * FinancialInstrument48.mmRequestedSettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CollateralMovement9#mmDate
	 * CollateralMovement9.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails4#mmExpectedCashSettlementDate
	 * ExpectedExecutionDetails4.mmExpectedCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#mmSettlementDate
	 * SecuritiesTradeDetails67.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmSettlementDate
	 * SecuritiesTradeDetails68.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmExpectedSettlementDate
	 * TransactionDetails97.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmSettlementDate
	 * TransactionDetails97.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmExpectedSettlementDate
	 * SecuritiesFinancingTransactionDetails35.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#mmExpectedSettlementDate
	 * TransactionDetails96.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#mmSettlementDate
	 * TransactionDetails96.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails13#mmSettlementDate
	 * IntraPositionMovementDetails13.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmSettlementDate
	 * TransactionDetails95.mmSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which a trade must be executed. For a direct debit, it is the date and time at which the creditor requests that the amount of money is to be collected from the debtor. For a credit transfer, it is the date and time at which the debtor requests the clearing agent to process the payment. For a securities trade, it is the date and time at which the securities are to be delivered or received."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRequestedSettlementDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ExpectedExecutionDetails2.mmExpectedCashSettlementDate, Summary1.mmRequestedSettlementDate, Order17.mmSettlementDate, Order18.mmSettlementDate, TradeLeg8.mmSettlementDate,
					TradeLeg10.mmSettlementDate, TradeLeg9.mmSettlementDate, TransactionDetails81.mmSettlementDate, TransactionDetails74.mmSettlementDate, TransactionDetails82.mmSettlementDate, SecuritiesTradeDetails48.mmSettlementDate,
					TransactionDetails80.mmSettlementDate, SecuritiesTradeDetails51.mmSettlementDate, SecuritiesTradeDetails53.mmSettlementDate, SecuritiesTradeDetails55.mmSettlementDate, SecuritiesTradeDetails54.mmSettlementDate,
					SettlementDate9Choice.mmDateCode, SettlementDate11Choice.mmDateCode, SecuritiesTradeDetails52.mmSettlementDate, ReceiveInformation17.mmRequestedSettlementDate, Transfer31.mmRequestedSettlementDate,
					Transfer30.mmRequestedSettlementDate, ReceiveInformation16.mmRequestedSettlementDate, DeliverInformation16.mmRequestedSettlementDate, Transfer32.mmRequestedSettlementDate, DeliverInformation17.mmRequestedSettlementDate,
					Transfer33.mmRequestedSettlementDate, TransferOut17.mmRequestedTransferDate, TransferIn15.mmRequestedTransferDate, FinancialInstrument48.mmRequestedSettlementDate, CollateralMovement9.mmDate,
					ExpectedExecutionDetails4.mmExpectedCashSettlementDate, SecuritiesTradeDetails67.mmSettlementDate, SecuritiesTradeDetails68.mmSettlementDate, TransactionDetails97.mmExpectedSettlementDate,
					TransactionDetails97.mmSettlementDate, SecuritiesFinancingTransactionDetails35.mmExpectedSettlementDate, TransactionDetails96.mmExpectedSettlementDate, TransactionDetails96.mmSettlementDate,
					IntraPositionMovementDetails13.mmSettlementDate, TransactionDetails95.mmSettlementDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Obligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedSettlementDate";
			definition = "Date and time at which a trade must be executed. For a direct debit, it is the date and time at which the creditor requests that the amount of money is to be collected from the debtor. For a credit transfer, it is the date and time at which the debtor requests the clearing agent to process the payment. For a securities trade, it is the date and time at which the securities are to be delivered or received.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Obligation.class.getMethod("getRequestedSettlementDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount requestedSettlementAmount;
	/**
	 * Total amount of money to be paid or received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmSettlementAmount
	 * SecuritiesTradeDetails48.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmSettlementAmount
	 * SecuritiesTradeDetails68.mmSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total amount of money to be paid or received."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRequestedSettlementAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesTradeDetails48.mmSettlementAmount, SecuritiesTradeDetails68.mmSettlementAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Obligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedSettlementAmount";
			definition = "Total amount of money to be paid or received.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Obligation.class.getMethod("getRequestedSettlementAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max4AlphaNumericText priority;
	/**
	 * Specifies whether the transaction is to be executed with a high priority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriorityNumeric3Choice#mmNumeric
	 * PriorityNumeric3Choice.mmNumeric}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriorityNumeric3Choice#mmProprietary
	 * PriorityNumeric3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmPriority
	 * SettlementDetails43.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails33#mmPriority
	 * IntraPositionDetails33.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails15#mmPriority
	 * RequestDetails15.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#mmPriority
	 * SettlementDetails96.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmPriority
	 * SettlementDetails97.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmPriority
	 * SettlementDetails128.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmPriority
	 * SettlementDetails120.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmPriority
	 * SettlementDetails119.mmPriority}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transaction is to be executed with a high priority."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPriority = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PriorityNumeric3Choice.mmNumeric, PriorityNumeric3Choice.mmProprietary, SettlementDetails43.mmPriority, IntraPositionDetails33.mmPriority, RequestDetails15.mmPriority,
					SettlementDetails96.mmPriority, SettlementDetails97.mmPriority, SettlementDetails128.mmPriority, SettlementDetails120.mmPriority, SettlementDetails119.mmPriority);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Obligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Priority";
			definition = "Specifies whether the transaction is to be executed with a high priority.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Obligation.class.getMethod("getPriority", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Trade trade;
	/**
	 * Specifies the trade which originates the obligation to deliver a product,
	 * cash or securities..
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmObligation
	 * Trade.mmObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the trade which originates the obligation to deliver a product, cash or securities.."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Obligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Specifies the trade which originates the obligation to deliver a product, cash or securities..";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.mmObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
		}
	};
	protected TransactionRisk transactionRisk;
	/**
	 * Transaction risk calculated per obligation type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TransactionRisk#mmObligation
	 * TransactionRisk.mmObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TransactionRisk
	 * TransactionRisk}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionRisk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction risk calculated per obligation type."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTransactionRisk = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Obligation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionRisk";
			definition = "Transaction risk calculated per obligation type.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TransactionRisk.mmObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TransactionRisk.mmObject();
		}
	};
	protected Obligation parentObligation;
	/**
	 * Obligation which is divided into several sub-obligations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmSubObligation
	 * Obligation.mmSubObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Obligation
	 * Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParentObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Obligation which is divided into several sub-obligations."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmParentObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Obligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ParentObligation";
			definition = "Obligation which is divided into several sub-obligations.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Obligation.mmSubObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Obligation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Obligation> subObligation;
	/**
	 * Specifies an obligation resulting from another existing obligation, for
	 * instance each leg of a financing agreement is a sub-obligation of the
	 * global financing obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmParentObligation
	 * Obligation.mmParentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Obligation
	 * Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies an obligation resulting from another existing obligation, for instance each leg of a financing agreement is a sub-obligation of the global financing obligation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSubObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Obligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubObligation";
			definition = "Specifies an obligation resulting from another existing obligation, for instance each leg of a financing agreement is a sub-obligation of the global financing obligation.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Obligation.mmParentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Obligation.mmObject();
		}
	};
	protected ObligationFulfilment offset;
	/**
	 * Specifies the method used to settle a specific obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmObligationOffset
	 * ObligationFulfilment.mmObligationOffset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment
	 * ObligationFulfilment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Offset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the method used to settle a specific obligation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOffset = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Obligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Offset";
			definition = "Specifies the method used to settle a specific obligation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ObligationFulfilment.mmObligationOffset;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ObligationFulfilment.mmObject();
		}
	};
	protected ObligationFulfilment originalObligationProcess;
	/**
	 * Obligation fulfilment process which did not extinguish the obligation but
	 * replaced it by a new one, for instance in case of netting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmResultingObligation
	 * ObligationFulfilment.mmResultingObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment
	 * ObligationFulfilment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalObligationProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Obligation fulfilment process which did not extinguish the obligation but replaced it by a new one, for instance in case of netting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOriginalObligationProcess = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Obligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OriginalObligationProcess";
			definition = "Obligation fulfilment process which did not extinguish the obligation but replaced it by a new one, for instance in case of netting.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ObligationFulfilment.mmResultingObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ObligationFulfilment.mmObject();
		}
	};
	protected ExposureTypeV2Code exposureType;
	/**
	 * Type of exposure related to this obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmExposureType
	 * SettlementDetails43.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmExposureType
	 * AggregateBalancePerSafekeepingPlace28.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#mmExposureType
	 * AggregateBalancePerSafekeepingPlace29.mmExposureType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExposureType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of exposure related to this obligation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExposureType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementDetails43.mmExposureType, AggregateBalancePerSafekeepingPlace28.mmExposureType, AggregateBalancePerSafekeepingPlace29.mmExposureType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Obligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExposureType";
			definition = "Type of exposure related to this obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExposureTypeV2Code.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Obligation.class.getMethod("getExposureType", new Class[]{});
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
				name = "Obligation";
				definition = "Specifies the assets (quantity of securities, goods, services, and cash amounts) that have to be delivered.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.mmObligation, com.tools20022.repository.entity.Obligation.mmParentObligation, com.tools20022.repository.entity.Obligation.mmSubObligation,
						com.tools20022.repository.entity.ObligationFulfilment.mmObligationOffset, com.tools20022.repository.entity.ObligationFulfilment.mmResultingObligation, com.tools20022.repository.entity.TransactionRisk.mmObligation);
				subType_lazy = () -> Arrays.asList(PaymentObligation.mmObject(), SecuritiesDeliveryObligation.mmObject(), ProductDeliveryObligation.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Obligation.mmRequestedSettlementDate, com.tools20022.repository.entity.Obligation.mmRequestedSettlementAmount,
						com.tools20022.repository.entity.Obligation.mmPriority, com.tools20022.repository.entity.Obligation.mmTrade, com.tools20022.repository.entity.Obligation.mmTransactionRisk,
						com.tools20022.repository.entity.Obligation.mmParentObligation, com.tools20022.repository.entity.Obligation.mmSubObligation, com.tools20022.repository.entity.Obligation.mmOffset,
						com.tools20022.repository.entity.Obligation.mmOriginalObligationProcess, com.tools20022.repository.entity.Obligation.mmExposureType);
				derivationComponent_lazy = () -> Arrays.asList(PriorityNumeric3Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Obligation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getRequestedSettlementDate() {
		return requestedSettlementDate;
	}

	public void setRequestedSettlementDate(ISODateTime requestedSettlementDate) {
		this.requestedSettlementDate = requestedSettlementDate;
	}

	public CurrencyAndAmount getRequestedSettlementAmount() {
		return requestedSettlementAmount;
	}

	public void setRequestedSettlementAmount(CurrencyAndAmount requestedSettlementAmount) {
		this.requestedSettlementAmount = requestedSettlementAmount;
	}

	public Max4AlphaNumericText getPriority() {
		return priority;
	}

	public void setPriority(Max4AlphaNumericText priority) {
		this.priority = priority;
	}

	public Trade getTrade() {
		return trade;
	}

	public void setTrade(com.tools20022.repository.entity.Trade trade) {
		this.trade = trade;
	}

	public TransactionRisk getTransactionRisk() {
		return transactionRisk;
	}

	public void setTransactionRisk(com.tools20022.repository.entity.TransactionRisk transactionRisk) {
		this.transactionRisk = transactionRisk;
	}

	public Obligation getParentObligation() {
		return parentObligation;
	}

	public void setParentObligation(com.tools20022.repository.entity.Obligation parentObligation) {
		this.parentObligation = parentObligation;
	}

	public List<Obligation> getSubObligation() {
		return subObligation;
	}

	public void setSubObligation(List<com.tools20022.repository.entity.Obligation> subObligation) {
		this.subObligation = subObligation;
	}

	public ObligationFulfilment getOffset() {
		return offset;
	}

	public void setOffset(com.tools20022.repository.entity.ObligationFulfilment offset) {
		this.offset = offset;
	}

	public ObligationFulfilment getOriginalObligationProcess() {
		return originalObligationProcess;
	}

	public void setOriginalObligationProcess(com.tools20022.repository.entity.ObligationFulfilment originalObligationProcess) {
		this.originalObligationProcess = originalObligationProcess;
	}

	public ExposureTypeV2Code getExposureType() {
		return exposureType;
	}

	public void setExposureType(ExposureTypeV2Code exposureType) {
		this.exposureType = exposureType;
	}
}