package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Prolog
 *
 * Full name:        System`Prolog
 *
 * Usage:            Prolog is an option for graphics functions which gives a list of graphics primitives to be rendered before the main part of the graphics is rendered.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Prolog
 * Documentation:    web: http://reference.wolfram.com/language/ref/Prolog.html
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
fun prolog(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Prolog", arguments.toMutableList(), options)
}