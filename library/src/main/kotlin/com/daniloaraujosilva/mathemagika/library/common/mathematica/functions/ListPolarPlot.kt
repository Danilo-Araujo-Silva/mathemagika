package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ListPolarPlot
 *
 * Full name:        System`ListPolarPlot
 *
 *                   ListPolarPlot[{r , r , …}] plots points equally spaced in angle at radii r .
 *                                   1   2                                                     i
 *                   ListPolarPlot[{{θ , r }, {θ , r }, …}] plots points at polar coordinates θ , r .
 *                                    1   1     2   2                                          i   i
 *                   ListPolarPlot[{list , list , …}] plots several lists of values.
 * Usage:                               1      2
 *
 *                   AlignmentPoint -> Center
 *                   AspectRatio -> Automatic
 *                   Axes -> Automatic
 *                   AxesLabel -> None
 *                   AxesOrigin -> {0, 0}
 *                   AxesStyle -> {}
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ColorFunction -> Automatic
 *                   ColorFunctionScaling -> True
 *                   ColorOutput -> Automatic
 *                   ContentSelectable -> Automatic
 *                   CoordinatesToolOptions -> Automatic
 *                   DataRange -> Automatic
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
 *                   InterpolationOrder -> None
 *                   Joined -> False
 *                   LabelingFunction -> Automatic
 *                   LabelingSize -> Automatic
 *                   LabelStyle -> {}
 *                   MaxPlotPoints -> Infinity
 *                   Mesh -> None
 *                   MeshFunctions -> {#3 & }
 *                   MeshShading -> None
 *                   MeshStyle -> Automatic
 *                   Method -> Automatic
 *                   PlotLabel -> None
 *                   PlotLabels -> None
 *                   PlotLegends -> None
 *                   PlotMarkers -> None
 *                   PlotRange -> Automatic
 *                   PlotRangeClipping -> True
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PlotStyle -> Automatic
 *                   PolarAxes -> False
 *                   PolarAxesOrigin -> Automatic
 *                   PolarGridLines -> None
 *                   PolarTicks -> Automatic
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
 *                   local: paclet:ref/ListPolarPlot
 * Documentation:    web: http://reference.wolfram.com/language/ref/ListPolarPlot.html
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
fun listPolarPlot(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ListPolarPlot", arguments.toMutableList(), options)
}
