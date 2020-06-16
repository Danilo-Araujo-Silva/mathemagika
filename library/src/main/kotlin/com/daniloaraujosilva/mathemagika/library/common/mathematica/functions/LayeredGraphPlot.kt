package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LayeredGraphPlot
 *
 * Full name:        System`LayeredGraphPlot
 *
 *                   LayeredGraphPlot[g] generates a layered plot of the graph g.
 *                   LayeredGraphPlot[{e , e , …}] generates a layered plot of the graph with edges e .
 *                                      1   2                                                        j
 *                   LayeredGraphPlot[{…, w[e ], …}] plots e  with features defined by the symbolic wrapper w.
 *                                           i              i
 *                   LayeredGraphPlot[{v     v   , …}] uses rules v    v   to specify the graph g.
 *                                      i1    j1                  ik    jk
 *                   LayeredGraphPlot[m] uses the adjacency matrix m to specify the graph g.
 * Usage:            LayeredGraphPlot[…, v  pos] places the dominant vertex v in the plot at position pos.
 *
 *                   AlignmentPoint -> Center
 *                   AnnotationRules -> {}
 *                   AspectRatio -> Automatic
 *                   Axes -> False
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContentSelectable -> Automatic
 *                   CoordinatesToolOptions -> Automatic
 *                   DataRange -> Automatic
 *                   DirectedEdges -> Automatic
 *                   DisplayFunction :> $DisplayFunction
 *                   EdgeCapacity -> Automatic
 *                   EdgeCost -> Automatic
 *                   EdgeLabels -> None
 *                   EdgeLabelStyle -> Automatic
 *                   EdgeShapeFunction -> Automatic
 *                   EdgeStyle -> Automatic
 *                   EdgeWeight -> Automatic
 *                   Editable -> False
 *                   Epilog -> {}
 *                   FormatType -> TraditionalForm
 *                   Frame -> False
 *                   FrameLabel -> None
 *                   FrameStyle -> {}
 *                   FrameTicks -> None
 *                   FrameTicksStyle -> {}
 *                   GraphHighlight -> {}
 *                   GraphHighlightStyle -> Automatic
 *                   GraphLayout -> Automatic
 *                   GraphRoot -> Automatic
 *                   GraphStyle -> Automatic
 *                   GridLines -> None
 *                   GridLinesStyle -> {}
 *                   ImageMargins -> 0.
 *                   ImagePadding -> All
 *                   ImageSize -> Automatic
 *                   LabelStyle -> {}
 *                   Method -> Automatic
 *                   MultiedgeStyle -> Automatic
 *                   PerformanceGoal -> Automatic
 *                   PlotLabel -> None
 *                   PlotRange -> All
 *                   PlotRangeClipping -> False
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PlotStyle -> Automatic
 *                   PlotTheme -> Automatic
 *                   Prolog -> {}
 *                   Properties -> {}
 *                   RotateLabel -> True
 *                   SelfLoopStyle -> Automatic
 *                   Ticks -> Automatic
 *                   TicksStyle -> {}
 *                   VertexCapacity -> Automatic
 *                   VertexCoordinates -> Automatic
 *                   VertexLabels -> None
 *                   VertexLabelStyle -> Automatic
 *                   VertexShape -> Automatic
 *                   VertexShapeFunction -> Automatic
 *                   VertexSize -> Automatic
 *                   VertexStyle -> Automatic
 * Options:          VertexWeight -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LayeredGraphPlot
 * Documentation:    web: http://reference.wolfram.com/language/ref/LayeredGraphPlot.html
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
fun layeredGraphPlot(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LayeredGraphPlot", arguments.toMutableList(), options)
}
