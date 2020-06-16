package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NicholsPlot
 *
 * Full name:        System`NicholsPlot
 *
 *                   NicholsPlot[lsys] generates a Nichols plot of the transfer function for the system lsys.
 *                   NicholsPlot[lsys, {ω   , ω   }] plots for the frequency range ω    to ω   .
 *                                       min   max                                  min     max
 *                   NicholsPlot[expr, {ω, ω   , ω   }] plots expr using the variable ω.
 * Usage:                                   min   max
 *
 *                   AlignmentPoint -> Center
 *                   AspectRatio -> Automatic
 *                   Axes -> True
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ColorFunction -> Automatic
 *                   ColorFunctionScaling -> True
 *                   ColorOutput -> Automatic
 *                   ContentSelectable -> Automatic
 *                   CoordinatesToolOptions -> Automatic
 *                   DisplayFunction :> $DisplayFunction
 *                   Epilog -> {}
 *                   EvaluationMonitor -> None
 *                   Exclusions -> Automatic
 *                   ExclusionsStyle -> None
 *                   FeedbackType -> Negative
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
 *                   LabelStyle -> {}
 *                   MaxRecursion -> Automatic
 *                   Mesh -> Automatic
 *                   MeshFunctions -> {#3 & }
 *                   MeshShading -> None
 *                   MeshStyle -> Automatic
 *                   Method -> Automatic
 *                   NicholsGridLines -> None
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PhaseRange -> Automatic
 *                   PlotLabel -> None
 *                   PlotLegends -> None
 *                   PlotLegends -> None
 *                   PlotPoints -> Automatic
 *                   PlotRange -> Automatic
 *                   PlotRangeClipping -> True
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PlotStyle -> Automatic
 *                   PlotTheme :> $PlotTheme
 *                   PreserveImageOptions -> Automatic
 *                   Prolog -> {}
 *                   RegionFunction -> Automatic
 *                   RotateLabel -> True
 *                   SamplingPeriod -> None
 *                   ScalingFunctions -> {Degree, dB}
 *                   StabilityMargins -> False
 *                   StabilityMarginsStyle -> Automatic
 *                   Ticks -> Automatic
 *                   TicksStyle -> {}
 * Options:          WorkingPrecision -> MachinePrecision
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NicholsPlot
 * Documentation:    web: http://reference.wolfram.com/language/ref/NicholsPlot.html
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
fun nicholsPlot(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NicholsPlot", arguments.toMutableList(), options)
}
