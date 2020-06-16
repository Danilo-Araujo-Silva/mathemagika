package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Deploy
 *
 * Full name:        System`Deploy
 *
 * Usage:            Deploy[expr] yields a deployed version of expr in which elements such as Slider, InputField, Locator and Button are active, but general editing and selection is disabled.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Deploy
 * Documentation:    web: http://reference.wolfram.com/language/ref/Deploy.html
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
fun deploy(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Deploy", arguments.toMutableList(), options)
}
