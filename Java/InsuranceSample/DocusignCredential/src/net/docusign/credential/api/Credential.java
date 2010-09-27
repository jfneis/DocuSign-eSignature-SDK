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

package net.docusign.credential.api;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Credential", targetNamespace = "http://www.docusign.net/API/Credential", wsdlLocation = "https://demo.docusign.net/api/3.0/Credential.asmx?WSDL")
public class Credential
    extends Service
{

    private final static URL CREDENTIAL_WSDL_LOCATION;
    private final static WebServiceException CREDENTIAL_EXCEPTION;
    private final static QName CREDENTIAL_QNAME = new QName("http://www.docusign.net/API/Credential", "Credential");

    static {
        CREDENTIAL_WSDL_LOCATION = net.docusign.credential.api.Credential.class.getResource("https://demo.docusign.net/api/3.0/Credential.asmx?WSDL");
        WebServiceException e = null;
        if (CREDENTIAL_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'https://demo.docusign.net/api/3.0/Credential.asmx?WSDL' wsdl. Place the resource correctly in the classpath.");
        }
        CREDENTIAL_EXCEPTION = e;
    }

    public Credential(URL wsdlLocation) {
        super(wsdlLocation, CREDENTIAL_QNAME);
    }

    public Credential(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Credential() {
        super(CREDENTIAL_WSDL_LOCATION, CREDENTIAL_QNAME);
    }

    /**
     * 
     * @return
     *     returns CredentialSoap
     */
    @WebEndpoint(name = "CredentialSoap")
    public CredentialSoap getCredentialSoap() {
        return super.getPort(new QName("http://www.docusign.net/API/Credential", "CredentialSoap"), CredentialSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CredentialSoap
     */
    @WebEndpoint(name = "CredentialSoap")
    public CredentialSoap getCredentialSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.docusign.net/API/Credential", "CredentialSoap"), CredentialSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns CredentialSoap
     */
    @WebEndpoint(name = "CredentialSoap12")
    public CredentialSoap getCredentialSoap12() {
        return super.getPort(new QName("http://www.docusign.net/API/Credential", "CredentialSoap12"), CredentialSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CredentialSoap
     */
    @WebEndpoint(name = "CredentialSoap12")
    public CredentialSoap getCredentialSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.docusign.net/API/Credential", "CredentialSoap12"), CredentialSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CREDENTIAL_EXCEPTION!= null) {
            throw CREDENTIAL_EXCEPTION;
        }
        return CREDENTIAL_WSDL_LOCATION;
    }

}
