package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ResourceData
 *
 * Full name:        System`ResourceData
 *
 *                   ResourceData[resource] gives the primary content of the specified resource.
 * Usage:            ResourceData[resource, elem] gives element elem of the content of the resource.
 *
 * Options:          ResourceSystemBase :> $ResourceSystemBase
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ResourceData
 * Documentation:    web: http://reference.wolfram.com/language/ref/ResourceData.html
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
fun resourceData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ResourceData", arguments.toMutableList(), options)
}
