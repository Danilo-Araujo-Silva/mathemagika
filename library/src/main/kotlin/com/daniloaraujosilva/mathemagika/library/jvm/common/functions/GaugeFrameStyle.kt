package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GaugeFrameStyle
 *
 * Full name:        System`GaugeFrameStyle
 *
 * Usage:            GaugeFrameStyle is an option for gauge functions that specifies the style in which the frame is to be drawn.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GaugeFrameStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/GaugeFrameStyle.html
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
fun gaugeFrameStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GaugeFrameStyle", arguments.toMutableList(), options)
}
