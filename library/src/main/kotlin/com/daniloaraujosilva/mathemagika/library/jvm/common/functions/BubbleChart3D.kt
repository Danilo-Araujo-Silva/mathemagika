package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BubbleChart3D
 *
 * Full name:        System`BubbleChart3D
 *
 *                   BubbleChart3D[{{x , y , z , u }, {x , y , z , u }, …}] makes a 3D bubble chart with bubbles at positions {x , y , z } with sizes u .
 *                                    1   1   1   1     2   2   2   2                                                           i   i   i              i
 *                   BubbleChart3D[{…, w [{x , y , z , u }, …], …, w [{x , y , z , u }, …], …}] makes a 3D bubble chart with bubble features defined by the symbolic wrappers w .
 *                                      i   i   i   i   i           j   j   j   j   j                                                                                          k
 *                   BubbleChart3D[{data , data , …}] makes a 3D bubble chart from multiple datasets data .
 * Usage:                               1      2                                                         i
 *
 *                   AlignmentPoint -> Center
 *                   AspectRatio -> Automatic
 *                   AutomaticImageSize -> False
 *                   Axes -> True
 *                   AxesEdge -> {{-1, -1}, {1, -1}, {-1, -1}}
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   Boxed -> {Left, Bottom, Back}
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
 *                   ViewPoint -> {1.3, -2.4, 2.}
 *                   ViewProjection -> Automatic
 *                   ViewRange -> All
 *                   ViewVector -> Automatic
 *                   ViewVertical -> {0, 0, 1}
 *                   ChartBaseStyle -> Automatic
 *                   ChartStyle -> Automatic
 *                   BubbleSizes -> Automatic
 *                   BubbleScale -> Volume
 *                   ColorFunction -> Automatic
 *                   ColorFunctionScaling -> True
 *                   ChartElementFunction -> Automatic
 *                   ChartElements -> Automatic
 *                   LabelingFunction -> Automatic
 *                   ChartLabels -> None
 *                   ChartLegends -> None
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PlotTheme :> $PlotTheme
 *                   LegendAppearance -> Automatic
 *                   TargetUnits -> Automatic
 * Options:          ScalingFunctions -> None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BubbleChart3D
 * Documentation:    web: http://reference.wolfram.com/language/ref/BubbleChart3D.html
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
fun bubbleChart3D(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BubbleChart3D", arguments.toMutableList(), options)
}
