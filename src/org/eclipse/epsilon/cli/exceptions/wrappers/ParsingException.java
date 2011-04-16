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
package org.eclipse.epsilon.cli.exceptions.wrappers;

import org.eclipse.epsilon.cli.domain.Program;


public class ParsingException extends CommandLineInteraceExceptionWithUnderlyingCause {

	// Generated by Eclipse
	private static final long serialVersionUID = 6755286674330359487L;
		
	public ParsingException(Program program, Exception cause) {
		super(createMessage(program), cause);
	}

	public ParsingException(Program program, String cause) {
		super(createMessage(program), cause);
	}

	private static String createMessage(Program program) {
		return "Error encountered whilst parsing " + program.getName();
	}
}
