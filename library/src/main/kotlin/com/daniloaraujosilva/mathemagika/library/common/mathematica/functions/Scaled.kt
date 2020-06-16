package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Scaled
 *
 * Full name:        System`Scaled
 *
 *                   Scaled[{x, y, …}] gives the position of a graphical object in terms of coordinates scaled to run from 0 to 1 across the whole plot range in each direction.
 *                   Scaled[{dx, dy, …}, {x , y , …}] gives a position obtained by starting at ordinary coordinates {x , y , …}, then moving by a scaled offset {dx, dy, …}.
 * Usage:                                  0   0                                                                      0   0
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Scaled
 * Documentation:    web: http://reference.wolfram.com/language/ref/Scaled.html
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
fun scaled(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Scaled", arguments.toMutableList(), options)
}
