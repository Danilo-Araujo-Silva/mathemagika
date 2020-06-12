package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DeleteDirectory
 *
 * Full name:        System`DeleteDirectory
 *
 * Usage:            DeleteDirectory["dir"] deletes the specified directory.
 *
 * Options:          DeleteContents -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DeleteDirectory
 * Documentation:    web: http://reference.wolfram.com/language/ref/DeleteDirectory.html
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
fun deleteDirectory(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DeleteDirectory", arguments.toMutableList(), options)
}
