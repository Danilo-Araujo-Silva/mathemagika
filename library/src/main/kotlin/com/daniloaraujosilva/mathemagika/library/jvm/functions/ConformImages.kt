package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ConformImages
 *
 * Full name:        System`ConformImages
 *
 *                   ConformImages[{image , image , …}] returns a list of images where all image  are made to have conforming properties, including dimensions, data type, color space, and interleaving.
 *                                       1       2                                              i
 *                   ConformImages[{image , image , …}, spec] returns all images of the specified spec.
 *                                       1       2
 *                   ConformImages[{image , image , …}, spec, fitting] resizes images using the specified fitting method.
 * Usage:                                1       2
 *
 *                   AlignmentPoint -> Inherited
 *                   Axes -> Inherited
 *                   AxesEdge -> Inherited
 *                   AxesLabel -> Inherited
 *                   AxesOrigin -> Inherited
 *                   AxesStyle -> Inherited
 *                   Background -> Inherited
 *                   BaselinePosition -> Inherited
 *                   Boxed -> Inherited
 *                   BoxRatios -> Inherited
 *                   BoxStyle -> Inherited
 *                   ClipPlanes -> Inherited
 *                   ClipPlanesStyle -> Inherited
 *                   ClipRange -> Inherited
 *                   ColorFunction -> Inherited
 *                   ColorSpace -> Automatic
 *                   CoordinatesToolOptions -> Inherited
 *                   ImageResolution -> Inherited
 *                   ImageSize -> Automatic
 *                   Interleaving -> Automatic
 *                   Magnification -> Automatic
 *                   MetaInformation -> Inherited
 *                   Method -> Inherited
 *                   Padding -> Automatic
 *                   RotationAction -> Inherited
 *                   SphericalRegion -> Inherited
 *                   TaggingRules -> Inherited
 *                   ViewAngle -> Inherited
 *                   ViewCenter -> Inherited
 *                   ViewMatrix -> Inherited
 *                   ViewPoint -> Inherited
 *                   ViewRange -> Inherited
 *                   ViewVector -> Inherited
 * Options:          ViewVertical -> Inherited
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ConformImages
 * Documentation:    web: http://reference.wolfram.com/language/ref/ConformImages.html
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
fun conformImages(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ConformImages", arguments.toMutableList(), options)
}
