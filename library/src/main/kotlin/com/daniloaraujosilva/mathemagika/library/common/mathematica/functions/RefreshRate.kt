package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RefreshRate
 *
 * Full name:        System`RefreshRate
 *
 * Usage:            RefreshRate is an option to Animate and related functions which specifies the refresh rate for frames in animations.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RefreshRate
 * Documentation:    web: http://reference.wolfram.com/language/ref/RefreshRate.html
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
fun refreshRate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RefreshRate", arguments.toMutableList(), options)
}
