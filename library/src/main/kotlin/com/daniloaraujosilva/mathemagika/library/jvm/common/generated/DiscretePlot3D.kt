package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DiscretePlot3D
 * 
 * Full name:        System`DiscretePlot3D
 * 
 *                   DiscretePlot3D[expr, {i, i   , i   }, {j, j   , j   }] generates a plot of the values of expr when i runs from i    to i    and j runs from j    to j   .
 *                                             min   max        min   max                                                            min     max                  min     max
 *                   DiscretePlot3D[expr, {i, i   , i   , di}, {j, j   , j   , dj}] uses steps di and dj.
 *                                             min   max            min   max
 *                   DiscretePlot3D[expr, {i, {i , i , …}}, {j, {j , j , …}}] uses successive i values i , i , … and j values j ,  j , …. 
 *                                              1   2             1   2                                 1   2                  1    2
 *                   DiscretePlot3D[{expr , expr , …}, …, …] plots the values of all the expr .
 * Usage:                                1      2                                            i
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
 *                   BoxRatios -> {1, 1, 0.4}
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
 *                   DisplayFunction :> $DisplayFunction
 *                   Epilog -> {}
 *                   EvaluationMonitor -> None
 *                   ExtentElementFunction -> Automatic
 *                   ExtentMarkers -> None
 *                   ExtentSize -> None
 *                   FaceGrids -> None
 *                   FaceGridsStyle -> {}
 *                   Filling -> Automatic
 *                   FillingStyle -> Automatic
 *                   FormatType :> TraditionalForm
 *                   ImageMargins -> 0.
 *                   ImagePadding -> All
 *                   ImageSize -> Automatic
 *                   ImageSizeRaw -> Automatic
 *                   Joined -> False
 *                   LabelingFunction -> Automatic
 *                   LabelingSize -> Automatic
 *                   LabelStyle -> {}
 *                   Lighting -> Neutral
 *                   Method -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PlotLabel -> None
 *                   PlotLabels -> None
 *                   PlotLegends -> None
 *                   PlotMarkers -> None
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
 *                   local: paclet:ref/DiscretePlot3D
 * Documentation:    web: http://reference.wolfram.com/language/ref/DiscretePlot3D.html
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
fun discretePlot3D(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DiscretePlot3D", arguments.toMutableList(), options)
}
