package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AngularGauge
 *
 * Full name:        System`AngularGauge
 *
 *                   AngularGauge[value] draws a gauge showing value in the range 0 to 1.
 *                   AngularGauge[value, {min, max}] draws a gauge showing value in a range of min to max.
 *                   AngularGauge[Dynamic[value], …] allows value to be set interactively using the gauge.
 *                   AngularGauge[{value , value , …}, …] draws a gauge showing multiple values.
 * Usage:                               1       2
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
 *                   local: paclet:ref/AngularGauge
 * Documentation:    web: http://reference.wolfram.com/language/ref/AngularGauge.html
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
fun angularGauge(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AngularGauge", arguments.toMutableList(), options)
}
