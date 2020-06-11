package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GaugeFrameSize
 *
 * Full name:        System`GaugeFrameSize
 *
 * Usage:            GaugeFrameSize is an option for gauge functions that controls the size of the frame around the gauge.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GaugeFrameSize
 * Documentation:    web: http://reference.wolfram.com/language/ref/GaugeFrameSize.html
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
fun gaugeFrameSize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GaugeFrameSize", arguments.toMutableList(), options)
}
