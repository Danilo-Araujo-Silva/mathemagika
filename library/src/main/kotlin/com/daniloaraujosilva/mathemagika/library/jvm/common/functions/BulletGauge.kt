package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BulletGauge
 *
 * Full name:        System`BulletGauge
 *
 *                   BulletGauge[value, reference, {min, max}] draws a bullet gauge showing value and reference in a range of min to max.
 *                   BulletGauge[value, reference, {min, m , m , …, max}] draws a bullet gauge with performance regions split at the m .
 *                                                        1   2                                                                       i
 *                   BulletGauge[{v , v , …}, …] draws a bullet gauge with multiple values v , v , ….
 *                                 1   2                                                    1   2
 *                   BulletGauge[values, {r , r , …}, …] draws a bullet gauge with multiple references r , r , ….
 * Usage:                                  1   2                                                        1   2
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
 *                   ReferenceMarkers -> Automatic
 *                   ReferenceMarkerStyle -> Opacity[0.5]
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
 *                   local: paclet:ref/BulletGauge
 * Documentation:    web: http://reference.wolfram.com/language/ref/BulletGauge.html
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
fun bulletGauge(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BulletGauge", arguments.toMutableList(), options)
}
