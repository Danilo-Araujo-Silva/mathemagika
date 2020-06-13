package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             StyleMenuListing
 *
 * Full name:        System`StyleMenuListing
 *
 * Usage:            StyleMenuListing is an option for cells that specifies whether a given cell style is listed in the Format ▶ Style submenu.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StyleMenuListing
 * Documentation:    web: http://reference.wolfram.com/language/ref/StyleMenuListing.html
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
fun styleMenuListing(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StyleMenuListing", arguments.toMutableList(), options)
}
