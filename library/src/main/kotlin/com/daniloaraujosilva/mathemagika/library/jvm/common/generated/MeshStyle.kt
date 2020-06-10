package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MeshStyle
 * 
 * Full name:        System`MeshStyle
 * 
 * Usage:            MeshStyle is an option for Plot3D, DensityPlot, and other plotting functions that specifies the style in which to draw a mesh. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/MeshStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeshStyle.html
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
fun meshStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeshStyle", arguments.toMutableList(), options)
}
