package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ProbabilityPlot
 * 
 * Full name:        System`ProbabilityPlot
 * 
 *                   ProbabilityPlot[list] generates a plot of the CDF of list against the CDF of a normal distribution.
 *                   ProbabilityPlot[dist] generates a plot of the CDF of the distribution dist against the CDF of a normal distribution.
 *                   ProbabilityPlot[data, rdata] generates a plot of the CDF of data against the CDF of rdata.
 *                   ProbabilityPlot[data, rdist] generates a plot of the CDF of data against the CDF of symbolic distribution rdist.
 *                   ProbabilityPlot[{data , data , …}, ref] generates a plot of the CDF of data  against the CDF of a reference distribution ref.
 * Usage:                                 1      2                                              i
 * 
 *                   AlignmentPoint -> Center
 *                                       1
 *                   AspectRatio -> -----------
 *                                  GoldenRatio
 *                   Axes -> False
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ClippingStyle -> Automatic
 *                   ColorFunction -> Automatic
 *                   ColorFunctionScaling -> True
 *                   ColorOutput -> Automatic
 *                   ContentSelectable -> Automatic
 *                   CoordinatesToolOptions -> Automatic
 *                   DisplayFunction :> $DisplayFunction
 *                   Epilog -> {}
 *                   Filling -> None
 *                   FillingStyle -> Automatic
 *                   FormatType :> TraditionalForm
 *                   Frame -> True
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
 *                   Joined -> Automatic
 *                   LabelStyle -> {}
 *                   Mesh -> None
 *                   MeshFunctions -> {#1 & }
 *                   MeshShading -> None
 *                   MeshStyle -> Automatic
 *                   Method -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PlotLabel -> None
 *                   PlotLegends -> None
 *                   PlotMarkers -> None
 *                   PlotRange -> Automatic
 *                   PlotRangeClipping -> True
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PlotStyle -> Automatic
 *                   PlotTheme :> $PlotTheme
 *                   PreserveImageOptions -> Automatic
 *                   Prolog -> {}
 *                   ReferenceLineStyle -> Automatic
 *                   RotateLabel -> True
 *                   ScalingFunctions -> None
 *                   TargetUnits -> Automatic
 *                   Ticks -> Automatic
 *                   TicksStyle -> {}
 * Options:          WorkingPrecision -> MachinePrecision
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ProbabilityPlot
 * Documentation:    web: http://reference.wolfram.com/language/ref/ProbabilityPlot.html
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
fun probabilityPlot(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ProbabilityPlot", arguments.toMutableList(), options)
}
