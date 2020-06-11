package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RegionEqual
 *
 * Full name:        System`RegionEqual
 *
 *                   RegionEqual[reg , reg ] returns True if the regions reg  and reg  are equal.
 *                                  1     2                                 1        2
 *                   RegionEqual[reg , reg , reg , …] returns True if the regions reg , reg , reg , … are all equal.
 * Usage:                           1     2     3                                    1     2     3
 *
 *                   Assumptions :> $Assumptions
 * Options:          GenerateConditions -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RegionEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/RegionEqual.html
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
fun regionEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RegionEqual", arguments.toMutableList(), options)
}
