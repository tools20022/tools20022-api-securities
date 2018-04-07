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
import com.tools20022.repository.area.colr.*;
import com.tools20022.repository.area.reda.StandingSettlementInstructionCancellationV01;
import com.tools20022.repository.area.reda.StandingSettlementInstructionDeletionV01;
import com.tools20022.repository.area.reda.StandingSettlementInstructionStatusAdviceV01;
import com.tools20022.repository.area.reda.StandingSettlementInstructionV01;
import com.tools20022.repository.area.secl.*;
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.area.semt.*;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationCancellationV01;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationResponseV01;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.other.SupplementaryDataEnvelope1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Additional information that can not be captured in the structured fields
 * and/or any other specific block.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupplementaryData1#mmPlaceAndName
 * SupplementaryData1.mmPlaceAndName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SupplementaryData1#mmEnvelope
 * SupplementaryData1.mmEnvelope}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationCancellationV01#mmSupplementaryData
 * SecuritiesTradeConfirmationCancellationV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationResponseV01#mmSupplementaryData
 * SecuritiesTradeConfirmationResponseV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesEndOfProcessReportV01#mmSupplementaryData
 * SecuritiesEndOfProcessReportV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01#mmSupplementaryData
 * TotalPortfolioValuationReportV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.MarginReportV02#mmSupplementaryData
 * MarginReportV02.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.DefaultFundContributionReportV02#mmSupplementaryData
 * DefaultFundContributionReportV02.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmSupplementaryData
 * SecuritiesTradeConfirmationV03.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02#mmSupplementaryData
 * SecuritiesTradeConfirmationStatusAdviceV02.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionV01#mmSupplementaryData
 * StandingSettlementInstructionV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionCancellationV01#mmSupplementaryData
 * StandingSettlementInstructionCancellationV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionStatusAdviceV01#mmSupplementaryData
 * StandingSettlementInstructionStatusAdviceV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionDeletionV01#mmSupplementaryData
 * StandingSettlementInstructionDeletionV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegNotificationV03#mmSupplementaryData
 * TradeLegNotificationV03.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.BuyInNotificationV03#mmSupplementaryData
 * BuyInNotificationV03.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.NetPositionV03#mmSupplementaryData
 * NetPositionV03.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.BuyInConfirmationV03#mmSupplementaryData
 * BuyInConfirmationV03.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegStatementV03#mmSupplementaryData
 * TradeLegStatementV03.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.BuyInResponseV03#mmSupplementaryData
 * BuyInResponseV03.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegNotificationCancellationV03#mmSupplementaryData
 * TradeLegNotificationCancellationV03.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01#mmSupplementaryData
 * SecuritiesBalanceTransparencyReportStatusAdviceV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.SettlementObligationReportV03#mmSupplementaryData
 * SettlementObligationReportV03.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV05#mmSupplementaryData
 * MeetingInstructionCancellationRequestV05.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05#mmSupplementaryData
 * MeetingNotificationV05.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV05#mmSupplementaryData
 * MeetingInstructionStatusV05.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV05#mmSupplementaryData
 * MeetingCancellationV05.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV05#mmSupplementaryData
 * MeetingResultDisseminationV05.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV05#mmSupplementaryData
 * MeetingVoteExecutionConfirmationV05.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionV05#mmSupplementaryData
 * MeetingInstructionV05.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV05#mmSupplementaryData
 * MeetingEntitlementNotificationV05.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV04#mmSupplementaryData
 * IntraPositionMovementInstructionV04.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV04#mmSupplementaryData
 * SecuritiesStatusOrStatementQueryStatusAdviceV04.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV05#mmSupplementaryData
 * SecuritiesMessageCancellationAdviceV05.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV06#mmSupplementaryData
 * SecuritiesStatementQueryV06.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV04#mmSupplementaryData
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV04.
 * mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV07#mmSupplementaryData
 * SecuritiesSettlementConditionModificationStatusAdviceV07.mmSupplementaryData}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV04#mmSupplementaryData
 * SecuritiesTransactionStatusQueryV04.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV04#mmSupplementaryData
 * SecuritiesSettlementAllegementRemovalAdviceV04.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV05#mmSupplementaryData
 * SecuritiesTransactionCancellationRequestV05.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV05#mmSupplementaryData
 * SecuritiesTransactionCancellationRequestStatusAdviceV05.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionCounterpartyResponseV02#mmSupplementaryData
 * SecuritiesSettlementTransactionCounterpartyResponseV02.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNarrativeV04#mmSupplementaryData
 * CorporateActionNarrativeV04.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmSupplementaryData
 * MarginCallRequestV04.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentResponseV04#mmSupplementaryData
 * InterestPaymentResponseV04.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallDisputeNotificationV04#mmSupplementaryData
 * MarginCallDisputeNotificationV04.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionResponseV04#mmSupplementaryData
 * CollateralSubstitutionResponseV04.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV04#mmSupplementaryData
 * MarginCallResponseV04.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentStatementV04#mmSupplementaryData
 * InterestPaymentStatementV04.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralManagementCancellationRequestV04#mmSupplementaryData
 * CollateralManagementCancellationRequestV04.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionConfirmationV04#mmSupplementaryData
 * CollateralSubstitutionConfirmationV04.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentRequestV04#mmSupplementaryData
 * InterestPaymentRequestV04.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralManagementCancellationStatusV04#mmSupplementaryData
 * CollateralManagementCancellationStatusV04.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionRequestV04#mmSupplementaryData
 * CollateralSubstitutionRequestV04.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV03#mmSupplementaryData
 * CollateralAndExposureReportV03.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketStatisticalReportStatusAdviceV01#mmSupplementaryData
 * MoneyMarketStatisticalReportStatusAdviceV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportV02#mmSupplementaryData
 * SecuritiesBalanceTransparencyReportV02.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV06#mmSupplementaryData
 * CorporateActionEventProcessingStatusAdviceV06.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV07#mmSupplementaryData
 * CorporateActionInstructionCancellationRequestV07.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementStatusAdviceV05#mmSupplementaryData
 * IntraPositionMovementStatusAdviceV05.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV07#mmSupplementaryData
 * SecuritiesSettlementConditionsModificationRequestV07.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV06#mmSupplementaryData
 * SecuritiesFinancingModificationInstructionV06.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV07#mmSupplementaryData
 * SecuritiesFinancingStatusAdviceV07.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalResponseV05#mmSupplementaryData
 * CollateralProposalResponseV05.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalV05#mmSupplementaryData
 * CollateralProposalV05.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketUnsecuredMarketStatisticalReportV02#mmSupplementaryData
 * MoneyMarketUnsecuredMarketStatisticalReportV02.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketForeignExchangeSwapsStatisticalReportV02#mmSupplementaryData
 * MoneyMarketForeignExchangeSwapsStatisticalReportV02.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketSecuredMarketStatisticalReportV02#mmSupplementaryData
 * MoneyMarketSecuredMarketStatisticalReportV02.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketOvernightIndexSwapsStatisticalReportV02#mmSupplementaryData
 * MoneyMarketOvernightIndexSwapsStatisticalReportV02.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.FinancialInstrumentReportingStatusAdviceV01#mmSupplementaryData
 * FinancialInstrumentReportingStatusAdviceV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingTradingVolumeCapDataReportV01#mmSupplementaryData
 * FinancialInstrumentReportingTradingVolumeCapDataReportV01.mmSupplementaryData
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingInstrumentClassificationReportV01#mmSupplementaryData
 * FinancialInstrumentReportingInstrumentClassificationReportV01.
 * mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingNonEquityTradingActivityResultV01#mmSupplementaryData
 * FinancialInstrumentReportingNonEquityTradingActivityResultV01.
 * mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingEquityTradingActivityResultV01#mmSupplementaryData
 * FinancialInstrumentReportingEquityTradingActivityResultV01.
 * mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingEquityTransparencyDataReportV01#mmSupplementaryData
 * FinancialInstrumentReportingEquityTransparencyDataReportV01.
 * mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingReferenceDataReportV01#mmSupplementaryData
 * FinancialInstrumentReportingReferenceDataReportV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingInvalidReferenceDataReportV01#mmSupplementaryData
 * FinancialInstrumentReportingInvalidReferenceDataReportV01.mmSupplementaryData
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingStatusAdviceV01#mmSupplementaryData
 * FinancialInstrumentReportingStatusAdviceV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingNonWorkingDayReportV01#mmSupplementaryData
 * FinancialInstrumentReportingNonWorkingDayReportV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingTransactionReportV01#mmSupplementaryData
 * FinancialInstrumentReportingTransactionReportV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingEquityTradingActivityReportV01#mmSupplementaryData
 * FinancialInstrumentReportingEquityTradingActivityReportV01.
 * mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingCurrencyCodeReportV01#mmSupplementaryData
 * FinancialInstrumentReportingCurrencyCodeReportV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingReferenceDataIndexReportV01#mmSupplementaryData
 * FinancialInstrumentReportingReferenceDataIndexReportV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingMarketIdentificationCodeReportV01#mmSupplementaryData
 * FinancialInstrumentReportingMarketIdentificationCodeReportV01.
 * mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingNonEquityTransparencyDataReportV01#mmSupplementaryData
 * FinancialInstrumentReportingNonEquityTransparencyDataReportV01.
 * mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingReferenceDataDeltaReportV01#mmSupplementaryData
 * FinancialInstrumentReportingReferenceDataDeltaReportV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingCountryCodeReportV01#mmSupplementaryData
 * FinancialInstrumentReportingCountryCodeReportV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingNonEquityTradingActivityReportV01#mmSupplementaryData
 * FinancialInstrumentReportingNonEquityTradingActivityReportV01.
 * mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV07#mmSupplementaryData
 * IntraPositionMovementConfirmationV07.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV08#mmSupplementaryData
 * SecuritiesSettlementTransactionGenerationNotificationV08.mmSupplementaryData}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07#mmSupplementaryData
 * SecuritiesSettlementTransactionAllegementNotificationV07.mmSupplementaryData}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV08#mmSupplementaryData
 * SecuritiesSettlementTransactionConfirmationV08.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV08#mmSupplementaryData
 * SecuritiesFinancingInstructionV08.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV08#mmSupplementaryData
 * SecuritiesFinancingConfirmationV08.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV09#mmSupplementaryData
 * SecuritiesSettlementTransactionStatusAdviceV09.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV07#mmSupplementaryData
 * SecuritiesSettlementTransactionReversalAdviceV07.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV08#mmSupplementaryData
 * SecuritiesSettlementTransactionInstructionV08.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV07#mmSupplementaryData
 * CorporateActionInstructionStatementReportV07.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV09#mmSupplementaryData
 * CorporateActionMovementReversalAdviceV09.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmSupplementaryData
 * CorporateActionNotificationV08.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV08#mmSupplementaryData
 * CorporateActionInstructionV08.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV09#mmSupplementaryData
 * CorporateActionMovementConfirmationV09.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV08#mmSupplementaryData
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV08.
 * mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmSupplementaryData
 * CorporateActionMovementPreliminaryAdviceV09.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV09#mmSupplementaryData
 * CorporateActionInstructionStatusAdviceV09.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV08#mmSupplementaryData
 * CorporateActionCancellationAdviceV08.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV08#mmSupplementaryData
 * CorporateActionInstructionCancellationRequestStatusAdviceV08.
 * mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forSupplementaryData1
 * ConstraintSupplementaryDataRule.forSupplementaryData1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SupplementaryData1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Additional information that can not be captured in the structured fields and/or any other specific block."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SupplementaryData1", propOrder = {"placeAndName", "envelope"})
