package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GaugeFrameElementFunction
 *
 * Full name:        System`GaugeFrameElementFunction
 *
 * Usage:            GaugeFrameElementFunction is an option for gauge functions that gives a function to generate the primitives for rendering the gauge frame.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GaugeFrameElementFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/GaugeFrameElementFunction.html
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
fun gaugeFrameElementFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GaugeFrameElementFunction", arguments.toMutableList(), options)
}
