
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LOAN_DOWNPAYMENT_ACCOUNT"/&gt;
 *     &lt;enumeration value="LOAN_DOWNPAYMENT_CASH"/&gt;
 *     &lt;enumeration value="CASH_DEPOSIT"/&gt;
 *     &lt;enumeration value="GENERAL_POSTING"/&gt;
 *     &lt;enumeration value="CASH_WITHDRAWAL"/&gt;
 *     &lt;enumeration value="VAULT_TO_VAULT_TRANSFER"/&gt;
 *     &lt;enumeration value="MISC_TRANS_POSTING"/&gt;
 *     &lt;enumeration value="CHECK_WITHDRAWAL"/&gt;
 *     &lt;enumeration value="CHECK_DEPOSIT"/&gt;
 *     &lt;enumeration value="PAYMENT_ORDER_CREATE"/&gt;
 *     &lt;enumeration value="PAYMENT_ORDER_PROCESS"/&gt;
 *     &lt;enumeration value="PAYMENT_ORDER_CANCEL"/&gt;
 *     &lt;enumeration value="DEMAND_DRAFT_CREATE"/&gt;
 *     &lt;enumeration value="DEMAND_DRAFT_PROCESS"/&gt;
 *     &lt;enumeration value="DEMAND_DRAFT_CANCEL"/&gt;
 *     &lt;enumeration value="LOCKER_RENT"/&gt;
 *     &lt;enumeration value="LOCKER_SECURITY_DEPOSIT"/&gt;
 *     &lt;enumeration value="LOCKER_REFUND"/&gt;
 *     &lt;enumeration value="FX_BUY_SELL"/&gt;
 *     &lt;enumeration value="MISC_TRAN_CASH"/&gt;
 *     &lt;enumeration value="MISC_TRAN_TRANSFER"/&gt;
 *     &lt;enumeration value="OVERAGE"/&gt;
 *     &lt;enumeration value="SHORTAGE"/&gt;
 *     &lt;enumeration value="CASHIN"/&gt;
 *     &lt;enumeration value="CASHOUT"/&gt;
 *     &lt;enumeration value="SERVICE_CHARGE_CASH"/&gt;
 *     &lt;enumeration value="SERVICE_CHARGE_ACCOUNT"/&gt;
 *     &lt;enumeration value="DEBIT_GL_TO_CREDIT_GL"/&gt;
 *     &lt;enumeration value="SUBSCRIPTION"/&gt;
 *     &lt;enumeration value="REDEMPTION"/&gt;
 *     &lt;enumeration value="MATURITY"/&gt;
 *     &lt;enumeration value="PAYOUT"/&gt;
 *     &lt;enumeration value="ONE_DEBIT_MANY_CREDIT"/&gt;
 *     &lt;enumeration value="LOAN_DOWNPAYMENT_CHECK"/&gt;
 *     &lt;enumeration value="MINT_UAE_WITHDRAWAL"/&gt;
 *     &lt;enumeration value="VENDOR_ACCOUNT_PAYMENT"/&gt;
 *     &lt;enumeration value="INWARD_CLEARING"/&gt;
 *     &lt;enumeration value="OUTWARD_CLEARING"/&gt;
 *     &lt;enumeration value="OUTWARD_RETURN_CLEARING"/&gt;
 *     &lt;enumeration value="FEE_COLLECTION"/&gt;
 *     &lt;enumeration value="PDC_CHARGES"/&gt;
 *     &lt;enumeration value="PDC_DUE_DATE"/&gt;
 *     &lt;enumeration value="PDC_WITHDRAWAL"/&gt;
 *     &lt;enumeration value="SALARY_FILE_ACCEPTED"/&gt;
 *     &lt;enumeration value="SALARY_FILE_REJECTED"/&gt;
 *     &lt;enumeration value="SALARY_RTC_RECEIVED"/&gt;
 *     &lt;enumeration value="PAYMENT_FILE_RECEIPT_ACC"/&gt;
 *     &lt;enumeration value="PAYMENT_FILE_RECEIPT_REJ"/&gt;
 *     &lt;enumeration value="PAYMENT_DISBURSEMENT"/&gt;
 *     &lt;enumeration value="PAYMENT_ACK"/&gt;
 *     &lt;enumeration value="REFUND_REQUEST_SENT"/&gt;
 *     &lt;enumeration value="REFUND_REQUEST_ACCEPTED"/&gt;
 *     &lt;enumeration value="REFUND_REQUEST_REJECTED"/&gt;
 *     &lt;enumeration value="REFUND_SATUS_UPDATED"/&gt;
 *     &lt;enumeration value="REFUND_REQUEST_RECEIVDED"/&gt;
 *     &lt;enumeration value="REFUND_RESPONSE_ACCEPTED"/&gt;
 *     &lt;enumeration value="SALARY_PROCESSING"/&gt;
 *     &lt;enumeration value="REDEEM_CREDIT"/&gt;
 *     &lt;enumeration value="CREATE_CASH_REMIT"/&gt;
 *     &lt;enumeration value="DEBITACCOUNT_DEBIT"/&gt;
 *     &lt;enumeration value="DEBITACCOUNT_CREDIT"/&gt;
 *     &lt;enumeration value="GLACCOUNT_ DEBIT"/&gt;
 *     &lt;enumeration value="GLACCOUNT_ CREDIT"/&gt;
 *     &lt;enumeration value="MAPPINGACCOUNT_ DEBIT"/&gt;
 *     &lt;enumeration value="MAPPINGACCOUNT_ CREDIT"/&gt;
 *     &lt;enumeration value="NETSETTLEMENT"/&gt;
 *     &lt;enumeration value="PAYMENT"/&gt;
 *     &lt;enumeration value="REFUND"/&gt;
 *     &lt;enumeration value="MANY_DEBIT_CREDIT_POSI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionType")
