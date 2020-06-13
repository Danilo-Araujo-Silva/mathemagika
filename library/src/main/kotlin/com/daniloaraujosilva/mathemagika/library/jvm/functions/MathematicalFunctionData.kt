package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MathematicalFunctionData
 *
 * Full name:        System`MathematicalFunctionData
 *
 *                   MathematicalFunctionData[entity, property] gives data corresponding to property for the mathematical function specified by entity.
 *                   MathematicalFunctionData[entprop, annotation] gives data corresponding to the given entity or property in the format specified by annotation.
 *                   MathematicalFunctionData[entity, property, annotation] gives data for the given entity-property pair in the format specified by annotation.
 *                   MathematicalFunctionData[entity, property, {qual   val , qual   val , …}] gives data for the given entity-property pair with property qualifiers qual , qual , … set to the given values.
 *                                                                   1      1      2      2                                                                                 1      2
 *                   MathematicalFunctionData[entity, property, annotation, {qual   val , qual   val , …}] gives data corresponding to the given entity, property and annotation format, with property qualifiers qual , qual , … set to the given values.
 * Usage:                                                                        1      1      2      2                                                                                                                 1      2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MathematicalFunctionData
 * Documentation:    web: http://reference.wolfram.com/language/ref/MathematicalFunctionData.html
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
fun mathematicalFunctionData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MathematicalFunctionData", arguments.toMutableList(), options)
}
