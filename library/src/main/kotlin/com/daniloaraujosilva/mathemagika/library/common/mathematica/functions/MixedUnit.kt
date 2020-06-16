package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MixedUnit
 *
 * Full name:        System`MixedUnit
 *
 *                   MixedUnit[{unit , unit , …, unit }] represents a mixed-unit expression consisting of units unit  through unit .
 * Usage:                           1      2         n                                                              1             n
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MixedUnit
 * Documentation:    web: http://reference.wolfram.com/language/ref/MixedUnit.html
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
fun mixedUnit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MixedUnit", arguments.toMutableList(), options)
}
