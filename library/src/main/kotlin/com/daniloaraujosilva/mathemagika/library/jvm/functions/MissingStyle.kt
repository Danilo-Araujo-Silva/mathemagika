package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MissingStyle
 *
 * Full name:        System`MissingStyle
 *
 * Usage:            MissingStyle is an option for GeoRegionValuePlot that specifies how locations with missing data should be displayed.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MissingStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/MissingStyle.html
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
fun missingStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MissingStyle", arguments.toMutableList(), options)
}
