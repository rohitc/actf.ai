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
package org.eclipse.actf.ai.fennec.impl;

import org.w3c.dom.Node;

class FennecTableRowMetadata extends FennecBundleMetadata {

	protected FennecTableRowMetadata(FennecServiceImpl fennecService,
                                       FennecMode mode,
                                       Node node,
                                       FennecMetadata[] mds) {
		super(fennecService, mode, node, mds);
	}
}

