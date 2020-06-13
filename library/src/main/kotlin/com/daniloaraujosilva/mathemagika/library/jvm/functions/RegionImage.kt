package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RegionImage
 *
 * Full name:        System`RegionImage
 *
 *                   RegionImage[reg] returns a rasterized grayscale 2D or 3D image of reg.
 *                   RegionImage[reg, {{x   , x   }, …}] restricts to the bounds [x   , x   ] × ⋯.
 * Usage:                                min   max                                 min   max
 *
 *                   ImageResolution -> Automatic
 *                   ImageSize -> Automatic
 *                   MetaInformation -> <||>
 *                   Method -> Automatic
 * Options:          RasterSize -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RegionImage
 * Documentation:    web: http://reference.wolfram.com/language/ref/RegionImage.html
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
fun regionImage(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RegionImage", arguments.toMutableList(), options)
}
