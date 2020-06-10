package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Cepstrogram
 * 
 * Full name:        System`Cepstrogram
 * 
 *                   Cepstrogram[data] plots the array of power cepstra computed on each partition of data.
 *                   Cepstrogram[data, n] uses partitions of length n.
 *                   Cepstrogram[data, n, d] uses partitions with offset d.
 *                   Cepstrogram[data, n, d, wfun] applies a smoothing window wfun to each partition.
 * Usage:            Cepstrogram[data, n, d, wfun, m] pads partitions with zeros to length m prior to the computation of the transform.
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
 *                   FourierParameters -> {1, -1}
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
 *                   Padding -> Automatic
 *                   PaddingSize -> {0, 0}
 *                   PixelConstrained -> False
 *                   PlotLabel -> None
 *                   PlotLegends -> None
 *                   PlotRange -> All
 *                   PlotRangeClipping -> False
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PreserveImageOptions -> Automatic
 *                   Prolog -> {}
 *                   RotateLabel -> True
 *                   Ticks -> Automatic
 * Options:          TicksStyle -> {}
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Cepstrogram
 * Documentation:    web: http://reference.wolfram.com/language/ref/Cepstrogram.html
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
fun cepstrogram(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Cepstrogram", arguments.toMutableList(), options)
}
