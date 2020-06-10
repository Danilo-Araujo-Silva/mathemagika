package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ListPlot3D
 * 
 * Full name:        System`ListPlot3D
 * 
 *                   ListPlot3D[array] generates a three-dimensional plot of a surface representing an array of height values. 
 *                   ListPlot3D[{{x , y , z }, {x , y , z }, …}] generates a plot of the surface with heights z  at positions {x , y }. 
 *                                 1   1   1     2   2   2                                                     i                i   i
 *                   ListPlot3D[{data , data , …}] plots the surfaces corresponding to each of the data .
 * Usage:                            1      2                                                          i
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
 *                   BoxRatios -> {1, 1, 0.4}
 *                   BoxStyle -> {}
 *                   ClippingStyle -> Automatic
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
 *                   Filling -> None
 *                   FillingStyle -> Opacity[0.5]
 *                   FormatType :> TraditionalForm
 *                   ImageMargins -> 0.
 *                   ImagePadding -> All
 *                   ImageSize -> Automatic
 *                   ImageSizeRaw -> Automatic
 *                   InterpolationOrder -> None
 *                   IntervalMarkers -> Automatic
 *                   IntervalMarkersStyle -> Automatic
 *                   LabelingSize -> Automatic
 *                   LabelStyle -> {}
 *                   Lighting -> Automatic
 *                   MaxPlotPoints -> Automatic
 *                   Mesh -> Automatic
 *                   MeshFunctions -> {#1 & , #2 & }
 *                   MeshShading -> None
 *                   MeshStyle -> Automatic
 *                   Method -> Automatic
 *                   NormalsFunction -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PlotLabel -> None
 *                   PlotLabels -> None
 *                   PlotLegends -> None
 *                   PlotRange -> {Full, Full, Automatic}
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PlotStyle -> Automatic
 *                   PlotTheme :> $PlotTheme
 *                   PreserveImageOptions -> Automatic
 *                   Prolog -> {}
 *                   RegionFunction -> (True & )
 *                   RotationAction -> Fit
 *                   ScalingFunctions -> None
 *                   SphericalRegion -> Automatic
 *                   TargetUnits -> Automatic
 *                   TextureCoordinateFunction -> Automatic
 *                   TextureCoordinateScaling -> Automatic
 *                   Ticks -> Automatic
 *                   TicksStyle -> {}
 *                   TouchscreenAutoZoom -> False
 *                   VertexColors -> Automatic
 *                   VertexNormals -> Automatic
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
 *                   local: paclet:ref/ListPlot3D
 * Documentation:    web: http://reference.wolfram.com/language/ref/ListPlot3D.html
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
fun listPlot3D(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ListPlot3D", arguments.toMutableList(), options)
}
