package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Prefix
 *
 * Full name:        System`Prefix
 *
 *                   Prefix[f[expr]] prints with f[expr] given in default prefix form: f @ expr.
 * Usage:            Prefix[f[expr], h] prints as hexpr.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Prefix
 * Documentation:    web: http://reference.wolfram.com/language/ref/Prefix.html
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
fun prefix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Prefix", arguments.toMutableList(), options)
}
