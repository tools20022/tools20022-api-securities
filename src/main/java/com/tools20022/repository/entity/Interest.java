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
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.InterestTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Consideration, such as amount of money, paid or received in exchange for an
 * asset that has been invested, loaned or borrowed for a certain period. The
 * interest is expressed as a fixed amount or percentage of the amount upon
 * which the interest is applied.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Interest" src="doc-files/Interest.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmAccruedInterestAmount
 * Interest.mmAccruedInterestAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestCalculation
 * Interest.mmInterestCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmAmount
 * Interest.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmRate
 * Interest.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedCashProceedsDefinition
 * Interest.mmRelatedCashProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmSecuritiesFinancing
 * Interest.mmSecuritiesFinancing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmInterestTax
 * Interest.mmInterestTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmCreditDebitIndicator
 * Interest.mmCreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmCashEntry
 * Interest.mmCashEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmPaymentDate
 * Interest.mmPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedInterestManagement
 * Interest.mmRelatedInterestManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedUndertakingAmount
 * Interest.mmRelatedUndertakingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedDebitCreditFacility
 * Interest.mmRelatedDebitCreditFacility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmSecuritiesSettlement
 * Interest.mmSecuritiesSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmInterestName
 * Interest.mmInterestName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedAssetHolding
 * Interest.mmRelatedAssetHolding}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmDeposit
 * Interest.mmDeposit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmAccountBalance
 * Interest.mmAccountBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedAccountContract
 * Interest.mmRelatedAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedNetAssetValueCalculation
 * Interest.mmRelatedNetAssetValueCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmTypeOfInterest
 * Interest.mmTypeOfInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedPaymentCard
 * Interest.mmRelatedPaymentCard}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForInterestName
 * GenericIdentification.mmIdentificationForInterestName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmInterest
 * NetAssetValueCalculation.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmInterest
 * Tax.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountContract#mmInterest
 * AccountContract.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmInterest
 * PaymentCard.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#mmInterest
 * CashEntry.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmInterest
 * AssetHolding.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#mmInterest
 * Balance.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmAccruedInterest
 * SecuritiesSettlement.mmAccruedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterest
 * InterestCalculation.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmInterest
 * SecuritiesFinancing.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmInterest
 * CashProceedsDefinition.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DebitCreditFacility#mmCashAccountInterest
 * DebitCreditFacility.mmCashAccountInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingAmount#mmInterest
 * UndertakingAmount.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Deposit#mmInterest
 * Deposit.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestManagement#mmInterest
 * InterestManagement.mmInterest}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat8Choice#mmRateTypeAndAmountAndRateStatus
 * InterestRateUsedForPaymentFormat8Choice.mmRateTypeAndAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat7Choice#mmRateTypeAndAmountAndRateStatus
 * InterestRateUsedForPaymentFormat7Choice.mmRateTypeAndAmountAndRateStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.RateOrName1Choice
 * RateOrName1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.InterestRate1Choice
 * InterestRate1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestAmount1
 * InterestAmount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestResult1
 * InterestResult1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestAmount2
 * InterestAmount2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat8Choice
 * InterestRateUsedForPaymentFormat8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus24
 * RateTypeAndAmountAndStatus24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus22
 * RateTypeAndAmountAndStatus22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus25
 * RateTypeAndAmountAndStatus25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus27
 * RateTypeAndAmountAndStatus27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus26
 * RateTypeAndAmountAndStatus26}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat7Choice
 * InterestRateUsedForPaymentFormat7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus28
 * RateTypeAndAmountAndStatus28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus29
 * RateTypeAndAmountAndStatus29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestStatement4
 * InterestStatement4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestRateContractTerm2
 * InterestRateContractTerm2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.InterestRate6Choice
 * InterestRate6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.InterestRate8Choice
 * InterestRate8Choice}</li>
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
 * "Interest"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Consideration, such as amount of money,  paid or received in exchange for an asset that has been invested, loaned or borrowed for a certain period. The interest is expressed as a fixed amount or percentage of the amount upon which the interest is applied."
 * </li>
 * </ul>
 */
