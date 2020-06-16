package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Graphics3D
 *
 * Full name:        System`Graphics3D
 *
 * Usage:            Graphics3D[primitives, options] represents a three-dimensional graphical image.
 *
 *                   AlignmentPoint -> Center
 *                   AspectRatio -> Automatic
 *                   AutomaticImageSize -> False
 *                   Axes -> False
 *                   AxesEdge -> Automatic
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   Boxed -> True
 *                   BoxRatios -> Automatic
 *                   BoxStyle -> {}
 *                   ClipPlanes -> None
 *                   ClipPlanesStyle -> Automatic
 *                   ColorOutput -> Automatic
 *                   ContentSelectable -> Automatic
 *                   ControllerLinking -> False
 *                   ControllerMethod -> Automatic
 *                   ControllerPath -> Automatic
 *                   CoordinatesToolOptions -> Automatic
 *                   DisplayFunction :> $DisplayFunction
 *                   Epilog -> {}
 *                   FaceGrids -> None
 *                   FaceGridsStyle -> {}
 *                   FormatType :> TraditionalForm
 *                   ImageMargins -> 0.
 *                   ImagePadding -> All
 *                   ImageSize -> Automatic
 *                   ImageSizeRaw -> Automatic
 *                   LabelStyle -> {}
 *                   Lighting -> Automatic
 *                   Method -> Automatic
 *                   PlotLabel -> None
 *                   PlotRange -> All
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PreserveImageOptions -> Automatic
 *                   Prolog -> {}
 *                   RotationAction -> Fit
 *                   SphericalRegion -> Automatic
 *                   Ticks -> Automatic
 *                   TicksStyle -> {}
 *                   TouchscreenAutoZoom -> False
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
 *                   local: paclet:ref/Graphics3D
 * Documentation:    web: http://reference.wolfram.com/language/ref/Graphics3D.html
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
fun graphics3D(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Graphics3D", arguments.toMutableList(), options)
}
