package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             RegionWithin
 * 
 * Full name:        System`RegionWithin
 * 
 *                   RegionWithin[reg , reg ] returns True if reg  is contained within reg .
 * Usage:                            1     2                     2                        1
 * 
 *                   Assumptions :> $Assumptions
 * Options:          GenerateConditions -> False
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/RegionWithin
 * Documentation:    web: http://reference.wolfram.com/language/ref/RegionWithin.html
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
fun regionWithin(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RegionWithin", arguments.toMutableList(), options)
}
