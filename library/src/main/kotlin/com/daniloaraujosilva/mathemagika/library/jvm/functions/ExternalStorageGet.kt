package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ExternalStorageGet
 *
 * Full name:        System`ExternalStorageGet
 *
 *                   ExternalStorageGet[ExternalStorageObject[…]] reads in an expression stored at an external storage specified by the ExternalStorageObject.
 * Usage:            ExternalStorageGet[location] reads in an expression stored at location in an external storage specified by $ExternalStorageBase.
 *
 * Options:          ExternalStorageBase :> $ExternalStorageBase
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ExternalStorageGet
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExternalStorageGet.html
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
fun externalStorageGet(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExternalStorageGet", arguments.toMutableList(), options)
}
