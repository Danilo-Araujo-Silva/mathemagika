package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Lighting
 * 
 * Full name:        System`Lighting
 * 
 * Usage:            Lighting is an option for Graphics3D and related functions that specifies what simulated lighting to use in coloring 3D surfaces. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Lighting
 * Documentation:    web: http://reference.wolfram.com/language/ref/Lighting.html
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
fun lighting(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Lighting", arguments.toMutableList(), options)
}
