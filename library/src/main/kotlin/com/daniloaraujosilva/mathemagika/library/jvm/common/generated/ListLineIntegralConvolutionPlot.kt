package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ListLineIntegralConvolutionPlot
 * 
 * Full name:        System`ListLineIntegralConvolutionPlot
 * 
 *                   ListLineIntegralConvolutionPlot[{array, image}] generates a line integral convolution plot of image convolved with the vector field defined by an array of vector field values.
 *                   ListLineIntegralConvolutionPlot[array] generates a line integral convolution plot of white noise convolved with the vector field defined by array.
 *                   ListLineIntegralConvolutionPlot[{{{{x , y }, {vx , vy }}, …}, image}] generates a line integral convolution plot of image convolved with the vector field defined by vectors {vx , vy } at specified points {x , y }.
 *                                                        1   1      1    1                                                                                                                          i    i                        i   i
 *                   ListLineIntegralConvolutionPlot[{{{x , y }, {vx , vy }}, …}] generates a line integral convolution plot of white noise convolved with the vector field defined by {vx , vy }.
 * Usage:                                                1   1      1    1                                                                                                                i    i
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
 *                   BoxRatios -> Automatic
 *                   ClippingStyle -> Automatic
 *                   ColorFunction -> Automatic
 *                   ColorFunctionScaling -> True
 *                   ColorOutput -> Automatic
 *                   ContentSelectable -> Automatic
 *                   CoordinatesToolOptions -> Automatic
 *                   DataRange -> Automatic
 *                   DisplayFunction :> $DisplayFunction
 *                   Epilog -> {}
 *                   Evaluated -> Automatic
 *                   EvaluationMonitor -> None
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
 *                   InterpolationOrder -> Automatic
 *                   LabelStyle -> {}
 *                   LightingAngle -> None
 *                   LineIntegralConvolutionScale -> Automatic
 *                   Method -> Automatic
 *                   NormalsFunction -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PlotLabel -> None
 *                   PlotLegends -> None
 *                   PlotRange -> {Full, Full}
 *                   PlotRangeClipping -> True
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PlotTheme :> $PlotTheme
 *                   PreserveImageOptions -> Automatic
 *                   Prolog -> {}
 *                   RasterSize -> Automatic
 *                   RotateLabel -> True
 *                   StreamColorFunction -> None
 *                   StreamColorFunctionScaling -> True
 *                   StreamPoints -> None
 *                   StreamScale -> Automatic
 *                   StreamStyle -> Automatic
 *                   TargetUnits -> Automatic
 *                   Ticks -> Automatic
 *                   TicksStyle -> {}
 *                   VectorAspectRatio -> Automatic
 *                   VectorColorFunction -> Automatic
 *                   VectorColorFunctionScaling -> True
 *                   VectorPoints -> None
 *                   VectorRange -> Automatic
 *                   VectorScale -> None
 *                   VectorScaling -> None
 *                   VectorSizes -> Automatic
 * Options:          VectorStyle -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ListLineIntegralConvolutionPlot
 * Documentation:    web: http://reference.wolfram.com/language/ref/ListLineIntegralConvolutionPlot.html
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
fun listLineIntegralConvolutionPlot(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ListLineIntegralConvolutionPlot", arguments.toMutableList(), options)
}
