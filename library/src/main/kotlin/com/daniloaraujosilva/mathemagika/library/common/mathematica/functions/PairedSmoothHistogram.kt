package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PairedSmoothHistogram
 *
 * Full name:        System`PairedSmoothHistogram
 *
 *                   PairedSmoothHistogram[{x , x , …}, {y , y , …}] plots a paired smooth histogram of the values x  and y .
 *                                           1   2        1   2                                                     i      i
 *                   PairedSmoothHistogram[{x , x , …}, {y , y , …}, espec] plots a paired smooth histogram with estimator specification espec.
 *                                           1   2        1   2
 *                   PairedSmoothHistogram[{x , x , …}, {y , y , …}, espec, dfun] plots a paired smooth histogram with distribution function dfun.
 *                                           1   2        1   2
 *                   PairedSmoothHistogram[{data  , …}, {data  , …}, …] plots paired smooth histograms for multiple datasets data   and data  .
 * Usage:                                       11           21                                                                  1i         2j
 *
 *                   AlignmentPoint -> Center
 *                                       1
 *                   AspectRatio -> -----------
 *                                  GoldenRatio
 *                   Axes -> True
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ClippingStyle -> None
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
 *                   Mesh -> None
 *                   MeshFunctions -> {#1 & }
 *                   MeshShading -> None
 *                   MeshStyle -> Automatic
 *                   Method -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PlotLabel -> None
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
 *                   RegionFunction -> (True & )
 *                   RotateLabel -> True
 *                   ScalingFunctions -> None
 *                   Spacings -> Automatic
 *                   Ticks -> Automatic
 *                   TicksStyle -> {}
 * Options:          WorkingPrecision -> MachinePrecision
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PairedSmoothHistogram
 * Documentation:    web: http://reference.wolfram.com/language/ref/PairedSmoothHistogram.html
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
fun pairedSmoothHistogram(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PairedSmoothHistogram", arguments.toMutableList(), options)
}
