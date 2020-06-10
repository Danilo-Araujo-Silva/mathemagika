package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Plot3D
 * 
 * Full name:        System`Plot3D
 * 
 *                   Plot3D[f, {x, x   , x   }, {y, y   , y   }] generates a three-dimensional plot of f as a function of x and y. 
 *                                  min   max        min   max
 *                   Plot3D[{f , f , …}, {x, x   , x   }, {y, y   , y   }] plots several functions. 
 *                            1   2           min   max        min   max
 *                   Plot3D[{…, w[f ], …}, …] plots f  with features defined by the symbolic wrapper w.
 *                                 i                 i
 * Usage:            Plot3D[…, {x, y} ∈ reg] takes variables {x, y} to be in the geometric region reg. 
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
 *                   DisplayFunction :> $DisplayFunction
 *                   Epilog -> {}
 *                   Evaluated -> Automatic
 *                   EvaluationMonitor -> None
 *                   Exclusions -> Automatic
 *                   ExclusionsStyle -> None
 *                   FaceGrids -> None
 *                   FaceGridsStyle -> {}
 *                   Filling -> None
 *                   FillingStyle -> Opacity[0.5]
 *                   FormatType :> TraditionalForm
 *                   ImageMargins -> 0.
 *                   ImagePadding -> All
 *                   ImageSize -> Automatic
 *                   ImageSizeRaw -> Automatic
 *                   LabelingSize -> Automatic
 *                   LabelStyle -> {}
 *                   Lighting -> Automatic
 *                   MaxRecursion -> Automatic
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
 *                   PlotPoints -> Automatic
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
 *                   ViewAngle -> Automatic
 *                   ViewCenter -> Automatic
 *                   ViewMatrix -> Automatic
 *                   ViewPoint -> {1.3, -2.4, 2.}
 *                   ViewProjection -> Automatic
 *                   ViewRange -> All
 *                   ViewVector -> Automatic
 *                   ViewVertical -> {0, 0, 1}
 * Options:          WorkingPrecision -> MachinePrecision
 * 
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Plot3D
 * Documentation:    web: http://reference.wolfram.com/language/ref/Plot3D.html
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
fun plot3D(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Plot3D", arguments.toMutableList(), options)
}
