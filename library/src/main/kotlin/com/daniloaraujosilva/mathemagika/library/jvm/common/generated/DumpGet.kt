package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DumpGet
 * 
 * Full name:        System`DumpGet
 * 
 * Usage:            DumpGet[ "filename"] reads in a file saved with DumpSave.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
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
fun dumpGet(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DumpGet", arguments.toMutableList(), options)
}
