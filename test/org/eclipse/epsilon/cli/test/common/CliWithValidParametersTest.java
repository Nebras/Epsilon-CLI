/*******************************************************************************
 * Copyright (c) 2011 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Louis Rose - initial API and implementation
 ******************************************************************************/
package org.eclipse.epsilon.cli.test.common;


public abstract class CliWithValidParametersTest extends CliTest {
	
	@Override
	protected String createParameterString(ParameterStringBuilder builder) {
		return builder.inSpecifiedOrder();
	}

}