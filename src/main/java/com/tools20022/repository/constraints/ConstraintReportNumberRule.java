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
import com.tools20022.repository.msg.*;

/**
 * If Long number (Exact5NumericTest) is used, then the report must be a delta
 * reports (UpdateType: DELT).<br>
 * If the report has multiple pages, then the ReportNumber must remain the same
 * through all the pages. It is a unique number to the report.<br>
 * Two reports of the same type sent one after the other to the same receiver in
 * relation to the same safekeeping account must have different ReportNumbers.
 * For example, a daily report sent on day 1 would have ReportNumber 001, on day
 * 2, 002.
 */
public class ConstraintReportNumberRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement60 Statement60}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\r\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement60> forStatement60 = new MMConstraint<Statement60>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\r\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002.";
			owner_lazy = () -> Statement60.mmObject();
		}

		@Override
		public void executeValidator(Statement60 obj) throws Exception {
			checkStatement60(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement64 Statement64}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\r\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement64> forStatement64 = new MMConstraint<Statement64>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\r\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002.";
			owner_lazy = () -> Statement64.mmObject();
		}

		@Override
		public void executeValidator(Statement64 obj) throws Exception {
			checkStatement64(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement61 Statement61}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\r\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement61> forStatement61 = new MMConstraint<Statement61>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\r\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002.";
			owner_lazy = () -> Statement61.mmObject();
		}

		@Override
		public void executeValidator(Statement61 obj) throws Exception {
			checkStatement61(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReportParameters3
	 * ReportParameters3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReportParameters3> forReportParameters3 = new MMConstraint<ReportParameters3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> ReportParameters3.mmObject();
		}

		@Override
		public void executeValidator(ReportParameters3 obj) throws Exception {
			checkReportParameters3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement45 Statement45}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement45> forStatement45 = new MMConstraint<Statement45>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement45.mmObject();
		}

		@Override
		public void executeValidator(Statement45 obj) throws Exception {
			checkStatement45(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement63 Statement63}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\r\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement63> forStatement63 = new MMConstraint<Statement63>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\r\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002.";
			owner_lazy = () -> Statement63.mmObject();
		}

		@Override
		public void executeValidator(Statement63 obj) throws Exception {
			checkStatement63(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReportParameters1
	 * ReportParameters1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReportParameters1> forReportParameters1 = new MMConstraint<ReportParameters1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> ReportParameters1.mmObject();
		}

		@Override
		public void executeValidator(ReportParameters1 obj) throws Exception {
			checkReportParameters1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement40 Statement40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement40> forStatement40 = new MMConstraint<Statement40>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If Long number (Exact5NumericTest) is used, then the report must be a delta reports (UpdateType: DELT).\nIf the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement40.mmObject();
		}

		@Override
		public void executeValidator(Statement40 obj) throws Exception {
			checkStatement40(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement31 Statement31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement31> forStatement31 = new MMConstraint<Statement31>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumberRule";
			definition = "If the report has multiple pages, then the ReportNumber must remain the same through all the pages. It is a unique number to the report.\r\nTwo reports of the same type sent one after the other to the same receiver in relation to the same safekeeping account must have different ReportNumbers. For example, a daily report sent on day 1 would have ReportNumber 001, on day 2, 002, etc.";
			owner_lazy = () -> Statement31.mmObject();
		}

		@Override
		public void executeValidator(Statement31 obj) throws Exception {
			checkStatement31(obj);
		}
	};

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT).<br>
	 * If the report has multiple pages, then the ReportNumber must remain the
	 * same through all the pages. It is a unique number to the report.<br>
	 * Two reports of the same type sent one after the other to the same
	 * receiver in relation to the same safekeeping account must have different
	 * ReportNumbers. For example, a daily report sent on day 1 would have
	 * ReportNumber 001, on day 2, 002.
	 */
	public static void checkStatement60(Statement60 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT).<br>
	 * If the report has multiple pages, then the ReportNumber must remain the
	 * same through all the pages. It is a unique number to the report.<br>
	 * Two reports of the same type sent one after the other to the same
	 * receiver in relation to the same safekeeping account must have different
	 * ReportNumbers. For example, a daily report sent on day 1 would have
	 * ReportNumber 001, on day 2, 002.
	 */
	public static void checkStatement64(Statement64 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT).<br>
	 * If the report has multiple pages, then the ReportNumber must remain the
	 * same through all the pages. It is a unique number to the report.<br>
	 * Two reports of the same type sent one after the other to the same
	 * receiver in relation to the same safekeeping account must have different
	 * ReportNumbers. For example, a daily report sent on day 1 would have
	 * ReportNumber 001, on day 2, 002.
	 */
	public static void checkStatement61(Statement61 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the report has multiple pages, then the ReportNumber must remain the
	 * same through all the pages. It is a unique number to the report.<br>
	 * Two reports of the same type sent one after the other to the same
	 * receiver in relation to the same safekeeping account must have different
	 * ReportNumbers. For example, a daily report sent on day 1 would have
	 * ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkReportParameters3(ReportParameters3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT). If the report has multiple pages, then
	 * the ReportNumber must remain the same through all the pages. It is a
	 * unique number to the report. Two reports of the same type sent one after
	 * the other to the same receiver in relation to the same safekeeping
	 * account must have different ReportNumbers. For example, a daily report
	 * sent on day 1 would have ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkStatement45(Statement45 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT).<br>
	 * If the report has multiple pages, then the ReportNumber must remain the
	 * same through all the pages. It is a unique number to the report.<br>
	 * Two reports of the same type sent one after the other to the same
	 * receiver in relation to the same safekeeping account must have different
	 * ReportNumbers. For example, a daily report sent on day 1 would have
	 * ReportNumber 001, on day 2, 002.
	 */
	public static void checkStatement63(Statement63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the report has multiple pages, then the ReportNumber must remain the
	 * same through all the pages. It is a unique number to the report.<br>
	 * Two reports of the same type sent one after the other to the same
	 * receiver in relation to the same safekeeping account must have different
	 * ReportNumbers. For example, a daily report sent on day 1 would have
	 * ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkReportParameters1(ReportParameters1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Long number (Exact5NumericTest) is used, then the report must be a
	 * delta reports (UpdateType: DELT). If the report has multiple pages, then
	 * the ReportNumber must remain the same through all the pages. It is a
	 * unique number to the report. Two reports of the same type sent one after
	 * the other to the same receiver in relation to the same safekeeping
	 * account must have different ReportNumbers. For example, a daily report
	 * sent on day 1 would have ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkStatement40(Statement40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the report has multiple pages, then the ReportNumber must remain the
	 * same through all the pages. It is a unique number to the report.<br>
	 * Two reports of the same type sent one after the other to the same
	 * receiver in relation to the same safekeeping account must have different
	 * ReportNumbers. For example, a daily report sent on day 1 would have
	 * ReportNumber 001, on day 2, 002, etc.
	 */
	public static void checkStatement31(Statement31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}