package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Catenate
 *
 * Full name:        System`Catenate
 *
 *                   Catenate[{list , list , …}] yields a single list with all elements from the list  in order.
 *                                 1      2                                                          i
 *                   Catenate[{assoc , assoc , …}] yields a list of all values in order appearing in the associations assoc .
 * Usage:                           1       2                                                                              i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Catenate
 * Documentation:    web: http://reference.wolfram.com/language/ref/Catenate.html
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
fun catenate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Catenate", arguments.toMutableList(), options)
}
