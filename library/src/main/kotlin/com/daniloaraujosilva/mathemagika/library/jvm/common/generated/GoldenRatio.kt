package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             GoldenRatio
 * 
 * Full name:        System`GoldenRatio
 * 
 *                                                       1
 *                   GoldenRatio is the golden ratio ϕ  - (Sqrt[5] + 1), with numerical value ≃ 1.61803.
 * Usage:                                                2
 * 
 * Options:          None
 * 
 *                   Constant
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/GoldenRatio
 * Documentation:    web: http://reference.wolfram.com/language/ref/GoldenRatio.html
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
fun goldenRatio(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GoldenRatio", arguments.toMutableList(), options)
}
