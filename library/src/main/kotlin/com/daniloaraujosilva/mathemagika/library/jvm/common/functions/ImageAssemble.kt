package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ImageAssemble
 *
 * Full name:        System`ImageAssemble
 *
 *                   ImageAssemble[{{im  , …, im  }, …, {im  , …, im  }}] assembles a single image from an array of images.
 *                                     11       1n         m1       mn
 *                   ImageAssemble[{{im  , …, im  }, …, {im  , …, im  }}, fitting] assembles images using the fitting method.
 * Usage:                              11       1n         m1       mn
 *
 *                   AlignmentPoint -> Center
 *                   Axes -> False
 *                   AxesEdge -> Automatic
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Background -> Automatic
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
 *                   PaddingSize -> 0
 *                   RotationAction -> Fit
 *                   Spacings -> 0
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
 *                   local: paclet:ref/ImageAssemble
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageAssemble.html
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
fun imageAssemble(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageAssemble", arguments.toMutableList(), options)
}
