package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DateHistogram
 * 
 * Full name:        System`DateHistogram
 * 
 *                   DateHistogram[{date , date , …}] plots a histogram of the dates date .
 *                                      1      2                                         i
 *                   DateHistogram[{date , date , …}, bspec] plots a histogram with bin width specification bspec.
 *                                      1      2
 *                   DateHistogram[{date , date , …}, bspec, hspec] plots a histogram with bin heights computed according to the specification hspec.
 *                                      1      2
 *                   DateHistogram[{data , data , …}] plots histograms for multiple datasets data .
 * Usage:                               1      2                                                 i
 * 
 *                   AlignmentPoint -> Center
 *                   AspectRatio -> Automatic
 *                   Axes -> False
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Background -> None
 *                   BarOrigin -> Bottom
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
 *                   DateFunction -> Identity
 *                   DateReduction -> None
 *                   DateTicksFormat -> Automatic
 *                   Epilog -> {}
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
 *                   LabelingFunction -> Automatic
 *                   LabelStyle -> {}
 *                   LegendAppearance -> Automatic
 *                   Method -> Automatic
 *                   PlotLabel -> None
 *                   PlotRange -> Automatic
 *                   PlotRangeClipping -> False
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PreserveImageOptions -> Automatic
 *                   Prolog -> {}
 *                   RotateLabel -> True
 *                   ScalingFunctions -> None
 *                   TargetUnits -> Automatic
 *                   Ticks -> Automatic
 *                   TicksStyle -> {}
 *                   TimeZone -> Automatic
 *                   DisplayFunction :> $DisplayFunction
 *                   FormatType :> TraditionalForm
 *                   PerformanceGoal :> $PerformanceGoal
 * Options:          PlotTheme :> $PlotTheme
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/DateHistogram
 * Documentation:    web: http://reference.wolfram.com/language/ref/DateHistogram.html
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
fun dateHistogram(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DateHistogram", arguments.toMutableList(), options)
}
