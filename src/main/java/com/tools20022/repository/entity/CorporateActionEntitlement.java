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
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Rights entitled to the account owner based on the terms of the corporate
 * action event and the balance of underlying securities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionEntitlement"
 * src="doc-files/CorporateActionEntitlement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmEligibleBalance
 * CorporateActionEntitlement.mmEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmInstructedBalance
 * CorporateActionEntitlement.mmInstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmUninstructedBalance
 * CorporateActionEntitlement.mmUninstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmEligibleBalanceIndicator
 * CorporateActionEntitlement.mmEligibleBalanceIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmRelatedServicing
 * CorporateActionEntitlement.mmRelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmNotEligibleBalance
 * CorporateActionEntitlement.mmNotEligibleBalance}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmEligibleBalanceRelatedEntitlement
 * SecuritiesBalance.mmEligibleBalanceRelatedEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmCorporateActionEntitlement
 * SecuritiesBalance.mmCorporateActionEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmInstructedBalanceRelatedEntitlement
 * SecuritiesBalance.mmInstructedBalanceRelatedEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmUninstructedBalanceRelatedEntitlement
 * SecuritiesBalance.mmUninstructedBalanceRelatedEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmNotEligibleBalanceRelatedEntitlement
 * SecuritiesBalance.mmNotEligibleBalanceRelatedEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmCorporateActionEntitlement
 * CorporateActionServicing.mmCorporateActionEntitlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAdvice1#mmAccountAndDistributionDetails
 * EntitlementAdvice1.mmAccountAndDistributionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement
 * CorporateActionCashEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement
 * CorporateActionSecuritiesEntitlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Entitlement1 Entitlement1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntitlementAdvice1
 * EntitlementAdvice1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32
 * CorporateActionBalanceDetails32}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31
 * CorporateActionBalanceDetails31}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30
 * CorporateActionBalanceDetails30}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29
 * CorporateActionBalanceDetails29}</li>
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
 * "CorporateActionEntitlement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Rights entitled to the account owner based on the terms of the corporate action event and the balance of underlying securities."
 * </li>
 * </ul>
 */
