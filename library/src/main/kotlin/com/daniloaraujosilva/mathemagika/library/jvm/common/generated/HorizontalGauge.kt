package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             HorizontalGauge
 * 
 * Full name:        System`HorizontalGauge
 * 
 *                   HorizontalGauge[value] draws a linear gauge showing value in a range of 0 to 1.
 *                   HorizontalGauge[value, {min, max}] draws a linear gauge showing value in a range of min to max.
 *                   HorizontalGauge[Dynamic[value], …] allows value to be set interactively using the gauge.
 *                   HorizontalGauge[{value , value , …}, …] draws a gauge showing multiple values.
 * Usage:                                  1       2
 * 
 *                   AlignmentPoint -> Center
 *                   AspectRatio -> Automatic
 *                   Axes -> False
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
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
 *                   GaugeFaceElementFunction -> Automatic
 *                   GaugeFaceStyle -> Automatic
 *                   GaugeFrameElementFunction -> Automatic
 *                   GaugeFrameSize -> Automatic
 *                   GaugeFrameStyle -> Automatic
 *                   GaugeLabels -> None
 *                   GaugeMarkers -> Automatic
 *                   GaugeStyle -> Automatic
 *                   GridLines -> None
 *                   GridLinesStyle -> {}
 *                   ImageMargins -> 0.
 *                   ImagePadding -> All
 *                   ImageSize -> Small
 *                   ImageSizeRaw -> Automatic
 *                   LabelStyle -> {}
 *                   Method -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PlotLabel -> None
 *                   PlotLegends -> None
 *                   PlotRange -> All
 *                   PlotRangeClipping -> False
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PlotTheme :> $PlotTheme
 *                   PreserveImageOptions -> Automatic
 *                   Prolog -> {}
 *                   RotateLabel -> True
 *                   ScaleDivisions -> Automatic
 *                   ScaleOrigin -> Automatic
 *                   ScalePadding -> Automatic
 *                   ScaleRanges -> Automatic
 *                   ScaleRangeStyle -> Automatic
 *                   ScalingFunctions -> None
 *                   TargetUnits -> Automatic
 *                   Ticks -> Automatic
 * Options:          TicksStyle -> {}
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/HorizontalGauge
 * Documentation:    web: http://reference.wolfram.com/language/ref/HorizontalGauge.html
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
fun horizontalGauge(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HorizontalGauge", arguments.toMutableList(), options)
}
