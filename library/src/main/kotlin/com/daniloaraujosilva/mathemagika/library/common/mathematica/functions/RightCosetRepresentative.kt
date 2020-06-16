package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RightCosetRepresentative
 *
 * Full name:        System`RightCosetRepresentative
 *
 * Usage:            RightCosetRepresentative[group, g] returns the smallest element in the right coset of products of the elements of group by g.
 *
 * Options:          GroupActionBase -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RightCosetRepresentative
 * Documentation:    web: http://reference.wolfram.com/language/ref/RightCosetRepresentative.html
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
fun rightCosetRepresentative(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RightCosetRepresentative", arguments.toMutableList(), options)
}