public class CorporateActionEntitlement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.SecuritiesBalance> eligibleBalance;
	/**
	 * Total balance of securities eligible for this corporate action event. The
	 * entitlement calculation is based on this balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmEligibleBalanceRelatedEntitlement
	 * SecuritiesBalance.mmEligibleBalanceRelatedEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption116#mmTotalEligibleBalance
	 * CorporateActionOption116.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails32.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails31.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails30.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails29.mmTotalEligibleBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total balance of securities eligible for this corporate action event. The entitlement calculation is based on this balance."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmEligibleBalance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionOption116.mmTotalEligibleBalance, CorporateActionBalanceDetails32.mmTotalEligibleBalance, CorporateActionBalanceDetails31.mmTotalEligibleBalance,
					CorporateActionBalanceDetails30.mmTotalEligibleBalance, CorporateActionBalanceDetails29.mmTotalEligibleBalance);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EligibleBalance";
			definition = "Total balance of securities eligible for this corporate action event. The entitlement calculation is based on this balance.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmEligibleBalanceRelatedEntitlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesBalance> securitiesBalance;
	/**
	 * Specifies any type of balance related to a corporate action entitlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmCorporateActionEntitlement
	 * SecuritiesBalance.mmCorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#mmBlockedBalance
	 * CorporateActionBalanceDetails32.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#mmBorrowedBalance
	 * CorporateActionBalanceDetails32.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#mmCollateralInBalance
	 * CorporateActionBalanceDetails32.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#mmCollateralOutBalance
	 * CorporateActionBalanceDetails32.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#mmOnLoanBalance
	 * CorporateActionBalanceDetails32.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails32.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails32.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails32.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails32.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#mmStreetPositionBalance
	 * CorporateActionBalanceDetails32.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails32.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails32.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#mmRegisteredBalance
	 * CorporateActionBalanceDetails32.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmConfirmedBalance
	 * CorporateActionBalanceDetails31.mmConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmBlockedBalance
	 * CorporateActionBalanceDetails31.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmBorrowedBalance
	 * CorporateActionBalanceDetails31.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmCollateralInBalance
	 * CorporateActionBalanceDetails31.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmCollateralOutBalance
	 * CorporateActionBalanceDetails31.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmOnLoanBalance
	 * CorporateActionBalanceDetails31.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails31.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails31.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails31.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails31.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmStreetPositionBalance
	 * CorporateActionBalanceDetails31.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails31.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails31.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmRegisteredBalance
	 * CorporateActionBalanceDetails31.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmAffectedBalance
	 * CorporateActionBalanceDetails31.mmAffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmUnaffectedBalance
	 * CorporateActionBalanceDetails31.mmUnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmBlockedBalance
	 * CorporateActionBalanceDetails30.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmBorrowedBalance
	 * CorporateActionBalanceDetails30.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmCollateralInBalance
	 * CorporateActionBalanceDetails30.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmCollateralOutBalance
	 * CorporateActionBalanceDetails30.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmOnLoanBalance
	 * CorporateActionBalanceDetails30.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails30.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails30.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmStreetPositionBalance
	 * CorporateActionBalanceDetails30.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails30.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails30.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmRegisteredBalance
	 * CorporateActionBalanceDetails30.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmObligatedBalance
	 * CorporateActionBalanceDetails30.mmObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails30.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails30.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmBlockedBalance
	 * CorporateActionBalanceDetails29.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmBorrowedBalance
	 * CorporateActionBalanceDetails29.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmCollateralInBalance
	 * CorporateActionBalanceDetails29.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmCollateralOutBalance
	 * CorporateActionBalanceDetails29.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmOnLoanBalance
	 * CorporateActionBalanceDetails29.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails29.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails29.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails29.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails29.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmStreetPositionBalance
	 * CorporateActionBalanceDetails29.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails29.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails29.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmRegisteredBalance
	 * CorporateActionBalanceDetails29.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmObligatedBalance
	 * CorporateActionBalanceDetails29.mmObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmAffectedBalance
	 * CorporateActionBalanceDetails29.mmAffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmUnaffectedBalance
	 * CorporateActionBalanceDetails29.mmUnaffectedBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies any type of balance related to a corporate action entitlement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesBalance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionBalanceDetails32.mmBlockedBalance, CorporateActionBalanceDetails32.mmBorrowedBalance, CorporateActionBalanceDetails32.mmCollateralInBalance,
					CorporateActionBalanceDetails32.mmCollateralOutBalance, CorporateActionBalanceDetails32.mmOnLoanBalance, CorporateActionBalanceDetails32.mmPendingDeliveryBalance, CorporateActionBalanceDetails32.mmPendingReceiptBalance,
					CorporateActionBalanceDetails32.mmOutForRegistrationBalance, CorporateActionBalanceDetails32.mmSettlementPositionBalance, CorporateActionBalanceDetails32.mmStreetPositionBalance,
					CorporateActionBalanceDetails32.mmTradeDatePositionBalance, CorporateActionBalanceDetails32.mmInTransshipmentBalance, CorporateActionBalanceDetails32.mmRegisteredBalance,
					CorporateActionBalanceDetails31.mmConfirmedBalance, CorporateActionBalanceDetails31.mmBlockedBalance, CorporateActionBalanceDetails31.mmBorrowedBalance, CorporateActionBalanceDetails31.mmCollateralInBalance,
					CorporateActionBalanceDetails31.mmCollateralOutBalance, CorporateActionBalanceDetails31.mmOnLoanBalance, CorporateActionBalanceDetails31.mmPendingDeliveryBalance, CorporateActionBalanceDetails31.mmPendingReceiptBalance,
					CorporateActionBalanceDetails31.mmOutForRegistrationBalance, CorporateActionBalanceDetails31.mmSettlementPositionBalance, CorporateActionBalanceDetails31.mmStreetPositionBalance,
					CorporateActionBalanceDetails31.mmTradeDatePositionBalance, CorporateActionBalanceDetails31.mmInTransshipmentBalance, CorporateActionBalanceDetails31.mmRegisteredBalance,
					CorporateActionBalanceDetails31.mmAffectedBalance, CorporateActionBalanceDetails31.mmUnaffectedBalance, CorporateActionBalanceDetails30.mmBlockedBalance, CorporateActionBalanceDetails30.mmBorrowedBalance,
					CorporateActionBalanceDetails30.mmCollateralInBalance, CorporateActionBalanceDetails30.mmCollateralOutBalance, CorporateActionBalanceDetails30.mmOnLoanBalance,
					CorporateActionBalanceDetails30.mmOutForRegistrationBalance, CorporateActionBalanceDetails30.mmSettlementPositionBalance, CorporateActionBalanceDetails30.mmStreetPositionBalance,
					CorporateActionBalanceDetails30.mmTradeDatePositionBalance, CorporateActionBalanceDetails30.mmInTransshipmentBalance, CorporateActionBalanceDetails30.mmRegisteredBalance,
					CorporateActionBalanceDetails30.mmObligatedBalance, CorporateActionBalanceDetails30.mmPendingDeliveryBalance, CorporateActionBalanceDetails30.mmPendingReceiptBalance, CorporateActionBalanceDetails29.mmBlockedBalance,
					CorporateActionBalanceDetails29.mmBorrowedBalance, CorporateActionBalanceDetails29.mmCollateralInBalance, CorporateActionBalanceDetails29.mmCollateralOutBalance, CorporateActionBalanceDetails29.mmOnLoanBalance,
					CorporateActionBalanceDetails29.mmPendingDeliveryBalance, CorporateActionBalanceDetails29.mmPendingReceiptBalance, CorporateActionBalanceDetails29.mmOutForRegistrationBalance,
					CorporateActionBalanceDetails29.mmSettlementPositionBalance, CorporateActionBalanceDetails29.mmStreetPositionBalance, CorporateActionBalanceDetails29.mmTradeDatePositionBalance,
					CorporateActionBalanceDetails29.mmInTransshipmentBalance, CorporateActionBalanceDetails29.mmRegisteredBalance, CorporateActionBalanceDetails29.mmObligatedBalance, CorporateActionBalanceDetails29.mmAffectedBalance,
					CorporateActionBalanceDetails29.mmUnaffectedBalance);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBalance";
			definition = "Specifies any type of balance related to a corporate action entitlement.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmCorporateActionEntitlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesBalance> instructedBalance;
	/**
	 * Balance of instructed position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmInstructedBalanceRelatedEntitlement
	 * SecuritiesBalance.mmInstructedBalanceRelatedEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption116#mmInstructedBalance
	 * CorporateActionOption116.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes68#mmInstructedBalance
	 * FinancialInstrumentAttributes68.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption120#mmInstructedQuantity
	 * CorporateActionOption120.mmInstructedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption6#mmInstructedBalance
	 * InstructedCorporateActionOption6.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmTotalInstructedBalanceDetails
	 * CorporateActionBalanceDetails30.mmTotalInstructedBalanceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmInstructedBalance
	 * CorporateActionBalanceDetails29.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails5#mmTotalInstructedBalance
	 * InstructedBalanceDetails5.mmTotalInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption54#mmInstructedQuantity
	 * SecuritiesOption54.mmInstructedQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of  instructed position."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInstructedBalance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionOption116.mmInstructedBalance, FinancialInstrumentAttributes68.mmInstructedBalance, CorporateActionOption120.mmInstructedQuantity,
					InstructedCorporateActionOption6.mmInstructedBalance, CorporateActionBalanceDetails30.mmTotalInstructedBalanceDetails, CorporateActionBalanceDetails29.mmInstructedBalance,
					InstructedBalanceDetails5.mmTotalInstructedBalance, SecuritiesOption54.mmInstructedQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructedBalance";
			definition = "Balance of  instructed position.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmInstructedBalanceRelatedEntitlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesBalance> uninstructedBalance;
	/**
	 * Balance of uninstructed position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmUninstructedBalanceRelatedEntitlement
	 * SecuritiesBalance.mmUninstructedBalanceRelatedEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption116#mmUninstructedBalance
	 * CorporateActionOption116.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes68#mmUninstructedBalance
	 * FinancialInstrumentAttributes68.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmUninstructedBalance
	 * CorporateActionBalanceDetails30.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmUninstructedBalance
	 * CorporateActionBalanceDetails29.mmUninstructedBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UninstructedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of uninstructed position."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmUninstructedBalance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionOption116.mmUninstructedBalance, FinancialInstrumentAttributes68.mmUninstructedBalance, CorporateActionBalanceDetails30.mmUninstructedBalance,
					CorporateActionBalanceDetails29.mmUninstructedBalance);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UninstructedBalance";
			definition = "Balance of uninstructed position.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmUninstructedBalanceRelatedEntitlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};
	protected YesNoIndicator eligibleBalanceIndicator;
	/**
	 * Indicates whether the eligible balance is final except for a voluntary
	 * corporate action event where it can represent the current eligible
	 * balance when communicated before expiration date of that event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification5#mmEligibleBalanceIndicator
	 * CorporateActionNotification5.mmEligibleBalanceIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleBalanceIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the eligible balance is final except for a voluntary corporate action event where it can represent the current eligible balance when communicated before expiration date of that event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEligibleBalanceIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionNotification5.mmEligibleBalanceIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EligibleBalanceIndicator";
			definition = "Indicates whether the eligible balance is final except for a voluntary corporate action event where it can represent the current eligible balance when communicated before expiration date of that event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionEntitlement.class.getMethod("getEligibleBalanceIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionServicing relatedServicing;
	/**
	 * Process which groups the activities related to corporate action
	 * servicing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmCorporateActionEntitlement
	 * CorporateActionServicing.mmCorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
	 * CorporateActionServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedServicing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which groups the activities related to corporate action servicing."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedServicing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedServicing";
			definition = "Process which groups the activities related to corporate action servicing.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmCorporateActionEntitlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesBalance> notEligibleBalance;
	/**
	 * Total balance of securities which are not eligible for this corporate
	 * action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmNotEligibleBalanceRelatedEntitlement
	 * SecuritiesBalance.mmNotEligibleBalanceRelatedEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEligibleBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total balance of securities which are not eligible for this corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNotEligibleBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotEligibleBalance";
			definition = "Total balance of securities which are not eligible for this corporate action event.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmNotEligibleBalanceRelatedEntitlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEntitlement";
				definition = "Rights entitled to the account owner based on the terms of the corporate action event and the balance of underlying securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesBalance.mmEligibleBalanceRelatedEntitlement, com.tools20022.repository.entity.SecuritiesBalance.mmCorporateActionEntitlement,
						com.tools20022.repository.entity.SecuritiesBalance.mmInstructedBalanceRelatedEntitlement, com.tools20022.repository.entity.SecuritiesBalance.mmUninstructedBalanceRelatedEntitlement,
						com.tools20022.repository.entity.SecuritiesBalance.mmNotEligibleBalanceRelatedEntitlement, com.tools20022.repository.entity.CorporateActionServicing.mmCorporateActionEntitlement);
				derivationElement_lazy = () -> Arrays.asList(EntitlementAdvice1.mmAccountAndDistributionDetails);
				subType_lazy = () -> Arrays.asList(CorporateActionCashEntitlement.mmObject(), CorporateActionSecuritiesEntitlement.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionEntitlement.mmEligibleBalance, com.tools20022.repository.entity.CorporateActionEntitlement.mmSecuritiesBalance,
						com.tools20022.repository.entity.CorporateActionEntitlement.mmInstructedBalance, com.tools20022.repository.entity.CorporateActionEntitlement.mmUninstructedBalance,
						com.tools20022.repository.entity.CorporateActionEntitlement.mmEligibleBalanceIndicator, com.tools20022.repository.entity.CorporateActionEntitlement.mmRelatedServicing,
						com.tools20022.repository.entity.CorporateActionEntitlement.mmNotEligibleBalance);
				derivationComponent_lazy = () -> Arrays.asList(Entitlement1.mmObject(), EntitlementAdvice1.mmObject(), CorporateActionBalanceDetails32.mmObject(), CorporateActionBalanceDetails31.mmObject(),
						CorporateActionBalanceDetails30.mmObject(), CorporateActionBalanceDetails29.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionEntitlement.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecuritiesBalance> getEligibleBalance() {
		return eligibleBalance;
	}

	public void setEligibleBalance(List<com.tools20022.repository.entity.SecuritiesBalance> eligibleBalance) {
		this.eligibleBalance = eligibleBalance;
	}

	public List<SecuritiesBalance> getSecuritiesBalance() {
		return securitiesBalance;
	}

	public void setSecuritiesBalance(List<com.tools20022.repository.entity.SecuritiesBalance> securitiesBalance) {
		this.securitiesBalance = securitiesBalance;
	}

	public List<SecuritiesBalance> getInstructedBalance() {
		return instructedBalance;
	}

	public void setInstructedBalance(List<com.tools20022.repository.entity.SecuritiesBalance> instructedBalance) {
		this.instructedBalance = instructedBalance;
	}

	public List<SecuritiesBalance> getUninstructedBalance() {
		return uninstructedBalance;
	}

	public void setUninstructedBalance(List<com.tools20022.repository.entity.SecuritiesBalance> uninstructedBalance) {
		this.uninstructedBalance = uninstructedBalance;
	}

	public YesNoIndicator getEligibleBalanceIndicator() {
		return eligibleBalanceIndicator;
	}

	public void setEligibleBalanceIndicator(YesNoIndicator eligibleBalanceIndicator) {
		this.eligibleBalanceIndicator = eligibleBalanceIndicator;
	}

	public CorporateActionServicing getRelatedServicing() {
		return relatedServicing;
	}

	public void setRelatedServicing(com.tools20022.repository.entity.CorporateActionServicing relatedServicing) {
		this.relatedServicing = relatedServicing;
	}

	public List<SecuritiesBalance> getNotEligibleBalance() {
		return notEligibleBalance;
	}

	public void setNotEligibleBalance(List<com.tools20022.repository.entity.SecuritiesBalance> notEligibleBalance) {
		this.notEligibleBalance = notEligibleBalance;
	}
}