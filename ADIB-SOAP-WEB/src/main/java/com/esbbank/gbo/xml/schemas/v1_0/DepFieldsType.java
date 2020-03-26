
package com.esbbank.gbo.xml.schemas.v1_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DepFieldsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepFieldsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{urn:esbbank.com/gbo/xml/schemas/v1_0/}DEP_FIELDS"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepFieldsType")
public class DepFieldsType {

    @XmlAttribute(name = "Number_of_Signatures")
    protected Integer numberOfSignatures;
    @XmlAttribute(name = "Close_at_Zero")
    protected YNTYPE closeAtZero;
    @XmlAttribute(name = "Face_Amount")
    protected BigDecimal faceAmount;
    @XmlAttribute(name = "Default_Cycle_Code")
    protected String defaultCycleCode;
    @XmlAttribute(name = "Default_Cycle_Description")
    protected String defaultCycleDescription;
    @XmlAttribute(name = "Synchronize_Dates")
    protected YNTYPE synchronizeDates;
    @XmlAttribute(name = "OID_Flag")
    protected YNTYPE oidFlag;
    @XmlAttribute(name = "Penalty_Method")
    protected PenaltyMethodType penaltyMethod;
    @XmlAttribute(name = "Penalty_Rate_Type")
    protected PenaltyRateType penaltyRateType;
    @XmlAttribute(name = "Penalty_Term")
    protected Integer penaltyTerm;
    @XmlAttribute(name = "Penalty_Period")
    protected TermPeriodType penaltyPeriod;
    @XmlAttribute(name = "FR2900_Code")
    protected String fr2900Code;
    @XmlAttribute(name = "FR2900_Description")
    protected String fr2900Description;
    @XmlAttribute(name = "ClassDescription")
    protected String classDescription;
    @XmlAttribute(name = "Branch_Name")
    protected String branchName;
    @XmlAttribute(name = "RSM_ID")
    protected Integer rsmid;
    @XmlAttribute(name = "RSM_Name")
    protected String rsmName;
    @XmlAttribute(name = "Title_Line2")
    protected String titleLine2;
    @XmlAttribute(name = "Reg_CC_Code")
    protected RegCCCodeType regCCCode;
    @XmlAttribute(name = "Regulation_DD_Code")
    protected RegulationDDCodeType regulationDDCode;
    @XmlAttribute(name = "PC_Call_Report_Code")
    protected String pcCallReportCode;
    @XmlAttribute(name = "PC_Call_Report_Description")
    protected String pcCallReportDescription;
    @XmlAttribute(name = "Public_Funds_Code")
    protected String publicFundsCode;
    @XmlAttribute(name = "Public_Funds_Description")
    protected String publicFundsDescription;
    @XmlAttribute(name = "Passbook")
    protected YNTYPE passbook;
    @XmlAttribute(name = "Opening_Reason_Id")
    protected Integer openingReasonId;
    @XmlAttribute(name = "Opening_Reason_Description")
    protected String openingReasonDescription;
    @XmlAttribute(name = "Source_Funds_Id")
    protected Integer sourceFundsId;
    @XmlAttribute(name = "Source_Funds_Description")
    protected String sourceFundsDescription;
    @XmlAttribute(name = "Census_Tract")
    protected BigDecimal censusTract;
    @XmlAttribute(name = "Charge_Code_Term")
    protected Integer chargeCodeTerm;
    @XmlAttribute(name = "Charge_Code_Period")
    protected PeriodType chargeCodePeriod;
    @XmlAttribute(name = "Next_Charge_Code_Period")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextChargeCodePeriod;
    @XmlAttribute(name = "Waive_Charges_Flag")
    protected YNTYPE waiveChargesFlag;
    @XmlAttribute(name = "Chg_OD_Acct")
    protected ChgODAcctType chgODAcct;
    @XmlAttribute(name = "Perform_Initial_deposit")
    protected Boolean performInitialDeposit;
    @XmlAttribute(name = "Brokered_Deposit")
    protected YNTYPE brokeredDeposit;
    @XmlAttribute(name = "Closing_Reason_Id")
    protected Integer closingReasonId;
    @XmlAttribute(name = "Closing_Reason_Desc")
    protected String closingReasonDesc;
    @XmlAttribute(name = "OD_Adjust_Term")
    protected Integer odAdjustTerm;
    @XmlAttribute(name = "OD_Adjust_Period")
    protected PeriodType odAdjustPeriod;
    @XmlAttribute(name = "OD_Nxt_Adj_Dt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar odNxtAdjDt;
    @XmlAttribute(name = "OD_Risk_Code")
    protected Integer odRiskCode;
    @XmlAttribute(name = "OD_Risk_Desc")
    protected String odRiskDesc;
    @XmlAttribute(name = "OD_Adj_Amt")
    protected BigDecimal odAdjAmt;
    @XmlAttribute(name = "OD_Adj_Type")
    protected ODAdjustmentType odAdjType;
    @XmlAttribute(name = "Penalty_Int_Percentage")
    protected BigDecimal penaltyIntPercentage;
    @XmlAttribute(name = "Execlude")
    protected YNTYPE execlude;
    @XmlAttribute(name = "Cmt_type")
    protected String cmtType;
    @XmlAttribute(name = "Cmt_No")
    protected String cmtNo;
    @XmlAttribute(name = "Consolidated_Balances")
    protected YNTYPE consolidatedBalances;
    @XmlAttribute(name = "Int_Stmt")
    protected YNTYPE intStmt;
    @XmlAttribute(name = "OD_Limit_Flag")
    protected YNTYPE odLimitFlag;
    @XmlAttribute(name = "Prioritize_Pmt_Ded")
    protected YNTYPE prioritizePmtDed;
    @XmlAttribute(name = "Country")
    protected String country;
    @XmlAttribute(name = "Sic_Code")
    protected Integer sicCode;
    @XmlAttribute(name = "Sic_Code_Desc")
    protected String sicCodeDesc;
    @XmlAttribute(name = "Open_Dt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar openDt;
    @XmlAttribute(name = "RSM_ID2")
    protected Integer rsmid2;
    @XmlAttribute(name = "CHK_BOOK")
    protected String chkbook;
    @XmlAttribute(name = "RIM_Profile_Code")
    protected String rimProfileCode;
    @XmlAttribute(name = "Risk_Country_Code")
    protected String riskCountryCode;
    @XmlAttribute(name = "Risk_City_Id")
    protected Integer riskCityId;
    @XmlAttribute(name = "Advance_Purpose")
    protected String advancePurpose;
    @XmlAttribute(name = "Advance_Purpose_Id")
    protected Integer advancePurposeId;
    @XmlAttribute(name = "Other_Purpose")
    protected String otherPurpose;

    /**
     * Gets the value of the numberOfSignatures property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfSignatures() {
        return numberOfSignatures;
    }

    /**
     * Sets the value of the numberOfSignatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfSignatures(Integer value) {
        this.numberOfSignatures = value;
    }

    /**
     * Gets the value of the closeAtZero property.
     * 
     * @return
     *     possible object is
     *     {@link YNTYPE }
     *     
     */
    public YNTYPE getCloseAtZero() {
        return closeAtZero;
    }

    /**
     * Sets the value of the closeAtZero property.
     * 
     * @param value
     *     allowed object is
     *     {@link YNTYPE }
     *     
     */
    public void setCloseAtZero(YNTYPE value) {
        this.closeAtZero = value;
    }

    /**
     * Gets the value of the faceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFaceAmount() {
        return faceAmount;
    }

    /**
     * Sets the value of the faceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFaceAmount(BigDecimal value) {
        this.faceAmount = value;
    }

    /**
     * Gets the value of the defaultCycleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultCycleCode() {
        return defaultCycleCode;
    }

    /**
     * Sets the value of the defaultCycleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultCycleCode(String value) {
        this.defaultCycleCode = value;
    }

    /**
     * Gets the value of the defaultCycleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultCycleDescription() {
        return defaultCycleDescription;
    }

    /**
     * Sets the value of the defaultCycleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultCycleDescription(String value) {
        this.defaultCycleDescription = value;
    }

    /**
     * Gets the value of the synchronizeDates property.
     * 
     * @return
     *     possible object is
     *     {@link YNTYPE }
     *     
     */
    public YNTYPE getSynchronizeDates() {
        return synchronizeDates;
    }

    /**
     * Sets the value of the synchronizeDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link YNTYPE }
     *     
     */
    public void setSynchronizeDates(YNTYPE value) {
        this.synchronizeDates = value;
    }

    /**
     * Gets the value of the oidFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YNTYPE }
     *     
     */
    public YNTYPE getOIDFlag() {
        return oidFlag;
    }

    /**
     * Sets the value of the oidFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YNTYPE }
     *     
     */
    public void setOIDFlag(YNTYPE value) {
        this.oidFlag = value;
    }

    /**
     * Gets the value of the penaltyMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyMethodType }
     *     
     */
    public PenaltyMethodType getPenaltyMethod() {
        return penaltyMethod;
    }

    /**
     * Sets the value of the penaltyMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyMethodType }
     *     
     */
    public void setPenaltyMethod(PenaltyMethodType value) {
        this.penaltyMethod = value;
    }

    /**
     * Gets the value of the penaltyRateType property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyRateType }
     *     
     */
    public PenaltyRateType getPenaltyRateType() {
        return penaltyRateType;
    }

    /**
     * Sets the value of the penaltyRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyRateType }
     *     
     */
    public void setPenaltyRateType(PenaltyRateType value) {
        this.penaltyRateType = value;
    }

    /**
     * Gets the value of the penaltyTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPenaltyTerm() {
        return penaltyTerm;
    }

    /**
     * Sets the value of the penaltyTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPenaltyTerm(Integer value) {
        this.penaltyTerm = value;
    }

    /**
     * Gets the value of the penaltyPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TermPeriodType }
     *     
     */
    public TermPeriodType getPenaltyPeriod() {
        return penaltyPeriod;
    }

    /**
     * Sets the value of the penaltyPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermPeriodType }
     *     
     */
    public void setPenaltyPeriod(TermPeriodType value) {
        this.penaltyPeriod = value;
    }

    /**
     * Gets the value of the fr2900Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFR2900Code() {
        return fr2900Code;
    }

    /**
     * Sets the value of the fr2900Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFR2900Code(String value) {
        this.fr2900Code = value;
    }

    /**
     * Gets the value of the fr2900Description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFR2900Description() {
        return fr2900Description;
    }

    /**
     * Sets the value of the fr2900Description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFR2900Description(String value) {
        this.fr2900Description = value;
    }

    /**
     * Gets the value of the classDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassDescription() {
        return classDescription;
    }

    /**
     * Sets the value of the classDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassDescription(String value) {
        this.classDescription = value;
    }

    /**
     * Gets the value of the branchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchName(String value) {
        this.branchName = value;
    }

    /**
     * Gets the value of the rsmid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRSMID() {
        return rsmid;
    }

    /**
     * Sets the value of the rsmid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRSMID(Integer value) {
        this.rsmid = value;
    }

    /**
     * Gets the value of the rsmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSMName() {
        return rsmName;
    }

    /**
     * Sets the value of the rsmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSMName(String value) {
        this.rsmName = value;
    }

    /**
     * Gets the value of the titleLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleLine2() {
        return titleLine2;
    }

    /**
     * Sets the value of the titleLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleLine2(String value) {
        this.titleLine2 = value;
    }

    /**
     * Gets the value of the regCCCode property.
     * 
     * @return
     *     possible object is
     *     {@link RegCCCodeType }
     *     
     */
    public RegCCCodeType getRegCCCode() {
        return regCCCode;
    }

    /**
     * Sets the value of the regCCCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegCCCodeType }
     *     
     */
    public void setRegCCCode(RegCCCodeType value) {
        this.regCCCode = value;
    }

    /**
     * Gets the value of the regulationDDCode property.
     * 
     * @return
     *     possible object is
     *     {@link RegulationDDCodeType }
     *     
     */
    public RegulationDDCodeType getRegulationDDCode() {
        return regulationDDCode;
    }

    /**
     * Sets the value of the regulationDDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulationDDCodeType }
     *     
     */
    public void setRegulationDDCode(RegulationDDCodeType value) {
        this.regulationDDCode = value;
    }

    /**
     * Gets the value of the pcCallReportCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCCallReportCode() {
        return pcCallReportCode;
    }

    /**
     * Sets the value of the pcCallReportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCCallReportCode(String value) {
        this.pcCallReportCode = value;
    }

    /**
     * Gets the value of the pcCallReportDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCCallReportDescription() {
        return pcCallReportDescription;
    }

    /**
     * Sets the value of the pcCallReportDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCCallReportDescription(String value) {
        this.pcCallReportDescription = value;
    }

    /**
     * Gets the value of the publicFundsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicFundsCode() {
        return publicFundsCode;
    }

    /**
     * Sets the value of the publicFundsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicFundsCode(String value) {
        this.publicFundsCode = value;
    }

    /**
     * Gets the value of the publicFundsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicFundsDescription() {
        return publicFundsDescription;
    }

    /**
     * Sets the value of the publicFundsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicFundsDescription(String value) {
        this.publicFundsDescription = value;
    }

    /**
     * Gets the value of the passbook property.
     * 
     * @return
     *     possible object is
     *     {@link YNTYPE }
     *     
     */
    public YNTYPE getPassbook() {
        return passbook;
    }

    /**
     * Sets the value of the passbook property.
     * 
     * @param value
     *     allowed object is
     *     {@link YNTYPE }
     *     
     */
    public void setPassbook(YNTYPE value) {
        this.passbook = value;
    }

    /**
     * Gets the value of the openingReasonId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOpeningReasonId() {
        return openingReasonId;
    }

    /**
     * Sets the value of the openingReasonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOpeningReasonId(Integer value) {
        this.openingReasonId = value;
    }

    /**
     * Gets the value of the openingReasonDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpeningReasonDescription() {
        return openingReasonDescription;
    }

    /**
     * Sets the value of the openingReasonDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpeningReasonDescription(String value) {
        this.openingReasonDescription = value;
    }

    /**
     * Gets the value of the sourceFundsId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSourceFundsId() {
        return sourceFundsId;
    }

    /**
     * Sets the value of the sourceFundsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSourceFundsId(Integer value) {
        this.sourceFundsId = value;
    }

    /**
     * Gets the value of the sourceFundsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceFundsDescription() {
        return sourceFundsDescription;
    }

    /**
     * Sets the value of the sourceFundsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceFundsDescription(String value) {
        this.sourceFundsDescription = value;
    }

    /**
     * Gets the value of the censusTract property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCensusTract() {
        return censusTract;
    }

    /**
     * Sets the value of the censusTract property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCensusTract(BigDecimal value) {
        this.censusTract = value;
    }

    /**
     * Gets the value of the chargeCodeTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChargeCodeTerm() {
        return chargeCodeTerm;
    }

    /**
     * Sets the value of the chargeCodeTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChargeCodeTerm(Integer value) {
        this.chargeCodeTerm = value;
    }

    /**
     * Gets the value of the chargeCodePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getChargeCodePeriod() {
        return chargeCodePeriod;
    }

    /**
     * Sets the value of the chargeCodePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setChargeCodePeriod(PeriodType value) {
        this.chargeCodePeriod = value;
    }

    /**
     * Gets the value of the nextChargeCodePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextChargeCodePeriod() {
        return nextChargeCodePeriod;
    }

    /**
     * Sets the value of the nextChargeCodePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextChargeCodePeriod(XMLGregorianCalendar value) {
        this.nextChargeCodePeriod = value;
    }

    /**
     * Gets the value of the waiveChargesFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YNTYPE }
     *     
     */
    public YNTYPE getWaiveChargesFlag() {
        return waiveChargesFlag;
    }

    /**
     * Sets the value of the waiveChargesFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YNTYPE }
     *     
     */
    public void setWaiveChargesFlag(YNTYPE value) {
        this.waiveChargesFlag = value;
    }

    /**
     * Gets the value of the chgODAcct property.
     * 
     * @return
     *     possible object is
     *     {@link ChgODAcctType }
     *     
     */
    public ChgODAcctType getChgODAcct() {
        return chgODAcct;
    }

    /**
     * Sets the value of the chgODAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChgODAcctType }
     *     
     */
    public void setChgODAcct(ChgODAcctType value) {
        this.chgODAcct = value;
    }

    /**
     * Gets the value of the performInitialDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerformInitialDeposit() {
        return performInitialDeposit;
    }

    /**
     * Sets the value of the performInitialDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerformInitialDeposit(Boolean value) {
        this.performInitialDeposit = value;
    }

    /**
     * Gets the value of the brokeredDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link YNTYPE }
     *     
     */
    public YNTYPE getBrokeredDeposit() {
        return brokeredDeposit;
    }

    /**
     * Sets the value of the brokeredDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link YNTYPE }
     *     
     */
    public void setBrokeredDeposit(YNTYPE value) {
        this.brokeredDeposit = value;
    }

    /**
     * Gets the value of the closingReasonId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClosingReasonId() {
        return closingReasonId;
    }

    /**
     * Sets the value of the closingReasonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClosingReasonId(Integer value) {
        this.closingReasonId = value;
    }

    /**
     * Gets the value of the closingReasonDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosingReasonDesc() {
        return closingReasonDesc;
    }

    /**
     * Sets the value of the closingReasonDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosingReasonDesc(String value) {
        this.closingReasonDesc = value;
    }

    /**
     * Gets the value of the odAdjustTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getODAdjustTerm() {
        return odAdjustTerm;
    }

    /**
     * Sets the value of the odAdjustTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setODAdjustTerm(Integer value) {
        this.odAdjustTerm = value;
    }

    /**
     * Gets the value of the odAdjustPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getODAdjustPeriod() {
        return odAdjustPeriod;
    }

    /**
     * Sets the value of the odAdjustPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setODAdjustPeriod(PeriodType value) {
        this.odAdjustPeriod = value;
    }

    /**
     * Gets the value of the odNxtAdjDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getODNxtAdjDt() {
        return odNxtAdjDt;
    }

    /**
     * Sets the value of the odNxtAdjDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setODNxtAdjDt(XMLGregorianCalendar value) {
        this.odNxtAdjDt = value;
    }

    /**
     * Gets the value of the odRiskCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getODRiskCode() {
        return odRiskCode;
    }

    /**
     * Sets the value of the odRiskCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setODRiskCode(Integer value) {
        this.odRiskCode = value;
    }

    /**
     * Gets the value of the odRiskDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getODRiskDesc() {
        return odRiskDesc;
    }

    /**
     * Sets the value of the odRiskDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setODRiskDesc(String value) {
        this.odRiskDesc = value;
    }

    /**
     * Gets the value of the odAdjAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getODAdjAmt() {
        return odAdjAmt;
    }

    /**
     * Sets the value of the odAdjAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setODAdjAmt(BigDecimal value) {
        this.odAdjAmt = value;
    }

    /**
     * Gets the value of the odAdjType property.
     * 
     * @return
     *     possible object is
     *     {@link ODAdjustmentType }
     *     
     */
    public ODAdjustmentType getODAdjType() {
        return odAdjType;
    }

    /**
     * Sets the value of the odAdjType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODAdjustmentType }
     *     
     */
    public void setODAdjType(ODAdjustmentType value) {
        this.odAdjType = value;
    }

    /**
     * Gets the value of the penaltyIntPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPenaltyIntPercentage() {
        return penaltyIntPercentage;
    }

    /**
     * Sets the value of the penaltyIntPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPenaltyIntPercentage(BigDecimal value) {
        this.penaltyIntPercentage = value;
    }

    /**
     * Gets the value of the execlude property.
     * 
     * @return
     *     possible object is
     *     {@link YNTYPE }
     *     
     */
    public YNTYPE getExeclude() {
        return execlude;
    }

    /**
     * Sets the value of the execlude property.
     * 
     * @param value
     *     allowed object is
     *     {@link YNTYPE }
     *     
     */
    public void setExeclude(YNTYPE value) {
        this.execlude = value;
    }

    /**
     * Gets the value of the cmtType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmtType() {
        return cmtType;
    }

    /**
     * Sets the value of the cmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmtType(String value) {
        this.cmtType = value;
    }

    /**
     * Gets the value of the cmtNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmtNo() {
        return cmtNo;
    }

    /**
     * Sets the value of the cmtNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmtNo(String value) {
        this.cmtNo = value;
    }

    /**
     * Gets the value of the consolidatedBalances property.
     * 
     * @return
     *     possible object is
     *     {@link YNTYPE }
     *     
     */
    public YNTYPE getConsolidatedBalances() {
        return consolidatedBalances;
    }

    /**
     * Sets the value of the consolidatedBalances property.
     * 
     * @param value
     *     allowed object is
     *     {@link YNTYPE }
     *     
     */
    public void setConsolidatedBalances(YNTYPE value) {
        this.consolidatedBalances = value;
    }

    /**
     * Gets the value of the intStmt property.
     * 
     * @return
     *     possible object is
     *     {@link YNTYPE }
     *     
     */
    public YNTYPE getIntStmt() {
        return intStmt;
    }

    /**
     * Sets the value of the intStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link YNTYPE }
     *     
     */
    public void setIntStmt(YNTYPE value) {
        this.intStmt = value;
    }

    /**
     * Gets the value of the odLimitFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YNTYPE }
     *     
     */
    public YNTYPE getODLimitFlag() {
        return odLimitFlag;
    }

    /**
     * Sets the value of the odLimitFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YNTYPE }
     *     
     */
    public void setODLimitFlag(YNTYPE value) {
        this.odLimitFlag = value;
    }

    /**
     * Gets the value of the prioritizePmtDed property.
     * 
     * @return
     *     possible object is
     *     {@link YNTYPE }
     *     
     */
    public YNTYPE getPrioritizePmtDed() {
        return prioritizePmtDed;
    }

    /**
     * Sets the value of the prioritizePmtDed property.
     * 
     * @param value
     *     allowed object is
     *     {@link YNTYPE }
     *     
     */
    public void setPrioritizePmtDed(YNTYPE value) {
        this.prioritizePmtDed = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the sicCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSicCode() {
        return sicCode;
    }

    /**
     * Sets the value of the sicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSicCode(Integer value) {
        this.sicCode = value;
    }

    /**
     * Gets the value of the sicCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSicCodeDesc() {
        return sicCodeDesc;
    }

    /**
     * Sets the value of the sicCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSicCodeDesc(String value) {
        this.sicCodeDesc = value;
    }

    /**
     * Gets the value of the openDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpenDt() {
        return openDt;
    }

    /**
     * Sets the value of the openDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOpenDt(XMLGregorianCalendar value) {
        this.openDt = value;
    }

    /**
     * Gets the value of the rsmid2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRSMID2() {
        return rsmid2;
    }

    /**
     * Sets the value of the rsmid2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRSMID2(Integer value) {
        this.rsmid2 = value;
    }

    /**
     * Gets the value of the chkbook property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHKBOOK() {
        return chkbook;
    }

    /**
     * Sets the value of the chkbook property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHKBOOK(String value) {
        this.chkbook = value;
    }

    /**
     * Gets the value of the rimProfileCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIMProfileCode() {
        return rimProfileCode;
    }

    /**
     * Sets the value of the rimProfileCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIMProfileCode(String value) {
        this.rimProfileCode = value;
    }

    /**
     * Gets the value of the riskCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskCountryCode() {
        return riskCountryCode;
    }

    /**
     * Sets the value of the riskCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskCountryCode(String value) {
        this.riskCountryCode = value;
    }

    /**
     * Gets the value of the riskCityId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRiskCityId() {
        return riskCityId;
    }

    /**
     * Sets the value of the riskCityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRiskCityId(Integer value) {
        this.riskCityId = value;
    }

    /**
     * Gets the value of the advancePurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvancePurpose() {
        return advancePurpose;
    }

    /**
     * Sets the value of the advancePurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvancePurpose(String value) {
        this.advancePurpose = value;
    }

    /**
     * Gets the value of the advancePurposeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdvancePurposeId() {
        return advancePurposeId;
    }

    /**
     * Sets the value of the advancePurposeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdvancePurposeId(Integer value) {
        this.advancePurposeId = value;
    }

    /**
     * Gets the value of the otherPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPurpose() {
        return otherPurpose;
    }

    /**
     * Sets the value of the otherPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPurpose(String value) {
        this.otherPurpose = value;
    }

}
