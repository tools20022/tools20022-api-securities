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
import com.tools20022.repository.choice.AdditionalAmount1Choice;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.InvestmentFundOrder;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FundOrderData6;
import com.tools20022.repository.msg.SwitchExecution7;
import com.tools20022.repository.msg.SwitchOrder7;
import com.tools20022.repository.msg.SwitchOrderStatusAndReason2;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Transfer from one investment fund/fund class to another investment fund or
 * investment fund class by the investor. A switch is composed of one or several
 * subscription legs, and one or several redemption legs.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SwitchOrder" src="doc-files/SwitchOrder.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
 * InvestmentFundOrder}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchOrder#mmAdditionalCashIn
 * SwitchOrder.mmAdditionalCashIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchOrder#mmResultingCashOut
 * SwitchOrder.mmResultingCashOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchOrder#mmTotalRedemptionAmount
 * SwitchOrder.mmTotalRedemptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchOrder#mmTotalSubscriptionAmount
 * SwitchOrder.mmTotalSubscriptionAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SwitchOrder#mmRedemptionLeg
 * SwitchOrder.mmRedemptionLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchOrder#mmSubscriptionLeg
 * SwitchOrder.mmSubscriptionLeg}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchRedemptionLeg#mmRedemptionRelatedSwitchOrder
 * SwitchRedemptionLeg.mmRedemptionRelatedSwitchOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchSubscriptionLeg#mmSubscriptionRelatedSwitchOrder
 * SwitchSubscriptionLeg.mmSubscriptionRelatedSwitchOrder}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmOrderData
 * SwitchOrderStatusAndReason2.mmOrderData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchOrder7 SwitchOrder7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2
 * SwitchOrderStatusAndReason2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundOrderData6 FundOrderData6}</li>
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
 * "SwitchOrder"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Transfer from one investment fund/fund class to another investment fund or investment fund class by the investor. A switch is composed of one or several subscription legs, and one or several redemption legs."
 * </li>
 * </ul>
 */
