package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ExtractPacletArchive
 *
 * Full name:        System`ExtractPacletArchive
 *
 *                   ExtractPacletArchive[file] extracts the contents of the paclet archive file into the directory in which file resides.
 * Usage:            ExtractPacletArchive[file, destdir] extracts the contents of the paclet archive file into destdir.
 *
 * Options:          Verbose -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ExtractPacletArchive
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExtractPacletArchive.html
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
fun extractPacletArchive(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExtractPacletArchive", arguments.toMutableList(), options)
}
