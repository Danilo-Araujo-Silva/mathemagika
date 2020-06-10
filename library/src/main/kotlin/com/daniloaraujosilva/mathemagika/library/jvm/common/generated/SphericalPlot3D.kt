package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SphericalPlot3D
 * 
 * Full name:        System`SphericalPlot3D
 * 
 *                   SphericalPlot3D[r, θ, ϕ] generates a 3D plot with a spherical radius r as a function of spherical coordinates θ and ϕ.
 *                   SphericalPlot3D[r, {θ, θ   , θ   }, {ϕ, ϕ   , ϕ   }] generates a 3D spherical plot over the specified ranges of spherical coordinates.
 *                                           min   max        min   max
 *                   SphericalPlot3D[{r , r , …}, {θ, θ   , θ   }, {ϕ, ϕ   , ϕ   }] generates a 3D spherical plot with multiple surfaces.
 * Usage:                              1   2           min   max        min   max
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
 *                   PlotRange -> Automatic
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
 *                   ViewVertical -> {0, 0, 1}
 *                   BoundaryStyle -> Automatic
 *                   ColorFunction -> Automatic
 *                   ColorFunctionScaling -> True
 *                   EvaluationMonitor -> None
 *                   Exclusions -> Automatic
 *                   ExclusionsStyle -> None
 *                   LabelingSize -> Automatic
 *                   MaxRecursion -> Automatic
 *                   Mesh -> Automatic
 *                   MeshFunctions -> {#4 & , #5 & }
 *                   MeshShading -> None
 *                   MeshStyle -> Automatic
 *                   NormalsFunction -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PlotLabels -> None
 *                   LabelingSize -> Automatic
 *                   PlotPoints -> Automatic
 *                   PlotStyle -> Automatic
 *                   PlotTheme :> $PlotTheme
 *                   RegionFunction -> (True & )
 *                   PlotLegends -> None
 *                   TextureCoordinateFunction -> Automatic
 *                   TextureCoordinateScaling -> True
 * Options:          WorkingPrecision -> MachinePrecision
 * 
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SphericalPlot3D
 * Documentation:    web: http://reference.wolfram.com/language/ref/SphericalPlot3D.html
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
fun sphericalPlot3D(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SphericalPlot3D", arguments.toMutableList(), options)
}
