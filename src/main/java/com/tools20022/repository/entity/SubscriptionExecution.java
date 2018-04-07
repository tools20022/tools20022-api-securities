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

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.InvestmentFundOrderExecution;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Execution of a subscription order.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SubscriptionExecution"
 * src="doc-files/SubscriptionExecution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
 * InvestmentFundOrderExecution}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution#mmEquityComponent
 * SubscriptionExecution.mmEquityComponent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution#mmCashComponent
 * SubscriptionExecution.mmCashComponent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution#mmInvestedNetAmount
 * SubscriptionExecution.mmInvestedNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution#mmRefund
 * SubscriptionExecution.mmRefund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution#mmSubscriptionInterest
 * SubscriptionExecution.mmSubscriptionInterest}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue4#mmCurrentYearSubscriptionDetails
 * ISAYearsOfIssue4.mmCurrentYearSubscriptionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue5#mmCurrentYearSubscriptionDetails
 * ISAYearsOfIssue5.mmCurrentYearSubscriptionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4#mmIndividualExecutionDetails
 * SubscriptionBulkExecution4.mmIndividualExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5#mmIndividualExecutionDetails
 * SubscriptionMultipleExecution5.mmIndividualExecutionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchExecutionSubscriptionLeg
 * SwitchExecutionSubscriptionLeg}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionInformation1
 * SubscriptionInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4
 * SubscriptionBulkExecution4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5
 * SubscriptionMultipleExecution5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionExecution13
 * SubscriptionExecution13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionExecution12
 * SubscriptionExecution12}</li>
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
 * "SubscriptionExecution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Execution of a subscription order."</li>
 * </ul>
 */
