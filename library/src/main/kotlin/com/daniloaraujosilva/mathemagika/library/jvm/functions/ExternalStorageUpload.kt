package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ExternalStorageUpload
 *
 * Full name:        System`ExternalStorageUpload
 *
 *                   ExternalStorageUpload[file] uploads file to an external storage specified by $ExternalStorageBase.
 *                   ExternalStorageUpload[file, path] uploads file to a specific path for external storage services that support it.
 * Usage:            ExternalStorageUpload[file, ExternalStorageObject[…]] uploads file to the service and path represented by an ExternalStorageObject.
 *
 *                   ExternalStorageBase :> $ExternalStorageBase
 * Options:          OverwriteTarget -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ExternalStorageUpload
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExternalStorageUpload.html
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
fun externalStorageUpload(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExternalStorageUpload", arguments.toMutableList(), options)
}
