package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Periodogram
 * 
 * Full name:        System`Periodogram
 * 
 *                   Periodogram[list] plots the squared magnitude of the discrete Fourier transform (power spectrum) of list.
 *                   Periodogram[list, n] plots the mean of power spectra of non-overlapping partitions of length n.
 *                   Periodogram[list, n, d] uses partitions with offset d.
 *                   Periodogram[list, n, d, wfun] applies a smoothing window wfun to each partition.
 *                   Periodogram[list, n, d, wfun, m] pads partitions with zeros to length m prior to the computation of the transform.
 *                   Periodogram[{list , list , …}, n, d, wfun, m] plots power spectra of several lists.
 *                                    1      2
 *                   Periodogram[audio, …] plots the power spectrum of audio.
 *                   Periodogram[{audio , audio , …}, …] plots the power spectra of all audio .
 * Usage:                              1       2                                             i
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
 *                   DataRange -> Automatic
 *                   DisplayFunction :> $DisplayFunction
 *                   Epilog -> {}
 *                   Filling -> None
 *                   FillingStyle -> Automatic
 *                   FormatType :> TraditionalForm
 *                   FourierParameters -> {0, 1}
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
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PlotLabel -> None
 *                   PlotLegends -> None
 *                   PlotMarkers -> None
 *                   PlotRange -> Automatic
 *                   PlotRangeClipping -> True
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PlotStyle -> Automatic
 *                   PreserveImageOptions -> Automatic
 *                   Prolog -> {}
 *                   RotateLabel -> True
 *                   SampleRate -> Automatic
 *                   ScalingFunctions -> {Linear, dB}
 *                   TargetUnits -> Automatic
 *                   Ticks -> Automatic
 * Options:          TicksStyle -> {}
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Periodogram
 * Documentation:    web: http://reference.wolfram.com/language/ref/Periodogram.html
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
fun periodogram(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Periodogram", arguments.toMutableList(), options)
}
