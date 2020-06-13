package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ReliefPlot
 *
 * Full name:        System`ReliefPlot
 *
 * Usage:            ReliefPlot[array] generates a relief plot of an array of height values.
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
 *                   BoxRatios -> Automatic
 *                   ClippingStyle -> None
 *                   ColorFunction -> Automatic
 *                   ColorFunctionScaling -> True
 *                   ColorOutput -> Automatic
 *                   ContentSelectable -> Automatic
 *                   CoordinatesToolOptions -> Automatic
 *                   DataRange -> Automatic
 *                   DataReversed -> False
 *                   Epilog -> {}
 *                   Frame -> True
 *                   FrameLabel -> None
 *                   FrameStyle -> {}
 *                   FrameTicks -> None
 *                   FrameTicksStyle -> {}
 *                   GridLines -> None
 *                   GridLinesStyle -> {}
 *                   ImageMargins -> 0.
 *                   ImagePadding -> All
 *                   ImageSize -> Automatic
 *                   ImageSizeRaw -> Automatic
 *                   LabelStyle -> {}
 *                   LightingAngle -> Automatic
 *                   MaxPlotPoints -> Automatic
 *                   Mesh -> False
 *                   MeshStyle -> Automatic
 *                   Method -> Automatic
 *                   PlotLabel -> None
 *                   PlotLegends -> None
 *                   PlotRange -> {Full, Full, All}
 *                   PlotRangeClipping -> False
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PreserveImageOptions -> Automatic
 *                   Prolog -> {}
 *                   RotateLabel -> True
 *                   TargetUnits -> Automatic
 *                   Ticks -> Automatic
 *                   TicksStyle -> {}
 *                   DisplayFunction :> $DisplayFunction
 *                   FormatType :> TraditionalForm
 *                   PerformanceGoal :> $PerformanceGoal
 * Options:          PlotTheme :> $PlotTheme
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ReliefPlot
 * Documentation:    web: http://reference.wolfram.com/language/ref/ReliefPlot.html
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
fun reliefPlot(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ReliefPlot", arguments.toMutableList(), options)
}
