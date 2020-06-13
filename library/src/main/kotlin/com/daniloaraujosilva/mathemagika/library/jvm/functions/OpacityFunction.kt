package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             OpacityFunction
 *
 * Full name:        System`OpacityFunction
 *
 * Usage:            OpacityFunction is an option for graphics functions that specifies a function to apply to determine opacity of elements.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/OpacityFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/OpacityFunction.html
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
fun opacityFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OpacityFunction", arguments.toMutableList(), options)
}
