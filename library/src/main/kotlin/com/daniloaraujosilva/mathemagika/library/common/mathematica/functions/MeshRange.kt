package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MeshRange
 *
 * Full name:        System`MeshRange
 *
 * Usage:            System`MeshRange
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MeshRange
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeshRange.html
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
fun meshRange(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeshRange", arguments.toMutableList(), options)
}
