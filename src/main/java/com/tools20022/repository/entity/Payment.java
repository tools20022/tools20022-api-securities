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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Payment information and processes required to transfer cash end to end from
 * the debtor to the creditor.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Payment" src="doc-files/Payment.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment
 * ObligationFulfilment}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPaymentObligation
 * Payment.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmCurrencyOfTransfer
 * Payment.mmCurrencyOfTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmCreditMethod
 * Payment.mmCreditMethod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmType
 * Payment.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
 * Payment.mmInstructedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPriority
 * Payment.mmPriority}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmValueDate
 * Payment.mmValueDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPaymentStatus
 * Payment.mmPaymentStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPartyRole
 * Payment.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmTaxOnPayment
 * Payment.mmTaxOnPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPaymentExecution
 * Payment.mmPaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmPoolingAdjustmentDate
 * Payment.mmPoolingAdjustmentDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmEquivalentAmount
 * Payment.mmEquivalentAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmCurrencyExchange
 * Payment.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructionForCreditorAgent
 * Payment.mmInstructionForCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructionForDebtorAgent
 * Payment.mmInstructionForDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentRelatedIdentifications
 * Payment.mmPaymentRelatedIdentifications}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmRelatedInvestigationCase
 * Payment.mmRelatedInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmSettlementTimeRequest
 * Payment.mmSettlementTimeRequest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmAmount
 * Payment.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmTradeSettlement
 * Payment.mmTradeSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmStandardSettlementInstructions
 * Payment.mmStandardSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmRelatedDebitAuthorisation
 * Payment.mmRelatedDebitAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmRelatedInvestigationCaseResolution
 * Payment.mmRelatedInvestigationCaseResolution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmOriginalPayment
 * Payment.mmOriginalPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmReturnPayment
 * Payment.mmReturnPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmRelatedSecuritiesSettlement
 * Payment.mmRelatedSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmInvoiceReconciliation
 * Payment.mmInvoiceReconciliation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPaymentInstrument
 * Payment.mmPaymentInstrument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmAccount
 * Payment.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmAdjustments
 * Payment.mmAdjustments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmContractRegistration
 * Payment.mmContractRegistration}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#mmPayment
 * CashAccount.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#mmRelatedPaymentSettlement
 * Tax.mmRelatedPaymentSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmPayment
 * Adjustment.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentOffset
 * PaymentObligation.mmPaymentOffset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmOriginalPayment
 * Payment.mmOriginalPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmReturnPayment
 * Payment.mmReturnPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CreditInstrument#mmRelatedPayment
 * CreditInstrument.mmRelatedPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentExecution#mmPayment
 * PaymentExecution.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmPayment
 * PaymentIdentification.mmPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmPayment
 * PaymentPartyRole.mmPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentStatus#mmPayment
 * PaymentStatus.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPayment
 * SecuritiesSettlement.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmRelatedPayment
 * CurrencyExchange.mmRelatedPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#mmPayment
 * Invoice.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#mmUnderlyingPayment
 * PaymentInvestigationCase.mmUnderlyingPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SettlementTimeRequest#mmPayment
 * SettlementTimeRequest.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#mmAuthorisedReturn
 * DebitAuthorisation.mmAuthorisedReturn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmPaymentCorrection
 * PaymentInvestigationCaseResolution.mmPaymentCorrection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmPayment
 * CommercialTradeSettlement.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmRelatedPayment
 * RegisteredContract.mmRelatedPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashSettlement1#mmOtherCashSettlementDetails
 * CashSettlement1.mmOtherCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashSettlement2#mmOtherCashSettlementDetails
 * CashSettlement2.mmOtherCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13#mmSubscriptionPaymentInstrument
 * PaymentInstrument13.mmSubscriptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13#mmRedemptionPaymentInstrument
 * PaymentInstrument13.mmRedemptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13#mmDividendPaymentInstrument
 * PaymentInstrument13.mmDividendPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13#mmSavingsPlanPaymentInstrument
 * PaymentInstrument13.mmSavingsPlanPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13#mmInterestPaymentInstrument
 * PaymentInstrument13.mmInterestPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction72#mmPaymentInstrument
 * PaymentTransaction72.mmPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction70#mmPaymentInstrument
 * PaymentTransaction70.mmPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction71#mmCashInOrOut
 * PaymentTransaction71.mmCashInOrOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashInOrOut7Choice#mmCashInPaymentInstrument
 * CashInOrOut7Choice.mmCashInPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashInOrOut7Choice#mmCashOutPaymentInstrument
 * CashInOrOut7Choice.mmCashOutPaymentInstrument}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.IndividualPayment
 * IndividualPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BulkPayment BulkPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashMovement1 CashMovement1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashMovement2 CashMovement2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashMovement3 CashMovement3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashSettlement1
 * CashSettlement1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashSettlement2
 * CashSettlement2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstrument13
 * PaymentInstrument13}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentInstrument18Choice
 * PaymentInstrument18Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentInstrument19Choice
 * PaymentInstrument19Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction72
 * PaymentTransaction72}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction70
 * PaymentTransaction70}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction71
 * PaymentTransaction71}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentInstrument21Choice
 * PaymentInstrument21Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentInstrument20Choice
 * PaymentInstrument20Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CashInOrOut7Choice
 * CashInOrOut7Choice}</li>
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
 * "Payment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Payment information and processes required to transfer cash end to end from the debtor to the creditor."
 * </li>
 * </ul>
 */
