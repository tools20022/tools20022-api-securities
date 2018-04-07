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

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.msg.EstimatedFundCashForecast5;
import com.tools20022.repository.msg.EstimatedFundCashForecast6;
import com.tools20022.repository.msg.FundCashForecast6;
import com.tools20022.repository.msg.FundCashForecast7;

/**
 * If ExceptionalNetCashFlowIndicator is "true" or "1" (Yes), then at least one
 * or more of the following must be present:<br>
 * BreakdownByParty/CashInForecast/ExceptionalCashFlowIndicator, or<br>
 * BreakdownByParty/CashOutForecast/ExceptionalCashFlowIndicator, or<br>
 * BreakdownByCountry/CashInForecast/ExceptionalCashFlowIndicator, or<br>
 * BreakdownByCountry/CashOutForecast/ExceptionalCashFlowIndicator, or<br>
 * BreakdownByCurrency/CashInForecast/ExceptionalCashFlowIndicator, or<br>
 * BreakdownByCurrency/CashOutForecast/ExceptionalCashFlowIndicator, or<br>
 * BreakdownByUserDefinedParameter/CashInForecast/ExceptionalCashFlowIndicator,
 * or<br>
 * BreakdownByUserDefinedParameter/CashOutForecast/ExceptionalCashFlowIndicator.
 */
public class ConstraintExceptionalCashFlowIndicatorRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5
	 * EstimatedFundCashForecast5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceptionalCashFlowIndicatorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ExceptionalNetCashFlowIndicator is \"true\" or \"1\" (Yes), then at least one or more of the following must be present:\r\nBreakdownByParty/CashInForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByParty/CashOutForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByCountry/CashInForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByCountry/CashOutForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByCurrency/CashInForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByCurrency/CashOutForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByUserDefinedParameter/CashInForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByUserDefinedParameter/CashOutForecast/ExceptionalCashFlowIndicator."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<EstimatedFundCashForecast5> forEstimatedFundCashForecast5 = new MMConstraint<EstimatedFundCashForecast5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceptionalCashFlowIndicatorRule";
			definition = "If ExceptionalNetCashFlowIndicator is \"true\" or \"1\" (Yes), then at least one or more of the following must be present:\r\nBreakdownByParty/CashInForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByParty/CashOutForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByCountry/CashInForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByCountry/CashOutForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByCurrency/CashInForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByCurrency/CashOutForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByUserDefinedParameter/CashInForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByUserDefinedParameter/CashOutForecast/ExceptionalCashFlowIndicator.";
			owner_lazy = () -> EstimatedFundCashForecast5.mmObject();
		}

		@Override
		public void executeValidator(EstimatedFundCashForecast5 obj) throws Exception {
			checkEstimatedFundCashForecast5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6
	 * FundCashForecast6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceptionalCashFlowIndicatorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ExceptionalNetCashFlowIndicator is \"true\" or \"1\" (Yes), then at least one or more of the following must be present:\r\nBreakdownByParty/CashInForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByParty/CashOutForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByCountry/CashInForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByCountry/CashOutForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByCurrency/CashInForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByCurrency/CashOutForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByUserDefinedParameter/CashInForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByUserDefinedParameter/CashOutForecast/ExceptionalCashFlowIndicator.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FundCashForecast6> forFundCashForecast6 = new MMConstraint<FundCashForecast6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceptionalCashFlowIndicatorRule";
			definition = "If ExceptionalNetCashFlowIndicator is \"true\" or \"1\" (Yes), then at least one or more of the following must be present:\r\nBreakdownByParty/CashInForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByParty/CashOutForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByCountry/CashInForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByCountry/CashOutForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByCurrency/CashInForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByCurrency/CashOutForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByUserDefinedParameter/CashInForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByUserDefinedParameter/CashOutForecast/ExceptionalCashFlowIndicator.\r\n";
			owner_lazy = () -> FundCashForecast6.mmObject();
		}

		@Override
		public void executeValidator(FundCashForecast6 obj) throws Exception {
			checkFundCashForecast6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceptionalCashFlowIndicatorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Exceptional NetCashFlowIndicator is \"true\" or \"1\" (Yes), then either EstimatedCashInForecastDetails/ExceptionalCashFlowIndicator or EstimatedCashOutForecastDetails/ExceptionalCashFlowIndicator must be present. Both may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<EstimatedFundCashForecast6> forEstimatedFundCashForecast6 = new MMConstraint<EstimatedFundCashForecast6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceptionalCashFlowIndicatorRule";
			definition = "If Exceptional NetCashFlowIndicator is \"true\" or \"1\" (Yes), then either EstimatedCashInForecastDetails/ExceptionalCashFlowIndicator or EstimatedCashOutForecastDetails/ExceptionalCashFlowIndicator must be present. Both may be present.";
			owner_lazy = () -> EstimatedFundCashForecast6.mmObject();
		}

		@Override
		public void executeValidator(EstimatedFundCashForecast6 obj) throws Exception {
			checkEstimatedFundCashForecast6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7
	 * FundCashForecast7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceptionalCashFlowIndicatorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Exceptional NetCashFlow Indicator is \"true\" or \"1\" (Yes), then CashInForecastDetails/ExceptionalCashFlowIndicator and CashOutForecastDetails/ ExceptionalCashFlowIndicator must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FundCashForecast7> forFundCashForecast7 = new MMConstraint<FundCashForecast7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceptionalCashFlowIndicatorRule";
			definition = "If Exceptional NetCashFlow Indicator is \"true\" or \"1\" (Yes), then CashInForecastDetails/ExceptionalCashFlowIndicator and CashOutForecastDetails/ ExceptionalCashFlowIndicator must be present.";
			owner_lazy = () -> FundCashForecast7.mmObject();
		}

		@Override
		public void executeValidator(FundCashForecast7 obj) throws Exception {
			checkFundCashForecast7(obj);
		}
	};

	/**
	 * If ExceptionalNetCashFlowIndicator is "true" or "1" (Yes), then at least
	 * one or more of the following must be present:<br>
	 * BreakdownByParty/CashInForecast/ExceptionalCashFlowIndicator, or<br>
	 * BreakdownByParty/CashOutForecast/ExceptionalCashFlowIndicator, or<br>
	 * BreakdownByCountry/CashInForecast/ExceptionalCashFlowIndicator, or<br>
	 * BreakdownByCountry/CashOutForecast/ExceptionalCashFlowIndicator, or<br>
	 * BreakdownByCurrency/CashInForecast/ExceptionalCashFlowIndicator, or<br>
	 * BreakdownByCurrency/CashOutForecast/ExceptionalCashFlowIndicator, or<br>
	 * BreakdownByUserDefinedParameter/CashInForecast/
	 * ExceptionalCashFlowIndicator, or<br>
	 * BreakdownByUserDefinedParameter/CashOutForecast/
	 * ExceptionalCashFlowIndicator.
	 */
	public static void checkEstimatedFundCashForecast5(EstimatedFundCashForecast5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ExceptionalNetCashFlowIndicator is "true" or "1" (Yes), then at least
	 * one or more of the following must be present:<br>
	 * BreakdownByParty/CashInForecast/ExceptionalCashFlowIndicator, or<br>
	 * BreakdownByParty/CashOutForecast/ExceptionalCashFlowIndicator, or<br>
	 * BreakdownByCountry/CashInForecast/ExceptionalCashFlowIndicator, or<br>
	 * BreakdownByCountry/CashOutForecast/ExceptionalCashFlowIndicator, or<br>
	 * BreakdownByCurrency/CashInForecast/ExceptionalCashFlowIndicator, or<br>
	 * BreakdownByCurrency/CashOutForecast/ExceptionalCashFlowIndicator, or<br>
	 * BreakdownByUserDefinedParameter/CashInForecast/
	 * ExceptionalCashFlowIndicator, or<br>
	 * BreakdownByUserDefinedParameter/CashOutForecast/
	 * ExceptionalCashFlowIndicator.<br>
	 */
	public static void checkFundCashForecast6(FundCashForecast6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Exceptional NetCashFlowIndicator is "true" or "1" (Yes), then either
	 * EstimatedCashInForecastDetails/ExceptionalCashFlowIndicator or
	 * EstimatedCashOutForecastDetails/ExceptionalCashFlowIndicator must be
	 * present. Both may be present.
	 */
	public static void checkEstimatedFundCashForecast6(EstimatedFundCashForecast6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Exceptional NetCashFlow Indicator is "true" or "1" (Yes), then
	 * CashInForecastDetails/ExceptionalCashFlowIndicator and
	 * CashOutForecastDetails/ ExceptionalCashFlowIndicator must be present.
	 */
	public static void checkFundCashForecast7(FundCashForecast7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}