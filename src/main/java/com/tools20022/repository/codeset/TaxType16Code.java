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
import com.tools20022.repository.codeset.TaxType16Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of tax.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxType16Code#ConsumptionTax
 * TaxType16Code.mmConsumptionTax}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxType16Code#TaxCredit
 * TaxType16Code.mmTaxCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxType16Code#EUTaxRetention
 * TaxType16Code.mmEUTaxRetention}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxType16Code#PaymentLevyTax
 * TaxType16Code.mmPaymentLevyTax}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxType16Code#LocalTax
 * TaxType16Code.mmLocalTax}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxType16Code#NationalTax
 * TaxType16Code.mmNationalTax}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxType16Code#Provincial
 * TaxType16Code.mmProvincial}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxType16Code#StampDuty
 * TaxType16Code.mmStampDuty}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxType16Code#StateTax
 * TaxType16Code.mmStateTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxType16Code#StockExchangeTax
 * TaxType16Code.mmStockExchangeTax}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxType16Code#TransferTax
 * TaxType16Code.mmTransferTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxType16Code#TransactionTax
 * TaxType16Code.mmTransactionTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxType16Code#ValueAddedTax
 * TaxType16Code.mmValueAddedTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxType16Code#WithholdingTax
 * TaxType16Code.mmWithholdingTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxType16Code#CapitalLossCredit
 * TaxType16Code.mmCapitalLossCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxType16Code#CapitalGainTax
 * TaxType16Code.mmCapitalGainTax}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
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
 * "TaxType16Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of tax."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TaxType16Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType16Code
	 * TaxType16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsumptionTax"</li>
	 * </ul>
	 */
	public static final TaxType16Code ConsumptionTax = new TaxType16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsumptionTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType16Code.mmObject();
			codeName = TaxTypeCode.ConsumptionTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType16Code
	 * TaxType16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCredit"</li>
	 * </ul>
	 */
	public static final TaxType16Code TaxCredit = new TaxType16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCredit";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType16Code.mmObject();
			codeName = TaxTypeCode.TaxCredit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType16Code
	 * TaxType16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUTaxRetention"</li>
	 * </ul>
	 */
	public static final TaxType16Code EUTaxRetention = new TaxType16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUTaxRetention";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType16Code.mmObject();
			codeName = TaxTypeCode.EUTaxRetention.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType16Code
	 * TaxType16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentLevyTax"</li>
	 * </ul>
	 */
	public static final TaxType16Code PaymentLevyTax = new TaxType16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentLevyTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType16Code.mmObject();
			codeName = TaxTypeCode.PaymentLevyTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType16Code
	 * TaxType16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalTax"</li>
	 * </ul>
	 */
	public static final TaxType16Code LocalTax = new TaxType16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType16Code.mmObject();
			codeName = TaxTypeCode.LocalTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType16Code
	 * TaxType16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalTax"</li>
	 * </ul>
	 */
	public static final TaxType16Code NationalTax = new TaxType16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NationalTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType16Code.mmObject();
			codeName = TaxTypeCode.NationalTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType16Code
	 * TaxType16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Provincial"</li>
	 * </ul>
	 */
	public static final TaxType16Code Provincial = new TaxType16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Provincial";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType16Code.mmObject();
			codeName = TaxTypeCode.Provincial.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType16Code
	 * TaxType16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDuty"</li>
	 * </ul>
	 */
	public static final TaxType16Code StampDuty = new TaxType16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDuty";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType16Code.mmObject();
			codeName = TaxTypeCode.StampDuty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType16Code
	 * TaxType16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StateTax"</li>
	 * </ul>
	 */
	public static final TaxType16Code StateTax = new TaxType16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StateTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType16Code.mmObject();
			codeName = TaxTypeCode.StateTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType16Code
	 * TaxType16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockExchangeTax"</li>
	 * </ul>
	 */
	public static final TaxType16Code StockExchangeTax = new TaxType16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockExchangeTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType16Code.mmObject();
			codeName = TaxTypeCode.StockExchangeTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType16Code
	 * TaxType16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferTax"</li>
	 * </ul>
	 */
	public static final TaxType16Code TransferTax = new TaxType16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType16Code.mmObject();
			codeName = TaxTypeCode.TransferTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType16Code
	 * TaxType16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTax"</li>
	 * </ul>
	 */
	public static final TaxType16Code TransactionTax = new TaxType16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType16Code.mmObject();
			codeName = TaxTypeCode.TransactionTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType16Code
	 * TaxType16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueAddedTax"</li>
	 * </ul>
	 */
	public static final TaxType16Code ValueAddedTax = new TaxType16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueAddedTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType16Code.mmObject();
			codeName = TaxTypeCode.ValueAddedTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType16Code
	 * TaxType16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTax"</li>
	 * </ul>
	 */
	public static final TaxType16Code WithholdingTax = new TaxType16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType16Code.mmObject();
			codeName = TaxTypeCode.WithholdingTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType16Code
	 * TaxType16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalLossCredit"</li>
	 * </ul>
	 */
	public static final TaxType16Code CapitalLossCredit = new TaxType16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalLossCredit";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType16Code.mmObject();
			codeName = TaxTypeCode.CapitalLossCredit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType16Code
	 * TaxType16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGainTax"</li>
	 * </ul>
	 */
	public static final TaxType16Code CapitalGainTax = new TaxType16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGainTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType16Code.mmObject();
			codeName = TaxTypeCode.CapitalGainTax.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TaxType16Code> codesByName = new LinkedHashMap<>();

	protected TaxType16Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxType16Code";
				definition = "Specifies the type of tax.";
				trace_lazy = () -> TaxTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxType16Code.ConsumptionTax, com.tools20022.repository.codeset.TaxType16Code.TaxCredit, com.tools20022.repository.codeset.TaxType16Code.EUTaxRetention,
						com.tools20022.repository.codeset.TaxType16Code.PaymentLevyTax, com.tools20022.repository.codeset.TaxType16Code.LocalTax, com.tools20022.repository.codeset.TaxType16Code.NationalTax,
						com.tools20022.repository.codeset.TaxType16Code.Provincial, com.tools20022.repository.codeset.TaxType16Code.StampDuty, com.tools20022.repository.codeset.TaxType16Code.StateTax,
						com.tools20022.repository.codeset.TaxType16Code.StockExchangeTax, com.tools20022.repository.codeset.TaxType16Code.TransferTax, com.tools20022.repository.codeset.TaxType16Code.TransactionTax,
						com.tools20022.repository.codeset.TaxType16Code.ValueAddedTax, com.tools20022.repository.codeset.TaxType16Code.WithholdingTax, com.tools20022.repository.codeset.TaxType16Code.CapitalLossCredit,
						com.tools20022.repository.codeset.TaxType16Code.CapitalGainTax);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ConsumptionTax.getCodeName().get(), ConsumptionTax);
		codesByName.put(TaxCredit.getCodeName().get(), TaxCredit);
		codesByName.put(EUTaxRetention.getCodeName().get(), EUTaxRetention);
		codesByName.put(PaymentLevyTax.getCodeName().get(), PaymentLevyTax);
		codesByName.put(LocalTax.getCodeName().get(), LocalTax);
		codesByName.put(NationalTax.getCodeName().get(), NationalTax);
		codesByName.put(Provincial.getCodeName().get(), Provincial);
		codesByName.put(StampDuty.getCodeName().get(), StampDuty);
		codesByName.put(StateTax.getCodeName().get(), StateTax);
		codesByName.put(StockExchangeTax.getCodeName().get(), StockExchangeTax);
		codesByName.put(TransferTax.getCodeName().get(), TransferTax);
		codesByName.put(TransactionTax.getCodeName().get(), TransactionTax);
		codesByName.put(ValueAddedTax.getCodeName().get(), ValueAddedTax);
		codesByName.put(WithholdingTax.getCodeName().get(), WithholdingTax);
		codesByName.put(CapitalLossCredit.getCodeName().get(), CapitalLossCredit);
		codesByName.put(CapitalGainTax.getCodeName().get(), CapitalGainTax);
	}

	public static TaxType16Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TaxType16Code[] values() {
		TaxType16Code[] values = new TaxType16Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TaxType16Code> {
		@Override
		public TaxType16Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TaxType16Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}