@XmlEnum
public enum TransactionType {

    LOAN_DOWNPAYMENT_ACCOUNT("LOAN_DOWNPAYMENT_ACCOUNT"),
    LOAN_DOWNPAYMENT_CASH("LOAN_DOWNPAYMENT_CASH"),
    CASH_DEPOSIT("CASH_DEPOSIT"),
    GENERAL_POSTING("GENERAL_POSTING"),
    CASH_WITHDRAWAL("CASH_WITHDRAWAL"),
    VAULT_TO_VAULT_TRANSFER("VAULT_TO_VAULT_TRANSFER"),
    MISC_TRANS_POSTING("MISC_TRANS_POSTING"),
    CHECK_WITHDRAWAL("CHECK_WITHDRAWAL"),
    CHECK_DEPOSIT("CHECK_DEPOSIT"),
    PAYMENT_ORDER_CREATE("PAYMENT_ORDER_CREATE"),
    PAYMENT_ORDER_PROCESS("PAYMENT_ORDER_PROCESS"),
    PAYMENT_ORDER_CANCEL("PAYMENT_ORDER_CANCEL"),
    DEMAND_DRAFT_CREATE("DEMAND_DRAFT_CREATE"),
    DEMAND_DRAFT_PROCESS("DEMAND_DRAFT_PROCESS"),
    DEMAND_DRAFT_CANCEL("DEMAND_DRAFT_CANCEL"),
    LOCKER_RENT("LOCKER_RENT"),
    LOCKER_SECURITY_DEPOSIT("LOCKER_SECURITY_DEPOSIT"),
    LOCKER_REFUND("LOCKER_REFUND"),
    FX_BUY_SELL("FX_BUY_SELL"),
    MISC_TRAN_CASH("MISC_TRAN_CASH"),
    MISC_TRAN_TRANSFER("MISC_TRAN_TRANSFER"),
    OVERAGE("OVERAGE"),
    SHORTAGE("SHORTAGE"),
    CASHIN("CASHIN"),
    CASHOUT("CASHOUT"),
    SERVICE_CHARGE_CASH("SERVICE_CHARGE_CASH"),
    SERVICE_CHARGE_ACCOUNT("SERVICE_CHARGE_ACCOUNT"),
    DEBIT_GL_TO_CREDIT_GL("DEBIT_GL_TO_CREDIT_GL"),
    SUBSCRIPTION("SUBSCRIPTION"),
    REDEMPTION("REDEMPTION"),
    MATURITY("MATURITY"),
    PAYOUT("PAYOUT"),
    ONE_DEBIT_MANY_CREDIT("ONE_DEBIT_MANY_CREDIT"),
    LOAN_DOWNPAYMENT_CHECK("LOAN_DOWNPAYMENT_CHECK"),
    MINT_UAE_WITHDRAWAL("MINT_UAE_WITHDRAWAL"),
    VENDOR_ACCOUNT_PAYMENT("VENDOR_ACCOUNT_PAYMENT"),
    INWARD_CLEARING("INWARD_CLEARING"),
    OUTWARD_CLEARING("OUTWARD_CLEARING"),
    OUTWARD_RETURN_CLEARING("OUTWARD_RETURN_CLEARING"),
    FEE_COLLECTION("FEE_COLLECTION"),
    PDC_CHARGES("PDC_CHARGES"),
    PDC_DUE_DATE("PDC_DUE_DATE"),
    PDC_WITHDRAWAL("PDC_WITHDRAWAL"),
    SALARY_FILE_ACCEPTED("SALARY_FILE_ACCEPTED"),
    SALARY_FILE_REJECTED("SALARY_FILE_REJECTED"),
    SALARY_RTC_RECEIVED("SALARY_RTC_RECEIVED"),
    PAYMENT_FILE_RECEIPT_ACC("PAYMENT_FILE_RECEIPT_ACC"),
    PAYMENT_FILE_RECEIPT_REJ("PAYMENT_FILE_RECEIPT_REJ"),
    PAYMENT_DISBURSEMENT("PAYMENT_DISBURSEMENT"),
    PAYMENT_ACK("PAYMENT_ACK"),
    REFUND_REQUEST_SENT("REFUND_REQUEST_SENT"),
    REFUND_REQUEST_ACCEPTED("REFUND_REQUEST_ACCEPTED"),
    REFUND_REQUEST_REJECTED("REFUND_REQUEST_REJECTED"),
    REFUND_SATUS_UPDATED("REFUND_SATUS_UPDATED"),
    REFUND_REQUEST_RECEIVDED("REFUND_REQUEST_RECEIVDED"),
    REFUND_RESPONSE_ACCEPTED("REFUND_RESPONSE_ACCEPTED"),
    SALARY_PROCESSING("SALARY_PROCESSING"),
    REDEEM_CREDIT("REDEEM_CREDIT"),
    CREATE_CASH_REMIT("CREATE_CASH_REMIT"),
    DEBITACCOUNT_DEBIT("DEBITACCOUNT_DEBIT"),
    DEBITACCOUNT_CREDIT("DEBITACCOUNT_CREDIT"),
    @XmlEnumValue("GLACCOUNT_ DEBIT")
    GLACCOUNT_DEBIT("GLACCOUNT_ DEBIT"),
    @XmlEnumValue("GLACCOUNT_ CREDIT")
    GLACCOUNT_CREDIT("GLACCOUNT_ CREDIT"),
    @XmlEnumValue("MAPPINGACCOUNT_ DEBIT")
    MAPPINGACCOUNT_DEBIT("MAPPINGACCOUNT_ DEBIT"),
    @XmlEnumValue("MAPPINGACCOUNT_ CREDIT")
    MAPPINGACCOUNT_CREDIT("MAPPINGACCOUNT_ CREDIT"),
    NETSETTLEMENT("NETSETTLEMENT"),
    PAYMENT("PAYMENT"),
    REFUND("REFUND"),
    MANY_DEBIT_CREDIT_POSI("MANY_DEBIT_CREDIT_POSI");
    private final String value;

    TransactionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionType fromValue(String v) {
        for (TransactionType c: TransactionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
