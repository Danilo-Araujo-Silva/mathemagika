package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CounterStyleMenuListing
 *
 * Full name:        System`CounterStyleMenuListing
 *
 * Usage:            CounterStyleMenuListing is an option for cells that specifies what counter styles are listed in the Counter popup menu of the Create Automatic Numbering Object dialog box.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CounterStyleMenuListing
 * Documentation:    web: http://reference.wolfram.com/language/ref/CounterStyleMenuListing.html
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
fun counterStyleMenuListing(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CounterStyleMenuListing", arguments.toMutableList(), options)
}
