package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Bookmarks
 *
 * Full name:        System`Bookmarks
 *
 * Usage:            Bookmarks is an option for Manipulate and related functions that gives a list of bookmark settings.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Bookmarks
 * Documentation:    web: http://reference.wolfram.com/language/ref/Bookmarks.html
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
fun bookmarks(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Bookmarks", arguments.toMutableList(), options)
}
