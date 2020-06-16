package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Specularity
 *
 * Full name:        System`Specularity
 *
 *                   Specularity[s] is a graphics directive which specifies that surfaces of 3D graphics objects which follow are to be taken to have specularity s.
 * Usage:            Specularity[s, n] uses specular exponent n.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Specularity
 * Documentation:    web: http://reference.wolfram.com/language/ref/Specularity.html
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
fun specularity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Specularity", arguments.toMutableList(), options)
}
