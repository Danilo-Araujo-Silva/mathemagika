package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MathieuGroupM11
 *
 * Full name:        System`MathieuGroupM11
 *
 *                   MathieuGroupM11[] represents the sporadic simple Mathieu group M  .
 * Usage:                                                                            11
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MathieuGroupM11
 * Documentation:    web: http://reference.wolfram.com/language/ref/MathieuGroupM11.html
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
fun mathieuGroupM11(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MathieuGroupM11", arguments.toMutableList(), options)
}
