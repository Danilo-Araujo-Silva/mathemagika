package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ExampleData
 *
 * Full name:        System`ExampleData
 *
 *                   ExampleData["type"] gives a list of names of examples of the specified type.
 *                   ExampleData[{"type", "name"}] gives the default form of the named example of the specified type.
 * Usage:            ExampleData[{"type", "name"}, "elem"] gives the specified element or property of an example.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ExampleData
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExampleData.html
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
fun exampleData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExampleData", arguments.toMutableList(), options)
}
