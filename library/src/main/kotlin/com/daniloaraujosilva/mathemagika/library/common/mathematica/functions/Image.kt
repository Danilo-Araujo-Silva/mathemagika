package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Image
 *
 * Full name:        System`Image
 *
 *                   Image[data] represents a raster image with pixel values given by the array data.
 *                   Image[graphics] creates a raster image from a graphics object.
 * Usage:            Image[obj, options] gives an image that uses the specified options.
 *
 *                   AlignmentPoint -> Center
 *                   BaselinePosition -> Automatic
 *                   ColorSpace -> Automatic
 *                   ImageResolution -> Automatic
 *                   ImageSize -> Automatic
 *                   Interleaving -> Automatic
 *                   Magnification -> Automatic
 * Options:          MetaInformation -> <||>
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Image
 * Documentation:    web: http://reference.wolfram.com/language/ref/Image.html
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
fun image(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Image", arguments.toMutableList(), options)
}
