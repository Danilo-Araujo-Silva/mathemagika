package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TradingChart
 *
 * Full name:        System`TradingChart
 *
 *                   TradingChart[{{date , {open , high , low , close , volume }}, …}] makes a chart showing prices and volume for each date.
 *                                      1       1      1     1       1        1
 *                   TradingChart[{"name", daterange}] makes a financial chart for the financial entity "name" over the daterange.
 *                   TradingChart[{…}, {ind , ind , …}] makes a financial chart with indicators ind , ind , ….
 * Usage:                                  1     2                                                 1     2
 *
 *                   AlignmentPoint -> Center
 *                   Appearance -> Automatic
 *                                       1
 *                   AspectRatio -> -----------
 *                                  GoldenRatio
 *                   Axes -> Automatic
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Background -> None
 *                   BarSpacing -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ChartBaseStyle -> EdgeForm[]
 *                   ChartElementFunction -> Automatic
 *                   ChartElements -> Automatic
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
 *                   EventLabels -> None
 *                   FormatType :> TraditionalForm
 *                   Frame -> True
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
 *                   LabelingFunction -> Automatic
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
 *                   SaveDefinitions -> False
 *                   ScalingFunctions -> None
 *                   TargetUnits -> Automatic
 *                   Ticks -> Automatic
 *                   TicksStyle -> {}
 * Options:          TrendStyle -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TradingChart
 * Documentation:    web: http://reference.wolfram.com/language/ref/TradingChart.html
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
fun tradingChart(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TradingChart", arguments.toMutableList(), options)
}
