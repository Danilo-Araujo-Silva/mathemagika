package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Rectangle
 * 
 * Full name:        System`Rectangle
 * 
 *                   Rectangle[{x   , y   }, {x   , y   }] represents an axis-aligned filled rectangle from {x   , y   } to {x   , y   }.
 *                               min   min     max   max                                                      min   min       max   max
 *                   Rectangle[{x   , y   }] corresponds to a unit square with its bottom-left corner at {x   , y   }.
 * Usage:                        min   min                                                                 min   min
 * 
 * Options:          RoundingRadius -> 0.
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Rectangle
 * Documentation:    web: http://reference.wolfram.com/language/ref/Rectangle.html
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
fun rectangle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Rectangle", arguments.toMutableList(), options)
}
