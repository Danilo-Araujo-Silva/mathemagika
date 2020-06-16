package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MarkovProcessProperties
 *
 * Full name:        System`MarkovProcessProperties
 *
 *                   MarkovProcessProperties[mproc] gives a summary of properties for the finite state Markov process mproc.
 * Usage:            MarkovProcessProperties[mproc, "property"] gives the specified "property" for the process mproc.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MarkovProcessProperties
 * Documentation:    web: http://reference.wolfram.com/language/ref/MarkovProcessProperties.html
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
fun markovProcessProperties(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MarkovProcessProperties", arguments.toMutableList(), options)
}
