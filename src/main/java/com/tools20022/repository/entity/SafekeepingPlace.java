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
import com.tools20022.repository.codeset.SafekeepingPlaceCode;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Organisation used as the safekeeping place for the securities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SafekeepingPlace" src="doc-files/SafekeepingPlace.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole
 * SecuritiesPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmSafekeepingPlaceType
 * SafekeepingPlace.mmSafekeepingPlaceType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmCountry
 * SafekeepingPlace.mmCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmRelatedSecuritiesAccount
 * SafekeepingPlace.mmRelatedSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmSecuritiesBalance
 * SafekeepingPlace.mmSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmSecuritiesSettlement
 * SafekeepingPlace.mmSecuritiesSettlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#mmCountryForSafekeepingPlace
 * Country.mmCountryForSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSafekeepingPlace
 * SecuritiesAccount.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmRequestedSafekeepingPlace
 * SecuritiesSettlement.mmRequestedSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSafekeepingPlace
 * SecuritiesBalance.mmSafekeepingPlace}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat2Choice#mmIdentification
 * SafekeepingPlaceFormat2Choice.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat2Choice#mmTypeAndIdentification
 * SafekeepingPlaceFormat2Choice.mmTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormatChoice#mmIdentification
 * SafekeepingPlaceFormatChoice.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace4.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#mmSafekeepingPlace
 * AggregateBalanceInformation3.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace3.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#mmSafekeepingPlace
 * AggregateBalanceInformation4.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDescription3#mmSafekeepingPlace
 * FinancialInstrumentDescription3.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat7Choice#mmIdentification
 * SafekeepingPlaceFormat7Choice.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat7Choice#mmTypeAndIdentification
 * SafekeepingPlaceFormat7Choice.mmTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HoldingBalance8#mmSafekeepingPlace
 * HoldingBalance8.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HoldingBalance7#mmSafekeepingPlace
 * HoldingBalance7.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#mmSafekeepingPlace
 * AggregateBalanceInformation30.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount40#mmSafekeepingPlace
 * QuantityAndAccount40.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount38#mmSafekeepingPlace
 * QuantityAndAccount38.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#mmSafekeepingPlace
 * AggregateBalanceInformation31.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace28.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace29.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat8Choice#mmIdentification
 * SafekeepingPlaceFormat8Choice.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat8Choice#mmTypeAndIdentification
 * SafekeepingPlaceFormat8Choice.mmTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat10Choice#mmIdentification
 * SafekeepingPlaceFormat10Choice.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat10Choice#mmTypeAndIdentification
 * SafekeepingPlaceFormat10Choice.mmTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance34#mmSafekeepingPlace
 * AccountAndBalance34.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance35#mmSafekeepingPlace
 * AccountAndBalance35.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance33#mmSafekeepingPlace
 * AccountAndBalance33.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#mmSafekeepingPlace
 * OtherCollateral7.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmSafekeepingPlace
 * OtherCollateral6.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral6#mmSafekeepingPlace
 * SecuritiesCollateral6.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral5#mmSafekeepingPlace
 * SecuritiesCollateral5.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral5#mmSafekeepingPlace
 * OtherCollateral5.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#mmSafekeepingPlace
 * SecuritiesCollateral7.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmSafekeepingPlace
 * SecuritiesFinancingTransactionDetails35.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral8#mmSafekeepingPlace
 * SecuritiesCollateral8.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount66#mmSafekeepingPlace
 * InvestmentAccount66.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67#mmSafekeepingPlace
 * InvestmentAccount67.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount68#mmSafekeepingPlace
 * InvestmentAccount68.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails28#mmSafekeepingPlace
 * FinancialInstrumentDetails28.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount64#mmSafekeepingPlace
 * QuantityAndAccount64.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails105#mmSafekeepingPlace
 * TransactionDetails105.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount63#mmSafekeepingPlace
 * QuantityAndAccount63.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails104#mmSafekeepingPlace
 * TransactionDetails104.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails103#mmSafekeepingPlace
 * TransactionDetails103.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails45#mmSafekeepingPlace
 * IntraPositionDetails45.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount65#mmSafekeepingPlace
 * QuantityAndAccount65.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount66#mmSafekeepingPlace
 * QuantityAndAccount66.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount67#mmSafekeepingPlace
 * QuantityAndAccount67.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount68#mmSafekeepingPlace
 * QuantityAndAccount68.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption141#mmSafekeepingPlace
 * CorporateActionOption141.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification43#mmSafekeepingPlace
 * AccountIdentification43.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmSafekeepingPlace
 * SecuritiesOption64.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption65#mmSafekeepingPlace
 * SecuritiesOption65.mmSafekeepingPlace}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndAnyBICIdentifier1
 * SafekeepingPlaceTypeAndAnyBICIdentifier1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText2
 * SafekeepingPlaceTypeAndText2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat2Choice
 * SafekeepingPlaceFormat2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceAsCodeAndPartyIdentification
 * SafekeepingPlaceAsCodeAndPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormatChoice
 * SafekeepingPlaceFormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText1
 * SafekeepingPlaceTypeAndText1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat7Choice
 * SafekeepingPlaceFormat7Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat8Choice
 * SafekeepingPlaceFormat8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText6
 * SafekeepingPlaceTypeAndText6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat10Choice
 * SafekeepingPlaceFormat10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText8
 * SafekeepingPlaceTypeAndText8}</li>
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
 * "SafekeepingPlace"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Organisation used as the safekeeping place for the securities."</li>
 * </ul>
 */
