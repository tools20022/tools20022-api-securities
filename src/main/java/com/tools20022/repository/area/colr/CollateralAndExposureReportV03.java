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

package com.tools20022.repository.area.colr;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.CollateralManagementLatestVersion;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The CollateralAndExposureReport message is sent:<br>
 * - either by the collateral giver, or its collateral manager, to the
 * collateral taker, or its collateral manager, or<br>
 * - or by the collateral taker, or its collateral manager to the collateral
 * giver, or its collateral manager<br>
 * <br>
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.<br>
 * <br>
 * <b>Usage</b><br>
 * The CollateralAndExposureReport is used to provide the details of the
 * valuation of the collateral, that is, the valuation of securities collateral,
 * cash collateral or other type of collateral, posted at a specific calculation
 * date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV03#mmReportParameters
 * CollateralAndExposureReportV03.mmReportParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV03#mmPagination
 * CollateralAndExposureReportV03.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV03#mmObligation
 * CollateralAndExposureReportV03.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV03#mmAgreement
 * CollateralAndExposureReportV03.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV03#mmCollateralReport
 * CollateralAndExposureReportV03.mmCollateralReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV03#mmSupplementaryData
 * CollateralAndExposureReportV03.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CollAndXpsrRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CollateralManagementLatestVersion
 * CollateralManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code colr.016.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralAndExposureReportV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe CollateralAndExposureReport message is sent:\r\n- either by the collateral giver, or its collateral manager, to the collateral taker, or its collateral manager, or\r\n- or by the collateral taker, or its collateral manager to the collateral giver, or its collateral manager\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nThe CollateralAndExposureReport is used to provide the details of the valuation of the collateral, that is, the valuation of securities collateral, cash collateral or other type of collateral, posted at a specific calculation date."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CollateralAndExposureReportV03", propOrder = {"reportParameters", "pagination", "obligation", "agreement", "collateralReport", "supplementaryData"})
