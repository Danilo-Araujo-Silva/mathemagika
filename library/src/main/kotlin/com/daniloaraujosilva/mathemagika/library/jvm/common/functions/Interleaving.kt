package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Interleaving
 *
 * Full name:        System`Interleaving
 *
 * Usage:            Interleaving is an option for Image and related functions that specifies whether data corresponding to different channels in an object such as an image should be interleaved.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Interleaving
 * Documentation:    web: http://reference.wolfram.com/language/ref/Interleaving.html
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
fun interleaving(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Interleaving", arguments.toMutableList(), options)
}
