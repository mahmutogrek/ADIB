
package com.esbbank.gbo.xml.schemas.v1_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreditIntOptsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditIntOptsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{urn:esbbank.com/gbo/xml/schemas/v1_0/}CreditIntOpts"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditIntOptsType")
public class CreditIntOptsType {

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
    @XmlAttribute(name = "Reaccrual_Bal_Type")
    protected CalBalanceType reaccrualBalType;
    @XmlAttribute(name = "Reaccrual_Bal")
    protected BigDecimal reaccrualBal;
    @XmlAttribute(name = "Reaccrual_Rate")
    protected BigDecimal reaccrualRate;
    @XmlAttribute(name = "Zero_Accrual_bal_Type")
    protected CalculatedBalanceType zeroAccrualBalType;
    @XmlAttribute(name = "Zero_Accrual_bal")
    protected BigDecimal zeroAccrualBal;
    @XmlAttribute(name = "IntWh")
    protected String intWh;
    @XmlAttribute(name = "Fed_WithHold_rate")
    protected BigDecimal fedWithHoldRate;
    @XmlAttribute(name = "St_WithHold_rate")
    protected BigDecimal stWithHoldRate;
    @XmlAttribute(name = "Other_WithHold_rate")
    protected BigDecimal otherWithHoldRate;
    @XmlAttribute(name = "Backup_WithHold")
    protected BackupWithHoldType backupWithHold;
    @XmlAttribute(name = "WithHold_Status_Chg_Dt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar withHoldStatusChgDt;
    @XmlAttribute(name = "Backup_WithHold_St_dt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar backupWithHoldStDt;
    @XmlAttribute(name = "Backup_WithHold_Reason")
    protected String backupWithHoldReason;
    @XmlAttribute(name = "Tax1Rate")
    protected BigDecimal tax1Rate;
    @XmlAttribute(name = "Tax1Period")
    protected TaxPeriodType tax1Period;
    @XmlAttribute(name = "Tax2Rate")
    protected BigDecimal tax2Rate;
    @XmlAttribute(name = "Tax2Period")
    protected TaxPeriodType tax2Period;
    @XmlAttribute(name = "Fed_Int_WithHold")
    protected Boolean fedIntWithHold;
    @XmlAttribute(name = "Fed_WithHold_Thrshld")
    protected BigDecimal fedWithHoldThrshld;
    @XmlAttribute(name = "Fed_WithHold_Bal_Type")
    protected CalculatedBalanceType fedWithHoldBalType;
    @XmlAttribute(name = "St_Int_WithHold")
    protected Boolean stIntWithHold;
    @XmlAttribute(name = "St_WithHold_Thrshld")
    protected BigDecimal stWithHoldThrshld;
    @XmlAttribute(name = "St_WithHold_Bal_Type")
    protected CalculatedBalanceType stWithHoldBalType;
    @XmlAttribute(name = "Oth_Int_WithHold")
    protected Boolean othIntWithHold;
    @XmlAttribute(name = "Oth_WithHold_Thrshld")
    protected BigDecimal othWithHoldThrshld;
    @XmlAttribute(name = "Oth_WithHold_Bal_Type")
    protected CalculatedBalanceType othWithHoldBalType;
    @XmlAttribute(name = "Accr_Type")
    protected String accrType;
    @XmlAttribute(name = "Accr_Term")
    protected Integer accrTerm;
    @XmlAttribute(name = "Accr_Period")
    protected PeriodType accrPeriod;
    @XmlAttribute(name = "No_Days_ToOpen")
    protected Integer noDaysToOpen;
    @XmlAttribute(name = "No_Days_ToClose")
    protected Integer noDaysToClose;
    @XmlAttribute(name = "No_Grace_Days")
    protected Integer noGraceDays;
    @XmlAttribute(name = "First_Calc_Dt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstCalcDt;
    @XmlAttribute(name = "Nxt_Pmt_dt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nxtPmtDt;

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
     * Gets the value of the reaccrualBalType property.
     * 
     * @return
     *     possible object is
     *     {@link CalBalanceType }
     *     
     */
    public CalBalanceType getReaccrualBalType() {
        return reaccrualBalType;
    }

    /**
     * Sets the value of the reaccrualBalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalBalanceType }
     *     
     */
    public void setReaccrualBalType(CalBalanceType value) {
        this.reaccrualBalType = value;
    }

    /**
     * Gets the value of the reaccrualBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReaccrualBal() {
        return reaccrualBal;
    }

    /**
     * Sets the value of the reaccrualBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReaccrualBal(BigDecimal value) {
        this.reaccrualBal = value;
    }

    /**
     * Gets the value of the reaccrualRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReaccrualRate() {
        return reaccrualRate;
    }

    /**
     * Sets the value of the reaccrualRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReaccrualRate(BigDecimal value) {
        this.reaccrualRate = value;
    }

    /**
     * Gets the value of the zeroAccrualBalType property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatedBalanceType }
     *     
     */
    public CalculatedBalanceType getZeroAccrualBalType() {
        return zeroAccrualBalType;
    }

    /**
     * Sets the value of the zeroAccrualBalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatedBalanceType }
     *     
     */
    public void setZeroAccrualBalType(CalculatedBalanceType value) {
        this.zeroAccrualBalType = value;
    }

    /**
     * Gets the value of the zeroAccrualBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getZeroAccrualBal() {
        return zeroAccrualBal;
    }

    /**
     * Sets the value of the zeroAccrualBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setZeroAccrualBal(BigDecimal value) {
        this.zeroAccrualBal = value;
    }

    /**
     * Gets the value of the intWh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntWh() {
        return intWh;
    }

    /**
     * Sets the value of the intWh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntWh(String value) {
        this.intWh = value;
    }

    /**
     * Gets the value of the fedWithHoldRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFedWithHoldRate() {
        return fedWithHoldRate;
    }

    /**
     * Sets the value of the fedWithHoldRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFedWithHoldRate(BigDecimal value) {
        this.fedWithHoldRate = value;
    }

    /**
     * Gets the value of the stWithHoldRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStWithHoldRate() {
        return stWithHoldRate;
    }

    /**
     * Sets the value of the stWithHoldRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStWithHoldRate(BigDecimal value) {
        this.stWithHoldRate = value;
    }

    /**
     * Gets the value of the otherWithHoldRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherWithHoldRate() {
        return otherWithHoldRate;
    }

    /**
     * Sets the value of the otherWithHoldRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherWithHoldRate(BigDecimal value) {
        this.otherWithHoldRate = value;
    }

    /**
     * Gets the value of the backupWithHold property.
     * 
     * @return
     *     possible object is
     *     {@link BackupWithHoldType }
     *     
     */
    public BackupWithHoldType getBackupWithHold() {
        return backupWithHold;
    }

    /**
     * Sets the value of the backupWithHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BackupWithHoldType }
     *     
     */
    public void setBackupWithHold(BackupWithHoldType value) {
        this.backupWithHold = value;
    }

    /**
     * Gets the value of the withHoldStatusChgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWithHoldStatusChgDt() {
        return withHoldStatusChgDt;
    }

    /**
     * Sets the value of the withHoldStatusChgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWithHoldStatusChgDt(XMLGregorianCalendar value) {
        this.withHoldStatusChgDt = value;
    }

    /**
     * Gets the value of the backupWithHoldStDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBackupWithHoldStDt() {
        return backupWithHoldStDt;
    }

    /**
     * Sets the value of the backupWithHoldStDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBackupWithHoldStDt(XMLGregorianCalendar value) {
        this.backupWithHoldStDt = value;
    }

    /**
     * Gets the value of the backupWithHoldReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackupWithHoldReason() {
        return backupWithHoldReason;
    }

    /**
     * Sets the value of the backupWithHoldReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackupWithHoldReason(String value) {
        this.backupWithHoldReason = value;
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

    /**
     * Gets the value of the fedIntWithHold property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFedIntWithHold() {
        return fedIntWithHold;
    }

    /**
     * Sets the value of the fedIntWithHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFedIntWithHold(Boolean value) {
        this.fedIntWithHold = value;
    }

    /**
     * Gets the value of the fedWithHoldThrshld property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFedWithHoldThrshld() {
        return fedWithHoldThrshld;
    }

    /**
     * Sets the value of the fedWithHoldThrshld property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFedWithHoldThrshld(BigDecimal value) {
        this.fedWithHoldThrshld = value;
    }

    /**
     * Gets the value of the fedWithHoldBalType property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatedBalanceType }
     *     
     */
    public CalculatedBalanceType getFedWithHoldBalType() {
        return fedWithHoldBalType;
    }

    /**
     * Sets the value of the fedWithHoldBalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatedBalanceType }
     *     
     */
    public void setFedWithHoldBalType(CalculatedBalanceType value) {
        this.fedWithHoldBalType = value;
    }

    /**
     * Gets the value of the stIntWithHold property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStIntWithHold() {
        return stIntWithHold;
    }

    /**
     * Sets the value of the stIntWithHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStIntWithHold(Boolean value) {
        this.stIntWithHold = value;
    }

    /**
     * Gets the value of the stWithHoldThrshld property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStWithHoldThrshld() {
        return stWithHoldThrshld;
    }

    /**
     * Sets the value of the stWithHoldThrshld property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStWithHoldThrshld(BigDecimal value) {
        this.stWithHoldThrshld = value;
    }

    /**
     * Gets the value of the stWithHoldBalType property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatedBalanceType }
     *     
     */
    public CalculatedBalanceType getStWithHoldBalType() {
        return stWithHoldBalType;
    }

    /**
     * Sets the value of the stWithHoldBalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatedBalanceType }
     *     
     */
    public void setStWithHoldBalType(CalculatedBalanceType value) {
        this.stWithHoldBalType = value;
    }

    /**
     * Gets the value of the othIntWithHold property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOthIntWithHold() {
        return othIntWithHold;
    }

    /**
     * Sets the value of the othIntWithHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOthIntWithHold(Boolean value) {
        this.othIntWithHold = value;
    }

    /**
     * Gets the value of the othWithHoldThrshld property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOthWithHoldThrshld() {
        return othWithHoldThrshld;
    }

    /**
     * Sets the value of the othWithHoldThrshld property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOthWithHoldThrshld(BigDecimal value) {
        this.othWithHoldThrshld = value;
    }

    /**
     * Gets the value of the othWithHoldBalType property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatedBalanceType }
     *     
     */
    public CalculatedBalanceType getOthWithHoldBalType() {
        return othWithHoldBalType;
    }

    /**
     * Sets the value of the othWithHoldBalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatedBalanceType }
     *     
     */
    public void setOthWithHoldBalType(CalculatedBalanceType value) {
        this.othWithHoldBalType = value;
    }

    /**
     * Gets the value of the accrType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccrType() {
        return accrType;
    }

    /**
     * Sets the value of the accrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccrType(String value) {
        this.accrType = value;
    }

    /**
     * Gets the value of the accrTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccrTerm() {
        return accrTerm;
    }

    /**
     * Sets the value of the accrTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccrTerm(Integer value) {
        this.accrTerm = value;
    }

    /**
     * Gets the value of the accrPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getAccrPeriod() {
        return accrPeriod;
    }

    /**
     * Sets the value of the accrPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setAccrPeriod(PeriodType value) {
        this.accrPeriod = value;
    }

    /**
     * Gets the value of the noDaysToOpen property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoDaysToOpen() {
        return noDaysToOpen;
    }

    /**
     * Sets the value of the noDaysToOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoDaysToOpen(Integer value) {
        this.noDaysToOpen = value;
    }

    /**
     * Gets the value of the noDaysToClose property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoDaysToClose() {
        return noDaysToClose;
    }

    /**
     * Sets the value of the noDaysToClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoDaysToClose(Integer value) {
        this.noDaysToClose = value;
    }

    /**
     * Gets the value of the noGraceDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoGraceDays() {
        return noGraceDays;
    }

    /**
     * Sets the value of the noGraceDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoGraceDays(Integer value) {
        this.noGraceDays = value;
    }

    /**
     * Gets the value of the firstCalcDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstCalcDt() {
        return firstCalcDt;
    }

    /**
     * Sets the value of the firstCalcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstCalcDt(XMLGregorianCalendar value) {
        this.firstCalcDt = value;
    }

    /**
     * Gets the value of the nxtPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNxtPmtDt() {
        return nxtPmtDt;
    }

    /**
     * Sets the value of the nxtPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNxtPmtDt(XMLGregorianCalendar value) {
        this.nxtPmtDt = value;
    }

}
