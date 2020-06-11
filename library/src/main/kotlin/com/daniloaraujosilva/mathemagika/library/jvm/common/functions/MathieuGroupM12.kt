package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MathieuGroupM12
 *
 * Full name:        System`MathieuGroupM12
 *
 *                   MathieuGroupM12[] represents the sporadic simple Mathieu group M  .
 * Usage:                                                                            12
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MathieuGroupM12
 * Documentation:    web: http://reference.wolfram.com/language/ref/MathieuGroupM12.html
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
fun mathieuGroupM12(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MathieuGroupM12", arguments.toMutableList(), options)
}
