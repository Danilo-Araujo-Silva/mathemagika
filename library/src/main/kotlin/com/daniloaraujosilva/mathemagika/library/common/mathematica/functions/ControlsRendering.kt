package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ControlsRendering
 *
 * Full name:        System`ControlsRendering
 *
 * Usage:            ControlsRendering is a Style option that specifies how controls should be rendered.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ControlsRendering
 * Documentation:    web: http://reference.wolfram.com/language/ref/ControlsRendering.html
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
fun controlsRendering(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ControlsRendering", arguments.toMutableList(), options)
}
