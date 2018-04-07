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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.Quantity42Choice;
import com.tools20022.repository.choice.TransferReason1Choice;
import com.tools20022.repository.codeset.PartialSettlementCode;
import com.tools20022.repository.codeset.TransferReasonCode;
import com.tools20022.repository.codeset.TransferTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Completion of a securities settlement instruction, wherein securities are
 * delivered/debited from a securities account and received/credited to the
 * designated securities account.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesTransfer" src="doc-files/SecuritiesTransfer.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment
 * ObligationFulfilment}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmIdentification
 * SecuritiesTransfer.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferredQuantity
 * SecuritiesTransfer.mmTransferredQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmAccount
 * SecuritiesTransfer.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferType
 * SecuritiesTransfer.mmTransferType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmRelatedSettlement
 * SecuritiesTransfer.mmRelatedSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmOwnAccountTransferIndicator
 * SecuritiesTransfer.mmOwnAccountTransferIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmPhysicalDelivery
 * SecuritiesTransfer.mmPhysicalDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmLateDeliveryDate
 * SecuritiesTransfer.mmLateDeliveryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferTax
 * SecuritiesTransfer.mmTransferTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferReason
 * SecuritiesTransfer.mmTransferReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmPartialSettlementType
 * SecuritiesTransfer.mmPartialSettlementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmSecuritiesDeliveryObligation
 * SecuritiesTransfer.mmSecuritiesDeliveryObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmBookEntry
 * SecuritiesTransfer.mmBookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransactionIdentification
 * SecuritiesTransfer.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmSecurity
 * SecuritiesTransfer.mmSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmStatus
 * SecuritiesTransfer.mmStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesTransfer
 * Security.mmSecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedTransfer
 * SecuritiesAccount.mmRelatedTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmSecuritiesTransfer
 * Tax.mmSecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesTransfer
 * SecuritiesQuantity.mmSecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmTransferOperation
 * SecuritiesSettlement.mmTransferOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#mmTriggeringSecuritiesTransfer
 * SecuritiesEntry.mmTriggeringSecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#mmRelatedTransfer
 * PhysicalDelivery.mmRelatedTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmRelatedSecuritiesTransfer
 * SecuritiesTradeStatus.mmRelatedSecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmSecuritiesTransfer
 * SecuritiesDeliveryObligation.mmSecuritiesTransfer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.IntraPositionTransfer
 * IntraPositionTransfer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement2
 * CorporateActionSecuritiesMovement2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement1
 * CorporateActionSecuritiesMovement1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer35 Transfer35}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer34 Transfer34}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TransferReason1Choice
 * TransferReason1Choice}</li>
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
 * "SecuritiesTransfer"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Completion of a securities settlement instruction, wherein securities are delivered/debited from a securities account and received/credited to the designated securities account."
 * </li>
 * </ul>
 */
