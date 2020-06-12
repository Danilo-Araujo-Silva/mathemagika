package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MultilineFunction
 *
 * Full name:        System`MultilineFunction
 *
 * Usage:            MultilineFunction is an option for UnderscriptBox and related box objects that specifies what to do when the contents of a box object are too long to fit on one line.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MultilineFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/MultilineFunction.html
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
fun multilineFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MultilineFunction", arguments.toMutableList(), options)
}
