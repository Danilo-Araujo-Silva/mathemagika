package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Intersection
 *
 * Full name:        System`Intersection
 *
 *                   Intersection[list , list , …] gives a sorted list of the elements common to all the list .
 * Usage:                             1      2                                                               i
 *
 * Options:          SameTest -> Automatic
 *
 *                   Flat
 *                   OneIdentity
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Intersection
 * Documentation:    web: http://reference.wolfram.com/language/ref/Intersection.html
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
fun intersection(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Intersection", arguments.toMutableList(), options)
}
