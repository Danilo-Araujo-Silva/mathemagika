package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AlternatingGroup
 *
 * Full name:        System`AlternatingGroup
 *
 * Usage:            AlternatingGroup[n] represents the alternating group of degree n.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AlternatingGroup
 * Documentation:    web: http://reference.wolfram.com/language/ref/AlternatingGroup.html
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
fun alternatingGroup(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AlternatingGroup", arguments.toMutableList(), options)
}
