package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Subsuperscript
 *
 * Full name:        System`Subsuperscript
 *
 *                                                                         z
 *                   Subsuperscript[x, y, z] is an object that formats as x .
 * Usage:                                                                  y
 *
 * Options:          None
 *
 *                   NHoldRest
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Subsuperscript
 * Documentation:    web: http://reference.wolfram.com/language/ref/Subsuperscript.html
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
fun subsuperscript(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Subsuperscript", arguments.toMutableList(), options)
}
