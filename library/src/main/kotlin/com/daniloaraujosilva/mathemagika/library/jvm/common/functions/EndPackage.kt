package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EndPackage
 *
 * Full name:        System`EndPackage
 *
 * Usage:            EndPackage[] restores $Context and $ContextPath to their values before the preceding BeginPackage, and prepends the current context to the list $ContextPath.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EndPackage
 * Documentation:    web: http://reference.wolfram.com/language/ref/EndPackage.html
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
fun endPackage(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EndPackage", arguments.toMutableList(), options)
}
