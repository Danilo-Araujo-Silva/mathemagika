package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SampledEntityClass
 *
 * Full name:        System`SampledEntityClass
 *
 *                   SampledEntityClass[class, n] represents an entity class containing n entities from class.
 * Usage:            SampledEntityClass[class, {m, n}] represents an entity class containing entities m through n of class.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SampledEntityClass
 * Documentation:    web: http://reference.wolfram.com/language/ref/SampledEntityClass.html
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
fun sampledEntityClass(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SampledEntityClass", arguments.toMutableList(), options)
}
