package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SystemStub
 * 
 * Full name:        System`SystemStub
 * 
 *                   SystemStub[{sym , sym , …}, "context", "filename"] saves definitions of given symbols {sym , sym , …} and all symbols in the given "context" specified in source file with encoded path "filename" and creates auto-loading rules for each symbol sym
 *                                  1     2                                                                    1     2                                                                                                                                                    i
 *                   SystemStub[{sym , …}, "context", "filename", {esym , …}] also saves definitions for extra symbols {esym , …}, but does not create auto-loading rules for them.
 *                                  1                                  1                                                    1
 *                   SystemStub[{sym , …}, "context", "filename", {esym , …}, {fs , …}, {patt , …}] also saves formatting rules for symbols {fs , …} for formatting patterns {patt , …}.
 * Usage:                           1                                  1         1           1                                                 1                                  1
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
 * 
 * Definitions:      None
 * 
 * Own values:       None
 * 
 * Down values:      None
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun systemStub(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemStub", arguments.toMutableList(), options)
}
