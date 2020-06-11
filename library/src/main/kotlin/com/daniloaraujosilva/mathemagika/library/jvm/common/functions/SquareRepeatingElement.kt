package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SquareRepeatingElement
 *
 * Full name:        System`SquareRepeatingElement
 *
 *                   SquareRepeatingElement[spec] represents a square array of elements of type spec in an interpreter, API or form specification.
 *                   SquareRepeatingElement[spec, max] represents a square array of elements of maximum size max × max.
 * Usage:            SquareRepeatingElement[spec, {min, max}] represents a square array of elements of size between min and max.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/SquareRepeatingElement
 * Documentation:    web: http://reference.wolfram.com/language/ref/SquareRepeatingElement.html
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
fun squareRepeatingElement(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SquareRepeatingElement", arguments.toMutableList(), options)
}
