package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             UsingFrontEnd
 *
 * Full name:        System`UsingFrontEnd
 *
 * Usage:            UsingFrontEnd[expr] evaluates expr, making use of a front end if necessary.
 *
 * Options:          None
 *
 *                   HoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/UsingFrontEnd
 * Documentation:    web: http://reference.wolfram.com/language/ref/UsingFrontEnd.html
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
fun usingFrontEnd(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UsingFrontEnd", arguments.toMutableList(), options)
}
