package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ExternalStorageBase
 *
 * Full name:        System`ExternalStorageBase
 *
 * Usage:            ExternalStorageBase is an option for various external storage functions that specifies which external storage service to use.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ExternalStorageBase
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExternalStorageBase.html
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
fun externalStorageBase(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExternalStorageBase", arguments.toMutableList(), options)
}
