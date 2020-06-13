package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Image3D
 *
 * Full name:        System`Image3D
 *
 *                   Image3D[data] represents a 3D image with pixel values given by the array data.
 *                   Image3D[{image , image , …}] creates a 3D image from a list of 2D images.
 *                                 1       2
 * Usage:            Image3D[obj, "type"] creates a 3D image of the specified data type.
 *
 *                   AlignmentPoint -> Center
 *                   Axes -> False
 *                   AxesEdge -> Automatic
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   Boxed -> False
 *                   BoxRatios -> Automatic
 *                   BoxStyle -> {}
 *                   ClipPlanes -> None
 *                   ClipPlanesStyle -> Automatic
 *                   ClipRange -> None
 *                   ColorFunction -> Automatic
 *                   ColorSpace -> Automatic
 *                   CoordinatesToolOptions -> Automatic
 *                   ImageResolution -> Automatic
 *                   ImageSize -> Automatic
 *                   Interleaving -> Automatic
 *                   Magnification -> Automatic
 *                   MetaInformation -> <||>
 *                   Method -> Automatic
 *                   RotationAction -> Fit
 *                   SphericalRegion -> False
 *                   ViewAngle -> Automatic
 *                   ViewCenter -> Automatic
 *                   ViewMatrix -> Automatic
 *                   ViewPoint -> {1.3, -2.4, 2.}
 *                   ViewProjection -> Automatic
 *                   ViewRange -> All
 *                   ViewVector -> Automatic
 * Options:          ViewVertical -> {0, 0, 1}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Image3D
 * Documentation:    web: http://reference.wolfram.com/language/ref/Image3D.html
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
fun image3D(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Image3D", arguments.toMutableList(), options)
}
