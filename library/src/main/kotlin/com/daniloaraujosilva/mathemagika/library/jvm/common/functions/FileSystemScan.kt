package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FileSystemScan
 *
 * Full name:        System`FileSystemScan
 *
 *                   FileSystemScan[f, root] evaluates f on all files contained in root.
 * Usage:            FileSystemScan[f, root, n] restricts the operation to directories at level n.
 *
 *                   FileNameForms -> All
 *                   IncludeDirectories -> False
 * Options:          MaxItems -> Infinity
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FileSystemScan
 * Documentation:    web: http://reference.wolfram.com/language/ref/FileSystemScan.html
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
fun fileSystemScan(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FileSystemScan", arguments.toMutableList(), options)
}
