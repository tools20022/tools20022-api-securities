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
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	 * Identification given to the event.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation111#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation111.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation112#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation112.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation110#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation110.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation105#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation105.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation107#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation107.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation106#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation106.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation108#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation108.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation9#mmCorporateActionEventIdentification
	 * EventInformation9.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters19#mmCorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters19.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#mmCorporateActionEventIdentification
	 * Transaction53.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmCorporateActionEventIdentification
	 * TransactionDetails97.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16#mmCorporateActionEventIdentification
	 * TransactionTypeAndAdditionalParameters16.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmCorporateActionEventIdentification
	 * SecuritiesFinancingTransactionDetails35.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#mmCorporateActionEventIdentification
	 * Transaction54.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#mmCorporateActionEventIdentification
	 * Transaction52.mmCorporateActionEventIdentification}</li>
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
	public static final MMBusinessAttribute mmCorporateActionEventIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionInformation2.mmIssuerCorporateActionIdentification, CorporateActionInformation2.mmCorporateActionProcessingIdentification,
					CorporateActionInformation1.mmIssuerCorporateActionIdentification, CorporateActionInformation1.mmCorporateActionProcessingIdentification, SettlementTypeAndIdentification19.mmCorporateActionEventIdentification,
					AdditionalParameters21.mmCorporateActionEventIdentification, SettlementTypeAndAdditionalParameters14.mmCorporateActionEventIdentification, Identification15.mmCorporateActionEventIdentification,
					SettlementTypeAndAdditionalParameters13.mmCorporateActionEventIdentification, CorporateActionGeneralInformation92.mmCorporateActionEventIdentification, CorporateActionEventReference3.mmEventIdentification,
					CorporateActionEventReference3Choice.mmLinkedCorporateActionIdentification, CorporateActionGeneralInformation109.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation111.mmCorporateActionEventIdentification, CorporateActionGeneralInformation112.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation110.mmCorporateActionEventIdentification, CorporateActionGeneralInformation105.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation107.mmCorporateActionEventIdentification, CorporateActionGeneralInformation106.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation108.mmCorporateActionEventIdentification, EventInformation9.mmCorporateActionEventIdentification, SettlementTypeAndAdditionalParameters19.mmCorporateActionEventIdentification,
					Transaction53.mmCorporateActionEventIdentification, TransactionDetails97.mmCorporateActionEventIdentification, TransactionTypeAndAdditionalParameters16.mmCorporateActionEventIdentification,
					SecuritiesFinancingTransactionDetails35.mmCorporateActionEventIdentification, Transaction54.mmCorporateActionEventIdentification, Transaction52.mmCorporateActionEventIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEventRegistration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEventIdentification";
			definition = "Identification given to the event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionEventRegistration.class.getMethod("getCorporateActionEventIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text officialCorporateActionEventIdentification;
	/**
	 * Identification of a corporate action assigned by an official central
	 * body/entity within a given market.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation111#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation111.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation112#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation112.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation110#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation110.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation105#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation105.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation107#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation107.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation106#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation106.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation108#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation108.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation9#mmOfficialCorporateActionEventIdentification
	 * EventInformation9.mmOfficialCorporateActionEventIdentification}</li>
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
	public static final MMBusinessAttribute mmOfficialCorporateActionEventIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionGeneralInformation92.mmOfficialCorporateActionEventIdentification, CorporateActionEventReference3Choice.mmLinkedOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation109.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation111.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation112.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation110.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation105.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation107.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation106.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation108.mmOfficialCorporateActionEventIdentification,
					EventInformation9.mmOfficialCorporateActionEventIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEventRegistration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfficialCorporateActionEventIdentification";
			definition = "Identification of a corporate action assigned by an official central body/entity within a given market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionEventRegistration.class.getMethod("getOfficialCorporateActionEventIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime officialAnnouncementPublicationDate;
	/**
	 * Date/time at which the corporate action is legally announced by an
	 * official body, for example, publication by a governmental administration.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmOfficialAnnouncementPublicationDate
	 * CorporateActionDate44.mmOfficialAnnouncementPublicationDate}</li>
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
	public static final MMBusinessAttribute mmOfficialAnnouncementPublicationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionNotification1.mmOfficialAnnouncementPublicationDate, CorporateActionDate44.mmOfficialAnnouncementPublicationDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEventRegistration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfficialAnnouncementPublicationDate";
			definition = "Date/time at which the corporate action is legally announced by an official body, for example, publication by a governmental administration.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionEventRegistration.class.getMethod("getOfficialAnnouncementPublicationDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionEvent corporateActionEvent;
	/**
	 * Corporate event for which a registration is specified.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmCorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEventRegistration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEvent";
			definition = "Corporate event for which a registration is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmCorporateActionEventRegistration;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventRegistration";
				definition = "Specifies the official date and identification of the event.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionEvent.mmCorporateActionEventRegistration);
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

	public void setCorporateActionEventIdentification(Max35Text corporateActionEventIdentification) {
		this.corporateActionEventIdentification = corporateActionEventIdentification;
	}

	public Max35Text getOfficialCorporateActionEventIdentification() {
		return officialCorporateActionEventIdentification;
	}

	public void setOfficialCorporateActionEventIdentification(Max35Text officialCorporateActionEventIdentification) {
		this.officialCorporateActionEventIdentification = officialCorporateActionEventIdentification;
	}

	public ISODateTime getOfficialAnnouncementPublicationDate() {
		return officialAnnouncementPublicationDate;
	}

	public void setOfficialAnnouncementPublicationDate(ISODateTime officialAnnouncementPublicationDate) {
		this.officialAnnouncementPublicationDate = officialAnnouncementPublicationDate;
	}

	public CorporateActionEvent getCorporateActionEvent() {
		return corporateActionEvent;
	}

	public void setCorporateActionEvent(com.tools20022.repository.entity.CorporateActionEvent corporateActionEvent) {
		this.corporateActionEvent = corporateActionEvent;
	}
}