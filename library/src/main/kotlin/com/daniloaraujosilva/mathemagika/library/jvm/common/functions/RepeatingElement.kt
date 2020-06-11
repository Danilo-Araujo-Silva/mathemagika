package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RepeatingElement
 *
 * Full name:        System`RepeatingElement
 *
 *                   RepeatingElement[spec] represents an arbitrarily repeated type of element in an interpreter, API or form specification.
 *                   RepeatingElement[spec, max] represents an element that can appear at most max times.
 *                   RepeatingElement[spec, {min, max}] represents an element that can appear between min and max times.
 *                   RepeatingElement[spec, {n, {min, max}}] represents an element that initially appears n times in a form.
 * Usage:            RepeatingElement[spec, {{i, n}, {min, max}}] represents an element where i takes successive values.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RepeatingElement
 * Documentation:    web: http://reference.wolfram.com/language/ref/RepeatingElement.html
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
fun repeatingElement(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RepeatingElement", arguments.toMutableList(), options)
}
