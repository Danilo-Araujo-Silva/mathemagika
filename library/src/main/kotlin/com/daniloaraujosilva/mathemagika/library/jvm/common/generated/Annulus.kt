package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Annulus
 * 
 * Full name:        System`Annulus
 * 
 *                   Annulus[{x, y}, {r     , r     }] represents an annulus centered at {x, y} with inner radius r      and outer radius r     .
 *                                     inner   outer                                                               inner                   outer
 *                   Annulus[{x, y}, {r     , r     }, {θ , θ }] represents an annulus from angle θ  to θ .
 * Usage:                              inner   outer     1   2                                     1     2
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Annulus
 * Documentation:    web: http://reference.wolfram.com/language/ref/Annulus.html
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
fun annulus(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Annulus", arguments.toMutableList(), options)
}
