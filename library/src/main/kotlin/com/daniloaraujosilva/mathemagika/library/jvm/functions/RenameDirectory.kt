package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RenameDirectory
 *
 * Full name:        System`RenameDirectory
 *
 *                   RenameDirectory[dir , dir ] renames the directory dir  to dir .
 * Usage:                               1     2                           1       2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RenameDirectory
 * Documentation:    web: http://reference.wolfram.com/language/ref/RenameDirectory.html
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
fun renameDirectory(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RenameDirectory", arguments.toMutableList(), options)
}
