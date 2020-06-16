package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ReliefImage
 *
 * Full name:        System`ReliefImage
 *
 * Usage:            ReliefImage[array] generates a relief image of an array of height values.
 *
 *                   ClippingStyle -> {GrayLevel[0], GrayLevel[1]}
 *                   ColorFunction -> DarkTerrain
 *                   ColorFunctionScaling -> True
 *                   ImageSize -> Automatic
 *                   LightingAngle -> Automatic
 *                   Method -> Automatic
 * Options:          PlotRange -> All
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ReliefImage
 * Documentation:    web: http://reference.wolfram.com/language/ref/ReliefImage.html
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
fun reliefImage(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ReliefImage", arguments.toMutableList(), options)
}
