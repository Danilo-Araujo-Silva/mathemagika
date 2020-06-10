package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             WaveletScalogram
 * 
 * Full name:        System`WaveletScalogram
 * 
 *                   WaveletScalogram[wd] plots wavelet vector coefficients in a DiscreteWaveletData or ContinuousWaveletData object wd.
 *                   WaveletScalogram[wd, wind] plots wavelet coefficients corresponding to the wavelet index specification wind.
 * Usage:            WaveletScalogram[wd, wind, func] applies func to coefficients before plotting. 
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
 *                   ColorFunction -> Automatic
 *                   ColorFunctionScaling -> True
 *                   CoordinatesToolOptions -> Automatic
 *                   Wavelets`WaveletScalogram`DefaultColorFunction -> Automatic
 *                   Epilog -> {}
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
 *                   Method -> Automatic
 *                   PlotLabel -> None
 *                   PlotLegends -> None
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PreserveImageOptions -> Automatic
 *                   Prolog -> {}
 *                   RotateLabel -> True
 *                   Ticks -> Automatic
 *                   TicksStyle -> {}
 *                   DisplayFunction :> $DisplayFunction
 *                   FormatType :> TraditionalForm
 * Options:          PlotTheme :> $PlotTheme
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/WaveletScalogram
 * Documentation:    web: http://reference.wolfram.com/language/ref/WaveletScalogram.html
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
fun waveletScalogram(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WaveletScalogram", arguments.toMutableList(), options)
}
