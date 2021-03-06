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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.auth.*;
import com.tools20022.repository.choice.Period4Choice;
import com.tools20022.repository.choice.TradingVenueIdentification1Choice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the securities market transaction report related header details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesMarketReportHeader1#mmReportingEntity
 * SecuritiesMarketReportHeader1.mmReportingEntity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesMarketReportHeader1#mmReportingPeriod
 * SecuritiesMarketReportHeader1.mmReportingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesMarketReportHeader1#mmSubmissionDateTime
 * SecuritiesMarketReportHeader1.mmSubmissionDateTime}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingTradingVolumeCapDataReportV01#mmReportHeader
 * FinancialInstrumentReportingTradingVolumeCapDataReportV01.mmReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingNonEquityTradingActivityResultV01#mmReportHeader
 * FinancialInstrumentReportingNonEquityTradingActivityResultV01.mmReportHeader}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingEquityTradingActivityResultV01#mmReportHeader
 * FinancialInstrumentReportingEquityTradingActivityResultV01.mmReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingEquityTransparencyDataReportV01#mmReportHeader
 * FinancialInstrumentReportingEquityTransparencyDataReportV01.mmReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingReferenceDataReportV01#mmReportHeader
 * FinancialInstrumentReportingReferenceDataReportV01.mmReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingNonWorkingDayReportV01#mmReportHeader
 * FinancialInstrumentReportingNonWorkingDayReportV01.mmReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingEquityTradingActivityReportV01#mmReportHeader
 * FinancialInstrumentReportingEquityTradingActivityReportV01.mmReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingReferenceDataIndexReportV01#mmReportHeader
 * FinancialInstrumentReportingReferenceDataIndexReportV01.mmReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingNonEquityTransparencyDataReportV01#mmReportHeader
 * FinancialInstrumentReportingNonEquityTransparencyDataReportV01.mmReportHeader
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingReferenceDataDeltaReportV01#mmReportHeader
 * FinancialInstrumentReportingReferenceDataDeltaReportV01.mmReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingNonEquityTradingActivityReportV01#mmReportHeader
 * FinancialInstrumentReportingNonEquityTradingActivityReportV01.mmReportHeader}
 * </li>
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
 * "SecuritiesMarketReportHeader1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the securities market transaction report related header details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesMarketReportHeader1", propOrder = {"reportingEntity", "reportingPeriod", "submissionDateTime"})
public class SecuritiesMarketReportHeader1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RptgNtty", required = true)
	protected TradingVenueIdentification1Choice reportingEntity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TradingVenueIdentification1Choice
	 * TradingVenueIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesMarketReportHeader1
	 * SecuritiesMarketReportHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgNtty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingEntity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the venue which generates the report."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesMarketReportHeader1, TradingVenueIdentification1Choice> mmReportingEntity = new MMMessageAssociationEnd<SecuritiesMarketReportHeader1, TradingVenueIdentification1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesMarketReportHeader1.mmObject();
			isDerived = false;
			xmlTag = "RptgNtty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingEntity";
			definition = "Identification of the venue which generates the report.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradingVenueIdentification1Choice.mmObject();
		}

		@Override
		public TradingVenueIdentification1Choice getValue(SecuritiesMarketReportHeader1 obj) {
			return obj.getReportingEntity();
		}

		@Override
		public void setValue(SecuritiesMarketReportHeader1 obj, TradingVenueIdentification1Choice value) {
			obj.setReportingEntity(value);
		}
	};
	@XmlElement(name = "RptgPrd", required = true)
	protected Period4Choice reportingPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period4Choice
	 * Period4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesMarketReportHeader1
	 * SecuritiesMarketReportHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date or date range the report relates to."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesMarketReportHeader1, Period4Choice> mmReportingPeriod = new MMMessageAssociationEnd<SecuritiesMarketReportHeader1, Period4Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesMarketReportHeader1.mmObject();
			isDerived = false;
			xmlTag = "RptgPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingPeriod";
			definition = "Date or date range the report relates to.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Period4Choice.mmObject();
		}

		@Override
		public Period4Choice getValue(SecuritiesMarketReportHeader1 obj) {
			return obj.getReportingPeriod();
		}

		@Override
		public void setValue(SecuritiesMarketReportHeader1 obj, Period4Choice value) {
			obj.setReportingPeriod(value);
		}
	};
	@XmlElement(name = "SubmissnDtTm")
	protected ISODateTime submissionDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesMarketReportHeader1
	 * SecuritiesMarketReportHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubmissnDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmissionDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time of the report originally submitted by the reporting entity when the file is generated for submission to their reporting authority."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesMarketReportHeader1, Optional<ISODateTime>> mmSubmissionDateTime = new MMMessageAttribute<SecuritiesMarketReportHeader1, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesMarketReportHeader1.mmObject();
			isDerived = false;
			xmlTag = "SubmissnDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmissionDateTime";
			definition = "Date and time of the report originally submitted by the reporting entity when the file is generated for submission to their reporting authority.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(SecuritiesMarketReportHeader1 obj) {
			return obj.getSubmissionDateTime();
		}

		@Override
		public void setValue(SecuritiesMarketReportHeader1 obj, Optional<ISODateTime> value) {
			obj.setSubmissionDateTime(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesMarketReportHeader1.mmReportingEntity, com.tools20022.repository.msg.SecuritiesMarketReportHeader1.mmReportingPeriod,
						com.tools20022.repository.msg.SecuritiesMarketReportHeader1.mmSubmissionDateTime);
				messageBuildingBlock_lazy = () -> Arrays.asList(FinancialInstrumentReportingTradingVolumeCapDataReportV01.mmReportHeader, FinancialInstrumentReportingNonEquityTradingActivityResultV01.mmReportHeader,
						FinancialInstrumentReportingEquityTradingActivityResultV01.mmReportHeader, FinancialInstrumentReportingEquityTransparencyDataReportV01.mmReportHeader,
						FinancialInstrumentReportingReferenceDataReportV01.mmReportHeader, FinancialInstrumentReportingNonWorkingDayReportV01.mmReportHeader, FinancialInstrumentReportingEquityTradingActivityReportV01.mmReportHeader,
						FinancialInstrumentReportingReferenceDataIndexReportV01.mmReportHeader, FinancialInstrumentReportingNonEquityTransparencyDataReportV01.mmReportHeader,
						FinancialInstrumentReportingReferenceDataDeltaReportV01.mmReportHeader, FinancialInstrumentReportingNonEquityTradingActivityReportV01.mmReportHeader);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesMarketReportHeader1";
				definition = "Provides the securities market transaction report related header details.";
			}
		});
		return mmObject_lazy.get();
	}

	public TradingVenueIdentification1Choice getReportingEntity() {
		return reportingEntity;
	}

	public SecuritiesMarketReportHeader1 setReportingEntity(TradingVenueIdentification1Choice reportingEntity) {
		this.reportingEntity = Objects.requireNonNull(reportingEntity);
		return this;
	}

	public Period4Choice getReportingPeriod() {
		return reportingPeriod;
	}

	public SecuritiesMarketReportHeader1 setReportingPeriod(Period4Choice reportingPeriod) {
		this.reportingPeriod = Objects.requireNonNull(reportingPeriod);
		return this;
	}

	public Optional<ISODateTime> getSubmissionDateTime() {
		return submissionDateTime == null ? Optional.empty() : Optional.of(submissionDateTime);
	}

	public SecuritiesMarketReportHeader1 setSubmissionDateTime(ISODateTime submissionDateTime) {
		this.submissionDateTime = submissionDateTime;
		return this;
	}
}