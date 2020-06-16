package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DeleteContents
 *
 * Full name:        System`DeleteContents
 *
 * Usage:            DeleteContents is an option for DeleteDirectory that specifies whether the contents of directories should automatically be deleted.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DeleteContents
 * Documentation:    web: http://reference.wolfram.com/language/ref/DeleteContents.html
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
fun deleteContents(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DeleteContents", arguments.toMutableList(), options)
}
