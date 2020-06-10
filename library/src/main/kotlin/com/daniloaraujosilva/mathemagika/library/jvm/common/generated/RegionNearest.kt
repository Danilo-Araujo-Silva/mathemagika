package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             RegionNearest
 * 
 * Full name:        System`RegionNearest
 * 
 *                   RegionNearest[reg, p] gives a point in the region reg that is nearest the point p. 
 * Usage:            RegionNearest[reg] gives a RegionNearestFunction[…] that can be repeatedly applied to points. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/RegionNearest
 * Documentation:    web: http://reference.wolfram.com/language/ref/RegionNearest.html
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
fun regionNearest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RegionNearest", arguments.toMutableList(), options)
}
