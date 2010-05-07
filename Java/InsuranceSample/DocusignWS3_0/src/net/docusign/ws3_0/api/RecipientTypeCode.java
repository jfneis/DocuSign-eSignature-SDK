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
package net.docusign.ws3_0.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecipientTypeCode.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecipientTypeCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Signer"/>
 *     &lt;enumeration value="CarbonCopy"/>
 *     &lt;enumeration value="CertifiedDelivery"/>
 *     &lt;enumeration value="InPersonSigner"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "RecipientTypeCode")
@XmlEnum
public enum RecipientTypeCode {

    @XmlEnumValue("Signer")
    SIGNER("Signer"),
    @XmlEnumValue("CarbonCopy")
    CARBON_COPY("CarbonCopy"),
    @XmlEnumValue("CertifiedDelivery")
    CERTIFIED_DELIVERY("CertifiedDelivery"),
    @XmlEnumValue("InPersonSigner")
    IN_PERSON_SIGNER("InPersonSigner");
    private final String value;

    RecipientTypeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecipientTypeCode fromValue(String v) {
        for (RecipientTypeCode c: RecipientTypeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