public class SubscriptionExecution extends InvestmentFundOrderExecution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount equityComponent;
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation1#mmEquityComponent
	 * SubscriptionInformation1.mmEquityComponent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution
	 * SubscriptionExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquityComponent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount subscribed into equity (not including dividends)."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SubscriptionExecution, CurrencyAndAmount> mmEquityComponent = new MMBusinessAttribute<SubscriptionExecution, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(SubscriptionInformation1.mmEquityComponent);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SubscriptionExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EquityComponent";
			definition = "Amount subscribed into equity (not including dividends).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(SubscriptionExecution obj) {
			return obj.getEquityComponent();
		}

		@Override
		public void setValue(SubscriptionExecution obj, CurrencyAndAmount value) {
			obj.setEquityComponent(value);
		}
	};
	protected CurrencyAndAmount cashComponent;
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation1#mmCashComponent
	 * SubscriptionInformation1.mmCashComponent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution
	 * SubscriptionExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashComponent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount subscribed into cash."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SubscriptionExecution, CurrencyAndAmount> mmCashComponent = new MMBusinessAttribute<SubscriptionExecution, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(SubscriptionInformation1.mmCashComponent);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SubscriptionExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashComponent";
			definition = "Amount subscribed into cash.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(SubscriptionExecution obj) {
			return obj.getCashComponent();
		}

		@Override
		public void setValue(SubscriptionExecution obj, CurrencyAndAmount value) {
			obj.setCashComponent(value);
		}
	};
	protected CurrencyAndAmount investedNetAmount;
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmNetAmount
	 * SubscriptionExecution13.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmNetAmount
	 * SubscriptionExecution12.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmNetAmount
	 * SwitchSubscriptionLegExecution4.mmNetAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution
	 * SubscriptionExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestedNetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net amount of money invested in a specific financial instrument by an investor, expressed in the currency requested by the investor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SubscriptionExecution, CurrencyAndAmount> mmInvestedNetAmount = new MMBusinessAttribute<SubscriptionExecution, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(SubscriptionExecution13.mmNetAmount, SubscriptionExecution12.mmNetAmount, SwitchSubscriptionLegExecution4.mmNetAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SubscriptionExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestedNetAmount";
			definition = "Net amount of money invested in a specific financial instrument by an investor, expressed in the currency requested by the investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(SubscriptionExecution obj) {
			return obj.getInvestedNetAmount();
		}

		@Override
		public void setValue(SubscriptionExecution obj, CurrencyAndAmount value) {
			obj.setInvestedNetAmount(value);
		}
	};
	protected CurrencyAndAmount refund;
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmRefund
	 * SubscriptionExecution13.mmRefund}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmRefund
	 * SubscriptionExecution12.mmRefund}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution
	 * SubscriptionExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Refund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Return of cash that has been overpaid for a subscription."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SubscriptionExecution, CurrencyAndAmount> mmRefund = new MMBusinessAttribute<SubscriptionExecution, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(SubscriptionExecution13.mmRefund, SubscriptionExecution12.mmRefund);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SubscriptionExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Refund";
			definition = "Return of cash that has been overpaid for a subscription.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(SubscriptionExecution obj) {
			return obj.getRefund();
		}

		@Override
		public void setValue(SubscriptionExecution obj, CurrencyAndAmount value) {
			obj.setRefund(value);
		}
	};
	protected CurrencyAndAmount subscriptionInterest;
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmSubscriptionInterest
	 * SubscriptionExecution13.mmSubscriptionInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmSubscriptionInterest
	 * SubscriptionExecution12.mmSubscriptionInterest}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution
	 * SubscriptionExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest received when a subscription amount is paid in advance and then invested by the fund."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SubscriptionExecution, CurrencyAndAmount> mmSubscriptionInterest = new MMBusinessAttribute<SubscriptionExecution, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(SubscriptionExecution13.mmSubscriptionInterest, SubscriptionExecution12.mmSubscriptionInterest);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SubscriptionExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubscriptionInterest";
			definition = "Interest received when a subscription amount is paid in advance and then invested by the fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(SubscriptionExecution obj) {
			return obj.getSubscriptionInterest();
		}

		@Override
		public void setValue(SubscriptionExecution obj, CurrencyAndAmount value) {
			obj.setSubscriptionInterest(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SubscriptionExecution";
				definition = "Execution of a subscription order.";
				derivationElement_lazy = () -> Arrays.asList(ISAYearsOfIssue4.mmCurrentYearSubscriptionDetails, ISAYearsOfIssue5.mmCurrentYearSubscriptionDetails, SubscriptionBulkExecution4.mmIndividualExecutionDetails,
						SubscriptionMultipleExecution5.mmIndividualExecutionDetails);
				subType_lazy = () -> Arrays.asList(SwitchExecutionSubscriptionLeg.mmObject());
				superType_lazy = () -> InvestmentFundOrderExecution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SubscriptionExecution.mmEquityComponent, com.tools20022.repository.entity.SubscriptionExecution.mmCashComponent,
						com.tools20022.repository.entity.SubscriptionExecution.mmInvestedNetAmount, com.tools20022.repository.entity.SubscriptionExecution.mmRefund,
						com.tools20022.repository.entity.SubscriptionExecution.mmSubscriptionInterest);
				derivationComponent_lazy = () -> Arrays.asList(SubscriptionInformation1.mmObject(), SubscriptionBulkExecution4.mmObject(), SubscriptionMultipleExecution5.mmObject(), SubscriptionExecution13.mmObject(),
						SubscriptionExecution12.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SubscriptionExecution.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getEquityComponent() {
		return equityComponent;
	}

	public SubscriptionExecution setEquityComponent(CurrencyAndAmount equityComponent) {
		this.equityComponent = Objects.requireNonNull(equityComponent);
		return this;
	}

	public CurrencyAndAmount getCashComponent() {
		return cashComponent;
	}

	public SubscriptionExecution setCashComponent(CurrencyAndAmount cashComponent) {
		this.cashComponent = Objects.requireNonNull(cashComponent);
		return this;
	}

	public CurrencyAndAmount getInvestedNetAmount() {
		return investedNetAmount;
	}

	public SubscriptionExecution setInvestedNetAmount(CurrencyAndAmount investedNetAmount) {
		this.investedNetAmount = Objects.requireNonNull(investedNetAmount);
		return this;
	}

	public CurrencyAndAmount getRefund() {
		return refund;
	}

	public SubscriptionExecution setRefund(CurrencyAndAmount refund) {
		this.refund = Objects.requireNonNull(refund);
		return this;
	}

	public CurrencyAndAmount getSubscriptionInterest() {
		return subscriptionInterest;
	}

	public SubscriptionExecution setSubscriptionInterest(CurrencyAndAmount subscriptionInterest) {
		this.subscriptionInterest = Objects.requireNonNull(subscriptionInterest);
		return this;
	}
}