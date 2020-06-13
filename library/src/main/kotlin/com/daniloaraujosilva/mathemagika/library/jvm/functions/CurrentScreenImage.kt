package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CurrentScreenImage
 *
 * Full name:        System`CurrentScreenImage
 *
 *                   CurrentScreenImage[] returns an image captured from all current display screens on your computer.
 *                   CurrentScreenImage[n] returns an image captured from display screen n.
 *                   CurrentScreenImage[{{x   , y   }, {x   , y   }}] returns the specified rectangle from the image of all current display screens.
 * Usage:                                  min   min     max   max
 *
 *                   Background -> GrayLevel[0]
 *                   Head -> Image
 *                   ImageResolution -> Automatic
 * Options:          Method -> Image
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CurrentScreenImage
 * Documentation:    web: http://reference.wolfram.com/language/ref/CurrentScreenImage.html
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
fun currentScreenImage(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CurrentScreenImage", arguments.toMutableList(), options)
}
