package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CurrentImage
 *
 * Full name:        System`CurrentImage
 *
 *                   CurrentImage[] returns the current image captured from a connected camera.
 * Usage:            CurrentImage[n] returns n sequential image frames as a list.
 *
 *                   ImagePreviewFunction -> Identity
 *                   ImageSize -> Automatic
 *                   ImagingDevice :> Quiet[$ImagingDevice]
 * Options:          RasterSize -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CurrentImage
 * Documentation:    web: http://reference.wolfram.com/language/ref/CurrentImage.html
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
fun currentImage(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CurrentImage", arguments.toMutableList(), options)
}