public class SwitchOrder extends InvestmentFundOrder {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount additionalCashIn;
	/**
	 * Additional amount of money paid by the investor in addition to the switch
	 * redemption amount.
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
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmAdditionalAmount
	 * SwitchExecution7.mmAdditionalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmAdditionalAmount
	 * SwitchOrder7.mmAdditionalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalAmount1Choice#mmAdditionalCashIn
	 * AdditionalAmount1Choice.mmAdditionalCashIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData6#mmAdditionalAmount
	 * FundOrderData6.mmAdditionalAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SwitchOrder SwitchOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalCashIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional amount of money paid by the investor in addition to the switch redemption amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAdditionalCashIn = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SwitchExecution7.mmAdditionalAmount, SwitchOrder7.mmAdditionalAmount, AdditionalAmount1Choice.mmAdditionalCashIn, FundOrderData6.mmAdditionalAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SwitchOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdditionalCashIn";
			definition = "Additional amount of money paid by the investor in addition to the switch redemption amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SwitchOrder.class.getMethod("getAdditionalCashIn", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount resultingCashOut;
	/**
	 * Amount of money that results from a switch-out, that is not reinvested in
	 * another investment fund, and is repaid to the investor.
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
	 * {@linkplain com.tools20022.repository.choice.AdditionalAmount1Choice#mmResultingCashOut
	 * AdditionalAmount1Choice.mmResultingCashOut}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SwitchOrder SwitchOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultingCashOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money that results from a switch-out, that is not reinvested in another investment fund, and is repaid to the investor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmResultingCashOut = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AdditionalAmount1Choice.mmResultingCashOut);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SwitchOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResultingCashOut";
			definition = "Amount of money that results from a switch-out, that is not reinvested in another investment fund, and is repaid to the investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SwitchOrder.class.getMethod("getResultingCashOut", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount totalRedemptionAmount;
	/**
	 * Amount of money used to derive the quantity of investment fund units to
	 * be redeemed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SwitchOrder SwitchOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalRedemptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money used to derive the quantity of investment fund units to be redeemed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTotalRedemptionAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SwitchOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalRedemptionAmount";
			definition = "Amount of money used to derive the quantity of investment fund units to be redeemed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SwitchOrder.class.getMethod("getTotalRedemptionAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount totalSubscriptionAmount;
	/**
	 * Amount of money used to derive the quantity of investment fund units to
	 * be subscribed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SwitchOrder SwitchOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalSubscriptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money used to derive the quantity of investment fund units to be subscribed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTotalSubscriptionAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SwitchOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalSubscriptionAmount";
			definition = "Amount of money used to derive the quantity of investment fund units to be subscribed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SwitchOrder.class.getMethod("getTotalSubscriptionAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SwitchRedemptionLeg> redemptionLeg;
	/**
	 * Part of an investment fund switch order that is a redemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SwitchRedemptionLeg#mmRedemptionRelatedSwitchOrder
	 * SwitchRedemptionLeg.mmRedemptionRelatedSwitchOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SwitchRedemptionLeg
	 * SwitchRedemptionLeg}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmRedemptionLegDetails
	 * SwitchOrder7.mmRedemptionLegDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SwitchOrder SwitchOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Part of an investment fund switch order that is a redemption."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRedemptionLeg = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SwitchOrder7.mmRedemptionLegDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SwitchOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RedemptionLeg";
			definition = "Part of an investment fund switch order that is a redemption.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SwitchRedemptionLeg.mmRedemptionRelatedSwitchOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SwitchRedemptionLeg.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SwitchSubscriptionLeg> subscriptionLeg;
	/**
	 * Part of an investment fund switch order that is a subscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SwitchSubscriptionLeg#mmSubscriptionRelatedSwitchOrder
	 * SwitchSubscriptionLeg.mmSubscriptionRelatedSwitchOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SwitchSubscriptionLeg
	 * SwitchSubscriptionLeg}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmSubscriptionLegDetails
	 * SwitchOrder7.mmSubscriptionLegDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SwitchOrder SwitchOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Part of an investment fund switch order that is a subscription."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSubscriptionLeg = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SwitchOrder7.mmSubscriptionLegDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SwitchOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubscriptionLeg";
			definition = "Part of an investment fund switch order that is a subscription.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SwitchSubscriptionLeg.mmSubscriptionRelatedSwitchOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SwitchSubscriptionLeg.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SwitchOrder";
				definition = "Transfer from one investment fund/fund class to another investment fund or investment fund class by the investor. A switch is composed of one or several subscription legs, and one or several redemption legs.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SwitchRedemptionLeg.mmRedemptionRelatedSwitchOrder, com.tools20022.repository.entity.SwitchSubscriptionLeg.mmSubscriptionRelatedSwitchOrder);
				derivationElement_lazy = () -> Arrays.asList(SwitchOrderStatusAndReason2.mmOrderData);
				superType_lazy = () -> InvestmentFundOrder.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SwitchOrder.mmAdditionalCashIn, com.tools20022.repository.entity.SwitchOrder.mmResultingCashOut,
						com.tools20022.repository.entity.SwitchOrder.mmTotalRedemptionAmount, com.tools20022.repository.entity.SwitchOrder.mmTotalSubscriptionAmount, com.tools20022.repository.entity.SwitchOrder.mmRedemptionLeg,
						com.tools20022.repository.entity.SwitchOrder.mmSubscriptionLeg);
				derivationComponent_lazy = () -> Arrays.asList(SwitchOrder7.mmObject(), SwitchOrderStatusAndReason2.mmObject(), FundOrderData6.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SwitchOrder.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getAdditionalCashIn() {
		return additionalCashIn;
	}

	public void setAdditionalCashIn(CurrencyAndAmount additionalCashIn) {
		this.additionalCashIn = additionalCashIn;
	}

	public CurrencyAndAmount getResultingCashOut() {
		return resultingCashOut;
	}

	public void setResultingCashOut(CurrencyAndAmount resultingCashOut) {
		this.resultingCashOut = resultingCashOut;
	}

	public CurrencyAndAmount getTotalRedemptionAmount() {
		return totalRedemptionAmount;
	}

	public void setTotalRedemptionAmount(CurrencyAndAmount totalRedemptionAmount) {
		this.totalRedemptionAmount = totalRedemptionAmount;
	}

	public CurrencyAndAmount getTotalSubscriptionAmount() {
		return totalSubscriptionAmount;
	}

	public void setTotalSubscriptionAmount(CurrencyAndAmount totalSubscriptionAmount) {
		this.totalSubscriptionAmount = totalSubscriptionAmount;
	}

	public List<SwitchRedemptionLeg> getRedemptionLeg() {
		return redemptionLeg;
	}

	public void setRedemptionLeg(List<com.tools20022.repository.entity.SwitchRedemptionLeg> redemptionLeg) {
		this.redemptionLeg = redemptionLeg;
	}

	public List<SwitchSubscriptionLeg> getSubscriptionLeg() {
		return subscriptionLeg;
	}

	public void setSubscriptionLeg(List<com.tools20022.repository.entity.SwitchSubscriptionLeg> subscriptionLeg) {
		this.subscriptionLeg = subscriptionLeg;
	}
}