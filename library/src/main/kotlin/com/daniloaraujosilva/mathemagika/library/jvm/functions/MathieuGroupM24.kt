package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MathieuGroupM24
 *
 * Full name:        System`MathieuGroupM24
 *
 *                   MathieuGroupM24[] represents the sporadic simple Mathieu group M  .
 * Usage:                                                                            24
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MathieuGroupM24
 * Documentation:    web: http://reference.wolfram.com/language/ref/MathieuGroupM24.html
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
fun mathieuGroupM24(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MathieuGroupM24", arguments.toMutableList(), options)
}
