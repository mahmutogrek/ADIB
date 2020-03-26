
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RetailBeneficiary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetailBeneficiary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BeneAccNo" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctNumber" minOccurs="0"/&gt;
 *         &lt;element name="BeneAccType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BeneExtAccType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BeneAppType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BeneBankBranch" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BankBranchRemarks" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BeneName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BeneAccCurr" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BeneType" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}BenificiaryType" minOccurs="0"/&gt;
 *         &lt;element name="BeneCity" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BeneCountry" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BeneAdd1"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="120"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BeneAdd2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="120"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BeneAdd3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="120"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CustNo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BeneBankId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BeneBankName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BeneBankAdd1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="120"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BeneBankAdd2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="120"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BeneBankCountry" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BeneBankCity" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BankCountryCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BeneStatus" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BeneRemarks" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BeneficiaryBankBIC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SenderCorresBankBIC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *               &lt;minLength value="0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SenderCorresBankAccNo" type="{urn:esbbank.com/gbo/xml/schemas/v1_0/}AcctNumber" minOccurs="0"/&gt;
 *         &lt;element name="RecieverCorresBankBIC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IntermediateBankBIC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RecieverBankBIC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BenClearingCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BenCityCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BankSortCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BankSwiftCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NickName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Add1Remarks1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Add2Remarks2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Add3Remarks3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BankNameRemarks4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BankAdd1Remarks5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BankAdd2Remarks6" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ClearingCodeRemarks7" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CityRemarks8" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CountryRemarks9" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CurrencyRemarks10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ActivationRefNo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ActivationMode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UserId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CreatedBy" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedBy" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ModifiedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="AuthBy" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AuthDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="RejectedBy" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RejectedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="customerAddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerAddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerAddressLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountBankFormat" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="A"/&gt;
 *               &lt;enumeration value="D"/&gt;
 *               &lt;enumeration value="E"/&gt;
 *               &lt;enumeration value="F"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="swift_routingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sendReceiveInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailBeneficiary", propOrder = {
    "beneAccNo",
    "beneAccType",
    "beneExtAccType",
    "beneAppType",
    "beneBankBranch",
    "bankBranchRemarks",
    "beneName",
    "beneAccCurr",
    "beneType",
    "beneCity",
    "beneCountry",
    "beneAdd1",
    "beneAdd2",
    "beneAdd3",
    "custNo",
    "beneBankId",
    "beneBankName",
    "beneBankAdd1",
    "beneBankAdd2",
    "beneBankCountry",
    "beneBankCity",
    "bankCountryCode",
    "beneStatus",
    "beneRemarks",
    "beneficiaryBankBIC",
    "senderCorresBankBIC",
    "senderCorresBankAccNo",
    "recieverCorresBankBIC",
    "intermediateBankBIC",
    "recieverBankBIC",
    "benClearingCode",
    "benCityCode",
    "bankSortCode",
    "bankSwiftCode",
    "nickName",
    "add1Remarks1",
    "add2Remarks2",
    "add3Remarks3",
    "bankNameRemarks4",
    "bankAdd1Remarks5",
    "bankAdd2Remarks6",
    "clearingCodeRemarks7",
    "cityRemarks8",
    "countryRemarks9",
    "currencyRemarks10",
    "activationRefNo",
    "activationMode",
    "userId",
    "createdBy",
    "createdDate",
    "modifiedBy",
    "modifiedDate",
    "authBy",
    "authDate",
    "rejectedBy",
    "rejectedDate",
    "customerAddressLine1",
    "customerAddressLine2",
    "customerAddressLine3",
    "accountBankFormat",
    "swiftRoutingCode",
    "sendReceiveInfo"
})
public class RetailBeneficiary {

