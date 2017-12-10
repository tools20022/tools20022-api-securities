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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ReportPeriodActivity3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of report activity for a specific reporting period.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportPeriodActivity3Code#NoTransaction
 * ReportPeriodActivity3Code.mmNoTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportPeriodActivity3Code#NoReportFromAgent
 * ReportPeriodActivity3Code.mmNoReportFromAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ReportPeriodActivityCode
 * ReportPeriodActivityCode}</li>
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
 * "ReportPeriodActivity3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of report activity for a specific reporting period."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ReportPeriodActivity3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportPeriodActivity3Code
	 * ReportPeriodActivity3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoTransaction"</li>
	 * </ul>
	 */
	public static final ReportPeriodActivity3Code NoTransaction = new ReportPeriodActivity3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportPeriodActivity3Code.mmObject();
			codeName = ReportPeriodActivityCode.NoTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportPeriodActivity3Code
	 * ReportPeriodActivity3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoReportFromAgent"</li>
	 * </ul>
	 */
	public static final ReportPeriodActivity3Code NoReportFromAgent = new ReportPeriodActivity3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoReportFromAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportPeriodActivity3Code.mmObject();
			codeName = ReportPeriodActivityCode.NoReportFromAgent.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ReportPeriodActivity3Code> codesByName = new LinkedHashMap<>();

	protected ReportPeriodActivity3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReportPeriodActivity3Code";
				definition = "Specifies the type of report activity for a specific reporting period.";
				trace_lazy = () -> ReportPeriodActivityCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReportPeriodActivity3Code.NoTransaction, com.tools20022.repository.codeset.ReportPeriodActivity3Code.NoReportFromAgent);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NoTransaction.getCodeName().get(), NoTransaction);
		codesByName.put(NoReportFromAgent.getCodeName().get(), NoReportFromAgent);
	}

	public static ReportPeriodActivity3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ReportPeriodActivity3Code[] values() {
		ReportPeriodActivity3Code[] values = new ReportPeriodActivity3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ReportPeriodActivity3Code> {
		@Override
		public ReportPeriodActivity3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ReportPeriodActivity3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}