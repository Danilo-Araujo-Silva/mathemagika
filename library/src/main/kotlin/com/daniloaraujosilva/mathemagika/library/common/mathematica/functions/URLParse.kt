package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             URLParse
 *
 * Full name:        System`URLParse
 *
 *                   URLParse["url"] takes a well-formed URL and gives an association whose values correspond to the components of the URL.
 *                   URLParse["url", "component"] returns only the specified component.
 *                   URLParse["url", {component , component , …}] returns only the specified component list.
 * Usage:                                      1           2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/URLParse
 * Documentation:    web: http://reference.wolfram.com/language/ref/URLParse.html
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
 * Default value:    Options[URLParse] := Options[URLQueryEncode]
 *
 * Numeric values:   None
 */
fun uRLParse(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("URLParse", arguments.toMutableList(), options)
}
