package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             HumanGrowthData
 *
 * Full name:        System`HumanGrowthData
 *
 *                   HumanGrowthData[spec] returns the range of values within one standard deviation of the mean for all properties of human growth at the specification spec.
 *                   HumanGrowthData[spec, property] returns the range of values within one standard deviation of the mean of a property for the specification spec.
 *                   HumanGrowthData[spec, index] returns the values for all properties of human growth for spec at the specified percentile.
 *                   HumanGrowthData[spec, property, index] returns the value at a specific index of a property for spec at the specified percentile.
 * Usage:            HumanGrowthData[spec, property, quantity] returns the percentile and probability density for a specific value quantity of the property at spec.
 *
 *                   Method -> Automatic
 * Options:          UnitSystem :> $UnitSystem
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HumanGrowthData
 * Documentation:    web: http://reference.wolfram.com/language/ref/HumanGrowthData.html
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
fun humanGrowthData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HumanGrowthData", arguments.toMutableList(), options)
}
