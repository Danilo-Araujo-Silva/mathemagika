package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SolidRegionQ
 *
 * Full name:        System`SolidRegionQ
 *
 * Usage:            SolidRegionQ[reg] gives True if the 3D region reg is a solid region and False otherwise.
 *
 * Options:          None
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SolidRegionQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/SolidRegionQ.html
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
fun solidRegionQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SolidRegionQ", arguments.toMutableList(), options)
}
