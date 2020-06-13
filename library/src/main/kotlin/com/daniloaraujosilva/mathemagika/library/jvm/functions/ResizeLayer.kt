package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ResizeLayer
 *
 * Full name:        System`ResizeLayer
 *
 *                   ResizeLayer[{n}] resizes a matrix of size c  × n  to be size c  × n.
 *                                                              0    0             0
 *                   ResizeLayer[{h, w}] resizes an array of dimensions c  × h  × w  to be size c  × h × w.
 * Usage:                                                                0    0    0             0
 *
 *                   Input -> Automatic
 *                   Output -> Automatic
 * Options:          Resampling -> Linear
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ResizeLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/ResizeLayer.html
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
fun resizeLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ResizeLayer", arguments.toMutableList(), options)
}
