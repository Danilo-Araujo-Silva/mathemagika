package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             RegionDisjoint
 * 
 * Full name:        System`RegionDisjoint
 * 
 *                   RegionDisjoint[reg , reg ] returns True if the regions reg  and reg  are disjoint. 
 *                                     1     2                                 1        2
 *                   RegionDisjoint[reg , reg , reg , …] returns True if the regions reg , reg , reg , … are pairwise disjoint.
 * Usage:                              1     2     3                                    1     2     3
 * 
 *                   Assumptions :> $Assumptions
 * Options:          GenerateConditions -> False
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/RegionDisjoint
 * Documentation:    web: http://reference.wolfram.com/language/ref/RegionDisjoint.html
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
fun regionDisjoint(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RegionDisjoint", arguments.toMutableList(), options)
}
