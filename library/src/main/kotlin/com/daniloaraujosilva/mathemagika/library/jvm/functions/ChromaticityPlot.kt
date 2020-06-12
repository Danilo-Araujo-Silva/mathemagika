package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ChromaticityPlot
 *
 * Full name:        System`ChromaticityPlot
 *
 *                   ChromaticityPlot[colspace] plots a 2D slice of the color space colspace.
 *                   ChromaticityPlot[color] plots the specific color.
 *                   ChromaticityPlot[{col , col , …}] plots multiple colors and color spaces.
 *                                        1     2
 *                   ChromaticityPlot[image] plots the pixels of image as individual colors.
 * Usage:            ChromaticityPlot[…, refcolspace] uses the reference color space refcolspace.
 *
 *                   AlignmentPoint -> Center
 *                   Appearance -> Automatic
 *                   AspectRatio -> Automatic
 *                   Axes -> False
 *                   AxesLabel -> Automatic
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   BoundaryStyle -> Automatic
 *                   ContentSelectable -> Automatic
 *                   CoordinatesToolOptions -> Automatic
 *                   DisplayFunction :> $DisplayFunction
 *                   Epilog -> {}
 *                   FillingStyle -> Automatic
 *                   FormatType :> TraditionalForm
 *                   FrameLabel -> Automatic
 *                   FrameStyle -> {}
 *                   FrameTicks -> Automatic
 *                   FrameTicksStyle -> {}
 *                   Frame -> True
 *                   GridLines -> None
 *                   GridLinesStyle -> {}
 *                   ImageMargins -> 0.
 *                   ImagePadding -> All
 *                   ImageSize -> Automatic
 *                   LabelStyle -> {}
 *                   MaxPlotPoints -> 2000
 *                   Method -> Automatic
 *                   PlotLabel -> None
 *                   PlotLegends -> Automatic
 *                   PlotPoints -> Automatic
 *                   PlotRange -> Automatic
 *                   PlotRangeClipping -> True
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PlotStyle -> Automatic
 *                   PlotTheme :> $PlotTheme
 *                   PreserveImageOptions -> Automatic
 *                   Prolog -> {}
 *                   RotateLabel -> True
 *                   Ticks -> Automatic
 *                   TicksStyle -> {}
 * Options:          WhitePoint -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ChromaticityPlot
 * Documentation:    web: http://reference.wolfram.com/language/ref/ChromaticityPlot.html
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
fun chromaticityPlot(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ChromaticityPlot", arguments.toMutableList(), options)
}
