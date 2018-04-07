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
import com.tools20022.repository.entity.CorporateActionServicing;
import com.tools20022.repository.entity.SecuritiesBalance;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29
 * CorporateActionBalanceDetails29}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37
 * CorporateActionBalanceDetails37}</li>
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
 * "CorporateActionEntitlement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Rights entitled to the account owner based on the terms of the corporate action event and the balance of underlying securities."
 * </li>
 * </ul>
 */
public class CorporateActionEntitlement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<SecuritiesBalance> eligibleBalance;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails32.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails31.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails29.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption141#mmTotalEligibleBalance
	 * CorporateActionOption141.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails37.mmTotalEligibleBalance}</li>
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
	public static final MMBusinessAssociationEnd<CorporateActionEntitlement, List<SecuritiesBalance>> mmEligibleBalance = new MMBusinessAssociationEnd<CorporateActionEntitlement, List<SecuritiesBalance>>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionBalanceDetails32.mmTotalEligibleBalance, CorporateActionBalanceDetails31.mmTotalEligibleBalance, CorporateActionBalanceDetails29.mmTotalEligibleBalance,
					CorporateActionOption141.mmTotalEligibleBalance, CorporateActionBalanceDetails37.mmTotalEligibleBalance);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EligibleBalance";
			definition = "Total balance of securities eligible for this corporate action event. The entitlement calculation is based on this balance.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesBalance.mmEligibleBalanceRelatedEntitlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesBalance.mmObject();
		}

		@Override
		public List<SecuritiesBalance> getValue(CorporateActionEntitlement obj) {
			return obj.getEligibleBalance();
		}

		@Override
		public void setValue(CorporateActionEntitlement obj, List<SecuritiesBalance> value) {
			obj.setEligibleBalance(value);
		}
	};
	protected List<SecuritiesBalance> securitiesBalance;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmBlockedBalance
	 * CorporateActionBalanceDetails37.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmBorrowedBalance
	 * CorporateActionBalanceDetails37.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmCollateralInBalance
	 * CorporateActionBalanceDetails37.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmCollateralOutBalance
	 * CorporateActionBalanceDetails37.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmOnLoanBalance
	 * CorporateActionBalanceDetails37.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails37.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails37.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmStreetPositionBalance
	 * CorporateActionBalanceDetails37.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails37.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails37.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmRegisteredBalance
	 * CorporateActionBalanceDetails37.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmObligatedBalance
	 * CorporateActionBalanceDetails37.mmObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails37.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails37.mmPendingReceiptBalance}</li>
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
	public static final MMBusinessAssociationEnd<CorporateActionEntitlement, List<SecuritiesBalance>> mmSecuritiesBalance = new MMBusinessAssociationEnd<CorporateActionEntitlement, List<SecuritiesBalance>>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionBalanceDetails32.mmBlockedBalance, CorporateActionBalanceDetails32.mmBorrowedBalance, CorporateActionBalanceDetails32.mmCollateralInBalance,
					CorporateActionBalanceDetails32.mmCollateralOutBalance, CorporateActionBalanceDetails32.mmOnLoanBalance, CorporateActionBalanceDetails32.mmPendingDeliveryBalance, CorporateActionBalanceDetails32.mmPendingReceiptBalance,
					CorporateActionBalanceDetails32.mmOutForRegistrationBalance, CorporateActionBalanceDetails32.mmSettlementPositionBalance, CorporateActionBalanceDetails32.mmStreetPositionBalance,
					CorporateActionBalanceDetails32.mmTradeDatePositionBalance, CorporateActionBalanceDetails32.mmInTransshipmentBalance, CorporateActionBalanceDetails32.mmRegisteredBalance,
					CorporateActionBalanceDetails31.mmConfirmedBalance, CorporateActionBalanceDetails31.mmBlockedBalance, CorporateActionBalanceDetails31.mmBorrowedBalance, CorporateActionBalanceDetails31.mmCollateralInBalance,
					CorporateActionBalanceDetails31.mmCollateralOutBalance, CorporateActionBalanceDetails31.mmOnLoanBalance, CorporateActionBalanceDetails31.mmPendingDeliveryBalance, CorporateActionBalanceDetails31.mmPendingReceiptBalance,
					CorporateActionBalanceDetails31.mmOutForRegistrationBalance, CorporateActionBalanceDetails31.mmSettlementPositionBalance, CorporateActionBalanceDetails31.mmStreetPositionBalance,
					CorporateActionBalanceDetails31.mmTradeDatePositionBalance, CorporateActionBalanceDetails31.mmInTransshipmentBalance, CorporateActionBalanceDetails31.mmRegisteredBalance,
					CorporateActionBalanceDetails31.mmAffectedBalance, CorporateActionBalanceDetails31.mmUnaffectedBalance, CorporateActionBalanceDetails29.mmBlockedBalance, CorporateActionBalanceDetails29.mmBorrowedBalance,
					CorporateActionBalanceDetails29.mmCollateralInBalance, CorporateActionBalanceDetails29.mmCollateralOutBalance, CorporateActionBalanceDetails29.mmOnLoanBalance, CorporateActionBalanceDetails29.mmPendingDeliveryBalance,
					CorporateActionBalanceDetails29.mmPendingReceiptBalance, CorporateActionBalanceDetails29.mmOutForRegistrationBalance, CorporateActionBalanceDetails29.mmSettlementPositionBalance,
					CorporateActionBalanceDetails29.mmStreetPositionBalance, CorporateActionBalanceDetails29.mmTradeDatePositionBalance, CorporateActionBalanceDetails29.mmInTransshipmentBalance,
					CorporateActionBalanceDetails29.mmRegisteredBalance, CorporateActionBalanceDetails29.mmObligatedBalance, CorporateActionBalanceDetails29.mmAffectedBalance, CorporateActionBalanceDetails29.mmUnaffectedBalance,
					CorporateActionBalanceDetails37.mmBlockedBalance, CorporateActionBalanceDetails37.mmBorrowedBalance, CorporateActionBalanceDetails37.mmCollateralInBalance, CorporateActionBalanceDetails37.mmCollateralOutBalance,
					CorporateActionBalanceDetails37.mmOnLoanBalance, CorporateActionBalanceDetails37.mmOutForRegistrationBalance, CorporateActionBalanceDetails37.mmSettlementPositionBalance,
					CorporateActionBalanceDetails37.mmStreetPositionBalance, CorporateActionBalanceDetails37.mmTradeDatePositionBalance, CorporateActionBalanceDetails37.mmInTransshipmentBalance,
					CorporateActionBalanceDetails37.mmRegisteredBalance, CorporateActionBalanceDetails37.mmObligatedBalance, CorporateActionBalanceDetails37.mmPendingDeliveryBalance, CorporateActionBalanceDetails37.mmPendingReceiptBalance);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBalance";
			definition = "Specifies any type of balance related to a corporate action entitlement.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesBalance.mmCorporateActionEntitlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesBalance.mmObject();
		}

		@Override
		public List<SecuritiesBalance> getValue(CorporateActionEntitlement obj) {
			return obj.getSecuritiesBalance();
		}

		@Override
		public void setValue(CorporateActionEntitlement obj, List<SecuritiesBalance> value) {
			obj.setSecuritiesBalance(value);
		}
	};
	protected List<SecuritiesBalance> instructedBalance;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption120#mmInstructedQuantity
	 * CorporateActionOption120.mmInstructedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption52#mmInstructedQuantity
	 * SecuritiesOption52.mmInstructedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmInstructedBalance
	 * CorporateActionBalanceDetails29.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption141#mmInstructedBalance
	 * CorporateActionOption141.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmTotalInstructedBalanceDetails
	 * CorporateActionBalanceDetails37.mmTotalInstructedBalanceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption8#mmInstructedBalance
	 * InstructedCorporateActionOption8.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails7#mmTotalInstructedBalance
	 * InstructedBalanceDetails7.mmTotalInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93#mmInstructedBalance
	 * FinancialInstrumentAttributes93.mmInstructedBalance}</li>
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
	public static final MMBusinessAssociationEnd<CorporateActionEntitlement, List<SecuritiesBalance>> mmInstructedBalance = new MMBusinessAssociationEnd<CorporateActionEntitlement, List<SecuritiesBalance>>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionOption120.mmInstructedQuantity, SecuritiesOption52.mmInstructedQuantity, CorporateActionBalanceDetails29.mmInstructedBalance, CorporateActionOption141.mmInstructedBalance,
					CorporateActionBalanceDetails37.mmTotalInstructedBalanceDetails, InstructedCorporateActionOption8.mmInstructedBalance, InstructedBalanceDetails7.mmTotalInstructedBalance,
					FinancialInstrumentAttributes93.mmInstructedBalance);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructedBalance";
			definition = "Balance of  instructed position.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesBalance.mmInstructedBalanceRelatedEntitlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesBalance.mmObject();
		}

		@Override
		public List<SecuritiesBalance> getValue(CorporateActionEntitlement obj) {
			return obj.getInstructedBalance();
		}

		@Override
		public void setValue(CorporateActionEntitlement obj, List<SecuritiesBalance> value) {
			obj.setInstructedBalance(value);
		}
	};
	protected List<SecuritiesBalance> uninstructedBalance;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmUninstructedBalance
	 * CorporateActionBalanceDetails29.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption141#mmUninstructedBalance
	 * CorporateActionOption141.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmUninstructedBalance
	 * CorporateActionBalanceDetails37.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93#mmUninstructedBalance
	 * FinancialInstrumentAttributes93.mmUninstructedBalance}</li>
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
	public static final MMBusinessAssociationEnd<CorporateActionEntitlement, List<SecuritiesBalance>> mmUninstructedBalance = new MMBusinessAssociationEnd<CorporateActionEntitlement, List<SecuritiesBalance>>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionBalanceDetails29.mmUninstructedBalance, CorporateActionOption141.mmUninstructedBalance, CorporateActionBalanceDetails37.mmUninstructedBalance,
					FinancialInstrumentAttributes93.mmUninstructedBalance);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UninstructedBalance";
			definition = "Balance of uninstructed position.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesBalance.mmUninstructedBalanceRelatedEntitlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesBalance.mmObject();
		}

		@Override
		public List<SecuritiesBalance> getValue(CorporateActionEntitlement obj) {
			return obj.getUninstructedBalance();
		}

		@Override
		public void setValue(CorporateActionEntitlement obj, List<SecuritiesBalance> value) {
			obj.setUninstructedBalance(value);
		}
	};
	protected YesNoIndicator eligibleBalanceIndicator;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<CorporateActionEntitlement, YesNoIndicator> mmEligibleBalanceIndicator = new MMBusinessAttribute<CorporateActionEntitlement, YesNoIndicator>() {
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

		@Override
		public YesNoIndicator getValue(CorporateActionEntitlement obj) {
			return obj.getEligibleBalanceIndicator();
		}

		@Override
		public void setValue(CorporateActionEntitlement obj, YesNoIndicator value) {
			obj.setEligibleBalanceIndicator(value);
		}
	};
	protected CorporateActionServicing relatedServicing;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<CorporateActionEntitlement, Optional<CorporateActionServicing>> mmRelatedServicing = new MMBusinessAssociationEnd<CorporateActionEntitlement, Optional<CorporateActionServicing>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedServicing";
			definition = "Process which groups the activities related to corporate action servicing.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionServicing.mmCorporateActionEntitlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionServicing.mmObject();
		}

		@Override
		public Optional<CorporateActionServicing> getValue(CorporateActionEntitlement obj) {
			return obj.getRelatedServicing();
		}

		@Override
		public void setValue(CorporateActionEntitlement obj, Optional<CorporateActionServicing> value) {
			obj.setRelatedServicing(value.orElse(null));
		}
	};
	protected List<SecuritiesBalance> notEligibleBalance;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<CorporateActionEntitlement, List<SecuritiesBalance>> mmNotEligibleBalance = new MMBusinessAssociationEnd<CorporateActionEntitlement, List<SecuritiesBalance>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotEligibleBalance";
			definition = "Total balance of securities which are not eligible for this corporate action event.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesBalance.mmNotEligibleBalanceRelatedEntitlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesBalance.mmObject();
		}

		@Override
		public List<SecuritiesBalance> getValue(CorporateActionEntitlement obj) {
			return obj.getNotEligibleBalance();
		}

		@Override
		public void setValue(CorporateActionEntitlement obj, List<SecuritiesBalance> value) {
			obj.setNotEligibleBalance(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEntitlement";
				definition = "Rights entitled to the account owner based on the terms of the corporate action event and the balance of underlying securities.";
				associationDomain_lazy = () -> Arrays.asList(SecuritiesBalance.mmEligibleBalanceRelatedEntitlement, SecuritiesBalance.mmCorporateActionEntitlement, SecuritiesBalance.mmInstructedBalanceRelatedEntitlement,
						SecuritiesBalance.mmUninstructedBalanceRelatedEntitlement, SecuritiesBalance.mmNotEligibleBalanceRelatedEntitlement, CorporateActionServicing.mmCorporateActionEntitlement);
				derivationElement_lazy = () -> Arrays.asList(EntitlementAdvice1.mmAccountAndDistributionDetails);
				subType_lazy = () -> Arrays.asList(CorporateActionCashEntitlement.mmObject(), CorporateActionSecuritiesEntitlement.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionEntitlement.mmEligibleBalance, com.tools20022.repository.entity.CorporateActionEntitlement.mmSecuritiesBalance,
						com.tools20022.repository.entity.CorporateActionEntitlement.mmInstructedBalance, com.tools20022.repository.entity.CorporateActionEntitlement.mmUninstructedBalance,
						com.tools20022.repository.entity.CorporateActionEntitlement.mmEligibleBalanceIndicator, com.tools20022.repository.entity.CorporateActionEntitlement.mmRelatedServicing,
						com.tools20022.repository.entity.CorporateActionEntitlement.mmNotEligibleBalance);
				derivationComponent_lazy = () -> Arrays.asList(Entitlement1.mmObject(), EntitlementAdvice1.mmObject(), CorporateActionBalanceDetails32.mmObject(), CorporateActionBalanceDetails31.mmObject(),
						CorporateActionBalanceDetails29.mmObject(), CorporateActionBalanceDetails37.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionEntitlement.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecuritiesBalance> getEligibleBalance() {
		return eligibleBalance == null ? eligibleBalance = new ArrayList<>() : eligibleBalance;
	}

	public CorporateActionEntitlement setEligibleBalance(List<SecuritiesBalance> eligibleBalance) {
		this.eligibleBalance = Objects.requireNonNull(eligibleBalance);
		return this;
	}

	public List<SecuritiesBalance> getSecuritiesBalance() {
		return securitiesBalance == null ? securitiesBalance = new ArrayList<>() : securitiesBalance;
	}

	public CorporateActionEntitlement setSecuritiesBalance(List<SecuritiesBalance> securitiesBalance) {
		this.securitiesBalance = Objects.requireNonNull(securitiesBalance);
		return this;
	}

	public List<SecuritiesBalance> getInstructedBalance() {
		return instructedBalance == null ? instructedBalance = new ArrayList<>() : instructedBalance;
	}

	public CorporateActionEntitlement setInstructedBalance(List<SecuritiesBalance> instructedBalance) {
		this.instructedBalance = Objects.requireNonNull(instructedBalance);
		return this;
	}

	public List<SecuritiesBalance> getUninstructedBalance() {
		return uninstructedBalance == null ? uninstructedBalance = new ArrayList<>() : uninstructedBalance;
	}

	public CorporateActionEntitlement setUninstructedBalance(List<SecuritiesBalance> uninstructedBalance) {
		this.uninstructedBalance = Objects.requireNonNull(uninstructedBalance);
		return this;
	}

	public YesNoIndicator getEligibleBalanceIndicator() {
		return eligibleBalanceIndicator;
	}

	public CorporateActionEntitlement setEligibleBalanceIndicator(YesNoIndicator eligibleBalanceIndicator) {
		this.eligibleBalanceIndicator = Objects.requireNonNull(eligibleBalanceIndicator);
		return this;
	}

	public Optional<CorporateActionServicing> getRelatedServicing() {
		return relatedServicing == null ? Optional.empty() : Optional.of(relatedServicing);
	}

	public CorporateActionEntitlement setRelatedServicing(CorporateActionServicing relatedServicing) {
		this.relatedServicing = relatedServicing;
		return this;
	}

	public List<SecuritiesBalance> getNotEligibleBalance() {
		return notEligibleBalance == null ? notEligibleBalance = new ArrayList<>() : notEligibleBalance;
	}

	public CorporateActionEntitlement setNotEligibleBalance(List<SecuritiesBalance> notEligibleBalance) {
		this.notEligibleBalance = Objects.requireNonNull(notEligibleBalance);
		return this;
	}
}