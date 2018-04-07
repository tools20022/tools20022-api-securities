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
import com.tools20022.repository.choice.LotteryType1FormatChoice;
import com.tools20022.repository.choice.LotteryTypeFormat4Choice;
import com.tools20022.repository.codeset.LotteryTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.SecuritiesQuantity;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * The parameters required to manage the organisation of a lottery.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Lottery" src="doc-files/Lottery.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Lottery#mmLotteryDate
 * Lottery.mmLotteryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Lottery#mmIncrementalDenomination
 * Lottery.mmIncrementalDenomination}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Lottery#mmLotteryType
 * Lottery.mmLotteryType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Lottery#mmRelatedCorporateEvent
 * Lottery.mmRelatedCorporateEvent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmLottery
 * SecuritiesQuantity.mmLottery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmLottery
 * CorporateActionEvent.mmLottery}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.LotteryType1FormatChoice
 * LotteryType1FormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.LotteryTypeFormat4Choice
 * LotteryTypeFormat4Choice}</li>
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
 * "Lottery"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The parameters required to manage the organisation of a lottery."</li>
 * </ul>
 */
public class Lottery {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime lotteryDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmLotteryDate
	 * CorporateActionDate2.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmLotteryDate
	 * CorporateActionDate61.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate63#mmLotteryDate
	 * CorporateActionDate63.mmLotteryDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Lottery
	 * Lottery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotteryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the lottery is run and applied to the holder's positions. This is also applicable to partial calls."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Lottery, ISODateTime> mmLotteryDate = new MMBusinessAttribute<Lottery, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate2.mmLotteryDate, CorporateActionDate61.mmLotteryDate, CorporateActionDate63.mmLotteryDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Lottery.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LotteryDate";
			definition = "Date on which the lottery is run and applied to the holder's positions. This is also applicable to partial calls.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Lottery obj) {
			return obj.getLotteryDate();
		}

		@Override
		public void setValue(Lottery obj, ISODateTime value) {
			obj.setLotteryDate(value);
		}
	};
	protected SecuritiesQuantity incrementalDenomination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmLottery
	 * SecuritiesQuantity.mmLottery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmIncrementalDenomination
	 * CorporateAction2.mmIncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity7#mmIncrementalDenomination
	 * CorporateActionQuantity7.mmIncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity9#mmIncrementalDenomination
	 * CorporateActionQuantity9.mmIncrementalDenomination}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Lottery
	 * Lottery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncrementalDenomination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount used when the called amount is not met by running the lottery with the base denomination."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Lottery, SecuritiesQuantity> mmIncrementalDenomination = new MMBusinessAssociationEnd<Lottery, SecuritiesQuantity>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateAction2.mmIncrementalDenomination, CorporateActionQuantity7.mmIncrementalDenomination, CorporateActionQuantity9.mmIncrementalDenomination);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Lottery.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncrementalDenomination";
			definition = "Amount used when the called amount is not met by running the lottery with the base denomination.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuantity.mmLottery;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public SecuritiesQuantity getValue(Lottery obj) {
			return obj.getIncrementalDenomination();
		}

		@Override
		public void setValue(Lottery obj, SecuritiesQuantity value) {
			obj.setIncrementalDenomination(value);
		}
	};
	protected LotteryTypeCode lotteryType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LotteryTypeCode
	 * LotteryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryType1FormatChoice#mmCode
	 * LotteryType1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryType1FormatChoice#mmProprietary
	 * LotteryType1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmLotteryType
	 * CorporateAction2.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat4Choice#mmCode
	 * LotteryTypeFormat4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat4Choice#mmProprietary
	 * LotteryTypeFormat4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmLotteryType
	 * CorporateAction41.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction43#mmLotteryType
	 * CorporateAction43.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction42#mmLotteryType
	 * CorporateAction42.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction44#mmLotteryType
	 * CorporateAction44.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction45#mmLotteryType
	 * CorporateAction45.mmLotteryType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Lottery
	 * Lottery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotteryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of lottery announced."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Lottery, LotteryTypeCode> mmLotteryType = new MMBusinessAttribute<Lottery, LotteryTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(LotteryType1FormatChoice.mmCode, LotteryType1FormatChoice.mmProprietary, CorporateAction2.mmLotteryType, LotteryTypeFormat4Choice.mmCode, LotteryTypeFormat4Choice.mmProprietary,
					CorporateAction41.mmLotteryType, CorporateAction43.mmLotteryType, CorporateAction42.mmLotteryType, CorporateAction44.mmLotteryType, CorporateAction45.mmLotteryType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Lottery.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LotteryType";
			definition = "Specifies the type of lottery announced.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LotteryTypeCode.mmObject();
		}

		@Override
		public LotteryTypeCode getValue(Lottery obj) {
			return obj.getLotteryType();
		}

		@Override
		public void setValue(Lottery obj, LotteryTypeCode value) {
			obj.setLotteryType(value);
		}
	};
	protected CorporateActionEvent relatedCorporateEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmLottery
	 * CorporateActionEvent.mmLottery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Lottery
	 * Lottery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which lottery information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Lottery, Optional<CorporateActionEvent>> mmRelatedCorporateEvent = new MMBusinessAssociationEnd<Lottery, Optional<CorporateActionEvent>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Lottery.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateEvent";
			definition = "Corporate event for which lottery information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionEvent.mmLottery;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}

		@Override
		public Optional<CorporateActionEvent> getValue(Lottery obj) {
			return obj.getRelatedCorporateEvent();
		}

		@Override
		public void setValue(Lottery obj, Optional<CorporateActionEvent> value) {
			obj.setRelatedCorporateEvent(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Lottery";
				definition = "The parameters required to manage the organisation of a lottery.";
				associationDomain_lazy = () -> Arrays.asList(SecuritiesQuantity.mmLottery, CorporateActionEvent.mmLottery);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Lottery.mmLotteryDate, com.tools20022.repository.entity.Lottery.mmIncrementalDenomination, com.tools20022.repository.entity.Lottery.mmLotteryType,
						com.tools20022.repository.entity.Lottery.mmRelatedCorporateEvent);
				derivationComponent_lazy = () -> Arrays.asList(LotteryType1FormatChoice.mmObject(), LotteryTypeFormat4Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Lottery.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getLotteryDate() {
		return lotteryDate;
	}

	public Lottery setLotteryDate(ISODateTime lotteryDate) {
		this.lotteryDate = Objects.requireNonNull(lotteryDate);
		return this;
	}

	public SecuritiesQuantity getIncrementalDenomination() {
		return incrementalDenomination;
	}

	public Lottery setIncrementalDenomination(SecuritiesQuantity incrementalDenomination) {
		this.incrementalDenomination = Objects.requireNonNull(incrementalDenomination);
		return this;
	}

	public LotteryTypeCode getLotteryType() {
		return lotteryType;
	}

	public Lottery setLotteryType(LotteryTypeCode lotteryType) {
		this.lotteryType = Objects.requireNonNull(lotteryType);
		return this;
	}

	public Optional<CorporateActionEvent> getRelatedCorporateEvent() {
		return relatedCorporateEvent == null ? Optional.empty() : Optional.of(relatedCorporateEvent);
	}

	public Lottery setRelatedCorporateEvent(CorporateActionEvent relatedCorporateEvent) {
		this.relatedCorporateEvent = relatedCorporateEvent;
		return this;
	}
}