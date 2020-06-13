package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Ellipsoid
 *
 * Full name:        System`Ellipsoid
 *
 *                   Ellipsoid[p, {r , …}] represents an axis-aligned ellipsoid centered at the point p and with semiaxes lengths r .
 *                                  1                                                                                              i
 * Usage:            Ellipsoid[p, Σ] represents an ellipsoid centered at p and weight matrix Σ.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Ellipsoid
 * Documentation:    web: http://reference.wolfram.com/language/ref/Ellipsoid.html
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
fun ellipsoid(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Ellipsoid", arguments.toMutableList(), options)
}
