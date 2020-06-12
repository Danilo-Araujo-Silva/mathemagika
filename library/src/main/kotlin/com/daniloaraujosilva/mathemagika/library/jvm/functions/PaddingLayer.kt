package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PaddingLayer
 *
 * Full name:        System`PaddingLayer
 *
 *                   PaddingLayer[{{m , n }, {m , n }, …}] represents a net layer that pads an input array with m  elements at the beginning and n  elements at the end at level i of the array.
 * Usage:                            1   1     2   2                                                             i                                i
 *
 *                   Input -> Automatic
 *                   Output -> Automatic
 * Options:          Padding -> 0.
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PaddingLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/PaddingLayer.html
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
fun paddingLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PaddingLayer", arguments.toMutableList(), options)
}
