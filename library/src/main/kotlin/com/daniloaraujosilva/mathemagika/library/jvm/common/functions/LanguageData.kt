package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LanguageData
 *
 * Full name:        System`LanguageData
 *
 *                   LanguageData[entity, property] gives the value of the specified property for the language entity.
 *                   LanguageData[{entity , entity , …}, property] gives a list of property values for the specified language entities.
 *                                       1        2
 * Usage:            LanguageData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LanguageData
 * Documentation:    web: http://reference.wolfram.com/language/ref/LanguageData.html
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
fun languageData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LanguageData", arguments.toMutableList(), options)
}
