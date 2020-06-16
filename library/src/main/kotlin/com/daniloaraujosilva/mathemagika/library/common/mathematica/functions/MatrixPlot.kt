package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MatrixPlot
 *
 * Full name:        System`MatrixPlot
 *
 * Usage:            MatrixPlot[m] generates a plot that gives a visual representation of the values of elements in a matrix.
 *
 *                   AlignmentPoint -> Center
 *                   AspectRatio -> Automatic
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
 *                   ColorRules -> Automatic
 *                   ContentSelectable -> Automatic
 *                   CoordinatesToolOptions -> Automatic
 *                   DataRange -> All
 *                   DataReversed -> False
 *                   DisplayFunction :> $DisplayFunction
 *                   Epilog -> {}
 *                   FormatType :> TraditionalForm
 *                   Frame -> True
 *                   FrameLabel -> None
 *                   FrameStyle -> {}
 *                   FrameTicks -> All
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
 *                   MissingStyle -> Automatic
 *                   PixelConstrained -> False
 *                   PlotLabel -> None
 *                   PlotLegends -> None
 *                   PlotRange -> All
 *                   PlotRangeClipping -> False
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PlotTheme :> $PlotTheme
 *                   PreserveImageOptions -> Automatic
 *                   Prolog -> {}
 *                   RotateLabel -> True
 *                   TargetUnits -> Automatic
 *                   Ticks -> Automatic
 * Options:          TicksStyle -> {}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MatrixPlot
 * Documentation:    web: http://reference.wolfram.com/language/ref/MatrixPlot.html
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
fun matrixPlot(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MatrixPlot", arguments.toMutableList(), options)
}
