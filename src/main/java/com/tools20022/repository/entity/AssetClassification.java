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
import com.tools20022.repository.choice.ClassificationType1Choice;
import com.tools20022.repository.choice.ClassificationType30Choice;
import com.tools20022.repository.choice.ClassificationType32Choice;
import com.tools20022.repository.choice.EquityDerivative3Choice;
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.codeset.ProductTypeCode;
import com.tools20022.repository.datatype.CFIOct2015Identifier;
import com.tools20022.repository.entity.Asset;
import com.tools20022.repository.entity.AssetClassStrategy;
import com.tools20022.repository.entity.Scheme;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Other classification type of the security, ie, other than ISO 10962.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AssetClassification" src="doc-files/AssetClassification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmClassificationType
 * AssetClassification.mmClassificationType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetClassification#mmAsset
 * AssetClassification.mmAsset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmLanguage
 * AssetClassification.mmLanguage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmAssetClassScheme
 * AssetClassification.mmAssetClassScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmProductType
 * AssetClassification.mmProductType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmStrategy
 * AssetClassification.mmStrategy}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmAssetClassification
 * Asset.mmAssetClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Scheme#mmAssetClassification
 * Scheme.mmAssetClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetClassStrategy#mmAssetClass
 * AssetClassStrategy.mmAssetClass}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.ClassificationType1Choice
 * ClassificationType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ClassificationType30Choice
 * ClassificationType30Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ClassificationType32Choice
 * ClassificationType32Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AssetClass2 AssetClass2}</li>
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
 * "AssetClassification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Other classification type of the security, ie, other than ISO 10962."</li>
 * </ul>
 */
