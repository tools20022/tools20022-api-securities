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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Order placed by an investor to buy or sell an asset at a price specified or
 * not.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Order" src="doc-files/Order.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Order#mmTrade Order.mmTrade}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Order#mmMasterIdentification
 * Order.mmMasterIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmOrder Trade.mmOrder}
 * </li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder
 * SecuritiesOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PurchaseOrder PurchaseOrder}
 * </li>
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
 * "Order"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Order placed by an investor to buy or sell an asset at a price specified or not."
 * </li>
 * </ul>
 */
public class Order {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Trade trade;
	/**
	 * Agreement between two parties to buy and sell assets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Trade#mmOrder
	 * Trade.mmOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Order
	 * Order}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agreement between two parties to buy and sell assets."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Order.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Agreement between two parties to buy and sell assets.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.mmOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
		}
	};
	protected Max35Text masterIdentification;
	/**
	 * Unique and unambiguous identifier for a group of individual orders, as
	 * assigned by the instructing party. This identifier links the individual
	 * orders together.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder4#mmMasterReference
	 * InvestmentFundOrder4.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference7#mmMasterReference
	 * TransferReference7.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmMasterReference
	 * InvestmentFundTransaction4.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#mmMasterIdentification
	 * Identification15.mmMasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason3#mmMasterReference
	 * CancellationStatusAndReason3.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference8#mmMasterReference
	 * MessageAndBusinessReference8.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason4#mmMasterReference
	 * TransferStatusAndReason4.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut17#mmMasterReference
	 * TransferOut17.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference9#mmMasterReference
	 * TransferReference9.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn14#mmMasterReference
	 * TransferIn14.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference10#mmMasterReference
	 * TransferReference10.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn15#mmMasterReference
	 * TransferIn15.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut16#mmMasterReference
	 * TransferOut16.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#mmMasterReference
	 * IndividualOrderConfirmationStatusAndReason2.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmMasterReference
	 * SwitchExecution7.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#mmMasterReference
	 * SubscriptionBulkOrder5.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#mmMasterReference
	 * RedemptionBulkExecution5.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmMasterReference
	 * RedemptionMultipleExecution5.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#mmMasterReference
	 * RedemptionMultipleOrder6.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#mmMasterReference
	 * SubscriptionMultipleOrder6.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4#mmMasterReference
	 * SubscriptionBulkExecution4.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmMasterReference
	 * SwitchOrder7.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#mmMasterReference
	 * RedemptionBulkOrder6.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5#mmMasterReference
	 * SubscriptionMultipleExecution5.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#mmMasterReference
	 * IndividualOrderStatusAndReason7.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmMasterReference
	 * SwitchOrderStatusAndReason2.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason10#mmMasterReference
	 * OrderStatusAndReason10.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason9#mmMasterReference
	 * OrderStatusAndReason9.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason8#mmMasterReference
	 * IndividualOrderStatusAndReason8.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder8#mmMasterReference
	 * InvestmentFundOrder8.mmMasterReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Order
	 * Order}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a group of individual orders, as assigned by the instructing party. This identifier links the individual orders together."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMasterIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentFundOrder4.mmMasterReference, TransferReference7.mmMasterReference, InvestmentFundTransaction4.mmMasterReference, Identification15.mmMasterIdentification,
					CancellationStatusAndReason3.mmMasterReference, MessageAndBusinessReference8.mmMasterReference, TransferStatusAndReason4.mmMasterReference, TransferOut17.mmMasterReference, TransferReference9.mmMasterReference,
					TransferIn14.mmMasterReference, TransferReference10.mmMasterReference, TransferIn15.mmMasterReference, TransferOut16.mmMasterReference, IndividualOrderConfirmationStatusAndReason2.mmMasterReference,
					SwitchExecution7.mmMasterReference, SubscriptionBulkOrder5.mmMasterReference, RedemptionBulkExecution5.mmMasterReference, RedemptionMultipleExecution5.mmMasterReference, RedemptionMultipleOrder6.mmMasterReference,
					SubscriptionMultipleOrder6.mmMasterReference, SubscriptionBulkExecution4.mmMasterReference, SwitchOrder7.mmMasterReference, RedemptionBulkOrder6.mmMasterReference, SubscriptionMultipleExecution5.mmMasterReference,
					IndividualOrderStatusAndReason7.mmMasterReference, SwitchOrderStatusAndReason2.mmMasterReference, OrderStatusAndReason10.mmMasterReference, OrderStatusAndReason9.mmMasterReference,
					IndividualOrderStatusAndReason8.mmMasterReference, InvestmentFundOrder8.mmMasterReference);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Order.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MasterIdentification";
			definition = "Unique and unambiguous identifier for a group of individual orders, as assigned by the instructing party. This identifier links the individual orders together.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Order.class.getMethod("getMasterIdentification", new Class[]{});
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
				name = "Order";
				definition = "Order placed by an investor to buy or sell an asset at a price specified or not.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.mmOrder);
				subType_lazy = () -> Arrays.asList(SecuritiesOrder.mmObject(), PurchaseOrder.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Order.mmTrade, com.tools20022.repository.entity.Order.mmMasterIdentification);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Order.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Trade getTrade() {
		return trade;
	}

	public void setTrade(com.tools20022.repository.entity.Trade trade) {
		this.trade = trade;
	}

	public Max35Text getMasterIdentification() {
		return masterIdentification;
	}

	public void setMasterIdentification(Max35Text masterIdentification) {
		this.masterIdentification = masterIdentification;
	}
}