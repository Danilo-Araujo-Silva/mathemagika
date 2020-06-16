package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BubbleChart
 *
 * Full name:        System`BubbleChart
 *
 *                   BubbleChart[{{x , y , z }, {x , y , z }, …}] makes a bubble chart with bubbles at positions {x , y } with sizes z .
 *                                  1   1   1     2   2   2                                                        i   i              i
 *                   BubbleChart[{…, w [{x , y , z }, …], …, w [{x , y , z }, …], …}] makes a bubble chart with bubble features defined by the symbolic wrappers w .
 *                                    i   i   i   i           j   j   j   j                                                                                       k
 *                   BubbleChart[{data , data , …}] makes a bubble chart from multiple datasets data .
 * Usage:                             1      2                                                      i
 *
 *                   AlignmentPoint -> Center
 *                   AspectRatio -> 1
 *                   Axes -> False
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   BubbleScale -> Area
 *                   BubbleSizes -> Automatic
 *                   ChartBaseStyle -> Automatic
 *                   ChartElementFunction -> Automatic
 *                   ChartElements -> Automatic
 *                   ChartLabels -> None
 *                   ChartLegends -> None
 *                   ChartStyle -> Automatic
 *                   ColorFunction -> Automatic
 *                   ColorFunctionScaling -> True
 *                   ColorOutput -> Automatic
 *                   ContentSelectable -> Automatic
 *                   CoordinatesToolOptions -> Automatic
 *                   DisplayFunction :> $DisplayFunction
 *                   Epilog -> {}
 *                   FormatType :> TraditionalForm
 *                   Frame -> True
 *                   FrameLabel -> None
 *                   FrameStyle -> {}
 *                   FrameTicks -> Automatic
 *                   FrameTicksStyle -> {}
 *                   GridLines -> None
 *                   GridLinesStyle -> {}
 *                   ImageMargins -> 0.
 *                   ImagePadding -> All
 *                   ImageSize -> Automatic
 *                   ImageSizeRaw -> Automatic
 *                   LabelingFunction -> Automatic
 *                   LabelingSize -> Automatic
 *                   LabelStyle -> {}
 *                   LegendAppearance -> Automatic
 *                   Method -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PlotLabel -> None
 *                   PlotRange -> All
 *                   PlotRangeClipping -> True
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PlotTheme :> $PlotTheme
 *                   PreserveImageOptions -> Automatic
 *                   Prolog -> {}
 *                   RotateLabel -> True
 *                   ScalingFunctions -> None
 *                   TargetUnits -> Automatic
 *                   Ticks -> Automatic
 * Options:          TicksStyle -> {}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BubbleChart
 * Documentation:    web: http://reference.wolfram.com/language/ref/BubbleChart.html
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
fun bubbleChart(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BubbleChart", arguments.toMutableList(), options)
}
