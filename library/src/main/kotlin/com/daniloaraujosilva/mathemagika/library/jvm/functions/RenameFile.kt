package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RenameFile
 *
 * Full name:        System`RenameFile
 *
 *                   RenameFile[file , file ] renames file  to file .
 * Usage:                           1      2              1        2
 *
 * Options:          OverwriteTarget -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RenameFile
 * Documentation:    web: http://reference.wolfram.com/language/ref/RenameFile.html
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
fun renameFile(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RenameFile", arguments.toMutableList(), options)
}
