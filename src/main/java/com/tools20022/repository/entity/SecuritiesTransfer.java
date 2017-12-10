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
import com.tools20022.repository.choice.Quantity13Choice;
import com.tools20022.repository.choice.Reversal7Choice;
import com.tools20022.repository.choice.Reversal8Choice;
import com.tools20022.repository.choice.TransferReason1;
import com.tools20022.repository.codeset.PartialSettlementCode;
import com.tools20022.repository.codeset.TransferReasonCode;
import com.tools20022.repository.codeset.TransferTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.ObligationFulfilment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferOut17#mmTransferAndReferences
 * TransferOut17.mmTransferAndReferences}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn14#mmTransferDetails
 * TransferIn14.mmTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferIn15#mmTransferAndReferences
 * TransferIn15.mmTransferAndReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferOut16#mmTransferDetails
 * TransferOut16.mmTransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn16#mmTransferDetails
 * TransferIn16.mmTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferOut18#mmTransferDetails
 * TransferOut18.mmTransferDetails}</li>
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
 * <li>{@linkplain com.tools20022.repository.choice.TransferReason1
 * TransferReason1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement2
 * CorporateActionSecuritiesMovement2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement1
 * CorporateActionSecuritiesMovement1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer31 Transfer31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer30 Transfer30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer32 Transfer32}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Reversal7Choice
 * Reversal7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Reversal8Choice
 * Reversal8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer33 Transfer33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut17 TransferOut17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn14 TransferIn14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn15 TransferIn15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut16 TransferOut16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn16 TransferIn16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut18 TransferOut18}</li>
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
	 * Unique and unambiguous identification of a transfer, as assigned by the
	 * instructing party.
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
	 * {@linkplain com.tools20022.repository.msg.TransferReference8#mmTransferReference
	 * TransferReference8.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#mmTransferReference
	 * Transfer31.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmTransferReference
	 * Transfer30.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer32#mmTransferReference
	 * Transfer32.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason3#mmTransferReference
	 * CancellationStatusAndReason3.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference8#mmTransferReference
	 * MessageAndBusinessReference8.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#mmTransferReference
	 * Transfer33.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason4#mmTransferReference
	 * TransferStatusAndReason4.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference9#mmTransferReference
	 * TransferReference9.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference10#mmTransferReference
	 * TransferReference10.mmTransferReference}</li>
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
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransferReference8.mmTransferReference, Transfer31.mmTransferReference, Transfer30.mmTransferReference, Transfer32.mmTransferReference, CancellationStatusAndReason3.mmTransferReference,
					MessageAndBusinessReference8.mmTransferReference, Transfer33.mmTransferReference, TransferStatusAndReason4.mmTransferReference, TransferReference9.mmTransferReference, TransferReference10.mmTransferReference);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification of a transfer, as assigned by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTransfer.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesQuantity transferredQuantity;
	/**
	 * Total quantity of securities settled.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.Quantity13Choice#mmTotalUnitsNumber
	 * Quantity13Choice.mmTotalUnitsNumber}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmQuantityDetails
	 * SecuritiesTradeDetails48.mmQuantityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails33#mmSettlementQuantity
	 * IntraPositionDetails33.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#mmTotalUnitsNumber
	 * Transfer31.mmTotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer31#mmUnitsDetails
	 * Transfer31.mmUnitsDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer30#mmQuantity
	 * Transfer30.mmQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer30#mmUnitsDetails
	 * Transfer30.mmUnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer32#mmTotalUnitsNumber
	 * Transfer32.mmTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#mmTotalUnitsNumber
	 * Transfer33.mmTotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer33#mmUnitsDetails
	 * Transfer33.mmUnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmSettledQuantity
	 * IntraPositionDetails41.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmPreviouslySettledQuantity
	 * IntraPositionDetails41.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails39#mmSettlementQuantity
	 * IntraPositionDetails39.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails13#mmSettledQuantity
	 * IntraPositionMovementDetails13.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails13#mmPreviouslySettledQuantity
	 * IntraPositionMovementDetails13.mmPreviouslySettledQuantity}</li>
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
	 * name} = "TransferredQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity of securities settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTransferredQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Quantity13Choice.mmTotalUnitsNumber, SecurityMovement1.mmSecuritiesQuantity, FailedMovement1.mmSecuritiesQuantity, BuyIn3.mmCoveredQuantity, SettlementObligation5.mmQuantity,
					SettlementObligation7.mmQuantity, SettlementObligation8.mmQuantity, SecuritiesTradeDetails48.mmQuantityDetails, IntraPositionDetails33.mmSettlementQuantity, Transfer31.mmTotalUnitsNumber, Transfer31.mmUnitsDetails,
					Transfer30.mmQuantity, Transfer30.mmUnitsDetails, Transfer32.mmTotalUnitsNumber, Transfer33.mmTotalUnitsNumber, Transfer33.mmUnitsDetails, IntraPositionDetails41.mmSettledQuantity,
					IntraPositionDetails41.mmPreviouslySettledQuantity, IntraPositionDetails39.mmSettlementQuantity, IntraPositionMovementDetails13.mmSettledQuantity, IntraPositionMovementDetails13.mmPreviouslySettledQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferredQuantity";
			definition = "Total quantity of securities settled.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmSecuritiesTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesAccount> account;
	/**
	 * Specifies the account from/to which the securities are transferred.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionSecuritiesMovement2.mmAccountDetails, CorporateActionSecuritiesMovement1.mmAccountDetails, IntraPositionDetails39.mmSafekeepingAccount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Specifies the account from/to which the securities are transferred.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmRelatedTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}
	};
	protected TransferTypeCode transferType;
	/**
	 * Specifies whether the financial instrument is transferred as an asset or
	 * as cash.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument48#mmTransferType
	 * FinancialInstrument48.mmTransferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#mmTransferType
	 * FinancialInstrument46.mmTransferType}</li>
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
	public static final MMBusinessAttribute mmTransferType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrument48.mmTransferType, FinancialInstrument46.mmTransferType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferType";
			definition = "Specifies whether the financial instrument is transferred as an asset or as cash.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransferTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTransfer.class.getMethod("getTransferType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesSettlement relatedSettlement;
	/**
	 * Settlement process which is the source of the transfer operation.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.Reversal7Choice#mmTransferInConfirmationDetails
	 * Reversal7Choice.mmTransferInConfirmationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reversal8Choice#mmTransferOutConfirmationDetails
	 * Reversal8Choice.mmTransferOutConfirmationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut17#mmSettlementDetails
	 * TransferOut17.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn14#mmSettlementDetails
	 * TransferIn14.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn15#mmSettlementDetails
	 * TransferIn15.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut16#mmSettlementDetails
	 * TransferOut16.mmSettlementDetails}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedSettlement = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Reversal7Choice.mmTransferInConfirmationDetails, Reversal8Choice.mmTransferOutConfirmationDetails, TransferOut17.mmSettlementDetails, TransferIn14.mmSettlementDetails,
					TransferIn15.mmSettlementDetails, TransferOut16.mmSettlementDetails, SwitchSubscriptionLegOrder6.mmSettlementAndCustodyDetails, SwitchRedemptionLegOrder6.mmSettlementAndCustodyDetails,
					SwitchSubscriptionLegExecution4.mmSettlementAndCustodyDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSettlement";
			definition = "Settlement process which is the source of the transfer operation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmTransferOperation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
		}
	};
	protected YesNoIndicator ownAccountTransferIndicator;
	/**
	 * Indicates whether the transfer results in a change of beneficial owner.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.Transfer31#mmOwnAccountTransferIndicator
	 * Transfer31.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmOwnAccountTransferIndicator
	 * Transfer30.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer32#mmOwnAccountTransferIndicator
	 * Transfer32.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#mmOwnAccountTransferIndicator
	 * Transfer33.mmOwnAccountTransferIndicator}</li>
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
	public static final MMBusinessAttribute mmOwnAccountTransferIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Transfer31.mmOwnAccountTransferIndicator, Transfer30.mmOwnAccountTransferIndicator, Transfer32.mmOwnAccountTransferIndicator, Transfer33.mmOwnAccountTransferIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OwnAccountTransferIndicator";
			definition = "Indicates whether the transfer results in a change of beneficial owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTransfer.class.getMethod("getOwnAccountTransferIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PhysicalDelivery physicalDelivery;
	/**
	 * Information related to physical delivery of the securities.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#mmPhysicalTransferDetails
	 * ReceiveInformation17.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#mmPhysicalTransferDetails
	 * ReceiveInformation16.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmPhysicalTransferDetails
	 * DeliverInformation16.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#mmPhysicalTransferDetails
	 * DeliverInformation17.mmPhysicalTransferDetails}</li>
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
	public static final MMBusinessAssociationEnd mmPhysicalDelivery = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(ReceiveInformation17.mmPhysicalTransferDetails, ReceiveInformation16.mmPhysicalTransferDetails, DeliverInformation16.mmPhysicalTransferDetails,
					DeliverInformation17.mmPhysicalTransferDetails, RedemptionOrder14.mmPhysicalDeliveryDetails, SubscriptionExecution13.mmPhysicalDeliveryDetails, SubscriptionExecution12.mmPhysicalDeliveryDetails,
					SwitchRedemptionLegOrder6.mmPhysicalDeliveryDetails, RedemptionOrder15.mmPhysicalDeliveryDetails, RedemptionExecution16.mmPhysicalDeliveryDetails, SwitchSubscriptionLegExecution4.mmPhysicalDeliveryDetails,
					RedemptionExecution15.mmPhysicalDeliveryDetails, SwitchRedemptionLegExecution4.mmPhysicalDeliveryDetails, DerivativeInstrument5.mmDeliveryType, DerivativeInstrument6.mmDeliveryType);
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
	};
	protected ISODateTime lateDeliveryDate;
	/**
	 * Date and time after the settlement date specified in the trade, used for
	 * pool trades resulting from the original To Be Assigned (TBA) securities.
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmLateDeliveryDate
	 * SecuritiesTradeDetails51.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#mmLateDeliveryDate
	 * SecuritiesTradeDetails52.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#mmLateDeliveryDate
	 * SecuritiesTradeDetails50.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#mmLateDeliveryDate
	 * SecuritiesTradeDetails67.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmLateDeliveryDate
	 * TransactionDetails97.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmLateDeliveryDate
	 * SecuritiesFinancingTransactionDetails35.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#mmLateDeliveryDate
	 * TransactionDetails96.mmLateDeliveryDate}</li>
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
	 * name} = "LateDeliveryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time after the settlement date specified in the trade, used for pool trades resulting from the original To Be Assigned (TBA) securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLateDeliveryDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesTradeDetails51.mmLateDeliveryDate, SecuritiesTradeDetails52.mmLateDeliveryDate, SecuritiesTradeDetails50.mmLateDeliveryDate, SecuritiesTradeDetails67.mmLateDeliveryDate,
					TransactionDetails97.mmLateDeliveryDate, SecuritiesFinancingTransactionDetails35.mmLateDeliveryDate, TransactionDetails96.mmLateDeliveryDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LateDeliveryDate";
			definition = "Date and time after the settlement date specified in the trade, used for pool trades resulting from the original To Be Assigned (TBA) securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTransfer.class.getMethod("getLateDeliveryDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Tax transferTax;
	/**
	 * Tax related to the transfer of a financial instrument.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#mmTransferTax
	 * OtherAmounts28.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#mmTransferTax
	 * OtherAmounts30.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmTransferTax
	 * OtherAmounts31.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29#mmTransferTax
	 * OtherAmounts29.mmTransferTax}</li>
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
	public static final MMBusinessAssociationEnd mmTransferTax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(OtherAmounts16.mmTransferTax, ProceedsMovement1.mmTaxDetails, OtherAmounts28.mmTransferTax, OtherAmounts30.mmTransferTax, OtherAmounts31.mmTransferTax, OtherAmounts29.mmTransferTax);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferTax";
			definition = "Tax related to the transfer of a financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.mmSecuritiesTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};
	protected TransferReasonCode transferReason;
	/**
	 * Identifies the transfer reason.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.repository.choice.TransferReason1#mmCode
	 * TransferReason1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferReason1#mmProprietary
	 * TransferReason1.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#mmTransferReason
	 * Transfer31.mmTransferReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmTransferReason
	 * Transfer30.mmTransferReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer32#mmTransferReason
	 * Transfer32.mmTransferReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#mmTransferReason
	 * Transfer33.mmTransferReason}</li>
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
	public static final MMBusinessAttribute mmTransferReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransferReason1.mmCode, TransferReason1.mmProprietary, Transfer31.mmTransferReason, Transfer30.mmTransferReason, Transfer32.mmTransferReason, Transfer33.mmTransferReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferReason";
			definition = "Identifies the transfer reason.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransferReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTransfer.class.getMethod("getTransferReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartialSettlementCode partialSettlementType;
	/**
	 * Information about partial settlement.
	 * <p>
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
	public static final MMBusinessAttribute mmPartialSettlementType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AdditionalParameters24.mmPartialSettlement, AdditionalParameters21.mmPartialSettlement, AdditionalParameters29.mmPartialSettlement, AdditionalParameters30.mmPartialSettlement);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartialSettlementType";
			definition = "Information about partial settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PartialSettlementCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTransfer.class.getMethod("getPartialSettlementType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesDeliveryObligation> securitiesDeliveryObligation;
	/**
	 * Obligation for one party to deliver securities to another party.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmSecuritiesDeliveryObligation = new MMBusinessAssociationEnd() {
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
	};
	protected List<com.tools20022.repository.entity.SecuritiesEntry> bookEntry;
	/**
	 * Record in a securities account resulting from the transfer of a security.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmBookEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BookEntry";
			definition = "Record in a securities account resulting from the transfer of a security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.mmTriggeringSecuritiesTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.mmObject();
		}
	};
	protected Max35Text transactionIdentification;
	/**
	 * Unambiguous identification of a securities transfer.
	 * <p>
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
	public static final MMBusinessAttribute mmTransactionIdentification = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return SecuritiesTransfer.class.getMethod("getTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Security> security;
	/**
	 * Security which is transferred.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmSecurity = new MMBusinessAssociationEnd() {
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
	};
	protected SecuritiesTradeStatus status;
	/**
	 * Status of a securities transfer.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status of a securities transfer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmRelatedSecuritiesTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransfer";
				definition = "Completion of a securities settlement instruction, wherein securities are delivered/debited from a securities account and received/credited to the designated securities account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmSecuritiesTransfer, com.tools20022.repository.entity.SecuritiesAccount.mmRelatedTransfer,
						com.tools20022.repository.entity.Tax.mmSecuritiesTransfer, com.tools20022.repository.entity.SecuritiesQuantity.mmSecuritiesTransfer, com.tools20022.repository.entity.SecuritiesSettlement.mmTransferOperation,
						com.tools20022.repository.entity.SecuritiesEntry.mmTriggeringSecuritiesTransfer, com.tools20022.repository.entity.PhysicalDelivery.mmRelatedTransfer,
						com.tools20022.repository.entity.SecuritiesTradeStatus.mmRelatedSecuritiesTransfer, com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmSecuritiesTransfer);
				derivationElement_lazy = () -> Arrays.asList(TransferOut17.mmTransferAndReferences, TransferIn14.mmTransferDetails, TransferIn15.mmTransferAndReferences, TransferOut16.mmTransferDetails, TransferIn16.mmTransferDetails,
						TransferOut18.mmTransferDetails);
				subType_lazy = () -> Arrays.asList(IntraPositionTransfer.mmObject());
				superType_lazy = () -> ObligationFulfilment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTransfer.mmIdentification, com.tools20022.repository.entity.SecuritiesTransfer.mmTransferredQuantity,
						com.tools20022.repository.entity.SecuritiesTransfer.mmAccount, com.tools20022.repository.entity.SecuritiesTransfer.mmTransferType, com.tools20022.repository.entity.SecuritiesTransfer.mmRelatedSettlement,
						com.tools20022.repository.entity.SecuritiesTransfer.mmOwnAccountTransferIndicator, com.tools20022.repository.entity.SecuritiesTransfer.mmPhysicalDelivery,
						com.tools20022.repository.entity.SecuritiesTransfer.mmLateDeliveryDate, com.tools20022.repository.entity.SecuritiesTransfer.mmTransferTax, com.tools20022.repository.entity.SecuritiesTransfer.mmTransferReason,
						com.tools20022.repository.entity.SecuritiesTransfer.mmPartialSettlementType, com.tools20022.repository.entity.SecuritiesTransfer.mmSecuritiesDeliveryObligation,
						com.tools20022.repository.entity.SecuritiesTransfer.mmBookEntry, com.tools20022.repository.entity.SecuritiesTransfer.mmTransactionIdentification, com.tools20022.repository.entity.SecuritiesTransfer.mmSecurity,
						com.tools20022.repository.entity.SecuritiesTransfer.mmStatus);
				derivationComponent_lazy = () -> Arrays.asList(TransferReason1.mmObject(), CorporateActionSecuritiesMovement2.mmObject(), CorporateActionSecuritiesMovement1.mmObject(), Transfer31.mmObject(), Transfer30.mmObject(),
						Transfer32.mmObject(), Reversal7Choice.mmObject(), Reversal8Choice.mmObject(), Transfer33.mmObject(), TransferOut17.mmObject(), TransferIn14.mmObject(), TransferIn15.mmObject(), TransferOut16.mmObject(),
						TransferIn16.mmObject(), TransferOut18.mmObject());
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

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public SecuritiesQuantity getTransferredQuantity() {
		return transferredQuantity;
	}

	public void setTransferredQuantity(com.tools20022.repository.entity.SecuritiesQuantity transferredQuantity) {
		this.transferredQuantity = transferredQuantity;
	}

	public List<SecuritiesAccount> getAccount() {
		return account;
	}

	public void setAccount(List<com.tools20022.repository.entity.SecuritiesAccount> account) {
		this.account = account;
	}

	public TransferTypeCode getTransferType() {
		return transferType;
	}

	public void setTransferType(TransferTypeCode transferType) {
		this.transferType = transferType;
	}

	public SecuritiesSettlement getRelatedSettlement() {
		return relatedSettlement;
	}

	public void setRelatedSettlement(com.tools20022.repository.entity.SecuritiesSettlement relatedSettlement) {
		this.relatedSettlement = relatedSettlement;
	}

	public YesNoIndicator getOwnAccountTransferIndicator() {
		return ownAccountTransferIndicator;
	}

	public void setOwnAccountTransferIndicator(YesNoIndicator ownAccountTransferIndicator) {
		this.ownAccountTransferIndicator = ownAccountTransferIndicator;
	}

	public PhysicalDelivery getPhysicalDelivery() {
		return physicalDelivery;
	}

	public void setPhysicalDelivery(com.tools20022.repository.entity.PhysicalDelivery physicalDelivery) {
		this.physicalDelivery = physicalDelivery;
	}

	public ISODateTime getLateDeliveryDate() {
		return lateDeliveryDate;
	}

	public void setLateDeliveryDate(ISODateTime lateDeliveryDate) {
		this.lateDeliveryDate = lateDeliveryDate;
	}

	public Tax getTransferTax() {
		return transferTax;
	}

	public void setTransferTax(com.tools20022.repository.entity.Tax transferTax) {
		this.transferTax = transferTax;
	}

	public TransferReasonCode getTransferReason() {
		return transferReason;
	}

	public void setTransferReason(TransferReasonCode transferReason) {
		this.transferReason = transferReason;
	}

	public PartialSettlementCode getPartialSettlementType() {
		return partialSettlementType;
	}

	public void setPartialSettlementType(PartialSettlementCode partialSettlementType) {
		this.partialSettlementType = partialSettlementType;
	}

	public List<SecuritiesDeliveryObligation> getSecuritiesDeliveryObligation() {
		return securitiesDeliveryObligation;
	}

	public void setSecuritiesDeliveryObligation(List<com.tools20022.repository.entity.SecuritiesDeliveryObligation> securitiesDeliveryObligation) {
		this.securitiesDeliveryObligation = securitiesDeliveryObligation;
	}

	public List<SecuritiesEntry> getBookEntry() {
		return bookEntry;
	}

	public void setBookEntry(List<com.tools20022.repository.entity.SecuritiesEntry> bookEntry) {
		this.bookEntry = bookEntry;
	}

	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	public List<Security> getSecurity() {
		return security;
	}

	public void setSecurity(List<com.tools20022.repository.entity.Security> security) {
		this.security = security;
	}

	public SecuritiesTradeStatus getStatus() {
		return status;
	}

	public void setStatus(com.tools20022.repository.entity.SecuritiesTradeStatus status) {
		this.status = status;
	}
}