public class SafekeepingPlace extends SecuritiesPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SafekeepingPlaceCode safekeepingPlaceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlaceCode
	 * SafekeepingPlaceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndAnyBICIdentifier1#mmSafekeepingPlaceType
	 * SafekeepingPlaceTypeAndAnyBICIdentifier1.mmSafekeepingPlaceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText2#mmSafekeepingPlaceType
	 * SafekeepingPlaceTypeAndText2.mmSafekeepingPlaceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText1#mmSafekeepingPlaceType
	 * SafekeepingPlaceTypeAndText1.mmSafekeepingPlaceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText6#mmSafekeepingPlaceType
	 * SafekeepingPlaceTypeAndText6.mmSafekeepingPlaceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText8#mmSafekeepingPlaceType
	 * SafekeepingPlaceTypeAndText8.mmSafekeepingPlaceType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place of safekeeping."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SafekeepingPlace, SafekeepingPlaceCode> mmSafekeepingPlaceType = new MMBusinessAttribute<SafekeepingPlace, SafekeepingPlaceCode>() {
		{
			derivation_lazy = () -> Arrays.asList(SafekeepingPlaceTypeAndAnyBICIdentifier1.mmSafekeepingPlaceType, SafekeepingPlaceTypeAndText2.mmSafekeepingPlaceType, SafekeepingPlaceTypeAndText1.mmSafekeepingPlaceType,
					SafekeepingPlaceTypeAndText6.mmSafekeepingPlaceType, SafekeepingPlaceTypeAndText8.mmSafekeepingPlaceType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SafekeepingPlaceType";
			definition = "Place of safekeeping.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SafekeepingPlaceCode.mmObject();
		}

		@Override
		public SafekeepingPlaceCode getValue(SafekeepingPlace obj) {
			return obj.getSafekeepingPlaceType();
		}

		@Override
		public void setValue(SafekeepingPlace obj, SafekeepingPlaceCode value) {
			obj.setSafekeepingPlaceType(value);
		}
	};
	protected Country country;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmCountryForSafekeepingPlace
	 * Country.mmCountryForSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat2Choice#mmCountry
	 * SafekeepingPlaceFormat2Choice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat7Choice#mmCountry
	 * SafekeepingPlaceFormat7Choice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat8Choice#mmCountry
	 * SafekeepingPlaceFormat8Choice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat10Choice#mmCountry
	 * SafekeepingPlaceFormat10Choice.mmCountry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country where the financial instruments are/will be safekept."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SafekeepingPlace, com.tools20022.repository.entity.Country> mmCountry = new MMBusinessAssociationEnd<SafekeepingPlace, com.tools20022.repository.entity.Country>() {
		{
			derivation_lazy = () -> Arrays.asList(SafekeepingPlaceFormat2Choice.mmCountry, SafekeepingPlaceFormat7Choice.mmCountry, SafekeepingPlaceFormat8Choice.mmCountry, SafekeepingPlaceFormat10Choice.mmCountry);
			isDerived = true;
			elementContext_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Country where the financial instruments are/will be safekept.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Country.mmCountryForSafekeepingPlace;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.Country getValue(SafekeepingPlace obj) {
			return obj.getCountry();
		}

		@Override
		public void setValue(SafekeepingPlace obj, com.tools20022.repository.entity.Country value) {
			obj.setCountry(value);
		}
	};
	protected SecuritiesAccount relatedSecuritiesAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSafekeepingPlace
	 * SecuritiesAccount.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account at the safekeeping place where financial instruments are safekept."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SafekeepingPlace, com.tools20022.repository.entity.SecuritiesAccount> mmRelatedSecuritiesAccount = new MMBusinessAssociationEnd<SafekeepingPlace, com.tools20022.repository.entity.SecuritiesAccount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesAccount";
			definition = "Account at the safekeeping place where financial instruments are safekept.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmSafekeepingPlace;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.SecuritiesAccount getValue(SafekeepingPlace obj) {
			return obj.getRelatedSecuritiesAccount();
		}

		@Override
		public void setValue(SafekeepingPlace obj, com.tools20022.repository.entity.SecuritiesAccount value) {
			obj.setRelatedSecuritiesAccount(value);
		}
	};
	protected SecuritiesBalance securitiesBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSafekeepingPlace
	 * SecuritiesBalance.mmSafekeepingPlace}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance which is held at a safekeeping place."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SafekeepingPlace, Optional<SecuritiesBalance>> mmSecuritiesBalance = new MMBusinessAssociationEnd<SafekeepingPlace, Optional<SecuritiesBalance>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBalance";
			definition = "Balance which is held at a safekeeping place.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmSafekeepingPlace;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}

		@Override
		public Optional<SecuritiesBalance> getValue(SafekeepingPlace obj) {
			return obj.getSecuritiesBalance();
		}

		@Override
		public void setValue(SafekeepingPlace obj, Optional<SecuritiesBalance> value) {
			obj.setSecuritiesBalance(value.orElse(null));
		}
	};
	protected SecuritiesSettlement securitiesSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmRequestedSafekeepingPlace
	 * SecuritiesSettlement.mmRequestedSafekeepingPlace}</li>
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the settlement operation which uses the safekeeping place."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SafekeepingPlace, com.tools20022.repository.entity.SecuritiesSettlement> mmSecuritiesSettlement = new MMBusinessAssociationEnd<SafekeepingPlace, com.tools20022.repository.entity.SecuritiesSettlement>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Specifies the settlement operation which uses the safekeeping place.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmRequestedSafekeepingPlace;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.SecuritiesSettlement getValue(SafekeepingPlace obj) {
			return obj.getSecuritiesSettlement();
		}

		@Override
		public void setValue(SafekeepingPlace obj, com.tools20022.repository.entity.SecuritiesSettlement value) {
			obj.setSecuritiesSettlement(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SafekeepingPlace";
				definition = "Organisation used as the safekeeping place for the securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.mmCountryForSafekeepingPlace, com.tools20022.repository.entity.SecuritiesAccount.mmSafekeepingPlace,
						com.tools20022.repository.entity.SecuritiesSettlement.mmRequestedSafekeepingPlace, com.tools20022.repository.entity.SecuritiesBalance.mmSafekeepingPlace);
				derivationElement_lazy = () -> Arrays.asList(SafekeepingPlaceFormat2Choice.mmIdentification, SafekeepingPlaceFormat2Choice.mmTypeAndIdentification, SafekeepingPlaceFormatChoice.mmIdentification,
						AggregateBalancePerSafekeepingPlace4.mmSafekeepingPlace, AggregateBalanceInformation3.mmSafekeepingPlace, AggregateBalancePerSafekeepingPlace3.mmSafekeepingPlace, AggregateBalanceInformation4.mmSafekeepingPlace,
						FinancialInstrumentDescription3.mmSafekeepingPlace, SafekeepingPlaceFormat7Choice.mmIdentification, SafekeepingPlaceFormat7Choice.mmTypeAndIdentification, HoldingBalance8.mmSafekeepingPlace,
						HoldingBalance7.mmSafekeepingPlace, AggregateBalanceInformation30.mmSafekeepingPlace, QuantityAndAccount40.mmSafekeepingPlace, QuantityAndAccount38.mmSafekeepingPlace,
						AggregateBalanceInformation31.mmSafekeepingPlace, AggregateBalancePerSafekeepingPlace28.mmSafekeepingPlace, AggregateBalancePerSafekeepingPlace29.mmSafekeepingPlace, SafekeepingPlaceFormat8Choice.mmIdentification,
						SafekeepingPlaceFormat8Choice.mmTypeAndIdentification, SafekeepingPlaceFormat10Choice.mmIdentification, SafekeepingPlaceFormat10Choice.mmTypeAndIdentification, AccountAndBalance34.mmSafekeepingPlace,
						AccountAndBalance35.mmSafekeepingPlace, AccountAndBalance33.mmSafekeepingPlace, OtherCollateral7.mmSafekeepingPlace, OtherCollateral6.mmSafekeepingPlace, SecuritiesCollateral6.mmSafekeepingPlace,
						SecuritiesCollateral5.mmSafekeepingPlace, OtherCollateral5.mmSafekeepingPlace, SecuritiesCollateral7.mmSafekeepingPlace, SecuritiesFinancingTransactionDetails35.mmSafekeepingPlace,
						SecuritiesCollateral8.mmSafekeepingPlace, InvestmentAccount66.mmSafekeepingPlace, InvestmentAccount67.mmSafekeepingPlace, InvestmentAccount68.mmSafekeepingPlace, FinancialInstrumentDetails28.mmSafekeepingPlace,
						QuantityAndAccount64.mmSafekeepingPlace, TransactionDetails105.mmSafekeepingPlace, QuantityAndAccount63.mmSafekeepingPlace, TransactionDetails104.mmSafekeepingPlace, TransactionDetails103.mmSafekeepingPlace,
						IntraPositionDetails45.mmSafekeepingPlace, QuantityAndAccount65.mmSafekeepingPlace, QuantityAndAccount66.mmSafekeepingPlace, QuantityAndAccount67.mmSafekeepingPlace, QuantityAndAccount68.mmSafekeepingPlace,
						CorporateActionOption141.mmSafekeepingPlace, AccountIdentification43.mmSafekeepingPlace, SecuritiesOption64.mmSafekeepingPlace, SecuritiesOption65.mmSafekeepingPlace);
				superType_lazy = () -> SecuritiesPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SafekeepingPlace.mmSafekeepingPlaceType, com.tools20022.repository.entity.SafekeepingPlace.mmCountry,
						com.tools20022.repository.entity.SafekeepingPlace.mmRelatedSecuritiesAccount, com.tools20022.repository.entity.SafekeepingPlace.mmSecuritiesBalance,
						com.tools20022.repository.entity.SafekeepingPlace.mmSecuritiesSettlement);
				derivationComponent_lazy = () -> Arrays.asList(SafekeepingPlaceTypeAndAnyBICIdentifier1.mmObject(), SafekeepingPlaceTypeAndText2.mmObject(), SafekeepingPlaceFormat2Choice.mmObject(),
						SafekeepingPlaceAsCodeAndPartyIdentification.mmObject(), SafekeepingPlaceFormatChoice.mmObject(), SafekeepingPlaceTypeAndText1.mmObject(), SafekeepingPlaceFormat7Choice.mmObject(),
						SafekeepingPlaceFormat8Choice.mmObject(), SafekeepingPlaceTypeAndText6.mmObject(), SafekeepingPlaceFormat10Choice.mmObject(), SafekeepingPlaceTypeAndText8.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SafekeepingPlace.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SafekeepingPlaceCode getSafekeepingPlaceType() {
		return safekeepingPlaceType;
	}

	public SafekeepingPlace setSafekeepingPlaceType(SafekeepingPlaceCode safekeepingPlaceType) {
		this.safekeepingPlaceType = Objects.requireNonNull(safekeepingPlaceType);
		return this;
	}

	public Country getCountry() {
		return country;
	}

	public SafekeepingPlace setCountry(com.tools20022.repository.entity.Country country) {
		this.country = Objects.requireNonNull(country);
		return this;
	}

	public SecuritiesAccount getRelatedSecuritiesAccount() {
		return relatedSecuritiesAccount;
	}

	public SafekeepingPlace setRelatedSecuritiesAccount(com.tools20022.repository.entity.SecuritiesAccount relatedSecuritiesAccount) {
		this.relatedSecuritiesAccount = Objects.requireNonNull(relatedSecuritiesAccount);
		return this;
	}

	public Optional<SecuritiesBalance> getSecuritiesBalance() {
		return securitiesBalance == null ? Optional.empty() : Optional.of(securitiesBalance);
	}

	public SafekeepingPlace setSecuritiesBalance(com.tools20022.repository.entity.SecuritiesBalance securitiesBalance) {
		this.securitiesBalance = securitiesBalance;
		return this;
	}

	public SecuritiesSettlement getSecuritiesSettlement() {
		return securitiesSettlement;
	}

	public SafekeepingPlace setSecuritiesSettlement(com.tools20022.repository.entity.SecuritiesSettlement securitiesSettlement) {
		this.securitiesSettlement = Objects.requireNonNull(securitiesSettlement);
		return this;
	}
}