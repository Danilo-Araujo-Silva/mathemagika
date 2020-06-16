package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CreateDatabin
 *
 * Full name:        System`CreateDatabin
 *
 *                   CreateDatabin[] creates a databin in the Wolfram Data Drop and returns the corresponding Databin object.
 * Usage:            CreateDatabin[options] creates a databin with the specified options.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CreateDatabin
 * Documentation:    web: http://reference.wolfram.com/language/ref/CreateDatabin.html
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
fun createDatabin(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CreateDatabin", arguments.toMutableList(), options)
}