public class AssetClassification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CFIOct2015Identifier classificationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CFIOct2015Identifier
	 * CFIOct2015Identifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType1Choice#mmClassificationFinancialInstrument
	 * ClassificationType1Choice.mmClassificationFinancialInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType1Choice#mmAlternateClassification
	 * ClassificationType1Choice.mmAlternateClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType30Choice#mmClassificationFinancialInstrument
	 * ClassificationType30Choice.mmClassificationFinancialInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType30Choice#mmAlternateClassification
	 * ClassificationType30Choice.mmAlternateClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmClassificationType
	 * FinancialInstrumentAttributes44.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmClassificationType
	 * FinancialInstrumentAttributes63.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmClassificationType
	 * FinancialInstrumentAttributes64.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType32Choice#mmClassificationFinancialInstrument
	 * ClassificationType32Choice.mmClassificationFinancialInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType32Choice#mmAlternateClassification
	 * ClassificationType32Choice.mmAlternateClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation7#mmType
	 * CollateralValuation7.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9#mmClassificationType
	 * SecurityInstrumentDescription9.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription11#mmClassificationType
	 * SecurityInstrumentDescription11.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11#mmFinancialInstrumentClassification
	 * TransparencyDataReport11.mmFinancialInstrumentClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#mmFinancialInstrumentClassification
	 * TransparencyDataReport10.mmFinancialInstrumentClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmClassificationType
	 * FinancialInstrumentAttributes79.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#mmClassificationType
	 * FinancialInstrumentAttributes81.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmClassificationType
	 * FinancialInstrumentAttributes80.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91#mmClassificationType
	 * FinancialInstrumentAttributes91.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes92#mmClassificationType
	 * FinancialInstrumentAttributes92.mmClassificationType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification
	 * AssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Classification type of the financial instrument, as per the ISO Classification of Financial Instrument (CFI) codification, for example, common share with voting rights, fully paid, or registered."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AssetClassification, CFIOct2015Identifier> mmClassificationType = new MMBusinessAttribute<AssetClassification, CFIOct2015Identifier>() {
		{
			derivation_lazy = () -> Arrays.asList(ClassificationType1Choice.mmClassificationFinancialInstrument, ClassificationType1Choice.mmAlternateClassification, ClassificationType30Choice.mmClassificationFinancialInstrument,
					ClassificationType30Choice.mmAlternateClassification, FinancialInstrumentAttributes44.mmClassificationType, FinancialInstrumentAttributes63.mmClassificationType, FinancialInstrumentAttributes64.mmClassificationType,
					ClassificationType32Choice.mmClassificationFinancialInstrument, ClassificationType32Choice.mmAlternateClassification, CollateralValuation7.mmType, SecurityInstrumentDescription9.mmClassificationType,
					SecurityInstrumentDescription11.mmClassificationType, TransparencyDataReport11.mmFinancialInstrumentClassification, TransparencyDataReport10.mmFinancialInstrumentClassification,
					FinancialInstrumentAttributes79.mmClassificationType, FinancialInstrumentAttributes81.mmClassificationType, FinancialInstrumentAttributes80.mmClassificationType, FinancialInstrumentAttributes91.mmClassificationType,
					FinancialInstrumentAttributes92.mmClassificationType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetClassification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClassificationType";
			definition = "Classification type of the financial instrument, as per the ISO Classification of Financial Instrument (CFI) codification, for example, common share with voting rights, fully paid, or registered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CFIOct2015Identifier.mmObject();
		}

		@Override
		public CFIOct2015Identifier getValue(AssetClassification obj) {
			return obj.getClassificationType();
		}

		@Override
		public void setValue(AssetClassification obj, CFIOct2015Identifier value) {
			obj.setClassificationType(value);
		}
	};
	protected Asset asset;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmAssetClassification
	 * Asset.mmAssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification
	 * AssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Asset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset for which classification information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<AssetClassification, Optional<Asset>> mmAsset = new MMBusinessAssociationEnd<AssetClassification, Optional<Asset>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetClassification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Asset";
			definition = "Asset for which classification information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Asset.mmAssetClassification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Asset.mmObject();
		}

		@Override
		public Optional<Asset> getValue(AssetClassification obj) {
			return obj.getAsset();
		}

		@Override
		public void setValue(AssetClassification obj, Optional<Asset> value) {
			obj.setAsset(value.orElse(null));
		}
	};
	protected LanguageCode language;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.LanguageCode
	 * LanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification
	 * AssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Language"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Language in which the asset classification is expressed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AssetClassification, LanguageCode> mmLanguage = new MMBusinessAttribute<AssetClassification, LanguageCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetClassification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Language";
			definition = "Language in which the asset classification is expressed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}

		@Override
		public LanguageCode getValue(AssetClassification obj) {
			return obj.getLanguage();
		}

		@Override
		public void setValue(AssetClassification obj, LanguageCode value) {
			obj.setLanguage(value);
		}
	};
	protected Scheme assetClassScheme;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Scheme#mmAssetClassification
	 * Scheme.mmAssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Scheme Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification
	 * AssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetClassScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information regarding the entity that assigns the asset classification."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<AssetClassification, Scheme> mmAssetClassScheme = new MMBusinessAssociationEnd<AssetClassification, Scheme>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetClassification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AssetClassScheme";
			definition = "Information regarding the entity that assigns the asset classification.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Scheme.mmAssetClassification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Scheme.mmObject();
		}

		@Override
		public Scheme getValue(AssetClassification obj) {
			return obj.getAssetClassScheme();
		}

		@Override
		public void setValue(AssetClassification obj, Scheme value) {
			obj.setAssetClassScheme(value);
		}
	};
	protected ProductTypeCode productType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeCode
	 * ProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#mmDerivativeContractType
	 * TransparencyDataReport10.mmDerivativeContractType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DebtInstrument5#mmType
	 * DebtInstrument5.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EquityDerivative3Choice#mmBasket
	 * EquityDerivative3Choice.mmBasket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EquityDerivative3Choice#mmIndex
	 * EquityDerivative3Choice.mmIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EquityDerivative3Choice#mmSingleName
	 * EquityDerivative3Choice.mmSingleName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EquityDerivative3Choice#mmOther
	 * EquityDerivative3Choice.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmInstrumentType
	 * UnsecuredMarketTransaction4.mmInstrumentType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification
	 * AssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the product type."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AssetClassification, ProductTypeCode> mmProductType = new MMBusinessAttribute<AssetClassification, ProductTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(TransparencyDataReport10.mmDerivativeContractType, DebtInstrument5.mmType, EquityDerivative3Choice.mmBasket, EquityDerivative3Choice.mmIndex, EquityDerivative3Choice.mmSingleName,
					EquityDerivative3Choice.mmOther, UnsecuredMarketTransaction4.mmInstrumentType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetClassification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProductType";
			definition = "Identifies the product type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProductTypeCode.mmObject();
		}

		@Override
		public ProductTypeCode getValue(AssetClassification obj) {
			return obj.getProductType();
		}

		@Override
		public void setValue(AssetClassification obj, ProductTypeCode value) {
			obj.setProductType(value);
		}
	};
	protected AssetClassStrategy strategy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassStrategy#mmAssetClass
	 * AssetClassStrategy.mmAssetClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetClassStrategy
	 * AssetClassStrategy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification
	 * AssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Strategy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Strategy related to a class of assets."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<AssetClassification, Optional<AssetClassStrategy>> mmStrategy = new MMBusinessAssociationEnd<AssetClassification, Optional<AssetClassStrategy>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetClassification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Strategy";
			definition = "Strategy related to a class of assets.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> AssetClassStrategy.mmAssetClass;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AssetClassStrategy.mmObject();
		}

		@Override
		public Optional<AssetClassStrategy> getValue(AssetClassification obj) {
			return obj.getStrategy();
		}

		@Override
		public void setValue(AssetClassification obj, Optional<AssetClassStrategy> value) {
			obj.setStrategy(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClassification";
				definition = "Other classification type of the security, ie, other than ISO 10962.";
				associationDomain_lazy = () -> Arrays.asList(Asset.mmAssetClassification, Scheme.mmAssetClassification, AssetClassStrategy.mmAssetClass);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AssetClassification.mmClassificationType, com.tools20022.repository.entity.AssetClassification.mmAsset,
						com.tools20022.repository.entity.AssetClassification.mmLanguage, com.tools20022.repository.entity.AssetClassification.mmAssetClassScheme, com.tools20022.repository.entity.AssetClassification.mmProductType,
						com.tools20022.repository.entity.AssetClassification.mmStrategy);
				derivationComponent_lazy = () -> Arrays.asList(ClassificationType1Choice.mmObject(), ClassificationType30Choice.mmObject(), ClassificationType32Choice.mmObject(), AssetClass2.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return AssetClassification.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CFIOct2015Identifier getClassificationType() {
		return classificationType;
	}

	public AssetClassification setClassificationType(CFIOct2015Identifier classificationType) {
		this.classificationType = Objects.requireNonNull(classificationType);
		return this;
	}

	public Optional<Asset> getAsset() {
		return asset == null ? Optional.empty() : Optional.of(asset);
	}

	public AssetClassification setAsset(Asset asset) {
		this.asset = asset;
		return this;
	}

	public LanguageCode getLanguage() {
		return language;
	}

	public AssetClassification setLanguage(LanguageCode language) {
		this.language = Objects.requireNonNull(language);
		return this;
	}

	public Scheme getAssetClassScheme() {
		return assetClassScheme;
	}

	public AssetClassification setAssetClassScheme(Scheme assetClassScheme) {
		this.assetClassScheme = Objects.requireNonNull(assetClassScheme);
		return this;
	}

	public ProductTypeCode getProductType() {
		return productType;
	}

	public AssetClassification setProductType(ProductTypeCode productType) {
		this.productType = Objects.requireNonNull(productType);
		return this;
	}

	public Optional<AssetClassStrategy> getStrategy() {
		return strategy == null ? Optional.empty() : Optional.of(strategy);
	}

	public AssetClassification setStrategy(AssetClassStrategy strategy) {
		this.strategy = strategy;
		return this;
	}
}