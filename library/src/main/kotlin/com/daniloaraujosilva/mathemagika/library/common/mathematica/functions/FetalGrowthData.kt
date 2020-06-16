package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FetalGrowthData
 *
 * Full name:        System`FetalGrowthData
 *
 *                   FetalGrowthData[age] returns the values for all properties of fetal development for the specified age of the fetus.
 *                   FetalGrowthData[age, property] returns the value for a property of fetal development for the specified age.
 *                   FetalGrowthData[age, index] returns the values for all properties of fetal development at the specified age and percentile.
 * Usage:            FetalGrowthData[age, property, index] returns the value for a property at the specified age and percentile.
 *
 * Options:          UnitSystem :> $UnitSystem
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FetalGrowthData
 * Documentation:    web: http://reference.wolfram.com/language/ref/FetalGrowthData.html
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
fun fetalGrowthData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FetalGrowthData", arguments.toMutableList(), options)
}
