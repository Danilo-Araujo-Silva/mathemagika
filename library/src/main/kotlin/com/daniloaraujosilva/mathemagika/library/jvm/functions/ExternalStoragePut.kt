package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ExternalStoragePut
 *
 * Full name:        System`ExternalStoragePut
 *
 *                   ExternalStoragePut[expr] writes expr to an external storage specified by $ExternalStorageBase.
 *                   ExternalStoragePut[expr, path] writes expr to a specific path in an external storage specified by $ExternalStorageBase.
 * Usage:            ExternalStoragePut[expr, ExternalStorageObject[...]] writes expr to the service and path represented by an ExternalStorageObject.
 *
 *                   ExternalStorageBase :> $ExternalStorageBase
 * Options:          OverwriteTarget -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ExternalStoragePut
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExternalStoragePut.html
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
fun externalStoragePut(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExternalStoragePut", arguments.toMutableList(), options)
}
