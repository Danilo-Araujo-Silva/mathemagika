package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Deployed
 *
 * Full name:        System`Deployed
 *
 * Usage:            Deployed is an option for displayed objects, cells, and notebooks that specifies whether their contents should be considered deployed, so that elements such as Slider, InputField, Locator, and Button are active, but general editing and selection is disabled.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Deployed
 * Documentation:    web: http://reference.wolfram.com/language/ref/Deployed.html
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
fun deployed(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Deployed", arguments.toMutableList(), options)
}
