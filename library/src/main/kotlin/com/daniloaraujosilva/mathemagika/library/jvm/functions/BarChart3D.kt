package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BarChart3D
 *
 * Full name:        System`BarChart3D
 *
 *                   BarChart3D[{y , y , …}] makes a 3D bar chart with bar lengths y , y , … .
 *                                1   2                                             1   2
 *                   BarChart3D[{…, w [y , …], …, w [y , …], …}] makes a 3D bar chart with bar features defined by the symbolic wrappers w .
 *                                   i  i          j  j                                                                                   k
 *                   BarChart3D[{data , data , …}] makes a 3D bar chart from multiple datasets data .
 * Usage:                            1      2                                                      i
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
 *                   Boxed -> False
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
 *                   FaceGrids -> Automatic
 *                   FaceGridsStyle -> {}
 *                   FormatType :> TraditionalForm
 *                   ImageMargins -> 0.
 *                   ImagePadding -> All
 *                   ImageSize -> Automatic
 *                   ImageSizeRaw -> Automatic
 *                   LabelStyle -> {}
 *                   Lighting -> Neutral
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
 *                   ViewPoint -> Automatic
 *                   ViewProjection -> Automatic
 *                   ViewRange -> All
 *                   ViewVector -> Automatic
 *                   ViewVertical -> {0, 0, 1}
 *                   ChartBaseStyle -> Automatic
 *                   ChartStyle -> Automatic
 *                   BarOrigin -> Bottom
 *                   ChartElements -> Automatic
 *                   BarSpacing -> Automatic
 *                   ColorFunction -> Automatic
 *                   ColorFunctionScaling -> True
 *                   ChartLayout -> Automatic
 *                   LabelingFunction -> Automatic
 *                   ChartElementFunction -> Automatic
 *                   ChartLabels -> None
 *                   ChartLegends -> None
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PlotTheme :> $PlotTheme
 *                   LegendAppearance -> Automatic
 *                   ScalingFunctions -> None
 * Options:          TargetUnits -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BarChart3D
 * Documentation:    web: http://reference.wolfram.com/language/ref/BarChart3D.html
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
fun barChart3D(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BarChart3D", arguments.toMutableList(), options)
}
