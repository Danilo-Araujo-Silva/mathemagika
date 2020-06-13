package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             WaveletListPlot
 *
 * Full name:        System`WaveletListPlot
 *
 *                   WaveletListPlot[dwd] plots wavelet transform coefficients in the DiscreteWaveletData dwd.
 *                   WaveletListPlot[dwd, wind] plots wavelet transform coefficients corresponding to the wavelet index specification wind.
 *                   WaveletListPlot[dwd, wind, func] applies func to coefficients before plotting.
 *                   WaveletListPlot[{dwd , dwd , …}, …] plots wavelet transform coefficients from several DiscreteWaveletData objects dwd , dwd , ….
 * Usage:                                1     2                                                                                          1     2
 *
 *                   AlignmentPoint -> Center
 *                   AspectRatio -> Automatic
 *                   Axes -> True
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> Automatic
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ClippingStyle -> None
 *                   ColorFunction -> Automatic
 *                   ColorFunctionScaling -> True
 *                   ColorOutput -> Automatic
 *                   ContentSelectable -> Automatic
 *                   CoordinatesToolOptions -> Automatic
 *                   DataRange -> Automatic
 *                   Epilog -> {}
 *                   Filling -> None
 *                   FillingStyle -> Automatic
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
 *                   InterpolationOrder -> None
 *                   Joined -> True
 *                   LabelStyle -> {}
 *                   MaxPlotPoints -> Infinity
 *                   Mesh -> None
 *                   MeshFunctions -> {#1 & }
 *                   MeshShading -> None
 *                   MeshStyle -> Automatic
 *                   Method -> Automatic
 *                   PlotLabel -> None
 *                   PlotLayout -> CommonXAxis
 *                   PlotLegends -> None
 *                   PlotMarkers -> None
 *                   PlotRange -> All
 *                   PlotRangeClipping -> True
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PlotStyle -> Automatic
 *                   PreserveImageOptions -> Automatic
 *                   Prolog -> {}
 *                   RotateLabel -> True
 *                   Ticks -> Automatic
 *                   TicksStyle -> Automatic
 *                   DisplayFunction :> $DisplayFunction
 *                   FormatType :> TraditionalForm
 *                   PerformanceGoal :> $PerformanceGoal
 * Options:          PlotTheme :> $PlotTheme
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WaveletListPlot
 * Documentation:    web: http://reference.wolfram.com/language/ref/WaveletListPlot.html
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
fun waveletListPlot(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WaveletListPlot", arguments.toMutableList(), options)
}
