package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RandomInstance
 *
 * Full name:        System`RandomInstance
 *
 *                   RandomInstance[expr] finds a random instance of an expression such as a geometric scene.
 * Usage:            RandomInstance[expr, n] finds n instances.
 *
 * Options:          RandomSeeding -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RandomInstance
 * Documentation:    web: http://reference.wolfram.com/language/ref/RandomInstance.html
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
fun randomInstance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RandomInstance", arguments.toMutableList(), options)
}
