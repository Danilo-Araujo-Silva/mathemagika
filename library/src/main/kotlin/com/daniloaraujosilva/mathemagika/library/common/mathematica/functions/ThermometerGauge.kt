package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ThermometerGauge
 *
 * Full name:        System`ThermometerGauge
 *
 *                   ThermometerGauge[value] draws a thermometer showing value in a range of 0 to 1.
 *                   ThermometerGauge[value, {min, max}] draws a thermometer showing value in a range of min to max.
 * Usage:            ThermometerGauge[Dynamic[value], …] allows value to be set interactively using the thermometer.
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
 *                   local: paclet:ref/ThermometerGauge
 * Documentation:    web: http://reference.wolfram.com/language/ref/ThermometerGauge.html
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
fun thermometerGauge(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ThermometerGauge", arguments.toMutableList(), options)
}
