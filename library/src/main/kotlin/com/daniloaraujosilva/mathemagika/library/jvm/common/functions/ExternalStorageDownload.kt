package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ExternalStorageDownload
 *
 * Full name:        System`ExternalStorageDownload
 *
 *                   ExternalStorageDownload[location] downloads content from the specified location.
 *                   ExternalStorageDownload[location, file] downloads content from the specified location to a local file.
 *                   ExternalStorageDownload[ExternalStorageObject[…], file] downloads content from the specified ExternalStorageObject.
 * Usage:            ExternalStorageDownload[ExternalStorageObject[…], file] downloads content from the specified ExternalStorageObject to a local file.
 *
 * Options:          ExternalStorageBase :> $ExternalStorageBase
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ExternalStorageDownload
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExternalStorageDownload.html
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
fun externalStorageDownload(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExternalStorageDownload", arguments.toMutableList(), options)
}
