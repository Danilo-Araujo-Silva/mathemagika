package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             BarChart
 * 
 * Full name:        System`BarChart
 * 
 *                   BarChart[{y , y , …}] makes a bar chart with bar lengths y ,  y , ….
 *                              1   2                                          1    2
 *                   BarChart[{…, w [y , …], …, w [y , …], …}] makes a bar chart with bar features defined by the symbolic wrappers w .
 *                                 i  i          j  j                                                                                k
 *                   BarChart[{data , data , …}] makes a bar chart from multiple datasets data . 
 * Usage:                          1      2                                                   i
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
 *                   BarOrigin -> Bottom
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
 *                   IntervalMarkers -> Automatic
 *                   IntervalMarkersStyle -> Automatic
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
 *                   local: paclet:ref/BarChart
 * Documentation:    web: http://reference.wolfram.com/language/ref/BarChart.html
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
fun barChart(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BarChart", arguments.toMutableList(), options)
}