public class CollateralAndExposureReportV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RptParams", required = true)
	protected ReportParameters5 reportParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ReportParameters5
	 * ReportParameters5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the report such as the report identification, the report date and time or the report frequency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CollateralAndExposureReportV03, ReportParameters5> mmReportParameters = new MMMessageBuildingBlock<CollateralAndExposureReportV03, ReportParameters5>() {
		{
			xmlTag = "RptParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportParameters";
			definition = "Provides information about the report such as the report identification, the report date and time or the report frequency.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ReportParameters5.mmObject();
		}

		@Override
		public ReportParameters5 getValue(CollateralAndExposureReportV03 obj) {
			return obj.getReportParameters();
		}

		@Override
		public void setValue(CollateralAndExposureReportV03 obj, ReportParameters5 value) {
			obj.setReportParameters(value);
		}
	};
	@XmlElement(name = "Pgntn")
	protected Pagination pagination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Pagination
	 * Pagination}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pgntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the page number and an indicator of whether it is the only or last page, or if there are additional pages. \r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CollateralAndExposureReportV03, Optional<Pagination>> mmPagination = new MMMessageBuildingBlock<CollateralAndExposureReportV03, Optional<Pagination>>() {
		{
			xmlTag = "Pgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pagination";
			definition = "Specifies the page number and an indicator of whether it is the only or last page, or if there are additional pages. \r\n";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Pagination.mmObject();
		}

		@Override
		public Optional<Pagination> getValue(CollateralAndExposureReportV03 obj) {
			return obj.getPagination();
		}

		@Override
		public void setValue(CollateralAndExposureReportV03 obj, Optional<Pagination> value) {
			obj.setPagination(value.orElse(null));
		}
	};
	@XmlElement(name = "Oblgtn", required = true)
	protected Obligation4 obligation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Obligation4
	 * Obligation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Oblgtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Obligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CollateralAndExposureReportV03, Obligation4> mmObligation = new MMMessageBuildingBlock<CollateralAndExposureReportV03, Obligation4>() {
		{
			xmlTag = "Oblgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Obligation";
			definition = "Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Obligation4.mmObject();
		}

		@Override
		public Obligation4 getValue(CollateralAndExposureReportV03 obj) {
			return obj.getObligation();
		}

		@Override
		public void setValue(CollateralAndExposureReportV03 obj, Obligation4 value) {
			obj.setObligation(value);
		}
	};
	@XmlElement(name = "Agrmt")
	protected Agreement4 agreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Agreement4
	 * Agreement4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Agrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agreement details for the over the counter market."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CollateralAndExposureReportV03, Optional<Agreement4>> mmAgreement = new MMMessageBuildingBlock<CollateralAndExposureReportV03, Optional<Agreement4>>() {
		{
			xmlTag = "Agrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agreement";
			definition = "Agreement details for the over the counter market.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Agreement4.mmObject();
		}

		@Override
		public Optional<Agreement4> getValue(CollateralAndExposureReportV03 obj) {
			return obj.getAgreement();
		}

		@Override
		public void setValue(CollateralAndExposureReportV03 obj, Optional<Agreement4> value) {
			obj.setAgreement(value.orElse(null));
		}
	};
	@XmlElement(name = "CollRpt", required = true)
	protected List<Collateral13> collateralReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Collateral13
	 * Collateral13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the collateral report."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CollateralAndExposureReportV03, List<Collateral13>> mmCollateralReport = new MMMessageBuildingBlock<CollateralAndExposureReportV03, List<Collateral13>>() {
		{
			xmlTag = "CollRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralReport";
			definition = "Provides details on the collateral report.";
			minOccurs = 1;
			complexType_lazy = () -> Collateral13.mmObject();
		}

		@Override
		public List<Collateral13> getValue(CollateralAndExposureReportV03 obj) {
			return obj.getCollateralReport();
		}

		@Override
		public void setValue(CollateralAndExposureReportV03 obj, List<Collateral13> value) {
			obj.setCollateralReport(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CollateralAndExposureReportV03, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<CollateralAndExposureReportV03, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(CollateralAndExposureReportV03 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(CollateralAndExposureReportV03 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralAndExposureReportV03";
				definition = "Scope\r\nThe CollateralAndExposureReport message is sent:\r\n- either by the collateral giver, or its collateral manager, to the collateral taker, or its collateral manager, or\r\n- or by the collateral taker, or its collateral manager to the collateral giver, or its collateral manager\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nThe CollateralAndExposureReport is used to provide the details of the valuation of the collateral, that is, the valuation of securities collateral, cash collateral or other type of collateral, posted at a specific calculation date.";
				rootElement = "Document";
				xmlTag = "CollAndXpsrRpt";
				businessArea_lazy = () -> CollateralManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.colr.CollateralAndExposureReportV03.mmReportParameters, com.tools20022.repository.area.colr.CollateralAndExposureReportV03.mmPagination,
						com.tools20022.repository.area.colr.CollateralAndExposureReportV03.mmObligation, com.tools20022.repository.area.colr.CollateralAndExposureReportV03.mmAgreement,
						com.tools20022.repository.area.colr.CollateralAndExposureReportV03.mmCollateralReport, com.tools20022.repository.area.colr.CollateralAndExposureReportV03.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "colr";
						messageFunctionality = "016";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CollateralAndExposureReportV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ReportParameters5 getReportParameters() {
		return reportParameters;
	}

	public CollateralAndExposureReportV03 setReportParameters(ReportParameters5 reportParameters) {
		this.reportParameters = Objects.requireNonNull(reportParameters);
		return this;
	}

	public Optional<Pagination> getPagination() {
		return pagination == null ? Optional.empty() : Optional.of(pagination);
	}

	public CollateralAndExposureReportV03 setPagination(Pagination pagination) {
		this.pagination = pagination;
		return this;
	}

	public Obligation4 getObligation() {
		return obligation;
	}

	public CollateralAndExposureReportV03 setObligation(Obligation4 obligation) {
		this.obligation = Objects.requireNonNull(obligation);
		return this;
	}

	public Optional<Agreement4> getAgreement() {
		return agreement == null ? Optional.empty() : Optional.of(agreement);
	}

	public CollateralAndExposureReportV03 setAgreement(Agreement4 agreement) {
		this.agreement = agreement;
		return this;
	}

	public List<Collateral13> getCollateralReport() {
		return collateralReport == null ? collateralReport = new ArrayList<>() : collateralReport;
	}

	public CollateralAndExposureReportV03 setCollateralReport(List<Collateral13> collateralReport) {
		this.collateralReport = Objects.requireNonNull(collateralReport);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CollateralAndExposureReportV03 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.016.001.03")
	static public class Document {
		@XmlElement(name = "CollAndXpsrRpt", required = true)
		public CollateralAndExposureReportV03 messageBody;
	}
}