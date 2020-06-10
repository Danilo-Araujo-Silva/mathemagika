package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PointFigureChart
 * 
 * Full name:        System`PointFigureChart
 * 
 *                   PointFigureChart[{{date , p }, {date , p }, …}] makes a point and figure chart with prices p  at date date .
 *                                          1   1        2   2                                                   i             i
 *                   PointFigureChart[{"name", daterange}] makes a point and figure chart of closing prices for the financial entity "name" over the date range daterange.
 * Usage:            PointFigureChart[{…}, s, n] makes a point and figure chart with point and figure height s and n reversals.
 * 
 *                   AlignmentPoint -> Center
 *                                       1
 *                   AspectRatio -> -----------
 *                                  GoldenRatio
 *                   Axes -> True
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ChartBaseStyle -> Automatic
 *                   ChartElementFunction -> Automatic
 *                   ChartElements -> Automatic
 *                   ChartLegends -> None
 *                   ChartStyle -> Automatic
 *                   ColorFunction -> Automatic
 *                   ColorFunctionScaling -> True
 *                   ColorOutput -> Automatic
 *                   ContentSelectable -> Automatic
 *                   CoordinatesToolOptions -> Automatic
 *                   DateFormat -> Automatic
 *                   Epilog -> {}
 *                   EventLabels -> None
 *                   Frame -> False
 *                   FrameLabel -> None
 *                   FrameStyle -> {}
 *                   FrameTicks -> Automatic
 *                   FrameTicksStyle -> {}
 *                   GridLines -> Automatic
 *                   GridLinesStyle -> {}
 *                   ImageMargins -> 0.
 *                   ImagePadding -> All
 *                   ImageSize -> Automatic
 *                   ImageSizeRaw -> Automatic
 *                   LabelStyle -> {}
 *                   LegendAppearance -> Automatic
 *                   Method -> Automatic
 *                   PlotLabel -> None
 *                   PlotRange -> Automatic
 *                   PlotRangeClipping -> False
 *                   PlotRangePadding -> {{None, None}, {Automatic, Automatic}}
 *                   PlotRegion -> Automatic
 *                   PreserveImageOptions -> Automatic
 *                   Prolog -> {}
 *                   RotateLabel -> True
 *                   ScalingFunctions -> None
 *                   TargetUnits -> Automatic
 *                   Ticks -> Automatic
 *                   TicksStyle -> {}
 *                   TrendStyle -> {RGBColor[0.7, 0.8, 0.3], RGBColor[0.8, 0.2, 0.2]}
 *                   DisplayFunction :> $DisplayFunction
 *                   FormatType :> TraditionalForm
 *                   PerformanceGoal :> $PerformanceGoal
 * Options:          PlotTheme :> $PlotTheme
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/PointFigureChart
 * Documentation:    web: http://reference.wolfram.com/language/ref/PointFigureChart.html
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
fun pointFigureChart(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PointFigureChart", arguments.toMutableList(), options)
}
