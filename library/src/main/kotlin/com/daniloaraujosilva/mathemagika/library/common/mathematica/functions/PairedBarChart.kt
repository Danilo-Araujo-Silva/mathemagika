package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PairedBarChart
 *
 * Full name:        System`PairedBarChart
 *
 *                   PairedBarChart[{y , y , …}, {z , z , …}] makes a paired bar chart with bar lengths y ,  y , … and z , z , …, respectively.
 *                                    1   2        1   2                                                 1    2         1   2
 *                   PairedBarChart[{…, w [y , …], …}, {…, w [z , …], …}] makes a paired bar chart with bar features defined by the symbolic wrappers w .
 *                                       i  i               j  j                                                                                       k
 *                   PairedBarChart[{data  , …}, {data  , …}] makes a paired bar chart from multiple datasets data   and data  .
 * Usage:                                11           21                                                          1i         2j
 *
 *                   AlignmentPoint -> Center
 *                                       1
 *                   AspectRatio -> -----------
 *                                  GoldenRatio
 *                   Axes -> Automatic
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Background -> None
 *                   BarOrigin -> YAxis
 *                   BarSpacing -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ChartBaseStyle -> Automatic
 *                   ChartElementFunction -> Automatic
 *                   ChartElements -> Automatic
 *                   ChartLabels -> None
 *                   ChartLayout -> Automatic
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
 *                   Frame -> False
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
 *                   Joined -> False
 *                   LabelingFunction -> Automatic
 *                   LabelingSize -> Automatic
 *                   LabelStyle -> {}
 *                   LegendAppearance -> Automatic
 *                   Method -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PlotLabel -> None
 *                   PlotRange -> All
 *                   PlotRangeClipping -> False
 *                   PlotRangePadding -> Scaled[0.02]
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
 *                   local: paclet:ref/PairedBarChart
 * Documentation:    web: http://reference.wolfram.com/language/ref/PairedBarChart.html
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
fun pairedBarChart(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PairedBarChart", arguments.toMutableList(), options)
}
