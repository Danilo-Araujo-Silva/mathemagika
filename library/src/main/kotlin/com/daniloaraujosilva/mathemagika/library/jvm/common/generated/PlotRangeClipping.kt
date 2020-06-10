package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PlotRangeClipping
 * 
 * Full name:        System`PlotRangeClipping
 * 
 * Usage:            PlotRangeClipping is an option for graphics functions that specifies whether graphics objects should be clipped at the edge of the region defined by PlotRange, or should be allowed to extend to the actual edge of the image. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/PlotRangeClipping
 * Documentation:    web: http://reference.wolfram.com/language/ref/PlotRangeClipping.html
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
fun plotRangeClipping(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PlotRangeClipping", arguments.toMutableList(), options)
}
