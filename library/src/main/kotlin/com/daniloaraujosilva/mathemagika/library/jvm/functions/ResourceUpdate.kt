package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ResourceUpdate
 *
 * Full name:        System`ResourceUpdate
 *
 *                   ResourceUpdate[resource] updates to the latest version of the specified resource object.
 * Usage:            ResourceUpdate["name"] updates the resource with the specified name.
 *
 *                   ResourceVersion -> Automatic
 *                   ResourceSystemBase -> Automatic
 * Options:          WolframLanguageVersion -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ResourceUpdate
 * Documentation:    web: http://reference.wolfram.com/language/ref/ResourceUpdate.html
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
fun resourceUpdate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ResourceUpdate", arguments.toMutableList(), options)
}
