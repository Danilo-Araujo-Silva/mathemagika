package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CreatePacletArchive
 *
 * Full name:        System`CreatePacletArchive
 *
 *                   CreatePacletArchive[source] creates a paclet archive file from source.
 * Usage:            CreatePacletArchive[source, destdir] creates a paclet archive file from source and places it in destdir.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CreatePacletArchive
 * Documentation:    web: http://reference.wolfram.com/language/ref/CreatePacletArchive.html
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
fun createPacletArchive(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CreatePacletArchive", arguments.toMutableList(), options)
}
