package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CreateArchive
 *
 * Full name:        System`CreateArchive
 *
 *                   CreateArchive[source] creates a compressed archive in the current directory from source.
 * Usage:            CreateArchive[source, path] creates a compressed archive in the directory or file specified by path.
 *
 *                   CompressionLevel -> Automatic
 *                   CreateIntermediateDirectories -> True
 * Options:          OverwriteTarget -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CreateArchive
 * Documentation:    web: http://reference.wolfram.com/language/ref/CreateArchive.html
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
fun createArchive(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CreateArchive", arguments.toMutableList(), options)
}
