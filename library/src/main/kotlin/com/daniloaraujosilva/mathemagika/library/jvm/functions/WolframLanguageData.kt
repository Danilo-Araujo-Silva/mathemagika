package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             WolframLanguageData
 *
 * Full name:        System`WolframLanguageData
 *
 *                   WolframLanguageData[entity, property] gives the value of the specified property for the Wolfram Language symbol entity.
 *                   WolframLanguageData[{entity , entity , …}, property] gives a list of property values for the specified Wolfram Language symbol entities.
 *                                              1        2
 * Usage:            WolframLanguageData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WolframLanguageData
 * Documentation:    web: http://reference.wolfram.com/language/ref/WolframLanguageData.html
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
fun wolframLanguageData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WolframLanguageData", arguments.toMutableList(), options)
}
