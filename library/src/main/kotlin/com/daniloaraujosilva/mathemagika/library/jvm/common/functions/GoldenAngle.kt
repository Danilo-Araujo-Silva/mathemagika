package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GoldenAngle
 *
 * Full name:        System`GoldenAngle
 *
 * Usage:            GoldenAngle is the golden angle (3 - Sqrt[5]) π, with numerical value ≃ 137.5°.
 *
 * Options:          None
 *
 *                   Constant
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GoldenAngle
 * Documentation:    web: http://reference.wolfram.com/language/ref/GoldenAngle.html
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
fun goldenAngle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GoldenAngle", arguments.toMutableList(), options)
}
