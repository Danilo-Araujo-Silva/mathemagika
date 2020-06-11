package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Spectrogram
 *
 * Full name:        System`Spectrogram
 *
 *                   Spectrogram[list] plots the spectrogram of list.
 *                   Spectrogram[list, n] uses partitions of length n.
 *                   Spectrogram[list, n, d] uses partitions with offset d.
 *                   Spectrogram[list, n, d, wfun] applies a smoothing window wfun to each partition.
 *                   Spectrogram[list, n, d, wfun, m] pads partitions with zeros to length m prior to the computation of the transform.
 * Usage:            Spectrogram[audio, …] plots the spectrogram of audio.
 *
 *                   AlignmentPoint -> Center
 *                                  1
 *                   AspectRatio -> -
 *                                  3
 *                   Axes -> False
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
 *                   ColorRules -> Automatic
 *                   ContentSelectable -> Automatic
 *                   CoordinatesToolOptions -> Automatic
 *                   DataRange -> Automatic
 *                   DataReversed -> False
 *                   DisplayFunction :> $DisplayFunction
 *                   Epilog -> {}
 *                   FormatType :> TraditionalForm
 *                   Frame -> Automatic
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
 *                   MaxPlotPoints -> Automatic
 *                   Mesh -> False
 *                   MeshStyle -> GrayLevel[-1 + GoldenRatio]
 *                   Method -> Automatic
 *                   PixelConstrained -> False
 *                   PlotLabel -> None
 *                   PlotLegends -> None
 *                   PlotRange -> Automatic
 *                   PlotRangeClipping -> Automatic
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PlotTheme :> $PlotTheme
 *                   PreserveImageOptions -> Automatic
 *                   Prolog -> {}
 *                   RotateLabel -> True
 *                   SampleRate -> Automatic
 *                   Ticks -> Automatic
 * Options:          TicksStyle -> {}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Spectrogram
 * Documentation:    web: http://reference.wolfram.com/language/ref/Spectrogram.html
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
fun spectrogram(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Spectrogram", arguments.toMutableList(), options)
}
