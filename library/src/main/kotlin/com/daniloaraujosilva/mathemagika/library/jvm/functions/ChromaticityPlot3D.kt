package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ChromaticityPlot3D
 *
 * Full name:        System`ChromaticityPlot3D
 *
 *                   ChromaticityPlot3D[colspace] returns a 3D gamut of the color space colspace.
 *                   ChromaticityPlot3D[color] plots the specific color.
 *                   ChromaticityPlot3D[image] plots the pixels of image as individual colors.
 *                   ChromaticityPlot3D[{input , input , …}] plots multiple colors, color spaces and images.
 *                                            1       2
 * Usage:            ChromaticityPlot3D[…, refcolspace] uses the reference color space refcolspace.
 *
 *                   AlignmentPoint -> Center
 *                   Appearance -> None
 *                   AspectRatio -> Automatic
 *                   AutomaticImageSize -> False
 *                   AxesEdge -> Automatic
 *                   AxesLabel -> Automatic
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Axes -> True
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   BoundaryStyle -> Automatic
 *                   Boxed -> True
 *                   BoxRatios -> {1, 1, 1}
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
 *                   FillingStyle -> Automatic
 *                   FormatType :> TraditionalForm
 *                   ImageMargins -> 0.
 *                   ImagePadding -> All
 *                   ImageSize -> Automatic
 *                   ImageSizeRaw -> Automatic
 *                   LabelStyle -> {}
 *                   Lighting -> {{Ambient, GrayLevel[1]}}
 *                   MaxPlotPoints -> 2000
 *                   Mesh -> None
 *                   MeshStyle -> Automatic
 *                   Method -> Automatic
 *                   PlotLabel -> None
 *                   PlotLegends -> Automatic
 *                   PlotPoints -> Automatic
 *                   PlotRange -> All
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PlotStyle -> Automatic
 *                   PlotTheme :> $PlotTheme
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
 *                   ViewPoint -> Automatic
 *                   ViewProjection -> Automatic
 *                   ViewRange -> All
 *                   ViewVector -> Automatic
 *                   ViewVertical -> Automatic
 * Options:          WhitePoint -> None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ChromaticityPlot3D
 * Documentation:    web: http://reference.wolfram.com/language/ref/ChromaticityPlot3D.html
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
fun chromaticityPlot3D(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ChromaticityPlot3D", arguments.toMutableList(), options)
}
