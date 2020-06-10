package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ClockGauge
 * 
 * Full name:        System`ClockGauge
 * 
 *                   ClockGauge[] draws an analog clock face showing the local time with hours, minutes, and seconds.
 *                   ClockGauge[time] draws an analog clock face showing the time corresponding to an AbsoluteTime, DateObject, or TimeObject specification.
 *                   ClockGauge[{h, m, s}] draws an analog clock face showing hour h, minute m, and seconds s.
 *                   ClockGauge[{y, m, d, h, m, s}] draws an analog clock face showing the time corresponding to the date list in a DateList specification.
 * Usage:            ClockGauge["string"] draws an analog clock face showing the time DateList["string"].
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
 *                   Enabled -> Automatic
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
 *                   TicksStyle -> {}
 * Options:          TimeZone -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ClockGauge
 * Documentation:    web: http://reference.wolfram.com/language/ref/ClockGauge.html
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
fun clockGauge(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ClockGauge", arguments.toMutableList(), options)
}
