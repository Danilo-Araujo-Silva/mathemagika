package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Construct
 *
 * Full name:        System`Construct
 *
 *                   Construct[f, x] gives f[x].
 *                   Construct[f, x , …, x ] gives f[x , …, x ].
 * Usage:                          1      n           1      n
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Construct
 * Documentation:    web: http://reference.wolfram.com/language/ref/Construct.html
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
fun construct(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Construct", arguments.toMutableList(), options)
}
