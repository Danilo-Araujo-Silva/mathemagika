package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Distribute
 *
 * Full name:        System`Distribute
 *
 *                   Distribute[f[x , x , …]] distributes f over Plus appearing in any of the x .
 *                                 1   2                                                       i
 *                   Distribute[expr, g] distributes over g.
 * Usage:            Distribute[expr, g, f] performs the distribution only if the head of expr is f.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Distribute
 * Documentation:    web: http://reference.wolfram.com/language/ref/Distribute.html
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
fun distribute(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Distribute", arguments.toMutableList(), options)
}
