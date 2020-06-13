package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Piecewise
 *
 * Full name:        System`Piecewise
 *
 *                   Piecewise[{{val , cond }, {val , cond }, …}] represents a piecewise function with values val  in the regions defined by the conditions cond .
 *                                  1      1       2      2                                                      i                                              i
 *                   Piecewise[{{val , cond }, …}, val] uses default value val if none of the cond  apply. The default for val is 0.
 * Usage:                           1      1                                                      i
 *
 * Options:          None
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Piecewise
 * Documentation:    web: http://reference.wolfram.com/language/ref/Piecewise.html
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
 * Default value:    Piecewise /: Default[Piecewise, 2] := 0
 *
 * Numeric values:   None
 */
fun piecewise(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Piecewise", arguments.toMutableList(), options)
}
