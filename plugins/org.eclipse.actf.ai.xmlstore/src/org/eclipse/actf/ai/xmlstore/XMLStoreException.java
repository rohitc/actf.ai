/*******************************************************************************
 * Copyright (c) 2007 IBM Corporation and Others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Hisashi MIYASHITA - initial API and implementation
 *******************************************************************************/

package org.eclipse.actf.ai.xmlstore;

/**
 * XMLStoreException is thrown when a XML parsing is failed.
 */
public class XMLStoreException extends Exception {
    private static final long serialVersionUID = -4630681290620194750L;
    
    /**
     * @param message
     * @param cause
     * @see Exception#Exception(String, Throwable)
     */
    public XMLStoreException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message
     * @see Exception#Exception(String)
     */
    public XMLStoreException(String message) {
        super(message);
    }
}
