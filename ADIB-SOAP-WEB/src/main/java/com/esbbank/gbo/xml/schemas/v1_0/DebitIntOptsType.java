
package com.esbbank.gbo.xml.schemas.v1_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DebitIntOptsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DebitIntOptsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{urn:esbbank.com/gbo/xml/schemas/v1_0/}DebitIntOpts"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebitIntOptsType")
public class DebitIntOptsType {

    @XmlAttribute(name = "Rate_Type")
    protected RateTypeType rateType;
    @XmlAttribute(name = "Current_Rate")
    protected BigDecimal currentRate;
    @XmlAttribute(name = "Index_Id")
    protected Integer indexId;
    @XmlAttribute(name = "Index_Name")
    protected String indexName;
    @XmlAttribute(name = "Index_Rate")
    protected BigDecimal indexRate;
    @XmlAttribute(name = "Margin")
    protected BigDecimal margin;
    @XmlAttribute(name = "Margin_Type")
    protected MarginTypeType marginType;
    @XmlAttribute(name = "Floor")
    protected BigDecimal floor;
    @XmlAttribute(name = "Ceiling")
    protected BigDecimal ceiling;
    @XmlAttribute(name = "Dep_Rate_Accrual")
    protected PenaltyRateType depRateAccrual;
    @XmlAttribute(name = "Nxt_Rate_Chg_Dt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nxtRateChgDt;
    @XmlAttribute(name = "Rate_Chg_Term")
    protected Integer rateChgTerm;
    @XmlAttribute(name = "Rate_Chg_Period")
    protected PeriodType rateChgPeriod;
    @XmlAttribute(name = "Prnt_Rt_Chg")
    protected Boolean prntRtChg;
    @XmlAttribute(name = "Max_No_Chg")
    protected Integer maxNoChg;
    @XmlAttribute(name = "Interest_Type")
    protected InterestTypeType interestType;
    @XmlAttribute(name = "Cal_Bal_Type")
    protected CalculatedBalanceType calBalType;
    @XmlAttribute(name = "Nxt_Comp_Dt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nxtCompDt;
    @XmlAttribute(name = "Compound_Term")
    protected Integer compoundTerm;
    @XmlAttribute(name = "Compound_Period")
    protected PeriodType compoundPeriod;
    @XmlAttribute(name = "Accrual_Basis")
    protected String accrualBasis;
    @XmlAttribute(name = "Min_Int_Amt")
    protected BigDecimal minIntAmt;
    @XmlAttribute(name = "Next_Chg_Dt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextChgDt;
    @XmlAttribute(name = "Charge_Term")
    protected Integer chargeTerm;
    @XmlAttribute(name = "Charge_Period")
    protected PeriodType chargePeriod;
    @XmlAttribute(name = "Tax1Rate")
    protected BigDecimal tax1Rate;
    @XmlAttribute(name = "Tax1Period")
    protected TaxPeriodType tax1Period;
    @XmlAttribute(name = "Tax2Rate")
    protected BigDecimal tax2Rate;
    @XmlAttribute(name = "Tax2Period")
    protected TaxPeriodType tax2Period;

    /**
     * Gets the value of the rateType property.
     * 
     * @return
     *     possible object is
     *     {@link RateTypeType }
     *     
     */
    public RateTypeType getRateType() {
        return rateType;
    }

    /**
     * Sets the value of the rateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateTypeType }
     *     
     */
    public void setRateType(RateTypeType value) {
        this.rateType = value;
    }

    /**
     * Gets the value of the currentRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentRate() {
        return currentRate;
    }

    /**
     * Sets the value of the currentRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentRate(BigDecimal value) {
        this.currentRate = value;
    }

    /**
     * Gets the value of the indexId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndexId() {
        return indexId;
    }

    /**
     * Sets the value of the indexId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndexId(Integer value) {
        this.indexId = value;
    }

    /**
     * Gets the value of the indexName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * Sets the value of the indexName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexName(String value) {
        this.indexName = value;
    }

    /**
     * Gets the value of the indexRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndexRate() {
        return indexRate;
    }

    /**
     * Sets the value of the indexRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndexRate(BigDecimal value) {
        this.indexRate = value;
    }

    /**
     * Gets the value of the margin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMargin() {
        return margin;
    }

    /**
     * Sets the value of the margin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMargin(BigDecimal value) {
        this.margin = value;
    }

    /**
     * Gets the value of the marginType property.
     * 
     * @return
     *     possible object is
     *     {@link MarginTypeType }
     *     
     */
    public MarginTypeType getMarginType() {
        return marginType;
    }

    /**
     * Sets the value of the marginType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginTypeType }
     *     
     */
    public void setMarginType(MarginTypeType value) {
        this.marginType = value;
    }

    /**
     * Gets the value of the floor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFloor() {
        return floor;
    }

    /**
     * Sets the value of the floor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFloor(BigDecimal value) {
        this.floor = value;
    }

    /**
     * Gets the value of the ceiling property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCeiling() {
        return ceiling;
    }

    /**
     * Sets the value of the ceiling property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCeiling(BigDecimal value) {
        this.ceiling = value;
    }

    /**
     * Gets the value of the depRateAccrual property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyRateType }
     *     
     */
    public PenaltyRateType getDepRateAccrual() {
        return depRateAccrual;
    }

    /**
     * Sets the value of the depRateAccrual property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyRateType }
     *     
     */
    public void setDepRateAccrual(PenaltyRateType value) {
        this.depRateAccrual = value;
    }

    /**
     * Gets the value of the nxtRateChgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNxtRateChgDt() {
        return nxtRateChgDt;
    }

    /**
     * Sets the value of the nxtRateChgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNxtRateChgDt(XMLGregorianCalendar value) {
        this.nxtRateChgDt = value;
    }

    /**
     * Gets the value of the rateChgTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRateChgTerm() {
        return rateChgTerm;
    }

    /**
     * Sets the value of the rateChgTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRateChgTerm(Integer value) {
        this.rateChgTerm = value;
    }

    /**
     * Gets the value of the rateChgPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getRateChgPeriod() {
        return rateChgPeriod;
    }

    /**
     * Sets the value of the rateChgPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setRateChgPeriod(PeriodType value) {
        this.rateChgPeriod = value;
    }

    /**
     * Gets the value of the prntRtChg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrntRtChg() {
        return prntRtChg;
    }

    /**
     * Sets the value of the prntRtChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrntRtChg(Boolean value) {
        this.prntRtChg = value;
    }

    /**
     * Gets the value of the maxNoChg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNoChg() {
        return maxNoChg;
    }

    /**
     * Sets the value of the maxNoChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNoChg(Integer value) {
        this.maxNoChg = value;
    }

    /**
     * Gets the value of the interestType property.
     * 
     * @return
     *     possible object is
     *     {@link InterestTypeType }
     *     
     */
    public InterestTypeType getInterestType() {
        return interestType;
    }

    /**
     * Sets the value of the interestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestTypeType }
     *     
     */
    public void setInterestType(InterestTypeType value) {
        this.interestType = value;
    }

    /**
     * Gets the value of the calBalType property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatedBalanceType }
     *     
     */
    public CalculatedBalanceType getCalBalType() {
        return calBalType;
    }

    /**
     * Sets the value of the calBalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatedBalanceType }
     *     
     */
    public void setCalBalType(CalculatedBalanceType value) {
        this.calBalType = value;
    }

    /**
     * Gets the value of the nxtCompDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNxtCompDt() {
        return nxtCompDt;
    }

    /**
     * Sets the value of the nxtCompDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNxtCompDt(XMLGregorianCalendar value) {
        this.nxtCompDt = value;
    }

    /**
     * Gets the value of the compoundTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompoundTerm() {
        return compoundTerm;
    }

    /**
     * Sets the value of the compoundTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompoundTerm(Integer value) {
        this.compoundTerm = value;
    }

    /**
     * Gets the value of the compoundPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getCompoundPeriod() {
        return compoundPeriod;
    }

    /**
     * Sets the value of the compoundPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setCompoundPeriod(PeriodType value) {
        this.compoundPeriod = value;
    }

    /**
     * Gets the value of the accrualBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccrualBasis() {
        return accrualBasis;
    }

    /**
     * Sets the value of the accrualBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccrualBasis(String value) {
        this.accrualBasis = value;
    }

    /**
     * Gets the value of the minIntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinIntAmt() {
        return minIntAmt;
    }

    /**
     * Sets the value of the minIntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinIntAmt(BigDecimal value) {
        this.minIntAmt = value;
    }

    /**
     * Gets the value of the nextChgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextChgDt() {
        return nextChgDt;
    }

    /**
     * Sets the value of the nextChgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextChgDt(XMLGregorianCalendar value) {
        this.nextChgDt = value;
    }

    /**
     * Gets the value of the chargeTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChargeTerm() {
        return chargeTerm;
    }

    /**
     * Sets the value of the chargeTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChargeTerm(Integer value) {
        this.chargeTerm = value;
    }

    /**
     * Gets the value of the chargePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getChargePeriod() {
        return chargePeriod;
    }

    /**
     * Sets the value of the chargePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setChargePeriod(PeriodType value) {
        this.chargePeriod = value;
    }

    /**
     * Gets the value of the tax1Rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTax1Rate() {
        return tax1Rate;
    }

    /**
     * Sets the value of the tax1Rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTax1Rate(BigDecimal value) {
        this.tax1Rate = value;
    }

    /**
     * Gets the value of the tax1Period property.
     * 
     * @return
     *     possible object is
     *     {@link TaxPeriodType }
     *     
     */
    public TaxPeriodType getTax1Period() {
        return tax1Period;
    }

    /**
     * Sets the value of the tax1Period property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxPeriodType }
     *     
     */
    public void setTax1Period(TaxPeriodType value) {
        this.tax1Period = value;
    }

    /**
     * Gets the value of the tax2Rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTax2Rate() {
        return tax2Rate;
    }

    /**
     * Sets the value of the tax2Rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTax2Rate(BigDecimal value) {
        this.tax2Rate = value;
    }

    /**
     * Gets the value of the tax2Period property.
     * 
     * @return
     *     possible object is
     *     {@link TaxPeriodType }
     *     
     */
    public TaxPeriodType getTax2Period() {
        return tax2Period;
    }

    /**
     * Sets the value of the tax2Period property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxPeriodType }
     *     
     */
    public void setTax2Period(TaxPeriodType value) {
        this.tax2Period = value;
    }

}
