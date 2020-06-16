package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RadialGradientImage
 *
 * Full name:        System`RadialGradientImage
 *
 *                   RadialGradientImage[gcol] returns an image with values radially changing from center to corners based on gradient color gcol.
 *                   RadialGradientImage[{pos , pos }  gcol] returns an image where the gradient starts at pos  and ends at pos .
 *                                           1     2                                                           1                2
 * Usage:            RadialGradientImage[…, size] returns a radial gradient image of the specified size.
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
 *                   local: paclet:ref/RadialGradientImage
 * Documentation:    web: http://reference.wolfram.com/language/ref/RadialGradientImage.html
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
fun radialGradientImage(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RadialGradientImage", arguments.toMutableList(), options)
}
