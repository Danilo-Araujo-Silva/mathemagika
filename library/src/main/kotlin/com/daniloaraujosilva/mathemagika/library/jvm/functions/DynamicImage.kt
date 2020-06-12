package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DynamicImage
 *
 * Full name:        System`DynamicImage
 *
 *                   DynamicImage[image] displays a dynamic version of image, supporting panning, zooming, etc.
 *                   DynamicImage[file] displays a dynamic version of the image stored in file.
 * Usage:            DynamicImage[url] displays a dynamic version of the image stored in url.
 *
 *                   AppearanceElements -> Automatic
 *                   AspectRatio -> Automatic
 *                   BaselinePosition -> Automatic
 *                   Epilog -> {}
 *                   ImageSize -> Automatic
 *                   SaveDefinitions -> False
 *                   ZoomCenter -> Automatic
 * Options:          ZoomFactor -> Automatic
 *
 *                   HoldAllComplete
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DynamicImage
 * Documentation:    web: http://reference.wolfram.com/language/ref/DynamicImage.html
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
fun dynamicImage(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DynamicImage", arguments.toMutableList(), options)
}
