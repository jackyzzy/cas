/*
 * Copyright 2005 The JA-SIG Collaborative. All rights reserved. See license
 * distributed with this file and available online at
 * http://www.uportal.org/license.html
 */
package org.jasig.cas.web.bind.support;

import javax.servlet.http.HttpServletRequest;
import org.jasig.cas.authentication.principal.Credentials;
import org.jasig.cas.web.bind.CredentialsBinder;

/**
 * The default custom binder for credentials. It doesn't do anything as it
 * assumes you're using the Spring bind capabilties. Other implementations
 * may populate credentials from entries in the HttpServletRequest.
 * 
 * @author Scott Battaglia
 * @version $Revision$ $Date$
 * @since 3.0
 */
public final class DefaultSpringBindCredentialsBinder implements
    CredentialsBinder {

    /**
     * This method does nothing as Spring handles everything.
     * 
     * @param request The HttpServletRequest from which we wish to bind
     * credentials to
     * @param credentials The credentials we will be doing custom binding to.
     */
    public void bind(final HttpServletRequest request,
        final Credentials credentials) {
        // there is nothing to see here, move along please.
    }

    /**
     * This supports method will always return true since the class does
     * nothing.
     * 
     * @param clazz The class to determine is supported or not
     * @return true if this class is supported by the CredentialsBinder, false
     * otherwise.
     */
    public boolean supports(final Class clazz) {
        return true;
    }
}
