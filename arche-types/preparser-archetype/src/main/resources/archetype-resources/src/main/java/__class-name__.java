/*
 * JBoss, Home of Professional Open Source.
 * See the COPYRIGHT.txt file distributed with this work for information
 * regarding copyright ownership.  Some portions may be licensed
 * to Red Hat, Inc. under one or more contributor license agreements.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301 USA.
 */
package ${package};

import org.teiid.PreParser;
import org.teiid.CommandContext;
import org.teiid.logging.LogManager;
import org.teiid.core.BundleUtil;
import org.teiid.logging.LogConstants;

/**
*  User Defined PreParser: ${class-name}
*
**/

public class ${class-name} implements PreParser {

     public static final BundleUtil UTIL = BundleUtil.getBundleUtil(${class-name}.class);

    @Override
    public String preParse(String command, CommandContext context) {
        //manipulate the command
        String rtn = command;

        LogManager.logDetail(LogConstants.CTX_QUERY_RESOLVER, "preparsing command " + command); //$NON-NLS-1$

        return rtn;
    }
}