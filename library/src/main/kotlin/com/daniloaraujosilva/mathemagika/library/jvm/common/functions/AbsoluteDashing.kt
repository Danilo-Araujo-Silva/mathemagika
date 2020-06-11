package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AbsoluteDashing
 *
 * Full name:        System`AbsoluteDashing
 *
 *                   AbsoluteDashing[{d , d , …}] is a graphics directive which specifies that lines which follow are to be drawn dashed, with successive segments having absolute lengths d , d , … (repeated cyclically).
 *                                     1   2                                                                                                                                                1   2
 * Usage:            AbsoluteDashing[d] is equivalent to AbsoluteDashing[{d, d}].
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AbsoluteDashing
 * Documentation:    web: http://reference.wolfram.com/language/ref/AbsoluteDashing.html
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
fun absoluteDashing(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AbsoluteDashing", arguments.toMutableList(), options)
}
