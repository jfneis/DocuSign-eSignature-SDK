/*
Copyright (C) DocuSign, Inc.  All rights reserved.

This source code is intended only as a supplement to DocuSign SDK and/or on-line documentation.

This sample is designed to demonstrate DocuSign features and is not intended for production use.
Code and policy for a production application must be developed to meet the specific data and
security requirements of the application.

THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESSED
OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR
FITNESS FOR A PARTICULAR PURPOSE.
*/
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */
package net.docusign.ws3_0.api;

import java.util.logging.Logger;

@javax.jws.WebService(
                      serviceName = "APIService",
                      portName = "APIServiceSoap12",
                      targetNamespace = "http://www.docusign.net/API/3.0",
                      wsdlLocation = "https://demo.docusign.net/api/3.0/api.asmx?WSDL",
                      endpointInterface = "net.docusign.ws3_0.api.APIServiceSoap")

public class APIServiceSoapImpl implements APIServiceSoap {

    private static final Logger LOG = Logger.getLogger(APIServiceSoapImpl.class.getName());

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#requestTemplate(java.lang.String  templateID ,)boolean  includeDocumentBytes )*
     */
    public net.docusign.ws3_0.api.EnvelopeTemplate requestTemplate(java.lang.String templateID,boolean includeDocumentBytes) {
        LOG.info("Executing operation requestTemplate");
        System.out.println(templateID);
        System.out.println(includeDocumentBytes);
        try {
            net.docusign.ws3_0.api.EnvelopeTemplate _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#requestTemplates(java.lang.String  accountID )*
     */
    public net.docusign.ws3_0.api.EnvelopeTemplates requestTemplates(java.lang.String accountID) {
        LOG.info("Executing operation requestTemplates");
        System.out.println(accountID);
        try {
            net.docusign.ws3_0.api.EnvelopeTemplates _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#requestRecipientToken(java.lang.String  envelopeID ,)java.lang.String  clientUserID ,)java.lang.String  username ,)java.lang.String  email ,)net.docusign.ws3_0.api.RequestRecipientTokenAuthenticationAssertion  authenticationAssertion ,)net.docusign.ws3_0.api.RequestRecipientTokenClientURLs  clientURLs )*
     */
    public java.lang.String requestRecipientToken(java.lang.String envelopeID,java.lang.String clientUserID,java.lang.String username,java.lang.String email,net.docusign.ws3_0.api.RequestRecipientTokenAuthenticationAssertion authenticationAssertion,net.docusign.ws3_0.api.RequestRecipientTokenClientURLs clientURLs) {
        LOG.info("Executing operation requestRecipientToken");
        System.out.println(envelopeID);
        System.out.println(clientUserID);
        System.out.println(username);
        System.out.println(email);
        System.out.println(authenticationAssertion);
        System.out.println(clientURLs);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#requestDocumentPDFs(java.lang.String  envelopeID )*
     */
    public net.docusign.ws3_0.api.DocumentPDFs requestDocumentPDFs(java.lang.String envelopeID) {
        LOG.info("Executing operation requestDocumentPDFs");
        System.out.println(envelopeID);
        try {
            net.docusign.ws3_0.api.DocumentPDFs _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#requestPDF(java.lang.String  envelopeID )*
     */
    public net.docusign.ws3_0.api.EnvelopePDF requestPDF(java.lang.String envelopeID) {
        LOG.info("Executing operation requestPDF");
        System.out.println(envelopeID);
        try {
            net.docusign.ws3_0.api.EnvelopePDF _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#getAuthenticationToken(java.lang.String  goToEnvelopeID )*
     */
    public java.lang.String getAuthenticationToken(java.lang.String goToEnvelopeID) {
        LOG.info("Executing operation getAuthenticationToken");
        System.out.println(goToEnvelopeID);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#createEnvelopeFromTemplates(net.docusign.ws3_0.api.ArrayOfTemplateReference  templateReferences ,)net.docusign.ws3_0.api.ArrayOfRecipient1  recipients ,)net.docusign.ws3_0.api.EnvelopeInformation  envelopeInformation ,)boolean  activateEnvelope )*
     */
    public net.docusign.ws3_0.api.EnvelopeStatus createEnvelopeFromTemplates(net.docusign.ws3_0.api.ArrayOfTemplateReference templateReferences,net.docusign.ws3_0.api.ArrayOfRecipient1 recipients,net.docusign.ws3_0.api.EnvelopeInformation envelopeInformation,boolean activateEnvelope) {
        LOG.info("Executing operation createEnvelopeFromTemplates");
        System.out.println(templateReferences);
        System.out.println(recipients);
        System.out.println(envelopeInformation);
        System.out.println(activateEnvelope);
        try {
            net.docusign.ws3_0.api.EnvelopeStatus _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#createEnvelope(net.docusign.ws3_0.api.Envelope  envelope )*
     */
    public net.docusign.ws3_0.api.EnvelopeStatus createEnvelope(net.docusign.ws3_0.api.Envelope envelope) {
        LOG.info("Executing operation createEnvelope");
        System.out.println(envelope);
        try {
            net.docusign.ws3_0.api.EnvelopeStatus _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#acknowledgeAuthoritativeCopyExport(java.lang.String  envelopeId ,)java.lang.String  transactionId ,)byte[]  checkSumHash )*
     */
    public net.docusign.ws3_0.api.AuthoritativeCopyExportStatus acknowledgeAuthoritativeCopyExport(java.lang.String envelopeId,java.lang.String transactionId,byte[] checkSumHash) {
        LOG.info("Executing operation acknowledgeAuthoritativeCopyExport");
        System.out.println(envelopeId);
        System.out.println(transactionId);
        System.out.println(checkSumHash);
        try {
            net.docusign.ws3_0.api.AuthoritativeCopyExportStatus _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#uploadTemplate(java.lang.String  templateXML ,)java.lang.String  accountID ,)boolean  shared )*
     */
    public net.docusign.ws3_0.api.SaveTemplateResult uploadTemplate(java.lang.String templateXML,java.lang.String accountID,boolean shared) {
        LOG.info("Executing operation uploadTemplate");
        System.out.println(templateXML);
        System.out.println(accountID);
        System.out.println(shared);
        try {
            net.docusign.ws3_0.api.SaveTemplateResult _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#requestStatusesEx(net.docusign.ws3_0.api.EnvelopeStatusFilter  envelopeStatusFilter )*
     */
    public net.docusign.ws3_0.api.FilteredEnvelopeStatuses requestStatusesEx(net.docusign.ws3_0.api.EnvelopeStatusFilter envelopeStatusFilter) {
        LOG.info("Executing operation requestStatusesEx");
        System.out.println(envelopeStatusFilter);
        try {
            net.docusign.ws3_0.api.FilteredEnvelopeStatuses _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#createAndSendEnvelope(net.docusign.ws3_0.api.Envelope  envelope )*
     */
    public net.docusign.ws3_0.api.EnvelopeStatus createAndSendEnvelope(net.docusign.ws3_0.api.Envelope envelope) {
        LOG.info("Executing operation createAndSendEnvelope");
        System.out.println(envelope);
        try {
            net.docusign.ws3_0.api.EnvelopeStatus _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#getAddressBookItems(java.lang.String  accountID )*
     */
    public net.docusign.ws3_0.api.ArrayOfAddressBookItem getAddressBookItems(java.lang.String accountID) {
        LOG.info("Executing operation getAddressBookItems");
        System.out.println(accountID);
        try {
            net.docusign.ws3_0.api.ArrayOfAddressBookItem _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#requestStatusEx(java.lang.String  envelopeID )*
     */
    public net.docusign.ws3_0.api.EnvelopeStatus requestStatusEx(java.lang.String envelopeID) {
        LOG.info("Executing operation requestStatusEx");
        System.out.println(envelopeID);
        try {
            net.docusign.ws3_0.api.EnvelopeStatus _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#getAccountMembershipFeaturesList(java.lang.String  accountId )*
     */
    public net.docusign.ws3_0.api.AccountMembershipFeaturesList getAccountMembershipFeaturesList(java.lang.String accountId) {
        LOG.info("Executing operation getAccountMembershipFeaturesList");
        System.out.println(accountId);
        try {
            net.docusign.ws3_0.api.AccountMembershipFeaturesList _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#getRecipientList(java.lang.String  senderAccountId ,)java.lang.String  recipientEmail )*
     */
    public net.docusign.ws3_0.api.RecipientList getRecipientList(java.lang.String senderAccountId,java.lang.String recipientEmail) {
        LOG.info("Executing operation getRecipientList");
        System.out.println(senderAccountId);
        System.out.println(recipientEmail);
        try {
            net.docusign.ws3_0.api.RecipientList _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#synchEnvelope(java.lang.String  transactionID ,)java.lang.String  accountID ,)boolean  block )*
     */
    public net.docusign.ws3_0.api.SynchEnvelopeStatus synchEnvelope(java.lang.String transactionID,java.lang.String accountID,boolean block) {
        LOG.info("Executing operation synchEnvelope");
        System.out.println(transactionID);
        System.out.println(accountID);
        System.out.println(block);
        try {
            net.docusign.ws3_0.api.SynchEnvelopeStatus _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#updateAddressBookItems(net.docusign.ws3_0.api.ArrayOfAddressBookItem  addressBookItems ,)boolean  returnAddressBook )*
     */
    public net.docusign.ws3_0.api.UpdateAddressBookResult updateAddressBookItems(net.docusign.ws3_0.api.ArrayOfAddressBookItem addressBookItems,boolean returnAddressBook) {
        LOG.info("Executing operation updateAddressBookItems");
        System.out.println(addressBookItems);
        System.out.println(returnAddressBook);
        try {
            net.docusign.ws3_0.api.UpdateAddressBookResult _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#getStatusInDocuSignConnectFormat(java.lang.String  envelopeID )*
     */
    public net.docusign.ws3_0.api.DocuSignEnvelopeInformation getStatusInDocuSignConnectFormat(java.lang.String envelopeID) {
        LOG.info("Executing operation getStatusInDocuSignConnectFormat");
        System.out.println(envelopeID);
        try {
            net.docusign.ws3_0.api.DocuSignEnvelopeInformation _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#getAccountSettingsList(java.lang.String  accountId )*
     */
    public net.docusign.ws3_0.api.AccountSettingsList getAccountSettingsList(java.lang.String accountId) {
        LOG.info("Executing operation getAccountSettingsList");
        System.out.println(accountId);
        try {
            net.docusign.ws3_0.api.AccountSettingsList _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#requestDocumentPDFsEx(java.lang.String  envelopeID )*
     */
    public net.docusign.ws3_0.api.DocumentPDFs requestDocumentPDFsEx(java.lang.String envelopeID) {
        LOG.info("Executing operation requestDocumentPDFsEx");
        System.out.println(envelopeID);
        try {
            net.docusign.ws3_0.api.DocumentPDFs _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#removeAddressBookItems(net.docusign.ws3_0.api.ArrayOfAddressBookRemoveItem  addressBookRemoveItems ,)boolean  returnAddressBook )*
     */
    public net.docusign.ws3_0.api.UpdateAddressBookResult removeAddressBookItems(net.docusign.ws3_0.api.ArrayOfAddressBookRemoveItem addressBookRemoveItems,boolean returnAddressBook) {
        LOG.info("Executing operation removeAddressBookItems");
        System.out.println(addressBookRemoveItems);
        System.out.println(returnAddressBook);
        try {
            net.docusign.ws3_0.api.UpdateAddressBookResult _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#saveTemplate(net.docusign.ws3_0.api.EnvelopeTemplate  envelopeTemplate )*
     */
    public net.docusign.ws3_0.api.SaveTemplateResult saveTemplate(net.docusign.ws3_0.api.EnvelopeTemplate envelopeTemplate) {
        LOG.info("Executing operation saveTemplate");
        System.out.println(envelopeTemplate);
        try {
            net.docusign.ws3_0.api.SaveTemplateResult _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#ping(*
     */
    public boolean ping() {
        LOG.info("Executing operation ping");
        try {
            boolean _return = false;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#getRecipientEsignList(java.lang.String  userName ,)java.lang.String  senderEmail ,)java.lang.String  senderAccountId ,)java.lang.String  recipientEmail )*
     */
    public net.docusign.ws3_0.api.RecipientEsignList getRecipientEsignList(java.lang.String userName,java.lang.String senderEmail,java.lang.String senderAccountId,java.lang.String recipientEmail) {
        LOG.info("Executing operation getRecipientEsignList");
        System.out.println(userName);
        System.out.println(senderEmail);
        System.out.println(senderAccountId);
        System.out.println(recipientEmail);
        try {
            net.docusign.ws3_0.api.RecipientEsignList _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#requestStatuses(net.docusign.ws3_0.api.EnvelopeStatusFilter  envelopeStatusFilter )*
     */
    public net.docusign.ws3_0.api.FilteredEnvelopeStatuses requestStatuses(net.docusign.ws3_0.api.EnvelopeStatusFilter envelopeStatusFilter) {
        LOG.info("Executing operation requestStatuses");
        System.out.println(envelopeStatusFilter);
        try {
            net.docusign.ws3_0.api.FilteredEnvelopeStatuses _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#correctAndResendEnvelope(net.docusign.ws3_0.api.Correction  correction )*
     */
    public net.docusign.ws3_0.api.CorrectionStatus correctAndResendEnvelope(net.docusign.ws3_0.api.Correction correction) {
        LOG.info("Executing operation correctAndResendEnvelope");
        System.out.println(correction);
        try {
            net.docusign.ws3_0.api.CorrectionStatus _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#requestDocumentPDFsRecipientsView(java.lang.String  envelopeID ,)java.lang.String  recipientName ,)java.lang.String  recipientEmail )*
     */
    public net.docusign.ws3_0.api.DocumentPDFs requestDocumentPDFsRecipientsView(java.lang.String envelopeID,java.lang.String recipientName,java.lang.String recipientEmail) {
        LOG.info("Executing operation requestDocumentPDFsRecipientsView");
        System.out.println(envelopeID);
        System.out.println(recipientName);
        System.out.println(recipientEmail);
        try {
            net.docusign.ws3_0.api.DocumentPDFs _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#transferEnvelope(java.lang.String  envelopeID ,)java.lang.String  accountID ,)java.lang.String  userID )*
     */
    public net.docusign.ws3_0.api.TransferEnvelopeStatus transferEnvelope(java.lang.String envelopeID,java.lang.String accountID,java.lang.String userID) {
        LOG.info("Executing operation transferEnvelope");
        System.out.println(envelopeID);
        System.out.println(accountID);
        System.out.println(userID);
        try {
            net.docusign.ws3_0.api.TransferEnvelopeStatus _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#requestSenderToken(java.lang.String  envelopeID ,)java.lang.String  accountID ,)java.lang.String  returnURL )*
     */
    public java.lang.String requestSenderToken(java.lang.String envelopeID,java.lang.String accountID,java.lang.String returnURL) {
        LOG.info("Executing operation requestSenderToken");
        System.out.println(envelopeID);
        System.out.println(accountID);
        System.out.println(returnURL);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#exportAuthoritativeCopy(java.lang.String  envelopeId )*
     */
    public net.docusign.ws3_0.api.AuthoritativeCopyExportDocuments exportAuthoritativeCopy(java.lang.String envelopeId) {
        LOG.info("Executing operation exportAuthoritativeCopy");
        System.out.println(envelopeId);
        try {
            net.docusign.ws3_0.api.AuthoritativeCopyExportDocuments _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#envelopeAuditEvents(java.lang.String  envelopeId )*
     */
    public net.docusign.ws3_0.api.EnvelopeAuditEventsResponse.EnvelopeAuditEventsResult envelopeAuditEvents(java.lang.String envelopeId) {
        LOG.info("Executing operation envelopeAuditEvents");
        System.out.println(envelopeId);
        try {
            net.docusign.ws3_0.api.EnvelopeAuditEventsResponse.EnvelopeAuditEventsResult _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#voidEnvelope(java.lang.String  envelopeID ,)java.lang.String  reason )*
     */
    public net.docusign.ws3_0.api.VoidEnvelopeStatus voidEnvelope(java.lang.String envelopeID,java.lang.String reason) {
        LOG.info("Executing operation voidEnvelope");
        System.out.println(envelopeID);
        System.out.println(reason);
        try {
            net.docusign.ws3_0.api.VoidEnvelopeStatus _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#purgeDocuments(java.lang.String  envelopeID )*
     */
    public net.docusign.ws3_0.api.PurgeDocumentStatus purgeDocuments(java.lang.String envelopeID) {
        LOG.info("Executing operation purgeDocuments");
        System.out.println(envelopeID);
        try {
            net.docusign.ws3_0.api.PurgeDocumentStatus _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.ws3_0.api.APIServiceSoap#requestStatus(java.lang.String  envelopeID )*
     */
    public net.docusign.ws3_0.api.EnvelopeStatus requestStatus(java.lang.String envelopeID) {
        LOG.info("Executing operation requestStatus");
        System.out.println(envelopeID);
        try {
            net.docusign.ws3_0.api.EnvelopeStatus _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
