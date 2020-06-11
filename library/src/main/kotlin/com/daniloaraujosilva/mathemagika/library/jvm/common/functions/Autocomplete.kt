package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Autocomplete
 *
 * Full name:        System`Autocomplete
 *
 *                   Autocomplete[{string , string , …}, "string"] gives a list of the string  that can complete string.
 *                                       1        2                                          i
 *                   Autocomplete[ s   w , s   w , … , "string"] puts the completions in order of decreasing weights w .
 *                                   1    1   2    2                                                                      i
 *                   Autocomplete[{assoc , assoc , …}, "string"] uses completions specified by the associations assoc .
 *                                      1       2                                                                    i
 *                   Autocomplete[comps, "string", n] gives the first at most n completions.
 * Usage:            Autocomplete[comps] gives an AutocompletionFunction[…] that can be applied to a string.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Autocomplete
 * Documentation:    web: http://reference.wolfram.com/language/ref/Autocomplete.html
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
fun autocomplete(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Autocomplete", arguments.toMutableList(), options)
}
