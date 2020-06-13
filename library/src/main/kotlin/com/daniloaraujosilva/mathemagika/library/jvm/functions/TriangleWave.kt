package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TriangleWave
 *
 * Full name:        System`TriangleWave
 *
 *                   TriangleWave[x] gives a triangle wave that varies between -1 and +1 with unit period.
 * Usage:            TriangleWave[{min, max}, x] gives a triangle wave that varies between min and max with unit period.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TriangleWave
 * Documentation:    web: http://reference.wolfram.com/language/ref/TriangleWave.html
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
fun triangleWave(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TriangleWave", arguments.toMutableList(), options)
}
