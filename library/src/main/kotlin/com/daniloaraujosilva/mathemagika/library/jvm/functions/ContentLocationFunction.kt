package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ContentLocationFunction
 *
 * Full name:        System`ContentLocationFunction
 *
 * Usage:            ContentLocationFunction is an option to CreateSearchIndex and related functions that specifies how to determine locations to be used for hyperlinks and related constructs in the resulting index.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ContentLocationFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/ContentLocationFunction.html
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
fun contentLocationFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ContentLocationFunction", arguments.toMutableList(), options)
}
