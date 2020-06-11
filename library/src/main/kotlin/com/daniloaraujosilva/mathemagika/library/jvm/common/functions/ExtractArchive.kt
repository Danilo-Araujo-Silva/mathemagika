package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ExtractArchive
 *
 * Full name:        System`ExtractArchive
 *
 *                   ExtractArchive[file] expands an archive file, saving its content into the current directory.
 *                   ExtractArchive[file, dir] saves the content of an archive file into directory dir.
 * Usage:            ExtractArchive[file, dir, pattern] extracts only files whose names match pattern.
 *
 *                   CreateIntermediateDirectories -> True
 *                   IgnoreCase -> False
 * Options:          OverwriteTarget -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ExtractArchive
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExtractArchive.html
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
fun extractArchive(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExtractArchive", arguments.toMutableList(), options)
}