public class SecuritiesTransfer extends ObligationFulfilment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text identification;
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
	 * {@linkplain com.tools20022.repository.msg.TransferReference11#mmTransferReference
	 * TransferReference11.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason5#mmTransferReference
	 * TransferStatusAndReason5.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmTransferReference
	 * Transfer35.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer34#mmTransferReference
	 * Transfer34.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference13#mmTransferReference
	 * TransferReference13.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason4#mmTransferReference
	 * CancellationStatusAndReason4.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference12#mmTransferReference
	 * TransferReference12.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference11#mmTransferReference
	 * MessageAndBusinessReference11.mmTransferReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of a transfer, as assigned by the instructing party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTransfer, Max35Text> mmIdentification = new MMBusinessAttribute<SecuritiesTransfer, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(TransferReference11.mmTransferReference, TransferStatusAndReason5.mmTransferReference, Transfer35.mmTransferReference, Transfer34.mmTransferReference,
					TransferReference13.mmTransferReference, CancellationStatusAndReason4.mmTransferReference, TransferReference12.mmTransferReference, MessageAndBusinessReference11.mmTransferReference);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification of a transfer, as assigned by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SecuritiesTransfer obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(SecuritiesTransfer obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	protected SecuritiesQuantity transferredQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesTransfer
	 * SecuritiesQuantity.mmSecuritiesTransfer}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecurityMovement1#mmSecuritiesQuantity
	 * SecurityMovement1.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailedMovement1#mmSecuritiesQuantity
	 * FailedMovement1.mmSecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BuyIn3#mmCoveredQuantity
	 * BuyIn3.mmCoveredQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation5#mmQuantity
	 * SettlementObligation5.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation7#mmQuantity
	 * SettlementObligation7.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmQuantity
	 * SettlementObligation8.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails33#mmSettlementQuantity
	 * IntraPositionDetails33.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails39#mmSettlementQuantity
	 * IntraPositionDetails39.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason5#mmTotalUnitsNumber
	 * TransferStatusAndReason5.mmTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmTotalUnitsNumber
	 * Transfer35.mmTotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer35#mmUnitsDetails
	 * Transfer35.mmUnitsDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer34#mmQuantity
	 * Transfer34.mmQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer34#mmUnitsDetails
	 * Transfer34.mmUnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Quantity42Choice#mmTotalUnitsNumber
	 * Quantity42Choice.mmTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46#mmSettledQuantity
	 * IntraPositionDetails46.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46#mmPreviouslySettledQuantity
	 * IntraPositionDetails46.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmQuantityDetails
	 * SecuritiesTradeDetails72.mmQuantityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails15#mmSettledQuantity
	 * IntraPositionMovementDetails15.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails15#mmPreviouslySettledQuantity
	 * IntraPositionMovementDetails15.mmPreviouslySettledQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::ESTT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferredQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity of securities settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesTransfer, SecuritiesQuantity> mmTransferredQuantity = new MMBusinessAssociationEnd<SecuritiesTransfer, SecuritiesQuantity>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityMovement1.mmSecuritiesQuantity, FailedMovement1.mmSecuritiesQuantity, BuyIn3.mmCoveredQuantity, SettlementObligation5.mmQuantity, SettlementObligation7.mmQuantity,
					SettlementObligation8.mmQuantity, IntraPositionDetails33.mmSettlementQuantity, IntraPositionDetails39.mmSettlementQuantity, TransferStatusAndReason5.mmTotalUnitsNumber, Transfer35.mmTotalUnitsNumber,
					Transfer35.mmUnitsDetails, Transfer34.mmQuantity, Transfer34.mmUnitsDetails, Quantity42Choice.mmTotalUnitsNumber, IntraPositionDetails46.mmSettledQuantity, IntraPositionDetails46.mmPreviouslySettledQuantity,
					SecuritiesTradeDetails72.mmQuantityDetails, IntraPositionMovementDetails15.mmSettledQuantity, IntraPositionMovementDetails15.mmPreviouslySettledQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::ESTT"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferredQuantity";
			definition = "Total quantity of securities settled.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuantity.mmSecuritiesTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public SecuritiesQuantity getValue(SecuritiesTransfer obj) {
			return obj.getTransferredQuantity();
		}

		@Override
		public void setValue(SecuritiesTransfer obj, SecuritiesQuantity value) {
			obj.setTransferredQuantity(value);
		}
	};
	protected List<SecuritiesAccount> account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedTransfer
	 * SecuritiesAccount.mmRelatedTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement2#mmAccountDetails
	 * CorporateActionSecuritiesMovement2.mmAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement1#mmAccountDetails
	 * CorporateActionSecuritiesMovement1.mmAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails39#mmSafekeepingAccount
	 * IntraPositionDetails39.mmSafekeepingAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the account from/to which the securities are transferred."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesTransfer, List<SecuritiesAccount>> mmAccount = new MMBusinessAssociationEnd<SecuritiesTransfer, List<SecuritiesAccount>>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionSecuritiesMovement2.mmAccountDetails, CorporateActionSecuritiesMovement1.mmAccountDetails, IntraPositionDetails39.mmSafekeepingAccount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Specifies the account from/to which the securities are transferred.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesAccount.mmRelatedTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesAccount.mmObject();
		}

		@Override
		public List<SecuritiesAccount> getValue(SecuritiesTransfer obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(SecuritiesTransfer obj, List<SecuritiesAccount> value) {
			obj.setAccount(value);
		}
	};
	protected TransferTypeCode transferType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransferTypeCode
	 * TransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument60#mmTransferType
	 * FinancialInstrument60.mmTransferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument65#mmTransferType
	 * FinancialInstrument65.mmTransferType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the financial instrument is transferred as an asset or as cash."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTransfer, TransferTypeCode> mmTransferType = new MMBusinessAttribute<SecuritiesTransfer, TransferTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrument60.mmTransferType, FinancialInstrument65.mmTransferType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferType";
			definition = "Specifies whether the financial instrument is transferred as an asset or as cash.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransferTypeCode.mmObject();
		}

		@Override
		public TransferTypeCode getValue(SecuritiesTransfer obj) {
			return obj.getTransferType();
		}

		@Override
		public void setValue(SecuritiesTransfer obj, TransferTypeCode value) {
			obj.setTransferType(value);
		}
	};
	protected SecuritiesSettlement relatedSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmTransferOperation
	 * SecuritiesSettlement.mmTransferOperation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmSettlementAndCustodyDetails
	 * SwitchSubscriptionLegOrder6.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmSettlementAndCustodyDetails
	 * SwitchRedemptionLegOrder6.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmSettlementAndCustodyDetails
	 * SwitchSubscriptionLegExecution4.mmSettlementAndCustodyDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement process which is the source of the transfer operation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesTransfer, Optional<SecuritiesSettlement>> mmRelatedSettlement = new MMBusinessAssociationEnd<SecuritiesTransfer, Optional<SecuritiesSettlement>>() {
		{
			derivation_lazy = () -> Arrays.asList(SwitchSubscriptionLegOrder6.mmSettlementAndCustodyDetails, SwitchRedemptionLegOrder6.mmSettlementAndCustodyDetails, SwitchSubscriptionLegExecution4.mmSettlementAndCustodyDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSettlement";
			definition = "Settlement process which is the source of the transfer operation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesSettlement.mmTransferOperation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesSettlement.mmObject();
		}

		@Override
		public Optional<SecuritiesSettlement> getValue(SecuritiesTransfer obj) {
			return obj.getRelatedSettlement();
		}

		@Override
		public void setValue(SecuritiesTransfer obj, Optional<SecuritiesSettlement> value) {
			obj.setRelatedSettlement(value.orElse(null));
		}
	};
	protected YesNoIndicator ownAccountTransferIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmOwnAccountTransferIndicator
	 * Transfer35.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer34#mmOwnAccountTransferIndicator
	 * Transfer34.mmOwnAccountTransferIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnAccountTransferIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transfer results in a change of beneficial owner."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTransfer, YesNoIndicator> mmOwnAccountTransferIndicator = new MMBusinessAttribute<SecuritiesTransfer, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(Transfer35.mmOwnAccountTransferIndicator, Transfer34.mmOwnAccountTransferIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OwnAccountTransferIndicator";
			definition = "Indicates whether the transfer results in a change of beneficial owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesTransfer obj) {
			return obj.getOwnAccountTransferIndicator();
		}

		@Override
		public void setValue(SecuritiesTransfer obj, YesNoIndicator value) {
			obj.setOwnAccountTransferIndicator(value);
		}
	};
	protected PhysicalDelivery physicalDelivery;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#mmRelatedTransfer
	 * PhysicalDelivery.mmRelatedTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PhysicalDelivery
	 * PhysicalDelivery}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmPhysicalDeliveryDetails
	 * RedemptionOrder14.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmPhysicalDeliveryDetails
	 * SubscriptionExecution13.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmPhysicalDeliveryDetails
	 * SubscriptionExecution12.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmPhysicalDeliveryDetails
	 * SwitchRedemptionLegOrder6.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmPhysicalDeliveryDetails
	 * RedemptionOrder15.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmPhysicalDeliveryDetails
	 * RedemptionExecution16.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmPhysicalDeliveryDetails
	 * SwitchSubscriptionLegExecution4.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmPhysicalDeliveryDetails
	 * RedemptionExecution15.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmPhysicalDeliveryDetails
	 * SwitchRedemptionLegExecution4.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5#mmDeliveryType
	 * DerivativeInstrument5.mmDeliveryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6#mmDeliveryType
	 * DerivativeInstrument6.mmDeliveryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation18#mmPhysicalTransferDetails
	 * ReceiveInformation18.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation19#mmPhysicalTransferDetails
	 * DeliverInformation19.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation19#mmPhysicalTransferDetails
	 * ReceiveInformation19.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation18#mmPhysicalTransferDetails
	 * DeliverInformation18.mmPhysicalTransferDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to physical delivery of the securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesTransfer, com.tools20022.repository.entity.PhysicalDelivery> mmPhysicalDelivery = new MMBusinessAssociationEnd<SecuritiesTransfer, com.tools20022.repository.entity.PhysicalDelivery>() {
		{
			derivation_lazy = () -> Arrays.asList(RedemptionOrder14.mmPhysicalDeliveryDetails, SubscriptionExecution13.mmPhysicalDeliveryDetails, SubscriptionExecution12.mmPhysicalDeliveryDetails,
					SwitchRedemptionLegOrder6.mmPhysicalDeliveryDetails, RedemptionOrder15.mmPhysicalDeliveryDetails, RedemptionExecution16.mmPhysicalDeliveryDetails, SwitchSubscriptionLegExecution4.mmPhysicalDeliveryDetails,
					RedemptionExecution15.mmPhysicalDeliveryDetails, SwitchRedemptionLegExecution4.mmPhysicalDeliveryDetails, DerivativeInstrument5.mmDeliveryType, DerivativeInstrument6.mmDeliveryType,
					ReceiveInformation18.mmPhysicalTransferDetails, DeliverInformation19.mmPhysicalTransferDetails, ReceiveInformation19.mmPhysicalTransferDetails, DeliverInformation18.mmPhysicalTransferDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PhysicalDelivery";
			definition = "Information related to physical delivery of the securities.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PhysicalDelivery.mmRelatedTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PhysicalDelivery.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.PhysicalDelivery getValue(SecuritiesTransfer obj) {
			return obj.getPhysicalDelivery();
		}

		@Override
		public void setValue(SecuritiesTransfer obj, com.tools20022.repository.entity.PhysicalDelivery value) {
			obj.setPhysicalDelivery(value);
		}
	};
	protected ISODateTime lateDeliveryDate;
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmLateDeliveryDate
	 * SecuritiesFinancingTransactionDetails35.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails105#mmLateDeliveryDate
	 * TransactionDetails105.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails104#mmLateDeliveryDate
	 * TransactionDetails104.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails73#mmLateDeliveryDate
	 * SecuritiesTradeDetails73.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails75#mmLateDeliveryDate
	 * SecuritiesTradeDetails75.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails78#mmLateDeliveryDate
	 * SecuritiesTradeDetails78.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails79#mmLateDeliveryDate
	 * SecuritiesTradeDetails79.mmLateDeliveryDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::ADEL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time after the settlement date specified in the trade, used for pool trades resulting from the original To Be Assigned (TBA) securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTransfer, ISODateTime> mmLateDeliveryDate = new MMBusinessAttribute<SecuritiesTransfer, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails35.mmLateDeliveryDate, TransactionDetails105.mmLateDeliveryDate, TransactionDetails104.mmLateDeliveryDate, SecuritiesTradeDetails73.mmLateDeliveryDate,
					SecuritiesTradeDetails75.mmLateDeliveryDate, SecuritiesTradeDetails78.mmLateDeliveryDate, SecuritiesTradeDetails79.mmLateDeliveryDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::ADEL"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LateDeliveryDate";
			definition = "Date and time after the settlement date specified in the trade, used for pool trades resulting from the original To Be Assigned (TBA) securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(SecuritiesTransfer obj) {
			return obj.getLateDeliveryDate();
		}

		@Override
		public void setValue(SecuritiesTransfer obj, ISODateTime value) {
			obj.setLateDeliveryDate(value);
		}
	};
	protected Tax transferTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmSecuritiesTransfer
	 * Tax.mmSecuritiesTransfer}</li>
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
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmTransferTax
	 * OtherAmounts16.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProceedsMovement1#mmTaxDetails
	 * ProceedsMovement1.mmTaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29#mmTransferTax
	 * OtherAmounts29.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts41#mmTransferTax
	 * OtherAmounts41.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts39#mmTransferTax
	 * OtherAmounts39.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts40#mmTransferTax
	 * OtherAmounts40.mmTransferTax}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax related to the transfer of a financial instrument."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesTransfer, Tax> mmTransferTax = new MMBusinessAssociationEnd<SecuritiesTransfer, Tax>() {
		{
			derivation_lazy = () -> Arrays.asList(OtherAmounts16.mmTransferTax, ProceedsMovement1.mmTaxDetails, OtherAmounts29.mmTransferTax, OtherAmounts41.mmTransferTax, OtherAmounts39.mmTransferTax, OtherAmounts40.mmTransferTax);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferTax";
			definition = "Tax related to the transfer of a financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Tax.mmSecuritiesTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Tax.mmObject();
		}

		@Override
		public Tax getValue(SecuritiesTransfer obj) {
			return obj.getTransferTax();
		}

		@Override
		public void setValue(SecuritiesTransfer obj, Tax value) {
			obj.setTransferTax(value);
		}
	};
	protected TransferReasonCode transferReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransferReasonCode
	 * TransferReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmTransferReason
	 * Transfer35.mmTransferReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer34#mmTransferReason
	 * Transfer34.mmTransferReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferReason1Choice#mmCode
	 * TransferReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferReason1Choice#mmProprietary
	 * TransferReason1Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the transfer reason."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTransfer, TransferReasonCode> mmTransferReason = new MMBusinessAttribute<SecuritiesTransfer, TransferReasonCode>() {
		{
			derivation_lazy = () -> Arrays.asList(Transfer35.mmTransferReason, Transfer34.mmTransferReason, TransferReason1Choice.mmCode, TransferReason1Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferReason";
			definition = "Identifies the transfer reason.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransferReasonCode.mmObject();
		}

		@Override
		public TransferReasonCode getValue(SecuritiesTransfer obj) {
			return obj.getTransferReason();
		}

		@Override
		public void setValue(SecuritiesTransfer obj, TransferReasonCode value) {
			obj.setTransferReason(value);
		}
	};
	protected PartialSettlementCode partialSettlementType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PartialSettlementCode
	 * PartialSettlementCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters24#mmPartialSettlement
	 * AdditionalParameters24.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters21#mmPartialSettlement
	 * AdditionalParameters21.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29#mmPartialSettlement
	 * AdditionalParameters29.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters30#mmPartialSettlement
	 * AdditionalParameters30.mmPartialSettlement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PARS</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about partial settlement."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTransfer, PartialSettlementCode> mmPartialSettlementType = new MMBusinessAttribute<SecuritiesTransfer, PartialSettlementCode>() {
		{
			derivation_lazy = () -> Arrays.asList(AdditionalParameters24.mmPartialSettlement, AdditionalParameters21.mmPartialSettlement, AdditionalParameters29.mmPartialSettlement, AdditionalParameters30.mmPartialSettlement);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PARS"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartialSettlementType";
			definition = "Information about partial settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PartialSettlementCode.mmObject();
		}

		@Override
		public PartialSettlementCode getValue(SecuritiesTransfer obj) {
			return obj.getPartialSettlementType();
		}

		@Override
		public void setValue(SecuritiesTransfer obj, PartialSettlementCode value) {
			obj.setPartialSettlementType(value);
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesDeliveryObligation> securitiesDeliveryObligation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmSecuritiesTransfer
	 * SecuritiesDeliveryObligation.mmSecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesDeliveryObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Obligation for one party to deliver securities to another party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesTransfer, List<SecuritiesDeliveryObligation>> mmSecuritiesDeliveryObligation = new MMBusinessAssociationEnd<SecuritiesTransfer, List<SecuritiesDeliveryObligation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesDeliveryObligation";
			definition = "Obligation for one party to deliver securities to another party.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmSecuritiesTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmObject();
		}

		@Override
		public List<SecuritiesDeliveryObligation> getValue(SecuritiesTransfer obj) {
			return obj.getSecuritiesDeliveryObligation();
		}

		@Override
		public void setValue(SecuritiesTransfer obj, List<SecuritiesDeliveryObligation> value) {
			obj.setSecuritiesDeliveryObligation(value);
		}
	};
	protected List<SecuritiesEntry> bookEntry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#mmTriggeringSecuritiesTransfer
	 * SecuritiesEntry.mmTriggeringSecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesEntry
	 * SecuritiesEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Record in a securities account resulting from the transfer of a security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesTransfer, List<SecuritiesEntry>> mmBookEntry = new MMBusinessAssociationEnd<SecuritiesTransfer, List<SecuritiesEntry>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BookEntry";
			definition = "Record in a securities account resulting from the transfer of a security.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesEntry.mmTriggeringSecuritiesTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesEntry.mmObject();
		}

		@Override
		public List<SecuritiesEntry> getValue(SecuritiesTransfer obj) {
			return obj.getBookEntry();
		}

		@Override
		public void setValue(SecuritiesTransfer obj, List<SecuritiesEntry> value) {
			obj.setBookEntry(value);
		}
	};
	protected Max35Text transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unambiguous identification of a securities transfer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTransfer, Max35Text> mmTransactionIdentification = new MMBusinessAttribute<SecuritiesTransfer, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionIdentification";
			definition = "Unambiguous identification of a securities transfer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SecuritiesTransfer obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(SecuritiesTransfer obj, Max35Text value) {
			obj.setTransactionIdentification(value);
		}
	};
	protected List<com.tools20022.repository.entity.Security> security;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesTransfer
	 * Security.mmSecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security which is transferred."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesTransfer, List<Security>> mmSecurity = new MMBusinessAssociationEnd<SecuritiesTransfer, List<Security>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security which is transferred.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmSecuritiesTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}

		@Override
		public List<Security> getValue(SecuritiesTransfer obj) {
			return obj.getSecurity();
		}

		@Override
		public void setValue(SecuritiesTransfer obj, List<Security> value) {
			obj.setSecurity(value);
		}
	};
	protected SecuritiesTradeStatus status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmRelatedSecuritiesTransfer
	 * SecuritiesTradeStatus.mmRelatedSecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of a securities transfer."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesTransfer, SecuritiesTradeStatus> mmStatus = new MMBusinessAssociationEnd<SecuritiesTransfer, SecuritiesTradeStatus>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status of a securities transfer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesTradeStatus.mmRelatedSecuritiesTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesTradeStatus.mmObject();
		}

		@Override
		public SecuritiesTradeStatus getValue(SecuritiesTransfer obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(SecuritiesTransfer obj, SecuritiesTradeStatus value) {
			obj.setStatus(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransfer";
				definition = "Completion of a securities settlement instruction, wherein securities are delivered/debited from a securities account and received/credited to the designated securities account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmSecuritiesTransfer, SecuritiesAccount.mmRelatedTransfer, Tax.mmSecuritiesTransfer, SecuritiesQuantity.mmSecuritiesTransfer,
						SecuritiesSettlement.mmTransferOperation, SecuritiesEntry.mmTriggeringSecuritiesTransfer, com.tools20022.repository.entity.PhysicalDelivery.mmRelatedTransfer, SecuritiesTradeStatus.mmRelatedSecuritiesTransfer,
						com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmSecuritiesTransfer);
				subType_lazy = () -> Arrays.asList(IntraPositionTransfer.mmObject());
				superType_lazy = () -> ObligationFulfilment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTransfer.mmIdentification, com.tools20022.repository.entity.SecuritiesTransfer.mmTransferredQuantity,
						com.tools20022.repository.entity.SecuritiesTransfer.mmAccount, com.tools20022.repository.entity.SecuritiesTransfer.mmTransferType, com.tools20022.repository.entity.SecuritiesTransfer.mmRelatedSettlement,
						com.tools20022.repository.entity.SecuritiesTransfer.mmOwnAccountTransferIndicator, com.tools20022.repository.entity.SecuritiesTransfer.mmPhysicalDelivery,
						com.tools20022.repository.entity.SecuritiesTransfer.mmLateDeliveryDate, com.tools20022.repository.entity.SecuritiesTransfer.mmTransferTax, com.tools20022.repository.entity.SecuritiesTransfer.mmTransferReason,
						com.tools20022.repository.entity.SecuritiesTransfer.mmPartialSettlementType, com.tools20022.repository.entity.SecuritiesTransfer.mmSecuritiesDeliveryObligation,
						com.tools20022.repository.entity.SecuritiesTransfer.mmBookEntry, com.tools20022.repository.entity.SecuritiesTransfer.mmTransactionIdentification, com.tools20022.repository.entity.SecuritiesTransfer.mmSecurity,
						com.tools20022.repository.entity.SecuritiesTransfer.mmStatus);
				derivationComponent_lazy = () -> Arrays.asList(CorporateActionSecuritiesMovement2.mmObject(), CorporateActionSecuritiesMovement1.mmObject(), Transfer35.mmObject(), Transfer34.mmObject(), TransferReason1Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesTransfer.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public SecuritiesTransfer setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public SecuritiesQuantity getTransferredQuantity() {
		return transferredQuantity;
	}

	public SecuritiesTransfer setTransferredQuantity(SecuritiesQuantity transferredQuantity) {
		this.transferredQuantity = Objects.requireNonNull(transferredQuantity);
		return this;
	}

	public List<SecuritiesAccount> getAccount() {
		return account == null ? account = new ArrayList<>() : account;
	}

	public SecuritiesTransfer setAccount(List<SecuritiesAccount> account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}

	public TransferTypeCode getTransferType() {
		return transferType;
	}

	public SecuritiesTransfer setTransferType(TransferTypeCode transferType) {
		this.transferType = Objects.requireNonNull(transferType);
		return this;
	}

	public Optional<SecuritiesSettlement> getRelatedSettlement() {
		return relatedSettlement == null ? Optional.empty() : Optional.of(relatedSettlement);
	}

	public SecuritiesTransfer setRelatedSettlement(SecuritiesSettlement relatedSettlement) {
		this.relatedSettlement = relatedSettlement;
		return this;
	}

	public YesNoIndicator getOwnAccountTransferIndicator() {
		return ownAccountTransferIndicator;
	}

	public SecuritiesTransfer setOwnAccountTransferIndicator(YesNoIndicator ownAccountTransferIndicator) {
		this.ownAccountTransferIndicator = Objects.requireNonNull(ownAccountTransferIndicator);
		return this;
	}

	public PhysicalDelivery getPhysicalDelivery() {
		return physicalDelivery;
	}

	public SecuritiesTransfer setPhysicalDelivery(com.tools20022.repository.entity.PhysicalDelivery physicalDelivery) {
		this.physicalDelivery = Objects.requireNonNull(physicalDelivery);
		return this;
	}

	public ISODateTime getLateDeliveryDate() {
		return lateDeliveryDate;
	}

	public SecuritiesTransfer setLateDeliveryDate(ISODateTime lateDeliveryDate) {
		this.lateDeliveryDate = Objects.requireNonNull(lateDeliveryDate);
		return this;
	}

	public Tax getTransferTax() {
		return transferTax;
	}

	public SecuritiesTransfer setTransferTax(Tax transferTax) {
		this.transferTax = Objects.requireNonNull(transferTax);
		return this;
	}

	public TransferReasonCode getTransferReason() {
		return transferReason;
	}

	public SecuritiesTransfer setTransferReason(TransferReasonCode transferReason) {
		this.transferReason = Objects.requireNonNull(transferReason);
		return this;
	}

	public PartialSettlementCode getPartialSettlementType() {
		return partialSettlementType;
	}

	public SecuritiesTransfer setPartialSettlementType(PartialSettlementCode partialSettlementType) {
		this.partialSettlementType = Objects.requireNonNull(partialSettlementType);
		return this;
	}

	public List<SecuritiesDeliveryObligation> getSecuritiesDeliveryObligation() {
		return securitiesDeliveryObligation == null ? securitiesDeliveryObligation = new ArrayList<>() : securitiesDeliveryObligation;
	}

	public SecuritiesTransfer setSecuritiesDeliveryObligation(List<com.tools20022.repository.entity.SecuritiesDeliveryObligation> securitiesDeliveryObligation) {
		this.securitiesDeliveryObligation = Objects.requireNonNull(securitiesDeliveryObligation);
		return this;
	}

	public List<SecuritiesEntry> getBookEntry() {
		return bookEntry == null ? bookEntry = new ArrayList<>() : bookEntry;
	}

	public SecuritiesTransfer setBookEntry(List<SecuritiesEntry> bookEntry) {
		this.bookEntry = Objects.requireNonNull(bookEntry);
		return this;
	}

	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public SecuritiesTransfer setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public List<Security> getSecurity() {
		return security == null ? security = new ArrayList<>() : security;
	}

	public SecuritiesTransfer setSecurity(List<com.tools20022.repository.entity.Security> security) {
		this.security = Objects.requireNonNull(security);
		return this;
	}

	public SecuritiesTradeStatus getStatus() {
		return status;
	}

	public SecuritiesTransfer setStatus(SecuritiesTradeStatus status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}
}