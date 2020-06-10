package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             WaveletMatrixPlot
 * 
 * Full name:        System`WaveletMatrixPlot
 * 
 *                   WaveletMatrixPlot[dwd] plots the basis tree of wavelet matrix coefficients in the DiscreteWaveletData dwd.
 *                   WaveletMatrixPlot[dwd, r] plots coefficients up to refinement level r.
 * Usage:            WaveletMatrixPlot[dwd, r, func] applies func to coefficients before plotting. 
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
 *                   ClippingStyle -> Automatic
 *                   ColorFunction -> Automatic
 *                   ColorFunctionScaling -> True
 *                   ColorOutput -> Automatic
 *                   ColorRules -> Automatic
 *                   ContentSelectable -> Automatic
 *                   CoordinatesToolOptions -> Automatic
 *                   DataRange -> All
 *                   DataReversed -> False
 *                   Epilog -> {}
 *                   Frame -> None
 *                   FrameLabel -> None
 *                   FrameStyle -> {}
 *                   FrameTicks -> Automatic
 *                   FrameTicksStyle -> {}
 *                   GridLines -> Automatic
 *                   GridLinesStyle -> {}
 *                   ImageMargins -> 0.
 *                   ImagePadding -> All
 *                   ImageSize -> Automatic
 *                   LabelStyle -> {}
 *                   MaxPlotPoints -> Automatic
 *                   Mesh -> False
 *                   MeshStyle -> GrayLevel[-1 + GoldenRatio]
 *                   Method -> Automatic
 *                   PixelConstrained -> False
 *                   PlotLabel -> None
 *                   PlotLayout -> Automatic
 *                   PlotLegends -> None
 *                   PlotRangePadding -> Automatic
 *                   PreserveImageOptions -> Automatic
 *                   Prolog -> {}
 *                   RotateLabel -> True
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
 *                   local: paclet:ref/WaveletMatrixPlot
 * Documentation:    web: http://reference.wolfram.com/language/ref/WaveletMatrixPlot.html
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
fun waveletMatrixPlot(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WaveletMatrixPlot", arguments.toMutableList(), options)
}
