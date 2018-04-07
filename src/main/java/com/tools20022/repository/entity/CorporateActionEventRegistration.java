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
import com.tools20022.repository.choice.CorporateActionEventReference3Choice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Specifies the official date and identification of the event.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionEventRegistration"
 * src="doc-files/CorporateActionEventRegistration.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmCorporateActionEventIdentification
 * CorporateActionEventRegistration.mmCorporateActionEventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmOfficialCorporateActionEventIdentification
 * CorporateActionEventRegistration.mmOfficialCorporateActionEventIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmOfficialAnnouncementPublicationDate
 * CorporateActionEventRegistration.mmOfficialAnnouncementPublicationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmCorporateActionEvent
 * CorporateActionEventRegistration.mmCorporateActionEvent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionEventRegistration
 * CorporateActionEvent.mmCorporateActionEventRegistration}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionEventReference3
 * CorporateActionEventReference3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference3Choice
 * CorporateActionEventReference3Choice}</li>
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
 * "CorporateActionEventRegistration"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the official date and identification of the event."</li>
 * </ul>
 */
public class CorporateActionEventRegistration {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text corporateActionEventIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation2#mmIssuerCorporateActionIdentification
	 * CorporateActionInformation2.mmIssuerCorporateActionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation2#mmCorporateActionProcessingIdentification
	 * CorporateActionInformation2.mmCorporateActionProcessingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1#mmIssuerCorporateActionIdentification
	 * CorporateActionInformation1.mmIssuerCorporateActionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1#mmCorporateActionProcessingIdentification
	 * CorporateActionInformation1.mmCorporateActionProcessingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification19#mmCorporateActionEventIdentification
	 * SettlementTypeAndIdentification19.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters21#mmCorporateActionEventIdentification
	 * AdditionalParameters21.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters14#mmCorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters14.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#mmCorporateActionEventIdentification
	 * Identification15.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters13#mmCorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters13.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation92#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation92.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference3#mmEventIdentification
	 * CorporateActionEventReference3.mmEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference3Choice#mmLinkedCorporateActionIdentification
	 * CorporateActionEventReference3Choice.
	 * mmLinkedCorporateActionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation109#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation109.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation110#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation110.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation107#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation107.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters19#mmCorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters19.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16#mmCorporateActionEventIdentification
	 * TransactionTypeAndAdditionalParameters16.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmCorporateActionEventIdentification
	 * SecuritiesFinancingTransactionDetails35.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails105#mmCorporateActionEventIdentification
	 * TransactionDetails105.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction60#mmCorporateActionEventIdentification
	 * Transaction60.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction61#mmCorporateActionEventIdentification
	 * Transaction61.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction62#mmCorporateActionEventIdentification
	 * Transaction62.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation127#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation127.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation126#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation126.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation125#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation125.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation124#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation124.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation128#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation128.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation11#mmCorporateActionEventIdentification
	 * EventInformation11.mmCorporateActionEventIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration
	 * CorporateActionEventRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification given to the event."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEventRegistration, Max35Text> mmCorporateActionEventIdentification = new MMBusinessAttribute<CorporateActionEventRegistration, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionInformation2.mmIssuerCorporateActionIdentification, CorporateActionInformation2.mmCorporateActionProcessingIdentification,
					CorporateActionInformation1.mmIssuerCorporateActionIdentification, CorporateActionInformation1.mmCorporateActionProcessingIdentification, SettlementTypeAndIdentification19.mmCorporateActionEventIdentification,
					AdditionalParameters21.mmCorporateActionEventIdentification, SettlementTypeAndAdditionalParameters14.mmCorporateActionEventIdentification, Identification15.mmCorporateActionEventIdentification,
					SettlementTypeAndAdditionalParameters13.mmCorporateActionEventIdentification, CorporateActionGeneralInformation92.mmCorporateActionEventIdentification, CorporateActionEventReference3.mmEventIdentification,
					CorporateActionEventReference3Choice.mmLinkedCorporateActionIdentification, CorporateActionGeneralInformation109.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation110.mmCorporateActionEventIdentification, CorporateActionGeneralInformation107.mmCorporateActionEventIdentification,
					SettlementTypeAndAdditionalParameters19.mmCorporateActionEventIdentification, TransactionTypeAndAdditionalParameters16.mmCorporateActionEventIdentification,
					SecuritiesFinancingTransactionDetails35.mmCorporateActionEventIdentification, TransactionDetails105.mmCorporateActionEventIdentification, Transaction60.mmCorporateActionEventIdentification,
					Transaction61.mmCorporateActionEventIdentification, Transaction62.mmCorporateActionEventIdentification, CorporateActionGeneralInformation127.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation126.mmCorporateActionEventIdentification, CorporateActionGeneralInformation125.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation124.mmCorporateActionEventIdentification, CorporateActionGeneralInformation128.mmCorporateActionEventIdentification, EventInformation11.mmCorporateActionEventIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEventRegistration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEventIdentification";
			definition = "Identification given to the event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CorporateActionEventRegistration obj) {
			return obj.getCorporateActionEventIdentification();
		}

		@Override
		public void setValue(CorporateActionEventRegistration obj, Max35Text value) {
			obj.setCorporateActionEventIdentification(value);
		}
	};
	protected Max35Text officialCorporateActionEventIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation92#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation92.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference3Choice#mmLinkedOfficialCorporateActionEventIdentification
	 * CorporateActionEventReference3Choice.
	 * mmLinkedOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation109#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation109.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation110#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation110.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation107#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation107.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation127#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation127.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation126#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation126.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation125#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation125.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation124#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation124.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation128#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation128.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation11#mmOfficialCorporateActionEventIdentification
	 * EventInformation11.mmOfficialCorporateActionEventIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration
	 * CorporateActionEventRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a corporate action assigned by an official central body/entity within a given market."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEventRegistration, Max35Text> mmOfficialCorporateActionEventIdentification = new MMBusinessAttribute<CorporateActionEventRegistration, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionGeneralInformation92.mmOfficialCorporateActionEventIdentification, CorporateActionEventReference3Choice.mmLinkedOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation109.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation110.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation107.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation127.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation126.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation125.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation124.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation128.mmOfficialCorporateActionEventIdentification,
					EventInformation11.mmOfficialCorporateActionEventIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEventRegistration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfficialCorporateActionEventIdentification";
			definition = "Identification of a corporate action assigned by an official central body/entity within a given market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CorporateActionEventRegistration obj) {
			return obj.getOfficialCorporateActionEventIdentification();
		}

		@Override
		public void setValue(CorporateActionEventRegistration obj, Max35Text value) {
			obj.setOfficialCorporateActionEventIdentification(value);
		}
	};
	protected ISODateTime officialAnnouncementPublicationDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification1#mmOfficialAnnouncementPublicationDate
	 * CorporateActionNotification1.mmOfficialAnnouncementPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmOfficialAnnouncementPublicationDate
	 * CorporateActionDate61.mmOfficialAnnouncementPublicationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration
	 * CorporateActionEventRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialAnnouncementPublicationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the corporate action is legally announced by an official body, for example, publication by a governmental administration."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEventRegistration, ISODateTime> mmOfficialAnnouncementPublicationDate = new MMBusinessAttribute<CorporateActionEventRegistration, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionNotification1.mmOfficialAnnouncementPublicationDate, CorporateActionDate61.mmOfficialAnnouncementPublicationDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEventRegistration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfficialAnnouncementPublicationDate";
			definition = "Date/time at which the corporate action is legally announced by an official body, for example, publication by a governmental administration.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionEventRegistration obj) {
			return obj.getOfficialAnnouncementPublicationDate();
		}

		@Override
		public void setValue(CorporateActionEventRegistration obj, ISODateTime value) {
			obj.setOfficialAnnouncementPublicationDate(value);
		}
	};
	protected CorporateActionEvent corporateActionEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionEventRegistration
	 * CorporateActionEvent.mmCorporateActionEventRegistration}</li>
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration
	 * CorporateActionEventRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate event for which a registration is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEventRegistration, Optional<CorporateActionEvent>> mmCorporateActionEvent = new MMBusinessAssociationEnd<CorporateActionEventRegistration, Optional<CorporateActionEvent>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEventRegistration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEvent";
			definition = "Corporate event for which a registration is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionEvent.mmCorporateActionEventRegistration;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}

		@Override
		public Optional<CorporateActionEvent> getValue(CorporateActionEventRegistration obj) {
			return obj.getCorporateActionEvent();
		}

		@Override
		public void setValue(CorporateActionEventRegistration obj, Optional<CorporateActionEvent> value) {
			obj.setCorporateActionEvent(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventRegistration";
				definition = "Specifies the official date and identification of the event.";
				associationDomain_lazy = () -> Arrays.asList(CorporateActionEvent.mmCorporateActionEventRegistration);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionEventRegistration.mmCorporateActionEventIdentification,
						com.tools20022.repository.entity.CorporateActionEventRegistration.mmOfficialCorporateActionEventIdentification,
						com.tools20022.repository.entity.CorporateActionEventRegistration.mmOfficialAnnouncementPublicationDate, com.tools20022.repository.entity.CorporateActionEventRegistration.mmCorporateActionEvent);
				derivationComponent_lazy = () -> Arrays.asList(CorporateActionEventReference3.mmObject(), CorporateActionEventReference3Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionEventRegistration.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getCorporateActionEventIdentification() {
		return corporateActionEventIdentification;
	}

	public CorporateActionEventRegistration setCorporateActionEventIdentification(Max35Text corporateActionEventIdentification) {
		this.corporateActionEventIdentification = Objects.requireNonNull(corporateActionEventIdentification);
		return this;
	}

	public Max35Text getOfficialCorporateActionEventIdentification() {
		return officialCorporateActionEventIdentification;
	}

	public CorporateActionEventRegistration setOfficialCorporateActionEventIdentification(Max35Text officialCorporateActionEventIdentification) {
		this.officialCorporateActionEventIdentification = Objects.requireNonNull(officialCorporateActionEventIdentification);
		return this;
	}

	public ISODateTime getOfficialAnnouncementPublicationDate() {
		return officialAnnouncementPublicationDate;
	}

	public CorporateActionEventRegistration setOfficialAnnouncementPublicationDate(ISODateTime officialAnnouncementPublicationDate) {
		this.officialAnnouncementPublicationDate = Objects.requireNonNull(officialAnnouncementPublicationDate);
		return this;
	}

	public Optional<CorporateActionEvent> getCorporateActionEvent() {
		return corporateActionEvent == null ? Optional.empty() : Optional.of(corporateActionEvent);
	}

	public CorporateActionEventRegistration setCorporateActionEvent(CorporateActionEvent corporateActionEvent) {
		this.corporateActionEvent = corporateActionEvent;
		return this;
	}
}