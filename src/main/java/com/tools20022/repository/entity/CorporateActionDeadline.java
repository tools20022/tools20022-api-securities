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

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.entity.Deadline;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Time constraints for processing corporate actions.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionDeadline"
 * src="doc-files/CorporateActionDeadline.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Deadline Deadline}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmRevocabilityPeriod
 * CorporateActionDeadline.mmRevocabilityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmProtectDate
 * CorporateActionDeadline.mmProtectDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmTradingSuspendedDate
 * CorporateActionDeadline.mmTradingSuspendedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmThirdPartyDeadline
 * CorporateActionDeadline.mmThirdPartyDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmCertificationDeadline
 * CorporateActionDeadline.mmCertificationDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmDeadlineToSplit
 * CorporateActionDeadline.mmDeadlineToSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmSpecialExDate
 * CorporateActionDeadline.mmSpecialExDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmDeadlineForTaxBreakdownInstruction
 * CorporateActionDeadline.mmDeadlineForTaxBreakdownInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmEarlyClosingDate
 * CorporateActionDeadline.mmEarlyClosingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmRecordDate
 * CorporateActionDeadline.mmRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmCoverExpirationDate
 * CorporateActionDeadline.mmCoverExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmElectionToCounterpartyDeadline
 * CorporateActionDeadline.mmElectionToCounterpartyDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmExpiryDate
 * CorporateActionDeadline.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmEarlyThirdPartyDeadline
 * CorporateActionDeadline.mmEarlyThirdPartyDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmDepositoryCoverExpirationDate
 * CorporateActionDeadline.mmDepositoryCoverExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmResponseDeadline
 * CorporateActionDeadline.mmResponseDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmConsentExpirationDate
 * CorporateActionDeadline.mmConsentExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmRegistrationDeadline
 * CorporateActionDeadline.mmRegistrationDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmStockLendingDeadline
 * CorporateActionDeadline.mmStockLendingDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmConsentRecordDate
 * CorporateActionDeadline.mmConsentRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmEarlyResponseDeadline
 * CorporateActionDeadline.mmEarlyResponseDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmGuaranteedParticipationDate
 * CorporateActionDeadline.mmGuaranteedParticipationDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BorrowerLendingDeadline3
 * BorrowerLendingDeadline3}</li>
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
 * "CorporateActionDeadline"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Time constraints for processing corporate actions."</li>
 * </ul>
 */