public class Payment extends ObligationFulfilment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.PaymentObligation> paymentObligation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentOffset
	 * PaymentObligation.mmPaymentOffset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the obligation which created the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Payment, List<PaymentObligation>> mmPaymentObligation = new MMBusinessAssociationEnd<Payment, List<PaymentObligation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Specifies the obligation which created the payment.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmPaymentOffset;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}

		@Override
		public List<PaymentObligation> getValue(Payment obj) {
			return obj.getPaymentObligation();
		}

		@Override
		public void setValue(Payment obj, List<PaymentObligation> value) {
			obj.setPaymentObligation(value);
		}
	};
	protected CurrencyCode currencyOfTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyOfTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the currency of the amount to be transferred which may be different from the currency of the debtor's account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Payment, CurrencyCode> mmCurrencyOfTransfer = new MMBusinessAttribute<Payment, CurrencyCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyOfTransfer";
			definition = "Specifies the currency of the amount to be transferred which may be different from the currency of the debtor's account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(Payment obj) {
			return obj.getCurrencyOfTransfer();
		}

		@Override
		public void setValue(Payment obj, CurrencyCode value) {
			obj.setCurrencyOfTransfer(value);
		}
	};
	protected List<CreditInstrument> creditMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CreditInstrument#mmRelatedPayment
	 * CreditInstrument.mmRelatedPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CreditInstrument
	 * CreditInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the transfer method to be used for the credit."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Payment, List<CreditInstrument>> mmCreditMethod = new MMBusinessAssociationEnd<Payment, List<CreditInstrument>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditMethod";
			definition = "Specifies the transfer method to be used for the credit.";
			minOccurs = 1;
			opposite_lazy = () -> CreditInstrument.mmRelatedPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CreditInstrument.mmObject();
		}

		@Override
		public List<CreditInstrument> getValue(Payment obj) {
			return obj.getCreditMethod();
		}

		@Override
		public void setValue(Payment obj, List<CreditInstrument> value) {
			obj.setCreditMethod(value);
		}
	};
	protected PaymentTypeCode type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type, or nature, of the payment, eg, express payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Payment, PaymentTypeCode> mmType = new MMBusinessAttribute<Payment, PaymentTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type, or nature, of the payment, eg, express payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentTypeCode.mmObject();
		}

		@Override
		public PaymentTypeCode getValue(Payment obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Payment obj, PaymentTypeCode value) {
			obj.setType(value);
		}
	};
	protected CurrencyAndAmount instructedAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#mmTotalSettlementAmount
	 * SubscriptionBulkOrder5.mmTotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#mmTotalSettlementAmount
	 * RedemptionBulkExecution5.mmTotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmTotalSettlementAmount
	 * RedemptionMultipleExecution5.mmTotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#mmTotalSettlementAmount
	 * RedemptionMultipleOrder6.mmTotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#mmTotalSettlementAmount
	 * SubscriptionMultipleOrder6.mmTotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4#mmTotalSettlementAmount
	 * SubscriptionBulkExecution4.mmTotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#mmTotalSettlementAmount
	 * RedemptionBulkOrder6.mmTotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5#mmTotalSettlementAmount
	 * SubscriptionMultipleExecution5.mmTotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5#mmSettlementAmount
	 * FundOrderData5.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmSettlementAmount
	 * RedemptionExecution16.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData6#mmSettlementAmount
	 * FundOrderData6.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmSettlementAmount
	 * RedemptionExecution15.mmSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Payment, CurrencyAndAmount> mmInstructedAmount = new MMBusinessAttribute<Payment, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(SubscriptionBulkOrder5.mmTotalSettlementAmount, RedemptionBulkExecution5.mmTotalSettlementAmount, RedemptionMultipleExecution5.mmTotalSettlementAmount,
					RedemptionMultipleOrder6.mmTotalSettlementAmount, SubscriptionMultipleOrder6.mmTotalSettlementAmount, SubscriptionBulkExecution4.mmTotalSettlementAmount, RedemptionBulkOrder6.mmTotalSettlementAmount,
					SubscriptionMultipleExecution5.mmTotalSettlementAmount, FundOrderData5.mmSettlementAmount, RedemptionExecution16.mmSettlementAmount, FundOrderData6.mmSettlementAmount, RedemptionExecution15.mmSettlementAmount);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructedAmount";
			definition = "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Payment obj) {
			return obj.getInstructedAmount();
		}

		@Override
		public void setValue(Payment obj, CurrencyAndAmount value) {
			obj.setInstructedAmount(value);
		}
	};
	protected PriorityCode priority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.PriorityCode
	 * PriorityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Urgency or order of importance that the originator would like the recipient of the payment  to apply to its processing."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Payment, PriorityCode> mmPriority = new MMBusinessAttribute<Payment, PriorityCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Priority";
			definition = "Urgency or order of importance that the originator would like the recipient of the payment  to apply to its processing.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriorityCode.mmObject();
		}

		@Override
		public PriorityCode getValue(Payment obj) {
			return obj.getPriority();
		}

		@Override
		public void setValue(Payment obj, PriorityCode value) {
			obj.setPriority(value);
		}
	};
	protected ISODate valueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection28#mmValueDate
	 * AmountAndDirection28.mmValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashMovement3#mmValueDate
	 * CashMovement3.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCompensation1#mmValueDate
	 * CashCompensation1.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast4#mmCashSettlementDate
	 * NetCashForecast4.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast5#mmCashSettlementDate
	 * NetCashForecast5.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmCashSettlementDate
	 * SwitchExecution7.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmCashSettlementDate
	 * SwitchOrder7.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmCashSettlementDate
	 * RedemptionOrder14.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmCashSettlementDate
	 * SubscriptionExecution13.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmCashSettlementDate
	 * SubscriptionExecution12.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmCashSettlementDate
	 * SubscriptionOrder15.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmCashSettlementDate
	 * RedemptionOrder15.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmCashSettlementDate
	 * RedemptionExecution16.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmCashSettlementDate
	 * SubscriptionOrder14.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmCashSettlementDate
	 * RedemptionExecution15.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmExpectedValueDate
	 * SecuritiesFinancingTransactionDetails35.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails105#mmExpectedValueDate
	 * TransactionDetails105.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails104#mmExpectedValueDate
	 * TransactionDetails104.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection87#mmValueDate
	 * AmountAndDirection87.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection88#mmValueDate
	 * AmountAndDirection88.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection89#mmValueDate
	 * AmountAndDirection89.mmValueDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which a payment must be executed"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Payment, ISODate> mmValueDate = new MMBusinessAttribute<Payment, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(AmountAndDirection28.mmValueDate, CashMovement3.mmValueDate, CashCompensation1.mmValueDate, NetCashForecast4.mmCashSettlementDate, NetCashForecast5.mmCashSettlementDate,
					SwitchExecution7.mmCashSettlementDate, SwitchOrder7.mmCashSettlementDate, RedemptionOrder14.mmCashSettlementDate, SubscriptionExecution13.mmCashSettlementDate, SubscriptionExecution12.mmCashSettlementDate,
					SubscriptionOrder15.mmCashSettlementDate, RedemptionOrder15.mmCashSettlementDate, RedemptionExecution16.mmCashSettlementDate, SubscriptionOrder14.mmCashSettlementDate, RedemptionExecution15.mmCashSettlementDate,
					SecuritiesFinancingTransactionDetails35.mmExpectedValueDate, TransactionDetails105.mmExpectedValueDate, TransactionDetails104.mmExpectedValueDate, AmountAndDirection87.mmValueDate, AmountAndDirection88.mmValueDate,
					AmountAndDirection89.mmValueDate);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date on which a payment must be executed";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(Payment obj) {
			return obj.getValueDate();
		}

		@Override
		public void setValue(Payment obj, ISODate value) {
			obj.setValueDate(value);
		}
	};
	protected List<com.tools20022.repository.entity.PaymentStatus> paymentStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmPayment
	 * PaymentStatus.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentStatus
	 * PaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of a payment at a specified time."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Payment, List<PaymentStatus>> mmPaymentStatus = new MMBusinessAssociationEnd<Payment, List<PaymentStatus>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentStatus";
			definition = "Specifies the status of a payment at a specified time.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
		}

		@Override
		public List<PaymentStatus> getValue(Payment obj) {
			return obj.getPaymentStatus();
		}

		@Override
		public void setValue(Payment obj, List<PaymentStatus> value) {
			obj.setPaymentStatus(value);
		}
	};
	protected List<PaymentPartyRole> partyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmPayment
	 * PaymentPartyRole.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentPartyRole
	 * PaymentPartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails34#mmCashParties
	 * SecuritiesSettlementTransactionDetails34.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails33#mmCashParties
	 * SecuritiesSettlementTransactionDetails33.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32#mmCashParties
	 * SecuritiesSettlementTransactionDetails32.mmCashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption58#mmCashParties
	 * CashOption58.mmCashParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to a payment and played by a party at that step in a payment flow."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Payment, List<PaymentPartyRole>> mmPartyRole = new MMBusinessAssociationEnd<Payment, List<PaymentPartyRole>>() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionDetails34.mmCashParties, SecuritiesSettlementTransactionDetails33.mmCashParties, SecuritiesSettlementTransactionDetails32.mmCashParties,
					CashOption58.mmCashParties);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to a payment and played by a party at that step in a payment flow.";
			minOccurs = 1;
			opposite_lazy = () -> PaymentPartyRole.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentPartyRole.mmObject();
		}

		@Override
		public List<PaymentPartyRole> getValue(Payment obj) {
			return obj.getPartyRole();
		}

		@Override
		public void setValue(Payment obj, List<PaymentPartyRole> value) {
			obj.setPartyRole(value);
		}
	};
	protected List<Tax> taxOnPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRelatedPaymentSettlement
	 * Tax.mmRelatedPaymentSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxOnPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment levy tax."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Payment, List<Tax>> mmTaxOnPayment = new MMBusinessAssociationEnd<Payment, List<Tax>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxOnPayment";
			definition = "Payment levy tax.";
			minOccurs = 0;
			opposite_lazy = () -> Tax.mmRelatedPaymentSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Tax.mmObject();
		}

		@Override
		public List<Tax> getValue(Payment obj) {
			return obj.getTaxOnPayment();
		}

		@Override
		public void setValue(Payment obj, List<Tax> value) {
			obj.setTaxOnPayment(value);
		}
	};
	protected List<com.tools20022.repository.entity.PaymentExecution> paymentExecution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmPayment
	 * PaymentExecution.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Describes the processes necessary to execute a payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Payment, List<PaymentExecution>> mmPaymentExecution = new MMBusinessAssociationEnd<Payment, List<PaymentExecution>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentExecution";
			definition = "Describes the processes necessary to execute a payment.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
		}

		@Override
		public List<PaymentExecution> getValue(Payment obj) {
			return obj.getPaymentExecution();
		}

		@Override
		public void setValue(Payment obj, List<PaymentExecution> value) {
			obj.setPaymentExecution(value);
		}
	};
	protected ISODate poolingAdjustmentDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolingAdjustmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date used for the correction of the value date of a cash pool movement that has been posted with a different value date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Payment, ISODate> mmPoolingAdjustmentDate = new MMBusinessAttribute<Payment, ISODate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PoolingAdjustmentDate";
			definition = "Date used for the correction of the value date of a cash pool movement that has been posted with a different value date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(Payment obj) {
			return obj.getPoolingAdjustmentDate();
		}

		@Override
		public void setValue(Payment obj, ISODate value) {
			obj.setPoolingAdjustmentDate(value);
		}
	};
	protected ImpliedCurrencyAndAmount equivalentAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquivalentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be transferred between debtor and creditor, before deduction of charges, expressed in the currency of the debtor's account, and to be transferred in a different currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Payment, ImpliedCurrencyAndAmount> mmEquivalentAmount = new MMBusinessAttribute<Payment, ImpliedCurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EquivalentAmount";
			definition = "Amount of money to be transferred between debtor and creditor, before deduction of charges, expressed in the currency of the debtor's account, and to be transferred in a different currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(Payment obj) {
			return obj.getEquivalentAmount();
		}

		@Override
		public void setValue(Payment obj, ImpliedCurrencyAndAmount value) {
			obj.setEquivalentAmount(value);
		}
	};
	protected List<com.tools20022.repository.entity.CurrencyExchange> currencyExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmRelatedPayment
	 * CurrencyExchange.mmRelatedPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the exchange rate and amounts used in the payment"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Payment, List<CurrencyExchange>> mmCurrencyExchange = new MMBusinessAssociationEnd<Payment, List<CurrencyExchange>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Information on the exchange rate and amounts used in the payment";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmRelatedPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}

		@Override
		public List<CurrencyExchange> getValue(Payment obj) {
			return obj.getCurrencyExchange();
		}

		@Override
		public void setValue(Payment obj, List<CurrencyExchange> value) {
			obj.setCurrencyExchange(value);
		}
	};
	protected InstructionCode instructionForCreditorAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionForCreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information related to the processing of the payment instruction that may need to be acted upon by the creditor agent. \nUsage: The instruction can relate to a level of service, can be an instruction to be executed by the creditor's agent, or can be information required by the creditor's agent to process the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Payment, InstructionCode> mmInstructionForCreditorAgent = new MMBusinessAttribute<Payment, InstructionCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructionForCreditorAgent";
			definition = "Further information related to the processing of the payment instruction that may need to be acted upon by the creditor agent. \nUsage: The instruction can relate to a level of service, can be an instruction to be executed by the creditor's agent, or can be information required by the creditor's agent to process the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InstructionCode.mmObject();
		}

		@Override
		public InstructionCode getValue(Payment obj) {
			return obj.getInstructionForCreditorAgent();
		}

		@Override
		public void setValue(Payment obj, InstructionCode value) {
			obj.setInstructionForCreditorAgent(value);
		}
	};
	protected InstructionCode instructionForDebtorAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionForDebtorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information related to the processing of the payment instruction that may need to be acted upon by the debtor's agent.  \nUsage: The instruction can relate to a level of service, can be an instruction to be executed by the debtor's agent, or can be information required by the debtor's agent to process the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Payment, InstructionCode> mmInstructionForDebtorAgent = new MMBusinessAttribute<Payment, InstructionCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructionForDebtorAgent";
			definition = "Further information related to the processing of the payment instruction that may need to be acted upon by the debtor's agent.  \nUsage: The instruction can relate to a level of service, can be an instruction to be executed by the debtor's agent, or can be information required by the debtor's agent to process the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InstructionCode.mmObject();
		}

		@Override
		public InstructionCode getValue(Payment obj) {
			return obj.getInstructionForDebtorAgent();
		}

		@Override
		public void setValue(Payment obj, InstructionCode value) {
			obj.setInstructionForDebtorAgent(value);
		}
	};
	protected List<PaymentIdentification> paymentRelatedIdentifications;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmPayment
	 * PaymentIdentification.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentRelatedIdentifications"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifications provided to identify a payment at different processing levels."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Payment, List<PaymentIdentification>> mmPaymentRelatedIdentifications = new MMBusinessAssociationEnd<Payment, List<PaymentIdentification>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentRelatedIdentifications";
			definition = "Identifications provided to identify a payment at different processing levels.";
			minOccurs = 0;
			opposite_lazy = () -> PaymentIdentification.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentIdentification.mmObject();
		}

		@Override
		public List<PaymentIdentification> getValue(Payment obj) {
			return obj.getPaymentRelatedIdentifications();
		}

		@Override
		public void setValue(Payment obj, List<PaymentIdentification> value) {
			obj.setPaymentRelatedIdentifications(value);
		}
	};
	protected PaymentInvestigationCase relatedInvestigationCase;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#mmUnderlyingPayment
	 * PaymentInvestigationCase.mmUnderlyingPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase
	 * PaymentInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestigationCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investigation case assigned to the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Payment, Optional<PaymentInvestigationCase>> mmRelatedInvestigationCase = new MMBusinessAssociationEnd<Payment, Optional<PaymentInvestigationCase>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCase";
			definition = "Investigation case assigned to the payment.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> PaymentInvestigationCase.mmUnderlyingPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentInvestigationCase.mmObject();
		}

		@Override
		public Optional<PaymentInvestigationCase> getValue(Payment obj) {
			return obj.getRelatedInvestigationCase();
		}

		@Override
		public void setValue(Payment obj, Optional<PaymentInvestigationCase> value) {
			obj.setRelatedInvestigationCase(value.orElse(null));
		}
	};
	protected SettlementTimeRequest settlementTimeRequest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SettlementTimeRequest#mmPayment
	 * SettlementTimeRequest.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SettlementTimeRequest
	 * SettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTimeRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the requested settlement time of the instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Payment, Optional<SettlementTimeRequest>> mmSettlementTimeRequest = new MMBusinessAssociationEnd<Payment, Optional<SettlementTimeRequest>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementTimeRequest";
			definition = "Information on the requested settlement time of the instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SettlementTimeRequest.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SettlementTimeRequest.mmObject();
		}

		@Override
		public Optional<SettlementTimeRequest> getValue(Payment obj) {
			return obj.getSettlementTimeRequest();
		}

		@Override
		public void setValue(Payment obj, Optional<SettlementTimeRequest> value) {
			obj.setSettlementTimeRequest(value.orElse(null));
		}
	};
	protected CurrencyAndAmount amount;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.CashMovement1#mmAmount
	 * CashMovement1.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashMovement2#mmAmount
	 * CashMovement2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashProceeds1#mmPostingAmount
	 * CashProceeds1.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashMovement3#mmPostingAmount
	 * CashMovement3.mmPostingAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Payment, CurrencyAndAmount> mmAmount = new MMBusinessAttribute<Payment, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(CashMovement1.mmAmount, CashMovement2.mmAmount, CashProceeds1.mmPostingAmount, CashMovement3.mmPostingAmount);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Payment obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(Payment obj, CurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	protected List<CommercialTradeSettlement> tradeSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmPayment
	 * CommercialTradeSettlement.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement
	 * CommercialTradeSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the settlement operation which originates the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Payment, List<CommercialTradeSettlement>> mmTradeSettlement = new MMBusinessAssociationEnd<Payment, List<CommercialTradeSettlement>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeSettlement";
			definition = "Specifies the settlement operation which originates the payment.";
			minOccurs = 0;
			opposite_lazy = () -> CommercialTradeSettlement.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CommercialTradeSettlement.mmObject();
		}

		@Override
		public List<CommercialTradeSettlement> getValue(Payment obj) {
			return obj.getTradeSettlement();
		}

		@Override
		public void setValue(Payment obj, List<CommercialTradeSettlement> value) {
			obj.setTradeSettlement(value);
		}
	};
	protected Max140Text standardSettlementInstructions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandardSettlementInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the standard settlement instructions."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Payment, Max140Text> mmStandardSettlementInstructions = new MMBusinessAttribute<Payment, Max140Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StandardSettlementInstructions";
			definition = "Identifies the standard settlement instructions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(Payment obj) {
			return obj.getStandardSettlementInstructions();
		}

		@Override
		public void setValue(Payment obj, Max140Text value) {
			obj.setStandardSettlementInstructions(value);
		}
	};
	protected DebitAuthorisation relatedDebitAuthorisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#mmAuthorisedReturn
	 * DebitAuthorisation.mmAuthorisedReturn}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DebitAuthorisation
	 * DebitAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDebitAuthorisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment which is the result of the debit authorisation"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Payment, Optional<DebitAuthorisation>> mmRelatedDebitAuthorisation = new MMBusinessAssociationEnd<Payment, Optional<DebitAuthorisation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedDebitAuthorisation";
			definition = "Payment which is the result of the debit authorisation";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> DebitAuthorisation.mmAuthorisedReturn;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DebitAuthorisation.mmObject();
		}

		@Override
		public Optional<DebitAuthorisation> getValue(Payment obj) {
			return obj.getRelatedDebitAuthorisation();
		}

		@Override
		public void setValue(Payment obj, Optional<DebitAuthorisation> value) {
			obj.setRelatedDebitAuthorisation(value.orElse(null));
		}
	};
	protected PaymentInvestigationCaseResolution relatedInvestigationCaseResolution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmPaymentCorrection
	 * PaymentInvestigationCaseResolution.mmPaymentCorrection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution
	 * PaymentInvestigationCaseResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestigationCaseResolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Case resolution related to a specific payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Payment, Optional<PaymentInvestigationCaseResolution>> mmRelatedInvestigationCaseResolution = new MMBusinessAssociationEnd<Payment, Optional<PaymentInvestigationCaseResolution>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCaseResolution";
			definition = "Case resolution related to a specific payment.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> PaymentInvestigationCaseResolution.mmPaymentCorrection;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
		}

		@Override
		public Optional<PaymentInvestigationCaseResolution> getValue(Payment obj) {
			return obj.getRelatedInvestigationCaseResolution();
		}

		@Override
		public void setValue(Payment obj, Optional<PaymentInvestigationCaseResolution> value) {
			obj.setRelatedInvestigationCaseResolution(value.orElse(null));
		}
	};
	protected Payment originalPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmReturnPayment
	 * Payment.mmReturnPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original payment which is returned."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Payment, Payment> mmOriginalPayment = new MMBusinessAssociationEnd<Payment, Payment>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OriginalPayment";
			definition = "Original payment which is returned.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Payment.mmReturnPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Payment.mmObject();
		}

		@Override
		public Payment getValue(Payment obj) {
			return obj.getOriginalPayment();
		}

		@Override
		public void setValue(Payment obj, Payment value) {
			obj.setOriginalPayment(value);
		}
	};
	protected List<Payment> returnPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmOriginalPayment
	 * Payment.mmOriginalPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment which offsets an original payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Payment, List<Payment>> mmReturnPayment = new MMBusinessAssociationEnd<Payment, List<Payment>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReturnPayment";
			definition = "Payment which offsets an original payment.";
			minOccurs = 0;
			opposite_lazy = () -> Payment.mmOriginalPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Payment.mmObject();
		}

		@Override
		public List<Payment> getValue(Payment obj) {
			return obj.getReturnPayment();
		}

		@Override
		public void setValue(Payment obj, List<Payment> value) {
			obj.setReturnPayment(value);
		}
	};
	protected SecuritiesSettlement relatedSecuritiesSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPayment
	 * SecuritiesSettlement.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities settlement process which is the source of the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Payment, SecuritiesSettlement> mmRelatedSecuritiesSettlement = new MMBusinessAssociationEnd<Payment, SecuritiesSettlement>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesSettlement";
			definition = "Securities settlement process which is the source of the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesSettlement.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesSettlement.mmObject();
		}

		@Override
		public SecuritiesSettlement getValue(Payment obj) {
			return obj.getRelatedSecuritiesSettlement();
		}

		@Override
		public void setValue(Payment obj, SecuritiesSettlement value) {
			obj.setRelatedSecuritiesSettlement(value);
		}
	};
	protected List<Invoice> invoiceReconciliation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmPayment
	 * Invoice.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceReconciliation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reconciliation of the amounts of an invoice with the amounts included in one or more payments."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Payment, List<Invoice>> mmInvoiceReconciliation = new MMBusinessAssociationEnd<Payment, List<Invoice>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvoiceReconciliation";
			definition = "Reconciliation of the amounts of an invoice with the amounts included in one or more payments.";
			minOccurs = 0;
			opposite_lazy = () -> Invoice.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Invoice.mmObject();
		}

		@Override
		public List<Invoice> getValue(Payment obj) {
			return obj.getInvoiceReconciliation();
		}

		@Override
		public void setValue(Payment obj, List<Invoice> value) {
			obj.setInvoiceReconciliation(value);
		}
	};
	protected PaymentInstrumentCode paymentInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode
	 * PaymentInstrumentCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment type at the origin of the cash entry eg, a cheque."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Payment, PaymentInstrumentCode> mmPaymentInstrument = new MMBusinessAttribute<Payment, PaymentInstrumentCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentInstrument";
			definition = "Payment type at the origin of the cash entry eg, a cheque.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentInstrumentCode.mmObject();
		}

		@Override
		public PaymentInstrumentCode getValue(Payment obj) {
			return obj.getPaymentInstrument();
		}

		@Override
		public void setValue(Payment obj, PaymentInstrumentCode value) {
			obj.setPaymentInstrument(value);
		}
	};
	protected CashAccount account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmPayment
	 * CashAccount.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account debited for the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Payment, CashAccount> mmAccount = new MMBusinessAssociationEnd<Payment, CashAccount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account debited for the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CashAccount.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashAccount.mmObject();
		}

		@Override
		public CashAccount getValue(Payment obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(Payment obj, CashAccount value) {
			obj.setAccount(value);
		}
	};
	protected Adjustment adjustments;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmPayment
	 * Adjustment.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Adjustment
	 * Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Adjustments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the charges or the allowance related to a payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Payment, Adjustment> mmAdjustments = new MMBusinessAssociationEnd<Payment, Adjustment>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Adjustments";
			definition = "Specifies the charges or the allowance related to a payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Adjustment.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Adjustment.mmObject();
		}

		@Override
		public Adjustment getValue(Payment obj) {
			return obj.getAdjustments();
		}

		@Override
		public void setValue(Payment obj, Adjustment value) {
			obj.setAdjustments(value);
		}
	};
	protected RegisteredContract contractRegistration;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmRelatedPayment
	 * RegisteredContract.mmRelatedPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractRegistration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the payment of the registered contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Payment, RegisteredContract> mmContractRegistration = new MMBusinessAssociationEnd<Payment, RegisteredContract>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ContractRegistration";
			definition = "Provides the payment of the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> RegisteredContract.mmRelatedPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> RegisteredContract.mmObject();
		}

		@Override
		public RegisteredContract getValue(Payment obj) {
			return obj.getContractRegistration();
		}

		@Override
		public void setValue(Payment obj, RegisteredContract value) {
			obj.setContractRegistration(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Payment";
				definition = "Payment information and processes required to transfer cash end to end from the debtor to the creditor.";
				associationDomain_lazy = () -> Arrays.asList(CashAccount.mmPayment, Tax.mmRelatedPaymentSettlement, Adjustment.mmPayment, com.tools20022.repository.entity.PaymentObligation.mmPaymentOffset, Payment.mmOriginalPayment,
						Payment.mmReturnPayment, CreditInstrument.mmRelatedPayment, com.tools20022.repository.entity.PaymentExecution.mmPayment, PaymentIdentification.mmPayment, PaymentPartyRole.mmPayment,
						com.tools20022.repository.entity.PaymentStatus.mmPayment, SecuritiesSettlement.mmPayment, com.tools20022.repository.entity.CurrencyExchange.mmRelatedPayment, Invoice.mmPayment,
						PaymentInvestigationCase.mmUnderlyingPayment, com.tools20022.repository.entity.SettlementTimeRequest.mmPayment, DebitAuthorisation.mmAuthorisedReturn, PaymentInvestigationCaseResolution.mmPaymentCorrection,
						CommercialTradeSettlement.mmPayment, RegisteredContract.mmRelatedPayment);
				derivationElement_lazy = () -> Arrays.asList(CashSettlement1.mmOtherCashSettlementDetails, CashSettlement2.mmOtherCashSettlementDetails, PaymentInstrument13.mmSubscriptionPaymentInstrument,
						PaymentInstrument13.mmRedemptionPaymentInstrument, PaymentInstrument13.mmDividendPaymentInstrument, PaymentInstrument13.mmSavingsPlanPaymentInstrument, PaymentInstrument13.mmInterestPaymentInstrument,
						PaymentTransaction72.mmPaymentInstrument, PaymentTransaction70.mmPaymentInstrument, PaymentTransaction71.mmCashInOrOut, CashInOrOut7Choice.mmCashInPaymentInstrument, CashInOrOut7Choice.mmCashOutPaymentInstrument);
				subType_lazy = () -> Arrays.asList(IndividualPayment.mmObject(), BulkPayment.mmObject());
				superType_lazy = () -> ObligationFulfilment.mmObject();
				element_lazy = () -> Arrays.asList(Payment.mmPaymentObligation, Payment.mmCurrencyOfTransfer, Payment.mmCreditMethod, Payment.mmType, Payment.mmInstructedAmount, Payment.mmPriority, Payment.mmValueDate,
						Payment.mmPaymentStatus, Payment.mmPartyRole, Payment.mmTaxOnPayment, Payment.mmPaymentExecution, Payment.mmPoolingAdjustmentDate, Payment.mmEquivalentAmount, Payment.mmCurrencyExchange,
						Payment.mmInstructionForCreditorAgent, Payment.mmInstructionForDebtorAgent, Payment.mmPaymentRelatedIdentifications, Payment.mmRelatedInvestigationCase, Payment.mmSettlementTimeRequest, Payment.mmAmount,
						Payment.mmTradeSettlement, Payment.mmStandardSettlementInstructions, Payment.mmRelatedDebitAuthorisation, Payment.mmRelatedInvestigationCaseResolution, Payment.mmOriginalPayment, Payment.mmReturnPayment,
						Payment.mmRelatedSecuritiesSettlement, Payment.mmInvoiceReconciliation, Payment.mmPaymentInstrument, Payment.mmAccount, Payment.mmAdjustments, Payment.mmContractRegistration);
				derivationComponent_lazy = () -> Arrays.asList(CashMovement1.mmObject(), CashMovement2.mmObject(), CashMovement3.mmObject(), CashSettlement1.mmObject(), CashSettlement2.mmObject(), PaymentInstrument13.mmObject(),
						PaymentInstrument18Choice.mmObject(), PaymentInstrument19Choice.mmObject(), PaymentTransaction72.mmObject(), PaymentTransaction70.mmObject(), PaymentTransaction71.mmObject(), PaymentInstrument21Choice.mmObject(),
						PaymentInstrument20Choice.mmObject(), CashInOrOut7Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Payment.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<PaymentObligation> getPaymentObligation() {
		return paymentObligation == null ? paymentObligation = new ArrayList<>() : paymentObligation;
	}

	public Payment setPaymentObligation(List<com.tools20022.repository.entity.PaymentObligation> paymentObligation) {
		this.paymentObligation = Objects.requireNonNull(paymentObligation);
		return this;
	}

	public CurrencyCode getCurrencyOfTransfer() {
		return currencyOfTransfer;
	}

	public Payment setCurrencyOfTransfer(CurrencyCode currencyOfTransfer) {
		this.currencyOfTransfer = Objects.requireNonNull(currencyOfTransfer);
		return this;
	}

	public List<CreditInstrument> getCreditMethod() {
		return creditMethod == null ? creditMethod = new ArrayList<>() : creditMethod;
	}

	public Payment setCreditMethod(List<CreditInstrument> creditMethod) {
		this.creditMethod = Objects.requireNonNull(creditMethod);
		return this;
	}

	public PaymentTypeCode getType() {
		return type;
	}

	public Payment setType(PaymentTypeCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public CurrencyAndAmount getInstructedAmount() {
		return instructedAmount;
	}

	public Payment setInstructedAmount(CurrencyAndAmount instructedAmount) {
		this.instructedAmount = Objects.requireNonNull(instructedAmount);
		return this;
	}

	public PriorityCode getPriority() {
		return priority;
	}

	public Payment setPriority(PriorityCode priority) {
		this.priority = Objects.requireNonNull(priority);
		return this;
	}

	public ISODate getValueDate() {
		return valueDate;
	}

	public Payment setValueDate(ISODate valueDate) {
		this.valueDate = Objects.requireNonNull(valueDate);
		return this;
	}

	public List<PaymentStatus> getPaymentStatus() {
		return paymentStatus == null ? paymentStatus = new ArrayList<>() : paymentStatus;
	}

	public Payment setPaymentStatus(List<com.tools20022.repository.entity.PaymentStatus> paymentStatus) {
		this.paymentStatus = Objects.requireNonNull(paymentStatus);
		return this;
	}

	public List<PaymentPartyRole> getPartyRole() {
		return partyRole == null ? partyRole = new ArrayList<>() : partyRole;
	}

	public Payment setPartyRole(List<PaymentPartyRole> partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}

	public List<Tax> getTaxOnPayment() {
		return taxOnPayment == null ? taxOnPayment = new ArrayList<>() : taxOnPayment;
	}

	public Payment setTaxOnPayment(List<Tax> taxOnPayment) {
		this.taxOnPayment = Objects.requireNonNull(taxOnPayment);
		return this;
	}

	public List<PaymentExecution> getPaymentExecution() {
		return paymentExecution == null ? paymentExecution = new ArrayList<>() : paymentExecution;
	}

	public Payment setPaymentExecution(List<com.tools20022.repository.entity.PaymentExecution> paymentExecution) {
		this.paymentExecution = Objects.requireNonNull(paymentExecution);
		return this;
	}

	public ISODate getPoolingAdjustmentDate() {
		return poolingAdjustmentDate;
	}

	public Payment setPoolingAdjustmentDate(ISODate poolingAdjustmentDate) {
		this.poolingAdjustmentDate = Objects.requireNonNull(poolingAdjustmentDate);
		return this;
	}

	public ImpliedCurrencyAndAmount getEquivalentAmount() {
		return equivalentAmount;
	}

	public Payment setEquivalentAmount(ImpliedCurrencyAndAmount equivalentAmount) {
		this.equivalentAmount = Objects.requireNonNull(equivalentAmount);
		return this;
	}

	public List<CurrencyExchange> getCurrencyExchange() {
		return currencyExchange == null ? currencyExchange = new ArrayList<>() : currencyExchange;
	}

	public Payment setCurrencyExchange(List<com.tools20022.repository.entity.CurrencyExchange> currencyExchange) {
		this.currencyExchange = Objects.requireNonNull(currencyExchange);
		return this;
	}

	public InstructionCode getInstructionForCreditorAgent() {
		return instructionForCreditorAgent;
	}

	public Payment setInstructionForCreditorAgent(InstructionCode instructionForCreditorAgent) {
		this.instructionForCreditorAgent = Objects.requireNonNull(instructionForCreditorAgent);
		return this;
	}

	public InstructionCode getInstructionForDebtorAgent() {
		return instructionForDebtorAgent;
	}

	public Payment setInstructionForDebtorAgent(InstructionCode instructionForDebtorAgent) {
		this.instructionForDebtorAgent = Objects.requireNonNull(instructionForDebtorAgent);
		return this;
	}

	public List<PaymentIdentification> getPaymentRelatedIdentifications() {
		return paymentRelatedIdentifications == null ? paymentRelatedIdentifications = new ArrayList<>() : paymentRelatedIdentifications;
	}

	public Payment setPaymentRelatedIdentifications(List<PaymentIdentification> paymentRelatedIdentifications) {
		this.paymentRelatedIdentifications = Objects.requireNonNull(paymentRelatedIdentifications);
		return this;
	}

	public Optional<PaymentInvestigationCase> getRelatedInvestigationCase() {
		return relatedInvestigationCase == null ? Optional.empty() : Optional.of(relatedInvestigationCase);
	}

	public Payment setRelatedInvestigationCase(PaymentInvestigationCase relatedInvestigationCase) {
		this.relatedInvestigationCase = relatedInvestigationCase;
		return this;
	}

	public Optional<SettlementTimeRequest> getSettlementTimeRequest() {
		return settlementTimeRequest == null ? Optional.empty() : Optional.of(settlementTimeRequest);
	}

	public Payment setSettlementTimeRequest(com.tools20022.repository.entity.SettlementTimeRequest settlementTimeRequest) {
		this.settlementTimeRequest = settlementTimeRequest;
		return this;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public Payment setAmount(CurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public List<CommercialTradeSettlement> getTradeSettlement() {
		return tradeSettlement == null ? tradeSettlement = new ArrayList<>() : tradeSettlement;
	}

	public Payment setTradeSettlement(List<CommercialTradeSettlement> tradeSettlement) {
		this.tradeSettlement = Objects.requireNonNull(tradeSettlement);
		return this;
	}

	public Max140Text getStandardSettlementInstructions() {
		return standardSettlementInstructions;
	}

	public Payment setStandardSettlementInstructions(Max140Text standardSettlementInstructions) {
		this.standardSettlementInstructions = Objects.requireNonNull(standardSettlementInstructions);
		return this;
	}

	public Optional<DebitAuthorisation> getRelatedDebitAuthorisation() {
		return relatedDebitAuthorisation == null ? Optional.empty() : Optional.of(relatedDebitAuthorisation);
	}

	public Payment setRelatedDebitAuthorisation(DebitAuthorisation relatedDebitAuthorisation) {
		this.relatedDebitAuthorisation = relatedDebitAuthorisation;
		return this;
	}

	public Optional<PaymentInvestigationCaseResolution> getRelatedInvestigationCaseResolution() {
		return relatedInvestigationCaseResolution == null ? Optional.empty() : Optional.of(relatedInvestigationCaseResolution);
	}

	public Payment setRelatedInvestigationCaseResolution(PaymentInvestigationCaseResolution relatedInvestigationCaseResolution) {
		this.relatedInvestigationCaseResolution = relatedInvestigationCaseResolution;
		return this;
	}

	public Payment getOriginalPayment() {
		return originalPayment;
	}

	public Payment setOriginalPayment(Payment originalPayment) {
		this.originalPayment = Objects.requireNonNull(originalPayment);
		return this;
	}

	public List<Payment> getReturnPayment() {
		return returnPayment == null ? returnPayment = new ArrayList<>() : returnPayment;
	}

	public Payment setReturnPayment(List<Payment> returnPayment) {
		this.returnPayment = Objects.requireNonNull(returnPayment);
		return this;
	}

	public SecuritiesSettlement getRelatedSecuritiesSettlement() {
		return relatedSecuritiesSettlement;
	}

	public Payment setRelatedSecuritiesSettlement(SecuritiesSettlement relatedSecuritiesSettlement) {
		this.relatedSecuritiesSettlement = Objects.requireNonNull(relatedSecuritiesSettlement);
		return this;
	}

	public List<Invoice> getInvoiceReconciliation() {
		return invoiceReconciliation == null ? invoiceReconciliation = new ArrayList<>() : invoiceReconciliation;
	}

	public Payment setInvoiceReconciliation(List<Invoice> invoiceReconciliation) {
		this.invoiceReconciliation = Objects.requireNonNull(invoiceReconciliation);
		return this;
	}

	public PaymentInstrumentCode getPaymentInstrument() {
		return paymentInstrument;
	}

	public Payment setPaymentInstrument(PaymentInstrumentCode paymentInstrument) {
		this.paymentInstrument = Objects.requireNonNull(paymentInstrument);
		return this;
	}

	public CashAccount getAccount() {
		return account;
	}

	public Payment setAccount(CashAccount account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}

	public Adjustment getAdjustments() {
		return adjustments;
	}

	public Payment setAdjustments(Adjustment adjustments) {
		this.adjustments = Objects.requireNonNull(adjustments);
		return this;
	}

	public RegisteredContract getContractRegistration() {
		return contractRegistration;
	}

	public Payment setContractRegistration(RegisteredContract contractRegistration) {
		this.contractRegistration = Objects.requireNonNull(contractRegistration);
		return this;
	}
}