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
import com.tools20022.repository.choice.FinancialInstrumentQuantity28Choice;
import com.tools20022.repository.choice.FinancialInstrumentQuantity29Choice;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.InvestmentFundOrder;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Instruction from an investor to sell investment fund units back to the fund.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="RedemptionOrder" src="doc-files/RedemptionOrder.svg">
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
 * {@linkplain com.tools20022.repository.entity.RedemptionOrder#mmHoldingsRedemptionRate
 * RedemptionOrder.mmHoldingsRedemptionRate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#mmIndividualOrderDetails
 * RedemptionMultipleOrder6.mmIndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#mmIndividualOrderDetails
 * RedemptionBulkOrder6.mmIndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmStaffClientBreakdown
 * RedemptionOrder14.mmStaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmStaffClientBreakdown
 * RedemptionOrder15.mmStaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmStaffClientBreakdown
 * RedemptionExecution16.mmStaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmStaffClientBreakdown
 * RedemptionExecution15.mmStaffClientBreakdown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SwitchRedemptionLeg
 * SwitchRedemptionLeg}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6
 * RedemptionMultipleOrder6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6
 * RedemptionBulkOrder6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder14
 * RedemptionOrder14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder15
 * RedemptionOrder15}</li>
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
 * "RedemptionOrder"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Instruction from an investor to sell investment fund units back to the fund."
 * </li>
 * </ul>
 */
public class RedemptionOrder extends InvestmentFundOrder {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PercentageRate holdingsRedemptionRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5#mmHoldingsRedemptionRate
	 * FundOrderData5.mmHoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity29Choice#mmHoldingsRedemptionRate
	 * FinancialInstrumentQuantity29Choice.mmHoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity28Choice#mmHoldingsRedemptionRate
	 * FinancialInstrumentQuantity28Choice.mmHoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmHoldingsRedemptionRate
	 * RedemptionExecution16.mmHoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmHoldingsRedemptionRate
	 * RedemptionExecution15.mmHoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmHoldingsRedemptionRate
	 * SwitchRedemptionLegExecution4.mmHoldingsRedemptionRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionOrder
	 * RedemptionOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingsRedemptionRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portion of the investor's holdings, in a specific investment fund/ fund class, that is redeemed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<RedemptionOrder, PercentageRate> mmHoldingsRedemptionRate = new MMBusinessAttribute<RedemptionOrder, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(FundOrderData5.mmHoldingsRedemptionRate, FinancialInstrumentQuantity29Choice.mmHoldingsRedemptionRate, FinancialInstrumentQuantity28Choice.mmHoldingsRedemptionRate,
					RedemptionExecution16.mmHoldingsRedemptionRate, RedemptionExecution15.mmHoldingsRedemptionRate, SwitchRedemptionLegExecution4.mmHoldingsRedemptionRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RedemptionOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HoldingsRedemptionRate";
			definition = "Portion of the investor's holdings, in a specific investment fund/ fund class, that is redeemed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(RedemptionOrder obj) {
			return obj.getHoldingsRedemptionRate();
		}

		@Override
		public void setValue(RedemptionOrder obj, PercentageRate value) {
			obj.setHoldingsRedemptionRate(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RedemptionOrder";
				definition = "Instruction from an investor to sell investment fund units back to the fund.";
				derivationElement_lazy = () -> Arrays.asList(RedemptionMultipleOrder6.mmIndividualOrderDetails, RedemptionBulkOrder6.mmIndividualOrderDetails, RedemptionOrder14.mmStaffClientBreakdown,
						RedemptionOrder15.mmStaffClientBreakdown, RedemptionExecution16.mmStaffClientBreakdown, RedemptionExecution15.mmStaffClientBreakdown);
				subType_lazy = () -> Arrays.asList(SwitchRedemptionLeg.mmObject());
				superType_lazy = () -> InvestmentFundOrder.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RedemptionOrder.mmHoldingsRedemptionRate);
				derivationComponent_lazy = () -> Arrays.asList(RedemptionMultipleOrder6.mmObject(), RedemptionBulkOrder6.mmObject(), RedemptionOrder14.mmObject(), RedemptionOrder15.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return RedemptionOrder.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PercentageRate getHoldingsRedemptionRate() {
		return holdingsRedemptionRate;
	}

	public RedemptionOrder setHoldingsRedemptionRate(PercentageRate holdingsRedemptionRate) {
		this.holdingsRedemptionRate = Objects.requireNonNull(holdingsRedemptionRate);
		return this;
	}
}