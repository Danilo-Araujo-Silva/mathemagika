package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             WeaklyConnectedGraphComponents
 *
 * Full name:        System`WeaklyConnectedGraphComponents
 *
 *                   WeaklyConnectedGraphComponents[g] gives the weakly connected components of the graph g.
 *                   WeaklyConnectedGraphComponents[g, {v , v , …}] gives the weakly connected components that include at least one of the vertices v , v , … .
 *                                                       1   2                                                                                       1   2
 *                   WeaklyConnectedGraphComponents[g, patt] gives the connected components that include a vertex that matches the pattern patt.
 * Usage:            WeaklyConnectedGraphComponents[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 *                   AlignmentPoint -> Center
 *                   AnnotationRules -> Automatic
 *                   AspectRatio -> Automatic
 *                   Axes -> False
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContentSelectable -> Automatic
 *                   DirectedEdges -> Automatic
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
 *                   PerformanceGoal -> Automatic
 *                   PlotLabel -> None
 *                   PlotRange -> All
 *                   PlotRangeClipping -> False
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PlotTheme -> Automatic
 *                   Prolog -> {}
 *                   Properties -> Automatic
 *                   RotateLabel -> True
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
 *                   local: paclet:ref/WeaklyConnectedGraphComponents
 * Documentation:    web: http://reference.wolfram.com/language/ref/WeaklyConnectedGraphComponents.html
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
fun weaklyConnectedGraphComponents(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WeaklyConnectedGraphComponents", arguments.toMutableList(), options)
}
