package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SectorOrigin
 *
 * Full name:        System`SectorOrigin
 *
 * Usage:            SectorOrigin is an option to PieChart and related functions that specifies where sectors should start.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SectorOrigin
 * Documentation:    web: http://reference.wolfram.com/language/ref/SectorOrigin.html
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
fun sectorOrigin(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SectorOrigin", arguments.toMutableList(), options)
}
