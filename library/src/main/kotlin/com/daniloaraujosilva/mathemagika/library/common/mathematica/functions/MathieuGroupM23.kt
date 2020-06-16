package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MathieuGroupM23
 *
 * Full name:        System`MathieuGroupM23
 *
 *                   MathieuGroupM23[] represents the sporadic simple Mathieu group M  .
 * Usage:                                                                            23
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MathieuGroupM23
 * Documentation:    web: http://reference.wolfram.com/language/ref/MathieuGroupM23.html
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
fun mathieuGroupM23(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MathieuGroupM23", arguments.toMutableList(), options)
}
