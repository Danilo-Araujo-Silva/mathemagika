package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             $OutputSizeLimit
 *
 * Full name:        System`$OutputSizeLimit
 *
 * Usage:            $OutputSizeLimit specifies the maximum size in bytes of expressions that will automatically be output in their entirety in a Wolfram System notebook.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/$OutputSizeLimit
 * Documentation:    web: http://reference.wolfram.com/language/ref/$OutputSizeLimit.html
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
fun `$OutputSizeLimit`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$OutputSizeLimit", arguments.toMutableList(), options)
}
