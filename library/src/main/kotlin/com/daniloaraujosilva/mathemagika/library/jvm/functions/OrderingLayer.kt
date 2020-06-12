package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             OrderingLayer
 *
 * Full name:        System`OrderingLayer
 *
 *                   OrderingLayer[] represents a net layer that effectively applies Ordering to its input.
 *                   OrderingLayer[n] gives the first n elements in the ordering of its input.
 * Usage:            OrderingLayer[-n] gives the last n elements in the ordering of its input.
 *
 *                   Input -> Automatic
 * Options:          Output -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/OrderingLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/OrderingLayer.html
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
fun orderingLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OrderingLayer", arguments.toMutableList(), options)
}