public class CorporateActionDeadline extends Deadline {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected DateTimePeriod revocabilityPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod2#mmRevocabilityPeriod
	 * CorporateActionPeriod2.mmRevocabilityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod12#mmRevocabilityPeriod
	 * CorporateActionPeriod12.mmRevocabilityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod12#mmAccountServicerRevocabilityPeriod
	 * CorporateActionPeriod12.mmAccountServicerRevocabilityPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the shareholder can revoke, change or withdraw its instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDeadline, DateTimePeriod> mmRevocabilityPeriod = new MMBusinessAttribute<CorporateActionDeadline, DateTimePeriod>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPeriod2.mmRevocabilityPeriod, CorporateActionPeriod12.mmRevocabilityPeriod, CorporateActionPeriod12.mmAccountServicerRevocabilityPeriod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RevocabilityPeriod";
			definition = "Period during which the shareholder can revoke, change or withdraw its instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(CorporateActionDeadline obj) {
			return obj.getRevocabilityPeriod();
		}

		@Override
		public void setValue(CorporateActionDeadline obj, DateTimePeriod value) {
			obj.setRevocabilityPeriod(value);
		}
	};
	protected ISODateTime protectDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmProtectDate
	 * CorporateActionDate2.mmProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate60#mmProtectDate
	 * CorporateActionDate60.mmProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate64#mmProtectDate
	 * CorporateActionDate64.mmProtectDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last date a holder can request to defer delivery of securities pursuant to a notice of guaranteed delivery or other required documentation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDeadline, ISODateTime> mmProtectDate = new MMBusinessAttribute<CorporateActionDeadline, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate2.mmProtectDate, CorporateActionDate60.mmProtectDate, CorporateActionDate64.mmProtectDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProtectDate";
			definition = "Last date a holder can request to defer delivery of securities pursuant to a notice of guaranteed delivery or other required documentation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionDeadline obj) {
			return obj.getProtectDate();
		}

		@Override
		public void setValue(CorporateActionDeadline obj, ISODateTime value) {
			obj.setProtectDate(value);
		}
	};
	protected ISODateTime tradingSuspendedDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmTradingSuspendedDate
	 * CorporateActionDate2.mmTradingSuspendedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmTradingSuspendedDate
	 * CorporateActionDate61.mmTradingSuspendedDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSuspendedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which trading of a security is suspended as the result of an event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDeadline, ISODateTime> mmTradingSuspendedDate = new MMBusinessAttribute<CorporateActionDeadline, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate2.mmTradingSuspendedDate, CorporateActionDate61.mmTradingSuspendedDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingSuspendedDate";
			definition = "Date on which trading of a security is suspended as the result of an event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionDeadline obj) {
			return obj.getTradingSuspendedDate();
		}

		@Override
		public void setValue(CorporateActionDeadline obj, ISODateTime value) {
			obj.setTradingSuspendedDate(value);
		}
	};
	protected ISODateTime thirdPartyDeadline;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmThirdPartyDeadline
	 * CorporateActionDate61.mmThirdPartyDeadline}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdPartyDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/Time by which the account owner must instruct directly another party, for example to provide documentation to an issuer agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDeadline, ISODateTime> mmThirdPartyDeadline = new MMBusinessAttribute<CorporateActionDeadline, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate61.mmThirdPartyDeadline);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ThirdPartyDeadline";
			definition = "Date/Time by which the account owner must instruct directly another party, for example to provide documentation to an issuer agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionDeadline obj) {
			return obj.getThirdPartyDeadline();
		}

		@Override
		public void setValue(CorporateActionDeadline obj, ISODateTime value) {
			obj.setThirdPartyDeadline(value);
		}
	};
	protected ISODateTime certificationDeadline;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmCertificationDeadline
	 * CorporateActionDate2.mmCertificationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmCertificationDeadline
	 * CorporateActionDate61.mmCertificationDeadline}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deadline by which the beneficial ownership of securities must be declared."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDeadline, ISODateTime> mmCertificationDeadline = new MMBusinessAttribute<CorporateActionDeadline, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate2.mmCertificationDeadline, CorporateActionDate61.mmCertificationDeadline);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertificationDeadline";
			definition = "Deadline by which the beneficial ownership of securities must be declared.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionDeadline obj) {
			return obj.getCertificationDeadline();
		}

		@Override
		public void setValue(CorporateActionDeadline obj, ISODateTime value) {
			obj.setCertificationDeadline(value);
		}
	};
	protected ISODateTime deadlineToSplit;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#mmDeadlineToSplit
	 * CorporateActionDate4.mmDeadlineToSplit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmDeadlineToSplit
	 * CorporateActionDate61.mmDeadlineToSplit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeadlineToSplit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deadline by which instructions must be received to split securities, that is, of physical certificates."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDeadline, ISODateTime> mmDeadlineToSplit = new MMBusinessAttribute<CorporateActionDeadline, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate4.mmDeadlineToSplit, CorporateActionDate61.mmDeadlineToSplit);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeadlineToSplit";
			definition = "Deadline by which instructions must be received to split securities, that is, of physical certificates.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionDeadline obj) {
			return obj.getDeadlineToSplit();
		}

		@Override
		public void setValue(CorporateActionDeadline obj, ISODateTime value) {
			obj.setDeadlineToSplit(value);
		}
	};
	protected ISODateTime specialExDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmSpecialExDate
	 * CorporateActionDate2.mmSpecialExDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmSpecialExDate
	 * CorporateActionDate61.mmSpecialExDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialExDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time as from which 'special processing' can start to be used by participants for that event. Special processing is a means of marking a transaction, that would normally be traded ex or cum, as being traded cum or ex respectively,  for example, a transaction dealt 'special' after the ex date would result in the buyer being eligible for the entitlement. This is typically used in the UK and Irish markets."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDeadline, ISODateTime> mmSpecialExDate = new MMBusinessAttribute<CorporateActionDeadline, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate2.mmSpecialExDate, CorporateActionDate61.mmSpecialExDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialExDate";
			definition = "Date/time as from which 'special processing' can start to be used by participants for that event. Special processing is a means of marking a transaction, that would normally be traded ex or cum, as being traded cum or ex respectively,  for example, a transaction dealt 'special' after the ex date would result in the buyer being eligible for the entitlement. This is typically used in the UK and Irish markets.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionDeadline obj) {
			return obj.getSpecialExDate();
		}

		@Override
		public void setValue(CorporateActionDeadline obj, ISODateTime value) {
			obj.setSpecialExDate(value);
		}
	};
	protected ISODateTime deadlineForTaxBreakdownInstruction;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmDeadlineForTaxBreakdownInstruction
	 * CorporateActionDate2.mmDeadlineForTaxBreakdownInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmDeadlineForTaxBreakdownInstruction
	 * CorporateActionDate61.mmDeadlineForTaxBreakdownInstruction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeadlineForTaxBreakdownInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date until which tax breakdown instructions will be accepted."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDeadline, ISODateTime> mmDeadlineForTaxBreakdownInstruction = new MMBusinessAttribute<CorporateActionDeadline, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate2.mmDeadlineForTaxBreakdownInstruction, CorporateActionDate61.mmDeadlineForTaxBreakdownInstruction);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeadlineForTaxBreakdownInstruction";
			definition = "Date until which tax breakdown instructions will be accepted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionDeadline obj) {
			return obj.getDeadlineForTaxBreakdownInstruction();
		}

		@Override
		public void setValue(CorporateActionDeadline obj, ISODateTime value) {
			obj.setDeadlineForTaxBreakdownInstruction(value);
		}
	};
	protected ISODateTime earlyClosingDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmEarlyClosingDate
	 * CorporateActionDate2.mmEarlyClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmEarlyClosingDate
	 * CorporateActionDate61.mmEarlyClosingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlyClosingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "First possible early closing date of an offer if different from the expiry date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDeadline, ISODateTime> mmEarlyClosingDate = new MMBusinessAttribute<CorporateActionDeadline, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate2.mmEarlyClosingDate, CorporateActionDate61.mmEarlyClosingDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EarlyClosingDate";
			definition = "First possible early closing date of an offer if different from the expiry date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionDeadline obj) {
			return obj.getEarlyClosingDate();
		}

		@Override
		public void setValue(CorporateActionDeadline obj, ISODateTime value) {
			obj.setEarlyClosingDate(value);
		}
	};
	protected ISODateTime recordDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmRecordDate
	 * CorporateActionDate2.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAdvice1#mmRecordDate
	 * EntitlementAdvice1.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1#mmRecordDate
	 * GlobalDistributionRequest1.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate59#mmRecordDate
	 * CorporateActionDate59.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmRecordDate
	 * CorporateActionDate61.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate63#mmRecordDate
	 * CorporateActionDate63.mmRecordDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecordDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the positions are struck to note which parties will receive the entitlement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDeadline, ISODateTime> mmRecordDate = new MMBusinessAttribute<CorporateActionDeadline, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate2.mmRecordDate, EntitlementAdvice1.mmRecordDate, GlobalDistributionRequest1.mmRecordDate, CorporateActionDate59.mmRecordDate, CorporateActionDate61.mmRecordDate,
					CorporateActionDate63.mmRecordDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RecordDate";
			definition = "Date at which the positions are struck to note which parties will receive the entitlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionDeadline obj) {
			return obj.getRecordDate();
		}

		@Override
		public void setValue(CorporateActionDeadline obj, ISODateTime value) {
			obj.setRecordDate(value);
		}
	};
	protected ISODateTime coverExpirationDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmCoverExpirationDate
	 * CorporateActionDate2.mmCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate60#mmCoverExpirationDate
	 * CorporateActionDate60.mmCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate64#mmCoverExpirationDate
	 * CorporateActionDate64.mmCoverExpirationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last day a holder can deliver the securities that it had previously protected."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDeadline, ISODateTime> mmCoverExpirationDate = new MMBusinessAttribute<CorporateActionDeadline, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate2.mmCoverExpirationDate, CorporateActionDate60.mmCoverExpirationDate, CorporateActionDate64.mmCoverExpirationDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CoverExpirationDate";
			definition = "Last day a holder can deliver the securities that it had previously protected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionDeadline obj) {
			return obj.getCoverExpirationDate();
		}

		@Override
		public void setValue(CorporateActionDeadline obj, ISODateTime value) {
			obj.setCoverExpirationDate(value);
		}
	};
	protected ISODateTime electionToCounterpartyDeadline;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmElectionToCounterpartyDeadline
	 * CorporateActionDate2.mmElectionToCounterpartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmElectionToCounterpartyMarketDeadline
	 * CorporateActionDate61.mmElectionToCounterpartyMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmElectionToCounterpartyResponseDeadline
	 * CorporateActionDate61.mmElectionToCounterpartyResponseDeadline}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectionToCounterpartyDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deadline by which an entitled holder needs to advise their counterparty to a transaction of their election for a corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDeadline, ISODateTime> mmElectionToCounterpartyDeadline = new MMBusinessAttribute<CorporateActionDeadline, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate2.mmElectionToCounterpartyDeadline, CorporateActionDate61.mmElectionToCounterpartyMarketDeadline, CorporateActionDate61.mmElectionToCounterpartyResponseDeadline);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ElectionToCounterpartyDeadline";
			definition = "Deadline by which an entitled holder needs to advise their counterparty to a transaction of their election for a corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionDeadline obj) {
			return obj.getElectionToCounterpartyDeadline();
		}

		@Override
		public void setValue(CorporateActionDeadline obj, ISODateTime value) {
			obj.setElectionToCounterpartyDeadline(value);
		}
	};
	protected ISODateTime expiryDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#mmExpiryDate
	 * CorporateActionDate4.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate60#mmExpiryDate
	 * CorporateActionDate60.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate64#mmExpiryDate
	 * CorporateActionDate64.mmExpiryDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the offer terminates."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDeadline, ISODateTime> mmExpiryDate = new MMBusinessAttribute<CorporateActionDeadline, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate4.mmExpiryDate, CorporateActionDate60.mmExpiryDate, CorporateActionDate64.mmExpiryDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpiryDate";
			definition = "Date on which the offer terminates.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionDeadline obj) {
			return obj.getExpiryDate();
		}

		@Override
		public void setValue(CorporateActionDeadline obj, ISODateTime value) {
			obj.setExpiryDate(value);
		}
	};
	protected ISODateTime earlyThirdPartyDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlyThirdPartyDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/Time set by the issuer agent as a first early deadline by which the account owner must instruct directly another party, possibly giving the holder eligibility to incentives. For example, to provide documentation to an issuer agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDeadline, ISODateTime> mmEarlyThirdPartyDeadline = new MMBusinessAttribute<CorporateActionDeadline, ISODateTime>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EarlyThirdPartyDeadline";
			definition = "Date/Time set by the issuer agent as a first early deadline by which the account owner must instruct directly another party, possibly giving the holder eligibility to incentives. For example, to provide documentation to an issuer agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionDeadline obj) {
			return obj.getEarlyThirdPartyDeadline();
		}

		@Override
		public void setValue(CorporateActionDeadline obj, ISODateTime value) {
			obj.setEarlyThirdPartyDeadline(value);
		}
	};
	protected ISODateTime depositoryCoverExpirationDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate64#mmDepositoryCoverExpirationDate
	 * CorporateActionDate64.mmDepositoryCoverExpirationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryCoverExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The last date/tiime that a participant of the depository can deliver securities that it had elected on and/or previously protected."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDeadline, ISODateTime> mmDepositoryCoverExpirationDate = new MMBusinessAttribute<CorporateActionDeadline, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate64.mmDepositoryCoverExpirationDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepositoryCoverExpirationDate";
			definition = "The last date/tiime that a participant of the depository can deliver securities that it had elected on and/or previously protected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionDeadline obj) {
			return obj.getDepositoryCoverExpirationDate();
		}

		@Override
		public void setValue(CorporateActionDeadline obj, ISODateTime value) {
			obj.setDepositoryCoverExpirationDate(value);
		}
	};
	protected ISODateTime responseDeadline;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#mmResponseDeadline
	 * CorporateActionDate4.mmResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventDeadlines1#mmResponseDeadline
	 * CorporateActionEventDeadlines1.mmResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate60#mmResponseDeadline
	 * CorporateActionDate60.mmResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate64#mmResponseDeadline
	 * CorporateActionDate64.mmResponseDeadline}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the account servicer has set as the deadline to respond, with instructions, to an outstanding event. This time is dependent on the reference time zone of the account servicer as specified in an SLA."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDeadline, ISODateTime> mmResponseDeadline = new MMBusinessAttribute<CorporateActionDeadline, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate4.mmResponseDeadline, CorporateActionEventDeadlines1.mmResponseDeadline, CorporateActionDate60.mmResponseDeadline, CorporateActionDate64.mmResponseDeadline);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResponseDeadline";
			definition = "Date on which the account servicer has set as the deadline to respond, with instructions, to an outstanding event. This time is dependent on the reference time zone of the account servicer as specified in an SLA.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionDeadline obj) {
			return obj.getResponseDeadline();
		}

		@Override
		public void setValue(CorporateActionDeadline obj, ISODateTime value) {
			obj.setResponseDeadline(value);
		}
	};
	protected ISODateTime consentExpirationDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#mmConsentExpirationDate
	 * CorporateActionDate4.mmConsentExpirationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last date on which a holder can consent to the changes sought by the corporation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDeadline, ISODateTime> mmConsentExpirationDate = new MMBusinessAttribute<CorporateActionDeadline, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate4.mmConsentExpirationDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConsentExpirationDate";
			definition = "Last date on which a holder can consent to the changes sought by the corporation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionDeadline obj) {
			return obj.getConsentExpirationDate();
		}

		@Override
		public void setValue(CorporateActionDeadline obj, ISODateTime value) {
			obj.setConsentExpirationDate(value);
		}
	};
	protected ISODateTime registrationDeadline;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmRegistrationDeadline
	 * CorporateActionDate2.mmRegistrationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmRegistrationDeadline
	 * CorporateActionDate61.mmRegistrationDeadline}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which instructions to register or registration details will be accepted."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDeadline, ISODateTime> mmRegistrationDeadline = new MMBusinessAttribute<CorporateActionDeadline, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate2.mmRegistrationDeadline, CorporateActionDate61.mmRegistrationDeadline);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationDeadline";
			definition = "Date on which instructions to register or registration details will be accepted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionDeadline obj) {
			return obj.getRegistrationDeadline();
		}

		@Override
		public void setValue(CorporateActionDeadline obj, ISODateTime value) {
			obj.setRegistrationDeadline(value);
		}
	};
	protected ISODateTime stockLendingDeadline;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate64#mmStockLendingDeadline
	 * CorporateActionDate64.mmStockLendingDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BorrowerLendingDeadline3#mmStockLendingDeadline
	 * BorrowerLendingDeadline3.mmStockLendingDeadline}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockLendingDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date or date and time that the account servicer has set as the deadline to respond with instructions to an event for which the underlying security is out on loan. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDeadline, ISODateTime> mmStockLendingDeadline = new MMBusinessAttribute<CorporateActionDeadline, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate64.mmStockLendingDeadline, BorrowerLendingDeadline3.mmStockLendingDeadline);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StockLendingDeadline";
			definition = "Date or date and time that the account servicer has set as the deadline to respond with instructions to an event for which the underlying security is out on loan. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionDeadline obj) {
			return obj.getStockLendingDeadline();
		}

		@Override
		public void setValue(CorporateActionDeadline obj, ISODateTime value) {
			obj.setStockLendingDeadline(value);
		}
	};
	protected ISODateTime consentRecordDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#mmConsentRecordDate
	 * CorporateActionDate4.mmConsentRecordDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentRecordDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date used by the offeror to determine the beneficiary eligible to participate in a consent based on the registered owner of the securities, eg, beneficial owner of consent record. The consent record date qualifier is used to indicate that a record date only applies to a certain part of the offer, not the entire offer.\r\nThe consent record date is used to indicate that a record date only applies to a certain part of the offer, not the entire offer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDeadline, ISODateTime> mmConsentRecordDate = new MMBusinessAttribute<CorporateActionDeadline, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate4.mmConsentRecordDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConsentRecordDate";
			definition = "Date used by the offeror to determine the beneficiary eligible to participate in a consent based on the registered owner of the securities, eg, beneficial owner of consent record. The consent record date qualifier is used to indicate that a record date only applies to a certain part of the offer, not the entire offer.\r\nThe consent record date is used to indicate that a record date only applies to a certain part of the offer, not the entire offer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionDeadline obj) {
			return obj.getConsentRecordDate();
		}

		@Override
		public void setValue(CorporateActionDeadline obj, ISODateTime value) {
			obj.setConsentRecordDate(value);
		}
	};
	protected ISODateTime earlyResponseDeadline;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventDeadlines1#mmEarlyResponseDeadline
	 * CorporateActionEventDeadlines1.mmEarlyResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmEarlyThirdPartyDeadline
	 * CorporateActionDate61.mmEarlyThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate64#mmEarlyResponseDeadline
	 * CorporateActionDate64.mmEarlyResponseDeadline}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlyResponseDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time that the account servicer has set as the deadline to respond, with instructions, to an outstanding event, giving the holder eligibility to incentives. This time is dependent on the reference time zone of the account servicer as specified in an SLA."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDeadline, ISODateTime> mmEarlyResponseDeadline = new MMBusinessAttribute<CorporateActionDeadline, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionEventDeadlines1.mmEarlyResponseDeadline, CorporateActionDate61.mmEarlyThirdPartyDeadline, CorporateActionDate64.mmEarlyResponseDeadline);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EarlyResponseDeadline";
			definition = "Date/time that the account servicer has set as the deadline to respond, with instructions, to an outstanding event, giving the holder eligibility to incentives. This time is dependent on the reference time zone of the account servicer as specified in an SLA.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionDeadline obj) {
			return obj.getEarlyResponseDeadline();
		}

		@Override
		public void setValue(CorporateActionDeadline obj, ISODateTime value) {
			obj.setEarlyResponseDeadline(value);
		}
	};
	protected ISODateTime guaranteedParticipationDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmGuaranteedParticipationDate
	 * CorporateActionDate2.mmGuaranteedParticipationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmGuaranteedParticipationDate
	 * CorporateActionDate61.mmGuaranteedParticipationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteedParticipationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last date/time by which a buying counterparty to a trade can be sure that it will have the right to participate in an event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDeadline, ISODateTime> mmGuaranteedParticipationDate = new MMBusinessAttribute<CorporateActionDeadline, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate2.mmGuaranteedParticipationDate, CorporateActionDate61.mmGuaranteedParticipationDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GuaranteedParticipationDate";
			definition = "Last date/time by which a buying counterparty to a trade can be sure that it will have the right to participate in an event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionDeadline obj) {
			return obj.getGuaranteedParticipationDate();
		}

		@Override
		public void setValue(CorporateActionDeadline obj, ISODateTime value) {
			obj.setGuaranteedParticipationDate(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionDeadline";
				definition = "Time constraints for processing corporate actions.";
				superType_lazy = () -> Deadline.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionDeadline.mmRevocabilityPeriod, com.tools20022.repository.entity.CorporateActionDeadline.mmProtectDate,
						com.tools20022.repository.entity.CorporateActionDeadline.mmTradingSuspendedDate, com.tools20022.repository.entity.CorporateActionDeadline.mmThirdPartyDeadline,
						com.tools20022.repository.entity.CorporateActionDeadline.mmCertificationDeadline, com.tools20022.repository.entity.CorporateActionDeadline.mmDeadlineToSplit,
						com.tools20022.repository.entity.CorporateActionDeadline.mmSpecialExDate, com.tools20022.repository.entity.CorporateActionDeadline.mmDeadlineForTaxBreakdownInstruction,
						com.tools20022.repository.entity.CorporateActionDeadline.mmEarlyClosingDate, com.tools20022.repository.entity.CorporateActionDeadline.mmRecordDate,
						com.tools20022.repository.entity.CorporateActionDeadline.mmCoverExpirationDate, com.tools20022.repository.entity.CorporateActionDeadline.mmElectionToCounterpartyDeadline,
						com.tools20022.repository.entity.CorporateActionDeadline.mmExpiryDate, com.tools20022.repository.entity.CorporateActionDeadline.mmEarlyThirdPartyDeadline,
						com.tools20022.repository.entity.CorporateActionDeadline.mmDepositoryCoverExpirationDate, com.tools20022.repository.entity.CorporateActionDeadline.mmResponseDeadline,
						com.tools20022.repository.entity.CorporateActionDeadline.mmConsentExpirationDate, com.tools20022.repository.entity.CorporateActionDeadline.mmRegistrationDeadline,
						com.tools20022.repository.entity.CorporateActionDeadline.mmStockLendingDeadline, com.tools20022.repository.entity.CorporateActionDeadline.mmConsentRecordDate,
						com.tools20022.repository.entity.CorporateActionDeadline.mmEarlyResponseDeadline, com.tools20022.repository.entity.CorporateActionDeadline.mmGuaranteedParticipationDate);
				derivationComponent_lazy = () -> Arrays.asList(BorrowerLendingDeadline3.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionDeadline.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DateTimePeriod getRevocabilityPeriod() {
		return revocabilityPeriod;
	}

	public CorporateActionDeadline setRevocabilityPeriod(DateTimePeriod revocabilityPeriod) {
		this.revocabilityPeriod = Objects.requireNonNull(revocabilityPeriod);
		return this;
	}

	public ISODateTime getProtectDate() {
		return protectDate;
	}

	public CorporateActionDeadline setProtectDate(ISODateTime protectDate) {
		this.protectDate = Objects.requireNonNull(protectDate);
		return this;
	}

	public ISODateTime getTradingSuspendedDate() {
		return tradingSuspendedDate;
	}

	public CorporateActionDeadline setTradingSuspendedDate(ISODateTime tradingSuspendedDate) {
		this.tradingSuspendedDate = Objects.requireNonNull(tradingSuspendedDate);
		return this;
	}

	public ISODateTime getThirdPartyDeadline() {
		return thirdPartyDeadline;
	}

	public CorporateActionDeadline setThirdPartyDeadline(ISODateTime thirdPartyDeadline) {
		this.thirdPartyDeadline = Objects.requireNonNull(thirdPartyDeadline);
		return this;
	}

	public ISODateTime getCertificationDeadline() {
		return certificationDeadline;
	}

	public CorporateActionDeadline setCertificationDeadline(ISODateTime certificationDeadline) {
		this.certificationDeadline = Objects.requireNonNull(certificationDeadline);
		return this;
	}

	public ISODateTime getDeadlineToSplit() {
		return deadlineToSplit;
	}

	public CorporateActionDeadline setDeadlineToSplit(ISODateTime deadlineToSplit) {
		this.deadlineToSplit = Objects.requireNonNull(deadlineToSplit);
		return this;
	}

	public ISODateTime getSpecialExDate() {
		return specialExDate;
	}

	public CorporateActionDeadline setSpecialExDate(ISODateTime specialExDate) {
		this.specialExDate = Objects.requireNonNull(specialExDate);
		return this;
	}

	public ISODateTime getDeadlineForTaxBreakdownInstruction() {
		return deadlineForTaxBreakdownInstruction;
	}

	public CorporateActionDeadline setDeadlineForTaxBreakdownInstruction(ISODateTime deadlineForTaxBreakdownInstruction) {
		this.deadlineForTaxBreakdownInstruction = Objects.requireNonNull(deadlineForTaxBreakdownInstruction);
		return this;
	}

	public ISODateTime getEarlyClosingDate() {
		return earlyClosingDate;
	}

	public CorporateActionDeadline setEarlyClosingDate(ISODateTime earlyClosingDate) {
		this.earlyClosingDate = Objects.requireNonNull(earlyClosingDate);
		return this;
	}

	public ISODateTime getRecordDate() {
		return recordDate;
	}

	public CorporateActionDeadline setRecordDate(ISODateTime recordDate) {
		this.recordDate = Objects.requireNonNull(recordDate);
		return this;
	}

	public ISODateTime getCoverExpirationDate() {
		return coverExpirationDate;
	}

	public CorporateActionDeadline setCoverExpirationDate(ISODateTime coverExpirationDate) {
		this.coverExpirationDate = Objects.requireNonNull(coverExpirationDate);
		return this;
	}

	public ISODateTime getElectionToCounterpartyDeadline() {
		return electionToCounterpartyDeadline;
	}

	public CorporateActionDeadline setElectionToCounterpartyDeadline(ISODateTime electionToCounterpartyDeadline) {
		this.electionToCounterpartyDeadline = Objects.requireNonNull(electionToCounterpartyDeadline);
		return this;
	}

	public ISODateTime getExpiryDate() {
		return expiryDate;
	}

	public CorporateActionDeadline setExpiryDate(ISODateTime expiryDate) {
		this.expiryDate = Objects.requireNonNull(expiryDate);
		return this;
	}

	public ISODateTime getEarlyThirdPartyDeadline() {
		return earlyThirdPartyDeadline;
	}

	public CorporateActionDeadline setEarlyThirdPartyDeadline(ISODateTime earlyThirdPartyDeadline) {
		this.earlyThirdPartyDeadline = Objects.requireNonNull(earlyThirdPartyDeadline);
		return this;
	}

	public ISODateTime getDepositoryCoverExpirationDate() {
		return depositoryCoverExpirationDate;
	}

	public CorporateActionDeadline setDepositoryCoverExpirationDate(ISODateTime depositoryCoverExpirationDate) {
		this.depositoryCoverExpirationDate = Objects.requireNonNull(depositoryCoverExpirationDate);
		return this;
	}

	public ISODateTime getResponseDeadline() {
		return responseDeadline;
	}

	public CorporateActionDeadline setResponseDeadline(ISODateTime responseDeadline) {
		this.responseDeadline = Objects.requireNonNull(responseDeadline);
		return this;
	}

	public ISODateTime getConsentExpirationDate() {
		return consentExpirationDate;
	}

	public CorporateActionDeadline setConsentExpirationDate(ISODateTime consentExpirationDate) {
		this.consentExpirationDate = Objects.requireNonNull(consentExpirationDate);
		return this;
	}

	public ISODateTime getRegistrationDeadline() {
		return registrationDeadline;
	}

	public CorporateActionDeadline setRegistrationDeadline(ISODateTime registrationDeadline) {
		this.registrationDeadline = Objects.requireNonNull(registrationDeadline);
		return this;
	}

	public ISODateTime getStockLendingDeadline() {
		return stockLendingDeadline;
	}

	public CorporateActionDeadline setStockLendingDeadline(ISODateTime stockLendingDeadline) {
		this.stockLendingDeadline = Objects.requireNonNull(stockLendingDeadline);
		return this;
	}

	public ISODateTime getConsentRecordDate() {
		return consentRecordDate;
	}

	public CorporateActionDeadline setConsentRecordDate(ISODateTime consentRecordDate) {
		this.consentRecordDate = Objects.requireNonNull(consentRecordDate);
		return this;
	}

	public ISODateTime getEarlyResponseDeadline() {
		return earlyResponseDeadline;
	}

	public CorporateActionDeadline setEarlyResponseDeadline(ISODateTime earlyResponseDeadline) {
		this.earlyResponseDeadline = Objects.requireNonNull(earlyResponseDeadline);
		return this;
	}

	public ISODateTime getGuaranteedParticipationDate() {
		return guaranteedParticipationDate;
	}

	public CorporateActionDeadline setGuaranteedParticipationDate(ISODateTime guaranteedParticipationDate) {
		this.guaranteedParticipationDate = Objects.requireNonNull(guaranteedParticipationDate);
		return this;
	}
}