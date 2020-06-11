package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PartLayer
 *
 * Full name:        System`PartLayer
 *
 *                                                                        th
 *                   PartLayer[i] represents a net layer that gives the i   part of the input.
 *                   PartLayer[m;;n] gives parts m through n.
 *                   PartLayer[{spec , spec , …}] takes part spec  at level i in the input.
 * Usage:                           1      2                     i
 *
 *                   Input -> Automatic
 * Options:          Output -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PartLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/PartLayer.html
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
fun partLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PartLayer", arguments.toMutableList(), options)
}
