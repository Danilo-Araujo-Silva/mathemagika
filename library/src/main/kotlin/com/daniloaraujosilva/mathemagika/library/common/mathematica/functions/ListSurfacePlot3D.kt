package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ListSurfacePlot3D
 *
 * Full name:        System`ListSurfacePlot3D
 *
 *                   ListSurfacePlot3D[{{x , y , z }, {x , y , z }, …}] plots a three-dimensional surface constructed to fit the specified points.
 * Usage:                                 1   1   1     2   2   2
 *
 *                   AlignmentPoint -> Center
 *                   AspectRatio -> Automatic
 *                   AutomaticImageSize -> False
 *                   Axes -> True
 *                   AxesEdge -> Automatic
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   BoundaryStyle -> GrayLevel[0]
 *                   Boxed -> True
 *                   BoxRatios -> Automatic
 *                   BoxStyle -> {}
 *                   ClipPlanes -> None
 *                   ClipPlanesStyle -> Automatic
 *                   ColorFunction -> Automatic
 *                   ColorFunctionScaling -> True
 *                   ColorOutput -> Automatic
 *                   ContentSelectable -> Automatic
 *                   ControllerLinking -> False
 *                   ControllerMethod -> Automatic
 *                   ControllerPath -> Automatic
 *                   CoordinatesToolOptions -> Automatic
 *                   DataRange -> Automatic
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
 *                   MaxPlotPoints -> Automatic
 *                   Mesh -> Automatic
 *                   MeshFunctions -> {#1 & , #2 & , #3 & }
 *                   MeshShading -> None
 *                   MeshStyle -> Automatic
 *                   Method -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PlotLabel -> None
 *                   PlotLegends -> None
 *                   PlotRange -> All
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PlotStyle -> Automatic
 *                   PlotTheme :> $PlotTheme
 *                   PreserveImageOptions -> Automatic
 *                   Prolog -> {}
 *                   RegionFunction -> (True & )
 *                   RotationAction -> Fit
 *                   SphericalRegion -> Automatic
 *                   TargetUnits -> Automatic
 *                   TextureCoordinateFunction -> Automatic
 *                   TextureCoordinateScaling -> Automatic
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
 *                   local: paclet:ref/ListSurfacePlot3D
 * Documentation:    web: http://reference.wolfram.com/language/ref/ListSurfacePlot3D.html
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
fun listSurfacePlot3D(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ListSurfacePlot3D", arguments.toMutableList(), options)
}
