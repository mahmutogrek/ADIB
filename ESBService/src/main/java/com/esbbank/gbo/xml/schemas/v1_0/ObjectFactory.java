
package com.esbbank.gbo.xml.schemas.v1_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.esbbank.gbo.xml.schemas.v1_0 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Fault_QNAME = new QName("urn:esbbank.com/gbo/xml/schemas/v1_0/", "fault");
    private final static QName _EsbServiceRequest_QNAME = new QName("urn:esbbank.com/gbo/xml/schemas/v1_0/", "esbServiceRequest");
    private final static QName _EsbServiceReply_QNAME = new QName("urn:esbbank.com/gbo/xml/schemas/v1_0/", "esbServiceReply");
    private final static QName _EaiServiceRequest_QNAME = new QName("urn:esbbank.com/gbo/xml/schemas/v1_0/", "eaiServiceRequest");
    private final static QName _EaiServiceReply_QNAME = new QName("urn:esbbank.com/gbo/xml/schemas/v1_0/", "eaiServiceReply");
    private final static QName _Operation1InputParameter1_QNAME = new QName("urn:esbbank.com/gbo/xml/schemas/v1_0/", "operation1InputParameter1");
    private final static QName _Operation1OutputParameter1_QNAME = new QName("urn:esbbank.com/gbo/xml/schemas/v1_0/", "operation1OutputParameter1");
    private final static QName _LimitMaintenanceFaultMsg_QNAME = new QName("urn:esbbank.com/gbo/xml/schemas/v1_0/", "limitMaintenance_faultMsg");
    private final static QName _Address1AddressLine2_QNAME = new QName("", "addressLine2");
    private final static QName _Address1AddressLine3_QNAME = new QName("", "addressLine3");
    private final static QName _SnapInsNameValue_QNAME = new QName("", "nameValue");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.esbbank.gbo.xml.schemas.v1_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AdditionalParameters }
     * 
     */
    public AdditionalParameters createAdditionalParameters() {
        return new AdditionalParameters();
    }

    /**
     * Create an instance of {@link EAIFAULT }
     * 
     */
    public EAIFAULT createEAIFAULT() {
        return new EAIFAULT();
    }

    /**
     * Create an instance of {@link ESBServiceRequest }
     * 
     */
    public ESBServiceRequest createESBServiceRequest() {
        return new ESBServiceRequest();
    }

    /**
     * Create an instance of {@link ESBServiceReply }
     * 
     */
    public ESBServiceReply createESBServiceReply() {
        return new ESBServiceReply();
    }

    /**
     * Create an instance of {@link EAIServiceRequest }
     * 
     */
    public EAIServiceRequest createEAIServiceRequest() {
        return new EAIServiceRequest();
    }

    /**
     * Create an instance of {@link EAIServiceReply }
     * 
     */
    public EAIServiceReply createEAIServiceReply() {
        return new EAIServiceReply();
    }

    /**
     * Create an instance of {@link EAIHEADER }
     * 
     */
    public EAIHEADER createEAIHEADER() {
        return new EAIHEADER();
    }

    /**
     * Create an instance of {@link ReturnStatus }
     * 
     */
    public ReturnStatus createReturnStatus() {
        return new ReturnStatus();
    }

    /**
     * Create an instance of {@link ReturnStatusProvider }
     * 
     */
    public ReturnStatusProvider createReturnStatusProvider() {
        return new ReturnStatusProvider();
    }

    /**
     * Create an instance of {@link LocationInfo }
     * 
     */
    public LocationInfo createLocationInfo() {
        return new LocationInfo();
    }

    /**
     * Create an instance of {@link SecurityInfo }
     * 
     */
    public SecurityInfo createSecurityInfo() {
        return new SecurityInfo();
    }

    /**
     * Create an instance of {@link Authentication }
     * 
     */
    public Authentication createAuthentication() {
        return new Authentication();
    }

    /**
     * Create an instance of {@link Authorization }
     * 
     */
    public Authorization createAuthorization() {
        return new Authorization();
    }

    /**
     * Create an instance of {@link NameValue }
     * 
     */
    public NameValue createNameValue() {
        return new NameValue();
    }

    /**
     * Create an instance of {@link SnapIns }
     * 
     */
    public SnapIns createSnapIns() {
        return new SnapIns();
    }

    /**
     * Create an instance of {@link ChargeCodeDetail }
     * 
     */
    public ChargeCodeDetail createChargeCodeDetail() {
        return new ChargeCodeDetail();
    }

    /**
     * Create an instance of {@link ChargeBenCodeDetail }
     * 
     */
    public ChargeBenCodeDetail createChargeBenCodeDetail() {
        return new ChargeBenCodeDetail();
    }

    /**
     * Create an instance of {@link ChargeOursCodeDetail }
     * 
     */
    public ChargeOursCodeDetail createChargeOursCodeDetail() {
        return new ChargeOursCodeDetail();
    }

    /**
     * Create an instance of {@link AtmInfoType }
     * 
     */
    public AtmInfoType createAtmInfoType() {
        return new AtmInfoType();
    }

    /**
     * Create an instance of {@link AccountType }
     * 
     */
    public AccountType createAccountType() {
        return new AccountType();
    }

    /**
     * Create an instance of {@link PersonName }
     * 
     */
    public PersonName createPersonName() {
        return new PersonName();
    }

    /**
     * Create an instance of {@link ContactInfoType }
     * 
     */
    public ContactInfoType createContactInfoType() {
        return new ContactInfoType();
    }

    /**
     * Create an instance of {@link BranchInfoType }
     * 
     */
    public BranchInfoType createBranchInfoType() {
        return new BranchInfoType();
    }

    /**
     * Create an instance of {@link Id }
     * 
     */
    public Id createId() {
        return new Id();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link RemittanceStatus }
     * 
     */
    public RemittanceStatus createRemittanceStatus() {
        return new RemittanceStatus();
    }

    /**
     * Create an instance of {@link CashRemittanceStatus }
     * 
     */
    public CashRemittanceStatus createCashRemittanceStatus() {
        return new CashRemittanceStatus();
    }

    /**
     * Create an instance of {@link ConsoldateFinanceType }
     * 
     */
    public ConsoldateFinanceType createConsoldateFinanceType() {
        return new ConsoldateFinanceType();
    }

    /**
     * Create an instance of {@link ValidateAccountType }
     * 
     */
    public ValidateAccountType createValidateAccountType() {
        return new ValidateAccountType();
    }

    /**
     * Create an instance of {@link CreditRequestType }
     * 
     */
    public CreditRequestType createCreditRequestType() {
        return new CreditRequestType();
    }

    /**
     * Create an instance of {@link AccountDetail }
     * 
     */
    public AccountDetail createAccountDetail() {
        return new AccountDetail();
    }

    /**
     * Create an instance of {@link RatesType }
     * 
     */
    public RatesType createRatesType() {
        return new RatesType();
    }

    /**
     * Create an instance of {@link CustomerDetailsType }
     * 
     */
    public CustomerDetailsType createCustomerDetailsType() {
        return new CustomerDetailsType();
    }

    /**
     * Create an instance of {@link CustomerCountryType }
     * 
     */
    public CustomerCountryType createCustomerCountryType() {
        return new CustomerCountryType();
    }

    /**
     * Create an instance of {@link Address1 }
     * 
     */
    public Address1 createAddress1() {
        return new Address1();
    }

    /**
     * Create an instance of {@link ContactInfoType1 }
     * 
     */
    public ContactInfoType1 createContactInfoType1() {
        return new ContactInfoType1();
    }

    /**
     * Create an instance of {@link SourceOfWealthType }
     * 
     */
    public SourceOfWealthType createSourceOfWealthType() {
        return new SourceOfWealthType();
    }

    /**
     * Create an instance of {@link MarketType }
     * 
     */
    public MarketType createMarketType() {
        return new MarketType();
    }

    /**
     * Create an instance of {@link CustomerRelationshipType }
     * 
     */
    public CustomerRelationshipType createCustomerRelationshipType() {
        return new CustomerRelationshipType();
    }

    /**
     * Create an instance of {@link CustomerRoleType }
     * 
     */
    public CustomerRoleType createCustomerRoleType() {
        return new CustomerRoleType();
    }

    /**
     * Create an instance of {@link InterestedPartyType }
     * 
     */
    public InterestedPartyType createInterestedPartyType() {
        return new InterestedPartyType();
    }

    /**
     * Create an instance of {@link SMSTextType }
     * 
     */
    public SMSTextType createSMSTextType() {
        return new SMSTextType();
    }

    /**
     * Create an instance of {@link MessageTextType }
     * 
     */
    public MessageTextType createMessageTextType() {
        return new MessageTextType();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link DateRangeType }
     * 
     */
    public DateRangeType createDateRangeType() {
        return new DateRangeType();
    }

    /**
     * Create an instance of {@link CardInfoOffLineType }
     * 
     */
    public CardInfoOffLineType createCardInfoOffLineType() {
        return new CardInfoOffLineType();
    }

    /**
     * Create an instance of {@link CardData }
     * 
     */
    public CardData createCardData() {
        return new CardData();
    }

    /**
     * Create an instance of {@link CardTransListType }
     * 
     */
    public CardTransListType createCardTransListType() {
        return new CardTransListType();
    }

    /**
     * Create an instance of {@link TransactionDateType }
     * 
     */
    public TransactionDateType createTransactionDateType() {
        return new TransactionDateType();
    }

    /**
     * Create an instance of {@link AccountHistoryType }
     * 
     */
    public AccountHistoryType createAccountHistoryType() {
        return new AccountHistoryType();
    }

    /**
     * Create an instance of {@link RetailBeneficiary }
     * 
     */
    public RetailBeneficiary createRetailBeneficiary() {
        return new RetailBeneficiary();
    }

    /**
     * Create an instance of {@link ExchangeRateRecord }
     * 
     */
    public ExchangeRateRecord createExchangeRateRecord() {
        return new ExchangeRateRecord();
    }

    /**
     * Create an instance of {@link CreateNewCard }
     * 
     */
    public CreateNewCard createCreateNewCard() {
        return new CreateNewCard();
    }

    /**
     * Create an instance of {@link CreateNewCoverCard }
     * 
     */
    public CreateNewCoverCard createCreateNewCoverCard() {
        return new CreateNewCoverCard();
    }

    /**
     * Create an instance of {@link AtmCardInfo }
     * 
     */
    public AtmCardInfo createAtmCardInfo() {
        return new AtmCardInfo();
    }

    /**
     * Create an instance of {@link AtmCustInfo }
     * 
     */
    public AtmCustInfo createAtmCustInfo() {
        return new AtmCustInfo();
    }

    /**
     * Create an instance of {@link AtmAcctInfo }
     * 
     */
    public AtmAcctInfo createAtmAcctInfo() {
        return new AtmAcctInfo();
    }

    /**
     * Create an instance of {@link ChangeStatusCard }
     * 
     */
    public ChangeStatusCard createChangeStatusCard() {
        return new ChangeStatusCard();
    }

    /**
     * Create an instance of {@link UpdateLimitCard }
     * 
     */
    public UpdateLimitCard createUpdateLimitCard() {
        return new UpdateLimitCard();
    }

    /**
     * Create an instance of {@link GetAccountsLinkToCard }
     * 
     */
    public GetAccountsLinkToCard createGetAccountsLinkToCard() {
        return new GetAccountsLinkToCard();
    }

    /**
     * Create an instance of {@link GetCardsLinkToAccount }
     * 
     */
    public GetCardsLinkToAccount createGetCardsLinkToAccount() {
        return new GetCardsLinkToAccount();
    }

    /**
     * Create an instance of {@link ActivateCardType }
     * 
     */
    public ActivateCardType createActivateCardType() {
        return new ActivateCardType();
    }

    /**
     * Create an instance of {@link CardType }
     * 
     */
    public CardType createCardType() {
        return new CardType();
    }

    /**
     * Create an instance of {@link DebitRequestType }
     * 
     */
    public DebitRequestType createDebitRequestType() {
        return new DebitRequestType();
    }

    /**
     * Create an instance of {@link ATMLocations }
     * 
     */
    public ATMLocations createATMLocations() {
        return new ATMLocations();
    }

    /**
     * Create an instance of {@link BranchLocations }
     * 
     */
    public BranchLocations createBranchLocations() {
        return new BranchLocations();
    }

    /**
     * Create an instance of {@link DpToGlTransType }
     * 
     */
    public DpToGlTransType createDpToGlTransType() {
        return new DpToGlTransType();
    }

    /**
     * Create an instance of {@link GlToDpTransType }
     * 
     */
    public GlToDpTransType createGlToDpTransType() {
        return new GlToDpTransType();
    }

    /**
     * Create an instance of {@link DpToDpTransType }
     * 
     */
    public DpToDpTransType createDpToDpTransType() {
        return new DpToDpTransType();
    }

    /**
     * Create an instance of {@link DpToDpTransTypeNew }
     * 
     */
    public DpToDpTransTypeNew createDpToDpTransTypeNew() {
        return new DpToDpTransTypeNew();
    }

    /**
     * Create an instance of {@link GlToGlTransType }
     * 
     */
    public GlToGlTransType createGlToGlTransType() {
        return new GlToGlTransType();
    }

    /**
     * Create an instance of {@link CardDetailsInfoType }
     * 
     */
    public CardDetailsInfoType createCardDetailsInfoType() {
        return new CardDetailsInfoType();
    }

    /**
     * Create an instance of {@link StatementDataType }
     * 
     */
    public StatementDataType createStatementDataType() {
        return new StatementDataType();
    }

    /**
     * Create an instance of {@link CardDataType }
     * 
     */
    public CardDataType createCardDataType() {
        return new CardDataType();
    }

    /**
     * Create an instance of {@link UtilityPayee }
     * 
     */
    public UtilityPayee createUtilityPayee() {
        return new UtilityPayee();
    }

    /**
     * Create an instance of {@link UtilityNumber }
     * 
     */
    public UtilityNumber createUtilityNumber() {
        return new UtilityNumber();
    }

    /**
     * Create an instance of {@link CardAccountInfo }
     * 
     */
    public CardAccountInfo createCardAccountInfo() {
        return new CardAccountInfo();
    }

    /**
     * Create an instance of {@link CardInfo }
     * 
     */
    public CardInfo createCardInfo() {
        return new CardInfo();
    }

    /**
     * Create an instance of {@link BenificiaryInfo }
     * 
     */
    public BenificiaryInfo createBenificiaryInfo() {
        return new BenificiaryInfo();
    }

    /**
     * Create an instance of {@link PrepaidCardPaymentInfoType }
     * 
     */
    public PrepaidCardPaymentInfoType createPrepaidCardPaymentInfoType() {
        return new PrepaidCardPaymentInfoType();
    }

    /**
     * Create an instance of {@link AccountStatusType }
     * 
     */
    public AccountStatusType createAccountStatusType() {
        return new AccountStatusType();
    }

    /**
     * Create an instance of {@link BillPaymentRequestType }
     * 
     */
    public BillPaymentRequestType createBillPaymentRequestType() {
        return new BillPaymentRequestType();
    }

    /**
     * Create an instance of {@link UtilityBeneficiaryPayment }
     * 
     */
    public UtilityBeneficiaryPayment createUtilityBeneficiaryPayment() {
        return new UtilityBeneficiaryPayment();
    }

    /**
     * Create an instance of {@link UtilityAdhocPayment }
     * 
     */
    public UtilityAdhocPayment createUtilityAdhocPayment() {
        return new UtilityAdhocPayment();
    }

    /**
     * Create an instance of {@link PaymentRequestType }
     * 
     */
    public PaymentRequestType createPaymentRequestType() {
        return new PaymentRequestType();
    }

    /**
     * Create an instance of {@link Payment }
     * 
     */
    public Payment createPayment() {
        return new Payment();
    }

    /**
     * Create an instance of {@link VoucherPaymentRequest }
     * 
     */
    public VoucherPaymentRequest createVoucherPaymentRequest() {
        return new VoucherPaymentRequest();
    }

    /**
     * Create an instance of {@link TopUpPaymentRequest }
     * 
     */
    public TopUpPaymentRequest createTopUpPaymentRequest() {
        return new TopUpPaymentRequest();
    }

    /**
     * Create an instance of {@link PostPaymentRequest }
     * 
     */
    public PostPaymentRequest createPostPaymentRequest() {
        return new PostPaymentRequest();
    }

    /**
     * Create an instance of {@link UtilityServiceBill }
     * 
     */
    public UtilityServiceBill createUtilityServiceBill() {
        return new UtilityServiceBill();
    }

    /**
     * Create an instance of {@link UtilityService }
     * 
     */
    public UtilityService createUtilityService() {
        return new UtilityService();
    }

    /**
     * Create an instance of {@link UtilityAccount }
     * 
     */
    public UtilityAccount createUtilityAccount() {
        return new UtilityAccount();
    }

    /**
     * Create an instance of {@link UtilityServiceType }
     * 
     */
    public UtilityServiceType createUtilityServiceType() {
        return new UtilityServiceType();
    }

    /**
     * Create an instance of {@link UtilityProvider }
     * 
     */
    public UtilityProvider createUtilityProvider() {
        return new UtilityProvider();
    }

    /**
     * Create an instance of {@link PaymentReplyType }
     * 
     */
    public PaymentReplyType createPaymentReplyType() {
        return new PaymentReplyType();
    }

    /**
     * Create an instance of {@link TopUpPaymentReply }
     * 
     */
    public TopUpPaymentReply createTopUpPaymentReply() {
        return new TopUpPaymentReply();
    }

    /**
     * Create an instance of {@link PaymentVoucherReply }
     * 
     */
    public PaymentVoucherReply createPaymentVoucherReply() {
        return new PaymentVoucherReply();
    }

    /**
     * Create an instance of {@link DepFieldsType }
     * 
     */
    public DepFieldsType createDepFieldsType() {
        return new DepFieldsType();
    }

    /**
     * Create an instance of {@link CreditIntOptsType }
     * 
     */
    public CreditIntOptsType createCreditIntOptsType() {
        return new CreditIntOptsType();
    }

    /**
     * Create an instance of {@link DebitIntOptsType }
     * 
     */
    public DebitIntOptsType createDebitIntOptsType() {
        return new DebitIntOptsType();
    }

    /**
     * Create an instance of {@link CreateStatementType }
     * 
     */
    public CreateStatementType createCreateStatementType() {
        return new CreateStatementType();
    }

    /**
     * Create an instance of {@link RenewCardType }
     * 
     */
    public RenewCardType createRenewCardType() {
        return new RenewCardType();
    }

    /**
     * Create an instance of {@link ReplaceCardType }
     * 
     */
    public ReplaceCardType createReplaceCardType() {
        return new ReplaceCardType();
    }

    /**
     * Create an instance of {@link DebitCardInfoType }
     * 
     */
    public DebitCardInfoType createDebitCardInfoType() {
        return new DebitCardInfoType();
    }

    /**
     * Create an instance of {@link StatementAddress }
     * 
     */
    public StatementAddress createStatementAddress() {
        return new StatementAddress();
    }

    /**
     * Create an instance of {@link CollectionType }
     * 
     */
    public CollectionType createCollectionType() {
        return new CollectionType();
    }

    /**
     * Create an instance of {@link DepositAccountCreate }
     * 
     */
    public DepositAccountCreate createDepositAccountCreate() {
        return new DepositAccountCreate();
    }

    /**
     * Create an instance of {@link CreateAcctRelation }
     * 
     */
    public CreateAcctRelation createCreateAcctRelation() {
        return new CreateAcctRelation();
    }

    /**
     * Create an instance of {@link AccountUserDefineValueType1 }
     * 
     */
    public AccountUserDefineValueType1 createAccountUserDefineValueType1() {
        return new AccountUserDefineValueType1();
    }

    /**
     * Create an instance of {@link NameInfoType }
     * 
     */
    public NameInfoType createNameInfoType() {
        return new NameInfoType();
    }

    /**
     * Create an instance of {@link DepositAccountMaintain }
     * 
     */
    public DepositAccountMaintain createDepositAccountMaintain() {
        return new DepositAccountMaintain();
    }

    /**
     * Create an instance of {@link DepositAccountClose }
     * 
     */
    public DepositAccountClose createDepositAccountClose() {
        return new DepositAccountClose();
    }

    /**
     * Create an instance of {@link BulkTransInformationType }
     * 
     */
    public BulkTransInformationType createBulkTransInformationType() {
        return new BulkTransInformationType();
    }

    /**
     * Create an instance of {@link VisaPaymentTransListType }
     * 
     */
    public VisaPaymentTransListType createVisaPaymentTransListType() {
        return new VisaPaymentTransListType();
    }

    /**
     * Create an instance of {@link VisaPaymentTransType }
     * 
     */
    public VisaPaymentTransType createVisaPaymentTransType() {
        return new VisaPaymentTransType();
    }

    /**
     * Create an instance of {@link DepositInformationType }
     * 
     */
    public DepositInformationType createDepositInformationType() {
        return new DepositInformationType();
    }

    /**
     * Create an instance of {@link CommisionInfoType }
     * 
     */
    public CommisionInfoType createCommisionInfoType() {
        return new CommisionInfoType();
    }

    /**
     * Create an instance of {@link CommisionType }
     * 
     */
    public CommisionType createCommisionType() {
        return new CommisionType();
    }

    /**
     * Create an instance of {@link TPIHeaderType }
     * 
     */
    public TPIHeaderType createTPIHeaderType() {
        return new TPIHeaderType();
    }

    /**
     * Create an instance of {@link AdditionalParameters.Parameter }
     * 
     */
    public AdditionalParameters.Parameter createAdditionalParametersParameter() {
        return new AdditionalParameters.Parameter();
    }

    /**
     * Create an instance of {@link EAIFAULT.EAIBODY }
     * 
     */
    public EAIFAULT.EAIBODY createEAIFAULTEAIBODY() {
        return new EAIFAULT.EAIBODY();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EAIFAULT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:esbbank.com/gbo/xml/schemas/v1_0/", name = "fault")
    public JAXBElement<EAIFAULT> createFault(EAIFAULT value) {
        return new JAXBElement<EAIFAULT>(_Fault_QNAME, EAIFAULT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ESBServiceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:esbbank.com/gbo/xml/schemas/v1_0/", name = "esbServiceRequest")
    public JAXBElement<ESBServiceRequest> createEsbServiceRequest(ESBServiceRequest value) {
        return new JAXBElement<ESBServiceRequest>(_EsbServiceRequest_QNAME, ESBServiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ESBServiceReply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:esbbank.com/gbo/xml/schemas/v1_0/", name = "esbServiceReply")
    public JAXBElement<ESBServiceReply> createEsbServiceReply(ESBServiceReply value) {
        return new JAXBElement<ESBServiceReply>(_EsbServiceReply_QNAME, ESBServiceReply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EAIServiceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:esbbank.com/gbo/xml/schemas/v1_0/", name = "eaiServiceRequest")
    public JAXBElement<EAIServiceRequest> createEaiServiceRequest(EAIServiceRequest value) {
        return new JAXBElement<EAIServiceRequest>(_EaiServiceRequest_QNAME, EAIServiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EAIServiceReply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:esbbank.com/gbo/xml/schemas/v1_0/", name = "eaiServiceReply")
    public JAXBElement<EAIServiceReply> createEaiServiceReply(EAIServiceReply value) {
        return new JAXBElement<EAIServiceReply>(_EaiServiceReply_QNAME, EAIServiceReply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ESBServiceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:esbbank.com/gbo/xml/schemas/v1_0/", name = "operation1InputParameter1")
    public JAXBElement<ESBServiceRequest> createOperation1InputParameter1(ESBServiceRequest value) {
        return new JAXBElement<ESBServiceRequest>(_Operation1InputParameter1_QNAME, ESBServiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ESBServiceReply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:esbbank.com/gbo/xml/schemas/v1_0/", name = "operation1OutputParameter1")
    public JAXBElement<ESBServiceReply> createOperation1OutputParameter1(ESBServiceReply value) {
        return new JAXBElement<ESBServiceReply>(_Operation1OutputParameter1_QNAME, ESBServiceReply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EAIFAULT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:esbbank.com/gbo/xml/schemas/v1_0/", name = "limitMaintenance_faultMsg")
    public JAXBElement<EAIFAULT> createLimitMaintenanceFaultMsg(EAIFAULT value) {
        return new JAXBElement<EAIFAULT>(_LimitMaintenanceFaultMsg_QNAME, EAIFAULT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "addressLine2", scope = Address1 .class)
    public JAXBElement<Object> createAddress1AddressLine2(Object value) {
        return new JAXBElement<Object>(_Address1AddressLine2_QNAME, Object.class, Address1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "addressLine3", scope = Address1 .class)
    public JAXBElement<Object> createAddress1AddressLine3(Object value) {
        return new JAXBElement<Object>(_Address1AddressLine3_QNAME, Object.class, Address1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nameValue", scope = SnapIns.class)
    public JAXBElement<NameValue> createSnapInsNameValue(NameValue value) {
        return new JAXBElement<NameValue>(_SnapInsNameValue_QNAME, NameValue.class, SnapIns.class, value);
    }

}
