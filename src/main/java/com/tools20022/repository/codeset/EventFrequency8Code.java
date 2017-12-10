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
import com.tools20022.repository.codeset.EventFrequency8Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the regularity of an event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.EventFrequency8Code#Adhoc
 * EventFrequency8Code.mmAdhoc}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventFrequency8Code#Annual
 * EventFrequency8Code.mmAnnual}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventFrequency8Code#Daily
 * EventFrequency8Code.mmDaily}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency8Code#EveryFourMonths
 * EventFrequency8Code.mmEveryFourMonths}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency8Code#EveryTwoMonths
 * EventFrequency8Code.mmEveryTwoMonths}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency8Code#EveryTwoWeeks
 * EventFrequency8Code.mmEveryTwoWeeks}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency8Code#EveryTwoYears
 * EventFrequency8Code.mmEveryTwoYears}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency8Code#IntraDay
 * EventFrequency8Code.mmIntraDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency8Code#Monthly
 * EventFrequency8Code.mmMonthly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency8Code#OnDemand
 * EventFrequency8Code.mmOnDemand}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency8Code#Overnight
 * EventFrequency8Code.mmOvernight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency8Code#Quarterly
 * EventFrequency8Code.mmQuarterly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency8Code#SemiAnnual
 * EventFrequency8Code.mmSemiAnnual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency8Code#TwiceAMonth
 * EventFrequency8Code.mmTwiceAMonth}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventFrequency8Code#Weekly
 * EventFrequency8Code.mmWeekly}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode
 * EventFrequencyCode}</li>
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
 * "EventFrequency8Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the regularity of an event."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class EventFrequency8Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency8Code
	 * EventFrequency8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Adhoc"</li>
	 * </ul>
	 */
	public static final EventFrequency8Code Adhoc = new EventFrequency8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Adhoc";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency8Code.mmObject();
			codeName = EventFrequencyCode.Adhoc.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency8Code
	 * EventFrequency8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Annual"</li>
	 * </ul>
	 */
	public static final EventFrequency8Code Annual = new EventFrequency8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Annual";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency8Code.mmObject();
			codeName = EventFrequencyCode.Annual.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency8Code
	 * EventFrequency8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Daily"</li>
	 * </ul>
	 */
	public static final EventFrequency8Code Daily = new EventFrequency8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Daily";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency8Code.mmObject();
			codeName = EventFrequencyCode.Daily.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency8Code
	 * EventFrequency8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EveryFourMonths"</li>
	 * </ul>
	 */
	public static final EventFrequency8Code EveryFourMonths = new EventFrequency8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EveryFourMonths";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency8Code.mmObject();
			codeName = EventFrequencyCode.EveryFourMonths.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency8Code
	 * EventFrequency8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EveryTwoMonths"</li>
	 * </ul>
	 */
	public static final EventFrequency8Code EveryTwoMonths = new EventFrequency8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EveryTwoMonths";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency8Code.mmObject();
			codeName = EventFrequencyCode.EveryTwoMonths.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency8Code
	 * EventFrequency8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EveryTwoWeeks"</li>
	 * </ul>
	 */
	public static final EventFrequency8Code EveryTwoWeeks = new EventFrequency8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EveryTwoWeeks";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency8Code.mmObject();
			codeName = EventFrequencyCode.EveryTwoWeeks.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency8Code
	 * EventFrequency8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EveryTwoYears"</li>
	 * </ul>
	 */
	public static final EventFrequency8Code EveryTwoYears = new EventFrequency8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EveryTwoYears";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency8Code.mmObject();
			codeName = EventFrequencyCode.EveryTwoYears.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency8Code
	 * EventFrequency8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraDay"</li>
	 * </ul>
	 */
	public static final EventFrequency8Code IntraDay = new EventFrequency8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraDay";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency8Code.mmObject();
			codeName = EventFrequencyCode.IntraDay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency8Code
	 * EventFrequency8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Monthly"</li>
	 * </ul>
	 */
	public static final EventFrequency8Code Monthly = new EventFrequency8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Monthly";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency8Code.mmObject();
			codeName = EventFrequencyCode.Monthly.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency8Code
	 * EventFrequency8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnDemand"</li>
	 * </ul>
	 */
	public static final EventFrequency8Code OnDemand = new EventFrequency8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnDemand";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency8Code.mmObject();
			codeName = EventFrequencyCode.OnDemand.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency8Code
	 * EventFrequency8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Overnight"</li>
	 * </ul>
	 */
	public static final EventFrequency8Code Overnight = new EventFrequency8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Overnight";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency8Code.mmObject();
			codeName = EventFrequencyCode.Overnight.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency8Code
	 * EventFrequency8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quarterly"</li>
	 * </ul>
	 */
	public static final EventFrequency8Code Quarterly = new EventFrequency8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quarterly";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency8Code.mmObject();
			codeName = EventFrequencyCode.Quarterly.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency8Code
	 * EventFrequency8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SemiAnnual"</li>
	 * </ul>
	 */
	public static final EventFrequency8Code SemiAnnual = new EventFrequency8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SemiAnnual";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency8Code.mmObject();
			codeName = EventFrequencyCode.SemiAnnual.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency8Code
	 * EventFrequency8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwiceAMonth"</li>
	 * </ul>
	 */
	public static final EventFrequency8Code TwiceAMonth = new EventFrequency8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwiceAMonth";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency8Code.mmObject();
			codeName = EventFrequencyCode.TwiceAMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency8Code
	 * EventFrequency8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Weekly"</li>
	 * </ul>
	 */
	public static final EventFrequency8Code Weekly = new EventFrequency8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Weekly";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency8Code.mmObject();
			codeName = EventFrequencyCode.Weekly.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, EventFrequency8Code> codesByName = new LinkedHashMap<>();

	protected EventFrequency8Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EventFrequency8Code";
				definition = "Specifies the regularity of an event.";
				trace_lazy = () -> EventFrequencyCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EventFrequency8Code.Adhoc, com.tools20022.repository.codeset.EventFrequency8Code.Annual, com.tools20022.repository.codeset.EventFrequency8Code.Daily,
						com.tools20022.repository.codeset.EventFrequency8Code.EveryFourMonths, com.tools20022.repository.codeset.EventFrequency8Code.EveryTwoMonths, com.tools20022.repository.codeset.EventFrequency8Code.EveryTwoWeeks,
						com.tools20022.repository.codeset.EventFrequency8Code.EveryTwoYears, com.tools20022.repository.codeset.EventFrequency8Code.IntraDay, com.tools20022.repository.codeset.EventFrequency8Code.Monthly,
						com.tools20022.repository.codeset.EventFrequency8Code.OnDemand, com.tools20022.repository.codeset.EventFrequency8Code.Overnight, com.tools20022.repository.codeset.EventFrequency8Code.Quarterly,
						com.tools20022.repository.codeset.EventFrequency8Code.SemiAnnual, com.tools20022.repository.codeset.EventFrequency8Code.TwiceAMonth, com.tools20022.repository.codeset.EventFrequency8Code.Weekly);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Adhoc.getCodeName().get(), Adhoc);
		codesByName.put(Annual.getCodeName().get(), Annual);
		codesByName.put(Daily.getCodeName().get(), Daily);
		codesByName.put(EveryFourMonths.getCodeName().get(), EveryFourMonths);
		codesByName.put(EveryTwoMonths.getCodeName().get(), EveryTwoMonths);
		codesByName.put(EveryTwoWeeks.getCodeName().get(), EveryTwoWeeks);
		codesByName.put(EveryTwoYears.getCodeName().get(), EveryTwoYears);
		codesByName.put(IntraDay.getCodeName().get(), IntraDay);
		codesByName.put(Monthly.getCodeName().get(), Monthly);
		codesByName.put(OnDemand.getCodeName().get(), OnDemand);
		codesByName.put(Overnight.getCodeName().get(), Overnight);
		codesByName.put(Quarterly.getCodeName().get(), Quarterly);
		codesByName.put(SemiAnnual.getCodeName().get(), SemiAnnual);
		codesByName.put(TwiceAMonth.getCodeName().get(), TwiceAMonth);
		codesByName.put(Weekly.getCodeName().get(), Weekly);
	}

	public static EventFrequency8Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static EventFrequency8Code[] values() {
		EventFrequency8Code[] values = new EventFrequency8Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, EventFrequency8Code> {
		@Override
		public EventFrequency8Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(EventFrequency8Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}