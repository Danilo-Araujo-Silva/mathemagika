package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AudioLabel
 *
 * Full name:        System`AudioLabel
 *
 * Usage:            AudioLabel is an option for an Audio object that specifies the label to show on the object.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AudioLabel
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioLabel.html
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
fun audioLabel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioLabel", arguments.toMutableList(), options)
}
