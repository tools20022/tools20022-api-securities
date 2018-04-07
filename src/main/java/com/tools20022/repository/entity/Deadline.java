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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.Meeting;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Specifies the different deadlines available for the different processes
 * related to corporate action processes.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Deadline" src="doc-files/Deadline.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Deadline#mmRelatedCorporateActionEvent
 * Deadline.mmRelatedCorporateActionEvent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Deadline#mmMarketDeadline
 * Deadline.mmMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Deadline#mmIntermediaryDeadline
 * Deadline.mmIntermediaryDeadline}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Deadline#mmSTPDeadline
 * Deadline.mmSTPDeadline}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Deadline#mmRelatedMeeting
 * Deadline.mmRelatedMeeting}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmDeadline
 * CorporateActionEvent.mmDeadline}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmDeadline
 * Meeting.mmDeadline}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate64#mmBorrowerStockLendingDeadline
 * CorporateActionDate64.mmBorrowerStockLendingDeadline}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesBlockingDeadline
 * SecuritiesBlockingDeadline}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CorporateActionDeadline
 * CorporateActionDeadline}</li>
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
 * "Deadline"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the different deadlines available for the different processes related to corporate action processes."
 * </li>
 * </ul>
 */
public class Deadline {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionEvent relatedCorporateActionEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmDeadline
	 * CorporateActionEvent.mmDeadline}</li>
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Deadline
	 * Deadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateActionEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Related corporate action event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Deadline, Optional<CorporateActionEvent>> mmRelatedCorporateActionEvent = new MMBusinessAssociationEnd<Deadline, Optional<CorporateActionEvent>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Deadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionEvent";
			definition = "Related corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionEvent.mmDeadline;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}

		@Override
		public Optional<CorporateActionEvent> getValue(Deadline obj) {
			return obj.getRelatedCorporateActionEvent();
		}

		@Override
		public void setValue(Deadline obj, Optional<CorporateActionEvent> value) {
			obj.setRelatedCorporateActionEvent(value.orElse(null));
		}
	};
	protected ISODateTime marketDeadline;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#mmMarketDeadline
	 * CorporateActionDate4.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmSecuritiesBlockingMarketDeadline
	 * EntitlementAssessment3.mmSecuritiesBlockingMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmRegistrationSecuritiesMarketDeadline
	 * EntitlementAssessment3.mmRegistrationSecuritiesMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmRegistrationParticipationMarketDeadline
	 * EntitlementAssessment3.mmRegistrationParticipationMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmVoteMarketDeadline
	 * VoteParameters4.mmVoteMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmRevocabilityMarketDeadline
	 * VoteParameters4.mmRevocabilityMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmVoteWithPremiumMarketDeadline
	 * VoteParameters4.mmVoteWithPremiumMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmAttendanceConfirmationMarketDeadline
	 * MeetingNotice4.mmAttendanceConfirmationMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation3#mmMarketDeadline
	 * ProxyAppointmentInformation3.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalRights2#mmAdditionalRightMarketDeadline
	 * AdditionalRights2.mmAdditionalRightMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventDeadlines1#mmMarketDeadline
	 * CorporateActionEventDeadlines1.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate60#mmMarketDeadline
	 * CorporateActionDate60.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate64#mmMarketDeadline
	 * CorporateActionDate64.mmMarketDeadline}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Deadline
	 * Deadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the action should have been completed.  This deadline is set by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Deadline, ISODateTime> mmMarketDeadline = new MMBusinessAttribute<Deadline, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate4.mmMarketDeadline, EntitlementAssessment3.mmSecuritiesBlockingMarketDeadline, EntitlementAssessment3.mmRegistrationSecuritiesMarketDeadline,
					EntitlementAssessment3.mmRegistrationParticipationMarketDeadline, VoteParameters4.mmVoteMarketDeadline, VoteParameters4.mmRevocabilityMarketDeadline, VoteParameters4.mmVoteWithPremiumMarketDeadline,
					MeetingNotice4.mmAttendanceConfirmationMarketDeadline, ProxyAppointmentInformation3.mmMarketDeadline, AdditionalRights2.mmAdditionalRightMarketDeadline, CorporateActionEventDeadlines1.mmMarketDeadline,
					CorporateActionDate60.mmMarketDeadline, CorporateActionDate64.mmMarketDeadline);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Deadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketDeadline";
			definition = "Date by which the action should have been completed.  This deadline is set by the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Deadline obj) {
			return obj.getMarketDeadline();
		}

		@Override
		public void setValue(Deadline obj, ISODateTime value) {
			obj.setMarketDeadline(value);
		}
	};
	protected ISODateTime intermediaryDeadline;
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
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmSecuritiesBlockingDeadline
	 * EntitlementAssessment3.mmSecuritiesBlockingDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmRegistrationSecuritiesDeadline
	 * EntitlementAssessment3.mmRegistrationSecuritiesDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmRegistrationParticipationDeadline
	 * EntitlementAssessment3.mmRegistrationParticipationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmVoteDeadline
	 * VoteParameters4.mmVoteDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmRevocabilityDeadline
	 * VoteParameters4.mmRevocabilityDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmEarlyVoteWithPremiumDeadline
	 * VoteParameters4.mmEarlyVoteWithPremiumDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmVoteWithPremiumDeadline
	 * VoteParameters4.mmVoteWithPremiumDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmAttendanceConfirmationDeadline
	 * MeetingNotice4.mmAttendanceConfirmationDeadline}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Deadline
	 * Deadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the action should have been completed. This deadline is set by an intermediary."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Deadline, ISODateTime> mmIntermediaryDeadline = new MMBusinessAttribute<Deadline, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(EntitlementAssessment3.mmSecuritiesBlockingDeadline, EntitlementAssessment3.mmRegistrationSecuritiesDeadline, EntitlementAssessment3.mmRegistrationParticipationDeadline,
					VoteParameters4.mmVoteDeadline, VoteParameters4.mmRevocabilityDeadline, VoteParameters4.mmEarlyVoteWithPremiumDeadline, VoteParameters4.mmVoteWithPremiumDeadline, MeetingNotice4.mmAttendanceConfirmationDeadline);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Deadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediaryDeadline";
			definition = "Date by which the action should have been completed. This deadline is set by an intermediary.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Deadline obj) {
			return obj.getIntermediaryDeadline();
		}

		@Override
		public void setValue(Deadline obj, ISODateTime value) {
			obj.setIntermediaryDeadline(value);
		}
	};
	protected ISODateTime sTPDeadline;
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
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmSecuritiesBlockingSTPDeadline
	 * EntitlementAssessment3.mmSecuritiesBlockingSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmRegistrationSecuritiesSTPDeadline
	 * EntitlementAssessment3.mmRegistrationSecuritiesSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmRegistrationParticipationSTPDeadline
	 * EntitlementAssessment3.mmRegistrationParticipationSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmVoteSTPDeadline
	 * VoteParameters4.mmVoteSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmRevocabilitySTPDeadline
	 * VoteParameters4.mmRevocabilitySTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmVoteWithPremiumSTPDeadline
	 * VoteParameters4.mmVoteWithPremiumSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmAttendanceConfirmationSTPDeadline
	 * MeetingNotice4.mmAttendanceConfirmationSTPDeadline}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Deadline
	 * Deadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "STPDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the action should have been completed. This deadline is set by the issuer. (STP or Electronic mode)"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Deadline, ISODateTime> mmSTPDeadline = new MMBusinessAttribute<Deadline, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(EntitlementAssessment3.mmSecuritiesBlockingSTPDeadline, EntitlementAssessment3.mmRegistrationSecuritiesSTPDeadline, EntitlementAssessment3.mmRegistrationParticipationSTPDeadline,
					VoteParameters4.mmVoteSTPDeadline, VoteParameters4.mmRevocabilitySTPDeadline, VoteParameters4.mmVoteWithPremiumSTPDeadline, MeetingNotice4.mmAttendanceConfirmationSTPDeadline);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Deadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "STPDeadline";
			definition = "Date by which the action should have been completed. This deadline is set by the issuer. (STP or Electronic mode)";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Deadline obj) {
			return obj.getSTPDeadline();
		}

		@Override
		public void setValue(Deadline obj, ISODateTime value) {
			obj.setSTPDeadline(value);
		}
	};
	protected Meeting relatedMeeting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmDeadline
	 * Meeting.mmDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Deadline
	 * Deadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMeeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting for which deadlines are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Deadline, Optional<Meeting>> mmRelatedMeeting = new MMBusinessAssociationEnd<Deadline, Optional<Meeting>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Deadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedMeeting";
			definition = "Meeting for which deadlines are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Meeting.mmDeadline;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Meeting.mmObject();
		}

		@Override
		public Optional<Meeting> getValue(Deadline obj) {
			return obj.getRelatedMeeting();
		}

		@Override
		public void setValue(Deadline obj, Optional<Meeting> value) {
			obj.setRelatedMeeting(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Deadline";
				definition = "Specifies the different deadlines available for the different processes related to corporate action processes.";
				associationDomain_lazy = () -> Arrays.asList(CorporateActionEvent.mmDeadline, Meeting.mmDeadline);
				derivationElement_lazy = () -> Arrays.asList(CorporateActionDate64.mmBorrowerStockLendingDeadline);
				subType_lazy = () -> Arrays.asList(SecuritiesBlockingDeadline.mmObject(), CorporateActionDeadline.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Deadline.mmRelatedCorporateActionEvent, com.tools20022.repository.entity.Deadline.mmMarketDeadline,
						com.tools20022.repository.entity.Deadline.mmIntermediaryDeadline, com.tools20022.repository.entity.Deadline.mmSTPDeadline, com.tools20022.repository.entity.Deadline.mmRelatedMeeting);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Deadline.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CorporateActionEvent> getRelatedCorporateActionEvent() {
		return relatedCorporateActionEvent == null ? Optional.empty() : Optional.of(relatedCorporateActionEvent);
	}

	public Deadline setRelatedCorporateActionEvent(CorporateActionEvent relatedCorporateActionEvent) {
		this.relatedCorporateActionEvent = relatedCorporateActionEvent;
		return this;
	}

	public ISODateTime getMarketDeadline() {
		return marketDeadline;
	}

	public Deadline setMarketDeadline(ISODateTime marketDeadline) {
		this.marketDeadline = Objects.requireNonNull(marketDeadline);
		return this;
	}

	public ISODateTime getIntermediaryDeadline() {
		return intermediaryDeadline;
	}

	public Deadline setIntermediaryDeadline(ISODateTime intermediaryDeadline) {
		this.intermediaryDeadline = Objects.requireNonNull(intermediaryDeadline);
		return this;
	}

	public ISODateTime getSTPDeadline() {
		return sTPDeadline;
	}

	public Deadline setSTPDeadline(ISODateTime sTPDeadline) {
		this.sTPDeadline = Objects.requireNonNull(sTPDeadline);
		return this;
	}

	public Optional<Meeting> getRelatedMeeting() {
		return relatedMeeting == null ? Optional.empty() : Optional.of(relatedMeeting);
	}

	public Deadline setRelatedMeeting(Meeting relatedMeeting) {
		this.relatedMeeting = relatedMeeting;
		return this;
	}
}