public class SupplementaryData1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm")
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous reference to the location where the supplementary data must be inserted in the message instance.\r\nIn the case of XML, this is expressed by a valid XPath."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SupplementaryData1, Optional<Max350Text>> mmPlaceAndName = new MMMessageAttribute<SupplementaryData1, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SupplementaryData1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Unambiguous reference to the location where the supplementary data must be inserted in the message instance.\r\nIn the case of XML, this is expressed by a valid XPath.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(SupplementaryData1 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(SupplementaryData1 obj, Optional<Max350Text> value) {
			obj.setPlaceAndName(value.orElse(null));
		}
	};
	@XmlElement(name = "Envlp", required = true)
	protected SupplementaryDataEnvelope1 envelope;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.other.SupplementaryDataEnvelope1
	 * SupplementaryDataEnvelope1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Envlp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Envelope"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Technical element wrapping the supplementary data."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SupplementaryData1, SupplementaryDataEnvelope1> mmEnvelope = new MMMessageAssociationEnd<SupplementaryData1, SupplementaryDataEnvelope1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SupplementaryData1.mmObject();
			isDerived = false;
			xmlTag = "Envlp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Envelope";
			definition = "Technical element wrapping the supplementary data.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SupplementaryDataEnvelope1.mmObject();
		}

		@Override
		public SupplementaryDataEnvelope1 getValue(SupplementaryData1 obj) {
			return obj.getEnvelope();
		}

		@Override
		public void setValue(SupplementaryData1 obj, SupplementaryDataEnvelope1 value) {
			obj.setEnvelope(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SupplementaryData1.mmPlaceAndName, com.tools20022.repository.msg.SupplementaryData1.mmEnvelope);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesTradeConfirmationCancellationV01.mmSupplementaryData, SecuritiesTradeConfirmationResponseV01.mmSupplementaryData,
						SecuritiesEndOfProcessReportV01.mmSupplementaryData, TotalPortfolioValuationReportV01.mmSupplementaryData, MarginReportV02.mmSupplementaryData, DefaultFundContributionReportV02.mmSupplementaryData,
						SecuritiesTradeConfirmationV03.mmSupplementaryData, SecuritiesTradeConfirmationStatusAdviceV02.mmSupplementaryData, StandingSettlementInstructionV01.mmSupplementaryData,
						StandingSettlementInstructionCancellationV01.mmSupplementaryData, StandingSettlementInstructionStatusAdviceV01.mmSupplementaryData, StandingSettlementInstructionDeletionV01.mmSupplementaryData,
						TradeLegNotificationV03.mmSupplementaryData, BuyInNotificationV03.mmSupplementaryData, NetPositionV03.mmSupplementaryData, BuyInConfirmationV03.mmSupplementaryData, TradeLegStatementV03.mmSupplementaryData,
						BuyInResponseV03.mmSupplementaryData, TradeLegNotificationCancellationV03.mmSupplementaryData, SecuritiesBalanceTransparencyReportStatusAdviceV01.mmSupplementaryData,
						SettlementObligationReportV03.mmSupplementaryData, MeetingInstructionCancellationRequestV05.mmSupplementaryData, MeetingNotificationV05.mmSupplementaryData, MeetingInstructionStatusV05.mmSupplementaryData,
						MeetingCancellationV05.mmSupplementaryData, MeetingResultDisseminationV05.mmSupplementaryData, MeetingVoteExecutionConfirmationV05.mmSupplementaryData, MeetingInstructionV05.mmSupplementaryData,
						MeetingEntitlementNotificationV05.mmSupplementaryData, IntraPositionMovementInstructionV04.mmSupplementaryData, SecuritiesStatusOrStatementQueryStatusAdviceV04.mmSupplementaryData,
						SecuritiesMessageCancellationAdviceV05.mmSupplementaryData, SecuritiesStatementQueryV06.mmSupplementaryData, SecuritiesSettlementTransactionModificationRequestStatusAdviceV04.mmSupplementaryData,
						SecuritiesSettlementConditionModificationStatusAdviceV07.mmSupplementaryData, SecuritiesTransactionStatusQueryV04.mmSupplementaryData, SecuritiesSettlementAllegementRemovalAdviceV04.mmSupplementaryData,
						SecuritiesTransactionCancellationRequestV05.mmSupplementaryData, SecuritiesTransactionCancellationRequestStatusAdviceV05.mmSupplementaryData,
						SecuritiesSettlementTransactionCounterpartyResponseV02.mmSupplementaryData, CorporateActionNarrativeV04.mmSupplementaryData, MarginCallRequestV04.mmSupplementaryData, InterestPaymentResponseV04.mmSupplementaryData,
						MarginCallDisputeNotificationV04.mmSupplementaryData, CollateralSubstitutionResponseV04.mmSupplementaryData, MarginCallResponseV04.mmSupplementaryData, InterestPaymentStatementV04.mmSupplementaryData,
						CollateralManagementCancellationRequestV04.mmSupplementaryData, CollateralSubstitutionConfirmationV04.mmSupplementaryData, InterestPaymentRequestV04.mmSupplementaryData,
						CollateralManagementCancellationStatusV04.mmSupplementaryData, CollateralSubstitutionRequestV04.mmSupplementaryData, CollateralAndExposureReportV03.mmSupplementaryData,
						MoneyMarketStatisticalReportStatusAdviceV01.mmSupplementaryData, SecuritiesBalanceTransparencyReportV02.mmSupplementaryData, CorporateActionEventProcessingStatusAdviceV06.mmSupplementaryData,
						CorporateActionInstructionCancellationRequestV07.mmSupplementaryData, IntraPositionMovementStatusAdviceV05.mmSupplementaryData, SecuritiesSettlementConditionsModificationRequestV07.mmSupplementaryData,
						SecuritiesFinancingModificationInstructionV06.mmSupplementaryData, SecuritiesFinancingStatusAdviceV07.mmSupplementaryData, CollateralProposalResponseV05.mmSupplementaryData,
						CollateralProposalV05.mmSupplementaryData, MoneyMarketUnsecuredMarketStatisticalReportV02.mmSupplementaryData, MoneyMarketForeignExchangeSwapsStatisticalReportV02.mmSupplementaryData,
						MoneyMarketSecuredMarketStatisticalReportV02.mmSupplementaryData, MoneyMarketOvernightIndexSwapsStatisticalReportV02.mmSupplementaryData,
						com.tools20022.repository.area.other.FinancialInstrumentReportingStatusAdviceV01.mmSupplementaryData, FinancialInstrumentReportingTradingVolumeCapDataReportV01.mmSupplementaryData,
						FinancialInstrumentReportingInstrumentClassificationReportV01.mmSupplementaryData, FinancialInstrumentReportingNonEquityTradingActivityResultV01.mmSupplementaryData,
						FinancialInstrumentReportingEquityTradingActivityResultV01.mmSupplementaryData, FinancialInstrumentReportingEquityTransparencyDataReportV01.mmSupplementaryData,
						FinancialInstrumentReportingReferenceDataReportV01.mmSupplementaryData, FinancialInstrumentReportingInvalidReferenceDataReportV01.mmSupplementaryData,
						com.tools20022.repository.area.auth.FinancialInstrumentReportingStatusAdviceV01.mmSupplementaryData, FinancialInstrumentReportingNonWorkingDayReportV01.mmSupplementaryData,
						FinancialInstrumentReportingTransactionReportV01.mmSupplementaryData, FinancialInstrumentReportingEquityTradingActivityReportV01.mmSupplementaryData,
						FinancialInstrumentReportingCurrencyCodeReportV01.mmSupplementaryData, FinancialInstrumentReportingReferenceDataIndexReportV01.mmSupplementaryData,
						FinancialInstrumentReportingMarketIdentificationCodeReportV01.mmSupplementaryData, FinancialInstrumentReportingNonEquityTransparencyDataReportV01.mmSupplementaryData,
						FinancialInstrumentReportingReferenceDataDeltaReportV01.mmSupplementaryData, FinancialInstrumentReportingCountryCodeReportV01.mmSupplementaryData,
						FinancialInstrumentReportingNonEquityTradingActivityReportV01.mmSupplementaryData, IntraPositionMovementConfirmationV07.mmSupplementaryData,
						SecuritiesSettlementTransactionGenerationNotificationV08.mmSupplementaryData, SecuritiesSettlementTransactionAllegementNotificationV07.mmSupplementaryData,
						SecuritiesSettlementTransactionConfirmationV08.mmSupplementaryData, SecuritiesFinancingInstructionV08.mmSupplementaryData, SecuritiesFinancingConfirmationV08.mmSupplementaryData,
						SecuritiesSettlementTransactionStatusAdviceV09.mmSupplementaryData, SecuritiesSettlementTransactionReversalAdviceV07.mmSupplementaryData, SecuritiesSettlementTransactionInstructionV08.mmSupplementaryData,
						CorporateActionInstructionStatementReportV07.mmSupplementaryData, CorporateActionMovementReversalAdviceV09.mmSupplementaryData, CorporateActionNotificationV08.mmSupplementaryData,
						CorporateActionInstructionV08.mmSupplementaryData, CorporateActionMovementConfirmationV09.mmSupplementaryData, CorporateActionMovementPreliminaryAdviceCancellationAdviceV08.mmSupplementaryData,
						CorporateActionMovementPreliminaryAdviceV09.mmSupplementaryData, CorporateActionInstructionStatusAdviceV09.mmSupplementaryData, CorporateActionCancellationAdviceV08.mmSupplementaryData,
						CorporateActionInstructionCancellationRequestStatusAdviceV08.mmSupplementaryData);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forSupplementaryData1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SupplementaryData1";
				definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getPlaceAndName() {
		return placeAndName == null ? Optional.empty() : Optional.of(placeAndName);
	}

	public SupplementaryData1 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
		return this;
	}

	public SupplementaryDataEnvelope1 getEnvelope() {
		return envelope;
	}

	public SupplementaryData1 setEnvelope(SupplementaryDataEnvelope1 envelope) {
		this.envelope = Objects.requireNonNull(envelope);
		return this;
	}
}