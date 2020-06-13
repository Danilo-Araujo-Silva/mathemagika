package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             LinearGradientImage
 *
 * Full name:        System`LinearGradientImage
 *
 *                   LinearGradientImage[gcol] returns an image with values linearly changing from left to right based on gradient color gcol.
 *                   LinearGradientImage[{pos , pos }  gcol] returns an image where the gradient starts at pos  and ends at pos .
 *                                           1     2                                                           1                2
 * Usage:            LinearGradientImage[…, size] returns a linear gradient image of the specified size.
 *
 *                   AlignmentPoint -> Center
 *                   AxesEdge -> Automatic
 *                   Axes -> False
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
 *                   ColorFunctionScaling -> True
 *                   ColorSpace -> Automatic
 *                   CoordinatesToolOptions -> Automatic
 *                   DataRange -> Full
 *                   ImageResolution -> Automatic
 *                   ImageSize -> Automatic
 *                   Interleaving -> Automatic
 *                   Magnification -> Automatic
 *                   MetaInformation -> <||>
 *                   Method -> Automatic
 *                   Padding -> Fixed
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
 *                   local: paclet:ref/LinearGradientImage
 * Documentation:    web: http://reference.wolfram.com/language/ref/LinearGradientImage.html
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
fun linearGradientImage(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LinearGradientImage", arguments.toMutableList(), options)
}
