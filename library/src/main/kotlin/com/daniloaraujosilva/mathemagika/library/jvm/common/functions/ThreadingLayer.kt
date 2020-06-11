package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ThreadingLayer
 *
 * Full name:        System`ThreadingLayer
 *
 * Usage:            ThreadingLayer[f] represents a net layer that takes two input arrays and applies a function f to corresponding array elements.
 *
 *                   Inputs -> Automatic
 * Options:          Output -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ThreadingLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/ThreadingLayer.html
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
fun threadingLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ThreadingLayer", arguments.toMutableList(), options)
}
