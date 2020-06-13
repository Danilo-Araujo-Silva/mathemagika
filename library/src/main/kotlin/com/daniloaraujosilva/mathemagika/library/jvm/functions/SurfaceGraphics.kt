package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SurfaceGraphics
 *
 * Full name:        System`SurfaceGraphics
 *
 *                   SurfaceGraphics[array] is a representation of a three-dimensional plot of a surface, with heights of each point on a grid specified by values in array.
 * Usage:            SurfaceGraphics[array, shades] represents a surface, whose parts are shaded according to the array shades.
 *
 *                   AmbientLight -> GrayLevel[0]
 *                   AspectRatio -> Automatic
 *                   Axes -> False
 *                   AxesEdge -> Automatic
 *                   AxesLabel -> None
 *                   AxesStyle -> Automatic
 *                   Background -> Automatic
 *                   Boxed -> True
 *                   BoxRatios -> {1, 1, 0.4}
 *                   BoxStyle -> Automatic
 *                   ClipFill -> Automatic
 *                   ColorFunction -> Automatic
 *                   ColorFunctionScaling -> True
 *                   ColorOutput -> Automatic
 *                   DefaultColor -> Automatic
 *                   DefaultFont :> $DefaultFont
 *                   DisplayFunction :> $DisplayFunction
 *                   Epilog -> {}
 *                   FaceGrids -> None
 *                   FormatType :> $FormatType
 *                   HiddenSurface -> True
 *                   ImageSize -> Automatic
 *                   Lighting -> True
 *                   LightSources -> {{{1., 0., 1.}, RGBColor[1, 0, 0]}, {{1., 1., 1.}, RGBColor[0, 1, 0]}, {{0., 1., 1.}, RGBColor[0, 0, 1]}}
 *                   Mesh -> True
 *                   Charting`MeshMarkers -> None
 *                   MeshRange -> Automatic
 *                   MeshStyle -> Automatic
 *                   Plot3Matrix -> Automatic
 *                   PlotLabel -> None
 *                   PlotRange -> Automatic
 *                   PlotRegion -> Automatic
 *                   Prolog -> {}
 *                   Shading -> True
 *                   SphericalRegion -> False
 *                   TextStyle :> $TextStyle
 *                   Ticks -> Automatic
 *                   ViewCenter -> Automatic
 *                   ViewPoint -> {1.3, -2.4, 2.}
 * Options:          ViewVertical -> {0., 0., 1.}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SurfaceGraphics
 * Documentation:    web: http://reference.wolfram.com/language/ref/SurfaceGraphics.html
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
fun surfaceGraphics(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SurfaceGraphics", arguments.toMutableList(), options)
}