public class Interest {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount accruedInterestAmount;
	/**
	 * Interest amount that has accrued in between coupon payment periods.
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
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts1#mmAccruedInterestAmount
	 * BalanceAmounts1.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4#mmAccruedInterestAmount
	 * AggregateBalancePerSafekeepingPlace4.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#mmAccruedInterestAmount
	 * AggregateBalanceInformation3.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts3#mmAccruedInterestAmount
	 * BalanceAmounts3.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#mmAccruedInterestAmount
	 * AggregateBalancePerSafekeepingPlace3.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#mmAccruedInterestAmount
	 * AggregateBalanceInformation4.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmAccruedInterestAmount
	 * SecuritiesFinancing10.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmAccruedInterestAmount
	 * InterestAmount1.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmAccruedInterestAmount
	 * InterestAmount2.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1#mmTotalAccruedInterestAmount
	 * SummaryAmounts1.mmTotalAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralAmount1#mmAccruedInterestAmount
	 * CollateralAmount1.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmAccruedInterestAmount
	 * Order17.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmAccruedInterestAmount
	 * Order18.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmAccruedInterestAmount
	 * TradeLeg8.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmAccruedInterestAmount
	 * TradeLeg9.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#mmAccruedInterestAmount
	 * OtherAmounts28.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#mmAccruedInterestAmount
	 * OtherAmounts30.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#mmAccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails28.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmAccruedInterestAmount
	 * OtherAmounts31.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmAccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails27.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmAccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails29.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts32#mmAccruedInterestAmount
	 * OtherAmounts32.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29#mmAccruedInterestAmount
	 * OtherAmounts29.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmAccruedInterestAmount
	 * CorporateActionAmounts37.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmAccruedInterestAmount
	 * CorporateActionAmounts36.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice21#mmAccruedInterestNAV
	 * UnitPrice21.mmAccruedInterestNAV}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmAccruedInterestAmount
	 * CorporateActionAmounts38.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#mmAccruedInterestAmount
	 * InterestCalculation4.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmAccruedInterestAmount
	 * TransactionDetails95.mmAccruedInterestAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest amount that has accrued in between coupon payment periods."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAccruedInterestAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(BalanceAmounts1.mmAccruedInterestAmount, AggregateBalancePerSafekeepingPlace4.mmAccruedInterestAmount, AggregateBalanceInformation3.mmAccruedInterestAmount,
					BalanceAmounts3.mmAccruedInterestAmount, AggregateBalancePerSafekeepingPlace3.mmAccruedInterestAmount, AggregateBalanceInformation4.mmAccruedInterestAmount, SecuritiesFinancing10.mmAccruedInterestAmount,
					InterestAmount1.mmAccruedInterestAmount, InterestAmount2.mmAccruedInterestAmount, SummaryAmounts1.mmTotalAccruedInterestAmount, CollateralAmount1.mmAccruedInterestAmount, Order17.mmAccruedInterestAmount,
					Order18.mmAccruedInterestAmount, TradeLeg8.mmAccruedInterestAmount, TradeLeg9.mmAccruedInterestAmount, OtherAmounts28.mmAccruedInterestAmount, OtherAmounts30.mmAccruedInterestAmount,
					SecuritiesFinancingTransactionDetails28.mmAccruedInterestAmount, OtherAmounts31.mmAccruedInterestAmount, SecuritiesFinancingTransactionDetails27.mmAccruedInterestAmount,
					SecuritiesFinancingTransactionDetails29.mmAccruedInterestAmount, OtherAmounts32.mmAccruedInterestAmount, OtherAmounts29.mmAccruedInterestAmount, CorporateActionAmounts37.mmAccruedInterestAmount,
					CorporateActionAmounts36.mmAccruedInterestAmount, UnitPrice21.mmAccruedInterestNAV, CorporateActionAmounts38.mmAccruedInterestAmount, InterestCalculation4.mmAccruedInterestAmount,
					TransactionDetails95.mmAccruedInterestAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Interest amount that has accrued in between coupon payment periods.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Interest.class.getMethod("getAccruedInterestAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.InterestCalculation> interestCalculation;
	/**
	 * Calculation parameters used to obtain the interest amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterest
	 * InterestCalculation.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#mmChargesRate
	 * SecuritiesFinancingTransactionDetails28.mmChargesRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmChargesRate
	 * SecuritiesFinancingTransactionDetails27.mmChargesRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus24#mmRateType
	 * RateTypeAndAmountAndStatus24.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus22#mmRateType
	 * RateTypeAndAmountAndStatus22.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus25#mmRateType
	 * RateTypeAndAmountAndStatus25.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus27#mmRateType
	 * RateTypeAndAmountAndStatus27.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus26#mmRateType
	 * RateTypeAndAmountAndStatus26.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus28#mmRateType
	 * RateTypeAndAmountAndStatus28.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus29#mmRateType
	 * RateTypeAndAmountAndStatus29.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement4#mmInterestCalculation
	 * InterestStatement4.mmInterestCalculation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Calculation parameters used to obtain the interest amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInterestCalculation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails28.mmChargesRate, SecuritiesFinancingTransactionDetails27.mmChargesRate, RateTypeAndAmountAndStatus24.mmRateType,
					RateTypeAndAmountAndStatus22.mmRateType, RateTypeAndAmountAndStatus25.mmRateType, RateTypeAndAmountAndStatus27.mmRateType, RateTypeAndAmountAndStatus26.mmRateType, RateTypeAndAmountAndStatus28.mmRateType,
					RateTypeAndAmountAndStatus29.mmRateType, InterestStatement4.mmInterestCalculation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestCalculation";
			definition = "Calculation parameters used to obtain the interest amount.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
		}
	};
	protected CurrencyAndAmount amount;
	/**
	 * Amount of money representing interest payments.
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
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmBorrowingInterestAmount
	 * OtherAmounts16.mmBorrowingInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmInterestAmount
	 * CorporateActionAmounts1.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestResult1#mmInterestDueToA
	 * InterestResult1.mmInterestDueToA}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestResult1#mmInterestDueToB
	 * InterestResult1.mmInterestDueToB}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition3#mmAccruedInterestAmount
	 * NetPosition3.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat8Choice#mmAmount
	 * InterestRateUsedForPaymentFormat8Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus24#mmAmount
	 * RateTypeAndAmountAndStatus24.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus22#mmAmount
	 * RateTypeAndAmountAndStatus22.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus25#mmAmount
	 * RateTypeAndAmountAndStatus25.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus27#mmAmount
	 * RateTypeAndAmountAndStatus27.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmInterestAmount
	 * CorporateActionAmounts37.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus26#mmAmount
	 * RateTypeAndAmountAndStatus26.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat7Choice#mmAmount
	 * InterestRateUsedForPaymentFormat7Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmInterestAmount
	 * CorporateActionAmounts36.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus28#mmAmount
	 * RateTypeAndAmountAndStatus28.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus29#mmAmount
	 * RateTypeAndAmountAndStatus29.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmInterestAmount
	 * CorporateActionAmounts38.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement4#mmTotalInterestAmountDueToA
	 * InterestStatement4.mmTotalInterestAmountDueToA}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement4#mmTotalInterestAmountDueToB
	 * InterestStatement4.mmTotalInterestAmountDueToB}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#mmAggregatedInterestAmount
	 * InterestCalculation4.mmAggregatedInterestAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money representing interest payments."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OtherAmounts16.mmBorrowingInterestAmount, CorporateActionAmounts1.mmInterestAmount, InterestResult1.mmInterestDueToA, InterestResult1.mmInterestDueToB, NetPosition3.mmAccruedInterestAmount,
					InterestRateUsedForPaymentFormat8Choice.mmAmount, RateTypeAndAmountAndStatus24.mmAmount, RateTypeAndAmountAndStatus22.mmAmount, RateTypeAndAmountAndStatus25.mmAmount, RateTypeAndAmountAndStatus27.mmAmount,
					CorporateActionAmounts37.mmInterestAmount, RateTypeAndAmountAndStatus26.mmAmount, InterestRateUsedForPaymentFormat7Choice.mmAmount, CorporateActionAmounts36.mmInterestAmount, RateTypeAndAmountAndStatus28.mmAmount,
					RateTypeAndAmountAndStatus29.mmAmount, CorporateActionAmounts38.mmInterestAmount, InterestStatement4.mmTotalInterestAmountDueToA, InterestStatement4.mmTotalInterestAmountDueToB,
					InterestCalculation4.mmAggregatedInterestAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money representing interest payments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Interest.class.getMethod("getAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate rate;
	/**
	 * The actual interest rate used for the payment of the interest for the
	 * specified interest period.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.RateOrName1Choice#mmRate
	 * RateOrName1Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmAccruedInterestPercentage
	 * SecuritiesFinancing10.mmAccruedInterestPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmInterestRate
	 * SecuritiesFinancing10.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmInterestForUsedPayment
	 * CorporateActionRate2.mmInterestForUsedPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRate1Choice#mmFixedInterestRate
	 * InterestRate1Choice.mmFixedInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmInterestRate
	 * InterestAmount1.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmInterestRate
	 * InterestAmount2.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmAccruedInterestPercentage
	 * Order17.mmAccruedInterestPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmAccruedInterestPercentage
	 * Order18.mmAccruedInterestPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebtInstrument2#mmInterestRate
	 * DebtInstrument2.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat8Choice#mmRate
	 * InterestRateUsedForPaymentFormat8Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat7Choice#mmRate
	 * InterestRateUsedForPaymentFormat7Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#mmEffectiveRate
	 * InterestCalculation4.mmEffectiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRate6Choice#mmFixed
	 * InterestRate6Choice.mmFixed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInterest3#mmInterestRate
	 * DerivativeInterest3.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInterest3#mmFirstLegInterestRate
	 * DerivativeInterest3.mmFirstLegInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInterest3#mmOtherLegInterestRate
	 * DerivativeInterest3.mmOtherLegInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRate8Choice#mmFixed
	 * InterestRate8Choice.mmFixed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRateDerivative5#mmInterestRateReference
	 * InterestRateDerivative5.mmInterestRateReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#mmInterestRateUsedForPayment
	 * RateDetails26.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate82#mmInterestRateUsedForPayment
	 * CorporateActionRate82.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#mmInterestRateUsedForPayment
	 * CorporateActionRate80.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#mmInterestRateUsedForPayment
	 * RateDetails27.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#mmInterestRateUsedForPayment
	 * CorporateActionRate81.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmDealRate
	 * SecuredMarketTransaction4.mmDealRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmFixedInterestRate
	 * OvernightIndexSwapTransaction4.mmFixedInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmDealRate
	 * UnsecuredMarketTransaction4.mmDealRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The actual interest rate used for the payment of the interest for the specified interest period."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RateOrName1Choice.mmRate, SecuritiesFinancing10.mmAccruedInterestPercentage, SecuritiesFinancing10.mmInterestRate, CorporateActionRate2.mmInterestForUsedPayment,
					InterestRate1Choice.mmFixedInterestRate, InterestAmount1.mmInterestRate, InterestAmount2.mmInterestRate, Order17.mmAccruedInterestPercentage, Order18.mmAccruedInterestPercentage, DebtInstrument2.mmInterestRate,
					InterestRateUsedForPaymentFormat8Choice.mmRate, InterestRateUsedForPaymentFormat7Choice.mmRate, InterestCalculation4.mmEffectiveRate, InterestRate6Choice.mmFixed, DerivativeInterest3.mmInterestRate,
					DerivativeInterest3.mmFirstLegInterestRate, DerivativeInterest3.mmOtherLegInterestRate, InterestRate8Choice.mmFixed, InterestRateDerivative5.mmInterestRateReference, RateDetails26.mmInterestRateUsedForPayment,
					CorporateActionRate82.mmInterestRateUsedForPayment, CorporateActionRate80.mmInterestRateUsedForPayment, RateDetails27.mmInterestRateUsedForPayment, CorporateActionRate81.mmInterestRateUsedForPayment,
					SecuredMarketTransaction4.mmDealRate, OvernightIndexSwapTransaction4.mmFixedInterestRate, UnsecuredMarketTransaction4.mmDealRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "The actual interest rate used for the payment of the interest for the specified interest period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Interest.class.getMethod("getRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CashProceedsDefinition> relatedCashProceedsDefinition;
	/**
	 * Cash proceeds definition for which an interest is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmInterest
	 * CashProceedsDefinition.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCashProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash proceeds definition for which an interest is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCashProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCashProceedsDefinition";
			definition = "Cash proceeds definition for which an interest is provided.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesFinancing> securitiesFinancing;
	/**
	 * Specifies the financing trade on which this interest apply.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmInterest
	 * SecuritiesFinancing.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the financing trade on which this interest apply."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesFinancing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesFinancing";
			definition = "Specifies the financing trade on which this interest apply.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
		}
	};
	protected Tax interestTax;
	/**
	 * Specifies the tax on interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Tax#mmInterest
	 * Tax.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmAccruedInterestTax
	 * SecuritiesFinancing10.mmAccruedInterestTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmAppliedWithholdingTax
	 * InterestAmount1.mmAppliedWithholdingTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmAppliedWithholdingTax
	 * InterestAmount2.mmAppliedWithholdingTax}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the tax on interest."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInterestTax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesFinancing10.mmAccruedInterestTax, InterestAmount1.mmAppliedWithholdingTax, InterestAmount2.mmAppliedWithholdingTax);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestTax";
			definition = "Specifies the tax on interest.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};
	protected DebitCreditCode creditDebitIndicator;
	/**
	 * Indicates whether the interest is a debit or credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebitCreditCode
	 * DebitCreditCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the interest is a debit or credit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCreditDebitIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the interest is a debit or credit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Interest.class.getMethod("getCreditDebitIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CashEntry cashEntry;
	/**
	 * Entry which contains the interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmInterest
	 * CashEntry.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entry which contains the interest."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashEntry";
			definition = "Entry which contains the interest.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
		}
	};
	protected ISODate paymentDate;
	/**
	 * Date of the next interest payment.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmValueDate
	 * InterestAmount1.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestResult1#mmValueDate
	 * InterestResult1.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmValueDate
	 * InterestAmount2.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement4#mmValueDate
	 * InterestStatement4.mmValueDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the next interest payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPaymentDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InterestAmount1.mmValueDate, InterestResult1.mmValueDate, InterestAmount2.mmValueDate, InterestStatement4.mmValueDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentDate";
			definition = "Date of the next interest payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Interest.class.getMethod("getPaymentDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InterestManagement relatedInterestManagement;
	/**
	 * Management of interest which consists into calculating the interest,
	 * requesting its payment or distributing the interest proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestManagement#mmInterest
	 * InterestManagement.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InterestManagement
	 * InterestManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInterestManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Management of interest which consists into calculating the interest, requesting its payment or distributing the interest proceeds."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedInterestManagement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInterestManagement";
			definition = "Management of interest which consists into calculating the interest, requesting its payment or distributing the interest proceeds.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InterestManagement.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InterestManagement.mmObject();
		}
	};
	protected UndertakingAmount relatedUndertakingAmount;
	/**
	 * Undertaking amount for which an interest is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingAmount#mmInterest
	 * UndertakingAmount.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.UndertakingAmount
	 * UndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedUndertakingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Undertaking amount for which an interest is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedUndertakingAmount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedUndertakingAmount";
			definition = "Undertaking amount for which an interest is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingAmount.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.UndertakingAmount.mmObject();
		}
	};
	protected DebitCreditFacility relatedDebitCreditFacility;
	/**
	 * Debit and credit facilities on which the interest applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DebitCreditFacility#mmCashAccountInterest
	 * DebitCreditFacility.mmCashAccountInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DebitCreditFacility
	 * DebitCreditFacility}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDebitCreditFacility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Debit and credit facilities on which the interest applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedDebitCreditFacility = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedDebitCreditFacility";
			definition = "Debit and credit facilities on which the interest applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DebitCreditFacility.mmCashAccountInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DebitCreditFacility.mmObject();
		}
	};
	protected SecuritiesSettlement securitiesSettlement;
	/**
	 * Securities settlement process for which an accrued interest is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmAccruedInterest
	 * SecuritiesSettlement.mmAccruedInterest}</li>
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities settlement process for which an accrued interest is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Securities settlement process for which an accrued interest is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmAccruedInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
		}
	};
	protected GenericIdentification interestName;
	/**
	 * Interest rate expressed as a rate name.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForInterestName
	 * GenericIdentification.mmIdentificationForInterestName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest rate expressed as a rate name."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInterestName = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestName";
			definition = "Interest rate expressed as a rate name.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmIdentificationForInterestName;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
		}
	};
	protected AssetHolding relatedAssetHolding;
	/**
	 * Asset holding on which interest is paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmInterest
	 * AssetHolding.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetHolding
	 * AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAssetHolding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset holding on which interest is paid."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedAssetHolding = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedAssetHolding";
			definition = "Asset holding on which interest is paid.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
		}
	};
	protected Deposit deposit;
	/**
	 * Deposit for which an interest is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Deposit#mmInterest
	 * Deposit.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Deposit Deposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deposit for which an interest is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDeposit = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Deposit";
			definition = "Deposit for which an interest is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Deposit.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Deposit.mmObject();
		}
	};
	protected Balance accountBalance;
	/**
	 * Balance for which an interest is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmInterest
	 * Balance.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Balance Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance for which an interest is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAccountBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountBalance";
			definition = "Balance for which an interest is calculated.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Balance.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
		}
	};
	protected AccountContract relatedAccountContract;
	/**
	 * Account contract for which interest parameters are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract#mmInterest
	 * AccountContract.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountContract
	 * AccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAccountContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account contract for which interest parameters are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedAccountContract = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedAccountContract";
			definition = "Account contract for which interest parameters are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountContract.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
		}
	};
	protected NetAssetValueCalculation relatedNetAssetValueCalculation;
	/**
	 * Net asset value calculation for which an accrued interest is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmInterest
	 * NetAssetValueCalculation.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedNetAssetValueCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net asset value calculation for which an accrued interest is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedNetAssetValueCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedNetAssetValueCalculation";
			definition = "Net asset value calculation for which an accrued interest is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
		}
	};
	protected InterestTypeCode typeOfInterest;
	/**
	 * Specifies the type of interest associated with a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InterestTypeCode
	 * InterestTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmInterestType
	 * Order17.mmInterestType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmInterestType
	 * Order18.mmInterestType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmRateType
	 * SecuredMarketTransaction4.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmRateType
	 * UnsecuredMarketTransaction4.mmRateType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of interest associated with a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTypeOfInterest = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Order17.mmInterestType, Order18.mmInterestType, SecuredMarketTransaction4.mmRateType, UnsecuredMarketTransaction4.mmRateType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TypeOfInterest";
			definition = "Specifies the type of interest associated with a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Interest.class.getMethod("getTypeOfInterest", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PaymentCard relatedPaymentCard;
	/**
	 * Payment card for which interest on due amounts is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmInterest
	 * PaymentCard.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentCard
	 * PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPaymentCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment card for which interest on due amounts is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedPaymentCard = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPaymentCard";
			definition = "Payment card for which interest on due amounts is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Interest";
				definition = "Consideration, such as amount of money,  paid or received in exchange for an asset that has been invested, loaned or borrowed for a certain period. The interest is expressed as a fixed amount or percentage of the amount upon which the interest is applied.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.mmIdentificationForInterestName, com.tools20022.repository.entity.NetAssetValueCalculation.mmInterest,
						com.tools20022.repository.entity.Tax.mmInterest, com.tools20022.repository.entity.AccountContract.mmInterest, com.tools20022.repository.entity.PaymentCard.mmInterest,
						com.tools20022.repository.entity.CashEntry.mmInterest, com.tools20022.repository.entity.AssetHolding.mmInterest, com.tools20022.repository.entity.Balance.mmInterest,
						com.tools20022.repository.entity.SecuritiesSettlement.mmAccruedInterest, com.tools20022.repository.entity.InterestCalculation.mmInterest, com.tools20022.repository.entity.SecuritiesFinancing.mmInterest,
						com.tools20022.repository.entity.CashProceedsDefinition.mmInterest, com.tools20022.repository.entity.DebitCreditFacility.mmCashAccountInterest, com.tools20022.repository.entity.UndertakingAmount.mmInterest,
						com.tools20022.repository.entity.Deposit.mmInterest, com.tools20022.repository.entity.InterestManagement.mmInterest);
				derivationElement_lazy = () -> Arrays.asList(InterestRateUsedForPaymentFormat8Choice.mmRateTypeAndAmountAndRateStatus, InterestRateUsedForPaymentFormat7Choice.mmRateTypeAndAmountAndRateStatus);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Interest.mmAccruedInterestAmount, com.tools20022.repository.entity.Interest.mmInterestCalculation, com.tools20022.repository.entity.Interest.mmAmount,
						com.tools20022.repository.entity.Interest.mmRate, com.tools20022.repository.entity.Interest.mmRelatedCashProceedsDefinition, com.tools20022.repository.entity.Interest.mmSecuritiesFinancing,
						com.tools20022.repository.entity.Interest.mmInterestTax, com.tools20022.repository.entity.Interest.mmCreditDebitIndicator, com.tools20022.repository.entity.Interest.mmCashEntry,
						com.tools20022.repository.entity.Interest.mmPaymentDate, com.tools20022.repository.entity.Interest.mmRelatedInterestManagement, com.tools20022.repository.entity.Interest.mmRelatedUndertakingAmount,
						com.tools20022.repository.entity.Interest.mmRelatedDebitCreditFacility, com.tools20022.repository.entity.Interest.mmSecuritiesSettlement, com.tools20022.repository.entity.Interest.mmInterestName,
						com.tools20022.repository.entity.Interest.mmRelatedAssetHolding, com.tools20022.repository.entity.Interest.mmDeposit, com.tools20022.repository.entity.Interest.mmAccountBalance,
						com.tools20022.repository.entity.Interest.mmRelatedAccountContract, com.tools20022.repository.entity.Interest.mmRelatedNetAssetValueCalculation, com.tools20022.repository.entity.Interest.mmTypeOfInterest,
						com.tools20022.repository.entity.Interest.mmRelatedPaymentCard);
				derivationComponent_lazy = () -> Arrays.asList(RateOrName1Choice.mmObject(), InterestRate1Choice.mmObject(), InterestAmount1.mmObject(), InterestResult1.mmObject(), InterestAmount2.mmObject(),
						InterestRateUsedForPaymentFormat8Choice.mmObject(), RateTypeAndAmountAndStatus24.mmObject(), RateTypeAndAmountAndStatus22.mmObject(), RateTypeAndAmountAndStatus25.mmObject(), RateTypeAndAmountAndStatus27.mmObject(),
						RateTypeAndAmountAndStatus26.mmObject(), InterestRateUsedForPaymentFormat7Choice.mmObject(), RateTypeAndAmountAndStatus28.mmObject(), RateTypeAndAmountAndStatus29.mmObject(), InterestStatement4.mmObject(),
						InterestRateContractTerm2.mmObject(), InterestRate6Choice.mmObject(), InterestRate8Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Interest.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getAccruedInterestAmount() {
		return accruedInterestAmount;
	}

	public void setAccruedInterestAmount(CurrencyAndAmount accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
	}

	public List<InterestCalculation> getInterestCalculation() {
		return interestCalculation;
	}

	public void setInterestCalculation(List<com.tools20022.repository.entity.InterestCalculation> interestCalculation) {
		this.interestCalculation = interestCalculation;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(CurrencyAndAmount amount) {
		this.amount = amount;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public void setRate(PercentageRate rate) {
		this.rate = rate;
	}

	public List<CashProceedsDefinition> getRelatedCashProceedsDefinition() {
		return relatedCashProceedsDefinition;
	}

	public void setRelatedCashProceedsDefinition(List<com.tools20022.repository.entity.CashProceedsDefinition> relatedCashProceedsDefinition) {
		this.relatedCashProceedsDefinition = relatedCashProceedsDefinition;
	}

	public List<SecuritiesFinancing> getSecuritiesFinancing() {
		return securitiesFinancing;
	}

	public void setSecuritiesFinancing(List<com.tools20022.repository.entity.SecuritiesFinancing> securitiesFinancing) {
		this.securitiesFinancing = securitiesFinancing;
	}

	public Tax getInterestTax() {
		return interestTax;
	}

	public void setInterestTax(com.tools20022.repository.entity.Tax interestTax) {
		this.interestTax = interestTax;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public void setCreditDebitIndicator(DebitCreditCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
	}

	public CashEntry getCashEntry() {
		return cashEntry;
	}

	public void setCashEntry(com.tools20022.repository.entity.CashEntry cashEntry) {
		this.cashEntry = cashEntry;
	}

	public ISODate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(ISODate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public InterestManagement getRelatedInterestManagement() {
		return relatedInterestManagement;
	}

	public void setRelatedInterestManagement(com.tools20022.repository.entity.InterestManagement relatedInterestManagement) {
		this.relatedInterestManagement = relatedInterestManagement;
	}

	public UndertakingAmount getRelatedUndertakingAmount() {
		return relatedUndertakingAmount;
	}

	public void setRelatedUndertakingAmount(com.tools20022.repository.entity.UndertakingAmount relatedUndertakingAmount) {
		this.relatedUndertakingAmount = relatedUndertakingAmount;
	}

	public DebitCreditFacility getRelatedDebitCreditFacility() {
		return relatedDebitCreditFacility;
	}

	public void setRelatedDebitCreditFacility(com.tools20022.repository.entity.DebitCreditFacility relatedDebitCreditFacility) {
		this.relatedDebitCreditFacility = relatedDebitCreditFacility;
	}

	public SecuritiesSettlement getSecuritiesSettlement() {
		return securitiesSettlement;
	}

	public void setSecuritiesSettlement(com.tools20022.repository.entity.SecuritiesSettlement securitiesSettlement) {
		this.securitiesSettlement = securitiesSettlement;
	}

	public GenericIdentification getInterestName() {
		return interestName;
	}

	public void setInterestName(com.tools20022.repository.entity.GenericIdentification interestName) {
		this.interestName = interestName;
	}

	public AssetHolding getRelatedAssetHolding() {
		return relatedAssetHolding;
	}

	public void setRelatedAssetHolding(com.tools20022.repository.entity.AssetHolding relatedAssetHolding) {
		this.relatedAssetHolding = relatedAssetHolding;
	}

	public Deposit getDeposit() {
		return deposit;
	}

	public void setDeposit(com.tools20022.repository.entity.Deposit deposit) {
		this.deposit = deposit;
	}

	public Balance getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(com.tools20022.repository.entity.Balance accountBalance) {
		this.accountBalance = accountBalance;
	}

	public AccountContract getRelatedAccountContract() {
		return relatedAccountContract;
	}

	public void setRelatedAccountContract(com.tools20022.repository.entity.AccountContract relatedAccountContract) {
		this.relatedAccountContract = relatedAccountContract;
	}

	public NetAssetValueCalculation getRelatedNetAssetValueCalculation() {
		return relatedNetAssetValueCalculation;
	}

	public void setRelatedNetAssetValueCalculation(com.tools20022.repository.entity.NetAssetValueCalculation relatedNetAssetValueCalculation) {
		this.relatedNetAssetValueCalculation = relatedNetAssetValueCalculation;
	}

	public InterestTypeCode getTypeOfInterest() {
		return typeOfInterest;
	}

	public void setTypeOfInterest(InterestTypeCode typeOfInterest) {
		this.typeOfInterest = typeOfInterest;
	}

	public PaymentCard getRelatedPaymentCard() {
		return relatedPaymentCard;
	}

	public void setRelatedPaymentCard(com.tools20022.repository.entity.PaymentCard relatedPaymentCard) {
		this.relatedPaymentCard = relatedPaymentCard;
	}
}