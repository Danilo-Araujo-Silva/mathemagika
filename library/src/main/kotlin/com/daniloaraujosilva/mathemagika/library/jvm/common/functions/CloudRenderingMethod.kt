package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CloudRenderingMethod
 *
 * Full name:        System`CloudRenderingMethod
 *
 * Usage:            CloudRenderingMethod is an option for Cell and Notebook that specifies how to render cells in the cloud.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CloudRenderingMethod
 * Documentation:    web: http://reference.wolfram.com/language/ref/CloudRenderingMethod.html
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
fun cloudRenderingMethod(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CloudRenderingMethod", arguments.toMutableList(), options)
}
