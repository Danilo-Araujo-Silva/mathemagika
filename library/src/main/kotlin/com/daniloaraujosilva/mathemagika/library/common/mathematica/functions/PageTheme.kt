package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PageTheme
 *
 * Full name:        System`PageTheme
 *
 * Usage:            PageTheme is an option for FormObject, GalleryView, and related functions that specifies an overall theme for a webpage and its elements.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PageTheme
 * Documentation:    web: http://reference.wolfram.com/language/ref/PageTheme.html
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
fun pageTheme(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PageTheme", arguments.toMutableList(), options)
}
