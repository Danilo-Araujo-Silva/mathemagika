package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ImportOptions
 * 
 * Full name:        System`ImportOptions
 * 
 * Usage:            ImportOptions is an option for Interpreter and related functions that specifies what options should be used in importing data.
 * 
 * Options:          None
 * 
 * Attributes:
 * 
 *                   local: paclet:ref/ImportOptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImportOptions.html
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
fun importOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImportOptions", arguments.toMutableList(), options)
}
