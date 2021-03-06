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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.reda.InvestmentFundReportRequestV02;
import com.tools20022.repository.codeset.NoCriteria1Code;
import com.tools20022.repository.entity.InvestmentFund;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FundParameters4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of fund parameters.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FundParameters3Choice#mmNoCriteria
 * FundParameters3Choice.mmNoCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FundParameters3Choice#mmParameters
 * FundParameters3Choice.mmParameters}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFund
 * InvestmentFund}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.InvestmentFundReportRequestV02#mmFundProcessingPassportReport
 * InvestmentFundReportRequestV02.mmFundProcessingPassportReport}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintReportParameterRule1#forFundParameters3Choice
 * ConstraintReportParameterRule1.forFundParameters3Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FundParameters3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of fund parameters."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FundParameters3Choice", propOrder = {"noCriteria", "parameters"})
public class FundParameters3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NoCrit", required = true)
	protected NoCriteria1Code noCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NoCriteria1Code
	 * NoCriteria1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FundParameters3Choice
	 * FundParameters3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NoCrit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that there is no criteria for the report. The request is a request for all reports, rather than reports attributed to a specific fund manager, date or financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FundParameters3Choice, NoCriteria1Code> mmNoCriteria = new MMMessageAttribute<FundParameters3Choice, NoCriteria1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.FundParameters3Choice.mmObject();
			isDerived = false;
			xmlTag = "NoCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCriteria";
			definition = "Specifies that there is no criteria for the report. The request is a request for all reports, rather than reports attributed to a specific fund manager, date or financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NoCriteria1Code.mmObject();
		}

		@Override
		public NoCriteria1Code getValue(FundParameters3Choice obj) {
			return obj.getNoCriteria();
		}

		@Override
		public void setValue(FundParameters3Choice obj, NoCriteria1Code value) {
			obj.setNoCriteria(value);
		}
	};
	@XmlElement(name = "Params", required = true)
	protected FundParameters4 parameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FundParameters4
	 * FundParameters4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FundParameters3Choice
	 * FundParameters3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Params"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Parameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Report parameters."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FundParameters3Choice, FundParameters4> mmParameters = new MMMessageAssociationEnd<FundParameters3Choice, FundParameters4>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.FundParameters3Choice.mmObject();
			isDerived = false;
			xmlTag = "Params";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Parameters";
			definition = "Report parameters.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FundParameters4.mmObject();
		}

		@Override
		public FundParameters4 getValue(FundParameters3Choice obj) {
			return obj.getParameters();
		}

		@Override
		public void setValue(FundParameters3Choice obj, FundParameters4 value) {
			obj.setParameters(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.FundParameters3Choice.mmNoCriteria, com.tools20022.repository.choice.FundParameters3Choice.mmParameters);
				messageBuildingBlock_lazy = () -> Arrays.asList(InvestmentFundReportRequestV02.mmFundProcessingPassportReport);
				trace_lazy = () -> InvestmentFund.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReportParameterRule1.forFundParameters3Choice);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundParameters3Choice";
				definition = "Choice of fund parameters.";
			}
		});
		return mmObject_lazy.get();
	}

	public NoCriteria1Code getNoCriteria() {
		return noCriteria;
	}

	public FundParameters3Choice setNoCriteria(NoCriteria1Code noCriteria) {
		this.noCriteria = Objects.requireNonNull(noCriteria);
		return this;
	}

	public FundParameters4 getParameters() {
		return parameters;
	}

	public FundParameters3Choice setParameters(FundParameters4 parameters) {
		this.parameters = Objects.requireNonNull(parameters);
		return this;
	}
}