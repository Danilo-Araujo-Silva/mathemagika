package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ImageRecolor
 * 
 * Full name:        System`ImageRecolor
 * 
 *                   ImageRecolor[image, region  color] recolors pixels in image specified by region using the specified color.
 *                   ImageRecolor[image, {region   color , …}] recolors multiple regions.
 * Usage:                                       1        1
 * 
 *                   DistanceFunction -> Automatic
 *                   Method -> Automatic
 * Options:          MaxColorDistance -> 0.1
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ImageRecolor
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageRecolor.html
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
fun imageRecolor(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageRecolor", arguments.toMutableList(), options)
}
