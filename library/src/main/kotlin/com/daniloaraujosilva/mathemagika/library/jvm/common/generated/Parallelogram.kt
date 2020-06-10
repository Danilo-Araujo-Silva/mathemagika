package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Parallelogram
 * 
 * Full name:        System`Parallelogram
 * 
 *                   Parallelogram[p, {v , v }] represents a parallelogram with origin p and directions v  and v .
 * Usage:                               1   2                                                            1      2
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Parallelogram
 * Documentation:    web: http://reference.wolfram.com/language/ref/Parallelogram.html
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
fun parallelogram(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Parallelogram", arguments.toMutableList(), options)
}
