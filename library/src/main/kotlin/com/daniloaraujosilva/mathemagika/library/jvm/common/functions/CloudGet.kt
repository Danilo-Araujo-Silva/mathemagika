package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CloudGet
 *
 * Full name:        System`CloudGet
 *
 *                   CloudGet["uri"] reads in a cloud object at a given URI, evaluating each expression in it and returning the last one.
 * Usage:            CloudGet[CloudObject["uri"]] reads in a given cloud object.
 *
 * Options:          CloudBase -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CloudGet
 * Documentation:    web: http://reference.wolfram.com/language/ref/CloudGet.html
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
fun cloudGet(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CloudGet", arguments.toMutableList(), options)
}
