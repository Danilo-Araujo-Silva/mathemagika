package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SectorSpacing
 *
 * Full name:        System`SectorSpacing
 *
 * Usage:            SectorSpacing is an option to PieChart and related functions that specifies radial spacing of sectors.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SectorSpacing
 * Documentation:    web: http://reference.wolfram.com/language/ref/SectorSpacing.html
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
fun sectorSpacing(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SectorSpacing", arguments.toMutableList(), options)
}
