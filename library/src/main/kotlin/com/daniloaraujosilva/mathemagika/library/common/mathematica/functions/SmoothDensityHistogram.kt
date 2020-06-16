package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SmoothDensityHistogram
 *
 * Full name:        System`SmoothDensityHistogram
 *
 *                   SmoothDensityHistogram[{{x , y }, {x , y }, …}] plots a smooth kernel histogram of the values {x , y }.
 *                                             1   1     2   2                                                       i   i
 *                   SmoothDensityHistogram[{{x , y }, {x , y }, …}, espec] plots a smooth kernel histogram with estimator specification espec.
 *                                             1   1     2   2
 *                   SmoothDensityHistogram[{{x , y }, {x , y }, …}, espec, dfun] plots the distribution function dfun.
 * Usage:                                      1   1     2   2
 *
 *                   AlignmentPoint -> Center
 *                   AspectRatio -> 1
 *                   Axes -> False
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   BoundaryStyle -> None
 *                   BoxRatios -> Automatic
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
 *                   LabelStyle -> {}
 *                   LightingAngle -> None
 *                   MaxRecursion -> Automatic
 *                   Mesh -> None
 *                   MeshFunctions -> {#3 & }
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
 *                   PlotTheme :> $PlotTheme
 *                   PreserveImageOptions -> Automatic
 *                   Prolog -> {}
 *                   RegionFunction -> (True & )
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
 *                   local: paclet:ref/SmoothDensityHistogram
 * Documentation:    web: http://reference.wolfram.com/language/ref/SmoothDensityHistogram.html
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
fun smoothDensityHistogram(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SmoothDensityHistogram", arguments.toMutableList(), options)
}
