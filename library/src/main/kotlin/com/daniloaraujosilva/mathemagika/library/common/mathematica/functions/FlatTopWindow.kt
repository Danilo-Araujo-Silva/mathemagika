package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FlatTopWindow
 *
 * Full name:        System`FlatTopWindow
 *
 * Usage:            FlatTopWindow[x] represents a exact flat top window function of x.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FlatTopWindow
 * Documentation:    web: http://reference.wolfram.com/language/ref/FlatTopWindow.html
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
fun flatTopWindow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FlatTopWindow", arguments.toMutableList(), options)
}
