package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TextureCoordinateScaling
 * 
 * Full name:        System`TextureCoordinateScaling
 * 
 * Usage:            TextureCoordinateScaling is an option to Plot3D and similar functions that specifies whether arguments supplied to a texture coordinate function should be scaled to lie between 0 and 1.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/TextureCoordinateScaling
 * Documentation:    web: http://reference.wolfram.com/language/ref/TextureCoordinateScaling.html
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
fun textureCoordinateScaling(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TextureCoordinateScaling", arguments.toMutableList(), options)
}
