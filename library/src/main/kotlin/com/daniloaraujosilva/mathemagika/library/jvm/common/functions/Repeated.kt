package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Repeated
 *
 * Full name:        System`Repeated
 *
 *                   p .. or Repeated[p] is a pattern object that represents a sequence of one or more expressions, each matching p.
 *                   Repeated[p, max] represents from 1 to max expressions matching p.
 *                   Repeated[p, {min, max}] represents between min and max expressions matching p.
 * Usage:            Repeated[p, {n}] represents exactly n expressions matching p.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Repeated
 * Documentation:    web: http://reference.wolfram.com/language/ref/Repeated.html
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
fun repeated(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Repeated", arguments.toMutableList(), options)
}
