package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CreateFile
 *
 * Full name:        System`CreateFile
 *
 *                   CreateFile["file"] creates a file with name file.
 * Usage:            CreateFile[] creates a file in the default area for temporary files on your computer system.
 *
 *                   CreateIntermediateDirectories -> True
 * Options:          OverwriteTarget -> False
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CreateFile
 * Documentation:    web: http://reference.wolfram.com/language/ref/CreateFile.html
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
fun createFile(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CreateFile", arguments.toMutableList(), options)
}
