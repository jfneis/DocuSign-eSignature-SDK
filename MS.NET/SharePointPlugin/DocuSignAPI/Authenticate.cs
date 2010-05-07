﻿/*

Copyright (C) DocuSign, Inc.  All rights reserved.

This source code is intended only as a supplement to DocuSign SDK 
and/or on-line documentation.

This sample is designed to demonstrate DocuSign features and is not intended 
for production use. Code and policy for a production application must be 
developed to meet the specific data and security requirements of the 
application.

THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY
KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR FITNESS FOR A
PARTICULAR PURPOSE.
*/

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using DocuSignAPI.CredentialService;
using DocuSignAPI.APIService;
using System.IO;

namespace DocuSignAPI
{
    public class Authenticate
    {
        
        /// <summary>
        /// Validate the user
        /// </summary>
        /// <param name="userName"></param>
        /// <param name="password"></param>
        /// <returns></returns>
        public static LoginResult ValidateUser(string userName, string password)
        {
            CredentialSoapClient credentialSoapClient = new CredentialSoapClient();
            LoginResult loginResult = credentialSoapClient.Login(userName, password);
            return loginResult;
        }

        
    }
}
