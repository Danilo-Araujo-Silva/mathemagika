package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DownLeftVector
 *
 * Full name:        System`DownLeftVector
 *
 * Usage:            DownLeftVector[x, y, …] displays as x ↽ y ↽ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/DownLeftVector
 * Documentation:    web: http://reference.wolfram.com/language/ref/DownLeftVector.html
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
fun downLeftVector(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DownLeftVector", arguments.toMutableList(), options)
}
