package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ConstantRegionQ
 *
 * Full name:        System`ConstantRegionQ
 *
 * Usage:            ConstantRegionQ[reg] gives True if the reg is a constant region and False otherwise.
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ConstantRegionQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/ConstantRegionQ.html
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
fun constantRegionQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ConstantRegionQ", arguments.toMutableList(), options)
}