    @XmlElement(name = "BeneAccNo")
    protected String beneAccNo;
    @XmlElement(name = "BeneAccType")
    protected String beneAccType;
    @XmlElement(name = "BeneExtAccType")
    protected String beneExtAccType;
    @XmlElement(name = "BeneAppType")
    protected String beneAppType;
    @XmlElement(name = "BeneBankBranch")
    protected String beneBankBranch;
    @XmlElement(name = "BankBranchRemarks")
    protected String bankBranchRemarks;
    @XmlElement(name = "BeneName", required = true)
    protected String beneName;
    @XmlElement(name = "BeneAccCurr")
    protected String beneAccCurr;
    @XmlElement(name = "BeneType")
    @XmlSchemaType(name = "string")
    protected BenificiaryType beneType;
    @XmlElement(name = "BeneCity")
    protected String beneCity;
    @XmlElement(name = "BeneCountry")
    protected String beneCountry;
    @XmlElement(name = "BeneAdd1", required = true)
    protected String beneAdd1;
    @XmlElement(name = "BeneAdd2")
    protected String beneAdd2;
    @XmlElement(name = "BeneAdd3")
    protected String beneAdd3;
    @XmlElement(name = "CustNo")
    protected String custNo;
    @XmlElement(name = "BeneBankId")
    protected String beneBankId;
    @XmlElement(name = "BeneBankName", required = true)
    protected String beneBankName;
    @XmlElement(name = "BeneBankAdd1")
    protected String beneBankAdd1;
    @XmlElement(name = "BeneBankAdd2")
    protected String beneBankAdd2;
    @XmlElement(name = "BeneBankCountry")
    protected String beneBankCountry;
    @XmlElement(name = "BeneBankCity")
    protected String beneBankCity;
    @XmlElement(name = "BankCountryCode")
    protected String bankCountryCode;
    @XmlElement(name = "BeneStatus")
    protected String beneStatus;
    @XmlElement(name = "BeneRemarks")
    protected String beneRemarks;
    @XmlElement(name = "BeneficiaryBankBIC")
    protected String beneficiaryBankBIC;
    @XmlElement(name = "SenderCorresBankBIC")
    protected String senderCorresBankBIC;
    @XmlElement(name = "SenderCorresBankAccNo")
    protected String senderCorresBankAccNo;
    @XmlElement(name = "RecieverCorresBankBIC")
    protected String recieverCorresBankBIC;
    @XmlElement(name = "IntermediateBankBIC")
    protected String intermediateBankBIC;
    @XmlElement(name = "RecieverBankBIC")
    protected String recieverBankBIC;
    @XmlElement(name = "BenClearingCode")
    protected String benClearingCode;
    @XmlElement(name = "BenCityCode")
    protected String benCityCode;
    @XmlElement(name = "BankSortCode")
    protected String bankSortCode;
    @XmlElement(name = "BankSwiftCode", required = true)
    protected String bankSwiftCode;
    @XmlElement(name = "NickName")
    protected String nickName;
    @XmlElement(name = "Add1Remarks1")
    protected String add1Remarks1;
    @XmlElement(name = "Add2Remarks2")
    protected String add2Remarks2;
    @XmlElement(name = "Add3Remarks3")
    protected String add3Remarks3;
    @XmlElement(name = "BankNameRemarks4")
    protected String bankNameRemarks4;
    @XmlElement(name = "BankAdd1Remarks5")
    protected String bankAdd1Remarks5;
    @XmlElement(name = "BankAdd2Remarks6")
    protected String bankAdd2Remarks6;
    @XmlElement(name = "ClearingCodeRemarks7")
    protected String clearingCodeRemarks7;
    @XmlElement(name = "CityRemarks8")
    protected String cityRemarks8;
    @XmlElement(name = "CountryRemarks9")
    protected String countryRemarks9;
    @XmlElement(name = "CurrencyRemarks10")
    protected String currencyRemarks10;
    @XmlElement(name = "ActivationRefNo")
    protected String activationRefNo;
    @XmlElement(name = "ActivationMode")
    protected String activationMode;
    @XmlElement(name = "UserId")
    protected String userId;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "CreatedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "ModifiedBy")
    protected String modifiedBy;
    @XmlElement(name = "ModifiedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar modifiedDate;
    @XmlElement(name = "AuthBy")
    protected String authBy;
    @XmlElement(name = "AuthDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar authDate;
    @XmlElement(name = "RejectedBy")
    protected String rejectedBy;
    @XmlElement(name = "RejectedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rejectedDate;
    protected String customerAddressLine1;
    protected String customerAddressLine2;
    protected String customerAddressLine3;
    protected String accountBankFormat;
    @XmlElement(name = "swift_routingCode")
    protected String swiftRoutingCode;
    protected String sendReceiveInfo;

    /**
     * Gets the value of the beneAccNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneAccNo() {
        return beneAccNo;
    }

    /**
     * Sets the value of the beneAccNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneAccNo(String value) {
        this.beneAccNo = value;
    }

    /**
     * Gets the value of the beneAccType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneAccType() {
        return beneAccType;
    }

    /**
     * Sets the value of the beneAccType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneAccType(String value) {
        this.beneAccType = value;
    }

    /**
     * Gets the value of the beneExtAccType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneExtAccType() {
        return beneExtAccType;
    }

    /**
     * Sets the value of the beneExtAccType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneExtAccType(String value) {
        this.beneExtAccType = value;
    }

    /**
     * Gets the value of the beneAppType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneAppType() {
        return beneAppType;
    }

    /**
     * Sets the value of the beneAppType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneAppType(String value) {
        this.beneAppType = value;
    }

    /**
     * Gets the value of the beneBankBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneBankBranch() {
        return beneBankBranch;
    }

    /**
     * Sets the value of the beneBankBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneBankBranch(String value) {
        this.beneBankBranch = value;
    }

    /**
     * Gets the value of the bankBranchRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankBranchRemarks() {
        return bankBranchRemarks;
    }

    /**
     * Sets the value of the bankBranchRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankBranchRemarks(String value) {
        this.bankBranchRemarks = value;
    }

    /**
     * Gets the value of the beneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneName() {
        return beneName;
    }

    /**
     * Sets the value of the beneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneName(String value) {
        this.beneName = value;
    }

    /**
     * Gets the value of the beneAccCurr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneAccCurr() {
        return beneAccCurr;
    }

    /**
     * Sets the value of the beneAccCurr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneAccCurr(String value) {
        this.beneAccCurr = value;
    }

    /**
     * Gets the value of the beneType property.
     * 
     * @return
     *     possible object is
     *     {@link BenificiaryType }
     *     
     */
    public BenificiaryType getBeneType() {
        return beneType;
    }

    /**
     * Sets the value of the beneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenificiaryType }
     *     
     */
    public void setBeneType(BenificiaryType value) {
        this.beneType = value;
    }

    /**
     * Gets the value of the beneCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneCity() {
        return beneCity;
    }

    /**
     * Sets the value of the beneCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneCity(String value) {
        this.beneCity = value;
    }

    /**
     * Gets the value of the beneCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneCountry() {
        return beneCountry;
    }

    /**
     * Sets the value of the beneCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneCountry(String value) {
        this.beneCountry = value;
    }

    /**
     * Gets the value of the beneAdd1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneAdd1() {
        return beneAdd1;
    }

    /**
     * Sets the value of the beneAdd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneAdd1(String value) {
        this.beneAdd1 = value;
    }

    /**
     * Gets the value of the beneAdd2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneAdd2() {
        return beneAdd2;
    }

    /**
     * Sets the value of the beneAdd2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneAdd2(String value) {
        this.beneAdd2 = value;
    }

    /**
     * Gets the value of the beneAdd3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneAdd3() {
        return beneAdd3;
    }

    /**
     * Sets the value of the beneAdd3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneAdd3(String value) {
        this.beneAdd3 = value;
    }

    /**
     * Gets the value of the custNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustNo() {
        return custNo;
    }

    /**
     * Sets the value of the custNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustNo(String value) {
        this.custNo = value;
    }

    /**
     * Gets the value of the beneBankId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneBankId() {
        return beneBankId;
    }

    /**
     * Sets the value of the beneBankId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneBankId(String value) {
        this.beneBankId = value;
    }

    /**
     * Gets the value of the beneBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneBankName() {
        return beneBankName;
    }

    /**
     * Sets the value of the beneBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneBankName(String value) {
        this.beneBankName = value;
    }

    /**
     * Gets the value of the beneBankAdd1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneBankAdd1() {
        return beneBankAdd1;
    }

    /**
     * Sets the value of the beneBankAdd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneBankAdd1(String value) {
        this.beneBankAdd1 = value;
    }

    /**
     * Gets the value of the beneBankAdd2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneBankAdd2() {
        return beneBankAdd2;
    }

    /**
     * Sets the value of the beneBankAdd2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneBankAdd2(String value) {
        this.beneBankAdd2 = value;
    }

    /**
     * Gets the value of the beneBankCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneBankCountry() {
        return beneBankCountry;
    }

    /**
     * Sets the value of the beneBankCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneBankCountry(String value) {
        this.beneBankCountry = value;
    }

    /**
     * Gets the value of the beneBankCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneBankCity() {
        return beneBankCity;
    }

    /**
     * Sets the value of the beneBankCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneBankCity(String value) {
        this.beneBankCity = value;
    }

    /**
     * Gets the value of the bankCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCountryCode() {
        return bankCountryCode;
    }

    /**
     * Sets the value of the bankCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCountryCode(String value) {
        this.bankCountryCode = value;
    }

    /**
     * Gets the value of the beneStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneStatus() {
        return beneStatus;
    }

    /**
     * Sets the value of the beneStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneStatus(String value) {
        this.beneStatus = value;
    }

    /**
     * Gets the value of the beneRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneRemarks() {
        return beneRemarks;
    }

    /**
     * Sets the value of the beneRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneRemarks(String value) {
        this.beneRemarks = value;
    }

    /**
     * Gets the value of the beneficiaryBankBIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryBankBIC() {
        return beneficiaryBankBIC;
    }

    /**
     * Sets the value of the beneficiaryBankBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryBankBIC(String value) {
        this.beneficiaryBankBIC = value;
    }

    /**
     * Gets the value of the senderCorresBankBIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderCorresBankBIC() {
        return senderCorresBankBIC;
    }

    /**
     * Sets the value of the senderCorresBankBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderCorresBankBIC(String value) {
        this.senderCorresBankBIC = value;
    }

    /**
     * Gets the value of the senderCorresBankAccNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderCorresBankAccNo() {
        return senderCorresBankAccNo;
    }

    /**
     * Sets the value of the senderCorresBankAccNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderCorresBankAccNo(String value) {
        this.senderCorresBankAccNo = value;
    }

    /**
     * Gets the value of the recieverCorresBankBIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecieverCorresBankBIC() {
        return recieverCorresBankBIC;
    }

    /**
     * Sets the value of the recieverCorresBankBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecieverCorresBankBIC(String value) {
        this.recieverCorresBankBIC = value;
    }

    /**
     * Gets the value of the intermediateBankBIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntermediateBankBIC() {
        return intermediateBankBIC;
    }

    /**
     * Sets the value of the intermediateBankBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntermediateBankBIC(String value) {
        this.intermediateBankBIC = value;
    }

    /**
     * Gets the value of the recieverBankBIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecieverBankBIC() {
        return recieverBankBIC;
    }

    /**
     * Sets the value of the recieverBankBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecieverBankBIC(String value) {
        this.recieverBankBIC = value;
    }

    /**
     * Gets the value of the benClearingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenClearingCode() {
        return benClearingCode;
    }

    /**
     * Sets the value of the benClearingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenClearingCode(String value) {
        this.benClearingCode = value;
    }

    /**
     * Gets the value of the benCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenCityCode() {
        return benCityCode;
    }

    /**
     * Sets the value of the benCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenCityCode(String value) {
        this.benCityCode = value;
    }

    /**
     * Gets the value of the bankSortCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankSortCode() {
        return bankSortCode;
    }

    /**
     * Sets the value of the bankSortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankSortCode(String value) {
        this.bankSortCode = value;
    }

    /**
     * Gets the value of the bankSwiftCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankSwiftCode() {
        return bankSwiftCode;
    }

    /**
     * Sets the value of the bankSwiftCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankSwiftCode(String value) {
        this.bankSwiftCode = value;
    }

    /**
     * Gets the value of the nickName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Sets the value of the nickName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickName(String value) {
        this.nickName = value;
    }

    /**
     * Gets the value of the add1Remarks1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdd1Remarks1() {
        return add1Remarks1;
    }

    /**
     * Sets the value of the add1Remarks1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdd1Remarks1(String value) {
        this.add1Remarks1 = value;
    }

    /**
     * Gets the value of the add2Remarks2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdd2Remarks2() {
        return add2Remarks2;
    }

    /**
     * Sets the value of the add2Remarks2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdd2Remarks2(String value) {
        this.add2Remarks2 = value;
    }

    /**
     * Gets the value of the add3Remarks3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdd3Remarks3() {
        return add3Remarks3;
    }

    /**
     * Sets the value of the add3Remarks3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdd3Remarks3(String value) {
        this.add3Remarks3 = value;
    }

    /**
     * Gets the value of the bankNameRemarks4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankNameRemarks4() {
        return bankNameRemarks4;
    }

    /**
     * Sets the value of the bankNameRemarks4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankNameRemarks4(String value) {
        this.bankNameRemarks4 = value;
    }

    /**
     * Gets the value of the bankAdd1Remarks5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAdd1Remarks5() {
        return bankAdd1Remarks5;
    }

    /**
     * Sets the value of the bankAdd1Remarks5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAdd1Remarks5(String value) {
        this.bankAdd1Remarks5 = value;
    }

    /**
     * Gets the value of the bankAdd2Remarks6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAdd2Remarks6() {
        return bankAdd2Remarks6;
    }

    /**
     * Sets the value of the bankAdd2Remarks6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAdd2Remarks6(String value) {
        this.bankAdd2Remarks6 = value;
    }

    /**
     * Gets the value of the clearingCodeRemarks7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearingCodeRemarks7() {
        return clearingCodeRemarks7;
    }

    /**
     * Sets the value of the clearingCodeRemarks7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearingCodeRemarks7(String value) {
        this.clearingCodeRemarks7 = value;
    }

    /**
     * Gets the value of the cityRemarks8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityRemarks8() {
        return cityRemarks8;
    }

    /**
     * Sets the value of the cityRemarks8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityRemarks8(String value) {
        this.cityRemarks8 = value;
    }

    /**
     * Gets the value of the countryRemarks9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryRemarks9() {
        return countryRemarks9;
    }

    /**
     * Sets the value of the countryRemarks9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryRemarks9(String value) {
        this.countryRemarks9 = value;
    }

    /**
     * Gets the value of the currencyRemarks10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyRemarks10() {
        return currencyRemarks10;
    }

    /**
     * Sets the value of the currencyRemarks10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyRemarks10(String value) {
        this.currencyRemarks10 = value;
    }

    /**
     * Gets the value of the activationRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationRefNo() {
        return activationRefNo;
    }

    /**
     * Sets the value of the activationRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationRefNo(String value) {
        this.activationRefNo = value;
    }

    /**
     * Gets the value of the activationMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationMode() {
        return activationMode;
    }

    /**
     * Sets the value of the activationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationMode(String value) {
        this.activationMode = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the modifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * Sets the value of the modifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedBy(String value) {
        this.modifiedBy = value;
    }

    /**
     * Gets the value of the modifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifiedDate(XMLGregorianCalendar value) {
        this.modifiedDate = value;
    }

    /**
     * Gets the value of the authBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthBy() {
        return authBy;
    }

    /**
     * Sets the value of the authBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthBy(String value) {
        this.authBy = value;
    }

    /**
     * Gets the value of the authDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuthDate() {
        return authDate;
    }

    /**
     * Sets the value of the authDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuthDate(XMLGregorianCalendar value) {
        this.authDate = value;
    }

    /**
     * Gets the value of the rejectedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectedBy() {
        return rejectedBy;
    }

    /**
     * Sets the value of the rejectedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectedBy(String value) {
        this.rejectedBy = value;
    }

    /**
     * Gets the value of the rejectedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRejectedDate() {
        return rejectedDate;
    }

    /**
     * Sets the value of the rejectedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRejectedDate(XMLGregorianCalendar value) {
        this.rejectedDate = value;
    }

    /**
     * Gets the value of the customerAddressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAddressLine1() {
        return customerAddressLine1;
    }

    /**
     * Sets the value of the customerAddressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAddressLine1(String value) {
        this.customerAddressLine1 = value;
    }

    /**
     * Gets the value of the customerAddressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAddressLine2() {
        return customerAddressLine2;
    }

    /**
     * Sets the value of the customerAddressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAddressLine2(String value) {
        this.customerAddressLine2 = value;
    }

    /**
     * Gets the value of the customerAddressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAddressLine3() {
        return customerAddressLine3;
    }

    /**
     * Sets the value of the customerAddressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAddressLine3(String value) {
        this.customerAddressLine3 = value;
    }

    /**
     * Gets the value of the accountBankFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountBankFormat() {
        return accountBankFormat;
    }

    /**
     * Sets the value of the accountBankFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountBankFormat(String value) {
        this.accountBankFormat = value;
    }

    /**
     * Gets the value of the swiftRoutingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwiftRoutingCode() {
        return swiftRoutingCode;
    }

    /**
     * Sets the value of the swiftRoutingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwiftRoutingCode(String value) {
        this.swiftRoutingCode = value;
    }

    /**
     * Gets the value of the sendReceiveInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendReceiveInfo() {
        return sendReceiveInfo;
    }

    /**
     * Sets the value of the sendReceiveInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendReceiveInfo(String value) {
        this.sendReceiveInfo = value;
    }

}
